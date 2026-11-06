package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ax implements Collection, Set, tu3, fv3 {
    public int[] m;
    public Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f369o;

    public ax(int i) {
        this.m = j51.m;
        this.n = j51.f1132o;
        if (i > 0) {
            this.m = new int[i];
            this.n = new Object[i];
        }
    }

    public final Object a(int i) {
        int i2 = this.f369o;
        Object[] objArr = this.n;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.m;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                cx.F0(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.n;
                cx.G0(i, i4, i2, objArr2, objArr2);
            }
            this.n[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.m = iArr2;
            this.n = new Object[i5];
            if (i > 0) {
                cx.I0(0, i, 6, iArr, iArr2);
                cx.J0(0, i, 6, objArr, this.n);
            }
            if (i < i3) {
                int i6 = i + 1;
                cx.F0(i, i6, i2, iArr, this.m);
                cx.G0(i, i6, i2, objArr, this.n);
            }
        }
        if (i2 == this.f369o) {
            this.f369o = i3;
            return obj;
        }
        gk0.c();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iO;
        int i2 = this.f369o;
        if (obj == null) {
            iO = im3.O(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iO = im3.O(this, obj, iHashCode);
        }
        if (iO >= 0) {
            return false;
        }
        int i3 = ~iO;
        int[] iArr = this.m;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.n;
            int[] iArr2 = new int[i4];
            this.m = iArr2;
            this.n = new Object[i4];
            if (i2 != this.f369o) {
                gk0.c();
                return false;
            }
            if (iArr2.length != 0) {
                cx.I0(0, iArr.length, 6, iArr, iArr2);
                cx.J0(0, objArr.length, 6, objArr, this.n);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.m;
            int i5 = i3 + 1;
            cx.F0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.n;
            cx.G0(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.f369o;
        if (i2 == i6) {
            int[] iArr4 = this.m;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.n[i3] = obj;
                this.f369o = i6 + 1;
                return true;
            }
        }
        gk0.c();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f369o;
        int i = this.f369o;
        int[] iArr = this.m;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.n;
            int[] iArr2 = new int[size];
            this.m = iArr2;
            this.n = new Object[size];
            if (i > 0) {
                cx.I0(0, i, 6, iArr, iArr2);
                cx.J0(0, this.f369o, 6, objArr, this.n);
            }
        }
        if (this.f369o != i) {
            gk0.c();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f369o;
        if (i != 0) {
            this.m = j51.m;
            this.n = j51.f1132o;
            i = 0;
            this.f369o = 0;
        }
        if (i == 0) {
            return;
        }
        gk0.c();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? im3.O(this, null, 0) : im3.O(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f369o != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f369o;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.n[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.m;
        int i = this.f369o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f369o <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new qw(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iO = obj == null ? im3.O(this, null, 0) : im3.O(this, obj, obj.hashCode());
        if (iO < 0) {
            return false;
        }
        a(iO);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.f369o - 1; -1 < i; i--) {
            if (!lv0.h0(collection, this.n[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f369o;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.f369o;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        cx.G0(0, 0, this.f369o, this.n, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f369o * 14);
        sb.append('{');
        int i = this.f369o;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.n[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return cx.L0(this.n, 0, this.f369o);
    }
}
