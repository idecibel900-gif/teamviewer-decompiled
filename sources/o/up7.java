package o;

/* JADX INFO: loaded from: classes.dex */
public final class up7 extends vm1 implements v01, fp7 {
    public lh7 C;
    public jr7 D;
    public kr7 E;
    public kd1 F;
    public n87 G;
    public final eo1 H = d57.b(new y26(this, 29));
    public v56 I = v56.e;

    public up7(lh7 lh7Var, jr7 jr7Var, kr7 kr7Var, kd1 kd1Var) {
        this.C = lh7Var;
        this.D = jr7Var;
        this.E = kr7Var;
        this.F = kd1Var;
    }

    @Override // o.es4
    public final void M0() {
        lh7 lh7Var = this.C;
        lh7Var.f1364o = mz7.f1527o;
        lh7Var.n = this;
    }

    @Override // o.es4
    public final void N0() {
        lh7 lh7Var = this.C;
        lh7Var.f1364o = mz7.n;
        lh7Var.n = null;
    }

    @Override // o.fp7
    public final ep7 P() {
        return (ep7) this.H.getValue();
    }

    @Override // o.fp7
    public final v56 X(i04 i04Var) {
        v56 v56Var;
        if (this.z && (v56Var = (v56) this.F.invoke(i04Var)) != null) {
            this.I = v56Var;
            return v56Var;
        }
        return this.I;
    }

    @Override // o.fp7
    public final long c0(i04 i04Var) {
        return X(i04Var).d();
    }
}
