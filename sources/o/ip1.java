package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ip1 extends wr0 implements hp1 {
    public final vu5 Q;
    public final ty4 R;
    public final d22 S;
    public final ed8 T;
    public final rp1 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip1(ns4 ns4Var, z61 z61Var, up upVar, boolean z, int i, vu5 vu5Var, ty4 ty4Var, d22 d22Var, ed8 ed8Var, rp1 rp1Var, s67 s67Var) {
        super(ns4Var, z61Var, upVar, z, i, s67Var == null ? s67.h : s67Var);
        ns4Var.getClass();
        upVar.getClass();
        if (i == 0) {
            throw null;
        }
        ty4Var.getClass();
        ed8Var.getClass();
        this.Q = vu5Var;
        this.R = ty4Var;
        this.S = d22Var;
        this.T = ed8Var;
        this.U = rp1Var;
    }

    @Override // o.zw2, o.xw2
    public final boolean D() {
        return false;
    }

    @Override // o.wr0, o.zw2
    public final /* bridge */ /* synthetic */ zw2 E0(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var) {
        return S0(fi1Var, xw2Var, i, upVar, s67Var);
    }

    @Override // o.up1
    public final d22 G() {
        return this.S;
    }

    @Override // o.up1
    public final ty4 K() {
        return this.R;
    }

    @Override // o.up1
    public final rp1 M() {
        return this.U;
    }

    @Override // o.wr0
    /* JADX INFO: renamed from: M0 */
    public final /* bridge */ /* synthetic */ wr0 E0(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var) {
        return S0(fi1Var, xw2Var, i, upVar, s67Var);
    }

    public final ip1 S0(fi1 fi1Var, xw2 xw2Var, int i, up upVar, s67 s67Var) {
        fi1Var.getClass();
        if (i == 0) {
            throw null;
        }
        upVar.getClass();
        ip1 ip1Var = new ip1((ns4) fi1Var, (z61) xw2Var, upVar, this.P, i, this.Q, this.R, this.S, this.T, this.U, s67Var);
        ip1Var.H = this.H;
        return ip1Var;
    }

    @Override // o.zw2, o.xw2
    public final boolean l() {
        return false;
    }

    @Override // o.zw2, o.xw2
    public final boolean m() {
        return false;
    }

    @Override // o.zw2, o.qo4
    public final boolean p() {
        return false;
    }

    @Override // o.up1
    public final t1 v() {
        return this.Q;
    }
}
