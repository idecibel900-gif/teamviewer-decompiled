package o;

/* JADX INFO: loaded from: classes.dex */
public final class f23 extends jc1 {
    public iw7 m;
    public r13 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f762o;
    public final /* synthetic */ j23 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f23(j23 j23Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = j23Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f762o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.i(this);
    }
}
