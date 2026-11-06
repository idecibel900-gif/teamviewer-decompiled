package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.VoidResultOneTimeCallback;

/* JADX INFO: loaded from: classes.dex */
public final class vd0 extends VoidResultOneTimeCallback {
    public final /* synthetic */ xd0 a;

    public vd0(xd0 xd0Var) {
        this.a = xd0Var;
    }

    @Override // com.teamviewer.swigcallbacklib.VoidResultOneTimeCallback
    public final void internalOnError() {
        ye4.a("BuddyListManagedDeviceV2ViewModel", "Starting Host app timed out");
        xd0 xd0Var = this.a;
        xd0Var.E.postValue(new ud2(qr4.p));
        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = xd0Var.C;
        IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_DeRegisterMobileWakeUpNotification(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel);
    }

    @Override // com.teamviewer.swigcallbacklib.VoidResultOneTimeCallback
    public final void internalOnSuccess() {
        ye4.a("BuddyListManagedDeviceV2ViewModel", "Host app started");
        xd0 xd0Var = this.a;
        xd0Var.E.postValue(new ud2(qr4.f1857o));
        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = xd0Var.C;
        IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_DeRegisterMobileWakeUpNotification(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel);
        xd0Var.X0();
    }
}
