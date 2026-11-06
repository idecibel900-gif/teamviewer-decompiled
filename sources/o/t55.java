package o;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t55 extends ProxySelector {
    public static final t55 a = new t55();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return qf0.K(Proxy.NO_PROXY);
        }
        hk0.g("uri must not be null");
        return null;
    }
}
