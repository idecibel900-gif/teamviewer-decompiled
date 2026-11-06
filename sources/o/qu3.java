package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class qu3 implements Function0 {
    public final /* synthetic */ byte m;
    public final ru3 n;

    public /* synthetic */ qu3(ru3 ru3Var, byte b) {
        this.m = b;
        this.n = ru3Var;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:? A[LOOP:2: B:35:0x00cd->B:160:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x0216  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00e8, please report this as an issue */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        ck0 ck0VarB;
        GenericDeclaration declaredConstructor;
        ck0 ck0VarB2;
        fi1 fi1VarI;
        Member memberB;
        jm2 jm2Var;
        Object next;
        List listJ;
        Iterator it;
        xw2 xw2Var;
        byte b = this.m;
        ru3 ru3Var = this.n;
        Object objI = null;
        switch (b) {
            case 0:
                js0 js0Var = og6.a;
                xw2 xw2VarW = ru3Var.w();
                ou3 ou3Var = ru3Var.r;
                it1 it1VarC = og6.c(xw2VarW);
                boolean z = it1VarC instanceof ls3;
                cp cpVar = cp.n;
                if (z) {
                    if (ru3Var.y()) {
                        Class clsA = ou3Var.a();
                        List parameters = ru3Var.getParameters();
                        ArrayList arrayList = new ArrayList(mv0.Z(parameters, 10));
                        Iterator it2 = parameters.iterator();
                        while (it2.hasNext()) {
                            String name = ((pv3) it2.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new ep(clsA, arrayList, cpVar);
                    }
                    String str = ((ls3) it1VarC).d.f;
                    ou3Var.getClass();
                    str.getClass();
                    Class clsA2 = ou3Var.a();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) ou3Var.w(str, false).n).toArray(new Class[0]);
                        objI = clsA2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                        break;
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (it1VarC instanceof ms3) {
                    xw2 xw2VarW2 = ru3Var.w();
                    fi1 fi1VarI2 = xw2VarW2.i();
                    fi1VarI2.getClass();
                    if (pi3.c(fi1VarI2) && (xw2VarW2 instanceof z61) && ((z61) xw2VarW2).t()) {
                        xw2 xw2VarW3 = ru3Var.w();
                        String str2 = ((ms3) it1VarC).d.f;
                        List listJ2 = ru3Var.w().J();
                        listJ2.getClass();
                        return new hb8(xw2VarW3, ou3Var, str2, listJ2);
                    }
                    os3 os3Var = ((ms3) it1VarC).d;
                    objI = ou3Var.i(os3Var.e, os3Var.f);
                } else if (it1VarC instanceof ks3) {
                    objI = ((ks3) it1VarC).d;
                } else {
                    if (!(it1VarC instanceof js3)) {
                        if (!(it1VarC instanceof is3)) {
                            gk0.s();
                            return null;
                        }
                        List list = ((is3) it1VarC).d;
                        Class clsA3 = ou3Var.a();
                        ArrayList arrayList2 = new ArrayList(mv0.Z(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((Method) it3.next()).getName());
                        }
                        return new ep(clsA3, arrayList2, cpVar, dp.m, list);
                    }
                    objI = ((js3) it1VarC).d;
                }
                if (objI instanceof Constructor) {
                    ck0VarB = ru3Var.A((Constructor) objI, ru3Var.w(), false);
                } else {
                    if (!(objI instanceof Method)) {
                        throw new kz3("Could not compute caller for function: " + ru3Var.w() + " (member = " + objI + ')');
                    }
                    Method method = (Method) objI;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        ck0VarB = ru3Var.z() ? new xj0(method, n67.i(ru3Var.t, ru3Var.w())) : new bk0((byte) 0, 6, method, false);
                    } else if (((g2) ru3Var.w()).getAnnotations().u(pa8.a) != null) {
                        ck0VarB = ru3Var.z() ? new yj0(method, false, 4) : new bk0((byte) 1, 4, method, true);
                    } else {
                        ck0VarB = ru3Var.B(method);
                    }
                }
                return n67.j(ru3Var.w(), ck0VarB, false);
            default:
                js0 js0Var2 = og6.a;
                xw2 xw2VarW4 = ru3Var.w();
                ou3 ou3Var2 = ru3Var.r;
                it1 it1VarC2 = og6.c(xw2VarW4);
                if (!(it1VarC2 instanceof ms3)) {
                    boolean z2 = it1VarC2 instanceof ls3;
                    cp cpVar2 = cp.m;
                    if (z2) {
                        if (ru3Var.y()) {
                            Class clsA4 = ou3Var2.a();
                            List parameters2 = ru3Var.getParameters();
                            ArrayList arrayList3 = new ArrayList(mv0.Z(parameters2, 10));
                            Iterator it4 = parameters2.iterator();
                            while (it4.hasNext()) {
                                String name2 = ((pv3) it4.next()).getName();
                                name2.getClass();
                                arrayList3.add(name2);
                            }
                            return new ep(clsA4, arrayList3, cpVar2);
                        }
                        String str3 = ((ls3) it1VarC2).d.f;
                        ou3Var2.getClass();
                        str3.getClass();
                        Class clsA5 = ou3Var2.a();
                        ArrayList arrayList4 = new ArrayList();
                        ou3.d(arrayList4, (ArrayList) ou3Var2.w(str3, false).n, true);
                        try {
                            Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                            declaredConstructor = clsA5.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = null;
                        }
                    } else if (it1VarC2 instanceof is3) {
                        List list2 = ((is3) it1VarC2).d;
                        Class clsA6 = ou3Var2.a();
                        ArrayList arrayList5 = new ArrayList(mv0.Z(list2, 10));
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(((Method) it5.next()).getName());
                        }
                        return new ep(clsA6, arrayList5, cpVar2, dp.m, list2);
                    }
                    declaredConstructor = null;
                    break;
                } else {
                    xw2 xw2VarW5 = ru3Var.w();
                    fi1 fi1VarI3 = xw2VarW5.i();
                    fi1VarI3.getClass();
                    if (pi3.c(fi1VarI3) && (xw2VarW5 instanceof z61) && ((z61) xw2VarW5).t()) {
                        throw new kz3(ru3Var.w().i() + " cannot have default arguments");
                    }
                    xw2 xw2VarW6 = ru3Var.w();
                    List listJ3 = xw2VarW6.J();
                    listJ3.getClass();
                    if (listJ3.isEmpty()) {
                        fi1VarI = xw2VarW6.i();
                        fi1VarI.getClass();
                        if (pi3.e(fi1VarI)) {
                            memberB = ru3Var.t().b();
                            memberB.getClass();
                            if (Modifier.isStatic(memberB.getModifiers())) {
                                jm2Var = new jm2(bp1.j(xw2VarW6));
                                while (true) {
                                    if (jm2Var.hasNext()) {
                                        next = jm2Var.next();
                                        listJ = ((zi0) next).J();
                                        listJ.getClass();
                                        if (listJ.isEmpty()) {
                                            it = listJ.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    continue;
                                                } else if (((qb8) it.next()).E0()) {
                                                }
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                if (next instanceof xw2) {
                                }
                            }
                        }
                    } else {
                        Iterator it6 = listJ3.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                fi1VarI = xw2VarW6.i();
                                fi1VarI.getClass();
                                if (pi3.e(fi1VarI)) {
                                    memberB = ru3Var.t().b();
                                    memberB.getClass();
                                    if (Modifier.isStatic(memberB.getModifiers())) {
                                        jm2Var = new jm2(bp1.j(xw2VarW6));
                                        while (true) {
                                            if (jm2Var.hasNext()) {
                                                next = jm2Var.next();
                                                listJ = ((zi0) next).J();
                                                listJ.getClass();
                                                if (listJ.isEmpty()) {
                                                    it = listJ.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            continue;
                                                        } else if (((qb8) it.next()).E0()) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        xw2Var = next instanceof xw2 ? (xw2) next : null;
                                    }
                                }
                            } else if (((qb8) it6.next()).E0()) {
                            }
                        }
                    }
                    if (xw2Var != null) {
                        os3 os3Var2 = ((ms3) og6.c(xw2Var)).d;
                        declaredConstructor = ou3Var2.h(true, os3Var2.e, os3Var2.f);
                    } else {
                        os3 os3Var3 = ((ms3) it1VarC2).d;
                        String str4 = os3Var3.e;
                        String str5 = os3Var3.f;
                        Member memberB2 = ru3Var.t().b();
                        memberB2.getClass();
                        declaredConstructor = ou3Var2.h(!Modifier.isStatic(memberB2.getModifiers()), str4, str5);
                    }
                }
                if (declaredConstructor instanceof Constructor) {
                    ck0VarB2 = ru3Var.A((Constructor) declaredConstructor, ru3Var.w(), true);
                } else if (!(declaredConstructor instanceof Method)) {
                    ck0VarB2 = null;
                } else if (((g2) ru3Var.w()).getAnnotations().u(pa8.a) != null) {
                    fi1 fi1VarI4 = ru3Var.w().i();
                    fi1VarI4.getClass();
                    if (((ns4) fi1VarI4).w0()) {
                        ck0VarB2 = ru3Var.B((Method) declaredConstructor);
                    } else {
                        Method method2 = (Method) declaredConstructor;
                        ck0VarB2 = ru3Var.z() ? new yj0(method2, false, 4) : new bk0((byte) 1, 4, method2, true);
                    }
                } else {
                    ck0VarB2 = ru3Var.B((Method) declaredConstructor);
                }
                if (ck0VarB2 != null) {
                    return n67.j(ru3Var.w(), ck0VarB2, true);
                }
                return null;
        }
    }
}
