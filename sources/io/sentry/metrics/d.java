package io.sentry.metrics;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.j5;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a, b {
    public static final d m = new d();

    @Override // io.sentry.metrics.a
    public void a(boolean z) {
    }

    @Override // io.sentry.metrics.a
    public void b(long j) {
    }

    @Override // io.sentry.metrics.b
    /* JADX INFO: renamed from: c */
    public a mo21c(SentryAndroidOptions sentryAndroidOptions, j5 j5Var) {
        return new c(sentryAndroidOptions, j5Var);
    }
}
