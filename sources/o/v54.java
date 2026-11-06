package o;

import com.teamviewer.apidefinitions.legacydevices.models.DeviceMeta;

/* JADX INFO: loaded from: classes.dex */
public final class v54 extends jc1 {
    public DeviceMeta m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2279o;
    public final /* synthetic */ nx3 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v54(nx3 nx3Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = nx3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2279o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objK = this.p.k(null, this);
        return objK == ne1.m ? objK : new tc6(objK);
    }
}
