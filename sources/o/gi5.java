package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class gi5 implements fc3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public gi5(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // o.fc3
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0080  */
    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    @Override // o.fc3
    public final void b(Context context) {
        tt6 tt6Var;
        au6 au6Var;
        context.getClass();
        ye4.a("PendingConnectionTv13Scheme", "Start TV13 connection");
        long jToLong = ep1.z(this.a).ToLong();
        String str = this.c;
        str.getClass();
        String str2 = this.d;
        str2.getClass();
        String str3 = this.b;
        str3.getClass();
        int i = tt6.i;
        String strValueOf = String.valueOf(jToLong);
        Settings.i.n();
        strValueOf.getClass();
        DyngateID dyngateIDZ = ep1.z(strValueOf);
        if (dyngateIDZ.IsValid()) {
            if (Settings.e().equals(dyngateIDZ)) {
                ye4.c("SessionLoginDataOutgoingRaapi", "Tried to connect to own ID.");
                Context context2 = d82.M;
                if (context2 != null) {
                    d82.t(context2, R.string.tv_IDS_STATUS_ConnectToOwnID);
                } else {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                }
            } else {
                tt6Var = new tt6(strValueOf, str3, str, str2);
            }
            if (tt6Var == null) {
                ye4.c("ComputerConnector", "creating session failed");
            } else if (tt6Var.c()) {
                bu7.MAIN.a(new jq(R.string.tv_connectingPleaseWait, new Object[0]));
                au6Var = bt1.b;
                if (au6Var != null) {
                    im3.e0("instance");
                    throw null;
                }
                au6Var.h(tt6Var);
            } else {
                ye4.c("Connector", "Invalid login data!");
            }
            wi6.a();
        }
        ye4.c("SessionLoginDataOutgoingRaapi", "exception caught on creation: invalid ID - ".concat(strValueOf));
        Context context3 = d82.M;
        if (context3 != null) {
            d82.t(context3, R.string.tv_IDS_STATUS_MSG_NOROUTE_IdNotFound);
        } else {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        }
        tt6Var = null;
        if (tt6Var == null) {
            ye4.c("ComputerConnector", "creating session failed");
        } else if (tt6Var.c()) {
            ye4.c("Connector", "Invalid login data!");
        } else {
            bu7.MAIN.a(new jq(R.string.tv_connectingPleaseWait, new Object[0]));
            au6Var = bt1.b;
            if (au6Var != null) {
                im3.e0("instance");
                throw null;
            }
            au6Var.h(tt6Var);
        }
        wi6.a();
    }
}
