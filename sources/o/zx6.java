package o;

/* JADX INFO: loaded from: classes2.dex */
public final class zx6 extends x2 {
    public long a;
    public gl0 b;

    @Override // o.x2
    public final boolean a(w2 w2Var) {
        yx6 yx6Var = (yx6) w2Var;
        if (this.a >= 0) {
            return false;
        }
        long j = yx6Var.u;
        if (j < yx6Var.v) {
            yx6Var.v = j;
        }
        this.a = j;
        return true;
    }

    @Override // o.x2
    public final hc1[] b(w2 w2Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((yx6) w2Var).w(j);
    }
}
