package o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s74 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ f74 n;

    public /* synthetic */ s74(f74 f74Var) {
        this.n = f74Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        f74 f74Var = this.n;
        ux2 ux2Var = (ux2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    yo1.b(f74Var, ux2Var, 0);
                }
                break;
            default:
                num.getClass();
                yo1.b(f74Var, ux2Var, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ s74(f74 f74Var, int i) {
        this.n = f74Var;
    }
}
