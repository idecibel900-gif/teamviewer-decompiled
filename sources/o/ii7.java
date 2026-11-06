package o;

/* JADX INFO: loaded from: classes.dex */
public final class ii7 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ pn5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii7(pn5 pn5Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = pn5Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        pn5 pn5Var = this.n;
        switch (b) {
            case 0:
                return new ii7(pn5Var, hc1Var, (byte) 0);
            default:
                return new ii7(pn5Var, hc1Var, (byte) 1);
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
                ((ii7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((ii7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        pn5 pn5Var = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                pn5Var.z();
                break;
            default:
                ct1.a0(obj);
                pn5Var.z();
                break;
        }
        return f88Var;
    }
}
