package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ft3 extends fy2 implements rq4 {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f828o;
    public int p;
    public Object q;
    public gt3 r;
    public List s;
    public List t;

    public static ft3 h() {
        ft3 ft3Var = new ft3();
        ft3Var.f828o = 1;
        ft3Var.q = "";
        ft3Var.r = gt3.NONE;
        List list = Collections.EMPTY_LIST;
        ft3Var.s = list;
        ft3Var.t = list;
        return ft3Var;
    }

    @Override // o.fy2
    public final t1 c() {
        ht3 ht3VarG = g();
        if (ht3VarG.a()) {
            return ht3VarG;
        }
        throw new z78();
    }

    public final Object clone() {
        ft3 ft3VarH = h();
        ft3VarH.i(g());
        return ft3VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        ht3 ht3Var = null;
        try {
            try {
                ht3.z.getClass();
                i(new ht3(vu0Var));
                return this;
            } catch (rm3 e) {
                ht3 ht3Var2 = (ht3) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ht3Var = ht3Var2;
                    if (ht3Var != null) {
                        i(ht3Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ht3Var != null) {
                i(ht3Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        i((ht3) oy2Var);
        return this;
    }

    public final ht3 g() {
        ht3 ht3Var = new ht3(this);
        int i = this.n;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ht3Var.f1007o = this.f828o;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ht3Var.p = this.p;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ht3Var.q = this.q;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ht3Var.r = this.r;
        if ((i & 16) == 16) {
            this.s = Collections.unmodifiableList(this.s);
            i = this.n & (-17);
            this.n = i;
        }
        ht3Var.s = this.s;
        if ((i & 32) == 32) {
            this.t = Collections.unmodifiableList(this.t);
            this.n &= -33;
        }
        ht3Var.u = this.t;
        ht3Var.n = i2;
        return ht3Var;
    }

    public final void i(ht3 ht3Var) {
        if (ht3Var == ht3.y) {
            return;
        }
        int i = ht3Var.n;
        if ((i & 1) == 1) {
            int i2 = ht3Var.f1007o;
            this.n = 1 | this.n;
            this.f828o = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ht3Var.p;
            this.n = 2 | this.n;
            this.p = i3;
        }
        if ((i & 4) == 4) {
            this.n |= 4;
            this.q = ht3Var.q;
        }
        if ((i & 8) == 8) {
            gt3 gt3Var = ht3Var.r;
            gt3Var.getClass();
            this.n = 8 | this.n;
            this.r = gt3Var;
        }
        if (!ht3Var.s.isEmpty()) {
            if (this.s.isEmpty()) {
                this.s = ht3Var.s;
                this.n &= -17;
            } else {
                if ((this.n & 16) != 16) {
                    this.s = new ArrayList(this.s);
                    this.n |= 16;
                }
                this.s.addAll(ht3Var.s);
            }
        }
        if (!ht3Var.u.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = ht3Var.u;
                this.n &= -33;
            } else {
                if ((this.n & 32) != 32) {
                    this.t = new ArrayList(this.t);
                    this.n |= 32;
                }
                this.t.addAll(ht3Var.u);
            }
        }
        this.m = this.m.b(ht3Var.m);
    }
}
