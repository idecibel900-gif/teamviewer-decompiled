package o;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class ng1 implements Closeable {
    public ex5 m;
    public f4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ex5 f1566o;
    public ie2 p;
    public ex5 q;
    public ex5 r;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((tg6) this.q.get()).close();
    }
}
