package o;

import android.net.Uri;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.WebLoginActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr6 extends cx2 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr6(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.n = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Object value;
        or6 or6Var;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        LicenseViewModel licenseViewModel;
        String strLicenseViewModel_GetAccountName;
        byte b = this.n;
        byte b2 = 0;
        byte b3 = 1;
        hc1 hc1Var = null;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((xr6) this.receiver).V0();
                return f88Var;
            case 1:
                xr6 xr6Var = (xr6) this.receiver;
                xr6Var.Z0();
                xr6Var.Y0(false);
                return f88Var;
            case 2:
                l97 l97Var = ((xr6) this.receiver).r;
                do {
                    value = l97Var.getValue();
                    or6Var = (or6) value;
                } while (!l97Var.j(value, or6.a(or6Var, null, null, false, !or6Var.d, false, false, false, false, null, 0, 0, 2039)));
                return f88Var;
            case 3:
                l97 l97Var2 = ((su6) this.receiver).t;
                do {
                    value2 = l97Var2.getValue();
                } while (!l97Var2.j(value2, it6.a((it6) value2, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 28671)));
                return f88Var;
            case 4:
                su6 su6Var = (su6) this.receiver;
                SupportSession supportSessionV0 = su6Var.V0();
                if (supportSessionV0 != null) {
                    im3.R(e8.n(su6Var), su6Var.q, null, new tx(su6Var, supportSessionV0, hc1Var, (byte) 7), 2);
                }
                return f88Var;
            case 5:
                l97 l97Var3 = ((su6) this.receiver).t;
                do {
                    value3 = l97Var3.getValue();
                } while (!l97Var3.j(value3, it6.a((it6) value3, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 24575)));
                return f88Var;
            case 6:
                l97 l97Var4 = ((su6) this.receiver).t;
                do {
                    value4 = l97Var4.getValue();
                } while (!l97Var4.j(value4, it6.a((it6) value4, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 30719)));
                return f88Var;
            case 7:
                l97 l97Var5 = ((su6) this.receiver).t;
                do {
                    value5 = l97Var5.getValue();
                } while (!l97Var5.j(value5, it6.a((it6) value5, null, false, null, null, null, null, null, false, false, false, true, false, false, false, false, 31743)));
                return f88Var;
            case 8:
                l97 l97Var6 = ((su6) this.receiver).t;
                do {
                    value6 = l97Var6.getValue();
                } while (!l97Var6.j(value6, it6.a((it6) value6, null, false, null, null, null, null, null, false, false, false, false, true, false, false, false, 30719)));
                return f88Var;
            case ep1.b /* 9 */:
                l97 l97Var7 = ((su6) this.receiver).t;
                do {
                    value7 = l97Var7.getValue();
                } while (!l97Var7.j(value7, it6.a((it6) value7, null, false, null, null, null, null, null, false, false, false, false, false, true, false, false, 28671)));
                return f88Var;
            case ep1.c /* 10 */:
                su6 su6Var2 = (su6) this.receiver;
                SupportSession supportSessionV1 = su6Var2.V0();
                if (supportSessionV1 != null) {
                    im3.R(e8.n(su6Var2), su6Var2.q, null, new ou6(supportSessionV1, su6Var2, hc1Var, b2), 2);
                }
                return f88Var;
            case 11:
                su6 su6Var3 = (su6) this.receiver;
                SupportSession supportSessionV2 = su6Var3.V0();
                if (supportSessionV2 != null) {
                    im3.R(e8.n(su6Var3), su6Var3.q, null, new ou6(supportSessionV2, su6Var3, hc1Var, b3), 2);
                }
                return f88Var;
            case ep1.d /* 12 */:
                ((su6) this.receiver).c1();
                return f88Var;
            case 13:
                l97 l97Var8 = ((su6) this.receiver).t;
                do {
                    value8 = l97Var8.getValue();
                } while (!l97Var8.j(value8, it6.a((it6) value8, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 31743)));
                return f88Var;
            case 14:
                hw6 hw6Var = (hw6) this.receiver;
                yf5 yf5Var = hw6Var.A;
                yf5Var.A(yf5Var.z() + 1);
                if (yf5Var.z() == 3) {
                    hw6Var.B.setValue(Boolean.TRUE);
                    yf5Var.A(0);
                }
                return f88Var;
            case 15:
                hw6 hw6Var2 = (hw6) this.receiver;
                l97 l97Var9 = hw6Var2.x;
                dw6 dw6Var = (dw6) l97Var9.getValue();
                dw6Var.getClass();
                LogoutViewModel logoutViewModel = hw6Var2.n;
                l97Var9.l(null, dw6.a(dw6Var, (logoutViewModel == null || !LogoutViewModelSWIGJNI.LogoutViewModel_IsEnabled(logoutViewModel.c, logoutViewModel) || (licenseViewModel = hw6Var2.f1014o) == null || (strLicenseViewModel_GetAccountName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountName(licenseViewModel.a, licenseViewModel)) == null || strLicenseViewModel_GetAccountName.length() <= 0) ? false : true, false, false, false, false, false, false, false, false, null, false, false, false, 32766));
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                e67 e67Var = (e67) this.receiver;
                e67Var.getClass();
                im3.R(e8.n(e67Var), null, null, new y0(e67Var, hc1Var, (byte) 27), 3);
                return f88Var;
            case 17:
                WebLoginActivity webLoginActivity = (WebLoginActivity) this.receiver;
                int i = WebLoginActivity.S;
                hi8 hi8Var = webLoginActivity.N;
                if (hi8Var == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                l97 l97Var10 = hi8Var.w;
                Boolean bool = Boolean.FALSE;
                l97Var10.getClass();
                l97Var10.l(null, bool);
                webLoginActivity.finish();
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                WebLoginActivity webLoginActivity2 = (WebLoginActivity) this.receiver;
                int i2 = WebLoginActivity.S;
                hi8 hi8Var2 = webLoginActivity2.N;
                if (hi8Var2 == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                l97 l97Var11 = hi8Var2.w;
                Boolean bool2 = Boolean.FALSE;
                l97Var11.getClass();
                l97Var11.l(null, bool2);
                Uri uri = webLoginActivity2.Q;
                if (uri == null) {
                    ye4.a.g("WebLoginActivity", "Retry requested but no auth uri stored");
                    webLoginActivity2.K("LOGIN_NO_BROWSER");
                } else {
                    webLoginActivity2.N(uri);
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((vh8) this.receiver).n.k(null);
                return f88Var;
            default:
                ((vh8) this.receiver).n.k(null);
                return f88Var;
        }
    }
}
