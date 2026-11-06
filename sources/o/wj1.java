package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class wj1 extends ge2 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final wj1 w;
    public static final long x;

    static {
        Long l;
        wj1 wj1Var = new wj1();
        w = wj1Var;
        wj1Var.Q0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        x = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // o.ge2
    public final void T0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.T0(runnable);
    }

    @Override // o.ge2
    public final Thread W0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "o.wj1");
                _thread = thread;
                thread.setContextClassLoader(w.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // o.nm1
    public final t22 Y(long j, Runnable runnable, de1 de1Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return r45.m;
        }
        long jNanoTime = System.nanoTime();
        de2 de2Var = new de2(runnable, j2 + jNanoTime);
        Z0(jNanoTime, de2Var);
        return de2Var;
    }

    @Override // o.ge2
    public final void Y0(long j, ee2 ee2Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void a1() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = defpackage.a.a;
            unsafe.putObjectVolatile(this, ge2.u, (Object) null);
            unsafe.putObjectVolatile(this, ge2.s, (Object) null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        du7.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    a1();
                    if (X0()) {
                        return;
                    }
                    W0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jR0 = R0();
                    if (jR0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = x + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            a1();
                            if (X0()) {
                                return;
                            }
                            W0();
                            return;
                        }
                        if (jR0 > j2) {
                            jR0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jR0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            a1();
                            if (X0()) {
                                return;
                            }
                            W0();
                            return;
                        }
                        LockSupport.parkNanos(this, jR0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            a1();
            if (!X0()) {
                W0();
            }
            throw th;
        }
    }

    @Override // o.ge2, o.be2
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // o.fe1
    public final String toString() {
        return "DefaultExecutor";
    }
}
