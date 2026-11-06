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
public final class sa4 extends v1 implements RandomAccess, Serializable {
    public static final sa4 p;
    public Object[] m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1999o;

    static {
        sa4 sa4Var = new sa4(0);
        sa4Var.f1999o = true;
        p = sa4Var;
    }

    public sa4(int i) {
        if (i >= 0) {
            this.m = new Object[i];
        } else {
            hk0.g("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // o.v1
    public final int a() {
        return this.n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        int i2 = this.n;
        if (i < 0 || i > i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.m[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        int i2 = this.n;
        if (i < 0 || i > i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        d(i, collection, size);
        return size > 0;
    }

    @Override // o.v1
    public final Object b(int i) {
        g();
        int i2 = this.n;
        if (i >= 0 && i < i2) {
            return i(i);
        }
        hk0.r(ua5.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        k(0, this.n);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        h(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.m[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.m;
            int i = this.n;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (im3.n(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.m[i] = obj;
    }

    public final void g() {
        if (this.f1999o) {
            gk0.u();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.n;
        if (i >= 0 && i < i2) {
            return this.m[i];
        }
        hk0.r(ua5.l("index: ", i, i2, ", size: "));
        return null;
    }

    public final void h(int i, int i2) {
        int i3 = this.n + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrCopyOf = this.m;
        if (i3 > objArrCopyOf.length) {
            int length = objArrCopyOf.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            this.m = objArrCopyOf;
        }
        cx.G0(i + i2, i, this.n, objArrCopyOf, objArrCopyOf);
        this.n += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.m;
        int i = this.n;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.m;
        Object obj = objArr[i];
        cx.G0(i, i + 1, this.n, objArr, objArr);
        Object[] objArr2 = this.m;
        int i2 = this.n - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.n--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.n; i++) {
            if (im3.n(this.m[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.n == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.m;
        cx.G0(i, i + i2, this.n, objArr, objArr);
        Object[] objArr2 = this.m;
        int i3 = this.n;
        bt1.M(objArr2, i3 - i2, i3);
        this.n -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.m;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.m;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        cx.G0(i + i4, i2 + i, this.n, objArr, objArr);
        Object[] objArr3 = this.m;
        int i7 = this.n;
        bt1.M(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.n -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (im3.n(this.m[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.n;
        if (i >= 0 && i <= i2) {
            return new v53(this, i);
        }
        hk0.r(ua5.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        g();
        return l(0, this.n, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        return l(0, this.n, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        int i2 = this.n;
        if (i < 0 || i >= i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.m;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        g68.k(i, i2, this.n);
        return new ra4(this.m, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.n;
        Object[] objArr2 = this.m;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        cx.G0(0, 0, i, objArr2, objArr);
        int i2 = this.n;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return bt1.S(this.m, 0, this.n, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.n;
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.m[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return cx.L0(this.m, 0, this.n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        int size = collection.size();
        d(this.n, collection, size);
        return size > 0;
    }
}
