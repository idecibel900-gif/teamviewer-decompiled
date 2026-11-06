package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na2 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1557o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ na2(int i, String str, String str2, fs4 fs4Var, int i2) {
        this.n = i;
        this.p = str;
        this.q = str2;
        this.r = fs4Var;
        this.f1557o = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f1557o;
        Object obj3 = this.r;
        Object obj4 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                int i2 = this.n;
                io1.f(i2, (String) this.p, (String) obj4, (fs4) obj3, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                Object obj5 = this.p;
                int i3 = this.n;
                xs1.j(obj5, i3, (u34) obj4, (yy0) obj3, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ na2(Object obj, int i, u34 u34Var, yy0 yy0Var, int i2) {
        this.p = obj;
        this.n = i;
        this.q = u34Var;
        this.r = yy0Var;
        this.f1557o = i2;
    }
}
