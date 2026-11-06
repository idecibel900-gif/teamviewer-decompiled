package o;

/* JADX INFO: loaded from: classes.dex */
public final class s91 extends jc1 {
    public long m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xc0 f1994o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s91(xc0 xc0Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1994o = xc0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object objQ = this.f1994o.Q(this);
        return objQ == ne1.m ? objQ : new tc6(objQ);
    }
}
