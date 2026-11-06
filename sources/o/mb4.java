package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mb4 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ hw2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hw2 f1457o;
    public final /* synthetic */ yy0 p;
    public final /* synthetic */ hw2 q;
    public final /* synthetic */ hw2 r;

    public /* synthetic */ mb4(yy0 yy0Var, yy0 yy0Var2, yy0 yy0Var3, yy0 yy0Var4, yy0 yy0Var5) {
        this.n = yy0Var;
        this.f1457o = yy0Var2;
        this.p = yy0Var3;
        this.q = yy0Var4;
        this.r = yy0Var5;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    pb4.b(this.n, this.f1457o, this.p, this.q, this.r, ux2Var, 384);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                pb4.b(this.n, this.f1457o, this.p, this.q, this.r, (ux2) obj, yo1.Y(385));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ mb4(hw2 hw2Var, hw2 hw2Var2, yy0 yy0Var, hw2 hw2Var3, hw2 hw2Var4, int i) {
        this.n = hw2Var;
        this.f1457o = hw2Var2;
        this.p = yy0Var;
        this.q = hw2Var3;
        this.r = hw2Var4;
    }
}
