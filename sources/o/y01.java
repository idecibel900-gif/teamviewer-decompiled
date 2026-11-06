package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y01 implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ y01(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                b11.b("LocalFocusManager");
                throw null;
            case 1:
                b11.b("LocalFontLoader");
                throw null;
            case 2:
                b11.b("LocalHapticFeedback");
                throw null;
            case 3:
                b11.b("LocalInputManager");
                throw null;
            case 4:
                b11.b("LocalLayoutDirection");
                throw null;
            case 5:
                b11.b("LocalProvidableLocaleList");
                throw null;
            case 6:
            case 7:
                return null;
            case 8:
                b11.b("LocalTextToolbar");
                throw null;
            case ep1.b /* 9 */:
                b11.b("LocalUriHandler");
                throw null;
            case ep1.c /* 10 */:
                i01.b("Unexpected call to default provider");
                throw new iz3();
            case 11:
                return f88Var;
            case ep1.d /* 12 */:
                return new yf5(0);
            case 13:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(q31.E);
                return f88Var;
            case 14:
                return f88Var;
            case 15:
                return h57.p(null);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(ra1.E);
                return f88Var;
            case 17:
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(ra1.F);
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return f88Var;
            case 25:
                c36 c36Var = zu1.c;
                if (c36Var != null) {
                    return new n81((int) BackendContainerAndroid.GetInstance().GetAccount().GetAccountID(), c36Var.e());
                }
                hk0.g("Required value was null.");
                return null;
            case 26:
                c36 c36Var2 = zu1.c;
                if (c36Var2 != null) {
                    return new qa1((int) BackendContainerAndroid.GetInstance().GetAccount().GetAccountID(), c36Var2.e(), 10);
                }
                hk0.g("Required value was null.");
                return null;
            case 27:
                return Float.valueOf(1.0f);
            default:
                int i = hr1.u0;
            case 28:
                return f88Var;
        }
    }
}
