package o;

import com.teamviewer.apidefinitions.manageddevices.models.Device;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class nu1 extends jc1 {
    public UUID m;
    public bu1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Device f1601o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ru1 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(ru1 ru1Var, hc1 hc1Var) {
        super(hc1Var);
        this.u = ru1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.k1(null, false, false, false, this);
    }
}
