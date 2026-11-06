package o;

import android.view.View;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.EndpointActivationResponseCode;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.RemoteAccessEndpointActivationSignalCallbackImpl;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class pe0 extends RemoteAccessEndpointActivationSignalCallbackImpl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pe0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.RemoteAccessEndpointActivationSignalCallback
    public final void OnCallback(EndpointActivationResponseCode endpointActivationResponseCode) {
        byte b = this.a;
        ye4 ye4Var = ye4.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qe0 qe0Var = (qe0) obj;
                View view = qe0Var.m;
                endpointActivationResponseCode.getClass();
                ye4Var.b("BuddyLPItemViewHolder", "activateRemoteAccessEndpointCallback callback: " + endpointActivationResponseCode);
                switch (endpointActivationResponseCode) {
                    case OnSuccess:
                        g1 g1Var = qe0Var.P;
                        if (g1Var != null) {
                            g1Var.Z0();
                        }
                        break;
                    case OnErrorEndpointAlreadyActivated:
                        qe0Var.u(R.string.tv_activate_endpoint_already_activated_text);
                        break;
                    case OnErrorNoLicenseAvailable:
                        qe0Var.u(R.string.tv_activate_endpoint_no_license_available_text);
                        break;
                    case OnErrorNoFreeEndpointsAvailable:
                        String string = view.getResources().getString(R.string.tv_activate_endpoint_no_free_endpoints_available_text);
                        string.getClass();
                        qe0Var.t(string);
                        break;
                    case OnErrorNoRemainingActivationsLeft:
                        String string2 = view.getResources().getString(R.string.tv_activate_endpoint_no_remaining_activations_left_text);
                        string2.getClass();
                        qe0Var.t(string2);
                        break;
                    case OnErrorNoRemainingActivationsLeftRemoteWorker:
                        String string3 = view.getResources().getString(R.string.tv_activate_endpoint_no_remaining_activations_left_remoteworker_text);
                        string3.getClass();
                        qe0Var.t(string3);
                        break;
                    case OnErrorUndefined:
                        qe0Var.u(R.string.tv_activate_endpoint_undefined_error);
                        ye4.c("BuddyLPItemViewHolder", "activateRemoteAccessEndpointCallback callback: OnErrorUndefined");
                        break;
                    default:
                        gk0.s();
                        break;
                }
                break;
            case 1:
                fv1 fv1Var = (fv1) obj;
                endpointActivationResponseCode.getClass();
                ye4Var.b("Device Options", "activateRemoteAccessEndpointCallback callback: " + endpointActivationResponseCode);
                switch (endpointActivationResponseCode) {
                    case OnSuccess:
                        int i = fv1.O0;
                        va3 va3Var = fv1Var.s0;
                        if (va3Var != null) {
                            ((iv1) va3Var).f1105o.Z0();
                        }
                        break;
                    case OnErrorEndpointAlreadyActivated:
                        fv1Var.J0(R.string.tv_activate_endpoint_already_activated_text);
                        break;
                    case OnErrorNoLicenseAvailable:
                        fv1Var.J0(R.string.tv_activate_endpoint_no_license_available_text);
                        break;
                    case OnErrorNoFreeEndpointsAvailable:
                        String strI = fv1Var.I(R.string.tv_activate_endpoint_no_free_endpoints_available_text);
                        strI.getClass();
                        fv1Var.I0(strI);
                        break;
                    case OnErrorNoRemainingActivationsLeft:
                        String strI2 = fv1Var.I(R.string.tv_activate_endpoint_no_remaining_activations_left_text);
                        strI2.getClass();
                        fv1Var.I0(strI2);
                        break;
                    case OnErrorNoRemainingActivationsLeftRemoteWorker:
                        String strI3 = fv1Var.I(R.string.tv_activate_endpoint_no_remaining_activations_left_remoteworker_text);
                        strI3.getClass();
                        fv1Var.I0(strI3);
                        break;
                    case OnErrorUndefined:
                        fv1Var.J0(R.string.tv_activate_endpoint_undefined_error);
                        ye4.c("Device Options", "activateRemoteAccessEndpointCallback callback: OnErrorUndefined");
                        break;
                    default:
                        gk0.s();
                        break;
                }
                break;
            default:
                endpointActivationResponseCode.getClass();
                ((al4) obj).invoke(endpointActivationResponseCode);
                break;
        }
    }
}
