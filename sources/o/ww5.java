package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ww5 extends e2 implements RandomAccess {
    public static final ww5 p;
    public Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2455o;

    static {
        ww5 ww5Var = new ww5(0, new Object[0]);
        p = ww5Var;
        ww5Var.m = false;
    }

    public ww5(int i, Object[] objArr) {
        this.n = objArr;
        this.f2455o = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.f2455o)) {
            an4.f(this.f2455o, fx3.k(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.n;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.n, i, objArr2, i + 1, this.f2455o - i);
            this.n = objArr2;
        }
        this.n[i] = obj;
        this.f2455o++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.f2455o) {
            an4.f(this.f2455o, fx3.k(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.n[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.n;
        Object obj = objArr[i];
        int i2 = this.f2455o;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f2455o--;
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
        return this.f2455o;
    }

    @Override // o.ql3
    public final ql3 z(int i) {
        if (i >= this.f2455o) {
            return new ww5(this.f2455o, Arrays.copyOf(this.n, i));
        }
        yq4.f();
        return null;
    }

    @Override // o.e2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f2455o;
        Object[] objArrCopyOf = this.n;
        if (i == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, ((i * 3) / 2) + 1);
            this.n = objArrCopyOf;
        }
        int i2 = this.f2455o;
        this.f2455o = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
