package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class tv5 extends oy2 {
    public static final tv5 t;
    public static final ys3 u = new ys3((byte) 19);
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2148o;
    public int p;
    public sv5 q;
    public byte r;
    public int s;

    static {
        tv5 tv5Var = new tv5();
        t = tv5Var;
        tv5Var.f2148o = -1;
        tv5Var.p = 0;
        tv5Var.q = sv5.PACKAGE;
    }

    public tv5(vu0 vu0Var) {
        this.r = (byte) -1;
        this.s = -1;
        this.f2148o = -1;
        boolean z = false;
        this.p = 0;
        sv5 sv5Var = sv5.PACKAGE;
        this.q = sv5Var;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        while (!z) {
            try {
                try {
                    int iM = vu0Var.m();
                    if (iM != 0) {
                        if (iM == 8) {
                            this.n |= 1;
                            this.f2148o = vu0Var.j();
                        } else if (iM == 16) {
                            this.n |= 2;
                            this.p = vu0Var.j();
                        } else if (iM == 24) {
                            int iJ = vu0Var.j();
                            sv5 sv5Var2 = iJ != 0 ? iJ != 1 ? iJ != 2 ? null : sv5.LOCAL : sv5Var : sv5.CLASS;
                            if (sv5Var2 == null) {
                                cv0VarR.G(iM);
                                cv0VarR.G(iJ);
                            } else {
                                this.n |= 4;
                                this.q = sv5Var2;
                            }
                        } else if (!vu0Var.p(iM, cv0VarR)) {
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
        byte b = this.r;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.n & 2) == 2) {
            this.r = (byte) 1;
            return true;
        }
        this.r = (byte) 0;
        return false;
    }

    @Override // o.t1
    public final int c() {
        int i = this.s;
        if (i != -1) {
            return i;
        }
        int iC = (this.n & 1) == 1 ? cv0.c(1, this.f2148o) : 0;
        if ((this.n & 2) == 2) {
            iC += cv0.c(2, this.p);
        }
        if ((this.n & 4) == 4) {
            iC += cv0.b(3, this.q.m);
        }
        int size = this.m.size() + iC;
        this.s = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        rv5 rv5Var = new rv5();
        rv5Var.f1957o = -1;
        rv5Var.q = sv5.PACKAGE;
        return rv5Var;
    }

    @Override // o.t1
    public final fy2 e() {
        rv5 rv5Var = new rv5();
        rv5Var.f1957o = -1;
        rv5Var.q = sv5.PACKAGE;
        rv5Var.h(this);
        return rv5Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        if ((this.n & 1) == 1) {
            cv0Var.x(1, this.f2148o);
        }
        if ((this.n & 2) == 2) {
            cv0Var.x(2, this.p);
        }
        if ((this.n & 4) == 4) {
            cv0Var.w(3, this.q.m);
        }
        cv0Var.C(this.m);
    }

    public tv5() {
        this.r = (byte) -1;
        this.s = -1;
        this.m = zh0.m;
    }

    public tv5(rv5 rv5Var) {
        this.r = (byte) -1;
        this.s = -1;
        this.m = rv5Var.m;
    }
}
