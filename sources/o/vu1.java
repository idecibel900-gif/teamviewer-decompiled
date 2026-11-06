package o;

import android.content.res.Resources;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IDeviceSystemDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IDeviceSystemDetailsViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class vu1 extends oe8 implements ta3 {
    public final VoidSignalCallback A;
    public final VoidSignalCallback B;
    public final ComputerDetailsViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IDeviceSystemDetailsViewModel f2347o;
    public final Resources p;
    public final nw4 q;
    public final nw4 r;
    public final nw4 s;
    public final nw4 t;
    public final nw4 u;
    public final nw4 v;
    public final io.sentry.android.core.u0 w;
    public final io.sentry.android.core.u0 x;
    public final VoidSignalCallback y;
    public final io.sentry.android.core.u0 z;

    public vu1(ComputerDetailsViewModel computerDetailsViewModel, IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel, Resources resources) {
        this.n = computerDetailsViewModel;
        this.f2347o = iDeviceSystemDetailsViewModel;
        this.p = resources;
        nw4 nw4Var = new nw4();
        this.q = nw4Var;
        this.r = new nw4();
        this.s = new nw4();
        this.t = new nw4();
        this.u = new nw4();
        this.v = new nw4();
        this.w = new io.sentry.android.core.u0((byte) 5);
        this.x = new io.sentry.android.core.u0((byte) 5);
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        final byte b = 0;
        VoidSignalCallback voidSignalCallback = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.uu1
            public final /* synthetic */ vu1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                f88 f88Var = f88.a;
                vu1 vu1Var = this.n;
                switch (b2) {
                    case 0:
                        vu1Var.w.d();
                        break;
                    case 1:
                        vu1Var.z.d();
                        break;
                    case 2:
                        String string = vu1Var.p.getString(R.string.tv_device_information_unknown);
                        string.getClass();
                        nw4 nw4Var2 = vu1Var.r;
                        IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel2 = vu1Var.f2347o;
                        String strIDeviceSystemDetailsViewModel_GetOperatingSystem = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetOperatingSystem(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetOperatingSystem == null || strIDeviceSystemDetailsViewModel_GetOperatingSystem.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetOperatingSystem = string;
                        }
                        nw4Var2.setValue(strIDeviceSystemDetailsViewModel_GetOperatingSystem);
                        nw4 nw4Var3 = vu1Var.s;
                        String strIDeviceSystemDetailsViewModel_GetHardware = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetHardware(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetHardware == null || strIDeviceSystemDetailsViewModel_GetHardware.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetHardware = string;
                        }
                        nw4Var3.setValue(strIDeviceSystemDetailsViewModel_GetHardware);
                        nw4 nw4Var4 = vu1Var.t;
                        String strIDeviceSystemDetailsViewModel_GetDomain = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetDomain(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetDomain == null || strIDeviceSystemDetailsViewModel_GetDomain.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetDomain = string;
                        }
                        nw4Var4.setValue(strIDeviceSystemDetailsViewModel_GetDomain);
                        nw4 nw4Var5 = vu1Var.u;
                        String strIDeviceSystemDetailsViewModel_GetInternalIp = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetInternalIp(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetInternalIp == null || strIDeviceSystemDetailsViewModel_GetInternalIp.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetInternalIp = string;
                        }
                        nw4Var5.setValue(strIDeviceSystemDetailsViewModel_GetInternalIp);
                        nw4 nw4Var6 = vu1Var.v;
                        String strIDeviceSystemDetailsViewModel_GetExternalIp = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetExternalIp(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetExternalIp != null && strIDeviceSystemDetailsViewModel_GetExternalIp.length() != 0) {
                            string = strIDeviceSystemDetailsViewModel_GetExternalIp;
                        }
                        nw4Var6.setValue(string);
                        if (!IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_IsValid(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2)) {
                            vu1Var.x.d();
                        }
                        break;
                    default:
                        nw4 nw4Var7 = vu1Var.q;
                        ComputerDetailsViewModel computerDetailsViewModel2 = vu1Var.n;
                        nw4Var7.setValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel2.a, computerDetailsViewModel2));
                        break;
                }
                return f88Var;
            }
        });
        this.y = voidSignalCallback;
        io.sentry.android.core.u0 u0Var = new io.sentry.android.core.u0((byte) 5);
        this.z = u0Var;
        final byte b2 = 1;
        VoidSignalCallback voidSignalCallback2 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.uu1
            public final /* synthetic */ vu1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                vu1 vu1Var = this.n;
                switch (b3) {
                    case 0:
                        vu1Var.w.d();
                        break;
                    case 1:
                        vu1Var.z.d();
                        break;
                    case 2:
                        String string = vu1Var.p.getString(R.string.tv_device_information_unknown);
                        string.getClass();
                        nw4 nw4Var2 = vu1Var.r;
                        IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel2 = vu1Var.f2347o;
                        String strIDeviceSystemDetailsViewModel_GetOperatingSystem = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetOperatingSystem(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetOperatingSystem == null || strIDeviceSystemDetailsViewModel_GetOperatingSystem.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetOperatingSystem = string;
                        }
                        nw4Var2.setValue(strIDeviceSystemDetailsViewModel_GetOperatingSystem);
                        nw4 nw4Var3 = vu1Var.s;
                        String strIDeviceSystemDetailsViewModel_GetHardware = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetHardware(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetHardware == null || strIDeviceSystemDetailsViewModel_GetHardware.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetHardware = string;
                        }
                        nw4Var3.setValue(strIDeviceSystemDetailsViewModel_GetHardware);
                        nw4 nw4Var4 = vu1Var.t;
                        String strIDeviceSystemDetailsViewModel_GetDomain = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetDomain(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetDomain == null || strIDeviceSystemDetailsViewModel_GetDomain.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetDomain = string;
                        }
                        nw4Var4.setValue(strIDeviceSystemDetailsViewModel_GetDomain);
                        nw4 nw4Var5 = vu1Var.u;
                        String strIDeviceSystemDetailsViewModel_GetInternalIp = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetInternalIp(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetInternalIp == null || strIDeviceSystemDetailsViewModel_GetInternalIp.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetInternalIp = string;
                        }
                        nw4Var5.setValue(strIDeviceSystemDetailsViewModel_GetInternalIp);
                        nw4 nw4Var6 = vu1Var.v;
                        String strIDeviceSystemDetailsViewModel_GetExternalIp = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetExternalIp(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetExternalIp != null && strIDeviceSystemDetailsViewModel_GetExternalIp.length() != 0) {
                            string = strIDeviceSystemDetailsViewModel_GetExternalIp;
                        }
                        nw4Var6.setValue(string);
                        if (!IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_IsValid(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2)) {
                            vu1Var.x.d();
                        }
                        break;
                    default:
                        nw4 nw4Var7 = vu1Var.q;
                        ComputerDetailsViewModel computerDetailsViewModel2 = vu1Var.n;
                        nw4Var7.setValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel2.a, computerDetailsViewModel2));
                        break;
                }
                return f88Var;
            }
        });
        this.A = voidSignalCallback2;
        final byte b3 = 2;
        VoidSignalCallback voidSignalCallback3 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.uu1
            public final /* synthetic */ vu1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                f88 f88Var = f88.a;
                vu1 vu1Var = this.n;
                switch (b4) {
                    case 0:
                        vu1Var.w.d();
                        break;
                    case 1:
                        vu1Var.z.d();
                        break;
                    case 2:
                        String string = vu1Var.p.getString(R.string.tv_device_information_unknown);
                        string.getClass();
                        nw4 nw4Var2 = vu1Var.r;
                        IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel2 = vu1Var.f2347o;
                        String strIDeviceSystemDetailsViewModel_GetOperatingSystem = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetOperatingSystem(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetOperatingSystem == null || strIDeviceSystemDetailsViewModel_GetOperatingSystem.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetOperatingSystem = string;
                        }
                        nw4Var2.setValue(strIDeviceSystemDetailsViewModel_GetOperatingSystem);
                        nw4 nw4Var3 = vu1Var.s;
                        String strIDeviceSystemDetailsViewModel_GetHardware = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetHardware(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetHardware == null || strIDeviceSystemDetailsViewModel_GetHardware.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetHardware = string;
                        }
                        nw4Var3.setValue(strIDeviceSystemDetailsViewModel_GetHardware);
                        nw4 nw4Var4 = vu1Var.t;
                        String strIDeviceSystemDetailsViewModel_GetDomain = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetDomain(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetDomain == null || strIDeviceSystemDetailsViewModel_GetDomain.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetDomain = string;
                        }
                        nw4Var4.setValue(strIDeviceSystemDetailsViewModel_GetDomain);
                        nw4 nw4Var5 = vu1Var.u;
                        String strIDeviceSystemDetailsViewModel_GetInternalIp = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetInternalIp(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetInternalIp == null || strIDeviceSystemDetailsViewModel_GetInternalIp.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetInternalIp = string;
                        }
                        nw4Var5.setValue(strIDeviceSystemDetailsViewModel_GetInternalIp);
                        nw4 nw4Var6 = vu1Var.v;
                        String strIDeviceSystemDetailsViewModel_GetExternalIp = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetExternalIp(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetExternalIp != null && strIDeviceSystemDetailsViewModel_GetExternalIp.length() != 0) {
                            string = strIDeviceSystemDetailsViewModel_GetExternalIp;
                        }
                        nw4Var6.setValue(string);
                        if (!IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_IsValid(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2)) {
                            vu1Var.x.d();
                        }
                        break;
                    default:
                        nw4 nw4Var7 = vu1Var.q;
                        ComputerDetailsViewModel computerDetailsViewModel2 = vu1Var.n;
                        nw4Var7.setValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel2.a, computerDetailsViewModel2));
                        break;
                }
                return f88Var;
            }
        });
        this.B = voidSignalCallback3;
        nw4Var.setValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel.a, computerDetailsViewModel));
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForDeviceDelete(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForChanges(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
        final byte b4 = 3;
        u0Var.a(new Function0(this) { // from class: o.uu1
            public final /* synthetic */ vu1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b5 = b4;
                f88 f88Var = f88.a;
                vu1 vu1Var = this.n;
                switch (b5) {
                    case 0:
                        vu1Var.w.d();
                        break;
                    case 1:
                        vu1Var.z.d();
                        break;
                    case 2:
                        String string = vu1Var.p.getString(R.string.tv_device_information_unknown);
                        string.getClass();
                        nw4 nw4Var2 = vu1Var.r;
                        IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel2 = vu1Var.f2347o;
                        String strIDeviceSystemDetailsViewModel_GetOperatingSystem = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetOperatingSystem(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetOperatingSystem == null || strIDeviceSystemDetailsViewModel_GetOperatingSystem.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetOperatingSystem = string;
                        }
                        nw4Var2.setValue(strIDeviceSystemDetailsViewModel_GetOperatingSystem);
                        nw4 nw4Var3 = vu1Var.s;
                        String strIDeviceSystemDetailsViewModel_GetHardware = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetHardware(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetHardware == null || strIDeviceSystemDetailsViewModel_GetHardware.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetHardware = string;
                        }
                        nw4Var3.setValue(strIDeviceSystemDetailsViewModel_GetHardware);
                        nw4 nw4Var4 = vu1Var.t;
                        String strIDeviceSystemDetailsViewModel_GetDomain = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetDomain(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetDomain == null || strIDeviceSystemDetailsViewModel_GetDomain.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetDomain = string;
                        }
                        nw4Var4.setValue(strIDeviceSystemDetailsViewModel_GetDomain);
                        nw4 nw4Var5 = vu1Var.u;
                        String strIDeviceSystemDetailsViewModel_GetInternalIp = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetInternalIp(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetInternalIp == null || strIDeviceSystemDetailsViewModel_GetInternalIp.length() == 0) {
                            strIDeviceSystemDetailsViewModel_GetInternalIp = string;
                        }
                        nw4Var5.setValue(strIDeviceSystemDetailsViewModel_GetInternalIp);
                        nw4 nw4Var6 = vu1Var.v;
                        String strIDeviceSystemDetailsViewModel_GetExternalIp = IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_GetExternalIp(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2);
                        if (strIDeviceSystemDetailsViewModel_GetExternalIp != null && strIDeviceSystemDetailsViewModel_GetExternalIp.length() != 0) {
                            string = strIDeviceSystemDetailsViewModel_GetExternalIp;
                        }
                        nw4Var6.setValue(string);
                        if (!IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_IsValid(iDeviceSystemDetailsViewModel2.a, iDeviceSystemDetailsViewModel2)) {
                            vu1Var.x.d();
                        }
                        break;
                    default:
                        nw4 nw4Var7 = vu1Var.q;
                        ComputerDetailsViewModel computerDetailsViewModel2 = vu1Var.n;
                        nw4Var7.setValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel2.a, computerDetailsViewModel2));
                        break;
                }
                return f88Var;
            }
        });
        IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_RegisterForInformationChanged(iDeviceSystemDetailsViewModel.a, iDeviceSystemDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback3), voidSignalCallback3);
        IDeviceSystemDetailsViewModelSWIGJNI.IDeviceSystemDetailsViewModel_QuerySystemInformation(iDeviceSystemDetailsViewModel.a, iDeviceSystemDetailsViewModel);
    }

    @Override // o.oe8
    public final void U0() {
        this.y.Disconnect();
        this.A.Disconnect();
        this.B.Disconnect();
        this.n.b();
        this.f2347o.a();
    }
}
