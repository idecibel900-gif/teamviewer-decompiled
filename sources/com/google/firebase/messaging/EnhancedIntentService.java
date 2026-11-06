package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import io.sentry.q7;
import java.util.concurrent.ExecutorService;
import o.bo7;
import o.do7;
import o.h57;
import o.xv;

/* JADX INFO: loaded from: classes.dex */
public abstract class EnhancedIntentService extends Service {
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = FcmExecutors.newIntentHandleExecutor();
    private final Object lock = new Object();
    private int runningTasks = 0;

    private void finishTask(Intent intent) {
        if (intent != null) {
            WakeLockHolder.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, bo7 bo7Var) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIntent$0(Intent intent, do7 do7Var) {
        try {
            handleIntent(intent);
        } finally {
            do7Var.a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bo7 processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return h57.j(null);
        }
        do7 do7Var = new do7();
        this.executor.execute(new io.sentry.android.core.internal.util.j((Object) this, (Object) intent, (Object) do7Var, (byte) 9));
        return do7Var.a;
    }

    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Binder withinAppServiceBinder;
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            withinAppServiceBinder = this.binder;
            if (withinAppServiceBinder == null) {
                withinAppServiceBinder = new WithinAppServiceBinder(new WithinAppServiceBinder.IntentHandler() { // from class: com.google.firebase.messaging.EnhancedIntentService.1
                    @Override // com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler
                    public bo7 handle(Intent intent2) {
                        return EnhancedIntentService.this.processIntent(intent2);
                    }
                });
                this.binder = withinAppServiceBinder;
            }
        } catch (Throwable th) {
            throw th;
        }
        return withinAppServiceBinder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        bo7 bo7VarProcessIntent = processIntent(startCommandIntent);
        if (bo7VarProcessIntent.j()) {
            finishTask(intent);
            return 2;
        }
        bo7VarProcessIntent.b(new xv((byte) 1), new q7(this, intent, (byte) 18));
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
