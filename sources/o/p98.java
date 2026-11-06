package o;

/* JADX INFO: loaded from: classes.dex */
public final class p98 implements be1 {
    public final p98 m;
    public final vh1 n;

    public p98(p98 p98Var, vh1 vh1Var) {
        this.m = p98Var;
        this.n = vh1Var;
    }

    @Override // o.de1
    public final de1 H0(de1 de1Var) {
        return xk0.G(this, de1Var);
    }

    public final void a(vh1 vh1Var) {
        if (this.n == vh1Var) {
            hk0.l("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        p98 p98Var = this.m;
        if (p98Var != null) {
            p98Var.a(vh1Var);
        }
    }

    @Override // o.de1
    public final Object b0(Object obj, hw2 hw2Var) {
        return hw2Var.invoke(obj, this);
    }

    @Override // o.be1
    public final ce1 getKey() {
        return d82.P;
    }

    @Override // o.de1
    public final de1 k0(ce1 ce1Var) {
        return xk0.C(this, ce1Var);
    }

    @Override // o.de1
    public final be1 l0(ce1 ce1Var) {
        return xk0.v(this, ce1Var);
    }
}
