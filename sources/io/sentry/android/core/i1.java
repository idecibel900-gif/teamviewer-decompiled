package io.sentry.android.core;

import io.sentry.b5;
import io.sentry.d5;
import io.sentry.f6;
import io.sentry.p7;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements h0 {
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Future f108o;
    public final boolean q;
    public final boolean r;
    public final AtomicLong m = new AtomicLong(0);
    public final io.sentry.util.a p = new io.sentry.util.a();

    public i1(long j, boolean z, boolean z2) {
        this.n = j;
        this.q = z;
        this.r = z2;
    }

    public final void a(String str) {
        if (this.r) {
            io.sentry.h hVar = new io.sentry.h();
            hVar.q = "navigation";
            hVar.d(str, "state");
            hVar.s = "app.lifecycle";
            hVar.u = f6.INFO;
            d5.c().f(hVar, new io.sentry.p0());
        }
    }

    public final void b() {
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            Future future = this.f108o;
            if (future != null) {
                future.cancel(false);
                this.f108o = null;
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

    @Override // io.sentry.android.core.h0
    public final void e() {
        b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        d5.c().r(new p7(this, (byte) 4));
        AtomicLong atomicLong = this.m;
        long j = atomicLong.get();
        boolean z = j == 0 || j + this.n <= jCurrentTimeMillis;
        if (z && this.q) {
            d5.c().o();
        }
        d5.c().l().getReplayController().q(z);
        atomicLong.set(jCurrentTimeMillis);
        a("foreground");
    }

    @Override // io.sentry.android.core.h0
    public final void j() {
        this.m.set(System.currentTimeMillis());
        d5.c().l().getReplayController().F();
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            b();
            b5 b5Var = new b5(this, (byte) 6);
            try {
                this.f108o = d5.c().l().getTimerExecutorService().b(b5Var, this.n);
            } catch (Throwable th) {
                d5.c().l().getLogger().d(f6.WARNING, "Failed to schedule end of session. Ending it now.", th);
                b5Var.run();
            }
            aVar.close();
            a("background");
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
