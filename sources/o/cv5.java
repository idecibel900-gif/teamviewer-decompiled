package o;

/* JADX INFO: loaded from: classes2.dex */
public final class cv5 extends jy2 {
    public int p;
    public int q;

    @Override // o.fy2
    public final t1 c() {
        dv5 dv5Var = new dv5(this);
        int i = (this.p & 1) != 1 ? 0 : 1;
        dv5Var.p = this.q;
        dv5Var.f658o = i;
        if (dv5Var.a()) {
            return dv5Var;
        }
        throw new z78();
    }

    public final Object clone() {
        cv5 cv5Var = new cv5();
        dv5 dv5Var = new dv5(this);
        int i = (this.p & 1) != 1 ? 0 : 1;
        dv5Var.p = this.q;
        dv5Var.f658o = i;
        cv5Var.h(dv5Var);
        return cv5Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        dv5 dv5Var = null;
        try {
            try {
                dv5.t.getClass();
                h(new dv5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                dv5 dv5Var2 = (dv5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    dv5Var = dv5Var2;
                    if (dv5Var != null) {
                        h(dv5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (dv5Var != null) {
                h(dv5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        h((dv5) oy2Var);
        return this;
    }

    public final void h(dv5 dv5Var) {
        if (dv5Var == dv5.s) {
            return;
        }
        if ((dv5Var.f658o & 1) == 1) {
            int i = dv5Var.p;
            this.p = 1 | this.p;
            this.q = i;
        }
        g(dv5Var);
        this.m = this.m.b(dv5Var.n);
    }
}
