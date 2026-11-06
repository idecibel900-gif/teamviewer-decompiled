package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gs8 extends as8 {
    public final transient is8 p;
    public final transient hs8 q;

    public gs8(is8 is8Var, hs8 hs8Var) {
        this.p = is8Var;
        this.q = hs8Var;
    }

    @Override // o.lr8
    public final int a(Object[] objArr) {
        return this.q.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.p.get(obj) != null;
    }

    @Override // o.as8, o.lr8
    public final yr8 d() {
        return this.q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.q.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.p.r;
    }
}
