package o;

/* JADX INFO: loaded from: classes.dex */
public final class o91 extends jc1 {
    public String m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1643o;
    public final /* synthetic */ xc0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o91(xc0 xc0Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = xc0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1643o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objK = this.p.K(null, this);
        return objK == ne1.m ? objK : new tc6(objK);
    }
}
