package o;

/* JADX INFO: loaded from: classes.dex */
public final class u61 extends jc1 {
    public k76 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v61 f2175o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u61(v61 v61Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2175o = v61Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2175o.e(this);
    }
}
