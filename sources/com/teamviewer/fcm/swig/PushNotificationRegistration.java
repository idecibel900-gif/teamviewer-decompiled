package com.teamviewer.fcm.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class PushNotificationRegistration {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public PushNotificationRegistration(SWIGTYPE_p_tvpushnotifications__IAccountAccessFunctions__SharedPtr sWIGTYPE_p_tvpushnotifications__IAccountAccessFunctions__SharedPtr, NotificationTypes notificationTypes) {
        this(PushNotificationRegistrationSWIGJNI.new_PushNotificationRegistration(SWIGTYPE_p_tvpushnotifications__IAccountAccessFunctions__SharedPtr.getCPtr(sWIGTYPE_p_tvpushnotifications__IAccountAccessFunctions__SharedPtr), NotificationTypes.getCPtr(notificationTypes), notificationTypes), true);
    }

    public static long getCPtr(PushNotificationRegistration pushNotificationRegistration) {
        if (pushNotificationRegistration == null) {
            return 0L;
        }
        return pushNotificationRegistration.swigCPtr;
    }

    public static long swigRelease(PushNotificationRegistration pushNotificationRegistration) {
        if (pushNotificationRegistration != null) {
            if (pushNotificationRegistration.swigCMemOwn) {
                long j = pushNotificationRegistration.swigCPtr;
                pushNotificationRegistration.swigCMemOwn = false;
                pushNotificationRegistration.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void CreatePushNotificationRegistration(String str, String str2) {
        PushNotificationRegistrationSWIGJNI.PushNotificationRegistration_CreatePushNotificationRegistration(this.swigCPtr, this, str, str2);
    }

    public void DestroyPushNotificationRegistration() {
        PushNotificationRegistrationSWIGJNI.PushNotificationRegistration_DestroyPushNotificationRegistration(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    PushNotificationRegistrationSWIGJNI.delete_PushNotificationRegistration(j);
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

    public PushNotificationRegistration(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
