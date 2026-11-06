package o;

import com.teamviewer.teamviewerlib.settings.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class il7 extends oe8 implements ed3 {
    public final ha6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Settings f1074o;
    public final nw4 p;

    public il7(ha6 ha6Var, Settings settings) {
        ha6Var.getClass();
        settings.getClass();
        this.n = ha6Var;
        this.f1074o = settings;
        this.p = new nw4(Boolean.valueOf(Settings.a(gv6.USER, ca8.P_REMOTE_REMOTECURSOR)));
    }

    @Override // o.ed3
    public final nw4 Q0() {
        return this.p;
    }

    @Override // o.ed3
    public final void U(boolean z) {
        boolean z2;
        this.p.setValue(Boolean.valueOf(z));
        ca8 ca8Var = ca8.P_REMOTE_REMOTECURSOR;
        this.f1074o.getClass();
        Settings.k(gv6.USER, ca8Var, z);
        ha6 ha6Var = this.n;
        boolean z3 = ha6Var.p;
        if (z3 != z) {
            if (z != z3) {
                ha6Var.p = z;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ha6Var.a.b();
            }
        }
    }
}
