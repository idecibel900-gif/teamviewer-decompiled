package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public final class zd0 extends oe8 implements x93 {
    public final PLManagerDevicesV2ViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jk0 f2690o;
    public final nw4 p;
    public final nw4 q;
    public final nw4 r;
    public final VoidSignalCallback s;

    public zd0(PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel) {
        jk0 jk0Var = new jk0((byte) 27);
        q85 q85Var = q85.a;
        this.n = pLManagerDevicesV2ViewModel;
        this.f2690o = jk0Var;
        this.p = new nw4();
        this.q = new nw4();
        this.r = new nw4();
        this.s = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y(this, (byte) 19));
    }

    @Override // o.oe8
    public final void U0() {
        this.s.Disconnect();
        PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = this.n;
        if (pLManagerDevicesV2ViewModel != null) {
            PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_CleanUp(pLManagerDevicesV2ViewModel.a, pLManagerDevicesV2ViewModel);
        }
        if (pLManagerDevicesV2ViewModel != null) {
            pLManagerDevicesV2ViewModel.a();
        }
    }

    public final int V0() {
        PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = this.n;
        if (pLManagerDevicesV2ViewModel != null) {
            return (int) PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_GetOnlineDevicesSize(pLManagerDevicesV2ViewModel.a, pLManagerDevicesV2ViewModel);
        }
        return 0;
    }
}
