package o;

/* JADX INFO: loaded from: classes.dex */
public final class ur5 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ wr5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2244o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur5(wr5 wr5Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = wr5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2244o |= Integer.MIN_VALUE;
        return this.n.c(this);
    }
}
