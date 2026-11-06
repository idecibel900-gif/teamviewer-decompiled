package o;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.provider.Settings;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.helper.DeviceInfoHelper;
import com.teamviewer.teamviewerlib.swig.tvaccount.IAccountAndroid;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;

/* JADX INFO: loaded from: classes.dex */
public final class d31 {
    public final RemoteControlApplication a;

    public /* synthetic */ d31(RemoteControlApplication remoteControlApplication) {
        this.a = remoteControlApplication;
    }

    public static String c() {
        String strGetDisplayName;
        IAccountAndroid iAccountAndroidGetAccount = BackendContainerAndroid.GetInstance().GetAccount();
        return (iAccountAndroidGetAccount == null || !iAccountAndroidGetAccount.IsLoggedIn() || (strGetDisplayName = iAccountAndroidGetAccount.GetDisplayName()) == null || strGetDisplayName.length() == 0) ? "" : strGetDisplayName;
    }

    public ShortcutInfo a(ShortcutInfo shortcutInfo) {
        Intent intent = shortcutInfo.getIntent();
        if (intent != null) {
            String id = shortcutInfo.getId();
            id.getClass();
            Long lP = bc7.P(id);
            if (lP != null) {
                if (lP.longValue() <= 0) {
                    lP = null;
                }
                if (lP != null) {
                    long jLongValue = lP.longValue();
                    long longExtra = intent.getLongExtra("SHORTCUT_DYNGATE_ID", 0L);
                    if (!shortcutInfo.isImmutable() && im3.n(intent.getAction(), "android.intent.action.VIEW") && im3.n(intent.getDataString(), "tvshortcut://openshortcut") && intent.getBooleanExtra("IS_SHORTCUT", false) && longExtra <= 0) {
                        String id2 = shortcutInfo.getId();
                        RemoteControlApplication remoteControlApplication = this.a;
                        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(remoteControlApplication, id2);
                        CharSequence shortLabel = shortcutInfo.getShortLabel();
                        if (shortLabel == null) {
                            shortLabel = shortcutInfo.getId();
                            shortLabel.getClass();
                        }
                        ShortcutInfo.Builder shortLabel2 = builder.setShortLabel(shortLabel);
                        CharSequence longLabel = shortcutInfo.getLongLabel();
                        if (longLabel != null) {
                            shortLabel2.getClass();
                            shortLabel2.setLongLabel(longLabel);
                        }
                        return shortLabel2.setIcon(Icon.createWithResource(remoteControlApplication, R.drawable.home_screen_shortcut_device_logo)).setIntent(new Intent(intent).putExtra("SHORTCUT_DYNGATE_ID", jLongValue)).build();
                    }
                }
            }
        }
        return null;
    }

    public String b() {
        String strC = c();
        return strC.length() == 0 ? d() : strC;
    }

    public String d() {
        String strB;
        RemoteControlApplication remoteControlApplication = this.a;
        if (DeviceInfoHelper.b(remoteControlApplication).equalsIgnoreCase("unknown")) {
            strB = Settings.Secure.getString(remoteControlApplication.getContentResolver(), "android_id");
            strB.getClass();
        } else {
            strB = DeviceInfoHelper.b(remoteControlApplication);
        }
        String strA = DeviceInfoHelper.a();
        String str = Build.MODEL;
        str.getClass();
        String[] strArr = {strA, str, strB};
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            String str2 = strArr[i];
            if (str2 != null && str2.length() != 0) {
                if (z) {
                    sb.append('_');
                }
                sb.append(str2);
                z = true;
            }
        }
        return sb.toString();
    }
}
