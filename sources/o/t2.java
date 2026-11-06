package o;

import android.content.Context;
import androidx.compose.ui.platform.AndroidComposeView;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t2 implements Function1 {
    public final /* synthetic */ byte m;

    public /* synthetic */ t2(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                sn5 sn5Var = (sn5) obj;
                boolean z = false;
                if (sn5Var != null && sn5Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 1:
                ((String) obj).getClass();
                return f88Var;
            case 2:
                kn knVar = (kn) obj;
                knVar.getClass();
                return knVar.a(new tb1(wb2.e(db8.I0(300, 6, null), 2), wb2.f(db8.I0(300, 6, null), 2)), im3.l(2));
            case 3:
                l33 l33Var = (l33) obj;
                l33Var.getClass();
                String str = l33Var.b;
                return str == null ? "" : str;
            case 4:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                mp6.a(op6Var);
                return f88Var;
            case 5:
                kn knVar2 = (kn) obj;
                knVar2.getClass();
                return knVar2.a(new tb1(wb2.e(db8.I0(300, 6, null), 2), wb2.f(db8.I0(300, 6, null), 2)), im3.l(2));
            case 6:
                kn knVar3 = (kn) obj;
                knVar3.getClass();
                return knVar3.a(new tb1(wb2.e(db8.I0(300, 6, null), 2), wb2.f(db8.I0(300, 6, null), 2)), im3.l(2));
            case 7:
                kn knVar4 = (kn) obj;
                knVar4.getClass();
                return knVar4.a(new tb1(wb2.e(db8.I0(300, 6, null), 2), wb2.f(db8.I0(300, 6, null), 2)), im3.l(2));
            case 8:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case ep1.b /* 9 */:
                return Boolean.TRUE;
            case ep1.c /* 10 */:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 11:
                return Boolean.TRUE;
            case ep1.d /* 12 */:
                Class cls = AndroidComposeView.U0;
                return Boolean.TRUE;
            case 13:
                return Boolean.valueOf(xs1.Q((fp6) obj));
            case 14:
                return (vm5) obj;
            case 15:
                u01 u01Var = (u01) obj;
                u01Var.T(lh.a);
                return ((Context) u01Var.T(lh.b)).getResources();
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return Boolean.valueOf(xs1.Q((fp6) obj));
            case 17:
                fw3[] fw3VarArr = lp6.a;
                ((op6) obj).d(kp6.y, f88Var);
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b2}, 1));
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                Byte b3 = (Byte) obj;
                b3.byteValue();
                return String.format("%02X", Arrays.copyOf(new Object[]{b3}, 1));
            case 20:
                ((Long) obj).getClass();
                return f88Var;
            case 21:
                fw3[] fw3VarArr2 = lp6.a;
                ((op6) obj).d(kp6.x, f88Var);
                return f88Var;
            case 22:
                ((Long) obj).getClass();
                return f88Var;
            case 23:
                return f88Var;
            case 24:
                return f88Var;
            case 25:
                xl xlVar = (xl) obj;
                xlVar.getHandler().post(new lg(xlVar.D, (byte) 3));
                return f88Var;
            case 26:
                return f88Var;
            case 27:
                return f88Var;
            case 28:
                return Boolean.valueOf(!(((to) obj) instanceof gf5));
            default:
                op6 op6Var2 = (op6) obj;
                op6Var2.getClass();
                mp6.a(op6Var2);
                return f88Var;
        }
    }
}
