package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class um8 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = defpackage.a.a;
        f = unsafe.objectFieldOffset(um8.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(um8.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(um8.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(um8.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(um8.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(um8.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final zn7 a(zn7 zn7Var) {
        if (b() == 127) {
            return zn7Var;
        }
        if (zn7Var.n) {
            c.incrementAndGet(this);
        }
        int intVolatile = defpackage.a.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, zn7Var);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return defpackage.a.a.getIntVolatile(this, g) - defpackage.a.a.getIntVolatile(this, e);
    }

    public final zn7 c() {
        zn7 zn7Var;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            um8 um8Var = this;
            if (unsafe.compareAndSwapInt(um8Var, j, intVolatile, intVolatile + 1) && (zn7Var = (zn7) um8Var.a.getAndSet(i, null)) != null) {
                if (zn7Var.n) {
                    c.decrementAndGet(um8Var);
                }
                return zn7Var;
            }
            this = um8Var;
        }
    }

    public final zn7 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        zn7 zn7Var = (zn7) atomicReferenceArray.get(i2);
        if (zn7Var != null && zn7Var.n == z) {
            while (!atomicReferenceArray.compareAndSet(i2, zn7Var, null)) {
                if (atomicReferenceArray.get(i2) != zn7Var) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return zn7Var;
        }
        return null;
    }
}
