package o;

/* JADX INFO: loaded from: classes.dex */
public final class ss8 extends o77 {
    @Override // o.o77
    public final boolean A(vs8 vs8Var, us8 us8Var, us8 us8Var2) {
        synchronized (vs8Var) {
            try {
                if (vs8Var.f2342o != us8Var) {
                    return false;
                }
                vs8Var.f2342o = us8Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.o77
    public final qs8 u(ot8 ot8Var) {
        qs8 qs8Var;
        qs8 qs8Var2 = qs8.d;
        synchronized (ot8Var) {
            try {
                qs8Var = ot8Var.n;
                if (qs8Var != qs8Var2) {
                    ot8Var.n = qs8Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qs8Var;
    }

    @Override // o.o77
    public final us8 v(ot8 ot8Var) {
        us8 us8Var;
        us8 us8Var2 = us8.c;
        synchronized (ot8Var) {
            try {
                us8Var = ot8Var.f2342o;
                if (us8Var != us8Var2) {
                    ot8Var.f2342o = us8Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return us8Var;
    }

    @Override // o.o77
    public final void w(us8 us8Var, us8 us8Var2) {
        us8Var.b = us8Var2;
    }

    @Override // o.o77
    public final void x(us8 us8Var, Thread thread) {
        us8Var.a = thread;
    }

    @Override // o.o77
    public final boolean y(ot8 ot8Var, qs8 qs8Var, qs8 qs8Var2) {
        synchronized (ot8Var) {
            try {
                if (ot8Var.n != qs8Var) {
                    return false;
                }
                ot8Var.n = qs8Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.o77
    public final boolean z(vs8 vs8Var, Object obj, Object obj2) {
        synchronized (vs8Var) {
            try {
                if (vs8Var.m != obj) {
                    return false;
                }
                vs8Var.m = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
