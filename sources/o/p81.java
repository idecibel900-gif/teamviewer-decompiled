package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p81 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ sb0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f1712o;
    public final /* synthetic */ qf6 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ byte r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p81(sb0 sb0Var, fs4 fs4Var, qf6 qf6Var, int i, int i2, byte b) {
        this.m = b;
        this.n = sb0Var;
        this.f1712o = fs4Var;
        this.p = qf6Var;
        this.q = i;
        this.r = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                q81.f(this.n, this.f1712o, this.p, (ux2) obj, iY, this.r);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                jt6.e(this.n, this.f1712o, this.p, (ux2) obj, iY2, this.r);
                break;
        }
        return f88Var;
    }
}
