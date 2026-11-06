package io.sentry.android.replay.util;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import o.f88;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Future {
    public static final a m = new a();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return f88.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return f88.a;
    }
}
