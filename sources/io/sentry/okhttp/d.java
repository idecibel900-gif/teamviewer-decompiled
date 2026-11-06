package io.sentry.okhttp;

import java.net.InetAddress;
import java.net.Proxy;
import kotlin.jvm.functions.Function1;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends yz3 implements Function1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f218o;
    public static final d p;
    public final /* synthetic */ byte n;

    static {
        int i = 1;
        f218o = new d(i, (byte) 0);
        p = new d(i, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, byte b) {
        super(i);
        this.n = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.n) {
            case 0:
                InetAddress inetAddress = (InetAddress) obj;
                inetAddress.getClass();
                String string = inetAddress.toString();
                string.getClass();
                return string;
            default:
                Proxy proxy = (Proxy) obj;
                proxy.getClass();
                String string2 = proxy.toString();
                string2.getClass();
                return string2;
        }
    }
}
