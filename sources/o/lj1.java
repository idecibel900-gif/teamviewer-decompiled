package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lj1 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ hw2 n;

    public /* synthetic */ lj1(hw2 hw2Var, byte b) {
        this.m = b;
        this.n = hw2Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        hw2 hw2Var = this.n;
        switch (b) {
            case 0:
                ((Integer) obj3).getClass();
                hw2Var.invoke((ux2) obj2, 0);
                break;
            case 1:
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var.Q();
                } else {
                    hw2Var.invoke(ux2Var, 0);
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    nm7.c(hw2Var, ux2Var2, 0);
                }
                break;
        }
        return f88Var;
    }
}
