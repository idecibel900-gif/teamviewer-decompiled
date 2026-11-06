package o;

import android.app.Notification;
import android.content.Intent;
import com.teamviewer.chatviewmodel.swig.MessageData;
import com.teamviewer.chatviewmodel.swig.NewMessageSignalCallbackImpl;
import com.teamviewer.remotecontrolviewlib.activity.NotificationHandlerActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final class up0 extends NewMessageSignalCallbackImpl {
    public final /* synthetic */ vp0 a;

    public up0(vp0 vp0Var) {
        this.a = vp0Var;
    }

    @Override // com.teamviewer.chatviewmodel.swig.NewMessageSignalCallback
    public final void OnCallback(MessageData messageData) {
        String string;
        vp0 vp0Var = this.a;
        RemoteControlApplication remoteControlApplication = vp0Var.b;
        messageData.getClass();
        if (xh2.a) {
            return;
        }
        s7 s7Var = u7.g;
        my0 my0Var = vn4.g0().b;
        if (my0Var != null && my0Var.hasWindowFocus()) {
            ye4.a("ChatMessageNotificationHandler", "skip ka notification, the app has been killed from the background.");
            return;
        }
        long jGetNumberOfUnreadMessages = vp0Var.c.GetNumberOfUnreadMessages();
        if (jGetNumberOfUnreadMessages == 1) {
            string = remoteControlApplication.getString(R.string.tv_chat_notification_text_single_message, messageData.getSenderDisplayName());
            string.getClass();
        } else {
            if (jGetNumberOfUnreadMessages <= 1) {
                remoteControlApplication.getClass();
                new r55(remoteControlApplication).a(6, null);
                ye4.a("ChatMessageNotificationHandler", "remove notification");
                return;
            }
            string = remoteControlApplication.getString(R.string.tv_chat_notification_text_multiple_messages, Long.valueOf(jGetNumberOfUnreadMessages));
            string.getClass();
        }
        String str = string;
        String string2 = remoteControlApplication.getString(R.string.tv_chat_notification_title);
        string2.getClass();
        String string3 = remoteControlApplication.getString(R.string.tv_chat_notification_ticker);
        string3.getClass();
        Notification notificationI = d82.i(remoteControlApplication, string2, str, string3, R.drawable.ic_notification_rc, false, false, new Intent(remoteControlApplication, (Class<?>) NotificationHandlerActivity.class).putExtra("SHOW_CHAT", true).putExtra("CHATROOMID", messageData.getChatRoomId()), 3, xk7.CHAT_NOTIFICATION, false, false);
        ye4.a("ChatMessageNotificationHandler", "show ka notification");
        vp0Var.b(notificationI, (int) jGetNumberOfUnreadMessages);
    }
}
