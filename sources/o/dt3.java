package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dt3 extends oy2 {
    public static final dt3 v;
    public static final ys3 w = new ys3((byte) 2);
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public at3 f653o;
    public bt3 p;
    public bt3 q;
    public bt3 r;
    public bt3 s;
    public byte t;
    public int u;

    static {
        dt3 dt3Var = new dt3();
        v = dt3Var;
        dt3Var.f653o = at3.s;
        bt3 bt3Var = bt3.s;
        dt3Var.p = bt3Var;
        dt3Var.q = bt3Var;
        dt3Var.r = bt3Var;
        dt3Var.s = bt3Var;
    }

    public dt3(vu0 vu0Var, dg2 dg2Var) {
        this.t = (byte) -1;
        this.u = -1;
        this.f653o = at3.s;
        bt3 bt3Var = bt3.s;
        this.p = bt3Var;
        this.q = bt3Var;
        this.r = bt3Var;
        this.s = bt3Var;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        byte b = 0;
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM = vu0Var.m();
                    if (iM != 0) {
                        zs3 zs3VarI = null;
                        if (iM == 10) {
                            if ((this.n & 1) == 1) {
                                at3 at3Var = this.f653o;
                                at3Var.getClass();
                                zs3VarI = new zs3(b);
                                zs3VarI.i(at3Var);
                            }
                            at3 at3Var2 = (at3) vu0Var.f(at3.t, dg2Var);
                            this.f653o = at3Var2;
                            if (zs3VarI != null) {
                                zs3VarI.i(at3Var2);
                                this.f653o = zs3VarI.g();
                            }
                            this.n |= 1;
                        } else if (iM == 18) {
                            if ((this.n & 2) == 2) {
                                bt3 bt3Var2 = this.p;
                                bt3Var2.getClass();
                                zs3VarI = bt3.i(bt3Var2);
                            }
                            bt3 bt3Var3 = (bt3) vu0Var.f(bt3.t, dg2Var);
                            this.p = bt3Var3;
                            if (zs3VarI != null) {
                                zs3VarI.j(bt3Var3);
                                this.p = zs3VarI.h();
                            }
                            this.n |= 2;
                        } else if (iM == 26) {
                            if ((this.n & 4) == 4) {
                                bt3 bt3Var4 = this.q;
                                bt3Var4.getClass();
                                zs3VarI = bt3.i(bt3Var4);
                            }
                            bt3 bt3Var5 = (bt3) vu0Var.f(bt3.t, dg2Var);
                            this.q = bt3Var5;
                            if (zs3VarI != null) {
                                zs3VarI.j(bt3Var5);
                                this.q = zs3VarI.h();
                            }
                            this.n |= 4;
                        } else if (iM == 34) {
                            if ((this.n & 8) == 8) {
                                bt3 bt3Var6 = this.r;
                                bt3Var6.getClass();
                                zs3VarI = bt3.i(bt3Var6);
                            }
                            bt3 bt3Var7 = (bt3) vu0Var.f(bt3.t, dg2Var);
                            this.r = bt3Var7;
                            if (zs3VarI != null) {
                                zs3VarI.j(bt3Var7);
                                this.r = zs3VarI.h();
                            }
                            this.n |= 8;
                        } else if (iM == 42) {
                            if ((this.n & 16) == 16) {
                                bt3 bt3Var8 = this.s;
                                bt3Var8.getClass();
                                zs3VarI = bt3.i(bt3Var8);
                            }
                            bt3 bt3Var9 = (bt3) vu0Var.f(bt3.t, dg2Var);
                            this.s = bt3Var9;
                            if (zs3VarI != null) {
                                zs3VarI.j(bt3Var9);
                                this.s = zs3VarI.h();
                            }
                            this.n |= 16;
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
        byte b = this.t;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.t = (byte) 1;
        return true;
    }

    @Override // o.t1
    public final int c() {
        int i = this.u;
        if (i != -1) {
            return i;
        }
        int iE = (this.n & 1) == 1 ? cv0.e(1, this.f653o) : 0;
        if ((this.n & 2) == 2) {
            iE += cv0.e(2, this.p);
        }
        if ((this.n & 4) == 4) {
            iE += cv0.e(3, this.q);
        }
        if ((this.n & 8) == 8) {
            iE += cv0.e(4, this.r);
        }
        if ((this.n & 16) == 16) {
            iE += cv0.e(5, this.s);
        }
        int size = this.m.size() + iE;
        this.u = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        return ct3.h();
    }

    @Override // o.t1
    public final fy2 e() {
        ct3 ct3VarH = ct3.h();
        ct3VarH.i(this);
        return ct3VarH;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        if ((this.n & 1) == 1) {
            cv0Var.z(1, this.f653o);
        }
        if ((this.n & 2) == 2) {
            cv0Var.z(2, this.p);
        }
        if ((this.n & 4) == 4) {
            cv0Var.z(3, this.q);
        }
        if ((this.n & 8) == 8) {
            cv0Var.z(4, this.r);
        }
        if ((this.n & 16) == 16) {
            cv0Var.z(5, this.s);
        }
        cv0Var.C(this.m);
    }

    public dt3() {
        this.t = (byte) -1;
        this.u = -1;
        this.m = zh0.m;
    }

    public dt3(ct3 ct3Var) {
        this.t = (byte) -1;
        this.u = -1;
        this.m = ct3Var.m;
    }
}
