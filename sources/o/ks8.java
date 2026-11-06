package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ks8 extends as8 {
    public final transient Object p;

    public ks8(Object obj) {
        this.p = obj;
    }

    @Override // o.lr8
    public final int a(Object[] objArr) {
        objArr[0] = this.p;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.p.equals(obj);
    }

    @Override // o.as8, o.lr8
    public final yr8 d() {
        Object[] objArr = {this.p};
        for (int i = 0; i < 1; i++) {
            nr8 nr8Var = yr8.n;
            if (objArr[i] == null) {
                yq4.l(fx3.e(i, "at index "));
                return null;
            }
        }
        return yr8.i(1, objArr);
    }

    @Override // o.as8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.p.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new cs8(this.p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return fx3.g("[", this.p.toString(), "]");
    }
}
