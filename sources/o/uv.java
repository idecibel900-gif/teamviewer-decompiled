package o;

/* JADX INFO: loaded from: classes.dex */
public final class uv extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ vv n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2251o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(vv vvVar, jc1 jc1Var) {
        super(jc1Var);
        this.n = vvVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2251o |= Integer.MIN_VALUE;
        Object objT = this.n.t(null, this);
        return objT == ne1.m ? objT : new tc6(objT);
    }
}
