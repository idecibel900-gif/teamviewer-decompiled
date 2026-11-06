package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o.nm8;
import o.we4;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = we4.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        we4.f().c(a, "Received intent " + intent);
        try {
            nm8 nm8VarA = nm8.a(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (nm8.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = nm8VarA.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    nm8VarA.i = pendingResultGoAsync;
                    if (nm8VarA.h) {
                        pendingResultGoAsync.finish();
                        nm8VarA.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            we4.f().e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
