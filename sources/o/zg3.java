package o;

/* JADX INFO: loaded from: classes.dex */
public final class zg3 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ah3 f2698o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg3(ah3 ah3Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2698o = ah3Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        ah3 ah3Var = this.f2698o;
        switch (b) {
            case 0:
                return new zg3(ah3Var, hc1Var, (byte) 0);
            case 1:
                return new zg3(ah3Var, hc1Var, (byte) 1);
            case 2:
                return new zg3(ah3Var, hc1Var, (byte) 2);
            default:
                return new zg3(ah3Var, hc1Var, (byte) 3);
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
        }
        return ((zg3) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        ah3 ah3Var = this.f2698o;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    km kmVar = ah3Var.J;
                    if (kmVar != null) {
                        cq7 cq7VarE = ah3Var.I;
                        if (cq7VarE == null) {
                            cq7VarE = jk0.e(((rn4) xk0.q(ah3Var, un4.a)).a, (jt7) xk0.q(ah3Var, kt7.a));
                        }
                        rv0 rv0Var = new rv0(cq7VarE.d(ah3Var.C, false, ah3Var.G));
                        jo joVarK = ah3Var.C ? xs1.K(((rn4) xk0.q(ah3Var, un4.a)).d, du4.p) : db8.z0();
                        this.n = true;
                        obj = km.a(kmVar, rv0Var, joVarK, null, null, this, 12);
                        if (obj == ne1Var) {
                            return ne1Var;
                        }
                    }
                    return f88Var;
                }
                if (!z) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                return f88Var;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    km kmVar2 = ah3Var.L;
                    w32 w32Var = new w32((ah3Var.G && ah3Var.C) ? ah3Var.E : ah3Var.F);
                    jo joVarK2 = ah3Var.C ? xs1.K(((rn4) xk0.q(ah3Var, un4.a)).d, du4.n) : db8.z0();
                    this.n = true;
                    if (km.a(kmVar2, w32Var, joVarK2, null, null, this, 12) == ne1Var) {
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
                    this.n = true;
                    ah3Var.Y0(this);
                    return ne1Var;
                }
                if (z3) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    this.n = true;
                    ah3Var.Y0(this);
                    return ne1Var;
                }
                if (z4) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
