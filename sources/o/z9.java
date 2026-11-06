package o;

/* JADX INFO: loaded from: classes.dex */
public final class z9 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ sq2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9(sq2 sq2Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = sq2Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new z9(this.n, hc1Var, (byte) 0);
            case 1:
                return new z9(this.n, hc1Var, (byte) 1);
            case 2:
                return new z9(this.n, hc1Var, (byte) 2);
            default:
                return new z9(this.n, hc1Var, (byte) 3);
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
                ((z9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 1:
                ((z9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 2:
                ((z9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((z9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        sq2 sq2Var = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                sq2.a(sq2Var);
                break;
            case 1:
                ct1.a0(obj);
                sq2.a(sq2Var);
                break;
            case 2:
                ct1.a0(obj);
                sq2.a(sq2Var);
                break;
            default:
                ct1.a0(obj);
                sq2.a(sq2Var);
                break;
        }
        return f88Var;
    }
}
