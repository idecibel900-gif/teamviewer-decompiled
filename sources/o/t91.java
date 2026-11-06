package o;

/* JADX INFO: loaded from: classes.dex */
public final class t91 extends jc1 {
    public String m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2093o;
    public final /* synthetic */ xc0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t91(xc0 xc0Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = xc0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2093o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objR = this.p.R(null, this);
        return objR == ne1.m ? objR : new tc6(objR);
    }
}
