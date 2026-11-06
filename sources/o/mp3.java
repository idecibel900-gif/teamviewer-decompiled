package o;

/* JADX INFO: loaded from: classes2.dex */
public final class mp3 extends jp3 {
    public final op3 q;
    public final np3 r;
    public final qq0 s;
    public final Object t;

    public mp3(op3 op3Var, np3 np3Var, qq0 qq0Var, Object obj) {
        this.q = op3Var;
        this.r = np3Var;
        this.s = qq0Var;
        this.t = obj;
    }

    @Override // o.jp3
    public final boolean m() {
        return false;
    }

    @Override // o.jp3
    public final void n(Throwable th) {
        qq0 qq0Var = this.s;
        qq0 qq0VarQ = op3.Q(qq0Var);
        op3 op3Var = this.q;
        np3 np3Var = this.r;
        Object obj = this.t;
        if (qq0VarQ == null || !op3Var.Z(np3Var, qq0VarQ, obj)) {
            np3Var.m.c(new wa4(2), 2);
            qq0 qq0VarQ2 = op3.Q(qq0Var);
            if (qq0VarQ2 == null || !op3Var.Z(np3Var, qq0VarQ2, obj)) {
                op3Var.c(op3Var.y(np3Var, obj));
            }
        }
    }
}
