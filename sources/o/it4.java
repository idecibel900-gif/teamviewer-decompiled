package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoringOverviewViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoringOverviewViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public final class it4 extends oe8 implements tb3 {
    public final IMonitoringOverviewViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nw4 f1100o;
    public final nw4 p;
    public int q = 0;
    public final VoidSignalCallback r;

    public it4(IMonitoringOverviewViewModel iMonitoringOverviewViewModel) {
        this.n = iMonitoringOverviewViewModel;
        this.f1100o = new nw4(Long.valueOf(IMonitoringOverviewViewModelSWIGJNI.IMonitoringOverviewViewModel_GetTotalNumberOfEndpoints(iMonitoringOverviewViewModel.a, iMonitoringOverviewViewModel)));
        this.p = new nw4(Long.valueOf(IMonitoringOverviewViewModelSWIGJNI.IMonitoringOverviewViewModel_GetNumberOfUsedEndpoints(iMonitoringOverviewViewModel.a, iMonitoringOverviewViewModel)));
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new vm3((Object) this, (byte) 11));
        this.r = voidSignalCallback;
        IMonitoringOverviewViewModelSWIGJNI.IMonitoringOverviewViewModel_RegisterForChanges(iMonitoringOverviewViewModel.a, iMonitoringOverviewViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.oe8
    public final void U0() {
        this.r.Disconnect();
        this.n.a();
    }
}
