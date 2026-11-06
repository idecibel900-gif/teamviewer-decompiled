package o;

/* JADX INFO: loaded from: classes.dex */
public final class n63 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ p63 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1544o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n63(p63 p63Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = p63Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1544o |= Integer.MIN_VALUE;
        return this.n.V0(this);
    }
}
