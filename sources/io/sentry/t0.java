package io.sentry;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public static volatile t0 g;
    public static final io.sentry.util.a h = new io.sentry.util.a();
    public final int a;
    public volatile String b;
    public volatile long c;
    public final AtomicBoolean d;
    public final q0 e;
    public final ThreadPoolExecutor f;

    public t0() {
        q0 q0Var = new q0((byte) 0);
        this.d = new AtomicBoolean(false);
        this.a = 18000000;
        this.e = q0Var;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s0((byte) 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f = threadPoolExecutor;
        b();
    }

    public static t0 a() {
        if (g == null) {
            io.sentry.util.a aVar = h;
            aVar.e();
            try {
                if (g == null) {
                    g = new t0();
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
        return g;
    }

    public final void b() {
        try {
            try {
                this.f.submit(new r0(this, (byte) 0)).get(1000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                this.c = System.currentTimeMillis() + 1000;
            } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
                this.c = System.currentTimeMillis() + 1000;
            }
        } catch (RejectedExecutionException unused3) {
            this.d.set(false);
            this.c = System.currentTimeMillis() + 1000;
        }
    }
}
