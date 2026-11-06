package o;

import android.os.Looper;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final class wq6 extends io.sentry.l6 {
    public final kd c;
    public boolean d;

    public wq6(RemoteControlApplication remoteControlApplication) {
        super(remoteControlApplication);
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        this.c = new kd(this, mainLooper, (byte) 4);
    }

    @Override // io.sentry.l6
    public final void A() {
        ye4.a("ServiceNetworkControlMethod", "stopNetworkService");
        kd kdVar = this.c;
        if (kdVar.hasMessages(0)) {
            ye4.a.g("ServiceNetworkControlMethod", "ignore NetworkService Start before Stop");
            kdVar.removeMessages(0);
        }
        kdVar.sendEmptyMessage(1);
        this.d = false;
    }

    @Override // io.sentry.l6
    public final boolean n() {
        return this.d;
    }

    @Override // io.sentry.l6
    public final boolean y() {
        return false;
    }

    @Override // io.sentry.l6
    public final void z(boolean z) {
        ye4 ye4Var = ye4.a;
        if (z) {
            ye4Var.f("ServiceNetworkControlMethod", "Deferring startNetworkService call since Network has been disabled.");
            return;
        }
        ye4.a("ServiceNetworkControlMethod", "Going online");
        ye4.a("ServiceNetworkControlMethod", "startNetworkService");
        kd kdVar = this.c;
        if (kdVar.hasMessages(1)) {
            ye4Var.g("ServiceNetworkControlMethod", "ignore NetworkService Stop before Start");
            kdVar.removeMessages(1);
        }
        kdVar.sendEmptyMessage(0);
    }
}
