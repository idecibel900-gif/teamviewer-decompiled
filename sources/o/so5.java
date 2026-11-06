package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class so5 extends jc1 {
    public to5 m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f2041o;
    public f51 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ to5 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so5(to5 to5Var, jc1 jc1Var) {
        super(jc1Var);
        this.r = to5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(null, null, this);
    }
}
