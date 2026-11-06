package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q01 implements sa5, be1 {
    public static final ir n = new ir((byte) 7);
    public final ux2 m;

    public q01(ux2 ux2Var) {
        this.m = ux2Var;
    }

    @Override // o.de1
    public final /* bridge */ de1 H0(de1 de1Var) {
        return xk0.G(this, de1Var);
    }

    @Override // o.sa5
    public final boolean I() {
        return this.m.C;
    }

    @Override // o.de1
    public final Object b0(Object obj, hw2 hw2Var) {
        return hw2Var.invoke(obj, this);
    }

    @Override // o.be1
    public final ce1 getKey() {
        return n;
    }

    @Override // o.de1
    public final /* bridge */ de1 k0(ce1 ce1Var) {
        return xk0.C(this, ce1Var);
    }

    @Override // o.de1
    public final /* bridge */ be1 l0(ce1 ce1Var) {
        return xk0.v(this, ce1Var);
    }

    @Override // o.sa5
    public final List w(Integer num) {
        return this.m.D();
    }
}
