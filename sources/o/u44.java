package o;

/* JADX INFO: loaded from: classes.dex */
public final class u44 extends jc1 {
    public ay4 m;
    public og7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2170o;
    public final /* synthetic */ w44 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u44(w44 w44Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = w44Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2170o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.e(null, null, this);
    }
}
