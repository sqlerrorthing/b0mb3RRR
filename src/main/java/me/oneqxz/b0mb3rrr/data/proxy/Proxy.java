package me.oneqxz.b0mb3rrr.data.proxy;

import lombok.Builder;
import lombok.Getter;

import java.net.InetSocketAddress;

@Getter
@Builder
public final class Proxy {

    private java.net.Proxy.Type type;
    private String ip;
    private int port;

    public java.net.Proxy toJavaProxy()
    {
        return new java.net.Proxy(this.type, new InetSocketAddress(ip, port));
    }
}
