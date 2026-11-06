package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ws3 extends zu1 {
    public final bu5 d;
    public final qv5 e;
    public final dt3 f;
    public final ty4 g;
    public final d22 h;
    public final String i;

    /* JADX WARN: Code duplicated, block: B:25:0x00c6  */
    public ws3(bu5 bu5Var, qv5 qv5Var, dt3 dt3Var, ty4 ty4Var, d22 d22Var) {
        String string;
        String string2;
        ty4Var.getClass();
        this.d = bu5Var;
        this.e = qv5Var;
        this.f = dt3Var;
        this.g = ty4Var;
        this.h = d22Var;
        if ((dt3Var.n & 4) == 4) {
            string2 = ty4Var.getString(dt3Var.q.f453o).concat(ty4Var.getString(dt3Var.q.p));
        } else {
            dg2 dg2Var = kt3.a;
            ns3 ns3VarB = kt3.b(qv5Var, ty4Var, d22Var, true);
            if (ns3VarB == null) {
                hk0.q(bu5Var, "No field signature for property: ");
                throw null;
            }
            String str = ns3VarB.e;
            String str2 = ns3VarB.f;
            StringBuilder sb = new StringBuilder(sr3.a(str));
            fi1 fi1VarI = bu5Var.i();
            fi1VarI.getClass();
            if (im3.n(bu5Var.e(), dp1.d) && (fi1VarI instanceof pp1)) {
                tu5 tu5Var = ((pp1) fi1VarI).q;
                my2 my2Var = jt3.i;
                my2Var.getClass();
                Integer num = (Integer) it1.C(tu5Var, my2Var);
                string = "$".concat(uy4.a.d(num != null ? ty4Var.getString(num.intValue()) : "main", "_"));
            } else if (im3.n(bu5Var.e(), dp1.a) && (fi1VarI instanceof ad5)) {
                rp1 rp1Var = ((cq1) bu5Var).Q;
                if (rp1Var instanceof rs3) {
                    rs3 rs3Var = (rs3) rp1Var;
                    if (rs3Var.n != null) {
                        StringBuilder sb2 = new StringBuilder("$");
                        String strD = rs3Var.m.d();
                        strD.getClass();
                        sb2.append(sy4.e(ub7.q0('/', strD, strD)).b());
                        string = sb2.toString();
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
            } else {
                string = "";
            }
            sb.append(string);
            sb.append("()");
            sb.append(str2);
            string2 = sb.toString();
        }
        this.i = string2;
    }

    @Override // o.zu1
    public final String m() {
        return this.i;
    }
}
