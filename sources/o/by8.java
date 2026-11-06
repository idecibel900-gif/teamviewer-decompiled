package o;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class by8 implements lt8 {
    public final WeakReference m;
    public final zx8 n = new zx8(this);

    public by8(sx8 sx8Var) {
        this.m = new WeakReference(sx8Var);
    }

    @Override // o.lt8
    public final void a(Runnable runnable, Executor executor) {
        this.n.a(runnable, executor);
    }

    public final void b(Throwable th) {
        qu8 qu8Var = new qu8(th);
        l47 l47Var = rx8.r;
        zx8 zx8Var = this.n;
        if (l47Var.x(zx8Var, null, qu8Var)) {
            rx8.c(zx8Var);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        sx8 sx8Var = (sx8) this.m.get();
        boolean zCancel = this.n.cancel(z);
        if (!zCancel || sx8Var == null) {
            return zCancel;
        }
        sx8Var.a = null;
        sx8Var.b = null;
        sx8Var.c.h(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.n.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.n.m instanceof rt8;
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
