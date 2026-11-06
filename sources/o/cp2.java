package o;

/* JADX INFO: loaded from: classes.dex */
public final class cp2 extends og7 implements iw2 {
    public final /* synthetic */ byte m;
    public ho2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f549o;
    public /* synthetic */ ho2 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ pw2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp2(hc1 hc1Var, pw2 pw2Var, byte b) {
        super(3, hc1Var);
        this.m = b;
        this.r = pw2Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        pw2 pw2Var = this.r;
        ho2 ho2Var = (ho2) obj;
        switch (b) {
            case 0:
                cp2 cp2Var = new cp2(pw2Var, (hc1) obj3, (byte) 0);
                cp2Var.p = ho2Var;
                cp2Var.q = obj2;
                return cp2Var.invokeSuspend(f88Var);
            case 1:
                cp2 cp2Var2 = new cp2((hc1) obj3, pw2Var, (byte) 1);
                cp2Var2.p = ho2Var;
                cp2Var2.q = (Object[]) obj2;
                return cp2Var2.invokeSuspend(f88Var);
            case 2:
                cp2 cp2Var3 = new cp2((hc1) obj3, pw2Var, (byte) 2);
                cp2Var3.p = ho2Var;
                cp2Var3.q = (Object[]) obj2;
                return cp2Var3.invokeSuspend(f88Var);
            default:
                cp2 cp2Var4 = new cp2(pw2Var, (hc1) obj3, (byte) 3);
                cp2Var4.p = ho2Var;
                cp2Var4.q = (Object[]) obj2;
                return cp2Var4.invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        Object objI;
        Object objN;
        Object objD;
        byte b = this.m;
        f88 f88Var = f88.a;
        pw2 pw2Var = this.r;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                ho2 ho2Var = this.p;
                Object obj2 = this.q;
                byte b2 = this.f549o;
                if (b2 == 0) {
                    ct1.a0(obj);
                    this.p = null;
                    this.q = null;
                    this.n = ho2Var;
                    this.f549o = (byte) 1;
                    objInvoke = ((hw2) pw2Var).invoke(obj2, this);
                    if (objInvoke != ne1Var) {
                    }
                    return ne1Var;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ho2Var = this.n;
                ct1.a0(obj);
                objInvoke = obj;
                this.p = null;
                this.q = null;
                this.n = null;
                this.f549o = (byte) 2;
                if (ho2Var.c(objInvoke, this) != ne1Var) {
                    return f88Var;
                }
                return ne1Var;
            case 1:
                ho2 ho2Var2 = this.p;
                Object[] objArr = (Object[]) this.q;
                byte b3 = this.f549o;
                if (b3 == 0) {
                    ct1.a0(obj);
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    this.p = null;
                    this.q = null;
                    this.n = ho2Var2;
                    this.f549o = (byte) 1;
                    objI = ((z13) pw2Var).i(obj3, obj4, obj5, this);
                    if (objI != ne1Var) {
                    }
                    return ne1Var;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ho2Var2 = this.n;
                ct1.a0(obj);
                objI = obj;
                this.p = null;
                this.q = null;
                this.n = null;
                this.f549o = (byte) 2;
                if (ho2Var2.c(objI, this) != ne1Var) {
                    return f88Var;
                }
                return ne1Var;
            case 2:
                ho2 ho2Var3 = this.p;
                Object[] objArr2 = (Object[]) this.q;
                byte b4 = this.f549o;
                if (b4 == 0) {
                    ct1.a0(obj);
                    kw2 kw2Var = (kw2) pw2Var;
                    Object obj6 = objArr2[0];
                    Object obj7 = objArr2[1];
                    Object obj8 = objArr2[2];
                    Object obj9 = objArr2[3];
                    this.p = null;
                    this.q = null;
                    this.n = ho2Var3;
                    this.f549o = (byte) 1;
                    objN = kw2Var.n(obj6, obj7, obj8, obj9, this);
                    if (objN != ne1Var) {
                    }
                    return ne1Var;
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ho2Var3 = this.n;
                ct1.a0(obj);
                objN = obj;
                this.p = null;
                this.q = null;
                this.n = null;
                this.f549o = (byte) 2;
                if (ho2Var3.c(objN, this) != ne1Var) {
                    return f88Var;
                }
                return ne1Var;
            default:
                ho2 ho2Var4 = this.p;
                Object[] objArr3 = (Object[]) this.q;
                byte b5 = this.f549o;
                if (b5 == 0) {
                    ct1.a0(obj);
                    Object obj10 = objArr3[0];
                    Object obj11 = objArr3[1];
                    this.p = null;
                    this.q = null;
                    this.n = ho2Var4;
                    this.f549o = (byte) 1;
                    objD = ((iw2) pw2Var).d(obj10, obj11, this);
                    if (objD != ne1Var) {
                    }
                    return ne1Var;
                }
                if (b5 != 1) {
                    if (b5 == 2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ho2Var4 = this.n;
                ct1.a0(obj);
                objD = obj;
                this.p = null;
                this.q = null;
                this.n = null;
                this.f549o = (byte) 2;
                if (ho2Var4.c(objD, this) != ne1Var) {
                    return f88Var;
                }
                return ne1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp2(pw2 pw2Var, hc1 hc1Var, byte b) {
        super(3, hc1Var);
        this.m = b;
        this.r = pw2Var;
    }
}
