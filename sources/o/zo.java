package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zo {
    public static final vd5 a;

    static {
        ea2 ea2Var = ea2.m;
        a = new vd5(ea2Var, ea2Var);
    }

    public static final void a(xo xoVar, List list, ux2 ux2Var, int i) {
        ux2Var.Y(-1794596951);
        int i2 = (i & 6) == 0 ? (ux2Var.f(xoVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(list) ? 32 : 16;
        }
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                wo woVar = (wo) list.get(i3);
                iw2 iw2Var = (iw2) woVar.a;
                int i4 = woVar.b;
                int i5 = woVar.c;
                Object objK = ux2Var.K();
                if (objK == e01.a) {
                    objK = ei.d;
                    ux2Var.g0(objK);
                }
                do4 do4Var = (do4) objK;
                int iHashCode = Long.hashCode(ux2Var.T);
                yj5 yj5VarL = ux2Var.l();
                fs4 fs4VarS = uf0.s(ux2Var, cs4.b);
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4Var, d82.v, ux2Var);
                o67.n(yj5VarL, d82.u, ux2Var);
                o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS, d82.t, ux2Var);
                iw2Var.d(xoVar.subSequence(i4, i5).n, ux2Var, 0);
                ux2Var.p(true);
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa(xoVar, list, i);
        }
    }
}
