package me.oneqxz.b0mb3rrr.data.proxy;

import lombok.*;
import org.jetbrains.annotations.Nullable;

import java.net.InetSocketAddress;
import java.net.Proxy.Type;

@Getter
@RequiredArgsConstructor
public final class Proxy {

    @NonNull private Type type;
    @NonNull private String ip;
    @NonNull private int port;

    @Setter private Status status = Status.DEAD;
    @Setter @Nullable private String country = null;
    @Setter private long response_time = -1;
    @Setter private ProxyAnonymity anonymity = ProxyAnonymity.TRANSPARENT;


    public java.net.Proxy toJavaProxy()
    {
        return new java.net.Proxy(this.type, new InetSocketAddress(ip, port));
    }

    @Override
    public String toString() {
        return STR."\{ip}:\{port}";
    }

    public enum Status
    {
        ALIVE, DEAD;
    }

    public enum ProxyAnonymity {
        TRANSPARENT, ANONYMOUS, ELITE
    }

}
