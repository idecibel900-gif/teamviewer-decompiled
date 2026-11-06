package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd6 implements q32 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ td6 n;

    public /* synthetic */ pd6(td6 td6Var, byte b) {
        this.m = b;
        this.n = td6Var;
    }

    @Override // o.q32
    public final double e(double d) {
        byte b = this.m;
        td6 td6Var = this.n;
        switch (b) {
            case 0:
                return ct1.t(td6Var.k.e(d), td6Var.e, td6Var.f);
            default:
                return td6Var.n.e(ct1.t(d, td6Var.e, td6Var.f));
        }
    }
}
