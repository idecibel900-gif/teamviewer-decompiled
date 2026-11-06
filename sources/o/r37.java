package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r37 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ hw2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yy0 f1890o;
    public final /* synthetic */ hw2 p;
    public final /* synthetic */ ot7 q;
    public final /* synthetic */ long r;
    public final /* synthetic */ long s;

    public /* synthetic */ r37(yy0 yy0Var, hw2 hw2Var, hw2 hw2Var2, ot7 ot7Var, long j, long j2, int i) {
        this.f1890o = yy0Var;
        this.n = hw2Var;
        this.p = hw2Var2;
        this.q = ot7Var;
        this.r = j;
        this.s = j2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                x37.a(this.f1890o, this.n, this.p, this.q, this.r, this.s, (ux2) obj, yo1.Y(1));
                break;
            default:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    ux2Var.W(-168956728);
                    ux2Var.W(-942207887);
                    x37.a(this.f1890o, this.n, this.p, this.q, this.r, this.s, ux2Var, 0);
                    ux2Var.p(false);
                    ux2Var.p(false);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ r37(hw2 hw2Var, yy0 yy0Var, hw2 hw2Var2, ot7 ot7Var, long j, long j2) {
        this.n = hw2Var;
        this.f1890o = yy0Var;
        this.p = hw2Var2;
        this.q = ot7Var;
        this.r = j;
        this.s = j2;
    }
}
