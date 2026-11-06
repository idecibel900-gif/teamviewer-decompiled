package o;

/* JADX INFO: loaded from: classes.dex */
public final class p96 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ c63 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1717o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p96(c63 c63Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = c63Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1717o |= Integer.MIN_VALUE;
        return this.n.b(0.0f, this);
    }
}
