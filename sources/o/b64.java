package o;

/* JADX INFO: loaded from: classes.dex */
public final class b64 extends jc1 {
    public int m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f401o;
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ nx3 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b64(nx3 nx3Var, jc1 jc1Var) {
        super(jc1Var);
        this.r = nx3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        Object objD = this.r.D(0, null, null, this);
        return objD == ne1.m ? objD : new tc6(objD);
    }
}
