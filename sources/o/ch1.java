package o;

/* JADX INFO: loaded from: classes.dex */
public final class ch1 extends jc1 {
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f525o;
    public k76 p;
    public vh1 q;
    public /* synthetic */ Object r;
    public final /* synthetic */ dh1 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch1(dh1 dh1Var, jc1 jc1Var) {
        super(jc1Var);
        this.s = dh1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, this);
    }
}
