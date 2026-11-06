package o;

/* JADX INFO: loaded from: classes.dex */
public final class x54 extends jc1 {
    public int m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2483o;
    public final /* synthetic */ nx3 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x54(nx3 nx3Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = nx3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2483o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objS = this.p.s(0, this);
        return objS == ne1.m ? objS : new tc6(objS);
    }
}
