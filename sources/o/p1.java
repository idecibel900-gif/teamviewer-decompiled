package o;

import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.StringSignalCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 extends oe8 implements qb3 {
    public final StringSignalCallback A;
    public final VoidSignalCallback B;
    public final IManagedDeviceV2ViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nw4 f1692o;
    public final nw4 p;
    public final nw4 q;
    public final nw4 r;
    public final nw4 s;
    public final nw4 t;
    public final nw4 u;
    public final nw4 v;
    public final nw4 w;
    public final nw4 x;
    public final nw4 y;
    public final nw4 z;

    public p1(IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel) {
        el4 el4Var;
        this.n = iManagedDeviceV2ViewModel;
        nw4 nw4Var = new nw4();
        this.f1692o = nw4Var;
        nw4 nw4Var2 = new nw4();
        this.p = nw4Var2;
        nw4 nw4Var3 = new nw4();
        this.q = nw4Var3;
        nw4 nw4Var4 = new nw4();
        this.r = nw4Var4;
        this.s = new nw4();
        this.t = new nw4();
        this.u = new nw4();
        this.v = new nw4();
        this.w = new nw4();
        this.x = new nw4();
        this.y = new nw4();
        this.z = new nw4();
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        xd0 xd0Var = (xd0) this;
        byte b = 1;
        StringSignalCallback stringSignalCallback = companion.getInstance().stringSignalCallback(new q0(xd0Var, b));
        this.A = stringSignalCallback;
        VoidSignalCallback voidSignalCallback = companion.getInstance().voidSignalCallback(new y(xd0Var, b));
        this.B = voidSignalCallback;
        nw4Var.setValue(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetName(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel));
        yl4 yl4VarA = yl4.a(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetType(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel));
        yl4VarA.getClass();
        int iOrdinal = yl4VarA.ordinal();
        if (iOrdinal == 0) {
            el4Var = el4.m;
        } else {
            if (iOrdinal != 1) {
                gk0.s();
                throw null;
            }
            el4Var = el4.n;
        }
        nw4Var2.setValue(el4Var);
        nw4Var3.setValue(new DyngateID(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetDyngateID(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel), true).toString());
        nw4Var4.setValue(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetManagementID(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel));
        V0();
        IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_registerForChanges(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_registerForNameChanges(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel, StringSignalCallback.getCPtr(stringSignalCallback), stringSignalCallback);
    }

    @Override // o.oe8
    public final void U0() {
        this.B.Disconnect();
        this.A.Disconnect();
        this.n.a();
    }

    public final void V0() {
        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = this.n;
        this.s.setValue(ViewModelOnlineState.swigToEnum(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetOnlineState(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel)));
        this.t.setValue(Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_IsOnline(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel)));
        this.u.setValue(Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowConnect(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel)));
        this.v.setValue(Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowConnect(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel)));
        this.x.setValue(Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowFileTransfer(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel)));
        this.y.setValue(Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowChatTo(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel)));
        this.z.setValue(Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowWakeOnLan(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel)));
        this.w.setValue(Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowConnectRemoteAccess(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel) || IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowActivateRemoteAccessEndpoint(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel)));
    }
}
