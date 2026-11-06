package o;

import com.teamviewer.apidefinitions.manageddevices.models.GroupDetailModel;

/* JADX INFO: loaded from: classes.dex */
public final class jl4 extends jc1 {
    public GroupDetailModel m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1178o;
    public final /* synthetic */ xl4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl4(xl4 xl4Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = xl4Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1178o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objB = this.p.b(null, this);
        return objB == ne1.m ? objB : new tc6(objB);
    }
}
