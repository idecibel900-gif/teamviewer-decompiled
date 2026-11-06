package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class js8 extends as8 {
    public static final Object[] u;
    public static final js8 v;
    public final transient Object[] p;
    public final transient int q;
    public final transient Object[] r;
    public final transient int s;
    public final transient int t;

    static {
        Object[] objArr = new Object[0];
        u = objArr;
        v = new js8(0, 0, 0, objArr, objArr);
    }

    public js8(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.p = objArr;
        this.q = i;
        this.r = objArr2;
        this.s = i2;
        this.t = i3;
    }

    @Override // o.lr8
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.p;
        int i = this.t;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // o.lr8
    public final int b() {
        return this.t;
    }

    @Override // o.lr8
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.r;
        if (objArr.length == 0) {
            return false;
        }
        int iV = g77.v(obj.hashCode());
        while (true) {
            int i = iV & this.s;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iV = i + 1;
        }
    }

    @Override // o.lr8
    public final Object[] g() {
        return this.p;
    }

    @Override // o.as8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.q;
    }

    @Override // o.as8
    public final yr8 i() {
        return yr8.i(this.t, this.p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.t;
    }
}
