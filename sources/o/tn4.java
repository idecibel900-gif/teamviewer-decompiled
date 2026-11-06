package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tn4 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ h68 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yy0 f2126o;

    public /* synthetic */ tn4(h68 h68Var, yy0 yy0Var, byte b) {
        this.m = b;
        this.n = h68Var;
        this.f2126o = yy0Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        yy0 yy0Var = this.f2126o;
        h68 h68Var = this.n;
        byte b2 = 1;
        ux2 ux2Var = (ux2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    rp5.a(au8.O(-241536773, new tn4(h68Var, yy0Var, b2), ux2Var), ux2Var, 6);
                }
                break;
            default:
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    qs7.a(h68Var.j, yy0Var, ux2Var, 0);
                }
                break;
        }
        return f88Var;
    }
}
