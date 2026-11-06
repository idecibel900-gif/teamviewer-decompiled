package io.sentry.android.core;

import android.content.Context;
import io.sentry.f6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class TombstoneIntegration implements io.sentry.d2, Closeable {
    public final Context m;
    public SentryAndroidOptions n;

    public TombstoneIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.n = sentryAndroidOptions;
        io.sentry.g1 logger = sentryAndroidOptions.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.n.isTombstoneEnabled()));
        if (this.n.isTombstoneEnabled()) {
            if (this.n.getCacheDirPath() == null) {
                this.n.getLogger().g(f6.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                io.sentry.r1 executorService = sentryAndroidOptions.getExecutorService();
                Context context = this.m;
                SentryAndroidOptions sentryAndroidOptions2 = this.n;
                executorService.submit(new p0(context, sentryAndroidOptions2, new io.sentry.o(context, sentryAndroidOptions2)));
            } catch (Throwable th) {
                io.sentry.g1 logger2 = sentryAndroidOptions.getLogger();
                f6Var = f6.DEBUG;
                logger2.d(f6Var, "Failed to start tombstone processor.", th);
            }
            sentryAndroidOptions.getLogger().g(f6Var, "TombstoneIntegration installed.", new Object[0]);
            io.sentry.util.b.a("Tombstone");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.n;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }
}
