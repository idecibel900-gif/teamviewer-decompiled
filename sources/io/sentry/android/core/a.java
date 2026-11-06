package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import io.sentry.b5;
import io.sentry.d5;
import io.sentry.f6;
import io.sentry.q7;
import io.sentry.v5;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.e41;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {
    public final boolean m;
    public final q7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w0 f97o;
    public final io.sentry.h2 p;
    public final short q;
    public final long r;
    public final io.sentry.g1 s;
    public volatile long t;
    public final AtomicBoolean u;
    public final Context v;
    public final b5 w;

    public a(long j, boolean z, q7 q7Var, io.sentry.g1 g1Var, Context context) {
        io.sentry.h2 h2Var = new io.sentry.h2((byte) 8);
        w0 w0Var = new w0();
        super("|ANR-WatchDog|");
        this.t = 0L;
        this.u = new AtomicBoolean(false);
        this.p = h2Var;
        this.r = j;
        this.q = (short) 500;
        this.m = z;
        this.n = q7Var;
        this.s = g1Var;
        this.f97o = w0Var;
        this.v = context;
        this.w = new b5(this, h2Var);
        if (j < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.w.run();
        while (!isInterrupted()) {
            ((Handler) this.f97o.a).post(this.w);
            try {
                Thread.sleep(this.q);
                this.p.getClass();
                if (SystemClock.uptimeMillis() - this.t > this.r) {
                    if (this.m || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.v.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th) {
                                this.s.d(f6.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().condition == 2) {
                                        }
                                    }
                                }
                            }
                        }
                        if (this.u.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(e41.k(new StringBuilder("Application Not Responding for at least "), this.r, " ms."), ((Handler) this.f97o.a).getLooper().getThread());
                            q7 q7Var = this.n;
                            Object obj = q7Var.f253o;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) q7Var.n;
                            a aVar = AnrIntegration.q;
                            sentryAndroidOptions.getLogger().g(f6.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(k0.q.p);
                            String strConcat = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strConcat = "Background ".concat(strConcat);
                            }
                            Thread thread = applicationNotResponding.m;
                            ApplicationNotResponding applicationNotResponding2 = thread == null ? new ApplicationNotResponding(strConcat) : new ApplicationNotResponding(strConcat, thread);
                            io.sentry.protocol.o oVar = new io.sentry.protocol.o();
                            oVar.m = "ANR";
                            v5 v5Var = new v5(new io.sentry.exception.a(oVar, applicationNotResponding2, thread, true));
                            v5Var.G = f6.ERROR;
                            d5.c().B(v5Var, io.sentry.util.b.g(new b0(zEquals)));
                        }
                    } else {
                        this.s.g(f6.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.u.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.s.g(f6.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.s.g(f6.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }
}
