package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class mw5 extends oy2 {
    public static final mw5 w;
    public static final ys3 x = new ys3((byte) 27);
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1519o;
    public int p;
    public kw5 q;
    public int r;
    public int s;
    public lw5 t;
    public byte u;
    public int v;

    static {
        mw5 mw5Var = new mw5();
        w = mw5Var;
        mw5Var.f1519o = 0;
        mw5Var.p = 0;
        mw5Var.q = kw5.ERROR;
        mw5Var.r = 0;
        mw5Var.s = 0;
        mw5Var.t = lw5.LANGUAGE_VERSION;
    }

    public mw5(vu0 vu0Var) {
        this.u = (byte) -1;
        this.v = -1;
        boolean z = false;
        this.f1519o = 0;
        this.p = 0;
        kw5 kw5Var = kw5.ERROR;
        this.q = kw5Var;
        this.r = 0;
        this.s = 0;
        lw5 lw5Var = lw5.LANGUAGE_VERSION;
        this.t = lw5Var;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        while (!z) {
            try {
                try {
                    int iM = vu0Var.m();
                    if (iM != 0) {
                        if (iM == 8) {
                            this.n |= 1;
                            this.f1519o = vu0Var.j();
                        } else if (iM != 16) {
                            lw5 lw5Var2 = null;
                            kw5 kw5Var2 = null;
                            if (iM == 24) {
                                int iJ = vu0Var.j();
                                if (iJ == 0) {
                                    kw5Var2 = kw5.WARNING;
                                } else if (iJ == 1) {
                                    kw5Var2 = kw5Var;
                                } else if (iJ == 2) {
                                    kw5Var2 = kw5.HIDDEN;
                                }
                                if (kw5Var2 == null) {
                                    cv0VarR.G(iM);
                                    cv0VarR.G(iJ);
                                } else {
                                    this.n |= 4;
                                    this.q = kw5Var2;
                                }
                            } else if (iM == 32) {
                                this.n |= 8;
                                this.r = vu0Var.j();
                            } else if (iM == 40) {
                                this.n |= 16;
                                this.s = vu0Var.j();
                            } else if (iM == 48) {
                                int iJ2 = vu0Var.j();
                                if (iJ2 == 0) {
                                    lw5Var2 = lw5Var;
                                } else if (iJ2 == 1) {
                                    lw5Var2 = lw5.COMPILER_VERSION;
                                } else if (iJ2 == 2) {
                                    lw5Var2 = lw5.API_VERSION;
                                }
                                if (lw5Var2 == null) {
                                    cv0VarR.G(iM);
                                    cv0VarR.G(iJ2);
                                } else {
                                    this.n |= 32;
                                    this.t = lw5Var2;
                                }
                            } else if (!vu0Var.p(iM, cv0VarR)) {
                            }
                        } else {
                            this.n |= 2;
                            this.p = vu0Var.j();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        cv0VarR.u();
                    } catch (IOException unused) {
                    } finally {
                        this.m = xh0Var.q();
                    }
                    throw th;
                }
            } catch (rm3 e) {
                e.m = this;
                throw e;
            } catch (IOException e2) {
                rm3 rm3Var = new rm3(e2.getMessage());
                rm3Var.m = this;
                throw rm3Var;
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
        byte b = this.u;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.u = (byte) 1;
        return true;
    }

    @Override // o.t1
    public final int c() {
        int i = this.v;
        if (i != -1) {
            return i;
        }
        int iC = (this.n & 1) == 1 ? cv0.c(1, this.f1519o) : 0;
        if ((this.n & 2) == 2) {
            iC += cv0.c(2, this.p);
        }
        if ((this.n & 4) == 4) {
            iC += cv0.b(3, this.q.m);
        }
        if ((this.n & 8) == 8) {
            iC += cv0.c(4, this.r);
        }
        if ((this.n & 16) == 16) {
            iC += cv0.c(5, this.s);
        }
        if ((this.n & 32) == 32) {
            iC += cv0.b(6, this.t.m);
        }
        int size = this.m.size() + iC;
        this.v = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        jw5 jw5Var = new jw5();
        jw5Var.q = kw5.ERROR;
        jw5Var.t = lw5.LANGUAGE_VERSION;
        return jw5Var;
    }

    @Override // o.t1
    public final fy2 e() {
        jw5 jw5Var = new jw5();
        jw5Var.q = kw5.ERROR;
        jw5Var.t = lw5.LANGUAGE_VERSION;
        jw5Var.h(this);
        return jw5Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        if ((this.n & 1) == 1) {
            cv0Var.x(1, this.f1519o);
        }
        if ((this.n & 2) == 2) {
            cv0Var.x(2, this.p);
        }
        if ((this.n & 4) == 4) {
            cv0Var.w(3, this.q.m);
        }
        if ((this.n & 8) == 8) {
            cv0Var.x(4, this.r);
        }
        if ((this.n & 16) == 16) {
            cv0Var.x(5, this.s);
        }
        if ((this.n & 32) == 32) {
            cv0Var.w(6, this.t.m);
        }
        cv0Var.C(this.m);
    }

    public mw5() {
        this.u = (byte) -1;
        this.v = -1;
        this.m = zh0.m;
    }

    public mw5(jw5 jw5Var) {
        this.u = (byte) -1;
        this.v = -1;
        this.m = jw5Var.m;
    }
}
