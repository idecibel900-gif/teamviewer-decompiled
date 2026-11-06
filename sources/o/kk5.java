package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kk5 extends v1 implements Collection, tu3 {
    public c2 m;
    public Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object[] f1274o;
    public int p;
    public aw q = new aw(27);
    public Object[] r;
    public Object[] s;
    public int t;

    public kk5(c2 c2Var, Object[] objArr, Object[] objArr2, int i) {
        this.m = c2Var;
        this.n = objArr;
        this.f1274o = objArr2;
        this.p = i;
        this.r = objArr;
        this.s = objArr2;
        this.t = c2Var.a();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(Function1 function1, Object[] objArr, int i, int i2, f4 f4Var, ArrayList arrayList, ArrayList arrayList2) {
        if (k(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = f4Var.m;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrO = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrO = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : o();
                    i2 = 0;
                }
                objArrO[i2] = obj2;
                i2++;
            }
        }
        f4Var.m = objArrO;
        if (objArr2 != objArrO) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int B(Function1 function1, Object[] objArr, int i, f4 f4Var) {
        Object[] objArrM = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM = m(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM[i2] = obj;
                i2++;
            }
        }
        f4Var.m = objArrM;
        return i2;
    }

    public final int C(Function1 function1, int i, f4 f4Var) {
        int iB = B(function1, this.s, i, f4Var);
        Object obj = f4Var.m;
        if (iB == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iB, i, (Object) null);
        this.s = objArr;
        this.t -= i - iB;
        return iB;
    }

    public final boolean D(Function1 function1) {
        int i;
        Function1 function2 = function1;
        int iL = L();
        Object[] objArrR = null;
        f4 f4Var = new f4(objArrR);
        boolean z = false;
        if (this.r != null) {
            n1 n1VarL = l(0);
            int iB = 32;
            while (iB == 32 && n1VarL.hasNext()) {
                iB = B(function2, (Object[]) n1VarL.next(), 32, f4Var);
            }
            if (iB == 32) {
                int iC = C(function2, iL, f4Var);
                if (iC == 0) {
                    t(this.r, this.t, this.p);
                }
                if (iC != iL) {
                }
            } else {
                int i2 = (n1VarL.m - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iA = iB;
                while (n1VarL.hasNext()) {
                    iA = A(function2, (Object[]) n1VarL.next(), 32, iA, f4Var, arrayList2, arrayList);
                    function2 = function1;
                }
                int iA2 = A(function1, this.s, iL, iA, f4Var, arrayList2, arrayList);
                Object obj = f4Var.m;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iA2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrV = this.r;
                if (zIsEmpty) {
                    objArrV.getClass();
                } else {
                    objArrV = v(objArrV, i2, this.p, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    up5.a("invalid size");
                }
                if (size == 0) {
                    this.p = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.p;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.p = i - 5;
                        Object[] objArr2 = objArrV[0];
                        objArr2.getClass();
                        objArrV = objArr2;
                    }
                    objArrR = r(objArrV, i3, i);
                }
                this.r = objArrR;
                this.s = objArr;
                this.t = size + iA2;
            }
            z = true;
        } else if (C(function2, iL, f4Var) != iL) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] E(Object[] objArr, int i, int i2, f4 f4Var) {
        int iM = h67.m(i2, i);
        if (i == 0) {
            Object obj = objArr[iM];
            Object[] objArrM = m(objArr);
            cx.G0(iM, iM + 1, 32, objArr, objArrM);
            objArrM[31] = f4Var.m;
            f4Var.m = obj;
            return objArrM;
        }
        int iM2 = objArr[31] == null ? h67.m(H() - 1, i) : 31;
        Object[] objArrM2 = m(objArr);
        int i3 = i - 5;
        int i4 = iM + 1;
        if (i4 <= iM2) {
            while (true) {
                Object obj2 = objArrM2[iM2];
                obj2.getClass();
                objArrM2[iM2] = E((Object[]) obj2, i3, 0, f4Var);
                if (iM2 == i4) {
                    break;
                }
                iM2--;
            }
        }
        Object obj3 = objArrM2[iM];
        obj3.getClass();
        objArrM2[iM] = E((Object[]) obj3, i3, i2, f4Var);
        return objArrM2;
    }

    public final Object G(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.t - i;
        Object[] objArr2 = this.s;
        if (i4 == 1) {
            Object obj = objArr2[0];
            t(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM = m(objArr2);
        cx.G0(i3, i3 + 1, i4, objArr2, objArrM);
        objArrM[i4 - 1] = null;
        this.r = objArr;
        this.s = objArrM;
        this.t = (i + i4) - 1;
        this.p = i2;
        return obj2;
    }

    public final int H() {
        int i = this.t;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] I(Object[] objArr, int i, int i2, Object obj, f4 f4Var) {
        int iM = h67.m(i2, i);
        Object[] objArrM = m(objArr);
        if (i != 0) {
            Object obj2 = objArrM[iM];
            obj2.getClass();
            objArrM[iM] = I((Object[]) obj2, i - 5, i2, obj, f4Var);
            return objArrM;
        }
        if (objArrM != objArr) {
            ((AbstractList) this).modCount++;
        }
        f4Var.m = objArrM[iM];
        objArrM[iM] = obj;
        return objArrM;
    }

    public final void K(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrO;
        if (i3 < 1) {
            up5.a("requires at least one nullBuffer");
        }
        Object[] objArrM = m(objArr);
        objArr2[0] = objArrM;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            cx.G0(size + 1, i4, i2, objArrM, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrO = objArrM;
            } else {
                objArrO = o();
                i3--;
                objArr2[i3] = objArrO;
            }
            int i7 = i2 - i6;
            cx.G0(0, i7, i2, objArrM, objArr3);
            cx.G0(size + 1, i4, i7, objArrM, objArrO);
            objArr3 = objArrO;
        }
        Iterator it = collection.iterator();
        d(objArrM, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrO2 = o();
            d(objArrO2, 0, it);
            objArr2[i8] = objArrO2;
        }
        d(objArr3, 0, it);
    }

    public final int L() {
        int i = this.t;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // o.v1
    public final int a() {
        return this.t;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        it1.s(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iH = H();
        if (i >= iH) {
            i(i - iH, obj, this.r);
            return;
        }
        f4 f4Var = new f4(null);
        Object[] objArr = this.r;
        objArr.getClass();
        i(0, f4Var.m, h(objArr, this.p, i, obj, f4Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrO;
        it1.s(i, this.t);
        if (i == this.t) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.t - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.s;
            Object[] objArrM = m(objArr);
            cx.G0(size2 + 1, i3, L(), objArr, objArrM);
            d(objArrM, i3, collection.iterator());
            this.s = objArrM;
            this.t = collection.size() + this.t;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iL = L();
        int size3 = collection.size() + this.t;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= H()) {
            objArrO = o();
            collection2 = collection;
            K(collection2, i, this.s, iL, objArr2, size, objArrO);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.s;
            if (size3 > iL) {
                int i4 = size3 - iL;
                Object[] objArrN = n(i4, objArr3);
                g(collection2, i, i4, objArr2, size, objArrN);
                objArr2 = objArr2;
                objArrO = objArrN;
            } else {
                objArrO = o();
                int i5 = iL - size3;
                cx.G0(0, i5, iL, objArr3, objArrO);
                int i6 = 32 - i5;
                Object[] objArrN2 = n(i6, this.s);
                int i7 = size - 1;
                objArr2[i7] = objArrN2;
                g(collection2, i, i6, objArr2, i7, objArrN2);
                collection2 = collection2;
            }
        }
        this.r = w(this.r, i2, objArr2);
        this.s = objArrO;
        this.t = collection2.size() + this.t;
        return true;
    }

    @Override // o.v1
    public final Object b(int i) {
        it1.r(i, a());
        ((AbstractList) this).modCount++;
        int iH = H();
        if (i >= iH) {
            return G(this.r, iH, this.p, i - iH);
        }
        f4 f4Var = new f4(this.s[0]);
        Object[] objArr = this.r;
        objArr.getClass();
        G(E(objArr, this.p, i, f4Var), iH, this.p, 0);
        return f4Var.m;
    }

    public final c2 c() {
        c2 jk5Var;
        Object[] objArr = this.r;
        if (objArr == this.n && this.s == this.f1274o) {
            jk5Var = this.m;
        } else {
            this.q = new aw((byte) 27);
            this.n = objArr;
            Object[] objArr2 = this.s;
            this.f1274o = objArr2;
            if (objArr == null) {
                jk5Var = objArr2.length == 0 ? l17.n : new l17(Arrays.copyOf(objArr2, this.t));
            } else {
                jk5Var = new jk5(objArr, objArr2, this.t, this.p);
            }
        }
        this.m = jk5Var;
        return jk5Var;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.r == null) {
            hk0.l("root is null");
            return;
        }
        int i4 = i >> 5;
        n1 n1VarL = l(H() >> 5);
        int i5 = i3;
        Object[] objArrN = objArr2;
        while (n1VarL.m - 1 != i4) {
            Object[] objArr3 = (Object[]) n1VarL.previous();
            cx.G0(0, 32 - i2, 32, objArr3, objArrN);
            objArrN = n(i2, objArr3);
            i5--;
            objArr[i5] = objArrN;
        }
        Object[] objArr4 = (Object[]) n1VarL.previous();
        int iH = i3 - (((H() >> 5) - 1) - i4);
        if (iH < i3) {
            objArr2 = objArr[iH];
            objArr2.getClass();
        }
        K(collection, i, objArr4, 32, objArr, iH, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        it1.r(i, a());
        if (H() <= i) {
            objArr = this.s;
        } else {
            Object[] objArr2 = this.r;
            objArr2.getClass();
            for (int i2 = this.p; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[h67.m(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] h(Object[] objArr, int i, int i2, Object obj, f4 f4Var) {
        Object obj2;
        int iM = h67.m(i2, i);
        if (i == 0) {
            f4Var.m = objArr[31];
            Object[] objArrM = m(objArr);
            cx.G0(iM + 1, iM, 31, objArr, objArrM);
            objArrM[iM] = obj;
            return objArrM;
        }
        Object[] objArrM2 = m(objArr);
        int i3 = i - 5;
        Object obj3 = objArrM2[iM];
        obj3.getClass();
        objArrM2[iM] = h((Object[]) obj3, i3, i2, obj, f4Var);
        while (true) {
            iM++;
            if (iM >= 32 || (obj2 = objArrM2[iM]) == null) {
                break;
            }
            objArrM2[iM] = h((Object[]) obj2, i3, 0, f4Var.m, f4Var);
        }
        return objArrM2;
    }

    public final void i(int i, Object obj, Object[] objArr) {
        int iL = L();
        Object[] objArrM = m(this.s);
        Object[] objArr2 = this.s;
        if (iL >= 32) {
            Object obj2 = objArr2[31];
            cx.G0(i + 1, i, 31, objArr2, objArrM);
            objArrM[i] = obj;
            x(objArr, objArrM, p(obj2));
            return;
        }
        cx.G0(i + 1, i, iL, objArr2, objArrM);
        objArrM[i] = obj;
        this.r = objArr;
        this.s = objArrM;
        this.t++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean k(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.q;
    }

    public final n1 l(int i) {
        Object[] objArr = this.r;
        if (objArr == null) {
            hk0.l("Invalid root");
            return null;
        }
        int iH = H() >> 5;
        it1.s(i, iH);
        int i2 = this.p;
        return i2 == 0 ? new cf0(i, objArr) : new r28(objArr, i, iH, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        it1.s(i, this.t);
        return new mk5(this, i);
    }

    public final Object[] m(Object[] objArr) {
        if (objArr == null) {
            return o();
        }
        if (k(objArr)) {
            return objArr;
        }
        Object[] objArrO = o();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        cx.J0(0, length, 6, objArr, objArrO);
        return objArrO;
    }

    public final Object[] n(int i, Object[] objArr) {
        if (k(objArr)) {
            cx.G0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrO = o();
        cx.G0(i, 0, 32 - i, objArr, objArrO);
        return objArrO;
    }

    public final Object[] o() {
        Object[] objArr = new Object[33];
        objArr[32] = this.q;
        return objArr;
    }

    public final Object[] p(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.q;
        return objArr;
    }

    public final Object[] r(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            up5.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM = h67.m(i, i2);
        Object obj = objArr[iM];
        obj.getClass();
        Object objR = r((Object[]) obj, i, i2 - 5);
        if (iM < 31) {
            int i3 = iM + 1;
            if (objArr[i3] != null) {
                if (k(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrO = o();
                cx.G0(0, 0, i3, objArr, objArrO);
                objArr = objArrO;
            }
        }
        if (objR == objArr[iM]) {
            return objArr;
        }
        Object[] objArrM = m(objArr);
        objArrM[iM] = objR;
        return objArrM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return D(new b2(collection, (byte) 1));
    }

    public final Object[] s(Object[] objArr, int i, int i2, f4 f4Var) {
        Object[] objArrS;
        int iM = h67.m(i2 - 1, i);
        if (i == 5) {
            f4Var.m = objArr[iM];
            objArrS = null;
        } else {
            Object obj = objArr[iM];
            obj.getClass();
            objArrS = s((Object[]) obj, i - 5, i2, f4Var);
        }
        if (objArrS == null && iM == 0) {
            return null;
        }
        Object[] objArrM = m(objArr);
        objArrM[iM] = objArrS;
        return objArrM;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        it1.r(i, a());
        if (H() > i) {
            f4 f4Var = new f4(null);
            Object[] objArr = this.r;
            objArr.getClass();
            this.r = I(objArr, this.p, i, obj, f4Var);
            return f4Var.m;
        }
        Object[] objArrM = m(this.s);
        if (objArrM != this.s) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM[i2];
        objArrM[i2] = obj;
        this.s = objArrM;
        return obj2;
    }

    public final void t(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            this.r = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.s = objArr;
            this.t = i;
            this.p = i2;
            return;
        }
        f4 f4Var = new f4(obj);
        objArr.getClass();
        Object[] objArrS = s(objArr, i2, i, f4Var);
        objArrS.getClass();
        Object obj2 = f4Var.m;
        obj2.getClass();
        this.s = (Object[]) obj2;
        this.t = i;
        if (objArrS[1] == null) {
            this.r = (Object[]) objArrS[0];
            this.p = i2 - 5;
        } else {
            this.r = objArrS;
            this.p = i2;
        }
    }

    public final Object[] v(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            up5.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            up5.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM = m(objArr);
        int iM = h67.m(i, i2);
        int i3 = i2 - 5;
        objArrM[iM] = v((Object[]) objArrM[iM], i, i3, it);
        while (true) {
            iM++;
            if (iM >= 32 || !it.hasNext()) {
                break;
            }
            objArrM[iM] = v((Object[]) objArrM[iM], 0, i3, it);
        }
        return objArrM;
    }

    public final Object[] w(Object[] objArr, int i, Object[][] objArr2) {
        j1 j1Var = new j1(objArr2);
        int i2 = i >> 5;
        int i3 = this.p;
        Object[] objArrV = i2 < (1 << i3) ? v(objArr, i, i3, j1Var) : m(objArr);
        while (j1Var.hasNext()) {
            this.p += 5;
            objArrV = p(objArrV);
            int i4 = this.p;
            v(objArrV, 1 << i4, i4, j1Var);
        }
        return objArrV;
    }

    public final void x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.t;
        int i2 = i >> 5;
        int i3 = this.p;
        if (i2 > (1 << i3)) {
            this.r = y(this.p + 5, p(objArr), objArr2);
            this.s = objArr3;
            this.p += 5;
            this.t++;
            return;
        }
        if (objArr == null) {
            this.r = objArr2;
            this.s = objArr3;
            this.t = i + 1;
        } else {
            this.r = y(i3, objArr, objArr2);
            this.s = objArr3;
            this.t++;
        }
    }

    public final Object[] y(int i, Object[] objArr, Object[] objArr2) {
        int iM = h67.m(a() - 1, i);
        Object[] objArrM = m(objArr);
        if (i == 5) {
            objArrM[iM] = objArr2;
            return objArrM;
        }
        objArrM[iM] = y(i - 5, (Object[]) objArrM[iM], objArr2);
        return objArrM;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iL = L();
        if (iL < 32) {
            Object[] objArrM = m(this.s);
            objArrM[iL] = obj;
            this.s = objArrM;
            this.t = a() + 1;
        } else {
            x(this.r, this.s, p(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iL = L();
        Iterator it = collection.iterator();
        if (32 - iL >= collection.size()) {
            Object[] objArrM = m(this.s);
            d(objArrM, iL, it);
            this.s = objArrM;
            this.t = collection.size() + this.t;
            return true;
        }
        int size = ((collection.size() + iL) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM2 = m(this.s);
        d(objArrM2, iL, it);
        objArr[0] = objArrM2;
        for (int i = 1; i < size; i++) {
            Object[] objArrO = o();
            d(objArrO, 0, it);
            objArr[i] = objArrO;
        }
        this.r = w(this.r, H(), objArr);
        Object[] objArrO2 = o();
        d(objArrO2, 0, it);
        this.s = objArrO2;
        this.t = collection.size() + this.t;
        return true;
    }
}
