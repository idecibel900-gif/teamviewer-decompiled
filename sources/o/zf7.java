package o;

/* JADX INFO: loaded from: classes2.dex */
public final class zf7 extends jc1 {
    public long m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l07 f2695o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf7(l07 l07Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2695o = l07Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object objC = this.f2695o.C(this);
        return objC == ne1.m ? objC : new tc6(objC);
    }
}
