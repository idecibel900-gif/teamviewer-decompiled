package o;

import android.os.Bundle;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jt2 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ut2 n;

    public /* synthetic */ jt2(ut2 ut2Var, Bundle bundle) {
        this.m = (byte) 16;
        this.n = ut2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        ut2 ut2Var = this.n;
        switch (b) {
            case 0:
                ut2Var.f0.a(l84.ON_STOP);
                break;
            case 1:
                ut2Var.d0.d(l84.ON_PAUSE);
                break;
            case 2:
                ut2Var.f0();
                break;
            case 3:
                ut2Var.d0.d(l84.ON_DESTROY);
                break;
            case 4:
                ut2Var.a0();
                break;
            case 5:
                ut2Var.c0();
                break;
            case 6:
                ut2Var.g0();
                break;
            case 7:
                ut2Var.d0.d(l84.ON_RESUME);
                break;
            case 8:
                ut2Var.f0.a(l84.ON_RESUME);
                break;
            case ep1.b /* 9 */:
                ut2Var.f0.a(l84.ON_DESTROY);
                break;
            case ep1.c /* 10 */:
                ut2Var.d0.d(l84.ON_STOP);
                break;
            case 11:
                ut2Var.b0();
                break;
            case ep1.d /* 12 */:
                ut2Var.d0.d(l84.ON_CREATE);
                break;
            case 13:
                gv2 gv2Var = ut2Var.f0;
                gv2Var.r.N0(ut2Var.p);
                ut2Var.p = null;
                break;
            case 14:
                ut2Var.f0.a(l84.ON_CREATE);
                break;
            case 15:
                ut2Var.j0();
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ut2Var.S();
                break;
            case 17:
                ut2Var.i0();
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ut2Var.d0.d(l84.ON_START);
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ut2Var.f0.a(l84.ON_START);
                break;
            case 20:
                ut2Var.U(ut2Var.G.t);
                break;
            default:
                ut2Var.f0.a(l84.ON_PAUSE);
                break;
        }
    }

    public /* synthetic */ jt2(ut2 ut2Var, byte b) {
        this.m = b;
        this.n = ut2Var;
    }
}
