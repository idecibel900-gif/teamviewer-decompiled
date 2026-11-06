package o;

/* JADX INFO: loaded from: classes.dex */
public final class z54 extends jc1 {
    public String m;
    public Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2671o;
    public /* synthetic */ Object p;
    public final /* synthetic */ nx3 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z54(nx3 nx3Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = nx3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objV = this.q.v(null, null, this);
        return objV == ne1.m ? objV : new tc6(objV);
    }
}
