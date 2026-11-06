package o;

/* JADX INFO: loaded from: classes.dex */
public final class t45 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ u45 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2082o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t45(u45 u45Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = u45Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2082o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
