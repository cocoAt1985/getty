package com.gettyio.string.aio;


import com.gettyio.core.channel.SocketChannel;
import com.gettyio.core.pipeline.in.SimpleChannelInboundHandler;

public class ClientSimpleHandler extends SimpleChannelInboundHandler<String> {
    @Override
    public void channelAdded(SocketChannel aioChannel) {

        System.out.println("连接成功");

    }

    @Override
    public void channelClosed(SocketChannel socketChannel) {
        System.out.println("连接关闭了");
    }


    @Override
    public void channelRead0(SocketChannel aioChannel, String str) {
        System.out.println("收到服务器端消息:" + str);
    }

    @Override
    public void exceptionCaught(SocketChannel aioChannel, Throwable cause) throws Exception {
        System.out.println("出错了");
    }
}
