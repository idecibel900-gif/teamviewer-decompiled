package o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class le1 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater t = AtomicLongFieldUpdater.newUpdater(le1.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater u = AtomicLongFieldUpdater.newUpdater(le1.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(le1.class, "_isTerminated$volatile");
    public static final hr2 w = new hr2("NOT_IN_STACK", 14);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f1354o;
    public final String p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final hz2 q;
    public final hz2 r;
    public final mb6 s;

    public le1(int i, int i2, long j, String str) {
        this.m = i;
        this.n = i2;
        this.f1354o = j;
        this.p = str;
        if (i < 1) {
            gk0.h(fx3.f(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            gk0.h(ua5.l("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            gk0.h(fx3.f(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            gk0.h(to7.j(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.q = new hz2();
        this.r = new hz2();
        this.s = new mb6((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void q(le1 le1Var, Runnable runnable, int i) {
        le1Var.j(runnable, false, (i & 4) == 0);
    }

    public final boolean F() {
        le1 le1Var;
        hr2 hr2Var;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = t;
            long j = atomicLongFieldUpdater.get(this);
            je1 je1Var = (je1) this.s.b((int) (2097151 & j));
            if (je1Var == null) {
                je1Var = null;
                le1Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = je1Var.c();
                while (true) {
                    hr2Var = w;
                    if (objC == hr2Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    je1 je1Var2 = (je1) objC;
                    iB = je1Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = je1Var2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (iB >= 0) {
                    le1 le1Var2 = this;
                    boolean zCompareAndSet = atomicLongFieldUpdater.compareAndSet(le1Var2, j, j2 | ((long) iB));
                    le1Var = le1Var2;
                    if (zCompareAndSet) {
                        je1Var.g(hr2Var);
                    }
                    this = le1Var;
                } else {
                    continue;
                }
            }
            if (je1Var == null) {
                return false;
            }
            if (je1.u.compareAndSet(je1Var, -1, 0)) {
                LockSupport.unpark(je1Var);
                return true;
            }
            this = le1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        zn7 zn7VarA;
        if (v.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            je1 je1Var = threadCurrentThread instanceof je1 ? (je1) threadCurrentThread : null;
            if (je1Var == null || je1Var.t != this) {
                je1Var = null;
            }
            synchronized (this.s) {
                i = (int) (u.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.s.b(i2);
                    objB.getClass();
                    je1 je1Var2 = (je1) objB;
                    if (je1Var2 != je1Var) {
                        while (je1Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(je1Var2);
                            je1Var2.join(10000L);
                        }
                        um8 um8Var = je1Var2.m;
                        hz2 hz2Var = this.r;
                        um8Var.getClass();
                        zn7 zn7Var = (zn7) defpackage.a.a.getAndSetObject(um8Var, um8.f, (Object) null);
                        if (zn7Var != null) {
                            hz2Var.a(zn7Var);
                        }
                        while (true) {
                            zn7 zn7VarC = um8Var.c();
                            if (zn7VarC == null) {
                                break;
                            } else {
                                hz2Var.a(zn7VarC);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.r.b();
            this.q.b();
            while (true) {
                if (je1Var != null) {
                    zn7VarA = je1Var.a(true);
                    if (zn7VarA == null) {
                        zn7VarA = (zn7) this.q.d();
                        if (zn7VarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    zn7VarA = (zn7) this.q.d();
                    if (zn7VarA == null && (zn7VarA = (zn7) this.r.d()) == null) {
                        break;
                    }
                }
                try {
                    zn7VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (je1Var != null) {
                je1Var.h(ke1.q);
            }
            t.set(this, 0L);
            u.set(this, 0L);
        }
    }

    public final int e() {
        synchronized (this.s) {
            try {
                if (v.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = u;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.m) {
                    return 0;
                }
                if (i >= this.n) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.s.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                je1 je1Var = new je1(this, i3);
                this.s.c(i3, je1Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                je1Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        q(this, runnable, 6);
    }

    public final void j(Runnable runnable, boolean z, boolean z2) {
        zn7 fo7Var;
        ke1 ke1Var;
        ko7.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof zn7) {
            fo7Var = (zn7) runnable;
            fo7Var.m = jNanoTime;
            fo7Var.n = z;
        } else {
            fo7Var = new fo7(runnable, jNanoTime, z);
        }
        boolean z3 = fo7Var.n;
        AtomicLongFieldUpdater atomicLongFieldUpdater = u;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        je1 je1Var = threadCurrentThread instanceof je1 ? (je1) threadCurrentThread : null;
        if (je1Var == null || je1Var.t != this) {
            je1Var = null;
        }
        if (je1Var != null && (ke1Var = je1Var.f1155o) != ke1.q && (fo7Var.n || ke1Var != ke1.n)) {
            je1Var.s = true;
            um8 um8Var = je1Var.m;
            if (z2) {
                fo7Var = um8Var.a(fo7Var);
            } else {
                um8Var.getClass();
                zn7 zn7Var = (zn7) defpackage.a.a.getAndSetObject(um8Var, um8.f, fo7Var);
                fo7Var = zn7Var == null ? null : um8Var.a(zn7Var);
            }
        }
        if (fo7Var != null) {
            if (!(fo7Var.n ? this.r.a(fo7Var) : this.q.a(fo7Var))) {
                throw new RejectedExecutionException(e41.l(new StringBuilder(), this.p, " was terminated"));
            }
        }
        if (z3) {
            if (F() || z(jAddAndGet)) {
                return;
            }
            F();
            return;
        }
        if (F() || z(atomicLongFieldUpdater.get(this))) {
            return;
        }
        F();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        mb6 mb6Var = this.s;
        int iA = mb6Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            je1 je1Var = (je1) mb6Var.b(i6);
            if (je1Var != null) {
                um8 um8Var = je1Var.m;
                um8Var.getClass();
                Object objectVolatile = defpackage.a.a.getObjectVolatile(um8Var, um8.f);
                int iB = um8Var.b();
                if (objectVolatile != null) {
                    iB++;
                }
                int iOrdinal = je1Var.f1155o.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iB > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        gk0.s();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = u.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.p);
        sb4.append('@');
        sb4.append(di1.r(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.m;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.n);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.q.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.r.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final void u(je1 je1Var, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = t;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = je1Var.c();
                    while (true) {
                        if (objC == w) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        je1 je1Var2 = (je1) objC;
                        int iB = je1Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = je1Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | ((long) i3);
                le1 le1Var = this;
                if (atomicLongFieldUpdater.compareAndSet(le1Var, j, j3)) {
                    return;
                } else {
                    this = le1Var;
                }
            }
        }
    }

    public final boolean z(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.m;
        if (i < i2) {
            int iE = e();
            if (iE == 1 && i2 > 1) {
                e();
            }
            if (iE > 0) {
                return true;
            }
        }
        return false;
    }
}
