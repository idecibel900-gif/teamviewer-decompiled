package o;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ra2 implements AutoCloseable {
    public static final ra2 m = new ra2();
    public static final AtomicInteger n = new AtomicInteger(0);

    @Override // java.lang.AutoCloseable
    public final void close() {
        n.set(0);
    }
}
