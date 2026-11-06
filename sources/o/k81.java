package o;

/* JADX INFO: loaded from: classes.dex */
public final class k81 extends jc1 {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n81 f1235o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k81(n81 n81Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1235o = n81Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1235o.Z0(0, this);
    }
}
