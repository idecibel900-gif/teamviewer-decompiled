package io.sentry.android.core;

import android.content.Context;
import io.sentry.f6;
import io.sentry.q7;
import io.sentry.u4;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class AnrIntegration implements io.sentry.d2, Closeable {
    public static a q;
    public static final io.sentry.util.a r = new io.sentry.util.a();
    public final Context m;
    public boolean n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.util.a f87o = new io.sentry.util.a();
    public SentryAndroidOptions p;

    public AnrIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.p = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().g(f6.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.b.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new u4(this, sentryAndroidOptions, (byte) 3));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(f6.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.f87o;
        aVar.e();
        try {
            this.n = true;
            aVar.close();
            io.sentry.util.a aVar2 = r;
            aVar2.e();
            try {
                a aVar3 = q;
                if (aVar3 != null) {
                    aVar3.interrupt();
                    q = null;
                    SentryAndroidOptions sentryAndroidOptions = this.p;
                    if (sentryAndroidOptions != null) {
                        sentryAndroidOptions.getLogger().g(f6.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                aVar2.close();
            } catch (Throwable th) {
                try {
                    aVar2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                aVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void e(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.a aVar = r;
        aVar.e();
        try {
            if (q == null) {
                io.sentry.g1 logger = sentryAndroidOptions.getLogger();
                f6 f6Var = f6.DEBUG;
                logger.g(f6Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                a aVar2 = new a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new q7(this, sentryAndroidOptions, (byte) 3), sentryAndroidOptions.getLogger(), this.m);
                q = aVar2;
                aVar2.start();
                sentryAndroidOptions.getLogger().g(f6Var, "AnrIntegration installed.", new Object[0]);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
