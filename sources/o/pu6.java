package o;

/* JADX INFO: loaded from: classes.dex */
public final class pu6 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ su6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1778o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu6(su6 su6Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = su6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1778o |= Integer.MIN_VALUE;
        return this.n.X0(this);
    }
}
