package o;

/* JADX INFO: loaded from: classes.dex */
public final class ba0 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ ca0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f410o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba0(ca0 ca0Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = ca0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f410o |= Integer.MIN_VALUE;
        return this.n.a(null, 0.0f, this);
    }
}
