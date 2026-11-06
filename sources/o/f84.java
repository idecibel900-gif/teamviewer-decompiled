package o;

import android.app.Notification;
import com.teamviewer.swigcallbacklib.StringSignalCallbackImpl;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final class f84 extends StringSignalCallbackImpl {
    public final RemoteControlApplication a;

    public f84(RemoteControlApplication remoteControlApplication) {
        this.a = remoteControlApplication;
    }

    @Override // com.teamviewer.swigcallbacklib.StringSignalCallback
    public final void OnCallback(String str) {
        str.getClass();
        RemoteControlApplication remoteControlApplication = this.a;
        String string = remoteControlApplication.getString(R.string.tv_app_name);
        string.getClass();
        String string2 = remoteControlApplication.getString(R.string.tv_license_activated_notification_message, str);
        string2.getClass();
        Notification notificationB = d82.m(remoteControlApplication, string, string2, string2, R.drawable.tv_notification_icon, false, false, d82.n(remoteControlApplication), 21, xk7.LICENSE_NOTIFICATION, false, false).b();
        notificationB.getClass();
        notificationB.flags |= 16;
        d82.x(remoteControlApplication, notificationB, 11);
    }
}
