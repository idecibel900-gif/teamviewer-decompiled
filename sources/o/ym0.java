package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ym0 implements nx2 {
    public final de1 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final df0 f2622o;

    public ym0(de1 de1Var, int i, df0 df0Var) {
        this.m = de1Var;
        this.n = i;
        this.f2622o = df0Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // o.nx2
    public final go2 a(de1 de1Var, int i, df0 df0Var) {
        de1 de1Var2 = this.m;
        de1 de1VarH0 = de1Var.H0(de1Var2);
        df0 df0Var2 = df0.m;
        df0 df0Var3 = this.f2622o;
        int i2 = this.n;
        if (df0Var == df0Var2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            df0Var = df0Var3;
        }
        return (im3.n(de1VarH0, de1Var2) && i == i2 && df0Var == df0Var3) ? this : g(de1VarH0, i, df0Var);
    }

    @Override // o.go2
    public Object b(ho2 ho2Var, hc1 hc1Var) {
        Object objJ = hm3.j(new j0(ho2Var, this, null, (byte) 13), hc1Var);
        return objJ == ne1.m ? objJ : f88.a;
    }

    public String e() {
        return null;
    }

    public abstract Object f(gt5 gt5Var, hc1 hc1Var);

    public abstract ym0 g(de1 de1Var, int i, df0 df0Var);

    public go2 h() {
        return null;
    }

    public wm0 i(me1 me1Var) {
        int i = this.n;
        if (i == -3) {
            i = -2;
        }
        hw2 h0Var = new h0(this, null, (byte) 17);
        gt5 gt5Var = new gt5(j51.M(me1Var, this.m), ka0.d(i, 4, this.f2622o));
        gt5Var.e0(pe1.f1729o, gt5Var, h0Var);
        return gt5Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strE = e();
        if (strE != null) {
            arrayList.add(strE);
        }
        ba2 ba2Var = ba2.m;
        de1 de1Var = this.m;
        if (de1Var != ba2Var) {
            arrayList.add("context=" + de1Var);
        }
        int i = this.n;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        df0 df0Var = df0.m;
        df0 df0Var2 = this.f2622o;
        if (df0Var2 != df0Var) {
            arrayList.add("onBufferOverflow=" + df0Var2);
        }
        return getClass().getSimpleName() + '[' + lv0.t0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
