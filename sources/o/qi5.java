package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;

/* JADX INFO: loaded from: classes.dex */
public final class qi5 implements fc3 {
    public final String a;
    public final ConnectionMode b;
    public final String c;
    public final String d;

    public qi5(String str, ConnectionMode connectionMode, String str2, String str3) {
        this.a = str;
        this.b = connectionMode;
        this.c = str2;
        this.d = str3;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    @Override // o.fc3
    public final void b(Context context) {
        ut6 ut6Var;
        au6 au6Var;
        context.getClass();
        wi6.a();
        if (this.b != ConnectionMode.RemoteSupport) {
            return;
        }
        int i = ut6.h;
        Settings.i.n();
        String str = this.a;
        DyngateID dyngateIDZ = ep1.z(str);
        if (dyngateIDZ.IsValid()) {
            if (Settings.e().equals(dyngateIDZ)) {
                ye4.c("SessionLoginDataOutgoingTVC", "Tried to connect to own ID.");
                Context context2 = d82.M;
                if (context2 != null) {
                    d82.t(context2, R.string.tv_IDS_STATUS_ConnectToOwnID);
                } else {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                }
            } else {
                String string = dyngateIDZ.toString();
                string.getClass();
                ut6Var = new ut6(string, this.c, this.d);
            }
            if (ut6Var == null) {
                ye4.c("ComputerConnector", "creating session failed");
                return;
            }
            if (!ut6Var.c()) {
                ye4.c("Connector", "Invalid login data!");
                return;
            }
            bu7.MAIN.a(new jq(R.string.tv_connectingPleaseWait, new Object[0]));
            au6Var = bt1.b;
            if (au6Var != null) {
                au6Var.h(ut6Var);
            } else {
                im3.e0("instance");
                throw null;
            }
        }
        ye4.c("SessionLoginDataOutgoingTVC", "exception caught on creation: invalid ID - ".concat(str));
        Context context3 = d82.M;
        if (context3 != null) {
            d82.t(context3, R.string.tv_IDS_STATUS_MSG_NOROUTE_IdNotFound);
        } else {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        }
        ut6Var = null;
        if (ut6Var == null) {
            ye4.c("ComputerConnector", "creating session failed");
            return;
        }
        if (!ut6Var.c()) {
            ye4.c("Connector", "Invalid login data!");
            return;
        }
        bu7.MAIN.a(new jq(R.string.tv_connectingPleaseWait, new Object[0]));
        au6Var = bt1.b;
        if (au6Var != null) {
            au6Var.h(ut6Var);
        } else {
            im3.e0("instance");
            throw null;
        }
    }
}
