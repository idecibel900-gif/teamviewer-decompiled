package o;

/* JADX INFO: loaded from: classes.dex */
public final class td1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nn5 f2102o;
    public final /* synthetic */ zp7 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td1(nn5 nn5Var, zp7 zp7Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2102o = nn5Var;
        this.p = zp7Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new td1(this.f2102o, this.p, hc1Var, (byte) 0);
            case 1:
                return new td1(this.f2102o, this.p, hc1Var, (byte) 1);
            default:
                return new td1(this.f2102o, this.p, hc1Var, (byte) 2);
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
        }
        return ((td1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        zp7 zp7Var = this.p;
        nn5 nn5Var = this.f2102o;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    this.n = true;
                    Object objJ = hm3.j(new k9(nn5Var, zp7Var, hc1Var, (byte) 5), this);
                    if (objJ != ne1Var) {
                        objJ = f88Var;
                    }
                    if (objJ == ne1Var) {
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
                    this.n = true;
                    Object objN = it1.n(nn5Var, new rs2(zp7Var, null), this);
                    if (objN != ne1Var) {
                        objN = f88Var;
                    }
                    if (objN == ne1Var) {
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
            default:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    this.n = true;
                    eg4 eg4Var = new eg4(zp7Var, (byte) 0);
                    fg4 fg4Var = new fg4(zp7Var, (byte) 0);
                    fg4 fg4Var2 = new fg4(zp7Var, (byte) 1);
                    gg4 gg4Var = new gg4(zp7Var, (byte) 0);
                    float f = z42.a;
                    Object objN2 = it1.n(nn5Var, new w42(new vr1((byte) 19), new b9(eg4Var, (byte) 7), gg4Var, fg4Var2, new a81(fg4Var, (byte) 13), null), this);
                    if (objN2 != ne1Var) {
                        objN2 = f88Var;
                    }
                    if (objN2 != ne1Var) {
                        objN2 = f88Var;
                    }
                    if (objN2 != ne1Var) {
                        objN2 = f88Var;
                    }
                    if (objN2 == ne1Var) {
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
        }
    }
}
