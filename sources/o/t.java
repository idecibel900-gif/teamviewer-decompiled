package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements Function1 {
    public final /* synthetic */ byte m;
    public final Object n;

    public t(ns4 ns4Var, x06 x06Var, g07 g07Var, po3 po3Var) {
        this.m = (byte) 28;
        this.n = ns4Var;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0301  */
    /* JADX WARN: Code duplicated, block: B:168:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:172:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:212:0x0485  */
    /* JADX WARN: Code duplicated, block: B:377:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List parameters;
        List listM0;
        z2 z2Var;
        um2 um2VarL;
        boolean z;
        boolean z2;
        boolean zIsEmpty;
        ht2 ht2VarC;
        Object next;
        ad5 ad5Var;
        fp1 fp1Var;
        ad5 ad5Var2;
        Object next2;
        byte b = this.m;
        byte b2 = 0;
        Object[] objArr = 0;
        zl3 zl3Var = null;
        f88 f88Var = f88.a;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                r86 r86Var = (r86) obj;
                r86Var.getClass();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                cj3 cj3Var = new cj3((d11) obj2, map, map2);
                Class cls = r86Var.a;
                j1 j1VarV = hm3.v(cls.getDeclaredMethods());
                while (j1VarV.hasNext()) {
                    Method method = (Method) j1VarV.next();
                    sy4 sy4VarE = sy4.e(method.getName());
                    StringBuilder sb = new StringBuilder("(");
                    j1 j1VarV2 = hm3.v(method.getParameterTypes());
                    while (j1VarV2.hasNext()) {
                        Class cls2 = (Class) j1VarV2.next();
                        cls2.getClass();
                        sb.append(p76.b(cls2));
                    }
                    sb.append(")");
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    sb.append(p76.b(returnType));
                    String string = sb.toString();
                    String strB = sy4VarE.b();
                    strB.getClass();
                    j93 j93Var = new j93(cj3Var, new bp4(strB.concat(string)));
                    j1 j1VarV3 = hm3.v(method.getDeclaredAnnotations());
                    while (j1VarV3.hasNext()) {
                        Annotation annotation = (Annotation) j1VarV3.next();
                        annotation.getClass();
                        vs1.P(j93Var, annotation);
                    }
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    parameterAnnotations.getClass();
                    Annotation[][] annotationArr = parameterAnnotations;
                    int length = annotationArr.length;
                    for (int i = 0; i < length; i++) {
                        j1 j1VarV4 = hm3.v(annotationArr[i]);
                        while (j1VarV4.hasNext()) {
                            Annotation annotation2 = (Annotation) j1VarV4.next();
                            Class clsZ = et1.z(et1.x(annotation2));
                            io.sentry.android.core.d dVarE0 = j93Var.e0(i, p76.a(clsZ), new o76(annotation2));
                            if (dVarE0 != null) {
                                vs1.Q(dVarE0, annotation2, clsZ);
                            }
                        }
                    }
                    j93Var.a();
                }
                j1 j1VarV5 = hm3.v(cls.getDeclaredConstructors());
                while (j1VarV5.hasNext()) {
                    Constructor constructor = (Constructor) j1VarV5.next();
                    sy4 sy4Var = a87.e;
                    constructor.getClass();
                    StringBuilder sb2 = new StringBuilder("(");
                    j1 j1VarV6 = hm3.v(constructor.getParameterTypes());
                    while (j1VarV6.hasNext()) {
                        Class cls3 = (Class) j1VarV6.next();
                        cls3.getClass();
                        sb2.append(p76.b(cls3));
                    }
                    sb2.append(")V");
                    String string2 = sb2.toString();
                    sy4Var.getClass();
                    String strB2 = sy4Var.b();
                    strB2.getClass();
                    j93 j93Var2 = new j93(cj3Var, new bp4(strB2.concat(string2)));
                    j1 j1VarV7 = hm3.v(constructor.getDeclaredAnnotations());
                    while (j1VarV7.hasNext()) {
                        Annotation annotation3 = (Annotation) j1VarV7.next();
                        annotation3.getClass();
                        vs1.P(j93Var2, annotation3);
                    }
                    Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                    parameterAnnotations2.getClass();
                    if (parameterAnnotations2.length != 0) {
                        int length2 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                        int length3 = parameterAnnotations2.length;
                        for (int i2 = b2; i2 < length3; i2++) {
                            j1 j1VarV8 = hm3.v(parameterAnnotations2[i2]);
                            while (j1VarV8.hasNext()) {
                                Annotation annotation4 = (Annotation) j1VarV8.next();
                                Class clsZ2 = et1.z(et1.x(annotation4));
                                Class cls4 = cls;
                                j1 j1Var = j1VarV5;
                                io.sentry.android.core.d dVarE1 = j93Var2.e0(i2 + length2, p76.a(clsZ2), new o76(annotation4));
                                if (dVarE1 != null) {
                                    vs1.Q(dVarE1, annotation4, clsZ2);
                                }
                                cls = cls4;
                                j1VarV5 = j1Var;
                            }
                        }
                    }
                    Class cls5 = cls;
                    j1 j1Var2 = j1VarV5;
                    j93Var2.a();
                    b2 = 0;
                    cls = cls5;
                    j1VarV5 = j1Var2;
                }
                j1 j1VarV9 = hm3.v(cls.getDeclaredFields());
                while (j1VarV9.hasNext()) {
                    Field field = (Field) j1VarV9.next();
                    sy4 sy4VarE2 = sy4.e(field.getName());
                    Class<?> type = field.getType();
                    type.getClass();
                    String strB3 = p76.b(type);
                    String strB4 = sy4VarE2.b();
                    strB4.getClass();
                    bp4 bp4Var = new bp4(strB4 + '#' + strB3);
                    ArrayList arrayList = new ArrayList();
                    j1 j1VarV10 = hm3.v(field.getDeclaredAnnotations());
                    while (j1VarV10.hasNext()) {
                        Annotation annotation5 = (Annotation) j1VarV10.next();
                        annotation5.getClass();
                        Class clsZ3 = et1.z(et1.x(annotation5));
                        io.sentry.android.core.d dVarI = ((d11) cj3Var.n).I(p76.a(clsZ3), new o76(annotation5), arrayList);
                        if (dVarI != null) {
                            vs1.Q(dVarI, annotation5, clsZ3);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ((HashMap) cj3Var.f531o).put(bp4Var, arrayList);
                    }
                }
                return new vp(map, map2, map3);
            case 1:
                ((uz3) obj).getClass();
                return (g07) ((c0) obj2).n.n.a();
            case 2:
                ds3 ds3Var = (ds3) obj2;
                ht2 ht2Var = (ht2) obj;
                ht2Var.getClass();
                eg0 eg0VarC = ds3Var.c(ht2Var);
                if (eg0VarC == null) {
                    return null;
                }
                io.sentry.android.replay.screenshot.k kVar = ds3Var.c;
                if (kVar != null) {
                    eg0VarC.E0(kVar);
                    return eg0VarC;
                }
                im3.e0("components");
                throw null;
            case 3:
                zz6 zz6Var = (zz6) obj2;
                z2 z2Var2 = (z2) obj;
                z2Var2.getClass();
                vo3 vo3Var = z2Var2.b;
                sz3 sz3Var = z2Var2.a;
                if ((zz6Var.b && sz3Var != null && db8.a0(sz3Var)) || sz3Var == null) {
                    return null;
                }
                g07 g07VarM = db8.m(sz3Var);
                if (g07VarM == null && ((um2VarL = db8.l(sz3Var)) == null || (g07VarM = db8.h0(um2VarL)) == null)) {
                    g07VarM = db8.m(sz3Var);
                    g07VarM.getClass();
                }
                k48 k48VarK0 = db8.K0(g07VarM);
                if (k48VarK0 == null) {
                    return null;
                }
                if (k48VarK0 instanceof k48) {
                    parameters = k48VarK0.getParameters();
                    parameters.getClass();
                } else {
                    StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb3.append(k48VarK0);
                    sb3.append(", ");
                    gk0.h(ua5.o(w86.a, k48VarK0.getClass(), sb3));
                    parameters = null;
                }
                sz3Var.getClass();
                if (sz3Var instanceof oz3) {
                    listM0 = ((oz3) sz3Var).m0();
                } else {
                    StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb4.append(sz3Var);
                    sb4.append(", ");
                    gk0.h(ua5.o(w86.a, sz3Var.getClass(), sb4));
                    listM0 = null;
                }
                Iterator it = parameters.iterator();
                Iterator it2 = listM0.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(mv0.Z(parameters, 10), mv0.Z(listM0, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    Object next3 = it.next();
                    h58 h58Var = (h58) it2.next();
                    d58 d58Var = (d58) next3;
                    if (db8.b0(h58Var)) {
                        z2Var = new z2(null, vo3Var, d58Var);
                    } else {
                        m98 m98VarC = db8.C(h58Var);
                        z2Var = new z2(m98VarC, ((io3) ((yc4) zz6Var.d).m).j.b(vo3Var, m98VarC.getAnnotations()), d58Var);
                    }
                    arrayList2.add(z2Var);
                }
                return arrayList2;
            case 4:
                eq1 eq1Var = (eq1) obj2;
                m98 m98Var = (m98) obj;
                m98Var.getClass();
                if (ct1.K(m98Var)) {
                    z = false;
                } else {
                    ys0 ys0VarA = m98Var.o0().a();
                    if (!(ys0VarA instanceof d58) || im3.n(((d58) ys0VarA).i(), eq1Var)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                d3 d3Var = (d3) obj2;
                c3 c3Var = (c3) obj;
                c3Var.getClass();
                jk0 jk0VarG = d3Var.g();
                Collection collection = c3Var.a;
                jk0VarG.getClass();
                collection.getClass();
                if (collection.isEmpty()) {
                    oz3 oz3VarF = d3Var.f();
                    List listK = oz3VarF != null ? qf0.K(oz3VarF) : null;
                    if (listK == null) {
                        listK = ea2.m;
                    }
                    collection = listK;
                }
                List listP0 = collection instanceof List ? (List) collection : null;
                if (listP0 == null) {
                    listP0 = lv0.P0(collection);
                }
                List listK2 = d3Var.k(listP0);
                listK2.getClass();
                c3Var.b = listK2;
                return f88Var;
            case 6:
                ((c7) obj2).a();
                return f88Var;
            case 7:
                il5.k((il5) obj, (jl5) obj2, 0, 0);
                return f88Var;
            case 8:
                ((c7) obj2).a();
                return f88Var;
            case ep1.b /* 9 */:
                ((c7) obj2).a();
                return f88Var;
            case ep1.c /* 10 */:
                ((hl0) obj2).cancel();
                return f88Var;
            case 11:
                ((zi0) obj).getClass();
                return Boolean.valueOf(y77.i.containsKey(io1.F((c07) obj2)));
            case ep1.d /* 12 */:
                ((a46) obj2).cancel();
                return f88Var;
            case 13:
                j86 j86Var = (j86) obj;
                j86Var.getClass();
                if (((Boolean) ((zr0) obj2).b.invoke(j86Var)).booleanValue()) {
                    Class<?> declaringClass = ((Method) j86Var.b()).getDeclaringClass();
                    declaringClass.getClass();
                    if (declaringClass.isInterface()) {
                        String strB5 = j86Var.c().b();
                        int iHashCode = strB5.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strB5.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) j86Var.g()).isEmpty();
                                }
                            } else if (strB5.equals("equals")) {
                                p86 p86Var = (p86) lv0.H0(j86Var.g());
                                n86 n86Var = p86Var != null ? p86Var.a : null;
                                c86 c86Var = n86Var instanceof c86 ? (c86) n86Var : null;
                                if (c86Var != null) {
                                    vn3 vn3Var = c86Var.b;
                                    if ((vn3Var instanceof a86) && (ht2VarC = ((a86) vn3Var).c()) != null && ht2VarC.b().equals("java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strB5.equals("toString")) {
                            zIsEmpty = ((ArrayList) j86Var.g()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        z2 = zIsEmpty ? false : true;
                    }
                }
                return Boolean.valueOf(z2);
            case 14:
                es0 es0Var = (es0) obj2;
                ds0 ds0Var = (ds0) obj;
                ds0Var.getClass();
                js0 js0Var = ds0Var.a;
                io.sentry.android.replay.screenshot.k kVar2 = es0Var.a;
                Iterator it3 = ((Iterable) kVar2.k).iterator();
                while (it3.hasNext()) {
                    ns4 ns4VarC = ((bs0) it3.next()).c(js0Var);
                    if (ns4VarC != null) {
                        return ns4VarC;
                    }
                }
                if (es0.c.contains(js0Var)) {
                    return null;
                }
                xr0 xr0VarC = ds0Var.b;
                if (xr0VarC == null && (xr0VarC = ((yr0) kVar2.d).c(js0Var)) == null) {
                    return null;
                }
                ty4 ty4Var = xr0VarC.a;
                tu5 tu5Var = xr0VarC.b;
                h60 h60Var = xr0VarC.c;
                s67 s67Var = xr0VarC.d;
                js0 js0VarE = js0Var.e();
                if (js0VarE != null) {
                    ns4 ns4VarA = es0Var.a(js0VarE, null);
                    pp1 pp1Var = ns4VarA instanceof pp1 ? (pp1) ns4VarA : null;
                    if (pp1Var == null) {
                        return null;
                    }
                    if (!pp1Var.C0().m().contains(js0Var.f())) {
                        return null;
                    }
                    fp1Var = pp1Var.x;
                } else {
                    dd5 dd5Var = (dd5) kVar2.f;
                    ht2 ht2Var2 = js0Var.a;
                    dd5Var.getClass();
                    ht2Var2.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    dd5Var.b(ht2Var2, arrayList3);
                    Iterator it4 = arrayList3.iterator();
                    do {
                        if (it4.hasNext()) {
                            next = it4.next();
                            ad5Var2 = (ad5) next;
                            if (ad5Var2 instanceof eg0) {
                            }
                        } else {
                            next = null;
                        }
                        ad5Var = (ad5) next;
                        if (ad5Var == null) {
                            return null;
                        }
                        gw5 gw5Var = tu5Var.Q;
                        gw5Var.getClass();
                        d22 d22Var = new d22(gw5Var);
                        ed8 ed8Var = ed8.b;
                        nw5 nw5Var = tu5Var.S;
                        nw5Var.getClass();
                        ed8 ed8VarM = l47.m(nw5Var);
                        ty4Var.getClass();
                        fp1Var = new fp1(kVar2, ty4Var, ad5Var, d22Var, ed8VarM, h60Var, (rp1) null, (q48) null, ea2.m);
                    } while (!((aq1) ((eg0) ad5Var2).I()).m().contains(js0Var.f()));
                    ad5Var = (ad5) next;
                    if (ad5Var == null) {
                        return null;
                    }
                    gw5 gw5Var2 = tu5Var.Q;
                    gw5Var2.getClass();
                    d22 d22Var2 = new d22(gw5Var2);
                    ed8 ed8Var2 = ed8.b;
                    nw5 nw5Var2 = tu5Var.S;
                    nw5Var2.getClass();
                    ed8 ed8VarM2 = l47.m(nw5Var2);
                    ty4Var.getClass();
                    fp1Var = new fp1(kVar2, ty4Var, ad5Var, d22Var2, ed8VarM2, h60Var, (rp1) null, (q48) null, ea2.m);
                }
                return new pp1(fp1Var, tu5Var, ty4Var, h60Var, s67Var);
            case 15:
                ps4 ps4Var = (ps4) obj;
                ps4Var.getClass();
                return ps4Var.h().q((ps5) obj2);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                zi0 zi0Var = (zi0) obj;
                if (zi0Var != null) {
                    ((vo1) obj2).d.i(zi0Var);
                    return f88Var;
                }
                hk0.g("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                return null;
            case 17:
                zl3 zl3Var2 = (zl3) obj2;
                uz3 uz3Var = (uz3) obj;
                uz3Var.getClass();
                LinkedHashSet linkedHashSet = zl3Var2.b;
                ArrayList arrayList4 = new ArrayList(mv0.Z(linkedHashSet, 10));
                Iterator it5 = linkedHashSet.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(((oz3) it5.next()).q0(uz3Var));
                    objArr = 1;
                }
                if (objArr != 0) {
                    oz3 oz3Var = zl3Var2.a;
                    oz3 oz3VarQ0 = oz3Var != null ? oz3Var.q0(uz3Var) : null;
                    arrayList4.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList4);
                    linkedHashSet2.hashCode();
                    zl3 zl3Var3 = new zl3(linkedHashSet2);
                    zl3Var3.a = oz3VarQ0;
                    zl3Var = zl3Var3;
                }
                if (zl3Var != null) {
                    zl3Var2 = zl3Var;
                }
                return zl3Var2.e();
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                vd5 vd5Var = (vd5) obj;
                vd5Var.getClass();
                String str = (String) vd5Var.m;
                String str2 = (String) vd5Var.n;
                List listK3 = qf0.K(rp.a(((bs3) obj2).m.p, fx3.h("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), str2 + "()", "HIDDEN"));
                return listK3.isEmpty() ? yl7.p : new wp(listK3, b2);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                z14 z14Var = (z14) obj2;
                q76 q76Var = (q76) obj;
                q76Var.getClass();
                sy4 sy4Var2 = qn3.a;
                return qn3.b(z14Var.m, q76Var, z14Var.f2662o);
            case 20:
                b24 b24Var = (b24) obj2;
                ((uz3) obj).getClass();
                return new g24(b24Var.v, b24Var, b24Var.t, b24Var.u != null, b24Var.C);
            case 21:
                zo4 zo4Var = (zo4) obj;
                zo4Var.getClass();
                return zo4Var.d((sy4) obj2, t35.q);
            case 22:
                x24 x24Var = (x24) obj2;
                o86 o86Var = (o86) obj;
                o86Var.getClass();
                LinkedHashMap linkedHashMap = x24Var.p;
                fi1 fi1Var = x24Var.n;
                Integer num = (Integer) linkedHashMap.get(o86Var);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                yc4 yc4Var = x24Var.m;
                yc4Var.getClass();
                return new w24(pm8.o(new yc4((io3) yc4Var.m, x24Var, (u14) yc4Var.f2598o), fi1Var.getAnnotations()), o86Var, x24Var.f2473o + iIntValue, fi1Var);
            case 23:
                qs4 qs4Var = (qs4) obj2;
                ht2 ht2Var3 = (ht2) obj;
                ht2Var3.getClass();
                kd5 kd5Var = qs4Var.r;
                xd4 xd4Var = qs4Var.f1860o;
                ((jd5) kd5Var).getClass();
                xd4Var.getClass();
                return new b54(qs4Var, ht2Var3, xd4Var);
            case 24:
                ht2 ht2Var4 = (ht2) obj;
                ht2Var4.getClass();
                Map map4 = (Map) ((a65) obj2).n;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : map4.entrySet()) {
                    ht2 ht2Var5 = (ht2) entry.getKey();
                    if (!ht2Var4.equals(ht2Var5)) {
                        ht2Var5.getClass();
                        if (im3.n(ht2Var4.d() ? null : ht2Var4.e(), ht2Var5)) {
                        }
                    }
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap2 = null;
                }
                if (linkedHashMap2 == null) {
                    return null;
                }
                Iterator it6 = linkedHashMap2.entrySet().iterator();
                if (it6.hasNext()) {
                    next2 = it6.next();
                    if (it6.hasNext()) {
                        int length4 = vt1.N((ht2) ((Map.Entry) next2).getKey(), ht2Var4).b().length();
                        do {
                            Object next4 = it6.next();
                            int length5 = vt1.N((ht2) ((Map.Entry) next4).getKey(), ht2Var4).b().length();
                            if (length4 > length5) {
                                next2 = next4;
                                length4 = length5;
                            }
                        } while (it6.hasNext());
                    }
                } else {
                    next2 = null;
                }
                Map.Entry entry2 = (Map.Entry) next2;
                if (entry2 != null) {
                    return entry2.getValue();
                }
                return null;
            case 25:
                obj.getClass();
                ((v17) obj2).add(obj);
                return f88Var;
            case 26:
                ((c7) obj2).a();
                return f88Var;
            case 27:
                ((gl0) obj2).resumeWith(f88Var);
                return f88Var;
            case 28:
                ((uz3) obj).getClass();
                bp1.f((ns4) obj2);
                return null;
            default:
                ((g16) obj2).a();
                return f88Var;
        }
    }

    public /* synthetic */ t(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
