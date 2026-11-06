package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ev5 extends fy2 implements rq4 {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f744o;
    public int p;
    public fv5 q;
    public aw5 r;
    public int s;
    public List t;
    public List u;

    public static ev5 h() {
        ev5 ev5Var = new ev5();
        ev5Var.q = fv5.TRUE;
        ev5Var.r = aw5.F;
        List list = Collections.EMPTY_LIST;
        ev5Var.t = list;
        ev5Var.u = list;
        return ev5Var;
    }

    @Override // o.fy2
    public final t1 c() {
        gv5 gv5VarG = g();
        if (gv5VarG.a()) {
            return gv5VarG;
        }
        throw new z78();
    }

    public final Object clone() {
        ev5 ev5VarH = h();
        ev5VarH.i(g());
        return ev5VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        gv5 gv5Var = null;
        try {
            try {
                gv5.y.getClass();
                i(new gv5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                gv5 gv5Var2 = (gv5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    gv5Var = gv5Var2;
                    if (gv5Var != null) {
                        i(gv5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (gv5Var != null) {
                i(gv5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        i((gv5) oy2Var);
        return this;
    }

    public final gv5 g() {
        gv5 gv5Var = new gv5(this);
        int i = this.n;
        int i2 = (i & 1) != 1 ? 0 : 1;
        gv5Var.f927o = this.f744o;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        gv5Var.p = this.p;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        gv5Var.q = this.q;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        gv5Var.r = this.r;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        gv5Var.s = this.s;
        if ((i & 32) == 32) {
            this.t = Collections.unmodifiableList(this.t);
            i = this.n & (-33);
            this.n = i;
        }
        gv5Var.t = this.t;
        if ((i & 64) == 64) {
            this.u = Collections.unmodifiableList(this.u);
            this.n &= -65;
        }
        gv5Var.u = this.u;
        gv5Var.n = i2;
        return gv5Var;
    }

    public final void i(gv5 gv5Var) {
        aw5 aw5Var;
        if (gv5Var == gv5.x) {
            return;
        }
        int i = gv5Var.n;
        if ((i & 1) == 1) {
            int i2 = gv5Var.f927o;
            this.n = 1 | this.n;
            this.f744o = i2;
        }
        if ((i & 2) == 2) {
            int i3 = gv5Var.p;
            this.n = 2 | this.n;
            this.p = i3;
        }
        if ((i & 4) == 4) {
            fv5 fv5Var = gv5Var.q;
            fv5Var.getClass();
            this.n = 4 | this.n;
            this.q = fv5Var;
        }
        if ((gv5Var.n & 8) == 8) {
            aw5 aw5Var2 = gv5Var.r;
            if ((this.n & 8) != 8 || (aw5Var = this.r) == aw5.F) {
                this.r = aw5Var2;
            } else {
                zv5 zv5VarQ = aw5.q(aw5Var);
                zv5VarQ.j(aw5Var2);
                this.r = zv5VarQ.h();
            }
            this.n |= 8;
        }
        if ((gv5Var.n & 16) == 16) {
            int i4 = gv5Var.s;
            this.n = 16 | this.n;
            this.s = i4;
        }
        if (!gv5Var.t.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = gv5Var.t;
                this.n &= -33;
            } else {
                if ((this.n & 32) != 32) {
                    this.t = new ArrayList(this.t);
                    this.n |= 32;
                }
                this.t.addAll(gv5Var.t);
            }
        }
        if (!gv5Var.u.isEmpty()) {
            if (this.u.isEmpty()) {
                this.u = gv5Var.u;
                this.n &= -65;
            } else {
                if ((this.n & 64) != 64) {
                    this.u = new ArrayList(this.u);
                    this.n |= 64;
                }
                this.u.addAll(gv5Var.u);
            }
        }
        this.m = this.m.b(gv5Var.m);
    }
}
