package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg3 implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ tg3(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                h72 h72Var = ug3.a;
                return tj1.a;
            case 1:
                return null;
            case 2:
                return new w32(48.0f);
            case 3:
            case 4:
            case 5:
                return f88Var;
            case 6:
                return h57.p(Boolean.FALSE);
            case 7:
                return hr3.b;
            case 8:
                return ar3.b;
            case ep1.b /* 9 */:
                return xq3.b;
            case ep1.c /* 10 */:
                return er3.b;
            case 11:
                return zp3.b;
            case ep1.d /* 12 */:
                return new LayoutNode(3);
            case 13:
                return new ow(qq1.a, (byte) 0);
            case 14:
                return new ow(c84.a, (byte) 1);
            case 15:
                return new ow(kx2.a, (byte) 1);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new ow(gb7.a, (byte) 1);
            case 17:
                return h57.p(null);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new ow(h74.a, (byte) 0);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new ow(c84.a, (byte) 1);
            case 20:
                return null;
            case 21:
                return ox.a;
            case 22:
                return vx.a;
            case 23:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 24:
                return null;
            case 25:
                h72 h72Var2 = gd4.a;
                return yl7.A;
            case 26:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 27:
                return h57.p(Boolean.FALSE);
            case 28:
                return f88Var;
            default:
                return new LayoutNode(2);
        }
    }

    public /* synthetic */ tg3(wm3 wm3Var, byte b) {
        this.m = b;
    }
}
