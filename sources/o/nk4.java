package o;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import com.teamviewer.remotecontrollib.swig.AccountViewModelBase;
import com.teamviewer.remotecontrollib.swig.IAccountIdentityValidationViewModel;
import com.teamviewer.remotecontrollib.swig.IAccountIdentityValidationViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModel;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IEmailValidationViewModel;
import com.teamviewer.remotecontrollib.swig.IEmailValidationViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LoginState;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IPLSynchronizationStateViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IPLSynchronizationStateViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class nk4 extends oe8 implements pb3 {
    public final LicenseViewModel A;
    public final IInAppPurchaseViewModel B;
    public final yt2 C;
    public final d31 D;
    public final HashSet E;
    public final gk7 F;
    public boolean G;
    public Long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public Long N;
    public final nw4 O;
    public boolean P;
    public boolean Q;
    public final yx6 R;
    public final yx6 S;
    public final l97 T;
    public final t36 U;
    public final VoidSignalCallback V;
    public final gk4 W;
    public final gk4 X;
    public final gk4 Y;
    public final gk4 Z;
    public final gk4 a0;
    public final gk4 b0;
    public final gk4 c0;
    public final t7 d0;
    public final gk4 e0;
    public final VoidSignalCallback f0;
    public final VoidSignalCallback g0;
    public final k6 h0;
    public final nw4 i0;
    public final RemoteControlApplication n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j93 f1573o;
    public final SharedPreferences p;
    public final xt6 q;
    public final EventHub r;
    public final ICommercialUseViewModel s;
    public final IAccountIdentityValidationViewModel t;
    public final IEmailValidationViewModel u;
    public final ep3 v;
    public final ep3 w;
    public final IPLSynchronizationStateViewModel x;
    public final AccountViewModelBase y;
    public final ILoginStateAwareContainerViewModel z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [o.gk4, o.vd2] */
    /* JADX WARN: Type inference failed for: r11v2, types: [o.gk4, o.vd2] */
    /* JADX WARN: Type inference failed for: r12v4, types: [o.gk4, o.vd2] */
    /* JADX WARN: Type inference failed for: r13v3, types: [o.gk4, o.vd2] */
    /* JADX WARN: Type inference failed for: r14v2, types: [o.gk4, o.vd2] */
    /* JADX WARN: Type inference failed for: r15v2, types: [o.gk4, o.vd2] */
    /* JADX WARN: Type inference failed for: r8v5, types: [o.gk4, o.vd2] */
    /* JADX WARN: Type inference failed for: r9v6, types: [o.gk4, o.vd2] */
    public nk4(RemoteControlApplication remoteControlApplication, j93 j93Var, SharedPreferences sharedPreferences, xt6 xt6Var, EventHub eventHub, ICommercialUseViewModel iCommercialUseViewModel, IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel, IEmailValidationViewModel iEmailValidationViewModel, ep3 ep3Var, ep3 ep3Var2, IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel, AccountViewModelBase accountViewModelBase, ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel, LicenseViewModel licenseViewModel, IInAppPurchaseViewModel iInAppPurchaseViewModel, yt2 yt2Var, d82 d82Var) {
        Settings settingsN = Settings.i.n();
        d31 d31Var = new d31(remoteControlApplication);
        j93Var.getClass();
        sharedPreferences.getClass();
        eventHub.getClass();
        ep3Var.getClass();
        ep3Var2.getClass();
        this.n = remoteControlApplication;
        this.f1573o = j93Var;
        this.p = sharedPreferences;
        this.q = xt6Var;
        this.r = eventHub;
        this.s = iCommercialUseViewModel;
        this.t = iAccountIdentityValidationViewModel;
        this.u = iEmailValidationViewModel;
        this.v = ep3Var;
        this.w = ep3Var2;
        this.x = iPLSynchronizationStateViewModel;
        this.y = accountViewModelBase;
        this.z = iLoginStateAwareContainerViewModel;
        this.A = licenseViewModel;
        this.B = iInAppPurchaseViewModel;
        this.C = yt2Var;
        this.D = d31Var;
        this.E = new HashSet();
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        this.F = gk7Var;
        this.G = accountViewModelBase.a() == LoginState.LoggedIn;
        this.H = 0L;
        this.L = "";
        this.M = "";
        this.N = 0L;
        this.O = new nw4();
        final byte b = 7;
        this.R = au8.l(0, 7, null);
        this.S = au8.l(0, 7, null);
        l97 l97VarK = im3.k("");
        this.T = l97VarK;
        this.U = yo1.u(l97VarK);
        final byte b2 = 2;
        zb zbVar = new zb(this, b2);
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        VoidSignalCallback voidSignalCallback = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ik4
            public final /* synthetic */ nk4 n;

            {
                this.n = this;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0033  */
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                nk4 nk4Var = this.n;
                switch (b3) {
                    case 0:
                        nk4Var.b1();
                        break;
                    case 1:
                        nk4Var.X0();
                        break;
                    default:
                        LicenseViewModel licenseViewModel2 = nk4Var.A;
                        AccountViewModelBase accountViewModelBase2 = nk4Var.y;
                        String strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel2.a, licenseViewModel2);
                        if (strLicenseViewModel_GetAccountLoginName != null && strLicenseViewModel_GetAccountLoginName.length() != 0) {
                            if ((accountViewModelBase2 != null ? accountViewModelBase2.a() : null) == LoginState.LoggedIn) {
                                nk4Var.O.setValue(LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel2.a, licenseViewModel2));
                            } else if ((accountViewModelBase2 != null ? accountViewModelBase2.a() : null) == LoginState.LoginInProgress) {
                                nk4Var.O.setValue(LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel2.a, licenseViewModel2));
                            }
                        }
                        break;
                }
                return f88Var;
            }
        });
        this.V = voidSignalCallback;
        final byte b3 = 5;
        ?? r11 = new vd2(this) { // from class: o.gk4
            public final /* synthetic */ nk4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IEmailValidationViewModel iEmailValidationViewModel2;
                byte b4 = b3;
                nk4 nk4Var = this.b;
                switch (b4) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it = nk4Var.E.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            ob3 ob3Var = (ob3) ((WeakReference) next).get();
                            if (ob3Var != null) {
                                MainActivity mainActivity = (MainActivity) ob3Var;
                                pb3 pb3Var = mainActivity.Y;
                                if (pb3Var != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredMessageShown(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                                }
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.a1 = true;
                                gk7Var2.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TITLE;
                                gk7Var2.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TEXT;
                                gk7Var2.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_SIGN_IN_BUTTON;
                                gk7Var2.O0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_CREATE_ACCOUNT_BUTTON;
                                xk1 xk1Var = ct1.a;
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.r0, new r02(gk7Var2, p02.Positive));
                                }
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.s0, new r02(gk7Var2, p02.Negative));
                                }
                                gk7.O0(gk7Var2, mainActivity);
                            }
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it2 = nk4Var.E.iterator();
                        it2.getClass();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            ob3 ob3Var2 = (ob3) ((WeakReference) next2).get();
                            if (ob3Var2 != null) {
                                MainActivity mainActivity2 = (MainActivity) ob3Var2;
                                pb3 pb3Var2 = mainActivity2.Y;
                                if (pb3Var2 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var2).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredMessageShown(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                                }
                                x02 x02VarA3 = ik7.a();
                                gk7 gk7Var3 = new gk7();
                                fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                                gk7Var3.Z0 = x02VarA3;
                                gk7Var3.a1 = true;
                                gk7Var3.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TITLE;
                                gk7Var3.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TEXT;
                                gk7Var3.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_BUTTON;
                                if (ct1.a != null) {
                                    xk1.M(mainActivity2.t0, new r02(gk7Var3, p02.Positive));
                                }
                                gk7.O0(gk7Var3, mainActivity2);
                            }
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it3 = nk4Var.E.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            next3.getClass();
                            ob3 ob3Var3 = (ob3) ((WeakReference) next3).get();
                            if (ob3Var3 != null) {
                                MainActivity mainActivity3 = (MainActivity) ob3Var3;
                                pb3 pb3Var3 = mainActivity3.Y;
                                if (pb3Var3 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var3).u) != null) {
                                    IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageShown(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                                }
                                x02 x02VarA4 = ik7.a();
                                gk7 gk7Var4 = new gk7();
                                fx3.o(1, "dialogId", x02VarA4, gk7Var4);
                                gk7Var4.Z0 = x02VarA4;
                                gk7Var4.a1 = true;
                                gk7Var4.F0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TITLE;
                                gk7Var4.H0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TEXT;
                                gk7Var4.K0 = R.string.tv_msgbox_emailnotvalidated_close_dialog_button;
                                gk7Var4.O0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_RESENDEMAIL_BUTTON;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.u0, new r02(gk7Var4, p02.Positive));
                                }
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.v0, new r02(gk7Var4, p02.Negative));
                                }
                                gk7.O0(gk7Var4, mainActivity3);
                            }
                        }
                        break;
                    case 3:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it4 = nk4Var.E.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next4 = it4.next();
                            next4.getClass();
                            ob3 ob3Var4 = (ob3) ((WeakReference) next4).get();
                            if (ob3Var4 != null) {
                                MainActivity mainActivity4 = (MainActivity) ob3Var4;
                                x02 x02VarA5 = ik7.a();
                                gk7 gk7Var5 = new gk7();
                                fx3.o(1, "dialogId", x02VarA5, gk7Var5);
                                gk7Var5.Z0 = x02VarA5;
                                gk7Var5.a1 = true;
                                gk7Var5.F0 = R.string.remote_connection_blocked_dialog_title;
                                gk7Var5.H0 = R.string.remote_connection_blocked_dialog_message;
                                gk7Var5.K0 = R.string.tv_ok;
                                if (ct1.a != null) {
                                    ik7.b(new c6((byte) 14), new r02(gk7Var5, p02.Positive));
                                }
                                gk7.O0(gk7Var5, mainActivity4);
                            }
                        }
                        break;
                    case 4:
                        ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var.s;
                        eventType.getClass();
                        he2Var.getClass();
                        String strH = he2Var.h(EventParam.EP_COMMERCIAL_USE_MESSAGE);
                        bx0 bx0Var = (bx0) he2Var.e(EventParam.EP_COMMERCIAL_USE_DIALOG_TYPE);
                        switch (bx0Var == null ? -1 : kk4.a[bx0Var.ordinal()]) {
                            case 1:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 2);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 8));
                                break;
                            case 2:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 10));
                                break;
                            case 3:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 4);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 9));
                                break;
                            case 4:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 5);
                                }
                                nk4Var.Z0(new aw((byte) 24));
                                break;
                            case 5:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 6);
                                }
                                nk4Var.Z0(new ju((byte) 25));
                                break;
                            case 6:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 7);
                                }
                                nk4Var.Z0(new cr((byte) 26));
                                break;
                            case 7:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 8);
                                }
                                nk4Var.Z0(new aw((byte) 25));
                                break;
                            case 8:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 9);
                                }
                                nk4Var.Z0(new cr((byte) 25));
                                break;
                            case ep1.b /* 9 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 10);
                                }
                                nk4Var.Z0(new ir((byte) 25));
                                break;
                            case ep1.c /* 10 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 11);
                                }
                                nk4Var.Z0(new vv((byte) 24));
                                break;
                            case 11:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 12);
                                }
                                nk4Var.Z0(new vv((byte) 25));
                                break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        nk4Var.V0();
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        if (k25.f1224o == he2Var.e(EventParam.EP_ONLINE_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    case 7:
                        eventType.getClass();
                        he2Var.getClass();
                        if (i41.y == he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it5 = nk4Var.E.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next5 = it5.next();
                            next5.getClass();
                            ob3 ob3Var5 = (ob3) ((WeakReference) next5).get();
                            if (ob3Var5 != null) {
                                MainActivity mainActivity5 = (MainActivity) ob3Var5;
                                x02 x02VarA6 = ik7.a();
                                gk7 gk7Var6 = new gk7();
                                fx3.o(1, "dialogId", x02VarA6, gk7Var6);
                                gk7Var6.Z0 = x02VarA6;
                                gk7Var6.a1 = true;
                                gk7Var6.F0 = R.string.tv_IDS_NONCOMMERCIAL_TITLE;
                                gk7Var6.H0 = R.string.tv_IDS_NONCOMMERCIAL;
                                gk7Var6.O0 = R.string.tv_ok;
                                xk1 xk1Var3 = ct1.a;
                                if (xk1Var3 != null) {
                                    xk1Var3.L(gk7Var6);
                                }
                                gk7.O0(gk7Var6, mainActivity5);
                            }
                        }
                        break;
                }
            }
        };
        this.W = r11;
        final byte b4 = 6;
        ?? r14 = new vd2(this) { // from class: o.gk4
            public final /* synthetic */ nk4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IEmailValidationViewModel iEmailValidationViewModel2;
                byte b5 = b4;
                nk4 nk4Var = this.b;
                switch (b5) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it = nk4Var.E.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            ob3 ob3Var = (ob3) ((WeakReference) next).get();
                            if (ob3Var != null) {
                                MainActivity mainActivity = (MainActivity) ob3Var;
                                pb3 pb3Var = mainActivity.Y;
                                if (pb3Var != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredMessageShown(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                                }
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.a1 = true;
                                gk7Var2.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TITLE;
                                gk7Var2.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TEXT;
                                gk7Var2.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_SIGN_IN_BUTTON;
                                gk7Var2.O0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_CREATE_ACCOUNT_BUTTON;
                                xk1 xk1Var = ct1.a;
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.r0, new r02(gk7Var2, p02.Positive));
                                }
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.s0, new r02(gk7Var2, p02.Negative));
                                }
                                gk7.O0(gk7Var2, mainActivity);
                            }
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it2 = nk4Var.E.iterator();
                        it2.getClass();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            ob3 ob3Var2 = (ob3) ((WeakReference) next2).get();
                            if (ob3Var2 != null) {
                                MainActivity mainActivity2 = (MainActivity) ob3Var2;
                                pb3 pb3Var2 = mainActivity2.Y;
                                if (pb3Var2 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var2).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredMessageShown(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                                }
                                x02 x02VarA3 = ik7.a();
                                gk7 gk7Var3 = new gk7();
                                fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                                gk7Var3.Z0 = x02VarA3;
                                gk7Var3.a1 = true;
                                gk7Var3.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TITLE;
                                gk7Var3.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TEXT;
                                gk7Var3.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_BUTTON;
                                if (ct1.a != null) {
                                    xk1.M(mainActivity2.t0, new r02(gk7Var3, p02.Positive));
                                }
                                gk7.O0(gk7Var3, mainActivity2);
                            }
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it3 = nk4Var.E.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            next3.getClass();
                            ob3 ob3Var3 = (ob3) ((WeakReference) next3).get();
                            if (ob3Var3 != null) {
                                MainActivity mainActivity3 = (MainActivity) ob3Var3;
                                pb3 pb3Var3 = mainActivity3.Y;
                                if (pb3Var3 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var3).u) != null) {
                                    IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageShown(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                                }
                                x02 x02VarA4 = ik7.a();
                                gk7 gk7Var4 = new gk7();
                                fx3.o(1, "dialogId", x02VarA4, gk7Var4);
                                gk7Var4.Z0 = x02VarA4;
                                gk7Var4.a1 = true;
                                gk7Var4.F0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TITLE;
                                gk7Var4.H0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TEXT;
                                gk7Var4.K0 = R.string.tv_msgbox_emailnotvalidated_close_dialog_button;
                                gk7Var4.O0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_RESENDEMAIL_BUTTON;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.u0, new r02(gk7Var4, p02.Positive));
                                }
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.v0, new r02(gk7Var4, p02.Negative));
                                }
                                gk7.O0(gk7Var4, mainActivity3);
                            }
                        }
                        break;
                    case 3:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it4 = nk4Var.E.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next4 = it4.next();
                            next4.getClass();
                            ob3 ob3Var4 = (ob3) ((WeakReference) next4).get();
                            if (ob3Var4 != null) {
                                MainActivity mainActivity4 = (MainActivity) ob3Var4;
                                x02 x02VarA5 = ik7.a();
                                gk7 gk7Var5 = new gk7();
                                fx3.o(1, "dialogId", x02VarA5, gk7Var5);
                                gk7Var5.Z0 = x02VarA5;
                                gk7Var5.a1 = true;
                                gk7Var5.F0 = R.string.remote_connection_blocked_dialog_title;
                                gk7Var5.H0 = R.string.remote_connection_blocked_dialog_message;
                                gk7Var5.K0 = R.string.tv_ok;
                                if (ct1.a != null) {
                                    ik7.b(new c6((byte) 14), new r02(gk7Var5, p02.Positive));
                                }
                                gk7.O0(gk7Var5, mainActivity4);
                            }
                        }
                        break;
                    case 4:
                        ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var.s;
                        eventType.getClass();
                        he2Var.getClass();
                        String strH = he2Var.h(EventParam.EP_COMMERCIAL_USE_MESSAGE);
                        bx0 bx0Var = (bx0) he2Var.e(EventParam.EP_COMMERCIAL_USE_DIALOG_TYPE);
                        switch (bx0Var == null ? -1 : kk4.a[bx0Var.ordinal()]) {
                            case 1:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 2);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 8));
                                break;
                            case 2:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 10));
                                break;
                            case 3:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 4);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 9));
                                break;
                            case 4:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 5);
                                }
                                nk4Var.Z0(new aw((byte) 24));
                                break;
                            case 5:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 6);
                                }
                                nk4Var.Z0(new ju((byte) 25));
                                break;
                            case 6:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 7);
                                }
                                nk4Var.Z0(new cr((byte) 26));
                                break;
                            case 7:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 8);
                                }
                                nk4Var.Z0(new aw((byte) 25));
                                break;
                            case 8:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 9);
                                }
                                nk4Var.Z0(new cr((byte) 25));
                                break;
                            case ep1.b /* 9 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 10);
                                }
                                nk4Var.Z0(new ir((byte) 25));
                                break;
                            case ep1.c /* 10 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 11);
                                }
                                nk4Var.Z0(new vv((byte) 24));
                                break;
                            case 11:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 12);
                                }
                                nk4Var.Z0(new vv((byte) 25));
                                break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        nk4Var.V0();
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        if (k25.f1224o == he2Var.e(EventParam.EP_ONLINE_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    case 7:
                        eventType.getClass();
                        he2Var.getClass();
                        if (i41.y == he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it5 = nk4Var.E.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next5 = it5.next();
                            next5.getClass();
                            ob3 ob3Var5 = (ob3) ((WeakReference) next5).get();
                            if (ob3Var5 != null) {
                                MainActivity mainActivity5 = (MainActivity) ob3Var5;
                                x02 x02VarA6 = ik7.a();
                                gk7 gk7Var6 = new gk7();
                                fx3.o(1, "dialogId", x02VarA6, gk7Var6);
                                gk7Var6.Z0 = x02VarA6;
                                gk7Var6.a1 = true;
                                gk7Var6.F0 = R.string.tv_IDS_NONCOMMERCIAL_TITLE;
                                gk7Var6.H0 = R.string.tv_IDS_NONCOMMERCIAL;
                                gk7Var6.O0 = R.string.tv_ok;
                                xk1 xk1Var3 = ct1.a;
                                if (xk1Var3 != null) {
                                    xk1Var3.L(gk7Var6);
                                }
                                gk7.O0(gk7Var6, mainActivity5);
                            }
                        }
                        break;
                }
            }
        };
        this.X = r14;
        ?? r10 = new vd2(this) { // from class: o.gk4
            public final /* synthetic */ nk4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IEmailValidationViewModel iEmailValidationViewModel2;
                byte b5 = b;
                nk4 nk4Var = this.b;
                switch (b5) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it = nk4Var.E.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            ob3 ob3Var = (ob3) ((WeakReference) next).get();
                            if (ob3Var != null) {
                                MainActivity mainActivity = (MainActivity) ob3Var;
                                pb3 pb3Var = mainActivity.Y;
                                if (pb3Var != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredMessageShown(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                                }
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.a1 = true;
                                gk7Var2.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TITLE;
                                gk7Var2.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TEXT;
                                gk7Var2.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_SIGN_IN_BUTTON;
                                gk7Var2.O0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_CREATE_ACCOUNT_BUTTON;
                                xk1 xk1Var = ct1.a;
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.r0, new r02(gk7Var2, p02.Positive));
                                }
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.s0, new r02(gk7Var2, p02.Negative));
                                }
                                gk7.O0(gk7Var2, mainActivity);
                            }
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it2 = nk4Var.E.iterator();
                        it2.getClass();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            ob3 ob3Var2 = (ob3) ((WeakReference) next2).get();
                            if (ob3Var2 != null) {
                                MainActivity mainActivity2 = (MainActivity) ob3Var2;
                                pb3 pb3Var2 = mainActivity2.Y;
                                if (pb3Var2 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var2).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredMessageShown(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                                }
                                x02 x02VarA3 = ik7.a();
                                gk7 gk7Var3 = new gk7();
                                fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                                gk7Var3.Z0 = x02VarA3;
                                gk7Var3.a1 = true;
                                gk7Var3.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TITLE;
                                gk7Var3.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TEXT;
                                gk7Var3.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_BUTTON;
                                if (ct1.a != null) {
                                    xk1.M(mainActivity2.t0, new r02(gk7Var3, p02.Positive));
                                }
                                gk7.O0(gk7Var3, mainActivity2);
                            }
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it3 = nk4Var.E.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            next3.getClass();
                            ob3 ob3Var3 = (ob3) ((WeakReference) next3).get();
                            if (ob3Var3 != null) {
                                MainActivity mainActivity3 = (MainActivity) ob3Var3;
                                pb3 pb3Var3 = mainActivity3.Y;
                                if (pb3Var3 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var3).u) != null) {
                                    IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageShown(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                                }
                                x02 x02VarA4 = ik7.a();
                                gk7 gk7Var4 = new gk7();
                                fx3.o(1, "dialogId", x02VarA4, gk7Var4);
                                gk7Var4.Z0 = x02VarA4;
                                gk7Var4.a1 = true;
                                gk7Var4.F0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TITLE;
                                gk7Var4.H0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TEXT;
                                gk7Var4.K0 = R.string.tv_msgbox_emailnotvalidated_close_dialog_button;
                                gk7Var4.O0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_RESENDEMAIL_BUTTON;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.u0, new r02(gk7Var4, p02.Positive));
                                }
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.v0, new r02(gk7Var4, p02.Negative));
                                }
                                gk7.O0(gk7Var4, mainActivity3);
                            }
                        }
                        break;
                    case 3:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it4 = nk4Var.E.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next4 = it4.next();
                            next4.getClass();
                            ob3 ob3Var4 = (ob3) ((WeakReference) next4).get();
                            if (ob3Var4 != null) {
                                MainActivity mainActivity4 = (MainActivity) ob3Var4;
                                x02 x02VarA5 = ik7.a();
                                gk7 gk7Var5 = new gk7();
                                fx3.o(1, "dialogId", x02VarA5, gk7Var5);
                                gk7Var5.Z0 = x02VarA5;
                                gk7Var5.a1 = true;
                                gk7Var5.F0 = R.string.remote_connection_blocked_dialog_title;
                                gk7Var5.H0 = R.string.remote_connection_blocked_dialog_message;
                                gk7Var5.K0 = R.string.tv_ok;
                                if (ct1.a != null) {
                                    ik7.b(new c6((byte) 14), new r02(gk7Var5, p02.Positive));
                                }
                                gk7.O0(gk7Var5, mainActivity4);
                            }
                        }
                        break;
                    case 4:
                        ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var.s;
                        eventType.getClass();
                        he2Var.getClass();
                        String strH = he2Var.h(EventParam.EP_COMMERCIAL_USE_MESSAGE);
                        bx0 bx0Var = (bx0) he2Var.e(EventParam.EP_COMMERCIAL_USE_DIALOG_TYPE);
                        switch (bx0Var == null ? -1 : kk4.a[bx0Var.ordinal()]) {
                            case 1:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 2);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 8));
                                break;
                            case 2:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 10));
                                break;
                            case 3:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 4);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 9));
                                break;
                            case 4:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 5);
                                }
                                nk4Var.Z0(new aw((byte) 24));
                                break;
                            case 5:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 6);
                                }
                                nk4Var.Z0(new ju((byte) 25));
                                break;
                            case 6:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 7);
                                }
                                nk4Var.Z0(new cr((byte) 26));
                                break;
                            case 7:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 8);
                                }
                                nk4Var.Z0(new aw((byte) 25));
                                break;
                            case 8:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 9);
                                }
                                nk4Var.Z0(new cr((byte) 25));
                                break;
                            case ep1.b /* 9 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 10);
                                }
                                nk4Var.Z0(new ir((byte) 25));
                                break;
                            case ep1.c /* 10 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 11);
                                }
                                nk4Var.Z0(new vv((byte) 24));
                                break;
                            case 11:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 12);
                                }
                                nk4Var.Z0(new vv((byte) 25));
                                break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        nk4Var.V0();
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        if (k25.f1224o == he2Var.e(EventParam.EP_ONLINE_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    case 7:
                        eventType.getClass();
                        he2Var.getClass();
                        if (i41.y == he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it5 = nk4Var.E.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next5 = it5.next();
                            next5.getClass();
                            ob3 ob3Var5 = (ob3) ((WeakReference) next5).get();
                            if (ob3Var5 != null) {
                                MainActivity mainActivity5 = (MainActivity) ob3Var5;
                                x02 x02VarA6 = ik7.a();
                                gk7 gk7Var6 = new gk7();
                                fx3.o(1, "dialogId", x02VarA6, gk7Var6);
                                gk7Var6.Z0 = x02VarA6;
                                gk7Var6.a1 = true;
                                gk7Var6.F0 = R.string.tv_IDS_NONCOMMERCIAL_TITLE;
                                gk7Var6.H0 = R.string.tv_IDS_NONCOMMERCIAL;
                                gk7Var6.O0 = R.string.tv_ok;
                                xk1 xk1Var3 = ct1.a;
                                if (xk1Var3 != null) {
                                    xk1Var3.L(gk7Var6);
                                }
                                gk7.O0(gk7Var6, mainActivity5);
                            }
                        }
                        break;
                }
            }
        };
        this.Y = r10;
        final byte b5 = 8;
        ?? r8 = new vd2(this) { // from class: o.gk4
            public final /* synthetic */ nk4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IEmailValidationViewModel iEmailValidationViewModel2;
                byte b6 = b5;
                nk4 nk4Var = this.b;
                switch (b6) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it = nk4Var.E.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            ob3 ob3Var = (ob3) ((WeakReference) next).get();
                            if (ob3Var != null) {
                                MainActivity mainActivity = (MainActivity) ob3Var;
                                pb3 pb3Var = mainActivity.Y;
                                if (pb3Var != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredMessageShown(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                                }
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.a1 = true;
                                gk7Var2.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TITLE;
                                gk7Var2.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TEXT;
                                gk7Var2.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_SIGN_IN_BUTTON;
                                gk7Var2.O0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_CREATE_ACCOUNT_BUTTON;
                                xk1 xk1Var = ct1.a;
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.r0, new r02(gk7Var2, p02.Positive));
                                }
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.s0, new r02(gk7Var2, p02.Negative));
                                }
                                gk7.O0(gk7Var2, mainActivity);
                            }
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it2 = nk4Var.E.iterator();
                        it2.getClass();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            ob3 ob3Var2 = (ob3) ((WeakReference) next2).get();
                            if (ob3Var2 != null) {
                                MainActivity mainActivity2 = (MainActivity) ob3Var2;
                                pb3 pb3Var2 = mainActivity2.Y;
                                if (pb3Var2 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var2).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredMessageShown(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                                }
                                x02 x02VarA3 = ik7.a();
                                gk7 gk7Var3 = new gk7();
                                fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                                gk7Var3.Z0 = x02VarA3;
                                gk7Var3.a1 = true;
                                gk7Var3.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TITLE;
                                gk7Var3.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TEXT;
                                gk7Var3.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_BUTTON;
                                if (ct1.a != null) {
                                    xk1.M(mainActivity2.t0, new r02(gk7Var3, p02.Positive));
                                }
                                gk7.O0(gk7Var3, mainActivity2);
                            }
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it3 = nk4Var.E.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            next3.getClass();
                            ob3 ob3Var3 = (ob3) ((WeakReference) next3).get();
                            if (ob3Var3 != null) {
                                MainActivity mainActivity3 = (MainActivity) ob3Var3;
                                pb3 pb3Var3 = mainActivity3.Y;
                                if (pb3Var3 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var3).u) != null) {
                                    IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageShown(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                                }
                                x02 x02VarA4 = ik7.a();
                                gk7 gk7Var4 = new gk7();
                                fx3.o(1, "dialogId", x02VarA4, gk7Var4);
                                gk7Var4.Z0 = x02VarA4;
                                gk7Var4.a1 = true;
                                gk7Var4.F0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TITLE;
                                gk7Var4.H0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TEXT;
                                gk7Var4.K0 = R.string.tv_msgbox_emailnotvalidated_close_dialog_button;
                                gk7Var4.O0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_RESENDEMAIL_BUTTON;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.u0, new r02(gk7Var4, p02.Positive));
                                }
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.v0, new r02(gk7Var4, p02.Negative));
                                }
                                gk7.O0(gk7Var4, mainActivity3);
                            }
                        }
                        break;
                    case 3:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it4 = nk4Var.E.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next4 = it4.next();
                            next4.getClass();
                            ob3 ob3Var4 = (ob3) ((WeakReference) next4).get();
                            if (ob3Var4 != null) {
                                MainActivity mainActivity4 = (MainActivity) ob3Var4;
                                x02 x02VarA5 = ik7.a();
                                gk7 gk7Var5 = new gk7();
                                fx3.o(1, "dialogId", x02VarA5, gk7Var5);
                                gk7Var5.Z0 = x02VarA5;
                                gk7Var5.a1 = true;
                                gk7Var5.F0 = R.string.remote_connection_blocked_dialog_title;
                                gk7Var5.H0 = R.string.remote_connection_blocked_dialog_message;
                                gk7Var5.K0 = R.string.tv_ok;
                                if (ct1.a != null) {
                                    ik7.b(new c6((byte) 14), new r02(gk7Var5, p02.Positive));
                                }
                                gk7.O0(gk7Var5, mainActivity4);
                            }
                        }
                        break;
                    case 4:
                        ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var.s;
                        eventType.getClass();
                        he2Var.getClass();
                        String strH = he2Var.h(EventParam.EP_COMMERCIAL_USE_MESSAGE);
                        bx0 bx0Var = (bx0) he2Var.e(EventParam.EP_COMMERCIAL_USE_DIALOG_TYPE);
                        switch (bx0Var == null ? -1 : kk4.a[bx0Var.ordinal()]) {
                            case 1:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 2);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 8));
                                break;
                            case 2:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 10));
                                break;
                            case 3:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 4);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 9));
                                break;
                            case 4:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 5);
                                }
                                nk4Var.Z0(new aw((byte) 24));
                                break;
                            case 5:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 6);
                                }
                                nk4Var.Z0(new ju((byte) 25));
                                break;
                            case 6:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 7);
                                }
                                nk4Var.Z0(new cr((byte) 26));
                                break;
                            case 7:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 8);
                                }
                                nk4Var.Z0(new aw((byte) 25));
                                break;
                            case 8:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 9);
                                }
                                nk4Var.Z0(new cr((byte) 25));
                                break;
                            case ep1.b /* 9 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 10);
                                }
                                nk4Var.Z0(new ir((byte) 25));
                                break;
                            case ep1.c /* 10 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 11);
                                }
                                nk4Var.Z0(new vv((byte) 24));
                                break;
                            case 11:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 12);
                                }
                                nk4Var.Z0(new vv((byte) 25));
                                break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        nk4Var.V0();
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        if (k25.f1224o == he2Var.e(EventParam.EP_ONLINE_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    case 7:
                        eventType.getClass();
                        he2Var.getClass();
                        if (i41.y == he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it5 = nk4Var.E.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next5 = it5.next();
                            next5.getClass();
                            ob3 ob3Var5 = (ob3) ((WeakReference) next5).get();
                            if (ob3Var5 != null) {
                                MainActivity mainActivity5 = (MainActivity) ob3Var5;
                                x02 x02VarA6 = ik7.a();
                                gk7 gk7Var6 = new gk7();
                                fx3.o(1, "dialogId", x02VarA6, gk7Var6);
                                gk7Var6.Z0 = x02VarA6;
                                gk7Var6.a1 = true;
                                gk7Var6.F0 = R.string.tv_IDS_NONCOMMERCIAL_TITLE;
                                gk7Var6.H0 = R.string.tv_IDS_NONCOMMERCIAL;
                                gk7Var6.O0 = R.string.tv_ok;
                                xk1 xk1Var3 = ct1.a;
                                if (xk1Var3 != null) {
                                    xk1Var3.L(gk7Var6);
                                }
                                gk7.O0(gk7Var6, mainActivity5);
                            }
                        }
                        break;
                }
            }
        };
        this.Z = r8;
        final byte b6 = 0;
        ?? r9 = new vd2(this) { // from class: o.gk4
            public final /* synthetic */ nk4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IEmailValidationViewModel iEmailValidationViewModel2;
                byte b7 = b6;
                nk4 nk4Var = this.b;
                switch (b7) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it = nk4Var.E.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            ob3 ob3Var = (ob3) ((WeakReference) next).get();
                            if (ob3Var != null) {
                                MainActivity mainActivity = (MainActivity) ob3Var;
                                pb3 pb3Var = mainActivity.Y;
                                if (pb3Var != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredMessageShown(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                                }
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.a1 = true;
                                gk7Var2.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TITLE;
                                gk7Var2.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TEXT;
                                gk7Var2.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_SIGN_IN_BUTTON;
                                gk7Var2.O0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_CREATE_ACCOUNT_BUTTON;
                                xk1 xk1Var = ct1.a;
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.r0, new r02(gk7Var2, p02.Positive));
                                }
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.s0, new r02(gk7Var2, p02.Negative));
                                }
                                gk7.O0(gk7Var2, mainActivity);
                            }
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it2 = nk4Var.E.iterator();
                        it2.getClass();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            ob3 ob3Var2 = (ob3) ((WeakReference) next2).get();
                            if (ob3Var2 != null) {
                                MainActivity mainActivity2 = (MainActivity) ob3Var2;
                                pb3 pb3Var2 = mainActivity2.Y;
                                if (pb3Var2 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var2).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredMessageShown(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                                }
                                x02 x02VarA3 = ik7.a();
                                gk7 gk7Var3 = new gk7();
                                fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                                gk7Var3.Z0 = x02VarA3;
                                gk7Var3.a1 = true;
                                gk7Var3.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TITLE;
                                gk7Var3.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TEXT;
                                gk7Var3.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_BUTTON;
                                if (ct1.a != null) {
                                    xk1.M(mainActivity2.t0, new r02(gk7Var3, p02.Positive));
                                }
                                gk7.O0(gk7Var3, mainActivity2);
                            }
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it3 = nk4Var.E.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            next3.getClass();
                            ob3 ob3Var3 = (ob3) ((WeakReference) next3).get();
                            if (ob3Var3 != null) {
                                MainActivity mainActivity3 = (MainActivity) ob3Var3;
                                pb3 pb3Var3 = mainActivity3.Y;
                                if (pb3Var3 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var3).u) != null) {
                                    IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageShown(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                                }
                                x02 x02VarA4 = ik7.a();
                                gk7 gk7Var4 = new gk7();
                                fx3.o(1, "dialogId", x02VarA4, gk7Var4);
                                gk7Var4.Z0 = x02VarA4;
                                gk7Var4.a1 = true;
                                gk7Var4.F0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TITLE;
                                gk7Var4.H0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TEXT;
                                gk7Var4.K0 = R.string.tv_msgbox_emailnotvalidated_close_dialog_button;
                                gk7Var4.O0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_RESENDEMAIL_BUTTON;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.u0, new r02(gk7Var4, p02.Positive));
                                }
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.v0, new r02(gk7Var4, p02.Negative));
                                }
                                gk7.O0(gk7Var4, mainActivity3);
                            }
                        }
                        break;
                    case 3:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it4 = nk4Var.E.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next4 = it4.next();
                            next4.getClass();
                            ob3 ob3Var4 = (ob3) ((WeakReference) next4).get();
                            if (ob3Var4 != null) {
                                MainActivity mainActivity4 = (MainActivity) ob3Var4;
                                x02 x02VarA5 = ik7.a();
                                gk7 gk7Var5 = new gk7();
                                fx3.o(1, "dialogId", x02VarA5, gk7Var5);
                                gk7Var5.Z0 = x02VarA5;
                                gk7Var5.a1 = true;
                                gk7Var5.F0 = R.string.remote_connection_blocked_dialog_title;
                                gk7Var5.H0 = R.string.remote_connection_blocked_dialog_message;
                                gk7Var5.K0 = R.string.tv_ok;
                                if (ct1.a != null) {
                                    ik7.b(new c6((byte) 14), new r02(gk7Var5, p02.Positive));
                                }
                                gk7.O0(gk7Var5, mainActivity4);
                            }
                        }
                        break;
                    case 4:
                        ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var.s;
                        eventType.getClass();
                        he2Var.getClass();
                        String strH = he2Var.h(EventParam.EP_COMMERCIAL_USE_MESSAGE);
                        bx0 bx0Var = (bx0) he2Var.e(EventParam.EP_COMMERCIAL_USE_DIALOG_TYPE);
                        switch (bx0Var == null ? -1 : kk4.a[bx0Var.ordinal()]) {
                            case 1:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 2);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 8));
                                break;
                            case 2:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 10));
                                break;
                            case 3:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 4);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 9));
                                break;
                            case 4:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 5);
                                }
                                nk4Var.Z0(new aw((byte) 24));
                                break;
                            case 5:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 6);
                                }
                                nk4Var.Z0(new ju((byte) 25));
                                break;
                            case 6:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 7);
                                }
                                nk4Var.Z0(new cr((byte) 26));
                                break;
                            case 7:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 8);
                                }
                                nk4Var.Z0(new aw((byte) 25));
                                break;
                            case 8:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 9);
                                }
                                nk4Var.Z0(new cr((byte) 25));
                                break;
                            case ep1.b /* 9 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 10);
                                }
                                nk4Var.Z0(new ir((byte) 25));
                                break;
                            case ep1.c /* 10 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 11);
                                }
                                nk4Var.Z0(new vv((byte) 24));
                                break;
                            case 11:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 12);
                                }
                                nk4Var.Z0(new vv((byte) 25));
                                break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        nk4Var.V0();
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        if (k25.f1224o == he2Var.e(EventParam.EP_ONLINE_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    case 7:
                        eventType.getClass();
                        he2Var.getClass();
                        if (i41.y == he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it5 = nk4Var.E.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next5 = it5.next();
                            next5.getClass();
                            ob3 ob3Var5 = (ob3) ((WeakReference) next5).get();
                            if (ob3Var5 != null) {
                                MainActivity mainActivity5 = (MainActivity) ob3Var5;
                                x02 x02VarA6 = ik7.a();
                                gk7 gk7Var6 = new gk7();
                                fx3.o(1, "dialogId", x02VarA6, gk7Var6);
                                gk7Var6.Z0 = x02VarA6;
                                gk7Var6.a1 = true;
                                gk7Var6.F0 = R.string.tv_IDS_NONCOMMERCIAL_TITLE;
                                gk7Var6.H0 = R.string.tv_IDS_NONCOMMERCIAL;
                                gk7Var6.O0 = R.string.tv_ok;
                                xk1 xk1Var3 = ct1.a;
                                if (xk1Var3 != null) {
                                    xk1Var3.L(gk7Var6);
                                }
                                gk7.O0(gk7Var6, mainActivity5);
                            }
                        }
                        break;
                }
            }
        };
        this.a0 = r9;
        final byte b7 = 1;
        ?? r15 = new vd2(this) { // from class: o.gk4
            public final /* synthetic */ nk4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IEmailValidationViewModel iEmailValidationViewModel2;
                byte b8 = b7;
                nk4 nk4Var = this.b;
                switch (b8) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it = nk4Var.E.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            ob3 ob3Var = (ob3) ((WeakReference) next).get();
                            if (ob3Var != null) {
                                MainActivity mainActivity = (MainActivity) ob3Var;
                                pb3 pb3Var = mainActivity.Y;
                                if (pb3Var != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredMessageShown(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                                }
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.a1 = true;
                                gk7Var2.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TITLE;
                                gk7Var2.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TEXT;
                                gk7Var2.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_SIGN_IN_BUTTON;
                                gk7Var2.O0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_CREATE_ACCOUNT_BUTTON;
                                xk1 xk1Var = ct1.a;
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.r0, new r02(gk7Var2, p02.Positive));
                                }
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.s0, new r02(gk7Var2, p02.Negative));
                                }
                                gk7.O0(gk7Var2, mainActivity);
                            }
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it2 = nk4Var.E.iterator();
                        it2.getClass();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            ob3 ob3Var2 = (ob3) ((WeakReference) next2).get();
                            if (ob3Var2 != null) {
                                MainActivity mainActivity2 = (MainActivity) ob3Var2;
                                pb3 pb3Var2 = mainActivity2.Y;
                                if (pb3Var2 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var2).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredMessageShown(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                                }
                                x02 x02VarA3 = ik7.a();
                                gk7 gk7Var3 = new gk7();
                                fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                                gk7Var3.Z0 = x02VarA3;
                                gk7Var3.a1 = true;
                                gk7Var3.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TITLE;
                                gk7Var3.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TEXT;
                                gk7Var3.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_BUTTON;
                                if (ct1.a != null) {
                                    xk1.M(mainActivity2.t0, new r02(gk7Var3, p02.Positive));
                                }
                                gk7.O0(gk7Var3, mainActivity2);
                            }
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it3 = nk4Var.E.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            next3.getClass();
                            ob3 ob3Var3 = (ob3) ((WeakReference) next3).get();
                            if (ob3Var3 != null) {
                                MainActivity mainActivity3 = (MainActivity) ob3Var3;
                                pb3 pb3Var3 = mainActivity3.Y;
                                if (pb3Var3 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var3).u) != null) {
                                    IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageShown(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                                }
                                x02 x02VarA4 = ik7.a();
                                gk7 gk7Var4 = new gk7();
                                fx3.o(1, "dialogId", x02VarA4, gk7Var4);
                                gk7Var4.Z0 = x02VarA4;
                                gk7Var4.a1 = true;
                                gk7Var4.F0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TITLE;
                                gk7Var4.H0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TEXT;
                                gk7Var4.K0 = R.string.tv_msgbox_emailnotvalidated_close_dialog_button;
                                gk7Var4.O0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_RESENDEMAIL_BUTTON;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.u0, new r02(gk7Var4, p02.Positive));
                                }
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.v0, new r02(gk7Var4, p02.Negative));
                                }
                                gk7.O0(gk7Var4, mainActivity3);
                            }
                        }
                        break;
                    case 3:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it4 = nk4Var.E.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next4 = it4.next();
                            next4.getClass();
                            ob3 ob3Var4 = (ob3) ((WeakReference) next4).get();
                            if (ob3Var4 != null) {
                                MainActivity mainActivity4 = (MainActivity) ob3Var4;
                                x02 x02VarA5 = ik7.a();
                                gk7 gk7Var5 = new gk7();
                                fx3.o(1, "dialogId", x02VarA5, gk7Var5);
                                gk7Var5.Z0 = x02VarA5;
                                gk7Var5.a1 = true;
                                gk7Var5.F0 = R.string.remote_connection_blocked_dialog_title;
                                gk7Var5.H0 = R.string.remote_connection_blocked_dialog_message;
                                gk7Var5.K0 = R.string.tv_ok;
                                if (ct1.a != null) {
                                    ik7.b(new c6((byte) 14), new r02(gk7Var5, p02.Positive));
                                }
                                gk7.O0(gk7Var5, mainActivity4);
                            }
                        }
                        break;
                    case 4:
                        ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var.s;
                        eventType.getClass();
                        he2Var.getClass();
                        String strH = he2Var.h(EventParam.EP_COMMERCIAL_USE_MESSAGE);
                        bx0 bx0Var = (bx0) he2Var.e(EventParam.EP_COMMERCIAL_USE_DIALOG_TYPE);
                        switch (bx0Var == null ? -1 : kk4.a[bx0Var.ordinal()]) {
                            case 1:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 2);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 8));
                                break;
                            case 2:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 10));
                                break;
                            case 3:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 4);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 9));
                                break;
                            case 4:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 5);
                                }
                                nk4Var.Z0(new aw((byte) 24));
                                break;
                            case 5:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 6);
                                }
                                nk4Var.Z0(new ju((byte) 25));
                                break;
                            case 6:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 7);
                                }
                                nk4Var.Z0(new cr((byte) 26));
                                break;
                            case 7:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 8);
                                }
                                nk4Var.Z0(new aw((byte) 25));
                                break;
                            case 8:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 9);
                                }
                                nk4Var.Z0(new cr((byte) 25));
                                break;
                            case ep1.b /* 9 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 10);
                                }
                                nk4Var.Z0(new ir((byte) 25));
                                break;
                            case ep1.c /* 10 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 11);
                                }
                                nk4Var.Z0(new vv((byte) 24));
                                break;
                            case 11:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 12);
                                }
                                nk4Var.Z0(new vv((byte) 25));
                                break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        nk4Var.V0();
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        if (k25.f1224o == he2Var.e(EventParam.EP_ONLINE_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    case 7:
                        eventType.getClass();
                        he2Var.getClass();
                        if (i41.y == he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it5 = nk4Var.E.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next5 = it5.next();
                            next5.getClass();
                            ob3 ob3Var5 = (ob3) ((WeakReference) next5).get();
                            if (ob3Var5 != null) {
                                MainActivity mainActivity5 = (MainActivity) ob3Var5;
                                x02 x02VarA6 = ik7.a();
                                gk7 gk7Var6 = new gk7();
                                fx3.o(1, "dialogId", x02VarA6, gk7Var6);
                                gk7Var6.Z0 = x02VarA6;
                                gk7Var6.a1 = true;
                                gk7Var6.F0 = R.string.tv_IDS_NONCOMMERCIAL_TITLE;
                                gk7Var6.H0 = R.string.tv_IDS_NONCOMMERCIAL;
                                gk7Var6.O0 = R.string.tv_ok;
                                xk1 xk1Var3 = ct1.a;
                                if (xk1Var3 != null) {
                                    xk1Var3.L(gk7Var6);
                                }
                                gk7.O0(gk7Var6, mainActivity5);
                            }
                        }
                        break;
                }
            }
        };
        this.b0 = r15;
        final byte b8 = 2;
        ?? r12 = new vd2(this) { // from class: o.gk4
            public final /* synthetic */ nk4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IEmailValidationViewModel iEmailValidationViewModel2;
                byte b9 = b8;
                nk4 nk4Var = this.b;
                switch (b9) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it = nk4Var.E.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            ob3 ob3Var = (ob3) ((WeakReference) next).get();
                            if (ob3Var != null) {
                                MainActivity mainActivity = (MainActivity) ob3Var;
                                pb3 pb3Var = mainActivity.Y;
                                if (pb3Var != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredMessageShown(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                                }
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.a1 = true;
                                gk7Var2.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TITLE;
                                gk7Var2.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TEXT;
                                gk7Var2.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_SIGN_IN_BUTTON;
                                gk7Var2.O0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_CREATE_ACCOUNT_BUTTON;
                                xk1 xk1Var = ct1.a;
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.r0, new r02(gk7Var2, p02.Positive));
                                }
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.s0, new r02(gk7Var2, p02.Negative));
                                }
                                gk7.O0(gk7Var2, mainActivity);
                            }
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it2 = nk4Var.E.iterator();
                        it2.getClass();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            ob3 ob3Var2 = (ob3) ((WeakReference) next2).get();
                            if (ob3Var2 != null) {
                                MainActivity mainActivity2 = (MainActivity) ob3Var2;
                                pb3 pb3Var2 = mainActivity2.Y;
                                if (pb3Var2 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var2).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredMessageShown(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                                }
                                x02 x02VarA3 = ik7.a();
                                gk7 gk7Var3 = new gk7();
                                fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                                gk7Var3.Z0 = x02VarA3;
                                gk7Var3.a1 = true;
                                gk7Var3.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TITLE;
                                gk7Var3.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TEXT;
                                gk7Var3.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_BUTTON;
                                if (ct1.a != null) {
                                    xk1.M(mainActivity2.t0, new r02(gk7Var3, p02.Positive));
                                }
                                gk7.O0(gk7Var3, mainActivity2);
                            }
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it3 = nk4Var.E.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            next3.getClass();
                            ob3 ob3Var3 = (ob3) ((WeakReference) next3).get();
                            if (ob3Var3 != null) {
                                MainActivity mainActivity3 = (MainActivity) ob3Var3;
                                pb3 pb3Var3 = mainActivity3.Y;
                                if (pb3Var3 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var3).u) != null) {
                                    IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageShown(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                                }
                                x02 x02VarA4 = ik7.a();
                                gk7 gk7Var4 = new gk7();
                                fx3.o(1, "dialogId", x02VarA4, gk7Var4);
                                gk7Var4.Z0 = x02VarA4;
                                gk7Var4.a1 = true;
                                gk7Var4.F0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TITLE;
                                gk7Var4.H0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TEXT;
                                gk7Var4.K0 = R.string.tv_msgbox_emailnotvalidated_close_dialog_button;
                                gk7Var4.O0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_RESENDEMAIL_BUTTON;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.u0, new r02(gk7Var4, p02.Positive));
                                }
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.v0, new r02(gk7Var4, p02.Negative));
                                }
                                gk7.O0(gk7Var4, mainActivity3);
                            }
                        }
                        break;
                    case 3:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it4 = nk4Var.E.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next4 = it4.next();
                            next4.getClass();
                            ob3 ob3Var4 = (ob3) ((WeakReference) next4).get();
                            if (ob3Var4 != null) {
                                MainActivity mainActivity4 = (MainActivity) ob3Var4;
                                x02 x02VarA5 = ik7.a();
                                gk7 gk7Var5 = new gk7();
                                fx3.o(1, "dialogId", x02VarA5, gk7Var5);
                                gk7Var5.Z0 = x02VarA5;
                                gk7Var5.a1 = true;
                                gk7Var5.F0 = R.string.remote_connection_blocked_dialog_title;
                                gk7Var5.H0 = R.string.remote_connection_blocked_dialog_message;
                                gk7Var5.K0 = R.string.tv_ok;
                                if (ct1.a != null) {
                                    ik7.b(new c6((byte) 14), new r02(gk7Var5, p02.Positive));
                                }
                                gk7.O0(gk7Var5, mainActivity4);
                            }
                        }
                        break;
                    case 4:
                        ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var.s;
                        eventType.getClass();
                        he2Var.getClass();
                        String strH = he2Var.h(EventParam.EP_COMMERCIAL_USE_MESSAGE);
                        bx0 bx0Var = (bx0) he2Var.e(EventParam.EP_COMMERCIAL_USE_DIALOG_TYPE);
                        switch (bx0Var == null ? -1 : kk4.a[bx0Var.ordinal()]) {
                            case 1:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 2);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 8));
                                break;
                            case 2:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 10));
                                break;
                            case 3:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 4);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 9));
                                break;
                            case 4:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 5);
                                }
                                nk4Var.Z0(new aw((byte) 24));
                                break;
                            case 5:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 6);
                                }
                                nk4Var.Z0(new ju((byte) 25));
                                break;
                            case 6:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 7);
                                }
                                nk4Var.Z0(new cr((byte) 26));
                                break;
                            case 7:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 8);
                                }
                                nk4Var.Z0(new aw((byte) 25));
                                break;
                            case 8:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 9);
                                }
                                nk4Var.Z0(new cr((byte) 25));
                                break;
                            case ep1.b /* 9 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 10);
                                }
                                nk4Var.Z0(new ir((byte) 25));
                                break;
                            case ep1.c /* 10 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 11);
                                }
                                nk4Var.Z0(new vv((byte) 24));
                                break;
                            case 11:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 12);
                                }
                                nk4Var.Z0(new vv((byte) 25));
                                break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        nk4Var.V0();
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        if (k25.f1224o == he2Var.e(EventParam.EP_ONLINE_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    case 7:
                        eventType.getClass();
                        he2Var.getClass();
                        if (i41.y == he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it5 = nk4Var.E.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next5 = it5.next();
                            next5.getClass();
                            ob3 ob3Var5 = (ob3) ((WeakReference) next5).get();
                            if (ob3Var5 != null) {
                                MainActivity mainActivity5 = (MainActivity) ob3Var5;
                                x02 x02VarA6 = ik7.a();
                                gk7 gk7Var6 = new gk7();
                                fx3.o(1, "dialogId", x02VarA6, gk7Var6);
                                gk7Var6.Z0 = x02VarA6;
                                gk7Var6.a1 = true;
                                gk7Var6.F0 = R.string.tv_IDS_NONCOMMERCIAL_TITLE;
                                gk7Var6.H0 = R.string.tv_IDS_NONCOMMERCIAL;
                                gk7Var6.O0 = R.string.tv_ok;
                                xk1 xk1Var3 = ct1.a;
                                if (xk1Var3 != null) {
                                    xk1Var3.L(gk7Var6);
                                }
                                gk7.O0(gk7Var6, mainActivity5);
                            }
                        }
                        break;
                }
            }
        };
        this.c0 = r12;
        final byte b9 = 3;
        vd2 vd2Var = new vd2(this) { // from class: o.gk4
            public final /* synthetic */ nk4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IEmailValidationViewModel iEmailValidationViewModel2;
                byte b10 = b9;
                nk4 nk4Var = this.b;
                switch (b10) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it = nk4Var.E.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            ob3 ob3Var = (ob3) ((WeakReference) next).get();
                            if (ob3Var != null) {
                                MainActivity mainActivity = (MainActivity) ob3Var;
                                pb3 pb3Var = mainActivity.Y;
                                if (pb3Var != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredMessageShown(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                                }
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.a1 = true;
                                gk7Var2.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TITLE;
                                gk7Var2.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TEXT;
                                gk7Var2.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_SIGN_IN_BUTTON;
                                gk7Var2.O0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_CREATE_ACCOUNT_BUTTON;
                                xk1 xk1Var = ct1.a;
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.r0, new r02(gk7Var2, p02.Positive));
                                }
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.s0, new r02(gk7Var2, p02.Negative));
                                }
                                gk7.O0(gk7Var2, mainActivity);
                            }
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it2 = nk4Var.E.iterator();
                        it2.getClass();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            ob3 ob3Var2 = (ob3) ((WeakReference) next2).get();
                            if (ob3Var2 != null) {
                                MainActivity mainActivity2 = (MainActivity) ob3Var2;
                                pb3 pb3Var2 = mainActivity2.Y;
                                if (pb3Var2 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var2).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredMessageShown(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                                }
                                x02 x02VarA3 = ik7.a();
                                gk7 gk7Var3 = new gk7();
                                fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                                gk7Var3.Z0 = x02VarA3;
                                gk7Var3.a1 = true;
                                gk7Var3.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TITLE;
                                gk7Var3.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TEXT;
                                gk7Var3.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_BUTTON;
                                if (ct1.a != null) {
                                    xk1.M(mainActivity2.t0, new r02(gk7Var3, p02.Positive));
                                }
                                gk7.O0(gk7Var3, mainActivity2);
                            }
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it3 = nk4Var.E.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            next3.getClass();
                            ob3 ob3Var3 = (ob3) ((WeakReference) next3).get();
                            if (ob3Var3 != null) {
                                MainActivity mainActivity3 = (MainActivity) ob3Var3;
                                pb3 pb3Var3 = mainActivity3.Y;
                                if (pb3Var3 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var3).u) != null) {
                                    IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageShown(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                                }
                                x02 x02VarA4 = ik7.a();
                                gk7 gk7Var4 = new gk7();
                                fx3.o(1, "dialogId", x02VarA4, gk7Var4);
                                gk7Var4.Z0 = x02VarA4;
                                gk7Var4.a1 = true;
                                gk7Var4.F0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TITLE;
                                gk7Var4.H0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TEXT;
                                gk7Var4.K0 = R.string.tv_msgbox_emailnotvalidated_close_dialog_button;
                                gk7Var4.O0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_RESENDEMAIL_BUTTON;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.u0, new r02(gk7Var4, p02.Positive));
                                }
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.v0, new r02(gk7Var4, p02.Negative));
                                }
                                gk7.O0(gk7Var4, mainActivity3);
                            }
                        }
                        break;
                    case 3:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it4 = nk4Var.E.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next4 = it4.next();
                            next4.getClass();
                            ob3 ob3Var4 = (ob3) ((WeakReference) next4).get();
                            if (ob3Var4 != null) {
                                MainActivity mainActivity4 = (MainActivity) ob3Var4;
                                x02 x02VarA5 = ik7.a();
                                gk7 gk7Var5 = new gk7();
                                fx3.o(1, "dialogId", x02VarA5, gk7Var5);
                                gk7Var5.Z0 = x02VarA5;
                                gk7Var5.a1 = true;
                                gk7Var5.F0 = R.string.remote_connection_blocked_dialog_title;
                                gk7Var5.H0 = R.string.remote_connection_blocked_dialog_message;
                                gk7Var5.K0 = R.string.tv_ok;
                                if (ct1.a != null) {
                                    ik7.b(new c6((byte) 14), new r02(gk7Var5, p02.Positive));
                                }
                                gk7.O0(gk7Var5, mainActivity4);
                            }
                        }
                        break;
                    case 4:
                        ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var.s;
                        eventType.getClass();
                        he2Var.getClass();
                        String strH = he2Var.h(EventParam.EP_COMMERCIAL_USE_MESSAGE);
                        bx0 bx0Var = (bx0) he2Var.e(EventParam.EP_COMMERCIAL_USE_DIALOG_TYPE);
                        switch (bx0Var == null ? -1 : kk4.a[bx0Var.ordinal()]) {
                            case 1:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 2);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 8));
                                break;
                            case 2:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 10));
                                break;
                            case 3:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 4);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 9));
                                break;
                            case 4:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 5);
                                }
                                nk4Var.Z0(new aw((byte) 24));
                                break;
                            case 5:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 6);
                                }
                                nk4Var.Z0(new ju((byte) 25));
                                break;
                            case 6:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 7);
                                }
                                nk4Var.Z0(new cr((byte) 26));
                                break;
                            case 7:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 8);
                                }
                                nk4Var.Z0(new aw((byte) 25));
                                break;
                            case 8:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 9);
                                }
                                nk4Var.Z0(new cr((byte) 25));
                                break;
                            case ep1.b /* 9 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 10);
                                }
                                nk4Var.Z0(new ir((byte) 25));
                                break;
                            case ep1.c /* 10 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 11);
                                }
                                nk4Var.Z0(new vv((byte) 24));
                                break;
                            case 11:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 12);
                                }
                                nk4Var.Z0(new vv((byte) 25));
                                break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        nk4Var.V0();
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        if (k25.f1224o == he2Var.e(EventParam.EP_ONLINE_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    case 7:
                        eventType.getClass();
                        he2Var.getClass();
                        if (i41.y == he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it5 = nk4Var.E.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next5 = it5.next();
                            next5.getClass();
                            ob3 ob3Var5 = (ob3) ((WeakReference) next5).get();
                            if (ob3Var5 != null) {
                                MainActivity mainActivity5 = (MainActivity) ob3Var5;
                                x02 x02VarA6 = ik7.a();
                                gk7 gk7Var6 = new gk7();
                                fx3.o(1, "dialogId", x02VarA6, gk7Var6);
                                gk7Var6.Z0 = x02VarA6;
                                gk7Var6.a1 = true;
                                gk7Var6.F0 = R.string.tv_IDS_NONCOMMERCIAL_TITLE;
                                gk7Var6.H0 = R.string.tv_IDS_NONCOMMERCIAL;
                                gk7Var6.O0 = R.string.tv_ok;
                                xk1 xk1Var3 = ct1.a;
                                if (xk1Var3 != null) {
                                    xk1Var3.L(gk7Var6);
                                }
                                gk7.O0(gk7Var6, mainActivity5);
                            }
                        }
                        break;
                }
            }
        };
        t7 t7Var = new t7(this, (byte) 1);
        this.d0 = t7Var;
        final byte b10 = 4;
        ?? r13 = new vd2(this) { // from class: o.gk4
            public final /* synthetic */ nk4 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IEmailValidationViewModel iEmailValidationViewModel2;
                byte b11 = b10;
                nk4 nk4Var = this.b;
                switch (b11) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it = nk4Var.E.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            ob3 ob3Var = (ob3) ((WeakReference) next).get();
                            if (ob3Var != null) {
                                MainActivity mainActivity = (MainActivity) ob3Var;
                                pb3 pb3Var = mainActivity.Y;
                                if (pb3Var != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredMessageShown(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                                }
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.a1 = true;
                                gk7Var2.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TITLE;
                                gk7Var2.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TEXT;
                                gk7Var2.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_SIGN_IN_BUTTON;
                                gk7Var2.O0 = R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_CREATE_ACCOUNT_BUTTON;
                                xk1 xk1Var = ct1.a;
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.r0, new r02(gk7Var2, p02.Positive));
                                }
                                if (xk1Var != null) {
                                    xk1.M(mainActivity.s0, new r02(gk7Var2, p02.Negative));
                                }
                                gk7.O0(gk7Var2, mainActivity);
                            }
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it2 = nk4Var.E.iterator();
                        it2.getClass();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            ob3 ob3Var2 = (ob3) ((WeakReference) next2).get();
                            if (ob3Var2 != null) {
                                MainActivity mainActivity2 = (MainActivity) ob3Var2;
                                pb3 pb3Var2 = mainActivity2.Y;
                                if (pb3Var2 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var2).t) != null) {
                                    IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredMessageShown(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                                }
                                x02 x02VarA3 = ik7.a();
                                gk7 gk7Var3 = new gk7();
                                fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                                gk7Var3.Z0 = x02VarA3;
                                gk7Var3.a1 = true;
                                gk7Var3.F0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TITLE;
                                gk7Var3.H0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_TEXT;
                                gk7Var3.K0 = R.string.tv_IDS_MSGBOX_ACCOUNTIDENTITYNOTVALIDATED_BUTTON;
                                if (ct1.a != null) {
                                    xk1.M(mainActivity2.t0, new r02(gk7Var3, p02.Positive));
                                }
                                gk7.O0(gk7Var3, mainActivity2);
                            }
                        }
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it3 = nk4Var.E.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            next3.getClass();
                            ob3 ob3Var3 = (ob3) ((WeakReference) next3).get();
                            if (ob3Var3 != null) {
                                MainActivity mainActivity3 = (MainActivity) ob3Var3;
                                pb3 pb3Var3 = mainActivity3.Y;
                                if (pb3Var3 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var3).u) != null) {
                                    IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageShown(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                                }
                                x02 x02VarA4 = ik7.a();
                                gk7 gk7Var4 = new gk7();
                                fx3.o(1, "dialogId", x02VarA4, gk7Var4);
                                gk7Var4.Z0 = x02VarA4;
                                gk7Var4.a1 = true;
                                gk7Var4.F0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TITLE;
                                gk7Var4.H0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_TEXT;
                                gk7Var4.K0 = R.string.tv_msgbox_emailnotvalidated_close_dialog_button;
                                gk7Var4.O0 = R.string.tv_IDS_MSGBOX_EMAILNOTVALIDATED_RESENDEMAIL_BUTTON;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.u0, new r02(gk7Var4, p02.Positive));
                                }
                                if (xk1Var2 != null) {
                                    xk1.M(mainActivity3.v0, new r02(gk7Var4, p02.Negative));
                                }
                                gk7.O0(gk7Var4, mainActivity3);
                            }
                        }
                        break;
                    case 3:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it4 = nk4Var.E.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next4 = it4.next();
                            next4.getClass();
                            ob3 ob3Var4 = (ob3) ((WeakReference) next4).get();
                            if (ob3Var4 != null) {
                                MainActivity mainActivity4 = (MainActivity) ob3Var4;
                                x02 x02VarA5 = ik7.a();
                                gk7 gk7Var5 = new gk7();
                                fx3.o(1, "dialogId", x02VarA5, gk7Var5);
                                gk7Var5.Z0 = x02VarA5;
                                gk7Var5.a1 = true;
                                gk7Var5.F0 = R.string.remote_connection_blocked_dialog_title;
                                gk7Var5.H0 = R.string.remote_connection_blocked_dialog_message;
                                gk7Var5.K0 = R.string.tv_ok;
                                if (ct1.a != null) {
                                    ik7.b(new c6((byte) 14), new r02(gk7Var5, p02.Positive));
                                }
                                gk7.O0(gk7Var5, mainActivity4);
                            }
                        }
                        break;
                    case 4:
                        ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var.s;
                        eventType.getClass();
                        he2Var.getClass();
                        String strH = he2Var.h(EventParam.EP_COMMERCIAL_USE_MESSAGE);
                        bx0 bx0Var = (bx0) he2Var.e(EventParam.EP_COMMERCIAL_USE_DIALOG_TYPE);
                        switch (bx0Var == null ? -1 : kk4.a[bx0Var.ordinal()]) {
                            case 1:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 2);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 8));
                                break;
                            case 2:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 10));
                                break;
                            case 3:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 4);
                                }
                                nk4Var.Z0(new hr2(strH, (byte) 9));
                                break;
                            case 4:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 5);
                                }
                                nk4Var.Z0(new aw((byte) 24));
                                break;
                            case 5:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 6);
                                }
                                nk4Var.Z0(new ju((byte) 25));
                                break;
                            case 6:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 7);
                                }
                                nk4Var.Z0(new cr((byte) 26));
                                break;
                            case 7:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 8);
                                }
                                nk4Var.Z0(new aw((byte) 25));
                                break;
                            case 8:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 9);
                                }
                                nk4Var.Z0(new cr((byte) 25));
                                break;
                            case ep1.b /* 9 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 10);
                                }
                                nk4Var.Z0(new ir((byte) 25));
                                break;
                            case ep1.c /* 10 */:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 11);
                                }
                                nk4Var.Z0(new vv((byte) 24));
                                break;
                            case 11:
                                if (iCommercialUseViewModel2 != null) {
                                    ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseDialog(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 12);
                                }
                                nk4Var.Z0(new vv((byte) 25));
                                break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        nk4Var.V0();
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        if (k25.f1224o == he2Var.e(EventParam.EP_ONLINE_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    case 7:
                        eventType.getClass();
                        he2Var.getClass();
                        if (i41.y == he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE)) {
                            nk4Var.V0();
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        Iterator it5 = nk4Var.E.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next5 = it5.next();
                            next5.getClass();
                            ob3 ob3Var5 = (ob3) ((WeakReference) next5).get();
                            if (ob3Var5 != null) {
                                MainActivity mainActivity5 = (MainActivity) ob3Var5;
                                x02 x02VarA6 = ik7.a();
                                gk7 gk7Var6 = new gk7();
                                fx3.o(1, "dialogId", x02VarA6, gk7Var6);
                                gk7Var6.Z0 = x02VarA6;
                                gk7Var6.a1 = true;
                                gk7Var6.F0 = R.string.tv_IDS_NONCOMMERCIAL_TITLE;
                                gk7Var6.H0 = R.string.tv_IDS_NONCOMMERCIAL;
                                gk7Var6.O0 = R.string.tv_ok;
                                xk1 xk1Var3 = ct1.a;
                                if (xk1Var3 != null) {
                                    xk1Var3.L(gk7Var6);
                                }
                                gk7.O0(gk7Var6, mainActivity5);
                            }
                        }
                        break;
                }
            }
        };
        this.e0 = r13;
        final byte b11 = 0;
        VoidSignalCallback voidSignalCallback2 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ik4
            public final /* synthetic */ nk4 n;

            {
                this.n = this;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0033  */
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b12 = b11;
                f88 f88Var = f88.a;
                nk4 nk4Var = this.n;
                switch (b12) {
                    case 0:
                        nk4Var.b1();
                        break;
                    case 1:
                        nk4Var.X0();
                        break;
                    default:
                        LicenseViewModel licenseViewModel2 = nk4Var.A;
                        AccountViewModelBase accountViewModelBase2 = nk4Var.y;
                        String strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel2.a, licenseViewModel2);
                        if (strLicenseViewModel_GetAccountLoginName != null && strLicenseViewModel_GetAccountLoginName.length() != 0) {
                            if ((accountViewModelBase2 != null ? accountViewModelBase2.a() : null) == LoginState.LoggedIn) {
                                nk4Var.O.setValue(LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel2.a, licenseViewModel2));
                            } else if ((accountViewModelBase2 != null ? accountViewModelBase2.a() : null) == LoginState.LoginInProgress) {
                                nk4Var.O.setValue(LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel2.a, licenseViewModel2));
                            }
                        }
                        break;
                }
                return f88Var;
            }
        });
        this.f0 = voidSignalCallback2;
        final byte b12 = 1;
        VoidSignalCallback voidSignalCallback3 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ik4
            public final /* synthetic */ nk4 n;

            {
                this.n = this;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0033  */
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b13 = b12;
                f88 f88Var = f88.a;
                nk4 nk4Var = this.n;
                switch (b13) {
                    case 0:
                        nk4Var.b1();
                        break;
                    case 1:
                        nk4Var.X0();
                        break;
                    default:
                        LicenseViewModel licenseViewModel2 = nk4Var.A;
                        AccountViewModelBase accountViewModelBase2 = nk4Var.y;
                        String strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel2.a, licenseViewModel2);
                        if (strLicenseViewModel_GetAccountLoginName != null && strLicenseViewModel_GetAccountLoginName.length() != 0) {
                            if ((accountViewModelBase2 != null ? accountViewModelBase2.a() : null) == LoginState.LoggedIn) {
                                nk4Var.O.setValue(LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel2.a, licenseViewModel2));
                            } else if ((accountViewModelBase2 != null ? accountViewModelBase2.a() : null) == LoginState.LoginInProgress) {
                                nk4Var.O.setValue(LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel2.a, licenseViewModel2));
                            }
                        }
                        break;
                }
                return f88Var;
            }
        });
        this.g0 = voidSignalCallback3;
        k6 k6Var = new k6((Object) new hk4(this, b12), (byte) 0);
        this.h0 = k6Var;
        boolean zC = eventHub.c(EventType.EVENT_COMMENT_SESSION, t7Var);
        ye4 ye4Var = ye4.a;
        if (!zC) {
            ye4Var.g("MainActivityViewModel", "register commensession listener failed");
        }
        if (!eventHub.c(EventType.EVENT_SHOW_COMMERCIAL_USE, r13)) {
            ye4Var.g("MainActivityViewModel", "register commercial use listener failed");
        }
        if (!eventHub.c(EventType.EVENT_PARTNER_LIST_LOGIN, r11)) {
            ye4Var.g("MainActivityViewModel", "register buddylist login listener failed");
        }
        if (!eventHub.c(EventType.EVENT_KEEP_ALIVE_STATE_CHANGED, r14)) {
            ye4Var.g("MainActivityViewModel", "register KeepAlive state change listener failed");
        }
        if (!eventHub.c(EventType.EVENT_SESSION_CONNECTION_STATE_UPDATE, r10)) {
            ye4Var.g("MainActivityViewModel", "register SessionActivity close listener failed");
        }
        if (!eventHub.c(EventType.EVENT_SHOW_NON_COMMERCIAL, r8)) {
            ye4Var.g("MainActivityViewModel", "register show non-commercial dialog listener failed");
        }
        if (!eventHub.c(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_NOT_LOGGED_IN, r9)) {
            ye4Var.g("MainActivityViewModel", "register account not logged in listener failed");
        }
        if (!eventHub.c(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_IDENTITY_NOT_VALIDATED, r15)) {
            ye4Var.g("MainActivityViewModel", "register account identity not validated listener failed");
        }
        if (!eventHub.c(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_EMAIL_NOT_VALIDATED, r12)) {
            ye4Var.g("MainActivityViewModel", "register account email not validated listener failed");
        }
        if (!eventHub.c(EventType.EVENT_REQUEST_ROUTE_ERROR_BLOCKED_BY_REMOTE_DEVICE, vd2Var)) {
            ye4Var.g("MainActivityViewModel", "register remote device blocking listener failed");
        }
        if (iPLSynchronizationStateViewModel != null) {
            IPLSynchronizationStateViewModelSWIGJNI.IPLSynchronizationStateViewModel_RegisterForSynchronizationChanges(iPLSynchronizationStateViewModel.a, iPLSynchronizationStateViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
        }
        accountViewModelBase.b(k6Var);
        ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_RegisterForChanges(iLoginStateAwareContainerViewModel.a, iLoginStateAwareContainerViewModel, VoidSignalCallback.getCPtr(voidSignalCallback3), voidSignalCallback3);
        LicenseViewModelSWIGJNI.LicenseViewModel_RegisterForChanges(licenseViewModel.a, licenseViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        settingsN.g(zbVar);
        String formattedId = Settings.e().toFormattedId();
        formattedId.getClass();
        l97VarK.l(null, bc7.L(formattedId, " ", ""));
        this.i0 = new nw4(Boolean.FALSE);
    }

    @Override // o.oe8
    public final void U0() {
        t7 t7Var = this.d0;
        EventHub eventHub = this.r;
        boolean zF = eventHub.f(t7Var);
        ye4 ye4Var = ye4.a;
        if (!zF) {
            ye4Var.g("MainActivityViewModel", "unregister commentsession listener failed");
        }
        if (!eventHub.f(this.e0)) {
            ye4Var.g("MainActivityViewModel", "unregister commercial use listener failed");
        }
        if (!eventHub.f(this.W)) {
            ye4Var.g("MainActivityViewModel", "unregister buddylist login listener failed");
        }
        if (!eventHub.f(this.X)) {
            ye4Var.g("MainActivityViewModel", "unregister KeepAlive state change listener failed");
        }
        if (!eventHub.f(this.Y)) {
            ye4Var.g("MainActivityViewModel", "unregister SessionActivity close listener failed");
        }
        if (!eventHub.f(this.Z)) {
            ye4Var.g("MainActivityViewModel", "unregister show non-commercial dialog listener failed");
        }
        if (!eventHub.f(this.a0)) {
            ye4Var.g("MainActivityViewModel", "unregister account not logged in listener failed");
        }
        if (!eventHub.f(this.b0)) {
            ye4Var.g("MainActivityViewModel", "unregister account identity not validated listener failed");
        }
        if (!eventHub.f(this.c0)) {
            ye4Var.g("MainActivityViewModel", "unregister account email not validated listener failed");
        }
        this.V.Disconnect();
        this.f0.Disconnect();
        this.h0.Disconnect();
        this.g0.Disconnect();
        ICommercialUseViewModel iCommercialUseViewModel = this.s;
        if (iCommercialUseViewModel != null) {
            iCommercialUseViewModel.a();
        }
        IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel = this.t;
        if (iAccountIdentityValidationViewModel != null) {
            iAccountIdentityValidationViewModel.a();
        }
        IEmailValidationViewModel iEmailValidationViewModel = this.u;
        if (iEmailValidationViewModel != null) {
            iEmailValidationViewModel.a();
        }
        IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel = this.x;
        if (iPLSynchronizationStateViewModel != null) {
            iPLSynchronizationStateViewModel.a();
        }
        AccountViewModelBase accountViewModelBase = this.y;
        if (accountViewModelBase != null) {
            accountViewModelBase.c();
        }
        this.z.a();
        this.A.a();
        this.B.a();
    }

    public final boolean V0() {
        fc3 fc3Var;
        LinkedBlockingQueue linkedBlockingQueue = wi6.a;
        if (linkedBlockingQueue.isEmpty()) {
            return false;
        }
        ye4.a.b("MainActivityViewModel", "checkForScheduledConnect(): there are pending connections!");
        if (!l25.b()) {
            ye4.c("MainActivityViewModel", "checkForScheduledConnect(): keep alive is in wrong state!");
            return false;
        }
        if (!W0() && (fc3Var = (fc3) linkedBlockingQueue.peek()) != null && !fc3Var.a()) {
            ye4.c("MainActivityViewModel", "checkForScheduledConnect(): user not logged in");
            return false;
        }
        zt6 zt6Var = (zt6) this.q;
        if (zt6Var.a.get() || zt6Var.b.get()) {
            ye4.c("MainActivityViewModel", "checkForScheduledConnect(): a session is already connecting or running");
            return false;
        }
        fc3 fc3Var2 = (fc3) linkedBlockingQueue.peek();
        if (fc3Var2 == null) {
            return true;
        }
        fc3Var2.b(this.n);
        return true;
    }

    public final boolean W0() {
        LoginState loginState = LoginState.LoggedIn;
        AccountViewModelBase accountViewModelBase = this.y;
        return loginState.equals(accountViewModelBase != null ? accountViewModelBase.a() : null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    public final void X0() {
        Object obj;
        if (!this.I || this.Q) {
            return;
        }
        ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = this.z;
        if (ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_ShowLoggedInView(iLoginStateAwareContainerViewModel.a, iLoginStateAwareContainerViewModel)) {
            return;
        }
        this.Q = true;
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ob3 ob3Var = (ob3) ((WeakReference) it.next()).get();
            if (ob3Var != null) {
                MainActivity mainActivity = (MainActivity) ob3Var;
                pb3 pb3Var = mainActivity.Y;
                if (pb3Var != null) {
                    nk4 nk4Var = (nk4) pb3Var;
                    if (nk4Var.P) {
                        obj = nk4Var.M;
                    } else if (pb3Var != null) {
                        obj = ((nk4) pb3Var).H;
                    } else {
                        obj = null;
                    }
                } else if (pb3Var != null) {
                    obj = ((nk4) pb3Var).H;
                } else {
                    obj = null;
                }
                SharedPreferences sharedPreferences = h57.a;
                if (sharedPreferences == null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("CURRENT_TAB", 1);
                editorEdit.apply();
                new Handler(mainActivity.getMainLooper()).post(new ak4(mainActivity, obj, (byte) 0));
                if (mainActivity.Y != null) {
                    x02 x02VarA = ik7.a();
                    gk7 gk7Var = new gk7();
                    fx3.o(1, "dialogId", x02VarA, gk7Var);
                    gk7Var.Z0 = x02VarA;
                    gk7Var.a1 = true;
                    gk7Var.H0 = R.string.buddy_list_sign_in_shortcut_connection_text;
                    gk7Var.F0 = R.string.buddy_list_sign_in_shortcut_connection_title;
                    gk7Var.O0 = R.string.tv_ok;
                    gk7.O0(gk7Var, mainActivity);
                }
            }
        }
    }

    public final void Y0(xt2 xt2Var) {
        gk7 gk7Var = this.F;
        gk7Var.a1 = true;
        gk7Var.H0 = R.string.tv_shortcut_connection_wrong_account_dialog_text;
        gk7Var.F0 = R.string.tv_shortcut_connection_wrong_account_dialog_title;
        gk7Var.O0 = R.string.tv_ok;
        if (this.K) {
            return;
        }
        this.K = true;
        gk7.O0(gk7Var, xt2Var);
    }

    public final void Z0(jk4 jk4Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ob3 ob3Var = (ob3) ((WeakReference) it.next()).get();
            if (ob3Var != null) {
                arrayList.add(ob3Var);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jk4Var.p((ob3) it2.next());
        }
    }

    public final void a1(Intent intent) {
        Iterator it = this.E.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ob3 ob3Var = (ob3) ((WeakReference) next).get();
            if (ob3Var != null) {
                ob3Var.startActivity(intent);
            }
        }
    }

    public final void b1() {
        IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel;
        LoginState loginState = LoginState.LoggedIn;
        AccountViewModelBase accountViewModelBase = this.y;
        boolean zEquals = loginState.equals(accountViewModelBase != null ? accountViewModelBase.a() : null);
        nw4 nw4Var = this.i0;
        if (!zEquals || (iPLSynchronizationStateViewModel = this.x) == null || !IPLSynchronizationStateViewModelSWIGJNI.IPLSynchronizationStateViewModel_SynchronizationFailed(iPLSynchronizationStateViewModel.a, iPLSynchronizationStateViewModel)) {
            if (im3.n(nw4Var.getValue(), Boolean.TRUE)) {
                nw4Var.setValue(Boolean.FALSE);
            }
        } else if (im3.n(nw4Var.getValue(), Boolean.FALSE)) {
            IPLSynchronizationStateViewModelSWIGJNI.IPLSynchronizationStateViewModel_ReportErrorShown(iPLSynchronizationStateViewModel.a, iPLSynchronizationStateViewModel);
            nw4Var.setValue(Boolean.TRUE);
        }
    }
}
