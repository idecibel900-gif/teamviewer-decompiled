package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class va implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    public /* synthetic */ va(px4 px4Var, byte b) {
        this.m = b;
        this.n = px4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.n;
        switch (b) {
            case 0:
                ea0 ea0Var = (ea0) obj;
                ea0Var.getClass();
                px4Var.setValue(ea0Var);
                return f88Var;
            case 1:
                ea0 ea0Var2 = (ea0) obj;
                ea0Var2.getClass();
                px4Var.setValue(ea0Var2);
                return f88Var;
            case 2:
                px4Var.setValue((i04) obj);
                return f88Var;
            case 3:
                wq2 wq2Var = (wq2) obj;
                wq2Var.getClass();
                px4Var.setValue(Boolean.valueOf(wq2Var.b()));
                return f88Var;
            case 4:
                String str = (String) obj;
                str.getClass();
                px4Var.setValue(str);
                return f88Var;
            case 5:
                px4Var.setValue((i04) obj);
                return f88Var;
            case 6:
                List list = (List) obj;
                if (px4Var != null) {
                    px4Var.setValue(list);
                }
                return f88Var;
            case 7:
                vo7 vo7Var = (vo7) obj;
                px4Var.setValue(vo7Var.c ? vo7Var.b : vo7Var.a);
                return f88Var;
            case 8:
                l33 l33Var = (l33) obj;
                l33Var.getClass();
                return Boolean.valueOf(lv0.h0((Set) px4Var.getValue(), bt1.B(l33Var)));
            case ep1.b /* 9 */:
                l33 l33Var2 = (l33) obj;
                l33Var2.getClass();
                UUID uuidB = bt1.B(l33Var2);
                if (uuidB != null) {
                    px4Var.setValue(((Set) px4Var.getValue()).contains(uuidB) ? fv6.Y((Set) px4Var.getValue(), uuidB) : fv6.b0((Set) px4Var.getValue(), uuidB));
                }
                return f88Var;
            case ep1.c /* 10 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                px4Var.setValue(bool);
                return f88Var;
            case 11:
                h71 h71Var = (h71) obj;
                h71Var.getClass();
                ((Function1) px4Var.getValue()).invoke(h71Var);
                return f88Var;
            case ep1.d /* 12 */:
                px4Var.setValue((yr6) obj);
                return f88Var;
            case 13:
                z31 z31Var = (z31) obj;
                z31Var.getClass();
                px4Var.setValue(z31Var);
                return f88Var;
            case 14:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                px4Var.setValue(bool2);
                return f88Var;
            case 15:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                px4Var.setValue(bool3);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                px4Var.setValue((String) obj);
                return f88Var;
            case 17:
                String str2 = (String) obj;
                str2.getClass();
                px4Var.setValue(str2);
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                String str3 = (String) obj;
                str3.getClass();
                px4Var.setValue(str3);
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                px4Var.setValue((i04) obj);
                return f88Var;
            case 20:
                vs7 vs7Var = (vs7) obj;
                vs7Var.getClass();
                px4Var.setValue(Boolean.valueOf(vs7Var.b.f > 1));
                return f88Var;
            case 21:
                vs7 vs7Var2 = (vs7) obj;
                vs7Var2.getClass();
                px4Var.setValue(Boolean.valueOf(vs7Var2.b.f > 1));
                return f88Var;
            case 22:
                String str4 = (String) obj;
                str4.getClass();
                px4Var.setValue(str4);
                return f88Var;
            case 23:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((Function1) px4Var.getValue()).invoke(f)).floatValue());
            case 24:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                xo xoVar = new xo(au8.R(((zr7) px4Var.getValue()).a.n));
                fw3[] fw3VarArr = lp6.a;
                np6 np6Var = kp6.G;
                fw3 fw3Var = lp6.a[19];
                np6Var.getClass();
                op6Var.d(np6Var, xoVar);
                return f88Var;
            case 25:
                String str5 = (String) obj;
                str5.getClass();
                px4Var.setValue(str5);
                return f88Var;
            case 26:
                String str6 = (String) obj;
                str6.getClass();
                px4Var.setValue(str6);
                return f88Var;
            case 27:
                ((r22) obj).getClass();
                return new m8(px4Var, (byte) 13);
            case 28:
                px4Var.setValue((xs6) obj);
                return f88Var;
            default:
                px4Var.setValue((xs6) obj);
                return f88Var;
        }
    }
}
