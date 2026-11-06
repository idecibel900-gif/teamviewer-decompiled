package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p34 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ i44 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1701o;
    public final /* synthetic */ Object p;

    public /* synthetic */ p34(int i, Object obj, i44 i44Var) {
        this.n = i44Var;
        this.f1701o = i;
        this.p = obj;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.p;
        int i = this.f1701o;
        i44 i44Var = this.n;
        ux2 ux2Var = (ux2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    i44Var.a(i, obj3, ux2Var, 0);
                }
                break;
            default:
                num.getClass();
                i44Var.a(i, obj3, ux2Var, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ p34(i44 i44Var, int i, Object obj, int i2) {
        this.n = i44Var;
        this.f1701o = i;
        this.p = obj;
    }
}
