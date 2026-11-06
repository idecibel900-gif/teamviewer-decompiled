package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j45 implements Iterator {
    public x35 m;
    public x35 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x35 f1127o;
    public x35 p;
    public x35 q;
    public final Class r;

    public j45(x35 x35Var, Class cls) {
        this.r = cls;
        if (cls.isInstance(x35Var)) {
            this.n = (x35) cls.cast(x35Var);
        }
        this.f1127o = x35Var;
        this.p = x35Var;
        this.m = x35Var;
        this.q = x35Var.H();
    }

    public final void a() {
        x35 x35Var;
        Class cls;
        if (this.n != null) {
            return;
        }
        if (this.q != null && this.f1127o.m == null) {
            this.f1127o = this.p;
        }
        x35 x35VarH = this.f1127o;
        do {
            x35Var = null;
            if (x35VarH.k() > 0) {
                x35VarH = x35VarH.i(0);
            } else {
                x35 x35Var2 = this.m;
                x35Var2.getClass();
                if (x35Var2 == x35VarH) {
                    x35VarH = null;
                } else if (x35VarH.w() != null) {
                    x35VarH = x35VarH.w();
                } else {
                    do {
                        x35VarH = x35VarH.H();
                        if (x35VarH != null) {
                            x35 x35Var3 = this.m;
                            x35Var3.getClass();
                            if (x35Var3 == x35VarH) {
                            }
                        }
                        this.n = x35Var;
                    } while (x35VarH.w() == null);
                    x35VarH = x35VarH.w();
                }
            }
            if (x35VarH != null) {
                cls = this.r;
            }
            this.n = x35Var;
        } while (!cls.isInstance(x35VarH));
        x35Var = (x35) cls.cast(x35VarH);
        this.n = x35Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.n != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        x35 x35Var = this.n;
        if (x35Var == null) {
            yq4.p();
            return null;
        }
        this.p = this.f1127o;
        this.f1127o = x35Var;
        this.q = x35Var.H();
        this.n = null;
        return x35Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f1127o.K();
    }
}
