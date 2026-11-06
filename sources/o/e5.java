package o;

import android.os.Looper;
import android.view.Choreographer;
import com.teamviewer.apidefinitions.wakeonlan.infrastructure.ApiClient;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.AccountViewModelLocatorSWIGJNI;
import com.teamviewer.remotecontrollib.swig.DeleteAccountViewModel;
import com.teamviewer.remotecontrollib.swig.DeleteAccountViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2FactoryContainer;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDevicePreferenceViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceViewModelFactorySWIGJNI;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e5 implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ e5(byte b) {
        this.m = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        ITrustedDevicePreferenceViewModelNative iTrustedDevicePreferenceViewModelNative;
        DeleteAccountViewModel deleteAccountViewModel;
        Choreographer choreographer;
        byte b = this.m;
        f88 f88Var = f88.a;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                if (zu1.c == null) {
                    hk0.g("Required value was null.");
                    return null;
                }
                LicenseViewModel licenseViewModelH = di1.h();
                licenseViewModelH.getClass();
                return new f5(licenseViewModelH);
            case 1:
                c36 c36Var = zu1.c;
                if (c36Var == null) {
                    hk0.g("Required value was null.");
                    return null;
                }
                IManagedDeviceV2FactoryContainer iManagedDeviceV2FactoryContainer = c36Var.q;
                LicenseViewModel licenseViewModelH2 = di1.h();
                licenseViewModelH2.getClass();
                long jTrustedDeviceViewModelFactory_GetTrustedDevicePreferenceViewModel = TrustedDeviceViewModelFactorySWIGJNI.TrustedDeviceViewModelFactory_GetTrustedDevicePreferenceViewModel();
                if (jTrustedDeviceViewModelFactory_GetTrustedDevicePreferenceViewModel == 0) {
                    iTrustedDevicePreferenceViewModelNative = null;
                } else {
                    iTrustedDevicePreferenceViewModelNative = new ITrustedDevicePreferenceViewModelNative();
                    iTrustedDevicePreferenceViewModelNative.b = true;
                    iTrustedDevicePreferenceViewModelNative.a = jTrustedDeviceViewModelFactory_GetTrustedDevicePreferenceViewModel;
                }
                iTrustedDevicePreferenceViewModelNative.getClass();
                LogoutViewModel logoutViewModelI = di1.i();
                logoutViewModelI.getClass();
                long jAccountViewModelLocator_GetDeleteAccountViewModel = AccountViewModelLocatorSWIGJNI.AccountViewModelLocator_GetDeleteAccountViewModel();
                if (jAccountViewModelLocator_GetDeleteAccountViewModel == 0) {
                    deleteAccountViewModel = null;
                } else {
                    DeleteAccountViewModel deleteAccountViewModel2 = new DeleteAccountViewModel(DeleteAccountViewModelSWIGJNI.DeleteAccountViewModel_SWIGSmartPtrUpcast(jAccountViewModelLocator_GetDeleteAccountViewModel));
                    deleteAccountViewModel2.d = true;
                    deleteAccountViewModel2.c = jAccountViewModelLocator_GetDeleteAccountViewModel;
                    deleteAccountViewModel = deleteAccountViewModel2;
                }
                deleteAccountViewModel.getClass();
                return new j6(licenseViewModelH2, iTrustedDevicePreferenceViewModelNative, logoutViewModelI, deleteAccountViewModel, iManagedDeviceV2FactoryContainer != null ? iManagedDeviceV2FactoryContainer.a() : null, iManagedDeviceV2FactoryContainer != null ? iManagedDeviceV2FactoryContainer.b() : null);
            case 2:
                d2 d2Var = o06.m;
                return Integer.valueOf(o06.m.a().nextInt(2147418112) + 65536);
            case 3:
                return UUID.randomUUID().toString();
            case 4:
                if (zu1.c != null) {
                    return new p9(0);
                }
                hk0.g("Required value was null.");
                return null;
            case 5:
                return h57.p(ea0.m);
            case 6:
                if (zu1.c != null) {
                    return new vb(0);
                }
                hk0.g("Required value was null.");
                return null;
            case 7:
                pd5 pd5Var = yd.a;
                return nj1.a;
            case 8:
                lh.a("LocalConfiguration");
                throw null;
            case ep1.b /* 9 */:
                lh.a("LocalContext");
                throw null;
            case ep1.c /* 10 */:
                lh.a("LocalImageVectorCache");
                throw null;
            case 11:
                lh.a("LocalResourceIdCache");
                throw null;
            case ep1.d /* 12 */:
                lh.a("LocalView");
                throw null;
            case 13:
                return UUID.randomUUID();
            case 14:
                return "DEFAULT_TEST_TAG";
            case 15:
                return UUID.randomUUID();
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    tk1 tk1Var = g22.a;
                    byte b2 = 2;
                    choreographer = (Choreographer) vn4.u0(ok4.a, new l5(b2, objArr == true ? 1 : 0, b2));
                }
                kl klVar = new kl(choreographer, yo1.x(Looper.getMainLooper()));
                return xk0.G(klVar, klVar.x);
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return f88Var;
            case 20:
                return ApiClient.defaultBasePath_delegate$lambda$9();
            case 21:
                return com.teamviewer.apidefinitions.recentconnections.infrastructure.ApiClient.defaultBasePath_delegate$lambda$9();
            case 22:
                return com.teamviewer.apidefinitions.remotecontrol.infrastructure.ApiClient.defaultBasePath_delegate$lambda$9();
            case 23:
                return com.teamviewer.apidefinitions.rolloutconfigurations.infrastructure.ApiClient.defaultBasePath_delegate$lambda$9();
            case 24:
                return com.teamviewer.apidefinitions.supportsessions.infrastructure.ApiClient.defaultBasePath_delegate$lambda$9();
            case 25:
                return com.teamviewer.apidefinitions.contacts.infrastructure.ApiClient.defaultBasePath_delegate$lambda$9();
            case 26:
                return com.teamviewer.apidefinitions.custommodules.infrastructure.ApiClient.defaultBasePath_delegate$lambda$9();
            case 27:
                return com.teamviewer.apidefinitions.chat.infrastructure.ApiClient.defaultBasePath_delegate$lambda$9();
            case 28:
                return com.teamviewer.apidefinitions.legacydevices.infrastructure.ApiClient.defaultBasePath_delegate$lambda$9();
            default:
                return com.teamviewer.apidefinitions.manageddevices.infrastructure.ApiClient.defaultBasePath_delegate$lambda$9();
        }
    }
}
