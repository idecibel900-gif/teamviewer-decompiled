package o;

/* JADX INFO: loaded from: classes.dex */
public final class s25 extends jc1 {
    public k76 m;
    public k76 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1976o;
    public final /* synthetic */ v25 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s25(v25 v25Var, hc1 hc1Var) {
        super(hc1Var);
        this.p = v25Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1976o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(this);
    }
}
