package o;

/* JADX INFO: loaded from: classes.dex */
public final class fb2 extends jc1 {
    public uy0 m;
    public ke3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f783o;
    public za5 p;
    public z06 q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ hb2 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb2(hb2 hb2Var, jc1 jc1Var) {
        super(jc1Var);
        this.t = hb2Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.c(null, null, null, null, null, this);
    }
}
