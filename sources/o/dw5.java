package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dw5 extends jy2 {
    public int p;
    public int q;
    public int r;
    public boolean s;
    public ew5 t;
    public List u;
    public List v;

    @Override // o.fy2
    public final t1 c() {
        fw5 fw5VarH = h();
        if (fw5VarH.a()) {
            return fw5VarH;
        }
        throw new z78();
    }

    public final Object clone() {
        dw5 dw5Var = new dw5();
        dw5Var.t = ew5.INV;
        List list = Collections.EMPTY_LIST;
        dw5Var.u = list;
        dw5Var.v = list;
        dw5Var.i(h());
        return dw5Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        fw5 fw5Var = null;
        try {
            try {
                fw5.z.getClass();
                i(new fw5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                fw5 fw5Var2 = (fw5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    fw5Var = fw5Var2;
                    if (fw5Var != null) {
                        i(fw5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (fw5Var != null) {
                i(fw5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        i((fw5) oy2Var);
        return this;
    }

    public final fw5 h() {
        fw5 fw5Var = new fw5(this);
        int i = this.p;
        int i2 = (i & 1) != 1 ? 0 : 1;
        fw5Var.p = this.q;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        fw5Var.q = this.r;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        fw5Var.r = this.s;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        fw5Var.s = this.t;
        if ((i & 16) == 16) {
            this.u = Collections.unmodifiableList(this.u);
            i = this.p & (-17);
            this.p = i;
        }
        fw5Var.t = this.u;
        if ((i & 32) == 32) {
            this.v = Collections.unmodifiableList(this.v);
            this.p &= -33;
        }
        fw5Var.u = this.v;
        fw5Var.f835o = i2;
        return fw5Var;
    }

    public final void i(fw5 fw5Var) {
        if (fw5Var == fw5.y) {
            return;
        }
        int i = fw5Var.f835o;
        if ((i & 1) == 1) {
            int i2 = fw5Var.p;
            this.p = 1 | this.p;
            this.q = i2;
        }
        if ((i & 2) == 2) {
            int i3 = fw5Var.q;
            this.p = 2 | this.p;
            this.r = i3;
        }
        if ((i & 4) == 4) {
            boolean z = fw5Var.r;
            this.p = 4 | this.p;
            this.s = z;
        }
        if ((i & 8) == 8) {
            ew5 ew5Var = fw5Var.s;
            ew5Var.getClass();
            this.p = 8 | this.p;
            this.t = ew5Var;
        }
        if (!fw5Var.t.isEmpty()) {
            if (this.u.isEmpty()) {
                this.u = fw5Var.t;
                this.p &= -17;
            } else {
                if ((this.p & 16) != 16) {
                    this.u = new ArrayList(this.u);
                    this.p |= 16;
                }
                this.u.addAll(fw5Var.t);
            }
        }
        if (!fw5Var.u.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = fw5Var.u;
                this.p &= -33;
            } else {
                if ((this.p & 32) != 32) {
                    this.v = new ArrayList(this.v);
                    this.p |= 32;
                }
                this.v.addAll(fw5Var.u);
            }
        }
        g(fw5Var);
        this.m = this.m.b(fw5Var.n);
    }
}
