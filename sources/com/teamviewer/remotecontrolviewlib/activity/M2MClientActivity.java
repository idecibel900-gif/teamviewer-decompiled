package com.teamviewer.remotecontrolviewlib.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrollib.gui.KeyboardInputView;
import com.teamviewer.remotecontrollib.gui.view.M2MControlView;
import com.teamviewer.remotecontrollib.gui.view.M2MSpecialKeyboard;
import com.teamviewer.remotecontrollib.gui.view.M2MZoomView;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.remotecontrolviewlib.view.session.InstructionsOverlayView;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.h2;
import kotlin.jvm.functions.Function1;
import o.ar;
import o.au2;
import o.b7;
import o.bb3;
import o.bf1;
import o.bu7;
import o.cp0;
import o.ct1;
import o.du6;
import o.e8;
import o.ed;
import o.ew1;
import o.fx3;
import o.gb3;
import o.gg4;
import o.gk7;
import o.gp5;
import o.h57;
import o.hk0;
import o.hk7;
import o.hm3;
import o.ik7;
import o.im3;
import o.jb3;
import o.k8;
import o.kb3;
import o.kh7;
import o.lk3;
import o.mo7;
import o.mz4;
import o.n26;
import o.nx3;
import o.oi4;
import o.p02;
import o.p6;
import o.pi4;
import o.pn5;
import o.qf2;
import o.qi4;
import o.r02;
import o.r10;
import o.r55;
import o.ri4;
import o.s7;
import o.si4;
import o.ti4;
import o.u7;
import o.ve8;
import o.vn4;
import o.vt1;
import o.w86;
import o.wc3;
import o.wt3;
import o.x02;
import o.xk1;
import o.xt2;
import o.xt6;
import o.ye4;
import o.yi4;
import o.yy0;
import o.zt6;

/* JADX INFO: loaded from: classes.dex */
public final class M2MClientActivity extends xt2 implements kb3, gb3, bb3 {
    public static final /* synthetic */ int h0 = 0;
    public InstructionsOverlayView M;
    public InstructionsOverlayView N;
    public int O;
    public Handler P;
    public View R;
    public M2MZoomView S;
    public InstructionsOverlayView T;
    public boolean U;
    public jb3 V;
    public ClientViewOpenGL W;
    public boolean X;
    public boolean Y;
    public final oi4 a0;
    public final oi4 b0;
    public final oi4 c0;
    public final oi4 d0;
    public final oi4 e0;
    public final kh7 f0;
    public final k8 g0;
    public int Q = -1;
    public short Z = 3000;

    /* JADX WARN: Type inference failed for: r0v2, types: [o.oi4] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.oi4] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.oi4] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.oi4] */
    /* JADX WARN: Type inference failed for: r0v6, types: [o.oi4] */
    public M2MClientActivity() {
        final byte b = 0;
        this.a0 = new hk7(this) { // from class: o.oi4
            public final /* synthetic */ M2MClientActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b2 = b;
                M2MClientActivity m2MClientActivity = this.b;
                switch (b2) {
                    case 0:
                        jb3 jb3Var = m2MClientActivity.V;
                        if (jb3Var != null) {
                            jb3Var.L0();
                        }
                        break;
                    case 1:
                        jb3 jb3Var2 = m2MClientActivity.V;
                        if (jb3Var2 != null) {
                            jb3Var2.G();
                        }
                        break;
                    case 2:
                        jb3 jb3Var3 = m2MClientActivity.V;
                        if (jb3Var3 != null) {
                            jb3Var3.m();
                        }
                        break;
                    case 3:
                        jb3 jb3Var4 = m2MClientActivity.V;
                        if (jb3Var4 != null) {
                            jb3Var4.j();
                        }
                        break;
                    default:
                        int i = M2MClientActivity.h0;
                        m2MClientActivity.g0.a(new Intent(m2MClientActivity, (Class<?>) InAppPurchaseActivity.class), null);
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.b0 = new hk7(this) { // from class: o.oi4
            public final /* synthetic */ M2MClientActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b3 = b2;
                M2MClientActivity m2MClientActivity = this.b;
                switch (b3) {
                    case 0:
                        jb3 jb3Var = m2MClientActivity.V;
                        if (jb3Var != null) {
                            jb3Var.L0();
                        }
                        break;
                    case 1:
                        jb3 jb3Var2 = m2MClientActivity.V;
                        if (jb3Var2 != null) {
                            jb3Var2.G();
                        }
                        break;
                    case 2:
                        jb3 jb3Var3 = m2MClientActivity.V;
                        if (jb3Var3 != null) {
                            jb3Var3.m();
                        }
                        break;
                    case 3:
                        jb3 jb3Var4 = m2MClientActivity.V;
                        if (jb3Var4 != null) {
                            jb3Var4.j();
                        }
                        break;
                    default:
                        int i = M2MClientActivity.h0;
                        m2MClientActivity.g0.a(new Intent(m2MClientActivity, (Class<?>) InAppPurchaseActivity.class), null);
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.c0 = new hk7(this) { // from class: o.oi4
            public final /* synthetic */ M2MClientActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b4 = b3;
                M2MClientActivity m2MClientActivity = this.b;
                switch (b4) {
                    case 0:
                        jb3 jb3Var = m2MClientActivity.V;
                        if (jb3Var != null) {
                            jb3Var.L0();
                        }
                        break;
                    case 1:
                        jb3 jb3Var2 = m2MClientActivity.V;
                        if (jb3Var2 != null) {
                            jb3Var2.G();
                        }
                        break;
                    case 2:
                        jb3 jb3Var3 = m2MClientActivity.V;
                        if (jb3Var3 != null) {
                            jb3Var3.m();
                        }
                        break;
                    case 3:
                        jb3 jb3Var4 = m2MClientActivity.V;
                        if (jb3Var4 != null) {
                            jb3Var4.j();
                        }
                        break;
                    default:
                        int i = M2MClientActivity.h0;
                        m2MClientActivity.g0.a(new Intent(m2MClientActivity, (Class<?>) InAppPurchaseActivity.class), null);
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.d0 = new hk7(this) { // from class: o.oi4
            public final /* synthetic */ M2MClientActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b5 = b4;
                M2MClientActivity m2MClientActivity = this.b;
                switch (b5) {
                    case 0:
                        jb3 jb3Var = m2MClientActivity.V;
                        if (jb3Var != null) {
                            jb3Var.L0();
                        }
                        break;
                    case 1:
                        jb3 jb3Var2 = m2MClientActivity.V;
                        if (jb3Var2 != null) {
                            jb3Var2.G();
                        }
                        break;
                    case 2:
                        jb3 jb3Var3 = m2MClientActivity.V;
                        if (jb3Var3 != null) {
                            jb3Var3.m();
                        }
                        break;
                    case 3:
                        jb3 jb3Var4 = m2MClientActivity.V;
                        if (jb3Var4 != null) {
                            jb3Var4.j();
                        }
                        break;
                    default:
                        int i = M2MClientActivity.h0;
                        m2MClientActivity.g0.a(new Intent(m2MClientActivity, (Class<?>) InAppPurchaseActivity.class), null);
                        break;
                }
            }
        };
        final byte b5 = 4;
        this.e0 = new hk7(this) { // from class: o.oi4
            public final /* synthetic */ M2MClientActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b6 = b5;
                M2MClientActivity m2MClientActivity = this.b;
                switch (b6) {
                    case 0:
                        jb3 jb3Var = m2MClientActivity.V;
                        if (jb3Var != null) {
                            jb3Var.L0();
                        }
                        break;
                    case 1:
                        jb3 jb3Var2 = m2MClientActivity.V;
                        if (jb3Var2 != null) {
                            jb3Var2.G();
                        }
                        break;
                    case 2:
                        jb3 jb3Var3 = m2MClientActivity.V;
                        if (jb3Var3 != null) {
                            jb3Var3.m();
                        }
                        break;
                    case 3:
                        jb3 jb3Var4 = m2MClientActivity.V;
                        if (jb3Var4 != null) {
                            jb3Var4.j();
                        }
                        break;
                    default:
                        int i = M2MClientActivity.h0;
                        m2MClientActivity.g0.a(new Intent(m2MClientActivity, (Class<?>) InAppPurchaseActivity.class), null);
                        break;
                }
            }
        };
        this.f0 = new kh7(new ti4(b));
        this.g0 = (k8) C(new h2(this, b4), new e8(b4));
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
        InstructionsOverlayView instructionsOverlayView;
        if (this.U) {
            InstructionsOverlayView instructionsOverlayView2 = this.T;
            if (instructionsOverlayView2 != null && instructionsOverlayView2.u == lk3.n) {
                ((VideoView) instructionsOverlayView2.findViewById(R.id.locked_video)).stopPlayback();
                ((VideoView) instructionsOverlayView2.findViewById(R.id.unlocked_video)).stopPlayback();
            }
            InstructionsOverlayView instructionsOverlayView3 = this.T;
            if (instructionsOverlayView3 != null) {
                instructionsOverlayView3.removeAllViews();
            }
            if (!z || (instructionsOverlayView = this.T) == null) {
                InstructionsOverlayView instructionsOverlayView4 = this.T;
                if (instructionsOverlayView4 != null) {
                    instructionsOverlayView4.setVisibility(8);
                }
            } else {
                instructionsOverlayView.animate().alpha(0.0f).setDuration(350L).setListener(new p6(this, (byte) 4)).getClass();
            }
            this.U = false;
            M2MZoomView m2MZoomView = this.S;
            if (m2MZoomView != null) {
                m2MZoomView.setOnTouchListener(null);
            }
            M2MZoomView m2MZoomView2 = this.S;
            if (m2MZoomView2 != null) {
                m2MZoomView2.setAlpha(1.0f);
            }
            M2MZoomView m2MZoomView3 = this.S;
            if (m2MZoomView3 != null) {
                m2MZoomView3.postDelayed(m2MZoomView3.C, 10000L);
            }
            jb3 jb3Var = this.V;
            if (jb3Var != null) {
                jb3Var.u();
            }
        }
    }

    public final void J() {
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(findViewById(R.id.DummyKeyboardEdit).getWindowToken(), 0);
        View view = this.R;
        if (view != null) {
            view.setVisibility(8);
        }
        this.X = false;
    }

    public final boolean K() {
        jb3 jb3Var;
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.clientImage);
        if (relativeLayout == null) {
            ye4.c("M2MClientActivity", "initClientView: cannot find clientview");
            return false;
        }
        ClientViewOpenGL clientViewOpenGL = this.W;
        if (clientViewOpenGL != null) {
            clientViewOpenGL.e();
            return true;
        }
        ClientViewOpenGL clientViewOpenGL2 = (ClientViewOpenGL) relativeLayout.findViewById(R.id.clientView);
        this.W = clientViewOpenGL2;
        relativeLayout.addView(clientViewOpenGL2.getMouseView(), clientViewOpenGL2.getMouseLayout());
        ImageView remoteMouseView = clientViewOpenGL2.getRemoteMouseView();
        if (remoteMouseView != null) {
            relativeLayout.addView(remoteMouseView, clientViewOpenGL2.getRemoteMouseLayout());
        }
        if (isFinishing()) {
            ye4.c("M2MClientActivity", "initControls called after finish");
            return true;
        }
        ClientViewOpenGL clientViewOpenGL3 = this.W;
        if (clientViewOpenGL3 == null || (jb3Var = this.V) == null) {
            return true;
        }
        jb3Var.p(clientViewOpenGL3, new ar(this, (byte) 16));
        ((M2MSpecialKeyboard) findViewById(R.id.specialKeyboard)).setKeyboardListeners(jb3Var.e());
        KeyboardInputView keyboardInputView = (KeyboardInputView) findViewById(R.id.DummyKeyboardEdit);
        keyboardInputView.setTVKeyboard(jb3Var.e());
        keyboardInputView.setTVKeyListener(jb3Var);
        keyboardInputView.setKeyboardStateChangeListener(this);
        return true;
    }

    public final void L() {
        gk7 gk7VarH = H(R.string.tv_IDS_COMMERCIAL_DETECTED);
        gk7VarH.O0 = R.string.cb_upgrade_plan_button_label;
        if (ct1.a != null) {
            xk1.M(this.e0, new r02(gk7VarH, p02.Negative));
        }
        gk7VarH.S0 = R.string.cb_more_info_button_label;
        if (ct1.a != null) {
            xk1.M(this.d0, new r02(gk7VarH, p02.Neutral));
        }
        gk7.O0(gk7VarH, this);
    }

    public final void M() {
        gk7 gk7VarH = H(R.string.tv_IDS_COMMERCIAL_SUSPECTED);
        gk7VarH.O0 = R.string.cb_upgrade_plan_button_label;
        if (ct1.a != null) {
            xk1.M(this.e0, new r02(gk7VarH, p02.Negative));
        }
        gk7VarH.S0 = R.string.cb_more_info_button_label;
        if (ct1.a != null) {
            xk1.M(this.d0, new r02(gk7VarH, p02.Neutral));
        }
        gk7.O0(gk7VarH, this);
    }

    public final void N() {
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
            xk1.M(this.b0, new r02(gk7Var, p02.Positive));
        }
        if (xk1Var != null) {
            xk1Var.L(gk7Var);
        }
        gk7.O0(gk7Var, this);
    }

    public final void O(boolean z) {
        if (this.U) {
            return;
        }
        M2MZoomView m2MZoomView = this.S;
        if (m2MZoomView != null && (m2MZoomView.w != 0.0f || m2MZoomView.x != 0.5f)) {
            int iA = m2MZoomView.a(0.0f, true);
            int iD = m2MZoomView.d(0.5f, true);
            ViewGroup.LayoutParams layoutParams = m2MZoomView.getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = iA;
            marginLayoutParams.leftMargin = (m2MZoomView.q - iA) - m2MZoomView.getWidth();
            marginLayoutParams.topMargin = iD;
            marginLayoutParams.bottomMargin = (m2MZoomView.r - iD) - m2MZoomView.getHeight();
            m2MZoomView.e(marginLayoutParams, true, true);
        }
        M2MZoomView m2MZoomView2 = this.S;
        if (m2MZoomView2 != null) {
            m2MZoomView2.removeCallbacks(m2MZoomView2.C);
        }
        M2MZoomView m2MZoomView3 = this.S;
        if (m2MZoomView3 != null) {
            m2MZoomView3.setAlpha(1.0f);
        }
        M2MZoomView m2MZoomView4 = this.S;
        if (m2MZoomView4 != null) {
            m2MZoomView4.setOnTouchListener(new cp0(this, (byte) 2));
        }
        InstructionsOverlayView instructionsOverlayView = this.T;
        if (instructionsOverlayView != null) {
            instructionsOverlayView.setVisibility(0);
        }
        this.U = true;
        InstructionsOverlayView instructionsOverlayView2 = this.T;
        if (instructionsOverlayView2 != null) {
            instructionsOverlayView2.b(z);
        }
    }

    @Override // o.ly0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        ClientViewOpenGL clientViewOpenGL = this.W;
        return (clientViewOpenGL != null && clientViewOpenGL.dispatchKeyEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // o.bb3
    public final void i(Intent intent) {
        this.g0.a(intent, null);
    }

    @Override // o.my0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        InstructionsOverlayView instructionsOverlayView;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        int i = this.O;
        int i2 = configuration.orientation;
        if (i != i2) {
            if (i2 == 1) {
                ye4.a("M2MClientActivity", "orientation is now portrait");
            } else if (i2 == 2) {
                ye4.a("M2MClientActivity", "orientation is now landscape");
            }
            this.O = configuration.orientation;
        }
        if (!this.U || (instructionsOverlayView = this.M) == null) {
            return;
        }
        boolean z = lk3.m == instructionsOverlayView.u;
        if (!z) {
            ((VideoView) instructionsOverlayView.findViewById(R.id.locked_video)).stopPlayback();
            ((VideoView) instructionsOverlayView.findViewById(R.id.unlocked_video)).stopPlayback();
        }
        instructionsOverlayView.b(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        du6 du6VarT;
        super.onCreate(bundle);
        au2 au2Var = vt1.c;
        final jb3 jb3Var = null;
        final byte b = 1;
        if (au2Var != null) {
            mo7 mo7Var = ((zt6) ((xt6) au2Var.f)).f;
            if (mo7Var instanceof wc3) {
                n26 n26Var = new n26(mo7Var, au2Var, b);
                ve8 ve8VarO = o();
                bf1 bf1VarK = h57.k(this);
                bf1VarK.getClass();
                pn5 pn5Var = new pn5(ve8VarO, n26Var, bf1VarK);
                wt3 wt3VarB = w86.a.b(yi4.class);
                String strC = wt3VarB.c();
                if (strC == null) {
                    hk0.g("Local and anonymous classes can not be ViewModels");
                    return;
                }
                jb3Var = (jb3) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
            } else if (mo7Var == null || (du6VarT = mo7Var.t()) == null || !du6VarT.p) {
                ye4.a.g("RcViewModelFactoryImpl", "Could not acquire M2MClientActivityViewModel because there was no session");
            } else {
                n26 n26Var2 = new n26(au2Var, mo7Var, (byte) 2);
                ve8 ve8VarO2 = o();
                bf1 bf1VarK2 = h57.k(this);
                bf1VarK2.getClass();
                pn5 pn5Var2 = new pn5(ve8VarO2, n26Var2, bf1VarK2);
                wt3 wt3VarB2 = w86.a.b(mz4.class);
                String strC2 = wt3VarB2.c();
                if (strC2 == null) {
                    hk0.g("Local and anonymous classes can not be ViewModels");
                    return;
                }
                jb3Var = (jb3) pn5Var2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
            }
        }
        this.V = jb3Var;
        if (jb3Var == null) {
            finish();
            return;
        }
        jb3Var.s0(this);
        this.P = new Handler(getMainLooper());
        getWindow().setSoftInputMode(18);
        setContentView(R.layout.m2m_activity_client);
        InstructionsOverlayView instructionsOverlayView = (InstructionsOverlayView) findViewById(R.id.m2m_instructions_overlay);
        this.T = instructionsOverlayView;
        this.N = instructionsOverlayView;
        M2MZoomView m2MZoomView = (M2MZoomView) findViewById(R.id.m2m_zoomview);
        this.S = m2MZoomView;
        if (m2MZoomView != null) {
            m2MZoomView.setTouchInterceptor(new nx3((Object) jb3Var, (byte) 14));
        }
        M2MControlView m2MControlView = (M2MControlView) findViewById(R.id.m2m_controlview);
        m2MControlView.setTouchInterceptor(this);
        bu7.MAIN.a(new ed((byte) 6));
        if (!jb3Var.c()) {
            ye4.c("M2MClientActivity", "onActivityCreated: no session running!");
            finish();
            return;
        }
        s7 s7Var = u7.g;
        vn4.g0().d = this;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setSystemUiVisibility(5894);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: o.ui4
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i) {
                if ((i & 4) != 0) {
                    int i2 = M2MClientActivity.h0;
                    return;
                }
                M2MClientActivity m2MClientActivity = this.a;
                Handler handler = m2MClientActivity.P;
                if (handler != null) {
                    handler.postDelayed(new si4(m2MClientActivity, (byte) 1), m2MClientActivity.Z);
                }
            }
        });
        final byte b2 = 0;
        byte b3 = 15;
        jb3Var.B0().observe(this, new b7(new Function1(this) { // from class: o.vi4
            public final /* synthetic */ M2MClientActivity n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b2;
                f88 f88Var = f88.a;
                jb3 jb3Var2 = jb3Var;
                M2MClientActivity m2MClientActivity = this.n;
                switch (b4) {
                    case 0:
                        nb3 nb3Var = (nb3) obj;
                        M2MZoomView m2MZoomView2 = m2MClientActivity.S;
                        if (m2MZoomView2 != null) {
                            m2MZoomView2.setZoomState(nb3Var);
                        }
                        Display defaultDisplay = m2MClientActivity.getWindowManager().getDefaultDisplay();
                        defaultDisplay.getClass();
                        jb3Var2.A0(defaultDisplay);
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        M2MZoomView m2MZoomView3 = m2MClientActivity.S;
                        if (m2MZoomView3 != null) {
                            bool.getClass();
                            m2MZoomView3.setVisibility(ka0.v(bool.booleanValue()));
                        }
                        Display defaultDisplay2 = m2MClientActivity.getWindowManager().getDefaultDisplay();
                        defaultDisplay2.getClass();
                        jb3Var2.A0(defaultDisplay2);
                        break;
                }
                return f88Var;
            }
        }, b3));
        jb3Var.h0().observe(this, new b7(new Function1(this) { // from class: o.vi4
            public final /* synthetic */ M2MClientActivity n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b;
                f88 f88Var = f88.a;
                jb3 jb3Var2 = jb3Var;
                M2MClientActivity m2MClientActivity = this.n;
                switch (b4) {
                    case 0:
                        nb3 nb3Var = (nb3) obj;
                        M2MZoomView m2MZoomView2 = m2MClientActivity.S;
                        if (m2MZoomView2 != null) {
                            m2MZoomView2.setZoomState(nb3Var);
                        }
                        Display defaultDisplay = m2MClientActivity.getWindowManager().getDefaultDisplay();
                        defaultDisplay.getClass();
                        jb3Var2.A0(defaultDisplay);
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        M2MZoomView m2MZoomView3 = m2MClientActivity.S;
                        if (m2MZoomView3 != null) {
                            bool.getClass();
                            m2MZoomView3.setVisibility(ka0.v(bool.booleanValue()));
                        }
                        Display defaultDisplay2 = m2MClientActivity.getWindowManager().getDefaultDisplay();
                        defaultDisplay2.getClass();
                        jb3Var2.A0(defaultDisplay2);
                        break;
                }
                return f88Var;
            }
        }, b3));
        this.R = findViewById(R.id.specialKeyboardContainer);
        ComposeView composeView = (ComposeView) findViewById(R.id.waiting_room);
        composeView.setContent(new yy0(-764470429, true, new gg4(this, b)));
        jb3Var.l().observe(this, new b7(new pi4(composeView, findViewById(R.id.clientlayout), 0 == true ? 1 : 0), b3));
        jb3Var.k().observe(this, new b7(new qi4(this, 0 == true ? 1 : 0), b3));
        jb3Var.K0();
        jb3Var.A().observe(this, new b7(new ew1(1, m2MControlView, M2MControlView.class, "setMiddleButtonEnabled", "setMiddleButtonEnabled(Z)V", 0, (byte) 25), b3));
        findViewById(R.id.clientlayout).getViewTreeObserver().addOnGlobalLayoutListener(new ri4(this, 0 == true ? 1 : 0));
        c().a(this, new r10((byte) 7, this, 0 == true ? 1 : 0));
        gp5 gp5Var = (gp5) this.f0.getValue();
        View viewFindViewById = findViewById(R.id.post_purchase_compose_view);
        viewFindViewById.getClass();
        gp5Var.c(bundle, (ComposeView) viewFindViewById);
        ye4.a("M2MClientActivity", "init done");
    }

    @Override // o.xt2, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ye4.a("M2MClientActivity", "onDestroy");
        jb3 jb3Var = this.V;
        if (jb3Var != null) {
            jb3Var.J(this);
        }
        jb3 jb3Var2 = this.V;
        if (jb3Var2 == null || jb3Var2.c() || !isFinishing()) {
            ye4.a("M2MClientActivity", "onDestroy(): Attempt to destroy session activity while session is running.");
            return;
        }
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        new r55(applicationContext).a(1, null);
        jb3 jb3Var3 = this.V;
        if (jb3Var3 != null) {
            jb3Var3.f();
        }
        ye4.a("M2MClientActivity", "onDestroy(): destroying session activity.");
        s7 s7Var = u7.g;
        vn4.g0().d = null;
        M2MSpecialKeyboard m2MSpecialKeyboard = (M2MSpecialKeyboard) findViewById(R.id.specialKeyboard);
        if (m2MSpecialKeyboard != null) {
            m2MSpecialKeyboard.setKeyboardListeners(null);
        }
        ClientViewOpenGL clientViewOpenGL = this.W;
        if (clientViewOpenGL != null) {
            clientViewOpenGL.setOnTouchListener(null);
            clientViewOpenGL.u = null;
            clientViewOpenGL.z = null;
            clientViewOpenGL.w = null;
            hm3.f(clientViewOpenGL.q, null);
            this.W = null;
        }
        KeyboardInputView keyboardInputView = (KeyboardInputView) findViewById(R.id.DummyKeyboardEdit);
        if (keyboardInputView != null) {
            keyboardInputView.setTVKeyboard(null);
        }
        if (keyboardInputView != null) {
            keyboardInputView.setTVKeyListener(null);
        }
        jb3 jb3Var4 = this.V;
        if (jb3Var4 != null) {
            jb3Var4.W();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        jb3 jb3Var = this.V;
        return (jb3Var != null && jb3Var.onKeyDown(i, keyEvent)) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        keyEvent.getClass();
        jb3 jb3Var = this.V;
        return jb3Var != null && jb3Var.onKeyMultiple(i, i2, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        jb3 jb3Var = this.V;
        return (jb3Var != null && jb3Var.onKeyUp(i, keyEvent)) || super.onKeyUp(i, keyEvent);
    }

    @Override // o.my0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        qf2 qf2VarH0;
        intent.getClass();
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("CLOSE_CURRENT_SESSION", false)) {
            ye4.a("M2MClientActivity", "will show dialog");
            jb3 jb3Var = this.V;
            if (jb3Var != null) {
                String stringExtra = intent.getStringExtra("KEY_ACCOUNTNAME");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                jb3Var.i(stringExtra, intent.getLongExtra("MEMBER_ID", 0L), intent.getBooleanExtra("IS_SHORTCUT", false), intent.getStringExtra("MDV2_MANAGEMENT_ID"), intent.getLongExtra("SHORTCUT_DYNGATE_ID", 0L));
            }
            this.Y = true;
        }
        if (intent.getBooleanExtra("extra_show_instructions_view", false)) {
            jb3 jb3Var2 = this.V;
            if ((jb3Var2 == null || (qf2VarH0 = jb3Var2.h0()) == null) ? false : im3.n(qf2VarH0.getValue(), Boolean.TRUE)) {
                O(false);
            }
        }
    }

    @Override // o.xt2, android.app.Activity
    public final void onPause() {
        InstructionsOverlayView instructionsOverlayView;
        super.onPause();
        jb3 jb3Var = this.V;
        if (jb3Var != null) {
            jb3Var.a();
        }
        J();
        if (this.U && (instructionsOverlayView = this.N) != null && instructionsOverlayView.u == lk3.n) {
            ((VideoView) instructionsOverlayView.findViewById(R.id.locked_video)).stopPlayback();
            ((VideoView) instructionsOverlayView.findViewById(R.id.unlocked_video)).stopPlayback();
        }
    }

    @Override // o.xt2, android.app.Activity
    public final void onResume() {
        InstructionsOverlayView instructionsOverlayView;
        super.onResume();
        jb3 jb3Var = this.V;
        if (jb3Var != null) {
            Window window = getWindow();
            window.getClass();
            jb3Var.h(window);
        }
        s7 s7Var = u7.g;
        vn4.g0().a(this);
        if (this.U && (instructionsOverlayView = this.N) != null && instructionsOverlayView.u == lk3.n) {
            instructionsOverlayView.a();
            ((VideoView) instructionsOverlayView.findViewById(R.id.locked_video)).start();
            ((VideoView) instructionsOverlayView.findViewById(R.id.unlocked_video)).start();
        }
        if (this.Y) {
            if (!isFinishing()) {
                x02 x02VarA = ik7.a();
                gk7 gk7Var = new gk7();
                fx3.o(1, "dialogId", x02VarA, gk7Var);
                gk7Var.Z0 = x02VarA;
                gk7Var.a1 = false;
                gk7Var.F0 = R.string.tv_close;
                gk7Var.H0 = R.string.tv_clientDialogNewConnectionText;
                gk7Var.K0 = R.string.tv_clientDialogOpenNewConnection;
                gk7Var.O0 = R.string.tv_clientDialogAbort;
                xk1 xk1Var = ct1.a;
                if (xk1Var != null) {
                    xk1.M(this.a0, new r02(gk7Var, p02.Positive));
                }
                if (xk1Var != null) {
                    xk1.M(this.c0, new r02(gk7Var, p02.Negative));
                }
                gk7.O0(gk7Var, this);
            }
            this.Y = false;
        }
    }

    @Override // o.my0, o.ly0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        ((gp5) this.f0.getValue()).b(bundle);
    }

    @Override // o.xt2, android.app.Activity
    public final void onStart() {
        super.onStart();
        s7 s7Var = u7.g;
        vn4.g0().b(this);
        jb3 jb3Var = this.V;
        if (jb3Var != null) {
            jb3Var.b();
        }
    }

    @Override // o.xt2, android.app.Activity
    public final void onStop() {
        super.onStop();
        ye4.a("M2MClientActivity", "onStop");
        s7 s7Var = u7.g;
        vn4.g0().c(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        Handler handler;
        if (!z || (handler = this.P) == null) {
            return;
        }
        handler.postDelayed(new si4(this, (byte) 0), 100L);
    }
}
