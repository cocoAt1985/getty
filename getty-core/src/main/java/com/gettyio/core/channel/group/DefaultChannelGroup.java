/**
 * 包名：org.getty.core.channel.group
 * 版权：Copyright by www.getty.com
 * 描述：
 * 邮箱：189155278@qq.com
 * 时间：2019/9/27
 */
package com.gettyio.core.channel.group;

import com.gettyio.core.channel.SocketChannel;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 类名：DefaultChannelGroup.java
 * 描述： 用于保存连接，方便查找
 * 修改人：gogym
 * 时间：2019/9/27
 */
public class DefaultChannelGroup extends AbstractSet<SocketChannel> implements ChannelGroup {

    private final String name;
    //用于保存连接的map
    private final ConcurrentMap<String, SocketChannel> serverChannels = new ConcurrentHashMap<>();


    public DefaultChannelGroup() {
        this.name = "defaultChannelGroup";
    }

    public DefaultChannelGroup(String name) {
        if (name == null) {
            throw new NullPointerException("name");
        }
        this.name = name;
    }


    @Override
    public String name() {
        return name;
    }

    @Override
    public SocketChannel find(String id) {
        SocketChannel socketChannel = serverChannels.get(id);
        if (socketChannel != null) {
            return socketChannel;
        }
        return null;
    }


    @Override
    public boolean isEmpty() {
        return serverChannels.isEmpty();
    }


    @Override
    public boolean contains(Object o) {
        if (o instanceof SocketChannel) {
            return serverChannels.containsValue(o);
        }
        return false;
    }

    @Override
    public boolean add(SocketChannel socketChannel) {
        boolean added = serverChannels.putIfAbsent(socketChannel.getChannelId(), socketChannel) == null;
        if (added) {
            //这里要添加个关闭监听，当连接关闭时，自动清理
            socketChannel.setChannelFutureListener(remover);
        }
        return added;
    }


    @Override
    public boolean remove(Object o) {
        SocketChannel c = null;
        if (o instanceof String) {
            c = serverChannels.remove(o);
        } else if (o instanceof SocketChannel) {
            c = (SocketChannel) o;
            c = serverChannels.remove(c.getChannelId());

        }
        if (c == null) {
            return false;
        }
        //移除关闭监听
        c.setChannelFutureListener(null);
        return true;
    }

    @Override
    public void clear() {
        serverChannels.clear();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Collection<SocketChannel> channels = new ArrayList<SocketChannel>(size());
        channels.addAll(serverChannels.values());
        return channels.toArray(a);
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }


    @Override
    public int compareTo(ChannelGroup o) {
        int v = name().compareTo(o.name());
        if (v != 0) {
            return v;
        }
        return System.identityHashCode(this) - System.identityHashCode(o);
    }

    @Override
    public Iterator<SocketChannel> iterator() {
        return serverChannels.values().iterator();
    }

    @Override
    public int size() {
        return serverChannels.size();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(name: " + name() + ", size: " + size() + ')';
    }


    /**
     * 移除监听
     */
    private final ChannelFutureListener remover = new ChannelFutureListener() {
        @Override
        public void operationComplete(SocketChannel socketChannel) {
            DefaultChannelGroup.this.remove(socketChannel);
        }
    };

}
