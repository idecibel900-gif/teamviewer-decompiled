package o;

import com.teamviewer.remotecontrollib.swig.IConnectInterfaceViewModel;

/* JADX INFO: loaded from: classes.dex */
public final class b31 extends oe8 {
    public final IConnectInterfaceViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final xt6 f386o;
    public final d31 p;
    public final z60 q;
    public final nw4 r;

    public b31(IConnectInterfaceViewModel iConnectInterfaceViewModel, xt6 xt6Var, d31 d31Var, z60 z60Var) {
        z60Var.getClass();
        this.n = iConnectInterfaceViewModel;
        this.f386o = xt6Var;
        this.p = d31Var;
        this.q = z60Var;
        this.r = new nw4(Boolean.valueOf(((zt6) xt6Var).b.get()));
    }

    @Override // o.oe8
    public final void U0() {
        this.n.a();
    }
}
