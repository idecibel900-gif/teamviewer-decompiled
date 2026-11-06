package o;

/* JADX INFO: loaded from: classes2.dex */
public final class k97 extends jc1 {
    public ho2 m;
    public m97 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public bp3 f1241o;
    public Object p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ l97 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k97(l97 l97Var, hc1 hc1Var) {
        super(hc1Var);
        this.s = l97Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        this.s.b(null, this);
        return ne1.m;
    }
}
