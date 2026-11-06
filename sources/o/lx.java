package o;

/* JADX INFO: loaded from: classes.dex */
public final class lx extends jc1 {
    public Object m;
    public og7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1414o;
    public Object p;
    public my4 q;
    public /* synthetic */ Object r;
    public final /* synthetic */ iu s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(iu iuVar, jc1 jc1Var) {
        super(jc1Var);
        this.s = iuVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.C(null, null, this);
    }
}
