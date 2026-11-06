package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e1 implements be1 {
    public final ce1 m;

    public e1(ce1 ce1Var) {
        this.m = ce1Var;
    }

    @Override // o.de1
    public final /* bridge */ de1 H0(de1 de1Var) {
        return xk0.G(this, de1Var);
    }

    @Override // o.de1
    public final Object b0(Object obj, hw2 hw2Var) {
        return hw2Var.invoke(obj, this);
    }

    @Override // o.be1
    public final ce1 getKey() {
        return this.m;
    }

    @Override // o.de1
    public /* bridge */ de1 k0(ce1 ce1Var) {
        return xk0.C(this, ce1Var);
    }

    @Override // o.de1
    public /* bridge */ be1 l0(ce1 ce1Var) {
        return xk0.v(this, ce1Var);
    }
}
