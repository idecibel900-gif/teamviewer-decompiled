package o;

/* JADX INFO: loaded from: classes.dex */
public final class l91 extends jc1 {
    public String m;
    public Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f1344o;
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ xc0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l91(xc0 xc0Var, jc1 jc1Var) {
        super(jc1Var);
        this.r = xc0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        Object objG = this.r.G(null, null, null, this);
        return objG == ne1.m ? objG : new tc6(objG);
    }
}
