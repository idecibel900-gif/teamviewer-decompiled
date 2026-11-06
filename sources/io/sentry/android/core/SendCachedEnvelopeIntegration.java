package io.sentry.android.core;

import io.sentry.f6;
import io.sentry.w4;
import io.sentry.y4;
import io.sentry.z4;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class SendCachedEnvelopeIntegration implements io.sentry.d2, io.sentry.z0, Closeable {
    public final z4 m;
    public final io.sentry.util.h n;
    public io.sentry.a1 p;
    public io.sentry.n1 q;
    public SentryAndroidOptions r;
    public y4 s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f93o = new AtomicBoolean(false);
    public final AtomicBoolean t = new AtomicBoolean(false);
    public final AtomicBoolean u = new AtomicBoolean(false);
    public final io.sentry.util.a v = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(z4 z4Var, io.sentry.util.h hVar) {
        this.m = z4Var;
        this.n = hVar;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        w4 w4Var = w4.a;
        this.q = w4Var;
        this.r = sentryAndroidOptions;
        if (!z4.b(sentryAndroidOptions.getLogger(), sentryAndroidOptions.getCacheDirPath())) {
            sentryAndroidOptions.getLogger().g(f6.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.b.a("SendCachedEnvelope");
            e(w4Var, this.r);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.u.set(true);
        io.sentry.a1 a1Var = this.p;
        if (a1Var != null) {
            a1Var.w0(this);
        }
    }

    public final void e(io.sentry.n1 n1Var, SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.util.a aVar = this.v;
            aVar.e();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new d2(this, sentryAndroidOptions, n1Var, (byte) 0));
                if (((Boolean) this.n.a()).booleanValue() && this.f93o.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to call the executor. Cached events will not be sent", th3);
        }
    }

    @Override // io.sentry.z0
    public final void u(io.sentry.y0 y0Var) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.n1 n1Var = this.q;
        if (n1Var == null || (sentryAndroidOptions = this.r) == null || y0Var == io.sentry.y0.DISCONNECTED) {
            return;
        }
        e(n1Var, sentryAndroidOptions);
    }
}
