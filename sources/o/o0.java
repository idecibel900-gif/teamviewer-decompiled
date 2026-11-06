package o;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ p0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = p0Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        p0 p0Var = this.n;
        switch (b) {
            case 0:
                return new o0(p0Var, hc1Var, (byte) 0);
            default:
                return new o0(p0Var, hc1Var, (byte) 1);
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
                ((o0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((o0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        hc1 hc1Var = null;
        p0 p0Var = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                if (p0Var.P == null) {
                    j63 j63Var = new j63();
                    mw4 mw4Var = p0Var.C;
                    if (mw4Var != null) {
                        im3.R(p0Var.I0(), null, null, new h0((Object) mw4Var, (Object) j63Var, hc1Var, (byte) 0), 3);
                    }
                    p0Var.P = j63Var;
                }
                break;
            default:
                ct1.a0(obj);
                j63 j63Var2 = p0Var.P;
                if (j63Var2 != null) {
                    k63 k63Var = new k63(j63Var2);
                    mw4 mw4Var2 = p0Var.C;
                    if (mw4Var2 != null) {
                        im3.R(p0Var.I0(), null, null, new h0((Object) mw4Var2, (Object) k63Var, hc1Var, (byte) 1), 3);
                    }
                    p0Var.P = null;
                }
                break;
        }
        return f88Var;
    }
}
