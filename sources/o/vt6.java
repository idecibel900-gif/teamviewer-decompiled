package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class vt6 {
    public static wt6 a(int i, String str, String str2, String str3) {
        int i2 = wt6.k;
        String str4 = (i & 8) != 0 ? null : str3;
        Settings.i.n();
        str.getClass();
        DyngateID dyngateIDZ = ep1.z(str);
        if (!dyngateIDZ.IsValid()) {
            ye4.c("SessionLoginDataRemoteControl", "exception caught on creation: invalid ID - ".concat(str));
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_IDS_STATUS_MSG_NOROUTE_IdNotFound);
                return null;
            }
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return null;
        }
        if (!Settings.e().equals(dyngateIDZ)) {
            String string = dyngateIDZ.toString();
            string.getClass();
            if (str2 == null) {
                str2 = "";
            }
            return new wt6(string, str2, false, false, false, null, str4);
        }
        ye4.c("SessionLoginDataRemoteControl", "Tried to connect to own ID.");
        Context context2 = d82.M;
        if (context2 != null) {
            d82.t(context2, R.string.tv_IDS_STATUS_ConnectToOwnID);
            return null;
        }
        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        return null;
    }

    public static wt6 b(long j, String str, String str2) {
        int i = wt6.k;
        Settings.i.n();
        DyngateID dyngateIDZ = ep1.z(str);
        if (!dyngateIDZ.IsValid()) {
            ye4.c("SessionLoginDataRemoteControl", "exception caught on creation: invalid ID - ".concat(str));
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_IDS_STATUS_MSG_NOROUTE_IdNotFound);
                return null;
            }
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return null;
        }
        if (!Settings.e().equals(dyngateIDZ)) {
            String string = dyngateIDZ.toString();
            string.getClass();
            if (str2 == null) {
                str2 = "";
            }
            return new wt6(string, str2, false, true, false, Long.valueOf(j), null);
        }
        ye4.c("SessionLoginDataRemoteControl", "Tried to connect to own ID.");
        Context context2 = d82.M;
        if (context2 != null) {
            d82.t(context2, R.string.tv_IDS_STATUS_ConnectToOwnID);
            return null;
        }
        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        return null;
    }

    public static wt6 c(String str) {
        int i = wt6.k;
        Settings.i.n();
        str.getClass();
        DyngateID dyngateIDZ = ep1.z(str);
        if (!dyngateIDZ.IsValid()) {
            ye4.c("SessionLoginDataRemoteControl", "exception caught on creation: invalid ID - ".concat(str));
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_IDS_STATUS_MSG_NOROUTE_IdNotFound);
                return null;
            }
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return null;
        }
        if (!Settings.e().equals(dyngateIDZ)) {
            String string = dyngateIDZ.toString();
            string.getClass();
            return new wt6(string, "", true, false, false, null, null);
        }
        ye4.c("SessionLoginDataRemoteControl", "Tried to connect to own ID.");
        Context context2 = d82.M;
        if (context2 != null) {
            d82.t(context2, R.string.tv_IDS_STATUS_ConnectToOwnID);
            return null;
        }
        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        return null;
    }
}
