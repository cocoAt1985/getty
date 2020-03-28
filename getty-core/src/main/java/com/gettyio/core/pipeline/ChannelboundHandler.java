/**
 * 包名：org.getty.core.pipeline
 * 版权：Copyright by www.getty.com
 * 描述：
 * 邮箱：189155278@qq.com
 * 时间：2019/9/27
 */
package com.gettyio.core.pipeline;


import com.gettyio.core.channel.SocketChannel;
import com.gettyio.core.handler.timeout.IdleState;
import com.gettyio.core.util.LinkedNonBlockQueue;

/**
 * 类名：ChannelboundHandler.java
 * 描述：
 * 修改人：gogym
 * 时间：2019/9/27
 */
public interface ChannelboundHandler {

    /**
     * 连接
     *
     * @param socketChannel 通道
     * @throws Exception 异常
     */
    void channelAdded(SocketChannel socketChannel) throws Exception;

    /**
     * 连接关闭
     *
     * @param socketChannel 通道
     * @throws Exception 异常
     */
    void channelClosed(SocketChannel socketChannel) throws Exception;

    /**
     * 消息读取
     *
     * @param obj        读取消息
     * @param socketChannel 通道
     * @throws Exception 异常
     */
    void channelRead(SocketChannel socketChannel, Object obj) throws Exception;

    /**
     * 异常
     *
     * @param socketChannel 通道
     * @param cause      异常信息
     * @throws Exception 异常
     */
    void exceptionCaught(SocketChannel socketChannel, Throwable cause) throws Exception;

    /**
     * 消息解码
     *
     * @param socketChannel 通道
     * @param obj        消息
     * @param out        消息队列
     * @throws Exception 异常
     */
    void decode(SocketChannel socketChannel, Object obj, LinkedNonBlockQueue<Object> out) throws Exception;

    /**
     * 消息写出
     *
     * @param socketChannel 通道
     * @param obj        数据
     * @throws Exception 异常
     */
    void channelWrite(SocketChannel socketChannel, Object obj) throws Exception;


    /**
     * 消息编码
     *
     * @param socketChannel 通道
     * @param obj        数据
     * @throws Exception 异常
     */
    void encode(SocketChannel socketChannel, Object obj) throws Exception;

    /**
     * 该方法类似一个心态起搏器，执行读或写操作会被触发
     *
     * @param socketChannel 通道
     * @param evt        IdleState
     * @throws Exception 异常
     */
    void userEventTriggered(SocketChannel socketChannel, IdleState evt) throws Exception;

}
