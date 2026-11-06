package o;

/* JADX INFO: loaded from: classes.dex */
public final class g23 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j23 f849o;
    public final /* synthetic */ iw7 p;
    public final /* synthetic */ r13 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g23(j23 j23Var, iw7 iw7Var, r13 r13Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f849o = j23Var;
        this.p = iw7Var;
        this.q = r13Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                g23 g23Var = new g23(this.f849o, this.p, this.q, hc1Var, (byte) 0);
                g23Var.n = obj;
                return g23Var;
            default:
                g23 g23Var2 = new g23(this.f849o, this.p, this.q, hc1Var, (byte) 1);
                g23Var2.n = obj;
                return g23Var2;
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
                ((g23) create(vd5Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            default:
                return ((g23) create(vd5Var, hc1Var)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        r13 r13Var = this.q;
        iw7 iw7Var = this.p;
        j23 j23Var = this.f849o;
        vd5 vd5Var = (vd5) this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                boolean zBooleanValue = ((Boolean) vd5Var.m).booleanValue();
                boolean zBooleanValue2 = ((Boolean) vd5Var.n).booleanValue();
                if (!zBooleanValue && zBooleanValue2 && j23Var.w == iw7Var && im3.n(j23Var.t, r13Var)) {
                    j23.j(iw7Var);
                }
                return f88.a;
            default:
                ct1.a0(obj);
                return Boolean.valueOf((j23Var.w == iw7Var && im3.n(j23Var.t, r13Var) && (((Boolean) vd5Var.m).booleanValue() || ((Boolean) vd5Var.n).booleanValue())) ? false : true);
        }
    }
}
