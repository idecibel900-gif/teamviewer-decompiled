package o;

import android.content.Context;
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
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvclientstatistics.ISessionStatisticsSender;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d16 extends oe8 implements lc3, nt6, i22 {
    public boolean A;
    public of1 B;
    public int C;
    public a1 D;
    public float E;
    public kc3 F;
    public final nw4 G;
    public jc3 H;
    public final p I;
    public final nw4 J;
    public final nw4 K;
    public final nw4 L;
    public final lo4 M;
    public final c16 N;
    public final c16 O;
    public final c16 P;
    public final c16 Q;
    public final wc3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ep3 f579o;
    public final s7 p;
    public final EventHub q;
    public final g95 r;
    public final g95 s;
    public final xt6 t;
    public final ICommercialUseViewModel u;
    public final io.sentry.android.core.n1 v;
    public final IPredefinedShortcutsViewModel w;
    public final j93 x;
    public final qi7 y;
    public WeakReference z;

    /* JADX WARN: Type inference failed for: r1v3, types: [o.c16] */
    /* JADX WARN: Type inference failed for: r1v4, types: [o.c16] */
    /* JADX WARN: Type inference failed for: r1v5, types: [o.c16] */
    /* JADX WARN: Type inference failed for: r1v6, types: [o.c16] */
    public d16(wc3 wc3Var, ep3 ep3Var, s7 s7Var, EventHub eventHub, g95 g95Var, g95 g95Var2, xt6 xt6Var, ICommercialUseViewModel iCommercialUseViewModel, io.sentry.android.core.n1 n1Var, IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel, j93 j93Var, qi7 qi7Var) {
        s7Var.getClass();
        eventHub.getClass();
        n1Var.getClass();
        j93Var.getClass();
        qi7Var.getClass();
        this.n = wc3Var;
        this.f579o = ep3Var;
        this.p = s7Var;
        this.q = eventHub;
        this.r = g95Var;
        this.s = g95Var2;
        this.t = xt6Var;
        this.u = iCommercialUseViewModel;
        this.v = n1Var;
        this.w = iPredefinedShortcutsViewModel;
        this.x = j93Var;
        this.y = qi7Var;
        this.G = new nw4();
        p pVar = new p((Object) this, (byte) 14);
        this.I = pVar;
        this.J = new nw4(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        nw4 nw4Var = new nw4(bool);
        this.K = nw4Var;
        nw4 nw4Var2 = new nw4(bool);
        this.L = nw4Var2;
        final byte b = 2;
        final byte b2 = 0;
        final byte b3 = 1;
        this.M = qf0.I(nw4Var2, nw4Var);
        ((yd2) ((fp1) ep3Var.n).g).observeForever(pVar);
        this.N = new vd2(this) { // from class: o.c16
            public final /* synthetic */ d16 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                RCClientActivity rCClientActivity;
                RCClientActivity rCClientActivity2;
                WeakReference weakReference;
                RCClientActivity rCClientActivity3;
                byte b4 = b2;
                d16 d16Var = this.b;
                switch (b4) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        d16Var.v.c(false);
                        new Handler(Looper.getMainLooper()).post(new b16(d16Var, (byte) 3));
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference2 = d16Var.z;
                        if (weakReference2 != null && (rCClientActivity = (RCClientActivity) weakReference2.get()) != null) {
                            if (!rCClientActivity.V) {
                                lc3 lc3Var = rCClientActivity.P;
                                if (lc3Var == null || !lc3Var.t()) {
                                    rCClientActivity.S();
                                }
                            } else {
                                rCClientActivity.V = false;
                            }
                            break;
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference3 = d16Var.z;
                        if (weakReference3 != null && (rCClientActivity2 = (RCClientActivity) weakReference3.get()) != null) {
                            rCClientActivity2.O();
                            break;
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        if (he2Var.h(EventParam.EP_SETTINGS_KEY).equals("INPUT_METHOD_INT") && (weakReference = d16Var.z) != null && (rCClientActivity3 = (RCClientActivity) weakReference.get()) != null) {
                            rCClientActivity3.N();
                            break;
                        }
                        break;
                }
            }
        };
        this.O = new vd2(this) { // from class: o.c16
            public final /* synthetic */ d16 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                RCClientActivity rCClientActivity;
                RCClientActivity rCClientActivity2;
                WeakReference weakReference;
                RCClientActivity rCClientActivity3;
                byte b4 = b3;
                d16 d16Var = this.b;
                switch (b4) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        d16Var.v.c(false);
                        new Handler(Looper.getMainLooper()).post(new b16(d16Var, (byte) 3));
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference2 = d16Var.z;
                        if (weakReference2 != null && (rCClientActivity = (RCClientActivity) weakReference2.get()) != null) {
                            if (!rCClientActivity.V) {
                                lc3 lc3Var = rCClientActivity.P;
                                if (lc3Var == null || !lc3Var.t()) {
                                    rCClientActivity.S();
                                }
                            } else {
                                rCClientActivity.V = false;
                            }
                            break;
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference3 = d16Var.z;
                        if (weakReference3 != null && (rCClientActivity2 = (RCClientActivity) weakReference3.get()) != null) {
                            rCClientActivity2.O();
                            break;
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        if (he2Var.h(EventParam.EP_SETTINGS_KEY).equals("INPUT_METHOD_INT") && (weakReference = d16Var.z) != null && (rCClientActivity3 = (RCClientActivity) weakReference.get()) != null) {
                            rCClientActivity3.N();
                            break;
                        }
                        break;
                }
            }
        };
        this.P = new vd2(this) { // from class: o.c16
            public final /* synthetic */ d16 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                RCClientActivity rCClientActivity;
                RCClientActivity rCClientActivity2;
                WeakReference weakReference;
                RCClientActivity rCClientActivity3;
                byte b4 = b;
                d16 d16Var = this.b;
                switch (b4) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        d16Var.v.c(false);
                        new Handler(Looper.getMainLooper()).post(new b16(d16Var, (byte) 3));
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference2 = d16Var.z;
                        if (weakReference2 != null && (rCClientActivity = (RCClientActivity) weakReference2.get()) != null) {
                            if (!rCClientActivity.V) {
                                lc3 lc3Var = rCClientActivity.P;
                                if (lc3Var == null || !lc3Var.t()) {
                                    rCClientActivity.S();
                                }
                            } else {
                                rCClientActivity.V = false;
                            }
                            break;
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference3 = d16Var.z;
                        if (weakReference3 != null && (rCClientActivity2 = (RCClientActivity) weakReference3.get()) != null) {
                            rCClientActivity2.O();
                            break;
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        if (he2Var.h(EventParam.EP_SETTINGS_KEY).equals("INPUT_METHOD_INT") && (weakReference = d16Var.z) != null && (rCClientActivity3 = (RCClientActivity) weakReference.get()) != null) {
                            rCClientActivity3.N();
                            break;
                        }
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.Q = new vd2(this) { // from class: o.c16
            public final /* synthetic */ d16 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                RCClientActivity rCClientActivity;
                RCClientActivity rCClientActivity2;
                WeakReference weakReference;
                RCClientActivity rCClientActivity3;
                byte b5 = b4;
                d16 d16Var = this.b;
                switch (b5) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        d16Var.v.c(false);
                        new Handler(Looper.getMainLooper()).post(new b16(d16Var, (byte) 3));
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference2 = d16Var.z;
                        if (weakReference2 != null && (rCClientActivity = (RCClientActivity) weakReference2.get()) != null) {
                            if (!rCClientActivity.V) {
                                lc3 lc3Var = rCClientActivity.P;
                                if (lc3Var == null || !lc3Var.t()) {
                                    rCClientActivity.S();
                                }
                            } else {
                                rCClientActivity.V = false;
                            }
                            break;
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        WeakReference weakReference3 = d16Var.z;
                        if (weakReference3 != null && (rCClientActivity2 = (RCClientActivity) weakReference3.get()) != null) {
                            rCClientActivity2.O();
                            break;
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        if (he2Var.h(EventParam.EP_SETTINGS_KEY).equals("INPUT_METHOD_INT") && (weakReference = d16Var.z) != null && (rCClientActivity3 = (RCClientActivity) weakReference.get()) != null) {
                            rCClientActivity3.N();
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // o.lc3
    public final boolean C(MotionEvent motionEvent) {
        of1 of1Var = this.B;
        if (of1Var == null) {
            return false;
        }
        wk7 wk7Var = of1Var.a;
        wk7Var.e(motionEvent.getX() * 50.0f, motionEvent.getY() * 50.0f);
        if (motionEvent.getAction() == 0) {
            wk7Var.c(1);
        }
        return true;
    }

    @Override // o.lc3
    public final void D0() {
        RCClientActivity rCClientActivity;
        TVSpecialKeyboard tVSpecialKeyboard;
        RCClientActivity rCClientActivity2;
        W0();
        WeakReference weakReference = this.z;
        if (weakReference != null && (rCClientActivity2 = (RCClientActivity) weakReference.get()) != null) {
            rCClientActivity2.J();
        }
        WeakReference weakReference2 = this.z;
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
        qt0 qt0Var = ((eu6) this.n).E;
        if (qt0Var != null) {
            qt0Var.r = this;
        }
    }

    @Override // o.lc3
    public final void H() {
        RCClientActivity rCClientActivity;
        WeakReference weakReference = this.z;
        if (weakReference != null && (rCClientActivity = (RCClientActivity) weakReference.get()) != null) {
            rCClientActivity.J();
        }
        this.A = true;
    }

    @Override // o.lc3
    public final void H0(ic3 ic3Var) {
        a2 a2Var = (a2) this.n;
        a2Var.m.c(a2Var, ys6.n);
        Z0();
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
        WeakReference weakReference = this.z;
        if (weakReference != null && (rCClientActivity2 = (RCClientActivity) weakReference.get()) != null) {
            rCClientActivity2.J();
        }
        WeakReference weakReference2 = this.z;
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
        this.A = !z;
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
        xt6 xt6Var = this.t;
        if (xt6Var instanceof ea3) {
            ((zt6) ((ea3) xt6Var)).c();
        }
    }

    @Override // o.i22
    public final void P() {
        bu7.MAIN.a(new b16(this, (byte) 0));
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
        a1 a1Var = this.D;
        if (a1Var == null) {
            a1Var = null;
        }
        if (a1Var != null) {
            float f = ((v97) a1Var.e.getValue()).a;
            float f2 = a1Var.b;
            this.E = (f - f2) / (a1Var.c - f2);
        }
        this.C = i;
    }

    @Override // o.lc3
    public final void T() {
        this.A = true;
    }

    @Override // o.oe8
    public final void U0() {
        ((yd2) ((fp1) this.f579o.n).g).removeObserver(this.I);
        dd3 dd3VarE = e();
        if (dd3VarE != null) {
            ((oh3) dd3VarE).d = null;
        }
        ICommercialUseViewModel iCommercialUseViewModel = this.u;
        if (iCommercialUseViewModel != null) {
            iCommercialUseViewModel.a();
        }
        this.w.a();
    }

    public final void V0(long j) {
        int i = Build.VERSION.SDK_INT;
        if (i == 31 || i == 32) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b16(this, (byte) 2), j);
    }

    public final void W0() {
        RCClientActivity rCClientActivity;
        nw4 nw4Var = this.K;
        if (im3.n(nw4Var.getValue(), Boolean.TRUE)) {
            WeakReference weakReference = this.z;
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
            WeakReference weakReference = this.z;
            if (weakReference != null && (rCClientActivity = (RCClientActivity) weakReference.get()) != null && (tVSpecialKeyboard = rCClientActivity.S) != null) {
                tVSpecialKeyboard.setVisibility(8);
            }
            nw4Var.setValue(Boolean.FALSE);
        }
    }

    public final void Y0(boolean z) {
        qt0 qt0Var = ((eu6) this.n).E;
        if (qt0Var != null) {
            if (qt0Var.v == 0) {
                ye4.c("ClientModuleScreen", "Unknown streamId");
                return;
            }
            bk7 bk7Var = bk7.TVCmdDesktopPanelChange;
            KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
            ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
            ak7VarN.d(bj7.StreamID, ak7VarN.x());
            ak7VarN.b(bj7.Hidden, z ? (byte) 1 : (byte) 0);
            qt0Var.g.f(ak7VarN, true);
        }
    }

    public final void Z0() {
        RCClientActivity rCClientActivity;
        WeakReference weakReference = this.z;
        if (weakReference == null || (rCClientActivity = (RCClientActivity) weakReference.get()) == null) {
            return;
        }
        rCClientActivity.finish();
    }

    @Override // o.lc3
    public final void a() {
        ye4.a("RcClientActivityViewModel", "onPause");
        EventHub.e(this.q, EventType.EVENT_SESSION_PAUSE);
    }

    @Override // o.lc3
    public final void a0() {
        ye4.a("RcClientActivityViewModel", "connection end triggered by user");
        a2 a2Var = (a2) this.n;
        a2Var.m.c(a2Var, ys6.n);
        Z0();
        kc3 kc3Var = this.F;
        if (kc3Var != null) {
            this.G.setValue(kc3Var);
            this.F = null;
        }
    }

    @Override // o.lc3
    public final void b() {
        WeakReference weakReference;
        a2 a2Var = (a2) this.n;
        bx0 bx0Var = a2Var.t;
        a2Var.t = bx0.n;
        int iOrdinal = bx0Var.ordinal();
        ICommercialUseViewModel iCommercialUseViewModel = this.u;
        if (iOrdinal == 2) {
            WeakReference weakReference2 = this.z;
            if (weakReference2 != null) {
                if (iCommercialUseViewModel != null) {
                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel.a, iCommercialUseViewModel, 0);
                }
                RCClientActivity rCClientActivity = (RCClientActivity) weakReference2.get();
                if (rCClientActivity != null) {
                    rCClientActivity.U();
                }
            }
        } else if (iOrdinal == 3 && (weakReference = this.z) != null) {
            if (iCommercialUseViewModel != null) {
                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel.a, iCommercialUseViewModel, 1);
            }
            RCClientActivity rCClientActivity2 = (RCClientActivity) weakReference.get();
            if (rCClientActivity2 != null) {
                rCClientActivity2.T();
            }
        }
        EventType eventType = EventType.EVENT_SOFT_KEYBOARD_SHOWN;
        c16 c16Var = this.P;
        EventHub eventHub = this.q;
        if (!eventHub.c(eventType, c16Var)) {
            ye4.c("RcClientActivityViewModel", "onActivityStart(): register SoftkeyboardShown event failed");
        }
        if (!eventHub.c(EventType.EVENT_SOFT_KEYBOARD_HIDDEN, this.O)) {
            ye4.c("RcClientActivityViewModel", "onActivityStart(): register SoftkeyboardHidden event failed");
        }
        if (!eventHub.c(EventType.EVENT_LOW_ON_MEMORY, this.N)) {
            ye4.c("RcClientActivityViewModel", "register OnLowMemory event failed");
        }
        Y0(false);
        ye4.a("RcClientActivityViewModel", "init done");
        io.sentry.android.core.n1 n1Var = this.v;
        n1Var.k();
        n1Var.c(true);
        if (eventHub.c(EventType.EVENT_SETTINGS_CHANGED, this.Q)) {
            return;
        }
        ye4.c("RcClientActivityViewModel", "registerInputChangeListener(): register InputChanged event failed");
    }

    @Override // o.lc3
    public final boolean c() {
        xt6 xt6Var = this.t;
        return ((zt6) xt6Var).f != null && ((zt6) xt6Var).b.get();
    }

    @Override // o.lc3
    public final void d0() {
        Y0(true);
        c16 c16Var = this.N;
        EventHub eventHub = this.q;
        if (!eventHub.f(c16Var)) {
            ye4.c("RcClientActivityViewModel", "unregister OnLowMemory event failed");
        }
        if (!eventHub.f(this.O)) {
            ye4.c("RcClientActivityViewModel", "unregister SoftkeyboardHidden event failed");
        }
        if (!eventHub.f(this.P)) {
            ye4.c("RcClientActivityViewModel", "unregister SoftKeyboardShown event failed");
        }
        if (!eventHub.f(this.Q)) {
            ye4.c("RcClientActivityViewModel", "unregisterInputChangeListener(): could not unregister InputChanged listener");
        }
        io.sentry.android.core.n1 n1Var = this.v;
        n1Var.c(false);
        n1Var.k();
    }

    @Override // o.lc3
    public final dd3 e() {
        return ((eu6) this.n).g();
    }

    @Override // o.lc3
    public final void e0(int i) {
        qt0 qt0Var = ((eu6) this.n).E;
        if (qt0Var != null && qt0Var.t) {
            j0();
        }
        int i2 = this.C;
        if (i2 != 0 && i2 != i) {
            a1 a1Var = this.D;
            if (a1Var == null) {
                a1Var = null;
            }
            if (a1Var != null) {
                a1Var.n = this.E;
            }
        }
        this.C = i;
    }

    @Override // o.lc3
    public final void f() {
        ((a2) this.n).n(i41.y);
    }

    @Override // o.lc3
    public final void f0(ar arVar) {
        g95 g95Var = this.s;
        if (im3.n(((a2) ((wc3) g95Var.m)).p.h.getValue(), Boolean.TRUE)) {
            ha6 ha6Var = ((a2) ((wc3) g95Var.m)).f283o;
            ha6Var.getClass();
            ye4.a("RemoteSettings", " send remote reboot ");
            bk7 bk7Var = bk7.TVCmdRemoteReboot;
            a2 a2Var = ha6Var.a;
            ParticipantIdentifier participantIdentifierA = a2Var.r.a();
            ak7 ak7Var = new ak7(bk7Var);
            ak7Var.z(KnownStreams.PrivateStream);
            ak7Var.B(participantIdentifierA);
            if (a2Var.f(ak7Var, true)) {
                a2Var.m.g.a(ISessionStatisticsSender.SessionStatisticsInfoType.RemoteRebootUsed, true);
            }
        }
        arVar.q();
    }

    @Override // o.lc3
    public final void h(Window window) {
        WeakReference weakReference;
        RCClientActivity rCClientActivity;
        RCClientActivity rCClientActivity2;
        RCClientActivity rCClientActivity3;
        ye4.a("RcClientActivityViewModel", "onResume");
        if (!((zt6) this.t).b.get()) {
            ye4.c("RcClientActivityViewModel", "onResume(): no session running");
            Z0();
        }
        window.addFlags(128);
        EventHub.e(this.q, EventType.EVENT_SESSION_RESUME);
        WeakReference weakReference2 = this.z;
        if (weakReference2 != null && (rCClientActivity3 = (RCClientActivity) weakReference2.get()) != null) {
            rCClientActivity3.P();
        }
        Object value = this.K.getValue();
        Boolean bool = Boolean.TRUE;
        if (im3.n(value, bool)) {
            WeakReference weakReference3 = this.z;
            if (weakReference3 == null || (rCClientActivity2 = (RCClientActivity) weakReference3.get()) == null) {
                return;
            }
            rCClientActivity2.Q();
            return;
        }
        if (!im3.n(this.L.getValue(), bool) || (weakReference = this.z) == null || (rCClientActivity = (RCClientActivity) weakReference.get()) == null) {
            return;
        }
        rCClientActivity.R();
    }

    @Override // o.lc3
    public final void i(String str, long j, boolean z, String str2, long j2) {
        this.F = new kc3(str, j, z, str2, j2);
    }

    @Override // o.lc3
    public final void j() {
        RCClientActivity rCClientActivity;
        ICommercialUseViewModel iCommercialUseViewModel = this.u;
        if (iCommercialUseViewModel != null) {
            ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 1);
        }
        WeakReference weakReference = this.z;
        if (weakReference == null || (rCClientActivity = (RCClientActivity) weakReference.get()) == null) {
            return;
        }
        rCClientActivity.G();
    }

    @Override // o.i22
    public final void j0() {
        ye4.a("RcClientActivityViewModel", "show waiting room false");
        wc3 wc3Var = this.n;
        wk7 wk7VarI = ((eu6) wc3Var).i();
        if (wk7VarI != null) {
            this.B = new of1(wk7VarI);
        }
        this.r.m = new qk7(wc3Var);
        this.J.postValue(Boolean.FALSE);
        bu7.MAIN.a(new b16(this, (byte) 1));
    }

    @Override // o.lc3
    public final nw4 k() {
        return this.G;
    }

    @Override // o.lc3
    public final nw4 l() {
        return this.J;
    }

    @Override // o.nt6
    public final void l0(qk7 qk7Var) {
        this.r.m = qk7Var;
    }

    @Override // o.lc3
    public final void m() {
        wi6.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.lc3
    public final void n0(ClientViewOpenGL clientViewOpenGL) {
        v97 v97Var;
        a1 oc1Var;
        c1 qc1Var;
        c1 c1Var;
        l97 l97Var;
        r97 r97Var;
        clientViewOpenGL.getClass();
        ep3 ep3Var = this.f579o;
        ep3Var.getClass();
        fp1 fp1Var = (fp1) ep3Var.n;
        na3 na3Var = (na3) fp1Var.d;
        wa3 xi3Var = null;
        Object[] objArr = 0;
        if (na3Var != null) {
            a1 a1Var = (a1) na3Var;
            v97Var = (v97) a1Var.e.getValue();
            a1Var.h();
        } else {
            v97Var = null;
        }
        fp1Var.d = null;
        c1 c1Var2 = (c1) fp1Var.e;
        PointF pointF = (c1Var2 == null || (l97Var = c1Var2.b) == null || (r97Var = (r97) l97Var.getValue()) == null) ? null : r97Var.a;
        c1 c1Var3 = (c1) fp1Var.e;
        if (c1Var3 != null) {
            c1Var3.a();
        }
        fp1Var.e = null;
        zb3 zb3Var = (zb3) fp1Var.f;
        if (zb3Var != null) {
            zb3Var.destroy();
        }
        fp1Var.f = null;
        boolean zU = ep3Var.u();
        wc3 wc3Var = this.n;
        EventHub eventHub = this.q;
        j93 j93Var = this.x;
        if (zU) {
            ye4.a("RcClientActivityViewModel", "setMouseAndZoomListeners(): setup ControlMode: DirectTouch");
            oc1Var = new nc1(new rc1(((a2) wc3Var).f283o, eventHub, j93Var));
        } else {
            ye4.a("RcClientActivityViewModel", "setMouseAndZoomListeners(): setup ControlMode: Mouse");
            oc1Var = new oc1(new rc1(((a2) wc3Var).f283o, eventHub, j93Var));
        }
        this.D = oc1Var;
        iu iuVar = new iu(((a2) wc3Var).f283o, eventHub);
        if (ep3Var.u()) {
            qc1Var = new pc1(iuVar);
            qc1Var.i(false);
        } else {
            qc1Var = new qc1(iuVar);
        }
        zb3 nv4Var = ep3Var.u() ? new nv4(j93Var) : new qv4(j93Var);
        l97 l97Var2 = qc1Var.b;
        oc1Var.f = l97Var2;
        oc1Var.i(clientViewOpenGL.getAspectQuotient());
        wk7 wk7VarI = ((eu6) ((wc3) fp1Var.a)).i();
        if (wk7VarI != null) {
            n87 n87Var = wk7VarI.q;
            if (n87Var != null) {
                n87Var.j(null);
            }
            wk7VarI.q = im3.R(wk7VarI.r, null, null, new mf7(l97Var2, wk7VarI, objArr == true ? 1 : 0, (byte) 1), 3);
            qc1Var.i = wk7VarI;
        } else {
            ye4.c("RcInputMethodUIModel", "mouse already freed");
        }
        j97 dimensionView = clientViewOpenGL.getDimensionView();
        qc1Var.h(dimensionView);
        oc1Var.a(dimensionView);
        nv4Var.c(dimensionView);
        j97 dimensionBitmap = clientViewOpenGL.getDimensionBitmap();
        oc1Var.j(dimensionBitmap);
        qc1Var.d = dimensionBitmap;
        qc1Var.g(oc1Var);
        clientViewOpenGL.setControlZoom(oc1Var);
        clientViewOpenGL.setMouseState(l97Var2);
        fp1Var.d = oc1Var;
        fp1Var.e = qc1Var;
        fp1Var.f = nv4Var;
        fp1Var.d(v97Var, pointF);
        nv4Var.b(oc1Var);
        nv4Var.a(qc1Var);
        clientViewOpenGL.setOnTouchListener(nv4Var);
        if (ep3Var.u()) {
            na3 na3Var2 = (na3) fp1Var.d;
            if (na3Var2 == null || (c1Var = (c1) fp1Var.e) == null) {
                ye4.c("RcInputMethodUIModel", "External device handler could not be set.");
            } else {
                xi3Var = new xi3(clientViewOpenGL, na3Var2, c1Var, (j93) ep3Var.f733o);
                ye4.a("RcInputMethodUIModel", "External device support for touch mode activated.");
            }
            clientViewOpenGL.setExternalMouseHandler(xi3Var);
        } else {
            ye4.a("RcInputMethodUIModel", "External device support for mouse mode activated.");
            Context context = clientViewOpenGL.getContext();
            context.getClass();
            clientViewOpenGL.setExternalMouseHandler(new y41(context, (c1) fp1Var.e));
        }
        clientViewOpenGL.a();
    }

    @Override // o.lc3
    public final boolean o0() {
        return im3.n(this.K.getValue(), Boolean.TRUE);
    }

    @Override // o.nt6
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.r.onKeyDown(i, keyEvent);
    }

    @Override // o.nt6
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return ((qk7) this.r.m) != null;
    }

    @Override // o.nt6
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.r.onKeyUp(i, keyEvent);
    }

    @Override // o.lc3
    public final void q0(jc3 jc3Var) {
        this.H = jc3Var;
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
        return this.H;
    }

    @Override // o.lc3
    public final void v(RCClientActivity rCClientActivity) {
        this.z = new WeakReference(rCClientActivity);
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
        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel = this.w;
        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel.a, iPredefinedShortcutsViewModel, 6);
    }
}
