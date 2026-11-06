package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class g24 extends s24 {
    public static final /* synthetic */ int v = 0;
    public final ns4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a86 f850o;
    public final boolean p;
    public final vd4 q;
    public final vd4 r;
    public final vd4 s;
    public final vd4 t;
    public final h50 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g24(yc4 yc4Var, ns4 ns4Var, a86 a86Var, boolean z, g24 g24Var) {
        super(yc4Var, g24Var);
        yc4Var.getClass();
        a86Var.getClass();
        this.n = ns4Var;
        this.f850o = a86Var;
        this.p = z;
        xd4 xd4Var = ((io3) yc4Var.m).a;
        this.q = new vd4(xd4Var, new c24(this, yc4Var));
        this.r = new vd4(xd4Var, new d24(this, (byte) 0));
        this.s = new vd4(xd4Var, new c24(yc4Var, this));
        this.t = new vd4(xd4Var, new d24(this, (byte) 1));
        this.u = xd4Var.c(new y2(this, yc4Var, (byte) 12));
    }

    public static c07 A(c07 c07Var, xw2 xw2Var, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return c07Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            c07 c07Var2 = (c07) it.next();
            if (!c07Var.equals(c07Var2) && c07Var2.N == null && D(c07Var2, xw2Var)) {
                xw2 xw2VarBuild = c07Var.g0().C().build();
                xw2VarBuild.getClass();
                return (c07) xw2VarBuild;
            }
        }
        return c07Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static c07 B(c07 c07Var) {
        ht2 ht2VarG;
        List listJ = c07Var.J();
        listJ.getClass();
        qb8 qb8Var = (qb8) lv0.w0(listJ);
        if (qb8Var != null) {
            ys0 ys0VarA = qb8Var.getType().o0().a();
            if (ys0VarA != null) {
                int i = bp1.a;
                it2 it2VarG = zo1.g(ys0VarA);
                it2VarG.getClass();
                if (!it2VarG.d()) {
                    it2VarG = null;
                }
                if (it2VarG != null) {
                    ht2VarG = it2VarG.g();
                } else {
                    ht2VarG = null;
                }
            } else {
                ht2VarG = null;
            }
            if (!im3.n(ht2VarG, t87.g)) {
                qb8Var = null;
            }
            if (qb8Var != null) {
                ww2 ww2VarG0 = c07Var.g0();
                List listJ2 = c07Var.J();
                listJ2.getClass();
                c07 c07Var2 = (c07) ww2VarG0.b(lv0.k0(listJ2)).I(((h58) qb8Var.getType().m0().get(0)).b()).build();
                if (c07Var2 != null) {
                    c07Var2.G = true;
                }
                return c07Var2;
            }
        }
        return null;
    }

    public static boolean D(xw2 xw2Var, xw2 xw2Var2) {
        int iB = hc5.c.n(xw2Var2, xw2Var, true).b();
        if (iB != 0) {
            return iB == 1 && !yo1.z(xw2Var2, xw2Var);
        }
        throw null;
    }

    public static boolean E(c07 c07Var, c07 c07Var2) {
        int i = hg0.l;
        c07Var.getClass();
        if (im3.n(c07Var.getName().b(), "removeAt") && im3.n(io1.F(c07Var), y77.g.e)) {
            c07Var2 = c07Var2.C0();
        }
        c07Var2.getClass();
        return D(c07Var2, c07Var);
    }

    public static c07 F(bu5 bu5Var, String str, Function1 function1) {
        c07 c07Var;
        Iterator it = ((Iterable) function1.invoke(sy4.e(str))).iterator();
        do {
            c07Var = null;
            if (!it.hasNext()) {
                break;
            }
            c07 c07Var2 = (c07) it.next();
            if (c07Var2.J().size() == 0) {
                q35 q35Var = qz3.a;
                oz3 oz3Var = c07Var2.s;
                if (oz3Var == null ? false : q35Var.b(oz3Var, bu5Var.getType())) {
                    c07Var = c07Var2;
                }
            }
        } while (c07Var == null);
        return c07Var;
    }

    public static c07 H(bu5 bu5Var, Function1 function1) {
        c07 c07Var;
        oz3 oz3Var;
        String strB = bu5Var.getName().b();
        strB.getClass();
        Iterator it = ((Iterable) function1.invoke(sy4.e("set".concat(sr3.b(strB) ? strB.substring(2) : g68.i(strB))))).iterator();
        do {
            c07Var = null;
            if (!it.hasNext()) {
                break;
            }
            c07 c07Var2 = (c07) it.next();
            if (c07Var2.J().size() == 1 && (oz3Var = c07Var2.s) != null) {
                sy4 sy4Var = wy3.e;
                if (wy3.D(oz3Var, s87.d)) {
                    q35 q35Var = qz3.a;
                    List listJ = c07Var2.J();
                    listJ.getClass();
                    if (q35Var.a(((qb8) lv0.F0(listJ)).getType(), bu5Var.getType())) {
                        c07Var = c07Var2;
                    }
                }
            }
        } while (c07Var == null);
        return c07Var;
    }

    public static boolean K(c07 c07Var, xw2 xw2Var) {
        String strE = io1.E(c07Var, 2);
        xw2 xw2VarA = xw2Var.a();
        xw2VarA.getClass();
        return strE.equals(io1.E(xw2VarA, 2)) && !D(c07Var, xw2Var);
    }

    public final boolean C(bu5 bu5Var, Function1 function1) {
        if (xo1.S(bu5Var)) {
            return false;
        }
        c07 c07VarG = G(bu5Var, function1);
        c07 c07VarH = H(bu5Var, function1);
        if (c07VarG == null) {
            return false;
        }
        if (bu5Var.R()) {
            return c07VarH != null && c07VarH.r() == c07VarG.r();
        }
        return true;
    }

    public final c07 G(bu5 bu5Var, Function1 function1) {
        sy4 sy4Var;
        eu5 getter = bu5Var.getGetter();
        String strB = null;
        eu5 eu5Var = getter != null ? (eu5) o77.n(getter) : null;
        if (eu5Var != null) {
            wy3.z(eu5Var);
            zi0 zi0VarB = bp1.b(bp1.i(eu5Var), ek.x);
            if (zi0VarB != null && (sy4Var = (sy4) jg0.a.get(bp1.g(zi0VarB))) != null) {
                strB = sy4Var.b();
            }
        }
        if (strB != null && !o77.p(this.n, eu5Var)) {
            return F(bu5Var, strB, function1);
        }
        String strB2 = bu5Var.getName().b();
        strB2.getClass();
        return F(bu5Var, sr3.a(strB2), function1);
    }

    public final LinkedHashSet I(sy4 sy4Var) {
        Collection collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            qv0.c0(linkedHashSet, ((oz3) it.next()).I().a(sy4Var, t35.q));
        }
        return linkedHashSet;
    }

    public final Set J(sy4 sy4Var) {
        Collection collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionD = ((oz3) it.next()).I().d(sy4Var, t35.q);
            ArrayList arrayList2 = new ArrayList(mv0.Z(collectionD, 10));
            Iterator it2 = collectionD.iterator();
            while (it2.hasNext()) {
                arrayList2.add((bu5) it2.next());
            }
            qv0.c0(arrayList, arrayList2);
        }
        return lv0.T0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[LOOP:3: B:54:0x0120->B:112:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[LOOP:5: B:72:0x017b->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01ab A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Code duplicated, block: B:65:0x0160  */
    /* JADX WARN: Code duplicated, block: B:71:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:77:0x018e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c4 A[ORIG_RETURN, RETURN] */
    public final boolean L(c07 c07Var) {
        Collection collectionM;
        sy4 sy4Var;
        sy4 name;
        c07 c07VarB;
        LinkedHashSet<c07> linkedHashSetI;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        xw2 xw2VarA;
        ArrayList arrayList2;
        c07 c07Var2;
        Iterator it3;
        c07 c07Var3;
        sy4 name2 = c07Var.getName();
        name2.getClass();
        String strB = name2.b();
        strB.getClass();
        ht2 ht2Var = sr3.a;
        if (bc7.N(false, strB, "get") || bc7.N(false, strB, "is")) {
            sy4 sy4VarJ = et1.J(name2, "get", null, 12);
            if (sy4VarJ == null) {
                sy4VarJ = et1.J(name2, "is", null, 8);
            }
            collectionM = qf0.M(sy4VarJ);
        } else if (bc7.N(false, strB, "set")) {
            collectionM = cx.Q0(new sy4[]{et1.J(name2, "set", null, 4), et1.J(name2, "set", "is", 4)});
        } else {
            collectionM = (List) jg0.b.get(name2);
            if (collectionM == null) {
                collectionM = ea2.m;
            }
        }
        if (collectionM.isEmpty()) {
            ArrayList arrayList3 = y77.a;
            sy4 name3 = c07Var.getName();
            name3.getClass();
            sy4Var = (sy4) y77.k.get(name3);
            if (sy4Var == null) {
                int i = ig0.l;
                name = c07Var.getName();
                name.getClass();
                if (!y77.e.contains(name)) {
                    c07VarB = B(c07Var);
                    if (c07VarB == null) {
                        return true;
                    }
                    sy4 name4 = c07Var.getName();
                    name4.getClass();
                    linkedHashSetI = I(name4);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    for (c07 c07Var4 : linkedHashSetI) {
                        if (c07Var4.l() || !D(c07VarB, c07Var4)) {
                        }
                    }
                    return true;
                }
                sy4 name5 = c07Var.getName();
                name5.getClass();
                LinkedHashSet linkedHashSetI2 = I(name5);
                arrayList = new ArrayList();
                it = linkedHashSetI2.iterator();
                while (it.hasNext()) {
                    xw2VarA = ig0.a((c07) it.next());
                    if (xw2VarA != null) {
                        arrayList.add(xw2VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    c07VarB = B(c07Var);
                    if (c07VarB == null) {
                        return true;
                    }
                    sy4 name6 = c07Var.getName();
                    name6.getClass();
                    linkedHashSetI = I(name6);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r8.hasNext()) {
                        if (c07Var4.l()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(c07Var, (xw2) it2.next())) {
                    }
                }
                c07VarB = B(c07Var);
                if (c07VarB == null) {
                    return true;
                }
                sy4 name7 = c07Var.getName();
                name7.getClass();
                linkedHashSetI = I(name7);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (c07Var4.l()) {
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetI3 = I(sy4Var);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI3) {
                c07Var3 = (c07) obj;
                c07Var3.getClass();
                if (o77.n(c07Var3) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i2 = ig0.l;
                name = c07Var.getName();
                name.getClass();
                if (!y77.e.contains(name)) {
                    c07VarB = B(c07Var);
                    if (c07VarB == null) {
                        return true;
                    }
                    sy4 name8 = c07Var.getName();
                    name8.getClass();
                    linkedHashSetI = I(name8);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r8.hasNext()) {
                        if (c07Var4.l()) {
                        }
                    }
                    return true;
                }
                sy4 name9 = c07Var.getName();
                name9.getClass();
                LinkedHashSet linkedHashSetI4 = I(name9);
                arrayList = new ArrayList();
                it = linkedHashSetI4.iterator();
                while (it.hasNext()) {
                    xw2VarA = ig0.a((c07) it.next());
                    if (xw2VarA != null) {
                        arrayList.add(xw2VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    c07VarB = B(c07Var);
                    if (c07VarB == null) {
                        return true;
                    }
                    sy4 name10 = c07Var.getName();
                    name10.getClass();
                    linkedHashSetI = I(name10);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r8.hasNext()) {
                        if (c07Var4.l()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(c07Var, (xw2) it2.next())) {
                    }
                }
                c07VarB = B(c07Var);
                if (c07VarB == null) {
                    return true;
                }
                sy4 name11 = c07Var.getName();
                name11.getClass();
                linkedHashSetI = I(name11);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (c07Var4.l()) {
                    }
                }
                return true;
            }
            ww2 ww2VarG0 = c07Var.g0();
            ww2VarG0.y(sy4Var);
            ww2VarG0.J();
            ww2VarG0.l();
            xw2 xw2VarBuild = ww2VarG0.build();
            xw2VarBuild.getClass();
            c07Var2 = (c07) xw2VarBuild;
            if (arrayList2.isEmpty()) {
                int i3 = ig0.l;
                name = c07Var.getName();
                name.getClass();
                if (!y77.e.contains(name)) {
                    c07VarB = B(c07Var);
                    if (c07VarB == null) {
                        return true;
                    }
                    sy4 name12 = c07Var.getName();
                    name12.getClass();
                    linkedHashSetI = I(name12);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r8.hasNext()) {
                        if (c07Var4.l()) {
                        }
                    }
                    return true;
                }
                sy4 name13 = c07Var.getName();
                name13.getClass();
                LinkedHashSet linkedHashSetI5 = I(name13);
                arrayList = new ArrayList();
                it = linkedHashSetI5.iterator();
                while (it.hasNext()) {
                    xw2VarA = ig0.a((c07) it.next());
                    if (xw2VarA != null) {
                        arrayList.add(xw2VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    c07VarB = B(c07Var);
                    if (c07VarB == null) {
                        return true;
                    }
                    sy4 name14 = c07Var.getName();
                    name14.getClass();
                    linkedHashSetI = I(name14);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r8.hasNext()) {
                        if (c07Var4.l()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(c07Var, (xw2) it2.next())) {
                    }
                }
                c07VarB = B(c07Var);
                if (c07VarB == null) {
                    return true;
                }
                sy4 name15 = c07Var.getName();
                name15.getClass();
                linkedHashSetI = I(name15);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (c07Var4.l()) {
                    }
                }
                return true;
            }
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (E((c07) it3.next(), c07Var2)) {
                }
            }
            int i4 = ig0.l;
            name = c07Var.getName();
            name.getClass();
            if (!y77.e.contains(name)) {
                c07VarB = B(c07Var);
                if (c07VarB == null) {
                    return true;
                }
                sy4 name16 = c07Var.getName();
                name16.getClass();
                linkedHashSetI = I(name16);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (c07Var4.l()) {
                    }
                }
                return true;
            }
            sy4 name17 = c07Var.getName();
            name17.getClass();
            LinkedHashSet linkedHashSetI6 = I(name17);
            arrayList = new ArrayList();
            it = linkedHashSetI6.iterator();
            while (it.hasNext()) {
                xw2VarA = ig0.a((c07) it.next());
                if (xw2VarA != null) {
                    arrayList.add(xw2VarA);
                }
            }
            if (arrayList.isEmpty()) {
                c07VarB = B(c07Var);
                if (c07VarB == null) {
                    return true;
                }
                sy4 name18 = c07Var.getName();
                name18.getClass();
                linkedHashSetI = I(name18);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (c07Var4.l()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(c07Var, (xw2) it2.next())) {
                }
            }
            c07VarB = B(c07Var);
            if (c07VarB == null) {
                return true;
            }
            sy4 name19 = c07Var.getName();
            name19.getClass();
            linkedHashSetI = I(name19);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (c07Var4.l()) {
                }
            }
            return true;
        }
        Iterator it4 = collectionM.iterator();
        while (it4.hasNext()) {
            Set<bu5> setJ = J((sy4) it4.next());
            if (!(setJ instanceof Collection) || !setJ.isEmpty()) {
                for (bu5 bu5Var : setJ) {
                    if (C(bu5Var, new y2(c07Var, this, (byte) 13))) {
                        if (!bu5Var.R()) {
                            String strB2 = c07Var.getName().b();
                            strB2.getClass();
                            if (!bc7.N(false, strB2, "set")) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = y77.a;
        sy4 name20 = c07Var.getName();
        name20.getClass();
        sy4Var = (sy4) y77.k.get(name20);
        if (sy4Var == null) {
            int i5 = ig0.l;
            name = c07Var.getName();
            name.getClass();
            if (!y77.e.contains(name)) {
                c07VarB = B(c07Var);
                if (c07VarB == null) {
                    return true;
                }
                sy4 name110 = c07Var.getName();
                name110.getClass();
                linkedHashSetI = I(name110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (c07Var4.l()) {
                    }
                }
                return true;
            }
            sy4 name111 = c07Var.getName();
            name111.getClass();
            LinkedHashSet linkedHashSetI7 = I(name111);
            arrayList = new ArrayList();
            it = linkedHashSetI7.iterator();
            while (it.hasNext()) {
                xw2VarA = ig0.a((c07) it.next());
                if (xw2VarA != null) {
                    arrayList.add(xw2VarA);
                }
            }
            if (arrayList.isEmpty()) {
                c07VarB = B(c07Var);
                if (c07VarB == null) {
                    return true;
                }
                sy4 name112 = c07Var.getName();
                name112.getClass();
                linkedHashSetI = I(name112);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (c07Var4.l()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(c07Var, (xw2) it2.next())) {
                }
            }
            c07VarB = B(c07Var);
            if (c07VarB == null) {
                return true;
            }
            sy4 name113 = c07Var.getName();
            name113.getClass();
            linkedHashSetI = I(name113);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (c07Var4.l()) {
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetI8 = I(sy4Var);
        arrayList2 = new ArrayList();
        while (r1.hasNext()) {
            c07Var3 = (c07) obj;
            c07Var3.getClass();
            if (o77.n(c07Var3) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i6 = ig0.l;
            name = c07Var.getName();
            name.getClass();
            if (!y77.e.contains(name)) {
                c07VarB = B(c07Var);
                if (c07VarB == null) {
                    return true;
                }
                sy4 name114 = c07Var.getName();
                name114.getClass();
                linkedHashSetI = I(name114);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (c07Var4.l()) {
                    }
                }
                return true;
            }
            sy4 name115 = c07Var.getName();
            name115.getClass();
            LinkedHashSet linkedHashSetI9 = I(name115);
            arrayList = new ArrayList();
            it = linkedHashSetI9.iterator();
            while (it.hasNext()) {
                xw2VarA = ig0.a((c07) it.next());
                if (xw2VarA != null) {
                    arrayList.add(xw2VarA);
                }
            }
            if (arrayList.isEmpty()) {
                c07VarB = B(c07Var);
                if (c07VarB == null) {
                    return true;
                }
                sy4 name116 = c07Var.getName();
                name116.getClass();
                linkedHashSetI = I(name116);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (c07Var4.l()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(c07Var, (xw2) it2.next())) {
                }
            }
            c07VarB = B(c07Var);
            if (c07VarB == null) {
                return true;
            }
            sy4 name117 = c07Var.getName();
            name117.getClass();
            linkedHashSetI = I(name117);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (c07Var4.l()) {
                }
            }
            return true;
        }
        ww2 ww2VarG1 = c07Var.g0();
        ww2VarG1.y(sy4Var);
        ww2VarG1.J();
        ww2VarG1.l();
        xw2 xw2VarBuild2 = ww2VarG1.build();
        xw2VarBuild2.getClass();
        c07Var2 = (c07) xw2VarBuild2;
        if (arrayList2.isEmpty()) {
            int i7 = ig0.l;
            name = c07Var.getName();
            name.getClass();
            if (!y77.e.contains(name)) {
                c07VarB = B(c07Var);
                if (c07VarB == null) {
                    return true;
                }
                sy4 name118 = c07Var.getName();
                name118.getClass();
                linkedHashSetI = I(name118);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (c07Var4.l()) {
                    }
                }
                return true;
            }
            sy4 name119 = c07Var.getName();
            name119.getClass();
            LinkedHashSet linkedHashSetI10 = I(name119);
            arrayList = new ArrayList();
            it = linkedHashSetI10.iterator();
            while (it.hasNext()) {
                xw2VarA = ig0.a((c07) it.next());
                if (xw2VarA != null) {
                    arrayList.add(xw2VarA);
                }
            }
            if (arrayList.isEmpty()) {
                c07VarB = B(c07Var);
                if (c07VarB == null) {
                    return true;
                }
                sy4 name1110 = c07Var.getName();
                name1110.getClass();
                linkedHashSetI = I(name1110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (c07Var4.l()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(c07Var, (xw2) it2.next())) {
                }
            }
            c07VarB = B(c07Var);
            if (c07VarB == null) {
                return true;
            }
            sy4 name1111 = c07Var.getName();
            name1111.getClass();
            linkedHashSetI = I(name1111);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (c07Var4.l()) {
                }
            }
            return true;
        }
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (E((c07) it3.next(), c07Var2)) {
            }
        }
        int i8 = ig0.l;
        name = c07Var.getName();
        name.getClass();
        if (!y77.e.contains(name)) {
            c07VarB = B(c07Var);
            if (c07VarB == null) {
                return true;
            }
            sy4 name1112 = c07Var.getName();
            name1112.getClass();
            linkedHashSetI = I(name1112);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (c07Var4.l()) {
                }
            }
            return true;
        }
        sy4 name1113 = c07Var.getName();
        name1113.getClass();
        LinkedHashSet linkedHashSetI11 = I(name1113);
        arrayList = new ArrayList();
        it = linkedHashSetI11.iterator();
        while (it.hasNext()) {
            xw2VarA = ig0.a((c07) it.next());
            if (xw2VarA != null) {
                arrayList.add(xw2VarA);
            }
        }
        if (arrayList.isEmpty()) {
            c07VarB = B(c07Var);
            if (c07VarB == null) {
                return true;
            }
            sy4 name1114 = c07Var.getName();
            name1114.getClass();
            linkedHashSetI = I(name1114);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (c07Var4.l()) {
                }
            }
            return true;
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (K(c07Var, (xw2) it2.next())) {
            }
        }
        c07VarB = B(c07Var);
        if (c07VarB == null) {
            return true;
        }
        sy4 name1115 = c07Var.getName();
        name1115.getClass();
        linkedHashSetI = I(name1115);
        if (linkedHashSetI.isEmpty()) {
            return true;
        }
        while (r8.hasNext()) {
            if (c07Var4.l()) {
            }
        }
        return true;
        return false;
    }

    public final void M(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        Object obj = this.b.m;
        this.n.getClass();
    }

    public final ArrayList N(sy4 sy4Var) {
        Collection collectionC = ((mi1) this.e.a()).c(sy4Var);
        ArrayList arrayList = new ArrayList(mv0.Z(collectionC, 10));
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(t((j86) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(sy4 sy4Var) {
        LinkedHashSet linkedHashSetI = I(sy4Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            c07 c07Var = (c07) obj;
            c07Var.getClass();
            if (o77.n(c07Var) == null && ig0.a(c07Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // o.s24, o.ap4, o.zo4
    public final Collection a(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        M(sy4Var, t35Var);
        return super.a(sy4Var, t35Var);
    }

    @Override // o.s24, o.ap4, o.zo4
    public final Collection d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        M(sy4Var, t35Var);
        return super.d(sy4Var, t35Var);
    }

    @Override // o.ap4, o.zo4
    public final ys0 g(sy4 sy4Var, t35 t35Var) {
        h50 h50Var;
        ns4 ns4Var;
        sy4Var.getClass();
        t35Var.getClass();
        M(sy4Var, t35Var);
        g24 g24Var = (g24) this.c;
        return (g24Var == null || (h50Var = g24Var.u) == null || (ns4Var = (ns4) h50Var.invoke(sy4Var)) == null) ? (ys0) this.u.invoke(sy4Var) : ns4Var;
    }

    @Override // o.s24
    public final Set h(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        return fv6.a0((Set) this.r.a(), ((Map) this.t.a()).keySet());
    }

    @Override // o.s24
    public final Set i(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        ns4 ns4Var = this.n;
        Collection collectionB = ns4Var.q().b();
        collectionB.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            qv0.c0(linkedHashSet, ((oz3) it.next()).I().b());
        }
        vd4 vd4Var = this.e;
        linkedHashSet.addAll(((mi1) vd4Var.a()).a());
        linkedHashSet.addAll(((mi1) vd4Var.a()).d());
        linkedHashSet.addAll(h(no1Var, function1));
        yc4 yc4Var = this.b;
        ns4Var.getClass();
        yc4Var.getClass();
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // o.s24
    public final void j(ArrayList arrayList, sy4 sy4Var) throws IllegalAccessException, InvocationTargetException {
        boolean zG = this.f850o.g();
        ns4 ns4Var = this.n;
        yc4 yc4Var = this.b;
        if (zG) {
            vd4 vd4Var = this.e;
            if (((mi1) vd4Var.a()).f(sy4Var) != null) {
                if (arrayList.isEmpty()) {
                    m86 m86VarF = ((mi1) vd4Var.a()).f(sy4Var);
                    m86VarF.getClass();
                    eo3 eo3VarR0 = eo3.R0(ns4Var, ep1.D(yc4Var, m86VarF), m86VarF.c(), d82.z(m86VarF), true);
                    oz3 oz3VarV = ((iu) yc4Var.q).V(m86VarF.f(), lq1.I(n58.n, false, null, 6));
                    v14 v14VarP = p();
                    as4.m.getClass();
                    cp1 cp1Var = dp1.e;
                    ea2 ea2Var = ea2.m;
                    eo3VarR0.Q0(null, v14VarP, ea2Var, ea2Var, ea2Var, oz3VarV, as4.p, cp1Var, null);
                    eo3VarR0.P = 1;
                    arrayList.add(eo3VarR0);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((c07) it.next()).J().isEmpty()) {
                        }
                    }
                    m86 m86VarF2 = ((mi1) vd4Var.a()).f(sy4Var);
                    m86VarF2.getClass();
                    eo3 eo3VarR1 = eo3.R0(ns4Var, ep1.D(yc4Var, m86VarF2), m86VarF2.c(), d82.z(m86VarF2), true);
                    oz3 oz3VarV2 = ((iu) yc4Var.q).V(m86VarF2.f(), lq1.I(n58.n, false, null, 6));
                    v14 v14VarP2 = p();
                    as4.m.getClass();
                    cp1 cp1Var2 = dp1.e;
                    ea2 ea2Var2 = ea2.m;
                    eo3VarR1.Q0(null, v14VarP2, ea2Var2, ea2Var2, ea2Var2, oz3VarV2, as4.p, cp1Var2, null);
                    eo3VarR1.P = 1;
                    arrayList.add(eo3VarR1);
                }
            }
        }
        ns4Var.getClass();
        yc4Var.getClass();
    }

    @Override // o.s24
    public final mi1 k() {
        return new zr0(this.f850o, e24.n);
    }

    @Override // o.s24
    public final void m(LinkedHashSet linkedHashSet, sy4 sy4Var) {
        LinkedHashSet linkedHashSetI = I(sy4Var);
        if (!y77.j.contains(sy4Var)) {
            int i = ig0.l;
            if (!y77.e.contains(sy4Var)) {
                if (!linkedHashSetI.isEmpty()) {
                    Iterator it = linkedHashSetI.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((xw2) it.next()).l()) {
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : linkedHashSetI) {
                    if (L((c07) obj)) {
                        arrayList.add(obj);
                    }
                }
                w(linkedHashSet, sy4Var, arrayList, false);
                return;
            }
        }
        v17 v17Var = new v17();
        LinkedHashSet linkedHashSetW = wo1.W(sy4Var, linkedHashSetI, ea2.m, this.n, ad2.e, ((q35) ((io3) this.b.m).l).d);
        int i2 = 1;
        x(sy4Var, linkedHashSet, linkedHashSetW, linkedHashSet, new cg0((byte) 5, i2, this));
        x(sy4Var, linkedHashSet, linkedHashSetW, v17Var, new cg0((byte) 6, i2, this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((c07) obj2)) {
                arrayList2.add(obj2);
            }
        }
        w(linkedHashSet, sy4Var, lv0.A0(arrayList2, v17Var), true);
    }

    @Override // o.s24
    public final void n(ArrayList arrayList, sy4 sy4Var) {
        j86 j86Var;
        boolean zIsAnnotation = this.f850o.a.isAnnotation();
        yc4 yc4Var = this.b;
        if (zIsAnnotation && (j86Var = (j86) lv0.G0(((mi1) this.e.a()).c(sy4Var))) != null) {
            ho3 ho3VarL0 = ho3.L0(this.n, ep1.D(yc4Var, j86Var), h57.y(j86Var.e()), false, j86Var.c(), d82.z(j86Var), false);
            eu5 eu5VarJ = io1.J(ho3VarL0, yl7.p);
            ho3VarL0.H0(eu5VarJ, null, null, null);
            yc4Var.getClass();
            oz3 oz3VarL = s24.l(j86Var, new yc4((io3) yc4Var.m, new x24(yc4Var, ho3VarL0, j86Var, 0), (u14) yc4Var.f2598o));
            v14 v14VarP = p();
            ea2 ea2Var = ea2.m;
            ho3VarL0.K0(oz3VarL, ea2Var, v14VarP, null, ea2Var);
            eu5VarJ.y = oz3VarL;
            arrayList.add(ho3VarL0);
        }
        Set setJ = J(sy4Var);
        if (setJ.isEmpty()) {
            return;
        }
        v17 v17Var = new v17();
        v17 v17Var2 = new v17();
        y(setJ, arrayList, v17Var, new f24(this, (byte) 0));
        y(fv6.Z(setJ, v17Var), v17Var2, null, new f24(this, (byte) 1));
        arrayList.addAll(wo1.W(sy4Var, fv6.a0(setJ, v17Var2), arrayList, this.n, jk0.H, ((q35) ((io3) yc4Var.m).l).d));
    }

    @Override // o.s24
    public final Set o(no1 no1Var) {
        no1Var.getClass();
        if (this.f850o.a.isAnnotation()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((mi1) this.e.a()).e());
        Collection collectionB = this.n.q().b();
        collectionB.getClass();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            qv0.c0(linkedHashSet, ((oz3) it.next()).I().f());
        }
        return linkedHashSet;
    }

    @Override // o.s24
    public final v14 p() {
        ns4 ns4Var = this.n;
        if (ns4Var != null) {
            int i = zo1.a;
            return ns4Var.q0();
        }
        zo1.a(0);
        throw null;
    }

    @Override // o.s24
    public final fi1 q() {
        return this.n;
    }

    @Override // o.s24
    public final boolean r(eo3 eo3Var) {
        if (this.f850o.a.isAnnotation()) {
            return false;
        }
        return L(eo3Var);
    }

    @Override // o.s24
    public final r24 s(j86 j86Var, ArrayList arrayList, oz3 oz3Var, List list) {
        j86Var.getClass();
        Object obj = this.b.m;
        if (this.n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new r24(oz3Var, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o.s24
    public final String toString() {
        return "Lazy Java member scope for " + this.f850o.c();
    }

    public final void v(ArrayList arrayList, un3 un3Var, int i, j86 j86Var, oz3 oz3Var, oz3 oz3Var2) {
        r76 b86Var;
        tp tpVar = yl7.p;
        sy4 sy4VarC = j86Var.c();
        if (oz3Var == null) {
            p58.a(2);
            throw null;
        }
        m98 m98VarH = p58.h(oz3Var, false);
        Object defaultValue = j86Var.a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = p76.a;
            if (Enum.class.isAssignableFrom(cls)) {
                b86Var = new f86(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                b86Var = new s76(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                b86Var = new t76(null, (Object[]) defaultValue);
            } else {
                b86Var = defaultValue instanceof Class ? new b86(null, (Class) defaultValue) : new h86(null, defaultValue);
            }
        } else {
            b86Var = null;
        }
        boolean z = b86Var != null;
        m98 m98VarH2 = oz3Var2 != null ? p58.h(oz3Var2, false) : null;
        Object obj = this.b.m;
        arrayList.add(new qb8(un3Var, null, i, tpVar, sy4VarC, m98VarH, z, false, false, m98VarH2, d82.z(j86Var)));
    }

    public final void w(LinkedHashSet linkedHashSet, sy4 sy4Var, ArrayList arrayList, boolean z) {
        io3 io3Var = (io3) this.b.m;
        LinkedHashSet<c07> linkedHashSetW = wo1.W(sy4Var, arrayList, linkedHashSet, this.n, jk0.H, ((q35) io3Var.l).d);
        if (!z) {
            linkedHashSet.addAll(linkedHashSetW);
            return;
        }
        ArrayList arrayListA0 = lv0.A0(linkedHashSet, linkedHashSetW);
        ArrayList arrayList2 = new ArrayList(mv0.Z(linkedHashSetW, 10));
        for (c07 c07VarA : linkedHashSetW) {
            c07 c07Var = (c07) o77.o(c07VarA);
            if (c07Var != null) {
                c07VarA = A(c07VarA, c07Var, arrayListA0);
            }
            arrayList2.add(c07VarA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x(sy4 sy4Var, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, Function1 function1) {
        c07 c07VarA;
        Object next;
        c07 c07Var;
        c07 c07VarA2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            c07 c07Var2 = (c07) it.next();
            c07 c07Var3 = (c07) o77.n(c07Var2);
            c07 c07Var4 = null;
            if (c07Var3 != null) {
                String strM = o77.m(c07Var3);
                strM.getClass();
                Iterator it2 = ((Collection) function1.invoke(sy4.e(strM))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c07VarA = null;
                        break;
                    }
                    ww2 ww2VarG0 = ((c07) it2.next()).g0();
                    ww2VarG0.y(sy4Var);
                    ww2VarG0.J();
                    ww2VarG0.l();
                    xw2 xw2VarBuild = ww2VarG0.build();
                    xw2VarBuild.getClass();
                    c07 c07Var5 = (c07) xw2VarBuild;
                    if (E(c07Var3, c07Var5)) {
                        c07VarA = A(c07Var5, c07Var3, linkedHashSet);
                        break;
                    }
                }
            } else {
                c07VarA = null;
                break;
            }
            if (c07VarA != null) {
                abstractSet.add(c07VarA);
            }
            xw2 xw2VarA = ig0.a(c07Var2);
            if (xw2VarA == 0) {
                c07VarA2 = null;
            } else {
                sy4 name = ((gi1) xw2VarA).getName();
                name.getClass();
                Iterator it3 = ((Iterable) function1.invoke(name)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!K((c07) next, xw2VarA));
                c07 c07Var6 = (c07) next;
                if (c07Var6 != null) {
                    ww2 ww2VarG1 = c07Var6.g0();
                    List listJ = xw2VarA.J();
                    listJ.getClass();
                    ArrayList arrayList = new ArrayList(mv0.Z(listJ, 10));
                    Iterator it4 = listJ.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((qb8) it4.next()).getType());
                    }
                    List listJ2 = c07Var6.J();
                    listJ2.getClass();
                    ww2VarG1.b(r47.l(arrayList, listJ2, xw2VarA));
                    ww2VarG1.J();
                    ww2VarG1.l();
                    ww2VarG1.o();
                    c07Var = (c07) ww2VarG1.build();
                } else {
                    c07Var = null;
                }
                if (c07Var == null) {
                    c07VarA2 = null;
                } else {
                    if (!L(c07Var)) {
                        c07Var = null;
                    }
                    if (c07Var != null) {
                        c07VarA2 = A(c07Var, xw2VarA, linkedHashSet);
                    } else {
                        c07VarA2 = null;
                    }
                }
            }
            if (c07VarA2 != null) {
                abstractSet.add(c07VarA2);
            }
            if (c07Var2.l()) {
                sy4 name2 = c07Var2.getName();
                name2.getClass();
                Iterator it5 = ((Iterable) function1.invoke(name2)).iterator();
                while (it5.hasNext()) {
                    c07 c07VarB = B((c07) it5.next());
                    if (c07VarB == null || !D(c07VarB, c07Var2)) {
                        c07VarB = null;
                    }
                    if (c07VarB != null) {
                        c07Var4 = c07VarB;
                        break;
                    }
                }
            }
            if (c07Var4 != null) {
                abstractSet.add(c07Var4);
            }
        }
    }

    public final void y(Set set, AbstractCollection abstractCollection, v17 v17Var, Function1 function1) {
        c07 c07VarH;
        ju5 ju5VarR;
        co3 co3Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bu5 bu5Var = (bu5) it.next();
            if (C(bu5Var, function1)) {
                c07 c07VarG = G(bu5Var, function1);
                c07VarG.getClass();
                if (bu5Var.R()) {
                    c07VarH = H(bu5Var, function1);
                    c07VarH.getClass();
                } else {
                    c07VarH = null;
                }
                if (c07VarH != null) {
                    c07VarH.r();
                    c07VarG.r();
                }
                ns4 ns4Var = this.n;
                ns4Var.getClass();
                co3 co3Var2 = new co3(ns4Var, yl7.p, c07VarG.r(), c07VarG.e(), c07VarH != null, bu5Var.getName(), c07VarG.c(), null, 1, false, null);
                oz3 oz3Var = c07VarG.s;
                oz3Var.getClass();
                v14 v14VarP = p();
                ea2 ea2Var = ea2.m;
                co3Var2.K0(oz3Var, ea2Var, v14VarP, null, ea2Var);
                eu5 eu5VarP = io1.P(co3Var2, c07VarG.getAnnotations(), false, c07VarG.c());
                eu5VarP.x = c07VarG;
                eu5VarP.F0(co3Var2.getType());
                if (c07VarH != null) {
                    List listJ = c07VarH.J();
                    listJ.getClass();
                    qb8 qb8Var = (qb8) lv0.o0(listJ);
                    if (qb8Var == null) {
                        hk0.s(c07VarH, "No parameter found for ");
                        return;
                    } else {
                        ju5VarR = io1.R(co3Var2, c07VarH.getAnnotations(), qb8Var.getAnnotations(), false, c07VarH.e(), c07VarH.c());
                        ju5VarR.x = c07VarH;
                    }
                } else {
                    ju5VarR = null;
                }
                co3Var2.H0(eu5VarP, ju5VarR, null, null);
                co3Var = co3Var2;
            } else {
                co3Var = null;
            }
            if (co3Var != null) {
                abstractCollection.add(co3Var);
                if (v17Var != null) {
                    v17Var.add(bu5Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z = this.p;
        ns4 ns4Var = this.n;
        if (z) {
            Collection collectionB = ns4Var.q().b();
            collectionB.getClass();
            return collectionB;
        }
        Object obj = this.b.m;
        ns4Var.getClass();
        Collection collectionB2 = ns4Var.q().b();
        collectionB2.getClass();
        return collectionB2;
    }
}
