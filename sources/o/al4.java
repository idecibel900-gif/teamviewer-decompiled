package o;

import androidx.appcompat.widget.AppCompatImageView;
import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.EndpointActivationResponseCode;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class al4 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ dl4 n;

    public /* synthetic */ al4(dl4 dl4Var, byte b) {
        this.m = b;
        this.n = dl4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qb3 qb3Var;
        int i;
        byte b = this.m;
        f88 f88Var = f88.a;
        dl4 dl4Var = this.n;
        switch (b) {
            case 0:
                EndpointActivationResponseCode endpointActivationResponseCode = (EndpointActivationResponseCode) obj;
                int i2 = dl4.K0;
                endpointActivationResponseCode.getClass();
                ye4.a.b("ManagedDeviceV2Options", " activateRemoteAccessEndpointCallback callback: " + endpointActivationResponseCode);
                switch (endpointActivationResponseCode) {
                    case OnSuccess:
                        rb3 rb3Var = dl4Var.s0;
                        if (rb3Var == null || (qb3Var = ((rk4) rb3Var).n) == null) {
                            return f88Var;
                        }
                        ((xd0) qb3Var).X0();
                        return f88Var;
                    case OnErrorEndpointAlreadyActivated:
                        dl4Var.J0(R.string.tv_activate_endpoint_already_activated_text);
                        return f88Var;
                    case OnErrorNoLicenseAvailable:
                        dl4Var.J0(R.string.tv_activate_endpoint_no_license_available_text);
                        return f88Var;
                    case OnErrorNoFreeEndpointsAvailable:
                        String strI = dl4Var.I(R.string.tv_activate_endpoint_no_free_endpoints_available_text);
                        strI.getClass();
                        dl4Var.I0(strI);
                        return f88Var;
                    case OnErrorNoRemainingActivationsLeft:
                        String strI2 = dl4Var.I(R.string.tv_activate_endpoint_no_remaining_activations_left_text);
                        strI2.getClass();
                        dl4Var.I0(strI2);
                        return f88Var;
                    case OnErrorNoRemainingActivationsLeftRemoteWorker:
                        String strI3 = dl4Var.I(R.string.tv_activate_endpoint_no_remaining_activations_left_remoteworker_text);
                        strI3.getClass();
                        dl4Var.I0(strI3);
                        return f88Var;
                    case OnErrorUndefined:
                        dl4Var.J0(R.string.tv_activate_endpoint_undefined_error);
                        ye4.c("ManagedDeviceV2Options", "activateRemoteAccessEndpointCallback callback: OnErrorUndefined");
                        return f88Var;
                    default:
                        gk0.s();
                        return null;
                }
            default:
                ViewModelOnlineState viewModelOnlineState = (ViewModelOnlineState) obj;
                AppCompatImageView appCompatImageView = dl4Var.u0;
                if (appCompatImageView != null) {
                    viewModelOnlineState.getClass();
                    int i3 = bl4.b[viewModelOnlineState.ordinal()];
                    if (i3 == 1) {
                        i = R.drawable.online_indicator;
                    } else if (i3 != 2) {
                        i = i3 != 3 ? R.drawable.offline_indicator : R.drawable.busy_indicator;
                    } else {
                        i = R.drawable.away_indicator;
                    }
                    appCompatImageView.setImageResource(i);
                }
                return f88Var;
        }
    }
}
