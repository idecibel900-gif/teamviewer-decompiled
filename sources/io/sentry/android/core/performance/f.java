package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.content.ContentProvider;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.i;
import io.sentry.android.core.internal.util.l;
import io.sentry.android.core.q0;
import io.sentry.android.core.v0;
import io.sentry.android.core.w0;
import io.sentry.android.core.x1;
import io.sentry.android.core.y;
import io.sentry.g3;
import io.sentry.h4;
import io.sentry.l5;
import io.sentry.p7;
import io.sentry.protocol.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.ep1;
import o.fi7;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Application.ActivityLifecycleCallbacks {
    public static volatile f L;
    public volatile p7 D;
    public w E;
    public String F;
    public String G;
    public l5 H;
    public ApplicationStartInfo I;
    public volatile Boolean n;
    public static long K = SystemClock.uptimeMillis();
    public static final io.sentry.util.a M = new io.sentry.util.a();
    public volatile e m = e.UNKNOWN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile long f122o = -1;
    public y u = null;
    public i v = null;
    public h4 w = null;
    public boolean x = false;
    public volatile boolean y = true;
    public final AtomicInteger z = new AtomicInteger();
    public final AtomicBoolean A = new AtomicBoolean(false);
    public final AtomicBoolean B = new AtomicBoolean(false);
    public final AtomicBoolean C = new AtomicBoolean(false);
    public final io.sentry.internal.debugmeta.c J = new io.sentry.internal.debugmeta.c();
    public final g p = new g();
    public final g q = new g();
    public final g r = new g();
    public final HashMap s = new HashMap();
    public final ArrayList t = new ArrayList();

    public static f c() {
        if (L == null) {
            io.sentry.util.a aVar = M;
            aVar.e();
            try {
                if (L == null) {
                    L = new f();
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return L;
    }

    public static void d(fi7 fi7Var) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        g gVar = c().r;
        if (gVar.c()) {
            gVar.m = fi7Var.getClass().getName().concat(".onCreate");
            gVar.p = jUptimeMillis;
        }
    }

    public static void e(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        g gVar = new g();
        gVar.f(jUptimeMillis);
        c().s.put(contentProvider, gVar);
    }

    public static void f(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        g gVar = (g) c().s.get(contentProvider);
        if (gVar == null || !gVar.c()) {
            return;
        }
        gVar.m = contentProvider.getClass().getName().concat(".onCreate");
        gVar.p = jUptimeMillis;
    }

    public final String a() {
        ApplicationStartInfo applicationStartInfo = this.I;
        if (applicationStartInfo == null || Build.VERSION.SDK_INT < 35) {
            return null;
        }
        switch (applicationStartInfo.getReason()) {
            case 0:
                return "alarm";
            case 1:
                return "backup";
            case 2:
                return "boot_complete";
            case 3:
                return "broadcast";
            case 4:
                return "content_provider";
            case 5:
                return "job";
            case 6:
                return "launcher";
            case 7:
                return "launcher_recents";
            case 8:
                return "other";
            case ep1.b /* 9 */:
                return "push";
            case ep1.c /* 10 */:
                return "service";
            case 11:
                return "start_activity";
            default:
                return null;
        }
    }

    public final g b(SentryAndroidOptions sentryAndroidOptions) {
        if (this.m != e.UNKNOWN && Boolean.TRUE.equals(this.n)) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                g gVar = this.p;
                if (gVar.d() && gVar.a() <= 60000) {
                    return gVar;
                }
            }
            g gVar2 = this.q;
            if (gVar2.d() && gVar2.a() <= 60000) {
                return gVar2;
            }
        }
        return new g();
    }

    public final synchronized void g() {
        if (!this.A.getAndSet(true)) {
            f fVarC = c();
            g gVar = fVarC.q;
            gVar.getClass();
            gVar.p = SystemClock.uptimeMillis();
            g gVar2 = fVarC.p;
            gVar2.getClass();
            gVar2.p = SystemClock.uptimeMillis();
        }
    }

    public final void h(Application application) {
        ActivityManager activityManager;
        if (this.x) {
            return;
        }
        this.x = true;
        Boolean bool = null;
        this.n = null;
        application.registerActivityLifecycleCallbacks(L);
        if (Build.VERSION.SDK_INT >= 35 && (activityManager = (ActivityManager) application.getSystemService("activity")) != null) {
            try {
                List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
                if (!historicalProcessStartReasons.isEmpty()) {
                    ApplicationStartInfo applicationStartInfoC = x1.c(historicalProcessStartReasons.get(0));
                    this.I = applicationStartInfoC;
                    if (applicationStartInfoC.getStartupState() == 0) {
                        if (applicationStartInfoC.getStartType() == 1) {
                            this.m = e.COLD;
                        } else {
                            this.m = e.WARM;
                        }
                        switch (applicationStartInfoC.getReason()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case ep1.b /* 9 */:
                            case ep1.c /* 10 */:
                                bool = Boolean.FALSE;
                                break;
                            case 6:
                            case 7:
                            case 11:
                                bool = Boolean.TRUE;
                                break;
                        }
                        this.n = bool;
                    }
                }
            } catch (RuntimeException e) {
                Log.w("AppStartMetrics", e);
            }
        }
        if (this.n == null) {
            this.n = Boolean.valueOf(v0.i());
        }
        if ((this.m == e.UNKNOWN || this.D != null) && this.B.compareAndSet(false, true)) {
            Looper.getMainLooper().getQueue().addIdleHandler(new d(this));
        }
    }

    public final void i(long j) {
        g gVar = this.p;
        if (gVar.d()) {
            if (gVar.c()) {
                gVar.p = j;
            }
        } else {
            g gVar2 = this.q;
            if (gVar2.d() && gVar2.c()) {
                gVar2.p = j;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        w0.b.c(activity);
        if (this.z.incrementAndGet() == 1 && !this.A.get()) {
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.p.f123o;
            if (!Boolean.TRUE.equals(this.n) || jUptimeMillis2 > 60000) {
                io.sentry.util.a aVar = (io.sentry.util.a) this.J.n;
                aVar.e();
                aVar.close();
                this.m = e.WARM;
                this.y = true;
                g gVar = this.p;
                gVar.m = null;
                gVar.f123o = 0L;
                gVar.p = 0L;
                gVar.n = 0L;
                gVar.f(jUptimeMillis);
                K = jUptimeMillis;
                this.s.clear();
                g gVar2 = this.r;
                gVar2.m = null;
                gVar2.f123o = 0L;
                gVar2.p = 0L;
                gVar2.n = 0L;
            } else if (this.m == e.UNKNOWN) {
                if (bundle != null) {
                    this.m = e.WARM;
                } else if (this.f122o == -1 || jUptimeMillis <= this.f122o) {
                    this.m = e.COLD;
                } else {
                    this.m = e.WARM;
                }
            }
        }
        this.n = Boolean.TRUE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        w0 w0Var = w0.b;
        WeakReference weakReference = (WeakReference) w0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            w0Var.a = null;
        }
        int iDecrementAndGet = this.z.decrementAndGet();
        if (iDecrementAndGet < 0) {
            this.z.set(0);
            iDecrementAndGet = 0;
        }
        if (iDecrementAndGet != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.m = e.WARM;
        this.n = Boolean.TRUE;
        this.y = true;
        this.A.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        w0 w0Var = w0.b;
        WeakReference weakReference = (WeakReference) w0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            w0Var.a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        w0.b.c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        w0.b.c(activity);
        if (this.A.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            final byte b = 0;
            l.a(activity, new Runnable(this) { // from class: io.sentry.android.core.performance.c
                public final /* synthetic */ f n;

                {
                    this.n = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    f fVar = this.n;
                    switch (b2) {
                        case 0:
                            fVar.g();
                            break;
                        default:
                            fVar.g();
                            break;
                    }
                }
            }, new q0(g3.m));
        } else {
            final byte b2 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.performance.c
                public final /* synthetic */ f n;

                {
                    this.n = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    f fVar = this.n;
                    switch (b3) {
                        case 0:
                            fVar.g();
                            break;
                        default:
                            fVar.g();
                            break;
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        w0 w0Var = w0.b;
        WeakReference weakReference = (WeakReference) w0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            w0Var.a = null;
        }
    }
}
