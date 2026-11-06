package o;

import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;

/* JADX INFO: loaded from: classes.dex */
public final class ia6 extends u2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ia6(Object obj, byte b) {
        this.a = b;
    }

    @Override // o.u2
    public final void c(mo7 mo7Var) {
        switch (this.a) {
            case 0:
                if (ConnectionMode.RemoteSupport == mo7Var.p()) {
                    io.sentry.h2.f();
                    break;
                }
                break;
            default:
                if (ConnectionMode.RemoteSupport == mo7Var.p()) {
                    io.sentry.h2.f();
                    break;
                }
                break;
        }
    }

    @Override // o.u2
    public final void d(mo7 mo7Var) {
        switch (this.a) {
            case 0:
                ConnectionMode connectionMode = ConnectionMode.Unknown;
                mo7Var.p();
                break;
            default:
                ConnectionMode connectionMode2 = ConnectionMode.Unknown;
                mo7Var.p();
                break;
        }
    }
}
