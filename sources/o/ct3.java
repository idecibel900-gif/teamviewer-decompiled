package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ct3 extends fy2 implements rq4 {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public at3 f556o;
    public bt3 p;
    public bt3 q;
    public bt3 r;
    public bt3 s;

    public static ct3 h() {
        ct3 ct3Var = new ct3();
        ct3Var.f556o = at3.s;
        bt3 bt3Var = bt3.s;
        ct3Var.p = bt3Var;
        ct3Var.q = bt3Var;
        ct3Var.r = bt3Var;
        ct3Var.s = bt3Var;
        return ct3Var;
    }

    @Override // o.fy2
    public final t1 c() {
        dt3 dt3VarG = g();
        if (dt3VarG.a()) {
            return dt3VarG;
        }
        throw new z78();
    }

    public final Object clone() {
        ct3 ct3VarH = h();
        ct3VarH.i(g());
        return ct3VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        dt3 dt3Var = null;
        try {
            try {
                dt3.w.getClass();
                i(new dt3(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                dt3 dt3Var2 = (dt3) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    dt3Var = dt3Var2;
                    if (dt3Var != null) {
                        i(dt3Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (dt3Var != null) {
                i(dt3Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        i((dt3) oy2Var);
        return this;
    }

    public final dt3 g() {
        dt3 dt3Var = new dt3(this);
        int i = this.n;
        int i2 = (i & 1) != 1 ? 0 : 1;
        dt3Var.f653o = this.f556o;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        dt3Var.p = this.p;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        dt3Var.q = this.q;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        dt3Var.r = this.r;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        dt3Var.s = this.s;
        dt3Var.n = i2;
        return dt3Var;
    }

    public final void i(dt3 dt3Var) {
        bt3 bt3Var;
        bt3 bt3Var2;
        bt3 bt3Var3;
        bt3 bt3Var4;
        at3 at3Var;
        if (dt3Var == dt3.v) {
            return;
        }
        if ((dt3Var.n & 1) == 1) {
            at3 at3Var2 = dt3Var.f653o;
            if ((this.n & 1) != 1 || (at3Var = this.f556o) == at3.s) {
                this.f556o = at3Var2;
            } else {
                zs3 zs3Var = new zs3((byte) 0);
                zs3Var.i(at3Var);
                zs3Var.i(at3Var2);
                this.f556o = zs3Var.g();
            }
            this.n |= 1;
        }
        if ((dt3Var.n & 2) == 2) {
            bt3 bt3Var5 = dt3Var.p;
            if ((this.n & 2) != 2 || (bt3Var4 = this.p) == bt3.s) {
                this.p = bt3Var5;
            } else {
                zs3 zs3VarI = bt3.i(bt3Var4);
                zs3VarI.j(bt3Var5);
                this.p = zs3VarI.h();
            }
            this.n |= 2;
        }
        if ((dt3Var.n & 4) == 4) {
            bt3 bt3Var6 = dt3Var.q;
            if ((this.n & 4) != 4 || (bt3Var3 = this.q) == bt3.s) {
                this.q = bt3Var6;
            } else {
                zs3 zs3VarI2 = bt3.i(bt3Var3);
                zs3VarI2.j(bt3Var6);
                this.q = zs3VarI2.h();
            }
            this.n |= 4;
        }
        if ((dt3Var.n & 8) == 8) {
            bt3 bt3Var7 = dt3Var.r;
            if ((this.n & 8) != 8 || (bt3Var2 = this.r) == bt3.s) {
                this.r = bt3Var7;
            } else {
                zs3 zs3VarI3 = bt3.i(bt3Var2);
                zs3VarI3.j(bt3Var7);
                this.r = zs3VarI3.h();
            }
            this.n |= 8;
        }
        if ((dt3Var.n & 16) == 16) {
            bt3 bt3Var8 = dt3Var.s;
            if ((this.n & 16) != 16 || (bt3Var = this.s) == bt3.s) {
                this.s = bt3Var8;
            } else {
                zs3 zs3VarI4 = bt3.i(bt3Var);
                zs3VarI4.j(bt3Var8);
                this.s = zs3VarI4.h();
            }
            this.n |= 16;
        }
        this.m = this.m.b(dt3Var.m);
    }
}
