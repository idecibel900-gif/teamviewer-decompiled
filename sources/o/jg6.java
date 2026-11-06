package o;

/* JADX INFO: loaded from: classes.dex */
public final class jg6 extends jc1 {
    public j93 m;
    public ky4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1162o;
    public final /* synthetic */ j93 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg6(j93 j93Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = j93Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1162o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b0(this);
    }
}
