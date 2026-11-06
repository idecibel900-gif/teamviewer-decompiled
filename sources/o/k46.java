package o;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class k46 {
    public final a46 a;
    public final ArrayList b;
    public final int c;
    public final io.sentry.z7 d;
    public final ab6 e;
    public final int f;
    public final int g;
    public final short h;
    public final d82 i;
    public final jm0 j;
    public final xc0 k;
    public final xz2 l;
    public final g32 m;
    public final HostnameVerifier n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d82 f1228o;
    public final ProxySelector p;
    public final boolean q;
    public final SocketFactory r;
    public final SSLSocketFactory s;
    public final X509TrustManager t;
    public final iq8 u;
    public int v;

    /* JADX WARN: Multi-variable type inference failed */
    public k46(a46 a46Var, ArrayList arrayList, int i, io.sentry.z7 z7Var, ab6 ab6Var, int i2, int i3, int i4, d82 d82Var, jm0 jm0Var, xc0 xc0Var, xz2 xz2Var, g32 g32Var, HostnameVerifier hostnameVerifier, d82 d82Var2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, iq8 iq8Var) {
        ab6Var.getClass();
        d82Var.getClass();
        jm0Var.getClass();
        xc0Var.getClass();
        xz2Var.getClass();
        g32Var.getClass();
        hostnameVerifier.getClass();
        d82Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.a = a46Var;
        this.b = arrayList;
        this.c = i;
        this.d = z7Var;
        this.e = ab6Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = d82Var;
        this.j = jm0Var;
        this.k = xc0Var;
        this.l = xz2Var;
        this.m = g32Var;
        this.n = hostnameVerifier;
        this.f1228o = d82Var2;
        this.p = proxySelector;
        this.q = z;
        this.r = socketFactory;
        this.s = sSLSocketFactory;
        this.t = x509TrustManager;
        this.u = iq8Var;
    }

    public static k46 a(k46 k46Var, int i, io.sentry.z7 z7Var, ab6 ab6Var, int i2) {
        int i3 = (i2 & 1) != 0 ? k46Var.c : i;
        io.sentry.z7 z7Var2 = (i2 & 2) != 0 ? k46Var.d : z7Var;
        ab6 ab6Var2 = (i2 & 4) != 0 ? k46Var.e : ab6Var;
        int i4 = k46Var.f;
        int i5 = k46Var.g;
        short s = k46Var.h;
        d82 d82Var = k46Var.i;
        jm0 jm0Var = k46Var.j;
        xc0 xc0Var = k46Var.k;
        xz2 xz2Var = k46Var.l;
        g32 g32Var = k46Var.m;
        HostnameVerifier hostnameVerifier = k46Var.n;
        d82 d82Var2 = k46Var.f1228o;
        ProxySelector proxySelector = k46Var.p;
        boolean z = k46Var.q;
        SocketFactory socketFactory = k46Var.r;
        SSLSocketFactory sSLSocketFactory = k46Var.s;
        X509TrustManager x509TrustManager = k46Var.t;
        iq8 iq8Var = k46Var.u;
        ab6Var2.getClass();
        d82Var.getClass();
        jm0Var.getClass();
        xc0Var.getClass();
        xz2Var.getClass();
        g32Var.getClass();
        hostnameVerifier.getClass();
        d82Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new k46(k46Var.a, k46Var.b, i3, z7Var2, ab6Var2, i4, i5, s, d82Var, jm0Var, xc0Var, xz2Var, g32Var, hostnameVerifier, d82Var2, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, iq8Var);
    }

    public final lc6 b(ab6 ab6Var) {
        ab6Var.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            hk0.l("Check failed.");
            return null;
        }
        this.v++;
        io.sentry.z7 z7Var = this.d;
        if (z7Var != null) {
            o46 o46VarG = ((oe2) z7Var.c).g();
            h93 h93Var = ab6Var.a;
            o46VarG.getClass();
            h93Var.getClass();
            h93 h93Var2 = o46VarG.i.h;
            if (h93Var.e != h93Var2.e || !im3.n(h93Var.d, h93Var2.d)) {
                hk0.h(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.v != 1) {
                hk0.h(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        k46 k46VarA = a(this, i2, null, ab6Var, 2097146);
        nl3 nl3Var = (nl3) arrayList.get(i);
        lc6 lc6VarA = nl3Var.a(k46VarA);
        if (lc6VarA == null) {
            throw new NullPointerException("interceptor " + nl3Var + " returned null");
        }
        if (z7Var == null || i2 >= arrayList.size() || k46VarA.v == 1) {
            return lc6VarA;
        }
        hk0.h(nl3Var, " must call proceed() exactly once", "network interceptor ");
        return null;
    }
}
