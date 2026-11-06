package o;

/* JADX INFO: loaded from: classes.dex */
public final class sl4 extends jc1 {
    public String m;
    public Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2029o;
    public /* synthetic */ Object p;
    public final /* synthetic */ xl4 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl4(xl4 xl4Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = xl4Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objK = this.q.k(null, null, this);
        return objK == ne1.m ? objK : new tc6(objK);
    }
}
