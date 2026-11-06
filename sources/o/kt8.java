package o;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class kt8 implements lt8 {
    public static final tk2 n = new tk2(kt8.class);
    public final Object m;

    public kt8(Object obj) {
        this.m = obj;
    }

    @Override // o.lt8
    public final void a(Runnable runnable, Executor executor) {
        if (executor == null) {
            yq4.l("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            n.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", to7.k("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.m;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.m.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.m;
    }
}
