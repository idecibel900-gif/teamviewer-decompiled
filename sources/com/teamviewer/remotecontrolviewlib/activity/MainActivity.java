package com.teamviewer.remotecontrolviewlib.activity;

import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IErrorMessageHandler;
import com.teamviewer.remotecontrollib.swig.IAccountIdentityValidationViewModel;
import com.teamviewer.remotecontrollib.swig.IAccountIdentityValidationViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModel;
import com.teamviewer.remotecontrollib.swig.ICommercialUseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IEmailValidationViewModel;
import com.teamviewer.remotecontrollib.swig.IEmailValidationViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import io.sentry.android.core.h2;
import io.sentry.android.core.internal.util.j;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.ac3;
import o.b7;
import o.bb3;
import o.bb5;
import o.bc7;
import o.be8;
import o.bf1;
import o.bk4;
import o.c36;
import o.cd1;
import o.ck3;
import o.ct1;
import o.d31;
import o.df6;
import o.di1;
import o.dk4;
import o.dl5;
import o.e01;
import o.e41;
import o.e8;
import o.f37;
import o.fa3;
import o.fj3;
import o.fk4;
import o.fx3;
import o.g57;
import o.gk6;
import o.gk7;
import o.gp5;
import o.h57;
import o.hc1;
import o.hk0;
import o.hk7;
import o.hm3;
import o.i20;
import o.ic6;
import o.id3;
import o.ik7;
import o.im3;
import o.it1;
import o.j20;
import o.j44;
import o.j56;
import o.j93;
import o.jd;
import o.jd3;
import o.k8;
import o.kh7;
import o.lh;
import o.lk4;
import o.m77;
import o.mu;
import o.nd;
import o.nk4;
import o.nw4;
import o.o43;
import o.ob3;
import o.od;
import o.p02;
import o.pa3;
import o.pb3;
import o.pn5;
import o.px4;
import o.qf0;
import o.r02;
import o.r10;
import o.r55;
import o.rk2;
import o.rz2;
import o.s7;
import o.sd8;
import o.sk2;
import o.sr;
import o.sz2;
import o.t26;
import o.ti4;
import o.tj4;
import o.tk2;
import o.u7;
import o.ua5;
import o.ub7;
import o.us1;
import o.ut2;
import o.ux2;
import o.ve8;
import o.vj4;
import o.vn4;
import o.w05;
import o.w86;
import o.wj4;
import o.wt3;
import o.x02;
import o.xa3;
import o.xh2;
import o.xj4;
import o.xk1;
import o.xo1;
import o.xt6;
import o.ye4;
import o.yj4;
import o.yy0;
import o.zj4;
import o.zt6;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends j20 implements ac3, jd3, pa3, fa3, ob3, id3, bb3 {
    public static final /* synthetic */ int w0 = 0;
    public CoordinatorLayout Q;
    public CollapsingToolbarLayout R;
    public View S;
    public FrameLayout T;
    public View U;
    public View V;
    public View W;
    public ComposeView X;
    public pb3 Y;
    public boolean Z;
    public od a0;
    public boolean b0;
    public IErrorMessageHandler c0;
    public od d0;
    public k8 e0;
    public final kh7 f0;
    public final k8 g0;
    public final mu h0;
    public final tj4 i0;
    public final tj4 j0;
    public final dk4 k0 = new dk4(this);
    public final tj4 l0;
    public final tj4 m0;
    public final tj4 n0;
    public final tj4 o0;
    public final tj4 p0;
    public final tj4 q0;
    public final tj4 r0;
    public final tj4 s0;
    public final tj4 t0;
    public final tj4 u0;
    public final tj4 v0;

    /* JADX WARN: Type inference failed for: r0v10, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v11, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v12, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v13, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v14, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v15, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v16, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v17, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v18, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v6, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v8, types: [o.tj4] */
    /* JADX WARN: Type inference failed for: r0v9, types: [o.tj4] */
    public MainActivity() {
        final byte b = 1;
        this.f0 = new kh7(new ti4(b));
        final byte b2 = 3;
        final byte b3 = 4;
        this.g0 = (k8) C(new h2(this, b3), new e8(b2));
        final byte b4 = 8;
        this.h0 = new mu(this, b4);
        final byte b5 = 12;
        this.i0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b6 = b5;
                MainActivity mainActivity = this.b;
                switch (b6) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        final byte b6 = 0;
        this.j0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b7 = b6;
                MainActivity mainActivity = this.b;
                switch (b7) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        this.l0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b7 = b;
                MainActivity mainActivity = this.b;
                switch (b7) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        final byte b7 = 2;
        this.m0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b8 = b7;
                MainActivity mainActivity = this.b;
                switch (b8) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        this.n0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b8 = b2;
                MainActivity mainActivity = this.b;
                switch (b8) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        this.o0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b8 = b3;
                MainActivity mainActivity = this.b;
                switch (b8) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        final byte b8 = 5;
        this.p0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b9 = b8;
                MainActivity mainActivity = this.b;
                switch (b9) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        final byte b9 = 6;
        this.q0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b10 = b9;
                MainActivity mainActivity = this.b;
                switch (b10) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        final byte b10 = 7;
        this.r0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b11 = b10;
                MainActivity mainActivity = this.b;
                switch (b11) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        this.s0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b11 = b4;
                MainActivity mainActivity = this.b;
                switch (b11) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        final byte b11 = 9;
        this.t0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b12 = b11;
                MainActivity mainActivity = this.b;
                switch (b12) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        final byte b12 = 10;
        this.u0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b13 = b12;
                MainActivity mainActivity = this.b;
                switch (b13) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
        final byte b13 = 11;
        this.v0 = new hk7(this) { // from class: o.tj4
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel2;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel3;
                IAccountIdentityValidationViewModel iAccountIdentityValidationViewModel4;
                IEmailValidationViewModel iEmailValidationViewModel;
                IEmailValidationViewModel iEmailValidationViewModel2;
                IEmailValidationViewModel iEmailValidationViewModel3;
                byte b14 = b13;
                MainActivity mainActivity = this.b;
                switch (b14) {
                    case 0:
                        int i = MainActivity.w0;
                        mainActivity.finish();
                        break;
                    case 1:
                        pb3 pb3Var = mainActivity.Y;
                        if (pb3Var != null) {
                            nk4 nk4Var = (nk4) pb3Var;
                            ICommercialUseViewModel iCommercialUseViewModel = nk4Var.s;
                            if (iCommercialUseViewModel != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel.a, iCommercialUseViewModel, 2);
                            }
                            ep3 ep3Var = nk4Var.w;
                            String string = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string.getClass();
                            ep3Var.getClass();
                            nk4Var.a1(ep3.q(mainActivity, string));
                        }
                        break;
                    case 2:
                        pb3 pb3Var2 = mainActivity.Y;
                        if (pb3Var2 != null) {
                            nk4 nk4Var2 = (nk4) pb3Var2;
                            ICommercialUseViewModel iCommercialUseViewModel2 = nk4Var2.s;
                            if (iCommercialUseViewModel2 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel2.a, iCommercialUseViewModel2, 3);
                            }
                            ep3 ep3Var2 = nk4Var2.w;
                            String string2 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string2.getClass();
                            ep3Var2.getClass();
                            nk4Var2.a1(ep3.q(mainActivity, string2));
                        }
                        break;
                    case 3:
                        pb3 pb3Var3 = mainActivity.Y;
                        if (pb3Var3 != null) {
                            nk4 nk4Var3 = (nk4) pb3Var3;
                            ICommercialUseViewModel iCommercialUseViewModel3 = nk4Var3.s;
                            if (iCommercialUseViewModel3 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUseContactInitiated(iCommercialUseViewModel3.a, iCommercialUseViewModel3, 4);
                            }
                            ep3 ep3Var3 = nk4Var3.w;
                            String string3 = mainActivity.getString(R.string.commercial_blocker_learn_more_url);
                            string3.getClass();
                            ep3Var3.getClass();
                            nk4Var3.a1(ep3.q(mainActivity, string3));
                        }
                        break;
                    case 4:
                        pb3 pb3Var4 = mainActivity.Y;
                        if (pb3Var4 != null) {
                            nk4 nk4Var4 = (nk4) pb3Var4;
                            ICommercialUseViewModel iCommercialUseViewModel4 = nk4Var4.s;
                            if (iCommercialUseViewModel4 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportCommercialUsePayNowInitiated(iCommercialUseViewModel4.a, iCommercialUseViewModel4);
                            }
                            ep3 ep3Var4 = nk4Var4.w;
                            String string4 = mainActivity.getString(R.string.tv_url_payment_default);
                            string4.getClass();
                            ep3Var4.getClass();
                            nk4Var4.a1(ep3.q(mainActivity, string4));
                        }
                        break;
                    case 5:
                        pb3 pb3Var5 = mainActivity.Y;
                        if (pb3Var5 != null) {
                            nk4 nk4Var5 = (nk4) pb3Var5;
                            ICommercialUseViewModel iCommercialUseViewModel5 = nk4Var5.s;
                            if (iCommercialUseViewModel5 != null) {
                                ICommercialUseViewModelSWIGJNI.ICommercialUseViewModel_ReportLearnMoreInitiated(iCommercialUseViewModel5.a, iCommercialUseViewModel5);
                            }
                            ep3 ep3Var5 = nk4Var5.w;
                            String string5 = mainActivity.getString(R.string.tv_url_learn_more_blocked_device);
                            string5.getClass();
                            ep3Var5.getClass();
                            nk4Var5.a1(ep3.q(mainActivity, string5));
                        }
                        break;
                    case 6:
                        int i2 = MainActivity.w0;
                        mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                        break;
                    case 7:
                        int i3 = MainActivity.w0;
                        mainActivity.Z(false);
                        pb3 pb3Var6 = mainActivity.Y;
                        if (pb3Var6 != null && (iAccountIdentityValidationViewModel = ((nk4) pb3Var6).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignInInitiated(iAccountIdentityValidationViewModel.a, iAccountIdentityValidationViewModel);
                            break;
                        }
                        break;
                    case 8:
                        int i4 = MainActivity.w0;
                        mainActivity.Z(true);
                        pb3 pb3Var7 = mainActivity.Y;
                        if (pb3Var7 != null && (iAccountIdentityValidationViewModel2 = ((nk4) pb3Var7).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountRequiredSignUpInitiated(iAccountIdentityValidationViewModel2.a, iAccountIdentityValidationViewModel2);
                            break;
                        }
                        break;
                    case ep1.b /* 9 */:
                        pb3 pb3Var8 = mainActivity.Y;
                        if (pb3Var8 != null && (iAccountIdentityValidationViewModel4 = ((nk4) pb3Var8).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_OnAccountValidationRequiredValidateInitiated(iAccountIdentityValidationViewModel4.a, iAccountIdentityValidationViewModel4);
                        }
                        pb3 pb3Var9 = mainActivity.Y;
                        if (pb3Var9 != null && (iAccountIdentityValidationViewModel3 = ((nk4) pb3Var9).t) != null) {
                            IAccountIdentityValidationViewModelSWIGJNI.IAccountIdentityValidationViewModel_NavigateToAccountValidationView(iAccountIdentityValidationViewModel3.a, iAccountIdentityValidationViewModel3);
                            break;
                        }
                        break;
                    case ep1.c /* 10 */:
                        pb3 pb3Var10 = mainActivity.Y;
                        if (pb3Var10 != null && (iEmailValidationViewModel = ((nk4) pb3Var10).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnMessageDismissed(iEmailValidationViewModel.a, iEmailValidationViewModel);
                            break;
                        }
                        break;
                    case 11:
                        pb3 pb3Var11 = mainActivity.Y;
                        if (pb3Var11 != null && (iEmailValidationViewModel3 = ((nk4) pb3Var11).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_OnValidationInitiated(iEmailValidationViewModel3.a, iEmailValidationViewModel3);
                        }
                        pb3 pb3Var12 = mainActivity.Y;
                        if (pb3Var12 != null && (iEmailValidationViewModel2 = ((nk4) pb3Var12).u) != null) {
                            IEmailValidationViewModelSWIGJNI.IEmailValidationViewModel_NavigateToValidationView(iEmailValidationViewModel2.a, iEmailValidationViewModel2);
                            break;
                        }
                        break;
                    default:
                        pb3 pb3Var13 = mainActivity.Y;
                        if (pb3Var13 != null) {
                            nk4 nk4Var6 = (nk4) pb3Var13;
                            HashSet hashSet = nk4Var6.E;
                            Intent intentB = sj4.b(nk4Var6.n);
                            try {
                                Iterator it = hashSet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    ob3 ob3Var = (ob3) ((WeakReference) next).get();
                                    if (ob3Var != null) {
                                        ((MainActivity) ob3Var).startActivity(intentB);
                                    }
                                }
                            } catch (ActivityNotFoundException unused) {
                                Iterator it2 = hashSet.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (((ob3) ((WeakReference) next2).get()) != null) {
                                        Context context = d82.M;
                                        if (context != null) {
                                            String string6 = context.getString(R.string.tv_sendEmail_ActivityNotFoundException);
                                            string6.getClass();
                                            fx3.r(string6, 1, context, bu7.MAIN);
                                        } else {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        }
                                    }
                                }
                            }
                        }
                        mainActivity.a0();
                        break;
                }
            }
        };
    }

    public static gk7 T(String str) {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.a1 = false;
        gk7Var.F0 = R.string.tv_IDS_COMMERCIAL_TITLE;
        gk7Var.L0(str);
        gk7Var.K0 = R.string.tv_ok;
        return gk7Var;
    }

    @Override // o.m6
    public final void K(boolean z) {
        ck3 ck3VarH = H();
        if (ck3VarH == null && !new j93(this).W()) {
            ye4.c("ToolbarActivityDelegate", "Could not find action bar!");
            ck3VarH = null;
        }
        if (ck3VarH != null) {
            ck3VarH.n0(z);
        }
    }

    @Override // o.j20
    public final /* bridge */ /* synthetic */ boolean Q(Enum r1, i20 i20Var) {
        return b0((w05) r1, null);
    }

    public final void S(pb3 pb3Var, ux2 ux2Var, int i) {
        ux2Var.Y(-212549934);
        byte b = 2;
        int i2 = (ux2Var.f(pb3Var) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) ux2Var.j(lh.b);
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                str = "";
            }
            px4 px4VarG = g57.g(((nk4) pb3Var).U, ux2Var);
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (objK == obj) {
                objK = h57.p(Boolean.TRUE);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) objK;
            if (ub7.b0((String) px4VarG.getValue()) || !((Boolean) px4Var.getValue()).booleanValue()) {
                ux2Var.W(-1291986000);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1292820458);
                String strZ = m77.z(R.string.tv_app_name, ux2Var);
                String str2 = (String) px4VarG.getValue();
                Object objK2 = ux2Var.K();
                if (objK2 == obj) {
                    objK2 = new j44(px4Var, b);
                    ux2Var.g0(objK2);
                }
                Function0 function0 = (Function0) objK2;
                boolean zH = ux2Var.h(context);
                Object objK3 = ux2Var.K();
                if (zH || objK3 == obj) {
                    objK3 = new o43(context, px4Var, (byte) 10);
                    ux2Var.g0(objK3);
                }
                Function1 function1 = (Function1) objK3;
                boolean zH2 = ux2Var.h(context);
                Object objK4 = ux2Var.K();
                if (zH2 || objK4 == obj) {
                    objK4 = new fj3((Object) context, (byte) 9);
                    ux2Var.g0(objK4);
                }
                Function1 function2 = (Function1) objK4;
                Object objK5 = ux2Var.K();
                if (objK5 == obj) {
                    objK5 = new ti4(b);
                    ux2Var.g0(objK5);
                }
                di1.c(strZ, str2, str, null, null, function0, function1, function2, (Function0) objK5, ux2Var, 12582960);
                ux2Var.p(false);
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new vj4(this, pb3Var, i);
        }
    }

    public final CoordinatorLayout U() {
        CoordinatorLayout coordinatorLayout = this.Q;
        if (coordinatorLayout != null) {
            return coordinatorLayout;
        }
        im3.e0("coordinatorLayoutCache");
        throw null;
    }

    public final void V(Intent intent) {
        pb3 pb3Var = this.Y;
        if (pb3Var != null) {
            xt6 xt6Var = ((nk4) pb3Var).q;
            byte b = 0;
            if (intent.getBooleanExtra("SHOW_CHAT", false)) {
                zt6 zt6Var = (zt6) xt6Var;
                if (zt6Var.a.get() || zt6Var.b.get()) {
                    return;
                }
                SharedPreferences sharedPreferences = h57.a;
                if (sharedPreferences == null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("CURRENT_TAB", 3);
                editorEdit.apply();
                new Handler(getMainLooper()).post(new yj4(this, intent.getStringExtra("CHATROOMID"), b));
            }
        }
    }

    public final void W(Intent intent) {
        pb3 pb3Var = this.Y;
        if (pb3Var != null) {
            xt6 xt6Var = ((nk4) pb3Var).q;
            if (intent.getBooleanExtra("SHOW_MONITORINGOVERVIEW", false)) {
                zt6 zt6Var = (zt6) xt6Var;
                if (zt6Var.a.get() || zt6Var.b.get()) {
                    return;
                }
                SharedPreferences sharedPreferences = h57.a;
                if (sharedPreferences == null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("CURRENT_TAB", 1);
                editorEdit.apply();
                new Handler(getMainLooper()).post(new zj4(this, (byte) 1));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x015a A[PHI: r17
      0x015a: PHI (r17v3 java.lang.Long) = (r17v2 java.lang.Long), (r17v5 java.lang.Long), (r17v5 java.lang.Long), (r17v5 java.lang.Long) binds: [B:95:0x0194, B:78:0x0158, B:81:0x0168, B:86:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    public final void X(Intent intent) {
        Long l;
        Long l2;
        Object next;
        Intent intent2;
        gk7 gk7Var;
        Dialog dialog;
        pb3 pb3Var;
        pb3 pb3Var2 = this.Y;
        if (pb3Var2 != null) {
            byte b = 0;
            if (((nk4) pb3Var2).p.getBoolean("KEY_ALLOW_SHORTCUT_CONNECTION", false) && this.Y != null && intent.getBooleanExtra("IS_SHORTCUT", false)) {
                pb3 pb3Var3 = this.Y;
                if (pb3Var3 != null) {
                    ((nk4) pb3Var3).J = false;
                }
                if (pb3Var3 != null) {
                    fx3.q(((nk4) pb3Var3).p, "KEY_ALLOW_SHORTCUT_CONNECTION", false);
                }
                pb3 pb3Var4 = this.Y;
                if (pb3Var4 != null && (gk7Var = ((nk4) pb3Var4).F) != null && (((dialog = gk7Var.A0) == null || !dialog.isShowing()) && (pb3Var = this.Y) != null)) {
                    ((nk4) pb3Var).K = false;
                }
                SharedPreferences sharedPreferences = h57.a;
                if (sharedPreferences == null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("CURRENT_TAB", 0);
                editorEdit.apply();
                new Handler(getMainLooper()).post(new zj4(this, b));
                pb3 pb3Var5 = this.Y;
                if (pb3Var5 != null) {
                    nk4 nk4Var = (nk4) pb3Var5;
                    LicenseViewModel licenseViewModel = nk4Var.A;
                    nw4 nw4Var = nk4Var.O;
                    nk4Var.Q = false;
                    long jLongValue = 0;
                    if (intent.getStringExtra("MDV2_MANAGEMENT_ID") == null) {
                        nk4Var.I = intent.getBooleanExtra("IS_SHORTCUT", false);
                        nk4Var.L = intent.getStringExtra("KEY_ACCOUNTNAME");
                        nk4Var.H = Long.valueOf(intent.getLongExtra("MEMBER_ID", 0L));
                        nk4Var.N = Long.valueOf(intent.getLongExtra("SHORTCUT_DYNGATE_ID", 0L));
                        nk4Var.P = false;
                        if (nk4Var.H != null && nk4Var.W0()) {
                            String str = nk4Var.L;
                            if (str == null || str.length() == 0) {
                                nk4Var.I = false;
                                nk4Var.Y0(this);
                            } else {
                                String strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                                strLicenseViewModel_GetAccountLoginName.getClass();
                                nw4Var.setValue(strLicenseViewModel_GetAccountLoginName);
                            }
                        }
                    } else {
                        nk4Var.I = intent.getBooleanExtra("IS_SHORTCUT", false);
                        nk4Var.L = intent.getStringExtra("KEY_ACCOUNTNAME");
                        String stringExtra = intent.getStringExtra("MDV2_MANAGEMENT_ID");
                        nk4Var.M = stringExtra;
                        long longExtra = intent.getLongExtra("SHORTCUT_DYNGATE_ID", 0L);
                        if (longExtra == 0) {
                            if (stringExtra != null) {
                                d31 d31Var = nk4Var.D;
                                d31Var.getClass();
                                try {
                                    ShortcutManager shortcutManager = (ShortcutManager) d31Var.a.getSystemService(ShortcutManager.class);
                                    if (shortcutManager == null) {
                                        ye4.a("DeviceShortcutHelper", "Shortcut migration skipped: ShortcutManager is unavailable");
                                        l2 = null;
                                    } else {
                                        List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
                                        pinnedShortcuts.getClass();
                                        Iterator<T> it = pinnedShortcuts.iterator();
                                        do {
                                            if (!it.hasNext()) {
                                                l = null;
                                                next = null;
                                                break;
                                            } else {
                                                next = it.next();
                                                l = null;
                                                try {
                                                    intent2 = ((ShortcutInfo) next).getIntent();
                                                } catch (RuntimeException e) {
                                                    e = e;
                                                    ua5.v("Shortcut migration failed: ", e.getMessage(), "DeviceShortcutHelper");
                                                }
                                            }
                                        } while (!im3.n(intent2 != null ? intent2.getStringExtra("MDV2_MANAGEMENT_ID") : null, stringExtra));
                                        ShortcutInfo shortcutInfo = (ShortcutInfo) next;
                                        if (shortcutInfo == null) {
                                            l2 = l;
                                        } else {
                                            String id = shortcutInfo.getId();
                                            id.getClass();
                                            Long lP = bc7.P(id);
                                            if (lP == null) {
                                                l2 = l;
                                            } else {
                                                if (lP.longValue() <= 0) {
                                                    lP = l;
                                                }
                                                if (lP != null) {
                                                    ShortcutInfo shortcutInfoA = d31Var.a(shortcutInfo);
                                                    if (shortcutInfoA != null) {
                                                        if (shortcutManager.updateShortcuts(qf0.K(shortcutInfoA))) {
                                                            ye4.a("DeviceShortcutHelper", "Shortcut migration completed for launched shortcut");
                                                        } else {
                                                            ye4.a("DeviceShortcutHelper", "Shortcut migration was rate-limited");
                                                        }
                                                    }
                                                    l2 = lP;
                                                } else {
                                                    l2 = l;
                                                }
                                            }
                                        }
                                    }
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    l = null;
                                }
                                if (l2 != null) {
                                    jLongValue = l2.longValue();
                                }
                            }
                            longExtra = jLongValue;
                        }
                        nk4Var.N = Long.valueOf(longExtra);
                        nk4Var.P = true;
                        if (nk4Var.M != null && nk4Var.W0()) {
                            String str2 = nk4Var.L;
                            if (str2 == null || str2.length() == 0) {
                                nk4Var.I = false;
                                nk4Var.Y0(this);
                            } else {
                                String strLicenseViewModel_GetAccountLoginName2 = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                                strLicenseViewModel_GetAccountLoginName2.getClass();
                                nw4Var.setValue(strLicenseViewModel_GetAccountLoginName2);
                            }
                        }
                    }
                    nk4Var.X0();
                }
            }
        }
    }

    public final void Y() {
        View viewFindViewById = findViewById(R.id.app_bar_layout);
        viewFindViewById.getClass();
        ((AppBarLayout) viewFindViewById).setVisibility(8);
        View viewFindViewById2 = findViewById(R.id.main);
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
            layoutParams.getClass();
            cd1 cd1Var = (cd1) layoutParams;
            cd1Var.b(null);
            viewFindViewById2.setLayoutParams(cd1Var);
        }
    }

    public final void Z(boolean z) {
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        Intent intent = new Intent(this, (Class<?>) WebLoginActivity.class);
        intent.putExtra("EXTRA_IS_SIGN_UP", z);
        df6 df6Var = new df6((Object) ActivityOptions.makeCustomAnimation(this, 0, 0), (byte) 9);
        k8 k8Var = this.e0;
        if (k8Var != null) {
            k8Var.a(intent, df6Var);
        } else {
            im3.e0("loginActivityLauncher");
            throw null;
        }
    }

    @Override // o.id3
    public final void a() {
        TextView textView = (TextView) findViewById(R.id.arrow_back_label);
        if (textView != null) {
            textView.setTextSize(22.0f);
        }
        TextView textView2 = (TextView) findViewById(R.id.central_label);
        if (textView2 != null) {
            textView2.setTextSize(22.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    public final void a0() {
        pb3 pb3Var;
        int i;
        boolean z;
        pb3 pb3Var2;
        ye4 ye4Var = ye4.a;
        pb3 pb3Var3 = this.Y;
        byte b = 0;
        byte b2 = 1;
        if (pb3Var3 != null && (!((nk4) pb3Var3).p.getBoolean("KEY_EULA_ACCEPTED", false))) {
            if (it1.c != null) {
                startActivity(new Intent(this, (Class<?>) LegalAgreementActivity.class));
                return;
            } else {
                im3.e0("viewFactory");
                throw null;
            }
        }
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        boolean z2 = sharedPreferences.getBoolean("LOGIN_ON_STARTUP", false);
        pb3 pb3Var4 = this.Y;
        if (pb3Var4 != null && !((nk4) pb3Var4).G && z2) {
            if (it1.c == null) {
                im3.e0("viewFactory");
                throw null;
            }
            Intent intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
            df6 df6Var = new df6((Object) ActivityOptions.makeCustomAnimation(this, 0, 0), (byte) 9);
            k8 k8Var = this.e0;
            if (k8Var != null) {
                k8Var.a(intent, df6Var);
                return;
            } else {
                im3.e0("loginActivityLauncher");
                throw null;
            }
        }
        if (new r55(this).a.areNotificationsEnabled()) {
            pb3 pb3Var5 = this.Y;
            if (pb3Var5 != null) {
                fx3.q(((nk4) pb3Var5).p, "KEY_SHOW_NOTIFICATION_DISABLED_WARNING", true);
            }
        } else {
            if (Build.VERSION.SDK_INT >= 33 && (pb3Var2 = this.Y) != null && !((nk4) pb3Var2).p.getBoolean("KEY_NOTIFICATION_PERMISSION_REQUESTED", false)) {
                pb3 pb3Var6 = this.Y;
                if (pb3Var6 != null) {
                    fx3.q(((nk4) pb3Var6).p, "KEY_NOTIFICATION_PERMISSION_REQUESTED", true);
                }
                hm3.A(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                return;
            }
            pb3 pb3Var7 = this.Y;
            if (pb3Var7 != null && ((nk4) pb3Var7).p.getBoolean("KEY_SHOW_NOTIFICATION_DISABLED_WARNING", true)) {
                e0();
                return;
            }
        }
        pb3 pb3Var8 = this.Y;
        if (pb3Var8 != null) {
            Object systemService = ((Context) ((nk4) pb3Var8).f1573o.n).getSystemService("activity");
            systemService.getClass();
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) systemService).getDeviceConfigurationInfo();
            if (deviceConfigurationInfo == null) {
                ye4.c("LocalConstraints", "error obtaining configuration");
            } else {
                if (deviceConfigurationInfo.reqGlEsVersion < 131072) {
                    ye4.c("LocalConstraints", "!!! Device does not support OpenGL ES 2.0 !!!");
                } else {
                    z = true;
                }
                if (!z) {
                    ye4Var.g("MainActivity", "show dialog: no open gl 2.0");
                    d0(R.string.tv_error_startup_title_no_opengl, R.string.tv_error_startup_message_no_opengl);
                    return;
                }
            }
            z = false;
            if (!z) {
                ye4Var.g("MainActivity", "show dialog: no open gl 2.0");
                d0(R.string.tv_error_startup_title_no_opengl, R.string.tv_error_startup_message_no_opengl);
                return;
            }
        }
        if (this.Y != null && (!NativeLibTvExt.c())) {
            ye4Var.g("MainActivity", "show dialog: no native library");
            d0(R.string.tv_error_startup_title_missing_libs, R.string.tv_error_startup_message_missing_libs);
            return;
        }
        pb3 pb3Var9 = this.Y;
        if (pb3Var9 == null || !((nk4) pb3Var9).V0()) {
            if (!xh2.a && ((i = xh2.c) == 2 || i == 3)) {
                rz2 rz2Var = xh2.b;
                AlertDialog alertDialogC = rz2Var.c(this, rz2Var.b(getApplicationContext(), sz2.a), 0, null);
                if (alertDialogC != null) {
                    alertDialogC.show();
                    return;
                } else {
                    ye4.c("MainActivity", "no dialog available");
                    return;
                }
            }
            pb3 pb3Var10 = this.Y;
            if (pb3Var10 != null) {
                tk2 tk2Var = (tk2) ((nk4) pb3Var10).v.n;
                xa3 xa3Var = (xa3) tk2Var.c;
                int i2 = xa3Var == null ? -1 : sk2.a[xa3Var.ordinal()];
                if (i2 == 1) {
                    new Handler(((RemoteControlApplication) tk2Var.a).getMainLooper()).post(new rk2(tk2Var, b2));
                } else if (i2 == 2) {
                    SharedPreferences sharedPreferences2 = h57.a;
                    if (sharedPreferences2 == null) {
                        im3.e0("sharedPreferences");
                        throw null;
                    }
                    fx3.q(sharedPreferences2, "KEY_SHOW_CAMERA_PERMISSION_SNACKBAR", true);
                } else if (i2 == 3) {
                    SharedPreferences sharedPreferences3 = h57.a;
                    if (sharedPreferences3 == null) {
                        im3.e0("sharedPreferences");
                        throw null;
                    }
                    fx3.q(sharedPreferences3, "KEY_SHOW_CAMERA_PERMISSION_SNACKBAR", true);
                }
                tk2Var.c = null;
            }
            ComposeView composeView = this.X;
            if (composeView == null || (pb3Var = this.Y) == null) {
                return;
            }
            composeView.setContent(new yy0(70533497, true, new vj4(this, pb3Var, b)));
        }
    }

    public final boolean b0(w05 w05Var, i20 i20Var) {
        w05Var.getClass();
        boolean zQ = super.Q(w05Var, i20Var);
        if (zQ) {
            View viewFindViewById = findViewById(R.id.app_bar_layout);
            viewFindViewById.getClass();
            ((AppBarLayout) viewFindViewById).d(true, false, true);
        }
        return zQ;
    }

    public final void c0(int i) {
        View view = this.V;
        if (view != null) {
            view.setVisibility(i);
        }
        View view2 = this.W;
        if (view2 != null) {
            view2.setVisibility(i);
        }
        g0(i == 0);
    }

    public final void d0(int i, int i2) {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.a1 = false;
        gk7Var.F0 = i;
        gk7Var.H0 = i2;
        gk7Var.K0 = R.string.tv_error_startup_button_contact;
        gk7Var.O0 = R.string.tv_error_startup_button_close;
        xk1 xk1Var = ct1.a;
        if (xk1Var != null) {
            xk1.M(this.i0, new r02(gk7Var, p02.Positive));
        }
        if (xk1Var != null) {
            xk1.M(this.j0, new r02(gk7Var, p02.Negative));
        }
        gk7.O0(gk7Var, this);
    }

    public final void e0() {
        od odVar = this.d0;
        final byte b = 1;
        if (odVar == null || !odVar.isShowing()) {
            nd ndVar = new nd(this);
            jd jdVar = (jd) ndVar.f1562o;
            jdVar.d = jdVar.a.getText(R.string.tv_post_notification_dialog_title);
            jdVar.f = jdVar.a.getText(R.string.tv_post_notification_dialog_text);
            final byte b2 = 0;
            jdVar.m = false;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: o.uj4
                public final /* synthetic */ MainActivity n;

                {
                    this.n = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    byte b3 = b2;
                    MainActivity mainActivity = this.n;
                    switch (b3) {
                        case 0:
                            int i2 = MainActivity.w0;
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            mainActivity.d0 = null;
                            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                            intent.putExtra("android.provider.extra.APP_PACKAGE", mainActivity.getPackageName());
                            if (intent.resolveActivity(mainActivity.getPackageManager()) == null) {
                                ye4.c("MainActivity", "Failed to display notification permission screen.");
                            } else {
                                mainActivity.startActivity(intent);
                            }
                            break;
                        default:
                            int i3 = MainActivity.w0;
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            pb3 pb3Var = mainActivity.Y;
                            if (pb3Var != null) {
                                fx3.q(((nk4) pb3Var).p, "KEY_SHOW_NOTIFICATION_DISABLED_WARNING", false);
                            }
                            mainActivity.d0 = null;
                            break;
                    }
                }
            };
            jdVar.g = jdVar.a.getText(R.string.tv_enable);
            jdVar.h = onClickListener;
            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener(this) { // from class: o.uj4
                public final /* synthetic */ MainActivity n;

                {
                    this.n = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    byte b3 = b;
                    MainActivity mainActivity = this.n;
                    switch (b3) {
                        case 0:
                            int i2 = MainActivity.w0;
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            mainActivity.d0 = null;
                            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                            intent.putExtra("android.provider.extra.APP_PACKAGE", mainActivity.getPackageName());
                            if (intent.resolveActivity(mainActivity.getPackageManager()) == null) {
                                ye4.c("MainActivity", "Failed to display notification permission screen.");
                            } else {
                                mainActivity.startActivity(intent);
                            }
                            break;
                        default:
                            int i3 = MainActivity.w0;
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            pb3 pb3Var = mainActivity.Y;
                            if (pb3Var != null) {
                                fx3.q(((nk4) pb3Var).p, "KEY_SHOW_NOTIFICATION_DISABLED_WARNING", false);
                            }
                            mainActivity.d0 = null;
                            break;
                    }
                }
            };
            jdVar.i = jdVar.a.getText(R.string.tv_cancel);
            jdVar.j = onClickListener2;
            od odVarE = ndVar.e();
            odVarE.show();
            this.d0 = odVarE;
        }
    }

    @Override // o.id3
    public final void f(Integer num, boolean z, Integer num2, boolean z2) {
        ImageView imageView;
        TextView textView;
        ImageView imageView2;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.toolbar_layout);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.arrow_back_icon);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        TextView textView2 = (TextView) findViewById(R.id.arrow_back_label);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.tv_logo);
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        TextView textView3 = (TextView) findViewById(R.id.central_label);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        if (num != null || z || z2) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.toolbar_layout);
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            if (z && (imageView2 = (ImageView) findViewById(R.id.arrow_back_icon)) != null) {
                imageView2.setVisibility(0);
            }
            if (num != null && (textView = (TextView) findViewById(R.id.arrow_back_label)) != null) {
                textView.setText(getString(num.intValue()));
                textView.setVisibility(0);
            }
            if (!z2 || (imageView = (ImageView) findViewById(R.id.tv_logo)) == null) {
                return;
            }
            imageView.setVisibility(0);
        }
    }

    public final void f0() {
        View viewFindViewById = findViewById(R.id.main);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.getClass();
            cd1 cd1Var = (cd1) layoutParams;
            cd1Var.b(new AppBarLayout.ScrollingViewBehavior());
            viewFindViewById.setLayoutParams(cd1Var);
        }
        View viewFindViewById2 = findViewById(R.id.app_bar_layout);
        viewFindViewById2.getClass();
        ((AppBarLayout) viewFindViewById2).setVisibility(0);
    }

    public final void g0(boolean z) {
        View viewFindViewById = findViewById(R.id.main_coordinator);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (!z) {
            marginLayoutParams.bottomMargin = 0;
            viewFindViewById.setLayoutParams(marginLayoutParams);
        } else {
            View view = this.V;
            if (view != null) {
                view.post(new j((Object) marginLayoutParams, (Object) this, (Object) viewFindViewById, (byte) 13));
            }
        }
    }

    @Override // o.bb3
    public final void i(Intent intent) {
        pb3 pb3Var = this.Y;
        if (pb3Var != null) {
            nk4 nk4Var = (nk4) pb3Var;
            im3.R(e8.n(nk4Var), null, null, new lk4(nk4Var, null, (byte) 1), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        nw4 nw4Var;
        nw4 nw4Var2;
        setTheme(R.style.AppTheme);
        super.onCreate(bundle);
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        dl5 dl5Var = new dl5(new t26(c36Var, BackendContainerAndroid.GetInstance(), (byte) 0), (byte) 2);
        ve8 ve8VarO = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(nk4.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        pb3 pb3Var = (pb3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.Y = pb3Var;
        ((nk4) pb3Var).E.add(new WeakReference(this));
        Intent intent = getIntent();
        intent.getClass();
        if (bundle == null) {
            if ((intent.getFlags() & 4194304) != 0) {
                finish();
                return;
            } else {
                V(intent);
                W(intent);
                X(intent);
            }
        }
        setContentView(R.layout.activity_main);
        View viewFindViewById = findViewById(R.id.main_coordinator);
        hk0 hk0Var = new hk0((byte) 29);
        WeakHashMap weakHashMap = be8.a;
        sd8.c(viewFindViewById, hk0Var);
        I((Toolbar) findViewById(R.id.toolbar));
        View viewFindViewById2 = findViewById(R.id.main_coordinator);
        viewFindViewById2.getClass();
        this.Q = (CoordinatorLayout) viewFindViewById2;
        this.R = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        this.T = (FrameLayout) findViewById(R.id.expanded_toolbar_background);
        this.S = findViewById(R.id.toolbar_subtitle);
        this.U = findViewById(R.id.expanded_toolbar_top_gradient);
        this.V = findViewById(R.id.navigation_container);
        this.W = findViewById(R.id.navigation_container_shadow);
        this.X = (ComposeView) findViewById(R.id.update_bottomsheet_container);
        if (bundle != null) {
            c0(bundle.getInt("navigation_visibility"));
            this.b0 = bundle.getBoolean("pending_license_displayed");
        }
        ye4.a("MainActivity", "update main activity");
        s7 s7Var = u7.g;
        vn4.g0().c = this;
        P(bundle);
        CoordinatorLayout coordinatorLayout = this.Q;
        hc1 hc1Var = null;
        if (coordinatorLayout == null) {
            im3.e0("coordinatorLayoutCache");
            throw null;
        }
        int[] iArr = f37.s;
        f37 f37VarG = f37.g(coordinatorLayout, coordinatorLayout.getResources().getText(R.string.tv_partnerlist_synchronization_error), -2);
        byte b = 1;
        f37VarG.h(R.string.tv_retry, new wj4(this, b));
        Resources resources = getResources();
        ThreadLocal threadLocal = ic6.a;
        ((SnackbarContentLayout) f37VarG.c.getChildAt(0)).getActionView().setTextColor(resources.getColor(R.color.snackbarActionColor, null));
        pb3 pb3Var2 = this.Y;
        byte b2 = 16;
        if (pb3Var2 != null && (nw4Var2 = ((nk4) pb3Var2).i0) != null) {
            nw4Var2.observe(this, new b7(new fj3((Object) f37VarG, (byte) 8), b2));
        }
        pb3 pb3Var3 = this.Y;
        Boolean boolValueOf = pb3Var3 != null ? Boolean.valueOf(((nk4) pb3Var3).W0()) : null;
        pb3 pb3Var4 = this.Y;
        if (pb3Var4 != null && (nw4Var = ((nk4) pb3Var4).O) != null) {
            nw4Var.observe(this, new b7(new o43(boolValueOf, this, (byte) 9), b2));
        }
        ImageView imageView = (ImageView) findViewById(R.id.arrow_back_icon);
        if (imageView != null) {
            imageView.setOnClickListener(new wj4(this, objArr3 == true ? 1 : 0));
        }
        if (!c().b) {
            c().b(new r10(b, this, objArr2 == true ? 1 : 0));
        }
        gp5 gp5Var = (gp5) this.f0.getValue();
        View viewFindViewById3 = findViewById(R.id.post_purchase_compose_view);
        viewFindViewById3.getClass();
        gp5Var.c(bundle, (ComposeView) viewFindViewById3);
        im3.R(us1.B(this), null, null, new fk4(this, hc1Var, objArr == true ? 1 : 0), 3);
        im3.R(us1.B(this), null, null, new fk4(this, hc1Var, b), 3);
        EventHub.e.f().c(EventType.EVENT_IN_APP_PURCHASE_UPGRADE_PLAN_REQUEST, this.h0);
        this.e0 = (k8) C(new xj4(), new e8((byte) 3));
        g0(true);
    }

    @Override // o.j20, o.xr, o.xt2, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        s7 s7Var = u7.g;
        vn4.g0().c = null;
        pb3 pb3Var = this.Y;
        if (pb3Var != null) {
            Iterator it = ((nk4) pb3Var).E.iterator();
            it.getClass();
            while (it.hasNext()) {
                if (this == ((WeakReference) it.next()).get()) {
                    it.remove();
                }
            }
        }
        this.a0 = null;
        EventHub.e.f().f(this.h0);
        xo1.I((ViewGroup) findViewById(R.id.activity_main));
    }

    @Override // o.my0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("SHOW_CHAT", false)) {
            V(intent);
            return;
        }
        if (intent.getBooleanExtra("SHOW_MONITORINGOVERVIEW", false)) {
            W(intent);
        } else if (intent.getBooleanExtra("IS_SHORTCUT", false)) {
            X(intent);
        } else {
            ye4.c("MainActivity", "Intent was Invalid");
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            ut2 ut2VarE = D().E(R.id.main);
            bb5 bb5Var = null;
            if (ut2VarE != null && (ut2VarE instanceof bb5)) {
                bb5Var = (bb5) ut2VarE;
            }
            if (bb5Var != null && bb5Var.g()) {
                return true;
            }
            if (bb5Var != null && bb5Var.G0()) {
                getWindow().setSoftInputMode(3);
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // o.xr, o.xt2, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        a0();
    }

    @Override // o.xt2, o.my0, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (i != 1 || Build.VERSION.SDK_INT < 33) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (im3.n(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || iArr[i2] != 0) {
            e0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0048 A[SYNTHETIC] */
    @Override // o.ei7, o.xt2, android.app.Activity
    public final void onResume() {
        Iterator it;
        ob3 ob3Var;
        super.onResume();
        s7 s7Var = u7.g;
        vn4.g0().c = this;
        pb3 pb3Var = this.Y;
        if (pb3Var != null) {
            nk4 nk4Var = (nk4) pb3Var;
            HashSet hashSet = nk4Var.E;
            RemoteControlApplication remoteControlApplication = nk4Var.n;
            SharedPreferences sharedPreferences = nk4Var.p;
            boolean z = sharedPreferences.getBoolean("KEY_SHOW_CAMERA_PERMISSION_SNACKBAR", false);
            if (Build.VERSION.SDK_INT > 29) {
                if (z && !Environment.isExternalStorageManager()) {
                    it = hashSet.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        ob3Var = (ob3) ((WeakReference) next).get();
                        if (ob3Var != null) {
                            MainActivity mainActivity = (MainActivity) ob3Var;
                            f37 f37VarF = f37.f(mainActivity.findViewById(R.id.activity_main), R.string.tv_no_storage_permission_goto_settings_text, 0);
                            f37VarF.h(R.string.permission_denied_snackbar_action, new wj4(mainActivity, (byte) 3));
                            f37VarF.i();
                        }
                    }
                    fx3.q(sharedPreferences, "KEY_SHOW_CAMERA_PERMISSION_SNACKBAR", false);
                }
            } else if (z) {
                remoteControlApplication.getClass();
                if (hm3.h(remoteControlApplication, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    it = hashSet.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        next2.getClass();
                        ob3Var = (ob3) ((WeakReference) next2).get();
                        if (ob3Var != null) {
                            MainActivity mainActivity2 = (MainActivity) ob3Var;
                            f37 f37VarF2 = f37.f(mainActivity2.findViewById(R.id.activity_main), R.string.tv_no_storage_permission_goto_settings_text, 0);
                            f37VarF2.h(R.string.permission_denied_snackbar_action, new wj4(mainActivity2, (byte) 3));
                            f37VarF2.i();
                        }
                    }
                    fx3.q(sharedPreferences, "KEY_SHOW_CAMERA_PERMISSION_SNACKBAR", false);
                }
            }
            if (sharedPreferences.getBoolean("KEY_SHOW_AUDIO_PERMISSION_SNACKBAR", false)) {
                remoteControlApplication.getClass();
                if (hm3.h(remoteControlApplication, "android.permission.RECORD_AUDIO") == 0) {
                    return;
                }
                Iterator it2 = hashSet.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    Object next3 = it2.next();
                    next3.getClass();
                    ob3 ob3Var2 = (ob3) ((WeakReference) next3).get();
                    if (ob3Var2 != null) {
                        MainActivity mainActivity3 = (MainActivity) ob3Var2;
                        f37 f37VarF3 = f37.f(mainActivity3.findViewById(R.id.activity_main), R.string.audio_permission_session_denied_saved, 0);
                        f37VarF3.h(R.string.permission_denied_snackbar_action, new wj4(mainActivity3, (byte) 2));
                        f37VarF3.i();
                    }
                }
                fx3.q(sharedPreferences, "KEY_SHOW_AUDIO_PERMISSION_SNACKBAR", false);
            }
        }
    }

    @Override // o.my0, o.ly0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        try {
            super.onSaveInstanceState(bundle);
        } catch (IllegalStateException e) {
            e41.s("onSaveInstanceState: ", e.getMessage(), "MainActivity");
        }
        bundle.putBoolean("change", true);
        bundle.putBoolean("pending_license_displayed", this.b0);
        View view = this.V;
        bundle.putInt("navigation_visibility", view != null ? view.getVisibility() : 0);
        ((gp5) this.f0.getValue()).b(bundle);
    }

    @Override // o.j20, o.ei7, o.xr, o.xt2, android.app.Activity
    public final void onStart() {
        super.onStart();
        IErrorMessageHandler iErrorMessageHandlerGetErrorMessageHandler = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetErrorMessageHandler();
        this.c0 = iErrorMessageHandlerGetErrorMessageHandler;
        ChatSignalsHelper.RegisterErrorMessagesChangedSlot(iErrorMessageHandlerGetErrorMessageHandler, this.k0);
    }

    @Override // o.ei7, o.xr, o.xt2, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.k0.Disconnect();
        od odVar = this.a0;
        if (odVar != null) {
            odVar.dismiss();
        }
        this.c0 = null;
    }

    @Override // o.xc3
    public final void q(gk6 gk6Var, boolean z) {
        int i;
        View viewFindViewById = findViewById(R.id.app_bar_layout);
        viewFindViewById.getClass();
        AppBarLayout appBarLayout = (AppBarLayout) viewFindViewById;
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        layoutParams.getClass();
        cd1 cd1Var = (cd1) layoutParams;
        CollapsingToolbarLayout collapsingToolbarLayout = this.R;
        ViewGroup.LayoutParams layoutParams2 = collapsingToolbarLayout != null ? collapsingToolbarLayout.getLayoutParams() : null;
        layoutParams2.getClass();
        sr srVar = (sr) layoutParams2;
        int i2 = bk4.a[gk6Var.ordinal()];
        boolean z2 = false;
        if (i2 != 1) {
            if (i2 == 2) {
                ((ViewGroup.MarginLayoutParams) cd1Var).height = -2;
                srVar.a = 21;
            } else if (i2 == 3) {
                ((ViewGroup.MarginLayoutParams) cd1Var).height = -2;
                srVar.a = 0;
            } else if (i2 != 4) {
                ye4.c("MainActivity", "Unknown scroll state.");
            } else {
                ye4.c("MainActivity", "Unknown scroll state.");
            }
            i = 8;
        } else {
            ((ViewGroup.MarginLayoutParams) cd1Var).height = getResources().getDimensionPixelSize(R.dimen.collapsing_toolbar_expanded_height);
            srVar.a = 3;
            i = 0;
            z2 = true;
        }
        appBarLayout.setLayoutParams(cd1Var);
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.R;
        if (collapsingToolbarLayout2 != null) {
            collapsingToolbarLayout2.setTitleEnabled(z2);
        }
        View view = this.S;
        if (view != null) {
            view.setVisibility(i);
        }
        FrameLayout frameLayout = this.T;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
        View view2 = this.U;
        if (view2 != null) {
            view2.setVisibility(i);
        }
        if (z) {
            View viewFindViewById2 = findViewById(R.id.app_bar_layout);
            viewFindViewById2.getClass();
            ((AppBarLayout) viewFindViewById2).d(true, true, true);
        }
    }

    @Override // o.fa3
    public void setExpandedToolbarView(View view) {
        view.getClass();
        FrameLayout frameLayout = this.T;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.T;
        if (frameLayout2 != null) {
            frameLayout2.addView(view);
        }
    }

    @Override // android.app.Activity
    public final void setTitle(int i) {
        super.setTitle(i);
        CollapsingToolbarLayout collapsingToolbarLayout = this.R;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setTitle(getString(i));
        }
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        CollapsingToolbarLayout collapsingToolbarLayout = this.R;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setTitle(charSequence);
        }
    }
}
