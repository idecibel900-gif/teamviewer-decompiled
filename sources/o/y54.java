package o;

/* JADX INFO: loaded from: classes.dex */
public final class y54 extends jc1 {
    public String m;
    public Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2578o;
    public /* synthetic */ Object p;
    public final /* synthetic */ nx3 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y54(nx3 nx3Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = nx3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objT = this.q.t(null, null, this);
        return objT == ne1.m ? objT : new tc6(objT);
    }
}
