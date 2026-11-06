package o;

/* JADX INFO: loaded from: classes.dex */
public final class c10 extends es4 {
    public dv7 A;
    public final /* synthetic */ d10 B;

    public c10(d10 d10Var) {
        this.B = d10Var;
    }

    @Override // o.es4
    public final void M0() {
        d10 d10Var = this.B;
        d10Var.b = this;
        if (d10Var.c != null) {
            this.A = zu1.K(this, 0L, 0L, new g0(this, d10Var, (byte) 11));
        }
    }

    @Override // o.es4
    public final void N0() {
        d10 d10Var = this.B;
        if (d10Var.b == this) {
            d10Var.b = null;
        }
        dv7 dv7Var = this.A;
        if (dv7Var != null) {
            dv7Var.b();
        }
        this.A = null;
    }
}
