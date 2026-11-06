package o;

import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public final class tf3 extends oe8 {
    public final IInAppPurchaseViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final yt2 f2105o;
    public final yx6 p;
    public final r36 q;
    public boolean r;
    public boolean s;
    public final VoidSignalCallback t;
    public final VoidSignalCallback u;

    public tf3(IInAppPurchaseViewModel iInAppPurchaseViewModel, yt2 yt2Var) {
        this.n = iInAppPurchaseViewModel;
        this.f2105o = yt2Var;
        yx6 yx6VarL = au8.l(0, 7, null);
        this.p = yx6VarL;
        this.q = new r36(yx6VarL);
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        VoidSignalCallback voidSignalCallback = companion.getInstance().voidSignalCallback(new kf3(this, (byte) 1));
        this.t = voidSignalCallback;
        VoidSignalCallback voidSignalCallback2 = companion.getInstance().voidSignalCallback(new kf3(this, (byte) 2));
        this.u = voidSignalCallback2;
        IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_RegisterLicenseStateChanges(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
        IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_RegisterForLoginChanges(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.oe8
    public final void U0() {
        this.t.Disconnect();
        this.u.Disconnect();
        this.n.a();
    }

    public final void V0() {
        IInAppPurchaseViewModel iInAppPurchaseViewModel = this.n;
        if (IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_IsAccountLoggedIn(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel) && !IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_DoesAccountNeedALicense(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel)) {
            im3.R(e8.n(this), null, null, new sf3(this, null, (byte) 3), 3);
            return;
        }
        gu0 gu0VarN = e8.n(this);
        a81 a81Var = new a81(this, (byte) 27);
        this.f2105o.E(gu0VarN, new kf3(this, (byte) 0), a81Var);
    }
}
