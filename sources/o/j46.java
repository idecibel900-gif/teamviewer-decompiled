package o;

/* JADX INFO: loaded from: classes.dex */
public final class j46 extends jc1 {
    public hb2 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l46 f1128o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j46(l46 l46Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1128o = l46Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1128o.b(this);
    }
}
