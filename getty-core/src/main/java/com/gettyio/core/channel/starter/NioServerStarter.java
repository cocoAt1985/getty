package com.gettyio.core.channel.starter;/*
 * 类名：NioServerStater
 * 版权：Copyright by www.getty.com
 * 描述：
 * 修改人：gogym
 * 时间：2020/3/27
 */

import com.gettyio.core.buffer.ChunkPool;
import com.gettyio.core.buffer.Time;
import com.gettyio.core.channel.SocketChannel;
import com.gettyio.core.channel.NioChannel;
import com.gettyio.core.channel.SocketMode;
import com.gettyio.core.channel.UdpChannel;
import com.gettyio.core.channel.config.ServerConfig;
import com.gettyio.core.logging.InternalLogger;
import com.gettyio.core.logging.InternalLoggerFactory;
import com.gettyio.core.pipeline.ChannelPipeline;
import com.gettyio.core.util.ThreadPool;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketOption;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Map;

public class NioServerStarter extends NioStarter {

    private static final InternalLogger LOGGER = InternalLoggerFactory.getInstance(NioServerStarter.class);

    //开启的socket模式 TCP/UDP ,默认tcp
    protected SocketMode socketMode = SocketMode.TCP;
    //Server端服务配置
    protected ServerConfig serverConfig = new ServerConfig();
    //内存池
    protected ChunkPool chunkPool;
    // 责任链对象
    protected ChannelPipeline channelPipeline;
    //线程池
    private ThreadPool workerThreadPool;
    //服务线程运行标志
    private volatile boolean running = true;
    //Boss线程数，获取cpu核心,核心小于4设置线程为3，大于4设置和cpu核心数一致
    private int bossThreadNum = Runtime.getRuntime().availableProcessors() < 4 ? 3 : Runtime.getRuntime().availableProcessors();
    // Boss共享给Worker的线程数，核心小于4设置线程为1，大于4右移两位
    private int bossShareToWorkerThreadNum = bossThreadNum > 4 ? bossThreadNum >> 2 : bossThreadNum - 2;
    // Worker线程数
    private int workerThreadNum = bossThreadNum - bossShareToWorkerThreadNum;
    //socket对象
    private ServerSocketChannel serverSocketChannel;

    //UDP
    private DatagramChannel datagramChannel;
    private Selector selector;

    /**
     * 简单启动
     *
     * @param port 服务端口
     */
    public NioServerStarter(int port) {
        serverConfig.setPort(port);
    }

    /**
     * 指定host启动
     *
     * @param host 服务地址
     * @param port 服务端口
     */
    public NioServerStarter(String host, int port) {
        serverConfig.setHost(host);
        serverConfig.setPort(port);
    }

    /**
     * 指定配置启动
     *
     * @param config 配置
     */
    public NioServerStarter(ServerConfig config) {
        if (config == null) {
            throw new NullPointerException("serverConfig can't null");
        }

        if (config.getPort() == 0) {
            throw new NullPointerException("serverConfig port can't null");
        }
        this.serverConfig = config;
    }

    /**
     * 责任链
     *
     * @param channelPipeline 责任链
     * @return AioServerStarter
     */
    public NioServerStarter channelInitializer(ChannelPipeline channelPipeline) {
        this.channelPipeline = channelPipeline;
        return this;
    }


    /**
     * 设置Boss线程数
     *
     * @param threadNum 线程数
     * @return AioServerStarter
     */
    public NioServerStarter bossThreadNum(int threadNum) {
        this.bossThreadNum = threadNum;
        return this;
    }

    public NioServerStarter socketMode(SocketMode socketMode) {
        this.socketMode = socketMode;
        return this;
    }


    /**
     * 启动IO服务
     *
     * @throws Exception 异常
     */
    public void start() throws Exception {
        //打印框架信息
        LOGGER.info("\r\n" + ServerConfig.BANNER + "\r\n  getty version:(" + ServerConfig.VERSION + ")");

        if (channelPipeline == null) {
            throw new RuntimeException("ChannelPipeline can't be null");
        }

        if (chunkPool == null) {
            //实例化内存池
            this.chunkPool = new ChunkPool(serverConfig.getServerChunkSize(), new Time(), serverConfig.isDirect());
        }

        //初始化worker线程池
        workerThreadPool = new ThreadPool(ThreadPool.FixedThread, workerThreadNum);

        if (socketMode == SocketMode.TCP) {
            startTCP();
        } else {
            startUDP();
        }
    }

    /**
     * 启动TCP
     *
     * @throws IOException 异常
     */
    private final void startTCP() throws IOException {

        /*
         *开启一个服务channel，
         *A selectable channel for stream-oriented listening sockets.
         */
        serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);

        //绑定端口
        if (serverConfig.getHost() != null) {
            //服务端socket处理客户端socket连接是需要一定时间的。ServerSocket有一个队列，存放还没有来得及处理的客户端Socket，这个队列的容量就是backlog的含义。
            // 如果队列已经被客户端socket占满了，如果还有新的连接过来，那么ServerSocket会拒绝新的连接。
            // 也就是说backlog提供了容量限制功能，避免太多的客户端socket占用太多服务器资源
            serverSocketChannel.bind(new InetSocketAddress(serverConfig.getHost(), serverConfig.getPort()), 1000);
        } else {
            serverSocketChannel.bind(new InetSocketAddress(serverConfig.getPort()), 1000);
        }

        /*
         * 创建一个selector
         */
        final Selector selector = Selector.open();
        /*
         * 将创建的serverChannel注册到selector选择器上，指定这个channel只关心OP_ACCEPT事件
         */
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        //开启线程，开始接收客户端的连接
        new Thread(new Runnable() {
            @Override
            public void run() {
                //循环监听客户端的连接
                while (running) {

                    try {
                        /*
                         * select()操作，默认是阻塞模式的，即，当没有accept或者read时间到来时，将一直阻塞不往下面继续执行。
                         */
                        int readyChannels = selector.select();
                        if (readyChannels <= 0) {
                            continue;
                        }

                        /*
                         * 从selector上获取到了IO事件，可能是accept，也有可能是read，这里只关注可能是accept
                         */
                        Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();

                        while (iterator.hasNext()) {
                            SelectionKey key = iterator.next();
                            if (key.isAcceptable()) {          //处理OP_ACCEPT事件
                                final java.nio.channels.SocketChannel socketChannel = ((ServerSocketChannel) key.channel()).accept();
                                socketChannel.configureBlocking(false);

                                //通过线程池创建客户端连接通道
                                workerThreadPool.execute(new Runnable() {
                                    @Override
                                    public void run() {
                                        createTcpChannel(socketChannel);
                                    }
                                });
                            }
                            iterator.remove();
                        }
                    } catch (IOException e) {
                        LOGGER.error("socketChannel accept Exception", e);
                    }
                }
            }
        }).start();


    }


    /**
     * 启动UDP
     *
     * @throws IOException 异常
     */
    private final void startUDP() throws IOException {

        datagramChannel = DatagramChannel.open();
        datagramChannel.configureBlocking(false);
        datagramChannel.bind(new InetSocketAddress(serverConfig.getPort()));
        //设置socket参数
        if (serverConfig.getSocketOptions() != null) {
            for (Map.Entry<SocketOption<Object>, Object> entry : serverConfig.getSocketOptions().entrySet()) {
                datagramChannel.setOption(entry.getKey(), entry.getValue());
            }
        }
        selector = Selector.open();
        datagramChannel.register(selector, SelectionKey.OP_READ);
        createUdpChannel(datagramChannel, selector);

        LOGGER.info("getty server started UDP on port {},bossThreadNum:{} ,workerThreadNum:{}", serverConfig.getPort(), bossThreadNum, workerThreadNum);
        LOGGER.info("getty server config is {}", serverConfig.toString());
    }

    /**
     * 为每个新连接创建AioChannel对象
     *
     * @param channel 通道
     */
    private void createTcpChannel(java.nio.channels.SocketChannel channel) {
        SocketChannel socketChannel = null;
        try {
            socketChannel = new NioChannel(channel, serverConfig, chunkPool,workerThreadNum, channelPipeline);
            //创建成功立即开始读
            socketChannel.starRead();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            if (socketChannel != null) {
                closeChannel(channel);
            }
        }
    }


    /**
     * 创建Udp通道
     *
     * @return void
     * @params [datagramChannel, selector]
     */
    private void createUdpChannel(DatagramChannel datagramChannel, Selector selector) {
        UdpChannel udpChannel = new UdpChannel(datagramChannel, selector, serverConfig, chunkPool, channelPipeline, workerThreadNum);
        udpChannel.starRead();
    }


    /**
     * 关闭客户端连接通道
     *
     * @param channel 通道
     */
    private void closeChannel(java.nio.channels.SocketChannel channel) {
        try {
            channel.shutdownInput();
        } catch (IOException e) {
            LOGGER.debug(e.getMessage(), e);
        }
        try {
            channel.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 停止服务
     */
    public final void shutdown() {
        //接收线程标志置为false
        running = false;
        try {
            if (serverSocketChannel != null) {
                serverSocketChannel.close();
                serverSocketChannel = null;
            }

            if (datagramChannel != null) {
                datagramChannel.close();
                datagramChannel = null;
            }

            if (selector != null) {
                selector.close();
                selector = null;
            }

            if (!workerThreadPool.isTerminated()) {
                workerThreadPool.shutdownNow();
            }


        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}