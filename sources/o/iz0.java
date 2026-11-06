package o;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iz0 implements hw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ iz0(byte b) {
        this.m = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r1v111, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v138 */
    /* JADX WARN: Type inference failed for: r1v139 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r8v17 */
    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        tw0 tw0Var;
        byte b = this.m;
        aw awVar = e01.a;
        cs4 cs4Var = cs4.b;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strZ = m77.z(R.string.session_unavailable_dialog_description, ux2Var);
                    hk6 hk6VarW = im3.W(ux2Var);
                    Object objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = ck3.w(ux2Var);
                        ux2Var.g0(objK);
                    }
                    qs7.b(strZ, o77.t(cs4Var, hk6VarW, (me1) objK), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 0, 0, 262140);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lq1.e(null, null, null, ux2Var2, 0);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ep1.h(null, null, null, ux2Var3, 0);
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
            case 3:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    io1.l(null, null, null, ux2Var4, 0);
                } else {
                    ux2Var4.Q();
                }
                return f88Var;
            case 4:
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    us1.d(0, null, ux2Var5, null);
                } else {
                    ux2Var5.Q();
                }
                return f88Var;
            case 5:
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qs7.b(m77.z(R.string.shortcut_unavailable_dialog_title, ux2Var6), null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var6, 0, 24960, 241662);
                } else {
                    ux2Var6.Q();
                }
                return f88Var;
            case 6:
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String strZ2 = m77.z(R.string.shortcut_unavailable_dialog_message, ux2Var7);
                    hk6 hk6VarW2 = im3.W(ux2Var7);
                    Object objK2 = ux2Var7.K();
                    if (objK2 == awVar) {
                        objK2 = ck3.w(ux2Var7);
                        ux2Var7.g0(objK2);
                    }
                    qs7.b(strZ2, o77.t(cs4Var, hk6VarW2, (me1) objK2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var7, 0, 0, 262140);
                } else {
                    ux2Var7.Q();
                }
                return f88Var;
            case 7:
                ux2 ux2Var8 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (ux2Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    qs7.b(m77.z(R.string.web_login_incomplete_dialog_title, ux2Var8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var8, 0, 0, 262142);
                } else {
                    ux2Var8.Q();
                }
                return f88Var;
            case 8:
                ux2 ux2Var9 = (ux2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (ux2Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    qs7.b(m77.z(R.string.web_login_incomplete_dialog_description, ux2Var9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var9, 0, 0, 262142);
                } else {
                    ux2Var9.Q();
                }
                return f88Var;
            case ep1.b /* 9 */:
                ux2 ux2Var10 = (ux2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (ux2Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    Object objK3 = ux2Var10.K();
                    if (objK3 == awVar) {
                        objK3 = new ez0((byte) 12);
                        ux2Var10.g0(objK3);
                    }
                    Function0 function0 = (Function0) objK3;
                    Object objK4 = ux2Var10.K();
                    if (objK4 == awVar) {
                        objK4 = new ez0((byte) 13);
                        ux2Var10.g0(objK4);
                    }
                    bt1.n(54, function0, (Function0) objK4, ux2Var10, null);
                } else {
                    ux2Var10.Q();
                }
                return f88Var;
            case ep1.c /* 10 */:
                ux2 ux2Var11 = (ux2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!ux2Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ux2Var11.Q();
                }
                return f88Var;
            case 11:
                ux2 ux2Var12 = (ux2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (ux2Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    qs7.b(m77.z(R.string.settings_twoFactorAuthentication_dialog_title, ux2Var12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var12, 0, 0, 262142);
                } else {
                    ux2Var12.Q();
                }
                return f88Var;
            case ep1.d /* 12 */:
                ux2 ux2Var13 = (ux2) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (ux2Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    qs7.b(m77.z(R.string.settings_twoFactorAuthentication_dialog_description, ux2Var13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var13, 0, 0, 262142);
                } else {
                    ux2Var13.Q();
                }
                return f88Var;
            case 13:
                ux2 ux2Var14 = (ux2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (ux2Var14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    td3.b(re3.a((f62) b62.l.getValue(), ux2Var14), null, androidx.compose.foundation.layout.b.l(cs4Var, 14.0f), ((rn4) ux2Var14.j(un4.a)).a.s, ux2Var14, 440, 0);
                } else {
                    ux2Var14.Q();
                }
                return f88Var;
            case 14:
                ux2 ux2Var15 = (ux2) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (ux2Var15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    lv1.k(null, 0.0f, 0L, ux2Var15, 0, 7);
                } else {
                    ux2Var15.Q();
                }
                return f88Var;
            case 15:
                ux2 ux2Var16 = (ux2) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!ux2Var16.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ux2Var16.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ux2 ux2Var17 = (ux2) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (ux2Var17.N(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    qs1.l(lv1.T(R.drawable.tv_icon, ux2Var17, 0), m77.z(R.string.remotecontrol_logo_content_description, ux2Var17), androidx.compose.foundation.layout.b.l(cs4Var, 20.0f), null, null, 0.0f, null, ux2Var17, 392, 120);
                } else {
                    ux2Var17.Q();
                }
                return f88Var;
            case 17:
                ux2 ux2Var18 = (ux2) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (ux2Var18.N(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    y57.h(null, ux2Var18, 0);
                } else {
                    ux2Var18.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ux2 ux2Var19 = (ux2) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!ux2Var19.N(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ux2Var19.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((LayoutNode) ((yz0) obj)).C0((fs4) obj2);
                return f88Var;
            case 20:
                x01 x01Var = (x01) obj2;
                LayoutNode layoutNode = (LayoutNode) ((yz0) obj);
                layoutNode.O = x01Var;
                nf nfVar = layoutNode.S;
                h72 h72Var = b11.h;
                yj5 yj5Var = (yj5) x01Var;
                yj5Var.getClass();
                layoutNode.y0((in1) di1.z(yj5Var, h72Var));
                yj5 yj5Var2 = (yj5) x01Var;
                j04 j04Var = (j04) di1.z(yj5Var2, b11.n);
                if (layoutNode.M != j04Var) {
                    layoutNode.M = j04Var;
                    layoutNode.S();
                    LayoutNode layoutNodeF = layoutNode.F();
                    if (layoutNodeF != null) {
                        layoutNodeF.P();
                    } else {
                        Owner owner = layoutNode.A;
                        if (owner != null) {
                            ((AndroidComposeView) owner).invalidate();
                        }
                    }
                    layoutNode.Q();
                    for (es4 es4Var = (es4) nfVar.g; es4Var != null; es4Var = es4Var.r) {
                        es4Var.Q();
                    }
                }
                layoutNode.D0((ee8) di1.z(yj5Var2, b11.t));
                es4 es4Var2 = (es4) nfVar.g;
                if ((es4Var2.p & 32768) != 0) {
                    while (es4Var2 != null) {
                        if ((es4Var2.f737o & 32768) != 0) {
                            ?? L0 = es4Var2;
                            ?? xx4Var = 0;
                            while (L0 != 0) {
                                if (L0 instanceof v01) {
                                    es4 es4VarF0 = ((v01) L0).f0();
                                    if (es4VarF0.z) {
                                        k45.c(es4VarF0);
                                    } else {
                                        es4VarF0.v = true;
                                    }
                                } else if ((L0.f737o & 32768) != 0 && (L0 instanceof vm1)) {
                                    es4 es4Var3 = ((vm1) L0).B;
                                    int i = 0;
                                    while (es4Var3 != null) {
                                        if ((es4Var3.f737o & 32768) != 0) {
                                            i++;
                                            if (i == 1) {
                                                L0 = L0;
                                                xx4Var = xx4Var;
                                                xx4Var = xx4Var;
                                                L0 = es4Var3;
                                            } else {
                                                if (xx4Var == 0) {
                                                    xx4Var = new xx4(new es4[16]);
                                                }
                                                if (L0 != 0) {
                                                    xx4Var.b(L0);
                                                    L0 = 0;
                                                }
                                                xx4Var.b(es4Var3);
                                            }
                                        } else {
                                            L0 = L0;
                                            xx4Var = xx4Var;
                                        }
                                        es4Var3 = es4Var3.r;
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    }
                                    if (i == 1) {
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    } else {
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    }
                                }
                                L0 = vn4.l0(xx4Var);
                            }
                        }
                        if ((es4Var2.p & 32768) != 0) {
                            es4Var2 = es4Var2.r;
                        }
                    }
                }
                return f88Var;
            case 21:
                ((LayoutNode) ((yz0) obj)).B0((do4) obj2);
                return f88Var;
            case 22:
                ((Integer) obj2).getClass();
                ((LayoutNode) ((yz0) obj)).getClass();
                return f88Var;
            case 23:
                ((Integer) obj).intValue();
                h71 h71Var = (h71) obj2;
                h71Var.getClass();
                return Integer.valueOf(h71Var.m);
            case 24:
                de1 de1Var = (de1) obj;
                be1 be1Var = (be1) obj2;
                de1Var.getClass();
                be1Var.getClass();
                de1 de1VarK0 = de1Var.k0(be1Var.getKey());
                ba2 ba2Var = ba2.m;
                if (de1VarK0 == ba2Var) {
                    return be1Var;
                }
                d82 d82Var = d82.y;
                fe1 fe1Var = (fe1) de1VarK0.l0(d82Var);
                if (fe1Var == null) {
                    tw0Var = new tw0(be1Var, de1VarK0);
                } else {
                    de1 de1VarK1 = de1VarK0.k0(d82Var);
                    if (de1VarK1 == ba2Var) {
                        return new tw0(fe1Var, be1Var);
                    }
                    tw0Var = new tw0(fe1Var, new tw0(be1Var, de1VarK1));
                }
                return tw0Var;
            case 25:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 26:
                return ((de1) obj).H0((be1) obj2);
            case 27:
                return ((de1) obj).H0((be1) obj2);
            case 28:
                return f88Var;
            default:
                ux2 ux2Var20 = (ux2) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (ux2Var20.N(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    Integer numValueOf = Integer.valueOf(R.string.feedback_textfield_label_optional);
                    ux2Var20.W(1015726300);
                    qs7.b(m77.z(numValueOf.intValue(), ux2Var20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var20, 0, 0, 262142);
                    ux2Var20.p(false);
                } else {
                    ux2Var20.Q();
                }
                return f88Var;
        }
    }
}
