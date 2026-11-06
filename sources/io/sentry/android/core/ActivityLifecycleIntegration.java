package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.a8;
import io.sentry.b5;
import io.sentry.e8;
import io.sentry.f6;
import io.sentry.f8;
import io.sentry.h4;
import io.sentry.k6;
import io.sentry.l5;
import io.sentry.n7;
import io.sentry.o6;
import io.sentry.p7;
import io.sentry.q4;
import io.sentry.q7;
import io.sentry.t3;
import io.sentry.u4;
import io.sentry.w4;
import io.sentry.y7;
import io.sentry.z7;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import o.gy8;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityLifecycleIntegration implements io.sentry.d2, Closeable, Application.ActivityLifecycleCallbacks {
    public final d D;
    public final Application m;
    public final q0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public io.sentry.n1 f86o;
    public SentryAndroidOptions p;
    public final boolean s;
    public io.sentry.v1 v;
    public io.sentry.x1 w;
    public boolean q = false;
    public boolean r = false;
    public boolean t = false;
    public io.sentry.o0 u = null;
    public final WeakHashMap x = new WeakHashMap();
    public final WeakHashMap y = new WeakHashMap();
    public final WeakHashMap z = new WeakHashMap();
    public l5 A = new o6(0, 0);
    public Future B = null;
    public final WeakHashMap C = new WeakHashMap();
    public final io.sentry.util.a E = new io.sentry.util.a();
    public final io.sentry.util.a F = new io.sentry.util.a();

    public ActivityLifecycleIntegration(Application application, q0 q0Var, d dVar) {
        this.m = application;
        this.n = q0Var;
        this.D = dVar;
        if (Build.VERSION.SDK_INT >= 29) {
            this.s = true;
        }
    }

    public static void j(io.sentry.v1 v1Var, io.sentry.v1 v1Var2) {
        if (v1Var == null || v1Var.d()) {
            return;
        }
        String description = v1Var.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = v1Var.getDescription() + " - Deadline Exceeded";
        }
        v1Var.q(description);
        l5 l5VarW = v1Var2 != null ? v1Var2.w() : null;
        if (l5VarW == null) {
            l5VarW = v1Var.z();
        }
        q(v1Var, l5VarW, a8.DEADLINE_EXCEEDED);
    }

    public static void q(io.sentry.v1 v1Var, l5 l5Var, a8 a8Var) {
        if (v1Var == null || v1Var.d()) {
            return;
        }
        if (a8Var == null) {
            a8Var = v1Var.getStatus() != null ? v1Var.getStatus() : a8.OK;
        }
        v1Var.x(a8Var, l5Var);
    }

    public final void F(Activity activity) {
        Boolean boolValueOf;
        k6 k6Var;
        l5 l5Var;
        h4 h4Var;
        Boolean bool;
        boolean z;
        String strA;
        l5 l5Var2;
        String str;
        SentryAndroidOptions sentryAndroidOptions;
        k6 k6Var2;
        h4 h4Var2;
        h4 h4Var3;
        e8 e8Var;
        io.sentry.d dVarA;
        WeakReference weakReference = new WeakReference(activity);
        if (this.f86o == null || this.C.containsKey(activity)) {
            return;
        }
        boolean z2 = this.q;
        WeakHashMap weakHashMap = this.C;
        if (!z2) {
            weakHashMap.put(activity, t3.a);
            if (this.p.isEnableAutoTraceIdGeneration()) {
                this.f86o.r(new io.sentry.h2((byte) 29));
                return;
            }
            return;
        }
        for (Map.Entry entry : weakHashMap.entrySet()) {
            u((io.sentry.x1) entry.getValue(), (io.sentry.v1) this.x.get(entry.getKey()), (io.sentry.v1) this.y.get(entry.getKey()));
        }
        String simpleName = activity.getClass().getSimpleName();
        io.sentry.android.core.performance.g gVarB = io.sentry.android.core.performance.f.c().b(this.p);
        if (v0.i() && gVarB.d()) {
            k6 k6VarB = gVarB.b();
            boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.f.c().m == io.sentry.android.core.performance.e.COLD);
            k6Var = k6VarB;
        } else {
            boolValueOf = null;
            k6Var = null;
        }
        f8 f8Var = new f8();
        long deadlineTimeout = this.p.getDeadlineTimeout();
        f8Var.h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        if (this.p.isEnableActivityLifecycleTracingAutoFinish()) {
            f8Var.g = this.p.getIdleTimeout();
            f8Var.a = true;
        }
        f8Var.f = true;
        f8Var.i = new e(this, weakReference, simpleName);
        if (this.t || k6Var == null || boolValueOf == null) {
            l5Var = this.A;
            h4Var = null;
        } else {
            h4 h4Var4 = io.sentry.android.core.performance.f.c().w;
            io.sentry.android.core.performance.f.c().w = null;
            h4Var = h4Var4;
            l5Var = k6Var;
        }
        f8Var.b = l5Var;
        f8Var.e = h4Var != null;
        f8Var.d = "auto.ui.activity";
        io.sentry.util.a aVar = (io.sentry.util.a) io.sentry.android.core.performance.f.c().J.n;
        aVar.e();
        aVar.close();
        boolean z3 = io.sentry.android.core.performance.f.c().E != null;
        boolean z4 = (this.t || k6Var == null || boolValueOf == null) ? false : true;
        boolean z5 = z4 && this.p.isEnableStandaloneAppStartTracing() && !z3;
        if (z5) {
            f8 f8Var2 = new f8();
            f8Var2.c = q4.OFF;
            f8Var2.b = k6Var;
            f8Var2.e = h4Var != null;
            f8Var2.d = "auto.app.start";
            bool = boolValueOf;
            z = z3;
            io.sentry.x1 x1VarP = this.f86o.p(new e8("App Start", io.sentry.protocol.h0.COMPONENT, "app.start", h4Var), f8Var2);
            this.w = x1VarP;
            x1VarP.m(simpleName, "app.vitals.start.screen");
            String strA2 = io.sentry.android.core.performance.f.c().a();
            if (strA2 != null) {
                this.w.m(strA2, "app.vitals.start.reason");
            }
        } else {
            bool = boolValueOf;
            z = z3;
        }
        if (z5) {
            strA = this.w.c().a();
            io.sentry.e eVarJ = this.w.j(null);
            str = eVarJ == null ? null : eVarJ.a;
        } else if (!z || ((l5Var2 = io.sentry.android.core.performance.f.c().H) != null && l5Var.b(l5Var2) > 60000000000L)) {
            strA = null;
        } else {
            strA = io.sentry.android.core.performance.f.c().F;
            str = io.sentry.android.core.performance.f.c().G;
        }
        if (strA == null || (sentryAndroidOptions = this.p) == null || !sentryAndroidOptions.isTracingEnabled()) {
            k6Var2 = k6Var;
            e8Var = null;
        } else {
            io.sentry.g1 logger = this.p.getLogger();
            List listSingletonList = str == null ? null : Collections.singletonList(str);
            SentryAndroidOptions sentryAndroidOptions2 = this.p;
            try {
                n7 n7Var = new n7(strA);
                if (listSingletonList != null) {
                    try {
                        io.sentry.c cVar = io.sentry.d.i;
                        dVarA = io.sentry.d.a(logger, io.sentry.util.r.c(listSingletonList), false);
                        k6Var2 = k6Var;
                    } catch (io.sentry.exception.b e) {
                        e = e;
                        k6Var2 = k6Var;
                        logger.b(f6.DEBUG, e, "Failed to parse Sentry trace header: %s", e.getMessage());
                        h4Var2 = new h4();
                    }
                } else {
                    k6Var2 = k6Var;
                    try {
                        dVarA = io.sentry.d.a(logger, null, false);
                    } catch (io.sentry.exception.b e2) {
                        e = e2;
                        logger.b(f6.DEBUG, e, "Failed to parse Sentry trace header: %s", e.getMessage());
                        h4Var2 = new h4();
                    }
                }
                h4Var2 = h4.a(n7Var, dVarA, sentryAndroidOptions2);
            } catch (io.sentry.exception.b e3) {
                e = e3;
            }
            Boolean bool2 = (Boolean) h4Var2.a;
            io.sentry.d dVar = (io.sentry.d) h4Var2.e;
            if (bool2 == null) {
                h4Var3 = null;
            } else {
                Double d = dVar.c;
                Double d2 = dVar.d;
                h4Var3 = new h4(bool2, d, Double.valueOf(d2 == null ? 0.0d : d2.doubleValue()));
            }
            e8Var = new e8((io.sentry.protocol.w) h4Var2.b, (y7) h4Var2.c, null, h4Var3, dVar);
            e8Var.B = simpleName;
            e8Var.C = io.sentry.protocol.h0.COMPONENT;
            e8Var.q = "ui.load";
        }
        io.sentry.n1 n1Var = this.f86o;
        io.sentry.x1 x1VarP2 = e8Var != null ? n1Var.p(e8Var, f8Var) : n1Var.p(new e8(simpleName, io.sentry.protocol.h0.COMPONENT, "ui.load", h4Var), f8Var);
        if (z) {
            io.sentry.android.core.performance.f.c().E = null;
            io.sentry.android.core.performance.f.c().F = null;
            io.sentry.android.core.performance.f.c().G = null;
        }
        boolean z6 = z5;
        z7 z7Var = new z7((byte) 0);
        z7Var.d = "auto.ui.activity";
        if (z4 && !z6 && !this.p.isEnableStandaloneAppStartTracing()) {
            this.v = x1VarP2.p(bool.booleanValue() ? "app.start.cold" : "app.start.warm", bool.booleanValue() ? "Cold Start" : "Warm Start", k6Var2, io.sentry.c2.SENTRY, z7Var);
            e(null);
        }
        String strConcat = simpleName.concat(" initial display");
        io.sentry.c2 c2Var = io.sentry.c2.SENTRY;
        l5 l5Var3 = l5Var;
        io.sentry.v1 v1VarP = x1VarP2.p("ui.load.initial_display", strConcat, l5Var3, c2Var, z7Var);
        this.x.put(activity, v1VarP);
        if (this.r && this.u != null && this.p != null) {
            io.sentry.v1 v1VarP2 = x1VarP2.p("ui.load.full_display", simpleName.concat(" full display"), l5Var3, c2Var, z7Var);
            try {
                this.y.put(activity, v1VarP2);
                this.B = this.p.getExecutorService().b(new u4(this, v1VarP2, v1VarP), 25000L);
            } catch (RejectedExecutionException e4) {
                this.p.getLogger().d(f6.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e4);
            }
        }
        this.f86o.r(new q7(this, x1VarP2, (byte) 2));
        this.C.put(activity, x1VarP2);
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        w4 w4Var = w4.a;
        this.p = sentryAndroidOptions;
        this.f86o = w4Var;
        this.q = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.u = this.p.getFullyDisplayedReporter();
        this.r = this.p.isEnableTimeToFullDisplayTracing();
        this.m.registerActivityLifecycleCallbacks(this);
        if (this.q && this.p.isEnableStandaloneAppStartTracing()) {
            io.sentry.android.core.performance.f fVarC = io.sentry.android.core.performance.f.c();
            fVarC.D = new p7(this, (byte) 1);
            if (fVarC.x && fVarC.z.get() == 0 && !fVarC.A.get() && fVarC.B.compareAndSet(false, true)) {
                Looper.getMainLooper().getQueue().addIdleHandler(new io.sentry.android.core.performance.d(fVarC));
            }
            io.sentry.util.a aVar = (io.sentry.util.a) fVarC.J.n;
            aVar.e();
            aVar.close();
            io.sentry.util.b.a("StandaloneAppStart");
        }
        this.p.getLogger().g(f6.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.b.a("ActivityLifecycle");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.unregisterActivityLifecycleCallbacks(this);
        io.sentry.android.core.performance.f fVarC = io.sentry.android.core.performance.f.c();
        fVarC.D = null;
        io.sentry.util.a aVar = (io.sentry.util.a) fVarC.J.n;
        aVar.e();
        aVar.close();
        SentryAndroidOptions sentryAndroidOptions = this.p;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        d dVar = this.D;
        io.sentry.util.a aVar2 = (io.sentry.util.a) dVar.s;
        aVar2.e();
        try {
            if (dVar.j()) {
                dVar.m(new b5(dVar, (byte) 2), "FrameMetricsAggregator.stop");
                gy8 gy8Var = ((FrameMetricsAggregator) ((io.sentry.util.h) dVar.m).a()).a;
                Object obj = gy8Var.c;
                gy8Var.c = new SparseIntArray[9];
            }
            ((ConcurrentHashMap) dVar.p).clear();
            aVar2.close();
        } catch (Throwable th) {
            try {
                aVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(l5 l5Var) {
        long jA;
        if (l5Var == null) {
            io.sentry.android.core.performance.g gVarB = io.sentry.android.core.performance.f.c().b(this.p);
            if (gVarB.e()) {
                if (gVarB.d()) {
                    jA = gVarB.a() + gVarB.n;
                } else {
                    jA = 0;
                }
                l5Var = new k6(jA * 1000000);
            } else {
                l5Var = null;
            }
        }
        if (!this.q || l5Var == null) {
            return;
        }
        q(this.v, l5Var, null);
        io.sentry.x1 x1Var = this.w;
        if (x1Var != null && !x1Var.d()) {
            this.w.x(a8.OK, l5Var);
        }
        io.sentry.internal.debugmeta.c cVar = io.sentry.android.core.performance.f.c().J;
        io.sentry.util.a aVar = (io.sentry.util.a) cVar.f205o;
        aVar.e();
        try {
            io.sentry.util.a aVar2 = (io.sentry.util.a) cVar.n;
            aVar2.e();
            aVar2.close();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.o0 o0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.s) {
            onActivityPreCreated(activity, bundle);
        }
        io.sentry.util.a aVar = this.E;
        aVar.e();
        try {
            if (this.f86o != null && (sentryAndroidOptions = this.p) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.f86o.r(new f(io.sentry.config.a.o(activity), (byte) 0));
            }
            F(activity);
            io.sentry.v1 v1Var = (io.sentry.v1) this.x.get(activity);
            io.sentry.v1 v1Var2 = (io.sentry.v1) this.y.get(activity);
            this.t = true;
            if (this.q && v1Var != null && v1Var2 != null && (o0Var = this.u) != null) {
                o0Var.a.add(new io.sentry.h2((byte) 10));
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap = this.y;
        WeakHashMap weakHashMap2 = this.x;
        WeakHashMap weakHashMap3 = this.z;
        io.sentry.util.a aVar = this.E;
        aVar.e();
        try {
            io.sentry.android.core.performance.a aVar2 = (io.sentry.android.core.performance.a) weakHashMap3.remove(activity);
            if (aVar2 != null) {
                io.sentry.v1 v1Var = aVar2.d;
                if (v1Var != null && !v1Var.d()) {
                    aVar2.d.h(a8.CANCELLED);
                }
                aVar2.d = null;
                io.sentry.v1 v1Var2 = aVar2.e;
                if (v1Var2 != null && !v1Var2.d()) {
                    aVar2.e.h(a8.CANCELLED);
                }
                aVar2.e = null;
            }
            boolean z = this.q;
            WeakHashMap weakHashMap4 = this.C;
            if (z) {
                io.sentry.v1 v1Var3 = this.v;
                a8 a8Var = a8.CANCELLED;
                if (v1Var3 != null && !v1Var3.d()) {
                    v1Var3.h(a8Var);
                }
                io.sentry.x1 x1Var = this.w;
                if (x1Var != null && !x1Var.d()) {
                    this.w.h(a8Var);
                }
                io.sentry.v1 v1Var4 = (io.sentry.v1) weakHashMap2.get(activity);
                io.sentry.v1 v1Var5 = (io.sentry.v1) weakHashMap.get(activity);
                a8 a8Var2 = a8.DEADLINE_EXCEEDED;
                if (v1Var4 != null && !v1Var4.d()) {
                    v1Var4.h(a8Var2);
                }
                j(v1Var5, v1Var4);
                Future future = this.B;
                if (future != null) {
                    future.cancel(false);
                    this.B = null;
                }
                if (this.q) {
                    u((io.sentry.x1) weakHashMap4.get(activity), null, null);
                }
                this.v = null;
                this.w = null;
                weakHashMap2.remove(activity);
                weakHashMap.remove(activity);
            }
            weakHashMap4.remove(activity);
            if (weakHashMap4.isEmpty() && !activity.isChangingConfigurations()) {
                this.t = false;
                this.A = new o6(0L, 0L);
                weakHashMap3.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.util.a aVar = this.E;
        aVar.e();
        try {
            if (!this.s) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.a aVar = (io.sentry.android.core.performance.a) this.z.get(activity);
        if (aVar != null) {
            io.sentry.v1 v1Var = this.w;
            if (v1Var == null && (v1Var = this.v) == null) {
                v1Var = (io.sentry.v1) this.C.get(activity);
            }
            if (aVar.b == null || v1Var == null) {
                return;
            }
            io.sentry.v1 v1VarA = io.sentry.android.core.performance.a.a(v1Var, aVar.a.concat(".onCreate"), aVar.b);
            aVar.d = v1VarA;
            v1VarA.l();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.a aVar = (io.sentry.android.core.performance.a) this.z.get(activity);
        if (aVar != null) {
            io.sentry.v1 v1Var = this.w;
            if (v1Var == null && (v1Var = this.v) == null) {
                v1Var = (io.sentry.v1) this.C.get(activity);
            }
            if (aVar.c != null && v1Var != null) {
                io.sentry.v1 v1VarA = io.sentry.android.core.performance.a.a(v1Var, aVar.a.concat(".onStart"), aVar.c);
                aVar.e = v1VarA;
                v1VarA.l();
            }
            io.sentry.v1 v1Var2 = aVar.d;
            if (v1Var2 != null && aVar.e != null) {
                l5 l5VarW = v1Var2.w();
                l5 l5VarW2 = aVar.e.w();
                if (l5VarW != null && l5VarW2 != null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    k.a.getClass();
                    o6 o6Var = new o6();
                    long jB = o6Var.b(aVar.d.z()) / 1000000;
                    long jB2 = o6Var.b(l5VarW) / 1000000;
                    long jB3 = o6Var.b(aVar.e.z()) / 1000000;
                    long jB4 = o6Var.b(l5VarW2) / 1000000;
                    io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b();
                    String description = aVar.d.getDescription();
                    long jD = aVar.d.z().d() / 1000000;
                    io.sentry.android.core.performance.g gVar = bVar.m;
                    gVar.m = description;
                    gVar.n = jD;
                    gVar.f123o = jUptimeMillis - jB;
                    gVar.p = jUptimeMillis - jB2;
                    String description2 = aVar.e.getDescription();
                    long jD2 = aVar.e.z().d() / 1000000;
                    io.sentry.android.core.performance.g gVar2 = bVar.n;
                    gVar2.m = description2;
                    gVar2.n = jD2;
                    gVar2.f123o = jUptimeMillis - jB3;
                    gVar2.p = jUptimeMillis - jB4;
                    io.sentry.android.core.performance.f.c().t.add(bVar);
                }
            }
        }
        e(null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        l5 o6Var;
        io.sentry.android.core.performance.a aVar = new io.sentry.android.core.performance.a(activity.getClass().getName());
        this.z.put(activity, aVar);
        if (this.t) {
            return;
        }
        io.sentry.n1 n1Var = this.f86o;
        if (n1Var != null) {
            o6Var = n1Var.l().getDateProvider().a();
        } else {
            k.a.getClass();
            o6Var = new o6();
        }
        this.A = o6Var;
        aVar.b = o6Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        l5 o6Var;
        this.t = true;
        io.sentry.n1 n1Var = this.f86o;
        if (n1Var != null) {
            o6Var = n1Var.l().getDateProvider().a();
        } else {
            k.a.getClass();
            o6Var = new o6();
        }
        this.A = o6Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        l5 o6Var;
        io.sentry.android.core.performance.a aVar = (io.sentry.android.core.performance.a) this.z.get(activity);
        if (aVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.p;
            if (sentryAndroidOptions != null) {
                o6Var = sentryAndroidOptions.getDateProvider().a();
            } else {
                k.a.getClass();
                o6Var = new o6();
            }
            aVar.c = o6Var;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.util.a aVar = this.E;
        aVar.e();
        try {
            if (!this.s) {
                onActivityPostStarted(activity);
            }
            if (this.q) {
                final io.sentry.v1 v1Var = (io.sentry.v1) this.x.get(activity);
                final io.sentry.v1 v1Var2 = (io.sentry.v1) this.y.get(activity);
                if (activity.getWindow() != null) {
                    final byte b = 0;
                    io.sentry.android.core.internal.util.l.a(activity, new Runnable(this) { // from class: io.sentry.android.core.g
                        public final /* synthetic */ ActivityLifecycleIntegration n;

                        {
                            this.n = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            io.sentry.v1 v1Var3 = v1Var;
                            io.sentry.v1 v1Var4 = v1Var2;
                            ActivityLifecycleIntegration activityLifecycleIntegration = this.n;
                            switch (b2) {
                                case 0:
                                    activityLifecycleIntegration.z(v1Var4, v1Var3);
                                    break;
                                default:
                                    activityLifecycleIntegration.z(v1Var4, v1Var3);
                                    break;
                            }
                        }
                    }, this.n);
                } else {
                    final byte b2 = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.g
                        public final /* synthetic */ ActivityLifecycleIntegration n;

                        {
                            this.n = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            io.sentry.v1 v1Var3 = v1Var;
                            io.sentry.v1 v1Var4 = v1Var2;
                            ActivityLifecycleIntegration activityLifecycleIntegration = this.n;
                            switch (b3) {
                                case 0:
                                    activityLifecycleIntegration.z(v1Var4, v1Var3);
                                    break;
                                default:
                                    activityLifecycleIntegration.z(v1Var4, v1Var3);
                                    break;
                            }
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.util.a aVar = this.E;
        aVar.e();
        try {
            if (!this.s) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.q) {
                this.D.b(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void u(io.sentry.x1 x1Var, io.sentry.v1 v1Var, io.sentry.v1 v1Var2) {
        if (x1Var == null || x1Var.d()) {
            return;
        }
        a8 a8Var = a8.DEADLINE_EXCEEDED;
        if (v1Var != null && !v1Var.d()) {
            v1Var.h(a8Var);
        }
        j(v1Var2, v1Var);
        Future future = this.B;
        if (future != null) {
            future.cancel(false);
            this.B = null;
        }
        a8 status = x1Var.getStatus();
        if (status == null) {
            status = a8.OK;
        }
        x1Var.h(status);
        io.sentry.n1 n1Var = this.f86o;
        if (n1Var != null) {
            n1Var.r(new p7(this, x1Var, (byte) 2));
        }
    }

    public final void z(io.sentry.v1 v1Var, io.sentry.v1 v1Var2) {
        io.sentry.android.core.performance.f fVarC = io.sentry.android.core.performance.f.c();
        io.sentry.android.core.performance.g gVar = fVarC.p;
        io.sentry.android.core.performance.g gVar2 = fVarC.q;
        SentryAndroidOptions sentryAndroidOptions = this.p;
        l5 l5VarA = sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().a() : null;
        if (gVar.d() && gVar.c()) {
            k6 k6VarB = gVar.b();
            if (l5VarA == null || k6VarB == null) {
                gVar.p = SystemClock.uptimeMillis();
            } else {
                gVar.p = gVar.f123o + (l5VarA.b(k6VarB) / 1000000);
            }
        }
        if (gVar2.d() && gVar2.c()) {
            k6 k6VarB2 = gVar2.b();
            if (l5VarA == null || k6VarB2 == null) {
                gVar2.p = SystemClock.uptimeMillis();
            } else {
                gVar2.p = gVar2.f123o + (l5VarA.b(k6VarB2) / 1000000);
            }
        }
        e(l5VarA);
        io.sentry.util.a aVar = this.F;
        aVar.e();
        try {
            if (this.p != null && v1Var2 != null && l5VarA != null) {
                v1Var2.u("time_to_initial_display", Long.valueOf(l5VarA.b(v1Var2.z()) / 1000000), io.sentry.y2.MILLISECOND);
                q(v1Var2, l5VarA, null);
            } else if (v1Var2 != null && !v1Var2.d()) {
                v1Var2.l();
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
}
