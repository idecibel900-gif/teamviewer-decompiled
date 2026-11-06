package com.teamviewer.fcm.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class PushNotificationRegistrationFactory {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public PushNotificationRegistrationFactory(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static PushNotificationRegistration CreatePushNotificationRegistration(NotificationTypes notificationTypes) {
        return new PushNotificationRegistration(PushNotificationRegistrationFactorySWIGJNI.PushNotificationRegistrationFactory_CreatePushNotificationRegistration(NotificationTypes.getCPtr(notificationTypes), notificationTypes), true);
    }

    public static long getCPtr(PushNotificationRegistrationFactory pushNotificationRegistrationFactory) {
        if (pushNotificationRegistrationFactory == null) {
            return 0L;
        }
        return pushNotificationRegistrationFactory.swigCPtr;
    }

    public static long swigRelease(PushNotificationRegistrationFactory pushNotificationRegistrationFactory) {
        if (pushNotificationRegistrationFactory != null) {
            if (pushNotificationRegistrationFactory.swigCMemOwn) {
                long j = pushNotificationRegistrationFactory.swigCPtr;
                pushNotificationRegistrationFactory.swigCMemOwn = false;
                pushNotificationRegistrationFactory.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    PushNotificationRegistrationFactorySWIGJNI.delete_PushNotificationRegistrationFactory(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }
}
