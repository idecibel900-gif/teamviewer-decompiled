package o;

/* JADX INFO: loaded from: classes.dex */
public final class b90 extends vm1 implements dp6 {
    public s80 C;
    public float D;
    public t57 E;
    public pw6 F;
    public final gi0 G;

    public b90(float f, t57 t57Var, pw6 pw6Var) {
        this.D = f;
        this.E = t57Var;
        this.F = pw6Var;
        gi0 gi0Var = new gi0(new hi0(), new q0(this, (byte) 17));
        U0(gi0Var);
        this.G = gi0Var;
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.dp6
    public final boolean f() {
        return false;
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        lp6.j(op6Var, this.F);
    }
}
