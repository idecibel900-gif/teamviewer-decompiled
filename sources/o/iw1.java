package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iw1 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ sb0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f1110o;
    public final /* synthetic */ int p;

    public /* synthetic */ iw1(sb0 sb0Var, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = sb0Var;
        this.f1110o = fs4Var;
        this.p = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.p;
        fs4 fs4Var = this.f1110o;
        sb0 sb0Var = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                kw1.a(sb0Var, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            case 1:
                kw1.e(sb0Var, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            default:
                kw1.h(sb0Var, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }
}
