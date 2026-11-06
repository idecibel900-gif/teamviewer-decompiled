package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewerlib.gui.UIConnector;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c6 implements hk7 {
    public final /* synthetic */ byte a;

    public /* synthetic */ c6(byte b) {
        this.a = b;
    }

    @Override // o.hk7
    public final void a(gk7 gk7Var) {
        byte b = this.a;
        UIConnector uIConnector = UIConnector.a;
        switch (b) {
            case 0:
                gk7Var.A0();
                break;
            case 1:
                int i = wb0.B0;
                gk7Var.A0();
                break;
            case 2:
                int i2 = yb0.z0;
                gk7Var.A0();
                break;
            case 3:
                int i3 = lc0.P0;
                gk7Var.A0();
                break;
            case 4:
                int i4 = yc0.G0;
                gk7Var.A0();
                break;
            case 5:
                int i5 = sd0.I0;
                gk7Var.A0();
                break;
            case 6:
                int i6 = ie0.H0;
                gk7Var.A0();
                break;
            case 7:
                gk7Var.A0();
                break;
            case 8:
                int i7 = ik2.W0;
                gk7Var.A0();
                break;
            case ep1.b /* 9 */:
                int i8 = ik2.W0;
                gk7Var.A0();
                break;
            case ep1.c /* 10 */:
                int i9 = ik2.W0;
                gk7Var.A0();
                break;
            case 11:
                int i10 = nk2.b1;
                gk7Var.A0();
                break;
            case ep1.d /* 12 */:
                gk7Var.A0();
                break;
            case 13:
                gk7Var.A0();
                break;
            case 14:
                int i11 = MainActivity.w0;
                gk7Var.A0();
                break;
            case 15:
                uIConnector.a(gk7Var, p02.Positive);
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                uIConnector.a(gk7Var, p02.Negative);
                break;
            case 17:
                uIConnector.a(gk7Var, p02.Neutral);
                break;
            default:
                uIConnector.a(gk7Var, p02.Cancelled);
                break;
        }
    }
}
