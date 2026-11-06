package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yu5 extends fy2 implements rq4 {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public zu5 f2644o;
    public List p;
    public gv5 q;
    public av5 r;

    public static yu5 h() {
        yu5 yu5Var = new yu5();
        yu5Var.f2644o = zu5.RETURNS_CONSTANT;
        yu5Var.p = Collections.EMPTY_LIST;
        yu5Var.q = gv5.x;
        yu5Var.r = av5.AT_MOST_ONCE;
        return yu5Var;
    }

    @Override // o.fy2
    public final t1 c() {
        bv5 bv5VarG = g();
        if (bv5VarG.a()) {
            return bv5VarG;
        }
        throw new z78();
    }

    public final Object clone() {
        yu5 yu5VarH = h();
        yu5VarH.i(g());
        return yu5VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        bv5 bv5Var = null;
        try {
            try {
                bv5.v.getClass();
                i(new bv5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                bv5 bv5Var2 = (bv5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bv5Var = bv5Var2;
                    if (bv5Var != null) {
                        i(bv5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (bv5Var != null) {
                i(bv5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        i((bv5) oy2Var);
        return this;
    }

    public final bv5 g() {
        bv5 bv5Var = new bv5(this);
        int i = this.n;
        int i2 = (i & 1) != 1 ? 0 : 1;
        bv5Var.f459o = this.f2644o;
        if ((i & 2) == 2) {
            this.p = Collections.unmodifiableList(this.p);
            this.n &= -3;
        }
        bv5Var.p = this.p;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        bv5Var.q = this.q;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        bv5Var.r = this.r;
        bv5Var.n = i2;
        return bv5Var;
    }

    public final void i(bv5 bv5Var) {
        gv5 gv5Var;
        if (bv5Var == bv5.u) {
            return;
        }
        if ((bv5Var.n & 1) == 1) {
            zu5 zu5Var = bv5Var.f459o;
            zu5Var.getClass();
            this.n = 1 | this.n;
            this.f2644o = zu5Var;
        }
        if (!bv5Var.p.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p = bv5Var.p;
                this.n &= -3;
            } else {
                if ((this.n & 2) != 2) {
                    this.p = new ArrayList(this.p);
                    this.n |= 2;
                }
                this.p.addAll(bv5Var.p);
            }
        }
        if ((bv5Var.n & 2) == 2) {
            gv5 gv5Var2 = bv5Var.q;
            if ((this.n & 4) != 4 || (gv5Var = this.q) == gv5.x) {
                this.q = gv5Var2;
            } else {
                ev5 ev5VarH = ev5.h();
                ev5VarH.i(gv5Var);
                ev5VarH.i(gv5Var2);
                this.q = ev5VarH.g();
            }
            this.n |= 4;
        }
        if ((bv5Var.n & 4) == 4) {
            av5 av5Var = bv5Var.r;
            av5Var.getClass();
            this.n |= 8;
            this.r = av5Var;
        }
        this.m = this.m.b(bv5Var.m);
    }
}
