package o;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rd implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yy0 f1914o;

    public /* synthetic */ rd(float f, yy0 yy0Var) {
        this.n = f;
        this.f1914o = yy0Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        yy0 yy0Var = this.f1914o;
        float f = this.n;
        ux2 ux2Var = (ux2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                yd.b(f, yy0Var, ux2Var, yo1.Y(391));
                break;
            default:
                int iIntValue = num.intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    fs4 fs4VarA = androidx.compose.foundation.layout.b.a(cs4.b, f, 56.0f);
                    do4 do4VarC = ua0.c(xz2.s, false);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
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
        }
        return f88Var;
    }

    public /* synthetic */ rd(float f, yy0 yy0Var, int i) {
        this.n = f;
        this.f1914o = yy0Var;
    }
}
