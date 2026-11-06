package o;

import com.teamviewer.apidefinitions.manageddevices.models.DeviceFilteringModel;

/* JADX INFO: loaded from: classes.dex */
public final class ll4 extends jc1 {
    public DeviceFilteringModel m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1376o;
    public final /* synthetic */ xl4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll4(xl4 xl4Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = xl4Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1376o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objD = this.p.d(null, this);
        return objD == ne1.m ? objD : new tc6(objD);
    }
}
