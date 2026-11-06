package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ou5 extends oy2 {
    public static final ou5 s;
    public static final ys3 t = new ys3((byte) 6);
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1678o;
    public nu5 p;
    public byte q;
    public int r;

    static {
        ou5 ou5Var = new ou5();
        s = ou5Var;
        ou5Var.f1678o = 0;
        ou5Var.p = nu5.B;
    }

    public ou5(vu0 vu0Var, dg2 dg2Var) {
        lu5 lu5VarH;
        this.q = (byte) -1;
        this.r = -1;
        boolean z = false;
        this.f1678o = 0;
        this.p = nu5.B;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        if (iM != 0) {
                            if (iM == 8) {
                                this.n |= 1;
                                this.f1678o = vu0Var.j();
                            } else if (iM == 18) {
                                if ((this.n & 2) == 2) {
                                    nu5 nu5Var = this.p;
                                    nu5Var.getClass();
                                    lu5VarH = lu5.h();
                                    lu5VarH.i(nu5Var);
                                } else {
                                    lu5VarH = null;
                                }
                                nu5 nu5Var2 = (nu5) vu0Var.f(nu5.C, dg2Var);
                                this.p = nu5Var2;
                                if (lu5VarH != null) {
                                    lu5VarH.i(nu5Var2);
                                    this.p = lu5VarH.g();
                                }
                                this.n |= 2;
                            } else if (!vu0Var.p(iM, cv0VarR)) {
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        rm3 rm3Var = new rm3(e.getMessage());
                        rm3Var.m = this;
                        throw rm3Var;
                    }
                } catch (rm3 e2) {
                    e2.m = this;
                    throw e2;
                }
            } catch (Throwable th) {
                try {
                    cv0VarR.u();
                } catch (IOException unused) {
                } finally {
                    this.m = xh0Var.q();
                }
                throw th;
            }
        }
        try {
            cv0VarR.u();
        } catch (IOException unused2) {
        } finally {
            this.m = xh0Var.q();
        }
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
        int i = this.n;
        if ((i & 1) != 1) {
            this.q = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.q = (byte) 0;
            return false;
        }
        if (this.p.a()) {
            this.q = (byte) 1;
            return true;
        }
        this.q = (byte) 0;
        return false;
    }

    @Override // o.t1
    public final int c() {
        int i = this.r;
        if (i != -1) {
            return i;
        }
        int iC = (this.n & 1) == 1 ? cv0.c(1, this.f1678o) : 0;
        if ((this.n & 2) == 2) {
            iC += cv0.e(2, this.p);
        }
        int size = this.m.size() + iC;
        this.r = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        pu5 pu5Var = new pu5((byte) 2);
        pu5Var.p = nu5.B;
        return pu5Var;
    }

    @Override // o.t1
    public final fy2 e() {
        pu5 pu5Var = new pu5((byte) 2);
        pu5Var.p = nu5.B;
        pu5Var.j(this);
        return pu5Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        if ((this.n & 1) == 1) {
            cv0Var.x(1, this.f1678o);
        }
        if ((this.n & 2) == 2) {
            cv0Var.z(2, this.p);
        }
        cv0Var.C(this.m);
    }

    public ou5() {
        this.q = (byte) -1;
        this.r = -1;
        this.m = zh0.m;
    }

    public ou5(pu5 pu5Var) {
        this.q = (byte) -1;
        this.r = -1;
        this.m = pu5Var.m;
    }
}
