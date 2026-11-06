package o;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class k51 extends ConnectivityManager.NetworkCallback {
    public final LinkedHashSet a = new LinkedHashSet();
    public final /* synthetic */ gt5 b;

    public k51(gt5 gt5Var) {
        this.b = gt5Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        this.a.add(network);
        gt5 gt5Var = this.b;
        gt5Var.getClass();
        gt5Var.b(Boolean.TRUE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        LinkedHashSet linkedHashSet = this.a;
        linkedHashSet.remove(network);
        gt5 gt5Var = this.b;
        gt5Var.getClass();
        gt5Var.b(Boolean.valueOf(!linkedHashSet.isEmpty()));
    }
}
