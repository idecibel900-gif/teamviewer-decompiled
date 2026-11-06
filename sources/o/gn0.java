package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class gn0 extends ym0 {
    public final Iterable p;

    public gn0(Iterable iterable, de1 de1Var, int i, df0 df0Var) {
        super(de1Var, i, df0Var);
        this.p = iterable;
    }

    @Override // o.ym0
    public final Object f(gt5 gt5Var, hc1 hc1Var) {
        yp6 yp6Var = new yp6(gt5Var);
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            im3.R(gt5Var, null, null, new h0((go2) it.next(), yp6Var, (hc1) null, (byte) 19), 3);
        }
        return f88.a;
    }

    @Override // o.ym0
    public final ym0 g(de1 de1Var, int i, df0 df0Var) {
        return new gn0(this.p, de1Var, i, df0Var);
    }

    @Override // o.ym0
    public final wm0 i(me1 me1Var) {
        hw2 h0Var = new h0(this, null, (byte) 17);
        gt5 gt5Var = new gt5(j51.M(me1Var, this.m), ka0.d(this.n, 4, df0.m));
        gt5Var.e0(pe1.m, gt5Var, h0Var);
        return gt5Var;
    }
}
