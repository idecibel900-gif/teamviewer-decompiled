package o;

/* JADX INFO: loaded from: classes2.dex */
public final class wv5 extends fy2 implements rq4 {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public xv5 f2450o;
    public aw5 p;
    public int q;

    @Override // o.fy2
    public final t1 c() {
        yv5 yv5VarG = g();
        if (yv5VarG.a()) {
            return yv5VarG;
        }
        throw new z78();
    }

    public final Object clone() {
        wv5 wv5Var = new wv5();
        wv5Var.f2450o = xv5.INV;
        wv5Var.p = aw5.F;
        wv5Var.h(g());
        return wv5Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        yv5 yv5Var = null;
        try {
            try {
                yv5.u.getClass();
                h(new yv5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                yv5 yv5Var2 = (yv5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    yv5Var = yv5Var2;
                    if (yv5Var != null) {
                        h(yv5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (yv5Var != null) {
                h(yv5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        h((yv5) oy2Var);
        return this;
    }

    public final yv5 g() {
        yv5 yv5Var = new yv5(this);
        int i = this.n;
        int i2 = (i & 1) != 1 ? 0 : 1;
        yv5Var.f2647o = this.f2450o;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        yv5Var.p = this.p;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        yv5Var.q = this.q;
        yv5Var.n = i2;
        return yv5Var;
    }

    public final void h(yv5 yv5Var) {
        aw5 aw5Var;
        if (yv5Var == yv5.t) {
            return;
        }
        if ((yv5Var.n & 1) == 1) {
            xv5 xv5Var = yv5Var.f2647o;
            xv5Var.getClass();
            this.n = 1 | this.n;
            this.f2450o = xv5Var;
        }
        if ((yv5Var.n & 2) == 2) {
            aw5 aw5Var2 = yv5Var.p;
            if ((this.n & 2) != 2 || (aw5Var = this.p) == aw5.F) {
                this.p = aw5Var2;
            } else {
                zv5 zv5VarQ = aw5.q(aw5Var);
                zv5VarQ.j(aw5Var2);
                this.p = zv5VarQ.h();
            }
            this.n |= 2;
        }
        if ((yv5Var.n & 4) == 4) {
            int i = yv5Var.q;
            this.n = 4 | this.n;
            this.q = i;
        }
        this.m = this.m.b(yv5Var.m);
    }
}
