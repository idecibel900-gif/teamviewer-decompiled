package o;

/* JADX INFO: loaded from: classes.dex */
public final class v44 extends og7 implements hw2 {
    public final /* synthetic */ w44 m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v44(w44 w44Var, int i, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = w44Var;
        this.n = i;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new v44(this.m, this.n, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        v44 v44Var = (v44) create((dk6) obj, (hc1) obj2);
        f88 f88Var = f88.a;
        v44Var.invokeSuspend(f88Var);
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        ct1.a0(obj);
        this.m.m(this.n, true);
        return f88.a;
    }
}
