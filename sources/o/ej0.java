package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ej0 extends jc1 {
    public gt5 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fj0 f718o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej0(fj0 fj0Var, jc1 jc1Var) {
        super(jc1Var);
        this.f718o = fj0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f718o.f(null, this);
    }
}
