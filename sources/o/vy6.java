package o;

/* JADX INFO: loaded from: classes.dex */
public final class vy6 extends jc1 {
    public h76 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xy6 f2358o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy6(xy6 xy6Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2358o = xy6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2358o.a(null, 0.0f, this);
    }
}
