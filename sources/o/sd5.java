package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sd5 extends jc1 {
    public List m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2011o;
    public final /* synthetic */ a65 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd5(a65 a65Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = a65Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2011o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objG0 = this.p.G0(this);
        return objG0 == ne1.m ? objG0 : new tc6(objG0);
    }
}
