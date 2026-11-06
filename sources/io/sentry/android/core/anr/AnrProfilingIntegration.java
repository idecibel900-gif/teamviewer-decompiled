package io.sentry.android.core.anr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.h0;
import io.sentry.android.core.k0;
import io.sentry.b5;
import io.sentry.d2;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.g3;
import io.sentry.u4;
import io.sentry.util.p;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
public class AnrProfilingIntegration implements d2, Closeable, h0, Runnable {
    public volatile Thread A;
    public volatile d t;
    public volatile SentryAndroidOptions v;
    public volatile Handler z;
    public final AtomicBoolean m = new AtomicBoolean(true);
    public final b5 n = new b5(this, (byte) 11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.util.a f98o = new io.sentry.util.a();
    public final io.sentry.util.a p = new io.sentry.util.a();
    public volatile long q = SystemClock.uptimeMillis();
    public final AtomicInteger r = new AtomicInteger();
    public volatile a s = a.IDLE;
    public volatile g1 u = g3.m;
    public volatile Thread w = null;
    public volatile boolean x = false;
    public volatile boolean y = false;

    public enum a {
        IDLE,
        SUSPICIOUS,
        ANR_DETECTED
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.v = sentryAndroidOptions;
        this.u = sentryAndroidOptions.getLogger();
        if (this.v.isAnrProfilingEnabled()) {
            if (this.v.getCacheDirPath() == null) {
                this.u.g(f6.WARNING, "ANR Profiling is enabled but cacheDirPath is not set", new Object[0]);
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            this.A = mainLooper.getThread();
            this.z = new Handler(mainLooper);
            io.sentry.util.b.a("AnrProfiling");
            k0.q.e(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.set(false);
        k0.q.u(this);
        Handler handler = this.z;
        if (handler != null) {
            handler.removeCallbacks(this.n);
        }
        Thread thread = this.w;
        if (thread != null) {
            synchronized (this) {
                notifyAll();
            }
            thread.interrupt();
        }
        SentryAndroidOptions sentryAndroidOptions = this.v;
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            d dVar = this.t;
            this.t = null;
            aVar.close();
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new u4(this, dVar, (byte) 8));
                } catch (Throwable unused) {
                    this.u.g(f6.WARNING, "Failed to submit AnrProfileManager close", new Object[0]);
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

    @Override // io.sentry.android.core.h0
    public final void e() {
        if (this.m.get()) {
            io.sentry.util.a aVar = this.f98o;
            aVar.e();
            try {
                if (this.y) {
                    aVar.close();
                    return;
                }
                this.y = true;
                this.n.run();
                Thread thread = this.w;
                if (thread != null && thread.isAlive()) {
                    synchronized (this) {
                        notifyAll();
                    }
                }
                if (thread == null || !thread.isAlive()) {
                    Thread thread2 = new Thread(this, "AnrProfilingIntegration");
                    thread2.setDaemon(true);
                    thread2.start();
                    this.w = thread2;
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
    }

    @Override // io.sentry.android.core.h0
    public final void j() {
        if (this.m.get()) {
            io.sentry.util.a aVar = this.f98o;
            aVar.e();
            try {
                this.y = false;
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

    public final void q(Thread thread) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.q;
        if (jUptimeMillis < 1000) {
            this.s = a.IDLE;
            this.x = false;
        }
        if (this.s == a.IDLE && jUptimeMillis > 1000) {
            g1 g1Var = this.u;
            f6 f6Var = f6.DEBUG;
            if (g1Var.i(f6Var)) {
                this.u.g(f6Var, "ANR: main thread is suspicious", new Object[0]);
            }
            this.s = a.SUSPICIOUS;
            SentryAndroidOptions sentryAndroidOptions = this.v;
            Double anrProfilingSampleRate = sentryAndroidOptions != null ? sentryAndroidOptions.getAnrProfilingSampleRate() : null;
            if (anrProfilingSampleRate != null && p.a().c() < anrProfilingSampleRate.doubleValue()) {
                this.x = true;
            }
            if (this.x) {
                this.r.set(0);
                u().m.clear();
            }
        }
        if (this.x && (this.s == a.SUSPICIOUS || this.s == a.ANR_DETECTED)) {
            if (this.r.get() < 151) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                f fVar = new f(System.currentTimeMillis(), thread.getStackTrace());
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
                g1 g1Var2 = this.u;
                f6 f6Var2 = f6.DEBUG;
                if (g1Var2.i(f6Var2)) {
                    this.u.g(f6Var2, to7.j(jUptimeMillis3, "AnrWatchdog: capturing main thread stacktrace took ", "ms"), new Object[0]);
                }
                if (this.m.get()) {
                    this.r.incrementAndGet();
                    u().m.G(fVar);
                }
            } else {
                g1 g1Var3 = this.u;
                f6 f6Var3 = f6.DEBUG;
                if (g1Var3.i(f6Var3)) {
                    this.u.g(f6Var3, "ANR: reached maximum number of collected stack traces, skipping further collection", new Object[0]);
                }
            }
        }
        if (this.s != a.SUSPICIOUS || jUptimeMillis <= 4000) {
            return;
        }
        g1 g1Var4 = this.u;
        f6 f6Var4 = f6.DEBUG;
        if (g1Var4.i(f6Var4)) {
            this.u.g(f6Var4, "ANR: main thread ANR threshold reached", new Object[0]);
        }
        this.s = a.ANR_DETECTED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.z;
        Thread thread = this.A;
        if (handler == null || thread == null) {
            return;
        }
        while (this.m.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    if (this.y) {
                        q(thread);
                        handler.removeCallbacks(this.n);
                        handler.post(this.n);
                        Thread.sleep(66L);
                    } else {
                        synchronized (this) {
                            while (!this.y && this.m.get()) {
                                try {
                                    wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        this.n.run();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable th2) {
                this.u.d(f6.WARNING, "Failed to execute AnrStacktraceIntegration", th2);
                return;
            }
        }
    }

    public final d u() {
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            if (this.t == null) {
                SentryAndroidOptions sentryAndroidOptions = this.v;
                io.sentry.util.b.v(sentryAndroidOptions, "Options can't be null");
                String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
                if (cacheDirPath == null) {
                    throw new IllegalStateException("cacheDirPath is required for ANR profiling");
                }
                File file = new File(cacheDirPath);
                e.b(file);
                this.t = new d(sentryAndroidOptions, new File(file, "anr_profile"));
            }
            d dVar = this.t;
            aVar.close();
            return dVar;
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
