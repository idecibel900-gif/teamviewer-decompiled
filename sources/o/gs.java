package o;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gs implements Executor {
    public final /* synthetic */ byte m;
    public final ArrayDeque n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Runnable f916o;
    public final Object p;
    public final Executor q;

    public gs(Executor executor) {
        this.m = (byte) 1;
        executor.getClass();
        this.q = executor;
        this.n = new ArrayDeque();
        this.p = new Object();
    }

    public final void a() {
        switch (this.m) {
            case 0:
                synchronized (this.p) {
                    try {
                        Runnable runnable = (Runnable) this.n.poll();
                        this.f916o = runnable;
                        if (runnable != null) {
                            ((m12) this.q).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.p) {
                    Object objPoll = this.n.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.f916o = runnable2;
                    if (objPoll != null) {
                        this.q.execute(runnable2);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.m) {
            case 0:
                synchronized (this.p) {
                    try {
                        this.n.add(new io.sentry.u4((Object) this, (Object) runnable, (byte) 17));
                        if (this.f916o == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.p) {
                    this.n.offer(new be3(runnable, this, (byte) 16));
                    if (this.f916o == null) {
                        a();
                    }
                    break;
                }
                return;
        }
    }

    public gs(m12 m12Var) {
        this.m = (byte) 0;
        this.p = new Object();
        this.n = new ArrayDeque();
        this.q = m12Var;
    }
}
