package com.teamviewer.fcm.services;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.teamviewer.fcm.swig.PushNotificationRegistration;
import java.util.Locale;
import java.util.Map;
import o.ai2;
import o.fc1;
import o.im3;
import o.q30;
import o.tq4;
import o.ye4;
import o.yh2;
import o.zh2;

/* JADX INFO: loaded from: classes.dex */
public final class FcmListenerService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onDeletedMessages() {
        super.onDeletedMessages();
        ye4.a.g("FcmListenerService", "onDeletedMessages called!");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        remoteMessage.getClass();
        for (q30 q30Var : yh2.a) {
            int priority = remoteMessage.getPriority();
            tq4 tq4Var = priority != 1 ? priority != 2 ? tq4.m : tq4.f2133o : tq4.n;
            Map<String, String> data = remoteMessage.getData();
            data.getClass();
            q30Var.getClass();
            if (data.containsKey("notificationType") && im3.n(q30Var.a, data.get("notificationType"))) {
                q30Var.a(data, tq4Var);
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        str.getClass();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onRegistered(String str) {
        str.getClass();
        super.onRegistered(str);
        ye4.a("FcmListenerService", "Token refresh required");
        fc1 fc1Var = ai2.a;
        PushNotificationRegistration pushNotificationRegistrationB = zh2.a.b();
        if (pushNotificationRegistrationB == null) {
            ye4.c("FcmToken", "Could not create PushNotificationRegistration");
            return;
        }
        if (FirebaseApp.getApps(this).isEmpty()) {
            ye4.c("FcmToken", "FirebaseApp is not initialized");
            return;
        }
        try {
            ye4.a.b("FcmToken", "Token retrieved: ".concat(str));
            if (str.equals((String) zh2.d.getAndSet(str))) {
                return;
            }
            pushNotificationRegistrationB.CreatePushNotificationRegistration(str, Locale.getDefault().getLanguage());
        } catch (Exception e) {
            ye4.c("FcmToken", "Token retrieval failed");
            ye4.d("FcmToken", e);
        }
    }
}
