package o;

/* JADX INFO: loaded from: classes.dex */
public final class r91 extends jc1 {
    public String m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1904o;
    public final /* synthetic */ xc0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r91(xc0 xc0Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = xc0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1904o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objP = this.p.P(null, this);
        return objP == ne1.m ? objP : new tc6(objP);
    }
}
