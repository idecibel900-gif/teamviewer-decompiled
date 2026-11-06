package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.CopyrightActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class az0 implements iw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ az0(byte b) {
        this.m = b;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        cs4 cs4Var = cs4.b;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var.Q();
                } else {
                    qs7.b(m77.z(R.string.got_it, ux2Var), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 0, 0, 262142);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    qs7.b(m77.z(R.string.tv_delete_button_text, ux2Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var2, 0, 0, 262142);
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ux2Var3.Q();
                } else {
                    qs7.b(m77.z(R.string.tv_cancel, ux2Var3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262142);
                }
                break;
            case 3:
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ux2Var4.Q();
                } else {
                    qs7.b(m77.z(R.string.got_it, ux2Var4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var4, 0, 0, 262142);
                }
                break;
            case 4:
                zb1 zb1Var = (zb1) obj;
                ux2 ux2Var5 = (ux2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ux2Var5.f(zb1Var) ? 4 : 2;
                }
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    ux2Var5.Q();
                } else {
                    ua0.a(au8.s(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(ka0.D(cs4Var, 0.0f, bc1.g, 1), 1.0f), bc1.f), zb1Var.c, kh.V), ux2Var5, 0);
                }
                break;
            case 5:
                nd5 nd5Var = (nd5) obj;
                ux2 ux2Var6 = (ux2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                nd5Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ux2Var6.f(nd5Var) ? 4 : 2;
                }
                if (!ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    ux2Var6.Q();
                } else {
                    int[] iArr = CopyrightActivity.H;
                    ga0.d(Arrays.copyOf(iArr, iArr.length), androidx.compose.foundation.layout.b.c, nd5Var, ux2Var6, ((iIntValue6 << 6) & 896) | 48, 0);
                }
                break;
            case 6:
                ux2 ux2Var7 = (ux2) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ux2Var7.Q();
                } else {
                    qs7.b(m77.z(R.string.crash_dialog_title, ux2Var7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var7, 0, 0, 262142);
                }
                break;
            case 7:
                ux2 ux2Var8 = (ux2) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    ux2Var8.Q();
                } else {
                    qs7.b(m77.z(R.string.dialog_option_cancel, ux2Var8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var8, 0, 0, 262142);
                }
                break;
            case 8:
                ux2 ux2Var9 = (ux2) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    ux2Var9.Q();
                } else {
                    qs7.b(m77.z(R.string.got_it, ux2Var9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var9, 0, 0, 262142);
                }
                break;
            case ep1.b /* 9 */:
                ux2 ux2Var10 = (ux2) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    ux2Var10.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_device_details_delete_dialog_confirm, ux2Var10), null, ((rn4) ux2Var10.j(un4.a)).a.w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var10, 0, 0, 262138);
                }
                break;
            case ep1.c /* 10 */:
                ux2 ux2Var11 = (ux2) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var11.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    ux2Var11.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_device_details_delete_dialog_cancel, ux2Var11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var11, 0, 0, 262142);
                }
                break;
            case 11:
                ux2 ux2Var12 = (ux2) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var12.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    ux2Var12.Q();
                } else {
                    qs7.b(m77.z(R.string.group_dialog_cancel, ux2Var12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var12, 0, 0, 262142);
                }
                break;
            case ep1.d /* 12 */:
                ux2 ux2Var13 = (ux2) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var13.N(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    ux2Var13.Q();
                } else {
                    qs7.b(m77.z(R.string.got_it, ux2Var13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var13, 0, 0, 262142);
                }
                break;
            case 13:
                ux2 ux2Var14 = (ux2) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var14.N(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    ux2Var14.Q();
                } else {
                    qs7.b(m77.z(R.string.contact_discard_changes_dialog_confirm, ux2Var14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var14, 0, 0, 262142);
                }
                break;
            case 14:
                ux2 ux2Var15 = (ux2) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var15.N(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    ux2Var15.Q();
                } else {
                    qs7.b(m77.z(R.string.group_dialog_cancel, ux2Var15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var15, 0, 0, 262142);
                }
                break;
            case 15:
                ux2 ux2Var16 = (ux2) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var16.N(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    ux2Var16.Q();
                } else {
                    qs7.b(m77.z(R.string.feedback_alert_confirm, ux2Var16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var16, 0, 0, 262142);
                }
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ux2 ux2Var17 = (ux2) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var17.N(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    ux2Var17.Q();
                } else {
                    qs7.b(m77.z(R.string.tv_retry, ux2Var17), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var17, 0, 0, 262142);
                }
                break;
            case 17:
                ux2 ux2Var18 = (ux2) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((w14) obj).getClass();
                if (!ux2Var18.N(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    ux2Var18.Q();
                } else {
                    fs4 fs4VarB = ka0.B(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f);
                    do4 do4VarC = ua0.c(xz2.s, false);
                    int iHashCode = Long.hashCode(ux2Var18.T);
                    yj5 yj5VarL = ux2Var18.l();
                    fs4 fs4VarS = uf0.s(ux2Var18, fs4VarB);
                    yz0.c.getClass();
                    ux2Var18.a0();
                    if (ux2Var18.S) {
                        ux2Var18.k(LayoutNode.e0);
                    } else {
                        ux2Var18.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var18);
                    o67.n(yj5VarL, d82.u, ux2Var18);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var18);
                    o67.l(ux2Var18);
                    o67.n(fs4VarS, d82.t, ux2Var18);
                    st5.a(null, 0L, 0.0f, 0L, 0, 0.0f, ux2Var18, 0, 63);
                    ux2Var18.p(true);
                }
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ux2 ux2Var19 = (ux2) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var19.N(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    ux2Var19.Q();
                } else {
                    qs7.b(m77.z(R.string.got_it, ux2Var19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var19, 0, 0, 262142);
                }
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ux2 ux2Var20 = (ux2) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var20.N(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    ux2Var20.Q();
                } else {
                    qs7.b(m77.z(R.string.got_it, ux2Var20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var20, 0, 0, 262142);
                }
                break;
            case 20:
                ux2 ux2Var21 = (ux2) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var21.N(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    ux2Var21.Q();
                } else {
                    qs7.b(m77.z(R.string.continue_text, ux2Var21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var21, 0, 0, 262142);
                }
                break;
            case 21:
                ux2 ux2Var22 = (ux2) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var22.N(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    ux2Var22.Q();
                } else {
                    qs7.b(m77.z(R.string.tv_cancel, ux2Var22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var22, 0, 0, 262142);
                }
                break;
            case 22:
                ux2 ux2Var23 = (ux2) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var23.N(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    ux2Var23.Q();
                } else {
                    qs7.b(m77.z(R.string.legal_agreement_link_EULA, ux2Var23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var23, 0, 0, 262142);
                }
                break;
            case 23:
                ux2 ux2Var24 = (ux2) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var24.N(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    ux2Var24.Q();
                } else {
                    qs7.b(m77.z(R.string.legal_agreement_link_DPA, ux2Var24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var24, 0, 0, 262142);
                }
                break;
            case 24:
                ux2 ux2Var25 = (ux2) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var25.N(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    ux2Var25.Q();
                } else {
                    qs7.b(m77.z(R.string.legal_agreement_privacy_policy_link_text, ux2Var25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var25, 0, 0, 262142);
                }
                break;
            case 25:
                ux2 ux2Var26 = (ux2) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var26.N(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    ux2Var26.Q();
                } else {
                    qs7.b(m77.z(R.string.logfile_delete_dialog_confirm, ux2Var26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var26, 0, 0, 262142);
                }
                break;
            case 26:
                ux2 ux2Var27 = (ux2) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var27.N(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    ux2Var27.Q();
                } else {
                    qs7.b(m77.z(R.string.logfile_delete_dialog_cancel, ux2Var27), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var27, 0, 0, 262142);
                }
                break;
            case 27:
                ux2 ux2Var28 = (ux2) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var28.N(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    ux2Var28.Q();
                } else {
                    qs7.b(m77.z(R.string.tv_ok, ux2Var28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var28, 0, 0, 262142);
                }
                break;
            case 28:
                ux2 ux2Var29 = (ux2) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((w14) obj).getClass();
                if (!ux2Var29.N(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    ux2Var29.Q();
                } else {
                    String strZ = m77.z(R.string.device_tab_device_details_more_options_sheet_title, ux2Var29);
                    ot7 ot7Var = ((rn4) ux2Var29.j(un4.a)).b.g;
                    cs4 cs4Var2 = cs4.b;
                    qs7.b(strZ, androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f), 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ot7Var, ux2Var29, 48, 0, 130044);
                    lv1.k(ka0.F(cs4Var2, 0.0f, 16.0f, 0.0f, 8.0f, 5), 0.0f, 0L, ux2Var29, 6, 6);
                }
                break;
            default:
                ux2 ux2Var30 = (ux2) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var30.N(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    ux2Var30.Q();
                } else {
                    qs7.b(m77.z(R.string.tv_trusted_device_notification_channel_permission_button_settings, ux2Var30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var30, 0, 0, 262142);
                }
                break;
        }
        return f88Var;
    }
}
