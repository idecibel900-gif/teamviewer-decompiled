package o;

import android.app.Notification;
import android.content.Intent;
import com.teamviewer.fcm.swig.NotificationType;
import com.teamviewer.remotecontrolviewlib.activity.NotificationHandlerActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class et4 extends q30 {
    public static final String c = String.valueOf(NotificationType.MonitoringAlert.swigValue());
    public final RemoteControlApplication b;

    public et4(RemoteControlApplication remoteControlApplication) {
        super(c);
        this.b = remoteControlApplication;
    }

    @Override // o.q30
    public final void a(Map map, tq4 tq4Var) {
        RemoteControlApplication remoteControlApplication = this.b;
        String string = remoteControlApplication.getString(R.string.tv_monitoring_notification_title);
        string.getClass();
        String string2 = remoteControlApplication.getString(R.string.tv_monitoring_notification_content);
        String string3 = remoteControlApplication.getString(R.string.tv_monitoring_notification_title);
        string3.getClass();
        Notification notificationI = d82.i(remoteControlApplication, string, string2, string3, R.drawable.tv_notification_icon, false, false, new Intent(remoteControlApplication, (Class<?>) NotificationHandlerActivity.class).putExtra("SHOW_MONITORINGOVERVIEW", true).addFlags(268435456), 28, xk7.MONITORING_NOTIFICATION, false, false);
        String str = (String) map.get("alertCount");
        String str2 = (String) map.get("alertDeviceCount");
        if (str == null || Integer.parseInt(str) != 0 || str2 == null || Integer.parseInt(str2) != 0) {
            ye4.a("MonitoringAlarmNotificationHandler", "show fcm notification");
            d82.x(remoteControlApplication, notificationI, 16);
        } else {
            ye4.a("MonitoringAlarmNotificationHandler", "remove fcm notification");
            new r55(remoteControlApplication).a(16, null);
        }
    }
}
