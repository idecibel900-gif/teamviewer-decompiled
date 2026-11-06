package o;

/* JADX INFO: loaded from: classes2.dex */
public final class rv5 extends fy2 implements rq4 {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1957o;
    public int p;
    public sv5 q;

    @Override // o.fy2
    public final t1 c() {
        tv5 tv5VarG = g();
        if (tv5VarG.a()) {
            return tv5VarG;
        }
        throw new z78();
    }

    public final Object clone() {
        rv5 rv5Var = new rv5();
        rv5Var.f1957o = -1;
        rv5Var.q = sv5.PACKAGE;
        rv5Var.h(g());
        return rv5Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        tv5 tv5Var = null;
        try {
            try {
                tv5.u.getClass();
                h(new tv5(vu0Var));
                return this;
            } catch (rm3 e) {
                tv5 tv5Var2 = (tv5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    tv5Var = tv5Var2;
                    if (tv5Var != null) {
                        h(tv5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (tv5Var != null) {
                h(tv5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        h((tv5) oy2Var);
        return this;
    }

    public final tv5 g() {
        tv5 tv5Var = new tv5(this);
        int i = this.n;
        int i2 = (i & 1) != 1 ? 0 : 1;
        tv5Var.f2148o = this.f1957o;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        tv5Var.p = this.p;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        tv5Var.q = this.q;
        tv5Var.n = i2;
        return tv5Var;
    }

    public final void h(tv5 tv5Var) {
        if (tv5Var == tv5.t) {
            return;
        }
        int i = tv5Var.n;
        if ((i & 1) == 1) {
            int i2 = tv5Var.f2148o;
            this.n = 1 | this.n;
            this.f1957o = i2;
        }
        if ((i & 2) == 2) {
            int i3 = tv5Var.p;
            this.n = 2 | this.n;
            this.p = i3;
        }
        if ((i & 4) == 4) {
            sv5 sv5Var = tv5Var.q;
            sv5Var.getClass();
            this.n = 4 | this.n;
            this.q = sv5Var;
        }
        this.m = this.m.b(tv5Var.m);
    }
}
