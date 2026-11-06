package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ro5 extends jc1 {
    public Object m;
    public Serializable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1940o;
    public /* synthetic */ Object p;
    public final /* synthetic */ to5 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro5(to5 to5Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = to5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.g(null, null, this);
    }
}
