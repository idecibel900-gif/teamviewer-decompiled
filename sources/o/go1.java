package o;

/* JADX INFO: loaded from: classes.dex */
public final class go1 implements hw2 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f909o;

    public /* synthetic */ go1(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f909o = obj2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        Object obj3 = this.f909o;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                return Boolean.valueOf(im3.n((fi1) obj, (xi0) obj4) && im3.n((fi1) obj2, (xi0) obj3));
            default:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((iw2) obj4).d(obj3, ux2Var, 0);
                } else {
                    ux2Var.Q();
                }
                return f88.a;
        }
    }
}
