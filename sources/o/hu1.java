package o;

import com.teamviewer.apidefinitions.policies.models.PolicyAssignmentEvent;

/* JADX INFO: loaded from: classes.dex */
public final class hu1 extends jc1 {
    public PolicyAssignmentEvent m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ru1 f1008o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu1(ru1 ru1Var, hc1 hc1Var) {
        super(hc1Var);
        this.f1008o = ru1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1008o.c1(null, this);
    }
}
