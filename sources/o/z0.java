package o;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j97 f2657o;
    public final /* synthetic */ a1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(j97 j97Var, a1 a1Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2657o = j97Var;
        this.p = a1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        a1 a1Var = this.p;
        j97 j97Var = this.f2657o;
        switch (b) {
            case 0:
                return new z0(j97Var, a1Var, hc1Var, (byte) 0);
            case 1:
                return new z0(j97Var, a1Var, hc1Var, (byte) 1);
            default:
                return new z0(j97Var, a1Var, hc1Var, (byte) 2);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((z0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 1:
                ((z0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((z0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return ne1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        a1 a1Var = this.p;
        j97 j97Var = this.f2657o;
        ne1 ne1Var = ne1.m;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                x0 x0Var = new x0(a1Var, b2);
                this.n = true;
                if (j97Var.b(x0Var, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            case 1:
                boolean z2 = this.n;
                if (z2) {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                x0 x0Var2 = new x0(a1Var, (byte) 2);
                this.n = true;
                if (j97Var.b(x0Var2, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            default:
                boolean z3 = this.n;
                if (z3) {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                x0 x0Var3 = new x0(a1Var, (byte) 3);
                this.n = true;
                if (j97Var.b(x0Var3, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
        }
    }
}
