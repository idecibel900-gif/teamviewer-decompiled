package o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class ra4 extends v1 implements RandomAccess, Serializable {
    public Object[] m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1907o;
    public final ra4 p;
    public final sa4 q;

    public ra4(Object[] objArr, int i, int i2, ra4 ra4Var, sa4 sa4Var) {
        objArr.getClass();
        this.m = objArr;
        this.n = i;
        this.f1907o = i2;
        this.p = ra4Var;
        this.q = sa4Var;
        ((AbstractList) this).modCount = ((AbstractList) sa4Var).modCount;
    }

    @Override // o.v1
    public final int a() {
        g();
        return this.f1907o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i2 = this.f1907o;
        if (i < 0 || i > i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
        } else {
            f(this.n + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        g();
        int i2 = this.f1907o;
        if (i < 0 || i > i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        d(this.n + i, collection, size);
        return size > 0;
    }

    @Override // o.v1
    public final Object b(int i) {
        h();
        g();
        int i2 = this.f1907o;
        if (i >= 0 && i < i2) {
            return i(this.n + i);
        }
        hk0.r(ua5.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        k(this.n, this.f1907o);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        sa4 sa4Var = this.q;
        ra4 ra4Var = this.p;
        if (ra4Var != null) {
            ra4Var.d(i, collection, i2);
        } else {
            sa4 sa4Var2 = sa4.p;
            sa4Var.d(i, collection, i2);
        }
        this.m = sa4Var.m;
        this.f1907o += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.m;
            int i = this.f1907o;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (im3.n(objArr[this.n + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        sa4 sa4Var = this.q;
        ra4 ra4Var = this.p;
        if (ra4Var != null) {
            ra4Var.f(i, obj);
        } else {
            sa4 sa4Var2 = sa4.p;
            sa4Var.f(i, obj);
        }
        this.m = sa4Var.m;
        this.f1907o++;
    }

    public final void g() {
        if (((AbstractList) this.q).modCount == ((AbstractList) this).modCount) {
            return;
        }
        gk0.c();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i2 = this.f1907o;
        if (i >= 0 && i < i2) {
            return this.m[this.n + i];
        }
        hk0.r(ua5.l("index: ", i, i2, ", size: "));
        return null;
    }

    public final void h() {
        if (this.q.f1999o) {
            gk0.u();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.m;
        int i = this.f1907o;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.n + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i) {
        Object objI;
        ((AbstractList) this).modCount++;
        ra4 ra4Var = this.p;
        if (ra4Var != null) {
            objI = ra4Var.i(i);
        } else {
            sa4 sa4Var = sa4.p;
            objI = this.q.i(i);
        }
        this.f1907o--;
        return objI;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.f1907o; i++) {
            if (im3.n(this.m[this.n + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f1907o == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        ra4 ra4Var = this.p;
        if (ra4Var != null) {
            ra4Var.k(i, i2);
        } else {
            sa4 sa4Var = sa4.p;
            this.q.k(i, i2);
        }
        this.f1907o -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        int iL;
        ra4 ra4Var = this.p;
        if (ra4Var != null) {
            iL = ra4Var.l(i, i2, collection, z);
        } else {
            sa4 sa4Var = sa4.p;
            iL = this.q.l(i, i2, collection, z);
        }
        if (iL > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1907o -= iL;
        return iL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.f1907o - 1; i >= 0; i--) {
            if (im3.n(this.m[this.n + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i2 = this.f1907o;
        if (i >= 0 && i <= i2) {
            return new v53(this, i);
        }
        hk0.r(ua5.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return l(this.n, this.f1907o, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return l(this.n, this.f1907o, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i2 = this.f1907o;
        if (i < 0 || i >= i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.m;
        int i3 = this.n;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        g68.k(i, i2, this.f1907o);
        return new ra4(this.m, this.n + i, i2 - i, this, this.q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        g();
        int length = objArr.length;
        int i = this.f1907o;
        Object[] objArr2 = this.m;
        int i2 = this.n;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        cx.G0(0, i2, i + i2, objArr2, objArr);
        int i3 = this.f1907o;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return bt1.S(this.m, this.n, this.f1907o, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.n + this.f1907o, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.m;
        int i = this.f1907o;
        int i2 = this.n;
        return cx.L0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        g();
        int size = collection.size();
        d(this.n + this.f1907o, collection, size);
        return size > 0;
    }
}
