package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h11 extends oe8 implements ga3 {
    public final ComputerEditViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ComputerDetailsViewModel f940o;
    public boolean p;
    public final nw4 q = new nw4();
    public final HashMap r = new HashMap();
    public final GroupListViewModel s = ds1.l(true);
    public String t = "";
    public final io.sentry.android.core.u0 u = new io.sentry.android.core.u0((byte) 5);
    public final VoidSignalCallback v;

    public h11(ComputerEditViewModel computerEditViewModel, ComputerDetailsViewModel computerDetailsViewModel) {
        this.n = computerEditViewModel;
        this.f940o = computerDetailsViewModel;
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new zz0(this, (byte) 1));
        this.v = voidSignalCallback;
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForDeviceDelete(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.oe8
    public final void U0() {
        this.v.Disconnect();
        this.n.b();
        this.f940o.b();
        this.s.b();
    }
}
