package o;

/* JADX INFO: loaded from: classes.dex */
public final class h91 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ iw7 f959o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h91(iw7 iw7Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f959o = iw7Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        iw7 iw7Var = this.f959o;
        switch (b) {
            case 0:
                h91 h91Var = new h91(iw7Var, hc1Var, (byte) 0);
                h91Var.n = obj;
                return h91Var;
            default:
                h91 h91Var2 = new h91(iw7Var, hc1Var, (byte) 1);
                h91Var2.n = obj;
                return h91Var2;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        vd5 vd5Var = (vd5) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((h91) create(vd5Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((h91) create(vd5Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = 11;
        iw7 iw7Var = this.f959o;
        vd5 vd5Var = (vd5) this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                boolean zBooleanValue = ((Boolean) vd5Var.m).booleanValue();
                boolean zBooleanValue2 = ((Boolean) vd5Var.n).booleanValue();
                if (!zBooleanValue && zBooleanValue2) {
                    iw7Var.a(new yr7(b2));
                }
                break;
            default:
                ct1.a0(obj);
                boolean zBooleanValue3 = ((Boolean) vd5Var.m).booleanValue();
                boolean zBooleanValue4 = ((Boolean) vd5Var.n).booleanValue();
                if (!zBooleanValue3 && zBooleanValue4) {
                    iw7Var.a(new yr7(b2));
                }
                break;
        }
        return f88Var;
    }
}
