package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f06 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ q37 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f756o;

    public /* synthetic */ f06(q37 q37Var, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = q37Var;
        this.f756o = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        fs4 fs4Var = this.f756o;
        q37 q37Var = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qs1.t(q37Var, fs4Var, ux2Var, yo1.Y(7));
                break;
            default:
                us1.j(q37Var, fs4Var, ux2Var, yo1.Y(7));
                break;
        }
        return f88Var;
    }
}
