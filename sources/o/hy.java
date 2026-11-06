package o;

import com.teamviewer.teamviewerlib.network.NativeNetwork;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvnetwork.INetworkControl;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class hy {
    public hy() {
        Settings.i.n();
    }

    public final void a(String str) {
        String string;
        str.getClass();
        ov6 ov6Var = ov6.P_MID_ATTRACTION_GUID;
        String strD = Settings.d(ov6Var);
        if (str.length() == 0) {
            string = "";
        } else {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            string = UUID.fromString(lowerCase).toString();
            string.getClass();
        }
        if (string.equals(strD)) {
            return;
        }
        if (string.length() == 0) {
            ye4.a("AttractionGuidUiModel", "Reset attraction guid");
        } else {
            ye4.a("AttractionGuidUiModel", "Set attraction guid to ".concat(string));
        }
        Settings.h(ov6Var, string);
        if (l25.a() != null) {
            ye4.a("KeepAlive", "Stop");
            INetworkControl iNetworkControl = NativeNetwork.b;
            if (iNetworkControl != null) {
                iNetworkControl.StopKeepAlive();
            } else {
                ye4.a("NativeNetwork", "stopKeepAlive(): NetworkControl not initialized");
            }
        }
        ww3 ww3VarA = l25.a();
        if (ww3VarA != null) {
            ww3VarA.c();
        }
    }
}
