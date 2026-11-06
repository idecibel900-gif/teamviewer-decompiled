package o;

import com.teamviewer.fcm.swig.NotificationType;
import com.teamviewer.remotecontrolviewmodellib.swig.DeviceAuthenticationCallback;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthConnectionViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationConnectionViewModel;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tr1 extends q30 {
    public static final String f = String.valueOf(NotificationType.DeviceConnectionAuthentication.swigValue());
    public final RemoteControlApplication b;
    public final xk1 c;
    public String d;
    public final sr1 e;

    public tr1(RemoteControlApplication remoteControlApplication, xk1 xk1Var) {
        super(f);
        this.b = remoteControlApplication;
        this.c = xk1Var;
        this.e = new sr1(this);
    }

    public static String b(String str, DyngateID dyngateID) {
        if (!ub7.b0(str)) {
            return to7.k(str, " (", dyngateID.toFormattedId(), ")");
        }
        String formattedId = dyngateID.toFormattedId();
        formattedId.getClass();
        return formattedId;
    }

    @Override // o.q30
    public final void a(Map map, tq4 tq4Var) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        ye4.a("DeviceAuthenticationNotificationHandler", "Device authentication notification received");
        ll2 ll2Var = (ll2) this.c.n;
        if (ll2Var != null) {
            ((io.sentry.l6) ll2Var.f1375o).z(ll2Var.m);
        }
        c36 c36Var = zu1.c;
        ur1 ur1VarF = c36Var != null ? c36Var.f() : null;
        this.d = String.valueOf(map.get("registrationId"));
        String str = (String) map.get("encryptedPayload");
        if (str == null) {
            ye4.c("DeviceAuthenticationNotificationHandler", "Notification Payload is null");
            return;
        }
        if (ur1VarF != null) {
            String str2 = this.d;
            if (str2 == null) {
                im3.e0("registrationUuid");
                throw null;
            }
            sr1 sr1Var = this.e;
            sr1Var.getClass();
            String strF = it1.F(ur1VarF.n, str2);
            if (strF != null) {
                IDeviceAuthenticationConnectionViewModel iDeviceAuthenticationConnectionViewModel = ur1VarF.f2241o;
                IDeviceAuthConnectionViewModelSWIGJNI.IDeviceAuthenticationConnectionViewModel_DecryptPayload(iDeviceAuthenticationConnectionViewModel.a, iDeviceAuthenticationConnectionViewModel, DeviceAuthenticationCallback.getCPtr((DeviceAuthenticationCallback) sr1Var), sr1Var, strF, str);
            }
        }
    }
}
