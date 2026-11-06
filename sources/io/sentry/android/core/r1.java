package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import io.sentry.d5;
import io.sentry.f6;
import io.sentry.m5;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends ConnectivityManager.NetworkCallback {
    public final q0 a;
    public NetworkCapabilities b = null;
    public long c = 0;
    public final m5 d;

    public r1(q0 q0Var, m5 m5Var) {
        this.a = q0Var;
        io.sentry.util.b.v(m5Var, "SentryDateProvider is required");
        this.d = m5Var;
    }

    public static io.sentry.h a(String str) {
        io.sentry.h hVar = new io.sentry.h();
        hVar.q = "system";
        hVar.s = "network.event";
        hVar.d(str, "action");
        hVar.u = f6.INFO;
        return hVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        d5.c().f(a("NETWORK_AVAILABLE"), new io.sentry.p0());
        this.b = null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9  */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int i;
        q1 q1Var;
        boolean z;
        boolean z2;
        q1 q1Var2;
        q1 q1Var3;
        long jD = this.d.a().d();
        NetworkCapabilities networkCapabilities2 = this.b;
        long j = this.c;
        q0 q0Var = this.a;
        if (networkCapabilities2 == null) {
            q1Var3 = new q1(networkCapabilities, q0Var, jD);
        } else {
            int linkDownstreamBandwidthKbps = networkCapabilities2.getLinkDownstreamBandwidthKbps();
            int linkUpstreamBandwidthKbps = networkCapabilities2.getLinkUpstreamBandwidthKbps();
            int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities2.getSignalStrength() : 0;
            if (signalStrength <= -100) {
                signalStrength = 0;
            }
            boolean zHasTransport = networkCapabilities2.hasTransport(4);
            String strZ = io.sentry.android.core.internal.util.c.z(networkCapabilities2);
            if (strZ == null) {
                strZ = "";
            }
            q1 q1Var4 = new q1(networkCapabilities, q0Var, jD);
            int iAbs = Math.abs(signalStrength - q1Var4.c);
            int iAbs2 = Math.abs(linkDownstreamBandwidthKbps - q1Var4.a);
            int iAbs3 = Math.abs(linkUpstreamBandwidthKbps - q1Var4.b);
            boolean z3 = ((double) Math.abs(j - q1Var4.d)) / 1000000.0d < 5000.0d;
            boolean z4 = z3 || iAbs <= 5;
            if (z3) {
                i = linkUpstreamBandwidthKbps;
                q1Var = q1Var4;
            } else {
                q1Var = q1Var4;
                double d = iAbs2;
                i = linkUpstreamBandwidthKbps;
                if (d > Math.max(1000.0d, ((double) Math.abs(linkDownstreamBandwidthKbps)) * 0.1d)) {
                    z = false;
                }
                if (!z3 || iAbs3 <= Math.max(1000.0d, ((double) Math.abs(i)) * 0.1d)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                q1Var2 = q1Var;
                if (zHasTransport != q1Var2.e && strZ.equals(q1Var2.f) && z4 && z && z2) {
                    q1Var3 = null;
                } else {
                    q1Var3 = q1Var2;
                }
            }
            z = true;
            if (z3) {
                z2 = true;
            } else {
                z2 = true;
            }
            q1Var2 = q1Var;
            if (zHasTransport != q1Var2.e) {
                q1Var3 = q1Var2;
            } else {
                q1Var3 = q1Var2;
            }
        }
        if (q1Var3 == null) {
            return;
        }
        this.b = networkCapabilities;
        this.c = jD;
        io.sentry.h hVarA = a("NETWORK_CAPABILITIES_CHANGED");
        hVarA.d(Integer.valueOf(q1Var3.a), "download_bandwidth");
        hVarA.d(Integer.valueOf(q1Var3.b), "upload_bandwidth");
        hVarA.d(Boolean.valueOf(q1Var3.e), "vpn_active");
        hVarA.d(q1Var3.f, "network_type");
        int i2 = q1Var3.c;
        if (i2 != 0) {
            hVarA.d(Integer.valueOf(i2), "signal_strength");
        }
        io.sentry.p0 p0Var = new io.sentry.p0();
        p0Var.d(q1Var3, "android:networkCapabilities");
        d5.c().f(hVarA, p0Var);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        d5.c().f(a("NETWORK_LOST"), new io.sentry.p0());
        this.b = null;
    }
}
