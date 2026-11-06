package o;

import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh6 implements s84 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ yh6(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // o.s84
    public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
        LicenseViewModel licenseViewModel;
        String strLicenseViewModel_GetAccountName;
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                zh6 zh6Var = (zh6) obj;
                if (l84Var == l84.ON_START) {
                    zh6Var.h = true;
                } else if (l84Var == l84.ON_STOP) {
                    zh6Var.h = false;
                }
                break;
            case 1:
                hw6 hw6Var = (hw6) obj;
                if (aw6.a[l84Var.ordinal()] == 1) {
                    l97 l97Var = hw6Var.x;
                    dw6 dw6Var = (dw6) l97Var.getValue();
                    dw6Var.getClass();
                    LogoutViewModel logoutViewModel = hw6Var.n;
                    l97Var.l(null, dw6.a(dw6Var, (logoutViewModel == null || !LogoutViewModelSWIGJNI.LogoutViewModel_IsEnabled(logoutViewModel.c, logoutViewModel) || (licenseViewModel = hw6Var.f1014o) == null || (strLicenseViewModel_GetAccountName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountName(licenseViewModel.a, licenseViewModel)) == null || strLicenseViewModel_GetAccountName.length() <= 0) ? false : true, false, false, false, false, false, false, false, false, null, false, false, false, 32766));
                }
                break;
            default:
                u0 u0Var = (u0) obj;
                if (l84Var == l84.ON_DESTROY) {
                    u0Var.e();
                }
                break;
        }
    }
}
