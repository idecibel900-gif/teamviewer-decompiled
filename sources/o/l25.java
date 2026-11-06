package o;

import android.net.ConnectivityManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class l25 {
    public static final kh7 a = new kh7(new ti4((byte) 14));
    public static final kh7 b = new kh7(new ti4((byte) 15));
    public static ve6 c;
    public static nd8 d;

    public static ww3 a() {
        return (ww3) a.getValue();
    }

    public static boolean b() {
        k25 k25Var;
        k25 k25Var2 = k25.f1224o;
        ww3 ww3VarA = a();
        if (ww3VarA != null) {
            synchronized (ww3VarA) {
                k25Var = ww3VarA.a;
            }
        } else {
            k25Var = null;
        }
        return k25Var2 == k25Var;
    }

    public static void c() {
        ye4 ye4Var = ye4.a;
        ye4Var.b("Network", "Start watchdog");
        ve6 ve6Var = c;
        if (ve6Var == null) {
            im3.e0("watchdog");
            throw null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ve6Var.d;
        if (connectivityManager == null) {
            ye4.c("Connectivity", "Cannot start watchdog. ConnectivityManager not available.");
            return;
        }
        if (ve6Var.b) {
            ye4Var.g("Connectivity", "Watchdog already started");
            return;
        }
        ye4Var.b("Connectivity", "Register default network callback");
        connectivityManager.registerDefaultNetworkCallback((io.sentry.android.core.internal.util.b) ve6Var.g);
        ve6Var.b = true;
        if (connectivityManager.getActiveNetwork() == null) {
            ((Handler) ve6Var.e).post(new wu6(ve6Var, (byte) 6));
        }
    }

    public static void d() {
        ye4 ye4Var = ye4.a;
        ye4Var.b("Network", "Stop watchdog");
        ve6 ve6Var = c;
        if (ve6Var == null) {
            im3.e0("watchdog");
            throw null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ve6Var.d;
        if (connectivityManager == null || !ve6Var.b) {
            return;
        }
        ye4.a("Connectivity", "Unregister default network callback");
        try {
            connectivityManager.unregisterNetworkCallback((io.sentry.android.core.internal.util.b) ve6Var.g);
        } catch (IllegalArgumentException e) {
            ye4Var.g("Connectivity", "Network callback was not registered: " + e.getMessage());
        }
        ve6Var.b = false;
        ve6Var.f = null;
    }
}
