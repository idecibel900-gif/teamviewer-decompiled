package o;

import android.content.SharedPreferences;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import androidx.lifecycle.LiveData;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModel;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenKeyboardViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenKeyboardViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenMouseViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenTouchViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteSupportSessionViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteSupportSessionViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mz4 extends oe8 implements jb3, nt6 {
    public aj4 A;
    public bj4 B;
    public boolean C;
    public boolean D;
    public final LinkedHashSet E;
    public final VoidSignalCallback F;
    public final lo4 G;
    public final oh3 H;
    public boolean I;
    public final qf2 J;
    public final qf2 K;
    public kc3 L;
    public final nw4 M;
    public final xt6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IRemoteSupportSessionViewModel f1526o;
    public final IRemoteScreenInformationViewModel p;
    public final IRemoteScreenKeyboardViewModel q;
    public final IRemoteScreenTouchViewModel r;
    public final IRemoteScreenMouseViewModel s;
    public final ICommercialUseViewModel t;
    public final j93 u;
    public final kv4 v;
    public final SharedPreferences w;
    public final EventHub x;
    public final nt6 y;
    public final nw4 z;

    public mz4(xt6 xt6Var, IRemoteSupportSessionViewModel iRemoteSupportSessionViewModel, IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel, IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel, IRemoteScreenTouchViewModel iRemoteScreenTouchViewModel, IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel, ICommercialUseViewModel iCommercialUseViewModel, j93 j93Var, kv4 kv4Var, SharedPreferences sharedPreferences, EventHub eventHub) {
        g95 g95Var = new g95();
        j93Var.getClass();
        sharedPreferences.getClass();
        eventHub.getClass();
        this.n = xt6Var;
        this.f1526o = iRemoteSupportSessionViewModel;
        this.p = iRemoteScreenInformationViewModel;
        this.q = iRemoteScreenKeyboardViewModel;
        this.r = iRemoteScreenTouchViewModel;
        this.s = iRemoteScreenMouseViewModel;
        this.t = iCommercialUseViewModel;
        this.u = j93Var;
        this.v = kv4Var;
        this.w = sharedPreferences;
        this.x = eventHub;
        this.y = g95Var;
        this.z = new nw4(Boolean.TRUE);
        this.E = new LinkedHashSet();
        final byte b = 0;
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new gz4(this, (byte) 0));
        this.F = voidSignalCallback;
        final lo4 lo4Var = new lo4(Boolean.FALSE);
        final NativeLiveDataBool nativeLiveDataBoolNewInstance = NativeLiveDataBool.newInstance(IRemoteSupportSessionViewModelSWIGJNI.IRemoteSupportSessionViewModel_CanControl(iRemoteSupportSessionViewModel.a, iRemoteSupportSessionViewModel), false);
        final NativeLiveDataBool nativeLiveDataBoolNewInstance2 = NativeLiveDataBool.newInstance(IRemoteScreenKeyboardViewModelSWIGJNI.IRemoteScreenKeyboardViewModel_IsInputAllowed(iRemoteScreenKeyboardViewModel.a, iRemoteScreenKeyboardViewModel), false);
        byte b2 = 21;
        lo4Var.b(nativeLiveDataBoolNewInstance, new b7(new Function1() { // from class: o.hz4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                f88 f88Var = f88.a;
                boolean z = false;
                lo4 lo4Var2 = lo4Var;
                NativeLiveDataBool nativeLiveDataBool = nativeLiveDataBoolNewInstance2;
                Boolean bool = (Boolean) obj;
                switch (b3) {
                    case 0:
                        if (bool.booleanValue() && im3.n(nativeLiveDataBool.getValue(), Boolean.TRUE)) {
                            z = true;
                        }
                        if (!im3.n(lo4Var2.getValue(), Boolean.valueOf(z))) {
                            lo4Var2.setValue(Boolean.valueOf(z));
                        }
                        break;
                    default:
                        if (bool.booleanValue() && im3.n(nativeLiveDataBool.getValue(), Boolean.TRUE)) {
                            z = true;
                        }
                        if (!im3.n(lo4Var2.getValue(), Boolean.valueOf(z))) {
                            lo4Var2.setValue(Boolean.valueOf(z));
                        }
                        break;
                }
                return f88Var;
            }
        }, b2));
        final byte b3 = 1;
        lo4Var.b(nativeLiveDataBoolNewInstance2, new b7(new Function1() { // from class: o.hz4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                f88 f88Var = f88.a;
                boolean z = false;
                lo4 lo4Var2 = lo4Var;
                NativeLiveDataBool nativeLiveDataBool = nativeLiveDataBoolNewInstance;
                Boolean bool = (Boolean) obj;
                switch (b4) {
                    case 0:
                        if (bool.booleanValue() && im3.n(nativeLiveDataBool.getValue(), Boolean.TRUE)) {
                            z = true;
                        }
                        if (!im3.n(lo4Var2.getValue(), Boolean.valueOf(z))) {
                            lo4Var2.setValue(Boolean.valueOf(z));
                        }
                        break;
                    default:
                        if (bool.booleanValue() && im3.n(nativeLiveDataBool.getValue(), Boolean.TRUE)) {
                            z = true;
                        }
                        if (!im3.n(lo4Var2.getValue(), Boolean.valueOf(z))) {
                            lo4Var2.setValue(Boolean.valueOf(z));
                        }
                        break;
                }
                return f88Var;
            }
        }, b2));
        this.G = lo4Var;
        this.H = new oh3(new l07((Object) iRemoteScreenKeyboardViewModel, (byte) 23));
        this.J = new qf2(new gz4(this, (byte) 1));
        this.K = new qf2(new gz4(this, (byte) 2));
        this.M = new nw4();
        IRemoteScreenInformationViewModelSWIGJNI.IRemoteScreenInformationViewModel_RegisterObserverScreenInformationChanged(iRemoteScreenInformationViewModel.a, iRemoteScreenInformationViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.jb3
    public final LiveData A() {
        return this.G;
    }

    @Override // o.jb3
    public final void A0(Display display) {
        Boolean bool = (Boolean) this.J.getValue();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        LinkedHashSet linkedHashSet = this.E;
        if (zBooleanValue && this.w.getInt("ZOOM_HELP_ON_STARTUP_COUNT", 0) < 2 && !this.C) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                M2MClientActivity m2MClientActivity = (M2MClientActivity) ((WeakReference) it.next()).get();
                if (m2MClientActivity != null) {
                    m2MClientActivity.O(false);
                }
            }
            this.C = true;
            return;
        }
        if (zBooleanValue) {
            return;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            M2MClientActivity m2MClientActivity2 = (M2MClientActivity) ((WeakReference) it2.next()).get();
            if (m2MClientActivity2 != null) {
                m2MClientActivity2.I(false);
            }
        }
    }

    @Override // o.jb3
    public final qf2 B0() {
        return this.K;
    }

    @Override // o.jb3
    public final void G() {
        mo7 mo7Var = ((zt6) this.n).f;
        if (mo7Var != null) {
            mo7Var.h(ys6.n);
        }
    }

    @Override // o.jb3
    public final void J(M2MClientActivity m2MClientActivity) {
        this.E.removeIf(new l82(new qi4(m2MClientActivity, (byte) 1), (byte) 1));
    }

    @Override // o.jb3
    public final void K0() {
        if (im3.n(this.z.getValue(), Boolean.FALSE)) {
            Iterator it = this.E.iterator();
            while (it.hasNext()) {
                M2MClientActivity m2MClientActivity = (M2MClientActivity) ((WeakReference) it.next()).get();
                if (m2MClientActivity != null) {
                    m2MClientActivity.K();
                }
            }
        }
    }

    @Override // o.jb3
    public final void L0() {
        mo7 mo7Var = ((zt6) this.n).f;
        if (mo7Var != null) {
            mo7Var.h(ys6.n);
        }
        kc3 kc3Var = this.L;
        if (kc3Var != null) {
            this.M.setValue(kc3Var);
            this.L = null;
        }
    }

    @Override // o.oe8
    public final void U0() {
        aj4 aj4Var = this.A;
        if (aj4Var != null) {
            aj4Var.h();
        }
        this.A = null;
        bj4 bj4Var = this.B;
        if (bj4Var != null) {
            bj4Var.a();
        }
        this.B = null;
        this.v.destroy();
        this.F.Disconnect();
        this.f1526o.a();
        this.p.b();
        this.q.b();
        this.r.a();
        this.s.a();
        this.t.a();
    }

    @Override // o.jb3
    public final void W() {
        xt6 xt6Var = this.n;
        if (xt6Var instanceof ea3) {
            ((zt6) ((ea3) xt6Var)).c();
        }
    }

    @Override // o.jb3
    public final void a() {
        EventHub.e(this.x, EventType.EVENT_SESSION_PAUSE);
    }

    @Override // o.jb3
    public final void b() {
        du6 du6VarT;
        if (this.D) {
            return;
        }
        this.D = true;
        mo7 mo7Var = ((zt6) this.n).f;
        int i = (mo7Var == null || (du6VarT = mo7Var.t()) == null) ? 0 : du6VarT.g;
        bx0.m.getClass();
        int iOrdinal = vv.r(i).ordinal();
        LinkedHashSet linkedHashSet = this.E;
        ICommercialUseViewModel iCommercialUseViewModel = this.t;
        if (iOrdinal == 2) {
            ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel.a, iCommercialUseViewModel, 0);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                M2MClientActivity m2MClientActivity = (M2MClientActivity) ((WeakReference) it.next()).get();
                if (m2MClientActivity != null) {
                    m2MClientActivity.M();
                }
            }
            return;
        }
        if (iOrdinal != 3) {
            return;
        }
        ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel.a, iCommercialUseViewModel, 1);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            M2MClientActivity m2MClientActivity2 = (M2MClientActivity) ((WeakReference) it2.next()).get();
            if (m2MClientActivity2 != null) {
                m2MClientActivity2.L();
            }
        }
    }

    @Override // o.jb3
    public final boolean c() {
        return ((zt6) this.n).b.get();
    }

    @Override // o.jb3
    public final dd3 e() {
        return this.H;
    }

    @Override // o.jb3
    public final void f() {
        mo7 mo7Var = ((zt6) this.n).f;
        if (mo7Var != null) {
            mo7Var.n(i41.y);
        }
    }

    @Override // o.jb3
    public final void h(Window window) {
        if (c()) {
            window.addFlags(128);
            EventHub.e(this.x, EventType.EVENT_SESSION_RESUME);
            return;
        }
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            M2MClientActivity m2MClientActivity = (M2MClientActivity) ((WeakReference) it.next()).get();
            if (m2MClientActivity != null) {
                m2MClientActivity.finish();
            }
        }
    }

    @Override // o.jb3
    public final qf2 h0() {
        return this.J;
    }

    @Override // o.jb3
    public final void i(String str, long j, boolean z, String str2, long j2) {
        this.L = new kc3(str, j, z, str2, j2);
    }

    @Override // o.jb3
    public final void j() {
        ICommercialUseViewModel iCommercialUseViewModel = this.t;
        ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 1);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            M2MClientActivity m2MClientActivity = (M2MClientActivity) ((WeakReference) it.next()).get();
            if (m2MClientActivity != null) {
                m2MClientActivity.G();
            }
        }
    }

    @Override // o.jb3
    public final nw4 k() {
        return this.M;
    }

    @Override // o.jb3
    public final nw4 l() {
        return this.z;
    }

    @Override // o.nt6
    public final void l0(qk7 qk7Var) {
        this.y.l0(qk7Var);
    }

    @Override // o.jb3
    public final void m() {
        wi6.a();
    }

    @Override // o.nt6
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.y.onKeyDown(i, keyEvent);
    }

    @Override // o.nt6
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return this.y.onKeyMultiple(i, i2, keyEvent);
    }

    @Override // o.nt6
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.y.onKeyUp(i, keyEvent);
    }

    @Override // o.jb3
    public final void p(ClientViewOpenGL clientViewOpenGL, ar arVar) {
        bj4 bj4Var;
        clientViewOpenGL.getClass();
        j97 dimensionView = clientViewOpenGL.getDimensionView();
        kv4 kv4Var = this.v;
        kv4Var.getClass();
        dimensionView.getClass();
        IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel = this.p;
        j93 j93Var = this.u;
        aj4 aj4Var = new aj4(new dz4(iRemoteScreenInformationViewModel, j93Var));
        aj4Var.i(clientViewOpenGL.getAspectQuotient());
        aj4Var.j(clientViewOpenGL.getDimensionBitmap());
        aj4Var.a(clientViewOpenGL.getDimensionView());
        aj4Var.v = new io.sentry.q7(this, arVar, (byte) 23);
        this.A = aj4Var;
        rq0 rq0Var = new rq0(this.s);
        byte b = 0;
        this.y.l0(new qk7(this.H, new iz4(rq0Var, (byte) 0)));
        bj4 bj4Var2 = new bj4(new m30(iRemoteScreenInformationViewModel), new jz4(this.r));
        bj4Var2.h(clientViewOpenGL.getDimensionView());
        j97 dimensionBitmap = clientViewOpenGL.getDimensionBitmap();
        dimensionBitmap.getClass();
        bj4Var2.d = dimensionBitmap;
        bj4Var2.i = rq0Var;
        bj4Var2.g(this.A);
        this.B = bj4Var2;
        aj4 aj4Var2 = this.A;
        l97 l97Var = bj4Var2.b;
        if (aj4Var2 != null) {
            aj4Var2.f = l97Var;
        }
        n87 n87Var = (n87) rq0Var.e;
        hc1 hc1Var = null;
        if (n87Var != null) {
            n87Var.j(null);
        }
        rq0Var.f = l97Var;
        byte b2 = 1;
        rq0Var.e = im3.R((fc1) rq0Var.d, null, null, new vt4(l97Var, rq0Var, hc1Var, b2), 3);
        clientViewOpenGL.setControlZoom(this.A);
        clientViewOpenGL.setMouseState(l97Var);
        kv4Var.p = this.A;
        kv4Var.q = this.B;
        clientViewOpenGL.setOnTouchListener(kv4Var);
        aj4 aj4Var3 = this.A;
        clientViewOpenGL.setExternalMouseHandler((aj4Var3 == null || (bj4Var = this.B) == null) ? null : new xi3(clientViewOpenGL, aj4Var3, bj4Var, j93Var));
        clientViewOpenGL.a();
        gz4 gz4Var = new gz4(this, (byte) 3);
        im3.R(hm3.e(), null, null, new lz4(clientViewOpenGL, gz4Var, hc1Var, b), 3);
        im3.R(hm3.e(), null, null, new lz4(clientViewOpenGL, gz4Var, hc1Var, b2), 3);
    }

    @Override // o.jb3
    public final void s() {
        boolean z = !this.I;
        this.I = z;
        this.v.r = z;
    }

    @Override // o.jb3
    public final void s0(M2MClientActivity m2MClientActivity) {
        this.E.add(new WeakReference(m2MClientActivity));
    }

    @Override // o.jb3
    public final void u() {
        SharedPreferences sharedPreferences = this.w;
        int i = sharedPreferences.getInt("ZOOM_HELP_ON_STARTUP_COUNT", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putInt("ZOOM_HELP_ON_STARTUP_COUNT", i + 1);
        editorEdit.apply();
    }
}
