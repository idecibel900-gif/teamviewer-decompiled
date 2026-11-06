package o;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class b75 {
    public short A;
    public g95 B;
    public io7 C;
    public xc0 b;
    public mm8 e;
    public boolean f;
    public boolean g;
    public d82 h;
    public boolean i;
    public boolean j;
    public xz2 k;
    public d32 l;
    public ProxySelector m;
    public d82 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SocketFactory f404o;
    public SSLSocketFactory p;
    public X509TrustManager q;
    public List r;
    public List s;
    public HostnameVerifier t;
    public jm0 u;
    public iq8 v;
    public int w;
    public int x;
    public short y;
    public char z;
    public j93 a = new j93((byte) 15);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public b75() {
        zd2 zd2Var = ae2.a;
        TimeZone timeZone = ro8.a;
        this.e = new mm8(zd2Var);
        this.f = true;
        this.g = true;
        d82 d82Var = d82.f595o;
        this.h = d82Var;
        this.i = true;
        this.j = true;
        this.k = xz2.H;
        this.l = g32.a;
        this.n = d82Var;
        ql5 ql5Var = ql5.a;
        ql5.a.getClass();
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.f404o = socketFactory;
        this.r = c75.E;
        this.s = c75.D;
        this.t = x65.a;
        this.u = jm0.c;
        this.w = 10000;
        this.x = 10000;
        this.y = (short) 10000;
        this.z = (char) 60000;
        this.A = (short) 1024;
    }
}
