package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v35 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f2271o;
    public final /* synthetic */ String p;
    public final /* synthetic */ int q;

    public /* synthetic */ v35(String str, String str2, fs4 fs4Var, int i) {
        this.n = str;
        this.p = str2;
        this.f2271o = fs4Var;
        this.q = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.q;
        String str = this.p;
        fs4 fs4Var = this.f2271o;
        String str2 = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                xo1.p(yo1.Y(i | 1), str2, str, ux2Var, fs4Var);
                break;
            default:
                n37.d(yo1.Y(i | 1), str2, str, ux2Var, fs4Var);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ v35(String str, fs4 fs4Var, String str2, int i) {
        this.n = str;
        this.f2271o = fs4Var;
        this.p = str2;
        this.q = i;
    }
}
