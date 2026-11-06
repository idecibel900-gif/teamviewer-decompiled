package o;

/* JADX INFO: loaded from: classes.dex */
public final class if3 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ jf3 f1055o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if3(boolean z, jf3 jf3Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 3;
        this.n = z;
        this.f1055o = jf3Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        jf3 jf3Var = this.f1055o;
        switch (b) {
            case 0:
                return new if3(jf3Var, hc1Var, (byte) 0);
            case 1:
                return new if3(jf3Var, hc1Var, (byte) 1);
            case 2:
                return new if3(jf3Var, hc1Var, (byte) 2);
            default:
                return new if3(this.n, jf3Var, hc1Var);
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
                return ((if3) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 1:
                return ((if3) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 2:
                return ((if3) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            default:
                ((if3) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        jf3 jf3Var = this.f1055o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    yx6 yx6Var = jf3Var.r;
                    Boolean bool = Boolean.TRUE;
                    this.n = true;
                    if (yx6Var.c(bool, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    yx6 yx6Var2 = jf3Var.x;
                    Boolean bool2 = Boolean.TRUE;
                    this.n = true;
                    if (yx6Var2.c(bool2, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 2:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    yx6 yx6Var3 = jf3Var.x;
                    Boolean bool3 = Boolean.TRUE;
                    this.n = true;
                    if (yx6Var3.c(bool3, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            default:
                ct1.a0(obj);
                if (this.n) {
                    jf3Var.V0();
                }
                return f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ if3(jf3 jf3Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1055o = jf3Var;
    }
}
