package o;

import com.teamviewer.fcm.swig.NotificationType;
import com.teamviewer.remotecontrollib.swig.AccountViewModelBase;
import com.teamviewer.remotecontrollib.swig.LoginState;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t11 extends q30 {
    public static final String f = String.valueOf(NotificationType.ConditionalAccessConnectionAuthentication.swigValue());
    public final RemoteControlApplication b;
    public LoginState c;
    public final AccountViewModelBase d;
    public final k6 e;

    public t11(RemoteControlApplication remoteControlApplication) {
        super(f);
        this.b = remoteControlApplication;
        k6 k6Var = new k6(this, (byte) 2);
        this.e = k6Var;
        AccountViewModelBase accountViewModelBaseG = di1.g();
        this.d = accountViewModelBaseG;
        if (accountViewModelBaseG != null) {
            accountViewModelBaseG.b(k6Var);
        }
        this.c = accountViewModelBaseG != null ? accountViewModelBaseG.a() : null;
    }

    public static String b(String str, String str2) {
        if (str.length() == 0) {
            return str2;
        }
        return str2.length() == 0 ? str : to7.k(str, " (", str2, ")");
    }

    @Override // o.q30
    public final void a(Map map, tq4 tq4Var) {
        ye4.a("ConditionalAccessAuthenticationNotificationHandler", "Conditional Access authentication notification received");
        String str = (String) map.get("sessionId");
        String str2 = (String) map.get("encryptedSessionKey");
        String str3 = (String) map.get("encryptedPayload");
        if (str != null && str2 != null && str3 != null) {
            tk1 tk1Var = g22.a;
            im3.R(hm3.c(ok4.a), null, null, new s11(str2, str3, this, str, (hc1) null), 3);
        } else {
            if (str == null) {
                ye4.c("ConditionalAccessAuthenticationNotificationHandler", "Notification data missing");
                return;
            }
            RemoteControlApplication remoteControlApplication = this.b;
            remoteControlApplication.getClass();
            new r55(remoteControlApplication).a(18, str);
        }
    }
}
