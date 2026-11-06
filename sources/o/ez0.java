package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ez0 implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ ez0(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
                return f88Var;
            case 15:
                return new LayoutNode(2);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return null;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                b11.b("LocalViewConfiguration");
                throw null;
            case 20:
                b11.b("LocalWindowInfo");
                throw null;
            case 21:
                return new a11();
            case 22:
                return null;
            case 23:
                b11.b("LocalAutofillTree");
                throw null;
            case 24:
                b11.b("LocalAutofillManager");
                throw null;
            case 25:
                b11.b("LocalClipboardManager");
                throw null;
            case 26:
                b11.b("LocalClipboard");
                throw null;
            case 27:
                b11.b("LocalGraphicsContext");
                throw null;
            case 28:
                b11.b("LocalFontFamilyResolver");
                throw null;
            default:
                b11.b("LocalDensity");
                throw null;
        }
    }
}
