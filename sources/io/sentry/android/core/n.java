package io.sentry.android.core;

import io.sentry.f6;

/* JADX INFO: loaded from: classes.dex */
public final class n extends io.sentry.logger.d implements h0 {
    @Override // io.sentry.logger.d, io.sentry.logger.b
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
            sentryAndroidOptions.getExecutorService().submit(new m(this, (byte) 0));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(f6.ERROR, th, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }
}
