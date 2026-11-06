package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class iw5 extends ky2 {
    public static final iw5 x;
    public static final ys3 y = new ys3((byte) 26);
    public final zh0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1111o;
    public int p;
    public int q;
    public aw5 r;
    public int s;
    public aw5 t;
    public int u;
    public byte v;
    public int w;

    static {
        iw5 iw5Var = new iw5();
        x = iw5Var;
        iw5Var.p = 0;
        iw5Var.q = 0;
        aw5 aw5Var = aw5.F;
        iw5Var.r = aw5Var;
        iw5Var.s = 0;
        iw5Var.t = aw5Var;
        iw5Var.u = 0;
    }

    public iw5(vu0 vu0Var, dg2 dg2Var) {
        this.v = (byte) -1;
        this.w = -1;
        boolean z = false;
        this.p = 0;
        this.q = 0;
        aw5 aw5Var = aw5.F;
        this.r = aw5Var;
        this.s = 0;
        this.t = aw5Var;
        this.u = 0;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        if (iM != 0) {
                            if (iM == 8) {
                                this.f1111o |= 1;
                                this.p = vu0Var.j();
                            } else if (iM != 16) {
                                zv5 zv5VarQ = null;
                                if (iM == 26) {
                                    if ((this.f1111o & 4) == 4) {
                                        aw5 aw5Var2 = this.r;
                                        aw5Var2.getClass();
                                        zv5VarQ = aw5.q(aw5Var2);
                                    }
                                    aw5 aw5Var3 = (aw5) vu0Var.f(aw5.G, dg2Var);
                                    this.r = aw5Var3;
                                    if (zv5VarQ != null) {
                                        zv5VarQ.j(aw5Var3);
                                        this.r = zv5VarQ.h();
                                    }
                                    this.f1111o |= 4;
                                } else if (iM == 34) {
                                    if ((this.f1111o & 16) == 16) {
                                        aw5 aw5Var4 = this.t;
                                        aw5Var4.getClass();
                                        zv5VarQ = aw5.q(aw5Var4);
                                    }
                                    aw5 aw5Var5 = (aw5) vu0Var.f(aw5.G, dg2Var);
                                    this.t = aw5Var5;
                                    if (zv5VarQ != null) {
                                        zv5VarQ.j(aw5Var5);
                                        this.t = zv5VarQ.h();
                                    }
                                    this.f1111o |= 16;
                                } else if (iM == 40) {
                                    this.f1111o |= 8;
                                    this.s = vu0Var.j();
                                } else if (iM == 48) {
                                    this.f1111o |= 32;
                                    this.u = vu0Var.j();
                                } else if (!n(vu0Var, cv0VarR, dg2Var, iM)) {
                                }
                            } else {
                                this.f1111o |= 2;
                                this.q = vu0Var.j();
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
        byte b = this.v;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f1111o;
        if ((i & 2) != 2) {
            this.v = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.r.a()) {
            this.v = (byte) 0;
            return false;
        }
        if ((this.f1111o & 16) == 16 && !this.t.a()) {
            this.v = (byte) 0;
            return false;
        }
        if (i()) {
            this.v = (byte) 1;
            return true;
        }
        this.v = (byte) 0;
        return false;
    }

    @Override // o.rq4
    public final t1 b() {
        return x;
    }

    @Override // o.t1
    public final int c() {
        int i = this.w;
        if (i != -1) {
            return i;
        }
        int iC = (this.f1111o & 1) == 1 ? cv0.c(1, this.p) : 0;
        if ((this.f1111o & 2) == 2) {
            iC += cv0.c(2, this.q);
        }
        if ((this.f1111o & 4) == 4) {
            iC += cv0.e(3, this.r);
        }
        if ((this.f1111o & 16) == 16) {
            iC += cv0.e(4, this.t);
        }
        if ((this.f1111o & 8) == 8) {
            iC += cv0.c(5, this.s);
        }
        if ((this.f1111o & 32) == 32) {
            iC += cv0.c(6, this.u);
        }
        int size = this.n.size() + j() + iC;
        this.w = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        hw5 hw5Var = new hw5();
        aw5 aw5Var = aw5.F;
        hw5Var.s = aw5Var;
        hw5Var.u = aw5Var;
        return hw5Var;
    }

    @Override // o.t1
    public final fy2 e() {
        hw5 hw5Var = new hw5();
        aw5 aw5Var = aw5.F;
        hw5Var.s = aw5Var;
        hw5Var.u = aw5Var;
        hw5Var.i(this);
        return hw5Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        yt2 yt2Var = new yt2(this);
        if ((this.f1111o & 1) == 1) {
            cv0Var.x(1, this.p);
        }
        if ((this.f1111o & 2) == 2) {
            cv0Var.x(2, this.q);
        }
        if ((this.f1111o & 4) == 4) {
            cv0Var.z(3, this.r);
        }
        if ((this.f1111o & 16) == 16) {
            cv0Var.z(4, this.t);
        }
        if ((this.f1111o & 8) == 8) {
            cv0Var.x(5, this.s);
        }
        if ((this.f1111o & 32) == 32) {
            cv0Var.x(6, this.u);
        }
        yt2Var.P(200, cv0Var);
        cv0Var.C(this.n);
    }

    public iw5() {
        this.v = (byte) -1;
        this.w = -1;
        this.n = zh0.m;
    }

    public iw5(hw5 hw5Var) {
        super(hw5Var);
        this.v = (byte) -1;
        this.w = -1;
        this.n = hw5Var.m;
    }
}
