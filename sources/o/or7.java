package o;

/* JADX INFO: loaded from: classes.dex */
public final class or7 extends jc1 {
    public pr7 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pr7 f1670o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or7(pr7 pr7Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1670o = pr7Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1670o.t(this);
    }
}
