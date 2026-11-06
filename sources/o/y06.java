package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y06 extends um2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y06(g07 g07Var, g07 g07Var2) {
        super(g07Var, g07Var2);
        g07Var.getClass();
        g07Var2.getClass();
        qz3.a.b(g07Var, g07Var2);
    }

    public static final ArrayList x0(qo1 qo1Var, oz3 oz3Var) throws IOException {
        List<h58> listM0 = oz3Var.m0();
        ArrayList arrayList = new ArrayList(mv0.Z(listM0, 10));
        for (h58 h58Var : listM0) {
            h58Var.getClass();
            StringBuilder sb = new StringBuilder();
            lv0.s0(qf0.K(h58Var), sb, ", ", null, null, new po1(qo1Var, (byte) 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String y0(String str, String str2) {
        if (!ub7.R(str, '<')) {
            return str;
        }
        return ub7.r0(str, '<') + '<' + str2 + '>' + ub7.q0('>', str, str);
    }

    @Override // o.um2, o.oz3
    public final zo4 I() {
        ys0 ys0VarA = o0().a();
        ns4 ns4Var = ys0VarA instanceof ns4 ? (ns4) ys0VarA : null;
        if (ns4Var == null) {
            yq4.u(o0().a(), "Incorrect classifier: ");
            return null;
        }
        zo4 zo4VarJ0 = ns4Var.j0(new x06());
        zo4VarJ0.getClass();
        return zo4VarJ0;
    }

    @Override // o.oz3
    public final oz3 q0(uz3 uz3Var) {
        g07 g07Var = this.n;
        g07Var.getClass();
        g07 g07Var2 = this.f2226o;
        g07Var2.getClass();
        return new y06(g07Var, g07Var2);
    }

    @Override // o.m98
    public final m98 s0(boolean z) {
        return new y06(this.n.s0(z), this.f2226o.s0(z));
    }

    @Override // o.m98
    /* JADX INFO: renamed from: t0 */
    public final m98 q0(uz3 uz3Var) {
        g07 g07Var = this.n;
        g07Var.getClass();
        g07 g07Var2 = this.f2226o;
        g07Var2.getClass();
        return new y06(g07Var, g07Var2);
    }

    @Override // o.m98
    public final m98 u0(g48 g48Var) {
        g48Var.getClass();
        return new y06(this.n.u0(g48Var), this.f2226o.u0(g48Var));
    }

    @Override // o.um2
    public final g07 v0() {
        return this.n;
    }

    @Override // o.um2
    public final String w0(qo1 qo1Var, qo1 qo1Var2) throws IOException {
        g07 g07Var = this.n;
        String strX = qo1Var.X(g07Var);
        g07 g07Var2 = this.f2226o;
        String strX2 = qo1Var.X(g07Var2);
        if (qo1Var2.a.o()) {
            return "raw (" + strX + ".." + strX2 + ')';
        }
        if (g07Var2.m0().isEmpty()) {
            return qo1Var.E(strX, strX2, n37.m(this));
        }
        ArrayList arrayListX0 = x0(qo1Var, g07Var);
        ArrayList arrayListX1 = x0(qo1Var, g07Var2);
        String strT0 = lv0.t0(arrayListX0, ", ", null, null, e24.x, 30);
        ArrayList arrayListV0 = lv0.V0(arrayListX0, arrayListX1);
        if (!arrayListV0.isEmpty()) {
            Iterator it = arrayListV0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strX2 = y0(strX2, strT0);
                    break;
                }
                vd5 vd5Var = (vd5) it.next();
                String str = (String) vd5Var.m;
                String str2 = (String) vd5Var.n;
                if (!im3.n(str, ub7.i0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strX2 = y0(strX2, strT0);
            break;
        }
        String strY0 = y0(strX, strT0);
        return strY0.equals(strX2) ? strY0 : qo1Var.E(strY0, strX2, n37.m(this));
    }
}
