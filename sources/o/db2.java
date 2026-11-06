package o;

/* JADX INFO: loaded from: classes.dex */
public final class db2 extends jc1 {
    public ke3 m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z06 f604o;
    public k76 p;
    public k76 q;
    public k76 r;
    public k76 s;
    public /* synthetic */ Object t;
    public final /* synthetic */ hb2 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db2(hb2 hb2Var, jc1 jc1Var) {
        super(jc1Var);
        this.u = hb2Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, null, null, null, this);
    }
}
