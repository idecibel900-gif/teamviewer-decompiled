package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eh8 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ve6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Network f715o;

    public /* synthetic */ eh8(ve6 ve6Var, Network network, byte b) {
        this.m = b;
        this.n = ve6Var;
        this.f715o = network;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkCapabilities networkCapabilities;
        byte b = this.m;
        Network network = this.f715o;
        ve6 ve6Var = this.n;
        switch (b) {
            case 0:
                if (ve6Var.b) {
                    Network network2 = (Network) ve6Var.f;
                    ve6Var.f = network;
                    ConnectivityManager connectivityManager = (ConnectivityManager) ve6Var.d;
                    if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                        x37.p("Default", networkCapabilities);
                    }
                    if (network2 == null || network2.equals(network)) {
                        ye4.a("Connectivity", "Default network available.");
                    } else {
                        ye4.a("Connectivity", "Default network changed, trying to reconnect.");
                        if (ve6Var.a) {
                            Context context = d82.M;
                            if (context != null) {
                                String string = context.getString(R.string.tv_message_TcpReconnectStarted);
                                string.getClass();
                                fx3.r(string, 1, context, bu7.MAIN);
                            } else {
                                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                            }
                        }
                    }
                    ((j25) ve6Var.c).a(od3.m);
                    break;
                }
                break;
            default:
                if (ve6Var.b) {
                    if (!network.equals((Network) ve6Var.f)) {
                        ye4.a.b("Connectivity", "Non-default network lost, ignoring.");
                    } else {
                        ve6Var.f = null;
                        ve6Var.g();
                    }
                    break;
                }
                break;
        }
    }
}
