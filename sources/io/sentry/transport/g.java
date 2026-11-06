package io.sentry.transport;

import io.sentry.p0;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface g extends Closeable {
    void a(boolean z);

    void b(long j);

    p c();

    default boolean d() {
        return true;
    }

    void n0(io.sentry.internal.debugmeta.c cVar, p0 p0Var);
}
