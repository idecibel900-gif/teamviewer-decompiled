package o;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataSize;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public final class bz4 extends oe8 implements da3 {
    public final SharedPreferences n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EventHub f470o;
    public final IRemoteScreenViewModel p;
    public ClientViewOpenGL q;
    public wa3 r;
    public j22 s;
    public final p t;
    public final VoidSignalCallback u;
    public final mu v;

    public bz4(SharedPreferences sharedPreferences, EventHub eventHub, IRemoteScreenViewModel iRemoteScreenViewModel) {
        sharedPreferences.getClass();
        eventHub.getClass();
        this.n = sharedPreferences;
        this.f470o = eventHub;
        this.p = iRemoteScreenViewModel;
        this.s = new j22();
        p pVar = new p((Object) this, (byte) 6);
        this.t = pVar;
        this.u = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new vm3((Object) this, (byte) 12));
        mu muVar = new mu(this, (byte) 9);
        this.v = muVar;
        NativeLiveDataSize.newInstance(IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_RemoteResolution(iRemoteScreenViewModel.a, iRemoteScreenViewModel), false).observeForever(pVar);
        IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_SetLocalCursorVisible(iRemoteScreenViewModel.a, iRemoteScreenViewModel, sharedPreferences.getInt("INPUT_METHOD_INT", 0) == 0);
        eventHub.c(EventType.EVENT_SETTINGS_CHANGED, muVar);
    }

    @Override // o.da3
    public final void B() {
        IRemoteScreenViewModel iRemoteScreenViewModel = this.p;
        IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_RequestRefresh(iRemoteScreenViewModel.a, iRemoteScreenViewModel);
    }

    @Override // o.da3
    public final void D(wa3 wa3Var) {
        this.r = wa3Var;
    }

    @Override // o.da3
    public final boolean K() {
        return false;
    }

    @Override // o.da3
    public final void L(y yVar) {
    }

    @Override // o.da3
    public final void N0(Rect rect) {
        rect.getClass();
        wa3 wa3Var = this.r;
        if (wa3Var != null) {
            wa3Var.b(rect.top, rect.right);
        }
    }

    @Override // o.da3
    public final boolean S(float f, float f2) {
        IRemoteScreenViewModel iRemoteScreenViewModel = this.p;
        IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_SetLocalCursorPosition(iRemoteScreenViewModel.a, iRemoteScreenViewModel, (int) f, (int) f2);
        return true;
    }

    @Override // o.oe8
    public final void U0() {
        this.f470o.f(this.v);
        this.u.Disconnect();
        wa3 wa3Var = this.r;
        if (wa3Var != null) {
            wa3Var.destroy();
        }
        this.r = null;
        IRemoteScreenViewModel iRemoteScreenViewModel = this.p;
        NativeLiveDataSize.newInstance(IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_RemoteResolution(iRemoteScreenViewModel.a, iRemoteScreenViewModel), false).removeObserver(this.t);
        iRemoteScreenViewModel.a();
    }

    @Override // o.da3
    public final boolean V() {
        return false;
    }

    @Override // o.da3
    public final j22 Z() {
        return this.s;
    }

    @Override // o.da3
    public final boolean d(MotionEvent motionEvent) {
        wa3 wa3Var = this.r;
        return wa3Var != null && wa3Var.d(motionEvent);
    }

    @Override // o.da3
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wa3 wa3Var = this.r;
        return wa3Var != null && wa3Var.a(motionEvent);
    }

    @Override // o.da3
    public final void i0(int i, int i2, int i3) {
        IRemoteScreenViewModel iRemoteScreenViewModel = this.p;
        IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_ViewportSizeChanged(iRemoteScreenViewModel.a, iRemoteScreenViewModel, i, i2, i3);
        long j = iRemoteScreenViewModel.a;
        VoidSignalCallback voidSignalCallback = this.u;
        IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_RegisterForRenderRequests(j, iRemoteScreenViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.da3
    public final float p0() {
        return 1.0f;
    }

    @Override // o.da3
    public final wk7 q() {
        return null;
    }

    @Override // o.da3
    public final void u0() {
        IRemoteScreenViewModel iRemoteScreenViewModel = this.p;
        IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_ViewportCreated(iRemoteScreenViewModel.a, iRemoteScreenViewModel);
        long j = iRemoteScreenViewModel.a;
        VoidSignalCallback voidSignalCallback = this.u;
        IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_RegisterForRenderRequests(j, iRemoteScreenViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.da3
    public final void x(ClientViewOpenGL clientViewOpenGL) {
        this.q = clientViewOpenGL;
    }

    @Override // o.da3
    public final void x0() {
        IRemoteScreenViewModel iRemoteScreenViewModel = this.p;
        IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_ViewportDestroyed(iRemoteScreenViewModel.a, iRemoteScreenViewModel);
        this.u.Disconnect();
    }

    @Override // o.da3
    public final void y(float f, float f2, int i, int i2) {
        IRemoteScreenViewModel iRemoteScreenViewModel = this.p;
        IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_ViewportRender(iRemoteScreenViewModel.a, iRemoteScreenViewModel, f, f2, i, i2);
    }

    @Override // o.da3
    public final void z0(int i) {
        IRemoteScreenViewModel iRemoteScreenViewModel = this.p;
        IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_UpdateMaxResolution(iRemoteScreenViewModel.a, iRemoteScreenViewModel, i, i);
    }
}
