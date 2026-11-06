package o;

import com.teamviewer.apidefinitions.legacydevices.models.DeviceMeta;

/* JADX INFO: loaded from: classes.dex */
public final class f64 extends jc1 {
    public int m;
    public DeviceMeta n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f772o;
    public /* synthetic */ Object p;
    public final /* synthetic */ nx3 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f64(nx3 nx3Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = nx3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objL = this.q.L(0, null, this);
        return objL == ne1.m ? objL : new tc6(objL);
    }
}
