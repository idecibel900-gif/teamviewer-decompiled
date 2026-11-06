package o;

import android.content.ComponentCallbacks;
import com.teamviewer.remotecontrolviewmodellib.swig.ResponseCode;
import com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceResponseSignalCallbackImpl;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.TrustedDeviceService;

/* JADX INFO: loaded from: classes.dex */
public final class q38 extends TrustedDeviceResponseSignalCallbackImpl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ComponentCallbacks b;

    public /* synthetic */ q38(ComponentCallbacks componentCallbacks, byte b) {
        this.a = b;
        this.b = componentCallbacks;
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceResponseSignalCallback
    public final void OnCallback(ResponseCode responseCode) {
        int i;
        byte b = this.a;
        ComponentCallbacks componentCallbacks = this.b;
        switch (b) {
            case 0:
                responseCode.getClass();
                r38 r38Var = (r38) componentCallbacks;
                r38Var.p0().runOnUiThread(new be3(responseCode, r38Var, (byte) 17));
                r38Var.p0().finish();
                break;
            default:
                TrustedDeviceService trustedDeviceService = (TrustedDeviceService) componentCallbacks;
                responseCode.getClass();
                int iOrdinal = responseCode.ordinal();
                if (iOrdinal == 0) {
                    i = R.string.tv_trusted_device_authorize_device_success_text;
                } else if (iOrdinal != 2) {
                    i = iOrdinal != 4 ? R.string.tv_trusted_device_authorize_device_error_unexpected_text : R.string.tv_trusted_device_authorize_device_error_expired_token_text;
                } else {
                    i = R.string.tv_trusted_device_authorize_device_error_invalid_token_text;
                }
                int i2 = TrustedDeviceService.r;
                trustedDeviceService.a(i);
                String string = trustedDeviceService.getString(i);
                string.getClass();
                ye4.a("TrustedDeviceService", string);
                break;
        }
    }
}
