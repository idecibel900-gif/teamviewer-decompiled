package o;

/* JADX INFO: loaded from: classes.dex */
public final class m07 extends jc1 {
    public Object m;
    public my4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1422o;
    public final /* synthetic */ o07 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m07(o07 o07Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = o07Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1422o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(null, this);
    }
}
