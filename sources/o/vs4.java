package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoredDeviceAlarmSumsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoredDeviceAlarmSumsViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public final class vs4 extends oe8 implements sb3 {
    public final IMonitoredDeviceAlarmSumsViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nw4 f2341o = new nw4();
    public final nw4 p = new nw4();
    public final nw4 q = new nw4();
    public final VoidSignalCallback r;

    public vs4(IMonitoredDeviceAlarmSumsViewModel iMonitoredDeviceAlarmSumsViewModel) {
        this.n = iMonitoredDeviceAlarmSumsViewModel;
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new vm3((Object) this, (byte) 9));
        this.r = voidSignalCallback;
        V0();
        IMonitoredDeviceAlarmSumsViewModelSWIGJNI.IMonitoredDeviceAlarmSumsViewModel_RegisterForChanges(iMonitoredDeviceAlarmSumsViewModel.a, iMonitoredDeviceAlarmSumsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.oe8
    public final void U0() {
        this.r.Disconnect();
        this.n.a();
    }

    public final void V0() {
        IMonitoredDeviceAlarmSumsViewModel iMonitoredDeviceAlarmSumsViewModel = this.n;
        this.f2341o.postValue(Integer.valueOf((int) IMonitoredDeviceAlarmSumsViewModelSWIGJNI.IMonitoredDeviceAlarmSumsViewModel_GetAcknowledgedAlarmsNumber(iMonitoredDeviceAlarmSumsViewModel.a, iMonitoredDeviceAlarmSumsViewModel)));
        this.p.postValue(Integer.valueOf((int) IMonitoredDeviceAlarmSumsViewModelSWIGJNI.IMonitoredDeviceAlarmSumsViewModel_GetFailedAlarmsNumber(iMonitoredDeviceAlarmSumsViewModel.a, iMonitoredDeviceAlarmSumsViewModel)));
        this.q.postValue(Integer.valueOf((int) IMonitoredDeviceAlarmSumsViewModelSWIGJNI.IMonitoredDeviceAlarmSumsViewModel_GetAlarmsNumber(iMonitoredDeviceAlarmSumsViewModel.a, iMonitoredDeviceAlarmSumsViewModel)));
    }
}
