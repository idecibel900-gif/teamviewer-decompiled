package o;

/* JADX INFO: loaded from: classes.dex */
public final class jp2 implements go2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ go2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1188o;
    public final /* synthetic */ pw2 p;

    public /* synthetic */ jp2(go2 go2Var, Object obj, pw2 pw2Var, byte b) {
        this.m = b;
        this.n = go2Var;
        this.f1188o = obj;
        this.p = pw2Var;
    }

    @Override // o.go2
    public final Object b(ho2 ho2Var, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        pw2 pw2Var = this.p;
        Object obj = this.f1188o;
        go2 go2Var = this.n;
        switch (b) {
            case 0:
                Object objI = hm3.i(x00.t, hc1Var, ho2Var, new cp2(pw2Var, (hc1) null, (byte) 3), new go2[]{go2Var, (go2) obj});
                return objI == ne1Var ? objI : f88Var;
            default:
                Object objB = go2Var.b(new af(ho2Var, (ze6) obj, (yb8) pw2Var, (byte) 7), hc1Var);
                return objB == ne1Var ? objB : f88Var;
        }
    }
}
