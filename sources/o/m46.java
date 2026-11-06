package o;

/* JADX INFO: loaded from: classes.dex */
public final class m46 {
    public final io.sentry.util.network.b a;
    public final nd b;
    public final Object c = new Object();

    public m46(io.sentry.util.network.b bVar, nd ndVar) {
        this.a = bVar;
        this.b = ndVar;
    }

    public final void a(long j) {
        synchronized (this.c) {
            io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) this.a.d;
            cVar.n = j;
            cVar.i(j);
        }
    }
}
