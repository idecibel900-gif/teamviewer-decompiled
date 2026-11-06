package o;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class px implements Function1 {
    public final /* synthetic */ byte m;

    public /* synthetic */ px(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return (sx) obj;
            case 1:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                mp6.a(op6Var);
                return f88Var;
            case 2:
                m20 m20Var = (m20) obj;
                m20Var.getClass();
                yo1.H(m20Var);
                return f88Var;
            case 3:
                ((m20) obj).W0();
                return f88Var;
            case 4:
                qg4 qg4Var = (qg4) obj;
                qg4Var.b(ga0.f, (int) (qg4Var.a().j() >> 32));
                qg4Var.b(ga0.e, 0.0f);
                return f88Var;
            case 5:
                return f88Var;
            case 6:
                return f88Var;
            case 7:
                op6 op6Var2 = (op6) obj;
                op6Var2.getClass();
                mp6.a(op6Var2);
                return f88Var;
            case 8:
                ((d14) obj).a();
                return f88Var;
            case ep1.b /* 9 */:
                return f88Var;
            case ep1.c /* 10 */:
                return f88Var;
            case 11:
                if (((Context) ((u01) obj).T(lh.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return pb0.b;
                }
                nb0.a.getClass();
                return mb0.c;
            case ep1.d /* 12 */:
                lp6.i((op6) obj, 0);
                return f88Var;
            case 13:
                return f88Var;
            case 14:
                l28 l28Var = (l28) obj;
                l28Var.getClass();
                fg5 fg5Var = (fg5) l28Var;
                fg5Var.B = false;
                vn4.p0(fg5Var).U();
                return Boolean.FALSE;
            case 15:
                lp6.i((op6) obj, 1);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                l33 l33Var = (l33) obj;
                l33Var.getClass();
                return l33Var.a;
            case 17:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(UUID.fromString((String) it.next()));
                }
                return lv0.T0(arrayList);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                l33 l33Var2 = (l33) obj;
                l33Var2.getClass();
                String str = l33Var2.b;
                return str == null ? "" : str;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                l33 l33Var3 = (l33) obj;
                l33Var3.getClass();
                String str2 = l33Var3.b;
                return str2 == null ? "" : str2;
            case 20:
                ((String) obj).getClass();
                return f88Var;
            case 21:
                ((String) obj).getClass();
                return f88Var;
            case 22:
                ((String) obj).getClass();
                return f88Var;
            case 23:
                ((String) obj).getClass();
                return f88Var;
            case 24:
                ((String) obj).getClass();
                return f88Var;
            case 25:
                ((String) obj).getClass();
                return f88Var;
            case 26:
                ((Long) obj).getClass();
                return f88Var;
            case 27:
                yz0 yz0Var = (yz0) obj;
                LayoutNode layoutNode = yz0Var instanceof LayoutNode ? (LayoutNode) yz0Var : null;
                if (layoutNode != null && layoutNode.c0) {
                    ki3.c("Apply is called on deactivated node " + yz0Var);
                }
                return f88Var;
            case 28:
                return Boolean.valueOf(!(((ds4) obj) instanceof d01));
            default:
                ComputerEditViewModel computerEditViewModel = (ComputerEditViewModel) obj;
                computerEditViewModel.getClass();
                PListDyngateID pListDyngateIDA = computerEditViewModel.a();
                String strPListDyngateID_GetAsString = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateIDA.a, pListDyngateIDA);
                int i = wt6.k;
                strPListDyngateID_GetAsString.getClass();
                return vt6.c(strPListDyngateID_GetAsString);
        }
    }
}
