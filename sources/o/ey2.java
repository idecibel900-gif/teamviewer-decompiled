package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ey2 implements Cloneable {
    public final ny2 m;
    public ny2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f751o = false;

    public ey2(ny2 ny2Var) {
        this.m = ny2Var;
        this.n = (ny2) ny2Var.f(4);
    }

    public final ny2 a() {
        ny2 ny2VarB = b();
        if (ny2VarB.i()) {
            return ny2VarB;
        }
        throw new y78();
    }

    public final ny2 b() {
        boolean z = this.f751o;
        ny2 ny2Var = this.n;
        if (z) {
            return ny2Var;
        }
        ny2Var.getClass();
        uw5 uw5Var = uw5.c;
        uw5Var.getClass();
        uw5Var.a(ny2Var.getClass()).a(ny2Var);
        this.f751o = true;
        return this.n;
    }

    public final void c() {
        if (this.f751o) {
            ny2 ny2Var = (ny2) this.n.f(4);
            ny2 ny2Var2 = this.n;
            uw5 uw5Var = uw5.c;
            uw5Var.getClass();
            uw5Var.a(ny2Var.getClass()).j(ny2Var, ny2Var2);
            this.n = ny2Var;
            this.f751o = false;
        }
    }

    public final Object clone() {
        ey2 ey2Var = (ey2) this.m.f(5);
        ey2Var.d(b());
        return ey2Var;
    }

    public final void d(ny2 ny2Var) {
        c();
        ny2 ny2Var2 = this.n;
        uw5 uw5Var = uw5.c;
        uw5Var.getClass();
        uw5Var.a(ny2Var2.getClass()).j(ny2Var2, ny2Var);
    }
}
