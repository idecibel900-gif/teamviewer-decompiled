package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o81 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ sb0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1640o;

    public /* synthetic */ o81(sb0 sb0Var, int i, byte b) {
        this.m = b;
        this.n = sb0Var;
        this.f1640o = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f1640o;
        sb0 sb0Var = this.n;
        ux2 ux2Var = (ux2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                q81.a(sb0Var, ux2Var, yo1.Y(i | 1));
                break;
            case 1:
                num.getClass();
                q81.c(sb0Var, ux2Var, yo1.Y(i | 1));
                break;
            case 2:
                num.getClass();
                q81.d(sb0Var, ux2Var, yo1.Y(i | 1));
                break;
            case 3:
                num.getClass();
                q81.g(sb0Var, ux2Var, yo1.Y(i | 1));
                break;
            case 4:
                num.getClass();
                q81.e(sb0Var, ux2Var, yo1.Y(i | 1));
                break;
            case 5:
                num.intValue();
                kw1.d(sb0Var, ux2Var, yo1.Y(i | 1));
                break;
            case 6:
                num.getClass();
                jt6.b(sb0Var, ux2Var, yo1.Y(i | 1));
                break;
            case 7:
                num.getClass();
                jt6.c(sb0Var, ux2Var, yo1.Y(i | 1));
                break;
            default:
                num.getClass();
                jt6.a(sb0Var, ux2Var, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }
}
