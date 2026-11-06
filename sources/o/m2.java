package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends h2 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public m2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // o.h2
    public final boolean a(p2 p2Var, l2 l2Var, l2 l2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(p2Var, l2Var, l2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p2Var) == l2Var);
        return false;
    }

    @Override // o.h2
    public final boolean b(p2 p2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(p2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p2Var) == obj);
        return false;
    }

    @Override // o.h2
    public final boolean c(p2 p2Var, o2 o2Var, o2 o2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(p2Var, o2Var, o2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p2Var) == o2Var);
        return false;
    }

    @Override // o.h2
    public final void d(o2 o2Var, o2 o2Var2) {
        this.b.lazySet(o2Var, o2Var2);
    }

    @Override // o.h2
    public final void e(o2 o2Var, Thread thread) {
        this.a.lazySet(o2Var, thread);
    }
}
