package o;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dw1 implements iw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f659o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ dw1(i97 i97Var, hz1 hz1Var, i97 i97Var2, fw1 fw1Var, Function1 function1, Function0 function0, i97 i97Var3, i97 i97Var4, px4 px4Var, i97 i97Var5, i97 i97Var6, px4 px4Var2, a06 a06Var) {
        this.n = i97Var;
        this.t = hz1Var;
        this.f659o = i97Var2;
        this.u = fw1Var;
        this.v = function1;
        this.w = function0;
        this.p = i97Var3;
        this.q = i97Var4;
        this.x = px4Var;
        this.r = i97Var5;
        this.s = i97Var6;
        this.y = px4Var2;
        this.z = a06Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        av7 av7Var;
        cv7 cv7Var;
        yy0 yy0Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        aw awVar = e01.a;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        Object obj7 = this.w;
        Object obj8 = this.v;
        Object obj9 = this.u;
        Object obj10 = this.t;
        Object obj11 = this.s;
        Object obj12 = this.r;
        Object obj13 = this.q;
        Object obj14 = this.p;
        Object obj15 = this.f659o;
        Object obj16 = this.n;
        switch (b) {
            case 0:
                i97 i97Var = (i97) obj16;
                hz1 hz1Var = (hz1) obj10;
                i97 i97Var2 = (i97) obj15;
                fw1 fw1Var = (fw1) obj9;
                Function1 function1 = (Function1) obj8;
                Function0 function0 = (Function0) obj7;
                i97 i97Var3 = (i97) obj14;
                i97 i97Var4 = (i97) obj13;
                px4 px4Var = (px4) obj6;
                i97 i97Var5 = (i97) obj12;
                i97 i97Var6 = (i97) obj11;
                px4 px4Var2 = (px4) obj5;
                a06 a06Var = (a06) obj4;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((nd5) obj).getClass();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var.Q();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.b.c;
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fillElement);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    lr0 lr0Var = (lr0) i97Var.getValue();
                    gl4 gl4Var = (gl4) i97Var3.getValue();
                    List list = (List) i97Var4.getValue();
                    boolean zH = ux2Var.h(hz1Var);
                    Object objK = ux2Var.K();
                    if (zH || objK == awVar) {
                        objK = new m9(0, hz1Var, hz1.class, "showSearchView", "showSearchView()V", 0, (byte) 25);
                        ux2Var.g0(objK);
                    }
                    pu3 pu3Var = (pu3) objK;
                    boolean zH2 = ux2Var.h(hz1Var);
                    Object objK2 = ux2Var.K();
                    if (zH2 || objK2 == awVar) {
                        objK2 = new m9(0, hz1Var, hz1.class, "dismissSearchView", "dismissSearchView()V", 0, (byte) 26);
                        ux2Var.g0(objK2);
                    }
                    pu3 pu3Var2 = (pu3) objK2;
                    boolean zBooleanValue = ((Boolean) px4Var.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) i97Var5.getValue()).booleanValue();
                    List list2 = (List) i97Var4.getValue();
                    if ((2 & 1) != 0) {
                        zBooleanValue2 = false;
                    }
                    int i = 2 & 4;
                    ea2 ea2Var = ea2.m;
                    if (i != 0) {
                        list2 = ea2Var;
                    }
                    bl6 bl6Var = new bl6(ea2Var, list2, zBooleanValue2);
                    boolean zBooleanValue3 = ((Boolean) i97Var6.getValue()).booleanValue();
                    l33 l33Var = (l33) i97Var2.getValue();
                    boolean zH3 = ux2Var.h(hz1Var);
                    Object objK3 = ux2Var.K();
                    if (zH3 || objK3 == awVar) {
                        objK3 = new i0(1, hz1Var, hz1.class, "updateSelectedGroup", "updateSelectedGroup(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/groups/data/GroupInfo;)V", 0, (byte) 29);
                        ux2Var.g0(objK3);
                    }
                    pu3 pu3Var3 = (pu3) objK3;
                    boolean zH4 = ux2Var.h(hz1Var);
                    Object objK4 = ux2Var.K();
                    if (zH4 || objK4 == awVar) {
                        objK4 = new bw1(hz1Var, (byte) 3);
                        ux2Var.g0(objK4);
                    }
                    Function1 function2 = (Function1) objK4;
                    Function1 function3 = (Function1) pu3Var3;
                    boolean zH5 = ux2Var.h(hz1Var);
                    Object objK5 = ux2Var.K();
                    if (zH5 || objK5 == awVar) {
                        objK5 = new bw1(hz1Var, (byte) 4);
                        ux2Var.g0(objK5);
                    }
                    Function1 function4 = (Function1) objK5;
                    boolean zH6 = ux2Var.h(fw1Var);
                    Object objK6 = ux2Var.K();
                    if (zH6 || objK6 == awVar) {
                        objK6 = new zz0(fw1Var, (byte) 13);
                        ux2Var.g0(objK6);
                    }
                    Function0 function5 = (Function0) objK6;
                    Function0 function6 = (Function0) pu3Var;
                    Function0 function7 = (Function0) pu3Var2;
                    boolean zH7 = ux2Var.h(fw1Var);
                    Object objK7 = ux2Var.K();
                    if (zH7 || objK7 == awVar) {
                        objK7 = new a81(fw1Var, (byte) 10);
                        ux2Var.g0(objK7);
                    }
                    Function1 function8 = (Function1) objK7;
                    boolean zH8 = ux2Var.h(hz1Var);
                    Object objK8 = ux2Var.K();
                    if (zH8 || objK8 == awVar) {
                        objK8 = new bw1(hz1Var, (byte) 5);
                        ux2Var.g0(objK8);
                    }
                    Function1 function9 = (Function1) objK8;
                    boolean zH9 = ux2Var.h(hz1Var);
                    Object objK9 = ux2Var.K();
                    if (zH9 || objK9 == awVar) {
                        objK9 = new aw1(hz1Var, (byte) 3);
                        ux2Var.g0(objK9);
                    }
                    Function0 function10 = (Function0) objK9;
                    Object objK10 = ux2Var.K();
                    if (objK10 == awVar) {
                        objK10 = new va(px4Var2, (byte) 12);
                        ux2Var.g0(objK10);
                    }
                    ex1.c(lr0Var, function2, list, l33Var, function3, function4, function5, function6, function7, zBooleanValue, bl6Var, zBooleanValue3, function1, function0, function8, function9, fillElement, gl4Var, function10, (Function1) objK10, null, ux2Var, 0);
                    yr6 yr6Var = (yr6) px4Var2.getValue();
                    if (yr6Var == null) {
                        ux2Var.W(-505089582);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(-505089581);
                        m77.j(yr6Var.a, a06Var, yr6Var.b, au8.s(fillElement, ((rn4) ux2Var.j(un4.a)).a.p, kh.V), ux2Var, 0, 0);
                        ux2Var.p(false);
                    }
                    ux2Var.p(true);
                }
                break;
            default:
                vx4 vx4Var = (vx4) obj15;
                bv7 bv7Var = (bv7) obj14;
                kh6 kh6Var = (kh6) obj13;
                fs4 fs4Var = (fs4) obj12;
                ye5 ye5Var = (ye5) obj11;
                ru7 ru7Var = (ru7) obj10;
                iw2 iw2Var = (iw2) obj9;
                he5 he5Var = (he5) obj8;
                vu7 vu7Var = (vu7) obj7;
                final yy0 yy0Var2 = (yy0) obj6;
                final ou7 ou7Var = (ou7) obj5;
                final yy0 yy0Var3 = (yy0) obj4;
                yg4 yg4Var = (yg4) obj;
                ux2 ux2Var2 = (ux2) obj2;
                ((Integer) obj3).getClass();
                boolean zF = ux2Var2.f((u18) obj16) | ux2Var2.f(yg4Var);
                Object objK11 = ux2Var2.K();
                if (zF || objK11 == awVar) {
                    objK11 = new av7(bv7Var, yg4Var, kh6Var, xm4.R(new vd5(yu7.m, new sq2()), new vd5(yu7.n, new sq2()), new vd5(yu7.f2646o, new sq2())));
                    ux2Var2.g0(objK11);
                }
                final av7 av7Var2 = (av7) objK11;
                final cv7 cv7VarB = vx4Var.b();
                vl1 vl1Var = (vl1) ux2Var2.j(tu7.a);
                final byte b2 = 0;
                yy0 yy0VarO = au8.O(-1811043880, new hw2() { // from class: o.su7
                    @Override // o.hw2
                    public final Object invoke(Object obj17, Object obj18) {
                        byte b3 = b2;
                        f88 f88Var2 = f88.a;
                        cv7 cv7Var2 = cv7VarB;
                        ou7 ou7Var2 = ou7Var;
                        av7 av7Var3 = av7Var2;
                        yy0 yy0Var4 = yy0Var2;
                        ux2 ux2Var3 = (ux2) obj17;
                        int iIntValue2 = ((Integer) obj18).intValue();
                        switch (b3) {
                            case 0:
                                if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    yu7 yu7Var = yu7.m;
                                    yy0Var4.d(v67.q(yu7Var, av7Var3, ou7Var2.a(yu7Var), x67.q(cv7Var2, yu7Var), ux2Var3), ux2Var3, 0);
                                }
                                break;
                            default:
                                if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    yu7 yu7Var2 = yu7.n;
                                    yy0Var4.d(v67.q(yu7Var2, av7Var3, ou7Var2.a(yu7Var2), x67.q(cv7Var2, yu7Var2), ux2Var3), ux2Var3, 0);
                                }
                                break;
                        }
                        return f88Var2;
                    }
                }, ux2Var2);
                final byte b3 = 1;
                yy0 yy0VarO2 = au8.O(1603374775, new hw2() { // from class: o.su7
                    @Override // o.hw2
                    public final Object invoke(Object obj17, Object obj18) {
                        byte b4 = b3;
                        f88 f88Var2 = f88.a;
                        cv7 cv7Var2 = cv7VarB;
                        ou7 ou7Var2 = ou7Var;
                        av7 av7Var3 = av7Var2;
                        yy0 yy0Var4 = yy0Var3;
                        ux2 ux2Var3 = (ux2) obj17;
                        int iIntValue2 = ((Integer) obj18).intValue();
                        switch (b4) {
                            case 0:
                                if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    yu7 yu7Var = yu7.m;
                                    yy0Var4.d(v67.q(yu7Var, av7Var3, ou7Var2.a(yu7Var), x67.q(cv7Var2, yu7Var), ux2Var3), ux2Var3, 0);
                                }
                                break;
                            default:
                                if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    yu7 yu7Var2 = yu7.n;
                                    yy0Var4.d(v67.q(yu7Var2, av7Var3, ou7Var2.a(yu7Var2), x67.q(cv7Var2, yu7Var2), ux2Var3), ux2Var3, 0);
                                }
                                break;
                        }
                        return f88Var2;
                    }
                }, ux2Var2);
                if (iw2Var == null) {
                    ux2Var2.W(-1647365771);
                    ux2Var2.p(false);
                    yy0Var = null;
                    av7Var = av7Var2;
                    cv7Var = cv7VarB;
                } else {
                    ux2Var2.W(-1647314837);
                    av7Var = av7Var2;
                    cv7Var = cv7VarB;
                    yy0 yy0VarO3 = au8.O(70089074, new z8((Object) iw2Var, (Object) av7Var2, (Object) ou7Var, (Object) cv7VarB, (byte) 22), ux2Var2);
                    ux2Var2.p(false);
                    yy0Var = yy0VarO3;
                }
                ux2Var2.W(-1646612843);
                ux2Var2.p(false);
                vl1Var.a(new nf(fs4Var, ye5Var, vx4Var, ru7Var, yy0VarO, yy0VarO2, yy0Var, he5Var, null, vu7Var, (byte) 5), ux2Var2, 0);
                ye5Var.getClass();
                ux2Var2.W(-1646189134);
                yu7 yu7Var = cv7Var.d;
                boolean zH10 = ux2Var2.h(av7Var) | ux2Var2.f(cv7Var);
                Object objK12 = ux2Var2.K();
                if (zH10 || objK12 == awVar) {
                    objK12 = new i9(av7Var, cv7Var, null, (byte) 26);
                    ux2Var2.g0(objK12);
                }
                ck3.i(yu7Var, (hw2) objK12, ux2Var2);
                ux2Var2.p(false);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ dw1(u18 u18Var, vx4 vx4Var, bv7 bv7Var, lh6 lh6Var, fs4 fs4Var, ye5 ye5Var, ru7 ru7Var, iw2 iw2Var, he5 he5Var, vu7 vu7Var, yy0 yy0Var, ou7 ou7Var, yy0 yy0Var2) {
        this.n = u18Var;
        this.f659o = vx4Var;
        this.p = bv7Var;
        this.q = lh6Var;
        this.r = fs4Var;
        this.s = ye5Var;
        this.t = ru7Var;
        this.u = iw2Var;
        this.v = he5Var;
        this.w = vu7Var;
        this.x = yy0Var;
        this.y = ou7Var;
        this.z = yy0Var2;
    }
}
