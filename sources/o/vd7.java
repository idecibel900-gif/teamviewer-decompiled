package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vd7 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ge7 n;

    public /* synthetic */ vd7(ge7 ge7Var, byte b) {
        this.m = b;
        this.n = ge7Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ge7 ge7Var = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var.Q();
                } else {
                    qs7.b(m77.z(ge7Var.g.intValue(), ux2Var), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(un4.a)).b.m, ux2Var, 0, 0, 131070);
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bo) obj).getClass();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    kw0 kw0VarA = iw0.a(new ew(16.0f, new hk0((byte) 2)), xz2.A, ux2Var2, 6);
                    int iHashCode = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL = ux2Var2.l();
                    cs4 cs4Var = cs4.b;
                    fs4 fs4VarS = uf0.s(ux2Var2, cs4Var);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(LayoutNode.e0);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var2);
                    o67.n(yj5VarL, d82.u, ux2Var2);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                    o67.l(ux2Var2);
                    o67.n(fs4VarS, d82.t, ux2Var2);
                    ux2Var2.W(-667631725);
                    Iterator it = ge7Var.f.iterator();
                    while (it.hasNext()) {
                        r47.b((rd7) it.next(), androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), ux2Var2, 48);
                    }
                    ux2Var2.p(false);
                    ux2Var2.p(true);
                }
                break;
        }
        return f88Var;
    }
}
