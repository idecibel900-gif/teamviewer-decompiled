package o;

/* JADX INFO: loaded from: classes.dex */
public final class bh1 extends jc1 {
    public j93 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j93 f424o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh1(j93 j93Var, jc1 jc1Var) {
        super(jc1Var);
        this.f424o = j93Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f424o.H(this);
    }
}
