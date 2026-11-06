package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class yg6 implements hc1, oe1 {
    public static final AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(yg6.class, Object.class, "result");
    public final hc1 m;
    private volatile Object result;

    public yg6(hc1 hc1Var) {
        ne1 ne1Var = ne1.m;
        this.m = hc1Var;
        this.result = ne1Var;
    }

    @Override // o.oe1
    public final oe1 getCallerFrame() {
        hc1 hc1Var = this.m;
        if (hc1Var instanceof oe1) {
            return (oe1) hc1Var;
        }
        return null;
    }

    @Override // o.hc1
    public final de1 getContext() {
        return this.m.getContext();
    }

    @Override // o.hc1
    public final void resumeWith(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        while (true) {
            Object obj2 = this.result;
            ne1 ne1Var = ne1.n;
            if (obj2 == ne1Var) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, ne1Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != ne1Var) {
                    }
                }
                return;
            }
            ne1 ne1Var2 = ne1.m;
            if (obj2 != ne1Var2) {
                hk0.l("Already resumed");
                return;
            }
            ne1 ne1Var3 = ne1.f1565o;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, ne1Var2, ne1Var3)) {
                    this.m.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == ne1Var2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.m;
    }
}
