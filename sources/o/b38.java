package o;

/* JADX INFO: loaded from: classes.dex */
public final class b38 extends jc1 {
    public lo5 m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f388o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ e38 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b38(e38 e38Var, jc1 jc1Var) {
        super(jc1Var);
        this.s = e38Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.e(null, 0, this);
    }
}
