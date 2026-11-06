package io.sentry;

import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import o.a46;
import o.ab6;
import o.ae2;
import o.at2;
import o.b46;
import o.bt2;
import o.ds1;
import o.e41;
import o.hk0;
import o.im3;
import o.jc6;
import o.k70;
import o.lc6;
import o.le2;
import o.me2;
import o.n46;
import o.ne2;
import o.ua5;
import o.v12;
import o.w36;
import o.wg5;
import o.wk0;
import o.xc8;
import o.y12;

/* JADX INFO: loaded from: classes.dex */
public class z7 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public z7(byte b) {
        switch (b) {
            case 4:
                this.b = new Object();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.a = true;
                break;
            default:
                this.b = null;
                this.c = q4.AUTO;
                this.a = false;
                this.d = "manual";
                break;
        }
    }

    public static IOException a(z7 z7Var, long j, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            z7Var.k(iOException);
        }
        if (z3) {
            ae2 ae2Var = ((a46) z7Var.b).p;
            if (iOException != null) {
                ae2Var.r((a46) z7Var.b, iOException);
            } else {
                ae2Var.p((a46) z7Var.b, j);
            }
        }
        if (z2) {
            ae2 ae2Var2 = ((a46) z7Var.b).p;
            if (iOException != null) {
                ae2Var2.w((a46) z7Var.b, iOException);
            } else {
                ae2Var2.u((a46) z7Var.b, j);
            }
        }
        return ((a46) z7Var.b).g(z7Var, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public void b(boolean z) {
        y12 y12Var = (y12) this.d;
        synchronized (y12Var.t) {
            try {
                if (this.a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (im3.n(((v12) this.b).g, this)) {
                    y12Var.e(this, z);
                }
                this.a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int c(int i, int i2, int i3) {
        boolean z = this.a;
        k70 k70Var = (k70) this.b;
        return z ? k70Var.b(i2, i) : k70Var.b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public wg5 d(int i) {
        wg5 wg5Var;
        y12 y12Var = (y12) this.d;
        synchronized (y12Var.t) {
            if (this.a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.c)[i] = true;
            Object obj = ((v12) this.b).d.get(i);
            ds1.D(y12Var.C, (wg5) obj);
            wg5Var = (wg5) obj;
        }
        return wg5Var;
    }

    public b46 e() {
        me2 me2VarG = ((ne2) this.d).g();
        b46 b46Var = me2VarG instanceof b46 ? (b46) me2VarG : null;
        if (b46Var != null) {
            return b46Var;
        }
        hk0.l("no connection for CONNECT tunnels");
        return null;
    }

    public n46 f(lc6 lc6Var) throws IOException {
        z7 z7Var;
        try {
            String strA = lc6Var.r.a("Content-Type");
            if (strA == null) {
                strA = null;
            }
            long jI = ((ne2) this.d).i(lc6Var);
            z7Var = this;
            try {
                return new n46(strA, jI, new w36(new le2(z7Var, ((ne2) this.d).h(lc6Var), jI, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                ((a46) z7Var.b).p.w((a46) z7Var.b, iOException);
                z7Var.k(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            z7Var = this;
        }
    }

    public bt2 g() throws at2 {
        bt2 bt2Var = (bt2) this.d;
        if (bt2Var != null) {
            return bt2Var;
        }
        int iC = 0;
        int iC2 = 0;
        for (int i = 0; i < 6; i++) {
            iC2 = c(i, 8, iC2);
        }
        int iC3 = c(8, 7, c(8, 8, c(7, 8, iC2)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iC3 = c(8, i2, iC3);
        }
        int i3 = ((k70) this.b).n;
        int i4 = i3 - 7;
        for (int i5 = i3 - 1; i5 >= i4; i5--) {
            iC = c(8, i5, iC);
        }
        for (int i6 = i3 - 8; i6 < i3; i6++) {
            iC = c(i6, 8, iC);
        }
        bt2 bt2VarA = bt2.a(iC3, iC);
        if (bt2VarA == null) {
            bt2VarA = bt2.a(iC3 ^ 21522, iC ^ 21522);
        }
        this.d = bt2VarA;
        if (bt2VarA != null) {
            return bt2VarA;
        }
        throw at2.a();
    }

    public jc6 h(boolean z) throws IOException {
        try {
            jc6 jc6VarD = ((ne2) this.d).d(z);
            if (jc6VarD == null) {
                return jc6VarD;
            }
            jc6VarD.n = this;
            return jc6VarD;
        } catch (IOException e) {
            ((a46) this.b).p.w((a46) this.b, e);
            k(e);
            throw e;
        }
    }

    public xc8 i() throws at2 {
        xc8 xc8Var = (xc8) this.c;
        if (xc8Var != null) {
            return xc8Var;
        }
        int i = ((k70) this.b).n;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return xc8.c(i2);
        }
        int i3 = i - 11;
        int iC = 0;
        int iC2 = 0;
        for (int i4 = 5; i4 >= 0; i4--) {
            for (int i5 = i - 9; i5 >= i3; i5--) {
                iC2 = c(i5, i4, iC2);
            }
        }
        xc8 xc8VarB = xc8.b(iC2);
        if (xc8VarB != null && (xc8VarB.a * 4) + 17 == i) {
            this.c = xc8VarB;
            return xc8VarB;
        }
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                iC = c(i6, i7, iC);
            }
        }
        xc8 xc8VarB2 = xc8.b(iC);
        if (xc8VarB2 == null || (xc8VarB2.a * 4) + 17 != i) {
            throw at2.a();
        }
        this.c = xc8VarB2;
        return xc8VarB2;
    }

    public void j() {
        if (((bt2) this.d) == null) {
            return;
        }
        int i = ua5.E(8)[((bt2) this.d).b];
        k70 k70Var = (k70) this.b;
        int i2 = k70Var.n;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (e41.a(i, i3, i4)) {
                    k70Var.a(i4, i3);
                }
            }
        }
    }

    public void k(IOException iOException) {
        this.a = true;
        ((ne2) this.d).g().e((a46) this.b, iOException);
    }

    public wk0 l() throws SocketException {
        a46 a46Var = (a46) this.b;
        if (a46Var.v) {
            hk0.l("Check failed.");
            return null;
        }
        a46Var.v = true;
        a46Var.q.i();
        synchronized (a46Var) {
            if (a46Var.D == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (a46Var.z || a46Var.A) {
                throw new IllegalStateException("Check failed.");
            }
            if (a46Var.x) {
                throw new IllegalStateException("Check failed.");
            }
            if (!a46Var.y) {
                throw new IllegalStateException("Check failed.");
            }
            a46Var.y = false;
            a46Var.z = true;
            a46Var.A = true;
        }
        me2 me2VarG = ((ne2) this.d).g();
        me2VarG.getClass();
        b46 b46Var = (b46) me2VarG;
        b46Var.e.setSoTimeout(0);
        b46Var.f();
        return new wk0(this);
    }

    public void m(ab6 ab6Var) throws IOException {
        ab6Var.getClass();
        try {
            ((a46) this.b).p.t((a46) this.b);
            ((ne2) this.d).j(ab6Var);
            ((a46) this.b).p.s((a46) this.b, ab6Var);
        } catch (IOException e) {
            ((a46) this.b).p.r((a46) this.b, e);
            k(e);
            throw e;
        }
    }

    public z7(y12 y12Var, v12 v12Var) {
        this.d = y12Var;
        this.b = v12Var;
        this.c = new boolean[2];
    }
}
