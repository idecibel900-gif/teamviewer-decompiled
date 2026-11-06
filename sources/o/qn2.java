package o;

/* JADX INFO: loaded from: classes.dex */
public final class qn2 extends jc1 {
    public jl3 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ sn2 f1847o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn2(sn2 sn2Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1847o = sn2Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1847o.a(null, this);
    }
}
