package o;

/* JADX INFO: loaded from: classes.dex */
public final class i23 extends jc1 {
    public r13 m;
    public iw7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1028o;
    public final /* synthetic */ j23 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i23(j23 j23Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = j23Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1028o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.k(null, this);
    }
}
