package o;

import android.content.Context;
import com.teamviewer.swigcallbacklib.IntSignalOneTimeCallback;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class n11 extends IntSignalOneTimeCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o11 b;

    public /* synthetic */ n11(o11 o11Var, byte b) {
        this.a = b;
        this.b = o11Var;
    }

    @Override // com.teamviewer.swigcallbacklib.IntSignalOneTimeCallback
    public final void internalCallback(int i) {
        byte b = this.a;
        o11 o11Var = this.b;
        ye4 ye4Var = ye4.a;
        switch (b) {
            case 0:
                if (i == 0) {
                    ye4.a("ConditionalAccessAuthenticationConnectionRequestFragment", "Connection request denied");
                    Context contextR0 = o11Var.r0();
                    String string = contextR0.getString(R.string.conditional_access_authentication_connection_denied);
                    string.getClass();
                    fx3.r(string, 0, contextR0, bu7.MAIN);
                } else if (i == 1) {
                    ye4Var.g("ConditionalAccessAuthenticationConnectionRequestFragment", "Connection request deny failed: Request invalid");
                    Context contextR1 = o11Var.r0();
                    String string2 = contextR1.getString(R.string.conditional_access_authentication_request_invalid);
                    string2.getClass();
                    fx3.r(string2, 0, contextR1, bu7.MAIN);
                } else if (i == 2) {
                    ye4Var.g("ConditionalAccessAuthenticationConnectionRequestFragment", "Connection request deny failed");
                }
                o11Var.p0().finish();
                break;
            default:
                if (i == 0) {
                    ye4.a("ConditionalAccessAuthenticationConnectionRequestFragment", "Connection request allowed");
                    Context contextR2 = o11Var.r0();
                    String string3 = contextR2.getString(R.string.conditional_access_authentication_connection_allowed);
                    string3.getClass();
                    fx3.r(string3, 0, contextR2, bu7.MAIN);
                } else if (i == 1) {
                    ye4Var.g("ConditionalAccessAuthenticationConnectionRequestFragment", "Connection request allowed failed: Request invalid");
                    Context contextR3 = o11Var.r0();
                    String string4 = contextR3.getString(R.string.conditional_access_authentication_request_invalid);
                    string4.getClass();
                    fx3.r(string4, 0, contextR3, bu7.MAIN);
                } else if (i == 2) {
                    ye4Var.g("ConditionalAccessAuthenticationConnectionRequestFragment", "Connection request allowed failed");
                }
                o11Var.p0().finish();
                break;
        }
    }
}
