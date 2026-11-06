package o;

import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.remotecontrollib.swig.IQuickActionsViewModel;
import com.teamviewer.remotecontrollib.swig.IQuickActionsViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class xz4 extends oe8 implements tc3 {
    public final IQuickActionsViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RCClientActivity f2565o;
    public final ArrayList p;

    public xz4(IQuickActionsViewModel iQuickActionsViewModel) {
        this.n = iQuickActionsViewModel;
        ArrayList arrayList = new ArrayList();
        this.p = arrayList;
        nw4 nw4Var = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_ctrl_alt_del));
        nw4 nw4Var2 = new nw4(Integer.valueOf(R.drawable.quick_action_ctrl_alt_del));
        final byte b = 0;
        NativeLiveDataBool nativeLiveDataBoolNewInstance = NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsCtrlAltDelAvailable(iQuickActionsViewModel.a, iQuickActionsViewModel), false);
        nativeLiveDataBoolNewInstance.getClass();
        arrayList.add(new f26(0, nw4Var, nw4Var2, nativeLiveDataBoolNewInstance, new Function0(this) { // from class: o.vz4
            public final /* synthetic */ xz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                xz4 xz4Var = this.n;
                switch (b2) {
                    case 0:
                        IQuickActionsViewModel iQuickActionsViewModel2 = xz4Var.n;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_SendCtrlAltDel(iQuickActionsViewModel2.a, iQuickActionsViewModel2);
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 2);
                        return Boolean.TRUE;
                    case 1:
                        IQuickActionsViewModel iQuickActionsViewModel3 = xz4Var.n;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_LockRemoteWorkstation(iQuickActionsViewModel3.a, iQuickActionsViewModel3);
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 3);
                        return Boolean.TRUE;
                    case 2:
                        RCClientActivity rCClientActivity = xz4Var.f2565o;
                        if (rCClientActivity != null) {
                            rCClientActivity.Y(new ar(xz4Var, (byte) 17));
                        }
                        return Boolean.TRUE;
                    case 3:
                        IQuickActionsViewModel iQuickActionsViewModel4 = xz4Var.n;
                        if (im3.n((Boolean) NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsDisablePartnerInputActive(iQuickActionsViewModel4.a, iQuickActionsViewModel4), false).getValue(), Boolean.TRUE)) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel4.a, iQuickActionsViewModel4, 7);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel4.a, iQuickActionsViewModel4, 6);
                        }
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_TogglePartnerInput(iQuickActionsViewModel4.a, iQuickActionsViewModel4);
                        return Boolean.FALSE;
                    default:
                        IQuickActionsViewModel iQuickActionsViewModel5 = xz4Var.n;
                        if (im3.n((Boolean) NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsBlackScreenActive(iQuickActionsViewModel5.a, iQuickActionsViewModel5), false).getValue(), Boolean.TRUE)) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel5.a, iQuickActionsViewModel5, 9);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel5.a, iQuickActionsViewModel5, 8);
                        }
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ToggleBlackScreen(iQuickActionsViewModel5.a, iQuickActionsViewModel5);
                        return Boolean.FALSE;
                }
            }
        }));
        nw4 nw4Var3 = new nw4(Integer.valueOf(R.string.tv_action_lock_computer));
        nw4 nw4Var4 = new nw4(Integer.valueOf(R.drawable.quick_action_lock_screen));
        NativeLiveDataBool nativeLiveDataBoolNewInstance2 = NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsLockRemoteWorkstationAvailable(iQuickActionsViewModel.a, iQuickActionsViewModel), false);
        nativeLiveDataBoolNewInstance2.getClass();
        final byte b2 = 1;
        arrayList.add(new f26(1, nw4Var3, nw4Var4, nativeLiveDataBoolNewInstance2, new Function0(this) { // from class: o.vz4
            public final /* synthetic */ xz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                xz4 xz4Var = this.n;
                switch (b3) {
                    case 0:
                        IQuickActionsViewModel iQuickActionsViewModel2 = xz4Var.n;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_SendCtrlAltDel(iQuickActionsViewModel2.a, iQuickActionsViewModel2);
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 2);
                        return Boolean.TRUE;
                    case 1:
                        IQuickActionsViewModel iQuickActionsViewModel3 = xz4Var.n;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_LockRemoteWorkstation(iQuickActionsViewModel3.a, iQuickActionsViewModel3);
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 3);
                        return Boolean.TRUE;
                    case 2:
                        RCClientActivity rCClientActivity = xz4Var.f2565o;
                        if (rCClientActivity != null) {
                            rCClientActivity.Y(new ar(xz4Var, (byte) 17));
                        }
                        return Boolean.TRUE;
                    case 3:
                        IQuickActionsViewModel iQuickActionsViewModel4 = xz4Var.n;
                        if (im3.n((Boolean) NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsDisablePartnerInputActive(iQuickActionsViewModel4.a, iQuickActionsViewModel4), false).getValue(), Boolean.TRUE)) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel4.a, iQuickActionsViewModel4, 7);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel4.a, iQuickActionsViewModel4, 6);
                        }
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_TogglePartnerInput(iQuickActionsViewModel4.a, iQuickActionsViewModel4);
                        return Boolean.FALSE;
                    default:
                        IQuickActionsViewModel iQuickActionsViewModel5 = xz4Var.n;
                        if (im3.n((Boolean) NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsBlackScreenActive(iQuickActionsViewModel5.a, iQuickActionsViewModel5), false).getValue(), Boolean.TRUE)) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel5.a, iQuickActionsViewModel5, 9);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel5.a, iQuickActionsViewModel5, 8);
                        }
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ToggleBlackScreen(iQuickActionsViewModel5.a, iQuickActionsViewModel5);
                        return Boolean.FALSE;
                }
            }
        }));
        nw4 nw4Var5 = new nw4(Integer.valueOf(R.string.tv_action_RemoteReboot));
        nw4 nw4Var6 = new nw4(Integer.valueOf(R.drawable.quick_action_reboot));
        NativeLiveDataBool nativeLiveDataBoolNewInstance3 = NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsRemoteRebootAvailable(iQuickActionsViewModel.a, iQuickActionsViewModel), false);
        nativeLiveDataBoolNewInstance3.getClass();
        final byte b3 = 2;
        arrayList.add(new f26(2, nw4Var5, nw4Var6, nativeLiveDataBoolNewInstance3, new Function0(this) { // from class: o.vz4
            public final /* synthetic */ xz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                xz4 xz4Var = this.n;
                switch (b4) {
                    case 0:
                        IQuickActionsViewModel iQuickActionsViewModel2 = xz4Var.n;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_SendCtrlAltDel(iQuickActionsViewModel2.a, iQuickActionsViewModel2);
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 2);
                        return Boolean.TRUE;
                    case 1:
                        IQuickActionsViewModel iQuickActionsViewModel3 = xz4Var.n;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_LockRemoteWorkstation(iQuickActionsViewModel3.a, iQuickActionsViewModel3);
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 3);
                        return Boolean.TRUE;
                    case 2:
                        RCClientActivity rCClientActivity = xz4Var.f2565o;
                        if (rCClientActivity != null) {
                            rCClientActivity.Y(new ar(xz4Var, (byte) 17));
                        }
                        return Boolean.TRUE;
                    case 3:
                        IQuickActionsViewModel iQuickActionsViewModel4 = xz4Var.n;
                        if (im3.n((Boolean) NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsDisablePartnerInputActive(iQuickActionsViewModel4.a, iQuickActionsViewModel4), false).getValue(), Boolean.TRUE)) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel4.a, iQuickActionsViewModel4, 7);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel4.a, iQuickActionsViewModel4, 6);
                        }
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_TogglePartnerInput(iQuickActionsViewModel4.a, iQuickActionsViewModel4);
                        return Boolean.FALSE;
                    default:
                        IQuickActionsViewModel iQuickActionsViewModel5 = xz4Var.n;
                        if (im3.n((Boolean) NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsBlackScreenActive(iQuickActionsViewModel5.a, iQuickActionsViewModel5), false).getValue(), Boolean.TRUE)) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel5.a, iQuickActionsViewModel5, 9);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel5.a, iQuickActionsViewModel5, 8);
                        }
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ToggleBlackScreen(iQuickActionsViewModel5.a, iQuickActionsViewModel5);
                        return Boolean.FALSE;
                }
            }
        }));
        NativeLiveDataBool nativeLiveDataBoolNewInstance4 = NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsDisablePartnerInputAvailable(iQuickActionsViewModel.a, iQuickActionsViewModel), false);
        nativeLiveDataBoolNewInstance4.getClass();
        arrayList.add(new wz4(nativeLiveDataBoolNewInstance4));
        nw4 nw4Var7 = new nw4(Integer.valueOf(R.string.tv_action_BlockRemoteInput_Block));
        nw4 nw4Var8 = new nw4(Integer.valueOf(R.drawable.quick_action_disable_user_input));
        NativeLiveDataBool nativeLiveDataBoolNewInstance5 = NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsDisablePartnerInputActive(iQuickActionsViewModel.a, iQuickActionsViewModel), false);
        nativeLiveDataBoolNewInstance5.getClass();
        final byte b4 = 3;
        arrayList.add(V0(this, 3, nw4Var7, nw4Var8, nativeLiveDataBoolNewInstance4, nativeLiveDataBoolNewInstance5, null, new Function0(this) { // from class: o.vz4
            public final /* synthetic */ xz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b5 = b4;
                xz4 xz4Var = this.n;
                switch (b5) {
                    case 0:
                        IQuickActionsViewModel iQuickActionsViewModel2 = xz4Var.n;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_SendCtrlAltDel(iQuickActionsViewModel2.a, iQuickActionsViewModel2);
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 2);
                        return Boolean.TRUE;
                    case 1:
                        IQuickActionsViewModel iQuickActionsViewModel3 = xz4Var.n;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_LockRemoteWorkstation(iQuickActionsViewModel3.a, iQuickActionsViewModel3);
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 3);
                        return Boolean.TRUE;
                    case 2:
                        RCClientActivity rCClientActivity = xz4Var.f2565o;
                        if (rCClientActivity != null) {
                            rCClientActivity.Y(new ar(xz4Var, (byte) 17));
                        }
                        return Boolean.TRUE;
                    case 3:
                        IQuickActionsViewModel iQuickActionsViewModel4 = xz4Var.n;
                        if (im3.n((Boolean) NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsDisablePartnerInputActive(iQuickActionsViewModel4.a, iQuickActionsViewModel4), false).getValue(), Boolean.TRUE)) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel4.a, iQuickActionsViewModel4, 7);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel4.a, iQuickActionsViewModel4, 6);
                        }
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_TogglePartnerInput(iQuickActionsViewModel4.a, iQuickActionsViewModel4);
                        return Boolean.FALSE;
                    default:
                        IQuickActionsViewModel iQuickActionsViewModel5 = xz4Var.n;
                        if (im3.n((Boolean) NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsBlackScreenActive(iQuickActionsViewModel5.a, iQuickActionsViewModel5), false).getValue(), Boolean.TRUE)) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel5.a, iQuickActionsViewModel5, 9);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel5.a, iQuickActionsViewModel5, 8);
                        }
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ToggleBlackScreen(iQuickActionsViewModel5.a, iQuickActionsViewModel5);
                        return Boolean.FALSE;
                }
            }
        }, 80));
        nw4 nw4Var9 = new nw4(Integer.valueOf(R.string.tv_action_BlockRemoteInput_MonitorOff));
        nw4 nw4Var10 = new nw4(Integer.valueOf(R.drawable.quick_action_show_black_screen));
        nw4 nw4Var11 = new nw4(Integer.valueOf(R.string.tv_action_BlockRemoteInput_UnBlocked_Description));
        NativeLiveDataBool nativeLiveDataBoolNewInstance6 = NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsBlackScreenActive(iQuickActionsViewModel.a, iQuickActionsViewModel), false);
        nativeLiveDataBoolNewInstance6.getClass();
        NativeLiveDataBool nativeLiveDataBoolNewInstance7 = NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsBlackScreenAvailable(iQuickActionsViewModel.a, iQuickActionsViewModel), false);
        nativeLiveDataBoolNewInstance7.getClass();
        final byte b5 = 4;
        arrayList.add(V0(this, 4, nw4Var9, nw4Var10, nativeLiveDataBoolNewInstance7, nativeLiveDataBoolNewInstance6, nw4Var11, new Function0(this) { // from class: o.vz4
            public final /* synthetic */ xz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b6 = b5;
                xz4 xz4Var = this.n;
                switch (b6) {
                    case 0:
                        IQuickActionsViewModel iQuickActionsViewModel2 = xz4Var.n;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_SendCtrlAltDel(iQuickActionsViewModel2.a, iQuickActionsViewModel2);
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 2);
                        return Boolean.TRUE;
                    case 1:
                        IQuickActionsViewModel iQuickActionsViewModel3 = xz4Var.n;
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_LockRemoteWorkstation(iQuickActionsViewModel3.a, iQuickActionsViewModel3);
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel3.a, iQuickActionsViewModel3, 3);
                        return Boolean.TRUE;
                    case 2:
                        RCClientActivity rCClientActivity = xz4Var.f2565o;
                        if (rCClientActivity != null) {
                            rCClientActivity.Y(new ar(xz4Var, (byte) 17));
                        }
                        return Boolean.TRUE;
                    case 3:
                        IQuickActionsViewModel iQuickActionsViewModel4 = xz4Var.n;
                        if (im3.n((Boolean) NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsDisablePartnerInputActive(iQuickActionsViewModel4.a, iQuickActionsViewModel4), false).getValue(), Boolean.TRUE)) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel4.a, iQuickActionsViewModel4, 7);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel4.a, iQuickActionsViewModel4, 6);
                        }
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_TogglePartnerInput(iQuickActionsViewModel4.a, iQuickActionsViewModel4);
                        return Boolean.FALSE;
                    default:
                        IQuickActionsViewModel iQuickActionsViewModel5 = xz4Var.n;
                        if (im3.n((Boolean) NativeLiveDataBool.newInstance(IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_IsBlackScreenActive(iQuickActionsViewModel5.a, iQuickActionsViewModel5), false).getValue(), Boolean.TRUE)) {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel5.a, iQuickActionsViewModel5, 9);
                        } else {
                            IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel5.a, iQuickActionsViewModel5, 8);
                        }
                        IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ToggleBlackScreen(iQuickActionsViewModel5.a, iQuickActionsViewModel5);
                        return Boolean.FALSE;
                }
            }
        }, 16));
    }

    public static g26 V0(xz4 xz4Var, int i, nw4 nw4Var, nw4 nw4Var2, NativeLiveDataBool nativeLiveDataBool, NativeLiveDataBool nativeLiveDataBool2, nw4 nw4Var3, Function0 function0, int i2) {
        nw4 nw4Var4 = nw4Var3;
        nw4 nw4Var5 = new nw4(Boolean.FALSE);
        if ((i2 & 64) != 0) {
            nw4Var4 = null;
        }
        return new g26(i, nw4Var, nw4Var2, nativeLiveDataBool, nw4Var5, nativeLiveDataBool2, nw4Var4, function0);
    }

    @Override // o.tc3
    public final void G0(RCClientActivity rCClientActivity) {
        this.f2565o = rCClientActivity;
    }

    @Override // o.oe8
    public final void U0() {
        this.n.a();
    }

    @Override // o.tc3
    public final ArrayList r() {
        return this.p;
    }
}
