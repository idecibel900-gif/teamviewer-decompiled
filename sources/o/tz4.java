package o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.remotecontrollib.swig.ISessionToolbarViewModel;
import com.teamviewer.remotecontrollib.swig.ISessionToolbarViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class tz4 extends uz7 implements nc3 {
    public final ISessionToolbarViewModel s;
    public final Resources t;
    public RCClientActivity u;
    public final NativeLiveDataBool v;
    public final NativeLiveDataBool w;
    public final NativeLiveDataBool x;
    public final NativeLiveDataBool y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz4(ISessionToolbarViewModel iSessionToolbarViewModel, SharedPreferences sharedPreferences, Resources resources) {
        super(true);
        sharedPreferences.getClass();
        final byte b = 1;
        this.s = iSessionToolbarViewModel;
        this.t = resources;
        final byte b2 = 0;
        NativeLiveDataBool nativeLiveDataBoolNewInstance = NativeLiveDataBool.newInstance(ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ShowChangeMonitor(iSessionToolbarViewModel.a, iSessionToolbarViewModel), false);
        this.v = nativeLiveDataBoolNewInstance;
        NativeLiveDataBool nativeLiveDataBoolNewInstance2 = NativeLiveDataBool.newInstance(ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ShowOpenKeyboard(iSessionToolbarViewModel.a, iSessionToolbarViewModel), false);
        this.w = nativeLiveDataBoolNewInstance2;
        NativeLiveDataBool nativeLiveDataBoolNewInstance3 = NativeLiveDataBool.newInstance(ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ShowRequestControl(iSessionToolbarViewModel.a, iSessionToolbarViewModel), false);
        this.x = nativeLiveDataBoolNewInstance3;
        NativeLiveDataBool nativeLiveDataBoolNewInstance4 = NativeLiveDataBool.newInstance(ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ShowQuickActionsButton(iSessionToolbarViewModel.a, iSessionToolbarViewModel), false);
        this.y = nativeLiveDataBoolNewInstance4;
        V0(new o16(0, new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_close)), new nw4(Y0(ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_IsAutoLockOnSessionEnd(iSessionToolbarViewModel.a, iSessionToolbarViewModel) ? R.drawable.stoolbar_close_lock : R.drawable.stoolbar_close)), null, null, new Function0(this) { // from class: o.qz4
            public final /* synthetic */ tz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                tz4 tz4Var = this.n;
                switch (b3) {
                    case 0:
                        RCClientActivity rCClientActivity = tz4Var.u;
                        if (rCClientActivity != null) {
                            rCClientActivity.V(new rz4(tz4Var));
                        }
                        break;
                    case 1:
                        ISessionToolbarViewModel iSessionToolbarViewModel2 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ChangeMonitor(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                        break;
                    case 2:
                        RCClientActivity rCClientActivity2 = tz4Var.u;
                        if (rCClientActivity2 != null) {
                            rCClientActivity2.Q();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel3 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                        break;
                    case 3:
                        RCClientActivity rCClientActivity3 = tz4Var.u;
                        if (rCClientActivity3 != null) {
                            rCClientActivity3.W(new rz4(tz4Var));
                        }
                        break;
                    case 4:
                        ISessionToolbarViewModel iSessionToolbarViewModel4 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_RequestControl(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 6);
                        break;
                    case 5:
                        RCClientActivity rCClientActivity4 = tz4Var.u;
                        if (rCClientActivity4 != null) {
                            new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                            lc3 lc3Var = rCClientActivity4.P;
                            if (lc3Var != null) {
                                lc3Var.H();
                            }
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel5 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 7);
                        break;
                    case 6:
                        RCClientActivity rCClientActivity5 = tz4Var.u;
                        if (rCClientActivity5 != null) {
                            new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                            lc3 lc3Var2 = rCClientActivity5.P;
                            if (lc3Var2 != null) {
                                lc3Var2.H();
                            }
                            lc3 lc3Var3 = rCClientActivity5.P;
                            if (lc3Var3 != null) {
                                lc3Var3.z();
                            }
                        }
                        break;
                    case 7:
                        RCClientActivity rCClientActivity6 = tz4Var.u;
                        if (rCClientActivity6 != null) {
                            rCClientActivity6.X();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel6 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity7 = tz4Var.u;
                        if (rCClientActivity7 != null) {
                            rCClientActivity7.K();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel7 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel7.a, iSessionToolbarViewModel7, 9);
                        break;
                }
                return f88Var;
            }
        }, 56));
        nw4 nw4Var = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_next_monitor));
        nw4 nw4Var2 = new nw4(Y0(R.drawable.stoolbar_next_monitor));
        nativeLiveDataBoolNewInstance.getClass();
        V0(new o16(1, nw4Var, nw4Var2, nativeLiveDataBoolNewInstance, null, new Function0(this) { // from class: o.qz4
            public final /* synthetic */ tz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b;
                f88 f88Var = f88.a;
                tz4 tz4Var = this.n;
                switch (b3) {
                    case 0:
                        RCClientActivity rCClientActivity = tz4Var.u;
                        if (rCClientActivity != null) {
                            rCClientActivity.V(new rz4(tz4Var));
                        }
                        break;
                    case 1:
                        ISessionToolbarViewModel iSessionToolbarViewModel2 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ChangeMonitor(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                        break;
                    case 2:
                        RCClientActivity rCClientActivity2 = tz4Var.u;
                        if (rCClientActivity2 != null) {
                            rCClientActivity2.Q();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel3 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                        break;
                    case 3:
                        RCClientActivity rCClientActivity3 = tz4Var.u;
                        if (rCClientActivity3 != null) {
                            rCClientActivity3.W(new rz4(tz4Var));
                        }
                        break;
                    case 4:
                        ISessionToolbarViewModel iSessionToolbarViewModel4 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_RequestControl(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 6);
                        break;
                    case 5:
                        RCClientActivity rCClientActivity4 = tz4Var.u;
                        if (rCClientActivity4 != null) {
                            new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                            lc3 lc3Var = rCClientActivity4.P;
                            if (lc3Var != null) {
                                lc3Var.H();
                            }
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel5 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 7);
                        break;
                    case 6:
                        RCClientActivity rCClientActivity5 = tz4Var.u;
                        if (rCClientActivity5 != null) {
                            new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                            lc3 lc3Var2 = rCClientActivity5.P;
                            if (lc3Var2 != null) {
                                lc3Var2.H();
                            }
                            lc3 lc3Var3 = rCClientActivity5.P;
                            if (lc3Var3 != null) {
                                lc3Var3.z();
                            }
                        }
                        break;
                    case 7:
                        RCClientActivity rCClientActivity6 = tz4Var.u;
                        if (rCClientActivity6 != null) {
                            rCClientActivity6.X();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel6 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity7 = tz4Var.u;
                        if (rCClientActivity7 != null) {
                            rCClientActivity7.K();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel7 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel7.a, iSessionToolbarViewModel7, 9);
                        break;
                }
                return f88Var;
            }
        }, 112));
        nw4 nw4Var3 = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_keyboard));
        nw4 nw4Var4 = new nw4(Y0(R.drawable.stoolbar_keyboard));
        nativeLiveDataBoolNewInstance2.getClass();
        final byte b3 = 2;
        V0(new o16(2, nw4Var3, nw4Var4, null, nativeLiveDataBoolNewInstance2, new Function0(this) { // from class: o.qz4
            public final /* synthetic */ tz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                f88 f88Var = f88.a;
                tz4 tz4Var = this.n;
                switch (b4) {
                    case 0:
                        RCClientActivity rCClientActivity = tz4Var.u;
                        if (rCClientActivity != null) {
                            rCClientActivity.V(new rz4(tz4Var));
                        }
                        break;
                    case 1:
                        ISessionToolbarViewModel iSessionToolbarViewModel2 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ChangeMonitor(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                        break;
                    case 2:
                        RCClientActivity rCClientActivity2 = tz4Var.u;
                        if (rCClientActivity2 != null) {
                            rCClientActivity2.Q();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel3 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                        break;
                    case 3:
                        RCClientActivity rCClientActivity3 = tz4Var.u;
                        if (rCClientActivity3 != null) {
                            rCClientActivity3.W(new rz4(tz4Var));
                        }
                        break;
                    case 4:
                        ISessionToolbarViewModel iSessionToolbarViewModel4 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_RequestControl(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 6);
                        break;
                    case 5:
                        RCClientActivity rCClientActivity4 = tz4Var.u;
                        if (rCClientActivity4 != null) {
                            new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                            lc3 lc3Var = rCClientActivity4.P;
                            if (lc3Var != null) {
                                lc3Var.H();
                            }
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel5 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 7);
                        break;
                    case 6:
                        RCClientActivity rCClientActivity5 = tz4Var.u;
                        if (rCClientActivity5 != null) {
                            new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                            lc3 lc3Var2 = rCClientActivity5.P;
                            if (lc3Var2 != null) {
                                lc3Var2.H();
                            }
                            lc3 lc3Var3 = rCClientActivity5.P;
                            if (lc3Var3 != null) {
                                lc3Var3.z();
                            }
                        }
                        break;
                    case 7:
                        RCClientActivity rCClientActivity6 = tz4Var.u;
                        if (rCClientActivity6 != null) {
                            rCClientActivity6.X();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel6 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity7 = tz4Var.u;
                        if (rCClientActivity7 != null) {
                            rCClientActivity7.K();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel7 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel7.a, iSessionToolbarViewModel7, 9);
                        break;
                }
                return f88Var;
            }
        }, 104));
        fy6 fy6Var = new fy6(sharedPreferences);
        fj3 fj3Var = new fj3((Object) this, (byte) 15);
        lo4 lo4Var = fy6Var.isInitialized() ? new lo4(fj3Var.invoke(fy6Var.getValue())) : new lo4();
        lo4Var.b(fy6Var, new a7(new py5((Object) lo4Var, (Object) fj3Var, (byte) 24), (byte) 16));
        final byte b4 = 3;
        V0(new o16(3, new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_input_method)), lo4Var, null, null, new Function0(this) { // from class: o.qz4
            public final /* synthetic */ tz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b5 = b4;
                f88 f88Var = f88.a;
                tz4 tz4Var = this.n;
                switch (b5) {
                    case 0:
                        RCClientActivity rCClientActivity = tz4Var.u;
                        if (rCClientActivity != null) {
                            rCClientActivity.V(new rz4(tz4Var));
                        }
                        break;
                    case 1:
                        ISessionToolbarViewModel iSessionToolbarViewModel2 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ChangeMonitor(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                        break;
                    case 2:
                        RCClientActivity rCClientActivity2 = tz4Var.u;
                        if (rCClientActivity2 != null) {
                            rCClientActivity2.Q();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel3 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                        break;
                    case 3:
                        RCClientActivity rCClientActivity3 = tz4Var.u;
                        if (rCClientActivity3 != null) {
                            rCClientActivity3.W(new rz4(tz4Var));
                        }
                        break;
                    case 4:
                        ISessionToolbarViewModel iSessionToolbarViewModel4 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_RequestControl(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 6);
                        break;
                    case 5:
                        RCClientActivity rCClientActivity4 = tz4Var.u;
                        if (rCClientActivity4 != null) {
                            new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                            lc3 lc3Var = rCClientActivity4.P;
                            if (lc3Var != null) {
                                lc3Var.H();
                            }
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel5 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 7);
                        break;
                    case 6:
                        RCClientActivity rCClientActivity5 = tz4Var.u;
                        if (rCClientActivity5 != null) {
                            new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                            lc3 lc3Var2 = rCClientActivity5.P;
                            if (lc3Var2 != null) {
                                lc3Var2.H();
                            }
                            lc3 lc3Var3 = rCClientActivity5.P;
                            if (lc3Var3 != null) {
                                lc3Var3.z();
                            }
                        }
                        break;
                    case 7:
                        RCClientActivity rCClientActivity6 = tz4Var.u;
                        if (rCClientActivity6 != null) {
                            rCClientActivity6.X();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel6 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity7 = tz4Var.u;
                        if (rCClientActivity7 != null) {
                            rCClientActivity7.K();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel7 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel7.a, iSessionToolbarViewModel7, 9);
                        break;
                }
                return f88Var;
            }
        }, 120));
        nw4 nw4Var5 = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_requestControl));
        nw4 nw4Var6 = new nw4(Y0(R.drawable.stoolbar_request_control));
        nativeLiveDataBoolNewInstance3.getClass();
        final byte b5 = 4;
        V0(new o16(4, nw4Var5, nw4Var6, nativeLiveDataBoolNewInstance3, null, new Function0(this) { // from class: o.qz4
            public final /* synthetic */ tz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b6 = b5;
                f88 f88Var = f88.a;
                tz4 tz4Var = this.n;
                switch (b6) {
                    case 0:
                        RCClientActivity rCClientActivity = tz4Var.u;
                        if (rCClientActivity != null) {
                            rCClientActivity.V(new rz4(tz4Var));
                        }
                        break;
                    case 1:
                        ISessionToolbarViewModel iSessionToolbarViewModel2 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ChangeMonitor(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                        break;
                    case 2:
                        RCClientActivity rCClientActivity2 = tz4Var.u;
                        if (rCClientActivity2 != null) {
                            rCClientActivity2.Q();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel3 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                        break;
                    case 3:
                        RCClientActivity rCClientActivity3 = tz4Var.u;
                        if (rCClientActivity3 != null) {
                            rCClientActivity3.W(new rz4(tz4Var));
                        }
                        break;
                    case 4:
                        ISessionToolbarViewModel iSessionToolbarViewModel4 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_RequestControl(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 6);
                        break;
                    case 5:
                        RCClientActivity rCClientActivity4 = tz4Var.u;
                        if (rCClientActivity4 != null) {
                            new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                            lc3 lc3Var = rCClientActivity4.P;
                            if (lc3Var != null) {
                                lc3Var.H();
                            }
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel5 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 7);
                        break;
                    case 6:
                        RCClientActivity rCClientActivity5 = tz4Var.u;
                        if (rCClientActivity5 != null) {
                            new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                            lc3 lc3Var2 = rCClientActivity5.P;
                            if (lc3Var2 != null) {
                                lc3Var2.H();
                            }
                            lc3 lc3Var3 = rCClientActivity5.P;
                            if (lc3Var3 != null) {
                                lc3Var3.z();
                            }
                        }
                        break;
                    case 7:
                        RCClientActivity rCClientActivity6 = tz4Var.u;
                        if (rCClientActivity6 != null) {
                            rCClientActivity6.X();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel6 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity7 = tz4Var.u;
                        if (rCClientActivity7 != null) {
                            rCClientActivity7.K();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel7 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel7.a, iSessionToolbarViewModel7, 9);
                        break;
                }
                return f88Var;
            }
        }, 112));
        nw4 nw4Var7 = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_settings));
        nw4 nw4Var8 = new nw4(Y0(R.drawable.stoolbar_tools));
        nativeLiveDataBoolNewInstance4.getClass();
        final byte b6 = 5;
        V0(new o16(5, nw4Var7, nw4Var8, nativeLiveDataBoolNewInstance4, null, new Function0(this) { // from class: o.qz4
            public final /* synthetic */ tz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b7 = b6;
                f88 f88Var = f88.a;
                tz4 tz4Var = this.n;
                switch (b7) {
                    case 0:
                        RCClientActivity rCClientActivity = tz4Var.u;
                        if (rCClientActivity != null) {
                            rCClientActivity.V(new rz4(tz4Var));
                        }
                        break;
                    case 1:
                        ISessionToolbarViewModel iSessionToolbarViewModel2 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ChangeMonitor(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                        break;
                    case 2:
                        RCClientActivity rCClientActivity2 = tz4Var.u;
                        if (rCClientActivity2 != null) {
                            rCClientActivity2.Q();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel3 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                        break;
                    case 3:
                        RCClientActivity rCClientActivity3 = tz4Var.u;
                        if (rCClientActivity3 != null) {
                            rCClientActivity3.W(new rz4(tz4Var));
                        }
                        break;
                    case 4:
                        ISessionToolbarViewModel iSessionToolbarViewModel4 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_RequestControl(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 6);
                        break;
                    case 5:
                        RCClientActivity rCClientActivity4 = tz4Var.u;
                        if (rCClientActivity4 != null) {
                            new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                            lc3 lc3Var = rCClientActivity4.P;
                            if (lc3Var != null) {
                                lc3Var.H();
                            }
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel5 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 7);
                        break;
                    case 6:
                        RCClientActivity rCClientActivity5 = tz4Var.u;
                        if (rCClientActivity5 != null) {
                            new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                            lc3 lc3Var2 = rCClientActivity5.P;
                            if (lc3Var2 != null) {
                                lc3Var2.H();
                            }
                            lc3 lc3Var3 = rCClientActivity5.P;
                            if (lc3Var3 != null) {
                                lc3Var3.z();
                            }
                        }
                        break;
                    case 7:
                        RCClientActivity rCClientActivity6 = tz4Var.u;
                        if (rCClientActivity6 != null) {
                            rCClientActivity6.X();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel6 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity7 = tz4Var.u;
                        if (rCClientActivity7 != null) {
                            rCClientActivity7.K();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel7 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel7.a, iSessionToolbarViewModel7, 9);
                        break;
                }
                return f88Var;
            }
        }, 112));
        final byte b7 = 6;
        V0(new o16(8, new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_long_press_title_shortcuts)), new nw4(Y0(R.drawable.predefined_shortcuts_toolbar_icon)), null, null, new Function0(this) { // from class: o.qz4
            public final /* synthetic */ tz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b8 = b7;
                f88 f88Var = f88.a;
                tz4 tz4Var = this.n;
                switch (b8) {
                    case 0:
                        RCClientActivity rCClientActivity = tz4Var.u;
                        if (rCClientActivity != null) {
                            rCClientActivity.V(new rz4(tz4Var));
                        }
                        break;
                    case 1:
                        ISessionToolbarViewModel iSessionToolbarViewModel2 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ChangeMonitor(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                        break;
                    case 2:
                        RCClientActivity rCClientActivity2 = tz4Var.u;
                        if (rCClientActivity2 != null) {
                            rCClientActivity2.Q();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel3 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                        break;
                    case 3:
                        RCClientActivity rCClientActivity3 = tz4Var.u;
                        if (rCClientActivity3 != null) {
                            rCClientActivity3.W(new rz4(tz4Var));
                        }
                        break;
                    case 4:
                        ISessionToolbarViewModel iSessionToolbarViewModel4 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_RequestControl(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 6);
                        break;
                    case 5:
                        RCClientActivity rCClientActivity4 = tz4Var.u;
                        if (rCClientActivity4 != null) {
                            new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                            lc3 lc3Var = rCClientActivity4.P;
                            if (lc3Var != null) {
                                lc3Var.H();
                            }
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel5 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 7);
                        break;
                    case 6:
                        RCClientActivity rCClientActivity5 = tz4Var.u;
                        if (rCClientActivity5 != null) {
                            new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                            lc3 lc3Var2 = rCClientActivity5.P;
                            if (lc3Var2 != null) {
                                lc3Var2.H();
                            }
                            lc3 lc3Var3 = rCClientActivity5.P;
                            if (lc3Var3 != null) {
                                lc3Var3.z();
                            }
                        }
                        break;
                    case 7:
                        RCClientActivity rCClientActivity6 = tz4Var.u;
                        if (rCClientActivity6 != null) {
                            rCClientActivity6.X();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel6 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity7 = tz4Var.u;
                        if (rCClientActivity7 != null) {
                            rCClientActivity7.K();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel7 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel7.a, iSessionToolbarViewModel7, 9);
                        break;
                }
                return f88Var;
            }
        }, 120));
        final byte b8 = 7;
        V0(new o16(6, new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_options)), new nw4(Y0(R.drawable.stoolbar_settings)), null, null, new Function0(this) { // from class: o.qz4
            public final /* synthetic */ tz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b9 = b8;
                f88 f88Var = f88.a;
                tz4 tz4Var = this.n;
                switch (b9) {
                    case 0:
                        RCClientActivity rCClientActivity = tz4Var.u;
                        if (rCClientActivity != null) {
                            rCClientActivity.V(new rz4(tz4Var));
                        }
                        break;
                    case 1:
                        ISessionToolbarViewModel iSessionToolbarViewModel2 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ChangeMonitor(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                        break;
                    case 2:
                        RCClientActivity rCClientActivity2 = tz4Var.u;
                        if (rCClientActivity2 != null) {
                            rCClientActivity2.Q();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel3 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                        break;
                    case 3:
                        RCClientActivity rCClientActivity3 = tz4Var.u;
                        if (rCClientActivity3 != null) {
                            rCClientActivity3.W(new rz4(tz4Var));
                        }
                        break;
                    case 4:
                        ISessionToolbarViewModel iSessionToolbarViewModel4 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_RequestControl(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 6);
                        break;
                    case 5:
                        RCClientActivity rCClientActivity4 = tz4Var.u;
                        if (rCClientActivity4 != null) {
                            new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                            lc3 lc3Var = rCClientActivity4.P;
                            if (lc3Var != null) {
                                lc3Var.H();
                            }
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel5 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 7);
                        break;
                    case 6:
                        RCClientActivity rCClientActivity5 = tz4Var.u;
                        if (rCClientActivity5 != null) {
                            new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                            lc3 lc3Var2 = rCClientActivity5.P;
                            if (lc3Var2 != null) {
                                lc3Var2.H();
                            }
                            lc3 lc3Var3 = rCClientActivity5.P;
                            if (lc3Var3 != null) {
                                lc3Var3.z();
                            }
                        }
                        break;
                    case 7:
                        RCClientActivity rCClientActivity6 = tz4Var.u;
                        if (rCClientActivity6 != null) {
                            rCClientActivity6.X();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel6 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity7 = tz4Var.u;
                        if (rCClientActivity7 != null) {
                            rCClientActivity7.K();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel7 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel7.a, iSessionToolbarViewModel7, 9);
                        break;
                }
                return f88Var;
            }
        }, 120));
        final byte b9 = 8;
        V0(new o16(7, new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_hidetoolbar)), new nw4(Y0(R.drawable.stoolbar_hidetoolbar)), null, null, new Function0(this) { // from class: o.qz4
            public final /* synthetic */ tz4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b10 = b9;
                f88 f88Var = f88.a;
                tz4 tz4Var = this.n;
                switch (b10) {
                    case 0:
                        RCClientActivity rCClientActivity = tz4Var.u;
                        if (rCClientActivity != null) {
                            rCClientActivity.V(new rz4(tz4Var));
                        }
                        break;
                    case 1:
                        ISessionToolbarViewModel iSessionToolbarViewModel2 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ChangeMonitor(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                        break;
                    case 2:
                        RCClientActivity rCClientActivity2 = tz4Var.u;
                        if (rCClientActivity2 != null) {
                            rCClientActivity2.Q();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel3 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                        break;
                    case 3:
                        RCClientActivity rCClientActivity3 = tz4Var.u;
                        if (rCClientActivity3 != null) {
                            rCClientActivity3.W(new rz4(tz4Var));
                        }
                        break;
                    case 4:
                        ISessionToolbarViewModel iSessionToolbarViewModel4 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_RequestControl(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4);
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 6);
                        break;
                    case 5:
                        RCClientActivity rCClientActivity4 = tz4Var.u;
                        if (rCClientActivity4 != null) {
                            new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                            lc3 lc3Var = rCClientActivity4.P;
                            if (lc3Var != null) {
                                lc3Var.H();
                            }
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel5 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 7);
                        break;
                    case 6:
                        RCClientActivity rCClientActivity5 = tz4Var.u;
                        if (rCClientActivity5 != null) {
                            new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                            lc3 lc3Var2 = rCClientActivity5.P;
                            if (lc3Var2 != null) {
                                lc3Var2.H();
                            }
                            lc3 lc3Var3 = rCClientActivity5.P;
                            if (lc3Var3 != null) {
                                lc3Var3.z();
                            }
                        }
                        break;
                    case 7:
                        RCClientActivity rCClientActivity6 = tz4Var.u;
                        if (rCClientActivity6 != null) {
                            rCClientActivity6.X();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel6 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity7 = tz4Var.u;
                        if (rCClientActivity7 != null) {
                            rCClientActivity7.K();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel7 = tz4Var.s;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel7.a, iSessionToolbarViewModel7, 9);
                        break;
                }
                return f88Var;
            }
        }, 88));
    }

    @Override // o.nc3
    public final void E() {
        ISessionToolbarViewModel iSessionToolbarViewModel = this.s;
        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel.a, iSessionToolbarViewModel, 10);
    }

    @Override // o.oe8
    public final void U0() {
        this.s.a();
    }

    public final Drawable Y0(int i) {
        ThreadLocal threadLocal = ic6.a;
        return this.t.getDrawable(i, null);
    }

    @Override // o.nc3
    public final void w(RCClientActivity rCClientActivity) {
        this.u = rCClientActivity;
    }
}
