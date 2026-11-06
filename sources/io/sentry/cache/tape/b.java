package io.sentry.cache.tape;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a();
    }
}
