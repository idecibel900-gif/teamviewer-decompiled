package o;

/* JADX INFO: loaded from: classes.dex */
public final class q91 extends jc1 {
    public int m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1811o;
    public final /* synthetic */ xc0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q91(xc0 xc0Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = xc0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1811o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objN = this.p.N(0, this);
        return objN == ne1.m ? objN : new tc6(objN);
    }
}
