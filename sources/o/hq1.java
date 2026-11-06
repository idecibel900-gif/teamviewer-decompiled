package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hq1 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f997o;
    public final /* synthetic */ boolean p;

    public /* synthetic */ hq1(int i, int i2, String str, boolean z) {
        this.n = str;
        this.f997o = i;
        this.p = z;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f997o;
        Object obj3 = this.n;
        boolean z = this.p;
        switch (b) {
            case 0:
                String str = (String) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    lq1.a(str, i, z, ux2Var, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                lq1.a((String) obj3, i, z, (ux2) obj, yo1.Y(1));
                break;
            case 2:
                String str2 = (String) obj3;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    td3.b(lv1.T(i, ux2Var2, 0), str2, null, rv0.b(z ? 1.0f : 0.38f, ((rn4) ux2Var2.j(un4.a)).a.q), ux2Var2, 8, 4);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                xo1.s(z, (hw2) obj3, (ux2) obj, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ hq1(int i, String str, boolean z) {
        this.f997o = i;
        this.n = str;
        this.p = z;
    }

    public /* synthetic */ hq1(String str, int i, boolean z) {
        this.n = str;
        this.f997o = i;
        this.p = z;
    }

    public /* synthetic */ hq1(boolean z, hw2 hw2Var, int i) {
        this.p = z;
        this.n = hw2Var;
        this.f997o = i;
    }
}
