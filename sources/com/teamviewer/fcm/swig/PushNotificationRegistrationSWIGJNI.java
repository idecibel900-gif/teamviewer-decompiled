package com.teamviewer.fcm.swig;

/* JADX INFO: loaded from: classes.dex */
public class PushNotificationRegistrationSWIGJNI {
    public static final native void NotificationTypes_clear(long j, NotificationTypes notificationTypes);

    public static final native void NotificationTypes_doAdd__SWIG_0(long j, NotificationTypes notificationTypes, int i);

    public static final native void NotificationTypes_doAdd__SWIG_1(long j, NotificationTypes notificationTypes, int i, int i2);

    public static final native int NotificationTypes_doCapacity(long j, NotificationTypes notificationTypes);

    public static final native int NotificationTypes_doGet(long j, NotificationTypes notificationTypes, int i);

    public static final native int NotificationTypes_doRemove(long j, NotificationTypes notificationTypes, int i);

    public static final native void NotificationTypes_doRemoveRange(long j, NotificationTypes notificationTypes, int i, int i2);

    public static final native void NotificationTypes_doReserve(long j, NotificationTypes notificationTypes, int i);

    public static final native int NotificationTypes_doSet(long j, NotificationTypes notificationTypes, int i, int i2);

    public static final native int NotificationTypes_doSize(long j, NotificationTypes notificationTypes);

    public static final native boolean NotificationTypes_isEmpty(long j, NotificationTypes notificationTypes);

    public static final native void PushNotificationRegistration_CreatePushNotificationRegistration(long j, PushNotificationRegistration pushNotificationRegistration, String str, String str2);

    public static final native void PushNotificationRegistration_DestroyPushNotificationRegistration(long j, PushNotificationRegistration pushNotificationRegistration);

    public static final native void delete_NotificationTypes(long j);

    public static final native void delete_PushNotificationRegistration(long j);

    public static final native long new_NotificationTypes__SWIG_0();

    public static final native long new_NotificationTypes__SWIG_1(long j, NotificationTypes notificationTypes);

    public static final native long new_NotificationTypes__SWIG_2(int i, int i2);

    public static final native long new_PushNotificationRegistration(long j, long j2, NotificationTypes notificationTypes);
}
