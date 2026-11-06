package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hb8 implements mj0 {
    public final Method a;
    public final Method b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    public hb8(xw2 xw2Var, ou3 ou3Var, String str, List list) {
        ?? K;
        Method methodN;
        ou3Var.getClass();
        str.getClass();
        Method methodI = ou3Var.i("constructor-impl", str);
        methodI.getClass();
        this.a = methodI;
        Method methodI2 = ou3Var.i("box-impl", ub7.j0(str, "V").concat(p76.b(ou3Var.a())));
        methodI2.getClass();
        this.b = methodI2;
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        Iterator it = list.iterator();
        while (true) {
            List listK = null;
            if (!it.hasNext()) {
                break;
            }
            oz3 type = ((if5) it.next()).getType();
            type.getClass();
            g07 g07VarO = m77.o(type);
            ArrayList arrayListO = n67.o(g07VarO);
            if (arrayListO == null) {
                Class clsW = n67.w(g07VarO);
                if (clsW != null && (methodN = n67.n(clsW, xw2Var)) != null) {
                    listK = qf0.K(methodN);
                }
            } else {
                listK = arrayListO;
            }
            arrayList.add(listK);
        }
        this.c = arrayList;
        ArrayList arrayList2 = new ArrayList(mv0.Z(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                qf0.U();
                throw null;
            }
            ys0 ys0VarA = ((if5) obj).getType().o0().a();
            ys0VarA.getClass();
            ns4 ns4Var = (ns4) ys0VarA;
            List list2 = (List) this.c.get(i);
            if (list2 != null) {
                K = new ArrayList(mv0.Z(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    K.add(((Method) it2.next()).getReturnType());
                }
            } else {
                Class clsJ = pa8.j(ns4Var);
                clsJ.getClass();
                K = qf0.K(clsJ);
            }
            arrayList2.add(K);
            i = i2;
        }
        this.d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            qv0.c0(arrayList3, (Iterable) it3.next());
        }
        this.e = arrayList3;
    }

    @Override // o.mj0
    public final List a() {
        return this.e;
    }

    @Override // o.mj0
    public final Member b() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // o.mj0
    public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        ?? K;
        objArr.getClass();
        ArrayList arrayList = this.c;
        arrayList.getClass();
        int length = objArr.length;
        ArrayList<vd5> arrayList2 = new ArrayList(Math.min(mv0.Z(arrayList, 10), length));
        int i = 0;
        for (Object obj : arrayList) {
            if (i >= length) {
                break;
            }
            arrayList2.add(new vd5(objArr[i], obj));
            i++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (vd5 vd5Var : arrayList2) {
            Object obj2 = vd5Var.m;
            List list = (List) vd5Var.n;
            if (list != null) {
                K = new ArrayList(mv0.Z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    K.add(((Method) it.next()).invoke(obj2, null));
                }
            } else {
                K = qf0.K(obj2);
            }
            qv0.c0(arrayList3, K);
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        this.a.invoke(null, Arrays.copyOf(array, array.length));
        return this.b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // o.mj0
    public final Type getReturnType() {
        Class<?> returnType = this.b.getReturnType();
        returnType.getClass();
        return returnType;
    }
}
