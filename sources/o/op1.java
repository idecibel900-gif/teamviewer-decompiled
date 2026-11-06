package o;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class op1 extends e0 {
    public final /* synthetic */ byte c = 1;
    public final vd4 d;
    public final /* synthetic */ d0 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public op1(pp1 pp1Var) {
        this.e = pp1Var;
        fp1 fp1Var = pp1Var.x;
        super((xd4) ((io.sentry.android.replay.screenshot.k) fp1Var.a).a);
        xd4 xd4Var = (xd4) ((io.sentry.android.replay.screenshot.k) fp1Var.a).a;
        jp1 jp1Var = new jp1(pp1Var, (byte) 6);
        xd4Var.getClass();
        this.d = new vd4(xd4Var, jp1Var);
    }

    @Override // o.k48
    public final ys0 a() {
        byte b = this.c;
        d0 d0Var = this.e;
        switch (b) {
            case 0:
                return (pp1) d0Var;
            default:
                return (b24) d0Var;
        }
    }

    @Override // o.k48
    public final boolean c() {
        switch (this.c) {
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x023e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0250  */
    /* JADX WARN: Code duplicated, block: B:107:0x0253  */
    /* JADX WARN: Code duplicated, block: B:109:0x0258  */
    /* JADX WARN: Code duplicated, block: B:112:0x0261  */
    /* JADX WARN: Code duplicated, block: B:115:0x0276 A[LOOP:1: B:113:0x0270->B:115:0x0276, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0298  */
    /* JADX WARN: Code duplicated, block: B:119:0x029e  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:168:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0209  */
    /* JADX WARN: Code duplicated, block: B:91:0x0217  */
    /* JADX WARN: Code duplicated, block: B:94:0x0220  */
    /* JADX WARN: Code duplicated, block: B:95:0x0225  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0086, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v35 */
    @Override // o.d3
    public final Collection e() throws l58 {
        String strB;
        ht2 ht2VarA;
        ?? arrayList;
        String str;
        ht2 ht2Var;
        ht2 ht2Var2;
        ArrayList arrayList2;
        g07 g07VarO;
        ub8 ub8Var;
        ns4 ns4Var;
        oz3 oz3VarH;
        ArrayList arrayList3;
        oz3 oz3VarV;
        oz3 oz3VarJ;
        k48 k48VarO0;
        k48 k48VarO1;
        byte b = this.c;
        d0 d0Var = this.e;
        switch (b) {
            case 0:
                pp1 pp1Var = (pp1) d0Var;
                tu5 tu5Var = pp1Var.q;
                fp1 fp1Var = pp1Var.x;
                d22 d22Var = (d22) fp1Var.d;
                tu5Var.getClass();
                List list = tu5Var.t;
                boolean zIsEmpty = list.isEmpty();
                ?? arrayList4 = list;
                if (zIsEmpty) {
                    arrayList4 = 0;
                }
                if (arrayList4 == 0) {
                    List<Integer> list2 = tu5Var.u;
                    list2.getClass();
                    arrayList4 = new ArrayList(mv0.Z(list2, 10));
                    for (Integer num : list2) {
                        num.getClass();
                        arrayList4.add(d22Var.a(num.intValue()));
                    }
                }
                ArrayList arrayList5 = new ArrayList(mv0.Z(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((q48) fp1Var.h).g((aw5) it.next()));
                }
                ArrayList arrayListA0 = lv0.A0(arrayList5, ((cc) ((io.sentry.android.replay.screenshot.k) fp1Var.a).n).e(pp1Var));
                ArrayList<c55> arrayList6 = new ArrayList();
                Iterator it2 = arrayListA0.iterator();
                while (it2.hasNext()) {
                    ys0 ys0VarA = ((oz3) it2.next()).o0().a();
                    c55 c55Var = ys0VarA instanceof c55 ? (c55) ys0VarA : null;
                    if (c55Var != null) {
                        arrayList6.add(c55Var);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    ad2 ad2Var = (ad2) ((io.sentry.android.replay.screenshot.k) fp1Var.a).h;
                    ArrayList arrayList7 = new ArrayList(mv0.Z(arrayList6, 10));
                    for (c55 c55Var2 : arrayList6) {
                        js0 js0VarF = bp1.f(c55Var2);
                        if (js0VarF == null || (ht2VarA = js0VarF.a()) == null) {
                            strB = c55Var2.getName().b();
                            strB.getClass();
                        } else {
                            strB = ht2VarA.b();
                        }
                        arrayList7.add(strB);
                    }
                    ad2Var.j(pp1Var, arrayList7);
                }
                return lv0.P0(arrayListA0);
            default:
                b24 b24Var = (b24) d0Var;
                yc4 yc4Var = b24Var.v;
                Class cls = b24Var.t.a;
                boolean zEquals = cls.equals(Object.class);
                ea2 ea2Var = ea2.m;
                if (zEquals) {
                    arrayList = ea2Var;
                } else {
                    nm nmVar = new nm(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    nmVar.g(genericSuperclass != null ? genericSuperclass : Object.class);
                    nmVar.i(cls.getGenericInterfaces());
                    ArrayList arrayList8 = nmVar.a;
                    List listL = qf0.L(arrayList8.toArray(new Type[arrayList8.size()]));
                    arrayList = new ArrayList(mv0.Z(listL, 10));
                    Iterator it3 = listL.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new c86((Type) it3.next()));
                    }
                }
                ArrayList arrayList9 = new ArrayList(arrayList.size());
                ArrayList<n86> arrayList10 = new ArrayList(0);
                z14 z14Var = b24Var.G;
                ht2 ht2Var3 = tr3.n;
                ht2Var3.getClass();
                hp hpVarU = z14Var.u(ht2Var3);
                if (hpVarU != null) {
                    Object objG0 = lv0.G0(hpVarU.e().values());
                    qb7 qb7Var = objG0 instanceof qb7 ? (qb7) objG0 : null;
                    if (qb7Var != null && (str = (String) qb7Var.a) != null) {
                        h97 h97Var = h97.m;
                        int i = 0;
                        while (true) {
                            int length = str.length();
                            h97 h97Var2 = h97.f961o;
                            if (i < length) {
                                char cCharAt = str.charAt(i);
                                int iOrdinal = h97Var.ordinal();
                                if (iOrdinal == 0) {
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        h97Var = h97.n;
                                        i++;
                                    }
                                } else if (iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        gk0.s();
                                        return null;
                                    }
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        h97Var = h97.n;
                                        i++;
                                    }
                                } else {
                                    if (cCharAt == '.') {
                                        h97Var = h97Var2;
                                    } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                    }
                                    i++;
                                }
                            } else {
                                ht2Var = h97Var != h97Var2 ? new ht2(str) : null;
                            }
                        }
                    }
                }
                if (ht2Var == null || ht2Var.d() || !ht2Var.h(t87.k)) {
                    ht2Var = null;
                }
                ub8 ub8Var2 = ub8.f2197o;
                if (ht2Var == null) {
                    LinkedHashMap linkedHashMap = nh2.a;
                    ht2Var2 = (ht2) nh2.b.get(bp1.g(b24Var));
                    if (ht2Var2 == null) {
                        g07VarO = null;
                    }
                    for (c86 c86Var : arrayList) {
                        ub8 ub8Var3 = ub8Var2;
                        oz3VarV = ((iu) yc4Var.q).V(c86Var, lq1.I(n58.m, false, null, 7));
                        oz3VarJ = ((io3) yc4Var.m).k.j(new zz6((so) null, false, yc4Var, lp.TYPE_USE, true), oz3VarV, ea2Var, null, false);
                        if (oz3VarJ != null) {
                            oz3VarV = oz3VarJ;
                        }
                        if (oz3VarV.o0().a() instanceof c55) {
                            arrayList10.add(c86Var);
                        }
                        k48VarO0 = oz3VarV.o0();
                        if (g07VarO != null) {
                            k48VarO1 = g07VarO.o0();
                        } else {
                            k48VarO1 = null;
                        }
                        if (!im3.n(k48VarO0, k48VarO1) && !wy3.x(oz3VarV)) {
                            arrayList9.add(oz3VarV);
                        }
                        ub8Var2 = ub8Var3;
                    }
                    ub8Var = ub8Var2;
                    ns4Var = b24Var.u;
                    if (ns4Var != null) {
                        oz3VarH = new m58(lv1.G(ns4Var, b24Var)).h(ns4Var.W(), ub8Var);
                    } else {
                        oz3VarH = null;
                    }
                    if (oz3VarH != null) {
                        arrayList9.add(oz3VarH);
                    }
                    if (g07VarO != null) {
                        arrayList9.add(g07VarO);
                    }
                    if (!arrayList10.isEmpty()) {
                        return !arrayList9.isEmpty() ? lv0.P0(arrayList9) : qf0.K(((io3) yc4Var.m).h.p.e());
                    }
                    Object obj = yc4Var.m;
                    arrayList3 = new ArrayList(mv0.Z(arrayList10, 10));
                    for (n86 n86Var : arrayList10) {
                        n86Var.getClass();
                        arrayList3.add(((c86) n86Var).a.toString());
                    }
                    an4.t("Incomplete hierarchy for class ", b24Var.getName(), ", unresolved classes ", arrayList3);
                    return null;
                }
                ht2Var2 = ht2Var;
                qs4 qs4Var = ((io3) yc4Var.m).h;
                int i2 = bp1.a;
                ht2Var2.d();
                d54 d54Var = qs4Var.y(ht2Var2.e()).s;
                sy4 sy4VarF = ht2Var2.f();
                sy4VarF.getClass();
                ys0 ys0VarG = d54Var.g(sy4VarF, t35.t);
                ns4 ns4Var2 = ys0VarG instanceof ns4 ? (ns4) ys0VarG : null;
                if (ns4Var2 == null) {
                    g07VarO = null;
                } else {
                    int size = ns4Var2.q().getParameters().size();
                    List parameters = b24Var.B.getParameters();
                    parameters.getClass();
                    int size2 = parameters.size();
                    if (size2 == size) {
                        arrayList2 = new ArrayList(mv0.Z(parameters, 10));
                        Iterator it4 = parameters.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(new w87(((d58) it4.next()).W(), ub8Var2));
                        }
                    } else if (size2 == 1 && size > 1 && ht2Var == null) {
                        w87 w87Var = new w87(((d58) lv0.F0(parameters)).W(), ub8Var2);
                        yk3 yk3Var = new yk3(1, size, 1);
                        ArrayList arrayList11 = new ArrayList(mv0.Z(yk3Var, 10));
                        Iterator it5 = yk3Var.iterator();
                        while (true) {
                            xk3 xk3Var = (xk3) it5;
                            if (xk3Var.f2526o) {
                                xk3Var.nextInt();
                                arrayList11.add(w87Var);
                            } else {
                                arrayList2 = arrayList11;
                            }
                        }
                    } else {
                        g07VarO = null;
                    }
                    g48.n.getClass();
                    g07VarO = bt1.O(g48.f858o, ns4Var2, arrayList2);
                }
                while (r16.hasNext()) {
                    ub8 ub8Var4 = ub8Var2;
                    oz3VarV = ((iu) yc4Var.q).V(c86Var, lq1.I(n58.m, false, null, 7));
                    oz3VarJ = ((io3) yc4Var.m).k.j(new zz6((so) null, false, yc4Var, lp.TYPE_USE, true), oz3VarV, ea2Var, null, false);
                    if (oz3VarJ != null) {
                        oz3VarV = oz3VarJ;
                    }
                    if (oz3VarV.o0().a() instanceof c55) {
                        arrayList10.add(c86Var);
                    }
                    k48VarO0 = oz3VarV.o0();
                    if (g07VarO != null) {
                        k48VarO1 = g07VarO.o0();
                    } else {
                        k48VarO1 = null;
                    }
                    if (!im3.n(k48VarO0, k48VarO1)) {
                        arrayList9.add(oz3VarV);
                    }
                    ub8Var2 = ub8Var4;
                }
                ub8Var = ub8Var2;
                ns4Var = b24Var.u;
                if (ns4Var != null) {
                    oz3VarH = new m58(lv1.G(ns4Var, b24Var)).h(ns4Var.W(), ub8Var);
                } else {
                    oz3VarH = null;
                }
                if (oz3VarH != null) {
                    arrayList9.add(oz3VarH);
                }
                if (g07VarO != null) {
                    arrayList9.add(g07VarO);
                }
                if (!arrayList10.isEmpty()) {
                    if (!arrayList9.isEmpty()) {
                    }
                }
                Object obj2 = yc4Var.m;
                arrayList3 = new ArrayList(mv0.Z(arrayList10, 10));
                while (r2.hasNext()) {
                    n86Var.getClass();
                    arrayList3.add(((c86) n86Var).a.toString());
                }
                an4.t("Incomplete hierarchy for class ", b24Var.getName(), ", unresolved classes ", arrayList3);
                return null;
        }
    }

    @Override // o.d3
    public final jk0 g() {
        switch (this.c) {
            case 0:
                break;
            default:
                Object obj = ((b24) this.e).v.m;
                break;
        }
        return jk0.O;
    }

    @Override // o.k48
    public final List getParameters() {
        switch (this.c) {
            case 0:
                break;
        }
        return (List) this.d.a();
    }

    @Override // o.e0
    /* JADX INFO: renamed from: m */
    public final ns4 a() {
        byte b = this.c;
        d0 d0Var = this.e;
        switch (b) {
            case 0:
                return (pp1) d0Var;
            default:
                return (b24) d0Var;
        }
    }

    public final String toString() {
        byte b = this.c;
        d0 d0Var = this.e;
        switch (b) {
            case 0:
                String str = ((pp1) d0Var).getName().m;
                str.getClass();
                return str;
            default:
                String strB = ((b24) d0Var).getName().b();
                strB.getClass();
                return strB;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public op1(b24 b24Var) {
        this.e = b24Var;
        yc4 yc4Var = b24Var.v;
        super(((io3) yc4Var.m).a);
        this.d = new vd4(((io3) yc4Var.m).a, new a24(b24Var, (byte) 2));
    }
}
