package o;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.teamviewer.remotecontrolviewmodellib.swig.DeviceAuthViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthConnectionRequestFragmentViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationConnectionRequestFragmentViewModel;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/qr1;", "Lo/ut2;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qr1 extends ut2 {
    public rr1 p0;

    @Override // o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        Bundle bundle2 = this.r;
        if (bundle2 != null) {
            final c36 c36Var = zu1.c;
            if (c36Var == null) {
                hk0.g("Required value was null.");
                return;
            }
            final DyngateID dyngateIDFromLong = DyngateID.FromLong(bundle2.getLong("ARG_SOURCE_DYNGATE_ID"));
            dyngateIDFromLong.getClass();
            final DyngateID dyngateIDFromLong2 = DyngateID.FromLong(bundle2.getLong("ARG_DESTINATION_DYNGATE_ID"));
            dyngateIDFromLong2.getClass();
            final int i = bundle2.getInt("ARG_SESSION_IDENTIFIER");
            String string = bundle2.getString("ARG_DEVICE_NAME");
            if (string == null) {
                string = "";
            }
            final String string2 = bundle2.getString("ARG_REGISTRATION_UUID");
            if (string2 == null) {
                string2 = "";
            }
            final String string3 = bundle2.getString("ARG_NONCE");
            if (string3 == null) {
                string3 = "";
            }
            final long j = bundle2.getLong("ARG_TIME_RECEIVED");
            final String str = string;
            dl5 dl5Var = new dl5(new Function0() { // from class: o.u26
                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel;
                    SharedPreferences sharedPreferences = c36Var.b;
                    long jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationConnectionRequestFragmentViewModel = DeviceAuthViewModelFactorySWIGJNI.DeviceAuthenticationViewModelFactory_GetDeviceAuthenticationConnectionRequestFragmentViewModel();
                    if (jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationConnectionRequestFragmentViewModel == 0) {
                        iDeviceAuthenticationConnectionRequestFragmentViewModel = null;
                    } else {
                        IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel2 = new IDeviceAuthenticationConnectionRequestFragmentViewModel();
                        iDeviceAuthenticationConnectionRequestFragmentViewModel2.b = true;
                        iDeviceAuthenticationConnectionRequestFragmentViewModel2.a = jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationConnectionRequestFragmentViewModel;
                        iDeviceAuthenticationConnectionRequestFragmentViewModel = iDeviceAuthenticationConnectionRequestFragmentViewModel2;
                    }
                    iDeviceAuthenticationConnectionRequestFragmentViewModel.getClass();
                    return new rr1(sharedPreferences, iDeviceAuthenticationConnectionRequestFragmentViewModel, dyngateIDFromLong, dyngateIDFromLong2, i, str, string2, string3, j);
                }
            }, (byte) 2);
            ve8 y = getY();
            bf1 bf1VarK = h57.k(this);
            pn5 pn5VarT = ua5.t(bf1VarK, y, dl5Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(rr1.class);
            String strC = wt3VarB.c();
            if (strC != null) {
                this.p0 = (rr1) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
            } else {
                hk0.g("Local and anonymous classes can not be ViewModels");
            }
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final byte b = 0;
        final View viewInflate = layoutInflater.inflate(R.layout.fragment_device_authentication_connection_request, viewGroup, false);
        viewInflate.getClass();
        TextView textView = (TextView) viewInflate.findViewById(R.id.device_authentication_connection_request_from_teamviewer_id_text);
        rr1 rr1Var = this.p0;
        if (rr1Var == null) {
            im3.e0("viewModel");
            throw null;
        }
        textView.setText(J(R.string.tv_device_authentication_connection_request_teamviewer_id, rr1Var.p.toFormattedId()));
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.device_authentication_connection_request_to_text);
        rr1 rr1Var2 = this.p0;
        if (rr1Var2 == null) {
            im3.e0("viewModel");
            throw null;
        }
        textView2.setText(J(R.string.tv_device_authentication_connection_request_to, rr1Var2.u));
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.device_authentication_connection_request_to_teamviewer_id_text);
        rr1 rr1Var3 = this.p0;
        if (rr1Var3 == null) {
            im3.e0("viewModel");
            throw null;
        }
        textView3.setText(J(R.string.tv_device_authentication_connection_request_teamviewer_id, rr1Var3.q.toFormattedId()));
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.device_authentication_connection_request_time_text);
        rr1 rr1Var4 = this.p0;
        if (rr1Var4 == null) {
            im3.e0("viewModel");
            throw null;
        }
        textView4.setText(rr1Var4.v);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.device_authentication_connection_request_date_text);
        rr1 rr1Var5 = this.p0;
        if (rr1Var5 == null) {
            im3.e0("viewModel");
            throw null;
        }
        textView5.setText(rr1Var5.w);
        ((Button) viewInflate.findViewById(R.id.device_authentication_connection_request_deny_button)).setOnClickListener(new View.OnClickListener(this) { // from class: o.pr1
            public final /* synthetic */ qr1 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
                byte b2 = b;
                View view2 = viewInflate;
                qr1 qr1Var = this.n;
                switch (b2) {
                    case 0:
                        if (qr1Var.p0 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        if (!l25.b()) {
                            int[] iArr = f37.s;
                            f37.g(view2, view2.getResources().getText(R.string.tv_device_authentication_internet_not_available), 0).i();
                            return;
                        }
                        rr1 rr1Var6 = qr1Var.p0;
                        if (rr1Var6 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        rr1Var6.V0(1);
                        rr1 rr1Var7 = qr1Var.p0;
                        if (rr1Var7 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel = rr1Var7.f1941o;
                        IDeviceAuthConnectionRequestFragmentViewModelSWIGJNI.IDeviceAuthenticationConnectionRequestFragmentViewModel_OnScreenRequestDenied(iDeviceAuthenticationConnectionRequestFragmentViewModel.a, iDeviceAuthenticationConnectionRequestFragmentViewModel);
                        Toast toastMakeText = Toast.makeText(qr1Var.r0(), R.string.tv_device_authentication_connection_denied, 0);
                        toastMakeText.getClass();
                        toastMakeText.show();
                        qr1Var.p0().finish();
                        return;
                    default:
                        if (qr1Var.p0 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        if (!l25.b()) {
                            int[] iArr2 = f37.s;
                            f37.g(view2, view2.getResources().getText(R.string.tv_device_authentication_internet_not_available), 0).i();
                            return;
                        }
                        rr1 rr1Var8 = qr1Var.p0;
                        if (rr1Var8 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        rr1Var8.V0(0);
                        rr1 rr1Var9 = qr1Var.p0;
                        if (rr1Var9 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel2 = rr1Var9.f1941o;
                        IDeviceAuthConnectionRequestFragmentViewModelSWIGJNI.IDeviceAuthenticationConnectionRequestFragmentViewModel_OnScreenRequestAllowed(iDeviceAuthenticationConnectionRequestFragmentViewModel2.a, iDeviceAuthenticationConnectionRequestFragmentViewModel2);
                        Toast toastMakeText2 = Toast.makeText(qr1Var.r0(), R.string.tv_device_authentication_connection_allowed, 0);
                        toastMakeText2.getClass();
                        toastMakeText2.show();
                        qr1Var.p0().finish();
                        return;
                }
            }
        });
        final byte b2 = 1;
        ((Button) viewInflate.findViewById(R.id.device_authentication_connection_request_allow_button)).setOnClickListener(new View.OnClickListener(this) { // from class: o.pr1
            public final /* synthetic */ qr1 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
                byte b3 = b2;
                View view2 = viewInflate;
                qr1 qr1Var = this.n;
                switch (b3) {
                    case 0:
                        if (qr1Var.p0 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        if (!l25.b()) {
                            int[] iArr = f37.s;
                            f37.g(view2, view2.getResources().getText(R.string.tv_device_authentication_internet_not_available), 0).i();
                            return;
                        }
                        rr1 rr1Var6 = qr1Var.p0;
                        if (rr1Var6 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        rr1Var6.V0(1);
                        rr1 rr1Var7 = qr1Var.p0;
                        if (rr1Var7 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel = rr1Var7.f1941o;
                        IDeviceAuthConnectionRequestFragmentViewModelSWIGJNI.IDeviceAuthenticationConnectionRequestFragmentViewModel_OnScreenRequestDenied(iDeviceAuthenticationConnectionRequestFragmentViewModel.a, iDeviceAuthenticationConnectionRequestFragmentViewModel);
                        Toast toastMakeText = Toast.makeText(qr1Var.r0(), R.string.tv_device_authentication_connection_denied, 0);
                        toastMakeText.getClass();
                        toastMakeText.show();
                        qr1Var.p0().finish();
                        return;
                    default:
                        if (qr1Var.p0 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        if (!l25.b()) {
                            int[] iArr2 = f37.s;
                            f37.g(view2, view2.getResources().getText(R.string.tv_device_authentication_internet_not_available), 0).i();
                            return;
                        }
                        rr1 rr1Var8 = qr1Var.p0;
                        if (rr1Var8 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        rr1Var8.V0(0);
                        rr1 rr1Var9 = qr1Var.p0;
                        if (rr1Var9 == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel2 = rr1Var9.f1941o;
                        IDeviceAuthConnectionRequestFragmentViewModelSWIGJNI.IDeviceAuthenticationConnectionRequestFragmentViewModel_OnScreenRequestAllowed(iDeviceAuthenticationConnectionRequestFragmentViewModel2.a, iDeviceAuthenticationConnectionRequestFragmentViewModel2);
                        Toast toastMakeText2 = Toast.makeText(qr1Var.r0(), R.string.tv_device_authentication_connection_allowed, 0);
                        toastMakeText2.getClass();
                        toastMakeText2.show();
                        qr1Var.p0().finish();
                        return;
                }
            }
        });
        return viewInflate;
    }

    @Override // o.ut2
    public final void k0(View view, Bundle bundle) {
        view.getClass();
        rr1 rr1Var = this.p0;
        if (rr1Var == null) {
            im3.e0("viewModel");
            throw null;
        }
        IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel = rr1Var.f1941o;
        IDeviceAuthConnectionRequestFragmentViewModelSWIGJNI.IDeviceAuthenticationConnectionRequestFragmentViewModel_OnConnectionRequestScreenShown(iDeviceAuthenticationConnectionRequestFragmentViewModel.a, iDeviceAuthenticationConnectionRequestFragmentViewModel);
    }
}
