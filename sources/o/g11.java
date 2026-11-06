package o;

import android.content.Context;
import com.teamviewer.swigcallbacklib.VoidResultOneTimeCallback;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class g11 extends VoidResultOneTimeCallback {
    public final /* synthetic */ xt6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ wt6 d;

    public g11(xt6 xt6Var, Context context, String str, wt6 wt6Var) {
        this.a = xt6Var;
        this.b = context;
        this.c = str;
        this.d = wt6Var;
    }

    @Override // com.teamviewer.swigcallbacklib.VoidResultOneTimeCallback
    public final void internalOnError() {
        ye4.a("ComputerConnector", "Starting Host app timed out");
        String string = this.b.getString(R.string.tv_startingHostAppTimeout, this.c);
        string.getClass();
        Context context = d82.M;
        if (context != null) {
            d82.u(context, string);
        } else {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        }
    }

    @Override // com.teamviewer.swigcallbacklib.VoidResultOneTimeCallback
    public final void internalOnSuccess() {
        ye4.a("ComputerConnector", "Host app started");
        zt6 zt6Var = (zt6) this.a;
        if (zt6Var.a.get() || zt6Var.b.get()) {
            String string = this.b.getString(R.string.tv_hostAppStarted, this.c);
            string.getClass();
            Context context = d82.M;
            if (context != null) {
                d82.u(context, string);
                return;
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                return;
            }
        }
        wt6 wt6Var = this.d;
        if (!wt6Var.c()) {
            ye4.c("Connector", "Invalid login data!");
            return;
        }
        bu7.MAIN.a(new jq(R.string.tv_connectingPleaseWait, new Object[0]));
        au6 au6Var = bt1.b;
        if (au6Var != null) {
            au6Var.h(wt6Var);
        } else {
            im3.e0("instance");
            throw null;
        }
    }
}
