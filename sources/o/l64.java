package o;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.node.LayoutNode;
import com.journeyapps.barcodescanner.BarcodeView;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.LegalAgreementActivity;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l64 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1332o;

    public /* synthetic */ l64(byte b, int i, Object obj, Object obj2) {
        this.m = b;
        this.n = obj;
        this.f1332o = obj2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        ux2 ux2Var;
        boolean z;
        f88 f88Var;
        ux2 ux2Var2;
        boolean z2;
        f88 f88Var2;
        String str;
        byte b = this.m;
        byte b2 = 5;
        byte b3 = 11;
        cs4 cs4Var = cs4.b;
        Object obj3 = null;
        aw awVar = e01.a;
        int i = 2;
        byte b4 = 3;
        boolean z3 = false;
        f88 f88Var3 = f88.a;
        Object obj4 = this.f1332o;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                a06 a06Var = (a06) obj5;
                LegalAgreementActivity legalAgreementActivity = (LegalAgreementActivity) obj4;
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = LegalAgreementActivity.O;
                if (ux2Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv1.g(au8.s(androidx.compose.foundation.layout.b.c, ((rn4) ux2Var3.j(un4.a)).a.p, kh.V), null, null, null, null, 0, 0L, 0L, null, au8.O(-1932708113, new sd(a06Var, legalAgreementActivity, b2), ux2Var3), ux2Var3, 805306368, 510);
                } else {
                    ux2Var3.Q();
                }
                return f88Var3;
            case 1:
                ((Integer) obj2).getClass();
                zu1.f((g2) obj5, (fs4) obj4, (ux2) obj, yo1.Y(1));
                return f88Var3;
            case 2:
                jb4 jb4Var = (jb4) obj5;
                yy0 yy0Var = (yy0) obj4;
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ux2Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pb4.c(jb4Var.b, ga0.J, yy0Var, ux2Var4, 48);
                } else {
                    ux2Var4.Q();
                }
                return f88Var3;
            case 3:
                ((Integer) obj2).getClass();
                et1.g(yo1.Y(1), (Function1) obj5, (ux2) obj, (fs4) obj4);
                return f88Var3;
            case 4:
                a06 a06Var2 = (a06) obj5;
                M2MClientActivity m2MClientActivity = (M2MClientActivity) obj4;
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i3 = M2MClientActivity.h0;
                if (ux2Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv1.g(null, null, null, null, null, 0, 0L, 0L, null, au8.O(-959967854, new sd(a06Var2, m2MClientActivity, (byte) 7), ux2Var5), ux2Var5, 805306368, 511);
                } else {
                    ux2Var5.Q();
                }
                return f88Var3;
            case 5:
                hw2 hw2Var = (hw2) obj5;
                hw2 hw2Var2 = (hw2) obj4;
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (ux2Var6.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    fs4 fs4VarF = ka0.F(eg6.a(cs4Var, 1.0f), hw2Var != null ? 12.0f : 0.0f, 0.0f, 0.0f, 0.0f, 10);
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode = Long.hashCode(ux2Var6.T);
                    yj5 yj5VarL = ux2Var6.l();
                    fs4 fs4VarS = uf0.s(ux2Var6, fs4VarF);
                    yz0.c.getClass();
                    ux2Var6.a0();
                    if (ux2Var6.S) {
                        ux2Var6.k(LayoutNode.e0);
                    } else {
                        ux2Var6.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var6);
                    o67.n(yj5VarL, d82.u, ux2Var6);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var6);
                    o67.l(ux2Var6);
                    o67.n(fs4VarS, d82.t, ux2Var6);
                    hw2Var2.invoke(ux2Var6, 0);
                    ux2Var6.p(true);
                } else {
                    ux2Var6.Q();
                }
                return f88Var3;
            case 6:
                e45 e45Var = (e45) obj5;
                b45 b45Var = (b45) obj4;
                ll0 ll0Var = (ll0) obj;
                l03 l03Var = (l03) obj2;
                LayoutNode layoutNode = e45Var.G;
                if (layoutNode.X()) {
                    e45Var.d0 = ll0Var;
                    e45Var.c0 = l03Var;
                    e14.a(layoutNode).getSnapshotObserver().a.f(e45Var, e45.k0, b45Var);
                    e45Var.g0 = false;
                } else {
                    e45Var.g0 = true;
                }
                return f88Var3;
            case 7:
                ArrayList arrayList = (ArrayList) obj4;
                int iIntValue5 = ((Integer) obj).intValue();
                int i4 = ((re5[]) obj5)[iIntValue5].a;
                if (i4 == 6) {
                    arrayList.set(iIntValue5, yl7.Q);
                } else if (i4 == 5) {
                    arrayList.set(iIntValue5, yl7.R);
                }
                return f88Var3;
            case 8:
                ((Integer) obj2).getClass();
                it1.e((sj5) obj5, (fs4) obj4, (ux2) obj, yo1.Y(1));
                return f88Var3;
            case ep1.b /* 9 */:
                ((Integer) obj2).getClass();
                lv1.s((ex4) obj5, (l84) obj4, (ux2) obj, yo1.Y(1));
                return f88Var3;
            case ep1.c /* 10 */:
                ((Integer) obj2).getClass();
                lv1.u((List) obj5, (l84) obj4, (ux2) obj, yo1.Y(1));
                return f88Var3;
            case 11:
                ((Integer) obj2).getClass();
                yo1.a((vx4) obj5, (vc) obj4, (ux2) obj, yo1.Y(1));
                return f88Var3;
            case ep1.d /* 12 */:
                px4 px4Var = (px4) obj4;
                ux2 ux2Var7 = (ux2) obj;
                ((Integer) obj2).getClass();
                ux2Var7.W(211997353);
                String str2 = ((vt5) obj5).a;
                if (str2 == null) {
                    ux2Var7.W(2011255180);
                    ux2Var7.p(false);
                    z = false;
                    ux2Var = ux2Var7;
                    f88Var = null;
                } else {
                    ux2Var7.W(2011255181);
                    fs4 fs4VarF2 = ka0.F(cs4.b, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    h72 h72Var = un4.a;
                    ot7 ot7Var = ((rn4) ux2Var7.j(h72Var)).b.h;
                    long j = ((rn4) ux2Var7.j(h72Var)).a.q;
                    Object objK = ux2Var7.K();
                    if (objK == awVar) {
                        objK = new va(px4Var, (byte) 20);
                        ux2Var7.g0(objK);
                    }
                    qs7.b(str2, fs4VarF2, j, 0L, null, 0L, null, 0L, 2, false, Integer.MAX_VALUE, 0, (Function1) objK, ot7Var, ux2Var7, 48, 1573248, 45048);
                    ux2Var = ux2Var7;
                    z = false;
                    ux2Var.p(false);
                    f88Var = f88Var3;
                }
                ux2Var.p(z);
                return f88Var;
            case 13:
                px4 px4Var2 = (px4) obj4;
                ux2 ux2Var8 = (ux2) obj;
                ((Integer) obj2).getClass();
                ux2Var8.W(-1215701563);
                String str3 = ((ut5) obj5).a;
                if (str3 == null) {
                    ux2Var8.W(-1800980804);
                    ux2Var8.p(false);
                    z2 = false;
                    ux2Var2 = ux2Var8;
                    f88Var2 = null;
                } else {
                    ux2Var8.W(-1800980803);
                    h72 h72Var2 = un4.a;
                    ot7 ot7Var2 = ((rn4) ux2Var8.j(h72Var2)).b.k;
                    long j2 = ((rn4) ux2Var8.j(h72Var2)).a.q;
                    Object objK2 = ux2Var8.K();
                    if (objK2 == awVar) {
                        objK2 = new va(px4Var2, (byte) 21);
                        ux2Var8.g0(objK2);
                    }
                    qs7.b(str3, cs4.b, j2, 0L, null, 0L, null, 0L, 2, false, Integer.MAX_VALUE, 0, (Function1) objK2, ot7Var2, ux2Var8, 48, 1573248, 45048);
                    ux2Var2 = ux2Var8;
                    z2 = false;
                    ux2Var2.p(false);
                    f88Var2 = f88Var3;
                }
                ux2Var2.p(z2);
                return f88Var2;
            case 14:
                ((Integer) obj2).getClass();
                io1.b((BarcodeView) obj5, (fs4) obj4, (ux2) obj, yo1.Y(49));
                return f88Var3;
            case 15:
                a06 a06Var3 = (a06) obj5;
                RCClientActivity rCClientActivity = (RCClientActivity) obj4;
                ux2 ux2Var9 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i5 = RCClientActivity.c0;
                if (ux2Var9.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nv1.g(null, null, null, null, null, 0, 0L, 0L, null, au8.O(401727886, new sd(a06Var3, rCClientActivity, (byte) 9), ux2Var9), ux2Var9, 805306368, 511);
                } else {
                    ux2Var9.Q();
                }
                return f88Var3;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                yy0 yy0Var2 = (yy0) obj5;
                li6 li6Var = (li6) obj4;
                ux2 ux2Var10 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (ux2Var10.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    yy0Var2.d(li6Var, ux2Var10, 6);
                } else {
                    ux2Var10.Q();
                }
                return f88Var3;
            case 17:
                zl6 zl6Var = (zl6) obj5;
                Function1 function1 = (Function1) obj4;
                ux2 ux2Var11 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (ux2Var11.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    for (zl6 zl6Var2 : zl6.u) {
                        boolean z4 = zl6Var == zl6Var2 ? true : z3;
                        Set set = nm6.a;
                        zl6Var2.getClass();
                        int iOrdinal = zl6Var2.ordinal();
                        if (iOrdinal == 0) {
                            str = "all";
                        } else if (iOrdinal == 1) {
                            str = "devices";
                        } else if (iOrdinal == i) {
                            str = "contacts";
                        } else {
                            if (iOrdinal != b4) {
                                gk0.s();
                                return obj3;
                            }
                            str = "groups";
                        }
                        fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-searchScreen-tabs-".concat(str));
                        h72 h72Var3 = un4.a;
                        long j3 = ((rn4) ux2Var11.j(h72Var3)).a.q;
                        long j4 = ((rn4) ux2Var11.j(h72Var3)).a.s;
                        boolean zF = ux2Var11.f(function1) | ux2Var11.d(zl6Var2.ordinal());
                        Object objK3 = ux2Var11.K();
                        if (zF || objK3 == awVar) {
                            objK3 = new hm6(function1, zl6Var2, (byte) 1);
                            ux2Var11.g0(objK3);
                        }
                        nm7.a(z4, (Function0) objK3, fs4VarA, false, j3, j4, au8.O(-1548867556, new sd(zl6Var2, zl6Var, b3), ux2Var11), ux2Var11, 12582912, 72);
                        obj3 = null;
                        i = 2;
                        b4 = 3;
                        z3 = false;
                    }
                } else {
                    ux2Var11.Q();
                }
                return f88Var3;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                String str4 = (String) obj5;
                iv6 iv6Var = (iv6) obj4;
                ux2 ux2Var12 = (ux2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (ux2Var12.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zF2 = ux2Var12.f(iv6Var);
                    Object objK4 = ux2Var12.K();
                    if (zF2 || objK4 == awVar) {
                        objK4 = new sv6(iv6Var, (byte) 1);
                        ux2Var12.g0(objK4);
                    }
                    x37.g(0, str4, null, (Function0) objK4, ux2Var12, null);
                } else {
                    ux2Var12.Q();
                }
                return f88Var3;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((Integer) obj2).getClass();
                et1.n((fs4) obj5, (yy0) obj4, (ux2) obj, yo1.Y(49));
                return f88Var3;
            case 20:
                yy0 yy0Var3 = (yy0) obj5;
                o37 o37Var = (o37) obj4;
                ux2 ux2Var13 = (ux2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (ux2Var13.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    o37Var.getClass();
                    yy0Var3.d(o37Var, ux2Var13, 0);
                } else {
                    ux2Var13.Q();
                }
                return f88Var3;
            case 21:
                o37 o37Var2 = (o37) obj5;
                String str5 = (String) obj4;
                ux2 ux2Var14 = (ux2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (ux2Var14.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean zF3 = ux2Var14.f(o37Var2);
                    Object objK5 = ux2Var14.K();
                    if (zF3 || objK5 == awVar) {
                        objK5 = new l37(o37Var2, (byte) 1);
                        ux2Var14.g0(objK5);
                    }
                    xo1.k((Function0) objK5, null, false, null, null, au8.O(1306131274, new qa(str5, b3), ux2Var14), ux2Var14, 1572864, 62);
                } else {
                    ux2Var14.Q();
                }
                return f88Var3;
            case 22:
                ((Integer) obj2).getClass();
                ((c67) obj5).A0((fs4) obj4, (ux2) obj, yo1.Y(1));
                return f88Var3;
            case 23:
                ((Integer) obj2).getClass();
                r47.b((rd7) obj5, (fs4) obj4, (ux2) obj, yo1.Y(49));
                return f88Var3;
            case 24:
                ((Integer) obj2).getClass();
                v67.a((ArrayList) obj5, (fs4) obj4, (ux2) obj, yo1.Y(1));
                return f88Var3;
            case 25:
                List list = (List) obj5;
                yf5 yf5Var = (yf5) obj4;
                ux2 ux2Var15 = (ux2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (ux2Var15.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    int i6 = 0;
                    for (Object obj6 : list) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            qf0.U();
                            throw null;
                        }
                        String str6 = (String) obj6;
                        fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(cs4Var, i6 == 0 ? "TVTA-settings-tfa-tab-remote" : "TVTA-settings-tfa-tab-classic");
                        boolean z5 = yf5Var.z() == i6;
                        boolean zF4 = ux2Var15.f(yf5Var) | ux2Var15.d(i6);
                        Object objK6 = ux2Var15.K();
                        if (zF4 || objK6 == awVar) {
                            objK6 = new e83(b4, i6, yf5Var);
                            ux2Var15.g0(objK6);
                        }
                        nm7.b(z5, (Function0) objK6, fs4VarA2, false, au8.O(-1463535689, new qa(str6, (byte) 12), ux2Var15), 0L, 0L, ux2Var15, 24576, 488);
                        i6 = i7;
                    }
                } else {
                    ux2Var15.Q();
                }
                return f88Var3;
            case 26:
                ((Integer) obj2).getClass();
                g77.a((hi7) obj5, (fs4) obj4, (ux2) obj, yo1.Y(1));
                return f88Var3;
            case 27:
                iw2 iw2Var = (iw2) obj5;
                bn7 bn7Var = (bn7) obj4;
                ux2 ux2Var16 = (ux2) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (ux2Var16.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    iw2Var.d(bn7Var, ux2Var16, 6);
                } else {
                    ux2Var16.Q();
                }
                return f88Var3;
            case 28:
                ((Integer) obj2).getClass();
                ((z06) obj5).l((Drawable) obj4, (ux2) obj, yo1.Y(49));
                return f88Var3;
            default:
                iw2 iw2Var2 = (iw2) obj5;
                pq7 pq7Var = (pq7) obj4;
                ux2 ux2Var17 = (ux2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (ux2Var17.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    iw2Var2.d(pq7Var, ux2Var17, 6);
                } else {
                    ux2Var17.Q();
                }
                return f88Var3;
        }
    }

    public /* synthetic */ l64(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f1332o = obj2;
    }
}
