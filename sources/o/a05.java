package o;

import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.remotecontrolviewmodellib.swig.IRemoteCursorViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IRemoteCursorViewModelSWIGJNI;
import com.teamviewer.teamviewerlib.settings.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class a05 extends oe8 implements ed3 {
    public final IRemoteCursorViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Settings f277o;
    public final NativeLiveDataBool p;
    public final p q;
    public final nw4 r;

    public a05(IRemoteCursorViewModel iRemoteCursorViewModel, Settings settings) {
        settings.getClass();
        this.n = iRemoteCursorViewModel;
        this.f277o = settings;
        NativeLiveDataBool nativeLiveDataBoolNewInstance = NativeLiveDataBool.newInstance(IRemoteCursorViewModelSWIGJNI.IRemoteCursorViewModel_ShowRemoteCursorState(iRemoteCursorViewModel.a, iRemoteCursorViewModel), false);
        this.p = nativeLiveDataBoolNewInstance;
        p pVar = new p(this, (byte) 12);
        this.q = pVar;
        nw4 nw4Var = new nw4();
        this.r = nw4Var;
        nativeLiveDataBoolNewInstance.observeForever(pVar);
        nw4Var.setValue(nativeLiveDataBoolNewInstance.getValue());
    }

    @Override // o.ed3
    public final nw4 Q0() {
        return this.r;
    }

    @Override // o.ed3
    public final void U(boolean z) {
        IRemoteCursorViewModel iRemoteCursorViewModel = this.n;
        if (!im3.n(NativeLiveDataBool.newInstance(IRemoteCursorViewModelSWIGJNI.IRemoteCursorViewModel_CanShowRemoteCursor(iRemoteCursorViewModel.a, iRemoteCursorViewModel), false).getValue(), Boolean.TRUE)) {
            ye4.a.g("TVRemoteCursorPreferenceViewModel", "Show Remote Cursor not supported by partner");
            return;
        }
        IRemoteCursorViewModelSWIGJNI.IRemoteCursorViewModel_ToggleRemoteCursor(iRemoteCursorViewModel.a, iRemoteCursorViewModel);
        ca8 ca8Var = ca8.P_REMOTE_REMOTECURSOR;
        this.f277o.getClass();
        Settings.k(gv6.USER, ca8Var, z);
    }

    @Override // o.oe8
    public final void U0() {
        this.p.removeObserver(this.q);
        this.n.a();
    }
}
