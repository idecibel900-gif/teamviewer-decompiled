package o;

/* JADX INFO: loaded from: classes.dex */
public final class d52 extends jc1 {
    public q42 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e52 f587o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d52(e52 e52Var, jc1 jc1Var) {
        super(jc1Var);
        this.f587o = e52Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f587o.h1(null, this);
    }
}
