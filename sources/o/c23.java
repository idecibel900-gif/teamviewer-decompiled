package o;

/* JADX INFO: loaded from: classes.dex */
public final class c23 extends jc1 {
    public Integer m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j23 f479o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c23(j23 j23Var, jc1 jc1Var) {
        super(jc1Var);
        this.f479o = j23Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object objF = this.f479o.f(null, null, this);
        return objF == ne1.m ? objF : new tc6(objF);
    }
}
