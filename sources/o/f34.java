package o;

/* JADX INFO: loaded from: classes.dex */
public final class f34 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i34 f765o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f34(i34 i34Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f765o = i34Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        i34 i34Var = this.f765o;
        switch (b) {
            case 0:
                return new f34(i34Var, hc1Var, (byte) 0);
            case 1:
                return new f34(i34Var, hc1Var, (byte) 1);
            case 2:
                return new f34(i34Var, hc1Var, (byte) 2);
            case 3:
                return new f34(i34Var, hc1Var, (byte) 3);
            default:
                return new f34(i34Var, hc1Var, (byte) 4);
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
        return ((f34) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        i34 i34Var = this.f765o;
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
                km kmVar = i34Var.q;
                Float f = new Float(1.0f);
                this.n = true;
                return kmVar.e(f, this) == ne1Var ? ne1Var : f88Var;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    km kmVar2 = i34Var.p;
                    vk3 vk3Var = new vk3(0L);
                    this.n = true;
                    if (kmVar2.e(vk3Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                i34Var.d(0L);
                i34Var.h.setValue(Boolean.FALSE);
                return f88Var;
            case 2:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    km kmVar3 = i34Var.p;
                    this.n = true;
                    return kmVar3.f(this) == ne1Var ? ne1Var : f88Var;
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
                    km kmVar4 = i34Var.q;
                    this.n = true;
                    return kmVar4.f(this) == ne1Var ? ne1Var : f88Var;
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
                    km kmVar5 = i34Var.q;
                    this.n = true;
                    return kmVar5.f(this) == ne1Var ? ne1Var : f88Var;
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
