package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class re6 extends jc1 {
    public UUID m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1917o;
    public final /* synthetic */ ol5 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re6(ol5 ol5Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = ol5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1917o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objF = this.p.f(null, this);
        return objF == ne1.m ? objF : new tc6(objF);
    }
}
