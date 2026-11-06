package o;

/* JADX INFO: loaded from: classes.dex */
public final class lk4 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nk4 f1372o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk4(nk4 nk4Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1372o = nk4Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        nk4 nk4Var = this.f1372o;
        switch (b) {
            case 0:
                return new lk4(nk4Var, hc1Var, (byte) 0);
            default:
                return new lk4(nk4Var, hc1Var, (byte) 1);
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
        return ((lk4) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        nk4 nk4Var = this.f1372o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var = nk4Var.R;
                Boolean bool = Boolean.TRUE;
                this.n = true;
                return yx6Var.c(bool, this) == ne1Var ? ne1Var : f88Var;
            default:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var2 = nk4Var.S;
                Boolean bool2 = Boolean.TRUE;
                this.n = true;
                return yx6Var2.c(bool2, this) == ne1Var ? ne1Var : f88Var;
        }
    }
}
