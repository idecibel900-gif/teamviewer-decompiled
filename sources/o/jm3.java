package o;

/* JADX INFO: loaded from: classes.dex */
public final class jm3 extends qc6 {
    public byte m;
    public final /* synthetic */ hw2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hc1 f1182o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm3(hc1 hc1Var, hc1 hc1Var2, hw2 hw2Var) {
        super(hc1Var);
        this.n = hw2Var;
        this.f1182o = hc1Var2;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        if (b != 0) {
            if (b != 1) {
                hk0.l("This coroutine had already completed");
                return null;
            }
            this.m = (byte) 2;
            ct1.a0(obj);
            return obj;
        }
        this.m = (byte) 1;
        ct1.a0(obj);
        hw2 hw2Var = this.n;
        hw2Var.getClass();
        e8.i(2, hw2Var);
        return hw2Var.invoke(this.f1182o, this);
    }
}
