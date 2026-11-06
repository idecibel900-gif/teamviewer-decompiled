package o;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class jk5 extends c2 {
    public final Object[] m;
    public final Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1177o;
    public final int p;

    public jk5(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.m = objArr;
        this.n = objArr2;
        this.f1177o = i;
        this.p = i2;
        if (!(a() > 32)) {
            up5.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] k(Object[] objArr, int i, int i2, Object obj, f4 f4Var) {
        int iM = h67.m(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            cx.G0(iM + 1, iM, 31, objArr, objArrCopyOf);
            f4Var.m = objArr[31];
            objArrCopyOf[iM] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iM];
        obj2.getClass();
        objArrCopyOf2[iM] = k((Object[]) obj2, i3, i2, obj, f4Var);
        while (true) {
            iM++;
            if (iM >= 32 || objArrCopyOf2[iM] == null) {
                break;
            }
            Object obj3 = objArr[iM];
            obj3.getClass();
            objArrCopyOf2[iM] = k((Object[]) obj3, i3, 0, f4Var.m, f4Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] m(Object[] objArr, int i, int i2, f4 f4Var) {
        Object[] objArrM;
        int iM = h67.m(i2, i);
        if (i == 5) {
            f4Var.m = objArr[iM];
            objArrM = null;
        } else {
            Object obj = objArr[iM];
            obj.getClass();
            objArrM = m((Object[]) obj, i - 5, i2, f4Var);
        }
        if (objArrM == null && iM == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iM] = objArrM;
        return objArrCopyOf;
    }

    public static Object[] t(int i, int i2, Object obj, Object[] objArr) {
        int iM = h67.m(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iM] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM];
        obj2.getClass();
        objArrCopyOf[iM] = t(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // o.r0
    public final int a() {
        return this.f1177o;
    }

    @Override // o.c2
    public final c2 b(int i, Object obj) {
        int i2 = this.f1177o;
        it1.s(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int iS = s();
        Object[] objArr = this.m;
        if (i >= iS) {
            return l(i - iS, obj, objArr);
        }
        f4 f4Var = new f4(null);
        return l(0, f4Var.m, k(objArr, this.p, i, obj, f4Var));
    }

    @Override // o.c2
    public final c2 c(Object obj) {
        int iS = s();
        int i = this.f1177o;
        int i2 = i - iS;
        Object[] objArr = this.m;
        Object[] objArr2 = this.n;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new jk5(objArr, objArrCopyOf, i + 1, this.p);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return n(objArr, objArr2, objArr3);
    }

    @Override // o.c2
    public final kk5 f() {
        return new kk5(this, this.m, this.n, this.p);
    }

    @Override // o.c2
    public final c2 g(b2 b2Var) {
        kk5 kk5Var = new kk5(this, this.m, this.n, this.p);
        kk5Var.D(b2Var);
        return kk5Var.c();
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        it1.r(i, a());
        if (s() <= i) {
            objArr = this.n;
        } else {
            Object[] objArr2 = this.m;
            for (int i2 = this.p; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[h67.m(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // o.c2
    public final c2 h(int i) {
        it1.r(i, a());
        int iS = s();
        int i2 = this.p;
        Object[] objArr = this.m;
        return i >= iS ? r(objArr, iS, i2, i - iS) : r(p(objArr, i2, i, new f4(this.n[0])), iS, i2, 0);
    }

    @Override // o.c2
    public final c2 i(int i, Object obj) {
        int i2 = this.f1177o;
        it1.r(i, i2);
        int iS = s();
        Object[] objArr = this.m;
        Object[] objArr2 = this.n;
        int i3 = this.p;
        if (iS > i) {
            return new jk5(t(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new jk5(objArr, objArrCopyOf, i2, i3);
    }

    public final jk5 l(int i, Object obj, Object[] objArr) {
        int iS = s();
        int i2 = this.f1177o;
        int i3 = i2 - iS;
        Object[] objArr2 = this.n;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            cx.G0(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new jk5(objArr, objArrCopyOf, i2 + 1, this.p);
        }
        Object obj2 = objArr2[31];
        cx.G0(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return n(objArr, objArrCopyOf, objArr3);
    }

    @Override // o.m1, java.util.List
    public final ListIterator listIterator(int i) {
        it1.s(i, this.f1177o);
        return new lk5(i, this.f1177o, (this.p / 5) + 1, this.m, this.n);
    }

    public final jk5 n(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f1177o;
        int i2 = i >> 5;
        int i3 = this.p;
        if (i2 <= (1 << i3)) {
            return new jk5(o(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new jk5(o(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] o(int i, Object[] objArr, Object[] objArr2) {
        int iM = h67.m(a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iM] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM] = o(i - 5, (Object[]) objArrCopyOf[iM], objArr2);
        return objArrCopyOf;
    }

    public final Object[] p(Object[] objArr, int i, int i2, f4 f4Var) {
        int iM = h67.m(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            cx.G0(iM, iM + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = f4Var.m;
            f4Var.m = objArr[iM];
            return objArrCopyOf;
        }
        int iM2 = objArr[31] == null ? h67.m(s() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iM + 1;
        if (i4 <= iM2) {
            while (true) {
                Object obj = objArrCopyOf2[iM2];
                obj.getClass();
                objArrCopyOf2[iM2] = p((Object[]) obj, i3, 0, f4Var);
                if (iM2 == i4) {
                    break;
                }
                iM2--;
            }
        }
        Object obj2 = objArrCopyOf2[iM];
        obj2.getClass();
        objArrCopyOf2[iM] = p((Object[]) obj2, i3, i2, f4Var);
        return objArrCopyOf2;
    }

    public final c2 r(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f1177o - i;
        if (i4 != 1) {
            Object[] objArr2 = this.n;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                cx.G0(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new jk5(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new l17(objArr);
        }
        f4 f4Var = new f4(null);
        Object[] objArrM = m(objArr, i2, i - 1, f4Var);
        objArrM.getClass();
        Object obj = f4Var.m;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrM[1] != null) {
            return new jk5(objArrM, objArr3, i, i2);
        }
        Object obj2 = objArrM[0];
        obj2.getClass();
        return new jk5((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int s() {
        return (this.f1177o - 1) & (-32);
    }
}
