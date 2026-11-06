package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dn3 implements zp0 {
    public static final dn3 b = new dn3(0);
    public static final dn3 c = new dn3(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ dn3(byte b2) {
        this.a = b2;
    }

    @Override // o.zp0
    public final String a(eo3 eo3Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return uf0.q(this, eo3Var);
    }

    @Override // o.zp0
    public final boolean b(eo3 eo3Var) {
        g07 g07VarO;
        switch (this.a) {
            case 0:
                qb8 qb8Var = (qb8) eo3Var.J().get(1);
                rk5 rk5Var = a96.c;
                qb8Var.getClass();
                int i = bp1.a;
                ps4 ps4VarD = zo1.d(qb8Var);
                ps4VarD.getClass();
                rk5Var.getClass();
                ns4 ns4VarQ = vs1.q(ps4VarD, s87.R);
                if (ns4VarQ == null) {
                    g07VarO = null;
                } else {
                    g48.n.getClass();
                    g48 g48Var = g48.f858o;
                    List parameters = ns4VarQ.q().getParameters();
                    parameters.getClass();
                    Object objF0 = lv0.F0(parameters);
                    objF0.getClass();
                    g07VarO = bt1.O(g48Var, ns4VarQ, qf0.K(new w87((d58) objF0)));
                }
                if (g07VarO == null) {
                    return false;
                }
                oz3 type = qb8Var.getType();
                type.getClass();
                return qz3.a.b(g07VarO, p58.h(type, false));
            default:
                List<qb8> listJ = eo3Var.J();
                listJ.getClass();
                if (!listJ.isEmpty()) {
                    for (qb8 qb8Var2 : listJ) {
                        qb8Var2.getClass();
                        if (bp1.a(qb8Var2) || qb8Var2.v != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // o.zp0
    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
