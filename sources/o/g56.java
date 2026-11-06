package o;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class g56 extends jc1 {
    public List m;
    public ConcurrentHashMap n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f863o;
    public final /* synthetic */ a65 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g56(a65 a65Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = a65Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f863o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.S0(null, this);
    }
}
