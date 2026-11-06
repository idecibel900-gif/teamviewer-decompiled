package o;

/* JADX INFO: loaded from: classes.dex */
public final class h46 extends jc1 {
    public gb6 m;
    public ke3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z06 f948o;
    public xd3 p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ i46 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h46(i46 i46Var, jc1 jc1Var) {
        super(jc1Var);
        this.s = i46Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, 0, this);
    }
}
