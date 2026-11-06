package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bw5 extends jy2 {
    public int p;
    public int q;
    public int r;
    public List s;
    public aw5 t;
    public int u;
    public aw5 v;
    public int w;
    public List x;
    public List y;

    public static bw5 i() {
        bw5 bw5Var = new bw5();
        bw5Var.q = 6;
        List list = Collections.EMPTY_LIST;
        bw5Var.s = list;
        aw5 aw5Var = aw5.F;
        bw5Var.t = aw5Var;
        bw5Var.v = aw5Var;
        bw5Var.x = list;
        bw5Var.y = list;
        return bw5Var;
    }

    @Override // o.fy2
    public final t1 c() {
        cw5 cw5VarH = h();
        if (cw5VarH.a()) {
            return cw5VarH;
        }
        throw new z78();
    }

    public final Object clone() {
        bw5 bw5VarI = i();
        bw5VarI.j(h());
        return bw5VarI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        cw5 cw5Var = null;
        try {
            try {
                cw5.B.getClass();
                j(new cw5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                cw5 cw5Var2 = (cw5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cw5Var = cw5Var2;
                    if (cw5Var != null) {
                        j(cw5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (cw5Var != null) {
                j(cw5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        j((cw5) oy2Var);
        return this;
    }

    public final cw5 h() {
        int i;
        cw5 cw5Var = new cw5(this);
        int i2 = this.p;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        cw5Var.p = this.q;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        cw5Var.q = this.r;
        if ((i2 & 4) == 4) {
            this.s = Collections.unmodifiableList(this.s);
            i = this.p & (-5);
            this.p = i;
        } else {
            i = i2;
        }
        cw5Var.r = this.s;
        if ((i2 & 8) == 8) {
            i3 |= 4;
        }
        cw5Var.s = this.t;
        if ((i2 & 16) == 16) {
            i3 |= 8;
        }
        cw5Var.t = this.u;
        if ((i2 & 32) == 32) {
            i3 |= 16;
        }
        cw5Var.u = this.v;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        cw5Var.v = this.w;
        if ((i & 128) == 128) {
            this.x = Collections.unmodifiableList(this.x);
            i = this.p & (-129);
            this.p = i;
        }
        cw5Var.w = this.x;
        if ((i & 256) == 256) {
            this.y = Collections.unmodifiableList(this.y);
            this.p &= -257;
        }
        cw5Var.x = this.y;
        cw5Var.f561o = i3;
        return cw5Var;
    }

    public final void j(cw5 cw5Var) {
        aw5 aw5Var;
        aw5 aw5Var2;
        if (cw5Var == cw5.A) {
            return;
        }
        int i = cw5Var.f561o;
        if ((i & 1) == 1) {
            int i2 = cw5Var.p;
            this.p = 1 | this.p;
            this.q = i2;
        }
        if ((i & 2) == 2) {
            int i3 = cw5Var.q;
            this.p = 2 | this.p;
            this.r = i3;
        }
        if (!cw5Var.r.isEmpty()) {
            if (this.s.isEmpty()) {
                this.s = cw5Var.r;
                this.p &= -5;
            } else {
                if ((this.p & 4) != 4) {
                    this.s = new ArrayList(this.s);
                    this.p |= 4;
                }
                this.s.addAll(cw5Var.r);
            }
        }
        if ((cw5Var.f561o & 4) == 4) {
            aw5 aw5Var3 = cw5Var.s;
            if ((this.p & 8) != 8 || (aw5Var2 = this.t) == aw5.F) {
                this.t = aw5Var3;
            } else {
                zv5 zv5VarQ = aw5.q(aw5Var2);
                zv5VarQ.j(aw5Var3);
                this.t = zv5VarQ.h();
            }
            this.p |= 8;
        }
        int i4 = cw5Var.f561o;
        if ((i4 & 8) == 8) {
            int i5 = cw5Var.t;
            this.p |= 16;
            this.u = i5;
        }
        if ((i4 & 16) == 16) {
            aw5 aw5Var4 = cw5Var.u;
            if ((this.p & 32) != 32 || (aw5Var = this.v) == aw5.F) {
                this.v = aw5Var4;
            } else {
                zv5 zv5VarQ2 = aw5.q(aw5Var);
                zv5VarQ2.j(aw5Var4);
                this.v = zv5VarQ2.h();
            }
            this.p |= 32;
        }
        if ((cw5Var.f561o & 32) == 32) {
            int i6 = cw5Var.v;
            this.p |= 64;
            this.w = i6;
        }
        if (!cw5Var.w.isEmpty()) {
            if (this.x.isEmpty()) {
                this.x = cw5Var.w;
                this.p &= -129;
            } else {
                if ((this.p & 128) != 128) {
                    this.x = new ArrayList(this.x);
                    this.p |= 128;
                }
                this.x.addAll(cw5Var.w);
            }
        }
        if (!cw5Var.x.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = cw5Var.x;
                this.p &= -257;
            } else {
                if ((this.p & 256) != 256) {
                    this.y = new ArrayList(this.y);
                    this.p |= 256;
                }
                this.y.addAll(cw5Var.x);
            }
        }
        g(cw5Var);
        this.m = this.m.b(cw5Var.n);
    }
}
