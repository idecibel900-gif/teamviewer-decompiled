package o;

/* JADX INFO: loaded from: classes.dex */
public final class c52 extends jc1 {
    public p42 m;
    public g52 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f490o;
    public final /* synthetic */ e52 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c52(e52 e52Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = e52Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f490o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.g1(null, this);
    }
}
