package o;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class f31 implements zf6, me2 {
    public final io7 a;
    public final q82 b;
    public final int c;
    public final short d;
    public final int e;
    public final int f;
    public final boolean g;
    public final a46 h;
    public final o46 i;
    public final xf6 j;
    public final List k;
    public final ab6 l;
    public final int m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r72 f763o;
    public volatile boolean p;
    public Socket q;
    public Socket r;
    public s43 s;
    public yw5 t;
    public iu u;
    public b46 v;

    /* JADX WARN: Multi-variable type inference failed */
    public f31(io7 io7Var, q82 q82Var, int i, int i2, int i3, int i4, boolean z, a46 a46Var, o46 o46Var, xf6 xf6Var, List list, ab6 ab6Var, int i5, boolean z2, r72 r72Var) {
        io7Var.getClass();
        xf6Var.getClass();
        this.a = io7Var;
        this.b = q82Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = a46Var;
        this.i = o46Var;
        this.j = xf6Var;
        this.k = list;
        this.l = ab6Var;
        this.m = i5;
        this.n = z2;
        this.f763o = r72Var;
    }

    public static f31 l(f31 f31Var, xf6 xf6Var, int i, boolean z, r72 r72Var, int i2) {
        return new f31(f31Var.a, f31Var.b, f31Var.c, f31Var.d, f31Var.e, f31Var.f, f31Var.g, f31Var.h, f31Var.i, (i2 & 1) != 0 ? f31Var.j : xf6Var, f31Var.k, f31Var.l, (i2 & 8) != 0 ? f31Var.m : i, (i2 & 16) != 0 ? f31Var.n : z, (i2 & 32) != 0 ? f31Var.f763o : r72Var);
    }

    @Override // o.zf6
    public final zf6 a() {
        return new f31(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f763o);
    }

    @Override // o.zf6
    public final b46 b() {
        g95 g95Var = this.h.m.A;
        xf6 xf6Var = this.j;
        synchronized (g95Var) {
            xf6Var.getClass();
            ((LinkedHashSet) g95Var.m).remove(xf6Var);
        }
        b46 b46Var = this.v;
        b46Var.getClass();
        this.j.getClass();
        kd6 kd6VarD = this.i.d(this, this.k);
        if (kd6VarD != null) {
            return kd6VarD.a;
        }
        synchronized (b46Var) {
            q82 q82Var = this.b;
            TimeZone timeZone = ro8.a;
            ((ConcurrentLinkedQueue) q82Var.d).add(b46Var);
            ((go7) q82Var.b).c((c46) q82Var.c, 0L);
            this.h.a(b46Var);
        }
        this.h.p.j(this.h, b46Var);
        return b46Var;
    }

    @Override // o.zf6
    public final boolean c() {
        return this.t != null;
    }

    @Override // o.zf6, o.me2
    public final void cancel() {
        this.p = true;
        Socket socket = this.q;
        if (socket != null) {
            ro8.c(socket);
        }
    }

    @Override // o.zf6
    public final yf6 d() {
        Socket socket;
        Socket socket2;
        if (this.q != null) {
            hk0.l("TCP already connected");
            return null;
        }
        this.h.E.add(this);
        boolean z = false;
        try {
            try {
                ae2 ae2Var = this.h.p;
                a46 a46Var = this.h;
                xf6 xf6Var = this.j;
                ae2Var.i(a46Var, xf6Var.c, xf6Var.b);
                this.j.getClass();
                i();
                z = true;
                yf6 yf6Var = new yf6(this, (Throwable) null, 6);
                this.h.E.remove(this);
                return yf6Var;
            } catch (IOException e) {
                xf6 xf6Var2 = this.j;
                xf6Var2.a.getClass();
                if (xf6Var2.b.type() != Proxy.Type.DIRECT) {
                    dc dcVar = this.j.a;
                    dcVar.g.connectFailed(dcVar.h.g(), this.j.b.address(), e);
                }
                ae2 ae2Var2 = this.h.p;
                a46 a46Var2 = this.h;
                xf6 xf6Var3 = this.j;
                ae2Var2.h(a46Var2, xf6Var3.c, xf6Var3.b, e);
                this.j.getClass();
                yf6 yf6Var2 = new yf6(this, e, 2);
                this.h.E.remove(this);
                if (!z && (socket = this.q) != null) {
                    ro8.c(socket);
                }
                return yf6Var2;
            }
        } catch (Throwable th) {
            this.h.E.remove(this);
            if (!z && (socket2 = this.q) != null) {
                ro8.c(socket2);
            }
            throw th;
        }
    }

    @Override // o.me2
    public final void e(a46 a46Var, IOException iOException) {
    }

    @Override // o.me2
    public final void f() {
    }

    @Override // o.zf6
    public final yf6 g() throws Throwable {
        Socket socket = this.q;
        if (socket == null) {
            hk0.g("TCP not connected");
            return null;
        }
        if (c()) {
            hk0.l("already connected");
            return null;
        }
        List list = this.j.a.j;
        this.h.E.add(this);
        boolean z = false;
        try {
            try {
                if (this.l != null) {
                    yf6 yf6VarK = k();
                    if (yf6VarK.c != null) {
                        this.h.E.remove(this);
                        Socket socket2 = this.r;
                        if (socket2 != null) {
                            ro8.c(socket2);
                        }
                        ro8.c(socket);
                        return yf6VarK;
                    }
                }
                dc dcVar = this.j.a;
                if (dcVar.c != null) {
                    iu iuVar = this.u;
                    if (iuVar == null) {
                        im3.e0("socket");
                        throw null;
                    }
                    if (((w36) iuVar.p).n.z()) {
                        iu iuVar2 = this.u;
                        if (iuVar2 == null) {
                            im3.e0("socket");
                            throw null;
                        }
                        if (((u36) iuVar2.n).n.z()) {
                            this.h.p.B(this.h);
                            dc dcVar2 = this.j.a;
                            SSLSocketFactory sSLSocketFactory = dcVar2.c;
                            h93 h93Var = dcVar2.h;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, h93Var.d, h93Var.e, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            f31 f31VarO = o(list, sSLSocket);
                            z41 z41Var = (z41) list.get(f31VarO.m);
                            z41Var.a(sSLSocket, f31VarO.n);
                            try {
                                j(sSLSocket, z41Var);
                                this.h.p.A(this.h, this.s);
                            } catch (SSLException e) {
                                f31VarO.n(list, sSLSocket, e);
                                throw e;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.r = socket;
                List list2 = dcVar.i;
                yw5 yw5Var = yw5.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(yw5Var)) {
                    yw5Var = yw5.HTTP_1_1;
                }
                this.t = yw5Var;
                io7 io7Var = this.a;
                q82 q82Var = this.b;
                xf6 xf6Var = this.j;
                Socket socket3 = this.r;
                socket3.getClass();
                s43 s43Var = this.s;
                yw5 yw5Var2 = this.t;
                yw5Var2.getClass();
                iu iuVar3 = this.u;
                if (iuVar3 == null) {
                    im3.e0("socket");
                    throw null;
                }
                b46 b46Var = new b46(io7Var, q82Var, xf6Var, socket, socket3, s43Var, yw5Var2, iuVar3);
                this.v = b46Var;
                b46Var.i();
                ae2 ae2Var = this.h.p;
                a46 a46Var = this.h;
                xf6 xf6Var2 = this.j;
                ae2Var.g(a46Var, xf6Var2.c, xf6Var2.b, this.t);
                try {
                    yf6 yf6Var = new yf6(this, (Throwable) null, 6);
                    this.h.E.remove(this);
                    return yf6Var;
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    ae2 ae2Var2 = this.h.p;
                    a46 a46Var2 = this.h;
                    xf6 xf6Var3 = this.j;
                    ae2Var2.h(a46Var2, xf6Var3.c, xf6Var3.b, e);
                    this.j.getClass();
                    yf6 yf6Var2 = new yf6(this, (f31) null, e);
                    this.h.E.remove(this);
                    if (!z) {
                        Socket socket4 = this.r;
                        if (socket4 != null) {
                            ro8.c(socket4);
                        }
                        ro8.c(socket);
                    }
                    return yf6Var2;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    this.h.E.remove(this);
                    if (!z) {
                        Socket socket5 = this.r;
                        if (socket5 != null) {
                            ro8.c(socket5);
                        }
                        ro8.c(socket);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // o.me2
    public final xf6 h() {
        return this.j;
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.j.b.type();
        int i = type == null ? -1 : e31.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.j.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.j.b);
        }
        this.q = socketCreateSocket;
        if (this.p) {
            gk0.l("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            ql5 ql5Var = ql5.a;
            ql5.a.e(socketCreateSocket, this.j.c, this.e);
            try {
                this.u = new iu(new j93(socketCreateSocket));
            } catch (NullPointerException e) {
                if (im3.n(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, z41 z41Var) {
        yw5 yw5VarH;
        dc dcVar = this.j.a;
        try {
            if (z41Var.b) {
                ql5 ql5Var = ql5.a;
                ql5.a.d(sSLSocket, dcVar.h.d, dcVar.i, this.j.d);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            s43 s43VarQ = ep1.q(session);
            HostnameVerifier hostnameVerifier = dcVar.d;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(dcVar.h.d, session)) {
                jm0 jm0Var = dcVar.e;
                jm0Var.getClass();
                this.s = new s43(s43VarQ.a, s43VarQ.b, s43VarQ.c, new n5((Object) jm0Var, (Object) s43VarQ, (Object) dcVar, (byte) 10));
                dcVar.h.d.getClass();
                Iterator it = jm0Var.a.iterator();
                String strG = null;
                if (it.hasNext()) {
                    ua5.u(it.next());
                    throw null;
                }
                if (z41Var.b) {
                    ql5 ql5Var2 = ql5.a;
                    strG = ql5.a.g(sSLSocket);
                }
                this.r = sSLSocket;
                this.u = new iu(new j93(sSLSocket));
                if (strG != null) {
                    yw5.n.getClass();
                    yw5VarH = ol5.h(strG);
                } else {
                    yw5VarH = yw5.HTTP_1_1;
                }
                this.t = yw5VarH;
                ql5 ql5Var3 = ql5.a;
                ql5.a.getClass();
                return;
            }
            List listA = s43VarQ.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + dcVar.h.d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(dcVar.h.d);
            sb.append(" not verified:\n            |    certificate: ");
            jm0 jm0Var2 = jm0.c;
            ai0 ai0Var = ai0.p;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            sb.append("sha256/".concat(ju.w(encoded).c("SHA-256").a()));
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(lv0.A0(x65.a(x509Certificate, 7), x65.a(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(vb7.D(sb.toString()));
        } catch (Throwable th) {
            ql5 ql5Var4 = ql5.a;
            ql5.a.getClass();
            ro8.c(sSLSocket);
            throw th;
        }
    }

    public final yf6 k() throws IOException {
        ab6 ab6Var = this.l;
        ab6Var.getClass();
        xf6 xf6Var = this.j;
        String str = "CONNECT " + ro8.i(xf6Var.a.h, true) + " HTTP/1.1";
        iu iuVar = this.u;
        if (iuVar == null) {
            im3.e0("socket");
            throw null;
        }
        z73 z73Var = new z73(null, this, iuVar);
        iu iuVar2 = this.u;
        if (iuVar2 == null) {
            im3.e0("socket");
            throw null;
        }
        ((w36) iuVar2.p).m.i().g(this.c);
        iu iuVar3 = this.u;
        if (iuVar3 == null) {
            im3.e0("socket");
            throw null;
        }
        ((u36) iuVar3.n).m.i().g(this.d);
        z73Var.l(ab6Var.c, str);
        z73Var.a();
        jc6 jc6VarD = z73Var.d(false);
        jc6VarD.getClass();
        jc6VarD.a = ab6Var;
        lc6 lc6VarA = jc6VarD.a();
        int i = lc6VarA.p;
        long jE = ro8.e(lc6VarA);
        if (jE != -1) {
            x73 x73VarK = z73Var.k(lc6VarA.m.a, jE);
            ro8.g(x73VarK, Integer.MAX_VALUE);
            x73VarK.close();
        }
        if (i == 200) {
            return new yf6(this, (Throwable) null, 6);
        }
        if (i != 407) {
            gk0.l(fx3.e(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        xf6Var.a.f.getClass();
        gk0.l("Failed to authenticate with proxy");
        return null;
    }

    public final f31 m(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        int i = this.m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            z41 z41Var = (z41) list.get(i2);
            z41Var.getClass();
            if (z41Var.a && (((strArr = z41Var.d) == null || po8.e(strArr, sSLSocket.getEnabledProtocols(), c05.n)) && ((strArr2 = z41Var.c) == null || po8.e(strArr2, sSLSocket.getEnabledCipherSuites(), mr0.c)))) {
                return l(this, null, i2, i != -1, null, 39);
            }
        }
        return null;
    }

    public final f31 n(List list, SSLSocket sSLSocket, SSLException sSLException) throws s72 {
        if (this.f763o != null) {
            return null;
        }
        ql5 ql5Var = ql5.a;
        r72 r72VarF = ql5.a.f(sSLException);
        if (r72VarF != null) {
            HostnameVerifier hostnameVerifier = this.j.a.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(r72VarF.a, sSLSocket.getSession())) {
                throw new s72(e41.l(new StringBuilder("public_name '"), r72VarF.a, "' not verified"), sSLException);
            }
            xf6 xf6Var = this.j;
            return l(this, new xf6(xf6Var.a, xf6Var.b, xf6Var.c, r72VarF.b), 0, false, r72VarF, 30);
        }
        if (!this.g) {
            return null;
        }
        if (((sSLException instanceof SSLHandshakeException) && (sSLException.getCause() instanceof CertificateException)) || (sSLException instanceof SSLPeerUnverifiedException)) {
            return null;
        }
        return m(list, sSLSocket);
    }

    public final f31 o(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        if (this.m != -1) {
            return this;
        }
        f31 f31VarM = m(list, sSLSocket);
        if (f31VarM != null) {
            return f31VarM;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.n);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }
}
