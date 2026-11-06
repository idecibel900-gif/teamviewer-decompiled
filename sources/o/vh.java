package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vh implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f2312o;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vh(fs4 fs4Var, int i, int i2) {
        this.m = (byte) 0;
        this.f2312o = fs4Var;
        this.n = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        fs4 fs4Var = this.f2312o;
        boolean z = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                yh.b(fs4Var, ux2Var, yo1.Y(1), z ? 1 : 0);
                break;
            case 1:
                vn4.U(z, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 2:
                vn4.Q(z, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 3:
                im3.e(z, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 4:
                xs1.d(z, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 5:
                qs1.s(z, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 6:
                y57.e(z, fs4Var, ux2Var, yo1.Y(1));
                break;
            default:
                m77.m(z, fs4Var, ux2Var, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ vh(boolean z, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = z;
        this.f2312o = fs4Var;
    }
}
