package o;

/* JADX INFO: loaded from: classes.dex */
public final class w96 extends e1 implements ge1 {
    public final /* synthetic */ q01 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x96 f2391o;

    /* JADX WARN: Illegal instructions before constructor call */
    public w96(q01 q01Var, x96 x96Var) {
        z06 z06Var = z06.r;
        this.n = q01Var;
        this.f2391o = x96Var;
        super(z06Var);
    }

    @Override // o.ge1
    public final void q(Throwable th, de1 de1Var) throws Throwable {
        q01 q01Var = this.n;
        x96 x96Var = this.f2391o;
        ka0.H(th, new x8(q01Var, x96Var, (byte) 19));
        ge1 ge1Var = (ge1) x96Var.m.l0(z06.r);
        if (ge1Var == null) {
            throw th;
        }
        ge1Var.q(th, de1Var);
    }
}
