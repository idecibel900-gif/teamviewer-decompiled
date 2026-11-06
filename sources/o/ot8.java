package o;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class ot8 extends vs8 implements lt8 {
    public lt8 t;
    public ScheduledFuture u;

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof ms8) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((ms8) obj).b);
            throw cancellationException;
        }
        if (obj instanceof ps8) {
            throw new ExecutionException(((ps8) obj).a);
        }
        if (obj == vs8.p) {
            return null;
        }
        return obj;
    }

    public static boolean f(Object obj) {
        return !(obj instanceof ns8);
    }

    public static Object g(lt8 lt8Var) {
        Object obj;
        Throwable thC;
        if (lt8Var instanceof ot8) {
            Object ms8Var = ((ot8) lt8Var).m;
            if (ms8Var instanceof ms8) {
                ms8 ms8Var2 = (ms8) ms8Var;
                if (ms8Var2.a) {
                    Throwable th = ms8Var2.b;
                    ms8Var = th != null ? new ms8(th, false) : ms8.d;
                }
            }
            Objects.requireNonNull(ms8Var);
            return ms8Var;
        }
        if ((lt8Var instanceof vs8) && (thC = ((vs8) lt8Var).c()) != null) {
            return new ps8(thC);
        }
        boolean zIsCancelled = lt8Var.isCancelled();
        boolean z = true;
        if ((!vs8.r) && zIsCancelled) {
            ms8 ms8Var3 = ms8.d;
            Objects.requireNonNull(ms8Var3);
            return ms8Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = lt8Var.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new ps8(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new ps8(e);
            } catch (CancellationException e3) {
                return !zIsCancelled ? new ps8(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(lt8Var)), e3)) : new ms8(e3, false);
            } catch (ExecutionException e4) {
                return zIsCancelled ? new ms8(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(lt8Var)), e4), false) : new ps8(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (zIsCancelled) {
            return new ms8(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(lt8Var))), false);
        }
        return obj == null ? vs8.p : obj;
    }

    public static void i(ot8 ot8Var) {
        qs8 qs8Var = null;
        while (true) {
            ot8Var.getClass();
            for (us8 us8VarV = vs8.s.v(ot8Var); us8VarV != null; us8VarV = us8VarV.b) {
                Thread thread = us8VarV.a;
                if (thread != null) {
                    us8VarV.a = null;
                    LockSupport.unpark(thread);
                }
            }
            lt8 lt8Var = ot8Var.t;
            if ((ot8Var.m instanceof ms8) & (lt8Var != null)) {
                Object obj = ot8Var.m;
                lt8Var.cancel((obj instanceof ms8) && ((ms8) obj).a);
            }
            ScheduledFuture scheduledFuture = ot8Var.u;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ot8Var.t = null;
            ot8Var.u = null;
            qs8 qs8Var2 = qs8Var;
            qs8 qs8VarU = vs8.s.u(ot8Var);
            qs8 qs8Var3 = qs8Var2;
            while (qs8VarU != null) {
                qs8 qs8Var4 = qs8VarU.c;
                qs8VarU.c = qs8Var3;
                qs8Var3 = qs8VarU;
                qs8VarU = qs8Var4;
            }
            while (qs8Var3 != null) {
                Runnable runnable = qs8Var3.a;
                qs8 qs8Var5 = qs8Var3.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof ns8) {
                    ns8 ns8Var = (ns8) runnable;
                    ot8Var = ns8Var.m;
                    if (ot8Var.m != ns8Var) {
                        continue;
                    } else if (vs8.s.z(ot8Var, ns8Var, g(ns8Var.n))) {
                        qs8Var = qs8Var5;
                    }
                } else {
                    Executor executor = qs8Var3.b;
                    Objects.requireNonNull(executor);
                    j(runnable, executor);
                }
                qs8Var3 = qs8Var5;
            }
            return;
        }
    }

    public static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            vs8.q.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", to7.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // o.lt8
    public final void a(Runnable runnable, Executor executor) {
        qs8 qs8Var;
        qs8 qs8Var2 = qs8.d;
        if (executor == null) {
            yq4.l("Executor was null.");
            return;
        }
        if (!isDone() && (qs8Var = this.n) != qs8Var2) {
            qs8 qs8Var3 = new qs8(runnable, executor);
            do {
                qs8Var3.c = qs8Var;
                if (vs8.s.y(this, qs8Var, qs8Var3)) {
                    return;
                } else {
                    qs8Var = this.n;
                }
            } while (qs8Var != qs8Var2);
        }
        j(runnable, executor);
    }

    @Override // o.vs8
    public final Throwable c() {
        if (!(this instanceof ot8)) {
            return null;
        }
        Object obj = this.m;
        if (obj instanceof ps8) {
            return ((ps8) obj).a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ms8 ms8Var;
        Object obj = this.m;
        if (!(obj instanceof ns8) && !(obj == null)) {
            return false;
        }
        if (vs8.r) {
            ms8Var = new ms8(new CancellationException("Future.cancel() was called."), z);
        } else {
            ms8Var = z ? ms8.c : ms8.d;
            Objects.requireNonNull(ms8Var);
        }
        boolean z2 = false;
        while (true) {
            if (vs8.s.z(this, obj, ms8Var)) {
                i(this);
                if (obj instanceof ns8) {
                    lt8 lt8Var = ((ns8) obj).n;
                    if (lt8Var instanceof ot8) {
                        this = (ot8) lt8Var;
                        obj = this.m;
                        if ((obj == null) | (obj instanceof ns8)) {
                            z2 = true;
                        }
                    } else {
                        lt8Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.m;
            if (f(obj)) {
                return z2;
            }
        }
    }

    public final String e() {
        lt8 lt8Var = this.t;
        ScheduledFuture scheduledFuture = this.u;
        if (lt8Var == null) {
            return null;
        }
        String strG = fx3.g("inputFuture=[", lt8Var.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strG + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strG;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        us8 us8Var = us8.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.m;
        if ((obj != null) && f(obj)) {
            return d(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            us8 us8Var2 = this.f2342o;
            if (us8Var2 != us8Var) {
                us8 us8Var3 = new us8();
                while (true) {
                    o77 o77Var = vs8.s;
                    o77Var.w(us8Var3, us8Var2);
                    if (o77Var.A(this, us8Var2, us8Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(us8Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.m;
                            if ((obj2 != null) && f(obj2)) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(us8Var3);
                        break;
                    }
                    long j4 = j3;
                    us8Var2 = this.f2342o;
                    if (us8Var2 != us8Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.m;
            Objects.requireNonNull(obj3);
            return d(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.m;
            if ((obj4 != null) && f(obj4)) {
                return d(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == j2 || nanos2 > 1000;
            if (jConvert > j2) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = to7.j(nanos2, strConcat2, " nanoseconds ");
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(fx3.g(strConcat, " for ", string));
    }

    public final void h(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.m instanceof ms8;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.m;
        return (obj != null) & f(obj);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.m instanceof ms8) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.m;
            if (obj instanceof ns8) {
                sb.append(", setFuture=[");
                lt8 lt8Var = ((ns8) obj).n;
                try {
                    if (lt8Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(lt8Var);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = e();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                h(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        us8 us8Var = us8.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.m;
            if ((obj2 != null) & f(obj2)) {
                return d(obj2);
            }
            us8 us8Var2 = this.f2342o;
            if (us8Var2 != us8Var) {
                us8 us8Var3 = new us8();
                do {
                    o77 o77Var = vs8.s;
                    o77Var.w(us8Var3, us8Var2);
                    if (o77Var.A(this, us8Var2, us8Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.m;
                            } else {
                                b(us8Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & f(obj)));
                        return d(obj);
                    }
                    us8Var2 = this.f2342o;
                } while (us8Var2 != us8Var);
            }
            Object obj3 = this.m;
            Objects.requireNonNull(obj3);
            return d(obj3);
        }
        throw new InterruptedException();
    }
}
