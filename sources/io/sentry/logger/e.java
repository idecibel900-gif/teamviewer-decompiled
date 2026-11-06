package io.sentry.logger;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.h6;
import io.sentry.j5;
import io.sentry.j6;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a, b, c {
    public static final e m = new e();
    public static final e n = new e();

    @Override // io.sentry.logger.b
    public void a(boolean z) {
    }

    @Override // io.sentry.logger.b
    public void b(long j) {
    }

    @Override // io.sentry.logger.c
    public b c(SentryAndroidOptions sentryAndroidOptions, j5 j5Var) {
        return new d(sentryAndroidOptions, j5Var);
    }

    @Override // io.sentry.logger.b
    public void d(h6 h6Var) {
    }

    @Override // io.sentry.logger.a
    public void e(j6 j6Var, io.sentry.e eVar, String str, Object... objArr) {
    }
}
