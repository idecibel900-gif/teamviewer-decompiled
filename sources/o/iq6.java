package o;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class iq6 implements Executor {
    public static final String q = we4.i("SerialExecutorImpl");
    public final Executor n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Runnable f1090o;
    public final ArrayDeque m = new ArrayDeque();
    public final Object p = new Object();

    public iq6(Executor executor) {
        this.n = executor;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.m.poll();
        this.f1090o = runnable;
        if (runnable != null) {
            try {
                this.n.execute(runnable);
            } catch (Throwable th) {
                we4.f().e(q, "Delegate executor failed to execute", th);
                this.f1090o = null;
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.p) {
            try {
                this.m.add(new it8((Object) this, (Object) runnable, (byte) 18));
                if (this.f1090o == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
