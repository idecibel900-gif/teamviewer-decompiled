package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class yv5 extends oy2 {
    public static final yv5 t;
    public static final ys3 u = new ys3((byte) 22);
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public xv5 f2647o;
    public aw5 p;
    public int q;
    public byte r;
    public int s;

    static {
        yv5 yv5Var = new yv5();
        t = yv5Var;
        yv5Var.f2647o = xv5.INV;
        yv5Var.p = aw5.F;
        yv5Var.q = 0;
    }

    public yv5(vu0 vu0Var, dg2 dg2Var) {
        this.r = (byte) -1;
        this.s = -1;
        xv5 xv5Var = xv5.INV;
        this.f2647o = xv5Var;
        this.p = aw5.F;
        boolean z = false;
        this.q = 0;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        if (iM != 0) {
                            zv5 zv5VarQ = null;
                            xv5 xv5Var2 = null;
                            if (iM == 8) {
                                int iJ = vu0Var.j();
                                if (iJ == 0) {
                                    xv5Var2 = xv5.IN;
                                } else if (iJ == 1) {
                                    xv5Var2 = xv5.OUT;
                                } else if (iJ == 2) {
                                    xv5Var2 = xv5Var;
                                } else if (iJ == 3) {
                                    xv5Var2 = xv5.STAR;
                                }
                                if (xv5Var2 == null) {
                                    cv0VarR.G(iM);
                                    cv0VarR.G(iJ);
                                } else {
                                    this.n |= 1;
                                    this.f2647o = xv5Var2;
                                }
                            } else if (iM == 18) {
                                if ((this.n & 2) == 2) {
                                    aw5 aw5Var = this.p;
                                    aw5Var.getClass();
                                    zv5VarQ = aw5.q(aw5Var);
                                }
                                aw5 aw5Var2 = (aw5) vu0Var.f(aw5.G, dg2Var);
                                this.p = aw5Var2;
                                if (zv5VarQ != null) {
                                    zv5VarQ.j(aw5Var2);
                                    this.p = zv5VarQ.h();
                                }
                                this.n |= 2;
                            } else if (iM == 24) {
                                this.n |= 4;
                                this.q = vu0Var.j();
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
        byte b = this.r;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.n & 2) != 2 || this.p.a()) {
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
        int iB = (this.n & 1) == 1 ? cv0.b(1, this.f2647o.m) : 0;
        if ((this.n & 2) == 2) {
            iB += cv0.e(2, this.p);
        }
        if ((this.n & 4) == 4) {
            iB += cv0.c(3, this.q);
        }
        int size = this.m.size() + iB;
        this.s = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        wv5 wv5Var = new wv5();
        wv5Var.f2450o = xv5.INV;
        wv5Var.p = aw5.F;
        return wv5Var;
    }

    @Override // o.t1
    public final fy2 e() {
        wv5 wv5Var = new wv5();
        wv5Var.f2450o = xv5.INV;
        wv5Var.p = aw5.F;
        wv5Var.h(this);
        return wv5Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        if ((this.n & 1) == 1) {
            cv0Var.w(1, this.f2647o.m);
        }
        if ((this.n & 2) == 2) {
            cv0Var.z(2, this.p);
        }
        if ((this.n & 4) == 4) {
            cv0Var.x(3, this.q);
        }
        cv0Var.C(this.m);
    }

    public yv5() {
        this.r = (byte) -1;
        this.s = -1;
        this.m = zh0.m;
    }

    public yv5(wv5 wv5Var) {
        this.r = (byte) -1;
        this.s = -1;
        this.m = wv5Var.m;
    }
}
