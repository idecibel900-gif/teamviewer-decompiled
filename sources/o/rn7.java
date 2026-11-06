package o;

/* JADX INFO: loaded from: classes.dex */
public final class rn7 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ iw2 f1934o;
    public final /* synthetic */ wr5 p;
    public final /* synthetic */ in5 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rn7(iw2 iw2Var, wr5 wr5Var, in5 in5Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1934o = iw2Var;
        this.p = wr5Var;
        this.q = in5Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new rn7(this.f1934o, this.p, this.q, hc1Var, (byte) 0);
            default:
                return new rn7(this.f1934o, this.p, this.q, hc1Var, (byte) 1);
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
                break;
        }
        return ((rn7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        in5 in5Var = this.q;
        wr5 wr5Var = this.p;
        iw2 iw2Var = this.f1934o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    t65 t65Var = new t65(in5Var.c);
                    this.n = true;
                    return iw2Var.d(wr5Var, t65Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    t65 t65Var2 = new t65(in5Var.c);
                    this.n = true;
                    return iw2Var.d(wr5Var, t65Var2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z2) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
