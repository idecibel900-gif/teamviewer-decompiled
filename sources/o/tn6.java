package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tn6 extends l11 implements z45 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(tn6.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long r = defpackage.a.a.objectFieldOffset(tn6.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long p;

    public tn6(long j, tn6 tn6Var, int i) {
        super(tn6Var);
        this.p = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // o.l11
    public final boolean d() {
        return defpackage.a.a.getIntVolatile(this, r) == g() && c() != null;
    }

    public final boolean f() {
        return q.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, de1 de1Var);

    public final void i() {
        if (q.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = r;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            tn6 tn6Var = this;
            if (unsafe.compareAndSwapInt(tn6Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = tn6Var;
        }
    }
}
