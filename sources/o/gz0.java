package o;

import android.content.SharedPreferences;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gz0 implements iw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ gz0(byte b) {
        this.m = b;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        tg3 tg3Var = LayoutNode.e0;
        cs4 cs4Var = cs4.b;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qs7.b(m77.z(R.string.tv_cancel, ux2Var), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 0, 0, 262142);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            case 1:
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    qs7.b(m77.z(R.string.device_tab_device_details_password_warning_sheet_confirm, ux2Var2), null, 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.m, ux2Var2, 0, 0, 130046);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            case 2:
                aj5 aj5Var = (aj5) obj;
                ((Integer) obj3).getClass();
                aj5Var.getClass();
                et1.j(aj5Var.a, aj5Var.b, aj5Var.e, aj5Var.f, null, aj5Var.c, aj5Var.d, (ux2) obj2, 0);
                return f88Var;
            case 3:
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    qs7.b(m77.z(R.string.scan_qr_verification_pin_cancel, ux2Var3), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, ux2Var3, 0, 24960, 241662);
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
            case 4:
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    qs7.b(m77.z(R.string.got_it, ux2Var4), null, 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var4.j(un4.a)).b.m, ux2Var4, 0, 0, 130046);
                } else {
                    ux2Var4.Q();
                }
                return f88Var;
            case 5:
                o37 o37Var = (o37) obj;
                boolean z = false;
                ux2 ux2Var5 = (ux2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                o37Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ux2Var5.f(o37Var) ? 4 : 2;
                }
                if ((iIntValue5 & 19) != 18) {
                    z = true;
                }
                if (ux2Var5.N(iIntValue5 & 1, z)) {
                    n67.g(o37Var, ka0.F(cs4.b, 16.0f, 0.0f, 16.0f, 24.0f, 2), "TVTA-tvSnackbar", m77.z(R.string.dismiss_content_description, ux2Var5), ux2Var5, (iIntValue5 & 14) | 432);
                } else {
                    ux2Var5.Q();
                }
                return f88Var;
            case 6:
                o37 o37Var2 = (o37) obj;
                ux2 ux2Var6 = (ux2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                o37Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ux2Var6.f(o37Var2) ? 4 : 2;
                }
                if (ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    n67.g(o37Var2, ka0.F(cs4.b, 8.0f, 0.0f, 8.0f, 8.0f, 2), "TVTA-tvSnackbar", m77.z(R.string.dismiss, ux2Var6), ux2Var6, (iIntValue6 & 14) | 432);
                } else {
                    ux2Var6.Q();
                }
                return f88Var;
            case 7:
                ux2 ux2Var7 = (ux2) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    qs7.b(m77.z(R.string.remove_dialog_confirm, ux2Var7), null, ((rn4) ux2Var7.j(un4.a)).a.w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var7, 0, 0, 262138);
                } else {
                    ux2Var7.Q();
                }
                return f88Var;
            case 8:
                ux2 ux2Var8 = (ux2) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    qs7.b(m77.z(R.string.remove_dialog_cancel, ux2Var8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var8, 0, 0, 262142);
                } else {
                    ux2Var8.Q();
                }
                return f88Var;
            case ep1.b /* 9 */:
                ux2 ux2Var9 = (ux2) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    qs7.b(m77.z(R.string.group_rename_dialog_confirm, ux2Var9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var9, 0, 0, 262142);
                } else {
                    ux2Var9.Q();
                }
                return f88Var;
            case ep1.c /* 10 */:
                ux2 ux2Var10 = (ux2) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    qs7.b(m77.z(R.string.group_dialog_cancel, ux2Var10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var10, 0, 0, 262142);
                } else {
                    ux2Var10.Q();
                }
                return f88Var;
            case 11:
                ux2 ux2Var11 = (ux2) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((w14) obj).getClass();
                if (ux2Var11.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    vs1.h(androidx.compose.ui.platform.a.a(cs4Var, "TVTA-searchScreen-description"), ux2Var11, 6);
                } else {
                    ux2Var11.Q();
                }
                return f88Var;
            case ep1.d /* 12 */:
                ux2 ux2Var12 = (ux2) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((w14) obj).getClass();
                if (ux2Var12.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-searchScreen-loading");
                    kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var12, 0);
                    int iHashCode = Long.hashCode(ux2Var12.T);
                    yj5 yj5VarL = ux2Var12.l();
                    fs4 fs4VarS = uf0.s(ux2Var12, fs4VarA);
                    yz0.c.getClass();
                    ux2Var12.a0();
                    if (ux2Var12.S) {
                        ux2Var12.k(tg3Var);
                    } else {
                        ux2Var12.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var12);
                    o67.n(yj5VarL, d82.u, ux2Var12);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var12);
                    o67.l(ux2Var12);
                    o67.n(fs4VarS, d82.t, ux2Var12);
                    b77.a(ux2Var12, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
                    au8.n(null, ux2Var12, 0);
                    ux2Var12.p(true);
                } else {
                    ux2Var12.Q();
                }
                return f88Var;
            case 13:
                ux2 ux2Var13 = (ux2) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var13.N(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    qs7.b(m77.z(R.string.option_file_transfer, ux2Var13), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, ux2Var13, 0, 24960, 241662);
                } else {
                    ux2Var13.Q();
                }
                return f88Var;
            case 14:
                ux2 ux2Var14 = (ux2) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var14.N(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    qs7.b(m77.z(R.string.option_connect, ux2Var14), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, ux2Var14, 0, 24960, 241662);
                } else {
                    ux2Var14.Q();
                }
                return f88Var;
            case 15:
                ux2 ux2Var15 = (ux2) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var15.N(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    qs7.b(m77.z(R.string.got_it, ux2Var15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var15, 0, 0, 262142);
                } else {
                    ux2Var15.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ux2 ux2Var16 = (ux2) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var16.N(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    qs7.b(m77.z(R.string.got_it, ux2Var16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var16, 0, 0, 262142);
                } else {
                    ux2Var16.Q();
                }
                return f88Var;
            case 17:
                ux2 ux2Var17 = (ux2) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var17.N(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    qs7.b(m77.z(R.string.got_it, ux2Var17), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var17, 0, 0, 262142);
                } else {
                    ux2Var17.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ux2 ux2Var18 = (ux2) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var18.N(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    qs7.b(m77.z(R.string.web_login_incomplete_dialog_sign_in, ux2Var18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var18, 0, 0, 262142);
                } else {
                    ux2Var18.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ux2 ux2Var19 = (ux2) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var19.N(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    qs7.b(m77.z(R.string.cancel, ux2Var19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var19, 0, 0, 262142);
                } else {
                    ux2Var19.Q();
                }
                return f88Var;
            case 20:
                ux2 ux2Var20 = (ux2) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var20.N(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var20, 48);
                    int iHashCode2 = Long.hashCode(ux2Var20.T);
                    yj5 yj5VarL2 = ux2Var20.l();
                    cs4 cs4Var2 = cs4.b;
                    fs4 fs4VarS2 = uf0.s(ux2Var20, cs4Var2);
                    yz0.c.getClass();
                    ux2Var20.a0();
                    if (ux2Var20.S) {
                        ux2Var20.k(tg3Var);
                    } else {
                        ux2Var20.j0();
                    }
                    o67.n(dg6VarA, d82.v, ux2Var20);
                    o67.n(yj5VarL2, d82.u, ux2Var20);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var20);
                    o67.l(ux2Var20);
                    o67.n(fs4VarS2, d82.t, ux2Var20);
                    td3.b(lv1.T(R.drawable.ic_arrow_right, ux2Var20, 0), m77.z(R.string.sessions, ux2Var20), androidx.compose.foundation.layout.b.m(ka0.F(cs4Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), 20.0f, 20.0f), 0L, ux2Var20, 8, 8);
                    qs7.b(m77.z(R.string.session_start, ux2Var20), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, ux2Var20, 0, 24960, 241662);
                    ux2Var20.p(true);
                } else {
                    ux2Var20.Q();
                }
                return f88Var;
            case 21:
                ux2 ux2Var21 = (ux2) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var21.N(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    qs7.b(m77.z(R.string.session_close, ux2Var21), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, ux2Var21, 0, 24960, 241662);
                } else {
                    ux2Var21.Q();
                }
                return f88Var;
            case 22:
                ux2 ux2Var22 = (ux2) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var22.N(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    td3.b(lv1.T(R.drawable.ic_qr_code, ux2Var22, 0), null, null, 0L, ux2Var22, 56, 12);
                    b77.a(ux2Var22, androidx.compose.foundation.layout.b.p(cs4Var, 8.0f));
                    qs7.b(m77.z(R.string.settings_twoFactorAuthentication_scan_qr, ux2Var22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var22.j(un4.a)).b.m, ux2Var22, 0, 0, 131070);
                } else {
                    ux2Var22.Q();
                }
                return f88Var;
            case 23:
                ux2 ux2Var23 = (ux2) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var23.N(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    qs7.b(m77.z(R.string.dialog_option_settings, ux2Var23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var23, 0, 0, 262142);
                } else {
                    ux2Var23.Q();
                }
                return f88Var;
            case 24:
                ux2 ux2Var24 = (ux2) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var24.N(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    qs7.b(m77.z(R.string.dialog_option_cancel, ux2Var24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var24, 0, 0, 262142);
                } else {
                    ux2Var24.Q();
                }
                return f88Var;
            case 25:
                ux2 ux2Var25 = (ux2) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var25.N(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    qs7.b(m77.z(R.string.tv_close_session, ux2Var25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var25, 0, 0, 262142);
                } else {
                    ux2Var25.Q();
                }
                return f88Var;
            case 26:
                ux2 ux2Var26 = (ux2) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var26.N(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    qs7.b(m77.z(R.string.waiting_room_leave_session, ux2Var26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var26, 0, 0, 262142);
                } else {
                    ux2Var26.Q();
                }
                return f88Var;
            case 27:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                String str = (String) obj2;
                String str2 = (String) obj3;
                sharedPreferences.getClass();
                str.getClass();
                str2.getClass();
                String string = sharedPreferences.getString(str, str2);
                return string == null ? str2 : string;
            default:
                ux2 ux2Var27 = (ux2) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var27.N(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    ux2Var27.W(1304228264);
                    ux2Var27.p(false);
                } else {
                    ux2Var27.Q();
                }
                return f88Var;
        }
    }
}
