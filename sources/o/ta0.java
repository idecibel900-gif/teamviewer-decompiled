package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta0 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2095o;

    public /* synthetic */ ta0(fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = fs4Var;
        this.f2095o = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f2095o;
        fs4 fs4Var = this.n;
        ux2 ux2Var = (ux2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.intValue();
                ua0.a(fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            case 1:
                num.getClass();
                vs1.b(fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            case 2:
                num.getClass();
                zu1.b(fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            default:
                num.getClass();
                vt1.d(fs4Var, ux2Var, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }
}
