package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthQrScannerActivityViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationInstructionsFragmentViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationQrScannerActivityViewModel;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class yr1 extends oe8 {
    public final SharedPreferences n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IDeviceAuthenticationQrScannerActivityViewModel f2633o;
    public final IDeviceAuthenticationInstructionsFragmentViewModel p;
    public String q;
    public String r;
    public long s;
    public DyngateID t;
    public Boolean u;
    public final yx6 v;

    public yr1(SharedPreferences sharedPreferences, IDeviceAuthenticationQrScannerActivityViewModel iDeviceAuthenticationQrScannerActivityViewModel, IDeviceAuthenticationInstructionsFragmentViewModel iDeviceAuthenticationInstructionsFragmentViewModel) {
        sharedPreferences.getClass();
        this.n = sharedPreferences;
        this.f2633o = iDeviceAuthenticationQrScannerActivityViewModel;
        this.p = iDeviceAuthenticationInstructionsFragmentViewModel;
        DyngateID dyngateIDInvalidDyngateID = DyngateID.InvalidDyngateID();
        dyngateIDInvalidDyngateID.getClass();
        this.t = dyngateIDInvalidDyngateID;
        this.v = au8.l(0, 7, null);
    }

    @Override // o.oe8
    public final void U0() {
        this.f2633o.a();
        this.p.a();
    }

    public final void V0() {
        IDeviceAuthenticationQrScannerActivityViewModel iDeviceAuthenticationQrScannerActivityViewModel = this.f2633o;
        IDeviceAuthQrScannerActivityViewModelSWIGJNI.IDeviceAuthenticationQrScannerActivityViewModel_ReportQrCodeIsInvalid(iDeviceAuthenticationQrScannerActivityViewModel.a, iDeviceAuthenticationQrScannerActivityViewModel);
    }
}
