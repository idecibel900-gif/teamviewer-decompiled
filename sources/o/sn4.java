package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn4 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ zv0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ tx6 f2034o;
    public final /* synthetic */ h68 p;
    public final /* synthetic */ yy0 q;

    public /* synthetic */ sn4(zv0 zv0Var, tx6 tx6Var, h68 h68Var, yy0 yy0Var) {
        this.n = zv0Var;
        this.f2034o = tx6Var;
        this.p = h68Var;
        this.q = yy0Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                un4.b(this.n, this.f2034o, this.p, this.q, (ux2) obj, yo1.Y(1));
                break;
            default:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    un4.b(this.n, this.f2034o, this.p, this.q, ux2Var, 0);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ sn4(zv0 zv0Var, tx6 tx6Var, h68 h68Var, yy0 yy0Var, int i) {
        this.n = zv0Var;
        this.f2034o = tx6Var;
        this.p = h68Var;
        this.q = yy0Var;
    }
}
