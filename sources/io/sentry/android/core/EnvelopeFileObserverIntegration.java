package io.sentry.android.core;

import io.sentry.f6;
import io.sentry.w4;
import io.sentry.y3;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class EnvelopeFileObserverIntegration implements io.sentry.d2, Closeable {
    public e1 m;
    public io.sentry.g1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f90o = false;
    public final io.sentry.util.a p = new io.sentry.util.a();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.n = sentryAndroidOptions.getLogger();
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        io.sentry.g1 g1Var = this.n;
        if (outboxPath == null) {
            g1Var.g(f6.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        g1Var.g(f6.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            sentryAndroidOptions.getExecutorService().submit(new d2(this, sentryAndroidOptions, outboxPath, (byte) 3));
        } catch (Throwable th) {
            this.n.d(f6.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            this.f90o = true;
            aVar.close();
            e1 e1Var = this.m;
            if (e1Var != null) {
                e1Var.stopWatching();
                io.sentry.g1 g1Var = this.n;
                if (g1Var != null) {
                    g1Var.g(f6.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(SentryAndroidOptions sentryAndroidOptions, String str) {
        if (!io.sentry.util.b.f(new File(str))) {
            sentryAndroidOptions.getLogger().g(f6.ERROR, "Failed to create outbox dir %s", str);
        }
        e1 e1Var = new e1(str, new y3(w4.a, sentryAndroidOptions.getEnvelopeReader(), sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize()), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis());
        this.m = e1Var;
        try {
            e1Var.startWatching();
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.util.b.a("EnvelopeFileObserver");
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }
}
