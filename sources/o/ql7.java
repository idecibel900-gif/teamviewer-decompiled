package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ql7 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f1844o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ Object q;

    public /* synthetic */ ql7(String str, hi7 hi7Var, long j, fs4 fs4Var, int i) {
        this.n = str;
        this.q = hi7Var;
        this.f1844o = j;
        this.p = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                n67.b((nl7) obj3, this.f1844o, this.p, this.n, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                m77.h(this.n, (hi7) obj3, this.f1844o, this.p, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ ql7(nl7 nl7Var, long j, fs4 fs4Var, String str, int i) {
        this.q = nl7Var;
        this.f1844o = j;
        this.p = fs4Var;
        this.n = str;
    }
}
