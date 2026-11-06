package o;

/* JADX INFO: loaded from: classes.dex */
public final class ef7 extends jc1 {
    public ff7 m;
    public bf7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f710o;
    public final /* synthetic */ ff7 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef7(ff7 ff7Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = ff7Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f710o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.e(null, null, this);
    }
}
