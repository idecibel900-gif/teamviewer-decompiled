package o;

import com.teamviewer.apidefinitions.custommodules.models.CustomModuleHost;

/* JADX INFO: loaded from: classes.dex */
public final class zf1 extends jc1 {
    public CustomModuleHost m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2694o;
    public final /* synthetic */ aw p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf1(aw awVar, jc1 jc1Var) {
        super(jc1Var);
        this.p = awVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2694o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objN = this.p.n(null, this);
        return objN == ne1.m ? objN : new tc6(objN);
    }
}
