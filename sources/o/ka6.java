package o;

import com.teamviewer.fcm.swig.NotificationType;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ka6 extends q30 {
    public static final String c = String.valueOf(NotificationType.RemoveConditionalAccessConnectionAuthentication.swigValue());
    public final RemoteControlApplication b;

    public ka6(RemoteControlApplication remoteControlApplication) {
        super(c);
        this.b = remoteControlApplication;
    }

    @Override // o.q30
    public final void a(Map map, tq4 tq4Var) {
        ye4.a("RemoveConditionalAccessAuthenticationNotificationHandler", "Remove Conditional Access authentication notification received");
        String str = (String) map.get("sessionId");
        if (str != null) {
            new r55(this.b).a(18, str);
        } else {
            ye4.c("RemoveConditionalAccessAuthenticationNotificationHandler", "Notification data missing");
        }
    }
}
