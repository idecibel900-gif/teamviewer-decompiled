package o;

import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g9 implements hw2 {
    public final /* synthetic */ byte m;

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        cs4 cs4Var = cs4.b;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        int i = 0;
        z = false;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                l33 l33Var = (l33) obj;
                String str = (String) obj2;
                l33Var.getClass();
                str.getClass();
                String str2 = l33Var.b;
                if (str2 != null && ub7.Q(str2, str, true)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                ((Integer) obj2).getClass();
                sh.a(yo1.Y(1), (ux2) obj);
                return f88Var;
            case 2:
                ge8 ge8VarB = di1.B((LayoutNode) obj);
                int iOrdinal = ((j04) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        gk0.s();
                        return null;
                    }
                    i = 1;
                }
                ge8VarB.setLayoutDirection(i);
                return f88Var;
            case 3:
                di1.B((LayoutNode) obj).setUpdateBlock((Function1) obj2);
                return f88Var;
            case 4:
                di1.B((LayoutNode) obj).setReleaseBlock((Function1) obj2);
                return f88Var;
            case 5:
                di1.B((LayoutNode) obj).setModifier((fs4) obj2);
                return f88Var;
            case 6:
                di1.B((LayoutNode) obj).setDensity((in1) obj2);
                return f88Var;
            case 7:
                di1.B((LayoutNode) obj).setLifecycleOwner((LifecycleOwner) obj2);
                return f88Var;
            case 8:
                di1.B((LayoutNode) obj).setSavedStateRegistryOwner((ai6) obj2);
                return f88Var;
            case ep1.b /* 9 */:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    td3.b(lv1.T(R.drawable.ic_info, ux2Var, 0), null, null, 0L, ux2Var, 8, 12);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            case ep1.c /* 10 */:
                String str3 = (String) obj;
                be1 be1Var = (be1) obj2;
                str3.getClass();
                be1Var.getClass();
                if (str3.length() == 0) {
                    return be1Var.toString();
                }
                return str3 + ", " + be1Var;
            case 11:
                StringBuilder sb = (StringBuilder) obj;
                ds4 ds4Var = (ds4) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(ds4Var);
                return sb;
            case ep1.d /* 12 */:
                Set set = (Set) obj2;
                ((jh6) obj).getClass();
                set.getClass();
                Set set2 = set;
                ArrayList arrayList = new ArrayList(mv0.Z(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UUID) it.next()).toString());
                }
                return arrayList;
            case 13:
                l33 l33Var2 = (l33) obj;
                String str4 = (String) obj2;
                l33Var2.getClass();
                str4.getClass();
                String str5 = l33Var2.b;
                if (str5 != null && ub7.Q(str5, str4, true)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 14:
                l33 l33Var3 = (l33) obj;
                String str6 = (String) obj2;
                l33Var3.getClass();
                str6.getClass();
                String str7 = l33Var3.b;
                if (str7 != null && ub7.Q(str7, str6, true)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 15:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    td3.b(lv1.T(R.drawable.navigation_back_icon, ux2Var2, 0), m77.z(R.string.back, ux2Var2), null, ((rn4) ux2Var2.j(un4.a)).a.q, ux2Var2, 8, 4);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qs7.b(m77.z(R.string.device_tab_add_contact_email_error, ux2Var3), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-contact-bottom-sheet-email-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 48, 0, 262140);
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
            case 17:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qs7.b(m77.z(R.string.device_tab_add_contact_email_label, ux2Var4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var4, 0, 0, 262142);
                } else {
                    ux2Var4.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qs7.b(m77.z(R.string.select_a_group_error_text, ux2Var5), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-contact-bottom-sheet-group-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var5, 48, 0, 262140);
                } else {
                    ux2Var5.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qs7.b(m77.z(R.string.select_a_group, ux2Var6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var6, 0, 0, 262142);
                } else {
                    ux2Var6.Q();
                }
                return f88Var;
            case 20:
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    td3.b(lv1.T(R.drawable.ic_chevron_down, ux2Var7, 0), null, null, 0L, ux2Var7, 56, 12);
                } else {
                    ux2Var7.Q();
                }
                return f88Var;
            case 21:
                ux2 ux2Var8 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (ux2Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    qs7.b(m77.z(R.string.device_tab_add_contact_description_label, ux2Var8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var8, 0, 0, 262142);
                } else {
                    ux2Var8.Q();
                }
                return f88Var;
            case 22:
                ux2 ux2Var9 = (ux2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (ux2Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    qs7.b(m77.z(R.string.group_dialog_title, ux2Var9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var9, 0, 0, 262142);
                } else {
                    ux2Var9.Q();
                }
                return f88Var;
            case 23:
                ux2 ux2Var10 = (ux2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (ux2Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    qs7.b(m77.z(R.string.select_a_group_error_text, ux2Var10), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-remote-device-via-id-bottom-sheet-select-a-group-input-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var10, 48, 0, 262140);
                } else {
                    ux2Var10.Q();
                }
                return f88Var;
            case 24:
                ux2 ux2Var11 = (ux2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (ux2Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    qs7.b(m77.z(R.string.teamviewer_id_invalid_text, ux2Var11), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-remote-device-via-id-bottom-sheet-teamviewer-id-invalid-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var11, 48, 0, 262140);
                } else {
                    ux2Var11.Q();
                }
                return f88Var;
            case 25:
                ux2 ux2Var12 = (ux2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (ux2Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    qs7.b(m77.z(R.string.teamviewer_id_exist_text, ux2Var12), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-remote-device-via-id-bottom-sheet-teamviewer-id-exist-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var12, 48, 0, 262140);
                } else {
                    ux2Var12.Q();
                }
                return f88Var;
            case 26:
                ux2 ux2Var13 = (ux2) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (ux2Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    qs7.b(m77.z(R.string.teamviewer_id, ux2Var13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var13, 0, 0, 262142);
                } else {
                    ux2Var13.Q();
                }
                return f88Var;
            case 27:
                ux2 ux2Var14 = (ux2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (ux2Var14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    qs7.b(m77.z(R.string.password_optional, ux2Var14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var14, 0, 0, 262142);
                } else {
                    ux2Var14.Q();
                }
                return f88Var;
            case 28:
                ux2 ux2Var15 = (ux2) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (ux2Var15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    qs7.b(m77.z(R.string.description_optional, ux2Var15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var15, 0, 0, 262142);
                } else {
                    ux2Var15.Q();
                }
                return f88Var;
            default:
                ux2 ux2Var16 = (ux2) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!ux2Var16.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ux2Var16.Q();
                }
                return f88Var;
        }
    }

    public /* synthetic */ g9(byte b) {
        this.m = b;
    }
}
