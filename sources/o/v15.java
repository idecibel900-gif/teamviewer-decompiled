package o;

/* JADX INFO: loaded from: classes.dex */
public final class v15 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ x15 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2264o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v15(x15 x15Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = x15Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2264o |= Integer.MIN_VALUE;
        return this.n.a(0L, 0L, this);
    }
}
