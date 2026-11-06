package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public interface r1 {
    void a(long j);

    Future b(Runnable runnable, long j);

    boolean isClosed();

    Future submit(Runnable runnable);
}
