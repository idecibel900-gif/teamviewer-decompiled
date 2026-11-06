package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p20 implements iw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ p20(byte b) {
        this.m = b;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        tg3 tg3Var = LayoutNode.e0;
        cs4 cs4Var = cs4.b;
        aw awVar = e01.a;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                jl5 jl5VarC = ((zn4) obj2).C(((r61) obj3).a);
                return ((fo4) obj).o0(jl5VarC.m, jl5VarC.n, fa2.m, new px((byte) 4), new v0(jl5VarC, (byte) 3));
            case 1:
                ux2 ux2Var = (ux2) obj2;
                ((Integer) obj3).getClass();
                ux2Var.W(1575598419);
                ux2Var.p(false);
                Object objK = ux2Var.K();
                if (objK == awVar) {
                    objK = h57.p(null);
                    ux2Var.g0(objK);
                }
                px4 px4Var = (px4) objK;
                do4 do4VarC = ua0.c(xz2.s, false);
                int iHashCode = Long.hashCode(ux2Var.T);
                yj5 yj5VarL = ux2Var.l();
                fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4VarC, d82.v, ux2Var);
                o67.n(yj5VarL, d82.u, ux2Var);
                o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS, d82.t, ux2Var);
                hw2 hw2Var = (hw2) px4Var.getValue();
                if (hw2Var == null) {
                    ux2Var.W(2094511935);
                } else {
                    ux2Var.W(1037396226);
                    hw2Var.invoke(ux2Var, 0);
                }
                ux2Var.p(false);
                ux2Var.p(true);
                return f88Var;
            case 2:
                ux2 ux2Var2 = (ux2) obj2;
                ((Integer) obj3).getClass();
                ux2Var2.W(-1218883371);
                ux2Var2.p(false);
                Object objK2 = ux2Var2.K();
                if (objK2 == awVar) {
                    objK2 = h57.p(null);
                    ux2Var2.g0(objK2);
                }
                px4 px4Var2 = (px4) objK2;
                do4 do4VarC2 = ua0.c(xz2.s, false);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, cs4Var);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC2, d82.v, ux2Var2);
                o67.n(yj5VarL2, d82.u, ux2Var2);
                o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS2, d82.t, ux2Var2);
                hw2 hw2Var2 = (hw2) px4Var2.getValue();
                if (hw2Var2 == null) {
                    ux2Var2.W(-657207800);
                } else {
                    ux2Var2.W(671536409);
                    hw2Var2.invoke(ux2Var2, 0);
                }
                ux2Var2.p(false);
                ux2Var2.p(true);
                return f88Var;
            case 3:
                ux2 ux2Var3 = (ux2) obj2;
                ((Integer) obj3).getClass();
                ((l33) obj).getClass();
                td3.a(b77.p(R.drawable.ic_group_legacy, ux2Var3), m77.z(R.string.device_tab_group_item_content_description, ux2Var3), null, rv0.h, ux2Var3, 3072, 4);
                return f88Var;
            case 4:
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var4.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qs7.b(m77.z(R.string.sign_in, ux2Var4), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, ux2Var4, 0, 24960, 241662);
                } else {
                    ux2Var4.Q();
                }
                return f88Var;
            case 5:
                ux2 ux2Var5 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var5.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    qs7.b(m77.z(R.string.create_account, ux2Var5), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, ux2Var5, 0, 24960, 241662);
                } else {
                    ux2Var5.Q();
                }
                return f88Var;
            case 6:
                ux2 ux2Var6 = (ux2) obj2;
                ((Integer) obj3).getClass();
                ((l33) obj).getClass();
                td3.a(b77.p(R.drawable.ic_group_legacy, ux2Var6), m77.z(R.string.device_tab_group_item_content_description, ux2Var6), null, rv0.h, ux2Var6, 3072, 4);
                return f88Var;
            case 7:
                ux2 ux2Var7 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var7.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    qs7.b(m77.z(R.string.cancel, ux2Var7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var7, 0, 0, 262142);
                } else {
                    ux2Var7.Q();
                }
                return f88Var;
            case 8:
                ux2 ux2Var8 = (ux2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var8.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    qs7.b(m77.z(R.string.group_dialog_cancel, ux2Var8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var8, 0, 0, 262142);
                } else {
                    ux2Var8.Q();
                }
                return f88Var;
            case ep1.b /* 9 */:
                ux2 ux2Var9 = (ux2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var9.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    qs7.b(m77.z(R.string.scan_qr_code, ux2Var9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var9, 0, 0, 262142);
                } else {
                    ux2Var9.Q();
                }
                return f88Var;
            case ep1.c /* 10 */:
                ux2 ux2Var10 = (ux2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var10.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    qs7.b(m77.z(R.string.cancel, ux2Var10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var10, 0, 0, 262142);
                } else {
                    ux2Var10.Q();
                }
                return f88Var;
            case 11:
                ux2 ux2Var11 = (ux2) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var11.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    qs7.b(m77.z(R.string.cancel, ux2Var11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var11, 0, 0, 262142);
                } else {
                    ux2Var11.Q();
                }
                return f88Var;
            case ep1.d /* 12 */:
                ux2 ux2Var12 = (ux2) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (!ux2Var12.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    ux2Var12.Q();
                }
                return f88Var;
            case 13:
                ux2 ux2Var13 = (ux2) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (!ux2Var13.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    ux2Var13.Q();
                }
                return f88Var;
            case 14:
                ux2 ux2Var14 = (ux2) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (!ux2Var14.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    ux2Var14.Q();
                }
                return f88Var;
            case 15:
                ux2 ux2Var15 = (ux2) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (!ux2Var15.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    ux2Var15.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ux2 ux2Var16 = (ux2) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var16.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    qs7.b(m77.z(R.string.app_update_secondary_button_label, ux2Var16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var16.j(un4.a)).b.m, ux2Var16, 0, 0, 131070);
                } else {
                    ux2Var16.Q();
                }
                return f88Var;
            case 17:
                ux2 ux2Var17 = (ux2) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var17.N(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    qs7.b(m77.z(R.string.attractionGuid_sheet_button, ux2Var17), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var17, 0, 0, 262142);
                } else {
                    ux2Var17.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ux2 ux2Var18 = (ux2) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var18.N(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    qs7.b(m77.z(R.string.tv_trusted_device_notification_channel_permission_button_settings, ux2Var18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var18, 0, 0, 262142);
                } else {
                    ux2Var18.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ux2 ux2Var19 = (ux2) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var19.N(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    qs7.b(m77.z(R.string.tv_cancel, ux2Var19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var19, 0, 0, 262142);
                } else {
                    ux2Var19.Q();
                }
                return f88Var;
            case 20:
                ux2 ux2Var20 = (ux2) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var20.N(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    qs7.b(m77.z(R.string.settings_biometric_bottomSheet_settings, ux2Var20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var20, 0, 0, 262142);
                } else {
                    ux2Var20.Q();
                }
                return f88Var;
            case 21:
                ux2 ux2Var21 = (ux2) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var21.N(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    qs7.b(m77.z(R.string.settings_biometric_bottomSheet_cancel, ux2Var21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var21, 0, 0, 262142);
                } else {
                    ux2Var21.Q();
                }
                return f88Var;
            case 22:
                ux2 ux2Var22 = (ux2) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var22.N(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    qs7.b(m77.z(R.string.device_tab_device_details_bookmarked_sheet_confirm, ux2Var22), null, 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var22.j(un4.a)).b.m, ux2Var22, 0, 0, 130046);
                } else {
                    ux2Var22.Q();
                }
                return f88Var;
            case 23:
                ux2 ux2Var23 = (ux2) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var23.N(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    qs7.b(m77.z(R.string.dialog_option_settings, ux2Var23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var23, 0, 0, 262142);
                } else {
                    ux2Var23.Q();
                }
                return f88Var;
            case 24:
                ux2 ux2Var24 = (ux2) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var24.N(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    qs7.b(m77.z(R.string.dialog_option_cancel, ux2Var24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var24, 0, 0, 262142);
                } else {
                    ux2Var24.Q();
                }
                return f88Var;
            case 25:
                ux2 ux2Var25 = (ux2) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var25.N(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    qs7.b(m77.z(R.string.continue_text, ux2Var25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var25, 0, 0, 262142);
                } else {
                    ux2Var25.Q();
                }
                return f88Var;
            case 26:
                ux2 ux2Var26 = (ux2) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var26.N(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    qs7.b(m77.z(R.string.tv_cancel, ux2Var26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var26, 0, 0, 262142);
                } else {
                    ux2Var26.Q();
                }
                return f88Var;
            case 27:
                ux2 ux2Var27 = (ux2) obj2;
                ((Integer) obj3).getClass();
                ((l33) obj).getClass();
                td3.a(b77.p(R.drawable.ic_group_managed, ux2Var27), m77.z(R.string.device_tab_group_item_content_description, ux2Var27), null, rv0.h, ux2Var27, 3072, 4);
                return f88Var;
            case 28:
                ux2 ux2Var28 = (ux2) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var28.N(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    qs7.b(m77.z(R.string.done, ux2Var28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var28, 0, 0, 262142);
                } else {
                    ux2Var28.Q();
                }
                return f88Var;
            default:
                ux2 ux2Var29 = (ux2) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var29.N(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    qs7.b(m77.z(R.string.cancel, ux2Var29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var29, 0, 0, 262142);
                } else {
                    ux2Var29.Q();
                }
                return f88Var;
        }
    }
}
