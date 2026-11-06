package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModel;
import com.teamviewer.remotecontrollib.swig.IPredefinedShortcutsViewModel;
import com.teamviewer.remotecontrollib.swig.IQuickActionsViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenKeyboardViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenMouseViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenTouchViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteSupportSessionViewModel;
import com.teamviewer.remotecontrollib.swig.QuickActionsViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.RemoteScreenViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IChangeResolutionViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.SessionSettingsViewModelFactorySWIGJNI;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;

/* JADX INFO: loaded from: classes.dex */
public final class n26 implements se8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mo7 b;
    public final /* synthetic */ au2 c;

    public /* synthetic */ n26(au2 au2Var, mo7 mo7Var, byte b) {
        this.a = b;
        this.c = au2Var;
        this.b = mo7Var;
    }

    @Override // o.se8
    public final oe8 a(Class cls) {
        IRemoteSupportSessionViewModel iRemoteSupportSessionViewModel;
        IRemoteScreenTouchViewModel iRemoteScreenTouchViewModel;
        IChangeResolutionViewModel iChangeResolutionViewModel;
        byte b = this.a;
        IRemoteScreenViewModel iRemoteScreenViewModel = null;
        IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel = null;
        IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel2 = null;
        au2 au2Var = this.c;
        mo7 mo7Var = this.b;
        switch (b) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) au2Var.c;
                EventHub eventHub = (EventHub) au2Var.d;
                long jRemoteScreenViewModelsFactory_GetRemoteScreenViewModel = RemoteScreenViewModelFactorySWIGJNI.RemoteScreenViewModelsFactory_GetRemoteScreenViewModel(mo7Var.w());
                if (jRemoteScreenViewModelsFactory_GetRemoteScreenViewModel != 0) {
                    iRemoteScreenViewModel = new IRemoteScreenViewModel();
                    iRemoteScreenViewModel.b = true;
                    iRemoteScreenViewModel.a = jRemoteScreenViewModelsFactory_GetRemoteScreenViewModel;
                }
                iRemoteScreenViewModel.getClass();
                return new bz4(sharedPreferences, eventHub, iRemoteScreenViewModel);
            case 1:
                wc3 wc3Var = (wc3) mo7Var;
                return new yi4(wc3Var, (SharedPreferences) au2Var.c, new g95(), (io.sentry.android.core.n1) au2Var.i, new kv4((RemoteControlApplication) au2Var.b), (xt6) au2Var.f, (EventHub) au2Var.d, im3.i(), new z60(new fp1(wc3Var, (s7) au2Var.g, (EventHub) au2Var.d), (j93) au2Var.e), (j93) au2Var.e);
            case 2:
                xt6 xt6Var = (xt6) au2Var.f;
                long jRemoteScreenViewModelsFactory_GetRemoteSupportSessionViewModel = RemoteScreenViewModelFactorySWIGJNI.RemoteScreenViewModelsFactory_GetRemoteSupportSessionViewModel(mo7Var.w());
                if (jRemoteScreenViewModelsFactory_GetRemoteSupportSessionViewModel == 0) {
                    iRemoteSupportSessionViewModel = null;
                } else {
                    IRemoteSupportSessionViewModel iRemoteSupportSessionViewModel2 = new IRemoteSupportSessionViewModel();
                    iRemoteSupportSessionViewModel2.b = true;
                    iRemoteSupportSessionViewModel2.a = jRemoteScreenViewModelsFactory_GetRemoteSupportSessionViewModel;
                    iRemoteSupportSessionViewModel = iRemoteSupportSessionViewModel2;
                }
                iRemoteSupportSessionViewModel.getClass();
                IRemoteScreenInformationViewModel iRemoteScreenInformationViewModelH = xo1.h(mo7Var.w());
                iRemoteScreenInformationViewModelH.getClass();
                IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModelI = xo1.i(mo7Var.w());
                iRemoteScreenKeyboardViewModelI.getClass();
                long jRemoteScreenViewModelsFactory_GetRemoteScreenTouchViewModel = RemoteScreenViewModelFactorySWIGJNI.RemoteScreenViewModelsFactory_GetRemoteScreenTouchViewModel(mo7Var.w());
                if (jRemoteScreenViewModelsFactory_GetRemoteScreenTouchViewModel == 0) {
                    iRemoteScreenTouchViewModel = null;
                } else {
                    IRemoteScreenTouchViewModel iRemoteScreenTouchViewModel2 = new IRemoteScreenTouchViewModel();
                    iRemoteScreenTouchViewModel2.b = true;
                    iRemoteScreenTouchViewModel2.a = jRemoteScreenViewModelsFactory_GetRemoteScreenTouchViewModel;
                    iRemoteScreenTouchViewModel = iRemoteScreenTouchViewModel2;
                }
                iRemoteScreenTouchViewModel.getClass();
                long jRemoteScreenViewModelsFactory_GetRemoteScreenMouseViewModel = RemoteScreenViewModelFactorySWIGJNI.RemoteScreenViewModelsFactory_GetRemoteScreenMouseViewModel(mo7Var.w());
                if (jRemoteScreenViewModelsFactory_GetRemoteScreenMouseViewModel != 0) {
                    iRemoteScreenMouseViewModel2 = new IRemoteScreenMouseViewModel();
                    iRemoteScreenMouseViewModel2.b = true;
                    iRemoteScreenMouseViewModel2.a = jRemoteScreenViewModelsFactory_GetRemoteScreenMouseViewModel;
                }
                IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel3 = iRemoteScreenMouseViewModel2;
                iRemoteScreenMouseViewModel3.getClass();
                ICommercialUseViewModel iCommercialUseViewModelI = im3.i();
                iCommercialUseViewModelI.getClass();
                return new mz4(xt6Var, iRemoteSupportSessionViewModel, iRemoteScreenInformationViewModelH, iRemoteScreenKeyboardViewModelI, iRemoteScreenTouchViewModel, iRemoteScreenMouseViewModel3, iCommercialUseViewModelI, (j93) au2Var.e, new kv4((RemoteControlApplication) au2Var.b), (SharedPreferences) au2Var.c, (EventHub) au2Var.d);
            case 3:
                wc3 wc3Var2 = (wc3) mo7Var;
                ep3 ep3Var = new ep3(new fp1(wc3Var2, (s7) au2Var.g, (EventHub) au2Var.d), (j93) au2Var.e);
                s7 s7Var = (s7) au2Var.g;
                EventHub eventHub2 = (EventHub) au2Var.d;
                g95 g95Var = new g95();
                g95 g95Var2 = new g95(wc3Var2);
                xt6 xt6Var2 = (xt6) au2Var.f;
                ICommercialUseViewModel iCommercialUseViewModelI2 = im3.i();
                io.sentry.android.core.n1 n1Var = (io.sentry.android.core.n1) au2Var.i;
                IPredefinedShortcutsViewModel iPredefinedShortcutsViewModelG = wo1.g();
                iPredefinedShortcutsViewModelG.getClass();
                return new d16(wc3Var2, ep3Var, s7Var, eventHub2, g95Var, g95Var2, xt6Var2, iCommercialUseViewModelI2, n1Var, iPredefinedShortcutsViewModelG, (j93) au2Var.e, (qi7) au2Var.k);
            default:
                long jSessionSettingsViewModelFactory_GetChangeResolutionViewModel = SessionSettingsViewModelFactorySWIGJNI.SessionSettingsViewModelFactory_GetChangeResolutionViewModel(mo7Var.w());
                if (jSessionSettingsViewModelFactory_GetChangeResolutionViewModel == 0) {
                    iChangeResolutionViewModel = null;
                } else {
                    iChangeResolutionViewModel = new IChangeResolutionViewModel();
                    iChangeResolutionViewModel.b = true;
                    iChangeResolutionViewModel.a = jSessionSettingsViewModelFactory_GetChangeResolutionViewModel;
                }
                iChangeResolutionViewModel.getClass();
                IRemoteScreenInformationViewModel iRemoteScreenInformationViewModelH2 = xo1.h(mo7Var.w());
                iRemoteScreenInformationViewModelH2.getClass();
                cg3 cg3Var = new cg3(iChangeResolutionViewModel, iRemoteScreenInformationViewModelH2, (j93) au2Var.e, (SharedPreferences) au2Var.c);
                xt6 xt6Var3 = (xt6) au2Var.f;
                IRemoteScreenInformationViewModel iRemoteScreenInformationViewModelH3 = xo1.h(mo7Var.w());
                iRemoteScreenInformationViewModelH3.getClass();
                long jQuickActionsViewModelFactory_GetQuickActionsViewModel = QuickActionsViewModelFactorySWIGJNI.QuickActionsViewModelFactory_GetQuickActionsViewModel(mo7Var.w());
                IQuickActionsViewModel iQuickActionsViewModel = jQuickActionsViewModelFactory_GetQuickActionsViewModel == 0 ? null : new IQuickActionsViewModel(jQuickActionsViewModelFactory_GetQuickActionsViewModel);
                iQuickActionsViewModel.getClass();
                IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModelI2 = xo1.i(mo7Var.w());
                iRemoteScreenKeyboardViewModelI2.getClass();
                oh3 oh3Var = new oh3(new l07((Object) iRemoteScreenKeyboardViewModelI2, (byte) 23));
                long jRemoteScreenViewModelsFactory_GetRemoteScreenMouseViewModel2 = RemoteScreenViewModelFactorySWIGJNI.RemoteScreenViewModelsFactory_GetRemoteScreenMouseViewModel(mo7Var.w());
                if (jRemoteScreenViewModelsFactory_GetRemoteScreenMouseViewModel2 != 0) {
                    iRemoteScreenMouseViewModel = new IRemoteScreenMouseViewModel();
                    iRemoteScreenMouseViewModel.b = true;
                    iRemoteScreenMouseViewModel.a = jRemoteScreenViewModelsFactory_GetRemoteScreenMouseViewModel2;
                }
                iRemoteScreenMouseViewModel.getClass();
                ICommercialUseViewModel iCommercialUseViewModelI3 = im3.i();
                iCommercialUseViewModelI3.getClass();
                IPredefinedShortcutsViewModel iPredefinedShortcutsViewModelG2 = wo1.g();
                iPredefinedShortcutsViewModelG2.getClass();
                return new pz4(xt6Var3, iRemoteScreenInformationViewModelH3, iQuickActionsViewModel, oh3Var, iRemoteScreenMouseViewModel, iCommercialUseViewModelI3, iPredefinedShortcutsViewModelG2, (j93) au2Var.e, (s7) au2Var.g, (SharedPreferences) au2Var.c, (EventHub) au2Var.d, (qi7) au2Var.k, cg3Var);
        }
    }

    public /* synthetic */ n26(mo7 mo7Var, au2 au2Var, byte b) {
        this.a = b;
        this.b = mo7Var;
        this.c = au2Var;
    }
}
