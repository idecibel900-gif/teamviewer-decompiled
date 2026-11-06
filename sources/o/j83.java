package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class j83 implements ne2 {
    public static final List g = ro8.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = ro8.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final b46 a;
    public final k46 b;
    public final i83 c;
    public volatile p83 d;
    public final yw5 e;
    public volatile boolean f;

    public j83(c75 c75Var, b46 b46Var, k46 k46Var, i83 i83Var) {
        i83Var.getClass();
        this.a = b46Var;
        this.b = k46Var;
        this.c = i83Var;
        List list = c75Var.r;
        yw5 yw5Var = yw5.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(yw5Var) ? yw5Var : yw5.HTTP_2;
    }

    @Override // o.ne2
    public final void a() {
        p83 p83Var = this.d;
        p83Var.getClass();
        p83Var.u.close();
    }

    @Override // o.ne2
    public final boolean b() {
        boolean z;
        p83 p83Var = this.d;
        if (p83Var != null) {
            synchronized (p83Var) {
                n83 n83Var = p83Var.t;
                z = n83Var.n && n83Var.p.z();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // o.ne2
    public final v07 c(ab6 ab6Var, long j) {
        ab6Var.getClass();
        p83 p83Var = this.d;
        p83Var.getClass();
        return p83Var.u;
    }

    @Override // o.ne2
    public final void cancel() {
        this.f = true;
        p83 p83Var = this.d;
        if (p83Var != null) {
            p83Var.f(tc2.CANCEL);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    @Override // o.ne2
    public final jc6 d(boolean z) throws IOException {
        k53 k53Var;
        boolean z2;
        p83 p83Var = this.d;
        if (p83Var == null) {
            gk0.l("stream wasn't created");
            return null;
        }
        synchronized (p83Var) {
            while (true) {
                if (!p83Var.r.isEmpty() || p83Var.g() != null) {
                    break;
                }
                if (!z) {
                    p83Var.n.getClass();
                    m83 m83Var = p83Var.u;
                    z2 = m83Var.f1445o || m83Var.m;
                }
                if (z2) {
                    p83Var.v.h();
                }
                try {
                    try {
                        p83Var.wait();
                        if (z2) {
                            p83Var.v.k();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        p83Var.v.k();
                    }
                    throw th;
                }
            }
            if (p83Var.r.isEmpty()) {
                IOException iOException = p83Var.y;
                if (iOException != null) {
                    throw iOException;
                }
                tc2 tc2VarG = p83Var.g();
                tc2VarG.getClass();
                throw new qa7(tc2VarG);
            }
            Object objRemoveFirst = p83Var.r.removeFirst();
            objRemoveFirst.getClass();
            k53Var = (k53) objRemoveFirst;
        }
        yw5 yw5Var = this.e;
        ArrayList arrayList = new ArrayList(20);
        int size = k53Var.size();
        ae aeVarO = null;
        for (int i = 0; i < size; i++) {
            String strJ = i67.j(k53Var, i);
            String strL = i67.l(k53Var, i);
            if (strJ.equals(":status")) {
                aeVarO = h67.o("HTTP/1.1 ".concat(strL));
            } else if (!h.contains(strJ)) {
                arrayList.add(strJ);
                arrayList.add(ub7.x0(strL).toString());
            }
        }
        if (aeVarO == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        jc6 jc6Var = new jc6();
        jc6Var.b = yw5Var;
        jc6Var.c = aeVarO.b;
        jc6Var.d = (String) aeVarO.d;
        jc6Var.f = i67.k(new k53((String[]) arrayList.toArray(new String[0])));
        if (z && jc6Var.c == 100) {
            return null;
        }
        return jc6Var;
    }

    @Override // o.ne2
    public final void e() {
        this.c.I.flush();
    }

    @Override // o.ne2
    public final n57 f() {
        p83 p83Var = this.d;
        p83Var.getClass();
        return p83Var;
    }

    @Override // o.ne2
    public final me2 g() {
        return this.a;
    }

    @Override // o.ne2
    public final q67 h(lc6 lc6Var) {
        p83 p83Var = this.d;
        p83Var.getClass();
        return p83Var.t;
    }

    @Override // o.ne2
    public final long i(lc6 lc6Var) {
        if (y83.a(lc6Var)) {
            return ro8.e(lc6Var);
        }
        return 0L;
    }

    @Override // o.ne2
    public final void j(ab6 ab6Var) throws IOException {
        int i;
        p83 p83Var;
        boolean z;
        ab6Var.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = ab6Var.d != null;
        k53 k53Var = ab6Var.c;
        ArrayList arrayList = new ArrayList(k53Var.size() + 4);
        arrayList.add(new d53(ab6Var.b, d53.f));
        ai0 ai0Var = d53.g;
        h93 h93Var = ab6Var.a;
        h93Var.getClass();
        String strB = h93Var.b();
        String strD = h93Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new d53(strB, ai0Var));
        String strA = k53Var.a("Host");
        if (strA != null) {
            arrayList.add(new d53(strA, d53.i));
        }
        arrayList.add(new d53(h93Var.a, d53.h));
        int size = k53Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strJ = i67.j(k53Var, i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strJ.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && i67.l(k53Var, i2).equals("trailers"))) {
                arrayList.add(new d53(lowerCase, i67.l(k53Var, i2)));
            }
        }
        i83 i83Var = this.c;
        i83Var.getClass();
        boolean z3 = !z2;
        synchronized (i83Var.I) {
            synchronized (i83Var) {
                try {
                    if (i83Var.q > 1073741823) {
                        i83Var.u(tc2.REFUSED_STREAM);
                    }
                    if (i83Var.r) {
                        throw new x41();
                    }
                    i = i83Var.q;
                    i83Var.q = i + 2;
                    p83Var = new p83(i, i83Var, z3, false, null);
                    z = !z2 || i83Var.F >= i83Var.G || p83Var.p >= p83Var.q;
                    if (p83Var.i()) {
                        i83Var.n.put(Integer.valueOf(i), p83Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i83Var.I.z(z3, i, arrayList);
        }
        if (z) {
            i83Var.I.flush();
        }
        this.d = p83Var;
        boolean z4 = this.f;
        p83 p83Var2 = this.d;
        if (z4) {
            p83Var2.getClass();
            p83Var2.f(tc2.CANCEL);
            gk0.l("Canceled");
        } else {
            p83Var2.getClass();
            p83Var2.v.g(this.b.g);
            p83 p83Var3 = this.d;
            p83Var3.getClass();
            p83Var3.w.g(this.b.h);
        }
    }
}
