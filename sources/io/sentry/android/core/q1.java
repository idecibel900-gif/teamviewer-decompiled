package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final String f;

    public q1(NetworkCapabilities networkCapabilities, q0 q0Var, long j) {
        io.sentry.util.b.v(networkCapabilities, "NetworkCapabilities is required");
        this.a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.c = signalStrength > -100 ? signalStrength : 0;
        this.e = networkCapabilities.hasTransport(4);
        String strZ = io.sentry.android.core.internal.util.c.z(networkCapabilities);
        this.f = strZ == null ? "" : strZ;
        this.d = j;
    }
}
