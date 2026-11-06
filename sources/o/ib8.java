package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ib8 implements mj0 {
    public final boolean a;
    public final mj0 b;
    public final Member c;
    public final y58 d;
    public final yk3[] e;
    public final boolean f;

    /* JADX WARN: Code duplicated, block: B:137:0x0283  */
    /* JADX WARN: Code duplicated, block: B:174:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x006e A[LOOP:1: B:23:0x0068->B:25:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b2  */
    public ib8(zi0 zi0Var, mj0 mj0Var, boolean z) {
        Class clsW;
        Method declaredMethod;
        int i;
        y58 y58Var;
        List listO;
        Method methodN;
        ArrayList arrayList;
        Iterator it;
        zi0Var.getClass();
        this.a = z;
        boolean z2 = false;
        if (mj0Var instanceof zj0) {
            v14 v14VarS = zi0Var.S();
            v14VarS = v14VarS == null ? zi0Var.O() : v14VarS;
            oz3 type = v14VarS != null ? v14VarS.getType() : null;
            if (type != null && pi3.f(type)) {
                if (z) {
                    List listJ = zi0Var.J();
                    listJ.getClass();
                    if (!listJ.isEmpty()) {
                        Iterator it2 = listJ.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((qb8) it2.next()).E0()) {
                                    ArrayList arrayListO = n67.o(m77.o(type));
                                    arrayListO.getClass();
                                    arrayList = new ArrayList(mv0.Z(arrayListO, 10));
                                    it = arrayListO.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((zj0) mj0Var).g, null));
                                    }
                                    mj0Var = new ak0((Method) ((wj0) mj0Var).a, arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayListO2 = n67.o(m77.o(type));
                    arrayListO2.getClass();
                    arrayList = new ArrayList(mv0.Z(arrayListO2, 10));
                    it = arrayListO2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((zj0) mj0Var).g, null));
                    }
                    mj0Var = new ak0((Method) ((wj0) mj0Var).a, arrayList.toArray(new Object[0]));
                }
            }
        }
        this.b = mj0Var;
        this.c = mj0Var.b();
        oz3 returnType = zi0Var.getReturnType();
        returnType.getClass();
        boolean z3 = zi0Var instanceof xw2;
        if (z3 && ((xw2) zi0Var).l()) {
            g07 g07VarG = pi3.g(returnType);
            oz3 oz3VarH = g07VarG != null ? m58.d(returnType).h(g07VarG, ub8.f2197o) : null;
            if (oz3VarH == null || !wy3.F(oz3VarH)) {
                clsW = n67.w(returnType);
                if (clsW != null) {
                    declaredMethod = clsW.getDeclaredMethod("box-impl", n67.n(clsW, zi0Var).getReturnType());
                } else {
                    declaredMethod = null;
                }
            } else {
                declaredMethod = null;
            }
        } else {
            clsW = n67.w(returnType);
            if (clsW != null) {
                try {
                    declaredMethod = clsW.getDeclaredMethod("box-impl", n67.n(clsW, zi0Var).getReturnType());
                } catch (NoSuchMethodException unused) {
                    yq4.n("No box method found in inline class: ", clsW, " (calling ", zi0Var);
                    throw null;
                }
            } else {
                declaredMethod = null;
            }
        }
        if (pi3.a(zi0Var)) {
            y58Var = new y58(yk3.p, new List[0], declaredMethod);
        } else {
            int i2 = -1;
            if (!(mj0Var instanceof zj0) && !(mj0Var instanceof ak0)) {
                if (zi0Var instanceof z61) {
                    if (!(mj0Var instanceof ia0)) {
                        i2 = 0;
                    }
                } else if (zi0Var.O() == null || (mj0Var instanceof ia0)) {
                    i2 = 0;
                } else {
                    fi1 fi1VarI = zi0Var.i();
                    fi1VarI.getClass();
                    if (pi3.e(fi1VarI)) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                }
            }
            int i3 = mj0Var instanceof ak0 ? -((ak0) mj0Var).g.length : i2;
            Member memberB = mj0Var.b();
            ArrayList arrayList2 = new ArrayList();
            v14 v14VarS2 = zi0Var.S();
            oz3 type2 = v14VarS2 != null ? v14VarS2.getType() : null;
            if (type2 != null) {
                arrayList2.add(type2);
            } else if (zi0Var instanceof z61) {
                ns4 ns4VarU = ((z61) zi0Var).u();
                ns4VarU.getClass();
                if (ns4VarU.g()) {
                    fi1 fi1VarI2 = ns4VarU.i();
                    fi1VarI2.getClass();
                    arrayList2.add(((ns4) fi1VarI2).W());
                }
            } else {
                fi1 fi1VarI3 = zi0Var.i();
                fi1VarI3.getClass();
                if (fi1VarI3 instanceof ns4) {
                    ns4 ns4Var = (ns4) fi1VarI3;
                    if (pi3.e(ns4Var)) {
                        if (memberB == null) {
                            arrayList2.add(ns4Var.W());
                        } else {
                            Class<?> declaringClass = memberB.getDeclaringClass();
                            if (declaringClass == null ? false : !w86.a.b(declaringClass).e()) {
                                g07 g07VarW = ns4Var.W();
                                g07VarW.getClass();
                                arrayList2.add(p58.h(g07VarW, true));
                            } else {
                                arrayList2.add(ns4Var.W());
                            }
                        }
                    }
                }
            }
            List listJ2 = zi0Var.J();
            listJ2.getClass();
            Iterator it3 = listJ2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((qb8) it3.next()).getType());
            }
            if (this.a) {
                Iterator it4 = arrayList2.iterator();
                int size = 0;
                while (it4.hasNext()) {
                    ArrayList arrayListO3 = n67.o(m77.o((oz3) it4.next()));
                    size += arrayListO3 != null ? arrayListO3.size() : 1;
                }
                i = ((size + 31) / 32) + 1;
            } else {
                i = 0;
            }
            int i4 = i + ((z3 && ((xw2) zi0Var).l()) ? 1 : 0);
            Iterator it5 = arrayList2.iterator();
            int size2 = 0;
            while (it5.hasNext()) {
                ArrayList arrayListO4 = n67.o(m77.o((oz3) it5.next()));
                size2 += arrayListO4 != null ? arrayListO4.size() : 1;
            }
            int i5 = size2 + i3 + i4;
            boolean z4 = this.a;
            if (a().size() != i5) {
                StringBuilder sb = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                sb.append(this.b.a().size());
                sb.append(" != ");
                sb.append(i5);
                sb.append("\nCalling: ");
                sb.append(zi0Var);
                List listA = this.b.a();
                sb.append("\nParameter types: ");
                sb.append(listA);
                sb.append(")\nDefault: ");
                sb.append(z4);
                throw new kz3(sb.toString());
            }
            yk3 yk3VarB0 = ct1.b0(Math.max(i2, 0), arrayList2.size() + i2);
            List[] listArr = new List[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = yk3VarB0.m;
                if (i6 > yk3VarB0.n || i7 > i6) {
                    listO = null;
                } else {
                    g07 g07VarO = m77.o((oz3) arrayList2.get(i6 - i2));
                    listO = n67.o(g07VarO);
                    if (listO == null) {
                        Class clsW2 = n67.w(g07VarO);
                        if (clsW2 == null || (methodN = n67.n(clsW2, zi0Var)) == null) {
                            listO = null;
                        } else {
                            listO = qf0.K(methodN);
                        }
                    }
                }
                listArr[i6] = listO;
            }
            y58Var = new y58(yk3VarB0, listArr, declaredMethod);
        }
        this.d = y58Var;
        sa4 sa4VarT = qf0.t();
        mj0 mj0Var2 = this.b;
        int length = mj0Var2 instanceof ak0 ? ((ak0) mj0Var2).g.length : mj0Var2 instanceof zj0 ? 1 : 0;
        if (length > 0) {
            sa4VarT.add(ct1.b0(0, length));
        }
        List[] listArr2 = (List[]) y58Var.f2579o;
        int length2 = listArr2.length;
        int i8 = 0;
        while (i8 < length2) {
            List list = listArr2[i8];
            int size3 = (list != null ? list.size() : 1) + length;
            sa4VarT.add(ct1.b0(length, size3));
            i8++;
            length = size3;
        }
        this.e = (yk3[]) qf0.r(sa4VarT).toArray(new yk3[0]);
        Iterable iterable = (yk3) this.d.n;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it6 = iterable.iterator();
            while (true) {
                xk3 xk3Var = (xk3) it6;
                if (!xk3Var.f2526o) {
                    break;
                }
                List list2 = ((List[]) this.d.f2579o)[xk3Var.nextInt()];
                if (list2 != null && list2.size() > 1) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f = z2;
    }

    @Override // o.mj0
    public final List a() {
        return this.b.a();
    }

    @Override // o.mj0
    public final Member b() {
        return this.c;
    }

    public final yk3 c(int i) {
        yk3[] yk3VarArr = this.e;
        if (i >= 0 && i < yk3VarArr.length) {
            return yk3VarArr[i];
        }
        if (yk3VarArr.length == 0) {
            return new yk3(i, i, 1);
        }
        int length = ((yk3) cx.a1(yk3VarArr)).n + 1 + (i - yk3VarArr.length);
        return new yk3(length, length, 1);
    }

    @Override // o.mj0
    public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objE;
        Object objE2;
        objArr.getClass();
        y58 y58Var = this.d;
        yk3 yk3Var = (yk3) y58Var.n;
        List[] listArr = (List[]) y58Var.f2579o;
        Method method = (Method) y58Var.p;
        boolean zIsEmpty = yk3Var.isEmpty();
        int i = yk3Var.n;
        int i2 = yk3Var.m;
        if (!zIsEmpty) {
            if (this.f) {
                sa4 sa4Var = new sa4(objArr.length);
                for (int i3 = 0; i3 < i2; i3++) {
                    sa4Var.add(objArr[i3]);
                }
                if (i2 <= i) {
                    while (true) {
                        List<Method> list = listArr[i2];
                        Object obj = objArr[i2];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objE2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    returnType.getClass();
                                    objE2 = pa8.e(returnType);
                                }
                                sa4Var.add(objE2);
                            }
                        } else {
                            sa4Var.add(obj);
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                int i4 = i + 1;
                int length = objArr.length - 1;
                if (i4 <= length) {
                    while (true) {
                        sa4Var.add(objArr[i4]);
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
                objArr = qf0.r(sa4Var).toArray(new Object[0]);
            } else {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    if (i5 > i || i2 > i5) {
                        objE = objArr[i5];
                    } else {
                        List list2 = listArr[i5];
                        Method method3 = list2 != null ? (Method) lv0.F0(list2) : null;
                        objE = objArr[i5];
                        if (method3 != null) {
                            if (objE != null) {
                                objE = method3.invoke(objE, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                returnType2.getClass();
                                objE = pa8.e(returnType2);
                            }
                        }
                    }
                    objArr2[i5] = objE;
                }
                objArr = objArr2;
            }
        }
        Object objCall = this.b.call(objArr);
        return (objCall == ne1.m || method == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // o.mj0
    public final Type getReturnType() {
        return this.b.getReturnType();
    }
}
