package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class iq0 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ u18 n;

    public /* synthetic */ iq0(u18 u18Var, byte b) {
        this.m = b;
        this.n = u18Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        u18 u18Var = this.n;
        switch (b) {
            case 0:
                return u18Var.d.getValue();
            case 1:
                return u18Var.f();
            case 2:
                return u18Var.d.getValue();
            case 3:
                return u18Var.f();
            case 4:
                return u18Var.d.getValue();
            case 5:
                return u18Var.f();
            case 6:
                return u18Var.d.getValue();
            case 7:
                return u18Var.f();
            case 8:
                return u18Var.d.getValue();
            case ep1.b /* 9 */:
                return u18Var.f();
            case ep1.c /* 10 */:
                return u18Var.d.getValue();
            case 11:
                return u18Var.f();
            case ep1.d /* 12 */:
                return u18Var.d.getValue();
            case 13:
                return u18Var.f();
            case 14:
                return u18Var.d.getValue();
            case 15:
                return u18Var.f();
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return u18Var.d.getValue();
            case 17:
                return u18Var.f();
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return u18Var.d.getValue();
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return u18Var.f();
            case 20:
                return u18Var.d.getValue();
            default:
                return u18Var.f();
        }
    }
}
