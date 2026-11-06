package o;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class gt5 extends d1 implements wm0, wp6 {
    public final kf0 p;

    public gt5(de1 de1Var, kf0 kf0Var) {
        super(de1Var, true);
        this.p = kf0Var;
    }

    @Override // o.wp6
    public final Object a(Object obj, hc1 hc1Var) {
        return this.p.a(obj, hc1Var);
    }

    @Override // o.d1
    public final void a0(Throwable th, boolean z) {
        if (this.p.e(th, false) || z) {
            return;
        }
        ck3.T(th, this.f577o);
    }

    @Override // o.wp6
    public final Object b(Object obj) {
        return this.p.b(obj);
    }

    @Override // o.d1
    public final void d0(Object obj) {
        this.p.d(null);
    }

    public final boolean f0(Throwable th) {
        return this.p.e(th, false);
    }

    public final void g0(t tVar) {
        Unsafe unsafe;
        Unsafe unsafe2;
        kf0 kf0Var = this.p;
        kf0Var.getClass();
        long j = kf0.w;
        do {
            unsafe = defpackage.a.a;
            if (unsafe.compareAndSwapObject(kf0Var, kf0.w, (Object) null, tVar)) {
                return;
            }
        } while (unsafe.getObjectVolatile(kf0Var, j) == null);
        while (true) {
            Object objectVolatile = defpackage.a.a.getObjectVolatile(kf0Var, j);
            hr2 hr2Var = mf0.q;
            if (objectVolatile != hr2Var) {
                if (objectVolatile == mf0.r) {
                    hk0.l("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    hk0.f(objectVolatile, "Another handler is already registered: ");
                    return;
                }
            }
            hr2 hr2Var2 = mf0.r;
            do {
                unsafe2 = defpackage.a.a;
                if (unsafe2.compareAndSwapObject(kf0Var, kf0.w, hr2Var, hr2Var2)) {
                    tVar.invoke(kf0Var.q());
                    return;
                }
            } while (unsafe2.getObjectVolatile(kf0Var, j) == hr2Var);
        }
    }

    @Override // o.wm0
    public final ff0 iterator() {
        kf0 kf0Var = this.p;
        kf0Var.getClass();
        return new ff0(kf0Var);
    }

    @Override // o.op3, o.bp3, o.wm0
    public final void j(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new cp3(t(), null, this);
        }
        p(cancellationException);
    }

    @Override // o.wm0
    public final a65 k() {
        return this.p.k();
    }

    @Override // o.wm0
    public final Object l() {
        return this.p.l();
    }

    @Override // o.wm0
    public final Object m(hc1 hc1Var) {
        return this.p.m(hc1Var);
    }

    @Override // o.wm0
    public final Object n(pw0 pw0Var) {
        kf0 kf0Var = this.p;
        kf0Var.getClass();
        return kf0.F(kf0Var, pw0Var);
    }

    @Override // o.op3
    public final void p(CancellationException cancellationException) {
        this.p.e(cancellationException, true);
        i(cancellationException);
    }
}
