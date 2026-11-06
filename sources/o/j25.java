package o;

import com.teamviewer.teamviewerlib.network.NativeNetwork;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvnetwork.INetworkControl;

/* JADX INFO: loaded from: classes.dex */
public final class j25 {
    public final void a(od3 od3Var) {
        int iOrdinal = od3Var.ordinal();
        if (iOrdinal == 0) {
            ww3 ww3VarA = l25.a();
            if (ww3VarA != null) {
                ww3VarA.c();
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            gk0.s();
            return;
        }
        Settings.k(gv6.MACHINE, rt0.P_IS_LOGGED_IN, false);
        if (l25.a() != null) {
            ye4.a("KeepAlive", "Stop");
            INetworkControl iNetworkControl = NativeNetwork.b;
            if (iNetworkControl != null) {
                iNetworkControl.StopKeepAlive();
            } else {
                ye4.a("NativeNetwork", "stopKeepAlive(): NetworkControl not initialized");
            }
        }
    }
}
