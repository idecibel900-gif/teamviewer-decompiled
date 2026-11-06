package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xd7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ge7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f2508o;
    public final /* synthetic */ int p;

    public /* synthetic */ xd7(ge7 ge7Var, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = ge7Var;
        this.f2508o = fs4Var;
        this.p = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.p;
        fs4 fs4Var = this.f2508o;
        ge7 ge7Var = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                r47.f(ge7Var, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            default:
                r47.c(ge7Var, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }
}
