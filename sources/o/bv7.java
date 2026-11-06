package o;

/* JADX INFO: loaded from: classes.dex */
public final class bv7 implements bf5 {
    public final vu7 m;
    public u18 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public vx4 f460o;

    public bv7(vu7 vu7Var) {
        this.m = vu7Var;
    }

    @Override // o.bf5
    public final u18 b() {
        u18 u18Var = this.n;
        if (u18Var != null) {
            return u18Var;
        }
        im3.e0("scaffoldStateTransition");
        throw null;
    }

    @Override // o.bf5
    public final float c() {
        vx4 vx4Var = this.f460o;
        if (vx4Var == null) {
            im3.e0("transitionState");
            throw null;
        }
        cv7 cv7Var = (cv7) vx4Var.a.f1933o.getValue();
        vx4 vx4Var2 = this.f460o;
        if (vx4Var2 == null) {
            im3.e0("transitionState");
            throw null;
        }
        if (im3.n(cv7Var, vx4Var2.b())) {
            return 1.0f;
        }
        vx4 vx4Var3 = this.f460o;
        if (vx4Var3 != null) {
            return vx4Var3.a.u.z();
        }
        im3.e0("transitionState");
        throw null;
    }

    @Override // o.bf5
    public final vu7 f() {
        return this.m;
    }
}
