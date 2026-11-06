package o;

/* JADX INFO: loaded from: classes.dex */
public final class t31 extends jc1 {
    public ky4 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y31 f2075o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t31(y31 y31Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2075o = y31Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2075o.V0(this);
    }
}
