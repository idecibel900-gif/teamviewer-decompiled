package o;

import android.graphics.PathMeasure;
import com.teamviewer.apidefinitions.account.apis.AccountApi;
import com.teamviewer.apidefinitions.chat.apis.ChatApi;
import com.teamviewer.apidefinitions.contacts.apis.ContactsApi;
import com.teamviewer.apidefinitions.manageddevices.apis.ManageddevicesApi;
import com.teamviewer.apidefinitions.recentconnections.apis.RecentconnectionsApi;
import com.teamviewer.apidefinitions.rolloutconfigurations.apis.RolloutconfigurationsApi;
import com.teamviewer.apidefinitions.supportsessions.apis.SupportsessionsApi;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.pilotsessionlib.swig.viewmodel.factory.ViewManagerViewModelFactorySWIGJNI;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.IViewManagerViewModel;
import com.teamviewer.remotecontrollib.swig.AccountViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.ILoggedInOnlineStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoredDeviceAlarmSumsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MonitoredDeviceAlarmSumsViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.PilotSessionActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationNotificationViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.IAudioPermissionClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IQRCodeMDV2AssignmentViewModelClient;
import com.teamviewer.remotecontrolviewmodellib.swig.QRCodeMDV2AssignmentViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.SessionWindowViewModelFactoryClientSWIGJNI;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x85 implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ x85(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = 4;
        IAudioPermissionClientViewModel iAudioPermissionClientViewModel = null;
        IMonitoredDeviceAlarmSumsViewModel iMonitoredDeviceAlarmSumsViewModel = null;
        ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative = null;
        ILoggedInOnlineStateAwareContainerViewModel iLoggedInOnlineStateAwareContainerViewModel = null;
        IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient = null;
        switch (b) {
            case 0:
                return (ChatApi) ((kh7) new d11(ChatApi.class, "https://teamviewer-internal-b1f1235a/api/chat/v1/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            case 1:
                return (ContactsApi) ((kh7) new d11(ContactsApi.class, "https://teamviewer-internal-b1f1235a/api/contacts/v1/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            case 2:
                return (ManageddevicesApi) ((kh7) new d11(ManageddevicesApi.class, "https://teamviewer-internal-b1f1235a/api/manageddevices/v2/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            case 3:
                return (SupportsessionsApi) ((kh7) new d11(SupportsessionsApi.class, "https://teamviewer-internal-b1f1235a/api/supportsessions/v1/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            case 4:
                return (RolloutconfigurationsApi) ((kh7) new d11(RolloutconfigurationsApi.class, "https://teamviewer-internal-b1f1235a/api/rolloutconfigurations/v1/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            case 5:
                return (AccountApi) ((kh7) new d11(AccountApi.class, "https://teamviewer-internal-b1f1235a/api/account/v1/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            case 6:
                return (RecentconnectionsApi) ((kh7) new d11(RecentconnectionsApi.class, "https://teamviewer-internal-b1f1235a/api/recentconnections/v1/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            case 7:
                return new ic5();
            case 8:
                h72 h72Var = ne5.a;
                return mj1.a;
            case ep1.b /* 9 */:
                return new sj(new PathMeasure());
            case ep1.c /* 10 */:
                return h57.p(Boolean.TRUE);
            case 11:
                int i = PilotSessionActivity.U;
                long jViewManagerViewModelFactory_GetViewManagerViewModel = ViewManagerViewModelFactorySWIGJNI.ViewManagerViewModelFactory_GetViewManagerViewModel();
                if (jViewManagerViewModelFactory_GetViewManagerViewModel == 0) {
                    return null;
                }
                IViewManagerViewModel iViewManagerViewModel = new IViewManagerViewModel();
                iViewManagerViewModel.b = true;
                iViewManagerViewModel.a = jViewManagerViewModelFactory_GetViewManagerViewModel;
                return iViewManagerViewModel;
            case ep1.d /* 12 */:
                long jPilotViewerViewModelFactoryNative_GetAudioPermissionViewModel = SessionWindowViewModelFactoryClientSWIGJNI.PilotViewerViewModelFactoryNative_GetAudioPermissionViewModel();
                if (jPilotViewerViewModelFactoryNative_GetAudioPermissionViewModel != 0) {
                    iAudioPermissionClientViewModel = new IAudioPermissionClientViewModel();
                    iAudioPermissionClientViewModel.f72o = true;
                    iAudioPermissionClientViewModel.n = jPilotViewerViewModelFactoryNative_GetAudioPermissionViewModel;
                }
                iAudioPermissionClientViewModel.getClass();
                return iAudioPermissionClientViewModel;
            case 13:
                return f88Var;
            case 14:
                return null;
            case 15:
                tk1 tk1Var = g22.a;
                return gk1.f901o;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return null;
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                if (zu1.c == null) {
                    hk0.g("Required value was null.");
                    return null;
                }
                long jQRCodeMDV2AssignmentViewModelFactory_GetQRCodeMDV2AssignmentViewModel = QRCodeMDV2AssignmentViewModelFactorySWIGJNI.QRCodeMDV2AssignmentViewModelFactory_GetQRCodeMDV2AssignmentViewModel();
                if (jQRCodeMDV2AssignmentViewModelFactory_GetQRCodeMDV2AssignmentViewModel != 0) {
                    iQRCodeMDV2AssignmentViewModelClient = new IQRCodeMDV2AssignmentViewModelClient();
                    iQRCodeMDV2AssignmentViewModelClient.b = true;
                    iQRCodeMDV2AssignmentViewModelClient.a = jQRCodeMDV2AssignmentViewModelFactory_GetQRCodeMDV2AssignmentViewModel;
                }
                iQRCodeMDV2AssignmentViewModelClient.getClass();
                return new tx5(iQRCodeMDV2AssignmentViewModelClient);
            case 20:
                return h57.p("");
            case 21:
                return h57.p(Boolean.FALSE);
            case 22:
                return new yf5(3);
            case 23:
                return h57.p(Boolean.FALSE);
            case 24:
                return h57.p(Boolean.FALSE);
            case 25:
                int i2 = RCClientActivity.c0;
                c36 c36Var = zu1.c;
                if (c36Var != null) {
                    return c36Var;
                }
                hk0.g("Required value was null.");
                return null;
            case 26:
                int i3 = RCClientActivity.c0;
                return new gp5();
            case 27:
                long jAccountViewModelFactory_GetPLLoggedInContainerLoginViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetPLLoggedInContainerLoginViewModel();
                if (jAccountViewModelFactory_GetPLLoggedInContainerLoginViewModel != 0) {
                    iLoggedInOnlineStateAwareContainerViewModel = new ILoggedInOnlineStateAwareContainerViewModel();
                    iLoggedInOnlineStateAwareContainerViewModel.b = true;
                    iLoggedInOnlineStateAwareContainerViewModel.a = jAccountViewModelFactory_GetPLLoggedInContainerLoginViewModel;
                }
                iLoggedInOnlineStateAwareContainerViewModel.getClass();
                return new te4(iLoggedInOnlineStateAwareContainerViewModel);
            case 28:
                long jConditionalAccessAuthenticationViewModelFactory_GetConditionalAccessAuthenticationNotificationViewModel = ConditionalAccessAuthViewModelFactorySWIGJNI.ConditionalAccessAuthenticationViewModelFactory_GetConditionalAccessAuthenticationNotificationViewModel();
                if (jConditionalAccessAuthenticationViewModelFactory_GetConditionalAccessAuthenticationNotificationViewModel != 0) {
                    conditionalAccessAuthenticationNotificationViewModelNative = new ConditionalAccessAuthenticationNotificationViewModelNative();
                    conditionalAccessAuthenticationNotificationViewModelNative.b = true;
                    conditionalAccessAuthenticationNotificationViewModelNative.a = jConditionalAccessAuthenticationViewModelFactory_GetConditionalAccessAuthenticationNotificationViewModel;
                }
                conditionalAccessAuthenticationNotificationViewModelNative.getClass();
                return new v11(conditionalAccessAuthenticationNotificationViewModelNative);
            default:
                long jMonitoredDeviceAlarmSumsViewModelFactory_GetMonitoredDeviceAlarmSumsViewModel = MonitoredDeviceAlarmSumsViewModelFactorySWIGJNI.MonitoredDeviceAlarmSumsViewModelFactory_GetMonitoredDeviceAlarmSumsViewModel();
                if (jMonitoredDeviceAlarmSumsViewModelFactory_GetMonitoredDeviceAlarmSumsViewModel != 0) {
                    iMonitoredDeviceAlarmSumsViewModel = new IMonitoredDeviceAlarmSumsViewModel();
                    iMonitoredDeviceAlarmSumsViewModel.b = true;
                    iMonitoredDeviceAlarmSumsViewModel.a = jMonitoredDeviceAlarmSumsViewModelFactory_GetMonitoredDeviceAlarmSumsViewModel;
                }
                iMonitoredDeviceAlarmSumsViewModel.getClass();
                return new vs4(iMonitoredDeviceAlarmSumsViewModel);
        }
    }
}
