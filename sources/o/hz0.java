package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionRecipientStatus;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionType;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.time.OffsetDateTime;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hz0 implements hw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ hz0(byte b) {
        this.m = b;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
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
                    td3.b(lv1.T(R.drawable.ic_filetransfer, ux2Var, 0), m77.z(R.string.file_transfer_content_description, ux2Var), null, ((rn4) ux2Var.j(un4.a)).a.s, ux2Var, 8, 4);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    qs7.b(m77.z(R.string.group_rename_title, ux2Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var2, 0, 0, 262142);
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
                }
                break;
            case 6:
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ux2Var7.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_clear, ux2Var7, 0), m77.z(R.string.clear, ux2Var7), null, 0L, ux2Var7, 8, 12);
                }
                break;
            case 7:
                ux2 ux2Var8 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!ux2Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ux2Var8.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_search, ux2Var8, 0), m77.z(R.string.search, ux2Var8), null, 0L, ux2Var8, 8, 12);
                }
                break;
            case 8:
                ux2 ux2Var9 = (ux2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!ux2Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ux2Var9.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_chevron_down, ux2Var9, 0), null, null, 0L, ux2Var9, 56, 12);
                }
                break;
            case ep1.b /* 9 */:
                ux2 ux2Var10 = (ux2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!ux2Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ux2Var10.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_drop_down_menu, ux2Var10, 0), m77.z(R.string.options_menu_content_description, ux2Var10), androidx.compose.ui.platform.a.a(ka0.B(cs4Var, 8.0f), "TVTA-devicesScreen-contactList-dropDownMenu"), ((rn4) ux2Var10.j(un4.a)).a.s, ux2Var10, 392, 0);
                }
                break;
            case ep1.c /* 10 */:
                ux2 ux2Var11 = (ux2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!ux2Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ux2Var11.Q();
                } else {
                    fs4 fs4VarB = ka0.B(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f);
                    kw0 kw0VarA = iw0.a(new ew(8.0f, new hk0((byte) 2)), xz2.A, ux2Var11, 6);
                    int iHashCode = Long.hashCode(ux2Var11.T);
                    yj5 yj5VarL = ux2Var11.l();
                    fs4 fs4VarS = uf0.s(ux2Var11, fs4VarB);
                    yz0.c.getClass();
                    ux2Var11.a0();
                    if (ux2Var11.S) {
                        ux2Var11.k(LayoutNode.e0);
                    } else {
                        ux2Var11.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var11);
                    o67.n(yj5VarL, d82.u, ux2Var11);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var11);
                    o67.l(ux2Var11);
                    o67.n(fs4VarS, d82.t, ux2Var11);
                    wo1.s(wo1.S("Assigned to me", 0, null, null, null, 118), false, new nr6(), null, false, ux2Var11, 48, 24);
                    wo1.s(wo1.S("Assigned to contact", 456, SupportSessionRecipientStatus.NotReady, null, null, 106), false, new nr6(), null, false, ux2Var11, 48, 24);
                    wo1.s(wo1.S("Unassigned Assist AR", 0, null, null, SupportSessionType.AssistAR, 58), false, new nr6(), null, false, ux2Var11, 48, 24);
                    wo1.s(wo1.S("Ongoing session", 0, null, OffsetDateTime.parse("2024-01-01T00:05:00Z"), null, 86), false, new nr6(), null, false, ux2Var11, 48, 24);
                    ux2Var11.p(true);
                }
                break;
            case 11:
                ux2 ux2Var12 = (ux2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!ux2Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ux2Var12.Q();
                } else {
                    String strZ = m77.z(R.string.service_queue_more_actions_assign_to_me, ux2Var12);
                    h72 h72Var = un4.a;
                    qs7.b(strZ, null, ((rn4) ux2Var12.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var12.j(h72Var)).b.j, ux2Var12, 0, 24960, 110586);
                }
                break;
            case ep1.d /* 12 */:
                ux2 ux2Var13 = (ux2) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!ux2Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ux2Var13.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_share, ux2Var13, 0), null, null, ((rn4) ux2Var13.j(un4.a)).a.s, ux2Var13, 56, 4);
                }
                break;
            case 13:
                ux2 ux2Var14 = (ux2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!ux2Var14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ux2Var14.Q();
                } else {
                    String strZ2 = m77.z(R.string.service_queue_more_options_remove, ux2Var14);
                    h72 h72Var2 = un4.a;
                    qs7.b(strZ2, null, ((rn4) ux2Var14.j(h72Var2)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var14.j(h72Var2)).b.j, ux2Var14, 0, 24960, 110586);
                }
                break;
            case 14:
                ux2 ux2Var15 = (ux2) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!ux2Var15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ux2Var15.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_close, ux2Var15, 0), null, null, ((rn4) ux2Var15.j(un4.a)).a.s, ux2Var15, 56, 4);
                }
                break;
            case 15:
                ux2 ux2Var16 = (ux2) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!ux2Var16.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ux2Var16.Q();
                } else {
                    String strZ3 = m77.z(R.string.service_queue_more_actions_show_details, ux2Var16);
                    h72 h72Var3 = un4.a;
                    qs7.b(strZ3, null, ((rn4) ux2Var16.j(h72Var3)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var16.j(h72Var3)).b.j, ux2Var16, 0, 24960, 110586);
                }
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ux2 ux2Var17 = (ux2) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!ux2Var17.N(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ux2Var17.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_show, ux2Var17, 0), null, null, ((rn4) ux2Var17.j(un4.a)).a.s, ux2Var17, 56, 4);
                }
                break;
            case 17:
                ux2 ux2Var18 = (ux2) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!ux2Var18.N(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ux2Var18.Q();
                } else {
                    xo1.v(false, true, true, androidx.compose.foundation.layout.b.p(cs4Var, 280.0f), null, null, null, null, null, null, ux2Var18, 3510, 1008);
                }
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ux2 ux2Var19 = (ux2) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!ux2Var19.N(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ux2Var19.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_assign, ux2Var19, 0), null, null, ((rn4) ux2Var19.j(un4.a)).a.s, ux2Var19, 56, 4);
                }
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ux2 ux2Var20 = (ux2) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!ux2Var20.N(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ux2Var20.Q();
                } else {
                    String strZ4 = m77.z(R.string.service_queue_more_actions_unassign, ux2Var20);
                    h72 h72Var4 = un4.a;
                    qs7.b(strZ4, null, ((rn4) ux2Var20.j(h72Var4)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var20.j(h72Var4)).b.j, ux2Var20, 0, 24960, 110586);
                }
                break;
            case 20:
                ux2 ux2Var21 = (ux2) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!ux2Var21.N(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ux2Var21.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_unassign, ux2Var21, 0), null, null, ((rn4) ux2Var21.j(un4.a)).a.s, ux2Var21, 56, 4);
                }
                break;
            case 21:
                ux2 ux2Var22 = (ux2) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!ux2Var22.N(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ux2Var22.Q();
                } else {
                    String strZ5 = m77.z(R.string.service_queue_more_actions_edit_session, ux2Var22);
                    h72 h72Var5 = un4.a;
                    qs7.b(strZ5, null, ((rn4) ux2Var22.j(h72Var5)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var22.j(h72Var5)).b.j, ux2Var22, 0, 24960, 110586);
                }
                break;
            case 22:
                ux2 ux2Var23 = (ux2) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (!ux2Var23.N(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ux2Var23.Q();
                } else {
                    td3.b(lv1.T(R.drawable.ic_edit, ux2Var23, 0), null, null, ((rn4) ux2Var23.j(un4.a)).a.s, ux2Var23, 56, 4);
                }
                break;
            case 23:
                ux2 ux2Var24 = (ux2) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (!ux2Var24.N(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ux2Var24.Q();
                } else {
                    String strZ6 = m77.z(R.string.service_queue_more_actions_share_session, ux2Var24);
                    h72 h72Var6 = un4.a;
                    qs7.b(strZ6, null, ((rn4) ux2Var24.j(h72Var6)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var24.j(h72Var6)).b.j, ux2Var24, 0, 24960, 110586);
                }
                break;
            case 24:
                ux2 ux2Var25 = (ux2) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!ux2Var25.N(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ux2Var25.Q();
                } else {
                    qs7.b(m77.z(R.string.session_info_edit_name_empty_error, ux2Var25), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionEditScreen-name-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var25, 48, 0, 262140);
                }
                break;
            case 25:
                ux2 ux2Var26 = (ux2) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (!ux2Var26.N(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ux2Var26.Q();
                } else {
                    qs7.b(m77.z(R.string.device_tab_add_contact_email_error, ux2Var26), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionEditScreen-email-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var26, 48, 0, 262140);
                }
                break;
            case 26:
                ux2 ux2Var27 = (ux2) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (!ux2Var27.N(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ux2Var27.Q();
                } else {
                    qs7.b(m77.z(R.string.session_unavailable_dialog_title, ux2Var27), null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var27, 0, 24960, 241662);
                }
                break;
            case 27:
                ux2 ux2Var28 = (ux2) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (!ux2Var28.N(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    ux2Var28.Q();
                } else {
                    String strZ7 = m77.z(R.string.service_queue_no_longer_in_list_dialog_description, ux2Var28);
                    hk6 hk6VarW = im3.W(ux2Var28);
                    Object objK = ux2Var28.K();
                    if (objK == awVar) {
                        objK = ck3.w(ux2Var28);
                        ux2Var28.g0(objK);
                    }
                    qs7.b(strZ7, o77.t(cs4Var, hk6VarW, (me1) objK), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var28, 0, 0, 262140);
                }
                break;
            case 28:
                ux2 ux2Var29 = (ux2) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (!ux2Var29.N(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ux2Var29.Q();
                } else {
                    Object objK2 = ux2Var29.K();
                    if (objK2 == awVar) {
                        objK2 = new ez0((byte) 11);
                        ux2Var29.g0(objK2);
                    }
                    ct1.o(6, (Function0) objK2, ux2Var29, null);
                }
                break;
            default:
                ux2 ux2Var30 = (ux2) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (!ux2Var30.N(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    ux2Var30.Q();
                } else {
                    qs7.b(m77.z(R.string.session_unavailable_dialog_title, ux2Var30), null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var30, 0, 24960, 241662);
                }
                break;
        }
        return f88Var;
    }
}
