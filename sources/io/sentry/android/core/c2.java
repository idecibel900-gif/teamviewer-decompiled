package io.sentry.android.core;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements io.sentry.h1 {
    public final SentryAndroidOptions a;
    public final long b;

    public c2(SentryAndroidOptions sentryAndroidOptions, long j) {
        this.a = sentryAndroidOptions;
        this.b = j;
    }

    @Override // io.sentry.h1
    public final void a(Map map) {
    }

    @Override // io.sentry.h1
    public final void b(io.sentry.protocol.u uVar) {
    }

    @Override // io.sentry.h1
    public final void c(String str) {
    }

    @Override // io.sentry.h1
    public final void d(Double d) {
    }

    @Override // io.sentry.h1
    public final void e(String str) {
    }

    @Override // io.sentry.h1
    public final void f(String str) {
    }

    @Override // io.sentry.h1
    public final void g(String str) {
        io.sentry.cache.a.d(this.a, Long.toString(this.b), ".options-cache", "app-last-update-time.json");
    }
}
