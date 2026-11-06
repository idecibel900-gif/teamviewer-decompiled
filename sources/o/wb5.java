package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb5 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2396o;
    public final /* synthetic */ mw4 p;
    public final /* synthetic */ cq7 q;
    public final /* synthetic */ pw6 r;

    public /* synthetic */ wb5(boolean z, boolean z2, mw4 mw4Var, cq7 cq7Var, pw6 pw6Var, byte b) {
        this.m = b;
        this.n = z;
        this.f2396o = z2;
        this.p = mw4Var;
        this.q = cq7Var;
        this.r = pw6Var;
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
                    yl7.F.b(this.n, this.f2396o, this.p, null, this.q, this.r, 0.0f, 0.0f, ux2Var, 100663296, 200);
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    yl7.F.b(this.n, this.f2396o, this.p, null, this.q, this.r, 0.0f, 0.0f, ux2Var2, 100663296, 200);
                }
                break;
        }
        return f88Var;
    }
}
