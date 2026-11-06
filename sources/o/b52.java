package o;

/* JADX INFO: loaded from: classes.dex */
public final class b52 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ e52 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f395o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b52(e52 e52Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = e52Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f395o |= Integer.MIN_VALUE;
        return this.n.f1(this);
    }
}
