package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ac8 extends cc8 implements Iterable, su3 {
    public final String m;
    public final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f315o;
    public final float p;
    public final float q;
    public final float r;
    public final float s;
    public final float t;
    public final List u;
    public final ArrayList v;

    public ac8(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.m = str;
        this.n = f;
        this.f315o = f2;
        this.p = f3;
        this.q = f4;
        this.r = f5;
        this.s = f6;
        this.t = f7;
        this.u = list;
        this.v = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ac8)) {
            return false;
        }
        ac8 ac8Var = (ac8) obj;
        return im3.n(this.m, ac8Var.m) && this.n == ac8Var.n && this.f315o == ac8Var.f315o && this.p == ac8Var.p && this.q == ac8Var.q && this.r == ac8Var.r && this.s == ac8Var.s && this.t == ac8Var.t && im3.n(this.u, ac8Var.u) && this.v.equals(ac8Var.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + to7.g(this.u, e41.e(this.t, e41.e(this.s, e41.e(this.r, e41.e(this.q, e41.e(this.p, e41.e(this.f315o, e41.e(this.n, this.m.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ek5(this);
    }
}
