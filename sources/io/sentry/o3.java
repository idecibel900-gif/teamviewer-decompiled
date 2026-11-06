package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class o3 implements r1 {
    public static final o3 a = new o3();

    @Override // io.sentry.r1
    public final void a(long j) {
    }

    @Override // io.sentry.r1
    public final Future b(Runnable runnable, long j) {
        return new i();
    }

    @Override // io.sentry.r1
    public final boolean isClosed() {
        return false;
    }

    @Override // io.sentry.r1
    public final Future submit(Runnable runnable) {
        return new i();
    }
}
