package o;

import com.teamviewer.commonviewmodel.swig.ErrorCode;
import com.teamviewer.remotecontrollib.swig.AccountViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.DeleteAccountViewModel;
import com.teamviewer.remotecontrollib.swig.DeleteAccountViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LoginState;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModelSWIGJNI;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f6 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ j6 n;

    public /* synthetic */ f6(j6 j6Var, byte b) {
        this.m = b;
        this.n = j6Var;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.m;
        boolean z2 = true;
        f88 f88Var = f88.a;
        byte b2 = 3;
        hc1 hc1Var = null;
        boolean z3 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        j6 j6Var = this.n;
        switch (b) {
            case 0:
                ((ErrorCode) obj).getClass();
                ye4.a("AccountViewModel", "Error during deleting account");
                im3.R(e8.n(j6Var), null, null, new i6(j6Var, hc1Var, b2), 3);
                return f88Var;
            case 1:
                ((LoginState) obj).getClass();
                l97 l97Var = j6Var.A;
                a6 a6Var = (a6) l97Var.getValue();
                a6Var.getClass();
                LogoutViewModel logoutViewModel = j6Var.p;
                l97Var.k(a6.a(a6Var, null, null, null, null, false, false, false, LogoutViewModelSWIGJNI.LogoutViewModel_IsEnabled(logoutViewModel.c, logoutViewModel), false, null, 895));
                a6 a6Var2 = (a6) l97Var.getValue();
                a6Var2.getClass();
                if (LogoutViewModelSWIGJNI.LogoutViewModel_IsEnabled(logoutViewModel.c, logoutViewModel)) {
                    z = true;
                } else {
                    DeleteAccountViewModel deleteAccountViewModel = j6Var.q;
                    if (DeleteAccountViewModelSWIGJNI.DeleteAccountViewModel_IsAccountLoggedIn(deleteAccountViewModel.c, deleteAccountViewModel)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                l97Var.k(a6.a(a6Var2, null, null, null, null, false, false, z, false, false, null, 959));
                if (!LogoutViewModelSWIGJNI.LogoutViewModel_IsEnabled(logoutViewModel.c, logoutViewModel)) {
                    im3.R(e8.n(j6Var), null, null, new g6(j6Var, z2, hc1Var, objArr == true ? 1 : 0), 3);
                }
                return f88Var;
            case 2:
                ((LoginState) obj).getClass();
                l97 l97Var2 = j6Var.A;
                a6 a6Var3 = (a6) l97Var2.getValue();
                a6Var3.getClass();
                DeleteAccountViewModel deleteAccountViewModel2 = j6Var.q;
                l97Var2.k(a6.a(a6Var3, null, null, null, null, false, false, false, false, DeleteAccountViewModelSWIGJNI.DeleteAccountViewModel_IsAccountLoggedIn(deleteAccountViewModel2.c, deleteAccountViewModel2), null, 767));
                a6 a6Var4 = (a6) l97Var2.getValue();
                a6Var4.getClass();
                LogoutViewModel logoutViewModel2 = j6Var.p;
                l97Var2.k(a6.a(a6Var4, null, null, null, null, false, false, LogoutViewModelSWIGJNI.LogoutViewModel_IsEnabled(logoutViewModel2.c, logoutViewModel2) || DeleteAccountViewModelSWIGJNI.DeleteAccountViewModel_IsAccountLoggedIn(deleteAccountViewModel2.c, deleteAccountViewModel2), false, false, null, 959));
                return f88Var;
            case 3:
                ((ErrorCode) obj).getClass();
                ye4.a("AccountViewModel", "Error during sign out");
                im3.R(e8.n(j6Var), null, null, new g6(j6Var, z3, hc1Var, objArr2 == true ? 1 : 0), 3);
                return f88Var;
            default:
                a6 a6Var5 = (a6) obj;
                a6Var5.getClass();
                LicenseViewModel licenseViewModel = j6Var.n;
                String strLicenseViewModel_GetAccountName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountName(licenseViewModel.a, licenseViewModel);
                if (strLicenseViewModel_GetAccountName == null) {
                    strLicenseViewModel_GetAccountName = "";
                }
                String str = strLicenseViewModel_GetAccountName.length() == 0 ? null : strLicenseViewModel_GetAccountName;
                String strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                if (strLicenseViewModel_GetAccountLoginName == null) {
                    strLicenseViewModel_GetAccountLoginName = "";
                }
                String str2 = strLicenseViewModel_GetAccountLoginName.length() == 0 ? null : strLicenseViewModel_GetAccountLoginName;
                String strLicenseViewModel_GetLicenseSimpleName = LicenseViewModelSWIGJNI.LicenseViewModel_GetLicenseSimpleName(licenseViewModel.a, licenseViewModel);
                String str3 = strLicenseViewModel_GetLicenseSimpleName != null ? strLicenseViewModel_GetLicenseSimpleName : "";
                String str4 = str3.length() == 0 ? null : str3;
                String strAccountViewModelFactory_GetPictureUrl = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetPictureUrl();
                strAccountViewModelFactory_GetPictureUrl.getClass();
                return a6.a(a6Var5, str, str2, str4, strAccountViewModelFactory_GetPictureUrl.length() == 0 ? null : strAccountViewModelFactory_GetPictureUrl, false, false, false, false, false, null, 1008);
        }
    }
}
