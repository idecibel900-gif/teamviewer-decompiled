package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthConnectionRequestFragmentViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationConnectionRequestFragmentViewModel;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.text.DateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class rr1 extends oe8 {
    public final SharedPreferences n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IDeviceAuthenticationConnectionRequestFragmentViewModel f1941o;
    public final DyngateID p;
    public final DyngateID q;
    public final int r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;

    public rr1(SharedPreferences sharedPreferences, IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel, DyngateID dyngateID, DyngateID dyngateID2, int i, String str, String str2, String str3, long j) {
        sharedPreferences.getClass();
        this.n = sharedPreferences;
        this.f1941o = iDeviceAuthenticationConnectionRequestFragmentViewModel;
        this.p = dyngateID;
        this.q = dyngateID2;
        this.r = i;
        this.s = str2;
        this.t = str3;
        this.u = str;
        String str4 = DateFormat.getTimeInstance().format(Long.valueOf(j));
        str4.getClass();
        this.v = str4;
        String str5 = DateFormat.getDateInstance(1).format(Long.valueOf(j));
        str5.getClass();
        this.w = str5;
    }

    @Override // o.oe8
    public final void U0() {
        this.f1941o.a();
    }

    public final void V0(int i) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strF = it1.F(this.n, this.s);
        if (strF == null || ub7.b0(strF)) {
            ye4.c("DeviceAuthenticationConnectionRequestFragmentViewModel", "Unable to get MFA key");
            return;
        }
        IDeviceAuthenticationConnectionRequestFragmentViewModel iDeviceAuthenticationConnectionRequestFragmentViewModel = this.f1941o;
        long j = iDeviceAuthenticationConnectionRequestFragmentViewModel.a;
        DyngateID dyngateID = this.q;
        IDeviceAuthConnectionRequestFragmentViewModelSWIGJNI.IDeviceAuthenticationConnectionRequestFragmentViewModel_SendConnectionResponse(j, iDeviceAuthenticationConnectionRequestFragmentViewModel, DyngateID.getCPtr(dyngateID), dyngateID, this.r, this.t, strF, i);
    }
}
