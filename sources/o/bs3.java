package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class bs3 implements cc, rl5 {
    public static final /* synthetic */ fw3[] t;
    public final qs4 m;
    public final vd4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g07 f449o;
    public final vd4 p;
    public final sd4 q;
    public final vd4 r;
    public final sd4 s;

    static {
        x86 x86Var = w86.a;
        t = new fw3[]{x86Var.g(new gu5(x86Var.b(bs3.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), x86Var.g(new gu5(x86Var.b(bs3.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), x86Var.g(new gu5(x86Var.b(bs3.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public bs3(qs4 qs4Var, xd4 xd4Var, a3 a3Var) {
        this.m = qs4Var;
        this.n = new vd4(xd4Var, a3Var);
        cs0 cs0Var = new cs0(new ha2(qs4Var, new ht2("java.io"), (byte) 1), sy4.e("Serializable"), as4.q, ms0.n, qf0.K(new o54(xd4Var, new zr3(this, (byte) 1))), xd4Var);
        cs0Var.C0(yo4.b, la2.m, null);
        this.f449o = cs0Var.W();
        this.p = new vd4(xd4Var, new e3((Object) this, (Object) xd4Var, (byte) 12));
        this.q = new sd4(xd4Var, new ConcurrentHashMap(3, 1.0f, 2), new o48((byte) 19), (byte) 0);
        this.r = new vd4(xd4Var, new zr3(this, (byte) 0));
        this.s = xd4Var.b(new t(this, (byte) 18));
    }

    @Override // o.cc
    public final Collection a(ns4 ns4Var) {
        Set setB;
        ns4Var.getClass();
        f().getClass();
        b24 b24VarD = d(ns4Var);
        if (b24VarD == null || (setB = b24VarD.C0().b()) == null) {
            setB = la2.m;
        }
        return setB;
    }

    @Override // o.cc
    public final Collection b(ns4 ns4Var) throws l58 {
        it2 it2VarG;
        xz2 xz2Var = xz2.Y;
        if (ns4Var.i0() == ms0.m) {
            f().getClass();
            b24 b24VarD = d(ns4Var);
            if (b24VarD != null) {
                ht2 ht2VarG = bp1.g(b24VarD);
                oh2 oh2Var = oh2.f;
                oh2Var.getClass();
                String str = mo3.a;
                js0 js0VarF = mo3.f(ht2VarG);
                ns4 ns4VarI = js0VarF != null ? oh2Var.i(js0VarF.a()) : null;
                if (ns4VarI != null) {
                    m58 m58Var = new m58(lv1.G(ns4VarI, b24VarD));
                    List list = (List) b24VarD.C.q.a();
                    ArrayList<wr0> arrayList = new ArrayList();
                    for (Object obj : list) {
                        wr0 wr0Var = (wr0) obj;
                        if (wr0Var.e().a.n) {
                            Collection collectionZ = ns4VarI.z();
                            collectionZ.getClass();
                            Collection collection = collectionZ;
                            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                                Iterator it = collection.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        wr0 wr0Var2 = (wr0) it.next();
                                        wr0Var2.getClass();
                                        if (hc5.j(wr0Var2, wr0Var.d(m58Var)) == 1) {
                                        }
                                    }
                                }
                            }
                            if (wr0Var.J().size() == 1) {
                                List listJ = wr0Var.J();
                                listJ.getClass();
                                ys0 ys0VarA = ((qb8) lv0.F0(listJ)).getType().o0().a();
                                if (ys0VarA != null) {
                                    int i = bp1.a;
                                    it2VarG = zo1.g(ys0VarA);
                                    it2VarG.getClass();
                                } else {
                                    it2VarG = null;
                                }
                                it2 it2VarG2 = zo1.g(ns4Var);
                                it2VarG2.getClass();
                                if (im3.n(it2VarG, it2VarG2)) {
                                }
                            }
                            if (!wy3.C(wr0Var)) {
                                LinkedHashSet linkedHashSet = es3.f;
                                String strE = io1.E(wr0Var, 3);
                                String str2 = mo3.a;
                                it2 it2VarI = bp1.g(b24VarD).i();
                                it2VarI.getClass();
                                js0 js0VarG = mo3.g(it2VarI);
                                if (!linkedHashSet.contains((js0VarG != null ? fs3.e(js0VarG) : au8.w(b24VarD, xz2Var)) + '.' + strE)) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
                    for (wr0 wr0Var3 : arrayList) {
                        wr0Var3.getClass();
                        yw2 yw2VarI0 = wr0Var3.I0(m58.b);
                        yw2VarI0.n = ns4Var;
                        yw2VarI0.I(ns4Var.W());
                        yw2VarI0.A = true;
                        yw2VarI0.m = m58Var.a;
                        LinkedHashSet linkedHashSet2 = es3.g;
                        String strE2 = io1.E(wr0Var3, 3);
                        String str3 = mo3.a;
                        it2 it2VarI2 = bp1.g(b24VarD).i();
                        it2VarI2.getClass();
                        js0 js0VarG2 = mo3.g(it2VarI2);
                        if (!linkedHashSet2.contains((js0VarG2 != null ? fs3.e(js0VarG2) : au8.w(b24VarD, xz2Var)) + '.' + strE2)) {
                            yw2VarI0.x((up) i67.s(this.r, t[2]));
                        }
                        zw2 zw2VarF0 = yw2VarI0.J.F0(yw2VarI0);
                        zw2VarF0.getClass();
                        arrayList2.add((wr0) zw2VarF0);
                    }
                    return arrayList2;
                }
            }
        }
        return ea2.m;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    @Override // o.cc
    public final Collection c(sy4 sy4Var, ns4 ns4Var) throws Throwable {
        c07 c07Var;
        up upVar;
        Set setV;
        Object obj;
        boolean zBooleanValue;
        ns4Var.getClass();
        boolean zEquals = sy4Var.equals(eu0.e);
        t35 t35Var = t35.m;
        fw3[] fw3VarArr = t;
        List<c07> list = ea2.m;
        if (zEquals && (ns4Var instanceof pp1) && (wy3.b(ns4Var, s87.g) || wy3.r(ns4Var) != null)) {
            pp1 pp1Var = (pp1) ns4Var;
            List list2 = pp1Var.q.C;
            list2.getClass();
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (et1.C((ty4) pp1Var.x.b, ((iv5) it.next()).r).equals(eu0.e)) {
                        return list;
                    }
                }
            }
            ww2 ww2VarG0 = ((c07) lv0.E0(((g07) i67.s(this.p, fw3VarArr[1])).I().a(sy4Var, t35Var))).g0();
            ww2VarG0.D(pp1Var);
            ww2VarG0.g(dp1.e);
            ww2VarG0.I(pp1Var.W());
            ww2VarG0.B(pp1Var.q0());
            xw2 xw2VarBuild = ww2VarG0.build();
            xw2VarBuild.getClass();
            return qf0.K((c07) xw2VarBuild);
        }
        f().getClass();
        b24 b24VarD = d(ns4Var);
        if (b24VarD != null) {
            ht2 ht2VarG = bp1.g(b24VarD);
            oh2 oh2Var = oh2.f;
            oh2Var.getClass();
            String str = mo3.a;
            js0 js0VarF = mo3.f(ht2VarG);
            ns4 ns4VarI = js0VarF != null ? oh2Var.i(js0VarF.a()) : null;
            if (ns4VarI == null) {
                setV = la2.m;
            } else {
                it2 it2VarG = zo1.g(ns4VarI);
                it2VarG.getClass();
                ht2 ht2Var = (ht2) mo3.k.get(it2VarG);
                setV = ht2Var == null ? lv1.V(ns4VarI) : qf0.L(ns4VarI, oh2Var.i(ht2Var));
            }
            Iterable iterable = setV;
            if (iterable instanceof List) {
                List list3 = (List) iterable;
                if (list3.isEmpty()) {
                    obj = null;
                } else {
                    obj = list3.get(list3.size() - 1);
                }
            } else {
                Iterator it2 = iterable.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    obj = next;
                } else {
                    obj = null;
                }
            }
            ns4 ns4Var2 = (ns4) obj;
            if (ns4Var2 != null) {
                int i = v17.f2266o;
                ArrayList arrayList = new ArrayList(mv0.Z(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(bp1.g((ns4) it3.next()));
                }
                v17 v17Var = new v17();
                v17Var.addAll(arrayList);
                String str2 = mo3.a;
                boolean zContainsKey = mo3.j.containsKey(zo1.g(ns4Var));
                ht2 ht2VarG2 = bp1.g(b24VarD);
                e3 e3Var = new e3((byte) 13, b24VarD, ns4Var2, false);
                sd4 sd4Var = this.q;
                sd4Var.getClass();
                Object objInvoke = sd4Var.invoke(new td4(ht2VarG2, e3Var));
                if (objInvoke == null) {
                    sd4.c(3);
                    throw null;
                }
                zo4 zo4VarS0 = ((ns4) objInvoke).s0();
                zo4VarS0.getClass();
                Collection collectionA = zo4VarS0.a(sy4Var, t35Var);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionA) {
                    c07 c07Var2 = (c07) obj2;
                    if (c07Var2.k() == 1 && c07Var2.e().a.n && !wy3.C(c07Var2)) {
                        Collection collectionJ = c07Var2.j();
                        if (!(collectionJ instanceof Collection) || !collectionJ.isEmpty()) {
                            Iterator it4 = collectionJ.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    fi1 fi1VarI = ((xw2) it4.next()).i();
                                    fi1VarI.getClass();
                                    if (v17Var.contains(bp1.g(fi1VarI))) {
                                    }
                                }
                            }
                        }
                        fi1 fi1VarI2 = c07Var2.i();
                        fi1VarI2.getClass();
                        ns4 ns4Var3 = (ns4) fi1VarI2;
                        String strE = io1.E(c07Var2, 3);
                        LinkedHashSet linkedHashSet = es3.e;
                        String str3 = mo3.a;
                        it2 it2VarI = bp1.g(ns4Var3).i();
                        it2VarI.getClass();
                        js0 js0VarG = mo3.g(it2VarI);
                        if (linkedHashSet.contains((js0VarG != null ? fs3.e(js0VarG) : au8.w(ns4Var3, xz2.Y)) + '.' + strE) ^ zContainsKey) {
                            zBooleanValue = true;
                        } else {
                            Boolean boolQ = ga0.q(qf0.K(c07Var2), d82.E, new o48(this, (byte) 18));
                            boolQ.getClass();
                            zBooleanValue = boolQ.booleanValue();
                        }
                        if (!zBooleanValue) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                list = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (c07 c07Var3 : list) {
            fi1 fi1VarI3 = c07Var3.i();
            fi1VarI3.getClass();
            xw2 xw2VarD = c07Var3.d(new m58(lv1.G((ns4) fi1VarI3, ns4Var)));
            xw2VarD.getClass();
            ww2 ww2VarG1 = ((c07) xw2VarD).g0();
            ww2VarG1.D(ns4Var);
            ww2VarG1.B(ns4Var.q0());
            ww2VarG1.l();
            fi1 fi1VarI4 = c07Var3.i();
            fi1VarI4.getClass();
            Object objJ = ga0.j(qf0.K((ns4) fi1VarI4), new xk1((Object) this, (byte) 29), new kg1(io1.E(c07Var3, 3), new k76(), (byte) 2));
            objJ.getClass();
            int iOrdinal = ((as3) objJ).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        sy4 name = c07Var3.getName();
                        boolean zN = im3.n(name, cs3.a);
                        sd4 sd4Var2 = this.s;
                        if (zN) {
                            upVar = (up) sd4Var2.invoke(new vd5(c07Var3.getName().b(), "first"));
                        } else {
                            if (!im3.n(name, cs3.b)) {
                                yq4.u(c07Var3.getName(), "Unexpected name: ");
                                return null;
                            }
                            upVar = (up) sd4Var2.invoke(new vd5(c07Var3.getName().b(), "last"));
                        }
                        ww2VarG1.x(upVar);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            gk0.s();
                            return null;
                        }
                        c07Var = null;
                    } else {
                        ww2VarG1.x((up) i67.s(this.r, fw3VarArr[2]));
                    }
                }
                xw2 xw2VarBuild2 = ww2VarG1.build();
                xw2VarBuild2.getClass();
                c07Var = (c07) xw2VarBuild2;
            } else if (ns4Var.r() != as4.n || ns4Var.i0() == ms0.f1501o) {
                ww2VarG1.q();
                xw2 xw2VarBuild3 = ww2VarG1.build();
                xw2VarBuild3.getClass();
                c07Var = (c07) xw2VarBuild3;
            } else {
                c07Var = null;
            }
            if (c07Var != null) {
                arrayList3.add(c07Var);
            }
        }
        return arrayList3;
    }

    public final b24 d(ns4 ns4Var) {
        ht2 ht2VarA;
        if (ns4Var == null) {
            wy3.a(109);
            throw null;
        }
        if (!wy3.b(ns4Var, s87.a) && wy3.I(ns4Var)) {
            int i = bp1.a;
            it2 it2VarG = zo1.g(ns4Var);
            it2VarG.getClass();
            if (it2VarG.d()) {
                String str = mo3.a;
                js0 js0VarG = mo3.g(it2VarG);
                if (js0VarG != null && (ht2VarA = js0VarG.a()) != null) {
                    ns4 ns4VarS = yo1.S(f().a, ht2VarA);
                    if (ns4VarS instanceof b24) {
                        return (b24) ns4VarS;
                    }
                }
            }
        }
        return null;
    }

    @Override // o.cc
    public final Collection e(ns4 ns4Var) {
        int i = bp1.a;
        it2 it2VarG = zo1.g(ns4Var);
        it2VarG.getClass();
        LinkedHashSet linkedHashSet = es3.a;
        it2 it2Var = s87.g;
        boolean zEquals = it2VarG.equals(it2Var);
        boolean zIsAssignableFrom = false;
        g07 g07Var = this.f449o;
        if (!zEquals) {
            HashMap map = s87.d0;
            if (map.get(it2VarG) == null) {
                if (it2VarG.equals(it2Var) || map.get(it2VarG) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = mo3.a;
                    js0 js0VarG = mo3.g(it2VarG);
                    if (js0VarG != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(js0VarG.a().b()));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? qf0.K(g07Var) : ea2.m;
            }
        }
        return qf0.L((g07) i67.s(this.p, t[1]), g07Var);
    }

    public final xr3 f() {
        return (xr3) i67.s(this.n, t[0]);
    }

    @Override // o.rl5
    public final boolean t0(ns4 ns4Var, dq1 dq1Var) {
        ns4Var.getClass();
        b24 b24VarD = d(ns4Var);
        if (b24VarD == null || !dq1Var.getAnnotations().o0(sl5.a)) {
            return true;
        }
        f().getClass();
        String strE = io1.E(dq1Var, 3);
        g24 g24VarC0 = b24VarD.C0();
        sy4 name = dq1Var.getName();
        name.getClass();
        Collection collectionA = g24VarC0.a(name, t35.m);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return false;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (io1.E((c07) it.next(), 3).equals(strE)) {
                return true;
            }
        }
        return false;
    }
}
