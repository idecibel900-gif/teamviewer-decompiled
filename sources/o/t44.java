package o;

/* JADX INFO: loaded from: classes.dex */
public final class t44 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w44 f2081o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t44(w44 w44Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2081o = w44Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new t44(this.f2081o, hc1Var, (byte) 0);
            default:
                return new t44(this.f2081o, hc1Var, (byte) 1);
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
        return ((t44) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        w44 w44Var = this.f2081o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    l5 l5Var = new l5(2, null, (byte) 12);
                    this.n = true;
                    return w44Var.e(ay4.m, l5Var, this) == ne1Var ? ne1Var : f88Var;
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
                    this.n = true;
                    a65 a65Var = w44.y;
                    return w44Var.f(0, this) == ne1Var ? ne1Var : f88Var;
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
