package o;

/* JADX INFO: loaded from: classes.dex */
public final class f91 extends jc1 {
    public iw7 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ iu f777o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f91(iu iuVar, jc1 jc1Var) {
        super(jc1Var);
        this.f777o = iuVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f777o.r(this);
    }
}
