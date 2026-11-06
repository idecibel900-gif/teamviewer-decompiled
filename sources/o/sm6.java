package o;

/* JADX INFO: loaded from: classes.dex */
public final class sm6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ bn6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z31 f2032o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm6(bn6 bn6Var, z31 z31Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = bn6Var;
        this.f2032o = z31Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        z31 z31Var = this.f2032o;
        bn6 bn6Var = this.n;
        switch (b) {
            case 0:
                return new sm6(bn6Var, z31Var, hc1Var, (byte) 0);
            default:
                return new sm6(bn6Var, z31Var, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((sm6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((sm6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        b41 b41Var = b41.m;
        z31 z31Var = this.f2032o;
        switch (b) {
            case 0:
                ct1.a0(obj);
                bn6 bn6Var = this.n;
                bn6Var.n.a(z31Var.d, z31Var.m, z31Var.j == b41Var, new ax1(0, bn6Var, bn6.class, "showNoConnectionMessage", "showNoConnectionMessage()V", 0, (byte) 25), new vl6(bn6Var, (byte) 1), bn6Var.H);
                break;
            default:
                ct1.a0(obj);
                bn6 bn6Var2 = this.n;
                f41 f41Var = bn6Var2.n;
                String str = z31Var.d;
                hs1 hs1Var = z31Var.m;
                f41Var.d(str, hs1Var, z31Var.j == b41Var, new ax1(0, bn6Var2, bn6.class, "showNoConnectionMessage", "showNoConnectionMessage()V", 0, (byte) 26), new vl6(bn6Var2, (byte) 2), bn6Var2.H);
                break;
        }
        return f88Var;
    }
}
