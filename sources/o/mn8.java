package o;

/* JADX INFO: loaded from: classes.dex */
public final class mn8 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ nn8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1490o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn8(nn8 nn8Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = nn8Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1490o |= Integer.MIN_VALUE;
        return this.n.e(this);
    }
}
