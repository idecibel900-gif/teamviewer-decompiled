package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ec implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f701o;

    public /* synthetic */ ec(boolean z, int i, byte b) {
        this.m = b;
        this.n = z;
        this.f701o = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f701o;
        boolean z = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                ga0.a(yo1.Y(i | 1), ux2Var, z);
                break;
            case 1:
                ga0.a(yo1.Y(i | 1), ux2Var, z);
                break;
            case 2:
                et1.c(yo1.Y(i | 1), ux2Var, z);
                break;
            default:
                et1.c(yo1.Y(i | 1), ux2Var, z);
                break;
        }
        return f88Var;
    }
}
