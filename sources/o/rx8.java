package o;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class rx8 implements lt8 {
    public static final boolean p = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger q = Logger.getLogger(rx8.class.getName());
    public static final l47 r;
    public static final Object s;
    public volatile Object m;
    public volatile av8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile kx8 f1963o;

    static {
        l47 cx8Var;
        try {
            cx8Var = new zv8(AtomicReferenceFieldUpdater.newUpdater(kx8.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(kx8.class, kx8.class, "b"), AtomicReferenceFieldUpdater.newUpdater(rx8.class, kx8.class, "o"), AtomicReferenceFieldUpdater.newUpdater(rx8.class, av8.class, "n"), AtomicReferenceFieldUpdater.newUpdater(rx8.class, Object.class, "m"));
            th = null;
        } catch (Throwable th) {
            th = th;
            cx8Var = new cx8();
        }
        Throwable th2 = th;
        r = cx8Var;
        if (th2 != null) {
            q.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        s = new Object();
    }

    public static void c(rx8 rx8Var) {
        kx8 kx8Var;
        l47 l47Var;
        av8 av8Var;
        av8 av8Var2;
        av8 av8Var3;
        do {
            kx8Var = rx8Var.f1963o;
            l47Var = r;
        } while (!l47Var.y(rx8Var, kx8Var, kx8.c));
        while (true) {
            av8Var = null;
            if (kx8Var == null) {
                break;
            }
            Thread thread = kx8Var.a;
            if (thread != null) {
                kx8Var.a = null;
                LockSupport.unpark(thread);
            }
            kx8Var = kx8Var.b;
        }
        do {
            av8Var2 = rx8Var.n;
        } while (!l47Var.w(rx8Var, av8Var2, av8.d));
        while (true) {
            av8Var3 = av8Var;
            av8Var = av8Var2;
            if (av8Var == null) {
                break;
            }
            av8Var2 = av8Var.c;
            av8Var.c = av8Var3;
        }
        while (av8Var3 != null) {
            Runnable runnable = av8Var3.a;
            av8 av8Var4 = av8Var3.c;
            e(runnable, av8Var3.b);
            av8Var3 = av8Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            q.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", to7.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public static final Object g(Object obj) throws ExecutionException {
        if (obj instanceof rt8) {
            Throwable th = ((rt8) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof qu8) {
            throw new ExecutionException(((qu8) obj).a);
        }
        if (obj == s) {
            return null;
        }
        return obj;
    }

    @Override // o.lt8
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        av8 av8Var = this.n;
        av8 av8Var2 = av8.d;
        if (av8Var != av8Var2) {
            av8 av8Var3 = new av8(runnable, executor);
            do {
                av8Var3.c = av8Var;
                if (r.w(this, av8Var, av8Var3)) {
                    return;
                } else {
                    av8Var = this.n;
                }
            } while (av8Var != av8Var2);
        }
        e(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (this instanceof ScheduledFuture) {
            return to7.j(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        rt8 rt8Var;
        Object obj = this.m;
        if (obj != null) {
            return false;
        }
        if (p) {
            rt8Var = new rt8(new CancellationException("Future.cancel() was called."));
        } else {
            rt8Var = z ? rt8.b : rt8.c;
        }
        if (!r.x(this, obj, rt8Var)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void d(StringBuilder sb) {
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
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void f(kx8 kx8Var) {
        kx8Var.a = null;
        while (true) {
            kx8 kx8Var2 = this.f1963o;
            if (kx8Var2 != kx8.c) {
                kx8 kx8Var3 = null;
                while (kx8Var2 != null) {
                    kx8 kx8Var4 = kx8Var2.b;
                    if (kx8Var2.a != null) {
                        kx8Var3 = kx8Var2;
                    } else if (kx8Var3 != null) {
                        kx8Var3.b = kx8Var4;
                        if (kx8Var3.a == null) {
                        }
                    } else if (!r.y(this, kx8Var2, kx8Var4)) {
                    }
                    kx8Var2 = kx8Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.m;
        if (obj != null) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            kx8 kx8Var = this.f1963o;
            kx8 kx8Var2 = kx8.c;
            if (kx8Var != kx8Var2) {
                kx8 kx8Var3 = new kx8();
                while (true) {
                    l47 l47Var = r;
                    l47Var.u(kx8Var3, kx8Var);
                    if (l47Var.y(this, kx8Var, kx8Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                f(kx8Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.m;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        f(kx8Var3);
                        break;
                    }
                    kx8Var = this.f1963o;
                    if (kx8Var == kx8Var2) {
                    }
                }
            }
            return g(this.m);
        }
        while (nanos > 0) {
            Object obj3 = this.m;
            if (obj3 != null) {
                return g(obj3);
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
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = true;
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.m instanceof rt8;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.m != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.m instanceof rt8) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                strConcat = b();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.m;
            if (obj2 != null) {
                return g(obj2);
            }
            kx8 kx8Var = this.f1963o;
            kx8 kx8Var2 = kx8.c;
            if (kx8Var != kx8Var2) {
                kx8 kx8Var3 = new kx8();
                do {
                    l47 l47Var = r;
                    l47Var.u(kx8Var3, kx8Var);
                    if (l47Var.y(this, kx8Var, kx8Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.m;
                            } else {
                                f(kx8Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    kx8Var = this.f1963o;
                } while (kx8Var != kx8Var2);
            }
            return g(this.m);
        }
        throw new InterruptedException();
    }
}
