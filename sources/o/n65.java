package o;

/* JADX INFO: loaded from: classes.dex */
public final class n65 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ wh1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1545o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n65(wh1 wh1Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = wh1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1545o |= Integer.MIN_VALUE;
        this.n.a(null, this);
        return ne1.m;
    }
}
