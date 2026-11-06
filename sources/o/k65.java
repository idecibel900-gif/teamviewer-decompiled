package o;

/* JADX INFO: loaded from: classes2.dex */
public final class k65 implements nw3 {
    public final u14 a = ds1.X(l54.m, new ti4(this));

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        obj.getClass();
        bb7Var.a(d()).s(d());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6VarD = d();
        k01 k01VarU = aj1Var.u(fq6VarD);
        int iL = k01VarU.l(d());
        if (iL != -1) {
            throw new nq6(fx3.e(iL, "Unexpected index "));
        }
        k01VarU.i(fq6VarD);
        return f88.a;
    }

    @Override // o.nw3
    public final fq6 d() {
        return (fq6) this.a.getValue();
    }
}
