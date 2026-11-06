package o;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class p2 implements ic4 {
    static final h2 ATOMIC_HELPER;
    private static final Object NULL;
    volatile l2 listeners;
    volatile Object value;
    volatile o2 waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(p2.class.getName());

    static {
        h2 n2Var;
        try {
            n2Var = new m2(AtomicReferenceFieldUpdater.newUpdater(o2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(o2.class, o2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p2.class, o2.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(p2.class, l2.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(p2.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            n2Var = new n2();
        }
        ATOMIC_HELPER = n2Var;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static void complete(p2 p2Var) {
        o2 o2Var;
        l2 l2Var;
        l2 l2Var2;
        l2 l2Var3;
        do {
            o2Var = p2Var.waiters;
        } while (!ATOMIC_HELPER.c(p2Var, o2Var, o2.c));
        while (true) {
            l2Var = null;
            if (o2Var == null) {
                break;
            }
            Thread thread = o2Var.a;
            if (thread != null) {
                o2Var.a = null;
                LockSupport.unpark(thread);
            }
            o2Var = o2Var.b;
        }
        p2Var.afterDone();
        do {
            l2Var2 = p2Var.listeners;
        } while (!ATOMIC_HELPER.a(p2Var, l2Var2, l2.d));
        while (true) {
            l2Var3 = l2Var;
            l2Var = l2Var2;
            if (l2Var == null) {
                break;
            }
            l2Var2 = l2Var.c;
            l2Var.c = l2Var3;
        }
        while (l2Var3 != null) {
            l2 l2Var4 = l2Var3.c;
            c(l2Var3.a, l2Var3.b);
            l2Var3 = l2Var4;
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof i2) {
            Throwable th = ((i2) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof k2) {
            throw new ExecutionException(((k2) obj).a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    @Override // o.ic4
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        l2 l2Var = this.listeners;
        l2 l2Var2 = l2.d;
        if (l2Var != l2Var2) {
            l2 l2Var3 = new l2(runnable, executor);
            do {
                l2Var3.c = l2Var;
                if (ATOMIC_HELPER.a(this, l2Var, l2Var3)) {
                    return;
                } else {
                    l2Var = this.listeners;
                }
            } while (l2Var != l2Var2);
        }
        c(runnable, executor);
    }

    public void afterDone() {
    }

    public final void b(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(uninterruptibly == this ? "this future" : String.valueOf(uninterruptibly));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        i2 i2Var;
        Object obj = this.value;
        if (obj == null) {
            if (GENERATE_CANCELLATION_CAUSES) {
                i2Var = new i2(new CancellationException("Future.cancel() was called."), z);
            } else {
                i2Var = z ? i2.c : i2.d;
            }
            if (ATOMIC_HELPER.b(this, obj, i2Var)) {
                if (z) {
                    interruptTask();
                }
                complete(this);
                return true;
            }
        }
        return false;
    }

    public final void e(o2 o2Var) {
        o2Var.a = null;
        while (true) {
            o2 o2Var2 = this.waiters;
            if (o2Var2 == o2.c) {
                return;
            }
            o2 o2Var3 = null;
            while (o2Var2 != null) {
                o2 o2Var4 = o2Var2.b;
                if (o2Var2.a != null) {
                    o2Var3 = o2Var2;
                } else if (o2Var3 != null) {
                    o2Var3.b = o2Var4;
                    if (o2Var3.a == null) {
                    }
                } else if (!ATOMIC_HELPER.c(this, o2Var2, o2Var4)) {
                }
                o2Var2 = o2Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        o2 o2Var = o2.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (obj != null) {
            return d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            o2 o2Var2 = this.waiters;
            if (o2Var2 != o2Var) {
                o2 o2Var3 = new o2();
                while (true) {
                    h2 h2Var = ATOMIC_HELPER;
                    h2Var.d(o2Var3, o2Var2);
                    if (h2Var.c(this, o2Var2, o2Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(o2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if (obj2 != null) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(o2Var3);
                        break;
                    }
                    o2Var2 = this.waiters;
                    if (o2Var2 == o2Var) {
                    }
                }
            }
            return d(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if (obj3 != null) {
                return d(obj3);
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
            boolean z = jConvert == 0 || nanos2 > 1000;
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

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof i2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.value != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.b(this, null, new k2((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e) {
                strPendingToString = "Exception thrown from implementation: " + e.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strPendingToString);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof i2) && ((i2) obj).a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        o2 o2Var = o2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if (obj2 != null) {
                return d(obj2);
            }
            o2 o2Var2 = this.waiters;
            if (o2Var2 != o2Var) {
                o2 o2Var3 = new o2();
                do {
                    h2 h2Var = ATOMIC_HELPER;
                    h2Var.d(o2Var3, o2Var2);
                    if (h2Var.c(this, o2Var2, o2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                e(o2Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    o2Var2 = this.waiters;
                } while (o2Var2 != o2Var);
            }
            return d(this.value);
        }
        throw new InterruptedException();
    }
}
