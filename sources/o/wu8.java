package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class wu8 extends ju8 implements RandomAccess, xu8 {
    public static final int[] p;
    public static final wu8 q;
    public int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2446o;

    static {
        int[] iArr = new int[0];
        p = iArr;
        q = new wu8(iArr, 0, false);
    }

    public wu8(int[] iArr, int i, boolean z) {
        super(z);
        this.n = iArr;
        this.f2446o = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.f2446o)) {
            hk0.r(ua5.l("Index:", i, this.f2446o, ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.n;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.n, 0, iArr2, 0, i);
            System.arraycopy(this.n, i, iArr2, i3, this.f2446o - i);
            this.n = iArr2;
        }
        this.n[i] = iIntValue;
        this.f2446o++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.ju8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof wu8)) {
            return super.addAll(collection);
        }
        wu8 wu8Var = (wu8) collection;
        int i = wu8Var.f2446o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2446o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArrCopyOf = this.n;
        if (i3 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
            this.n = iArrCopyOf;
        }
        System.arraycopy(wu8Var.n, 0, iArrCopyOf, this.f2446o, wu8Var.f2446o);
        this.f2446o = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int b(int i) {
        f(i);
        return this.n[i];
    }

    @Override // o.yu8
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final wu8 q(int i) {
        if (i >= this.f2446o) {
            return new wu8(i == 0 ? p : Arrays.copyOf(this.n, i), this.f2446o, true);
        }
        yq4.f();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        a();
        int i2 = this.f2446o;
        int[] iArr = this.n;
        int length = iArr.length;
        if (i2 == length) {
            iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.n, 0, iArr, 0, this.f2446o);
            this.n = iArr;
        }
        int i3 = this.f2446o;
        this.f2446o = i3 + 1;
        iArr[i3] = i;
    }

    @Override // o.ju8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu8)) {
            return super.equals(obj);
        }
        wu8 wu8Var = (wu8) obj;
        if (this.f2446o == wu8Var.f2446o) {
            int[] iArr = wu8Var.n;
            for (int i = 0; i < this.f2446o; i++) {
                if (this.n[i] == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.f2446o) {
            hk0.r(ua5.l("Index:", i, this.f2446o, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Integer.valueOf(this.n[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2446o; i2++) {
            i = (i * 31) + this.n[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f2446o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.n[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.ju8, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        f(i);
        int[] iArr = this.n;
        int i2 = iArr[i];
        int i3 = this.f2446o;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f2446o--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            hk0.r("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.n;
        System.arraycopy(iArr, i2, iArr, i, this.f2446o - i2);
        this.f2446o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        f(i);
        int[] iArr = this.n;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2446o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
