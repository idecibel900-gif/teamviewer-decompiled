package o;

import com.teamviewer.remotecontrollib.swig.AccountViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public final class f5 extends oe8 {
    public final LicenseViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l97 f769o;
    public final t36 p;
    public final VoidSignalCallback q;

    public f5(LicenseViewModel licenseViewModel) {
        this.n = licenseViewModel;
        l97 l97VarK = im3.k(new d5(null, null, null));
        this.f769o = l97VarK;
        this.p = yo1.u(l97VarK);
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y(this, (byte) 2));
        this.q = voidSignalCallback;
        LicenseViewModelSWIGJNI.LicenseViewModel_RegisterForChanges(licenseViewModel.a, licenseViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        V0();
    }

    @Override // o.oe8
    public final void U0() {
        this.q.Disconnect();
        this.n.a();
    }

    public final void V0() {
        LicenseViewModel licenseViewModel = this.n;
        String strLicenseViewModel_GetAccountName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountName(licenseViewModel.a, licenseViewModel);
        l97 l97Var = this.f769o;
        if (strLicenseViewModel_GetAccountName == null || strLicenseViewModel_GetAccountName.length() == 0) {
            ((d5) l97Var.getValue()).getClass();
            d5 d5Var = new d5(null, null, null);
            l97Var.getClass();
            l97Var.l(null, d5Var);
            return;
        }
        ((d5) l97Var.getValue()).getClass();
        String strLicenseViewModel_GetLicenseSimpleName = LicenseViewModelSWIGJNI.LicenseViewModel_GetLicenseSimpleName(licenseViewModel.a, licenseViewModel);
        String strAccountViewModelFactory_GetPictureUrl = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetPictureUrl();
        strAccountViewModelFactory_GetPictureUrl.getClass();
        l97Var.l(null, new d5(strLicenseViewModel_GetAccountName, strLicenseViewModel_GetLicenseSimpleName, strAccountViewModelFactory_GetPictureUrl));
    }
}
