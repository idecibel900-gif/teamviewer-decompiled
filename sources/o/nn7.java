package o;

/* JADX INFO: loaded from: classes.dex */
public final class nn7 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ wr5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn7(wr5 wr5Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = wr5Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        wr5 wr5Var = this.n;
        switch (b) {
            case 0:
                return new nn7(wr5Var, hc1Var, (byte) 0);
            case 1:
                return new nn7(wr5Var, hc1Var, (byte) 1);
            case 2:
                return new nn7(wr5Var, hc1Var, (byte) 2);
            case 3:
                return new nn7(wr5Var, hc1Var, (byte) 3);
            case 4:
                return new nn7(wr5Var, hc1Var, (byte) 4);
            case 5:
                return new nn7(wr5Var, hc1Var, (byte) 5);
            case 6:
                return new nn7(wr5Var, hc1Var, (byte) 6);
            default:
                return new nn7(wr5Var, hc1Var, (byte) 7);
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
                ((nn7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 1:
                ((nn7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 2:
                ((nn7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 3:
                ((nn7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 4:
                ((nn7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 5:
                ((nn7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 6:
                ((nn7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((nn7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        wr5 wr5Var = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                wr5Var.a();
                break;
            case 1:
                ct1.a0(obj);
                wr5Var.b();
                break;
            case 2:
                ct1.a0(obj);
                wr5Var.b();
                break;
            case 3:
                ct1.a0(obj);
                wr5Var.a();
                break;
            case 4:
                ct1.a0(obj);
                wr5Var.b();
                break;
            case 5:
                ct1.a0(obj);
                wr5Var.b();
                break;
            case 6:
                ct1.a0(obj);
                wr5Var.a();
                break;
            default:
                ct1.a0(obj);
                wr5Var.b();
                break;
        }
        return f88Var;
    }
}
