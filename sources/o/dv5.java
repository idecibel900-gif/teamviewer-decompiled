package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dv5 extends ky2 {
    public static final dv5 s;
    public static final ys3 t = new ys3((byte) 12);
    public final zh0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f658o;
    public int p;
    public byte q;
    public int r;

    static {
        dv5 dv5Var = new dv5();
        s = dv5Var;
        dv5Var.p = 0;
    }

    public dv5(vu0 vu0Var, dg2 dg2Var) {
        this.q = (byte) -1;
        this.r = -1;
        boolean z = false;
        this.p = 0;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        while (!z) {
            try {
                try {
                    int iM = vu0Var.m();
                    if (iM != 0) {
                        if (iM == 8) {
                            this.f658o |= 1;
                            this.p = vu0Var.j();
                        } else if (!n(vu0Var, cv0VarR, dg2Var, iM)) {
                        }
                    }
                    z = true;
                } catch (rm3 e) {
                    e.m = this;
                    throw e;
                } catch (IOException e2) {
                    rm3 rm3Var = new rm3(e2.getMessage());
                    rm3Var.m = this;
                    throw rm3Var;
                }
            } catch (Throwable th) {
                try {
                    cv0VarR.u();
                } catch (IOException unused) {
                } finally {
                    this.n = xh0Var.q();
                }
                m();
                throw th;
            }
        }
        try {
            cv0VarR.u();
        } catch (IOException unused2) {
        } finally {
            this.n = xh0Var.q();
        }
        m();
    }

    @Override // o.rq4
    public final boolean a() {
        byte b = this.q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (i()) {
            this.q = (byte) 1;
            return true;
        }
        this.q = (byte) 0;
        return false;
    }

    @Override // o.rq4
    public final t1 b() {
        return s;
    }

    @Override // o.t1
    public final int c() {
        int i = this.r;
        if (i != -1) {
            return i;
        }
        int size = this.n.size() + j() + ((this.f658o & 1) == 1 ? cv0.c(1, this.p) : 0);
        this.r = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        return new cv5();
    }

    @Override // o.t1
    public final fy2 e() {
        cv5 cv5Var = new cv5();
        cv5Var.h(this);
        return cv5Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        yt2 yt2Var = new yt2(this);
        if ((this.f658o & 1) == 1) {
            cv0Var.x(1, this.p);
        }
        yt2Var.P(200, cv0Var);
        cv0Var.C(this.n);
    }

    public dv5() {
        this.q = (byte) -1;
        this.r = -1;
        this.n = zh0.m;
    }

    public dv5(cv5 cv5Var) {
        super(cv5Var);
        this.q = (byte) -1;
        this.r = -1;
        this.n = cv5Var.m;
    }
}
