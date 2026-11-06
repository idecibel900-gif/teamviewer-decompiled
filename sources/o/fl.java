package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fl implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yy0 f806o;
    public final /* synthetic */ int p;

    public /* synthetic */ fl(fs4 fs4Var, yy0 yy0Var, int i, byte b) {
        this.m = b;
        this.n = fs4Var;
        this.f806o = yy0Var;
        this.p = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.p;
        yy0 yy0Var = this.f806o;
        fs4 fs4Var = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                j51.p(fs4Var, yy0Var, ux2Var, yo1.Y(i | 1));
                break;
            case 1:
                j51.q(fs4Var, yy0Var, ux2Var, yo1.Y(i | 1));
                break;
            case 2:
                rl1.d(fs4Var, yy0Var, ux2Var, yo1.Y(i | 1));
                break;
            case 3:
                yo1.o(fs4Var, yy0Var, ux2Var, yo1.Y(i | 1));
                break;
            default:
                yo1.n(fs4Var, yy0Var, ux2Var, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }
}
