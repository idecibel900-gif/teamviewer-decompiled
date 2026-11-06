package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public abstract class qt6 {
    public static rt6 a(String str, String str2) {
        DyngateID dyngateIDZ = ep1.z(str);
        if (!dyngateIDZ.IsValid()) {
            ye4.c("SessionLoginDataFiletransfer", "exception caught on creation: invalid ID - ".concat(str));
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_IDS_STATUS_MSG_NOROUTE_IdNotFound);
                return null;
            }
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return null;
        }
        Settings.i.n();
        if (Settings.e().equals(dyngateIDZ)) {
            ye4.c("SessionLoginDataFiletransfer", "Tried to connect to own ID.");
            Context context2 = d82.M;
            if (context2 != null) {
                d82.t(context2, R.string.tv_IDS_STATUS_ConnectToOwnID);
                return null;
            }
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return null;
        }
        String string = dyngateIDZ.toString();
        string.getClass();
        if (str2 == null) {
            str2 = "";
        }
        rt6 rt6Var = new rt6(string, str2);
        rt6Var.f = "";
        return rt6Var;
    }
}
