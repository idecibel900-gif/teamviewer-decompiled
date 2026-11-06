package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import io.sentry.android.core.v0;
import java.util.concurrent.ExecutionException;
import o.h57;
import o.ku0;
import o.mu0;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends mu0 {
    private static Intent createServiceIntent(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // o.mu0
    public int onMessageReceive(Context context, ku0 ku0Var) {
        try {
            return ((Integer) h57.e(new FcmBroadcastProcessor(context).process(ku0Var.m))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            v0.d("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // o.mu0
    public void onNotificationDismissed(Context context, Bundle bundle) {
        Intent intentCreateServiceIntent = createServiceIntent(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (MessagingAnalytics.shouldUploadScionMetrics(intentCreateServiceIntent)) {
            MessagingAnalytics.logNotificationDismiss(intentCreateServiceIntent);
        }
    }
}
