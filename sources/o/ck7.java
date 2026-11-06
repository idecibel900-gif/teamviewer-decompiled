package o;

/* JADX INFO: loaded from: classes.dex */
public final class ck7 extends oe8 implements cd3 {
    public final xt6 n;

    public ck7(xt6 xt6Var) {
        this.n = xt6Var;
    }

    @Override // o.cd3
    public final nw4 g() {
        hr2 hr2Var;
        ps6 ps6Var = ((zt6) this.n).d;
        if (ps6Var == null) {
            ye4.c("SessionManager", "getSessionInfoForCurrentSession: No session running.");
            hr2Var = null;
        } else {
            hr2Var = ps6Var.h;
        }
        return new nw4(hr2Var != null ? hr2Var.n : "");
    }
}
