package o;

/* JADX INFO: loaded from: classes2.dex */
public final class mw0 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ nw0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1517o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw0(nw0 nw0Var, hc1 hc1Var) {
        super(hc1Var);
        this.n = nw0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1517o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
