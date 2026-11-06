package o;

/* JADX INFO: loaded from: classes.dex */
public final class n91 extends jc1 {
    public int m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1553o;
    public final /* synthetic */ xc0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n91(xc0 xc0Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = xc0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1553o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objJ = this.p.J(0, this);
        return objJ == ne1.m ? objJ : new tc6(objJ);
    }
}
