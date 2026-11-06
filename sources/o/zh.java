package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hw2 f2700o;

    public /* synthetic */ zh(fs4 fs4Var, hw2 hw2Var, int i, byte b) {
        this.m = b;
        this.n = fs4Var;
        this.f2700o = hw2Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        hw2 hw2Var = this.f2700o;
        fs4 fs4Var = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                g68.d(fs4Var, hw2Var, ux2Var, yo1.Y(1));
                break;
            default:
                uy6.a(fs4Var, hw2Var, ux2Var, yo1.Y(1));
                break;
        }
        return f88Var;
    }
}
