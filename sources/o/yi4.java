package o;

import android.content.SharedPreferences;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import androidx.lifecycle.LiveData;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrollib.statistics.AndroidM2MStatistics;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModel;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class yi4 extends oe8 implements jb3, nt6, i22 {
    public final qf2 A;
    public final nw4 B;
    public kc3 C;
    public final nw4 D;
    public final nw4 E;
    public final wc3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SharedPreferences f2610o;
    public final g95 p;
    public final io.sentry.android.core.n1 q;
    public final kv4 r;
    public final xt6 s;
    public final EventHub t;
    public final ICommercialUseViewModel u;
    public final z60 v;
    public final j93 w;
    public final LinkedHashSet x;
    public boolean y;
    public final qf2 z;

    public yi4(wc3 wc3Var, SharedPreferences sharedPreferences, g95 g95Var, io.sentry.android.core.n1 n1Var, kv4 kv4Var, xt6 xt6Var, EventHub eventHub, ICommercialUseViewModel iCommercialUseViewModel, z60 z60Var, j93 j93Var) {
        sharedPreferences.getClass();
        n1Var.getClass();
        eventHub.getClass();
        j93Var.getClass();
        this.n = wc3Var;
        this.f2610o = sharedPreferences;
        this.p = g95Var;
        this.q = n1Var;
        this.r = kv4Var;
        this.s = xt6Var;
        this.t = eventHub;
        this.u = iCommercialUseViewModel;
        this.v = z60Var;
        this.w = j93Var;
        this.x = new LinkedHashSet();
        this.z = (qf2) z60Var.q;
        this.A = (qf2) z60Var.r;
        this.B = new nw4(Boolean.TRUE);
        this.D = new nw4();
        this.E = new nw4(Boolean.valueOf(e() != null));
    }

    @Override // o.jb3
    public final LiveData A() {
        return this.E;
    }

    @Override // o.jb3
    public final void A0(Display display) {
        Boolean bool = (Boolean) this.z.getValue();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        ye4.a("M2MClientActivityViewModel", "Update zoom: enabled=" + zBooleanValue);
        LinkedHashSet linkedHashSet = this.x;
        if (zBooleanValue && this.f2610o.getInt("ZOOM_HELP_ON_STARTUP_COUNT", 0) < 2 && !this.y) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                M2MClientActivity m2MClientActivity = (M2MClientActivity) ((WeakReference) it.next()).get();
                if (m2MClientActivity != null) {
                    m2MClientActivity.O(false);
                }
            }
            this.y = true;
        } else if (!zBooleanValue) {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                M2MClientActivity m2MClientActivity2 = (M2MClientActivity) ((WeakReference) it2.next()).get();
                if (m2MClientActivity2 != null) {
                    m2MClientActivity2.I(false);
                }
            }
        }
        int i = ((a2) this.n).u.c;
        z60 z60Var = this.v;
        z60Var.getClass();
        fp1 fp1Var = (fp1) z60Var.n;
        na3 na3Var = (na3) fp1Var.d;
        if (na3Var == null) {
            return;
        }
        int i2 = (int) ((aj4) na3Var).d;
        ha6 ha6Var = ((a2) ((wc3) fp1Var.a)).f283o;
        float f = (ha6Var.i / 100.0f) * 160.0f;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        j22 j22Var = ha6Var.f;
        AndroidM2MStatistics.a.a(i, zBooleanValue, i3, i4, i2, j22Var.m, j22Var.n, (int) f);
    }

    @Override // o.jb3
    public final qf2 B0() {
        return this.A;
    }

    @Override // o.jb3
    public final void G() {
        ye4.a("M2MClientActivityViewModel", "connection end triggered by user");
        a2 a2Var = (a2) this.n;
        a2Var.m.c(a2Var, ys6.n);
        V0();
    }

    @Override // o.jb3
    public final void J(M2MClientActivity m2MClientActivity) {
        LinkedHashSet<WeakReference> linkedHashSet = this.x;
        for (WeakReference weakReference : linkedHashSet) {
            if (im3.n(weakReference.get(), m2MClientActivity)) {
                linkedHashSet.remove(weakReference);
            }
        }
    }

    @Override // o.jb3
    public final void K0() {
        qt0 qt0Var = ((eu6) this.n).E;
        if (qt0Var != null) {
            qt0Var.r = this;
        }
        if (qt0Var != null && qt0Var.t) {
            j0();
        }
        io.sentry.android.core.n1 n1Var = this.q;
        n1Var.k();
        n1Var.c(true);
    }

    @Override // o.jb3
    public final void L0() {
        ye4.a("M2MClientActivityViewModel", "connection end triggered by user");
        a2 a2Var = (a2) this.n;
        a2Var.m.c(a2Var, ys6.n);
        V0();
        kc3 kc3Var = this.C;
        if (kc3Var != null) {
            this.D.setValue(kc3Var);
            this.C = null;
        }
    }

    @Override // o.i22
    public final void P() {
        bu7.MAIN.a(new wi4(this, (byte) 0));
    }

    @Override // o.oe8
    public final void U0() {
        z60 z60Var = this.v;
        hm3.f((fc1) z60Var.p, null);
        fp1 fp1Var = (fp1) z60Var.n;
        na3 na3Var = (na3) fp1Var.d;
        if (na3Var != null) {
            ((a1) na3Var).h();
        }
        fp1Var.d = null;
        c1 c1Var = (c1) fp1Var.e;
        if (c1Var != null) {
            c1Var.a();
        }
        fp1Var.e = null;
        zb3 zb3Var = (zb3) fp1Var.f;
        if (zb3Var != null) {
            zb3Var.destroy();
        }
        fp1Var.f = null;
        ICommercialUseViewModel iCommercialUseViewModel = this.u;
        if (iCommercialUseViewModel != null) {
            iCommercialUseViewModel.a();
        }
    }

    public final void V0() {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            M2MClientActivity m2MClientActivity = (M2MClientActivity) ((WeakReference) it.next()).get();
            if (m2MClientActivity != null) {
                m2MClientActivity.finish();
            }
        }
    }

    @Override // o.jb3
    public final void W() {
        io.sentry.android.core.n1 n1Var = this.q;
        n1Var.c(false);
        n1Var.k();
        xt6 xt6Var = this.s;
        if (xt6Var instanceof ea3) {
            ((zt6) ((ea3) xt6Var)).c();
        }
    }

    @Override // o.jb3
    public final void a() {
        ye4.a("M2MClientActivityViewModel", "onPause");
        EventHub.e(this.t, EventType.EVENT_SESSION_PAUSE);
    }

    @Override // o.jb3
    public final void b() {
        a2 a2Var = (a2) this.n;
        bx0 bx0Var = a2Var.t;
        a2Var.t = bx0.n;
        int iOrdinal = bx0Var.ordinal();
        ICommercialUseViewModel iCommercialUseViewModel = this.u;
        LinkedHashSet<WeakReference> linkedHashSet = this.x;
        if (iOrdinal == 2) {
            for (WeakReference weakReference : linkedHashSet) {
                if (iCommercialUseViewModel != null) {
                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel.a, iCommercialUseViewModel, 0);
                }
                M2MClientActivity m2MClientActivity = (M2MClientActivity) weakReference.get();
                if (m2MClientActivity != null) {
                    m2MClientActivity.M();
                }
            }
            return;
        }
        if (iOrdinal != 3) {
            return;
        }
        for (WeakReference weakReference2 : linkedHashSet) {
            if (iCommercialUseViewModel != null) {
                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel.a, iCommercialUseViewModel, 1);
            }
            M2MClientActivity m2MClientActivity2 = (M2MClientActivity) weakReference2.get();
            if (m2MClientActivity2 != null) {
                m2MClientActivity2.L();
            }
        }
    }

    @Override // o.jb3
    public final boolean c() {
        xt6 xt6Var = this.s;
        return ((zt6) xt6Var).f != null && ((zt6) xt6Var).b.get();
    }

    @Override // o.jb3
    public final dd3 e() {
        return ((eu6) this.n).g();
    }

    @Override // o.jb3
    public final void f() {
        ((a2) this.n).n(i41.y);
    }

    @Override // o.jb3
    public final void h(Window window) {
        ye4.a("M2MClientActivityViewModel", "onResume");
        if (!((zt6) this.s).b.get()) {
            ye4.c("M2MClientActivityViewModel", "onResume(): no session running");
            V0();
        }
        window.addFlags(128);
        EventHub.e(this.t, EventType.EVENT_SESSION_RESUME);
    }

    @Override // o.jb3
    public final qf2 h0() {
        return this.z;
    }

    @Override // o.jb3
    public final void i(String str, long j, boolean z, String str2, long j2) {
        this.C = new kc3(str, j, z, str2, j2);
    }

    @Override // o.jb3
    public final void j() {
        ICommercialUseViewModel iCommercialUseViewModel = this.u;
        if (iCommercialUseViewModel != null) {
            ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 1);
        }
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            M2MClientActivity m2MClientActivity = (M2MClientActivity) ((WeakReference) it.next()).get();
            if (m2MClientActivity != null) {
                m2MClientActivity.G();
            }
        }
    }

    @Override // o.i22
    public final void j0() {
        ye4.a("M2MClientActivityViewModel", "show waiting room false");
        this.p.m = new qk7(this.n);
        this.B.setValue(Boolean.FALSE);
        bu7.MAIN.a(new wi4(this, (byte) 1));
    }

    @Override // o.jb3
    public final nw4 k() {
        return this.D;
    }

    @Override // o.jb3
    public final nw4 l() {
        return this.B;
    }

    @Override // o.nt6
    public final void l0(qk7 qk7Var) {
        this.p.m = qk7Var;
    }

    @Override // o.jb3
    public final void m() {
        wi6.a();
    }

    @Override // o.nt6
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.p.onKeyDown(i, keyEvent);
    }

    @Override // o.nt6
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return ((qk7) this.p.m) != null;
    }

    @Override // o.nt6
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.p.onKeyUp(i, keyEvent);
    }

    @Override // o.jb3
    public final void p(ClientViewOpenGL clientViewOpenGL, ar arVar) {
        wa3 xi3Var;
        c1 c1Var;
        l97 l97Var;
        r97 r97Var;
        clientViewOpenGL.getClass();
        z60 z60Var = this.v;
        fc1 fc1Var = (fc1) z60Var.p;
        fp1 fp1Var = (fp1) z60Var.n;
        c1 c1Var2 = (c1) fp1Var.e;
        hc1 hc1Var = null;
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
        a2 a2Var = (a2) this.n;
        ha6 ha6Var = a2Var.f283o;
        j93 j93Var = this.w;
        EventHub eventHub = this.t;
        aj4 aj4Var = new aj4(new rc1(ha6Var, eventHub, j93Var));
        aj4Var.v = new io.sentry.q7(this, arVar, (byte) 21);
        fp1Var.d = aj4Var;
        fp1Var.e = new bj4(new iu(a2Var.f283o, eventHub), new xi4());
        fp1Var.f = this.r;
        v97 v97Var = new v97();
        ye4.a("M2MInputMethodUIModel", "setMouseAndZoomListeners(): setup ControlMode: M2MTouchToTouch");
        c1 c1Var4 = (c1) fp1Var.e;
        l97 l97Var2 = c1Var4 != null ? c1Var4.b : null;
        na3 na3Var = (na3) fp1Var.d;
        if (na3Var != null) {
            ((a1) na3Var).f = l97Var2;
        }
        if (na3Var != null) {
            ((a1) na3Var).i(clientViewOpenGL.getAspectQuotient());
        }
        wk7 wk7VarI = ((eu6) ((wc3) fp1Var.a)).i();
        byte b = 1;
        if (wk7VarI != null) {
            n87 n87Var = wk7VarI.q;
            if (n87Var != null) {
                n87Var.j(null);
            }
            wk7VarI.q = im3.R(wk7VarI.r, null, null, new mf7(l97Var2, wk7VarI, hc1Var, b), 3);
            c1 c1Var5 = (c1) fp1Var.e;
            if (c1Var5 != null) {
                c1Var5.i = wk7VarI;
            }
        }
        j97 dimensionView = clientViewOpenGL.getDimensionView();
        c1 c1Var6 = (c1) fp1Var.e;
        if (c1Var6 != null) {
            c1Var6.h(dimensionView);
        }
        na3 na3Var2 = (na3) fp1Var.d;
        if (na3Var2 != null) {
            na3Var2.a(dimensionView);
        }
        zb3 zb3Var2 = (zb3) fp1Var.f;
        if (zb3Var2 != null) {
            zb3Var2.c(dimensionView);
        }
        na3 na3Var3 = (na3) fp1Var.d;
        if (na3Var3 != null) {
            ((a1) na3Var3).j(clientViewOpenGL.getDimensionBitmap());
            c1 c1Var7 = (c1) fp1Var.e;
            if (c1Var7 != null) {
                j97 dimensionBitmap = clientViewOpenGL.getDimensionBitmap();
                dimensionBitmap.getClass();
                c1Var7.d = dimensionBitmap;
                c1Var7.g(na3Var3);
            }
        }
        clientViewOpenGL.setControlZoom((na3) fp1Var.d);
        clientViewOpenGL.setMouseState(l97Var2);
        fp1Var.d(v97Var, pointF);
        zb3 zb3Var3 = (zb3) fp1Var.f;
        if (zb3Var3 != null) {
            zb3Var3.b((na3) fp1Var.d);
        }
        zb3 zb3Var4 = (zb3) fp1Var.f;
        if (zb3Var4 != null) {
            zb3Var4.a((c1) fp1Var.e);
        }
        clientViewOpenGL.setOnTouchListener((zb3) fp1Var.f);
        na3 na3Var4 = (na3) fp1Var.d;
        if (na3Var4 == null || (c1Var = (c1) fp1Var.e) == null) {
            ye4.c("M2MInputMethodUIModel", "External mouse handler could not be set.");
            xi3Var = null;
        } else {
            xi3Var = new xi3(clientViewOpenGL, na3Var4, c1Var, (j93) z60Var.f2673o);
            ye4.a("M2MInputMethodUIModel", "External mouse support activated.");
        }
        clientViewOpenGL.setExternalMouseHandler(xi3Var);
        clientViewOpenGL.a();
        fj4 fj4Var = new fj4(z60Var, (byte) 2);
        im3.R(fc1Var, null, null, new hj4(clientViewOpenGL, fj4Var, hc1Var, (byte) 0), 3);
        im3.R(fc1Var, null, null, new hj4(clientViewOpenGL, fj4Var, hc1Var, b), 3);
    }

    @Override // o.jb3
    public final void s() {
        z60 z60Var = this.v;
        boolean z = !z60Var.m;
        z60Var.m = z;
        kv4 kv4Var = (kv4) ((zb3) ((fp1) z60Var.n).f);
        if (kv4Var != null) {
            kv4Var.r = z;
        }
    }

    @Override // o.jb3
    public final void s0(M2MClientActivity m2MClientActivity) {
        this.x.add(new WeakReference(m2MClientActivity));
    }

    @Override // o.jb3
    public final void u() {
        SharedPreferences sharedPreferences = this.f2610o;
        int i = sharedPreferences.getInt("ZOOM_HELP_ON_STARTUP_COUNT", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putInt("ZOOM_HELP_ON_STARTUP_COUNT", i + 1);
        editorEdit.commit();
    }
}
