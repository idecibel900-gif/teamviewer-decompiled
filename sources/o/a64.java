package o;

/* JADX INFO: loaded from: classes.dex */
public final class a64 extends jc1 {
    public int m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f301o;
    public final /* synthetic */ nx3 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a64(nx3 nx3Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = nx3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f301o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objB = this.p.B(0, this);
        return objB == ne1.m ? objB : new tc6(objB);
    }
}
