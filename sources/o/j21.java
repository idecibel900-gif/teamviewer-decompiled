package o;

/* JADX INFO: loaded from: classes2.dex */
public final class j21 extends kf0 {
    public final df0 C;

    public j21(int i, df0 df0Var) {
        super(i);
        this.C = df0Var;
        if (df0Var == df0.m) {
            an4.q(w86.a.b(kf0.class).f(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        gk0.h(fx3.f(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // o.kf0
    public final boolean A() {
        return this.C == df0.n;
    }

    public final Object O(Object obj, boolean z) {
        df0 df0Var = this.C;
        df0 df0Var2 = df0.f616o;
        f88 f88Var = f88.a;
        if (df0Var == df0Var2) {
            Object objB = super.b(obj);
            return (!(objB instanceof in0) || (objB instanceof hn0)) ? objB : f88Var;
        }
        Object obj2 = mf0.d;
        kn0 kn0Var = (kn0) kf0.r.get(this);
        while (true) {
            long andIncrement = kf0.n.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zX = x(andIncrement, false);
            int i = mf0.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (kn0Var.p != j3) {
                kn0 kn0VarO = o(j3, kn0Var);
                if (kn0VarO != null) {
                    kn0Var = kn0VarO;
                } else if (zX) {
                    return new hn0(t());
                }
            }
            int iL = L(kn0Var, i2, obj, j, obj2, zX);
            if (iL == 0) {
                kn0Var.a();
                return f88Var;
            }
            if (iL != 1) {
                if (iL != 2) {
                    if (iL == 3) {
                        hk0.l("unexpected");
                        return null;
                    }
                    if (iL == 4) {
                        if (j < s()) {
                            kn0Var.a();
                        }
                        return new hn0(t());
                    }
                    if (iL == 5) {
                        kn0Var.a();
                    }
                } else {
                    if (zX) {
                        kn0Var.i();
                        return new hn0(t());
                    }
                    ug8 ug8Var = obj2 instanceof ug8 ? (ug8) obj2 : null;
                    if (ug8Var != null) {
                        ug8Var.a(kn0Var, i2 + i);
                    }
                    g((kn0Var.p * j2) + ((long) i2));
                }
            }
            return f88Var;
        }
    }

    @Override // o.kf0, o.wp6
    public final Object a(Object obj, hc1 hc1Var) throws Throwable {
        if (O(obj, true) instanceof hn0) {
            throw t();
        }
        return f88.a;
    }

    @Override // o.kf0, o.wp6
    public final Object b(Object obj) {
        return O(obj, false);
    }
}
