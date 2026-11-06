package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class ShutdownHookIntegration implements d2, Closeable {
    public final Runtime m;
    public Thread n;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        io.sentry.util.b.v(runtime, "Runtime is required");
        this.m = runtime;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        if (!sentryAndroidOptions.isEnableShutdownHook()) {
            sentryAndroidOptions.getLogger().g(f6.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.n = new Thread(new a5(sentryAndroidOptions, (byte) 3), "sentry-shutdownhook");
        try {
            new u4((Object) this, (Object) sentryAndroidOptions, (byte) 1).run();
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n != null) {
            try {
                this.m.removeShutdownHook(this.n);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e;
                }
            }
        }
    }
}
