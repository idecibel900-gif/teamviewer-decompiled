package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class n98 extends jc1 {
    public pw2 m;
    public Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1554o;
    public /* synthetic */ Object p;
    public final /* synthetic */ o98 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n98(o98 o98Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = o98Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
