package o;

/* JADX INFO: loaded from: classes.dex */
public final class m63 extends jc1 {
    public j63 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p63 f1438o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m63(p63 p63Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1438o = p63Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1438o.U0(this);
    }
}
