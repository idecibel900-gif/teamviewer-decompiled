package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v4 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    public /* synthetic */ v4(Function0 function0, byte b) {
        this.m = b;
        this.n = function0;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        cs4 cs4Var = cs4.b;
        aw awVar = e01.a;
        Function0 function0 = this.n;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else if (function0 != null) {
                    ux2Var.W(-1705224532);
                    td3.b(lv1.T(R.drawable.ic_play, ux2Var, 0), null, androidx.compose.foundation.layout.b.l(cs4Var, 14.0f), ((rn4) ux2Var.j(un4.a)).a.s, ux2Var, 440, 0);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-1705224533);
                    ux2Var.p(false);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    v67.d(this.n, null, null, false, "TVTA-background-data-dialog-dismissButton", ga0.h, ux2Var2, 221184, 14);
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    au8.p(this.n, null, false, null, null, null, j51.d, ux2Var3, 805306368, 510);
                }
                break;
            case 3:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else {
                    au8.p(this.n, null, false, null, null, null, j51.e, ux2Var4, 805306368, 510);
                }
                break;
            case 4:
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ux2Var5.Q();
                } else {
                    boolean zF = ux2Var5.f(function0);
                    Object objK = ux2Var5.K();
                    if (zF || objK == awVar) {
                        objK = new a9(function0, (byte) 10);
                        ux2Var5.g0(objK);
                    }
                    v67.d((Function0) objK, null, null, false, "TVTA-confirm-delete-account-dialog-confirmButton", hm3.c, ux2Var5, 221184, 14);
                }
                break;
            case 5:
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ux2Var6.Q();
                } else {
                    v67.d(this.n, null, null, false, "TVTA-confirm-delete-account-dialog-dismissButton", hm3.d, ux2Var6, 221184, 14);
                }
                break;
            case 6:
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ux2Var7.Q();
                } else {
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-contactInfoScreen-contactUnavailableDialog-button");
                    boolean zF2 = ux2Var7.f(function0);
                    Object objK2 = ux2Var7.K();
                    if (zF2 || objK2 == awVar) {
                        objK2 = new a9(function0, (byte) 19);
                        ux2Var7.g0(objK2);
                    }
                    au8.p((Function0) objK2, fs4VarA, false, null, null, null, db8.i, ux2Var7, 805306416, 508);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                j51.n(function0, (ux2) obj, yo1.Y(1));
                break;
            case 8:
                ux2 ux2Var8 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!ux2Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ux2Var8.Q();
                } else {
                    v67.d(this.n, null, null, false, null, iq8.j, ux2Var8, 196608, 30);
                }
                break;
            case ep1.b /* 9 */:
                ux2 ux2Var9 = (ux2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!ux2Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ux2Var9.Q();
                } else {
                    v67.d(this.n, null, null, false, null, iq8.k, ux2Var9, 196608, 30);
                }
                break;
            case ep1.c /* 10 */:
                ux2 ux2Var10 = (ux2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!ux2Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ux2Var10.Q();
                } else {
                    boolean zF3 = ux2Var10.f(function0);
                    Object objK3 = ux2Var10.K();
                    if (zF3 || objK3 == awVar) {
                        objK3 = new a9(function0, (byte) 22);
                        ux2Var10.g0(objK3);
                    }
                    v67.d((Function0) objK3, null, null, false, "TVTA-delete-company-account-dialog-confirmButton", kh.h, ux2Var10, 221184, 14);
                }
                break;
            case 11:
                ux2 ux2Var11 = (ux2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!ux2Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ux2Var11.Q();
                } else {
                    au8.p(this.n, null, false, null, null, null, ga0.k, ux2Var11, 805306368, 510);
                }
                break;
            case ep1.d /* 12 */:
                ux2 ux2Var12 = (ux2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!ux2Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ux2Var12.Q();
                } else {
                    au8.p(this.n, null, false, null, null, null, ga0.l, ux2Var12, 805306368, 510);
                }
                break;
            case 13:
                ux2 ux2Var13 = (ux2) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!ux2Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ux2Var13.Q();
                } else {
                    au8.p(this.n, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-deleteGroup-cancel"), false, null, null, null, ka0.e, ux2Var13, 805306416, 508);
                }
                break;
            case 14:
                ux2 ux2Var14 = (ux2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!ux2Var14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ux2Var14.Q();
                } else {
                    xs1.h(m77.z(R.string.device_tab_device_details_information_policy, ux2Var14), "TVTA-devicesScreen-deviceInfoScreen-deviceInfo-policyInfo", function0, ux2Var14, 48);
                }
                break;
            case 15:
                ux2 ux2Var15 = (ux2) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!ux2Var15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ux2Var15.Q();
                } else {
                    xs1.h(m77.z(R.string.device_tab_device_details_password_warning_sheet_title, ux2Var15), "TVTA-devicesScreen-deviceInfoScreen-deviceInfo-passwordWarning", function0, ux2Var15, 48);
                }
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ux2 ux2Var16 = (ux2) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!ux2Var16.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ux2Var16.Q();
                } else {
                    fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-deviceInfoScreen-deviceUnavailableDialog-button");
                    boolean zF4 = ux2Var16.f(function0);
                    Object objK4 = ux2Var16.K();
                    if (zF4 || objK4 == awVar) {
                        objK4 = new yv1(function0, (byte) 4);
                        ux2Var16.g0(objK4);
                    }
                    au8.p((Function0) objK4, fs4VarA2, false, null, null, null, xk0.g, ux2Var16, 805306416, 508);
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                ds1.g(function0, (ux2) obj, yo1.Y(1));
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ux2 ux2Var17 = (ux2) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!ux2Var17.N(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ux2Var17.Q();
                } else {
                    fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-contactEditScreen-discardDialog-discard");
                    boolean zF5 = ux2Var17.f(function0);
                    Object objK5 = ux2Var17.K();
                    if (zF5 || objK5 == awVar) {
                        objK5 = new yv1(function0, (byte) 6);
                        ux2Var17.g0(objK5);
                    }
                    au8.p((Function0) objK5, fs4VarA3, false, null, null, null, ck3.r, ux2Var17, 805306416, 508);
                }
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ux2 ux2Var18 = (ux2) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!ux2Var18.N(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ux2Var18.Q();
                } else {
                    fs4 fs4VarA4 = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-contactEditScreen-discardDialog-cancel");
                    boolean zF6 = ux2Var18.f(function0);
                    Object objK6 = ux2Var18.K();
                    if (zF6 || objK6 == awVar) {
                        objK6 = new yv1(function0, (byte) 5);
                        ux2Var18.g0(objK6);
                    }
                    au8.p((Function0) objK6, fs4VarA4, false, null, null, null, ck3.s, ux2Var18, 805306416, 508);
                }
                break;
            case 20:
                ux2 ux2Var19 = (ux2) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!ux2Var19.N(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ux2Var19.Q();
                } else {
                    fs4 fs4VarA5 = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-groupScreen-groupUnavailableDialog-button");
                    boolean zF7 = ux2Var19.f(function0);
                    Object objK7 = ux2Var19.K();
                    if (zF7 || objK7 == awVar) {
                        objK7 = new yv1(function0, (byte) 7);
                        ux2Var19.g0(objK7);
                    }
                    au8.p((Function0) objK7, fs4VarA5, false, null, null, null, e8.g, ux2Var19, 805306416, 508);
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                vt1.c(function0, (ux2) obj, yo1.Y(1));
                break;
            case 22:
                ux2 ux2Var20 = (ux2) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!ux2Var20.N(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ux2Var20.Q();
                } else {
                    v67.d(this.n, null, null, false, "TVTA-logfile-deleteDialog-confirm", kh.k, ux2Var20, 221184, 14);
                }
                break;
            case 23:
                ux2 ux2Var21 = (ux2) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!ux2Var21.N(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ux2Var21.Q();
                } else {
                    v67.d(this.n, null, null, false, "TVTA-logfile-deleteDialog-dismiss", kh.l, ux2Var21, 221184, 14);
                }
                break;
            case 24:
                ux2 ux2Var22 = (ux2) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!ux2Var22.N(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ux2Var22.Q();
                } else {
                    boolean zF8 = ux2Var22.f(function0);
                    Object objK8 = ux2Var22.K();
                    if (zF8 || objK8 == awVar) {
                        objK8 = new yv1(function0, (byte) 13);
                        ux2Var22.g0(objK8);
                    }
                    au8.p((Function0) objK8, null, false, null, null, null, ka0.g, ux2Var22, 805306368, 510);
                }
                break;
            case 25:
                ux2 ux2Var23 = (ux2) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (!ux2Var23.N(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ux2Var23.Q();
                } else {
                    v67.d(this.n, null, null, false, "TVTA-notification-channel-dialog-dismissButton", di1.j, ux2Var23, 221184, 14);
                }
                break;
            case 26:
                ux2 ux2Var24 = (ux2) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (!ux2Var24.N(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ux2Var24.Q();
                } else {
                    wo1.r(0, m77.z(R.string.settings_twoFactorAuthentication_scan_qr, ux2Var24), function0, ux2Var24, null);
                }
                break;
            case 27:
                ux2 ux2Var25 = (ux2) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!ux2Var25.N(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ux2Var25.Q();
                } else {
                    ud5 ud5VarT = lv1.T(R.drawable.ic_arrow_back, ux2Var25, 0);
                    long j = rv0.d;
                    String strZ = m77.z(R.string.qr_scanner_back, ux2Var25);
                    fs4 fs4VarF = ka0.F(cs4.b, 20.0f, 0.0f, 0.0f, 0.0f, 14);
                    Object objK9 = ux2Var25.K();
                    if (objK9 == awVar) {
                        objK9 = ua5.s(ux2Var25);
                    }
                    mw4 mw4Var = (mw4) objK9;
                    boolean zF9 = ux2Var25.f(function0);
                    Object objK10 = ux2Var25.K();
                    if (zF9 || objK10 == awVar) {
                        objK10 = new yv1(function0, (byte) 19);
                        ux2Var25.g0(objK10);
                    }
                    td3.b(ud5VarT, strZ, androidx.compose.foundation.b.a(fs4VarF, mw4Var, null, false, null, (Function0) objK10, 28), j, ux2Var25, 3080, 0);
                }
                break;
            case 28:
                ux2 ux2Var26 = (ux2) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (!ux2Var26.N(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ux2Var26.Q();
                } else {
                    String strZ2 = m77.z(R.string.settings_twoFactorAuthentication_scan_qr, ux2Var26);
                    boolean zF10 = ux2Var26.f(function0);
                    Object objK11 = ux2Var26.K();
                    if (zF10 || objK11 == awVar) {
                        objK11 = new yv1(function0, (byte) 20);
                        ux2Var26.g0(objK11);
                    }
                    wo1.r(0, strZ2, (Function0) objK11, ux2Var26, null);
                }
                break;
            default:
                ux2 ux2Var27 = (ux2) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (!ux2Var27.N(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ux2Var27.Q();
                } else {
                    boolean zF11 = ux2Var27.f(function0);
                    Object objK12 = ux2Var27.K();
                    if (zF11 || objK12 == awVar) {
                        objK12 = new yv1(function0, (byte) 22);
                        ux2Var27.g0(objK12);
                    }
                    au8.p((Function0) objK12, null, false, null, null, null, mo8.g, ux2Var27, 805306368, 510);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ v4(Function0 function0, int i, byte b) {
        this.m = b;
        this.n = function0;
    }
}
