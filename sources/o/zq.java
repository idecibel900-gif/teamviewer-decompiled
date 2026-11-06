package o;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.teamviewer.apidefinitions.mobilewake.infrastructure.ApiClient;
import com.teamviewer.appupdatelib.swig.statistics.AppUpdateStatisticsFactory;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zq implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ zq(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        fa2 fa2Var = fa2.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ApiClient.defaultBasePath_delegate$lambda$9();
            case 1:
                return com.teamviewer.apidefinitions.policies.infrastructure.ApiClient.defaultBasePath_delegate$lambda$9();
            case 2:
                return com.teamviewer.apidefinitions.account.infrastructure.ApiClient.defaultBasePath_delegate$lambda$9();
            case 3:
                h72 h72Var = qr.a;
                return bl1.a;
            case 4:
                h72 h72Var2 = qr.a;
                return jk0.u;
            case 5:
                return fa2Var;
            case 6:
                return h57.p(null);
            case 7:
                return h57.p(Boolean.FALSE);
            case 8:
                return f88Var;
            case ep1.b /* 9 */:
                return AppUpdateStatisticsFactory.GetAppUpdateStatistics();
            case ep1.c /* 10 */:
                return new sv();
            case 11:
                return fa2Var;
            case ep1.d /* 12 */:
                if (pm8.w != null) {
                    return new iy(new hy());
                }
                im3.e0("viewModelFactory");
                throw null;
            case 13:
                return new t57(j51.i(1308617531));
            case 14:
                return new Handler(Looper.getMainLooper());
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return null;
            case 17:
                return h57.p(Boolean.FALSE);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return h57.p(Boolean.FALSE);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return h57.p(Boolean.TRUE);
            case 20:
                SharedPreferences sharedPreferences = h57.a;
                if (sharedPreferences != null) {
                    return Boolean.valueOf(sharedPreferences.getBoolean("KEY_ENABLE_RC_REDESIGNED_DEVICE_TAB", true));
                }
                im3.e0("sharedPreferences");
                throw null;
            case 21:
                return f88Var;
            case 22:
                return new yf5(1);
            case 23:
                return new yf5(1);
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                return f88Var;
        }
    }
}
