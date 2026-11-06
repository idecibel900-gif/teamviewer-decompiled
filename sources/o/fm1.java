package o;

/* JADX INFO: loaded from: classes.dex */
public final class fm1 implements de1 {
    public final de1 m;

    public fm1(de1 de1Var) {
        this.m = de1Var;
    }

    @Override // o.de1
    public final de1 H0(de1 de1Var) {
        de1 de1VarH0 = this.m.H0(de1Var);
        int i = va8.b;
        d82 d82Var = d82.y;
        be1 be1VarL0 = l0(d82Var);
        fe1 fe1Var = be1VarL0 instanceof fe1 ? (fe1) be1VarL0 : null;
        be1 be1VarL1 = de1VarH0.l0(d82Var);
        fe1 fe1Var2 = be1VarL1 instanceof fe1 ? (fe1) be1VarL1 : null;
        if ((fe1Var instanceof gm1) && fe1Var != fe1Var2) {
            ((gm1) fe1Var).p = 0;
        }
        return new fm1(de1VarH0);
    }

    @Override // o.de1
    public final Object b0(Object obj, hw2 hw2Var) {
        return this.m.b0(obj, hw2Var);
    }

    public final boolean equals(Object obj) {
        return im3.n(this.m, obj);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // o.de1
    public final de1 k0(ce1 ce1Var) {
        de1 de1VarK0 = this.m.k0(ce1Var);
        int i = va8.b;
        d82 d82Var = d82.y;
        be1 be1VarL0 = l0(d82Var);
        fe1 fe1Var = be1VarL0 instanceof fe1 ? (fe1) be1VarL0 : null;
        be1 be1VarL1 = de1VarK0.l0(d82Var);
        fe1 fe1Var2 = be1VarL1 instanceof fe1 ? (fe1) be1VarL1 : null;
        if ((fe1Var instanceof gm1) && fe1Var != fe1Var2) {
            ((gm1) fe1Var).p = 0;
        }
        return new fm1(de1VarK0);
    }

    @Override // o.de1
    public final be1 l0(ce1 ce1Var) {
        return this.m.l0(ce1Var);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.m + ")";
    }
}
