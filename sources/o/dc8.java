package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dc8 extends cc8 {
    public final String m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f609o;
    public final sb0 p;
    public final float q;
    public final sb0 r;
    public final float s;
    public final float t;
    public final int u;
    public final int v;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public dc8(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, String str, List list, sb0 sb0Var, sb0 sb0Var2) {
        this.m = str;
        this.n = list;
        this.f609o = i;
        this.p = sb0Var;
        this.q = f;
        this.r = sb0Var2;
        this.s = f2;
        this.t = f3;
        this.u = i2;
        this.v = i3;
        this.w = f4;
        this.x = f5;
        this.y = f6;
        this.z = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dc8.class != obj.getClass()) {
            return false;
        }
        dc8 dc8Var = (dc8) obj;
        return this.m.equals(dc8Var.m) && im3.n(this.p, dc8Var.p) && this.q == dc8Var.q && im3.n(this.r, dc8Var.r) && this.s == dc8Var.s && this.t == dc8Var.t && this.u == dc8Var.u && this.v == dc8Var.v && this.w == dc8Var.w && this.x == dc8Var.x && this.y == dc8Var.y && this.z == dc8Var.z && this.f609o == dc8Var.f609o && im3.n(this.n, dc8Var.n);
    }

    public final int hashCode() {
        int iG = to7.g(this.n, this.m.hashCode() * 31, 31);
        sb0 sb0Var = this.p;
        int iE = e41.e(this.q, (iG + (sb0Var != null ? sb0Var.hashCode() : 0)) * 31, 31);
        sb0 sb0Var2 = this.r;
        return Integer.hashCode(this.f609o) + e41.e(this.z, e41.e(this.y, e41.e(this.x, e41.e(this.w, fx3.a(this.v, fx3.a(this.u, e41.e(this.t, e41.e(this.s, (iE + (sb0Var2 != null ? sb0Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
