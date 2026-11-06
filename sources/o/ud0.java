package o;

import com.teamviewer.remotecontrollib.swig.IBuddyListMainViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IPLSynchronizationStateViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IPLSynchronizationStateViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.IntSignalCallback;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ud0 extends oe8 implements w93 {
    public final IBuddyListMainViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final GroupListViewModel f2200o;
    public final IPLSynchronizationStateViewModel p;
    public final PLManagerGroupsListV2ViewModel q;
    public final PLManagerDevicesV2ViewModel r;
    public final wf3 s;
    public final nw4 t = new nw4();
    public final nw4 u = new nw4();
    public final nw4 v = new nw4();
    public final nw4 w;
    public final VoidSignalCallback x;
    public final VoidSignalCallback y;
    public final IntSignalCallback z;

    public ud0(IBuddyListMainViewModel iBuddyListMainViewModel, GroupListViewModel groupListViewModel, IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel, PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel, PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel, wf3 wf3Var) {
        this.n = iBuddyListMainViewModel;
        this.f2200o = groupListViewModel;
        this.p = iPLSynchronizationStateViewModel;
        this.q = pLManagerGroupsListV2ViewModel;
        this.r = pLManagerDevicesV2ViewModel;
        this.s = wf3Var;
        nw4 nw4Var = new nw4();
        this.w = nw4Var;
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        final byte b = 0;
        VoidSignalCallback voidSignalCallback = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.td0
            public final /* synthetic */ ud0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                f88 f88Var = f88.a;
                ud0 ud0Var = this.n;
                switch (b2) {
                    case 0:
                        ud0Var.t.postValue(Boolean.FALSE);
                        break;
                    default:
                        GroupListViewModel groupListViewModel2 = ud0Var.f2200o;
                        IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel2 = ud0Var.p;
                        if (groupListViewModel2 != null && iPLSynchronizationStateViewModel2 != null) {
                            IPLSynchronizationStateViewModelSWIGJNI.IPLSynchronizationStateViewModel_SynchronizationSucceeded(iPLSynchronizationStateViewModel2.a, iPLSynchronizationStateViewModel2);
                            if (GroupListViewModelSWIGJNI.GroupListViewModel_HasGroups(groupListViewModel2.a, groupListViewModel2) || IPLSynchronizationStateViewModelSWIGJNI.IPLSynchronizationStateViewModel_SynchronizationSucceeded(iPLSynchronizationStateViewModel2.a, iPLSynchronizationStateViewModel2)) {
                                ud0Var.t.postValue(Boolean.FALSE);
                            } else {
                                ud0Var.u.postValue(Boolean.FALSE);
                            }
                        }
                        break;
                }
                return f88Var;
            }
        });
        this.x = voidSignalCallback;
        final byte b2 = 1;
        VoidSignalCallback voidSignalCallback2 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.td0
            public final /* synthetic */ ud0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                ud0 ud0Var = this.n;
                switch (b3) {
                    case 0:
                        ud0Var.t.postValue(Boolean.FALSE);
                        break;
                    default:
                        GroupListViewModel groupListViewModel2 = ud0Var.f2200o;
                        IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel2 = ud0Var.p;
                        if (groupListViewModel2 != null && iPLSynchronizationStateViewModel2 != null) {
                            IPLSynchronizationStateViewModelSWIGJNI.IPLSynchronizationStateViewModel_SynchronizationSucceeded(iPLSynchronizationStateViewModel2.a, iPLSynchronizationStateViewModel2);
                            if (GroupListViewModelSWIGJNI.GroupListViewModel_HasGroups(groupListViewModel2.a, groupListViewModel2) || IPLSynchronizationStateViewModelSWIGJNI.IPLSynchronizationStateViewModel_SynchronizationSucceeded(iPLSynchronizationStateViewModel2.a, iPLSynchronizationStateViewModel2)) {
                                ud0Var.t.postValue(Boolean.FALSE);
                            } else {
                                ud0Var.u.postValue(Boolean.FALSE);
                            }
                        }
                        break;
                }
                return f88Var;
            }
        });
        this.y = voidSignalCallback2;
        IntSignalCallback intSignalCallback = companion.getInstance().intSignalCallback(new q0(this, (byte) 20));
        this.z = intSignalCallback;
        if (iPLSynchronizationStateViewModel != null) {
            IPLSynchronizationStateViewModelSWIGJNI.IPLSynchronizationStateViewModel_RegisterForSynchronizationChanges(iPLSynchronizationStateViewModel.a, iPLSynchronizationStateViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
        }
        if (groupListViewModel != null) {
            GroupListViewModelSWIGJNI.GroupListViewModel_RegisterForChanges(groupListViewModel.a, groupListViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        }
        if (pLManagerGroupsListV2ViewModel != null) {
            PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_NotifyManagedGroupsListChanged(pLManagerGroupsListV2ViewModel.a, pLManagerGroupsListV2ViewModel, IntSignalCallback.getCPtr(intSignalCallback), intSignalCallback);
        }
        if (pLManagerDevicesV2ViewModel != null) {
            PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_Init(pLManagerDevicesV2ViewModel.a, pLManagerDevicesV2ViewModel);
        }
        wf3Var.d(new i0(1, nw4Var, nw4.class, "postValue", "postValue(Ljava/lang/Object;)V", 0, (byte) 18));
    }

    @Override // o.oe8
    public final void U0() {
        this.z.Disconnect();
        this.x.Disconnect();
        this.y.Disconnect();
        IBuddyListMainViewModel iBuddyListMainViewModel = this.n;
        if (iBuddyListMainViewModel != null) {
            iBuddyListMainViewModel.a();
        }
        GroupListViewModel groupListViewModel = this.f2200o;
        if (groupListViewModel != null) {
            groupListViewModel.b();
        }
        IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel = this.p;
        if (iPLSynchronizationStateViewModel != null) {
            iPLSynchronizationStateViewModel.a();
        }
        PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = this.q;
        if (pLManagerGroupsListV2ViewModel != null) {
            pLManagerGroupsListV2ViewModel.a();
        }
        PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = this.r;
        if (pLManagerDevicesV2ViewModel != null) {
            pLManagerDevicesV2ViewModel.a();
        }
        this.s.a();
    }
}
