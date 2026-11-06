package io.sentry.android.replay;

import android.os.Handler;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.m7;
import java.util.concurrent.atomic.AtomicBoolean;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Runnable {
    public final SentryAndroidOptions m;
    public final m7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b0 f154o;
    public c0 p;
    public final AtomicBoolean q;

    public h0(SentryAndroidOptions sentryAndroidOptions, m7 m7Var) {
        m7Var.getClass();
        this.m = sentryAndroidOptions;
        this.n = m7Var;
        this.q = new AtomicBoolean(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.q.get();
        SentryAndroidOptions sentryAndroidOptions = this.m;
        if (!z) {
            if (sentryAndroidOptions.getSessionReplay().m) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                return;
            }
            return;
        }
        try {
            if (sentryAndroidOptions.getSessionReplay().m) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Capturing a frame.", new Object[0]);
            }
            b0 b0Var = this.f154o;
            if (b0Var != null) {
                b0Var.b();
            }
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to capture a frame", th);
        }
        if (sentryAndroidOptions.getSessionReplay().m) {
            g1 logger = sentryAndroidOptions.getLogger();
            f6 f6Var = f6.DEBUG;
            StringBuilder sb = new StringBuilder("Posting the capture runnable again, frame rate is ");
            c0 c0Var = this.p;
            logger.g(f6Var, to7.l(sb, c0Var != null ? c0Var.e : 1, " fps."), new Object[0]);
        }
        c0 c0Var2 = this.p;
        if (((Handler) this.n.n).postDelayed(this, 1000 / ((long) (c0Var2 != null ? c0Var2.e : 1)))) {
            return;
        }
        sentryAndroidOptions.getLogger().g(f6.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
    }
}
