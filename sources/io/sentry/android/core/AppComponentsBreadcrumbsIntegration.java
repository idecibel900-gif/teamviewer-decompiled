package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.f6;
import io.sentry.w4;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class AppComponentsBreadcrumbsIntegration implements io.sentry.d2, Closeable, ComponentCallbacks2 {
    public static final io.sentry.p0 q = new io.sentry.p0();
    public final Context m;
    public io.sentry.n1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SentryAndroidOptions f88o;
    public final io.sentry.android.core.internal.util.i p = new io.sentry.android.core.internal.util.i(0, 60000);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.n = w4.a;
        this.f88o = sentryAndroidOptions;
        io.sentry.g1 logger = sentryAndroidOptions.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f88o.isEnableAppComponentBreadcrumbs()));
        if (this.f88o.isEnableAppComponentBreadcrumbs()) {
            try {
                this.m.registerComponentCallbacks(this);
                sentryAndroidOptions.getLogger().g(f6Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.b.a("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.f88o.setEnableAppComponentBreadcrumbs(false);
                sentryAndroidOptions.getLogger().b(f6.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.m.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.f88o;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().b(f6.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f88o;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().g(f6.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    public final void e(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f88o;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.f88o.getLogger().b(f6.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        e(new f0(this, System.currentTimeMillis(), configuration));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i) {
        if (i >= 40 && !this.p.a()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            e(new Runnable() { // from class: io.sentry.android.core.g0
                @Override // java.lang.Runnable
                public final void run() {
                    io.sentry.p0 p0Var = AppComponentsBreadcrumbsIntegration.q;
                    AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = this.m;
                    if (appComponentsBreadcrumbsIntegration.n != null) {
                        io.sentry.h hVar = new io.sentry.h(jCurrentTimeMillis);
                        hVar.q = "system";
                        hVar.s = "device.event";
                        hVar.p = "Low memory";
                        hVar.d("LOW_MEMORY", "action");
                        hVar.d(Integer.valueOf(i), "level");
                        hVar.u = f6.WARNING;
                        appComponentsBreadcrumbsIntegration.n.f(hVar, AppComponentsBreadcrumbsIntegration.q);
                    }
                }
            });
        }
    }
}
