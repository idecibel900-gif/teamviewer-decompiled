package io.sentry.backpressure;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.d5;
import io.sentry.f6;
import io.sentry.r1;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, Runnable {
    public final SentryAndroidOptions m;
    public int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile Future f181o = null;
    public final io.sentry.util.a p = new io.sentry.util.a();

    public a(SentryAndroidOptions sentryAndroidOptions) {
        this.m = sentryAndroidOptions;
    }

    @Override // io.sentry.backpressure.b
    public final int a() {
        return this.n;
    }

    public final void b(int i) {
        r1 executorService = this.m.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            try {
                this.f181o = executorService.b(this, i);
            } catch (RejectedExecutionException e) {
                this.m.getLogger().d(f6.WARNING, "Backpressure monitor reschedule task rejected", e);
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

    @Override // io.sentry.backpressure.b
    public final void close() {
        Future future = this.f181o;
        if (future != null) {
            io.sentry.util.a aVar = this.p;
            aVar.e();
            try {
                future.cancel(true);
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

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD = d5.c().d();
        int i = this.n;
        SentryAndroidOptions sentryAndroidOptions = this.m;
        if (zD) {
            if (i > 0) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.n = 0;
        } else if (i < 10) {
            this.n = i + 1;
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.n));
        }
        b(10000);
    }

    @Override // io.sentry.backpressure.b
    public final void start() {
        b(500);
    }
}
