package o;

import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wf3 {
    public final cg3 a;
    public final IInAppPurchaseViewModel b;
    public final EventHub c;
    public final fc1 d;
    public Function1 e;
    public zv6 f;
    public boolean g;
    public boolean h;
    public final VoidSignalCallback i;
    public final VoidSignalCallback j;
    public final mu k;
    public final kh7 l;

    public wf3(cg3 cg3Var, IInAppPurchaseViewModel iInAppPurchaseViewModel, EventHub eventHub) {
        this.a = cg3Var;
        this.b = iInAppPurchaseViewModel;
        this.c = eventHub;
        se7 se7VarA = g57.a();
        tk1 tk1Var = g22.a;
        this.d = hm3.c(xk0.G(se7VarA, ok4.a.r));
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        final byte b = 0;
        this.i = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.uf3
            public final /* synthetic */ wf3 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                f88 f88Var = f88.a;
                wf3 wf3Var = this.n;
                switch (b2) {
                    case 0:
                        wf3Var.b();
                        break;
                    default:
                        wf3Var.b();
                        break;
                }
                return f88Var;
            }
        });
        final byte b2 = 1;
        this.j = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.uf3
            public final /* synthetic */ wf3 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                wf3 wf3Var = this.n;
                switch (b3) {
                    case 0:
                        wf3Var.b();
                        break;
                    default:
                        wf3Var.b();
                        break;
                }
                return f88Var;
            }
        });
        this.k = new mu(this, (byte) 5);
        this.l = new kh7(new uf2((byte) 26));
    }

    public final void a() {
        hm3.f(this.d, null);
        this.i.Disconnect();
        this.j.Disconnect();
        this.c.f(this.k);
        this.b.a();
    }

    public final void b() {
        IInAppPurchaseViewModel iInAppPurchaseViewModel = this.b;
        boolean zIInAppPurchaseViewModel_IsAccountLoggedIn = IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_IsAccountLoggedIn(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel);
        boolean zIInAppPurchaseViewModel_DoesAccountNeedALicense = IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_DoesAccountNeedALicense(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel);
        if (zIInAppPurchaseViewModel_DoesAccountNeedALicense == this.h && zIInAppPurchaseViewModel_IsAccountLoggedIn == this.g) {
            return;
        }
        this.h = zIInAppPurchaseViewModel_DoesAccountNeedALicense;
        this.g = zIInAppPurchaseViewModel_IsAccountLoggedIn;
        if (this.e != null) {
            e();
        }
        if (this.f != null) {
            f();
        }
    }

    public final boolean c() {
        g60 g60Var;
        if (!xh2.a) {
            return false;
        }
        iw8 iw8Var = null;
        gw8 gw8Var = null;
        cg3 cg3Var = this.a;
        c60 c60Var = cg3Var != null ? (c60) cg3Var.g : null;
        if (c60Var == null) {
            return false;
        }
        if (c60Var.B(r47.a)) {
            g60 g60Var2 = jt8.a;
            g60 g60Var3 = c60Var.k ? jt8.g : jt8.j;
            if (g60Var3.a != 0) {
                int i = gt8.a;
                try {
                    fw8 fw8VarR = gw8.r();
                    jw8 jw8VarP = kw8.p();
                    jw8VarP.d(g60Var3.a);
                    String str = g60Var3.c;
                    jw8VarP.b();
                    kw8.r((kw8) jw8VarP.n, str);
                    jw8VarP.c(9);
                    fw8VarR.c(jw8VarP);
                    fw8VarR.e(5);
                    uw8 uw8VarO = vw8.o();
                    uw8VarO.b();
                    vw8.p((vw8) uw8VarO.n, 2);
                    vw8 vw8Var = (vw8) uw8VarO.a();
                    fw8VarR.b();
                    gw8.w((gw8) fw8VarR.n, vw8Var);
                    gw8Var = (gw8) fw8VarR.a();
                } catch (Exception e) {
                    tr8.i("BillingLogger", "Unable to create logging payload", e);
                }
                c60Var.v(gw8Var);
            } else {
                int i2 = gt8.a;
                try {
                    hw8 hw8VarP = iw8.p();
                    hw8VarP.b();
                    iw8.o((iw8) hw8VarP.n, 5);
                    uw8 uw8VarO2 = vw8.o();
                    uw8VarO2.b();
                    vw8.p((vw8) uw8VarO2.n, 2);
                    vw8 vw8Var2 = (vw8) uw8VarO2.a();
                    hw8VarP.b();
                    iw8.s((iw8) hw8VarP.n, vw8Var2);
                    iw8Var = (iw8) hw8VarP.a();
                } catch (Exception e2) {
                    tr8.i("BillingLogger", "Unable to create logging payload", e2);
                }
                c60Var.w(iw8Var);
            }
            g60Var = g60Var3;
        } else {
            g60Var = jt8.h;
            if (g60Var.a != 0) {
                c60Var.r(2, 5, g60Var);
            } else {
                try {
                    int i3 = gt8.a;
                    c60Var.w(gt8.c(5, mw8.BROADCAST_ACTION_UNSPECIFIED));
                } catch (Throwable th) {
                    tr8.i("BillingClient", "Unable to log.", th);
                }
            }
        }
        return g60Var.a == 0;
    }

    public final void d(Function1 function1) {
        this.e = function1;
        cg3 cg3Var = this.a;
        if ((cg3Var != null ? (c60) cg3Var.g : null) == null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        IInAppPurchaseViewModel iInAppPurchaseViewModel = this.b;
        this.g = IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_IsAccountLoggedIn(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel);
        this.h = IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_DoesAccountNeedALicense(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel);
        e();
        if (!this.c.c(EventType.EVENT_IN_APP_PURCHASE_COMPLETED, this.k)) {
            ye4.c("InAppPurchaseFeatureStateProvider", "Could not register in-app purchase complete listener!");
        }
        long j = iInAppPurchaseViewModel.a;
        VoidSignalCallback voidSignalCallback = this.i;
        IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_RegisterForLoginChanges(j, iInAppPurchaseViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        long j2 = iInAppPurchaseViewModel.a;
        VoidSignalCallback voidSignalCallback2 = this.j;
        IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_RegisterLicenseStateChanges(j2, iInAppPurchaseViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
    }

    public final void e() {
        if (!c()) {
            Function1 function1 = this.e;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        cg3 cg3Var = this.a;
        c60 c60Var = cg3Var != null ? (c60) cg3Var.g : null;
        if (c60Var != null) {
            c60Var.d((zy5) this.l.getValue(), new vf3(this, (byte) 1));
        }
    }

    public final void f() {
        if (!c()) {
            zv6 zv6Var = this.f;
            if (zv6Var != null) {
                zv6Var.invoke(eg3.m);
                return;
            }
            return;
        }
        cg3 cg3Var = this.a;
        c60 c60Var = cg3Var != null ? (c60) cg3Var.g : null;
        if (c60Var != null) {
            c60Var.d((zy5) this.l.getValue(), new vf3(this, (byte) 0));
        }
    }
}
