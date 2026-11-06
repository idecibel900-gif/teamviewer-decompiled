package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class gy2 implements Cloneable {
    public final py2 m;
    public py2 n;

    public gy2(py2 py2Var) {
        this.m = py2Var;
        if (py2Var.g()) {
            hk0.g("Default instance must be immutable.");
            throw null;
        }
        this.n = py2Var.i();
    }

    public final py2 a() {
        py2 py2VarB = b();
        py2VarB.getClass();
        if (py2.f(py2VarB, true)) {
            return py2VarB;
        }
        throw new a88();
    }

    public final py2 b() {
        boolean zG = this.n.g();
        py2 py2Var = this.n;
        if (!zG) {
            return py2Var;
        }
        py2Var.getClass();
        vw5 vw5Var = vw5.c;
        vw5Var.getClass();
        vw5Var.a(py2Var.getClass()).a(py2Var);
        py2Var.h();
        return this.n;
    }

    public final void c() {
        if (this.n.g()) {
            return;
        }
        py2 py2VarI = this.m.i();
        py2 py2Var = this.n;
        vw5 vw5Var = vw5.c;
        vw5Var.getClass();
        vw5Var.a(py2VarI.getClass()).d(py2VarI, py2Var);
        this.n = py2VarI;
    }

    public final Object clone() {
        gy2 gy2Var = (gy2) this.m.c(5);
        gy2Var.n = b();
        return gy2Var;
    }
}
