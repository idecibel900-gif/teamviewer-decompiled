package o;

/* JADX INFO: loaded from: classes.dex */
public interface al7 {
    default ud5 a(ux2 ux2Var) {
        ud5 ud5VarT;
        ux2Var.W(-1447872386);
        if (this instanceof zk7) {
            ux2Var.W(922459780);
            ud5VarT = re3.a(((zk7) this).a, ux2Var);
            ux2Var.p(false);
        } else {
            if (!(this instanceof yk7)) {
                throw fx3.m(922458265, ux2Var, false);
            }
            ux2Var.W(922461994);
            ud5VarT = lv1.T(((yk7) this).a, ux2Var, 0);
            ux2Var.p(false);
        }
        ux2Var.p(false);
        return ud5VarT;
    }
}
