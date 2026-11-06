package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import io.sentry.f6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class MemoryLimiterIntegration implements io.sentry.d2, Closeable {
    public final Context m;
    public SentryAndroidOptions n;

    public MemoryLimiterIntegration(Context context, q0 q0Var) {
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.n = sentryAndroidOptions;
        io.sentry.g1 logger = sentryAndroidOptions.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "MemoryLimiterIntegration enabled: %s", Boolean.valueOf(this.n.isMemoryLimiterEnabled()));
        if (this.n.isMemoryLimiterEnabled()) {
            int i = Build.VERSION.SDK_INT;
            SentryAndroidOptions sentryAndroidOptions2 = this.n;
            if (i < 37) {
                sentryAndroidOptions2.getLogger().g(f6.INFO, "MemoryLimiter is only supported on Android API 37 and above. Skipping registration.", new Object[0]);
                return;
            }
            if (sentryAndroidOptions2.getCacheDirPath() == null) {
                this.n.getLogger().g(f6.INFO, "Cache dir is not set, unable to process MemoryLimiter exits. Skipping registration.", new Object[0]);
                return;
            }
            try {
                io.sentry.r1 executorService = sentryAndroidOptions.getExecutorService();
                Context context = this.m;
                SentryAndroidOptions sentryAndroidOptions3 = this.n;
                executorService.submit(new p0(context, sentryAndroidOptions3, new a0(sentryAndroidOptions3, (byte) 2)));
            } catch (Throwable th) {
                io.sentry.util.b.w(th);
                io.sentry.g1 logger2 = sentryAndroidOptions.getLogger();
                f6Var = f6.DEBUG;
                logger2.d(f6Var, "Failed to start MemoryLimiter processor.", th);
            }
            sentryAndroidOptions.getLogger().g(f6Var, "MemoryLimiterIntegration installed.", new Object[0]);
            io.sentry.util.b.a("MemoryLimiter");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.n;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "MemoryLimiterIntegration removed.", new Object[0]);
        }
    }
}
