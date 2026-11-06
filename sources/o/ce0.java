package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.IntSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public final class ce0 extends oe8 {
    public final PLManagerGroupsListV2ViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jk0 f517o;
    public final nw4 p;
    public final nw4 q;
    public final be0 r;

    public ce0(PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel) {
        jk0 jk0Var = new jk0((byte) 27);
        q85 q85Var = q85.a;
        this.n = pLManagerGroupsListV2ViewModel;
        this.f517o = jk0Var;
        this.p = new nw4();
        this.q = new nw4();
        be0 be0Var = new be0(this, (byte) 0);
        this.r = be0Var;
        if (pLManagerGroupsListV2ViewModel != null) {
            PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_NotifyManagedGroupsListChanged(pLManagerGroupsListV2ViewModel.a, pLManagerGroupsListV2ViewModel, IntSignalCallback.getCPtr((IntSignalCallback) be0Var), be0Var);
        }
    }

    @Override // o.oe8
    public final void U0() {
        this.r.Disconnect();
        PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = this.n;
        if (pLManagerGroupsListV2ViewModel != null) {
            pLManagerGroupsListV2ViewModel.a();
        }
    }

    public final int V0(String str) {
        str.getClass();
        PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = this.n;
        if (pLManagerGroupsListV2ViewModel != null) {
            return (int) PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_GetOnlineDevicesCount(pLManagerGroupsListV2ViewModel.a, pLManagerGroupsListV2ViewModel, str);
        }
        return 0;
    }
}
