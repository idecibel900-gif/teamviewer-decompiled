package o;

/* JADX INFO: loaded from: classes.dex */
public final class jk6 extends vm1 implements v01, o65 {
    public tk6 C;
    public gb5 D;
    public boolean E;
    public ym2 F;
    public mw4 G;
    public nb0 H;
    public boolean I;
    public li J;
    public sk6 K;
    public um1 L;
    public mi M;
    public li N;
    public boolean O;

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void M0() {
        this.O = Y0();
        X0();
        if (this.K == null) {
            tk6 tk6Var = this.C;
            li liVar = this.I ? this.N : this.J;
            sk6 sk6Var = new sk6(liVar, this.H, this.F, this.G, this.D, tk6Var, this.E, this.O);
            U0(sk6Var);
            this.K = sk6Var;
        }
    }

    @Override // o.es4
    public final void N0() {
        um1 um1Var = this.L;
        if (um1Var != null) {
            V0(um1Var);
        }
    }

    @Override // o.um1
    public final void Q() {
        boolean zY0 = Y0();
        if (this.O != zY0) {
            this.O = zY0;
            tk6 tk6Var = this.C;
            gb5 gb5Var = this.D;
            boolean z = this.I;
            li liVar = z ? this.N : this.J;
            Z0(liVar, this.H, this.F, this.G, gb5Var, tk6Var, z, this.E);
        }
    }

    public final void X0() {
        um1 um1Var = this.L;
        if (um1Var != null) {
            if (um1Var.f0().z) {
                return;
            }
            U0(um1Var);
            return;
        }
        if (this.I) {
            bt1.J(this, new y26(this, (byte) 8));
        }
        li liVar = this.I ? this.N : this.J;
        if (liVar != null) {
            vm1 vm1Var = liVar.i;
            if (vm1Var.m.z) {
                return;
            }
            U0(vm1Var);
            this.L = vm1Var;
        }
    }

    public final boolean Y0() {
        return (this.z ? vn4.p0(this).M : j04.m) != j04.n || this.D == gb5.m;
    }

    public final void Z0(li liVar, nb0 nb0Var, ym2 ym2Var, mw4 mw4Var, gb5 gb5Var, tk6 tk6Var, boolean z, boolean z2) {
        boolean z3;
        this.C = tk6Var;
        this.D = gb5Var;
        boolean z4 = true;
        if (this.I != z) {
            this.I = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (im3.n(this.J, liVar)) {
            z4 = false;
        } else {
            this.J = liVar;
        }
        if (z3 || (z4 && !z)) {
            um1 um1Var = this.L;
            if (um1Var != null) {
                V0(um1Var);
            }
            this.L = null;
            X0();
        }
        this.E = z2;
        this.F = ym2Var;
        this.G = mw4Var;
        this.H = nb0Var;
        boolean zY0 = Y0();
        this.O = zY0;
        sk6 sk6Var = this.K;
        if (sk6Var != null) {
            sk6Var.p1(this.I ? this.N : this.J, nb0Var, ym2Var, mw4Var, gb5Var, tk6Var, z2, zY0);
        }
    }

    @Override // o.o65
    public final void n0() {
        mi miVar = (mi) xk0.q(this, kc5.a);
        if (im3.n(miVar, this.M)) {
            return;
        }
        this.M = miVar;
        this.N = null;
        um1 um1Var = this.L;
        if (um1Var != null) {
            V0(um1Var);
        }
        this.L = null;
        X0();
        sk6 sk6Var = this.K;
        if (sk6Var != null) {
            tk6 tk6Var = this.C;
            gb5 gb5Var = this.D;
            li liVar = this.I ? this.N : this.J;
            sk6Var.p1(liVar, this.H, this.F, this.G, gb5Var, tk6Var, this.E, this.O);
        }
    }
}
