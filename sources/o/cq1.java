package o;

/* JADX INFO: loaded from: classes2.dex */
public final class cq1 extends du5 implements hp1 {
    public final qv5 M;
    public final ty4 N;
    public final d22 O;
    public final ed8 P;
    public final rp1 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq1(fi1 fi1Var, bu5 bu5Var, up upVar, as4 as4Var, cp1 cp1Var, boolean z, sy4 sy4Var, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, qv5 qv5Var, ty4 ty4Var, d22 d22Var, ed8 ed8Var, rp1 rp1Var) {
        super(fi1Var, bu5Var, upVar, as4Var, cp1Var, z, sy4Var, i, s67.h, z2, z3, z6, z4, z5);
        fi1Var.getClass();
        upVar.getClass();
        as4Var.getClass();
        cp1Var.getClass();
        sy4Var.getClass();
        if (i == 0) {
            throw null;
        }
        ty4Var.getClass();
        ed8Var.getClass();
        this.M = qv5Var;
        this.N = ty4Var;
        this.O = d22Var;
        this.P = ed8Var;
        this.Q = rp1Var;
    }

    @Override // o.du5
    public final du5 F0(fi1 fi1Var, as4 as4Var, cp1 cp1Var, bu5 bu5Var, int i, sy4 sy4Var) {
        fi1Var.getClass();
        as4Var.getClass();
        cp1Var.getClass();
        if (i == 0) {
            throw null;
        }
        sy4Var.getClass();
        return new cq1(fi1Var, bu5Var, getAnnotations(), as4Var, cp1Var, this.r, sy4Var, i, this.z, this.A, p(), this.D, this.B, this.M, this.N, this.O, this.P, this.Q);
    }

    @Override // o.up1
    public final d22 G() {
        return this.O;
    }

    @Override // o.up1
    public final ty4 K() {
        return this.N;
    }

    @Override // o.up1
    public final rp1 M() {
        return this.Q;
    }

    @Override // o.du5, o.qo4
    public final boolean p() {
        return im2.E.i(this.M.p).booleanValue();
    }

    @Override // o.up1
    public final t1 v() {
        return this.M;
    }
}
