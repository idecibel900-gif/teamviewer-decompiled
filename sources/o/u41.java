package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class u41 extends jc1 {
    public Object m;
    public Serializable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ko5 f2168o;
    public k76 p;
    public de1 q;
    public k76 r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ v41 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(v41 v41Var, jc1 jc1Var) {
        super(jc1Var);
        this.u = v41Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.p(false, null, this);
    }
}
