package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x06 extends k58 {
    public static final po3 c;
    public static final po3 d;
    public final lh7 b = new lh7(new rk5((byte) 3));

    static {
        n58 n58Var = n58.n;
        c = po3.a(lq1.I(n58Var, false, null, 5), so3.f2039o, false, null, null, 61);
        d = po3.a(lq1.I(n58Var, false, null, 5), so3.n, false, null, null, 61);
    }

    @Override // o.k58
    public final h58 d(oz3 oz3Var) {
        return new w87(h(oz3Var, new po3(n58.n, false, false, null, 62)));
    }

    public final vd5 g(g07 g07Var, ns4 ns4Var, po3 po3Var) {
        if (g07Var.o0().getParameters().isEmpty()) {
            return new vd5(g07Var, Boolean.FALSE);
        }
        if (wy3.y(g07Var)) {
            h58 h58Var = (h58) g07Var.m0().get(0);
            ub8 ub8VarA = h58Var.a();
            oz3 oz3VarB = h58Var.b();
            oz3VarB.getClass();
            return new vd5(bt1.P(qf0.K(new w87(h(oz3VarB, po3Var), ub8VarA)), g07Var.n0(), g07Var.o0(), g07Var.p0()), Boolean.FALSE);
        }
        if (ct1.K(g07Var)) {
            return new vd5(hd2.c(gd2.z, g07Var.o0().toString()), Boolean.FALSE);
        }
        zo4 zo4VarJ0 = ns4Var.j0(this);
        zo4VarJ0.getClass();
        g48 g48VarN0 = g07Var.n0();
        k48 k48VarQ = ns4Var.q();
        k48VarQ.getClass();
        List<d58> parameters = ns4Var.q().getParameters();
        parameters.getClass();
        ArrayList arrayList = new ArrayList(mv0.Z(parameters, 10));
        for (d58 d58Var : parameters) {
            d58Var.getClass();
            lh7 lh7Var = this.b;
            arrayList.add(rk5.d(d58Var, po3Var, lh7Var, lh7Var.q(d58Var, po3Var)));
        }
        return new vd5(bt1.R(g48VarN0, k48VarQ, arrayList, g07Var.p0(), zo4VarJ0, new t(ns4Var, this, g07Var, po3Var)), Boolean.TRUE);
    }

    public final oz3 h(oz3 oz3Var, po3 po3Var) {
        ys0 ys0VarA = oz3Var.o0().a();
        if (ys0VarA instanceof d58) {
            po3Var.getClass();
            return h(this.b.q((d58) ys0VarA, po3.a(po3Var, null, true, null, null, 59)), po3Var);
        }
        if (!(ys0VarA instanceof ns4)) {
            hk0.f(ys0VarA, "Unexpected declaration kind: ");
            return null;
        }
        ys0 ys0VarA2 = bt1.V(oz3Var).o0().a();
        if (ys0VarA2 instanceof ns4) {
            vd5 vd5VarG = g(bt1.I(oz3Var), (ns4) ys0VarA, c);
            g07 g07Var = (g07) vd5VarG.m;
            boolean zBooleanValue = ((Boolean) vd5VarG.n).booleanValue();
            vd5 vd5VarG2 = g(bt1.V(oz3Var), (ns4) ys0VarA2, d);
            g07 g07Var2 = (g07) vd5VarG2.m;
            return (zBooleanValue || ((Boolean) vd5VarG2.n).booleanValue()) ? new y06(g07Var, g07Var2) : bt1.v(g07Var, g07Var2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + ys0VarA2 + "\" while for lower it's \"" + ys0VarA + '\"').toString());
    }
}
