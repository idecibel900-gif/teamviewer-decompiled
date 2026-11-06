package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class c24 implements Function0 {
    public final /* synthetic */ byte m = 0;
    public final yc4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g24 f480o;

    public c24(g24 g24Var, yc4 yc4Var) {
        this.f480o = g24Var;
        this.n = yc4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [o.un3, o.wr0, o.zw2] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [o.g24] */
    /* JADX WARN: Type inference failed for: r8v6, types: [o.g24] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws IllegalAccessException, InvocationTargetException {
        a86 a86Var;
        ns4 ns4Var;
        Class cls;
        ArrayList arrayList;
        n58 n58Var;
        List listM;
        ?? arrayList2;
        ?? r9;
        ?? r8;
        vd5 vd5Var;
        List listD;
        byte b = this.m;
        yc4 yc4Var = this.n;
        switch (b) {
            case 0:
                tp tpVar = yl7.p;
                g24 g24Var = this.f480o;
                a86 a86Var2 = g24Var.f850o;
                yc4 yc4Var2 = g24Var.b;
                ns4 ns4Var2 = g24Var.n;
                Constructor<?>[] declaredConstructors = a86Var2.a.getDeclaredConstructors();
                declaredConstructors.getClass();
                boolean z = false;
                List<d86> listL0 = bq6.l0(new h18(new fl2(cx.A0(declaredConstructors), false, v76.n), w76.n));
                ArrayList arrayList3 = new ArrayList(listL0.size());
                for (d86 d86Var : listL0) {
                    un3 un3VarS0 = un3.S0(ns4Var2, ep1.D(yc4Var2, d86Var), z, d82.z(d86Var));
                    yc4 yc4Var3 = new yc4((io3) yc4Var2.m, new x24(yc4Var2, un3VarS0, d86Var, ns4Var2.k0().size()), (u14) yc4Var2.f2598o);
                    Constructor constructor = d86Var.a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    if (genericParameterTypes.length == 0) {
                        listD = ea2.m;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) cx.L0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            yq4.t(constructor, "Illegal generic signature: ");
                            return null;
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) cx.L0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listD = d86Var.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    os2 os2VarU = s24.u(yc4Var3, un3VarS0, listD);
                    List listK0 = ns4Var2.k0();
                    listK0.getClass();
                    ArrayList typeParameters = d86Var.getTypeParameters();
                    ArrayList arrayList4 = new ArrayList(mv0.Z(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        g24 g24Var2 = g24Var;
                        d58 d58VarB = ((f58) yc4Var3.n).b((o86) it.next());
                        d58VarB.getClass();
                        arrayList4.add(d58VarB);
                        g24Var = g24Var2;
                    }
                    un3VarS0.Q0(os2VarU.a, h57.y(d86Var.e()), lv0.A0(listK0, arrayList4));
                    un3VarS0.J0(false);
                    un3VarS0.K0(os2VarU.b);
                    un3VarS0.L0(ns4Var2.W());
                    arrayList3.add(un3VarS0);
                    g24Var = g24Var;
                    z = false;
                }
                g24 g24Var3 = g24Var;
                boolean zG = a86Var2.g();
                Class cls2 = a86Var2.a;
                n58 n58Var2 = n58.n;
                if (zG) {
                    Object obj = yc4Var2.m;
                    un3 un3VarS1 = un3.S0(ns4Var2, tpVar, true, d82.z(a86Var2));
                    ArrayList<m86> arrayListF = a86Var2.f();
                    ArrayList arrayList5 = new ArrayList(arrayListF.size());
                    boolean z2 = false;
                    Object obj2 = null;
                    po3 po3VarI = lq1.I(n58Var2, false, null, 6);
                    int i = 0;
                    for (m86 m86Var : arrayListF) {
                        ArrayList arrayList6 = arrayList5;
                        Class cls3 = cls2;
                        un3 un3Var = un3VarS1;
                        arrayList6.add(new qb8(un3Var, null, i, tpVar, m86Var.c(), ((iu) yc4Var2.q).V(m86Var.f(), po3VarI), false, false, false, null, d82.z(m86Var)));
                        arrayList3 = arrayList3;
                        arrayList5 = arrayList6;
                        un3VarS1 = un3Var;
                        i++;
                        a86Var2 = a86Var2;
                        cls2 = cls3;
                        po3VarI = po3VarI;
                        ns4Var2 = ns4Var2;
                        n58Var2 = n58Var2;
                        z2 = false;
                        obj2 = null;
                    }
                    a86Var = a86Var2;
                    ns4Var = ns4Var2;
                    cls = cls2;
                    n58Var = n58Var2;
                    ArrayList arrayList7 = arrayList5;
                    wr0 wr0Var = un3VarS1;
                    arrayList = arrayList3;
                    wr0Var.K0(z2);
                    cp1 cp1VarE = ns4Var.e();
                    cp1VarE.getClass();
                    if (cp1VarE.equals(ao3.b)) {
                        cp1VarE = ao3.c;
                        cp1VarE.getClass();
                    }
                    wr0Var.P0(arrayList7, cp1VarE);
                    wr0Var.J0(z2);
                    wr0Var.L0(ns4Var.W());
                    String strE = io1.E(wr0Var, 2);
                    if (arrayList.isEmpty()) {
                        arrayList.add(wr0Var);
                        Object obj3 = yc4Var.m;
                    } else {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                arrayList.add(wr0Var);
                                Object obj4 = yc4Var.m;
                            }
                        } while (!io1.E((wr0) it2.next(), 2).equals(strE));
                    }
                } else {
                    a86Var = a86Var2;
                    ns4Var = ns4Var2;
                    cls = cls2;
                    arrayList = arrayList3;
                    n58Var = n58Var2;
                }
                ns4Var.getClass();
                yc4Var.getClass();
                rk5 rk5Var = ((io3) yc4Var.m).k;
                if (arrayList.isEmpty()) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (zIsAnnotation) {
                        Object obj5 = yc4Var2.m;
                        iu iuVar = (iu) yc4Var2.q;
                        ns4 ns4Var3 = ns4Var;
                        ?? S0 = un3.S0(ns4Var3, tpVar, true, d82.z(a86Var));
                        if (zIsAnnotation) {
                            List listD2 = a86Var.d();
                            arrayList2 = new ArrayList(listD2.size());
                            po3 po3VarI2 = lq1.I(n58Var, true, null, 6);
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList<j86> arrayList9 = new ArrayList();
                            for (Object obj6 : listD2) {
                                if (im3.n(((j86) obj6).c(), tr3.b)) {
                                    arrayList8.add(obj6);
                                } else {
                                    arrayList9.add(obj6);
                                }
                            }
                            arrayList8.size();
                            j86 j86Var = (j86) lv0.o0(arrayList8);
                            if (j86Var != null) {
                                n86 n86VarF = j86Var.f();
                                if (n86VarF instanceof u76) {
                                    u76 u76Var = (u76) n86VarF;
                                    vd5Var = new vd5(iuVar.U(u76Var, po3VarI2, true), iuVar.V(u76Var.b, po3VarI2));
                                } else {
                                    vd5Var = new vd5(iuVar.V(n86VarF, po3VarI2), null);
                                }
                                ?? r10 = g24Var3;
                                r10.v(arrayList2, S0, 0, j86Var, (oz3) vd5Var.m, (oz3) vd5Var.n);
                                r8 = r10;
                            } else {
                                r8 = g24Var3;
                            }
                            int i2 = j86Var != null ? 1 : 0;
                            int i3 = 0;
                            for (j86 j86Var2 : arrayList9) {
                                r8.v(arrayList2, S0, i3 + i2, j86Var2, iuVar.V(j86Var2.f(), po3VarI2), null);
                                i3++;
                            }
                        } else {
                            arrayList2 = Collections.EMPTY_LIST;
                        }
                        S0.K0(false);
                        cp1 cp1VarE2 = ns4Var3.e();
                        cp1VarE2.getClass();
                        if (cp1VarE2.equals(ao3.b)) {
                            cp1VarE2 = ao3.c;
                            cp1VarE2.getClass();
                        }
                        S0.P0(arrayList2, cp1VarE2);
                        S0.J0(true);
                        S0.L0(ns4Var3.W());
                        r9 = S0;
                    } else {
                        r9 = 0;
                    }
                    listM = qf0.M(r9);
                } else {
                    listM = arrayList;
                }
                return lv0.P0(rk5Var.k(yc4Var, listM));
            default:
                this.f480o.n.getClass();
                yc4Var.getClass();
                return lv0.T0(new ArrayList());
        }
    }

    public c24(yc4 yc4Var, g24 g24Var) {
        this.n = yc4Var;
        this.f480o = g24Var;
    }
}
