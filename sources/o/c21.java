package o;

import android.content.Context;
import com.teamviewer.remotecontrolviewlib.service.ConditionalAccessAuthenticationService;
import com.teamviewer.swigcallbacklib.IntSignalOneTimeCallback;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class c21 extends IntSignalOneTimeCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ConditionalAccessAuthenticationService b;

    public /* synthetic */ c21(ConditionalAccessAuthenticationService conditionalAccessAuthenticationService, byte b) {
        this.a = b;
        this.b = conditionalAccessAuthenticationService;
    }

    @Override // com.teamviewer.swigcallbacklib.IntSignalOneTimeCallback
    public final void internalCallback(int i) {
        byte b = this.a;
        ye4 ye4Var = ye4.a;
        ConditionalAccessAuthenticationService conditionalAccessAuthenticationService = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    ye4.a("ConditionalAccessAuthenticationService", "Connection request allowed");
                    Context applicationContext = conditionalAccessAuthenticationService.getApplicationContext();
                    if (applicationContext == null) {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    } else {
                        String string = applicationContext.getString(R.string.conditional_access_authentication_connection_allowed);
                        string.getClass();
                        fx3.r(string, 0, applicationContext, bu7.MAIN);
                    }
                    break;
                } else if (i == 1) {
                    ye4Var.g("ConditionalAccessAuthenticationService", "Connection request allowed failed: Request invalid");
                    Context applicationContext2 = conditionalAccessAuthenticationService.getApplicationContext();
                    if (applicationContext2 == null) {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    } else {
                        String string2 = applicationContext2.getString(R.string.conditional_access_authentication_request_invalid);
                        string2.getClass();
                        fx3.r(string2, 0, applicationContext2, bu7.MAIN);
                    }
                    break;
                } else if (i == 2) {
                    ye4Var.g("ConditionalAccessAuthenticationService", "Connection request allowed failed");
                    break;
                }
                break;
            default:
                if (i == 0) {
                    ye4.a("ConditionalAccessAuthenticationService", "Connection request denied");
                    Context applicationContext3 = conditionalAccessAuthenticationService.getApplicationContext();
                    if (applicationContext3 == null) {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    } else {
                        String string3 = applicationContext3.getString(R.string.conditional_access_authentication_connection_denied);
                        string3.getClass();
                        fx3.r(string3, 0, applicationContext3, bu7.MAIN);
                    }
                    break;
                } else if (i == 1) {
                    ye4Var.g("ConditionalAccessAuthenticationService", "Connection request deny failed: Request invalid");
                    Context applicationContext4 = conditionalAccessAuthenticationService.getApplicationContext();
                    if (applicationContext4 == null) {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    } else {
                        String string4 = applicationContext4.getString(R.string.conditional_access_authentication_request_invalid);
                        string4.getClass();
                        fx3.r(string4, 0, applicationContext4, bu7.MAIN);
                    }
                    break;
                } else if (i == 2) {
                    ye4Var.g("ConditionalAccessAuthenticationService", "Connection request deny failed");
                    break;
                }
                break;
        }
    }
}
