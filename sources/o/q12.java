package o;

import com.teamviewer.teamviewerlib.network.NativeNetwork;
import com.teamviewer.teamviewerlib.swig.tvnetwork.EOnlineState;
import com.teamviewer.teamviewerlib.swig.tvnetwork.INetworkControl;

/* JADX INFO: loaded from: classes.dex */
public final class q12 extends io.sentry.l6 {
    public boolean c;

    @Override // io.sentry.l6
    public final void A() {
        D();
    }

    public final void D() {
        ye4.a("DirectNetworkControlMethod", "stopDirectNetwork");
        if (this.c) {
            ye4.a("DirectNetworkControlMethod", "stopNetwork");
            l25.d();
            ye4.a.b("Network", "Stop network");
            INetworkControl iNetworkControl = NativeNetwork.b;
            if (iNetworkControl != null) {
                iNetworkControl.Offline(EOnlineState.Offline);
            } else {
                ye4.a("NativeNetwork", "stop(): NetworkControl not initialized");
            }
            this.c = false;
        }
    }

    @Override // io.sentry.l6
    public final boolean n() {
        return this.c;
    }

    @Override // io.sentry.l6
    public final void z(boolean z) {
        ye4 ye4Var = ye4.a;
        if (z) {
            ye4Var.f("DirectNetworkControlMethod", "Deferring startDirectNetwork call since Network has been disabled.");
            return;
        }
        ye4.a("DirectNetworkControlMethod", "startDirectNetwork");
        if (this.c) {
            return;
        }
        ye4.a("DirectNetworkControlMethod", "startNetwork");
        kh7 kh7Var = l25.a;
        ye4Var.b("Network", "Start network");
        INetworkControl iNetworkControl = NativeNetwork.b;
        if (iNetworkControl != null) {
            iNetworkControl.Online();
        } else {
            ye4.a("NativeNetwork", "start(): NetworkControl not initialized");
        }
        l25.c();
        this.c = true;
    }
}
