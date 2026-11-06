package o;

/* JADX INFO: loaded from: classes.dex */
public final class vm6 extends jc1 {
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bn6 f2328o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm6(bn6 bn6Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2328o = bn6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2328o.Z0(null, this);
    }
}
