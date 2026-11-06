package o;

import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class kr1 extends oe8 implements ra3 {
    public final ComputerDetailsViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LogoutViewModel f1296o;
    public final LicenseViewModel p;
    public int q;
    public final nw4 r;
    public final nw4 s;
    public final io.sentry.android.core.u0 t;
    public final io.sentry.android.core.u0 u;
    public String v;
    public final VoidSignalCallback w;
    public final VoidSignalCallback x;
    public final VoidSignalCallback y;
    public VoidSignalCallback z;

    public kr1(ComputerDetailsViewModel computerDetailsViewModel, LogoutViewModel logoutViewModel, LicenseViewModel licenseViewModel, int i) {
        this.n = computerDetailsViewModel;
        this.f1296o = logoutViewModel;
        this.p = licenseViewModel;
        this.q = i;
        nw4 nw4Var = new nw4();
        this.r = nw4Var;
        this.s = new nw4(Boolean.valueOf(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsManagedByMe(computerDetailsViewModel.a, computerDetailsViewModel)));
        this.t = new io.sentry.android.core.u0((byte) 5);
        this.u = new io.sentry.android.core.u0((byte) 5);
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        final byte b = 0;
        VoidSignalCallback voidSignalCallback = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ir1
            public final /* synthetic */ kr1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                f88 f88Var = f88.a;
                kr1 kr1Var = this.n;
                switch (b2) {
                    case 0:
                        nw4 nw4Var2 = kr1Var.r;
                        ComputerDetailsViewModel computerDetailsViewModel2 = kr1Var.n;
                        nw4Var2.setValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel2.a, computerDetailsViewModel2));
                        kr1Var.s.setValue(Boolean.valueOf(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsManagedByMe(computerDetailsViewModel2.a, computerDetailsViewModel2)));
                        break;
                    case 1:
                        kr1Var.t.d();
                        break;
                    default:
                        kr1Var.u.d();
                        break;
                }
                return f88Var;
            }
        });
        this.w = voidSignalCallback;
        final byte b2 = 1;
        VoidSignalCallback voidSignalCallback2 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ir1
            public final /* synthetic */ kr1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                kr1 kr1Var = this.n;
                switch (b3) {
                    case 0:
                        nw4 nw4Var2 = kr1Var.r;
                        ComputerDetailsViewModel computerDetailsViewModel2 = kr1Var.n;
                        nw4Var2.setValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel2.a, computerDetailsViewModel2));
                        kr1Var.s.setValue(Boolean.valueOf(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsManagedByMe(computerDetailsViewModel2.a, computerDetailsViewModel2)));
                        break;
                    case 1:
                        kr1Var.t.d();
                        break;
                    default:
                        kr1Var.u.d();
                        break;
                }
                return f88Var;
            }
        });
        this.x = voidSignalCallback2;
        final byte b3 = 2;
        VoidSignalCallback voidSignalCallback3 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ir1
            public final /* synthetic */ kr1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                f88 f88Var = f88.a;
                kr1 kr1Var = this.n;
                switch (b4) {
                    case 0:
                        nw4 nw4Var2 = kr1Var.r;
                        ComputerDetailsViewModel computerDetailsViewModel2 = kr1Var.n;
                        nw4Var2.setValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel2.a, computerDetailsViewModel2));
                        kr1Var.s.setValue(Boolean.valueOf(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsManagedByMe(computerDetailsViewModel2.a, computerDetailsViewModel2)));
                        break;
                    case 1:
                        kr1Var.t.d();
                        break;
                    default:
                        kr1Var.u.d();
                        break;
                }
                return f88Var;
            }
        });
        this.y = voidSignalCallback3;
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForDeviceDelete(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForGroupDelete(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback3), voidSignalCallback3);
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForChanges(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        nw4Var.setValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel.a, computerDetailsViewModel));
    }

    @Override // o.oe8
    public final void U0() {
        this.w.Disconnect();
        this.x.Disconnect();
        this.y.Disconnect();
        this.n.b();
        this.f1296o.c();
        this.p.a();
    }
}
