package o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.remotecontrollib.swig.AccountViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.BiometricsStatisticsViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.ConnectFragmentViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.ConnectInterfaceViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.IBannerViewModel;
import com.teamviewer.remotecontrollib.swig.IBiometricsStatisticsViewModel;
import com.teamviewer.remotecontrollib.swig.IConnectFragmentViewModel;
import com.teamviewer.remotecontrollib.swig.IConnectInterfaceViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.INavigationViewModel;
import com.teamviewer.remotecontrollib.swig.INearbyDevicesViewModel;
import com.teamviewer.remotecontrollib.swig.IPredefinedShortcutsViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteControlLoginViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenKeyboardViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenKeyboardViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.NavigationViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.NearbyDevicesViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2FactoryContainer;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q26 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ c36 n;

    public /* synthetic */ q26(c36 c36Var, byte b) {
        this.m = b;
        this.n = c36Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        IConnectFragmentViewModel iConnectFragmentViewModel;
        IBannerViewModel iBannerViewModel;
        du6 du6VarT;
        vc3 vc3VarA;
        oh3 oh3Var;
        IRemoteControlLoginViewModel iRemoteControlLoginViewModel;
        byte b = this.m;
        IConnectInterfaceViewModel iConnectInterfaceViewModel = null;
        INearbyDevicesViewModel iNearbyDevicesViewModel = null;
        IBiometricsStatisticsViewModel iBiometricsStatisticsViewModel = null;
        INavigationViewModel iNavigationViewModel = null;
        c36 c36Var = this.n;
        switch (b) {
            case 0:
                return new nc0(c36Var.h, c36Var.f, c36Var.a);
            case 1:
                return new k72(c36Var.c);
            case 2:
                LockManager lockManager = c36Var.l;
                LogoutViewModel logoutViewModelI = di1.i();
                logoutViewModelI.getClass();
                return new he4(lockManager, logoutViewModelI, c36Var.f, c36Var.g);
            case 3:
                xt6 xt6Var = c36Var.f;
                EventHub eventHub = c36Var.d;
                Resources resources = c36Var.a.getResources();
                resources.getClass();
                return new ni7(xt6Var, eventHub, resources);
            case 4:
                return new f41(c36Var.h, (nc0) c36Var.r.getValue());
            case 5:
                return new ck7(c36Var.f);
            case 6:
                return new kl7(((zt6) c36Var.f).f);
            case 7:
                long jConnectInterfaceViewModelFactory_GetConnectInterfaceViewModel = ConnectInterfaceViewModelFactorySWIGJNI.ConnectInterfaceViewModelFactory_GetConnectInterfaceViewModel();
                if (jConnectInterfaceViewModelFactory_GetConnectInterfaceViewModel != 0) {
                    iConnectInterfaceViewModel = new IConnectInterfaceViewModel();
                    iConnectInterfaceViewModel.b = true;
                    iConnectInterfaceViewModel.a = jConnectInterfaceViewModelFactory_GetConnectInterfaceViewModel;
                }
                iConnectInterfaceViewModel.getClass();
                return new b31(iConnectInterfaceViewModel, c36Var.f, new d31(c36Var.a), c36Var.m);
            case 8:
                Resources resources2 = c36Var.a.getResources();
                resources2.getClass();
                return new uu6(resources2, c36Var.d, c36Var.k, c36Var.f);
            case ep1.b /* 9 */:
                RemoteControlApplication remoteControlApplication = c36Var.a;
                SharedPreferences sharedPreferences = c36Var.b;
                j93 j93Var = c36Var.p;
                long jNavigationViewModelFactory_GetNavigationViewModel = NavigationViewModelFactorySWIGJNI.NavigationViewModelFactory_GetNavigationViewModel();
                if (jNavigationViewModelFactory_GetNavigationViewModel != 0) {
                    iNavigationViewModel = new INavigationViewModel();
                    iNavigationViewModel.b = true;
                    iNavigationViewModel.a = jNavigationViewModelFactory_GetNavigationViewModel;
                }
                return new v05(remoteControlApplication, sharedPreferences, j93Var, iNavigationViewModel);
            case ep1.c /* 10 */:
                long jConnectFragmentViewModelFactory_GetConnectFragmentViewModel = ConnectFragmentViewModelFactorySWIGJNI.ConnectFragmentViewModelFactory_GetConnectFragmentViewModel();
                if (jConnectFragmentViewModelFactory_GetConnectFragmentViewModel == 0) {
                    iConnectFragmentViewModel = null;
                } else {
                    IConnectFragmentViewModel iConnectFragmentViewModel2 = new IConnectFragmentViewModel();
                    iConnectFragmentViewModel2.b = true;
                    iConnectFragmentViewModel2.a = jConnectFragmentViewModelFactory_GetConnectFragmentViewModel;
                    iConnectFragmentViewModel = iConnectFragmentViewModel2;
                }
                long jAccountViewModelFactory_GetBannerViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetBannerViewModel();
                if (jAccountViewModelFactory_GetBannerViewModel == 0) {
                    iBannerViewModel = null;
                } else {
                    IBannerViewModel iBannerViewModel2 = new IBannerViewModel();
                    iBannerViewModel2.b = true;
                    iBannerViewModel2.a = jAccountViewModelFactory_GetBannerViewModel;
                    iBannerViewModel = iBannerViewModel2;
                }
                iBannerViewModel.getClass();
                long jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetPLFragmentContainerLoginViewModel();
                ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel != 0 ? new ILoginStateAwareContainerViewModel(jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel) : null;
                iLoginStateAwareContainerViewModel.getClass();
                LicenseViewModel licenseViewModelH = di1.h();
                licenseViewModelH.getClass();
                cg3 cg3Var = cg3.i;
                IInAppPurchaseViewModel iInAppPurchaseViewModelD = et1.d();
                iInAppPurchaseViewModelD.getClass();
                return new y31(iConnectFragmentViewModel, iBannerViewModel, iLoginStateAwareContainerViewModel, licenseViewModelH, new wf3(cg3Var, iInAppPurchaseViewModelD, EventHub.e.f()), c36Var.b, c36Var.e());
            case 11:
                SharedPreferences sharedPreferences2 = c36Var.b;
                long jBiometricsStatisticsViewModelFactory_GetBiometricsStatisticsViewModel = BiometricsStatisticsViewModelFactorySWIGJNI.BiometricsStatisticsViewModelFactory_GetBiometricsStatisticsViewModel();
                if (jBiometricsStatisticsViewModelFactory_GetBiometricsStatisticsViewModel != 0) {
                    iBiometricsStatisticsViewModel = new IBiometricsStatisticsViewModel();
                    iBiometricsStatisticsViewModel.b = true;
                    iBiometricsStatisticsViewModel.a = jBiometricsStatisticsViewModelFactory_GetBiometricsStatisticsViewModel;
                }
                iBiometricsStatisticsViewModel.getClass();
                return new y60(sharedPreferences2, iBiometricsStatisticsViewModel);
            case ep1.d /* 12 */:
                c36Var.a.getResources().getClass();
                return new q7();
            case 13:
                return new jl7(c36Var.f, c36Var.c);
            case 14:
                long jNearbyDevicesViewModelFactory_GetNearbyDevicesViewModel = NearbyDevicesViewModelFactorySWIGJNI.NearbyDevicesViewModelFactory_GetNearbyDevicesViewModel();
                if (jNearbyDevicesViewModelFactory_GetNearbyDevicesViewModel != 0) {
                    iNearbyDevicesViewModel = new INearbyDevicesViewModel();
                    iNearbyDevicesViewModel.b = true;
                    iNearbyDevicesViewModel.a = jNearbyDevicesViewModelFactory_GetNearbyDevicesViewModel;
                }
                iNearbyDevicesViewModel.getClass();
                return new q15(iNearbyDevicesViewModel, new o10(c36Var.a), c36Var.n, c36Var.f484o);
            case 15:
                mo7 mo7Var = ((zt6) c36Var.f).f;
                if (mo7Var instanceof wc3) {
                    int i = ((a2) ((ec3) mo7Var)).p.c;
                    if (4096 > i || i >= 8192) {
                        vc3VarA = i == 32768 ? vc3.OSVersion_Linux : vc3.Unknown;
                    } else {
                        vc3VarA = vc3.OSVersion_OSX;
                    }
                    oh3Var = ((eu6) ((wc3) mo7Var)).g();
                } else {
                    if (mo7Var == null || (du6VarT = mo7Var.t()) == null || !du6VarT.p) {
                        hk0.l("No proper session");
                        return null;
                    }
                    IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModelI = xo1.i(mo7Var.w());
                    vc3VarA = iRemoteScreenKeyboardViewModelI.a();
                    oh3Var = im3.n(NativeLiveDataBool.newInstance(IRemoteScreenKeyboardViewModelSWIGJNI.IRemoteScreenKeyboardViewModel_IsInputAllowed(iRemoteScreenKeyboardViewModelI.a, iRemoteScreenKeyboardViewModelI), false).getValue(), Boolean.TRUE) ? new oh3(new l07((Object) iRemoteScreenKeyboardViewModelI, (byte) 23)) : null;
                }
                IPredefinedShortcutsViewModel iPredefinedShortcutsViewModelG = wo1.g();
                iPredefinedShortcutsViewModelG.getClass();
                return new n16(vc3VarA, oh3Var, iPredefinedShortcutsViewModelG);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                IManagedDeviceV2FactoryContainer iManagedDeviceV2FactoryContainer = c36Var.q;
                return new ce0(iManagedDeviceV2FactoryContainer != null ? iManagedDeviceV2FactoryContainer.b() : null);
            case 17:
                return new v60(c36Var.b);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new bl7(c36Var.f);
            default:
                long jAccountViewModelFactory_GetLoginViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetLoginViewModel();
                if (jAccountViewModelFactory_GetLoginViewModel == 0) {
                    iRemoteControlLoginViewModel = null;
                } else {
                    iRemoteControlLoginViewModel = new IRemoteControlLoginViewModel();
                    iRemoteControlLoginViewModel.b = true;
                    iRemoteControlLoginViewModel.a = jAccountViewModelFactory_GetLoginViewModel;
                }
                iRemoteControlLoginViewModel.getClass();
                long jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel2 = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetPLFragmentContainerLoginViewModel();
                ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel2 = jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel2 != 0 ? new ILoginStateAwareContainerViewModel(jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel2) : null;
                iLoginStateAwareContainerViewModel2.getClass();
                return new hi8(iRemoteControlLoginViewModel, iLoginStateAwareContainerViewModel2, c36Var.c);
        }
    }
}
