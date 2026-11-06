package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lv5 extends jy2 {
    public int p;
    public List q;
    public List r;
    public List s;
    public gw5 t;
    public nw5 u;

    public static lv5 i() {
        lv5 lv5Var = new lv5();
        List list = Collections.EMPTY_LIST;
        lv5Var.q = list;
        lv5Var.r = list;
        lv5Var.s = list;
        lv5Var.t = gw5.s;
        lv5Var.u = nw5.q;
        return lv5Var;
    }

    @Override // o.fy2
    public final t1 c() {
        mv5 mv5VarH = h();
        if (mv5VarH.a()) {
            return mv5VarH;
        }
        throw new z78();
    }

    public final Object clone() {
        lv5 lv5VarI = i();
        lv5VarI.j(h());
        return lv5VarI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        mv5 mv5Var = null;
        try {
            try {
                mv5.x.getClass();
                j(new mv5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                mv5 mv5Var2 = (mv5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    mv5Var = mv5Var2;
                    if (mv5Var != null) {
                        j(mv5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (mv5Var != null) {
                j(mv5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        j((mv5) oy2Var);
        return this;
    }

    public final mv5 h() {
        int i;
        mv5 mv5Var = new mv5(this);
        int i2 = this.p;
        if ((i2 & 1) == 1) {
            this.q = Collections.unmodifiableList(this.q);
            i = this.p & (-2);
            this.p = i;
        } else {
            i = i2;
        }
        mv5Var.p = this.q;
        if ((i & 2) == 2) {
            this.r = Collections.unmodifiableList(this.r);
            i = this.p & (-3);
            this.p = i;
        }
        mv5Var.q = this.r;
        if ((i & 4) == 4) {
            this.s = Collections.unmodifiableList(this.s);
            this.p &= -5;
        }
        mv5Var.r = this.s;
        int i3 = (i2 & 8) != 8 ? 0 : 1;
        mv5Var.s = this.t;
        if ((i2 & 16) == 16) {
            i3 |= 2;
        }
        mv5Var.t = this.u;
        mv5Var.f1515o = i3;
        return mv5Var;
    }

    public final void j(mv5 mv5Var) {
        nw5 nw5Var;
        gw5 gw5Var;
        if (mv5Var == mv5.w) {
            return;
        }
        if (!mv5Var.p.isEmpty()) {
            if (this.q.isEmpty()) {
                this.q = mv5Var.p;
                this.p &= -2;
            } else {
                if ((this.p & 1) != 1) {
                    this.q = new ArrayList(this.q);
                    this.p |= 1;
                }
                this.q.addAll(mv5Var.p);
            }
        }
        if (!mv5Var.q.isEmpty()) {
            if (this.r.isEmpty()) {
                this.r = mv5Var.q;
                this.p &= -3;
            } else {
                if ((this.p & 2) != 2) {
                    this.r = new ArrayList(this.r);
                    this.p |= 2;
                }
                this.r.addAll(mv5Var.q);
            }
        }
        if (!mv5Var.r.isEmpty()) {
            if (this.s.isEmpty()) {
                this.s = mv5Var.r;
                this.p &= -5;
            } else {
                if ((this.p & 4) != 4) {
                    this.s = new ArrayList(this.s);
                    this.p |= 4;
                }
                this.s.addAll(mv5Var.r);
            }
        }
        if ((mv5Var.f1515o & 1) == 1) {
            gw5 gw5Var2 = mv5Var.s;
            if ((this.p & 8) != 8 || (gw5Var = this.t) == gw5.s) {
                this.t = gw5Var2;
            } else {
                pu5 pu5VarI = gw5.i(gw5Var);
                pu5VarI.l(gw5Var2);
                this.t = pu5VarI.i();
            }
            this.p |= 8;
        }
        if ((mv5Var.f1515o & 2) == 2) {
            nw5 nw5Var2 = mv5Var.t;
            if ((this.p & 16) != 16 || (nw5Var = this.u) == nw5.q) {
                this.u = nw5Var2;
            } else {
                wu5 wu5Var = new wu5((byte) 2);
                wu5Var.p = Collections.EMPTY_LIST;
                wu5Var.n(nw5Var);
                wu5Var.n(nw5Var2);
                this.u = wu5Var.j();
            }
            this.p |= 16;
        }
        g(mv5Var);
        this.m = this.m.b(mv5Var.n);
    }
}
