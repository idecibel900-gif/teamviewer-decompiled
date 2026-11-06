package o;

/* JADX INFO: loaded from: classes.dex */
public final class nl4 extends jc1 {
    public long m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xl4 f1577o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl4(xl4 xl4Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1577o = xl4Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object objF = this.f1577o.f(this);
        return objF == ne1.m ? objF : new tc6(objF);
    }
}
