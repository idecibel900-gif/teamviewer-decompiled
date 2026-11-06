package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uu5 extends jy2 {
    public int p;
    public int q;
    public List r;
    public List s;

    @Override // o.fy2
    public final t1 c() {
        vu5 vu5VarH = h();
        if (vu5VarH.a()) {
            return vu5VarH;
        }
        throw new z78();
    }

    public final Object clone() {
        uu5 uu5Var = new uu5();
        uu5Var.q = 6;
        List list = Collections.EMPTY_LIST;
        uu5Var.r = list;
        uu5Var.s = list;
        uu5Var.i(h());
        return uu5Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        vu5 vu5Var = null;
        try {
            try {
                vu5.v.getClass();
                i(new vu5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                vu5 vu5Var2 = (vu5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    vu5Var = vu5Var2;
                    if (vu5Var != null) {
                        i(vu5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (vu5Var != null) {
                i(vu5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        i((vu5) oy2Var);
        return this;
    }

    public final vu5 h() {
        vu5 vu5Var = new vu5(this);
        int i = this.p;
        int i2 = (i & 1) != 1 ? 0 : 1;
        vu5Var.p = this.q;
        if ((i & 2) == 2) {
            this.r = Collections.unmodifiableList(this.r);
            i = this.p & (-3);
            this.p = i;
        }
        vu5Var.q = this.r;
        if ((i & 4) == 4) {
            this.s = Collections.unmodifiableList(this.s);
            this.p &= -5;
        }
        vu5Var.r = this.s;
        vu5Var.f2348o = i2;
        return vu5Var;
    }

    public final void i(vu5 vu5Var) {
        if (vu5Var == vu5.u) {
            return;
        }
        if ((vu5Var.f2348o & 1) == 1) {
            int i = vu5Var.p;
            this.p = 1 | this.p;
            this.q = i;
        }
        if (!vu5Var.q.isEmpty()) {
            if (this.r.isEmpty()) {
                this.r = vu5Var.q;
                this.p &= -3;
            } else {
                if ((this.p & 2) != 2) {
                    this.r = new ArrayList(this.r);
                    this.p |= 2;
                }
                this.r.addAll(vu5Var.q);
            }
        }
        if (!vu5Var.r.isEmpty()) {
            if (this.s.isEmpty()) {
                this.s = vu5Var.r;
                this.p &= -5;
            } else {
                if ((this.p & 4) != 4) {
                    this.s = new ArrayList(this.s);
                    this.p |= 4;
                }
                this.s.addAll(vu5Var.r);
            }
        }
        g(vu5Var);
        this.m = this.m.b(vu5Var.n);
    }
}
