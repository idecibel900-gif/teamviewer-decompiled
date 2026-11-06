package o;

import com.teamviewer.apidefinitions.manageddevices.models.GroupIdList;

/* JADX INFO: loaded from: classes.dex */
public final class rl4 extends jc1 {
    public GroupIdList m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1929o;
    public final /* synthetic */ xl4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl4(xl4 xl4Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = xl4Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1929o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objJ = this.p.j(null, this);
        return objJ == ne1.m ? objJ : new tc6(objJ);
    }
}
