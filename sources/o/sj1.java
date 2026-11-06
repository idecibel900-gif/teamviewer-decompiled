package o;

/* JADX INFO: loaded from: classes.dex */
public final class sj1 extends es4 implements t52 {
    public final mw4 A;
    public boolean B;
    public boolean C;
    public boolean D;

    public sj1(mw4 mw4Var) {
        this.A = mw4Var;
    }

    @Override // o.es4
    public final void M0() {
        im3.R(I0(), null, null, new y0(this, null, (byte) 11), 3);
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        d14Var.a();
        nl0 nl0Var = d14Var.m;
        if (this.B) {
            u52.k0(d14Var, rv0.b(0.3f, rv0.b), nl0Var.d(), 0.0f, 122);
        } else if (this.C || this.D) {
            u52.k0(d14Var, rv0.b(0.1f, rv0.b), nl0Var.d(), 0.0f, 122);
        }
    }
}
