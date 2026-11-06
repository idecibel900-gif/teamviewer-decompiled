package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ al7 n;

    public /* synthetic */ tk7(al7 al7Var, byte b) {
        this.m = b;
        this.n = al7Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        al7 al7Var = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    td3.b(al7Var.a(ux2Var), null, null, 0L, ux2Var, 8, 12);
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    td3.b(al7Var.a(ux2Var2), null, null, 0L, ux2Var2, 8, 12);
                }
                break;
        }
        return f88Var;
    }
}
