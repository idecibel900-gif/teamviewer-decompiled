package o;

/* JADX INFO: loaded from: classes.dex */
public final class d23 extends jc1 {
    public r13 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j23 f581o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d23(j23 j23Var, jc1 jc1Var) {
        super(jc1Var);
        this.f581o = j23Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f581o.g(0L, this);
    }
}
