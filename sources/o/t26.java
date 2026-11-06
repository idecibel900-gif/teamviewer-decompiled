package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.swig.AccountIdentityValidationViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.AccountViewModelBase;
import com.teamviewer.remotecontrollib.swig.AccountViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.EmailValidationViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.IAccountIdentityValidationViewModel;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModel;
import com.teamviewer.remotecontrollib.swig.IEmailValidationViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IPLSynchronizationStateViewModel;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvaccount.IAccountAndroid;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t26 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ c36 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ BackendContainerAndroid f2072o;

    public /* synthetic */ t26(c36 c36Var, BackendContainerAndroid backendContainerAndroid, byte b) {
        this.m = b;
        this.n = c36Var;
        this.f2072o = backendContainerAndroid;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
        IEmailValidationViewModel iEmailValidationViewModel;
        cg3 cg3Var;
        cg3 cg3Var2;
        switch (this.m) {
            case 0:
                c36 c36Var = this.n;
                BackendContainerAndroid backendContainerAndroid = this.f2072o;
                RemoteControlApplication remoteControlApplication = c36Var.a;
                j93 j93Var = c36Var.p;
                SharedPreferences sharedPreferences = c36Var.b;
                xt6 xt6Var = c36Var.f;
                EventHub eventHub = c36Var.d;
                ICommercialUseViewModel iCommercialUseViewModelI = im3.i();
                long jAccountIdentityValidationViewModelFactory_GetAccountIdentityValidationViewModel = AccountIdentityValidationViewModelFactorySWIGJNI.AccountIdentityValidationViewModelFactory_GetAccountIdentityValidationViewModel();
                ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = null;
                if (jAccountIdentityValidationViewModelFactory_GetAccountIdentityValidationViewModel == 0) {
                    iAccountIdentityValidationViewModel = null;
                } else {
                    IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2 = new IAccountIdentityValidationViewModel();
                    iAccountIdentityValidationViewModel2.b = true;
                    iAccountIdentityValidationViewModel2.a = jAccountIdentityValidationViewModelFactory_GetAccountIdentityValidationViewModel;
                    iAccountIdentityValidationViewModel = iAccountIdentityValidationViewModel2;
                }
                long jEmailValidationViewModelFactory_GetEmailValidationViewModel = EmailValidationViewModelFactorySWIGJNI.EmailValidationViewModelFactory_GetEmailValidationViewModel();
                if (jEmailValidationViewModelFactory_GetEmailValidationViewModel == 0) {
                    iEmailValidationViewModel = null;
                } else {
                    iEmailValidationViewModel = new IEmailValidationViewModel();
                    iEmailValidationViewModel.b = true;
                    iEmailValidationViewModel.a = jEmailValidationViewModelFactory_GetEmailValidationViewModel;
                }
                ep3 ep3Var = c36Var.j;
                ep3 ep3Var2 = it1.c;
                if (ep3Var2 == null) {
                    im3.e0("viewFactory");
                    throw null;
                }
                IPLSynchronizationStateViewModel iPLSynchronizationStateViewModelP = ds1.p();
                long jAccountViewModelFactory_GetAccountViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetAccountViewModel();
                AccountViewModelBase accountViewModelBase = jAccountViewModelFactory_GetAccountViewModel == 0 ? null : new AccountViewModelBase(jAccountViewModelFactory_GetAccountViewModel);
                accountViewModelBase.getClass();
                long jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetPLFragmentContainerLoginViewModel();
                if (jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel != 0) {
                    iLoginStateAwareContainerViewModel = new ILoginStateAwareContainerViewModel(jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel);
                }
                iLoginStateAwareContainerViewModel.getClass();
                BackendContainerAndroid backendContainerAndroid2 = backendContainerAndroid;
                LicenseViewModel licenseViewModelH = di1.h();
                licenseViewModelH.getClass();
                IInAppPurchaseViewModel iInAppPurchaseViewModelD = et1.d();
                iInAppPurchaseViewModelD.getClass();
                RemoteControlApplication remoteControlApplication2 = c36Var.a;
                if (cg3.i != null) {
                    cg3Var = cg3.i;
                    cg3Var.getClass();
                    backendContainerAndroid2 = backendContainerAndroid2;
                } else {
                    synchronized (cg3.class) {
                        try {
                            if (cg3.i == null) {
                                cg3.i = new cg3(remoteControlApplication2);
                            }
                            cg3Var = cg3.i;
                            cg3Var.getClass();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                IAccountAndroid iAccountAndroidGetAccount = backendContainerAndroid2.GetAccount();
                iAccountAndroidGetAccount.getClass();
                return new nk4(remoteControlApplication, j93Var, sharedPreferences, xt6Var, eventHub, iCommercialUseViewModelI, iAccountIdentityValidationViewModel, iEmailValidationViewModel, ep3Var, ep3Var2, iPLSynchronizationStateViewModelP, accountViewModelBase, iLoginStateAwareContainerViewModel, licenseViewModelH, iInAppPurchaseViewModelD, new yt2(cg3Var, iAccountAndroidGetAccount, new xz2((byte) 26)), new d82((byte) 27));
            default:
                c36 c36Var2 = this.n;
                BackendContainerAndroid backendContainerAndroid3 = this.f2072o;
                IInAppPurchaseViewModel iInAppPurchaseViewModelD2 = et1.d();
                iInAppPurchaseViewModelD2.getClass();
                RemoteControlApplication remoteControlApplication3 = c36Var2.a;
                if (cg3.i != null) {
                    cg3Var2 = cg3.i;
                    cg3Var2.getClass();
                } else {
                    synchronized (cg3.class) {
                        try {
                            if (cg3.i == null) {
                                cg3.i = new cg3(remoteControlApplication3);
                            }
                            cg3Var2 = cg3.i;
                            cg3Var2.getClass();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                IAccountAndroid iAccountAndroidGetAccount2 = backendContainerAndroid3.GetAccount();
                iAccountAndroidGetAccount2.getClass();
                return new tf3(iInAppPurchaseViewModelD2, new yt2(cg3Var2, iAccountAndroidGetAccount2, new xz2((byte) 26)));
        }
    }
}
