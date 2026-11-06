package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lu5 extends fy2 implements rq4 {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public mu5 f1405o;
    public long p;
    public float q;
    public double r;
    public int s;
    public int t;
    public int u;
    public qu5 v;
    public List w;
    public int x;
    public int y;

    public static lu5 h() {
        lu5 lu5Var = new lu5();
        lu5Var.f1405o = mu5.BYTE;
        lu5Var.v = qu5.s;
        lu5Var.w = Collections.EMPTY_LIST;
        return lu5Var;
    }

    @Override // o.fy2
    public final t1 c() {
        nu5 nu5VarG = g();
        if (nu5VarG.a()) {
            return nu5VarG;
        }
        throw new z78();
    }

    public final Object clone() {
        lu5 lu5VarH = h();
        lu5VarH.i(g());
        return lu5VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        nu5 nu5Var = null;
        try {
            try {
                nu5.C.getClass();
                i(new nu5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                nu5 nu5Var2 = (nu5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    nu5Var = nu5Var2;
                    if (nu5Var != null) {
                        i(nu5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (nu5Var != null) {
                i(nu5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        i((nu5) oy2Var);
        return this;
    }

    public final nu5 g() {
        nu5 nu5Var = new nu5(this);
        int i = this.n;
        int i2 = (i & 1) != 1 ? 0 : 1;
        nu5Var.f1602o = this.f1405o;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        nu5Var.p = this.p;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        nu5Var.q = this.q;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        nu5Var.r = this.r;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        nu5Var.s = this.s;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        nu5Var.t = this.t;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        nu5Var.u = this.u;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        nu5Var.v = this.v;
        if ((i & 256) == 256) {
            this.w = Collections.unmodifiableList(this.w);
            this.n &= -257;
        }
        nu5Var.w = this.w;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        nu5Var.x = this.x;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        nu5Var.y = this.y;
        nu5Var.n = i2;
        return nu5Var;
    }

    public final void i(nu5 nu5Var) {
        qu5 qu5Var;
        if (nu5Var == nu5.B) {
            return;
        }
        if ((nu5Var.n & 1) == 1) {
            mu5 mu5Var = nu5Var.f1602o;
            mu5Var.getClass();
            this.n = 1 | this.n;
            this.f1405o = mu5Var;
        }
        int i = nu5Var.n;
        if ((i & 2) == 2) {
            long j = nu5Var.p;
            this.n |= 2;
            this.p = j;
        }
        if ((i & 4) == 4) {
            float f = nu5Var.q;
            this.n = 4 | this.n;
            this.q = f;
        }
        if ((i & 8) == 8) {
            double d = nu5Var.r;
            this.n |= 8;
            this.r = d;
        }
        if ((i & 16) == 16) {
            int i2 = nu5Var.s;
            this.n = 16 | this.n;
            this.s = i2;
        }
        if ((i & 32) == 32) {
            int i3 = nu5Var.t;
            this.n = 32 | this.n;
            this.t = i3;
        }
        if ((i & 64) == 64) {
            int i4 = nu5Var.u;
            this.n = 64 | this.n;
            this.u = i4;
        }
        if ((i & 128) == 128) {
            qu5 qu5Var2 = nu5Var.v;
            if ((this.n & 128) != 128 || (qu5Var = this.v) == qu5.s) {
                this.v = qu5Var2;
            } else {
                pu5 pu5Var = new pu5((byte) 0);
                pu5Var.p = Collections.EMPTY_LIST;
                pu5Var.k(qu5Var);
                pu5Var.k(qu5Var2);
                this.v = pu5Var.h();
            }
            this.n |= 128;
        }
        if (!nu5Var.w.isEmpty()) {
            if (this.w.isEmpty()) {
                this.w = nu5Var.w;
                this.n &= -257;
            } else {
                if ((this.n & 256) != 256) {
                    this.w = new ArrayList(this.w);
                    this.n |= 256;
                }
                this.w.addAll(nu5Var.w);
            }
        }
        int i5 = nu5Var.n;
        if ((i5 & 256) == 256) {
            int i6 = nu5Var.x;
            this.n |= 512;
            this.x = i6;
        }
        if ((i5 & 512) == 512) {
            int i7 = nu5Var.y;
            this.n |= 1024;
            this.y = i7;
        }
        this.m = this.m.b(nu5Var.m);
    }
}
