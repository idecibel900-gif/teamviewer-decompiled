package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class kn0 extends tn6 {
    public final kf0 s;
    public final /* synthetic */ AtomicReferenceArray t;

    public kn0(long j, kn0 kn0Var, kf0 kf0Var, int i) {
        super(j, kn0Var, i);
        this.s = kf0Var;
        this.t = new AtomicReferenceArray(mf0.b * 2);
    }

    @Override // o.tn6
    public final int g() {
        return mf0.b;
    }

    @Override // o.tn6
    public final void h(int i, de1 de1Var) {
        kf0 kf0Var;
        int i2 = mf0.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.t.get(i * 2);
        while (true) {
            Object objL = l(i);
            boolean z2 = objL instanceof ug8;
            kf0Var = this.s;
            if (z2 || (objL instanceof vg8)) {
                if (k(i, objL, z ? mf0.j : mf0.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        kf0Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objL == mf0.j || objL == mf0.k) {
                    break;
                }
                if (objL != mf0.g && objL != mf0.f) {
                    if (objL == mf0.i || objL == mf0.d || objL == mf0.l) {
                        return;
                    }
                    hk0.f(objL, "unexpected state: ");
                    return;
                }
            }
        }
        n(i, null);
        if (z) {
            kf0Var.getClass();
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.t;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.t.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            kf0 kf0Var = this.s;
            kf0Var.getClass();
            kf0Var.N((this.p * ((long) mf0.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.t.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.t.set((i * 2) + 1, obj);
    }
}
