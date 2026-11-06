package o;

import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.network.NativeNetwork;
import com.teamviewer.teamviewerlib.swig.tvnetwork.INetworkControl;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public final class ww3 {
    public k25 a;

    public final synchronized void a(k25 k25Var) {
        try {
            int iOrdinal = k25Var.ordinal();
            if (iOrdinal == 0) {
                k25 k25Var2 = this.a;
                if (k25Var2 == k25.f1224o || k25Var2 == k25.n) {
                    b(k25.m);
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new w35();
                }
                k25 k25Var3 = this.a;
                if (k25Var3 == k25.m || k25Var3 == k25.n) {
                    b(k25.f1224o);
                }
            } else if (this.a == k25.m) {
                b(k25.n);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(k25 k25Var) {
        ye4.a("KeepAlive", k25Var.name());
        this.a = k25Var;
        he2 he2Var = new he2();
        he2Var.b(EventParam.EP_ONLINE_STATE, k25Var);
        EventHub.e.f().d(EventType.EVENT_KEEP_ALIVE_STATE_CHANGED, he2Var);
    }

    public final void c() {
        ye4.a("KeepAlive", "Start");
        if (NativeLibTvExt.c()) {
            a(k25.n);
            INetworkControl iNetworkControl = NativeNetwork.b;
            if (iNetworkControl != null) {
                iNetworkControl.StartKeepAlive();
            } else {
                ye4.a("NativeNetwork", "startKeepAlive(): NetworkControl not initialized");
            }
        }
    }
}
