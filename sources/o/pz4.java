package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrollib.gui.KeyboardInputView;
import com.teamviewer.remotecontrollib.gui.TVSpecialKeyboard;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModel;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IPredefinedShortcutsViewModel;
import com.teamviewer.remotecontrollib.swig.IPredefinedShortcutsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IQuickActionsViewModel;
import com.teamviewer.remotecontrollib.swig.IQuickActionsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenMouseViewModel;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.IChangeResolutionViewModel;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class pz4 extends oe8 implements lc3, nt6 {
    public final nt6 A;
    public WeakReference B;
    public a1 C;
    public c1 D;
    public zb3 E;
    public boolean F;
    public final VoidSignalCallback G;
    public final oz4 H;
    public jc3 I;
    public final nw4 J;
    public final nw4 K;
    public final nw4 L;
    public final lo4 M;
    public final oz4 N;
    public final oz4 O;
    public boolean P;
    public kc3 Q;
    public final nw4 R;
    public final xt6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IRemoteScreenInformationViewModel f1791o;
    public final IQuickActionsViewModel p;
    public final oh3 q;
    public final IRemoteScreenMouseViewModel r;
    public final ICommercialUseViewModel s;
    public final IPredefinedShortcutsViewModel t;
    public final j93 u;
    public final s7 v;
    public final SharedPreferences w;
    public final EventHub x;
    public final qi7 y;
    public final cg3 z;

    /* JADX WARN: Type inference failed for: r2v3, types: [o.oz4] */
    /* JADX WARN: Type inference failed for: r2v7, types: [o.oz4] */
    /* JADX WARN: Type inference failed for: r2v8, types: [o.oz4] */
    public pz4(xt6 xt6Var, IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel, IQuickActionsViewModel iQuickActionsViewModel, oh3 oh3Var, IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel, ICommercialUseViewModel iCommercialUseViewModel, IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel, j93 j93Var, s7 s7Var, SharedPreferences sharedPreferences, EventHub eventHub, qi7 qi7Var, cg3 cg3Var) {
        g95 g95Var = new g95();
        j93Var.getClass();
        s7Var.getClass();
        sharedPreferences.getClass();
        eventHub.getClass();
        qi7Var.getClass();
        this.n = xt6Var;
        this.f1791o = iRemoteScreenInformationViewModel;
        this.p = iQuickActionsViewModel;
        this.q = oh3Var;
        this.r = iRemoteScreenMouseViewModel;
        this.s = iCommercialUseViewModel;
        this.t = iPredefinedShortcutsViewModel;
        this.u = j93Var;
        this.v = s7Var;
        this.w = sharedPreferences;
        this.x = eventHub;
        this.y = qi7Var;
        this.z = cg3Var;
        this.A = g95Var;
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new vm3(this, (byte) 14));
        this.G = voidSignalCallback;
        final byte b = 0;
        this.H = new vd2(this) { // from class: o.oz4
            public final /* synthetic */ pz4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                WeakReference weakReference;
                RCClientActivity rCClientActivity;
                RCClientActivity rCClientActivity2;
                RCClientActivity rCClientActivity3;
                byte b2 = b;
                pz4 pz4Var = this.b;
                switch (b2) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        if (he2Var.h(EventParam.EP_SETTINGS_KEY).equals("INPUT_METHOD_INT") && (weakReference = pz4Var.B) != null && (rCClientActivity = (RCClientActivity) weakReference.get()) != null) {
                            rCClientActivity.N();
                            break;
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference2 = pz4Var.B;
                        if (weakReference2 != null && (rCClientActivity2 = (RCClientActivity) weakReference2.get()) != null) {
                            rCClientActivity2.O();
                            break;
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference3 = pz4Var.B;
                        if (weakReference3 != null && (rCClientActivity3 = (RCClientActivity) weakReference3.get()) != null) {
                            if (!rCClientActivity3.V) {
                                lc3 lc3Var = rCClientActivity3.P;
                                if (lc3Var == null || !lc3Var.t()) {
                                    rCClientActivity3.S();
                                }
                            } else {
                                rCClientActivity3.V = false;
                            }
                            break;
                        }
                        break;
                }
            }
        };
        this.J = new nw4(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        nw4 nw4Var = new nw4(bool);
        this.K = nw4Var;
        nw4 nw4Var2 = new nw4(bool);
        this.L = nw4Var2;
        final byte b2 = 2;
        final byte b3 = 1;
        this.M = qf0.I(nw4Var2, nw4Var);
        this.N = new vd2(this) { // from class: o.oz4
            public final /* synthetic */ pz4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                WeakReference weakReference;
                RCClientActivity rCClientActivity;
                RCClientActivity rCClientActivity2;
                RCClientActivity rCClientActivity3;
                byte b4 = b3;
                pz4 pz4Var = this.b;
                switch (b4) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        if (he2Var.h(EventParam.EP_SETTINGS_KEY).equals("INPUT_METHOD_INT") && (weakReference = pz4Var.B) != null && (rCClientActivity = (RCClientActivity) weakReference.get()) != null) {
                            rCClientActivity.N();
                            break;
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference2 = pz4Var.B;
                        if (weakReference2 != null && (rCClientActivity2 = (RCClientActivity) weakReference2.get()) != null) {
                            rCClientActivity2.O();
                            break;
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference3 = pz4Var.B;
                        if (weakReference3 != null && (rCClientActivity3 = (RCClientActivity) weakReference3.get()) != null) {
                            if (!rCClientActivity3.V) {
                                lc3 lc3Var = rCClientActivity3.P;
                                if (lc3Var == null || !lc3Var.t()) {
                                    rCClientActivity3.S();
                                }
                            } else {
                                rCClientActivity3.V = false;
                            }
                            break;
                        }
                        break;
                }
            }
        };
        this.O = new vd2(this) { // from class: o.oz4
            public final /* synthetic */ pz4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                WeakReference weakReference;
                RCClientActivity rCClientActivity;
                RCClientActivity rCClientActivity2;
                RCClientActivity rCClientActivity3;
                byte b4 = b2;
                pz4 pz4Var = this.b;
                switch (b4) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        if (he2Var.h(EventParam.EP_SETTINGS_KEY).equals("INPUT_METHOD_INT") && (weakReference = pz4Var.B) != null && (rCClientActivity = (RCClientActivity) weakReference.get()) != null) {
                            rCClientActivity.N();
                            break;
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference2 = pz4Var.B;
                        if (weakReference2 != null && (rCClientActivity2 = (RCClientActivity) weakReference2.get()) != null) {
                            rCClientActivity2.O();
                            break;
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference3 = pz4Var.B;
                        if (weakReference3 != null && (rCClientActivity3 = (RCClientActivity) weakReference3.get()) != null) {
                            if (!rCClientActivity3.V) {
                                lc3 lc3Var = rCClientActivity3.P;
                                if (lc3Var == null || !lc3Var.t()) {
                                    rCClientActivity3.S();
                                }
                            } else {
                                rCClientActivity3.V = false;
                            }
                            break;
                        }
                        break;
                }
            }
        };
        this.R = new nw4();
        IRemoteScreenInformationViewModelSWIGJNI.IRemoteScreenInformationViewModel_RegisterObserverScreenInformationChanged(iRemoteScreenInformationViewModel.a, iRemoteScreenInformationViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.lc3
    public final boolean C(MotionEvent motionEvent) {
        return false;
    }

    @Override // o.lc3
    public final void D0() {
        RCClientActivity rCClientActivity;
        TVSpecialKeyboard tVSpecialKeyboard;
        RCClientActivity rCClientActivity2;
        W0();
        WeakReference weakReference = this.B;
        if (weakReference != null && (rCClientActivity2 = (RCClientActivity) weakReference.get()) != null) {
            rCClientActivity2.J();
        }
        WeakReference weakReference2 = this.B;
        if (weakReference2 != null && (rCClientActivity = (RCClientActivity) weakReference2.get()) != null && (tVSpecialKeyboard = rCClientActivity.S) != null) {
            tVSpecialKeyboard.setVisibility(0);
        }
        this.L.setValue(Boolean.TRUE);
    }

    @Override // o.lc3
    public final void F() {
        if (im3.n(this.L.getValue(), Boolean.TRUE)) {
            X0();
            V0(100L);
        }
    }

    @Override // o.lc3
    public final void F0() {
    }

    @Override // o.lc3
    public final void H() {
        RCClientActivity rCClientActivity;
        WeakReference weakReference = this.B;
        if (weakReference != null && (rCClientActivity = (RCClientActivity) weakReference.get()) != null) {
            rCClientActivity.J();
        }
        this.P = true;
    }

    @Override // o.lc3
    public final void H0(ic3 ic3Var) {
        ye4.a("NativeSessionRcClientActivityViewModel", "connection end triggered by user");
        mo7 mo7Var = ((zt6) this.n).f;
        if (mo7Var != null) {
            mo7Var.h(ys6.n);
        }
        if (ic3Var != null) {
            ic3Var.b();
        }
    }

    @Override // o.lc3
    public final lo4 I() {
        return this.M;
    }

    @Override // o.lc3
    public final void I0() {
        V0(3000L);
    }

    @Override // o.lc3
    public final void J0() {
        RCClientActivity rCClientActivity;
        RCClientActivity rCClientActivity2;
        X0();
        WeakReference weakReference = this.B;
        if (weakReference != null && (rCClientActivity2 = (RCClientActivity) weakReference.get()) != null) {
            rCClientActivity2.J();
        }
        WeakReference weakReference2 = this.B;
        if (weakReference2 != null && (rCClientActivity = (RCClientActivity) weakReference2.get()) != null) {
            KeyboardInputView keyboardInputView = (KeyboardInputView) rCClientActivity.findViewById(R.id.DummyKeyboardEdit);
            InputMethodManager inputMethodManager = (InputMethodManager) rCClientActivity.getSystemService(InputMethodManager.class);
            if (inputMethodManager != null) {
                keyboardInputView.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    inputMethodManager.showSoftInput(keyboardInputView, 0);
                } else {
                    inputMethodManager.showSoftInput(keyboardInputView, 2);
                }
            }
        }
        this.K.setValue(Boolean.TRUE);
    }

    @Override // o.lc3
    public final void M(boolean z) {
        this.P = !z;
        if (z) {
            r0();
        }
        if (!z || Build.VERSION.SDK_INT < 29) {
            return;
        }
        qi7 qi7Var = this.y;
        qi7Var.c(qi7Var.b());
    }

    @Override // o.lc3
    public final void N() {
        xt6 xt6Var = this.n;
        if (xt6Var instanceof ea3) {
            ((zt6) ((ea3) xt6Var)).c();
        }
    }

    @Override // o.lc3
    public final void P0() {
        if (im3.n(this.K.getValue(), Boolean.TRUE)) {
            W0();
            V0(100L);
        }
    }

    @Override // o.lc3
    public final void R(int i) {
    }

    @Override // o.lc3
    public final void T() {
        this.P = true;
    }

    @Override // o.oe8
    public final void U0() {
        a1 a1Var = this.C;
        if (a1Var != null) {
            a1Var.h();
        }
        this.C = null;
        c1 c1Var = this.D;
        if (c1Var != null) {
            c1Var.a();
        }
        this.D = null;
        zb3 zb3Var = this.E;
        if (zb3Var != null) {
            zb3Var.destroy();
        }
        this.E = null;
        cg3 cg3Var = this.z;
        IChangeResolutionViewModel iChangeResolutionViewModel = (IChangeResolutionViewModel) cg3Var.a;
        iChangeResolutionViewModel.a().removeObserver((r50) cg3Var.f);
        iChangeResolutionViewModel.b().removeObserver((r50) cg3Var.g);
        iChangeResolutionViewModel.c();
        IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel = (IRemoteScreenInformationViewModel) cg3Var.b;
        iRemoteScreenInformationViewModel.a().removeObserver((r50) cg3Var.h);
        iRemoteScreenInformationViewModel.b();
        this.G.Disconnect();
        this.f1791o.b();
        this.p.a();
        this.r.a();
        this.s.a();
        this.t.a();
    }

    public final void V0(long j) {
        int i = Build.VERSION.SDK_INT;
        if (i == 31 || i == 32) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new pc0((Object) this, (byte) 22), j);
    }

    public final void W0() {
        RCClientActivity rCClientActivity;
        nw4 nw4Var = this.K;
        if (im3.n(nw4Var.getValue(), Boolean.TRUE)) {
            WeakReference weakReference = this.B;
            if (weakReference != null && (rCClientActivity = (RCClientActivity) weakReference.get()) != null) {
                rCClientActivity.L();
            }
            nw4Var.setValue(Boolean.FALSE);
        }
    }

    public final void X0() {
        RCClientActivity rCClientActivity;
        TVSpecialKeyboard tVSpecialKeyboard;
        nw4 nw4Var = this.L;
        if (im3.n(nw4Var.getValue(), Boolean.TRUE)) {
            WeakReference weakReference = this.B;
            if (weakReference != null && (rCClientActivity = (RCClientActivity) weakReference.get()) != null && (tVSpecialKeyboard = rCClientActivity.S) != null) {
                tVSpecialKeyboard.setVisibility(8);
            }
            nw4Var.setValue(Boolean.FALSE);
        }
    }

    @Override // o.lc3
    public final void a() {
        ye4.a("NativeSessionRcClientActivityViewModel", "onPause");
        EventHub.e(this.x, EventType.EVENT_SESSION_PAUSE);
    }

    @Override // o.lc3
    public final void a0() {
        ye4.a("NativeSessionRcClientActivityViewModel", "connection end triggered by user");
        mo7 mo7Var = ((zt6) this.n).f;
        if (mo7Var != null) {
            mo7Var.h(ys6.n);
        }
        kc3 kc3Var = this.Q;
        if (kc3Var != null) {
            this.R.setValue(kc3Var);
            this.Q = null;
        }
    }

    @Override // o.lc3
    public final void b() {
        RCClientActivity rCClientActivity;
        RCClientActivity rCClientActivity2;
        du6 du6VarT;
        EventType eventType = EventType.EVENT_SOFT_KEYBOARD_SHOWN;
        oz4 oz4Var = this.N;
        EventHub eventHub = this.x;
        if (!eventHub.c(eventType, oz4Var)) {
            ye4.c("NativeSessionRcClientActivityViewModel", "onActivityStart(): register SoftkeyboardShown event failed");
        }
        if (!eventHub.c(EventType.EVENT_SOFT_KEYBOARD_HIDDEN, this.O)) {
            ye4.c("NativeSessionRcClientActivityViewModel", "onActivityStart(): register SoftkeyboardHidden event failed");
        }
        ye4.a("NativeSessionRcClientActivityViewModel", "init done");
        if (!eventHub.c(EventType.EVENT_SETTINGS_CHANGED, this.H)) {
            ye4.c("NativeSessionRcClientActivityViewModel", "registerInputChangeListener(): register InputChanged event failed");
        }
        if (this.F) {
            return;
        }
        this.F = true;
        mo7 mo7Var = ((zt6) this.n).f;
        int i = (mo7Var == null || (du6VarT = mo7Var.t()) == null) ? 0 : du6VarT.g;
        bx0.m.getClass();
        int iOrdinal = vv.r(i).ordinal();
        ICommercialUseViewModel iCommercialUseViewModel = this.s;
        if (iOrdinal == 2) {
            ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel.a, iCommercialUseViewModel, 0);
            WeakReference weakReference = this.B;
            if (weakReference == null || (rCClientActivity = (RCClientActivity) weakReference.get()) == null) {
                return;
            }
            rCClientActivity.U();
            return;
        }
        if (iOrdinal != 3) {
            return;
        }
        ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel.a, iCommercialUseViewModel, 1);
        WeakReference weakReference2 = this.B;
        if (weakReference2 == null || (rCClientActivity2 = (RCClientActivity) weakReference2.get()) == null) {
            return;
        }
        rCClientActivity2.T();
    }

    @Override // o.lc3
    public final boolean c() {
        return ((zt6) this.n).b.get();
    }

    @Override // o.lc3
    public final void d0() {
        oz4 oz4Var = this.O;
        EventHub eventHub = this.x;
        if (!eventHub.f(oz4Var)) {
            ye4.c("NativeSessionRcClientActivityViewModel", "unregister SoftkeyboardHidden event failed");
        }
        if (!eventHub.f(this.N)) {
            ye4.c("NativeSessionRcClientActivityViewModel", "unregister SoftKeyboardShown event failed");
        }
        if (eventHub.f(this.H)) {
            return;
        }
        ye4.c("NativeSessionRcClientActivityViewModel", "unregisterInputChangeListener(): could not unregister InputChanged listener");
    }

    @Override // o.lc3
    public final dd3 e() {
        return this.q;
    }

    @Override // o.lc3
    public final void e0(int i) {
        WeakReference weakReference;
        RCClientActivity rCClientActivity;
        if (!im3.n(this.J.getValue(), Boolean.FALSE) || (weakReference = this.B) == null || (rCClientActivity = (RCClientActivity) weakReference.get()) == null) {
            return;
        }
        rCClientActivity.M();
    }

    @Override // o.lc3
    public final void f() {
        mo7 mo7Var = ((zt6) this.n).f;
        if (mo7Var != null) {
            mo7Var.n(i41.y);
        }
    }

    @Override // o.lc3
    public final void f0(ar arVar) {
        IQuickActionsViewModel iQuickActionsViewModel = this.p;
        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_RemoteReboot(iQuickActionsViewModel.a, iQuickActionsViewModel);
        arVar.q();
    }

    @Override // o.lc3
    public final void h(Window window) {
        WeakReference weakReference;
        RCClientActivity rCClientActivity;
        RCClientActivity rCClientActivity2;
        RCClientActivity rCClientActivity3;
        RCClientActivity rCClientActivity4;
        ye4.a("NativeSessionRcClientActivityViewModel", "onResume");
        if (!c()) {
            WeakReference weakReference2 = this.B;
            if (weakReference2 == null || (rCClientActivity4 = (RCClientActivity) weakReference2.get()) == null) {
                return;
            }
            rCClientActivity4.finish();
            return;
        }
        window.addFlags(128);
        EventHub.e(this.x, EventType.EVENT_SESSION_RESUME);
        WeakReference weakReference3 = this.B;
        if (weakReference3 != null && (rCClientActivity3 = (RCClientActivity) weakReference3.get()) != null) {
            rCClientActivity3.P();
        }
        Object value = this.K.getValue();
        Boolean bool = Boolean.TRUE;
        if (im3.n(value, bool)) {
            WeakReference weakReference4 = this.B;
            if (weakReference4 == null || (rCClientActivity2 = (RCClientActivity) weakReference4.get()) == null) {
                return;
            }
            rCClientActivity2.Q();
            return;
        }
        if (!im3.n(this.L.getValue(), bool) || (weakReference = this.B) == null || (rCClientActivity = (RCClientActivity) weakReference.get()) == null) {
            return;
        }
        rCClientActivity.R();
    }

    @Override // o.lc3
    public final void i(String str, long j, boolean z, String str2, long j2) {
        this.Q = new kc3(str, j, z, str2, j2);
    }

    @Override // o.lc3
    public final void j() {
        RCClientActivity rCClientActivity;
        ICommercialUseViewModel iCommercialUseViewModel = this.s;
        ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 1);
        WeakReference weakReference = this.B;
        if (weakReference == null || (rCClientActivity = (RCClientActivity) weakReference.get()) == null) {
            return;
        }
        rCClientActivity.G();
    }

    @Override // o.lc3
    public final nw4 k() {
        return this.R;
    }

    @Override // o.lc3
    public final nw4 l() {
        return this.J;
    }

    @Override // o.nt6
    public final void l0(qk7 qk7Var) {
        this.A.l0(qk7Var);
    }

    @Override // o.lc3
    public final void m() {
        wi6.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View, com.teamviewer.remotecontrollib.gui.ClientViewOpenGL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.wa3] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // o.lc3
    public final void n0(ClientViewOpenGL clientViewOpenGL) {
        a1 oc1Var;
        c1 qc1Var;
        c1 c1Var;
        l97 l97Var;
        r97 r97Var;
        l97 l97Var2;
        clientViewOpenGL.getClass();
        a1 a1Var = this.C;
        ?? xi3Var = 0;
        xi3Var = 0;
        v97 v97Var = (a1Var == null || (l97Var2 = a1Var.e) == null) ? null : (v97) l97Var2.getValue();
        a1 a1Var2 = this.C;
        if (a1Var2 != null) {
            a1Var2.h();
        }
        this.C = null;
        c1 c1Var2 = this.D;
        PointF pointF = (c1Var2 == null || (l97Var = c1Var2.b) == null || (r97Var = (r97) l97Var.getValue()) == null) ? null : r97Var.a;
        c1 c1Var3 = this.D;
        if (c1Var3 != null) {
            c1Var3.a();
        }
        this.D = null;
        zb3 zb3Var = this.E;
        if (zb3Var != null) {
            zb3Var.destroy();
        }
        this.E = null;
        byte b = 1;
        boolean z = this.v.a() || this.w.getInt("INPUT_METHOD_INT", 0) == 1;
        IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel = this.f1791o;
        j93 j93Var = this.u;
        if (z) {
            ye4.a("NativeSessionRcClientActivityViewModel", "setup ControlMode: DirectTouch");
            oc1Var = new nc1(new dz4(iRemoteScreenInformationViewModel, j93Var));
        } else {
            ye4.a("NativeSessionRcClientActivityViewModel", "setup ControlMode: Mouse");
            oc1Var = new oc1(new dz4(iRemoteScreenInformationViewModel, j93Var));
        }
        oc1Var.i(clientViewOpenGL.getAspectQuotient());
        oc1Var.j(clientViewOpenGL.getDimensionBitmap());
        oc1Var.a(clientViewOpenGL.getDimensionView());
        this.C = oc1Var;
        rq0 rq0Var = new rq0(this.r);
        this.A.l0(new qk7(this.q, new iz4(rq0Var, (byte) 1)));
        m30 m30Var = new m30(iRemoteScreenInformationViewModel);
        if (z) {
            qc1Var = new pc1(m30Var);
            qc1Var.i(false);
        } else {
            qc1Var = new qc1(m30Var);
        }
        qc1Var.h(clientViewOpenGL.getDimensionView());
        j97 dimensionBitmap = clientViewOpenGL.getDimensionBitmap();
        dimensionBitmap.getClass();
        qc1Var.d = dimensionBitmap;
        qc1Var.i = rq0Var;
        qc1Var.g(this.C);
        this.D = qc1Var;
        a1 a1Var3 = this.C;
        l97 l97Var3 = qc1Var.b;
        if (a1Var3 != null) {
            a1Var3.f = l97Var3;
        }
        n87 n87Var = (n87) rq0Var.e;
        if (n87Var != null) {
            n87Var.j(null);
        }
        rq0Var.f = l97Var3;
        rq0Var.e = im3.R((fc1) rq0Var.d, null, null, new vt4(l97Var3, rq0Var, xi3Var, b), 3);
        zb3 nv4Var = z ? new nv4(j93Var) : new qv4(j93Var);
        nv4Var.c(clientViewOpenGL.getDimensionView());
        nv4Var.b(this.C);
        nv4Var.a(this.D);
        this.E = nv4Var;
        a1 a1Var4 = this.C;
        if (a1Var4 != null) {
            l97 l97Var4 = a1Var4.e;
            if (v97Var != null) {
                l97Var4.getClass();
                l97Var4.l(null, v97Var);
                a1Var4.g();
                a1Var4.b();
            } else {
                a1Var4.g();
                a1Var4.f(0.0f, 0.0f, 0.0f);
            }
            if (v97Var != null && pointF != null) {
                v97 v97Var2 = (v97) l97Var4.getValue();
                c1 c1Var4 = this.D;
                if (c1Var4 != null) {
                    if (c1Var4.f()) {
                        a1Var4.e(new PointF(v97Var2.d, v97Var2.e), v97Var.a, pointF);
                    }
                    c1Var4.c(pointF);
                }
            }
        }
        clientViewOpenGL.setControlZoom(this.C);
        clientViewOpenGL.setMouseState(l97Var3);
        clientViewOpenGL.setOnTouchListener(this.E);
        if (z || this.D == null) {
            a1 a1Var5 = this.C;
            if (a1Var5 != null && (c1Var = this.D) != null) {
                xi3Var = new xi3(clientViewOpenGL, a1Var5, c1Var, j93Var);
            }
        } else {
            Context context = clientViewOpenGL.getContext();
            context.getClass();
            xi3Var = new y41(context, this.D);
        }
        clientViewOpenGL.setExternalMouseHandler(xi3Var);
        clientViewOpenGL.a();
    }

    @Override // o.lc3
    public final boolean o0() {
        return im3.n(this.K.getValue(), Boolean.TRUE);
    }

    @Override // o.nt6
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.A.onKeyDown(i, keyEvent);
    }

    @Override // o.nt6
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return this.A.onKeyMultiple(i, i2, keyEvent);
    }

    @Override // o.nt6
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.A.onKeyUp(i, keyEvent);
    }

    @Override // o.lc3
    public final void q0(jc3 jc3Var) {
        this.I = jc3Var;
    }

    @Override // o.lc3
    public final void r0() {
        V0(3000L);
    }

    @Override // o.lc3
    public final boolean t() {
        return im3.n(this.L.getValue(), Boolean.TRUE);
    }

    @Override // o.lc3
    public final jc3 t0() {
        return this.I;
    }

    @Override // o.lc3
    public final void v(RCClientActivity rCClientActivity) {
        this.B = new WeakReference(rCClientActivity);
    }

    @Override // o.lc3
    public final void y0(ClientViewOpenGL clientViewOpenGL) {
        clientViewOpenGL.getClass();
        na3 zoomControl = clientViewOpenGL.getZoomControl();
        if (zoomControl != null) {
            zoomControl.b();
        }
    }

    @Override // o.lc3
    public final void z() {
        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel = this.t;
        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel.a, iPredefinedShortcutsViewModel, 6);
    }
}
