package o;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes2.dex */
public final class b46 extends g83 implements me2 {
    public final io7 b;
    public final xf6 c;
    public final Socket d;
    public final Socket e;
    public final s43 f;
    public final yw5 g;
    public final iu h;
    public i83 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f391o;
    public final ArrayList p;
    public long q;

    public b46(io7 io7Var, q82 q82Var, xf6 xf6Var, Socket socket, Socket socket2, s43 s43Var, yw5 yw5Var, iu iuVar) {
        io7Var.getClass();
        xf6Var.getClass();
        socket.getClass();
        socket2.getClass();
        yw5Var.getClass();
        iuVar.getClass();
        this.b = io7Var;
        this.c = xf6Var;
        this.d = socket;
        this.e = socket2;
        this.f = s43Var;
        this.g = yw5Var;
        this.h = iuVar;
        this.f391o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void c(c75 c75Var, xf6 xf6Var, IOException iOException) {
        xf6Var.getClass();
        iOException.getClass();
        if (xf6Var.b.type() != Proxy.Type.DIRECT) {
            dc dcVar = xf6Var.a;
            dcVar.g.connectFailed(dcVar.h.g(), xf6Var.b.address(), iOException);
        }
        g95 g95Var = c75Var.A;
        synchronized (g95Var) {
            ((LinkedHashSet) g95Var.m).add(xf6Var);
        }
    }

    @Override // o.g83
    public final void a(i83 i83Var, hv6 hv6Var) {
        hv6Var.getClass();
        synchronized (this) {
            this.f391o = (hv6Var.a & 8) != 0 ? hv6Var.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // o.me2
    public final void cancel() {
        ro8.c(this.d);
    }

    public final boolean d(dc dcVar, List list) {
        h93 h93Var = dcVar.h;
        String str = h93Var.d;
        TimeZone timeZone = ro8.a;
        if (this.p.size() < this.f391o && !this.j) {
            xf6 xf6Var = this.c;
            dc dcVar2 = xf6Var.a;
            dc dcVar3 = xf6Var.a;
            if (dcVar2.a(dcVar)) {
                if (!im3.n(str, dcVar3.h.d)) {
                    if (this.i != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            xf6 xf6Var2 = (xf6) it.next();
                            Proxy.Type type = xf6Var2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && xf6Var.b.type() == type2 && im3.n(xf6Var.c, xf6Var2.c)) {
                                if (dcVar.d != x65.a) {
                                    break;
                                }
                                TimeZone timeZone2 = ro8.a;
                                h93 h93Var2 = dcVar3.h;
                                if (h93Var.e != h93Var2.e) {
                                    break;
                                }
                                boolean zN = im3.n(str, h93Var2.d);
                                s43 s43Var = this.f;
                                if (!zN) {
                                    if (!this.k && s43Var != null) {
                                        List listA = s43Var.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            obj.getClass();
                                            if (!x65.c(str, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    jm0 jm0Var = dcVar.e;
                                    jm0Var.getClass();
                                    s43Var.getClass();
                                    List listA2 = s43Var.a();
                                    str.getClass();
                                    listA2.getClass();
                                    Iterator it2 = jm0Var.a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    ua5.u(it2.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.me2
    public final void e(a46 a46Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof qa7)) {
                    if (!(this.i != null) || (iOException instanceof x41)) {
                        this.j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                c(a46Var.m, this.c, iOException);
                            }
                            this.l++;
                        }
                    }
                } else if (((qa7) iOException).m == tc2.REFUSED_STREAM) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i > 1) {
                        this.j = true;
                        this.l++;
                    }
                } else if (((qa7) iOException).m != tc2.CANCEL || !a46Var.C) {
                    this.j = true;
                    this.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.me2
    public final void f() {
        synchronized (this) {
            this.j = true;
        }
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = ro8.a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        i83 i83Var = this.i;
        if (i83Var != null) {
            synchronized (i83Var) {
                if (i83Var.r) {
                    return false;
                }
                return i83Var.z >= i83Var.y || jNanoTime < i83Var.A;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        w36 w36Var = (w36) this.h.p;
        socket.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !w36Var.e();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // o.me2
    public final xf6 h() {
        return this.c;
    }

    public final void i() throws SocketException {
        this.q = System.nanoTime();
        yw5 yw5Var = this.g;
        if (yw5Var == yw5.HTTP_2 || yw5Var == yw5.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            xz2 xz2Var = xz2.G;
            io2 io2Var = io2.a;
            io7 io7Var = this.b;
            io7Var.getClass();
            yc4 yc4Var = new yc4();
            yc4Var.m = io7Var;
            yc4Var.p = g83.a;
            yc4Var.q = io2.a;
            iu iuVar = this.h;
            String str = this.c.a.h.d;
            iuVar.getClass();
            str.getClass();
            yc4Var.n = iuVar;
            yc4Var.f2598o = ro8.b + ' ' + str;
            yc4Var.p = this;
            yc4Var.q = io2Var;
            i83 i83Var = new i83(yc4Var);
            this.i = i83Var;
            hv6 hv6Var = i83.L;
            this.f391o = (hv6Var.a & 8) != 0 ? hv6Var.b[3] : Integer.MAX_VALUE;
            q83 q83Var = i83Var.I;
            synchronized (q83Var) {
                try {
                    if (q83Var.p) {
                        throw new IOException("closed");
                    }
                    Logger logger = q83.r;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(ro8.d(">> CONNECTION " + a83.a.e(), new Object[0]));
                    }
                    q83Var.m.z0(a83.a);
                    q83Var.m.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            q83 q83Var2 = i83Var.I;
            hv6 hv6Var2 = i83Var.C;
            q83Var2.getClass();
            hv6Var2.getClass();
            synchronized (q83Var2) {
                try {
                    if (q83Var2.p) {
                        throw new IOException("closed");
                    }
                    q83Var2.q(0, Integer.bitCount(hv6Var2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & hv6Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            u36 u36Var = q83Var2.m;
                            if (u36Var.f2164o) {
                                throw new IllegalStateException("closed");
                            }
                            bf0 bf0Var = u36Var.n;
                            sn6 sn6VarQ0 = bf0Var.Q0(2);
                            byte[] bArr = sn6VarQ0.a;
                            int i2 = sn6VarQ0.c;
                            bArr[i2] = (byte) ((i >>> 8) & 255);
                            bArr[i2 + 1] = (byte) (i & 255);
                            sn6VarQ0.c = i2 + 2;
                            bf0Var.n += 2;
                            u36Var.e();
                            q83Var2.m.q(hv6Var2.b[i]);
                        }
                    }
                    q83Var2.m.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iA = i83Var.C.a();
            if (iA != 65535) {
                i83Var.I.J(0, iA - 65535);
            }
            go7.b(i83Var.s.d(), i83Var.f1043o, i83Var.J);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        xf6 xf6Var = this.c;
        sb.append(xf6Var.a.h.d);
        sb.append(':');
        sb.append(xf6Var.a.h.e);
        sb.append(", proxy=");
        sb.append(xf6Var.b);
        sb.append(" hostAddress=");
        sb.append(xf6Var.c);
        sb.append(" cipherSuite=");
        s43 s43Var = this.f;
        sb.append(s43Var != null ? s43Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
