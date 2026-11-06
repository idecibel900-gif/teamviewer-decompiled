package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z71 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f2677o;
    public final /* synthetic */ fs4 p;

    public /* synthetic */ z71(String str, String str2, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = str;
        this.f2677o = str2;
        this.p = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        fs4 fs4Var = this.p;
        String str = this.f2677o;
        String str2 = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qf0.j(yo1.Y(385), str2, str, ux2Var, fs4Var);
                break;
            default:
                xs1.o(yo1.Y(385), str2, str, ux2Var, fs4Var);
                break;
        }
        return f88Var;
    }
}
