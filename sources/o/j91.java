package o;

/* JADX INFO: loaded from: classes.dex */
public final class j91 extends jc1 {
    public iw7 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ iu f1140o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j91(iu iuVar, jc1 jc1Var) {
        super(jc1Var);
        this.f1140o = iuVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1140o.s(this);
    }
}
