package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class vm1 extends es4 {
    public final int A = k45.e(this);
    public es4 B;

    @Override // o.es4
    public final void K0() {
        super.K0();
        for (es4 es4Var = this.B; es4Var != null; es4Var = es4Var.r) {
            es4Var.T0(this.t);
            if (!es4Var.z) {
                es4Var.K0();
            }
        }
    }

    @Override // o.es4
    public final void L0() {
        for (es4 es4Var = this.B; es4Var != null; es4Var = es4Var.r) {
            es4Var.L0();
        }
        super.L0();
    }

    @Override // o.es4
    public final void P0() {
        super.P0();
        for (es4 es4Var = this.B; es4Var != null; es4Var = es4Var.r) {
            es4Var.P0();
        }
    }

    @Override // o.es4
    public final void Q0() {
        for (es4 es4Var = this.B; es4Var != null; es4Var = es4Var.r) {
            es4Var.Q0();
        }
        super.Q0();
    }

    @Override // o.es4
    public final void R0() {
        super.R0();
        for (es4 es4Var = this.B; es4Var != null; es4Var = es4Var.r) {
            es4Var.R0();
        }
    }

    @Override // o.es4
    public final void S0(es4 es4Var) {
        this.m = es4Var;
        for (es4 es4Var2 = this.B; es4Var2 != null; es4Var2 = es4Var2.r) {
            es4Var2.S0(es4Var);
        }
    }

    @Override // o.es4
    public final void T0(e45 e45Var) {
        this.t = e45Var;
        for (es4 es4Var = this.B; es4Var != null; es4Var = es4Var.r) {
            es4Var.T0(e45Var);
        }
    }

    public final um1 U0(um1 um1Var) {
        es4 es4VarF0 = um1Var.f0();
        if (es4VarF0 != um1Var) {
            es4 es4Var = um1Var instanceof es4 ? (es4) um1Var : null;
            es4 es4Var2 = es4Var != null ? es4Var.q : null;
            if (es4VarF0 != this.m || !im3.n(es4Var2, this)) {
                hk0.l("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (es4VarF0.z) {
                ki3.c("Cannot delegate to an already attached node");
            }
            es4VarF0.S0(this.m);
            int i = this.f737o;
            int iF = k45.f(es4VarF0);
            es4VarF0.f737o = iF;
            int i2 = this.f737o;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof r04)) {
                ki3.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + es4VarF0);
            }
            es4VarF0.r = this.B;
            this.B = es4VarF0;
            es4VarF0.q = this;
            W0(iF | this.f737o, false);
            if (this.z) {
                if (i3 == 0 || (i & 2) != 0) {
                    T0(this.t);
                } else {
                    nf nfVar = vn4.p0(this).S;
                    this.m.T0(null);
                    nfVar.m();
                }
                es4VarF0.K0();
                es4VarF0.Q0();
                if (!es4VarF0.z) {
                    ki3.c("autoInvalidateInsertedNode called on unattached node");
                }
                k45.a(es4VarF0, -1, 1);
            }
        }
        return um1Var;
    }

    public final void V0(um1 um1Var) {
        es4 es4Var = null;
        for (es4 es4Var2 = this.B; es4Var2 != null; es4Var2 = es4Var2.r) {
            if (es4Var2 == um1Var) {
                boolean z = es4Var2.z;
                if (z) {
                    vw4 vw4Var = k45.a;
                    if (!z) {
                        ki3.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    k45.a(es4Var2, -1, 2);
                    es4Var2.R0();
                    es4Var2.L0();
                }
                es4Var2.S0(es4Var2);
                es4Var2.p = 0;
                es4 es4Var3 = es4Var2.r;
                if (es4Var == null) {
                    this.B = es4Var3;
                } else {
                    es4Var.r = es4Var3;
                }
                es4Var2.r = null;
                es4Var2.q = null;
                int i = this.f737o;
                int iF = k45.f(this);
                W0(iF, true);
                if (this.z && (i & 2) != 0 && (iF & 2) == 0) {
                    nf nfVar = vn4.p0(this).S;
                    this.m.T0(null);
                    nfVar.m();
                    return;
                }
                return;
            }
            es4Var = es4Var2;
        }
        hk0.f(um1Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void W0(int i, boolean z) {
        es4 es4Var;
        int i2 = this.f737o;
        this.f737o = i;
        if (i2 != i) {
            es4 es4Var2 = this.m;
            if (es4Var2 == this) {
                this.p = i;
            }
            boolean z2 = this.z;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f737o;
                    r2.f737o = i;
                    if (r2 == es4Var2) {
                        break;
                    } else {
                        r2 = r2.q;
                    }
                }
                if (z && r2 == es4Var2) {
                    i = k45.f(es4Var2);
                    es4Var2.f737o = i;
                }
                int i3 = i | ((r2 == 0 || (es4Var = r2.r) == null) ? 0 : es4Var.p);
                for (?? r3 = r2; r3 != 0; r3 = r3.q) {
                    i3 |= r3.f737o;
                    r3.p = i3;
                }
            }
        }
    }
}
