package o;

/* JADX INFO: loaded from: classes.dex */
public final class oo2 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ yi n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1665o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo2(yi yiVar, hc1 hc1Var) {
        super(hc1Var);
        this.n = yiVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1665o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
