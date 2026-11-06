package o;

/* JADX INFO: loaded from: classes.dex */
public final class b13 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ d11 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f383o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b13(d11 d11Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = d11Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f383o |= Integer.MIN_VALUE;
        return this.n.E(null, this);
    }
}
