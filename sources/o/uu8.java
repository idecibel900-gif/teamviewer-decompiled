package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class uu8 implements Cloneable {
    public final vu8 m;
    public vu8 n;

    public uu8(vu8 vu8Var) {
        this.m = vu8Var;
        if (vu8Var.h()) {
            hk0.g("Default instance must be immutable.");
            throw null;
        }
        this.n = (vu8) vu8Var.j(4);
    }

    public final vu8 a() {
        boolean zH = this.n.h();
        vu8 vu8Var = this.n;
        if (zH) {
            vu8Var.getClass();
            kv8.b.a(vu8Var.getClass()).a(vu8Var);
            vu8Var.e();
            vu8Var = this.n;
        }
        vu8Var.getClass();
        if (vu8.i(vu8Var, true)) {
            return vu8Var;
        }
        throw new sv8();
    }

    public final void b() {
        if (this.n.h()) {
            return;
        }
        vu8 vu8Var = (vu8) this.m.j(4);
        kv8.b.a(vu8Var.getClass()).f(vu8Var, this.n);
        this.n = vu8Var;
    }

    public final Object clone() {
        uu8 uu8Var = (uu8) this.m.j(5);
        boolean zH = this.n.h();
        vu8 vu8Var = this.n;
        if (zH) {
            vu8Var.getClass();
            kv8.b.a(vu8Var.getClass()).a(vu8Var);
            vu8Var.e();
            vu8Var = this.n;
        }
        uu8Var.n = vu8Var;
        return uu8Var;
    }
}
