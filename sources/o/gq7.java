package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gq7 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ i97 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ cq7 f914o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ u18 t;
    public final /* synthetic */ ot7 u;
    public final /* synthetic */ ot7 v;
    public final /* synthetic */ iw2 w;

    public /* synthetic */ gq7(i97 i97Var, cq7 cq7Var, boolean z, boolean z2, boolean z3, boolean z4, u18 u18Var, ot7 ot7Var, ot7 ot7Var2, iw2 iw2Var, int i) {
        this.n = i97Var;
        this.f914o = cq7Var;
        this.p = z;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = u18Var;
        this.u = ot7Var;
        this.v = ot7Var2;
        this.w = iw2Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    m77.c(this.n, this.f914o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, ux2Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                m77.c(this.n, this.f914o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, (ux2) obj, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ gq7(q18 q18Var, cq7 cq7Var, boolean z, boolean z2, boolean z3, boolean z4, u18 u18Var, ot7 ot7Var, ot7 ot7Var2, iw2 iw2Var) {
        this.n = q18Var;
        this.f914o = cq7Var;
        this.p = z;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = u18Var;
        this.u = ot7Var;
        this.v = ot7Var2;
        this.w = iw2Var;
    }
}
