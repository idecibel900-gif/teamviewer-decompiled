package o;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class c75 implements pi0 {
    public static final List D = ro8.k(new yw5[]{yw5.HTTP_2, yw5.HTTP_1_1});
    public static final List E = ro8.k(new z41[]{z41.g, z41.h});
    public final g95 A;
    public final io7 B;
    public final xc0 C;
    public final j93 a;
    public final List b;
    public final List c;
    public final mm8 d;
    public final boolean e;
    public final boolean f;
    public final d82 g;
    public final boolean h;
    public final boolean i;
    public final xz2 j;
    public final d32 k;
    public final ProxySelector l;
    public final d82 m;
    public final SocketFactory n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f497o;
    public final X509TrustManager p;
    public final List q;
    public final List r;
    public final HostnameVerifier s;
    public final jm0 t;
    public final iq8 u;
    public final int v;
    public final int w;
    public final short x;
    public final char y;
    public final short z;

    /* JADX WARN: Type inference failed for: r1v11, types: [int, short] */
    public c75(b75 b75Var) throws NoSuchAlgorithmException, KeyStoreException {
        SSLSocketFactory sSLSocketFactory;
        X509TrustManager x509TrustManager;
        iq8 iq8Var;
        io.sentry.okhttp.f fVar = new io.sentry.okhttp.f(b75Var.e);
        TimeZone timeZone = ro8.a;
        b75Var.e = new mm8(fVar);
        this.a = b75Var.a;
        this.b = ro8.j(b75Var.c);
        this.c = ro8.j(b75Var.d);
        this.d = b75Var.e;
        this.e = b75Var.f;
        this.f = b75Var.g;
        this.g = b75Var.h;
        this.h = b75Var.i;
        this.i = b75Var.j;
        this.j = b75Var.k;
        this.k = b75Var.l;
        ProxySelector proxySelector = b75Var.m;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = t55.a;
        }
        this.l = proxySelector;
        this.m = b75Var.n;
        this.n = b75Var.f404o;
        List list = b75Var.r;
        this.q = list;
        this.r = b75Var.s;
        this.s = b75Var.t;
        this.v = b75Var.w;
        this.w = b75Var.x;
        this.x = b75Var.y;
        this.y = b75Var.z;
        this.z = b75Var.A;
        g95 g95Var = b75Var.B;
        this.A = g95Var == null ? new g95((byte) 18) : g95Var;
        io7 io7Var = b75Var.C;
        this.B = io7Var == null ? io7.l : io7Var;
        xc0 xc0Var = b75Var.b;
        if (xc0Var == null) {
            xc0Var = new xc0((byte) 16);
            b75Var.b = xc0Var;
        }
        this.C = xc0Var;
        if (list != null && list.isEmpty()) {
            this.f497o = null;
            this.u = null;
            this.p = null;
            this.t = jm0.c;
            sSLSocketFactory = null;
            iq8Var = null;
            x509TrustManager = null;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.f497o = null;
                this.u = null;
                this.p = null;
                this.t = jm0.c;
                sSLSocketFactory = null;
                iq8Var = null;
                x509TrustManager = null;
                break;
            }
            if (((z41) it.next()).a) {
                sSLSocketFactory = b75Var.p;
                if (sSLSocketFactory != null) {
                    this.f497o = sSLSocketFactory;
                    iq8Var = b75Var.v;
                    iq8Var.getClass();
                    this.u = iq8Var;
                    x509TrustManager = b75Var.q;
                    x509TrustManager.getClass();
                    this.p = x509TrustManager;
                    jm0 jm0Var = b75Var.u;
                    jm0Var.getClass();
                    this.t = im3.n(jm0Var.b, iq8Var) ? jm0Var : new jm0(jm0Var.a, iq8Var);
                    break;
                }
                ql5 ql5Var = ql5.a;
                ql5.a.getClass();
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                trustManagers.getClass();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                        this.p = x509TrustManager2;
                        ql5 ql5Var2 = ql5.a;
                        ql5Var2.getClass();
                        try {
                            SSLContext sSLContextL = ql5Var2.l();
                            sSLContextL.init(null, new TrustManager[]{x509TrustManager2}, null);
                            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                            socketFactory.getClass();
                            this.f497o = socketFactory;
                            iq8 iq8VarC = ql5.a.c(x509TrustManager2);
                            this.u = iq8VarC;
                            jm0 jm0Var2 = b75Var.u;
                            jm0Var2.getClass();
                            this.t = im3.n(jm0Var2.b, iq8VarC) ? jm0Var2 : new jm0(jm0Var2.a, iq8VarC);
                            x509TrustManager = x509TrustManager2;
                            sSLSocketFactory = socketFactory;
                            iq8Var = iq8VarC;
                            break;
                        } catch (GeneralSecurityException e) {
                            throw new AssertionError("No System TLS: " + e, e);
                        }
                    }
                }
                String string = Arrays.toString(trustManagers);
                string.getClass();
                an4.g("Unexpected default trust managers: ".concat(string));
                throw null;
            }
        }
        List list2 = this.c;
        List list3 = this.b;
        list3.getClass();
        if (list3.contains(null)) {
            yq4.k(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            yq4.k(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((z41) it2.next()).a) {
                    if (sSLSocketFactory == null) {
                        hk0.l("sslSocketFactory == null");
                        throw null;
                    }
                    if (iq8Var == null) {
                        hk0.l("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        return;
                    }
                    hk0.l("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory != null) {
            hk0.l("Check failed.");
            throw null;
        }
        if (iq8Var != null) {
            hk0.l("Check failed.");
            throw null;
        }
        if (x509TrustManager != null) {
            hk0.l("Check failed.");
            throw null;
        }
        if (im3.n(this.t, jm0.c)) {
            return;
        }
        hk0.l("Check failed.");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [int, short] */
    public final b75 a() {
        b75 b75Var = new b75();
        b75Var.a = this.a;
        b75Var.b = this.C;
        qv0.c0(b75Var.c, this.b);
        qv0.c0(b75Var.d, this.c);
        b75Var.e = this.d;
        b75Var.f = this.e;
        b75Var.g = this.f;
        b75Var.h = this.g;
        b75Var.i = this.h;
        b75Var.j = this.i;
        b75Var.k = this.j;
        b75Var.l = this.k;
        b75Var.m = this.l;
        b75Var.n = this.m;
        b75Var.f404o = this.n;
        b75Var.p = this.f497o;
        b75Var.q = this.p;
        b75Var.r = this.q;
        b75Var.s = this.r;
        b75Var.t = this.s;
        b75Var.u = this.t;
        b75Var.v = this.u;
        b75Var.w = this.v;
        b75Var.x = this.w;
        b75Var.y = this.x;
        b75Var.z = this.y;
        b75Var.A = this.z;
        b75Var.B = this.A;
        b75Var.C = this.B;
        return b75Var;
    }

    public c75() {
        this(new b75());
    }
}
