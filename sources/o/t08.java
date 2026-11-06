package o;

/* JADX INFO: loaded from: classes.dex */
public final class t08 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ u08 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2068o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t08(u08 u08Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = u08Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2068o |= Integer.MIN_VALUE;
        return this.n.c(null, null, this);
    }
}
