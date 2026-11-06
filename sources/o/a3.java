package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class a3 implements Function0 {
    public final /* synthetic */ byte m;
    public final Object n;

    public /* synthetic */ a3(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:266:0x0705  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [o.zw4] */
    /* JADX WARN: Type inference failed for: r12v9, types: [o.zw4] */
    /* JADX WARN: Type inference failed for: r14v2, types: [o.v14] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, o.ix3] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.d48, o.xi0, o.xw2, o.zw2] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws IllegalAccessException, l58 {
        m58 m58VarD;
        m58 m58Var;
        List list;
        m58 m58Var2;
        Iterator it;
        m58 m58Var3;
        ?? r9;
        int iHashCode;
        Collection collection;
        oc2 oc2Var;
        mz3 mz3Var;
        bx bxVarA;
        byte b = this.m;
        ea2 ea2Var = ea2.m;
        fa2 fa2Var = fa2.m;
        int i = 10;
        int iHashCode2 = 0;
        m58 m58Var4 = null;
        Map mapSingletonMap = null;
        Map mapSingletonMap2 = null;
        Object obj = this.n;
        switch (b) {
            case 0:
                eq1 eq1Var = (eq1) obj;
                ns4 ns4VarD0 = eq1Var.D0();
                if (ns4VarD0 == null) {
                    return ea2Var;
                }
                Collection collectionZ = ns4VarD0.z();
                collectionZ.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = collectionZ.iterator();
                while (it2.hasNext()) {
                    wr0 wr0Var = (wr0) it2.next();
                    yi5 yi5Var = d48.S;
                    xd4 xd4Var = eq1Var.q;
                    wr0Var.getClass();
                    yi5Var.getClass();
                    tp tpVar = yl7.p;
                    xd4Var.getClass();
                    if (eq1Var.D0() == null) {
                        m58Var = m58Var4;
                    } else {
                        m58VarD = m58.d(eq1Var.E0());
                    }
                    if (m58Var == null) {
                        m58Var = m58VarD;
                        it = it2;
                        m58 m58Var5 = m58Var4;
                        m58Var3 = m58Var5;
                        r9 = m58Var5;
                    } else {
                        m58Var = m58VarD;
                        wr0 wr0VarD = wr0Var.d(m58Var);
                        if (wr0VarD == null) {
                            m58Var = m58VarD;
                            it = it2;
                            m58 m58Var6 = m58Var4;
                            m58Var3 = m58Var6;
                            r9 = m58Var6;
                        } else {
                            up annotations = wr0Var.getAnnotations();
                            int iK = wr0Var.k();
                            if (iK == 0) {
                                throw m58Var4;
                            }
                            s67 s67VarC = eq1Var.c();
                            s67VarC.getClass();
                            ?? d48Var = new d48(xd4Var, eq1Var, wr0VarD, null, annotations, iK, s67VarC);
                            List listJ = wr0Var.J();
                            if (listJ == null) {
                                ?? r22 = m58Var4;
                                zw2.z(28);
                                throw r22;
                            }
                            m58 m58Var7 = m58Var;
                            ArrayList arrayListG0 = zw2.G0(d48Var, listJ, m58Var7, false, false, null);
                            if (arrayListG0 == null) {
                                m58Var = m58VarD;
                                it = it2;
                                m58 m58Var8 = m58Var4;
                                m58Var3 = m58Var8;
                                r9 = m58Var8;
                            } else {
                                g07 g07VarT = x37.t(bt1.I(wr0VarD.s.r0()), eq1Var.W());
                                v14 v14Var = wr0Var.v;
                                ub8 ub8Var = ub8.f2197o;
                                Object objO = v14Var != null ? io1.O(d48Var, m58Var7.f(v14Var.getType(), ub8Var), tpVar) : m58Var4;
                                ns4 ns4VarD1 = eq1Var.D0();
                                if (ns4VarD1 != null) {
                                    List listX = wr0Var.X();
                                    listX.getClass();
                                    ArrayList arrayList2 = new ArrayList(mv0.Z(listX, i));
                                    int i2 = iHashCode2;
                                    m58 m58Var9 = m58Var4;
                                    for (Object obj2 : listX) {
                                        int i3 = i2 + 1;
                                        if (i2 < 0) {
                                            ?? r23 = m58Var9;
                                            qf0.U();
                                            throw r23;
                                        }
                                        v14 v14Var2 = (v14) obj2;
                                        oz3 oz3VarF = m58Var7.f(v14Var2.getType(), ub8Var);
                                        v46 v46VarD0 = v14Var2.D0();
                                        v46VarD0.getClass();
                                        Iterator it3 = it2;
                                        xb1 xb1Var = new xb1(ns4VarD1, oz3VarF, ((xb1) v46VarD0).B0());
                                        e96 e96Var = uy4.a;
                                        arrayList2.add(new v14(ns4VarD1, xb1Var, tpVar, sy4.e(uy4.b + '_' + i2)));
                                        it2 = it3;
                                        i2 = i3;
                                        m58Var9 = m58Var9;
                                    }
                                    list = arrayList2;
                                    m58Var2 = m58Var9;
                                } else {
                                    list = ea2Var;
                                    m58Var2 = m58Var4;
                                }
                                it = it2;
                                m58Var3 = m58Var2;
                                d48Var.H0(objO, null, list, eq1Var.k0(), arrayListG0, g07VarT, as4.n, eq1Var.r);
                                r9 = d48Var;
                            }
                        }
                    }
                    if (r9 != 0) {
                        arrayList.add(r9);
                    }
                    it2 = it;
                    m58Var4 = m58Var3;
                    i = 10;
                    iHashCode2 = 0;
                }
                return arrayList;
            case 1:
                return new c3(((d3) obj).e());
            case 2:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                e3 e3Var = (e3) obj;
                sb.append(((sy4) e3Var.f674o).b());
                return x67.h(sb.toString(), ((g3) e3Var.n).getUpperBounds());
            case 3:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 4:
                tf0 tf0Var = (tf0) obj;
                return tf0Var.a.i(tf0Var.b).W();
            case 5:
                oz3 oz3VarB = ((h58) obj).b();
                oz3VarB.getClass();
                return oz3VarB;
            case 6:
                m08 m08Var = ((p07) obj).k;
                return new rv0(j51.K(m08Var.a, m08Var.b, q72.b.b(0.0f)));
            case 7:
                uo1 uo1Var = ((qo1) obj).a;
                uo1 uo1Var2 = new uo1();
                j1 j1VarV = hm3.v(uo1.class.getDeclaredFields());
                while (j1VarV.hasNext()) {
                    Field field = (Field) j1VarV.next();
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj3 = field.get(uo1Var);
                        to1 to1Var = obj3 instanceof to1 ? (to1) obj3 : null;
                        if (to1Var != null) {
                            String name = field.getName();
                            name.getClass();
                            bc7.N(false, name, "is");
                            wt3 wt3VarB = w86.a.b(uo1.class);
                            String name2 = field.getName();
                            String name3 = field.getName();
                            name3.getClass();
                            if (name3.length() > 0) {
                                name3 = Character.toUpperCase(name3.charAt(0)) + name3.substring(1);
                            }
                            new gu5(wt3VarB, name2, "get".concat(name3));
                            field.set(uo1Var2, new to1(to1Var.m, uo1Var2));
                        }
                    }
                }
                qo1 qo1Var = qo1.c;
                uo1Var2.e(fv6.a0(uo1Var2.j(), qf0.L(s87.p, s87.q)));
                uo1Var2.a = true;
                return new qo1(uo1Var2);
            case 8:
                HashSet hashSet = new HashSet();
                pp1 pp1Var = (pp1) ((j93) obj).q;
                op1 op1Var = pp1Var.z;
                fp1 fp1Var = pp1Var.x;
                tu5 tu5Var = pp1Var.q;
                Iterator it4 = op1Var.b().iterator();
                while (it4.hasNext()) {
                    for (fi1 fi1Var : qs1.N(((oz3) it4.next()).I(), null, 3)) {
                        if ((fi1Var instanceof c07) || (fi1Var instanceof bu5)) {
                            hashSet.add(((zi0) fi1Var).getName());
                        }
                    }
                }
                List list2 = tu5Var.C;
                list2.getClass();
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    hashSet.add(et1.C((ty4) fp1Var.b, ((iv5) it5.next()).r));
                }
                List list3 = tu5Var.D;
                list3.getClass();
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    hashSet.add(et1.C((ty4) fp1Var.b, ((qv5) it6.next()).r));
                }
                return fv6.a0(hashSet, hashSet);
            case ep1.b /* 9 */:
                aq1 aq1Var = (aq1) obj;
                Set setN = aq1Var.n();
                if (setN == null) {
                    return null;
                }
                return fv6.a0(fv6.a0(aq1Var.m(), aq1Var.c.c.keySet()), setN);
            case ep1.c /* 10 */:
                Set setKeySet = ((LinkedHashMap) ((eg0) obj).u.p).keySet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : setKeySet) {
                    js0 js0Var = (js0) obj4;
                    if (js0Var.b.e().d() && !es0.c.contains(js0Var)) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(mv0.Z(arrayList3, 10));
                Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    arrayList4.add(((js0) it7.next()).f());
                }
                return arrayList4;
            case 11:
                fq1 fq1Var = (fq1) obj;
                fp1 fp1Var2 = fq1Var.w;
                return lv0.P0(((ap) ((io.sentry.android.replay.screenshot.k) fp1Var2.a).e).f(fq1Var.x, (ty4) fp1Var2.b));
            case ep1.d /* 12 */:
                lc2 lc2Var = (lc2) obj;
                HashSet hashSet2 = new HashSet();
                for (sy4 sy4Var : (Set) lc2Var.e.u.a()) {
                    t35 t35Var = t35.r;
                    hashSet2.addAll(lc2Var.a(sy4Var, t35Var));
                    hashSet2.addAll(lc2Var.d(sy4Var, t35Var));
                }
                return hashSet2;
            case 13:
                return (List) obj;
            case 14:
                ArrayList arrayList5 = ((xx2) obj).a;
                jx4 jx4Var = new jx4(arrayList5.size());
                int size = arrayList5.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ?? r4 = (ix3) arrayList5.get(i4);
                    Object obj5 = r4.b;
                    int i5 = r4.a;
                    Object pp3Var = obj5 != null ? new pp3(Integer.valueOf(i5), r4.b) : Integer.valueOf(i5);
                    int iF = jx4Var.f(pp3Var);
                    boolean z = iF < 0;
                    Object obj6 = z ? null : jx4Var.c[iF];
                    if (obj6 != null) {
                        if (obj6 instanceof zw4) {
                            ?? r11 = (zw4) obj6;
                            r11.a(r4);
                            r4 = r11;
                        } else {
                            Object[] objArr = i65.a;
                            ?? zw4Var = new zw4(2);
                            zw4Var.a(obj6);
                            zw4Var.a(r4);
                            r4 = zw4Var;
                        }
                    }
                    if (z) {
                        int i6 = ~iF;
                        jx4Var.b[i6] = pp3Var;
                        jx4Var.c[i6] = r4;
                    } else {
                        jx4Var.c[iF] = r4;
                    }
                }
                return new rv4(jx4Var);
            case 15:
                ez2 ez2Var = (ez2) obj;
                List listH = ez2Var.h();
                ArrayList arrayList6 = new ArrayList(3);
                d0 d0Var = ez2Var.b;
                Collection collectionB = d0Var.q().b();
                collectionB.getClass();
                ArrayList arrayList7 = new ArrayList();
                Iterator it8 = collectionB.iterator();
                while (it8.hasNext()) {
                    qv0.c0(arrayList7, qs1.N(((oz3) it8.next()).I(), null, 3));
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj7 : arrayList7) {
                    if (obj7 instanceof zi0) {
                        arrayList8.add(obj7);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj8 : arrayList8) {
                    sy4 name4 = ((zi0) obj8).getName();
                    Object arrayList9 = linkedHashMap.get(name4);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        linkedHashMap.put(name4, arrayList9);
                    }
                    ((List) arrayList9).add(obj8);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    key.getClass();
                    sy4 sy4Var2 = (sy4) key;
                    List list4 = (List) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj9 : list4) {
                        Boolean boolValueOf = Boolean.valueOf(((zi0) obj9) instanceof xw2);
                        Object arrayList10 = linkedHashMap2.get(boolValueOf);
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList10);
                        }
                        ((List) arrayList10).add(obj9);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list5 = (List) entry3.getValue();
                        hc5 hc5Var = hc5.c;
                        if (zBooleanValue) {
                            ArrayList arrayList11 = new ArrayList();
                            for (Object obj10 : listH) {
                                if (im3.n(((gi1) ((xw2) obj10)).getName(), sy4Var2)) {
                                    arrayList11.add(obj10);
                                }
                            }
                            collection = arrayList11;
                        } else {
                            collection = ea2Var;
                        }
                        hc5Var.h(sy4Var2, list5, collection, d0Var, new dz2(arrayList6, ez2Var));
                    }
                }
                return lv0.A0(listH, ka0.s(arrayList6));
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                Map map = sn3.a;
                r76 r76Var = ((jo3) obj).d;
                f86 f86Var = r76Var instanceof f86 ? (f86) r76Var : null;
                if (f86Var == null || (mz3Var = (mz3) sn3.b.get(sy4.e(f86Var.b.name()).b())) == null) {
                    oc2Var = null;
                } else {
                    ht2 ht2Var = s87.v;
                    ht2Var.getClass();
                    ht2 ht2VarE = ht2Var.e();
                    sy4 sy4VarF = ht2Var.f();
                    sy4VarF.getClass();
                    oc2Var = new oc2(new js0(ht2VarE, sy4VarF), sy4.e(mz3Var.name()));
                }
                if (oc2Var != null) {
                    mapSingletonMap2 = Collections.singletonMap(qn3.c, oc2Var);
                    mapSingletonMap2.getClass();
                }
                return mapSingletonMap2 == null ? fa2Var : mapSingletonMap2;
            case 17:
                r76 r76Var2 = ((ko3) obj).d;
                if (r76Var2 instanceof t76) {
                    Map map2 = sn3.a;
                    bxVarA = sn3.a(((t76) r76Var2).a());
                } else if (r76Var2 instanceof f86) {
                    Map map3 = sn3.a;
                    bxVarA = sn3.a(qf0.K(r76Var2));
                } else {
                    bxVarA = null;
                }
                if (bxVarA != null) {
                    mapSingletonMap = Collections.singletonMap(qn3.b, bxVarA);
                    mapSingletonMap.getClass();
                }
                return mapSingletonMap == null ? fa2Var : mapSingletonMap;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                rr3 rr3Var = (rr3) obj;
                sa4 sa4VarT = qf0.t();
                sa4VarT.add(rr3Var.a.m);
                za6 za6Var = rr3Var.b;
                if (za6Var != null) {
                    sa4VarT.add("under-migration:".concat(za6Var.m));
                }
                for (Map.Entry entry4 : rr3Var.c.entrySet()) {
                    sa4VarT.add("@" + entry4.getKey() + ':' + ((za6) entry4.getValue()).m);
                }
                return (String[]) qf0.r(sa4VarT).toArray(new String[0]);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                yr3 yr3Var = (yr3) obj;
                wr3 wr3Var = yr3Var.f;
                if (wr3Var == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                xr3 xr3Var = (xr3) wr3Var.a();
                yr3Var.f = null;
                return xr3Var;
            case 20:
                ss3 ss3Var = (ss3) obj;
                i24 i24Var = ss3Var.c;
                Collection collectionValues = ((Map) i67.s(i24Var.u, i24.y[0])).values();
                ArrayList arrayList12 = new ArrayList();
                Iterator it9 = collectionValues.iterator();
                while (it9.hasNext()) {
                    bq1 bq1VarA = ((io3) ss3Var.b.m).d.a(i24Var, (r86) it9.next());
                    if (bq1VarA != null) {
                        arrayList12.add(bq1VarA);
                    }
                }
                return (zo4[]) yo1.K(arrayList12).toArray(new zo4[0]);
            case 21:
                return os4.a(((ou3) obj).a());
            case 22:
                return new xu3((yu3) obj);
            case 23:
                return new av3((bv3) obj);
            case 24:
                return new cv3((dv3) obj);
            case 25:
                List upperBounds = ((rw3) obj).m.getUpperBounds();
                upperBounds.getClass();
                ArrayList arrayList13 = new ArrayList(mv0.Z(upperBounds, 10));
                Iterator it10 = upperBounds.iterator();
                while (it10.hasNext()) {
                    arrayList13.add(new qw3((oz3) it10.next(), null));
                }
                return arrayList13;
            case 26:
                ((o24) obj).f1623o.q.getClass();
                return null;
            case 27:
                sz3 sz3Var = (sz3) ((o54) obj).f1631o.a();
                sz3Var.getClass();
                return (oz3) sz3Var;
            case 28:
                Function0 function0 = ((i35) obj).b;
                if (function0 != null) {
                    return (List) function0.a();
                }
                return null;
            default:
                return (zo4) ((nj6) obj).b.invoke(uz3.a);
        }
    }

    public /* synthetic */ a3(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj2;
    }
}
