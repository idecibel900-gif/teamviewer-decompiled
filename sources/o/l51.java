package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class l51 {
    public final ConnectivityManager a;
    public final go2 b;

    public l51(Context context) {
        context.getClass();
        this.a = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        this.b = lv1.D(it1.q(new h0(this, null, (byte) 26)), -1);
    }

    public final boolean a() {
        NetworkCapabilities networkCapabilities;
        NetworkCapabilities networkCapabilities2;
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager != null) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if ((activeNetwork == null || (networkCapabilities2 = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities2.hasCapability(12)) {
                Network activeNetwork2 = connectivityManager.getActiveNetwork();
                if ((activeNetwork2 == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork2)) == null) ? false : networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
        }
        return false;
    }
}
