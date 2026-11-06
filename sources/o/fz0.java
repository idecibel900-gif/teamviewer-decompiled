package o;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fz0 implements hw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ fz0(byte b) {
        this.m = b;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        tg3 tg3Var = LayoutNode.e0;
        cs4 cs4Var = cs4.b;
        aw awVar = e01.a;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_group_delete, ux2Var, 0), null, null, 0L, ux2Var, 56, 12);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_connect_device, ux2Var2, 0), m77.z(R.string.connect_content_description, ux2Var2), androidx.compose.foundation.layout.b.l(cs4Var, 20.0f), rv0.h, ux2Var2, 3464, 0);
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_group_unavailable_dialog_title, ux2Var3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262142);
                }
                break;
            case 3:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_group_unavailable_dialog_message, ux2Var4), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-groupScreen-groupUnavailableDialog-description"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var4, 48, 0, 262140);
                }
                break;
            case 4:
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ux2Var5.Q();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.b.c;
                    do4 do4VarC = ua0.c(xz2.s, false);
                    int iHashCode = Long.hashCode(ux2Var5.T);
                    yj5 yj5VarL = ux2Var5.l();
                    fs4 fs4VarS = uf0.s(ux2Var5, fillElement);
                    yz0.c.getClass();
                    ux2Var5.a0();
                    if (ux2Var5.S) {
                        ux2Var5.k(tg3Var);
                    } else {
                        ux2Var5.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var5);
                    o67.n(yj5VarL, d82.u, ux2Var5);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var5);
                    o67.l(ux2Var5);
                    o67.n(fs4VarS, d82.t, ux2Var5);
                    st5.a(null, ((rn4) ux2Var5.j(un4.a)).a.a, 0.0f, 0L, 0, 0.0f, ux2Var5, 0, 61);
                    ux2Var5.p(true);
                }
                break;
            case 5:
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ux2Var6.Q();
                } else {
                    ig7.a(null, null, 0L, 0L, 0.0f, 0.0f, g68.j, ux2Var6, 12582912, 127);
                }
                break;
            case 6:
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ux2Var7.Q();
                } else {
                    ut7.a(g68.k, ux2Var7, 48);
                }
                break;
            case 7:
                ux2 ux2Var8 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!ux2Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ux2Var8.Q();
                } else {
                    vh3 vh3Var = new vh3(m77.z(R.string.no_browser_dialog_title, ux2Var8), m77.z(R.string.no_browser_dialog_message, ux2Var8), null);
                    Object objK = ux2Var8.K();
                    if (objK == awVar) {
                        objK = new ez0((byte) 3);
                        ux2Var8.g0(objK);
                    }
                    Function0 function0 = (Function0) objK;
                    Object objK2 = ux2Var8.K();
                    if (objK2 == awVar) {
                        objK2 = new ez0((byte) 4);
                        ux2Var8.g0(objK2);
                    }
                    io1.j(vh3Var, function0, (Function0) objK2, null, null, ux2Var8, 432, 24);
                }
                break;
            case 8:
                ux2 ux2Var9 = (ux2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!ux2Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ux2Var9.Q();
                } else {
                    String strZ = m77.z(R.string.legal_agreement_title, ux2Var9);
                    h72 h72Var = un4.a;
                    qs7.b(strZ, null, ((rn4) ux2Var9.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var9.j(h72Var)).b.g, ux2Var9, 0, 0, 130042);
                }
                break;
            case ep1.b /* 9 */:
                ux2 ux2Var10 = (ux2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!ux2Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ux2Var10.Q();
                }
                break;
            case ep1.c /* 10 */:
                ux2 ux2Var11 = (ux2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!ux2Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ux2Var11.Q();
                }
                break;
            case 11:
                ux2 ux2Var12 = (ux2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!ux2Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ux2Var12.Q();
                }
                break;
            case ep1.d /* 12 */:
                ux2 ux2Var13 = (ux2) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!ux2Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ux2Var13.Q();
                }
                break;
            case 13:
                ux2 ux2Var14 = (ux2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!ux2Var14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ux2Var14.Q();
                } else {
                    td3.b(lv1.T(2131231077, ux2Var14, 0), "Share", null, 0L, ux2Var14, 56, 12);
                }
                break;
            case 14:
                ux2 ux2Var15 = (ux2) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!ux2Var15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ux2Var15.Q();
                } else {
                    qs7.b(m77.z(R.string.logfile_delete_dialog_title, ux2Var15), null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var15, 0, 24960, 241662);
                }
                break;
            case 15:
                ux2 ux2Var16 = (ux2) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!ux2Var16.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ux2Var16.Q();
                } else {
                    String strZ2 = m77.z(R.string.logfile_delete_dialog_description, ux2Var16);
                    hk6 hk6VarW = im3.W(ux2Var16);
                    Object objK3 = ux2Var16.K();
                    if (objK3 == awVar) {
                        objK3 = ck3.w(ux2Var16);
                        ux2Var16.g0(objK3);
                    }
                    qs7.b(strZ2, o77.t(cs4Var, hk6VarW, (me1) objK3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var16, 0, 0, 262140);
                }
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ux2 ux2Var17 = (ux2) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!ux2Var17.N(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ux2Var17.Q();
                } else {
                    qs7.b(m77.z(R.string.tv_device_options_home_screen_shortcut_max_number_dialog_title, ux2Var17), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var17, 0, 0, 262142);
                }
                break;
            case 17:
                ux2 ux2Var18 = (ux2) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!ux2Var18.N(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ux2Var18.Q();
                } else {
                    qs7.b(m77.z(R.string.tv_device_options_home_screen_shortcut_max_number_dialog_text, ux2Var18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var18, 0, 0, 262142);
                }
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ux2 ux2Var19 = (ux2) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!ux2Var19.N(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ux2Var19.Q();
                } else {
                    p90.a.a(null, 0.0f, 0.0f, null, 0L, ux2Var19, 196608);
                }
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ux2 ux2Var20 = (ux2) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!ux2Var20.N(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ux2Var20.Q();
                }
                break;
            case 20:
                ux2 ux2Var21 = (ux2) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!ux2Var21.N(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ux2Var21.Q();
                } else {
                    Object objK4 = ux2Var21.K();
                    if (objK4 == awVar) {
                        objK4 = new ez0((byte) 5);
                        ux2Var21.g0(objK4);
                    }
                    tq1 tq1Var = new tq1(R.drawable.ic_device_shortcut, R.string.device_tab_device_details_option_device_shortcut, "", true, true, (Function0) objK4);
                    Object objK5 = ux2Var21.K();
                    if (objK5 == awVar) {
                        objK5 = new ez0((byte) 6);
                        ux2Var21.g0(objK5);
                    }
                    List listL = qf0.L(tq1Var, new tq1(R.drawable.ic_delete, R.string.device_tab_device_details_option_delete, "", true, true, (Function0) objK5));
                    Object objK6 = ux2Var21.K();
                    if (objK6 == awVar) {
                        objK6 = new ez0((byte) 7);
                        ux2Var21.g0(objK6);
                    }
                    us1.h(listL, (Function0) objK6, null, ux2Var21, 48);
                }
                break;
            case 21:
                ux2 ux2Var22 = (ux2) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!ux2Var22.N(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ux2Var22.Q();
                } else {
                    do4 do4VarC2 = ua0.c(xz2.s, false);
                    int iHashCode2 = Long.hashCode(ux2Var22.T);
                    yj5 yj5VarL2 = ux2Var22.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var22, cs4Var);
                    yz0.c.getClass();
                    ux2Var22.a0();
                    if (ux2Var22.S) {
                        ux2Var22.k(tg3Var);
                    } else {
                        ux2Var22.j0();
                    }
                    o67.n(do4VarC2, d82.v, ux2Var22);
                    o67.n(yj5VarL2, d82.u, ux2Var22);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var22);
                    o67.l(ux2Var22);
                    o67.n(fs4VarS2, d82.t, ux2Var22);
                    String strZ3 = m77.z(R.string.device_tab_no_internet_banner, ux2Var22);
                    fs4 fs4VarD = ka0.D(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f, 0.0f, 2);
                    h72 h72Var2 = un4.a;
                    qs7.b(strZ3, fs4VarD, ((rn4) ux2Var22.j(h72Var2)).a.v, 0L, null, 0L, new qo7(3), 0L, 2, false, 1, 0, null, ((rn4) ux2Var22.j(h72Var2)).b.m, ux2Var22, 48, 24960, 109560);
                    ux2Var22.p(true);
                }
                break;
            case 22:
                ux2 ux2Var23 = (ux2) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (!ux2Var23.N(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ux2Var23.Q();
                } else {
                    qs7.b(m77.z(R.string.tv_trusted_device_notification_channel_permission_title, ux2Var23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var23, 0, 0, 262142);
                }
                break;
            case 23:
                ux2 ux2Var24 = (ux2) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (!ux2Var24.N(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ux2Var24.Q();
                } else {
                    String strZ4 = m77.z(R.string.tv_trusted_device_notification_channel_permission_text, ux2Var24);
                    hk6 hk6VarW2 = im3.W(ux2Var24);
                    Object objK7 = ux2Var24.K();
                    if (objK7 == awVar) {
                        objK7 = ck3.w(ux2Var24);
                        ux2Var24.g0(objK7);
                    }
                    qs7.b(strZ4, o77.t(cs4Var, hk6VarW2, (me1) objK7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var24, 0, 0, 262140);
                }
                break;
            case 24:
                ux2 ux2Var25 = (ux2) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!ux2Var25.N(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ux2Var25.Q();
                } else {
                    Object objK8 = ux2Var25.K();
                    if (objK8 == awVar) {
                        objK8 = new ez0((byte) 8);
                        ux2Var25.g0(objK8);
                    }
                    vs1.g(6, (Function0) objK8, ux2Var25, null);
                }
                break;
            case 25:
                ux2 ux2Var26 = (ux2) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (!ux2Var26.N(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ux2Var26.Q();
                } else {
                    Object objK9 = ux2Var26.K();
                    if (objK9 == awVar) {
                        objK9 = new ez0((byte) 9);
                        ux2Var26.g0(objK9);
                    }
                    qs1.r(6, (Function0) objK9, ux2Var26, null);
                }
                break;
            case 26:
                ux2 ux2Var27 = (ux2) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (!ux2Var27.N(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ux2Var27.Q();
                } else {
                    Object objK10 = ux2Var27.K();
                    if (objK10 == awVar) {
                        objK10 = new ez0((byte) 10);
                        ux2Var27.g0(objK10);
                    }
                    bt1.i(438, "New policy", "Nucleus policy", (Function0) objK10, ux2Var27, null);
                }
                break;
            case 27:
                ux2 ux2Var28 = (ux2) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (!ux2Var28.N(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    ux2Var28.Q();
                } else {
                    String strZ5 = m77.z(R.string.option_connect, ux2Var28);
                    h72 h72Var3 = un4.a;
                    qs7.b(strZ5, null, ((rn4) ux2Var28.j(h72Var3)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var28.j(h72Var3)).b.j, ux2Var28, 0, 24960, 110586);
                }
                break;
            case 28:
                ux2 ux2Var29 = (ux2) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (!ux2Var29.N(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ux2Var29.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_connect, ux2Var29, 0), m77.z(R.string.connect_content_description, ux2Var29), null, ((rn4) ux2Var29.j(un4.a)).a.s, ux2Var29, 8, 4);
                }
                break;
            default:
                ux2 ux2Var30 = (ux2) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (!ux2Var30.N(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    ux2Var30.Q();
                } else {
                    String strZ6 = m77.z(R.string.option_file_transfer, ux2Var30);
                    h72 h72Var4 = un4.a;
                    qs7.b(strZ6, null, ((rn4) ux2Var30.j(h72Var4)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var30.j(h72Var4)).b.j, ux2Var30, 0, 24960, 110586);
                }
                break;
        }
        return f88Var;
    }
}
