package o;

/* JADX INFO: loaded from: classes2.dex */
public final class if0 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ kf0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1054o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if0(kf0 kf0Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = kf0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1054o |= Integer.MIN_VALUE;
        Object objF = kf0.F(this.n, this);
        return objF == ne1.m ? objF : new jn0(objF);
    }
}
