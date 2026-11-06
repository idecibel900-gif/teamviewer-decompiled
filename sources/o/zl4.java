package o;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zl4 extends jc1 {
    public LinkedHashSet m;
    public Set n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2713o;
    public final /* synthetic */ nx3 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl4(nx3 nx3Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = nx3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2713o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.u(null, this);
    }
}
