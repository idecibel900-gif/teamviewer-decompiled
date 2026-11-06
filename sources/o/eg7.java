package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionUpdateParams;

/* JADX INFO: loaded from: classes2.dex */
public final class eg7 extends jc1 {
    public int m;
    public SupportSessionUpdateParams n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f713o;
    public /* synthetic */ Object p;
    public final /* synthetic */ l07 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg7(l07 l07Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = l07Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objJ = this.q.J(0, null, this);
        return objJ == ne1.m ? objJ : new tc6(objJ);
    }
}
