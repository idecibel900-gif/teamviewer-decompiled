package io.sentry.android.core;

import android.content.Context;
import io.sentry.f6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class AnrV2Integration implements io.sentry.d2, Closeable {
    public final Context m;
    public SentryAndroidOptions n;

    public AnrV2Integration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.n = sentryAndroidOptions;
        io.sentry.g1 logger = sentryAndroidOptions.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "AnrIntegration enabled: %s", Boolean.valueOf(this.n.isAnrEnabled()));
        String cacheDirPath = this.n.getCacheDirPath();
        SentryAndroidOptions sentryAndroidOptions2 = this.n;
        if (cacheDirPath == null) {
            sentryAndroidOptions2.getLogger().g(f6.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (sentryAndroidOptions2.isAnrEnabled()) {
            try {
                io.sentry.r1 executorService = sentryAndroidOptions.getExecutorService();
                Context context = this.m;
                SentryAndroidOptions sentryAndroidOptions3 = this.n;
                executorService.submit(new p0(context, sentryAndroidOptions3, new a0(sentryAndroidOptions3, (byte) 1)));
            } catch (Throwable th) {
                io.sentry.g1 logger2 = sentryAndroidOptions.getLogger();
                f6Var = f6.DEBUG;
                logger2.d(f6Var, "Failed to start ANR processor.", th);
            }
            sentryAndroidOptions.getLogger().g(f6Var, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.b.a("AnrV2");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.n;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }
}
