package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class tk1 extends te2 {
    public static final tk1 p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public le1 f2118o;

    static {
        int i = ko7.c;
        int i2 = ko7.d;
        long j = ko7.e;
        String str = ko7.a;
        tk1 tk1Var = new tk1();
        tk1Var.f2118o = new le1(i, i2, j, str);
        p = tk1Var;
    }

    @Override // o.fe1
    public final void K0(de1 de1Var, Runnable runnable) {
        le1.q(this.f2118o, runnable, 6);
    }

    @Override // o.fe1
    public final void L0(de1 de1Var, Runnable runnable) {
        le1.q(this.f2118o, runnable, 2);
    }

    @Override // o.fe1
    public final fe1 N0(int i) {
        xs1.x(i);
        return i >= ko7.c ? this : super.N0(i);
    }

    @Override // o.te2
    public final Executor O0() {
        return this.f2118o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // o.fe1
    public final String toString() {
        return "Dispatchers.Default";
    }
}
