package o;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ue2 extends te2 implements nm1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Executor f2204o;

    public ue2(Executor executor) {
        Method method;
        this.f2204o = executor;
        Method method2 = k11.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = k11.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // o.nm1
    public final void J(long j, gl0 gl0Var) {
        Executor executor = this.f2204o;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            it8 it8Var = new it8(this, gl0Var, (byte) 17);
            de1 de1Var = gl0Var.q;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(it8Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ds1.A(de1Var, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            gl0Var.w(new al0(scheduledFutureSchedule, (byte) 0));
        } else {
            wj1.w.J(j, gl0Var);
        }
    }

    @Override // o.fe1
    public final void K0(de1 de1Var, Runnable runnable) {
        try {
            this.f2204o.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            ds1.A(de1Var, cancellationException);
            tk1 tk1Var = g22.a;
            gk1.f901o.K0(de1Var, runnable);
        }
    }

    @Override // o.te2
    public final Executor O0() {
        return this.f2204o;
    }

    @Override // o.nm1
    public final t22 Y(long j, Runnable runnable, de1 de1Var) {
        Executor executor = this.f2204o;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ds1.A(de1Var, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new s22(scheduledFutureSchedule) : wj1.w.Y(j, runnable, de1Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f2204o;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ue2) && ((ue2) obj).f2204o == this.f2204o;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2204o);
    }

    @Override // o.fe1
    public final String toString() {
        return this.f2204o.toString();
    }
}
