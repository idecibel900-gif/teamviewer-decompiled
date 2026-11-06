package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.f6;
import io.sentry.w4;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityBreadcrumbsIntegration implements io.sentry.d2, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application m;
    public io.sentry.n1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f85o;
    public final io.sentry.util.a p = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.m = application;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.n = w4.a;
        this.f85o = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        io.sentry.g1 logger = sentryAndroidOptions.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f85o));
        if (this.f85o) {
            this.m.registerActivityLifecycleCallbacks(this);
            sentryAndroidOptions.getLogger().g(f6Var, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.b.a("ActivityBreadcrumbs");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f85o) {
            this.m.unregisterActivityLifecycleCallbacks(this);
            io.sentry.n1 n1Var = this.n;
            if (n1Var != null) {
                n1Var.l().getLogger().g(f6.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    public final void e(Activity activity, String str) {
        if (this.n == null) {
            return;
        }
        io.sentry.h hVar = new io.sentry.h();
        hVar.q = "navigation";
        hVar.d(str, "state");
        hVar.d(activity.getClass().getSimpleName(), "screen");
        hVar.s = "ui.lifecycle";
        hVar.u = f6.INFO;
        io.sentry.p0 p0Var = new io.sentry.p0();
        p0Var.d(activity, "android:activity");
        this.n.f(hVar, p0Var);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            e(activity, "created");
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
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            e(activity, "destroyed");
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
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            e(activity, "paused");
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
    public final void onActivityResumed(Activity activity) {
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            e(activity, "resumed");
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
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            e(activity, "saveInstanceState");
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
    public final void onActivityStarted(Activity activity) {
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            e(activity, "started");
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
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            e(activity, "stopped");
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
