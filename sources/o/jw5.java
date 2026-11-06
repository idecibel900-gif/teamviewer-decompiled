package o;

/* JADX INFO: loaded from: classes2.dex */
public final class jw5 extends fy2 implements rq4 {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1207o;
    public int p;
    public kw5 q;
    public int r;
    public int s;
    public lw5 t;

    @Override // o.fy2
    public final t1 c() {
        mw5 mw5VarG = g();
        if (mw5VarG.a()) {
            return mw5VarG;
        }
        throw new z78();
    }

    public final Object clone() {
        jw5 jw5Var = new jw5();
        jw5Var.q = kw5.ERROR;
        jw5Var.t = lw5.LANGUAGE_VERSION;
        jw5Var.h(g());
        return jw5Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        mw5 mw5Var = null;
        try {
            try {
                mw5.x.getClass();
                h(new mw5(vu0Var));
                return this;
            } catch (rm3 e) {
                mw5 mw5Var2 = (mw5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    mw5Var = mw5Var2;
                    if (mw5Var != null) {
                        h(mw5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (mw5Var != null) {
                h(mw5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        h((mw5) oy2Var);
        return this;
    }

    public final mw5 g() {
        mw5 mw5Var = new mw5(this);
        int i = this.n;
        int i2 = (i & 1) != 1 ? 0 : 1;
        mw5Var.f1519o = this.f1207o;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        mw5Var.p = this.p;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        mw5Var.q = this.q;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        mw5Var.r = this.r;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        mw5Var.s = this.s;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        mw5Var.t = this.t;
        mw5Var.n = i2;
        return mw5Var;
    }

    public final void h(mw5 mw5Var) {
        if (mw5Var == mw5.w) {
            return;
        }
        int i = mw5Var.n;
        if ((i & 1) == 1) {
            int i2 = mw5Var.f1519o;
            this.n = 1 | this.n;
            this.f1207o = i2;
        }
        if ((i & 2) == 2) {
            int i3 = mw5Var.p;
            this.n = 2 | this.n;
            this.p = i3;
        }
        if ((i & 4) == 4) {
            kw5 kw5Var = mw5Var.q;
            kw5Var.getClass();
            this.n = 4 | this.n;
            this.q = kw5Var;
        }
        int i4 = mw5Var.n;
        if ((i4 & 8) == 8) {
            int i5 = mw5Var.r;
            this.n = 8 | this.n;
            this.r = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = mw5Var.s;
            this.n = 16 | this.n;
            this.s = i6;
        }
        if ((i4 & 32) == 32) {
            lw5 lw5Var = mw5Var.t;
            lw5Var.getClass();
            this.n = 32 | this.n;
            this.t = lw5Var;
        }
        this.m = this.m.b(mw5Var.m);
    }
}
