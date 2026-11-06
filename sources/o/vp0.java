package o;

import android.app.Notification;
import android.content.Intent;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IUnreadChatMessageHandler;
import com.teamviewer.fcm.swig.NotificationType;
import com.teamviewer.remotecontrolviewlib.activity.NotificationHandlerActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vp0 extends q30 {
    public static final String e = String.valueOf(NotificationType.ChatMessageV1.swigValue());
    public final RemoteControlApplication b;
    public final IUnreadChatMessageHandler c;
    public final up0 d;

    public vp0(RemoteControlApplication remoteControlApplication) {
        super(e);
        this.b = remoteControlApplication;
        IUnreadChatMessageHandler iUnreadChatMessageHandlerGetUnreadChatMessageHandler = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetUnreadChatMessageHandler();
        iUnreadChatMessageHandlerGetUnreadChatMessageHandler.getClass();
        this.c = iUnreadChatMessageHandlerGetUnreadChatMessageHandler;
        up0 up0Var = new up0(this);
        this.d = up0Var;
        ChatSignalsHelper.RegisterNewMessagesSignalSlot(iUnreadChatMessageHandlerGetUnreadChatMessageHandler, up0Var);
    }

    @Override // o.q30
    public final void a(Map map, tq4 tq4Var) {
        int i;
        String string;
        s7 s7Var = u7.g;
        my0 my0Var = vn4.g0().b;
        if (my0Var != null && my0Var.hasWindowFocus()) {
            ye4.a("ChatMessageNotificationHandler", "skip fcm notification");
            return;
        }
        String str = (String) map.get("title");
        String str2 = (String) map.get("unreadCount");
        String str3 = (String) map.get("chatRoomId");
        try {
            str2.getClass();
            i = Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            ye4.c("ChatMessageNotificationHandler", "onMessageImpl: parse int exception");
            i = 0;
        }
        RemoteControlApplication remoteControlApplication = this.b;
        if (i > 1) {
            string = remoteControlApplication.getString(R.string.tv_chat_notification_text_multiple_messages, Integer.valueOf(i));
        } else {
            if (i == 0) {
                remoteControlApplication.getClass();
                new r55(remoteControlApplication).a(6, null);
                ye4.a("ChatMessageNotificationHandler", "remove notification");
                return;
            }
            string = (String) map.get("body");
        }
        str.getClass();
        Notification notificationH = d82.h(this.b, str, string, str, R.drawable.ic_notification_rc, new Intent(remoteControlApplication, (Class<?>) NotificationHandlerActivity.class).putExtra("SHOW_CHAT", true).putExtra("CHATROOMID", str3).addFlags(268435456), 3, xk7.CHAT_NOTIFICATION);
        ye4.a("ChatMessageNotificationHandler", "show fcm notification");
        b(notificationH, i);
    }

    public final void b(Notification notification, int i) {
        notification.flags |= 17;
        notification.defaults |= 1;
        notification.ledOffMS = 4000;
        notification.ledOnMS = 1000;
        RemoteControlApplication remoteControlApplication = this.b;
        notification.ledARGB = remoteControlApplication.getColor(R.color.tv_chat_notification_light);
        notification.number = i;
        d82.x(remoteControlApplication, notification, 6);
    }
}
