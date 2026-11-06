package o;

/* JADX INFO: loaded from: classes.dex */
public final class b50 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k08 f393o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b50(k08 k08Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f393o = k08Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        k08 k08Var = this.f393o;
        switch (b) {
            case 0:
                return new b50(k08Var, hc1Var, (byte) 0);
            case 1:
                b50 b50Var = new b50(k08Var, hc1Var, (byte) 1);
                b50Var.n = ((Boolean) obj).booleanValue();
                return b50Var;
            default:
                return new b50(k08Var, hc1Var, (byte) 2);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((b50) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((b50) create(bool, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            default:
                return ((b50) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        k08 k08Var = this.f393o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    this.n = true;
                    if (k08Var.c(ay4.m, this) == ne1Var) {
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
                ct1.a0(obj);
                if (!this.n) {
                    k08Var.a();
                }
                return f88Var;
            default:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    this.n = true;
                    if (k08Var.c(ay4.n, this) == ne1Var) {
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
        }
    }
}
