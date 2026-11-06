package io.sentry.android.replay;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Closeable {
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final io.sentry.util.a n = new io.sentry.util.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.android.core.i0 f173o = new io.sentry.android.core.i0(this, 1);
    public final x p = new x(this);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.set(true);
        this.f173o.clear();
    }
}
