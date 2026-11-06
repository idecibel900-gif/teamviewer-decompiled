package o;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ik5 extends v2 implements ef3, Collection, su3 {
    public static final ik5 p;
    public final Object m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final zj5 f1071o;

    static {
        d82 d82Var = d82.B;
        p = new ik5(d82Var, d82Var, zj5.f2711o);
    }

    public ik5(Object obj, Object obj2, zj5 zj5Var) {
        this.m = obj;
        this.n = obj2;
        this.f1071o = zj5Var;
    }

    @Override // o.r0
    public final int a() {
        return this.f1071o.n;
    }

    @Override // o.r0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f1071o.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ry2(this.m, this.f1071o);
    }
}
