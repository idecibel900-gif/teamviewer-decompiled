package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class zv8 extends l47 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public zv8(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // o.l47
    public final void u(kx8 kx8Var, kx8 kx8Var2) {
        this.b.lazySet(kx8Var, kx8Var2);
    }

    @Override // o.l47
    public final void v(kx8 kx8Var, Thread thread) {
        this.a.lazySet(kx8Var, thread);
    }

    @Override // o.l47
    public final boolean w(rx8 rx8Var, av8 av8Var, av8 av8Var2) {
        return h57.G(this.d, rx8Var, av8Var, av8Var2);
    }

    @Override // o.l47
    public final boolean x(rx8 rx8Var, Object obj, Object obj2) {
        return h57.G(this.e, rx8Var, obj, obj2);
    }

    @Override // o.l47
    public final boolean y(rx8 rx8Var, kx8 kx8Var, kx8 kx8Var2) {
        return h57.G(this.c, rx8Var, kx8Var, kx8Var2);
    }
}
