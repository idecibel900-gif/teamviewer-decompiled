package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class la implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    public /* synthetic */ la(px4 px4Var, byte b) {
        this.m = b;
        this.n = px4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.n;
        switch (b) {
            case 0:
                px4Var.setValue(ea0.m);
                return f88Var;
            case 1:
                i04 i04Var = (i04) px4Var.getValue();
                if (i04Var != null) {
                    return i04Var;
                }
                ni3.d("Required value was null.");
                hk0.b();
                return null;
            case 2:
                px4Var.setValue("");
                return f88Var;
            case 3:
                i04 i04Var2 = (i04) px4Var.getValue();
                if (i04Var2 != null) {
                    return i04Var2;
                }
                ni3.d("Required value was null.");
                hk0.b();
                return null;
            case 4:
                if (px4Var != null) {
                    return (List) px4Var.getValue();
                }
                return null;
            case 5:
                px4Var.setValue(Boolean.TRUE);
                return f88Var;
            case 6:
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case 7:
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case 8:
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case ep1.b /* 9 */:
                px4Var.setValue(Boolean.TRUE);
                return f88Var;
            case ep1.c /* 10 */:
                Boolean bool = (Boolean) px4Var.getValue();
                bool.booleanValue();
                return bool;
            case 11:
                px4Var.setValue(Boolean.TRUE);
                return f88Var;
            case ep1.d /* 12 */:
                px4Var.setValue(Boolean.TRUE);
                return f88Var;
            case 13:
                px4Var.setValue(Boolean.TRUE);
                return f88Var;
            case 14:
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case 15:
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case 17:
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                px4Var.setValue(Boolean.FALSE);
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                px4Var.setValue(rs1.m);
                return f88Var;
            case 20:
                px4Var.setValue(rs1.p);
                return f88Var;
            case 21:
                px4Var.setValue(rs1.n);
                return f88Var;
            case 22:
                px4Var.setValue(rs1.f1945o);
                return f88Var;
            case 23:
                px4Var.setValue(Boolean.TRUE);
                return f88Var;
            case 24:
                px4Var.setValue(Boolean.TRUE);
                return f88Var;
            case 25:
                px4Var.setValue(y33.p);
                return f88Var;
            case 26:
                Boolean bool2 = (Boolean) ((Function0) px4Var.getValue()).a();
                bool2.getClass();
                return bool2;
            case 27:
                Boolean bool3 = (Boolean) ((Function0) px4Var.getValue()).a();
                bool3.getClass();
                return bool3;
            case 28:
                ((Function0) px4Var.getValue()).a();
                return f88Var;
            default:
                return (i44) ((Function0) px4Var.getValue()).a();
        }
    }
}
