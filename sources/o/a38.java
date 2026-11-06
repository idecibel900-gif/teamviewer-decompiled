package o;

/* JADX INFO: loaded from: classes.dex */
public final class a38 extends jc1 {
    public e38 m;
    public lo5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f291o;
    public String[] p;
    public int q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ e38 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a38(e38 e38Var, jc1 jc1Var) {
        super(jc1Var);
        this.u = e38Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.d(null, 0, this);
    }
}
