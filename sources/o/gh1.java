package o;

/* JADX INFO: loaded from: classes.dex */
public final class gh1 extends og7 implements iw2 {
    public final /* synthetic */ byte m = 1;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f892o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh1(vh1 vh1Var, hc1 hc1Var) {
        super(3, hc1Var);
        this.f892o = vh1Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return new gh1((vh1) this.f892o, (hc1) obj3).invokeSuspend(f88Var);
            default:
                ((Boolean) obj2).getClass();
                gh1 gh1Var = new gh1(3, (hc1) obj3);
                gh1Var.f892o = (nj2) obj;
                return gh1Var.invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    vh1 vh1Var = (vh1) this.f892o;
                    this.n = true;
                    if (vh1Var.b(this) == ne1Var) {
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
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                nj2 nj2Var = (nj2) this.f892o;
                this.n = true;
                nj2Var.getClass();
                Object objA = nj2.a(nj2Var, this);
                return objA == ne1Var ? ne1Var : objA;
        }
    }

    public /* synthetic */ gh1(int i, hc1 hc1Var) {
        super(i, hc1Var);
    }
}
