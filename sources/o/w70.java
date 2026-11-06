package o;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class w70 extends d1 {
    public final Thread p;
    public final be2 q;

    public w70(de1 de1Var, Thread thread, be2 be2Var) {
        super(de1Var, true);
        this.p = thread;
        this.q = be2Var;
    }

    @Override // o.op3
    public final void c(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.p;
        if (im3.n(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
