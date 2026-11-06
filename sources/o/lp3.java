package o;

/* JADX INFO: loaded from: classes2.dex */
public final class lp3 extends gl0 {
    public final op3 u;

    public lp3(hc1 hc1Var, op3 op3Var) {
        super(1, hc1Var);
        this.u = op3Var;
    }

    @Override // o.gl0
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // o.gl0
    public final Throwable p(op3 op3Var) {
        Throwable thB;
        Object objE = this.u.E();
        if (!(objE instanceof np3) || (thB = ((np3) objE).b()) == null) {
            return objE instanceof xx0 ? ((xx0) objE).a : op3Var.z();
        }
        return thB;
    }
}
