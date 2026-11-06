package o;

import com.teamviewer.fcm.swig.NotificationType;
import com.teamviewer.fcm.swig.NotificationTypes;
import com.teamviewer.fcm.swig.PushNotificationRegistration;
import com.teamviewer.fcm.swig.PushNotificationRegistrationFactory;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zh2 {
    public static PushNotificationRegistration c;
    public static final zh2 a = new zh2();
    public static final NotificationTypes b = new NotificationTypes();
    public static final AtomicReference d = new AtomicReference();

    public static void a(NotificationType notificationType) {
        if (c != null) {
            ye4.c("FcmRegistrationHelper", "Notification types have to be added before registration is started");
        } else {
            b.add(notificationType);
        }
    }

    public final synchronized PushNotificationRegistration b() {
        PushNotificationRegistration pushNotificationRegistrationCreatePushNotificationRegistration = c;
        if (pushNotificationRegistrationCreatePushNotificationRegistration == null) {
            NotificationTypes notificationTypes = b;
            if (notificationTypes.isEmpty()) {
                ye4.c("FcmRegistrationHelper", "No supported notification type found");
                return null;
            }
            pushNotificationRegistrationCreatePushNotificationRegistration = PushNotificationRegistrationFactory.CreatePushNotificationRegistration(notificationTypes);
            c = pushNotificationRegistrationCreatePushNotificationRegistration;
        }
        return pushNotificationRegistrationCreatePushNotificationRegistration;
    }
}
