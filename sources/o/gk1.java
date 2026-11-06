package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class gk1 extends te2 implements Executor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final gk1 f901o = new gk1();
    public static final fe1 p;

    static {
        o88 o88Var = o88.f1641o;
        int i = yh7.a;
        if (64 >= i) {
            i = 64;
        }
        p = o88Var.N0(n67.t(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // o.fe1
    public final void K0(de1 de1Var, Runnable runnable) {
        p.K0(de1Var, runnable);
    }

    @Override // o.fe1
    public final void L0(de1 de1Var, Runnable runnable) {
        p.L0(de1Var, runnable);
    }

    @Override // o.fe1
    public final fe1 N0(int i) {
        return o88.f1641o.N0(i);
    }

    @Override // o.te2
    public final Executor O0() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        K0(ba2.m, runnable);
    }

    @Override // o.fe1
    public final String toString() {
        return "Dispatchers.IO";
    }
}
