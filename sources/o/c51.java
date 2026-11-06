package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c51 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ sb0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f489o;

    public /* synthetic */ c51(sb0 sb0Var, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = sb0Var;
        this.f489o = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        fs4 fs4Var = this.f489o;
        sb0 sb0Var = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                au8.i(sb0Var, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 1:
                au8.h(sb0Var, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 2:
                q81.b(sb0Var, fs4Var, ux2Var, yo1.Y(49));
                break;
            default:
                jt6.d(sb0Var, fs4Var, ux2Var, yo1.Y(1));
                break;
        }
        return f88Var;
    }
}
