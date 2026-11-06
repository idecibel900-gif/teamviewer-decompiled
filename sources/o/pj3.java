package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class pj3 extends es4 implements l28 {
    public qj8 A;
    public qj8 B;

    public pj3() {
        bm2 bm2Var = db8.E;
        this.A = bm2Var;
        this.B = bm2Var;
    }

    @Override // o.es4
    public void M0() {
        g57.p(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new oj3(this, (byte) 1));
        V0();
    }

    @Override // o.es4
    public void N0() {
        this.B = this.A;
        g57.r(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new oj3(this, (byte) 0));
    }

    @Override // o.es4
    public final void O0() {
        this.A = db8.E;
    }

    public abstract qj8 U0(qj8 qj8Var);

    public void V0() {
        this.B = U0(this.A);
        g57.r(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new oj3(this, (byte) 0));
    }

    @Override // o.l28
    public final Object k() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
