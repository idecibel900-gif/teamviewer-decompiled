package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ii6 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hw2 f1065o;
    public final /* synthetic */ yy0 p;
    public final /* synthetic */ hw2 q;
    public final /* synthetic */ hw2 r;
    public final /* synthetic */ hw2 s;
    public final /* synthetic */ qj8 t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ii6(int i, hw2 hw2Var, yy0 yy0Var, hw2 hw2Var2, hw2 hw2Var3, zx4 zx4Var, hw2 hw2Var4) {
        this.n = i;
        this.f1065o = hw2Var;
        this.p = yy0Var;
        this.q = hw2Var2;
        this.r = hw2Var3;
        this.t = zx4Var;
        this.s = hw2Var4;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                zx4 zx4Var = (zx4) this.t;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    nv1.h(this.n, this.f1065o, this.p, this.q, this.r, zx4Var, this.s, ux2Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                nv1.h(this.n, this.f1065o, this.p, this.q, this.r, this.t, this.s, (ux2) obj, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ii6(int i, hw2 hw2Var, yy0 yy0Var, hw2 hw2Var2, hw2 hw2Var3, qj8 qj8Var, hw2 hw2Var4, int i2) {
        this.n = i;
        this.f1065o = hw2Var;
        this.p = yy0Var;
        this.q = hw2Var2;
        this.r = hw2Var3;
        this.t = qj8Var;
        this.s = hw2Var4;
    }
}
