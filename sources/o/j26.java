package o;

import com.teamviewer.remotecontrollib.swig.IQuickActionsViewModel;
import com.teamviewer.remotecontrollib.swig.IQuickActionsViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvclientstatistics.ISessionStatisticsSender;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class j26 extends oe8 implements tc3 {
    public final g95 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IQuickActionsViewModel f1124o;
    public RCClientActivity p;
    public final ArrayList q;

    public j26(g95 g95Var, final ep3 ep3Var, IQuickActionsViewModel iQuickActionsViewModel) {
        this.n = g95Var;
        this.f1124o = iQuickActionsViewModel;
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        nw4 nw4Var = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_ctrl_alt_del));
        nw4 nw4Var2 = new nw4(Integer.valueOf(R.drawable.quick_action_ctrl_alt_del));
        ec3 ec3Var = (wc3) g95Var.m;
        final byte b = 0;
        arrayList.add(new f26(0, nw4Var, nw4Var2, ((a2) ec3Var).p.e, new Function0(this) { // from class: o.h26
            public final /* synthetic */ j26 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                j26 j26Var = this.n;
                switch (b2) {
                    case 0:
                        g95 g95Var2 = j26Var.n;
                        Object value = ((a2) ((wc3) g95Var2.m)).p.e.getValue();
                        Boolean bool = Boolean.TRUE;
                        if (im3.n(value, bool)) {
                            ((a2) ((wc3) g95Var2.m)).f283o.g();
                        }
                        IQuickActionsViewModel iQuickActionsViewModel2 = j26Var.f1124o;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 2);
                        return bool;
                    case 1:
                        ha6 ha6Var = ((a2) ((wc3) j26Var.n.m)).f283o;
                        ha6Var.getClass();
                        ye4.a("RemoteSettings", " send lock workstation: ");
                        bk7 bk7Var = bk7.TVCmdLockWorkstation;
                        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                        a2 a2Var = ha6Var.a;
                        if (a2Var.f(ak7VarN, true)) {
                            a2Var.m.g.a(ISessionStatisticsSender.SessionStatisticsInfoType.LockWorkStation, true);
                        }
                        IQuickActionsViewModel iQuickActionsViewModel3 = j26Var.f1124o;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 3);
                        return Boolean.TRUE;
                    default:
                        RCClientActivity rCClientActivity = j26Var.p;
                        if (rCClientActivity != null) {
                            rCClientActivity.Y(new ar(j26Var, (byte) 22));
                        }
                        return Boolean.TRUE;
                }
            }
        }));
        final byte b2 = 1;
        arrayList.add(new f26(1, new nw4(Integer.valueOf(R.string.tv_action_lock_computer)), new nw4(Integer.valueOf(R.drawable.quick_action_lock_screen)), ((a2) ec3Var).p.f, new Function0(this) { // from class: o.h26
            public final /* synthetic */ j26 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                j26 j26Var = this.n;
                switch (b3) {
                    case 0:
                        g95 g95Var2 = j26Var.n;
                        Object value = ((a2) ((wc3) g95Var2.m)).p.e.getValue();
                        Boolean bool = Boolean.TRUE;
                        if (im3.n(value, bool)) {
                            ((a2) ((wc3) g95Var2.m)).f283o.g();
                        }
                        IQuickActionsViewModel iQuickActionsViewModel2 = j26Var.f1124o;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 2);
                        return bool;
                    case 1:
                        ha6 ha6Var = ((a2) ((wc3) j26Var.n.m)).f283o;
                        ha6Var.getClass();
                        ye4.a("RemoteSettings", " send lock workstation: ");
                        bk7 bk7Var = bk7.TVCmdLockWorkstation;
                        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                        a2 a2Var = ha6Var.a;
                        if (a2Var.f(ak7VarN, true)) {
                            a2Var.m.g.a(ISessionStatisticsSender.SessionStatisticsInfoType.LockWorkStation, true);
                        }
                        IQuickActionsViewModel iQuickActionsViewModel3 = j26Var.f1124o;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 3);
                        return Boolean.TRUE;
                    default:
                        RCClientActivity rCClientActivity = j26Var.p;
                        if (rCClientActivity != null) {
                            rCClientActivity.Y(new ar(j26Var, (byte) 22));
                        }
                        return Boolean.TRUE;
                }
            }
        }));
        final byte b3 = 2;
        arrayList.add(new f26(2, new nw4(Integer.valueOf(R.string.tv_action_RemoteReboot)), new nw4(Integer.valueOf(R.drawable.quick_action_reboot)), ((a2) ec3Var).p.h, new Function0(this) { // from class: o.h26
            public final /* synthetic */ j26 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                j26 j26Var = this.n;
                switch (b4) {
                    case 0:
                        g95 g95Var2 = j26Var.n;
                        Object value = ((a2) ((wc3) g95Var2.m)).p.e.getValue();
                        Boolean bool = Boolean.TRUE;
                        if (im3.n(value, bool)) {
                            ((a2) ((wc3) g95Var2.m)).f283o.g();
                        }
                        IQuickActionsViewModel iQuickActionsViewModel2 = j26Var.f1124o;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 2);
                        return bool;
                    case 1:
                        ha6 ha6Var = ((a2) ((wc3) j26Var.n.m)).f283o;
                        ha6Var.getClass();
                        ye4.a("RemoteSettings", " send lock workstation: ");
                        bk7 bk7Var = bk7.TVCmdLockWorkstation;
                        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                        a2 a2Var = ha6Var.a;
                        if (a2Var.f(ak7VarN, true)) {
                            a2Var.m.g.a(ISessionStatisticsSender.SessionStatisticsInfoType.LockWorkStation, true);
                        }
                        IQuickActionsViewModel iQuickActionsViewModel3 = j26Var.f1124o;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 3);
                        return Boolean.TRUE;
                    default:
                        RCClientActivity rCClientActivity = j26Var.p;
                        if (rCClientActivity != null) {
                            rCClientActivity.Y(new ar(j26Var, (byte) 22));
                        }
                        return Boolean.TRUE;
                }
            }
        }));
        arrayList.add(new wz4(g95Var.P()));
        arrayList.add(V0(this, 3, new nw4(Integer.valueOf(R.string.tv_action_BlockRemoteInput_Block)), new nw4(Integer.valueOf(R.drawable.quick_action_disable_user_input)), g95Var.P(), ep3Var.v(), ep3Var.t(), null, new Function0() { // from class: o.i26
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                eu6 eu6Var;
                byte b4 = b;
                t12 t12Var = t12.InputBlocked;
                boolean zM = false;
                j26 j26Var = this;
                ep3 ep3Var2 = ep3Var;
                switch (b4) {
                    case 0:
                        boolean zN = im3.n((Boolean) ep3Var2.t().getValue(), Boolean.TRUE);
                        IQuickActionsViewModel iQuickActionsViewModel2 = j26Var.f1124o;
                        if (zN) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 7);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 6);
                        }
                        wc3 wc3Var = (wc3) ((fp1) ep3Var2.n).a;
                        eu6Var = wc3Var instanceof eu6 ? (eu6) wc3Var : null;
                        if (eu6Var != null) {
                            t12 t12Var2 = (t12) ((yd2) ep3Var2.p).getValue();
                            zM = (t12Var2 != null ? f16.a[t12Var2.ordinal()] : -1) == 1 ? eu6Var.m(t12Var) : eu6Var.m(t12.NotBlocked);
                        }
                        return Boolean.valueOf(zM);
                    default:
                        boolean zN2 = im3.n((Boolean) ep3Var2.v().getValue(), Boolean.TRUE);
                        IQuickActionsViewModel iQuickActionsViewModel3 = j26Var.f1124o;
                        if (zN2) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 9);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 8);
                        }
                        wc3 wc3Var2 = (wc3) ((fp1) ep3Var2.n).a;
                        eu6Var = wc3Var2 instanceof eu6 ? (eu6) wc3Var2 : null;
                        if (eu6Var != null) {
                            t12 t12Var3 = (t12) ((yd2) ep3Var2.p).getValue();
                            zM = (t12Var3 != null ? f16.a[t12Var3.ordinal()] : -1) == 2 ? eu6Var.m(t12Var) : eu6Var.m(t12.BlackScreen);
                        }
                        return Boolean.valueOf(zM);
                }
            }
        }, 64));
        nw4 nw4Var3 = new nw4(Integer.valueOf(R.string.tv_action_BlockRemoteInput_MonitorOff));
        nw4 nw4Var4 = new nw4(Integer.valueOf(R.drawable.quick_action_show_black_screen));
        nw4 nw4Var5 = new nw4(Integer.valueOf(R.string.tv_action_BlockRemoteInput_UnBlocked_Description));
        arrayList.add(V0(this, 4, nw4Var3, nw4Var4, g95Var.P(), null, ep3Var.v(), nw4Var5, new Function0() { // from class: o.i26
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                eu6 eu6Var;
                byte b4 = b2;
                t12 t12Var = t12.InputBlocked;
                boolean zM = false;
                j26 j26Var = this;
                ep3 ep3Var2 = ep3Var;
                switch (b4) {
                    case 0:
                        boolean zN = im3.n((Boolean) ep3Var2.t().getValue(), Boolean.TRUE);
                        IQuickActionsViewModel iQuickActionsViewModel2 = j26Var.f1124o;
                        if (zN) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 7);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 6);
                        }
                        wc3 wc3Var = (wc3) ((fp1) ep3Var2.n).a;
                        eu6Var = wc3Var instanceof eu6 ? (eu6) wc3Var : null;
                        if (eu6Var != null) {
                            t12 t12Var2 = (t12) ((yd2) ep3Var2.p).getValue();
                            zM = (t12Var2 != null ? f16.a[t12Var2.ordinal()] : -1) == 1 ? eu6Var.m(t12Var) : eu6Var.m(t12.NotBlocked);
                        }
                        return Boolean.valueOf(zM);
                    default:
                        boolean zN2 = im3.n((Boolean) ep3Var2.v().getValue(), Boolean.TRUE);
                        IQuickActionsViewModel iQuickActionsViewModel3 = j26Var.f1124o;
                        if (zN2) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 9);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 8);
                        }
                        wc3 wc3Var2 = (wc3) ((fp1) ep3Var2.n).a;
                        eu6Var = wc3Var2 instanceof eu6 ? (eu6) wc3Var2 : null;
                        if (eu6Var != null) {
                            t12 t12Var3 = (t12) ((yd2) ep3Var2.p).getValue();
                            zM = (t12Var3 != null ? f16.a[t12Var3.ordinal()] : -1) == 2 ? eu6Var.m(t12Var) : eu6Var.m(t12.BlackScreen);
                        }
                        return Boolean.valueOf(zM);
                }
            }
        }, 16));
    }

    public static g26 V0(j26 j26Var, int i, nw4 nw4Var, nw4 nw4Var2, nw4 nw4Var3, lo4 lo4Var, nw4 nw4Var4, nw4 nw4Var5, Function0 function0, int i2) {
        return new g26(i, nw4Var, nw4Var2, nw4Var3, (i2 & 16) != 0 ? new nw4(Boolean.FALSE) : lo4Var, nw4Var4, (i2 & 64) != 0 ? null : nw4Var5, function0);
    }

    @Override // o.tc3
    public final void G0(RCClientActivity rCClientActivity) {
        this.p = rCClientActivity;
    }

    @Override // o.oe8
    public final void U0() {
        this.f1124o.a();
    }

    @Override // o.tc3
    public final ArrayList r() {
        return this.q;
    }
}
