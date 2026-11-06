package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import o.d85;
import o.xv;

/* JADX INFO: loaded from: classes.dex */
abstract class ProxyNotificationPreferences {
    private static SharedPreferences getPreference(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static boolean isProxyNotificationInitialized(Context context) {
        return getPreference(context).getBoolean("proxy_notification_initialized", false);
    }

    public static boolean isProxyNotificationRetentionSet(SharedPreferences sharedPreferences, boolean z) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z;
    }

    public static void setProxyNotificationsInitialized(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z);
        editorEdit.apply();
    }

    public static void setProxyRetention(final Context context, GmsRpc gmsRpc, final boolean z) {
        if (Build.VERSION.SDK_INT < 29 || isProxyNotificationRetentionSet(getPreference(context), z)) {
            return;
        }
        gmsRpc.setRetainProxiedNotifications(z).e(new xv((byte) 1), new d85() { // from class: com.google.firebase.messaging.i
            @Override // o.d85
            public final void onSuccess(Object obj) {
                ProxyNotificationPreferences.setProxyRetentionPreferences(context, z);
            }
        });
    }

    public static void setProxyRetentionPreferences(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_retention", z);
        editorEdit.apply();
    }
}
