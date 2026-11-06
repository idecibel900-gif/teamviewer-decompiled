package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class qz0 extends io.sentry.l6 {
    public final me1 c;
    public hw2 d;
    public kf0 e;
    public n87 f;
    public boolean g;

    public qz0(me1 me1Var, dq5 dq5Var) {
        super(dq5Var);
        this.c = me1Var;
        this.d = new l5(2, null, (byte) 3);
    }

    public final void D(boolean z) {
        n87 n87Var;
        if (!z && super.m() && (n87Var = this.f) != null && !n87Var.e()) {
            o();
        }
        ((r10) this.a).f(z);
        ((q10) this.b).f(z);
    }

    @Override // io.sentry.l6
    public final void o() {
        kf0 kf0Var = this.e;
        if (kf0Var != null) {
            kf0Var.e(new CancellationException("onBack cancelled"), true);
        }
        n87 n87Var = this.f;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // io.sentry.l6
    public final void p() {
        if (this.e != null && !this.g) {
            o();
        }
        hc1 hc1Var = null;
        if (this.e == null) {
            this.g = false;
            this.e = ka0.d(-2, 4, df0.m);
            this.f = im3.R(this.c, null, null, new h0(this, hc1Var, (byte) 20), 3);
        }
        kf0 kf0Var = this.e;
        if (kf0Var != null) {
            kf0Var.d(null);
        }
        this.g = false;
    }

    @Override // io.sentry.l6
    public final void q(p10 p10Var) {
        kf0 kf0Var = this.e;
        if (kf0Var != null) {
            kf0Var.b(p10Var);
        }
    }

    @Override // io.sentry.l6
    public final void r() {
        o();
        if (super.m()) {
            this.g = true;
            this.e = ka0.d(-2, 4, df0.m);
            this.f = im3.R(this.c, null, null, new h0(this, null, (byte) 20), 3);
        }
    }
}
