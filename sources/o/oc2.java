package o;

/* JADX INFO: loaded from: classes2.dex */
public final class oc2 extends u51 {
    public final js0 b;
    public final sy4 c;

    public oc2(js0 js0Var, sy4 sy4Var) {
        super(new vd5(js0Var, sy4Var));
        this.b = js0Var;
        this.c = sy4Var;
    }

    @Override // o.u51
    public final oz3 a(ps4 ps4Var) {
        g07 g07VarW;
        ps4Var.getClass();
        js0 js0Var = this.b;
        ns4 ns4VarQ = vs1.q(ps4Var, js0Var);
        if (ns4VarQ != null) {
            int i = zo1.a;
            if (!zo1.n(ns4VarQ, ms0.f1501o)) {
                ns4VarQ = null;
            }
            if (ns4VarQ != null && (g07VarW = ns4VarQ.W()) != null) {
                return g07VarW;
            }
        }
        return hd2.c(gd2.M, js0Var.toString(), this.c.m);
    }

    @Override // o.u51
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
