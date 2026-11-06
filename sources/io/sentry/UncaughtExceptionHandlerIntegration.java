package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class UncaughtExceptionHandlerIntegration implements d2, Thread.UncaughtExceptionHandler, Closeable {
    public static final io.sentry.util.a q = new io.sentry.util.a();
    public Thread.UncaughtExceptionHandler m;
    public n1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SentryAndroidOptions f83o;
    public boolean p;

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
        n1 n1Var;
        if (this.p) {
            sentryAndroidOptions.getLogger().g(f6.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.p = true;
        this.n = w4.a;
        this.f83o = sentryAndroidOptions;
        g1 logger = sentryAndroidOptions.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f83o.isEnableUncaughtExceptionHandler()));
        if (this.f83o.isEnableUncaughtExceptionHandler()) {
            io.sentry.util.a aVar = q;
            aVar.e();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.f83o.getLogger().g(f6Var, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if ((defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) && (n1Var = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).n) != null && d5.c == n1Var.u()) {
                        this.m = uncaughtExceptionHandlerIntegration.m;
                    } else {
                        this.m = defaultUncaughtExceptionHandler;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                aVar.close();
                this.f83o.getLogger().g(f6Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                io.sentry.util.b.a("UncaughtExceptionHandler");
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
        io.sentry.util.a aVar = q;
        aVar.e();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.m);
                SentryAndroidOptions sentryAndroidOptions = this.f83o;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                e(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
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

    public final void e(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f83o;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            SentryAndroidOptions sentryAndroidOptions2 = this.f83o;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().g(f6.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.m;
            if (this != uncaughtExceptionHandler2) {
                e(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.m = this.m;
            SentryAndroidOptions sentryAndroidOptions3 = this.f83o;
            if (sentryAndroidOptions3 != null) {
                sentryAndroidOptions3.getLogger().g(f6.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        io.sentry.protocol.w wVar;
        SentryAndroidOptions sentryAndroidOptions = this.f83o;
        if (sentryAndroidOptions == null || this.n == null) {
            return;
        }
        sentryAndroidOptions.getLogger().g(f6.INFO, "Uncaught exception received.", new Object[0]);
        try {
            g8 g8Var = new g8(this.f83o.getFlushTimeoutMillis(), this.f83o.getLogger());
            io.sentry.protocol.o oVar = new io.sentry.protocol.o();
            oVar.p = Boolean.FALSE;
            oVar.m = "UncaughtExceptionHandler";
            v5 v5Var = new v5(new io.sentry.exception.a(oVar, th, thread, false));
            v5Var.G = f6.FATAL;
            if (this.n.m() == null && (wVar = v5Var.m) != null) {
                g8Var.g(wVar);
            }
            p0 p0VarG = io.sentry.util.b.g(g8Var);
            boolean zEquals = this.n.B(v5Var, p0VarG).equals(io.sentry.protocol.w.n);
            io.sentry.hints.e eVar = (io.sentry.hints.e) p0VarG.c(io.sentry.hints.e.class, "sentry:eventDropReason");
            if ((!zEquals || io.sentry.hints.e.MULTITHREADED_DEDUPLICATION.equals(eVar)) && !g8Var.d()) {
                this.f83o.getLogger().g(f6.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", v5Var.m);
            }
        } catch (Throwable th2) {
            this.f83o.getLogger().d(f6.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.m;
        SentryAndroidOptions sentryAndroidOptions2 = this.f83o;
        if (uncaughtExceptionHandler != null) {
            sentryAndroidOptions2.getLogger().g(f6.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.m.uncaughtException(thread, th);
        } else if (sentryAndroidOptions2.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }
}
