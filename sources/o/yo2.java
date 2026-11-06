package o;

/* JADX INFO: loaded from: classes.dex */
public final class yo2 implements go2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ go2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hw2 f2627o;

    public /* synthetic */ yo2(go2 go2Var, hw2 hw2Var, byte b) {
        this.m = b;
        this.n = go2Var;
        this.f2627o = hw2Var;
    }

    @Override // o.go2
    public final Object b(ho2 ho2Var, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        hw2 hw2Var = this.f2627o;
        go2 go2Var = this.n;
        switch (b) {
            case 0:
                Object objB = go2Var.b(new af(new g76(), ho2Var, hw2Var, (byte) 6), hc1Var);
                return objB == ne1Var ? objB : f88Var;
            default:
                Object objB2 = go2Var.b(new q5(ho2Var, hw2Var, (byte) 3), hc1Var);
                return objB2 == ne1Var ? objB2 : f88Var;
        }
    }
}
