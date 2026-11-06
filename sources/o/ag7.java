package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class ag7 extends jc1 {
    public SupportSessionFilter m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f320o;
    public final /* synthetic */ l07 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag7(l07 l07Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = l07Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f320o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objD = this.p.D(null, this);
        return objD == ne1.m ? objD : new tc6(objD);
    }
}
