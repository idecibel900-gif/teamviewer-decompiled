package o;

/* JADX INFO: loaded from: classes.dex */
public final class zg extends jc1 {
    public lw4 m;
    public ff0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2696o;
    public final /* synthetic */ bh p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(bh bhVar, jc1 jc1Var) {
        super(jc1Var);
        this.p = bhVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2696o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.l(this);
    }
}
