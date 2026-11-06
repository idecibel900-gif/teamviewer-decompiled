package o;

/* JADX INFO: loaded from: classes2.dex */
public final class dq1 extends c07 implements hp1 {
    public final iv5 P;
    public final ty4 Q;
    public final d22 R;
    public final ed8 S;
    public final rp1 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq1(fi1 fi1Var, c07 c07Var, up upVar, sy4 sy4Var, int i, iv5 iv5Var, ty4 ty4Var, d22 d22Var, ed8 ed8Var, rp1 rp1Var, s67 s67Var) {
        super(fi1Var, c07Var, upVar, sy4Var, i, s67Var == null ? s67.h : s67Var);
        fi1Var.getClass();
        upVar.getClass();
        if (i == 0) {
            throw null;
        }
        ty4Var.getClass();
        ed8Var.getClass();
        this.P = iv5Var;
        this.Q = ty4Var;
        this.R = d22Var;
        this.S = ed8Var;
        this.T = rp1Var;
    }

    @Override // o.c07, o.zw2
    public final zw2 E0(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var) {
        sy4 sy4Var2;
        fi1Var.getClass();
        if (i == 0) {
            throw null;
        }
        upVar.getClass();
        c07 c07Var = (c07) xw2Var;
        if (sy4Var == null) {
            sy4 name = getName();
            name.getClass();
            sy4Var2 = name;
        } else {
            sy4Var2 = sy4Var;
        }
        dq1 dq1Var = new dq1(fi1Var, c07Var, upVar, sy4Var2, i, this.P, this.Q, this.R, this.S, this.T, s67Var);
        dq1Var.H = this.H;
        return dq1Var;
    }

    @Override // o.up1
    public final d22 G() {
        return this.R;
    }

    @Override // o.up1
    public final ty4 K() {
        return this.Q;
    }

    @Override // o.up1
    public final rp1 M() {
        return this.T;
    }

    @Override // o.up1
    public final t1 v() {
        return this.P;
    }
}
