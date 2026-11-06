package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bz0 implements hw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ bz0(byte b) {
        this.m = b;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        tg3 tg3Var = LayoutNode.e0;
        aw awVar = e01.a;
        cs4 cs4Var = cs4.b;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_drop_down_menu, ux2Var, 0), m77.z(R.string.options_menu_content_description, ux2Var), androidx.compose.ui.platform.a.a(ka0.B(cs4Var, 8.0f), "TVTA-devicesScreen-contactList-dropDownMenu"), ((rn4) ux2Var.j(un4.a)).a.s, ux2Var, 392, 0);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_contact_unavailable_dialog_title, ux2Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var2, 0, 0, 262142);
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_contact_unavailable_dialog_message, ux2Var3), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-contactInfoScreen-contactUnavailableDialog-description"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 48, 0, 262140);
                }
                break;
            case 3:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else {
                    qs7.b(m77.z(R.string.crash_dialog_title, ux2Var4), null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var4, 0, 24960, 241662);
                }
                break;
            case 4:
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ux2Var5.Q();
                } else {
                    String strZ = m77.z(R.string.crash_dialog_message, ux2Var5);
                    hk6 hk6VarW = im3.W(ux2Var5);
                    Object objK = ux2Var5.K();
                    if (objK == awVar) {
                        objK = ck3.w(ux2Var5);
                        ux2Var5.g0(objK);
                    }
                    qs7.b(strZ, o77.t(cs4Var, hk6VarW, (me1) objK), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var5, 0, 0, 262140);
                }
                break;
            case 5:
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ux2Var6.Q();
                } else {
                    qs7.b(m77.z(R.string.delete_company_account_error_dialog_title, ux2Var6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var6, 0, 0, 262142);
                }
                break;
            case 6:
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ux2Var7.Q();
                } else {
                    String strZ2 = m77.z(R.string.delete_company_account_error_dialog_description, ux2Var7);
                    hk6 hk6VarW2 = im3.W(ux2Var7);
                    Object objK2 = ux2Var7.K();
                    if (objK2 == awVar) {
                        objK2 = ck3.w(ux2Var7);
                        ux2Var7.g0(objK2);
                    }
                    qs7.b(strZ2, o77.t(cs4Var, hk6VarW2, (me1) objK2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var7, 0, 0, 262140);
                }
                break;
            case 7:
                ux2 ux2Var8 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!ux2Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ux2Var8.Q();
                } else {
                    Object objK3 = ux2Var8.K();
                    if (objK3 == awVar) {
                        objK3 = new ez0((byte) 0);
                        ux2Var8.g0(objK3);
                    }
                    g68.b(6, (Function0) objK3, ux2Var8, null);
                }
                break;
            case 8:
                ux2 ux2Var9 = (ux2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!ux2Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ux2Var9.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_device_details_delete_dialog_title, ux2Var9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var9, 0, 0, 262142);
                }
                break;
            case ep1.b /* 9 */:
                ux2 ux2Var10 = (ux2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!ux2Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ux2Var10.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_device_details_delete_dialog_content, ux2Var10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var10, 0, 0, 262142);
                }
                break;
            case ep1.c /* 10 */:
                ux2 ux2Var11 = (ux2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!ux2Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ux2Var11.Q();
                } else {
                    Object objK4 = ux2Var11.K();
                    if (objK4 == awVar) {
                        objK4 = new ez0((byte) 1);
                        ux2Var11.g0(objK4);
                    }
                    Function0 function0 = (Function0) objK4;
                    Object objK5 = ux2Var11.K();
                    if (objK5 == awVar) {
                        objK5 = new ez0((byte) 2);
                        ux2Var11.g0(objK5);
                    }
                    db8.e(function0, (Function0) objK5, ux2Var11, 54);
                }
                break;
            case 11:
                ux2 ux2Var12 = (ux2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!ux2Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ux2Var12.Q();
                } else {
                    qs7.b(m77.z(R.string.group_delete_title, ux2Var12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var12, 0, 0, 262142);
                }
                break;
            case ep1.d /* 12 */:
                ux2 ux2Var13 = (ux2) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!ux2Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ux2Var13.Q();
                } else {
                    fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, 40.0f), sf6.a(8.0f));
                    h72 h72Var = un4.a;
                    fs4 fs4VarS = au8.s(fs4VarJ, rv0.b(0.08f, ((rn4) ux2Var13.j(h72Var)).a.s), kh.V);
                    do4 do4VarC = ua0.c(xz2.s, false);
                    int iHashCode = Long.hashCode(ux2Var13.T);
                    yj5 yj5VarL = ux2Var13.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var13, fs4VarS);
                    yz0.c.getClass();
                    ux2Var13.a0();
                    if (ux2Var13.S) {
                        ux2Var13.k(tg3Var);
                    } else {
                        ux2Var13.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var13);
                    o67.n(yj5VarL, d82.u, ux2Var13);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var13);
                    o67.l(ux2Var13);
                    o67.n(fs4VarS2, d82.t, ux2Var13);
                    td3.b(lv1.T(R.drawable.ic_filetransfer, ux2Var13, 0), m77.z(R.string.tv_device_options_rc_prompt_tooltip, ux2Var13), androidx.compose.foundation.layout.b.l(cs4Var, 24.0f), ((rn4) ux2Var13.j(h72Var)).a.s, ux2Var13, 392, 0);
                    ux2Var13.p(true);
                }
                break;
            case 13:
                ux2 ux2Var14 = (ux2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!ux2Var14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ux2Var14.Q();
                } else {
                    fs4 fs4VarJ2 = iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, 40.0f), sf6.a(8.0f));
                    h72 h72Var2 = un4.a;
                    fs4 fs4VarS3 = au8.s(fs4VarJ2, rv0.b(0.08f, ((rn4) ux2Var14.j(h72Var2)).a.s), kh.V);
                    do4 do4VarC2 = ua0.c(xz2.s, false);
                    int iHashCode2 = Long.hashCode(ux2Var14.T);
                    yj5 yj5VarL2 = ux2Var14.l();
                    fs4 fs4VarS4 = uf0.s(ux2Var14, fs4VarS3);
                    yz0.c.getClass();
                    ux2Var14.a0();
                    if (ux2Var14.S) {
                        ux2Var14.k(tg3Var);
                    } else {
                        ux2Var14.j0();
                    }
                    o67.n(do4VarC2, d82.v, ux2Var14);
                    o67.n(yj5VarL2, d82.u, ux2Var14);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var14);
                    o67.l(ux2Var14);
                    o67.n(fs4VarS4, d82.t, ux2Var14);
                    td3.b(lv1.T(R.drawable.ic_filetransfer, ux2Var14, 0), m77.z(R.string.option_file_transfer, ux2Var14), androidx.compose.foundation.layout.b.l(cs4Var, 24.0f), ((rn4) ux2Var14.j(h72Var2)).a.s, ux2Var14, 392, 0);
                    ux2Var14.p(true);
                }
                break;
            case 14:
                ux2 ux2Var15 = (ux2) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!ux2Var15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ux2Var15.Q();
                } else {
                    us1.b(new wt1(cx.h1(new ss1[]{ss1.n, ss1.f2046o}), false, false, null, 16777079), us1.N(ls1.m, js1.m, null), null, null, null, null, ux2Var15, 0, 60);
                }
                break;
            case 15:
                ux2 ux2Var16 = (ux2) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!ux2Var16.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ux2Var16.Q();
                } else {
                    us1.b(new wt1(null, false, true, null, 16777087), us1.N(ls1.f1400o, js1.n, ms1.m), null, null, null, null, ux2Var16, 0, 60);
                }
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ux2 ux2Var17 = (ux2) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!ux2Var17.N(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ux2Var17.Q();
                } else {
                    qs7.b("•••••••••", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var17, 6, 0, 262142);
                }
                break;
            case 17:
                ux2 ux2Var18 = (ux2) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!ux2Var18.N(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ux2Var18.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_info, ux2Var18, 0), m77.z(R.string.device_tab_device_details_password_warning_sheet_title, ux2Var18), null, 0L, ux2Var18, 8, 12);
                }
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ux2 ux2Var19 = (ux2) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!ux2Var19.N(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ux2Var19.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_device_unavailable_dialog_title, ux2Var19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var19, 0, 0, 262142);
                }
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ux2 ux2Var20 = (ux2) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!ux2Var20.N(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ux2Var20.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_device_unavailable_dialog_message, ux2Var20), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-deviceInfoScreen-deviceUnavailableDialog-description"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var20, 48, 0, 262140);
                }
                break;
            case 20:
                ux2 ux2Var21 = (ux2) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!ux2Var21.N(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ux2Var21.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_devices_search_hint, ux2Var21), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, ux2Var21, 0, 24960, 241662);
                }
                break;
            case 21:
                ux2 ux2Var22 = (ux2) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!ux2Var22.N(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ux2Var22.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_search_app_bar, ux2Var22, 0), m77.z(R.string.device_tab_search_content_description, ux2Var22), null, 0L, ux2Var22, 8, 12);
                }
                break;
            case 22:
                ux2 ux2Var23 = (ux2) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (!ux2Var23.N(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ux2Var23.Q();
                } else {
                    qs7.b(m77.z(R.string.contact_discard_changes_dialog_title, ux2Var23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var23, 0, 0, 262142);
                }
                break;
            case 23:
                ux2 ux2Var24 = (ux2) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (!ux2Var24.N(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ux2Var24.Q();
                } else {
                    qs7.b(m77.z(R.string.contact_discard_changes_dialog_message, ux2Var24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var24, 0, 0, 262142);
                }
                break;
            case 24:
                ux2 ux2Var25 = (ux2) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!ux2Var25.N(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ux2Var25.Q();
                }
                break;
            case 25:
                ux2 ux2Var26 = (ux2) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (!ux2Var26.N(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ux2Var26.Q();
                } else {
                    qs7.b(m77.z(R.string.feedback_alert_title, ux2Var26), null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var26, 0, 24960, 241662);
                }
                break;
            case 26:
                ux2 ux2Var27 = (ux2) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (!ux2Var27.N(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ux2Var27.Q();
                } else {
                    String strZ3 = m77.z(R.string.feedback_alert_content, ux2Var27);
                    hk6 hk6VarW3 = im3.W(ux2Var27);
                    Object objK6 = ux2Var27.K();
                    if (objK6 == awVar) {
                        objK6 = ck3.w(ux2Var27);
                        ux2Var27.g0(objK6);
                    }
                    qs7.b(strZ3, o77.t(cs4Var, hk6VarW3, (me1) objK6), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var27, 0, 0, 262140);
                }
                break;
            case 27:
                ux2 ux2Var28 = (ux2) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (!ux2Var28.N(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    ux2Var28.Q();
                } else {
                    String strZ4 = m77.z(R.string.group_rename_title, ux2Var28);
                    h72 h72Var3 = un4.a;
                    qs7.b(strZ4, null, ((rn4) ux2Var28.j(h72Var3)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var28.j(h72Var3)).b.j, ux2Var28, 0, 24960, 110586);
                }
                break;
            case 28:
                ux2 ux2Var29 = (ux2) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (!ux2Var29.N(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ux2Var29.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_group_rename, ux2Var29, 0), null, null, 0L, ux2Var29, 56, 12);
                }
                break;
            default:
                ux2 ux2Var30 = (ux2) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (!ux2Var30.N(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    ux2Var30.Q();
                } else {
                    String strZ5 = m77.z(R.string.group_delete_title, ux2Var30);
                    h72 h72Var4 = un4.a;
                    qs7.b(strZ5, null, ((rn4) ux2Var30.j(h72Var4)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var30.j(h72Var4)).b.j, ux2Var30, 0, 24960, 110586);
                }
                break;
        }
        return f88Var;
    }
}
