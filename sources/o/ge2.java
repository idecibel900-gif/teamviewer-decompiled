package o;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ge2 extends be2 implements nm1 {
    public static final /* synthetic */ long s;
    public static final /* synthetic */ long t;
    public static final /* synthetic */ long u;
    public static final /* synthetic */ int v = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = defpackage.a.a;
        u = unsafe.objectFieldOffset(ge2.class.getDeclaredField("_queue$volatile"));
        s = unsafe.objectFieldOffset(ge2.class.getDeclaredField("_delayed$volatile"));
        t = unsafe.objectFieldOffset(ge2.class.getDeclaredField("_isCompleted$volatile"));
    }

    @Override // o.nm1
    public final void J(long j, gl0 gl0Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            ce2 ce2Var = new ce2(this, j2 + jNanoTime, gl0Var);
            Z0(jNanoTime, ce2Var);
            gl0Var.w(new al0(ce2Var, (byte) 2));
        }
    }

    @Override // o.fe1
    public final void K0(de1 de1Var, Runnable runnable) {
        T0(runnable);
    }

    @Override // o.be2
    public final long R0() {
        Unsafe unsafe;
        ge2 ge2Var;
        Unsafe unsafe2;
        Runnable runnable;
        ee2 ee2Var;
        hr2 hr2Var = vn4.v;
        long j = u;
        if (!S0()) {
            U0();
            loop0: while (true) {
                unsafe = defpackage.a.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    ge2Var = this;
                } else if (objectVolatile instanceof ce4) {
                    ce4 ce4Var = (ce4) objectVolatile;
                    Object objD = ce4Var.d();
                    if (objD != ce4.e) {
                        Runnable runnable2 = (Runnable) objD;
                        ge2Var = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    ce4 ce4VarC = ce4Var.c();
                    while (true) {
                        Unsafe unsafe3 = defpackage.a.a;
                        ge2Var = this;
                        if (unsafe3.compareAndSwapObject(ge2Var, u, objectVolatile, ce4VarC) || unsafe3.getObjectVolatile(ge2Var, j) != objectVolatile) {
                            break;
                        }
                        this = ge2Var;
                    }
                    this = ge2Var;
                } else {
                    ge2Var = this;
                    if (objectVolatile != hr2Var) {
                        do {
                            unsafe2 = defpackage.a.a;
                            if (unsafe2.compareAndSwapObject(ge2Var, u, objectVolatile, (Object) null)) {
                                runnable = (Runnable) objectVolatile;
                                unsafe = unsafe2;
                                break loop0;
                            }
                        } while (unsafe2.getObjectVolatile(ge2Var, j) == objectVolatile);
                        this = ge2Var;
                    }
                }
                unsafe2 = unsafe;
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            kw kwVar = ge2Var.q;
            if (((kwVar == null || kwVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(ge2Var, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof ce4) {
                        long longVolatile = unsafe2.getLongVolatile((ce4) objectVolatile2, ce4.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == hr2Var) {
                        return Long.MAX_VALUE;
                    }
                }
                fe2 fe2Var = (fe2) unsafe.getObjectVolatile(ge2Var, s);
                if (fe2Var != null) {
                    synchronized (fe2Var) {
                        ee2[] ee2VarArr = fe2Var.a;
                        ee2Var = ee2VarArr != null ? ee2VarArr[0] : null;
                    }
                    if (ee2Var != null) {
                        long jNanoTime = ee2Var.m - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void T0(Runnable runnable) {
        U0();
        if (!V0(runnable)) {
            wj1.w.T0(runnable);
            return;
        }
        Thread threadW0 = W0();
        if (Thread.currentThread() != threadW0) {
            LockSupport.unpark(threadW0);
        }
    }

    public final void U0() {
        ee2 ee2VarC;
        fe2 fe2Var = (fe2) defpackage.a.a.getObjectVolatile(this, s);
        if (fe2Var == null || fe2Var.b() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (fe2Var) {
                try {
                    ee2[] ee2VarArr = fe2Var.a;
                    ee2VarC = null;
                    ee2 ee2Var = ee2VarArr != null ? ee2VarArr[0] : null;
                    if (ee2Var != null) {
                        if (jNanoTime - ee2Var.m >= 0 ? V0(ee2Var) : false) {
                            ee2VarC = fe2Var.c(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (ee2VarC != null);
    }

    public final boolean V0(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            Unsafe unsafe4 = defpackage.a.a;
            long j = u;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (unsafe4.getIntVolatile(this, t) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = defpackage.a.a;
                    if (unsafe.compareAndSwapObject(this, u, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof ce4) {
                ce4 ce4Var = (ce4) objectVolatile;
                int iA = ce4Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    ce4 ce4VarC = ce4Var.c();
                    do {
                        unsafe2 = defpackage.a.a;
                        if (unsafe2.compareAndSwapObject(this, u, objectVolatile, ce4VarC)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == vn4.v) {
                    return false;
                }
                ce4 ce4Var2 = new ce4(8, true);
                ce4Var2.a((Runnable) objectVolatile);
                ce4Var2.a(runnable);
                do {
                    unsafe3 = defpackage.a.a;
                    if (unsafe3.compareAndSwapObject(this, u, objectVolatile, ce4Var2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public abstract Thread W0();

    public final boolean X0() {
        kw kwVar = this.q;
        if (kwVar != null ? kwVar.isEmpty() : true) {
            Unsafe unsafe = defpackage.a.a;
            fe2 fe2Var = (fe2) unsafe.getObjectVolatile(this, s);
            if (fe2Var != null && fe2Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, u);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ce4) {
                    long longVolatile = unsafe.getLongVolatile((ce4) objectVolatile, ce4.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == vn4.v) {
                }
            }
            return true;
        }
        return false;
    }

    public void Y0(long j, ee2 ee2Var) {
        wj1.w.Z0(j, ee2Var);
    }

    public final void Z0(long j, ee2 ee2Var) {
        ge2 ge2Var;
        int iC;
        Unsafe unsafe;
        Thread threadW0;
        long j2 = s;
        Unsafe unsafe2 = defpackage.a.a;
        if (unsafe2.getIntVolatile(this, t) == 1) {
            ge2Var = this;
            iC = 1;
        } else {
            fe2 fe2Var = (fe2) unsafe2.getObjectVolatile(this, j2);
            if (fe2Var == null) {
                fe2 fe2Var2 = new fe2();
                fe2Var2.c = j;
                while (true) {
                    unsafe = defpackage.a.a;
                    ge2Var = this;
                    if (unsafe.compareAndSwapObject(ge2Var, s, (Object) null, fe2Var2) || unsafe.getObjectVolatile(ge2Var, j2) != null) {
                        break;
                    } else {
                        this = ge2Var;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(ge2Var, j2);
                objectVolatile.getClass();
                fe2Var = (fe2) objectVolatile;
                unsafe2 = unsafe;
            } else {
                ge2Var = this;
            }
            iC = ee2Var.c(j, fe2Var, ge2Var);
        }
        if (iC != 0) {
            if (iC == 1) {
                ge2Var.Y0(j, ee2Var);
                return;
            } else {
                if (iC == 2) {
                    return;
                }
                hk0.l("unexpected result");
                return;
            }
        }
        fe2 fe2Var3 = (fe2) unsafe2.getObjectVolatile(ge2Var, j2);
        ee2 ee2Var2 = null;
        if (fe2Var3 != null) {
            synchronized (fe2Var3) {
                ee2[] ee2VarArr = fe2Var3.a;
                ee2Var2 = ee2VarArr != null ? ee2VarArr[0] : null;
            }
        }
        if (ee2Var2 != ee2Var || Thread.currentThread() == (threadW0 = ge2Var.W0())) {
            return;
        }
        LockSupport.unpark(threadW0);
    }

    @Override // o.be2
    public void shutdown() {
        hr2 hr2Var;
        Unsafe unsafe;
        ee2 ee2VarC;
        du7.a.set(null);
        defpackage.a.a.putIntVolatile(this, t, 1);
        hr2 hr2Var2 = vn4.v;
        long j = u;
        loop0: while (true) {
            Object objectVolatile = defpackage.a.a.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = defpackage.a.a;
                    hr2Var = hr2Var2;
                    if (unsafe2.compareAndSwapObject(this, u, (Object) null, hr2Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        hr2Var2 = hr2Var;
                    }
                }
                hr2Var2 = hr2Var;
            } else {
                hr2Var = hr2Var2;
                if (objectVolatile instanceof ce4) {
                    ((ce4) objectVolatile).b();
                    break;
                }
                if (objectVolatile == hr2Var) {
                    break;
                }
                ce4 ce4Var = new ce4(8, true);
                ce4Var.a((Runnable) objectVolatile);
                do {
                    unsafe = defpackage.a.a;
                    if (unsafe.compareAndSwapObject(this, u, objectVolatile, ce4Var)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                hr2Var2 = hr2Var;
            }
        }
        while (R0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            fe2 fe2Var = (fe2) defpackage.a.a.getObjectVolatile(this, s);
            if (fe2Var == null) {
                return;
            }
            synchronized (fe2Var) {
                ee2VarC = fe2Var.b() > 0 ? fe2Var.c(0) : null;
            }
            if (ee2VarC == null) {
                return;
            } else {
                Y0(jNanoTime, ee2VarC);
            }
        }
    }
}
