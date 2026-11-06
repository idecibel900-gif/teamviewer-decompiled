package o;

/* JADX INFO: loaded from: classes.dex */
public final class fa1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w44 f780o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa1(w44 w44Var, int i, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f780o = w44Var;
        this.p = i;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        int i = this.p;
        w44 w44Var = this.f780o;
        switch (b) {
            case 0:
                return new fa1(w44Var, i, hc1Var, (byte) 0);
            case 1:
                return new fa1(w44Var, i, hc1Var, (byte) 1);
            case 2:
                return new fa1(w44Var, i, hc1Var, (byte) 2);
            case 3:
                return new fa1(w44Var, i, hc1Var, (byte) 3);
            default:
                return new fa1(w44Var, i, hc1Var, (byte) 4);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((fa1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.p;
        w44 w44Var = this.f780o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    this.n = true;
                    a65 a65Var = w44.y;
                    return w44Var.f(i, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    this.n = true;
                    a65 a65Var2 = w44.y;
                    return w44Var.f(i, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z2) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    this.n = true;
                    a65 a65Var3 = w44.y;
                    return w44Var.f(i, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z3) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    this.n = true;
                    a65 a65Var4 = w44.y;
                    return w44Var.f(i, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z4) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z5 = this.n;
                if (!z5) {
                    ct1.a0(obj);
                    this.n = true;
                    a65 a65Var5 = w44.y;
                    return w44Var.f(i, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z5) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
