package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class f80 extends jc1 {
    public Function0 m;
    public Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f774o;
    public final /* synthetic */ g80 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(g80 g80Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = g80Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f774o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.W0(null, null, this);
    }
}
