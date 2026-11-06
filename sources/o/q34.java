package o;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.remotecontrolviewlib.activity.OnBoardingActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q34 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1800o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ q34(ud7 ud7Var, px4 px4Var, Function1 function1, Function0 function0) {
        this.m = (byte) 10;
        this.n = ud7Var;
        this.q = px4Var;
        this.f1800o = function1;
        this.p = function0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e A[PHI: r4
      0x006e: PHI (r4v61 o.rv0) = (r4v59 o.rv0), (r4v62 o.rv0) binds: [B:20:0x0079, B:16:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        x34 x34Var;
        fs4 fs4VarF;
        Object obj4;
        boolean z;
        Object hmVar;
        int i;
        Object obj5;
        boolean z2;
        fs4 fs4Var;
        rv0 rv0VarA;
        rv0 rv0Var;
        byte b = this.m;
        Function0 function0 = LayoutNode.e0;
        byte b2 = 28;
        byte b3 = 15;
        cs4 cs4Var = cs4.b;
        byte b4 = 16;
        Object obj6 = e01.a;
        f88 f88Var = f88.a;
        final byte b5 = 1;
        Object obj7 = this.q;
        Object obj8 = this.p;
        Object obj9 = this.f1800o;
        Object obj10 = this.n;
        switch (b) {
            case 0:
                x34 x34Var2 = (x34) obj10;
                fs4 fs4Var2 = (fs4) obj9;
                n44 n44Var = (n44) obj8;
                px4 px4Var = (px4) obj7;
                kh6 kh6Var = (kh6) obj;
                ux2 ux2Var = (ux2) obj2;
                ((Integer) obj3).getClass();
                Object objK = ux2Var.K();
                Object obj11 = objK;
                if (objK == obj6) {
                    Object o34Var = new o34(kh6Var, new la(px4Var, (byte) 29));
                    ux2Var.g0(o34Var);
                    obj11 = o34Var;
                }
                o34 o34Var2 = (o34) obj11;
                Object objK2 = ux2Var.K();
                Object obj12 = objK2;
                if (objK2 == obj6) {
                    Object ld7Var = new ld7(new yt2(o34Var2));
                    ux2Var.g0(ld7Var);
                    obj12 = ld7Var;
                }
                ld7 ld7Var2 = (ld7) obj12;
                if (x34Var2 != null) {
                    ux2Var.W(1743490539);
                    ux2Var.W(887527095);
                    String str = Build.FINGERPRINT;
                    if (str == null || !str.equals("robolectric")) {
                        ux2Var.W(1345729441);
                        View view = (View) ux2Var.j(lh.f);
                        boolean zF = ux2Var.f(view);
                        Object objK3 = ux2Var.K();
                        if (zF || objK3 == obj6) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            Object jkVar = tag instanceof sr5 ? (sr5) tag : null;
                            if (jkVar == null) {
                                jkVar = new jk(view);
                                view.setTag(R.id.compose_prefetch_scheduler, jkVar);
                            }
                            objK3 = jkVar;
                            ux2Var.g0(objK3);
                        }
                        obj4 = (sr5) objK3;
                        z = false;
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(1345548711);
                        Object objK4 = ux2Var.K();
                        if (objK4 == obj6) {
                            objK4 = new tr5();
                            ux2Var.g0(objK4);
                        }
                        obj4 = (tr5) objK4;
                        z = false;
                        ux2Var.p(false);
                    }
                    Object obj13 = obj4;
                    ux2Var.p(z);
                    Object[] objArr = {x34Var2, o34Var2, ld7Var2, obj13};
                    boolean zF2 = ux2Var.f(x34Var2) | ux2Var.h(o34Var2) | ux2Var.h(ld7Var2) | ux2Var.h(obj13);
                    Object objK5 = ux2Var.K();
                    if (zF2 || objK5 == obj6) {
                        x34Var = x34Var2;
                        hmVar = new hm(x34Var, o34Var2, ld7Var2, obj13, (byte) 5);
                        ux2Var.g0(hmVar);
                    } else {
                        hmVar = objK5;
                        x34Var = x34Var2;
                    }
                    ck3.f(objArr, (Function1) hmVar, ux2Var);
                    ux2Var.p(false);
                } else {
                    x34Var = x34Var2;
                    ux2Var.W(1744076749);
                    ux2Var.p(false);
                }
                int i2 = y34.a;
                if (x34Var != null && (fs4VarF = fs4Var2.f(new m28(x34Var))) != null) {
                    fs4Var2 = fs4VarF;
                }
                boolean zF3 = ux2Var.f(o34Var2) | ux2Var.f(n44Var);
                Object objK6 = ux2Var.K();
                Object obj14 = objK6;
                if (zF3 || objK6 == obj6) {
                    Object c9Var = new c9(o34Var2, n44Var, b2);
                    ux2Var.g0(c9Var);
                    obj14 = c9Var;
                }
                g68.f(ld7Var2, fs4Var2, (hw2) obj14, ux2Var, 8);
                return f88Var;
            case 1:
                hw2 hw2Var = (hw2) obj10;
                ac1 ac1Var = (ac1) obj9;
                iw2 iw2Var = (iw2) obj8;
                Function0 function1 = (Function0) obj7;
                zb1 zb1Var = (zb1) obj;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ux2Var2.f(zb1Var) ? 4 : 2;
                }
                if (ux2Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str2 = (String) hw2Var.invoke(ux2Var2, 0);
                    if (ub7.b0(str2)) {
                        ni3.c("Label must not be blank");
                    }
                    ac1Var.getClass();
                    pm8.c.q(cs4.b, str2, Boolean.TRUE, zb1Var, iw2Var, function1, ux2Var2, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            case 2:
                d11 d11Var = (d11) obj10;
                ux2 ux2Var3 = (ux2) obj2;
                ((Integer) obj3).getClass();
                ((xu7) d11Var.m).m.d().c(((xu7) obj8).n.toString(), au8.O(964932639, new c9((fs4) obj9, (ce5) obj7, d11Var, (bo) obj), ux2Var3), ux2Var3, 48);
                return f88Var;
            case 3:
                px4 px4Var2 = (px4) obj7;
                wt1 wt1Var = (wt1) obj10;
                List list = (List) obj9;
                Function1 function2 = (Function1) obj8;
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var4.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    cs4 cs4Var2 = cs4.b;
                    fs4 fs4VarF2 = ka0.F(cs4Var2, 16.0f, 0.0f, 16.0f, 16.0f, 2);
                    kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var4, 0);
                    int iHashCode = Long.hashCode(ux2Var4.T);
                    yj5 yj5VarL = ux2Var4.l();
                    fs4 fs4VarS = uf0.s(ux2Var4, fs4VarF2);
                    yz0.c.getClass();
                    ux2Var4.a0();
                    if (ux2Var4.S) {
                        ux2Var4.k(function0);
                    } else {
                        ux2Var4.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var4);
                    o67.n(yj5VarL, d82.u, ux2Var4);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var4);
                    o67.l(ux2Var4);
                    o67.n(fs4VarS, d82.t, ux2Var4);
                    String strZ = m77.z(R.string.select_groups, ux2Var4);
                    fs4 fs4VarF3 = ka0.F(cs4Var2, 0.0f, 0.0f, 0.0f, 24.0f, 7);
                    boolean zF4 = ux2Var4.f(px4Var2);
                    Object objK7 = ux2Var4.K();
                    if (zF4 || objK7 == obj6) {
                        objK7 = new la(px4Var2, (byte) 14);
                        ux2Var4.g0(objK7);
                    }
                    jx0.a(strZ, "TVTA-devicesScreen-deviceEditScreen-groupSelector", fs4VarF3, (Function0) objK7, ux2Var4, 432, 0);
                    Set set = wt1Var.f2442o;
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4Var2, "TVTA-devicesScreen-deviceEditScreen-groupSelector-content");
                    boolean zF5 = ux2Var4.f(function2) | ux2Var4.f(px4Var2);
                    Object objK8 = ux2Var4.K();
                    if (zF5 || objK8 == obj6) {
                        objK8 = new g70(function2, px4Var2, (byte) 2);
                        ux2Var4.g0(objK8);
                    }
                    Function1 function3 = (Function1) objK8;
                    boolean zF6 = ux2Var4.f(px4Var2);
                    Object objK9 = ux2Var4.K();
                    if (zF6 || objK9 == obj6) {
                        objK9 = new la(px4Var2, (byte) 15);
                        ux2Var4.g0(objK9);
                    }
                    jx0.c(list, set, function3, (Function0) objK9, fs4VarA, "TVTA-devicesScreen-deviceEditScreen-groupSelector", ux2Var4, 221184);
                    ux2Var4.p(true);
                } else {
                    ux2Var4.Q();
                }
                return f88Var;
            case 4:
                OnBoardingActivity onBoardingActivity = (OnBoardingActivity) obj10;
                a06 a06Var = (a06) obj9;
                Function1 function4 = (Function1) obj8;
                Function0 function5 = (Function0) obj7;
                nd5 nd5Var = (nd5) obj;
                ux2 ux2Var5 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i3 = OnBoardingActivity.N;
                nd5Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ux2Var5.f(nd5Var) ? 4 : 2;
                }
                if (ux2Var5.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    fs4 fs4VarA2 = ka0.A(cs4Var, nd5Var);
                    boolean zH = ux2Var5.h(onBoardingActivity);
                    Object objK10 = ux2Var5.K();
                    if (zH || objK10 == obj6) {
                        objK10 = new vm3(onBoardingActivity, (byte) 21);
                        ux2Var5.g0(objK10);
                    }
                    lv1.q((Function0) objK10, a06Var, function4, function5, fs4VarA2, null, ux2Var5, 3072);
                } else {
                    ux2Var5.Q();
                }
                return f88Var;
            case 5:
                kp5 kp5Var = (kp5) obj10;
                Function0 function6 = (Function0) obj9;
                Function0 function7 = (Function0) obj8;
                Function0 function8 = (Function0) obj7;
                ux2 ux2Var6 = (ux2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var6.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zF7 = ux2Var6.f(function6) | ux2Var6.f(function7);
                    Object objK11 = ux2Var6.K();
                    if (zF7 || objK11 == obj6) {
                        objK11 = new sv1(function6, function7, (byte) 5);
                        ux2Var6.g0(objK11);
                    }
                    Function0 function9 = (Function0) objK11;
                    boolean zF8 = ux2Var6.f(function8) | ux2Var6.f(function7);
                    Object objK12 = ux2Var6.K();
                    if (zF8 || objK12 == obj6) {
                        objK12 = new sv1(function8, function7, (byte) 6);
                        ux2Var6.g0(objK12);
                    }
                    lv1.f(kp5Var, function9, (Function0) objK12, null, ux2Var6, 8);
                } else {
                    ux2Var6.Q();
                }
                return f88Var;
            case 6:
                yl6 yl6Var = (yl6) obj10;
                kl6 kl6Var = (kl6) obj9;
                Function1 function10 = (Function1) obj8;
                zl6 zl6Var = (zl6) obj7;
                ux2 ux2Var7 = (ux2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((w14) obj).getClass();
                if (ux2Var7.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    String str3 = yl6Var.a;
                    fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(cs4Var, kl6Var.d() + "-viewAll");
                    boolean zF9 = ux2Var7.f(function10) | ux2Var7.d(zl6Var.ordinal());
                    Object objK13 = ux2Var7.K();
                    if (zF9 || objK13 == obj6) {
                        i = 0;
                        objK13 = new hm6(function10, zl6Var, (byte) 0);
                        ux2Var7.g0(objK13);
                    } else {
                        i = 0;
                    }
                    et1.o(i, str3, (Function0) objK13, ux2Var7, fs4VarA3);
                } else {
                    ux2Var7.Q();
                }
                return f88Var;
            case 7:
                List list2 = (List) obj10;
                l33 l33Var = (l33) obj9;
                Function1 function11 = (Function1) obj8;
                Function0 function12 = (Function0) obj7;
                ux2 ux2Var8 = (ux2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var8.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    boolean zF10 = ux2Var8.f(function11) | ux2Var8.f(function12);
                    Object objK14 = ux2Var8.K();
                    if (zF10 || objK14 == obj6) {
                        objK14 = new py5((Object) function11, (Object) function12, (byte) 12);
                        ux2Var8.g0(objK14);
                    }
                    jx0.d(list2, l33Var, (Function1) objK14, androidx.compose.ui.platform.a.a(ka0.F(cs4.b, 16.0f, 16.0f, 16.0f, 0.0f, 8), "TVTA-devicesScreen-sessionEditScreen-groupSelector-content"), 0L, ux2Var8, 0);
                } else {
                    ux2Var8.Q();
                }
                return f88Var;
            case 8:
                SupportSession supportSession = (SupportSession) obj10;
                List list3 = (List) obj9;
                su6 su6Var = (su6) obj8;
                px4 px4Var3 = (px4) obj7;
                ux2 ux2Var9 = (ux2) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((xa0) obj).getClass();
                if (ux2Var9.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    it6 it6Var = (it6) px4Var3.getValue();
                    boolean zH2 = ux2Var9.h(su6Var);
                    Object objK15 = ux2Var9.K();
                    if (zH2 || objK15 == obj6) {
                        Object ew1Var = new ew1(1, su6Var, su6.class, "updateSessionName", "updateSessionName(Ljava/lang/String;)V", 0, (byte) 29);
                        ux2Var9.g0(ew1Var);
                        objK15 = ew1Var;
                    }
                    Function1 function13 = (Function1) ((pu3) objK15);
                    boolean zH3 = ux2Var9.h(su6Var);
                    Object objK16 = ux2Var9.K();
                    if (zH3 || objK16 == obj6) {
                        Object nu6Var = new nu6(1, su6Var, su6.class, "updateSessionEmail", "updateSessionEmail(Ljava/lang/String;)V", 0, (byte) 0);
                        ux2Var9.g0(nu6Var);
                        objK16 = nu6Var;
                    }
                    Function1 function14 = (Function1) ((pu3) objK16);
                    boolean zH4 = ux2Var9.h(su6Var);
                    Object objK17 = ux2Var9.K();
                    if (zH4 || objK17 == obj6) {
                        Object nu6Var2 = new nu6(1, su6Var, su6.class, "updateSessionDescription", "updateSessionDescription(Ljava/lang/String;)V", 0, (byte) 1);
                        ux2Var9.g0(nu6Var2);
                        objK17 = nu6Var2;
                    }
                    Function1 function15 = (Function1) ((pu3) objK17);
                    boolean zH5 = ux2Var9.h(su6Var);
                    Object objK18 = ux2Var9.K();
                    if (zH5 || objK18 == obj6) {
                        objK18 = new y46(su6Var, (byte) 13);
                        ux2Var9.g0(objK18);
                    }
                    qs1.w(supportSession, it6Var, list3, function13, function14, function15, (Function1) objK18, androidx.compose.foundation.layout.b.c, ux2Var9, 12582912);
                } else {
                    ux2Var9.Q();
                }
                return f88Var;
            case ep1.b /* 9 */:
                Object obj15 = (o37) obj10;
                o37 o37Var = (o37) obj9;
                Object obj16 = (kh2) obj8;
                Object obj17 = (String) obj7;
                hw2 hw2Var2 = (hw2) obj;
                ux2 ux2Var10 = (ux2) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ux2Var10.h(hw2Var2) ? 4 : 2;
                }
                if (ux2Var10.N(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    boolean zN = im3.n(obj15, o37Var);
                    e87 e87VarC0 = xs1.c0(du4.p, ux2Var10);
                    boolean zF11 = ux2Var10.f(obj15) | ux2Var10.h(obj16);
                    Object objK19 = ux2Var10.K();
                    if (zF11 || objK19 == obj6) {
                        obj5 = objK19;
                        Object a26Var = new a26(obj15, obj16, b3);
                        ux2Var10.g0(a26Var);
                        obj5 = a26Var;
                    }
                    Function0 function16 = (Function0) obj5;
                    Object objK20 = ux2Var10.K();
                    Object obj18 = objK20;
                    if (objK20 == obj6) {
                        Object objA = ck3.a(!zN ? 1.0f : 0.0f);
                        ux2Var10.g0(objA);
                        obj18 = objA;
                    }
                    km kmVar = (km) obj18;
                    Boolean boolValueOf = Boolean.valueOf(zN);
                    boolean zH6 = ux2Var10.h(kmVar) | ux2Var10.g(zN) | ux2Var10.h(e87VarC0) | ux2Var10.f(function16);
                    Object objK21 = ux2Var10.K();
                    if (zH6 || objK21 == obj6) {
                        objK21 = new m37(kmVar, zN, e87VarC0, function16, null);
                        ux2Var10.g0(objK21);
                    }
                    ck3.i(boolValueOf, (hw2) objK21, ux2Var10);
                    ko koVar = kmVar.c;
                    e87 e87VarC1 = xs1.c0(du4.n, ux2Var10);
                    Object objK22 = ux2Var10.K();
                    Object obj19 = objK22;
                    if (objK22 == obj6) {
                        Object objA2 = ck3.a(!zN ? 1.0f : 0.8f);
                        ux2Var10.g0(objA2);
                        obj19 = objA2;
                    }
                    km kmVar2 = (km) obj19;
                    Boolean boolValueOf2 = Boolean.valueOf(zN);
                    boolean zH7 = ux2Var10.h(kmVar2) | ux2Var10.g(zN) | ux2Var10.h(e87VarC1);
                    Object objK23 = ux2Var10.K();
                    Object obj20 = objK23;
                    if (zH7 || objK23 == obj6) {
                        Object gg1Var = new gg1(kmVar2, zN, e87VarC1, (hc1) null);
                        ux2Var10.g0(gg1Var);
                        obj20 = gg1Var;
                    }
                    ck3.i(boolValueOf2, (hw2) obj20, ux2Var10);
                    ko koVar2 = kmVar2.c;
                    fs4 fs4VarU = di1.u(cs4.b, ((Number) koVar2.n.getValue()).floatValue(), ((Number) koVar2.n.getValue()).floatValue(), ((Number) koVar.n.getValue()).floatValue(), 0.0f, 0.0f, null, false, 1048568);
                    boolean zG = ux2Var10.g(zN) | ux2Var10.f(obj15) | ux2Var10.f(obj17);
                    Object objK24 = ux2Var10.K();
                    Object obj21 = objK24;
                    if (zG || objK24 == obj6) {
                        Object iq1Var = new iq1((byte) 2, obj17, obj15, zN);
                        ux2Var10.g0(iq1Var);
                        obj21 = iq1Var;
                    }
                    fs4 fs4VarA4 = cp6.a(fs4VarU, false, (Function1) obj21);
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode2 = Long.hashCode(ux2Var10.T);
                    yj5 yj5VarL2 = ux2Var10.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var10, fs4VarA4);
                    yz0.c.getClass();
                    ux2Var10.a0();
                    if (ux2Var10.S) {
                        ux2Var10.k(function0);
                    } else {
                        ux2Var10.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var10);
                    o67.n(yj5VarL2, d82.u, ux2Var10);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var10);
                    o67.l(ux2Var10);
                    o67.n(fs4VarS2, d82.t, ux2Var10);
                    hw2Var2.invoke(ux2Var10, Integer.valueOf(iIntValue8 & 14));
                    ux2Var10.p(true);
                } else {
                    ux2Var10.Q();
                }
                return f88Var;
            case ep1.c /* 10 */:
                final ud7 ud7Var = (ud7) obj10;
                px4 px4Var4 = (px4) obj7;
                Function1 function17 = (Function1) obj9;
                Function0 function18 = (Function0) obj8;
                nd5 nd5Var2 = (nd5) obj;
                ux2 ux2Var11 = (ux2) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                nd5Var2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ux2Var11.f(nd5Var2) ? 4 : 2;
                }
                if (ux2Var11.N(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    fs4 fs4VarA5 = ka0.A(cs4Var, nd5Var2);
                    boolean zBooleanValue = ((Boolean) ud7Var.q0.getValue()).booleanValue();
                    ce7 s0 = ud7Var.getS0();
                    boolean zH8 = ux2Var11.h(ud7Var);
                    Object objK25 = ux2Var11.K();
                    if (zH8 || objK25 == obj6) {
                        final byte b6 = 0;
                        objK25 = new Function0() { // from class: o.td7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b7 = b6;
                                f88 f88Var2 = f88.a;
                                ud7 ud7Var2 = ud7Var;
                                switch (b7) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putBoolean("request_login", true);
                                        ud7Var2.G().e0("request_login", bundle);
                                        break;
                                    default:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putBoolean("show_free_pan", true);
                                        ud7Var2.G().e0("show_free_pan", bundle2);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var11.g0(objK25);
                    }
                    Function0 function19 = (Function0) objK25;
                    boolean zH9 = ux2Var11.h(ud7Var);
                    Object objK26 = ux2Var11.K();
                    if (zH9 || objK26 == obj6) {
                        objK26 = new Function0() { // from class: o.td7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b7 = b5;
                                f88 f88Var2 = f88.a;
                                ud7 ud7Var2 = ud7Var;
                                switch (b7) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putBoolean("request_login", true);
                                        ud7Var2.G().e0("request_login", bundle);
                                        break;
                                    default:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putBoolean("show_free_pan", true);
                                        ud7Var2.G().e0("show_free_pan", bundle2);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var11.g0(objK26);
                    }
                    Function0 function20 = (Function0) objK26;
                    boolean zF12 = ux2Var11.f(px4Var4) | ux2Var11.h(ud7Var);
                    Object objK27 = ux2Var11.K();
                    if (zF12 || objK27 == obj6) {
                        objK27 = new py5(ud7Var, px4Var4, b4);
                        ux2Var11.g0(objK27);
                    }
                    u47.a(zBooleanValue, s0, function19, function20, (Function1) objK27, function17, function18, fs4VarA5, null, ux2Var11, 1572864);
                    if (((kp5) px4Var4.getValue()) != null) {
                        ux2Var11.W(-1956257822);
                        kp5 kp5Var2 = (kp5) px4Var4.getValue();
                        kp5Var2.getClass();
                        boolean zF13 = ux2Var11.f(px4Var4);
                        Object objK28 = ux2Var11.K();
                        if (zF13 || objK28 == obj6) {
                            objK28 = new j44(px4Var4, (byte) 15);
                            ux2Var11.g0(objK28);
                        }
                        Function0 function21 = (Function0) objK28;
                        boolean zF14 = ux2Var11.f(px4Var4) | ux2Var11.h(ud7Var);
                        Object objK29 = ux2Var11.K();
                        if (zF14 || objK29 == obj6) {
                            objK29 = new a26(ud7Var, px4Var4, b4);
                            ux2Var11.g0(objK29);
                        }
                        lv1.v(kp5Var2, function21, null, null, (Function0) objK29, null, ux2Var11, 8, 44);
                        ux2Var11.p(false);
                    } else {
                        ux2Var11.W(-1955668729);
                        ux2Var11.p(false);
                    }
                } else {
                    ux2Var11.Q();
                }
                return f88Var;
            case 11:
                sb0 sb0Var = (sb0) obj10;
                j64 j64Var = (j64) obj9;
                zr7 zr7Var = (zr7) obj8;
                v65 v65Var = (v65) obj7;
                fs4 fs4Var3 = (fs4) obj;
                ux2 ux2Var12 = (ux2) obj2;
                ((Integer) obj3).getClass();
                ux2Var12.W(-84507373);
                boolean zBooleanValue2 = ((Boolean) ux2Var12.j(b11.y)).booleanValue();
                boolean zG2 = ux2Var12.g(zBooleanValue2);
                Object objK30 = ux2Var12.K();
                if (zG2 || objK30 == obj6) {
                    objK30 = new sf1(zBooleanValue2);
                    ux2Var12.g0(objK30);
                }
                sf1 sf1Var = (sf1) objK30;
                boolean z3 = ((sb0Var instanceof t57) && ((t57) sb0Var).a == 16) ? false : true;
                if (((n54) ((mj8) ux2Var12.j(b11.u))).b() && j64Var.b() && gt7.c(zr7Var.b) && z3) {
                    ux2Var12.W(-707487962);
                    xo xoVar = zr7Var.a;
                    gt7 gt7Var = new gt7(zr7Var.b);
                    boolean zH10 = ux2Var12.h(sf1Var);
                    Object objK31 = ux2Var12.K();
                    if (zH10 || objK31 == obj6) {
                        objK31 = new y0(sf1Var, false ? 1 : 0, b2);
                        ux2Var12.g0(objK31);
                    }
                    ck3.h(xoVar, gt7Var, (hw2) objK31, ux2Var12);
                    boolean zH11 = ux2Var12.h(sf1Var) | ux2Var12.h(v65Var) | ux2Var12.f(zr7Var) | ux2Var12.h(j64Var) | ux2Var12.f(sb0Var);
                    Object objK32 = ux2Var12.K();
                    if (zH11 || objK32 == obj6) {
                        Object l8Var = new l8(sf1Var, v65Var, zr7Var, j64Var, sb0Var, (byte) 9);
                        ux2Var12.g0(l8Var);
                        objK32 = l8Var;
                    }
                    fs4 fs4VarD = j51.D(fs4Var3, (Function1) objK32);
                    z2 = false;
                    ux2Var12.p(false);
                    fs4Var = fs4VarD;
                } else {
                    z2 = false;
                    ux2Var12.W(-705473241);
                    ux2Var12.p(false);
                    fs4Var = cs4Var;
                }
                ux2Var12.p(z2);
                return fs4Var;
            default:
                j74 j74Var = (j74) obj10;
                rv0 rv0Var2 = (rv0) obj9;
                xl1 xl1Var = (xl1) obj8;
                f74 f74Var = (f74) obj7;
                ux2 ux2Var13 = (ux2) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((sp2) obj).getClass();
                if (ux2Var13.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    for (e84 e84Var : j74Var.i) {
                        String str4 = e84Var.d;
                        if (str4 == null || (rv0VarA = xl1Var.m.a(str4)) == null) {
                            rv0VarA = xl1Var.m.a(e84Var.a);
                            if (rv0VarA == null) {
                                rv0Var = rv0Var2;
                            } else {
                                rv0Var = rv0VarA;
                            }
                        } else {
                            rv0Var = rv0VarA;
                        }
                        l47.a(e84Var.a, rv0Var, xl1Var, f74Var.e, f74Var.d, ux2Var13, 0);
                    }
                } else {
                    ux2Var13.Q();
                }
                return f88Var;
        }
    }

    public /* synthetic */ q34(d11 d11Var, xu7 xu7Var, fs4 fs4Var, ce5 ce5Var) {
        this.m = (byte) 2;
        this.n = d11Var;
        this.p = xu7Var;
        this.f1800o = fs4Var;
        this.q = ce5Var;
    }

    public /* synthetic */ q34(hw2 hw2Var, ac1 ac1Var, iw2 iw2Var, Function0 function0) {
        this.m = (byte) 1;
        this.n = hw2Var;
        this.f1800o = ac1Var;
        this.p = iw2Var;
        this.q = function0;
    }

    public /* synthetic */ q34(px4 px4Var, wt1 wt1Var, List list, Function1 function1) {
        this.m = (byte) 3;
        this.q = px4Var;
        this.n = wt1Var;
        this.f1800o = list;
        this.p = function1;
    }

    public /* synthetic */ q34(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.m = b;
        this.n = obj;
        this.f1800o = obj2;
        this.p = obj3;
        this.q = obj4;
    }
}
