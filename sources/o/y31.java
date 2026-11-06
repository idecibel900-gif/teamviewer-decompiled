package o;

import android.content.SharedPreferences;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.remotecontrollib.swig.IBannerViewModel;
import com.teamviewer.remotecontrollib.swig.IBannerViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IConnectFragmentViewModel;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y31 extends oe8 {
    public q20 A;
    public yc4 B;
    public final LinkedHashSet C;
    public final a65 D;
    public final my4 E;
    public n87 F;
    public final VoidSignalCallback G;
    public final VoidSignalCallback H;
    public final VoidSignalCallback I;
    public final yx6 J;
    public final r36 K;
    public final yx6 L;
    public final r36 M;
    public final yx6 N;
    public final r36 O;
    public final l97 P;
    public final t36 Q;
    public final ll2 R;
    public final t36 S;
    public final t36 T;
    public final IConnectFragmentViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IBannerViewModel f2573o;
    public final ILoginStateAwareContainerViewModel p;
    public final LicenseViewModel q;
    public final wf3 r;
    public final SharedPreferences s;
    public final f41 t;
    public final fe1 u;
    public final l07 v;
    public final g95 w;
    public final hl4 x;
    public final nx3 y;
    public final nw4 z;

    public y31(IConnectFragmentViewModel iConnectFragmentViewModel, IBannerViewModel iBannerViewModel, ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel, LicenseViewModel licenseViewModel, wf3 wf3Var, SharedPreferences sharedPreferences, f41 f41Var) {
        ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel2 = iLoginStateAwareContainerViewModel;
        LicenseViewModel licenseViewModel2 = licenseViewModel;
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        l07 l07Var = new l07((byte) 9);
        g95 g95Var = new g95((byte) 11);
        xl4 xl4Var = new xl4();
        nx3 nx3Var = new nx3((byte) 9);
        sharedPreferences.getClass();
        f41Var.getClass();
        gk1Var.getClass();
        this.n = iConnectFragmentViewModel;
        this.f2573o = iBannerViewModel;
        this.p = iLoginStateAwareContainerViewModel2;
        this.q = licenseViewModel2;
        this.r = wf3Var;
        this.s = sharedPreferences;
        this.t = f41Var;
        this.u = gk1Var;
        this.v = l07Var;
        this.w = g95Var;
        this.x = xl4Var;
        this.y = nx3Var;
        nw4 nw4Var = new nw4(Boolean.FALSE);
        this.z = nw4Var;
        this.C = new LinkedHashSet();
        this.D = new a65(xl4Var);
        this.E = new my4();
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        VoidSignalCallback voidSignalCallback = companion.getInstance().voidSignalCallback(new n21(this, (byte) 6));
        this.G = voidSignalCallback;
        VoidSignalCallback voidSignalCallback2 = companion.getInstance().voidSignalCallback(new n21(this, (byte) 7));
        this.H = voidSignalCallback2;
        VoidSignalCallback voidSignalCallback3 = companion.getInstance().voidSignalCallback(new n21(this, (byte) 8));
        this.I = voidSignalCallback3;
        yx6 yx6VarL = au8.l(0, 7, null);
        this.J = yx6VarL;
        this.K = new r36(yx6VarL);
        yx6 yx6VarL2 = au8.l(0, 7, null);
        this.L = yx6VarL2;
        this.M = new r36(yx6VarL2);
        yx6 yx6VarL3 = au8.l(0, 7, null);
        this.N = yx6VarL3;
        this.O = new r36(yx6VarL3);
        zr7 zr7Var = new zr7(6, 0L, "");
        ea2 ea2Var = ea2.m;
        l97 l97VarK = im3.k(new p31(false, false, false, false, false, false, false, false, false, false, false, false, zr7Var, ea2Var, ea2Var, null, ea2Var, ea2Var, ea2Var, false, false));
        this.P = l97VarK;
        this.Q = yo1.u(l97VarK);
        ll2 ll2Var = new ll2(xl4Var, nx3Var, e8.n(this), gk1Var);
        this.R = ll2Var;
        iw7 iw7Var = (iw7) ll2Var.p;
        t36 t36Var = iw7Var.g;
        iw7 iw7Var2 = (iw7) ll2Var.q;
        byte b = 3;
        byte b2 = 0;
        this.S = yo1.W(new jp2(t36Var, iw7Var2.g, new r31(b, null, b2), b2), e8.n(this), new d97(5000L, Long.MAX_VALUE), ea2Var);
        byte b3 = 5;
        byte b4 = 0;
        byte b5 = 1;
        this.T = yo1.W(new to2(new go2[]{iw7Var.i, iw7Var.k, iw7Var2.i, iw7Var2.k}, new s31(b3, null, b4), (byte) 4), e8.n(this), new d97(5000L, Long.MAX_VALUE), Boolean.TRUE);
        hc1 hc1Var = null;
        IBannerViewModelSWIGJNI.IBannerViewModel_RegisterForChanges(iBannerViewModel.a, iBannerViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        im3.R(e8.n(this), null, null, new ac(this, hc1Var, b), 3);
        byte b6 = 6;
        wf3Var.d(new i0(1, nw4Var, nw4.class, "postValue", "postValue(Ljava/lang/Object;)V", 0, (byte) 20));
        l97 l97Var = this.P;
        while (true) {
            Object value = l97Var.getValue();
            p31 p31Var = (p31) value;
            p31Var.getClass();
            SharedPreferences sharedPreferences2 = this.s;
            if (l97Var.j(value, p31.a(p31Var, false, false, false, false, sharedPreferences2.getBoolean("CRASH_OCCURED", false), false, false, false, sharedPreferences2.getBoolean("KEY_SESSIONS_LIST_EXPANDED", true), sharedPreferences2.getBoolean("KEY_RECENT_CONNECTIONS_LIST_EXPANDED", true), false, false, null, null, null, false, false, 8387055))) {
                ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_RegisterForChanges(iLoginStateAwareContainerViewModel2.a, iLoginStateAwareContainerViewModel2, VoidSignalCallback.getCPtr(voidSignalCallback3), voidSignalCallback3);
                LicenseViewModelSWIGJNI.LicenseViewModel_RegisterForChanges(licenseViewModel2.a, licenseViewModel2, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
                im3.R(e8.n(this), gk1Var, null, new v31(this, hc1Var, b5), 2);
                im3.R(e8.n(this), gk1Var, null, new v31(this, hc1Var, b4), 2);
                im3.R(e8.n(this), gk1Var, null, new v31(this, hc1Var, b6), 2);
                im3.R(e8.n(this), gk1Var, null, new v31(this, hc1Var, b3), 2);
                ll2Var.q();
                return;
            }
            iLoginStateAwareContainerViewModel2 = iLoginStateAwareContainerViewModel;
            licenseViewModel2 = licenseViewModel;
        }
    }

    @Override // o.oe8
    public final void U0() {
        IConnectFragmentViewModel iConnectFragmentViewModel = this.n;
        if (iConnectFragmentViewModel != null) {
            iConnectFragmentViewModel.a();
        }
        this.r.a();
        this.G.Disconnect();
        this.I.Disconnect();
        this.f2573o.b();
        this.q.a();
        this.p.a();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x0033, LOOP:0: B:34:0x0086->B:49:?, LOOP_START, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002f, B:31:0x0067, B:34:0x0086), top: B:46:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9 A[LOOP:1: B:38:0x00c9->B:51:?, LOOP_START, PHI: r21
      0x00c9: PHI (r21v1 o.ea2) = (r21v0 o.ea2), (r21v3 o.ea2) binds: [B:37:0x00c7, B:51:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (o.ds1.B(r4, r3) == r8) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V0(o.jc1 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y31.V0(o.jc1):java.lang.Object");
    }

    public final void W0() {
        l97 l97Var;
        Object value;
        p31 p31Var;
        this.A = null;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 8388603)));
    }

    public final void X0() {
        l97 l97Var;
        Object value;
        p31 p31Var;
        SharedPreferences sharedPreferences = this.s;
        int i = sharedPreferences.getInt("CRASH_COUNT", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putInt("CRASH_COUNT", i + 1);
        editorEdit.putBoolean("CRASH_OCCURED", false);
        editorEdit.apply();
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 8388591)));
    }

    public final void Y0() {
        l97 l97Var;
        Object value;
        p31 p31Var;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 8388599)));
    }

    public final void Z0() {
        l97 l97Var;
        Object value;
        p31 p31Var;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 8388606)));
    }

    public final void a1() {
        l97 l97Var;
        Object value;
        p31 p31Var;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 6291455)));
    }

    public final void b1() {
        l97 l97Var;
        Object value;
        p31 p31Var;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 8388605)));
    }

    public final Object c1(h37 h37Var, hc1 hc1Var) throws Throwable {
        Object objC = this.L.c(h37Var, hc1Var);
        return objC == ne1.m ? objC : f88.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d1(jc1 jc1Var) {
        w31 w31Var;
        Object objK;
        if (jc1Var instanceof w31) {
            w31Var = (w31) jc1Var;
            int i = w31Var.f2370o;
            if ((i & Integer.MIN_VALUE) != 0) {
                w31Var.f2370o = i - Integer.MIN_VALUE;
            } else {
                w31Var = new w31(this, jc1Var);
            }
        } else {
            w31Var = new w31(this, jc1Var);
        }
        Object obj = w31Var.m;
        int i2 = w31Var.f2370o;
        if (i2 == 0) {
            ct1.a0(obj);
            w31Var.f2370o = 1;
            objK = this.w.K(10, w31Var);
            ne1 ne1Var = ne1.m;
            if (objK == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            objK = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objK);
        if (thA == null) {
            return (List) objK;
        }
        ua5.v("Failed to fetch recent connections: ", thA.getMessage(), "ConnectViewModel");
        return ea2.m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e1(jc1 jc1Var) {
        x31 x31Var;
        Object objC;
        if (jc1Var instanceof x31) {
            x31Var = (x31) jc1Var;
            int i = x31Var.f2475o;
            if ((i & Integer.MIN_VALUE) != 0) {
                x31Var.f2475o = i - Integer.MIN_VALUE;
            } else {
                x31Var = new x31(this, jc1Var);
            }
        } else {
            x31Var = new x31(this, jc1Var);
        }
        Object obj = x31Var.m;
        int i2 = x31Var.f2475o;
        if (i2 == 0) {
            ct1.a0(obj);
            x31Var.f2475o = 1;
            objC = this.v.C(x31Var);
            ne1 ne1Var = ne1.m;
            if (objC == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            objC = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objC);
        if (thA == null) {
            return (List) objC;
        }
        ua5.v("Failed to fetch support sessions: ", thA.getMessage(), "ConnectViewModel");
        return ea2.m;
    }

    public final void f1() {
        im3.R(e8.n(this), null, null, new tx(this, null, (byte) 3), 3);
    }

    public final void g1(ci3 ci3Var) {
        LinkedHashSet linkedHashSet = this.C;
        linkedHashSet.add(ci3Var);
        if (linkedHashSet.containsAll(ci3.q)) {
            f1();
            linkedHashSet.clear();
        }
    }

    public final void h1(List list) {
        l97 l97Var;
        Object value;
        p31 p31Var;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, false, false, false, false, false, list, null, null, false, false, 8372223)));
    }

    public final void i1(SupportSession supportSession) {
        l97 l97Var;
        Object value;
        p31 p31Var;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, false, false, false, false, false, null, null, supportSession, false, false, 8323071)));
    }

    public final void j1() {
        ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = this.p;
        if (ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_ShowLoggedInView(iLoginStateAwareContainerViewModel.a, iLoginStateAwareContainerViewModel)) {
            LicenseViewModel licenseViewModel = this.q;
            String strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
            if (strLicenseViewModel_GetAccountLoginName == null || strLicenseViewModel_GetAccountLoginName.length() == 0) {
                k1(true);
                l1(true);
            } else {
                k1(false);
                l1(false);
            }
            gu0 gu0VarN = e8.n(this);
            tk1 tk1Var = g22.a;
            im3.R(gu0VarN, gk1.f901o, null, new h0(this, null, (byte) 22), 2);
            f1();
        }
    }

    public final void k1(boolean z) {
        l97 l97Var;
        Object value;
        p31 p31Var;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, z, false, false, false, false, false, null, null, null, false, false, 8388543)));
    }

    public final void l1(boolean z) {
        l97 l97Var;
        Object value;
        p31 p31Var;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, z, false, false, false, false, null, null, null, false, false, 8388479)));
    }

    public final void m1() {
        l97 l97Var;
        Object value;
        p31 p31Var;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, true, false, false, false, false, false, false, false, false, null, null, null, false, false, 8388599)));
    }

    public final void n1() {
        l97 l97Var;
        Object value;
        p31 p31Var;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, true, false, false, false, false, false, false, null, null, null, false, false, 8388575)));
    }

    public final void o1() {
        l97 l97Var;
        Object value;
        p31 p31Var;
        do {
            l97Var = this.P;
            value = l97Var.getValue();
            p31Var = (p31) value;
            p31Var.getClass();
        } while (!l97Var.j(value, p31.a(p31Var, false, true, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 8388605)));
    }
}
