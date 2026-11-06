package o;

import com.teamviewer.apidefinitions.rolloutconfigurations.models.RolloutConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class qe6 extends jc1 {
    public RolloutConfiguration m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1825o;
    public final /* synthetic */ ol5 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe6(ol5 ol5Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = ol5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1825o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objE = this.p.e(null, this);
        return objE == ne1.m ? objE : new tc6(objE);
    }
}
