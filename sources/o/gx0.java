package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gx0 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f930o;

    public /* synthetic */ gx0(int i, String str, fs4 fs4Var) {
        this.m = (byte) 3;
        this.f930o = fs4Var;
        this.n = str;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        fs4 fs4Var = this.f930o;
        String str = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                vn4.T(yo1.Y(49), str, ux2Var, fs4Var);
                break;
            case 1:
                qf0.n(yo1.Y(1), str, ux2Var, fs4Var);
                break;
            case 2:
                ct1.d(yo1.Y(1), str, ux2Var, fs4Var);
                break;
            case 3:
                us1.d(yo1.Y(1), str, ux2Var, fs4Var);
                break;
            case 4:
                wo1.e(yo1.Y(49), str, ux2Var, fs4Var);
                break;
            case 5:
                et1.m(yo1.Y(1), str, ux2Var, fs4Var);
                break;
            case 6:
                it1.g(yo1.Y(1), str, ux2Var, fs4Var);
                break;
            case 7:
                lv1.A(yo1.Y(1), str, ux2Var, fs4Var);
                break;
            default:
                xs1.k(yo1.Y(1), str, ux2Var, fs4Var);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ gx0(String str, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = str;
        this.f930o = fs4Var;
    }
}
