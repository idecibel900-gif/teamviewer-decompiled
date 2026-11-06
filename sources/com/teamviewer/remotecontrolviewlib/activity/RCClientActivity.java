package com.teamviewer.remotecontrolviewlib.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrollib.gui.KeyboardInputView;
import com.teamviewer.remotecontrollib.gui.TVSpecialKeyboard;
import com.teamviewer.remotecontrollib.swig.ISessionToolbarViewModel;
import com.teamviewer.remotecontrollib.swig.SessionToolbarViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionBottomToolbarView;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionExtraToolbarView;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.h2;
import io.sentry.android.core.p2;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.a26;
import o.aj3;
import o.ar;
import o.au2;
import o.b06;
import o.b26;
import o.b7;
import o.bb3;
import o.bf1;
import o.bu7;
import o.c36;
import o.ct1;
import o.d06;
import o.d16;
import o.dl5;
import o.du6;
import o.e8;
import o.ec3;
import o.ed;
import o.fj3;
import o.fx3;
import o.g95;
import o.gg4;
import o.gk7;
import o.gp5;
import o.h57;
import o.hk0;
import o.hm3;
import o.ic3;
import o.ik7;
import o.im3;
import o.it1;
import o.jc3;
import o.k8;
import o.kh7;
import o.lc3;
import o.lo4;
import o.mc3;
import o.mo7;
import o.n26;
import o.n5;
import o.n67;
import o.nc3;
import o.nw4;
import o.o16;
import o.oc3;
import o.p02;
import o.p16;
import o.p26;
import o.pi4;
import o.pn5;
import o.pz4;
import o.r02;
import o.r10;
import o.r55;
import o.s7;
import o.tz4;
import o.u7;
import o.ua5;
import o.uz7;
import o.ve8;
import o.vn4;
import o.vt1;
import o.w16;
import o.w86;
import o.wc3;
import o.wt3;
import o.x02;
import o.x16;
import o.x85;
import o.xk1;
import o.xt2;
import o.xt6;
import o.ye4;
import o.yy0;
import o.zt6;

/* JADX INFO: loaded from: classes.dex */
public final class RCClientActivity extends xt2 implements bb3 {
    public static final /* synthetic */ int c0 = 0;
    public int M;
    public final au2 N;
    public final kh7 O;
    public lc3 P;
    public RcSessionBottomToolbarView Q;
    public RcSessionExtraToolbarView R;
    public TVSpecialKeyboard S;
    public ClientViewOpenGL T;
    public boolean U;
    public boolean V;
    public final kh7 W;
    public final k8 X;
    public final b06 Y;
    public final b06 Z;
    public final b06 a0;
    public final b06 b0;

    public RCClientActivity() {
        au2 au2Var = vt1.c;
        if (au2Var == null) {
            hk0.g("Required value was null.");
            throw null;
        }
        this.N = au2Var;
        this.O = new kh7(new x85((byte) 25));
        this.W = new kh7(new x85((byte) 26));
        byte b = 3;
        this.X = (k8) C(new h2(this, (byte) 6), new e8(b));
        this.Y = new b06(this, (byte) 2);
        this.Z = new b06(this, b);
        this.a0 = new b06(this, (byte) 4);
        this.b0 = new b06(this, (byte) 0);
    }

    public static gk7 H(int i) {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.a1 = false;
        gk7Var.F0 = R.string.tv_IDS_COMMERCIAL_TITLE;
        gk7Var.H0 = i;
        gk7Var.K0 = R.string.tv_ok;
        return gk7Var;
    }

    public final void G() {
        String string = getString(R.string.commercial_blocker_learn_more_url);
        string.getClass();
        Intent intentPutExtra = new Intent(this, (Class<?>) WebViewActivity.class).putExtra("url", string).putExtra("title", (28 & 4) != 0 ? "" : null).putExtra("finish_url", (28 & 8) != 0 ? "" : null).putExtra("sso", false);
        intentPutExtra.getClass();
        startActivity(intentPutExtra);
    }

    public final void I(boolean z) {
        Window window = getWindow();
        window.getClass();
        n67.r(window, false);
        if (Build.VERSION.SDK_INT < 30) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | (!z ? 3846 : 3332));
            return;
        }
        int iStatusBars = !z ? WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars() : WindowInsets.Type.statusBars();
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            insetsController.hide(iStatusBars);
            insetsController.setSystemBarsBehavior(2);
        }
    }

    public final void J() {
        Window window = getWindow();
        window.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            window.getDecorView().setSystemUiVisibility(0);
            return;
        }
        n67.r(window, true);
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            insetsController.show(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
        }
    }

    public final void K() {
        RcSessionBottomToolbarView rcSessionBottomToolbarView = this.Q;
        if (rcSessionBottomToolbarView != null) {
            uz7 uz7Var = rcSessionBottomToolbarView.f71o;
            if (uz7Var == null) {
                im3.e0("toolbarViewModel");
                throw null;
            }
            if (uz7Var.X0()) {
                uz7 uz7Var2 = rcSessionBottomToolbarView.f71o;
                if (uz7Var2 == null) {
                    im3.e0("toolbarViewModel");
                    throw null;
                }
                uz7Var2.f2259o.setValue(Boolean.FALSE);
            }
        }
        RcSessionExtraToolbarView rcSessionExtraToolbarView = this.R;
        if (rcSessionExtraToolbarView != null) {
            rcSessionExtraToolbarView.setVisibility(8);
        }
    }

    public final void L() {
        View viewFindViewById = findViewById(R.id.DummyKeyboardEdit);
        if (viewFindViewById == null) {
            ye4.c("GUIHelperFuncs", "hideSoftkeyboard(): can't hide - view is null!");
            return;
        }
        Object systemService = viewFindViewById.getContext().getApplicationContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
    }

    public final boolean M() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.clientImage);
        if (relativeLayout == null) {
            ye4.c("RCClientActivity", "initClientView: cannot find clientview");
            return false;
        }
        ClientViewOpenGL clientViewOpenGL = this.T;
        if (clientViewOpenGL != null) {
            clientViewOpenGL.e();
            return true;
        }
        ClientViewOpenGL clientViewOpenGL2 = (ClientViewOpenGL) relativeLayout.findViewById(R.id.clientView);
        this.T = clientViewOpenGL2;
        relativeLayout.addView(clientViewOpenGL2.getMouseView(), clientViewOpenGL2.getMouseLayout());
        ImageView remoteMouseView = clientViewOpenGL2.getRemoteMouseView();
        if (remoteMouseView != null) {
            relativeLayout.addView(remoteMouseView, clientViewOpenGL2.getRemoteMouseLayout());
        }
        N();
        return true;
    }

    public final void N() {
        ClientViewOpenGL clientViewOpenGL;
        if (isFinishing()) {
            ye4.c("RCClientActivity", "initControls called after finish");
            return;
        }
        lc3 lc3Var = this.P;
        if (lc3Var == null || (clientViewOpenGL = this.T) == null) {
            return;
        }
        lc3Var.n0(clientViewOpenGL);
        TVSpecialKeyboard tVSpecialKeyboard = this.S;
        if (tVSpecialKeyboard != null) {
            tVSpecialKeyboard.setTvKeyboard(lc3Var.e());
        }
        KeyboardInputView keyboardInputView = (KeyboardInputView) findViewById(R.id.DummyKeyboardEdit);
        keyboardInputView.setTVKeyboard(lc3Var.e());
        keyboardInputView.setTVKeyListener(lc3Var);
    }

    public final void O() {
        RcSessionBottomToolbarView rcSessionBottomToolbarView;
        lo4 lo4VarI;
        boolean zN = false;
        if (this.V) {
            this.V = false;
            return;
        }
        lc3 lc3Var = this.P;
        if (lc3Var != null && (lo4VarI = lc3Var.I()) != null) {
            zN = im3.n(lo4VarI.getValue(), Boolean.TRUE);
        }
        if (!zN || (rcSessionBottomToolbarView = this.Q) == null) {
            return;
        }
        rcSessionBottomToolbarView.c();
    }

    public final void P() {
        View viewFindViewById = findViewById(R.id.DummyKeyboardEdit);
        viewFindViewById.setFocusable(true);
        viewFindViewById.setFocusableInTouchMode(true);
        viewFindViewById.requestFocus();
    }

    public final void Q() {
        RcSessionExtraToolbarView rcSessionExtraToolbarView;
        P();
        lc3 lc3Var = this.P;
        if (lc3Var != null) {
            lc3Var.J0();
        }
        RcSessionExtraToolbarView rcSessionExtraToolbarView2 = this.R;
        if ((rcSessionExtraToolbarView2 == null || rcSessionExtraToolbarView2.getVisibility() != 0) && (rcSessionExtraToolbarView = this.R) != null) {
            b26 b26Var = rcSessionExtraToolbarView.m;
            if (b26Var != null) {
                b26Var.f2259o.setValue(Boolean.TRUE);
            } else {
                im3.e0("toolbarViewModel");
                throw null;
            }
        }
    }

    public final void R() {
        RcSessionExtraToolbarView rcSessionExtraToolbarView;
        P();
        lc3 lc3Var = this.P;
        if (lc3Var != null) {
            lc3Var.D0();
        }
        RcSessionExtraToolbarView rcSessionExtraToolbarView2 = this.R;
        if ((rcSessionExtraToolbarView2 == null || rcSessionExtraToolbarView2.getVisibility() != 0) && (rcSessionExtraToolbarView = this.R) != null) {
            b26 b26Var = rcSessionExtraToolbarView.m;
            if (b26Var != null) {
                b26Var.f2259o.setValue(Boolean.TRUE);
            } else {
                im3.e0("toolbarViewModel");
                throw null;
            }
        }
    }

    public final void S() {
        lc3 lc3Var;
        lc3 lc3Var2;
        lc3 lc3Var3;
        lc3 lc3Var4 = this.P;
        if (lc3Var4 != null && lc3Var4.o0() && (lc3Var3 = this.P) != null) {
            lc3Var3.P0();
        }
        lc3 lc3Var5 = this.P;
        if (lc3Var5 != null && lc3Var5.t() && (lc3Var2 = this.P) != null) {
            lc3Var2.F();
        }
        RcSessionExtraToolbarView rcSessionExtraToolbarView = this.R;
        if (rcSessionExtraToolbarView != null) {
            b26 b26Var = rcSessionExtraToolbarView.m;
            if (b26Var == null) {
                im3.e0("toolbarViewModel");
                throw null;
            }
            b26Var.f2259o.setValue(Boolean.FALSE);
        }
        RcSessionBottomToolbarView rcSessionBottomToolbarView = this.Q;
        if (rcSessionBottomToolbarView != null) {
            rcSessionBottomToolbarView.b();
        }
        ClientViewOpenGL clientViewOpenGL = this.T;
        if (clientViewOpenGL == null || (lc3Var = this.P) == null) {
            return;
        }
        lc3Var.y0(clientViewOpenGL);
    }

    public final void T() {
        gk7 gk7VarH = H(R.string.tv_IDS_COMMERCIAL_DETECTED);
        gk7VarH.O0 = R.string.cb_upgrade_plan_button_label;
        if (ct1.a != null) {
            xk1.M(this.a0, new r02(gk7VarH, p02.Negative));
        }
        gk7VarH.S0 = R.string.cb_more_info_button_label;
        if (ct1.a != null) {
            xk1.M(this.Z, new r02(gk7VarH, p02.Neutral));
        }
        gk7.O0(gk7VarH, this);
    }

    public final void U() {
        gk7 gk7VarH = H(R.string.tv_IDS_COMMERCIAL_SUSPECTED);
        gk7VarH.O0 = R.string.cb_upgrade_plan_button_label;
        if (ct1.a != null) {
            xk1.M(this.a0, new r02(gk7VarH, p02.Negative));
        }
        gk7VarH.S0 = R.string.cb_more_info_button_label;
        if (ct1.a != null) {
            xk1.M(this.Z, new r02(gk7VarH, p02.Neutral));
        }
        gk7.O0(gk7VarH, this);
    }

    public final void V(ic3 ic3Var) {
        if (isFinishing()) {
            return;
        }
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.a1 = true;
        gk7Var.F0 = R.string.tv_close;
        gk7Var.H0 = R.string.tv_closeConnection_Text;
        gk7Var.K0 = R.string.tv_clientDialogQuit;
        gk7Var.O0 = R.string.tv_clientDialogAbort;
        xk1 xk1Var = ct1.a;
        if (xk1Var != null) {
            ik7.b(new d06(this, ic3Var, (byte) 0), new r02(gk7Var, p02.Positive));
        }
        if (xk1Var != null) {
            xk1Var.L(gk7Var);
        }
        gk7.O0(gk7Var, this);
        lc3 lc3Var = this.P;
        if (lc3Var != null) {
            lc3Var.T();
        }
    }

    public final void W(jc3 jc3Var) {
        lc3 lc3Var = this.P;
        if (lc3Var != null) {
            lc3Var.q0(jc3Var);
        }
        new aj3().E0(D(), "InputMethodBottomSheetDialogFragment");
        lc3 lc3Var2 = this.P;
        if (lc3Var2 != null) {
            lc3Var2.H();
        }
    }

    public final void X() {
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        Intent intent = new Intent(this, (Class<?>) SessionSettingsActivity.class);
        intent.putExtra("extra_settings_type", 1);
        intent.putExtra("extra_disable_instructions", false);
        startActivity(intent);
    }

    public final void Y(ar arVar) {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        byte b = 1;
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.a1 = true;
        gk7Var.F0 = R.string.tv_message_RemoteRebootConfirmation_Title;
        gk7Var.H0 = R.string.tv_message_RemoteRebootConfirmation;
        gk7Var.K0 = R.string.tv_yes;
        gk7Var.O0 = R.string.tv_no;
        xk1 xk1Var = ct1.a;
        if (xk1Var != null) {
            ik7.b(new d06(this, arVar, b), new r02(gk7Var, p02.Positive));
        }
        if (xk1Var != null) {
            xk1Var.L(gk7Var);
        }
        gk7.O0(gk7Var, this);
    }

    @Override // o.ly0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        ClientViewOpenGL clientViewOpenGL = this.T;
        return (clientViewOpenGL != null && clientViewOpenGL.dispatchKeyEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // o.bb3
    public final void i(Intent intent) {
        this.X.a(intent, null);
    }

    @Override // o.my0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        TVSpecialKeyboard tVSpecialKeyboard;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        int i = this.M;
        int i2 = configuration.orientation;
        if (i != i2) {
            if (i2 == 1) {
                ye4.a("RCClientActivity", "orientation is now portrait");
            } else if (i2 == 2) {
                ye4.a("RCClientActivity", "orientation is now landscape");
            }
            this.M = configuration.orientation;
        }
        this.V = true;
        lc3 lc3Var = this.P;
        if (lc3Var == null || !lc3Var.t() || (tVSpecialKeyboard = this.S) == null) {
            return;
        }
        tVSpecialKeyboard.requestLayout();
    }

    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        lc3 lc3Var;
        du6 du6VarT;
        du6 du6VarT2;
        nc3 nc3Var;
        du6 du6VarT3;
        b26 b26Var;
        nw4 nw4VarK;
        nw4 nw4VarL;
        lc3 lc3Var2;
        final RCClientActivity rCClientActivity = this;
        super.onCreate(bundle);
        au2 au2Var = rCClientActivity.N;
        au2Var.getClass();
        mo7 mo7Var = ((zt6) ((xt6) au2Var.f)).f;
        byte b = 3;
        final byte b2 = 1;
        if (mo7Var instanceof wc3) {
            n26 n26Var = new n26(mo7Var, au2Var, b);
            ve8 ve8VarO = rCClientActivity.getY();
            bf1 bf1VarK = h57.k(rCClientActivity);
            bf1VarK.getClass();
            pn5 pn5Var = new pn5(ve8VarO, n26Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(d16.class);
            String strC = wt3VarB.c();
            if (strC == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return;
            }
            lc3Var = (lc3) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        } else if (mo7Var == null || (du6VarT = mo7Var.t()) == null || !du6VarT.p) {
            ye4.a.g("RcViewModelFactoryImpl", "Could not acquire RcClientActivityViewModel because there was no session");
            lc3Var = null;
        } else {
            n26 n26Var2 = new n26(mo7Var, au2Var, (byte) 4);
            ve8 ve8VarO2 = rCClientActivity.getY();
            bf1 bf1VarK2 = h57.k(rCClientActivity);
            bf1VarK2.getClass();
            pn5 pn5Var2 = new pn5(ve8VarO2, n26Var2, bf1VarK2);
            wt3 wt3VarB2 = w86.a.b(pz4.class);
            String strC2 = wt3VarB2.c();
            if (strC2 == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return;
            }
            lc3Var = (lc3) pn5Var2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
        }
        rCClientActivity.P = lc3Var;
        if (lc3Var == null) {
            rCClientActivity.finish();
            return;
        }
        lc3Var.v(rCClientActivity);
        rCClientActivity.setContentView(R.layout.activity_client);
        ye4.a("RCClientActivity", "onActivityCreated(): setContentView ok");
        bu7.MAIN.a(new ed((byte) 6));
        lc3 lc3Var3 = rCClientActivity.P;
        if (lc3Var3 == null || !lc3Var3.c()) {
            ye4.c("RCClientActivity", "onActivityCreated(): no session running!");
            rCClientActivity.finish();
            return;
        }
        s7 s7Var = u7.g;
        vn4.g0().d = rCClientActivity;
        kh7 kh7Var = rCClientActivity.O;
        p26 p26Var = (p26) kh7Var.getValue();
        final Resources resources = rCClientActivity.getResources();
        resources.getClass();
        final c36 c36Var = (c36) p26Var;
        c36Var.getClass();
        final mo7 mo7Var2 = ((zt6) c36Var.f).f;
        final byte b3 = 0;
        if (mo7Var2 instanceof wc3) {
            dl5 dl5Var = new dl5(new Function0() { // from class: o.s26
                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    byte b4 = b3;
                    c36 c36Var2 = c36Var;
                    mo7 mo7Var3 = mo7Var2;
                    switch (b4) {
                        case 0:
                            g95 g95Var = new g95((ec3) mo7Var3);
                            wc3 wc3Var = (wc3) mo7Var3;
                            g95 g95Var2 = new g95(wc3Var);
                            ep3 ep3VarN = c36Var2.n(wc3Var);
                            long jSessionToolbarViewModelFactory_GetLegacySessionToolbarViewModel = SessionToolbarViewModelFactorySWIGJNI.SessionToolbarViewModelFactory_GetLegacySessionToolbarViewModel();
                            ISessionToolbarViewModel iSessionToolbarViewModel = jSessionToolbarViewModelFactory_GetLegacySessionToolbarViewModel != 0 ? new ISessionToolbarViewModel(jSessionToolbarViewModelFactory_GetLegacySessionToolbarViewModel) : null;
                            iSessionToolbarViewModel.getClass();
                            return new w16(g95Var, g95Var2, ep3VarN, iSessionToolbarViewModel, resources);
                        default:
                            long jSessionToolbarViewModelFactory_GetSessionToolbarViewModel = SessionToolbarViewModelFactorySWIGJNI.SessionToolbarViewModelFactory_GetSessionToolbarViewModel(mo7Var3.w());
                            ISessionToolbarViewModel iSessionToolbarViewModel2 = jSessionToolbarViewModelFactory_GetSessionToolbarViewModel != 0 ? new ISessionToolbarViewModel(jSessionToolbarViewModelFactory_GetSessionToolbarViewModel) : null;
                            iSessionToolbarViewModel2.getClass();
                            return new tz4(iSessionToolbarViewModel2, c36Var2.b, resources);
                    }
                }
            }, (byte) 2);
            ve8 ve8VarO3 = rCClientActivity.getY();
            bf1 bf1VarK3 = h57.k(rCClientActivity);
            pn5 pn5VarT = ua5.t(bf1VarK3, ve8VarO3, dl5Var, bf1VarK3);
            wt3 wt3VarB3 = w86.a.b(w16.class);
            String strC3 = wt3VarB3.c();
            if (strC3 == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return;
            }
            nc3Var = (nc3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC3), wt3VarB3);
        } else {
            if (mo7Var2 == null || (du6VarT2 = mo7Var2.t()) == null || !du6VarT2.p) {
                hk0.l("No proper session");
                return;
            }
            dl5 dl5Var2 = new dl5(new Function0() { // from class: o.s26
                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    byte b4 = b2;
                    c36 c36Var2 = c36Var;
                    mo7 mo7Var3 = mo7Var2;
                    switch (b4) {
                        case 0:
                            g95 g95Var = new g95((ec3) mo7Var3);
                            wc3 wc3Var = (wc3) mo7Var3;
                            g95 g95Var2 = new g95(wc3Var);
                            ep3 ep3VarN = c36Var2.n(wc3Var);
                            long jSessionToolbarViewModelFactory_GetLegacySessionToolbarViewModel = SessionToolbarViewModelFactorySWIGJNI.SessionToolbarViewModelFactory_GetLegacySessionToolbarViewModel();
                            ISessionToolbarViewModel iSessionToolbarViewModel = jSessionToolbarViewModelFactory_GetLegacySessionToolbarViewModel != 0 ? new ISessionToolbarViewModel(jSessionToolbarViewModelFactory_GetLegacySessionToolbarViewModel) : null;
                            iSessionToolbarViewModel.getClass();
                            return new w16(g95Var, g95Var2, ep3VarN, iSessionToolbarViewModel, resources);
                        default:
                            long jSessionToolbarViewModelFactory_GetSessionToolbarViewModel = SessionToolbarViewModelFactorySWIGJNI.SessionToolbarViewModelFactory_GetSessionToolbarViewModel(mo7Var3.w());
                            ISessionToolbarViewModel iSessionToolbarViewModel2 = jSessionToolbarViewModelFactory_GetSessionToolbarViewModel != 0 ? new ISessionToolbarViewModel(jSessionToolbarViewModelFactory_GetSessionToolbarViewModel) : null;
                            iSessionToolbarViewModel2.getClass();
                            return new tz4(iSessionToolbarViewModel2, c36Var2.b, resources);
                    }
                }
            }, (byte) 2);
            ve8 ve8VarO4 = rCClientActivity.getY();
            bf1 bf1VarK4 = h57.k(rCClientActivity);
            pn5 pn5VarT2 = ua5.t(bf1VarK4, ve8VarO4, dl5Var2, bf1VarK4);
            wt3 wt3VarB4 = w86.a.b(tz4.class);
            String strC4 = wt3VarB4.c();
            if (strC4 == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return;
            }
            nc3Var = (nc3) pn5VarT2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC4), wt3VarB4);
        }
        nc3Var.w(rCClientActivity);
        uz7 uz7Var = nc3Var instanceof uz7 ? (uz7) nc3Var : null;
        if (uz7Var != null && (lc3Var2 = rCClientActivity.P) != null) {
            RcSessionBottomToolbarView rcSessionBottomToolbarView = (RcSessionBottomToolbarView) rCClientActivity.findViewById(R.id.toolbar_default);
            rCClientActivity.Q = rcSessionBottomToolbarView;
            if (rcSessionBottomToolbarView != null) {
                lo4 lo4VarI = lc3Var2.I();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(rCClientActivity);
                layoutInflaterFrom.getClass();
                View viewFindViewById = rCClientActivity.findViewById(R.id.session_showtoolbar);
                viewFindViewById.getClass();
                FloatingActionButton floatingActionButton = (FloatingActionButton) viewFindViewById;
                g95 g95Var = new g95(nc3Var);
                lo4VarI.getClass();
                rcSessionBottomToolbarView.f71o = uz7Var;
                rcSessionBottomToolbarView.p = lo4VarI;
                rcSessionBottomToolbarView.q = g95Var;
                rcSessionBottomToolbarView.m = floatingActionButton;
                floatingActionButton.setOnClickListener(new p2(rcSessionBottomToolbarView, (byte) 15));
                View viewInflate = layoutInflaterFrom.inflate(R.layout.view_rcsession_toolbar_bottom, (ViewGroup) rcSessionBottomToolbarView, false);
                viewInflate.getClass();
                ViewGroup viewGroup = (ViewGroup) viewInflate;
                View viewFindViewById2 = viewGroup.findViewById(R.id.toolbar_start_aligned_items);
                viewFindViewById2.getClass();
                ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
                ArrayList arrayList = uz7Var.p;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    o16 o16Var = (o16) obj;
                    o16Var.getClass();
                    if (o16Var.f == mc3.m && o16Var.g >= 0) {
                        arrayList2.add(obj);
                    }
                }
                rcSessionBottomToolbarView.a(viewGroup2, arrayList2, uz7Var, layoutInflaterFrom, rCClientActivity);
                View viewFindViewById3 = viewGroup.findViewById(R.id.toolbar_end_aligned_items);
                viewFindViewById3.getClass();
                ViewGroup viewGroup3 = (ViewGroup) viewFindViewById3;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    o16 o16Var2 = (o16) obj2;
                    o16Var2.getClass();
                    if (o16Var2.f == mc3.n && o16Var2.g >= 0) {
                        arrayList3.add(obj2);
                    }
                }
                rCClientActivity = this;
                rcSessionBottomToolbarView.a(viewGroup3, arrayList3, uz7Var, layoutInflaterFrom, rCClientActivity);
                rcSessionBottomToolbarView.addView(viewGroup);
                uz7Var.q = true;
                byte b4 = 26;
                uz7Var.f2259o.observe(rCClientActivity, new b7(new p16(rcSessionBottomToolbarView, (byte) 0), b4));
                uz7Var.n.observe(rCClientActivity, new b7(new p16(rcSessionBottomToolbarView, (byte) 1), b4));
                rcSessionBottomToolbarView.d(uz7Var.X0());
            }
        }
        p26 p26Var2 = (p26) kh7Var.getValue();
        Resources resources2 = rCClientActivity.getResources();
        resources2.getClass();
        c36 c36Var2 = (c36) p26Var2;
        c36Var2.getClass();
        mo7 mo7Var3 = ((zt6) c36Var2.f).f;
        if (!(mo7Var3 instanceof wc3)) {
            if (mo7Var3 != null && (du6VarT3 = mo7Var3.t()) != null) {
                byte b5 = 1;
                if (du6VarT3.p) {
                    dl5 dl5Var3 = new dl5(new a26(mo7Var3, resources2, b5), (byte) 2);
                    ve8 ve8VarO5 = rCClientActivity.getY();
                    bf1 bf1VarK5 = h57.k(rCClientActivity);
                    pn5 pn5VarT3 = ua5.t(bf1VarK5, ve8VarO5, dl5Var3, bf1VarK5);
                    wt3 wt3VarB5 = w86.a.b(b26.class);
                    String strC5 = wt3VarB5.c();
                    if (strC5 == null) {
                        hk0.g("Local and anonymous classes can not be ViewModels");
                        return;
                    }
                    b26Var = (b26) pn5VarT3.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC5), wt3VarB5);
                }
            }
            hk0.l("No proper session");
            return;
        }
        dl5 dl5Var4 = new dl5(new n5((Object) mo7Var3, (Object) new g95((ec3) mo7Var3), (Object) resources2, (byte) 26), (byte) 2);
        ve8 ve8VarO6 = rCClientActivity.getY();
        bf1 bf1VarK6 = h57.k(rCClientActivity);
        pn5 pn5VarT4 = ua5.t(bf1VarK6, ve8VarO6, dl5Var4, bf1VarK6);
        wt3 wt3VarB6 = w86.a.b(b26.class);
        String strC6 = wt3VarB6.c();
        if (strC6 == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        b26Var = (b26) pn5VarT4.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC6), wt3VarB6);
        b26Var.t = rCClientActivity;
        final RcSessionExtraToolbarView rcSessionExtraToolbarView = (RcSessionExtraToolbarView) rCClientActivity.findViewById(R.id.extraToolbarLayout);
        rCClientActivity.R = rcSessionExtraToolbarView;
        byte b6 = 28;
        if (rcSessionExtraToolbarView != null) {
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(rCClientActivity);
            layoutInflaterFrom2.getClass();
            rcSessionExtraToolbarView.m = b26Var;
            ViewGroup viewGroup4 = (ViewGroup) rcSessionExtraToolbarView.findViewById(R.id.toolbar_extra_start_container);
            ArrayList arrayList4 = b26Var.p;
            ArrayList<x16> arrayList5 = new ArrayList();
            for (Object obj3 : arrayList4) {
                x16 x16Var = (x16) obj3;
                x16Var.getClass();
                if (x16Var.i == oc3.m) {
                    arrayList5.add(obj3);
                }
            }
            for (x16 x16Var2 : arrayList5) {
                viewGroup4.getClass();
                rcSessionExtraToolbarView.a(viewGroup4, layoutInflaterFrom2, x16Var2, rCClientActivity);
            }
            ViewGroup viewGroup5 = (ViewGroup) rcSessionExtraToolbarView.findViewById(R.id.toolbar_extra_end_container);
            ArrayList<x16> arrayList6 = new ArrayList();
            for (Object obj4 : arrayList4) {
                x16 x16Var3 = (x16) obj4;
                x16Var3.getClass();
                if (x16Var3.i == oc3.n) {
                    arrayList6.add(obj4);
                }
            }
            for (x16 x16Var4 : arrayList6) {
                viewGroup5.getClass();
                rcSessionExtraToolbarView.a(viewGroup5, layoutInflaterFrom2, x16Var4, rCClientActivity);
            }
            final byte b7 = 0;
            b26Var.f2259o.observe(rCClientActivity, new b7(new Function1() { // from class: o.y16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    byte b8 = b7;
                    f88 f88Var = f88.a;
                    RcSessionExtraToolbarView rcSessionExtraToolbarView2 = rcSessionExtraToolbarView;
                    Boolean bool = (Boolean) obj5;
                    switch (b8) {
                        case 0:
                            int i = RcSessionExtraToolbarView.n;
                            boolean zBooleanValue = bool.booleanValue();
                            b26 b26Var2 = rcSessionExtraToolbarView2.m;
                            if (zBooleanValue) {
                                if (b26Var2 == null) {
                                    im3.e0("toolbarViewModel");
                                    throw null;
                                }
                                b26Var2.n.setValue(Boolean.TRUE);
                            } else {
                                if (b26Var2 == null) {
                                    im3.e0("toolbarViewModel");
                                    throw null;
                                }
                                b26Var2.n.setValue(Boolean.FALSE);
                            }
                            return f88Var;
                        default:
                            int i2 = RcSessionExtraToolbarView.n;
                            rcSessionExtraToolbarView2.setVisibility(bool.booleanValue() ? 0 : 8);
                            return f88Var;
                    }
                }
            }, b6));
            final byte b8 = 1;
            b26Var.n.observe(rCClientActivity, new b7(new Function1() { // from class: o.y16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    byte b9 = b8;
                    f88 f88Var = f88.a;
                    RcSessionExtraToolbarView rcSessionExtraToolbarView2 = rcSessionExtraToolbarView;
                    Boolean bool = (Boolean) obj5;
                    switch (b9) {
                        case 0:
                            int i = RcSessionExtraToolbarView.n;
                            boolean zBooleanValue = bool.booleanValue();
                            b26 b26Var2 = rcSessionExtraToolbarView2.m;
                            if (zBooleanValue) {
                                if (b26Var2 == null) {
                                    im3.e0("toolbarViewModel");
                                    throw null;
                                }
                                b26Var2.n.setValue(Boolean.TRUE);
                            } else {
                                if (b26Var2 == null) {
                                    im3.e0("toolbarViewModel");
                                    throw null;
                                }
                                b26Var2.n.setValue(Boolean.FALSE);
                            }
                            return f88Var;
                        default:
                            int i2 = RcSessionExtraToolbarView.n;
                            rcSessionExtraToolbarView2.setVisibility(bool.booleanValue() ? 0 : 8);
                            return f88Var;
                    }
                }
            }, b6));
        }
        rCClientActivity.S = (TVSpecialKeyboard) rCClientActivity.findViewById(R.id.specialKeyboard);
        View decorView = rCClientActivity.getWindow().getDecorView();
        decorView.getClass();
        final RelativeLayout relativeLayout = (RelativeLayout) rCClientActivity.findViewById(R.id.clientlayout);
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: o.c06
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i) {
                int i2 = RCClientActivity.c0;
                int i3 = i & 4;
                RelativeLayout relativeLayout2 = relativeLayout;
                if (i3 != 0) {
                    relativeLayout2.setFitsSystemWindows(false);
                    relativeLayout2.setPadding(0, 0, 0, 0);
                    return;
                }
                relativeLayout2.setFitsSystemWindows(true);
                lc3 lc3Var4 = rCClientActivity.P;
                if (lc3Var4 != null) {
                    lc3Var4.r0();
                }
            }
        });
        lc3 lc3Var4 = rCClientActivity.P;
        if (lc3Var4 != null) {
            lc3Var4.I0();
        }
        lc3 lc3Var5 = rCClientActivity.P;
        if (lc3Var5 != null) {
            lc3Var5.F0();
        }
        ComposeView composeView = (ComposeView) rCClientActivity.findViewById(R.id.waiting_room);
        byte b9 = 1;
        composeView.setContent(new yy0(-621531233, true, new gg4(rCClientActivity, (byte) 8)));
        View viewFindViewById4 = rCClientActivity.findViewById(R.id.clientlayout);
        lc3 lc3Var6 = rCClientActivity.P;
        byte b10 = 23;
        if (lc3Var6 != null && (nw4VarL = lc3Var6.l()) != null) {
            nw4VarL.observe(rCClientActivity, new b7(new pi4(composeView, viewFindViewById4, b9), b10));
        }
        lc3 lc3Var7 = rCClientActivity.P;
        if (lc3Var7 != null && (nw4VarK = lc3Var7.k()) != null) {
            nw4VarK.observe(rCClientActivity, new b7(new fj3(rCClientActivity, b6), b10));
        }
        lc3 lc3Var8 = rCClientActivity.P;
        if (lc3Var8 != null) {
            lc3Var8.e0(rCClientActivity.getResources().getConfiguration().orientation);
        }
        rCClientActivity.setVolumeControlStream(3);
        rCClientActivity.c().a(rCClientActivity, new r10((byte) 11, rCClientActivity, false));
        gp5 gp5Var = (gp5) rCClientActivity.W.getValue();
        View viewFindViewById5 = rCClientActivity.findViewById(R.id.post_purchase_compose_view);
        viewFindViewById5.getClass();
        gp5Var.c(bundle, (ComposeView) viewFindViewById5);
    }

    @Override // o.xt2, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ye4.a("RCClientActivity", "onDestroy");
        lc3 lc3Var = this.P;
        if (lc3Var == null || lc3Var.c() || !isFinishing()) {
            ye4.a("RCClientActivity", "onDestroy(): Attempt to destroy session activity while session is running.");
            return;
        }
        lc3Var.R(getResources().getConfiguration().orientation);
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        new r55(applicationContext).a(1, null);
        lc3Var.f();
        ye4.a("RCClientActivity", "onDestroy(): destroying session activity.");
        s7 s7Var = u7.g;
        vn4.g0().d = null;
        TVSpecialKeyboard tVSpecialKeyboard = this.S;
        if (tVSpecialKeyboard != null) {
            tVSpecialKeyboard.setTvKeyboard(null);
        }
        ClientViewOpenGL clientViewOpenGL = this.T;
        this.T = null;
        if (clientViewOpenGL != null) {
            clientViewOpenGL.setOnTouchListener(null);
            clientViewOpenGL.u = null;
            clientViewOpenGL.z = null;
            clientViewOpenGL.w = null;
            hm3.f(clientViewOpenGL.q, null);
        }
        KeyboardInputView keyboardInputView = (KeyboardInputView) findViewById(R.id.DummyKeyboardEdit);
        if (keyboardInputView != null) {
            keyboardInputView.setTVKeyboard(null);
        }
        if (keyboardInputView != null) {
            keyboardInputView.setTVKeyListener(null);
        }
        lc3Var.N();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        lc3 lc3Var = this.P;
        return (lc3Var != null && lc3Var.onKeyDown(i, keyEvent)) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        keyEvent.getClass();
        lc3 lc3Var = this.P;
        return lc3Var != null && lc3Var.onKeyMultiple(i, i2, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        lc3 lc3Var = this.P;
        return (lc3Var != null && lc3Var.onKeyUp(i, keyEvent)) || super.onKeyUp(i, keyEvent);
    }

    @Override // o.my0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("CLOSE_CURRENT_SESSION", false)) {
            ye4.a("RCClientActivity", "will show dialog");
            lc3 lc3Var = this.P;
            if (lc3Var != null) {
                String stringExtra = intent.getStringExtra("KEY_ACCOUNTNAME");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                lc3Var.i(stringExtra, intent.getLongExtra("MEMBER_ID", 0L), intent.getBooleanExtra("IS_SHORTCUT", false), intent.getStringExtra("MDV2_MANAGEMENT_ID"), intent.getLongExtra("SHORTCUT_DYNGATE_ID", 0L));
            }
            this.U = true;
        }
    }

    @Override // o.xt2, android.app.Activity
    public final void onPause() {
        super.onPause();
        lc3 lc3Var = this.P;
        if (lc3Var != null) {
            lc3Var.a();
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        X();
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // o.xt2, android.app.Activity
    public final void onResume() {
        super.onResume();
        lc3 lc3Var = this.P;
        if (lc3Var != null) {
            Window window = getWindow();
            window.getClass();
            lc3Var.h(window);
        }
        if (this.U) {
            if (!isFinishing()) {
                x02 x02VarA = ik7.a();
                gk7 gk7Var = new gk7();
                byte b = 1;
                fx3.o(1, "dialogId", x02VarA, gk7Var);
                gk7Var.Z0 = x02VarA;
                gk7Var.a1 = false;
                gk7Var.F0 = R.string.tv_close;
                gk7Var.H0 = R.string.tv_clientDialogNewConnectionText;
                gk7Var.K0 = R.string.tv_clientDialogOpenNewConnection;
                gk7Var.O0 = R.string.tv_clientDialogAbort;
                xk1 xk1Var = ct1.a;
                if (xk1Var != null) {
                    ik7.b(new b06(this, b), new r02(gk7Var, p02.Positive));
                }
                if (xk1Var != null) {
                    xk1.M(this.Y, new r02(gk7Var, p02.Negative));
                }
                gk7.O0(gk7Var, this);
            }
            this.U = false;
        }
    }

    @Override // o.my0, o.ly0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        ((gp5) this.W.getValue()).b(bundle);
    }

    @Override // o.xt2, android.app.Activity
    public final void onStart() {
        super.onStart();
        s7 s7Var = u7.g;
        vn4.g0().b(this);
        lc3 lc3Var = this.P;
        if (lc3Var != null) {
            lc3Var.b();
        }
    }

    @Override // o.xt2, android.app.Activity
    public final void onStop() {
        super.onStop();
        ye4.a("RCClientActivity", "onStop");
        s7 s7Var = u7.g;
        vn4.g0().c(this);
        lc3 lc3Var = this.P;
        if (lc3Var != null) {
            lc3Var.d0();
        }
    }

    @Override // android.app.Activity
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        lc3 lc3Var = this.P;
        return lc3Var != null && lc3Var.C(motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        lc3 lc3Var = this.P;
        if (lc3Var != null) {
            lc3Var.M(z);
        }
    }
}
