package o;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class np2 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yy0 n;

    public /* synthetic */ np2(yy0 yy0Var, byte b) {
        this.m = b;
        this.n = yy0Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        yy0 yy0Var = this.n;
        ux2 ux2Var = (ux2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    yy0Var.d(sp2.a, ux2Var, 6);
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                if (!ux2Var.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    long jY = d82.y();
                    FillElement fillElement = androidx.compose.foundation.layout.b.a;
                    fs4 fs4VarM = androidx.compose.foundation.layout.b.m(cs4.b, a42.b(jY), a42.a(jY));
                    do4 do4VarC = ua0.c(xz2.s, false);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarM);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    yy0Var.invoke(ux2Var, 0);
                    ux2Var.p(true);
                }
                break;
            case 2:
                num.getClass();
                et1.e(yy0Var, ux2Var, yo1.Y(7));
                break;
            case 3:
                num.getClass();
                bt1.d(yy0Var, ux2Var, yo1.Y(7));
                break;
            case 4:
                num.getClass();
                rp5.a(yy0Var, ux2Var, yo1.Y(7));
                break;
            default:
                num.getClass();
                ut7.a(yy0Var, ux2Var, yo1.Y(49));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ np2(yy0 yy0Var, int i, byte b) {
        this.m = b;
        this.n = yy0Var;
    }
}
