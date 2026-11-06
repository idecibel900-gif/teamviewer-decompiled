package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapper;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperSWIGJNI;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h31 implements Function1 {
    public final /* synthetic */ byte m;

    public /* synthetic */ h31(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strL;
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((zr7) obj).getClass();
                return f88Var;
            case 1:
                ((Long) obj).getClass();
                return f88Var;
            case 2:
                ((Long) obj).getClass();
                return f88Var;
            case 3:
                ((z31) obj).getClass();
                return f88Var;
            case 4:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                mp6.a(op6Var);
                return f88Var;
            case 5:
                op6 op6Var2 = (op6) obj;
                op6Var2.getClass();
                mp6.a(op6Var2);
                return f88Var;
            case 6:
                op6 op6Var3 = (op6) obj;
                op6Var3.getClass();
                mp6.a(op6Var3);
                return f88Var;
            case 7:
                Throwable th = (Throwable) obj;
                th.getClass();
                ua5.v("Failed to fetch organization contacts: ", th.getMessage(), "ContactsPagerLoader");
                return f88Var;
            case 8:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ua5.v("Failed to fetch personal invitation contacts: ", th2.getMessage(), "ContactsPagerLoader");
                return f88Var;
            case ep1.b /* 9 */:
                h71 h71Var = (h71) obj;
                h71Var.getClass();
                return h71Var.f954o;
            case ep1.c /* 10 */:
                op6 op6Var4 = (op6) obj;
                op6Var4.getClass();
                mp6.a(op6Var4);
                return f88Var;
            case 11:
                return f88Var;
            case ep1.d /* 12 */:
                be1 be1Var = (be1) obj;
                if (be1Var instanceof fe1) {
                    return (fe1) be1Var;
                }
                return null;
            case 13:
                aq3 aq3Var = (aq3) obj;
                aq3Var.getClass();
                aq3Var.a = true;
                return f88Var;
            case 14:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                return str + " : " + value;
            case 15:
                lp6.l((op6) obj);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                op6 op6Var5 = (op6) obj;
                op6Var5.getClass();
                mp6.a(op6Var5);
                return f88Var;
            case 17:
                ((IAlertViewModelWrapper) obj).getClass();
                return Boolean.TRUE;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) obj;
                iAlertViewModelWrapper.getClass();
                return Boolean.valueOf(!IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_IsAcknowledged(iAlertViewModelWrapper.a, iAlertViewModelWrapper));
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                IAlertViewModelWrapper iAlertViewModelWrapper2 = (IAlertViewModelWrapper) obj;
                iAlertViewModelWrapper2.getClass();
                return Boolean.valueOf(IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_IsAcknowledged(iAlertViewModelWrapper2.a, iAlertViewModelWrapper2));
            case 20:
                String str2 = (String) obj;
                int i = hr1.u0;
                str2.getClass();
                ye4.c("Device Alerts Overview", "error rechecking device alerts: ".concat(str2));
                return f88Var;
            case 21:
                ((Long) obj).getClass();
                return f88Var;
            case 22:
                ((Long) obj).getClass();
                return f88Var;
            case 23:
                op6 op6Var6 = (op6) obj;
                op6Var6.getClass();
                mp6.a(op6Var6);
                return f88Var;
            case 24:
                op6 op6Var7 = (op6) obj;
                op6Var7.getClass();
                mp6.a(op6Var7);
                return f88Var;
            case 25:
                return Boolean.valueOf(ka0.q(obj));
            case 26:
                return f88Var;
            case 27:
                return Boolean.FALSE;
            case 28:
                e84 e84Var = (e84) obj;
                e84Var.getClass();
                String str3 = e84Var.e;
                strL = str3 != null ? bc7.L(bc7.L(str3, "<br />", "\n"), "<br/>", "\n") : null;
                return strL != null ? strL : "";
            default:
                e84 e84Var2 = (e84) obj;
                e84Var2.getClass();
                String str4 = e84Var2.e;
                strL = str4 != null ? bc7.L(str4, "\n", "<br />") : null;
                return strL != null ? strL : "";
        }
    }
}
