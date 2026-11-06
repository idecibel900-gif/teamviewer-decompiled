package o;

import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class xj2 extends oe8 {
    public final RemoteControlApplication n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final xt6 f2522o;
    public final tk2 p;
    public WeakReference q = new WeakReference(null);

    public xj2(RemoteControlApplication remoteControlApplication, xt6 xt6Var, tk2 tk2Var) {
        this.n = remoteControlApplication;
        this.f2522o = xt6Var;
        this.p = tk2Var;
        ((zt6) xt6Var).d(new d6(this, (byte) 1));
    }

    public final void V0() {
        xa3 xa3Var = xa3.f2498o;
        tk2 tk2Var = this.p;
        if (((xa3) tk2Var.c) == null) {
            tk2Var.c = xa3Var;
        }
        mo7 mo7Var = ((zt6) this.f2522o).f;
        if (mo7Var instanceof et6) {
            ((et6) mo7Var).i();
        }
    }
}
