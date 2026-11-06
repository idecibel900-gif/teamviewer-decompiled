package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class an0 extends ym0 {
    public final go2 p;

    public an0(go2 go2Var, de1 de1Var, int i, df0 df0Var) {
        super(de1Var, i, df0Var);
        this.p = go2Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[RETURN] */
    @Override // o.ym0, o.go2
    public final Object b(ho2 ho2Var, hc1 hc1Var) throws Throwable {
        Object objB;
        int i = this.n;
        ne1 ne1Var = ne1.m;
        if (i == -3) {
            de1 context = hc1Var.getContext();
            Boolean bool = Boolean.FALSE;
            iz0 iz0Var = new iz0((byte) 25);
            de1 de1Var = this.m;
            de1 de1VarH0 = !((Boolean) de1Var.b0(bool, iz0Var)).booleanValue() ? context.H0(de1Var) : j51.G(context, de1Var, false);
            if (im3.n(de1VarH0, context)) {
                Object objJ = j(ho2Var, hc1Var);
                if (objJ == ne1Var) {
                    return objJ;
                }
            } else {
                d82 d82Var = d82.y;
                if (im3.n(de1VarH0.l0(d82Var), context.l0(d82Var))) {
                    de1 context2 = hc1Var.getContext();
                    if (!(ho2Var instanceof yp6) && !(ho2Var instanceof y45)) {
                        ho2Var = new af(ho2Var, context2);
                    }
                    Object objY = ga0.y(de1VarH0, ho2Var, j51.S(de1VarH0), new h0(this, null, (byte) 18), hc1Var);
                    if (objY == ne1Var) {
                        return objY;
                    }
                } else {
                    objB = super.b(ho2Var, hc1Var);
                    if (objB == ne1Var) {
                        return objB;
                    }
                }
            }
        } else {
            objB = super.b(ho2Var, hc1Var);
            if (objB == ne1Var) {
                return objB;
            }
        }
        return f88.a;
    }

    @Override // o.ym0
    public final Object f(gt5 gt5Var, hc1 hc1Var) {
        Object objJ = j(new yp6(gt5Var), hc1Var);
        return objJ == ne1.m ? objJ : f88.a;
    }

    public Object j(ho2 ho2Var, hc1 hc1Var) {
        Object objB = this.p.b(ho2Var, hc1Var);
        return objB == ne1.m ? objB : f88.a;
    }

    @Override // o.ym0
    public final String toString() {
        return this.p + " -> " + super.toString();
    }
}
