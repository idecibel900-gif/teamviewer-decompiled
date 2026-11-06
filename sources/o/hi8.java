package o;

import com.teamviewer.commonviewmodel.swig.IAccountLoginErrorResultCallback;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IRemoteControlLoginViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteControlLoginViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.StringSignalCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewerlib.settings.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class hi8 extends oe8 {
    public final StringSignalCallback A;
    public final ii8 B;
    public final IRemoteControlLoginViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ILoginStateAwareContainerViewModel f978o;
    public final Settings p;
    public final yx6 q;
    public final r36 r;
    public final yx6 s;
    public final r36 t;
    public final l97 u;
    public final t36 v;
    public final l97 w;
    public final t36 x;
    public final VoidSignalCallback y;
    public final VoidSignalCallback z;

    public hi8(IRemoteControlLoginViewModel iRemoteControlLoginViewModel, ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel, Settings settings) {
        SignalCallbackFactory companion = SignalCallbackFactory.INSTANCE.getInstance();
        settings.getClass();
        companion.getClass();
        this.n = iRemoteControlLoginViewModel;
        this.f978o = iLoginStateAwareContainerViewModel;
        this.p = settings;
        yx6 yx6VarL = au8.l(0, 7, null);
        this.q = yx6VarL;
        this.r = new r36(yx6VarL);
        yx6 yx6VarL2 = au8.l(0, 7, null);
        this.s = yx6VarL2;
        this.t = new r36(yx6VarL2);
        Boolean bool = Boolean.FALSE;
        l97 l97VarK = im3.k(bool);
        this.u = l97VarK;
        this.v = yo1.u(l97VarK);
        l97 l97VarK2 = im3.k(bool);
        this.w = l97VarK2;
        this.x = yo1.u(l97VarK2);
        vt1.F(ka0.d(0, 7, null));
        VoidSignalCallback voidSignalCallback = companion.voidSignalCallback(new ai8(this, (byte) 0));
        this.y = voidSignalCallback;
        VoidSignalCallback voidSignalCallback2 = companion.voidSignalCallback(new ai8(this, (byte) 1));
        this.z = voidSignalCallback2;
        StringSignalCallback stringSignalCallback = companion.stringSignalCallback(new bi8(this, (byte) 0));
        this.A = stringSignalCallback;
        ii8 ii8Var = new ii8(new j68((byte) 9), new bi8(this, (byte) 1), new ai8(this, (byte) 2), new bi8(this, (byte) 2), new ai8(this, (byte) 3));
        this.B = ii8Var;
        ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_RegisterForChanges(iLoginStateAwareContainerViewModel.a, iLoginStateAwareContainerViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        IRemoteControlLoginViewModelSWIGJNI.IRemoteControlLoginViewModel_RegisterForLoginStateChanges(iRemoteControlLoginViewModel.a, iRemoteControlLoginViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
        IRemoteControlLoginViewModelSWIGJNI.IRemoteControlLoginViewModel_RegisterForSocialLoginConfirmation(iRemoteControlLoginViewModel.a, iRemoteControlLoginViewModel, StringSignalCallback.getCPtr(stringSignalCallback), stringSignalCallback);
        IRemoteControlLoginViewModelSWIGJNI.IRemoteControlLoginViewModel_RegisterForLoginErrorResult(iRemoteControlLoginViewModel.a, iRemoteControlLoginViewModel, IAccountLoginErrorResultCallback.getCPtr(ii8Var), ii8Var);
    }

    @Override // o.oe8
    public final void U0() {
        this.y.Disconnect();
        StringSignalCallback stringSignalCallback = this.A;
        stringSignalCallback.Disconnect();
        this.z.Disconnect();
        this.n.a();
        this.f978o.a();
        stringSignalCallback.delete();
        this.B.delete();
    }

    public final String V0(ci8 ci8Var) {
        this.p.getClass();
        gv6 gv6Var = gv6.MACHINE;
        rt0 rt0Var = rt0.P_AUTHHOST_URL_PREFIX;
        int iB = Settings.b(gv6Var, rt0Var);
        jc2 jc2Var = di8.f626o;
        return (iB < jc2Var.a() ? ((di8) jc2Var.get(Settings.b(gv6Var, rt0Var))).m : "https://account.teamviewer.com").concat(ci8Var.m);
    }
}
