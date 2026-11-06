package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hq7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hw2 f998o;

    public /* synthetic */ hq7(long j, hw2 hw2Var, int i) {
        this.m = (byte) 2;
        this.n = j;
        this.f998o = hw2Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        hw2 hw2Var = this.f998o;
        long j = this.n;
        ux2 ux2Var = (ux2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    m77.e(j, hw2Var, ux2Var, 0);
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                if (!ux2Var.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    m77.e(j, hw2Var, ux2Var, 0);
                }
                break;
            default:
                num.getClass();
                m77.e(j, hw2Var, ux2Var, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ hq7(long j, hw2 hw2Var, byte b) {
        this.m = b;
        this.n = j;
        this.f998o = hw2Var;
    }
}
