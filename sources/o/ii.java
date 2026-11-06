package o;

/* JADX INFO: loaded from: classes.dex */
public final class ii extends jc1 {
    public long m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ li f1062o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(li liVar, jc1 jc1Var) {
        super(jc1Var);
        this.f1062o = liVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1062o.b(0L, null, this);
    }
}
