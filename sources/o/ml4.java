package o;

import com.teamviewer.apidefinitions.manageddevices.models.FilterPaginationModel;

/* JADX INFO: loaded from: classes.dex */
public final class ml4 extends jc1 {
    public FilterPaginationModel m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1481o;
    public final /* synthetic */ xl4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml4(xl4 xl4Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = xl4Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1481o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objE = this.p.e(null, this);
        return objE == ne1.m ? objE : new tc6(objE);
    }
}
