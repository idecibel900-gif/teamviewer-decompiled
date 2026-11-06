package o;

/* JADX INFO: loaded from: classes.dex */
public final class vr6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xr6 f2339o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr6(xr6 xr6Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2339o = xr6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        xr6 xr6Var = this.f2339o;
        switch (b) {
            case 0:
                return new vr6(xr6Var, hc1Var, (byte) 0);
            default:
                return new vr6(xr6Var, hc1Var, (byte) 1);
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
        return ((vr6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objG0;
        byte b = this.m;
        xr6 xr6Var = this.f2339o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    fm fmVar = (fm) xr6Var.n.n;
                    yi yiVar = new yi(xr6Var, (byte) 11);
                    this.n = true;
                    if (fmVar.b(yiVar, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            default:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    a65 a65Var = xr6Var.v;
                    this.n = true;
                    objG0 = a65Var.G0(this);
                    if (objG0 == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objG0 = ((tc6) obj).m;
                }
                return new tc6(objG0);
        }
    }
}
