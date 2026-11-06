package o;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class kj0 implements ic4 {
    public final WeakReference m;
    public final jj0 n = new jj0(this);

    public kj0(gj0 gj0Var) {
        this.m = new WeakReference(gj0Var);
    }

    @Override // o.ic4
    public final void addListener(Runnable runnable, Executor executor) {
        this.n.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        gj0 gj0Var = (gj0) this.m.get();
        boolean zCancel = this.n.cancel(z);
        if (zCancel && gj0Var != null) {
            gj0Var.a = null;
            gj0Var.b = null;
            gj0Var.c.set(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.n.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.n.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.n.isDone();
    }

    public final String toString() {
        return this.n.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.n.get(j, timeUnit);
    }
}
