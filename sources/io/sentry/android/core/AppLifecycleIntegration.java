package io.sentry.android.core;

import io.sentry.f6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class AppLifecycleIntegration implements io.sentry.d2, Closeable {
    public final io.sentry.util.a m = new io.sentry.util.a();
    public volatile i1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SentryAndroidOptions f89o;

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.f89o = sentryAndroidOptions;
        io.sentry.g1 logger = sentryAndroidOptions.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f89o.isEnableAutoSessionTracking()));
        this.f89o.getLogger().g(f6Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f89o.isEnableAppLifecycleBreadcrumbs()));
        if (this.f89o.isEnableAutoSessionTracking() || this.f89o.isEnableAppLifecycleBreadcrumbs()) {
            io.sentry.util.a aVar = this.m;
            aVar.e();
            try {
                if (this.n != null) {
                    aVar.close();
                    return;
                }
                this.n = new i1(this.f89o.getSessionTrackingIntervalMillis(), this.f89o.isEnableAutoSessionTracking(), this.f89o.isEnableAppLifecycleBreadcrumbs());
                k0.q.e(this.n);
                aVar.close();
                sentryAndroidOptions.getLogger().g(f6Var, "AppLifecycleIntegration installed.", new Object[0]);
                io.sentry.util.b.a("AppLifecycle");
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.m;
        aVar.e();
        try {
            i1 i1Var = this.n;
            this.n = null;
            aVar.close();
            if (i1Var != null) {
                k0.q.u(i1Var);
                SentryAndroidOptions sentryAndroidOptions = this.f89o;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            k0.q.z();
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
