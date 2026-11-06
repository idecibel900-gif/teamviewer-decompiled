package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.contacts.models.ContactOnlineStatus;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zy0 implements hw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ zy0(byte b) {
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
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                }
                break;
            case 3:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                }
                break;
            case 4:
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ux2Var5.Q();
                }
                break;
            case 5:
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ux2Var6.Q();
                } else {
                    qs7.b(m77.z(R.string.attractionGuid_modal_title, ux2Var6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var6, 0, 0, 262142);
                }
                break;
            case 6:
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ux2Var7.Q();
                } else {
                    qs7.b(m77.z(R.string.attractionGuid_placeholder, ux2Var7), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, ux2Var7, 0, 24960, 241662);
                }
                break;
            case 7:
                ux2 ux2Var8 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!ux2Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ux2Var8.Q();
                } else {
                    td3.b(lv1.T(R.drawable.modal_clear, ux2Var8, 0), m77.z(R.string.clear_text_content_description, ux2Var8), null, 0L, ux2Var8, 8, 12);
                }
                break;
            case 8:
                ux2 ux2Var9 = (ux2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!ux2Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ux2Var9.Q();
                } else {
                    td3.b(lv1.T(R.drawable.clipboard_paste, ux2Var9, 0), m77.z(R.string.paste_content_description, ux2Var9), null, 0L, ux2Var9, 8, 12);
                }
                break;
            case ep1.b /* 9 */:
                ux2 ux2Var10 = (ux2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!ux2Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ux2Var10.Q();
                } else {
                    qs7.b(m77.z(R.string.tv_trusted_device_background_data_not_available_title, ux2Var10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var10, 0, 0, 262142);
                }
                break;
            case ep1.c /* 10 */:
                ux2 ux2Var11 = (ux2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!ux2Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ux2Var11.Q();
                } else {
                    String strZ = m77.z(R.string.tv_trusted_device_background_data_not_available_text, ux2Var11);
                    hk6 hk6VarW = im3.W(ux2Var11);
                    Object objK = ux2Var11.K();
                    if (objK == awVar) {
                        objK = ck3.w(ux2Var11);
                        ux2Var11.g0(objK);
                    }
                    qs7.b(strZ, o77.t(cs4Var, hk6VarW, (me1) objK), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var11, 0, 0, 262140);
                }
                break;
            case 11:
                ux2 ux2Var12 = (ux2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!ux2Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ux2Var12.Q();
                } else {
                    Object objK2 = ux2Var12.K();
                    if (objK2 == awVar) {
                        objK2 = new zq((byte) 24);
                        ux2Var12.g0(objK2);
                    }
                    ka0.c(6, (Function0) objK2, ux2Var12, null);
                }
                break;
            case ep1.d /* 12 */:
                ux2 ux2Var13 = (ux2) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!ux2Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ux2Var13.Q();
                } else {
                    qs7.b(m77.z(R.string.settings_biometric_authentication_disclaimer, ux2Var13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var13.j(un4.a)).b.j, ux2Var13, 0, 0, 131070);
                }
                break;
            case 13:
                ux2 ux2Var14 = (ux2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!ux2Var14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ux2Var14.Q();
                } else {
                    Object objK3 = ux2Var14.K();
                    if (objK3 == awVar) {
                        objK3 = new zq((byte) 25);
                        ux2Var14.g0(objK3);
                    }
                    ga0.c(6, (Function0) objK3, ux2Var14, null);
                }
                break;
            case 14:
                ux2 ux2Var15 = (ux2) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!ux2Var15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ux2Var15.Q();
                } else {
                    y57.h(null, ux2Var15, 0);
                }
                break;
            case 15:
                ux2 ux2Var16 = (ux2) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!ux2Var16.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ux2Var16.Q();
                } else {
                    qs7.b(m77.z(R.string.scan_qr_code_camera_permission_dialog_title, ux2Var16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var16, 0, 0, 262142);
                }
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ux2 ux2Var17 = (ux2) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!ux2Var17.N(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ux2Var17.Q();
                } else {
                    qs7.b(m77.z(R.string.scan_qr_code_camera_permission_dialog_description, ux2Var17), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var17, 0, 0, 262142);
                }
                break;
            case 17:
                ux2 ux2Var18 = (ux2) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!ux2Var18.N(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ux2Var18.Q();
                } else {
                    Object objK4 = ux2Var18.K();
                    if (objK4 == awVar) {
                        objK4 = new zq((byte) 26);
                        ux2Var18.g0(objK4);
                    }
                    Function0 function0 = (Function0) objK4;
                    Object objK5 = ux2Var18.K();
                    if (objK5 == awVar) {
                        objK5 = new zq((byte) 27);
                        ux2Var18.g0(objK5);
                    }
                    ck3.b(54, function0, (Function0) objK5, ux2Var18, null);
                }
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ux2 ux2Var19 = (ux2) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!ux2Var19.N(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ux2Var19.Q();
                } else {
                    qs7.b(m77.z(R.string.device_name, ux2Var19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var19, 0, 0, 262142);
                }
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ux2 ux2Var20 = (ux2) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!ux2Var20.N(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ux2Var20.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_arrow_back, ux2Var20, 0), m77.z(R.string.navigation_back_content_description, ux2Var20), null, 0L, ux2Var20, 8, 12);
                }
                break;
            case 20:
                ux2 ux2Var21 = (ux2) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!ux2Var21.N(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ux2Var21.Q();
                } else {
                    qs7.b(m77.z(R.string.delete_account_confirmation_dialog_title, ux2Var21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var21, 0, 0, 262142);
                }
                break;
            case 21:
                ux2 ux2Var22 = (ux2) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!ux2Var22.N(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ux2Var22.Q();
                } else {
                    String strZ2 = m77.z(R.string.delete_account_confirmation_dialog_description, ux2Var22);
                    hk6 hk6VarW2 = im3.W(ux2Var22);
                    Object objK6 = ux2Var22.K();
                    if (objK6 == awVar) {
                        objK6 = ck3.w(ux2Var22);
                        ux2Var22.g0(objK6);
                    }
                    qs7.b(strZ2, o77.t(cs4Var, hk6VarW2, (me1) objK6), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var22, 0, 0, 262140);
                }
                break;
            case 22:
                ux2 ux2Var23 = (ux2) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (!ux2Var23.N(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ux2Var23.Q();
                } else {
                    Object objK7 = ux2Var23.K();
                    if (objK7 == awVar) {
                        objK7 = new zq((byte) 28);
                        ux2Var23.g0(objK7);
                    }
                    Function0 function1 = (Function0) objK7;
                    Object objK8 = ux2Var23.K();
                    if (objK8 == awVar) {
                        objK8 = new zq((byte) 29);
                        ux2Var23.g0(objK8);
                    }
                    im3.d(54, function1, (Function0) objK8, ux2Var23, null);
                }
                break;
            case 23:
                ux2 ux2Var24 = (ux2) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (!ux2Var24.N(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ux2Var24.Q();
                } else {
                    qs1.l(lv1.T(R.drawable.solutions_qs_logo, ux2Var24, 0), m77.z(R.string.qs_logo_content_description, ux2Var24), iq8.j(androidx.compose.foundation.layout.b.c, sf6.a(16.0f)), null, rb1.a, 0.0f, null, ux2Var24, 24584, 104);
                }
                break;
            case 24:
                ux2 ux2Var25 = (ux2) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!ux2Var25.N(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ux2Var25.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_contact_edit_name_empty_error, ux2Var25), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-contactEditScreen-name-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var25, 48, 0, 262140);
                }
                break;
            case 25:
                ux2 ux2Var26 = (ux2) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (!ux2Var26.N(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ux2Var26.Q();
                } else {
                    fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, 40.0f), sf6.a(8.0f));
                    h72 h72Var = un4.a;
                    fs4 fs4VarS = au8.s(fs4VarJ, rv0.b(0.08f, ((rn4) ux2Var26.j(h72Var)).a.s), kh.V);
                    do4 do4VarC = ua0.c(xz2.s, false);
                    int iHashCode = Long.hashCode(ux2Var26.T);
                    yj5 yj5VarL = ux2Var26.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var26, fs4VarS);
                    yz0.c.getClass();
                    ux2Var26.a0();
                    if (ux2Var26.S) {
                        ux2Var26.k(tg3Var);
                    } else {
                        ux2Var26.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var26);
                    o67.n(yj5VarL, d82.u, ux2Var26);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var26);
                    o67.l(ux2Var26);
                    o67.n(fs4VarS2, d82.t, ux2Var26);
                    td3.b(lv1.T(R.drawable.ic_filetransfer, ux2Var26, 0), m77.z(R.string.option_file_transfer, ux2Var26), androidx.compose.foundation.layout.b.l(cs4Var, 24.0f), ((rn4) ux2Var26.j(h72Var)).a.s, ux2Var26, 392, 0);
                    ux2Var26.p(true);
                }
                break;
            case 26:
                ux2 ux2Var27 = (ux2) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (!ux2Var27.N(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ux2Var27.Q();
                } else {
                    fs4 fs4VarJ2 = iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, 40.0f), sf6.a(8.0f));
                    h72 h72Var2 = un4.a;
                    fs4 fs4VarS3 = au8.s(fs4VarJ2, rv0.b(0.08f, ((rn4) ux2Var27.j(h72Var2)).a.s), kh.V);
                    do4 do4VarC2 = ua0.c(xz2.s, false);
                    int iHashCode2 = Long.hashCode(ux2Var27.T);
                    yj5 yj5VarL2 = ux2Var27.l();
                    fs4 fs4VarS4 = uf0.s(ux2Var27, fs4VarS3);
                    yz0.c.getClass();
                    ux2Var27.a0();
                    if (ux2Var27.S) {
                        ux2Var27.k(tg3Var);
                    } else {
                        ux2Var27.j0();
                    }
                    o67.n(do4VarC2, d82.v, ux2Var27);
                    o67.n(yj5VarL2, d82.u, ux2Var27);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var27);
                    o67.l(ux2Var27);
                    o67.n(fs4VarS4, d82.t, ux2Var27);
                    td3.b(lv1.T(R.drawable.ic_close, ux2Var27, 0), m77.z(R.string.cancel_invitation, ux2Var27), androidx.compose.foundation.layout.b.l(cs4Var, 24.0f), ((rn4) ux2Var27.j(h72Var2)).a.s, ux2Var27, 392, 0);
                    ux2Var27.p(true);
                }
                break;
            case 27:
                ux2 ux2Var28 = (ux2) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (!ux2Var28.N(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    ux2Var28.Q();
                } else {
                    h71 h71Var = new h71(1, (Integer) 12345, "John Doe", "john.doe@teamviewer.com", (String) null, ContactOnlineStatus.Online, b91.m, 32);
                    i81 i81Var = new i81(null, null, false, false, 2047);
                    Object objK9 = ux2Var28.K();
                    if (objK9 == awVar) {
                        objK9 = new px((byte) 25);
                        ux2Var28.g0(objK9);
                    }
                    Function1 function2 = (Function1) objK9;
                    Object objK10 = ux2Var28.K();
                    if (objK10 == awVar) {
                        objK10 = new px((byte) 20);
                        ux2Var28.g0(objK10);
                    }
                    qf0.h(h71Var, true, false, i81Var, function2, (Function1) objK10, null, null, ux2Var28, 221616, 192);
                }
                break;
            case 28:
                ux2 ux2Var29 = (ux2) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (!ux2Var29.N(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ux2Var29.Q();
                } else {
                    h71 h71Var2 = new h71(1, (Integer) null, "John Doe", "john.doe@teamviewer.com", (String) null, (ContactOnlineStatus) null, b91.n, 114);
                    i81 i81Var2 = new i81(null, null, false, false, 2047);
                    Object objK11 = ux2Var29.K();
                    if (objK11 == awVar) {
                        objK11 = new px((byte) 21);
                        ux2Var29.g0(objK11);
                    }
                    Function1 function3 = (Function1) objK11;
                    Object objK12 = ux2Var29.K();
                    if (objK12 == awVar) {
                        objK12 = new px((byte) 22);
                        ux2Var29.g0(objK12);
                    }
                    qf0.h(h71Var2, false, false, i81Var2, function3, (Function1) objK12, null, null, ux2Var29, 221616, 192);
                }
                break;
            default:
                ux2 ux2Var30 = (ux2) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (!ux2Var30.N(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    ux2Var30.Q();
                } else {
                    h71 h71Var3 = new h71(1, (Integer) 12345, "john.doe@teamviewer.com", "john.doe@teamviewer.com", (String) null, (ContactOnlineStatus) null, b91.f407o, 112);
                    i81 i81Var3 = new i81(null, null, false, false, 2047);
                    Object objK13 = ux2Var30.K();
                    if (objK13 == awVar) {
                        objK13 = new px((byte) 23);
                        ux2Var30.g0(objK13);
                    }
                    Function1 function4 = (Function1) objK13;
                    Object objK14 = ux2Var30.K();
                    if (objK14 == awVar) {
                        objK14 = new px((byte) 24);
                        ux2Var30.g0(objK14);
                    }
                    qf0.h(h71Var3, false, false, i81Var3, function4, (Function1) objK14, null, null, ux2Var30, 221616, 192);
                }
                break;
        }
        return f88Var;
    }
}
