package io.sentry.android.core;

import io.sentry.f6;

/* JADX INFO: loaded from: classes.dex */
public final class p extends io.sentry.metrics.c implements h0 {
    @Override // io.sentry.metrics.c, io.sentry.metrics.a
    public final void a(boolean z) {
        k0.q.u(this);
        super.a(z);
    }

    @Override // io.sentry.android.core.h0
    public final void e() {
    }

    @Override // io.sentry.android.core.h0
    public final void j() {
        SentryAndroidOptions sentryAndroidOptions = this.m;
        try {
            sentryAndroidOptions.getExecutorService().submit(new m(this, (byte) 1));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(f6.ERROR, th, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }
}
