package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class je1 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(je1.class, "workerCtl$volatile");
    public static final /* synthetic */ long v = defpackage.a.a.objectFieldOffset(je1.class.getDeclaredField("workerCtl$volatile"));
    private volatile int indexInArray;
    public final um8 m;
    public final k76 n;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ke1 f1155o;
    public long p;
    public long q;
    public int r;
    public boolean s;
    public final /* synthetic */ le1 t;
    private volatile /* synthetic */ int workerCtl$volatile;

    public je1(le1 le1Var, int i) {
        this.t = le1Var;
        setDaemon(true);
        setContextClassLoader(le1.class.getClassLoader());
        this.m = new um8();
        this.n = new k76();
        this.f1155o = ke1.p;
        this.nextParkedWorker = le1.w;
        int iNanoTime = (int) System.nanoTime();
        this.r = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final zn7 a(boolean z) {
        zn7 zn7VarE;
        zn7 zn7VarE2;
        long j;
        Unsafe unsafe;
        ke1 ke1Var = this.f1155o;
        le1 le1Var = this.t;
        zn7 zn7Var = null;
        um8 um8Var = this.m;
        ke1 ke1Var2 = ke1.m;
        if (ke1Var != ke1Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = le1.u;
            do {
                j = atomicLongFieldUpdater.get(le1Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    um8Var.getClass();
                    long j2 = um8.f;
                    loop1: while (true) {
                        Unsafe unsafe2 = defpackage.a.a;
                        zn7 zn7Var2 = (zn7) unsafe2.getObjectVolatile(um8Var, j2);
                        if (zn7Var2 == null || !zn7Var2.n) {
                            int intVolatile = unsafe2.getIntVolatile(um8Var, um8.e);
                            int intVolatile2 = unsafe2.getIntVolatile(um8Var, um8.g);
                            while (intVolatile != intVolatile2 && defpackage.a.a.getIntVolatile(um8Var, um8.d) != 0) {
                                intVolatile2--;
                                zn7 zn7VarD = um8Var.d(intVolatile2, true);
                                if (zn7VarD != null) {
                                    zn7Var = zn7VarD;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            unsafe = defpackage.a.a;
                            if (unsafe.compareAndSwapObject(um8Var, um8.f, zn7Var2, (Object) null)) {
                                zn7Var = zn7Var2;
                                break loop1;
                            }
                        } while (unsafe.getObjectVolatile(um8Var, j2) == zn7Var2);
                    }
                    if (zn7Var != null) {
                        return zn7Var;
                    }
                    zn7 zn7Var3 = (zn7) le1Var.r.d();
                    return zn7Var3 == null ? i(1) : zn7Var3;
                }
            } while (!le1.u.compareAndSet(le1Var, j, j - 4398046511104L));
            this.f1155o = ke1Var2;
        }
        if (z) {
            boolean z2 = d(le1Var.m * 2) == 0;
            if (z2 && (zn7VarE2 = e()) != null) {
                return zn7VarE2;
            }
            um8Var.getClass();
            zn7 zn7VarC = (zn7) defpackage.a.a.getAndSetObject(um8Var, um8.f, (Object) null);
            if (zn7VarC == null) {
                zn7VarC = um8Var.c();
            }
            if (zn7VarC != null) {
                return zn7VarC;
            }
            if (!z2 && (zn7VarE = e()) != null) {
                return zn7VarE;
            }
        } else {
            zn7 zn7VarE3 = e();
            if (zn7VarE3 != null) {
                return zn7VarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.r;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.r = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final zn7 e() {
        int iD = d(2);
        le1 le1Var = this.t;
        hz2 hz2Var = le1Var.r;
        hz2 hz2Var2 = le1Var.q;
        if (iD == 0) {
            zn7 zn7Var = (zn7) hz2Var2.d();
            return zn7Var != null ? zn7Var : (zn7) hz2Var.d();
        }
        zn7 zn7Var2 = (zn7) hz2Var.d();
        return zn7Var2 != null ? zn7Var2 : (zn7) hz2Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.t.p);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(ke1 ke1Var) {
        ke1 ke1Var2 = this.f1155o;
        boolean z = ke1Var2 == ke1.m;
        if (z) {
            le1.u.addAndGet(this.t, 4398046511104L);
        }
        if (ke1Var2 != ke1Var) {
            this.f1155o = ke1Var;
        }
        return z;
    }

    public final zn7 i(int i) {
        int i2;
        long j;
        zn7 zn7VarC;
        long j2;
        long j3;
        Unsafe unsafe;
        AtomicLongFieldUpdater atomicLongFieldUpdater = le1.u;
        le1 le1Var = this.t;
        int i3 = (int) (atomicLongFieldUpdater.get(le1Var) & 2097151);
        zn7 zn7Var = null;
        if (i3 < 2) {
            return null;
        }
        int iD = d(i3);
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        while (i4 < i3) {
            iD++;
            if (iD > i3) {
                iD = 1;
            }
            je1 je1Var = (je1) le1Var.s.b(iD);
            if (je1Var == null || je1Var == this) {
                i2 = i3;
            } else {
                um8 um8Var = je1Var.m;
                um8Var.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    Unsafe unsafe2 = defpackage.a.a;
                    j = 0;
                    int intVolatile = unsafe2.getIntVolatile(um8Var, um8.e);
                    int intVolatile2 = unsafe2.getIntVolatile(um8Var, um8.g);
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i2 = i3;
                                if (defpackage.a.a.getIntVolatile(um8Var, um8.d) == 0) {
                                }
                            } else {
                                i2 = i3;
                            }
                            int i5 = intVolatile + 1;
                            zn7 zn7VarD = um8Var.d(intVolatile, z);
                            if (zn7VarD != null) {
                                zn7VarC = zn7VarD;
                                break;
                            }
                            intVolatile = i5;
                            i3 = i2;
                        } else {
                            i2 = i3;
                        }
                        zn7VarC = zn7Var;
                        break;
                    }
                } else {
                    zn7VarC = um8Var.c();
                    i2 = i3;
                    j = 0;
                }
                k76 k76Var = this.n;
                if (zn7VarC == null) {
                    j2 = -1;
                    long j4 = um8.f;
                    while (true) {
                        zn7 zn7Var2 = (zn7) defpackage.a.a.getObjectVolatile(um8Var, j4);
                        if (zn7Var2 != null) {
                            if (((zn7Var2.n ? 1 : 2) & i) != 0) {
                                ko7.f.getClass();
                                um8 um8Var2 = um8Var;
                                long jNanoTime = System.nanoTime() - zn7Var2.m;
                                long j5 = ko7.b;
                                if (jNanoTime < j5) {
                                    j3 = j5 - jNanoTime;
                                    break;
                                }
                                do {
                                    unsafe = defpackage.a.a;
                                    if (unsafe.compareAndSwapObject(um8Var2, um8.f, zn7Var2, (Object) null)) {
                                        k76Var.m = zn7Var2;
                                        j3 = -1;
                                        break;
                                    }
                                } while (unsafe.getObjectVolatile(um8Var2, j4) == zn7Var2);
                                um8Var = um8Var2;
                            }
                        }
                        j3 = -2;
                        break;
                    }
                } else {
                    k76Var.m = zn7VarC;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    zn7 zn7Var3 = (zn7) k76Var.m;
                    k76Var.m = null;
                    return zn7Var3;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i4++;
            i3 = i2;
            zn7Var = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.q = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (le1.v.get(this.t) != 1) {
                    ke1 ke1Var = this.f1155o;
                    ke1 ke1Var2 = ke1.q;
                    if (ke1Var == ke1Var2) {
                        break loop0;
                    }
                    zn7 zn7VarA = a(this.s);
                    if (zn7VarA != null) {
                        this.q = 0L;
                        le1 le1Var = this.t;
                        this.p = 0L;
                        if (this.f1155o == ke1.f1253o) {
                            this.f1155o = ke1.n;
                        }
                        if (!zn7VarA.n) {
                            try {
                                zn7VarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(ke1.n) && !le1Var.F() && !le1Var.z(le1.u.get(le1Var))) {
                            le1Var.F();
                        }
                        try {
                            zn7VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        le1.u.addAndGet(le1Var, -2097152L);
                        if (this.f1155o == ke1Var2) {
                            break;
                        }
                        this.f1155o = ke1.p;
                        break;
                    }
                    this.s = false;
                    if (this.q == 0) {
                        Object obj = this.nextParkedWorker;
                        hr2 hr2Var = le1.w;
                        if (obj != hr2Var) {
                            int i = -1;
                            defpackage.a.a.putIntVolatile(this, v, -1);
                            while (this.nextParkedWorker != le1.w) {
                                Unsafe unsafe = defpackage.a.a;
                                long j = v;
                                if (unsafe.getIntVolatile(this, j) != i) {
                                    break;
                                }
                                le1 le1Var2 = this.t;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = le1.v;
                                if (atomicIntegerFieldUpdater.get(le1Var2) == 1) {
                                    break;
                                }
                                ke1 ke1Var3 = this.f1155o;
                                ke1 ke1Var4 = ke1.q;
                                if (ke1Var3 == ke1Var4) {
                                    break;
                                }
                                h(ke1.f1253o);
                                Thread.interrupted();
                                if (this.p == 0) {
                                    this.p = System.nanoTime() + this.t.f1354o;
                                }
                                LockSupport.parkNanos(this.t.f1354o);
                                if (System.nanoTime() - this.p >= 0) {
                                    this.p = 0L;
                                    le1 le1Var3 = this.t;
                                    synchronized (le1Var3.s) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater.get(le1Var3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = le1.u;
                                                if (((int) (atomicLongFieldUpdater.get(le1Var3) & 2097151)) > le1Var3.m && unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                    int i2 = this.indexInArray;
                                                    f(0);
                                                    le1Var3.u(this, i2, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(le1Var3) & 2097151);
                                                    if (andDecrement != i2) {
                                                        Object objB = le1Var3.s.b(andDecrement);
                                                        objB.getClass();
                                                        je1 je1Var = (je1) objB;
                                                        le1Var3.s.c(i2, je1Var);
                                                        je1Var.f(i2);
                                                        le1Var3.u(je1Var, andDecrement, i2);
                                                    }
                                                    le1Var3.s.c(andDecrement, null);
                                                    this.f1155o = ke1Var4;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                i = -1;
                            }
                        } else {
                            le1 le1Var4 = this.t;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = le1.t;
                            if (this.nextParkedWorker == hr2Var) {
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(le1Var4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = le1Var4.s.b((int) (j2 & 2097151));
                                    le1 le1Var5 = le1Var4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (atomicLongFieldUpdater3.compareAndSet(le1Var5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i3))) {
                                        break;
                                    }
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    le1Var4 = le1Var5;
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(ke1.f1253o);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.q);
                            this.q = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(ke1.q);
    }
}
