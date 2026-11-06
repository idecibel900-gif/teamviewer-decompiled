package o;

/* JADX INFO: loaded from: classes.dex */
public final class on6 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ rn6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1663o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on6(rn6 rn6Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = rn6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1663o |= Integer.MIN_VALUE;
        return this.n.E0(this);
    }
}
