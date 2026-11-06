package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y71 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2584o;

    public /* synthetic */ y71(int i, String str) {
        this.n = i;
        this.f2584o = str;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.n;
        Object obj3 = this.f2584o;
        switch (b) {
            case 0:
                String str = (String) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    td3.b(lv1.T(i, ux2Var, 0), str, null, ((rn4) ux2Var.j(un4.a)).a.q, ux2Var, 8, 4);
                }
                break;
            case 1:
                i44 i44Var = (i44) obj3;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    am3 am3VarF = i44Var.b.a.f(i);
                    ((yy0) am3VarF.c.p).i(i44Var.c, Integer.valueOf(i - am3VarF.a), ux2Var2, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                r47.f((ge7) obj3, cs4.b, (ux2) obj, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ y71(i44 i44Var, int i) {
        this.f2584o = i44Var;
        this.n = i;
    }

    public /* synthetic */ y71(ge7 ge7Var, int i) {
        this.f2584o = ge7Var;
        this.n = i;
    }
}
