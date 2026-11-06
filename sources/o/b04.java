package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class b04 implements t96, ge1 {
    public final de1 m;
    public final hw2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fc1 f378o;
    public n87 p;

    public b04(de1 de1Var, hw2 hw2Var) {
        this.m = de1Var;
        this.n = hw2Var;
        this.f378o = hm3.c(de1Var.H0(this));
    }

    @Override // o.de1
    public final de1 H0(de1 de1Var) {
        return xk0.G(this, de1Var);
    }

    @Override // o.t96
    public final void a() {
        n87 n87Var = this.p;
        if (n87Var != null) {
            n87Var.p(new r54());
        }
        this.p = null;
    }

    @Override // o.t96
    public final void b() {
        n87 n87Var = this.p;
        if (n87Var != null) {
            n87Var.p(new r54());
        }
        this.p = null;
    }

    @Override // o.de1
    public final Object b0(Object obj, hw2 hw2Var) {
        return hw2Var.invoke(obj, this);
    }

    @Override // o.t96
    public final void c() {
        n87 n87Var = this.p;
        if (n87Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            n87Var.j(cancellationException);
        }
        this.p = im3.R(this.f378o, null, null, this.n, 3);
    }

    @Override // o.be1
    public final ce1 getKey() {
        return z06.r;
    }

    @Override // o.de1
    public final de1 k0(ce1 ce1Var) {
        return xk0.C(this, ce1Var);
    }

    @Override // o.de1
    public final be1 l0(ce1 ce1Var) {
        return xk0.v(this, ce1Var);
    }

    @Override // o.ge1
    public final void q(Throwable th, de1 de1Var) throws Throwable {
        q01 q01Var = (q01) de1Var.l0(q01.n);
        if (q01Var != null) {
            ka0.H(th, new x8(q01Var, this, (byte) 19));
        }
        ge1 ge1Var = (ge1) this.m.l0(z06.r);
        if (ge1Var == null) {
            throw th;
        }
        ge1Var.q(th, de1Var);
    }
}
