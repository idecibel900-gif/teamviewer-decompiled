package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c91 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f503o;
    public final /* synthetic */ Object p;

    public /* synthetic */ c91(Function0 function0, px4 px4Var, Function0 function1) {
        this.m = (byte) 8;
        this.p = function0;
        this.f503o = px4Var;
        this.n = function1;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        ux2 ux2Var;
        byte b = this.m;
        byte b2 = 3;
        cs4 cs4Var = cs4.b;
        aw awVar = e01.a;
        f88 f88Var = f88.a;
        Object obj4 = this.n;
        Object obj5 = this.f503o;
        Object obj6 = this.p;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj5;
                Function0 function0 = (Function0) obj6;
                Function1 function1 = (Function1) obj4;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    pm8.a(arrayList, function0, function1, null, null, null, null, ux2Var2, 0, 120);
                }
                break;
            case 1:
                wt1 wt1Var = (wt1) obj5;
                Function1 function2 = (Function1) obj4;
                px4 px4Var = (px4) obj6;
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var3.Q();
                } else {
                    List list = wt1Var.s;
                    UUID uuid = wt1Var.t;
                    boolean zF = ux2Var3.f(function2) | ux2Var3.f(px4Var);
                    Object objK = ux2Var3.K();
                    if (zF || objK == awVar) {
                        objK = new g70(function2, px4Var, b2);
                        ux2Var3.g0(objK);
                    }
                    ct1.h(list, uuid, (Function1) objK, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-deviceEditScreen-policySelector-content"), ux2Var3, 3072);
                }
                break;
            case 2:
                wt1 wt1Var2 = (wt1) obj5;
                ru1 ru1Var = (ru1) obj6;
                List list2 = (List) obj4;
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((xa0) obj).getClass();
                if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ux2Var4.Q();
                } else {
                    boolean zH = ux2Var4.h(ru1Var);
                    Object objK2 = ux2Var4.K();
                    if (zH || objK2 == awVar) {
                        ux2Var = ux2Var4;
                        i0 i0Var = new i0(1, ru1Var, ru1.class, "updateDeviceName", "updateDeviceName(Ljava/lang/String;)V", 0, (byte) 23);
                        ux2Var.g0(i0Var);
                        objK2 = i0Var;
                    } else {
                        ux2Var = ux2Var4;
                    }
                    Function1 function3 = (Function1) ((pu3) objK2);
                    boolean zH2 = ux2Var.h(ru1Var);
                    Object objK3 = ux2Var.K();
                    if (zH2 || objK3 == awVar) {
                        i0 i0Var2 = new i0(1, ru1Var, ru1.class, "updateDevicePassword", "updateDevicePassword(Ljava/lang/String;)V", 0, (byte) 24);
                        ux2Var.g0(i0Var2);
                        objK3 = i0Var2;
                    }
                    Function1 function4 = (Function1) ((pu3) objK3);
                    boolean zH3 = ux2Var.h(ru1Var);
                    Object objK4 = ux2Var.K();
                    if (zH3 || objK4 == awVar) {
                        i0 i0Var3 = new i0(1, ru1Var, ru1.class, "updateDeviceDescription", "updateDeviceDescription(Ljava/lang/String;)V", 0, (byte) 25);
                        ux2Var.g0(i0Var3);
                        objK4 = i0Var3;
                    }
                    Function1 function5 = (Function1) ((pu3) objK4);
                    boolean zH4 = ux2Var.h(ru1Var);
                    Object objK5 = ux2Var.K();
                    if (zH4 || objK5 == awVar) {
                        i0 i0Var4 = new i0(1, ru1Var, ru1.class, "updateDeviceGroups", "updateDeviceGroups(Ljava/util/Set;)V", 0, (byte) 26);
                        ux2Var.g0(i0Var4);
                        objK5 = i0Var4;
                    }
                    Function1 function6 = (Function1) ((pu3) objK5);
                    boolean zH5 = ux2Var.h(ru1Var);
                    Object objK6 = ux2Var.K();
                    if (zH5 || objK6 == awVar) {
                        i0 i0Var5 = new i0(1, ru1Var, ru1.class, "updateDevicePolicy", "updateDevicePolicy(Ljava/util/UUID;)V", 0, (byte) 27);
                        ux2Var.g0(i0Var5);
                        objK6 = i0Var5;
                    }
                    bt1.a(wt1Var2, function3, function4, function5, list2, function6, (Function1) ((pu3) objK6), androidx.compose.foundation.layout.b.c, ux2Var, 12582912);
                }
                break;
            case 3:
                Function1 function7 = (Function1) obj4;
                Function0 function8 = (Function0) obj6;
                Function0 function9 = (Function0) obj5;
                ux2 ux2Var5 = (ux2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var5.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ux2Var5.Q();
                } else {
                    pd5 pd5VarJ = ka0.j(8.0f, 0.0f, 24.0f, 0.0f, 10);
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-groupslist-renameGroup");
                    yy0 yy0Var = im3.d;
                    boolean zF2 = ux2Var5.f(function7) | ux2Var5.f(function8);
                    Object objK7 = ux2Var5.K();
                    if (zF2 || objK7 == awVar) {
                        objK7 = new j5((byte) 4, function8, function7);
                        ux2Var5.g0(objK7);
                    }
                    jj.b(yy0Var, (Function0) objK7, fs4VarA, im3.e, false, null, pd5VarJ, ux2Var5, 12586374, 368);
                    lv1.k(null, 0.0f, 0L, ux2Var5, 0, 7);
                    pd5 pd5VarJ2 = ka0.j(8.0f, 0.0f, 24.0f, 0.0f, 10);
                    fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-groupslist-delete");
                    yy0 yy0Var2 = im3.f;
                    boolean zF3 = ux2Var5.f(function7) | ux2Var5.f(function9);
                    Object objK8 = ux2Var5.K();
                    if (zF3 || objK8 == awVar) {
                        objK8 = new j5((byte) 5, function9, function7);
                        ux2Var5.g0(objK8);
                    }
                    jj.b(yy0Var2, (Function0) objK8, fs4VarA2, im3.g, false, null, pd5VarJ2, ux2Var5, 12586374, 368);
                }
                break;
            case 4:
                List list3 = (List) obj5;
                String str = (String) obj6;
                Function1 function10 = (Function1) obj4;
                ux2 ux2Var6 = (ux2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((bo) obj).getClass();
                if (!ux2Var6.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ux2Var6.Q();
                } else {
                    String strZ = m77.z(R.string.settings_resolution_disclaimer, ux2Var6);
                    pd5 pd5VarJ3 = ka0.j(32.0f, 0.0f, 16.0f, 12.0f, 2);
                    pd5 pd5VarJ4 = ka0.j(56.0f, 0.0f, 16.0f, 0.0f, 10);
                    fs4 fs4VarD = ka0.D(cs4Var, 0.0f, 8.0f, 1);
                    boolean zF4 = ux2Var6.f(function10);
                    Object objK9 = ux2Var6.K();
                    if (zF4 || objK9 == awVar) {
                        objK9 = new jb(function10, (byte) 4);
                        ux2Var6.g0(objK9);
                    }
                    vn4.R(list3, str, fs4VarD, strZ, pd5VarJ3, pd5VarJ4, (Function1) objK9, ux2Var6, 221568, 0);
                }
                break;
            case 5:
                f74 f74Var = (f74) obj5;
                k74 k74Var = (k74) obj6;
                Function1 function11 = (Function1) obj4;
                j74 j74Var = (j74) obj;
                ux2 ux2Var7 = (ux2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                j74Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ux2Var7.f(j74Var) ? 4 : 2;
                }
                if (!ux2Var7.N(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    ux2Var7.Q();
                } else {
                    ux2Var7.W(-1000575735);
                    fs4 fs4VarA3 = ka0.A(cs4Var, f74Var.b.e);
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode = Long.hashCode(ux2Var7.T);
                    yj5 yj5VarL = ux2Var7.l();
                    fs4 fs4VarS = uf0.s(ux2Var7, fs4VarA3);
                    yz0.c.getClass();
                    ux2Var7.a0();
                    if (ux2Var7.S) {
                        ux2Var7.k(LayoutNode.e0);
                    } else {
                        ux2Var7.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var7);
                    o67.n(yj5VarL, d82.u, ux2Var7);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var7);
                    o67.l(ux2Var7);
                    o67.n(fs4VarS, d82.t, ux2Var7);
                    wo1.i(j74Var, f74Var, null, k74Var, function11, ux2Var7, iIntValue6 & 14, 8);
                    ux2Var7.p(true);
                    ux2Var7.p(false);
                }
                break;
            case 6:
                j74 j74Var2 = (j74) obj5;
                f74 f74Var2 = (f74) obj6;
                k74 k74Var2 = (k74) obj4;
                ux2 ux2Var8 = (ux2) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var8.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ux2Var8.Q();
                } else {
                    xo1.m(j74Var2, f74Var2, null, k74Var2, null, ux2Var8, 0);
                }
                break;
            case 7:
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                Function0 function12 = (Function0) obj6;
                ux2 ux2Var9 = (ux2) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var9.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    ux2Var9.Q();
                } else {
                    bt1.i(0, str2, str3, function12, ux2Var9, null);
                }
                break;
            default:
                Function0 function13 = (Function0) obj6;
                px4 px4Var2 = (px4) obj5;
                Function0 function14 = (Function0) obj4;
                ux2 ux2Var10 = (ux2) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var10.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    ux2Var10.Q();
                } else {
                    yy0 yy0Var3 = db8.m;
                    boolean zF5 = ux2Var10.f(px4Var2) | ux2Var10.f(function13);
                    Object objK10 = ux2Var10.K();
                    if (zF5 || objK10 == awVar) {
                        objK10 = new ot1(function13, px4Var2, (byte) 2);
                        ux2Var10.g0(objK10);
                    }
                    jj.b(yy0Var3, (Function0) objK10, null, db8.n, false, null, null, ux2Var10, 3078, 500);
                    yy0 yy0Var4 = db8.f605o;
                    boolean zF6 = ux2Var10.f(px4Var2) | ux2Var10.f(function14);
                    Object objK11 = ux2Var10.K();
                    if (zF6 || objK11 == awVar) {
                        objK11 = new ot1(function14, px4Var2, (byte) 3);
                        ux2Var10.g0(objK11);
                    }
                    jj.b(yy0Var4, (Function0) objK11, null, db8.p, false, null, null, ux2Var10, 3078, 500);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ c91(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.m = b;
        this.f503o = obj;
        this.n = obj2;
        this.p = obj3;
    }

    public /* synthetic */ c91(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.f503o = obj;
        this.p = obj2;
        this.n = obj3;
    }

    public /* synthetic */ c91(Function1 function1, Function0 function0, Function0 function2) {
        this.m = (byte) 3;
        this.n = function1;
        this.p = function0;
        this.f503o = function2;
    }

    public /* synthetic */ c91(f74 f74Var, k74 k74Var, Function1 function1) {
        this.m = (byte) 5;
        this.f503o = f74Var;
        this.p = k74Var;
        this.n = function1;
    }

    public /* synthetic */ c91(j74 j74Var, f74 f74Var, k74 k74Var) {
        this.m = (byte) 6;
        this.f503o = j74Var;
        this.p = f74Var;
        this.n = k74Var;
    }
}
