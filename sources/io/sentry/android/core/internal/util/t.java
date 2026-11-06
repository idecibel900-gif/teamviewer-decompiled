package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.android.core.q0;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.u4;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Application.ActivityLifecycleCallbacks {
    public final ConcurrentSkipListSet A;
    public final q0 m;
    public final CopyOnWriteArraySet n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1 f116o;
    public volatile Handler p;
    public final io.sentry.util.a q;
    public WeakReference r;
    public final ConcurrentHashMap s;
    public final boolean t;
    public final d u;
    public final p v;
    public volatile Choreographer w;
    public volatile Field x;
    public long y;
    public long z;

    /* JADX WARN: Type inference failed for: r4v4, types: [io.sentry.android.core.internal.util.p] */
    public t(Context context, g1 g1Var, final q0 q0Var) {
        d dVar = new d();
        this.n = new CopyOnWriteArraySet();
        this.q = new io.sentry.util.a();
        this.s = new ConcurrentHashMap();
        this.t = false;
        this.y = 0L;
        this.z = 0L;
        this.A = new ConcurrentSkipListSet();
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        io.sentry.util.b.v(g1Var, "Logger is required");
        this.f116o = g1Var;
        io.sentry.util.b.v(q0Var, "BuildInfoProvider is required");
        this.m = q0Var;
        this.u = dVar;
        if (context instanceof Application) {
            this.t = true;
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new u4((Object) this, (Object) g1Var, (byte) 9));
            this.v = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.p
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    t tVar = this.a;
                    ConcurrentSkipListSet concurrentSkipListSet = tVar.A;
                    long jNanoTime = System.nanoTime();
                    q0Var.getClass();
                    float refreshRate = Build.VERSION.SDK_INT >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
                    long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
                    long jMax = Math.max(0L, metric - ((long) (1.0E9f / refreshRate)));
                    tVar.m.getClass();
                    long metric2 = frameMetrics.getMetric(10);
                    if (metric2 < 0) {
                        metric2 = jNanoTime - metric;
                    }
                    long jMax2 = Math.max(metric2, tVar.z);
                    if (jMax2 == tVar.y) {
                        return;
                    }
                    tVar.y = jMax2;
                    long j = jMax2 + metric;
                    tVar.z = j;
                    boolean z = metric > ((long) (1.0E9f / (refreshRate - 1.0f)));
                    boolean z2 = z && metric > 700000000;
                    if (jMax > 0) {
                        long j2 = j - 300000000000L;
                        concurrentSkipListSet.headSet(new r(j2, j2)).clear();
                        if (concurrentSkipListSet.size() < 3600) {
                            concurrentSkipListSet.add(new r(jMax2, tVar.z));
                        }
                    }
                    Iterator it = tVar.s.values().iterator();
                    while (it.hasNext()) {
                        long j3 = metric;
                        long j4 = jMax;
                        ((s) it.next()).b(jMax2, tVar.z, j3, j4, z, z2, refreshRate);
                        jMax = j4;
                        metric = j3;
                    }
                }
            };
        }
    }

    public final String a(s sVar) {
        if (!this.t) {
            return null;
        }
        if (this.p == null) {
            io.sentry.util.a aVar = this.q;
            aVar.e();
            try {
                if (this.p == null) {
                    HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.t");
                    handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.q
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        public final void uncaughtException(Thread thread, Throwable th) {
                            this.m.f116o.d(f6.ERROR, "Error during frames measurements.", th);
                        }
                    });
                    handlerThread.start();
                    this.p = new Handler(handlerThread.getLooper());
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
        String strN = io.sentry.config.a.n();
        this.s.put(strN, sVar);
        c();
        return strN;
    }

    public final void b(String str) {
        if (this.t) {
            ConcurrentHashMap concurrentHashMap = this.s;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.r;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new o(this, window, (byte) 1));
        }
    }

    public final void c() {
        WeakReference weakReference = this.r;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.t || this.s.isEmpty() || this.p == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new o(this, window, (byte) 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.r;
        if (weakReference == null || weakReference.get() != window) {
            this.r = new WeakReference(window);
            c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new o(this, activity.getWindow(), (byte) 1));
        WeakReference weakReference = this.r;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.r = null;
    }
}
