package o;

import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.VoidResultCallback;

/* JADX INFO: loaded from: classes.dex */
public final class xd0 extends p1 {
    public final IManagedDeviceV2ViewModel C;
    public final nc0 D;
    public final nw4 E;

    public xd0(IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel, nc0 nc0Var) {
        super(iManagedDeviceV2ViewModel);
        this.C = iManagedDeviceV2ViewModel;
        this.D = nc0Var;
        this.E = new nw4(new ud2(qr4.m));
    }

    public final void W0() {
        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = this.C;
        if (!IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_IsMobileWakeActivated(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel) || ViewModelOnlineState.swigToEnum(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetOnlineState(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel)) != ViewModelOnlineState.OnlineAway) {
            X0();
            return;
        }
        ye4.a("BuddyListManagedDeviceV2ViewModel", "Starting Host app");
        this.E.postValue(new ud2(qr4.n));
        vd0 vd0Var = new vd0(this);
        this.D.getClass();
        IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_TriggerMobileWakeUp(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel, VoidResultCallback.getCPtr((VoidResultCallback) vd0Var), vd0Var);
    }

    public final void X0() {
        gu0 gu0VarN = e8.n(this);
        tk1 tk1Var = g22.a;
        im3.R(gu0VarN, gk1.f901o, null, new wd0(this, null, (byte) 0), 2);
    }
}
