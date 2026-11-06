package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tx4 extends jc1 {
    public jl3 m;
    public ux4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Iterator f2152o;
    public /* synthetic */ Object p;
    public final /* synthetic */ en0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx4(en0 en0Var, hc1 hc1Var) {
        super(hc1Var);
        this.q = en0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
