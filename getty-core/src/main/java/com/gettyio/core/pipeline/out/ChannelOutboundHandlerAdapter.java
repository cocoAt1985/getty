/**
 * 包名：org.getty.core.pipeline.out
 * 版权：Copyright by www.getty.com
 * 描述：
 * 邮箱：189155278@qq.com
 * 时间：2019/9/27
 */
package com.gettyio.core.pipeline.out;

import com.gettyio.core.channel.AioChannel;
import com.gettyio.core.handler.timeout.IdleState;
import com.gettyio.core.pipeline.ChannelHandlerAdapter;
import com.gettyio.core.pipeline.all.ChannelAllBoundHandlerAdapter;

/**
 * 类名：ChannelOutboundHandlerAdapter.java
 * 描述：
 * 修改人：gogym
 * 时间：2019/9/27
 */
public abstract class ChannelOutboundHandlerAdapter extends ChannelHandlerAdapter implements ChannelOutboundHandler {


    @Override
    public void channelWrite(AioChannel aioChannel, Object obj) throws Exception {
        ChannelHandlerAdapter channelHandlerAdapter = aioChannel.getDefaultChannelPipeline().nextOutPipe(this);
        if (channelHandlerAdapter == null) {
            return;
        }

        if (channelHandlerAdapter instanceof ChannelOutboundHandlerAdapter) {
            ((ChannelOutboundHandlerAdapter) channelHandlerAdapter).channelWrite(aioChannel, obj);
        } else if (channelHandlerAdapter instanceof ChannelAllBoundHandlerAdapter) {
            ((ChannelAllBoundHandlerAdapter) channelHandlerAdapter).channelWrite(aioChannel, obj);
        }

    }

    @Override
    public void encode(AioChannel aioChannel, Object obj) throws Exception {
        ChannelHandlerAdapter channelHandlerAdapter = aioChannel.getDefaultChannelPipeline().nextOutPipe(this);
        if (channelHandlerAdapter == null) {
            aioChannel.writeToChannel(obj);
            return;
        }
        if (channelHandlerAdapter instanceof ChannelOutboundHandlerAdapter) {
            ((ChannelOutboundHandlerAdapter) channelHandlerAdapter).encode(aioChannel, obj);
        } else if (channelHandlerAdapter instanceof ChannelAllBoundHandlerAdapter) {
            ((ChannelAllBoundHandlerAdapter) channelHandlerAdapter).encode(aioChannel, obj);
        }
    }

    @Override
    public void userEventTriggered(AioChannel aioChannel, IdleState evt) throws Exception {
        ChannelHandlerAdapter channelHandlerAdapter = aioChannel.getDefaultChannelPipeline().nextOutPipe(this);
        if (channelHandlerAdapter != null) {
            channelHandlerAdapter.userEventTriggered(aioChannel, evt);
        }
    }


}
