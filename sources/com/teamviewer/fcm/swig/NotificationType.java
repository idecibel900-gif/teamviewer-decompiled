package com.teamviewer.fcm.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum NotificationType {
    Undefined(0),
    ChatMessageV1(1),
    MeetingInvitationV1(2),
    MobileWakeV1(3),
    WakeUpCall(4),
    DeviceConnectionAuthentication(5),
    MonitoringAlert(6),
    TrustedDeviceAuthentication(8),
    ConditionalAccessConnectionAuthentication(9),
    RemoveConditionalAccessConnectionAuthentication(10),
    DeleteAccountTFARegistrationData(11),
    AccountTFA(12);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    NotificationType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static NotificationType swigToEnum(int i) {
        NotificationType[] notificationTypeArr = (NotificationType[]) NotificationType.class.getEnumConstants();
        if (i < notificationTypeArr.length && i >= 0) {
            NotificationType notificationType = notificationTypeArr[i];
            if (notificationType.swigValue == i) {
                return notificationType;
            }
        }
        for (NotificationType notificationType2 : notificationTypeArr) {
            if (notificationType2.swigValue == i) {
                return notificationType2;
            }
        }
        hk0.g(ua5.k(i, NotificationType.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    NotificationType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NotificationType(NotificationType notificationType) {
        int i = notificationType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
