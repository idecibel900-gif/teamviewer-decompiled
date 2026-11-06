package o;

/* JADX INFO: loaded from: classes2.dex */
public final class jf0 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ kf0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1157o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(kf0 kf0Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = kf0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1157o |= Integer.MIN_VALUE;
        Object objG = this.n.G(null, 0, 0L, this);
        return objG == ne1.m ? objG : new jn0(objG);
    }
}
