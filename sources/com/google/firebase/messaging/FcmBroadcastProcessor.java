package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import io.sentry.o5;
import java.util.concurrent.Executor;
import o.bo7;
import o.f21;
import o.gk0;
import o.h57;
import o.hk0;
import o.xv;

/* JADX INFO: loaded from: classes.dex */
public class FcmBroadcastProcessor {
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor = new xv(1);

    public FcmBroadcastProcessor(Context context) {
        this.context = context;
    }

    private static bo7 bindToMessagingService(Context context, Intent intent, boolean z) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        WithinAppServiceConnection serviceConnection = getServiceConnection(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z) {
            return serviceConnection.sendIntent(intent).f(new xv((byte) 1), new hk0((byte) 16));
        }
        if (ServiceStarter.getInstance().hasWakeLockPermission(context)) {
            WakeLockHolder.sendWakefulServiceIntent(context, serviceConnection, intent);
        } else {
            serviceConnection.sendIntent(intent);
        }
        return h57.j(-1);
    }

    private static WithinAppServiceConnection getServiceConnection(Context context, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            try {
                withinAppServiceConnection = fcmServiceConn;
                if (withinAppServiceConnection == null) {
                    withinAppServiceConnection = new WithinAppServiceConnection(context, str);
                    fcmServiceConn = withinAppServiceConnection;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return withinAppServiceConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$bindToMessagingService$3(bo7 bo7Var) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$startMessagingService$0(Context context, Intent intent) {
        return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$startMessagingService$1(bo7 bo7Var) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static bo7 lambda$startMessagingService$2(Context context, Intent intent, boolean z, bo7 bo7Var) {
        return ((Integer) bo7Var.i()).intValue() != 402 ? bo7Var : bindToMessagingService(context, intent, z).f(new xv((byte) 1), new gk0((byte) 16));
    }

    public bo7 process(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return startMessagingService(this.context, intent);
    }

    public bo7 startMessagingService(Context context, Intent intent) {
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? h57.g(this.executor, new o5(context, intent, (byte) 9)).g(this.executor, new f21(context, intent, z2)) : bindToMessagingService(context, intent, z2);
    }
}
