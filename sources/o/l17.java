package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class l17 extends c2 {
    public static final l17 n = new l17(new Object[0]);
    public final Object[] m;

    public l17(Object[] objArr) {
        this.m = objArr;
    }

    @Override // o.r0
    public final int a() {
        return this.m.length;
    }

    @Override // o.c2
    public final c2 b(int i, Object obj) {
        Object[] objArr = this.m;
        it1.s(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            cx.J0(0, i, 6, objArr, objArr2);
            cx.G0(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new l17(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        cx.G0(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new jk5(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // o.c2
    public final c2 c(Object obj) {
        Object[] objArr = this.m;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new l17(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new jk5(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // o.c2
    public final c2 d(Collection collection) {
        Object[] objArr = this.m;
        if (collection.size() + objArr.length > 32) {
            kk5 kk5VarF = f();
            kk5VarF.addAll(collection);
            return kk5VarF.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new l17(objArrCopyOf);
    }

    @Override // o.c2
    public final kk5 f() {
        return new kk5(this, null, this.m, 0);
    }

    @Override // o.c2
    public final c2 g(b2 b2Var) {
        Object[] objArr = this.m;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) b2Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? n : new l17(cx.L0(objArrCopyOf, 0, length));
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.m;
        it1.r(i, objArr.length);
        return objArr[i];
    }

    @Override // o.c2
    public final c2 h(int i) {
        Object[] objArr = this.m;
        it1.r(i, objArr.length);
        if (objArr.length == 1) {
            return n;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        cx.G0(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new l17(objArrCopyOf);
    }

    @Override // o.c2
    public final c2 i(int i, Object obj) {
        Object[] objArr = this.m;
        it1.r(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new l17(objArrCopyOf);
    }

    @Override // o.m1, java.util.List
    public final int indexOf(Object obj) {
        return cx.W0(obj, this.m);
    }

    @Override // o.m1, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.m;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // o.m1, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.m;
        it1.s(i, objArr.length);
        return new cf0(objArr, i, objArr.length);
    }
}
