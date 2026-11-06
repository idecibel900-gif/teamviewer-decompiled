package o;

import com.teamviewer.fcm.swig.NotificationType;
import com.teamviewer.remotecontrollib.swig.AccountViewModelBase;
import com.teamviewer.remotecontrollib.swig.LoginState;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.settings.Settings;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n38 extends q30 {
    public final RemoteControlApplication b;
    public boolean c;
    public final LinkedList d;
    public final AccountViewModelBase e;
    public final k6 f;
    public final z11 g;

    public n38(RemoteControlApplication remoteControlApplication) {
        super(String.valueOf(NotificationType.TrustedDeviceAuthentication.swigValue()));
        this.b = remoteControlApplication;
        this.d = new LinkedList();
        k6 k6Var = new k6((Object) this, (byte) 5);
        this.f = k6Var;
        AccountViewModelBase accountViewModelBaseG = di1.g();
        this.e = accountViewModelBaseG;
        if (accountViewModelBaseG != null) {
            accountViewModelBaseG.b(k6Var);
        }
        this.g = new z11(this, (byte) 3);
    }

    @Override // o.q30
    public final void a(Map map, tq4 tq4Var) {
        ye4.a("TrustedDeviceNotificationHandler", "Trusted device notification received");
        String str = (String) map.get("sessionId");
        Integer numO = str != null ? bc7.O(str) : null;
        if (numO == null) {
            ye4.c("TrustedDeviceNotificationHandler", "Invalid session Id");
            return;
        }
        String strValueOf = String.valueOf(map.get("encryptedSessionKey"));
        if (ub7.b0(strValueOf)) {
            ye4.c("TrustedDeviceNotificationHandler", "Invalid encryptedKey");
            return;
        }
        String strValueOf2 = String.valueOf(map.get("encryptedPayload"));
        if (ub7.b0(strValueOf2)) {
            ye4.c("TrustedDeviceNotificationHandler", "Invalid encrypted payload");
            return;
        }
        if (l25.b()) {
            AccountViewModelBase accountViewModelBase = this.e;
            if ((accountViewModelBase != null ? accountViewModelBase.a() : null) == LoginState.LoggedIn) {
                int iIntValue = numO.intValue();
                tk1 tk1Var = g22.a;
                im3.R(hm3.c(ok4.a), null, null, new l38(strValueOf, strValueOf2, this, iIntValue, null), 3);
                return;
            }
        }
        if (!this.c) {
            Settings.i.n().f(this.g);
            this.c = true;
        }
        this.d.add(new k38(numO.intValue(), strValueOf, strValueOf2));
        ye4.a("TrustedDeviceNotificationHandler", "Trust Device request queued for KeepAlive");
    }
}
