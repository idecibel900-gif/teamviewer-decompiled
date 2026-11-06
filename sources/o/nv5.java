package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nv5 extends jy2 {
    public int p;
    public vv5 q;
    public uv5 r;
    public mv5 s;
    public List t;

    public static nv5 i() {
        nv5 nv5Var = new nv5();
        nv5Var.q = vv5.q;
        nv5Var.r = uv5.q;
        nv5Var.s = mv5.w;
        nv5Var.t = Collections.EMPTY_LIST;
        return nv5Var;
    }

    @Override // o.fy2
    public final t1 c() {
        ov5 ov5VarH = h();
        if (ov5VarH.a()) {
            return ov5VarH;
        }
        throw new z78();
    }

    public final Object clone() {
        nv5 nv5VarI = i();
        nv5VarI.j(h());
        return nv5VarI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        ov5 ov5Var = null;
        try {
            try {
                ov5.w.getClass();
                j(new ov5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                ov5 ov5Var2 = (ov5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ov5Var = ov5Var2;
                    if (ov5Var != null) {
                        j(ov5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ov5Var != null) {
                j(ov5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        j((ov5) oy2Var);
        return this;
    }

    public final ov5 h() {
        ov5 ov5Var = new ov5(this);
        int i = this.p;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ov5Var.p = this.q;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ov5Var.q = this.r;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ov5Var.r = this.s;
        if ((i & 8) == 8) {
            this.t = Collections.unmodifiableList(this.t);
            this.p &= -9;
        }
        ov5Var.s = this.t;
        ov5Var.f1682o = i2;
        return ov5Var;
    }

    public final void j(ov5 ov5Var) {
        mv5 mv5Var;
        uv5 uv5Var;
        vv5 vv5Var;
        if (ov5Var == ov5.v) {
            return;
        }
        if ((ov5Var.f1682o & 1) == 1) {
            vv5 vv5Var2 = ov5Var.p;
            if ((this.p & 1) != 1 || (vv5Var = this.q) == vv5.q) {
                this.q = vv5Var2;
            } else {
                wu5 wu5Var = new wu5((byte) 3);
                wu5Var.p = f54.n;
                wu5Var.m(vv5Var);
                wu5Var.m(vv5Var2);
                this.q = wu5Var.i();
            }
            this.p |= 1;
        }
        if ((ov5Var.f1682o & 2) == 2) {
            uv5 uv5Var2 = ov5Var.q;
            if ((this.p & 2) != 2 || (uv5Var = this.r) == uv5.q) {
                this.r = uv5Var2;
            } else {
                wu5 wu5Var2 = new wu5((byte) 1);
                wu5Var2.p = Collections.EMPTY_LIST;
                wu5Var2.l(uv5Var);
                wu5Var2.l(uv5Var2);
                this.r = wu5Var2.h();
            }
            this.p |= 2;
        }
        if ((ov5Var.f1682o & 4) == 4) {
            mv5 mv5Var2 = ov5Var.r;
            if ((this.p & 4) != 4 || (mv5Var = this.s) == mv5.w) {
                this.s = mv5Var2;
            } else {
                lv5 lv5VarI = lv5.i();
                lv5VarI.j(mv5Var);
                lv5VarI.j(mv5Var2);
                this.s = lv5VarI.h();
            }
            this.p |= 4;
        }
        if (!ov5Var.s.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = ov5Var.s;
                this.p &= -9;
            } else {
                if ((this.p & 8) != 8) {
                    this.t = new ArrayList(this.t);
                    this.p |= 8;
                }
                this.t.addAll(ov5Var.s);
            }
        }
        g(ov5Var);
        this.m = this.m.b(ov5Var.n);
    }
}
