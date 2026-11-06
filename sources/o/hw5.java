package o;

/* JADX INFO: loaded from: classes2.dex */
public final class hw5 extends jy2 {
    public int p;
    public int q;
    public int r;
    public aw5 s;
    public int t;
    public aw5 u;
    public int v;

    @Override // o.fy2
    public final t1 c() {
        iw5 iw5VarH = h();
        if (iw5VarH.a()) {
            return iw5VarH;
        }
        throw new z78();
    }

    public final Object clone() {
        hw5 hw5Var = new hw5();
        aw5 aw5Var = aw5.F;
        hw5Var.s = aw5Var;
        hw5Var.u = aw5Var;
        hw5Var.i(h());
        return hw5Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        iw5 iw5Var = null;
        try {
            try {
                iw5.y.getClass();
                i(new iw5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                iw5 iw5Var2 = (iw5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    iw5Var = iw5Var2;
                    if (iw5Var != null) {
                        i(iw5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (iw5Var != null) {
                i(iw5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        i((iw5) oy2Var);
        return this;
    }

    public final iw5 h() {
        iw5 iw5Var = new iw5(this);
        int i = this.p;
        int i2 = (i & 1) != 1 ? 0 : 1;
        iw5Var.p = this.q;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        iw5Var.q = this.r;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        iw5Var.r = this.s;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        iw5Var.s = this.t;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        iw5Var.t = this.u;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        iw5Var.u = this.v;
        iw5Var.f1111o = i2;
        return iw5Var;
    }

    public final void i(iw5 iw5Var) {
        aw5 aw5Var;
        aw5 aw5Var2;
        if (iw5Var == iw5.x) {
            return;
        }
        int i = iw5Var.f1111o;
        if ((i & 1) == 1) {
            int i2 = iw5Var.p;
            this.p = 1 | this.p;
            this.q = i2;
        }
        if ((i & 2) == 2) {
            int i3 = iw5Var.q;
            this.p = 2 | this.p;
            this.r = i3;
        }
        if ((i & 4) == 4) {
            aw5 aw5Var3 = iw5Var.r;
            if ((this.p & 4) != 4 || (aw5Var2 = this.s) == aw5.F) {
                this.s = aw5Var3;
            } else {
                zv5 zv5VarQ = aw5.q(aw5Var2);
                zv5VarQ.j(aw5Var3);
                this.s = zv5VarQ.h();
            }
            this.p |= 4;
        }
        int i4 = iw5Var.f1111o;
        if ((i4 & 8) == 8) {
            int i5 = iw5Var.s;
            this.p = 8 | this.p;
            this.t = i5;
        }
        if ((i4 & 16) == 16) {
            aw5 aw5Var4 = iw5Var.t;
            if ((this.p & 16) != 16 || (aw5Var = this.u) == aw5.F) {
                this.u = aw5Var4;
            } else {
                zv5 zv5VarQ2 = aw5.q(aw5Var);
                zv5VarQ2.j(aw5Var4);
                this.u = zv5VarQ2.h();
            }
            this.p |= 16;
        }
        if ((iw5Var.f1111o & 32) == 32) {
            int i6 = iw5Var.u;
            this.p = 32 | this.p;
            this.v = i6;
        }
        g(iw5Var);
        this.m = this.m.b(iw5Var.n);
    }
}
