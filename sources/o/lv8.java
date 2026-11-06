package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class lv8 extends ju8 implements RandomAccess {
    public static final Object[] p;
    public static final lv8 q;
    public Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1411o;

    static {
        Object[] objArr = new Object[0];
        p = objArr;
        q = new lv8(objArr, 0, false);
    }

    public lv8(Object[] objArr, int i, boolean z) {
        super(z);
        this.n = objArr;
        this.f1411o = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.f1411o)) {
            hk0.r(ua5.l("Index:", i, this.f1411o, ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.n;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.n, 0, objArr2, 0, i);
            System.arraycopy(this.n, i, objArr2, i3, this.f1411o - i);
            this.n = objArr2;
        }
        this.n[i] = obj;
        this.f1411o++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.f1411o) {
            hk0.r(ua5.l("Index:", i, this.f1411o, ", Size:"));
        }
    }

    @Override // o.ju8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int i = this.f1411o;
            if (i == list.size()) {
                if (!(obj instanceof lv8)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.n[i2].equals(list.get(i2))) {
                        }
                    }
                    return true;
                }
                lv8 lv8Var = (lv8) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.n[i3].equals(lv8Var.n[i3])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.n[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f1411o;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.n[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // o.yu8
    public final /* bridge */ /* synthetic */ yu8 q(int i) {
        if (i >= this.f1411o) {
            return new lv8(i == 0 ? p : Arrays.copyOf(this.n, i), this.f1411o, true);
        }
        yq4.f();
        return null;
    }

    @Override // o.ju8, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.n;
        Object obj = objArr[i];
        int i2 = this.f1411o;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f1411o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.n;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1411o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f1411o;
        Object[] objArrCopyOf = this.n;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(this.n, Math.max(((length * 3) / 2) + 1, 10));
            this.n = objArrCopyOf;
        }
        int i2 = this.f1411o;
        this.f1411o = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
