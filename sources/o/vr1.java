package o;

import android.content.SharedPreferences;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewmodellib.swig.DeviceAuthViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationInstructionsFragmentViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationQrScannerActivityViewModel;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vr1 implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ vr1(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        IDeviceAuthenticationQrScannerActivityViewModel iDeviceAuthenticationQrScannerActivityViewModel;
        byte b = this.m;
        IDeviceAuthenticationInstructionsFragmentViewModel iDeviceAuthenticationInstructionsFragmentViewModel = null;
        f88 f88Var = f88.a;
        la2 la2Var = la2.m;
        switch (b) {
            case 0:
                c36 c36Var = zu1.c;
                if (c36Var == null) {
                    hk0.g("Required value was null.");
                    return null;
                }
                SharedPreferences sharedPreferences = c36Var.b;
                long jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationQrScannerActivityViewModel = DeviceAuthViewModelFactorySWIGJNI.DeviceAuthenticationViewModelFactory_GetDeviceAuthenticationQrScannerActivityViewModel();
                if (jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationQrScannerActivityViewModel == 0) {
                    iDeviceAuthenticationQrScannerActivityViewModel = null;
                } else {
                    iDeviceAuthenticationQrScannerActivityViewModel = new IDeviceAuthenticationQrScannerActivityViewModel();
                    iDeviceAuthenticationQrScannerActivityViewModel.b = true;
                    iDeviceAuthenticationQrScannerActivityViewModel.a = jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationQrScannerActivityViewModel;
                }
                iDeviceAuthenticationQrScannerActivityViewModel.getClass();
                long jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationInstructionsFragmentViewModel = DeviceAuthViewModelFactorySWIGJNI.DeviceAuthenticationViewModelFactory_GetDeviceAuthenticationInstructionsFragmentViewModel();
                if (jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationInstructionsFragmentViewModel != 0) {
                    iDeviceAuthenticationInstructionsFragmentViewModel = new IDeviceAuthenticationInstructionsFragmentViewModel();
                    iDeviceAuthenticationInstructionsFragmentViewModel.b = true;
                    iDeviceAuthenticationInstructionsFragmentViewModel.a = jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationInstructionsFragmentViewModel;
                }
                iDeviceAuthenticationInstructionsFragmentViewModel.getClass();
                return new yr1(sharedPreferences, iDeviceAuthenticationQrScannerActivityViewModel, iDeviceAuthenticationInstructionsFragmentViewModel);
            case 1:
            case 2:
            case 3:
                return f88Var;
            case 4:
                return h57.p(null);
            case 5:
                return h57.p(Boolean.FALSE);
            case 6:
                return h57.p(Boolean.FALSE);
            case 7:
                return h57.p(Boolean.FALSE);
            case 8:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(g02.C);
                return f88Var;
            case ep1.b /* 9 */:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(g02.D);
                return f88Var;
            case ep1.c /* 10 */:
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(g02.E);
                return f88Var;
            case 11:
                return f88Var;
            case ep1.d /* 12 */:
                return h57.p(null);
            case 13:
                c36 c36Var2 = zu1.c;
                if (c36Var2 == null) {
                    hk0.g("Required value was null.");
                    return null;
                }
                return new ru1(c36Var2.e(), new d31(c36Var2.a), new cr((byte) 13));
            case 14:
                if (zu1.c != null) {
                    return new fx1();
                }
                hk0.g("Required value was null.");
                return null;
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return f88Var;
            case 17:
                c36 c36Var3 = zu1.c;
                if (c36Var3 != null) {
                    return new hz1(c36Var3.b, (int) BackendContainerAndroid.GetInstance().GetAccount().GetAccountID());
                }
                hk0.g("Required value was null.");
                return null;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return Boolean.TRUE;
            case 20:
                return new f62(lv1.V(new zb6(la2Var, "composeResources/com.teamviewer.libs.cobalt.base.resources/drawable/tv_abort.xml")), "drawable:tv_abort");
            case 21:
                return new f62(lv1.V(new zb6(la2Var, "composeResources/com.teamviewer.libs.cobalt.base.resources/drawable/tv_file_type_image_outlined.xml")), "drawable:tv_file_type_image_outlined");
            case 22:
                return new f62(cx.h1(new zb6[]{new zb6(lv1.V(vt7.f2345o), "composeResources/com.teamviewer.libs.cobalt.base.resources/drawable-dark/tv_action_checkmark.xml"), new zb6(la2Var, "composeResources/com.teamviewer.libs.cobalt.base.resources/drawable/tv_action_checkmark.xml")}), "drawable:tv_action_checkmark");
            case 23:
                return new f62(lv1.V(new zb6(la2Var, "composeResources/com.teamviewer.libs.cobalt.base.resources/drawable/tv_file_type_pdf_filled.xml")), "drawable:tv_file_type_pdf_filled");
            case 24:
                return new f62(lv1.V(new zb6(la2Var, "composeResources/com.teamviewer.libs.cobalt.base.resources/drawable/tv_file_type_pdf_outlined.xml")), "drawable:tv_file_type_pdf_outlined");
            case 25:
                return new f62(lv1.V(new zb6(la2Var, "composeResources/com.teamviewer.libs.cobalt.base.resources/drawable/tv_file_type_table_filled.xml")), "drawable:tv_file_type_table_filled");
            case 26:
                return new f62(lv1.V(new zb6(la2Var, "composeResources/com.teamviewer.libs.cobalt.base.resources/drawable/tv_file_type_table_outlined.xml")), "drawable:tv_file_type_table_outlined");
            case 27:
                return new f62(lv1.V(new zb6(la2Var, "composeResources/com.teamviewer.libs.cobalt.base.resources/drawable/tv_file_type_video_filled.xml")), "drawable:tv_file_type_video_filled");
            case 28:
                return new f62(lv1.V(new zb6(la2Var, "composeResources/com.teamviewer.libs.cobalt.base.resources/drawable/tv_file_type_video_outlined.xml")), "drawable:tv_file_type_video_outlined");
            default:
                return new f62(lv1.V(new zb6(la2Var, "composeResources/com.teamviewer.libs.cobalt.base.resources/drawable/tv_file_type_zip_filled.xml")), "drawable:tv_file_type_zip_filled");
        }
    }
}
