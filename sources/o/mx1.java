package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mx1 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ nx1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ov1 f1522o;

    public /* synthetic */ mx1(nx1 nx1Var, ov1 ov1Var) {
        this.n = nx1Var;
        this.f1522o = ov1Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ov1 ov1Var = this.f1522o;
        nx1 nx1Var = this.n;
        ux2 ux2Var = (ux2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    nx1Var.A0(ov1Var, ux2Var, 0);
                }
                break;
            default:
                num.getClass();
                nx1Var.A0(ov1Var, ux2Var, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ mx1(nx1 nx1Var, ov1 ov1Var, int i) {
        this.n = nx1Var;
        this.f1522o = ov1Var;
    }
}
