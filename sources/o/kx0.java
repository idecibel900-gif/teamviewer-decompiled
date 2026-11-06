package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kx0 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ pr7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yy0 f1312o;
    public final /* synthetic */ int p;

    public /* synthetic */ kx0(pr7 pr7Var, yy0 yy0Var, int i, byte b) {
        this.m = b;
        this.n = pr7Var;
        this.f1312o = yy0Var;
        this.p = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.p;
        yy0 yy0Var = this.f1312o;
        pr7 pr7Var = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                e8.c(pr7Var, yy0Var, ux2Var, yo1.Y(i | 1));
                break;
            default:
                iq8.f(pr7Var, yy0Var, ux2Var, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }
}
