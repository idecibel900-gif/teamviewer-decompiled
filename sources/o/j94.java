package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class j94 extends fe1 implements nm1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(j94.class, "runningWorkers$volatile");
    public static final /* synthetic */ long u = defpackage.a.a.objectFieldOffset(j94.class.getDeclaredField("runningWorkers$volatile"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nm1 f1142o;
    public final fe1 p;
    public final int q;
    public final ae4 r;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final Object s;

    /* JADX WARN: Multi-variable type inference failed */
    public j94(fe1 fe1Var, int i) {
        nm1 nm1Var = fe1Var instanceof nm1 ? (nm1) fe1Var : null;
        this.f1142o = nm1Var == null ? xj1.a : nm1Var;
        this.p = fe1Var;
        this.q = i;
        this.r = new ae4();
        this.s = new Object();
    }

    @Override // o.nm1
    public final void J(long j, gl0 gl0Var) {
        this.f1142o.J(j, gl0Var);
    }

    @Override // o.fe1
    public final void K0(de1 de1Var, Runnable runnable) {
        Runnable runnableO0;
        this.r.a(runnable);
        if (defpackage.a.a.getIntVolatile(this, u) >= this.q || !P0() || (runnableO0 = O0()) == null) {
            return;
        }
        try {
            ga0.u(this.p, this, new it8((byte) 14, this, runnableO0, false));
        } catch (Throwable th) {
            t.decrementAndGet(this);
            throw th;
        }
    }

    @Override // o.fe1
    public final void L0(de1 de1Var, Runnable runnable) {
        Runnable runnableO0;
        this.r.a(runnable);
        if (defpackage.a.a.getIntVolatile(this, u) >= this.q || !P0() || (runnableO0 = O0()) == null) {
            return;
        }
        try {
            this.p.L0(this, new it8((byte) 14, this, runnableO0, false));
        } catch (Throwable th) {
            t.decrementAndGet(this);
            throw th;
        }
    }

    @Override // o.fe1
    public final fe1 N0(int i) {
        xs1.x(i);
        return i >= this.q ? this : super.N0(i);
    }

    public final Runnable O0() {
        while (true) {
            Runnable runnable = (Runnable) this.r.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.s) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.r.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean P0() {
        synchronized (this.s) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
            if (defpackage.a.a.getIntVolatile(this, u) >= this.q) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // o.nm1
    public final t22 Y(long j, Runnable runnable, de1 de1Var) {
        return this.f1142o.Y(j, runnable, de1Var);
    }

    @Override // o.fe1
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.p);
        sb.append(".limitedParallelism(");
        return e41.j(sb, this.q, ')');
    }
}
