package o;

/* JADX INFO: loaded from: classes.dex */
public final class ip7 implements fp7 {
    public final long m;
    public final /* synthetic */ jp7 n;

    public ip7(jp7 jp7Var, long j) {
        this.n = jp7Var;
        this.m = j;
    }

    @Override // o.fp7
    public final ep7 P() {
        return o67.e(this.n);
    }

    @Override // o.fp7
    public final v56 X(i04 i04Var) {
        return qs1.v(c0(i04Var), 0L);
    }

    @Override // o.fp7
    public final long c0(i04 i04Var) {
        i04 i04Var2 = (i04) this.n.D.getValue();
        if (i04Var2 != null) {
            if (i04Var2.m()) {
                return i04Var.N(i04Var2.A(this.m));
            }
            return 0L;
        }
        ni3.d("Tried to open context menu before the anchor was placed.");
        hk0.b();
        return 0L;
    }
}
