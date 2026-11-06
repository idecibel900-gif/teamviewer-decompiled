package o;

/* JADX INFO: loaded from: classes.dex */
public final class qj2 extends jc1 {
    public rj2 m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1836o;
    public yk2 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ rj2 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj2(rj2 rj2Var, jc1 jc1Var) {
        super(jc1Var);
        this.r = rj2Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(null, this);
    }
}
