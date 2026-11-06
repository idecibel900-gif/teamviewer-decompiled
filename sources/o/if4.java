package o;

import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class if4 extends oe8 implements ib3 {
    public final ILoginStateAwareContainerViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LicenseViewModel f1056o;
    public final LinkedHashSet p = new LinkedHashSet();
    public final VoidSignalCallback q;

    public if4(ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel, LicenseViewModel licenseViewModel) {
        this.n = iLoginStateAwareContainerViewModel;
        this.f1056o = licenseViewModel;
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new vm3(this, (byte) 6));
        this.q = voidSignalCallback;
        ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_RegisterForChanges(iLoginStateAwareContainerViewModel.a, iLoginStateAwareContainerViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.oe8
    public final void U0() {
        this.q.Disconnect();
        this.n.a();
        this.f1056o.a();
    }
}
