package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w54 extends jc1 {
    public List m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2381o;
    public final /* synthetic */ nx3 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w54(nx3 nx3Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = nx3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2381o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objR = this.p.r(null, this);
        return objR == ne1.m ? objR : new tc6(objR);
    }
}
