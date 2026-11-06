package o;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class xx4 implements RandomAccess {
    public Object[] m;
    public xw4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2559o = 0;

    public xx4(Object[] objArr) {
        this.m = objArr;
    }

    public final void a(int i, Object obj) {
        int i2 = this.f2559o + 1;
        if (this.m.length < i2) {
            m(i2);
        }
        Object[] objArr = this.m;
        int i3 = this.f2559o;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f2559o++;
    }

    public final void b(Object obj) {
        int i = this.f2559o + 1;
        if (this.m.length < i) {
            m(i);
        }
        Object[] objArr = this.m;
        int i2 = this.f2559o;
        objArr[i2] = obj;
        this.f2559o = i2 + 1;
    }

    public final void c(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f2559o + size;
        if (this.m.length < i2) {
            m(i2);
        }
        Object[] objArr = this.m;
        int i3 = this.f2559o;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f2559o += size;
    }

    public final void d(int i, xx4 xx4Var) {
        int i2 = xx4Var.f2559o;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f2559o + i2;
        if (this.m.length < i3) {
            m(i3);
        }
        Object[] objArr = this.m;
        int i4 = this.f2559o;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(xx4Var.m, 0, objArr, i, i2);
        this.f2559o += i2;
    }

    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f2559o + size;
        if (this.m.length < i3) {
            m(i3);
        }
        Object[] objArr = this.m;
        int i4 = this.f2559o;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                qf0.U();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f2559o += size;
        return true;
    }

    public final List f() {
        xw4 xw4Var = this.n;
        if (xw4Var != null) {
            return xw4Var;
        }
        xw4 xw4Var2 = new xw4(this, (byte) 1);
        this.n = xw4Var2;
        return xw4Var2;
    }

    public final void g() {
        Object[] objArr = this.m;
        int i = this.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2559o = 0;
    }

    public final boolean h(Object obj) {
        int i = this.f2559o - 1;
        if (i >= 0) {
            for (int i2 = 0; !im3.n(this.m[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.m;
        int i = this.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            if (im3.n(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return false;
        }
        k(i);
        return true;
    }

    public final Object k(int i) {
        Object[] objArr = this.m;
        Object obj = objArr[i];
        int i2 = this.f2559o;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f2559o - 1;
        this.f2559o = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f2559o;
            if (i2 < i3) {
                Object[] objArr = this.m;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f2559o;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.m[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f2559o = i5;
        }
    }

    public final void m(int i) {
        Object[] objArr = this.m;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.m = objArr2;
    }
}
