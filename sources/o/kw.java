package o;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kw extends v1 {
    public static final Object[] p = new Object[0];
    public int m;
    public Object[] n = p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1309o;

    @Override // o.v1
    public final int a() {
        return this.f1309o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f1309o;
        if (i < 0 || i > i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        l();
        d(this.f1309o + 1);
        int iK = k(this.m + i);
        int i3 = this.f1309o;
        if (i < ((i3 + 1) >> 1)) {
            int length = iK == 0 ? this.n.length - 1 : iK - 1;
            int i4 = this.m;
            int length2 = i4 == 0 ? this.n.length - 1 : i4 - 1;
            Object[] objArr = this.n;
            if (length >= i4) {
                objArr[length2] = objArr[i4];
                cx.G0(i4, i4 + 1, length + 1, objArr, objArr);
            } else {
                cx.G0(i4 - 1, i4, objArr.length, objArr, objArr);
                Object[] objArr2 = this.n;
                objArr2[objArr2.length - 1] = objArr2[0];
                cx.G0(0, 1, length + 1, objArr2, objArr2);
            }
            this.n[length] = obj;
            this.m = length2;
        } else {
            int iK2 = k(i3 + this.m);
            Object[] objArr3 = this.n;
            if (iK < iK2) {
                cx.G0(iK + 1, iK, iK2, objArr3, objArr3);
            } else {
                cx.G0(1, 0, iK2, objArr3, objArr3);
                Object[] objArr4 = this.n;
                objArr4[0] = objArr4[objArr4.length - 1];
                cx.G0(iK + 1, iK, objArr4.length - 1, objArr4, objArr4);
            }
            this.n[iK] = obj;
        }
        this.f1309o++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.f1309o;
        if (i < 0 || i > i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f1309o) {
            return addAll(collection);
        }
        l();
        d(collection.size() + this.f1309o);
        int iK = k(this.f1309o + this.m);
        int iK2 = k(this.m + i);
        int size = collection.size();
        if (i >= ((this.f1309o + 1) >> 1)) {
            int i3 = iK2 + size;
            Object[] objArr = this.n;
            if (iK2 < iK) {
                int i4 = size + iK;
                if (i4 <= objArr.length) {
                    cx.G0(i3, iK2, iK, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    cx.G0(i3 - objArr.length, iK2, iK, objArr, objArr);
                } else {
                    int length = iK - (i4 - objArr.length);
                    cx.G0(0, length, iK, objArr, objArr);
                    Object[] objArr2 = this.n;
                    cx.G0(i3, iK2, length, objArr2, objArr2);
                }
            } else {
                cx.G0(size, 0, iK, objArr, objArr);
                Object[] objArr3 = this.n;
                if (i3 >= objArr3.length) {
                    cx.G0(i3 - objArr3.length, iK2, objArr3.length, objArr3, objArr3);
                } else {
                    cx.G0(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.n;
                    cx.G0(i3, iK2, objArr4.length - size, objArr4, objArr4);
                }
            }
            c(iK2, collection);
            return true;
        }
        int i5 = this.m;
        int length2 = i5 - size;
        Object[] objArr5 = this.n;
        if (iK2 < i5) {
            cx.G0(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.n;
            if (size >= iK2) {
                cx.G0(objArr6.length - size, 0, iK2, objArr6, objArr6);
            } else {
                cx.G0(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.n;
                cx.G0(0, size, iK2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            cx.G0(length2, i5, iK2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iK2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                cx.G0(length2, i5, iK2, objArr5, objArr5);
            } else {
                cx.G0(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.n;
                cx.G0(0, this.m + length3, iK2, objArr8, objArr8);
            }
        }
        this.m = length2;
        c(h(iK2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        l();
        d(this.f1309o + 1);
        int length = this.m;
        if (length == 0) {
            length = this.n.length;
        }
        int i = length - 1;
        this.m = i;
        this.n[i] = obj;
        this.f1309o++;
    }

    public final void addLast(Object obj) {
        l();
        d(this.f1309o + 1);
        this.n[k(this.f1309o + this.m)] = obj;
        this.f1309o++;
    }

    @Override // o.v1
    public final Object b(int i) {
        int i2 = this.f1309o;
        if (i < 0 || i >= i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        l();
        int iK = k(this.m + i);
        Object[] objArr = this.n;
        Object obj = objArr[iK];
        int i3 = this.f1309o >> 1;
        int i4 = this.m;
        if (i < i3) {
            if (iK >= i4) {
                cx.G0(i4 + 1, i4, iK, objArr, objArr);
            } else {
                cx.G0(1, 0, iK, objArr, objArr);
                Object[] objArr2 = this.n;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.m;
                cx.G0(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.n;
            int i6 = this.m;
            objArr3[i6] = null;
            this.m = f(i6);
        } else {
            int iK2 = k((a() - 1) + i4);
            Object[] objArr4 = this.n;
            if (iK <= iK2) {
                cx.G0(iK, iK + 1, iK2 + 1, objArr4, objArr4);
            } else {
                cx.G0(iK, iK + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.n;
                objArr5[objArr5.length - 1] = objArr5[0];
                cx.G0(0, 1, iK2 + 1, objArr5, objArr5);
            }
            this.n[iK2] = null;
        }
        this.f1309o--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.n.length;
        while (i < length && it.hasNext()) {
            this.n[i] = it.next();
            i++;
        }
        int i2 = this.m;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.n[i3] = it.next();
        }
        this.f1309o = collection.size() + this.f1309o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            l();
            i(this.m, k(this.f1309o + this.m));
        }
        this.m = 0;
        this.f1309o = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            hk0.l("Deque is too big.");
            return;
        }
        Object[] objArr = this.n;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == p) {
            if (i < 10) {
                i = 10;
            }
            this.n = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        cx.G0(0, this.m, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.n;
        int length2 = objArr3.length;
        int i3 = this.m;
        cx.G0(length2 - i3, 0, i3, objArr3, objArr2);
        this.m = 0;
        this.n = objArr2;
    }

    public final int f(int i) {
        if (i == this.n.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.n[k((a() - 1) + this.m)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f1309o;
        if (i >= 0 && i < i2) {
            return this.n[k(this.m + i)];
        }
        hk0.r(ua5.l("index: ", i, i2, ", size: "));
        return null;
    }

    public final int h(int i) {
        return i < 0 ? i + this.n.length : i;
    }

    public final void i(int i, int i2) {
        Object[] objArr = this.n;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.n, 0, i2, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iK = k(this.f1309o + this.m);
        int length = this.m;
        if (length < iK) {
            while (length < iK) {
                if (im3.n(obj, this.n[length])) {
                    i = this.m;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.m) < iK) {
            return -1;
        }
        int length2 = this.n.length;
        while (length < length2) {
            if (im3.n(obj, this.n[length])) {
                i = this.m;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iK; i2++) {
            if (im3.n(obj, this.n[i2])) {
                length = i2 + this.n.length;
                i = this.m;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int k(int i) {
        Object[] objArr = this.n;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void l() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            an4.j("ArrayDeque is empty.");
            return null;
        }
        return this.n[k((a() - 1) + this.m)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iK = k(this.f1309o + this.m);
        int i2 = this.m;
        if (i2 < iK) {
            length = iK - 1;
            if (i2 <= length) {
                while (!im3.n(obj, this.n[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.m;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.m >= iK) {
            do {
                iK--;
                objArr = this.n;
                if (-1 >= iK) {
                    length = objArr.length - 1;
                    int i3 = this.m;
                    if (i3 <= length) {
                        while (!im3.n(obj, this.n[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.m;
                    }
                }
                return length - i;
            } while (!im3.n(obj, objArr[iK]));
            length = iK + this.n.length;
            i = this.m;
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iK;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.n.length != 0) {
            int iK2 = k(this.f1309o + this.m);
            int i = this.m;
            if (i < iK2) {
                iK = i;
                while (true) {
                    objArr = this.n;
                    if (i >= iK2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.n[iK] = obj;
                        iK++;
                    }
                    i++;
                }
                Arrays.fill(objArr, iK, iK2, (Object) null);
            } else {
                int length = this.n.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.n;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.n[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iK = k(i2);
                for (int i3 = 0; i3 < iK2; i3++) {
                    Object[] objArr3 = this.n;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.n[iK] = obj3;
                        iK = f(iK);
                    }
                }
                z = z2;
            }
            if (z) {
                l();
                this.f1309o = h(iK - this.m);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            an4.j("ArrayDeque is empty.");
            return null;
        }
        l();
        Object[] objArr = this.n;
        int i = this.m;
        Object obj = objArr[i];
        objArr[i] = null;
        this.m = f(i);
        this.f1309o--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            an4.j("ArrayDeque is empty.");
            return null;
        }
        l();
        int iK = k((a() - 1) + this.m);
        Object[] objArr = this.n;
        Object obj = objArr[iK];
        objArr[iK] = null;
        this.f1309o--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        g68.k(i, i2, this.f1309o);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f1309o) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        l();
        int i4 = this.f1309o - i2;
        int i5 = this.m;
        int i6 = this.m;
        if (i < i4) {
            int iK = k((i - 1) + i5);
            int iK2 = k((i2 - 1) + i6);
            while (i > 0) {
                int i7 = iK + 1;
                int iMin = Math.min(i, Math.min(i7, iK2 + 1));
                Object[] objArr = this.n;
                int i8 = iK2 - iMin;
                int i9 = iK - iMin;
                cx.G0(i8 + 1, i9 + 1, i7, objArr, objArr);
                iK = h(i9);
                iK2 = h(i8);
                i -= iMin;
            }
            int iK3 = k(this.m + i3);
            i(this.m, iK3);
            this.m = iK3;
        } else {
            int iK4 = k(i5 + i2);
            int iK5 = k(i6 + i);
            int i10 = this.f1309o;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.n;
                i2 = Math.min(i10, Math.min(objArr2.length - iK4, objArr2.length - iK5));
                Object[] objArr3 = this.n;
                int i11 = iK4 + i2;
                cx.G0(iK5, iK4, i11, objArr3, objArr3);
                iK4 = k(i11);
                iK5 = k(iK5 + i2);
            }
            int iK6 = k(this.f1309o + this.m);
            i(h(iK6 - i3), iK6);
        }
        this.f1309o -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iK;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.n.length != 0) {
            int iK2 = k(this.f1309o + this.m);
            int i = this.m;
            if (i < iK2) {
                iK = i;
                while (true) {
                    objArr = this.n;
                    if (i >= iK2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.n[iK] = obj;
                        iK++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, iK, iK2, (Object) null);
            } else {
                int length = this.n.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.n;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.n[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iK = k(i2);
                for (int i3 = 0; i3 < iK2; i3++) {
                    Object[] objArr3 = this.n;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.n[iK] = obj3;
                        iK = f(iK);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                l();
                this.f1309o = h(iK - this.m);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f1309o;
        if (i < 0 || i >= i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
            return null;
        }
        int iK = k(this.m + i);
        Object[] objArr = this.n;
        Object obj2 = objArr[iK];
        objArr[iK] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f1309o;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iK = k(this.f1309o + this.m);
        int i2 = this.m;
        if (i2 < iK) {
            cx.J0(i2, iK, 2, this.n, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.n;
            cx.G0(0, this.m, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.n;
            cx.G0(objArr3.length - this.m, 0, iK, objArr3, objArr);
        }
        int i3 = this.f1309o;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        l();
        d(collection.size() + this.f1309o);
        c(k(this.f1309o + this.m), collection);
        return true;
    }
}
