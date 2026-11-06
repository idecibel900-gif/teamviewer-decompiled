package o;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m10 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ RemoteControlApplication n;

    public /* synthetic */ m10(RemoteControlApplication remoteControlApplication, byte b) {
        this.m = b;
        this.n = remoteControlApplication;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        RemoteControlApplication remoteControlApplication = this.n;
        switch (b) {
            case 0:
                Object systemService = remoteControlApplication.getSystemService("bluetooth");
                systemService.getClass();
                return (BluetoothManager) systemService;
            case 1:
                int i = RemoteControlApplication.G;
                return new l41(remoteControlApplication);
            default:
                int i2 = RemoteControlApplication.G;
                fc1 fc1Var = ai2.a;
                Context applicationContext = remoteControlApplication.getApplicationContext();
                applicationContext.getClass();
                if (FirebaseApp.getApps(applicationContext).isEmpty()) {
                    ye4.c("FcmToken", "FirebaseApp is not initialized");
                } else {
                    FirebaseMessaging.getInstance().register().c(new gk0((byte) 17));
                }
                if (z96.a == null) {
                    z96 z96Var = new z96();
                    FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
                    firebaseRemoteConfig.getClass();
                    FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(43200L).build();
                    firebaseRemoteConfigSettingsBuild.getClass();
                    firebaseRemoteConfig.setConfigSettingsAsync(firebaseRemoteConfigSettingsBuild);
                    firebaseRemoteConfig.setDefaultsAsync(R.xml.remote_config_defaults);
                    firebaseRemoteConfig.fetchAndActivate();
                    z96.a = z96Var;
                }
                return f88.a;
        }
    }
}
