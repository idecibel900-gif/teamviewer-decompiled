package o;

/* JADX INFO: loaded from: classes2.dex */
public final class iu3 extends u51 {
    public iu3(js0 js0Var, int i) {
        super(new gu3(new ns0(js0Var, i)));
    }

    @Override // o.u51
    public final oz3 a(ps4 ps4Var) {
        oz3 oz3VarC;
        ps4Var.getClass();
        g48.n.getClass();
        g48 g48Var = g48.f858o;
        wy3 wy3VarH = ps4Var.h();
        wy3VarH.getClass();
        ns4 ns4VarI = wy3VarH.i(s87.Q.g());
        Object obj = this.a;
        hu3 hu3Var = (hu3) obj;
        if (hu3Var instanceof fu3) {
            oz3VarC = ((fu3) obj).a;
        } else {
            if (!(hu3Var instanceof gu3)) {
                gk0.s();
                return null;
            }
            ns0 ns0Var = ((gu3) obj).a;
            js0 js0Var = ns0Var.a;
            int i = ns0Var.b;
            ns4 ns4VarQ = vs1.q(ps4Var, js0Var);
            if (ns4VarQ == null) {
                oz3VarC = hd2.c(gd2.p, js0Var.toString(), String.valueOf(i));
            } else {
                g07 g07VarW = ns4VarQ.W();
                g07VarW.getClass();
                m98 m98VarT = n37.t(g07VarW);
                for (int i2 = 0; i2 < i; i2++) {
                    m98VarT = ps4Var.h().g(m98VarT);
                }
                oz3VarC = m98VarT;
            }
        }
        return bt1.O(g48Var, ns4VarI, qf0.K(new w87(oz3VarC)));
    }
}
