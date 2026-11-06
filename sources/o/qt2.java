package o;

import android.system.Os;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class qt2 {
    public final ut2 a;

    public /* synthetic */ qt2(ut2 ut2Var) {
        this.a = ut2Var;
    }

    public void a(Runnable runnable, String str) {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        Object obj = z92.m;
        TimeUnit timeUnit = TimeUnit.DAYS;
        xi5 xi5Var = xi5.c;
        h31 h31Var = xi5Var.a;
        if (Boolean.FALSE.booleanValue()) {
            at5 at5Var = xi5Var.b;
            Thread threadCurrentThread = Thread.currentThread();
            long id = threadCurrentThread.getId();
            ju7 ju7VarJ = at5Var.q;
            ju7 ju7Var = at5Var.r;
            if (ju7VarJ == null || ju7VarJ.p != id) {
                if (ju7Var == null || ju7Var.p != id) {
                    ju7VarJ = at5Var.j(threadCurrentThread.getName(), id, Os.gettid());
                    at5Var.r = at5Var.q;
                    at5Var.q = ju7VarJ;
                } else {
                    ju7VarJ = ju7Var;
                }
            }
            ju7VarJ.f669o.getClass();
            ju7VarJ.f669o.getClass();
            ut2 ut2Var = this.a;
            ut2Var.q.getClass();
            ut2Var.C();
            int i = ut2Var.J;
            if (i != 0) {
                Integer.toHexString(i);
            }
        }
        boolean z = false;
        try {
            runnable.run();
            if (obj instanceof AutoCloseable) {
                return;
            }
            if (!(obj instanceof ExecutorService)) {
                yq4.f();
                return;
            }
            ExecutorService executorService = (ExecutorService) obj;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated2 = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            while (!zIsTerminated2) {
                try {
                    zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            try {
                str.concat(".exception");
                b77.m(xi5Var, th);
                throw null;
            } catch (Throwable th2) {
                if (obj instanceof AutoCloseable) {
                    throw th2;
                }
                if (!(obj instanceof ExecutorService)) {
                    yq4.f();
                    return;
                }
                ExecutorService executorService2 = (ExecutorService) obj;
                if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                    throw th2;
                }
                executorService2.shutdown();
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                    } catch (InterruptedException unused2) {
                        if (!z) {
                            executorService2.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (!z) {
                    throw th2;
                }
                Thread.currentThread().interrupt();
                throw th2;
            }
        }
    }
}
