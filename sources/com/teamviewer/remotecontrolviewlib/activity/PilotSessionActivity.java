package com.teamviewer.remotecontrolviewlib.activity;

import android.bluetooth.BluetoothManager;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.CommonSessionWindowViewModelFactorySWIGJNI;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.ILeaveSessionViewModelSWIGJNI;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.IViewManagerViewModel;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.IViewManagerViewModelSWIGJNI;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.LeaveSessionViewModelNative;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.NativeLiveDataSessionData;
import com.teamviewer.remotecontrolviewlib.activity.PilotSessionActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import o.a7;
import o.a80;
import o.bu7;
import o.cj3;
import o.ed;
import o.ei7;
import o.fj3;
import o.hm3;
import o.im3;
import o.kh7;
import o.l07;
import o.my;
import o.n67;
import o.ns;
import o.pc0;
import o.r10;
import o.r47;
import o.r93;
import o.ri4;
import o.tk8;
import o.uk5;
import o.vk5;
import o.vk8;
import o.x67;
import o.x85;
import o.y70;
import o.yc4;
import o.yq4;
import o.yy0;

/* JADX INFO: loaded from: classes.dex */
public final class PilotSessionActivity extends ei7 {
    public static final /* synthetic */ int U = 0;
    public cj3 N;
    public int Q;
    public ns R;
    public boolean S;
    public final kh7 O = new kh7(new x85((byte) 11));
    public final Handler P = new Handler(Looper.getMainLooper());
    public final ri4 T = new ri4(this, 1);

    public final void J() {
        x67 tk8Var;
        Window window = getWindow();
        window.getClass();
        l07 l07Var = new l07(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            tk8Var = new vk8(window, l07Var, (byte) 1);
        } else {
            tk8Var = i >= 30 ? new tk8(window, l07Var, (byte) 1) : new tk8(window, l07Var, (byte) 0);
        }
        tk8Var.p();
        tk8Var.w();
        n67.r(window, false);
    }

    public final void K() {
        Object a80Var;
        if (this.R == null) {
            vk5 vk5Var = new vk5(this, (byte) 0);
            ns nsVar = new ns();
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                yc4 yc4Var = new yc4();
                yc4Var.m = vk5Var;
                yc4Var.n = (AudioManager) getSystemService("audio");
                Object systemService = getSystemService("bluetooth");
                systemService.getClass();
                BluetoothManager bluetoothManager = (BluetoothManager) systemService;
                yc4Var.f2598o = bluetoothManager;
                bluetoothManager.getAdapter().getProfileProxy(this, new y70(yc4Var, (byte) 0), 1);
                a80Var = yc4Var;
            } else {
                a80Var = new a80(this, vk5Var);
            }
            nsVar.b = a80Var;
            this.R = nsVar;
            IntentFilter intentFilter = new IntentFilter();
            if (i < 31) {
                intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            }
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            registerReceiver(nsVar, intentFilter);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        Object[] objArr = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_pilot_session, (ViewGroup) null, false);
        int i = R.id.bluetooth_headset_monitor;
        ComposeView composeView = (ComposeView) r47.s(viewInflate, R.id.bluetooth_headset_monitor);
        if (composeView != null) {
            i = R.id.pilot_session_fragment_container;
            if (((FrameLayout) r47.s(viewInflate, R.id.pilot_session_fragment_container)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.N = new cj3(constraintLayout, composeView, constraintLayout);
                setContentView(constraintLayout);
                this.Q = getIntent().getIntExtra("sessionId", 0);
                getWindow().addFlags(128);
                byte b = 6;
                bu7.MAIN.a(new ed(b));
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                }
                J();
                cj3 cj3Var = this.N;
                if (cj3Var == null) {
                    im3.e0("binding");
                    throw null;
                }
                ((ConstraintLayout) cj3Var.f531o).getViewTreeObserver().addOnGlobalLayoutListener(this.T);
                getWindow().getDecorView().getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: o.tk5
                    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                    public final void onWindowFocusChanged(boolean z2) {
                        int i3 = PilotSessionActivity.U;
                        if (z2) {
                            this.m.J();
                        }
                    }
                });
                if (!c().b) {
                    c().b(new r10((byte) 10, this, z));
                }
                AudioManager audioManager = (AudioManager) getSystemService("audio");
                if (audioManager != null) {
                    audioManager.setMode(3);
                    my.b(audioManager);
                }
                cj3 cj3Var2 = this.N;
                if (cj3Var2 == null) {
                    im3.e0("binding");
                    throw null;
                }
                ComposeView composeView2 = (ComposeView) cj3Var2.n;
                composeView2.setViewCompositionStrategy(new l07(this));
                composeView2.setContent(new yy0(1706416273, true, new uk5(this, objArr == true ? 1 : 0)));
                if (i2 <= 30 || hm3.h(this, "android.permission.BLUETOOTH_CONNECT") == 0) {
                    K();
                }
                Object value = this.O.getValue();
                value.getClass();
                IViewManagerViewModel iViewManagerViewModel = (IViewManagerViewModel) value;
                long jIViewManagerViewModel_GetSessionData = IViewManagerViewModelSWIGJNI.IViewManagerViewModel_GetSessionData(iViewManagerViewModel.a, iViewManagerViewModel);
                HashMap map = NativeLiveDataSessionData.d;
                WeakReference weakReference = (WeakReference) map.get(Long.valueOf(jIViewManagerViewModel_GetSessionData));
                NativeLiveDataSessionData nativeLiveDataSessionData = weakReference != null ? (NativeLiveDataSessionData) weakReference.get() : null;
                if (nativeLiveDataSessionData == null) {
                    nativeLiveDataSessionData = new NativeLiveDataSessionData(jIViewManagerViewModel_GetSessionData);
                    map.put(Long.valueOf(jIViewManagerViewModel_GetSessionData), new WeakReference(nativeLiveDataSessionData));
                }
                nativeLiveDataSessionData.observe(this, new a7(new fj3((Object) this, (byte) 21), b));
                return;
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.xr, o.xt2, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        cj3 cj3Var = this.N;
        LeaveSessionViewModelNative leaveSessionViewModelNative = null;
        if (cj3Var == null) {
            im3.e0("binding");
            throw null;
        }
        ((ConstraintLayout) cj3Var.f531o).getViewTreeObserver().removeOnGlobalLayoutListener(this.T);
        ns nsVar = this.R;
        if (nsVar != null) {
            ((r93) nsVar.b).d();
            unregisterReceiver(nsVar);
        }
        this.R = null;
        if (isFinishing()) {
            long jCommonSessionWindowViewModelFactory_GetLeaveSessionViewModel = CommonSessionWindowViewModelFactorySWIGJNI.CommonSessionWindowViewModelFactory_GetLeaveSessionViewModel(this.Q);
            if (jCommonSessionWindowViewModelFactory_GetLeaveSessionViewModel != 0) {
                leaveSessionViewModelNative = new LeaveSessionViewModelNative();
                leaveSessionViewModelNative.f63o = true;
                leaveSessionViewModelNative.n = jCommonSessionWindowViewModelFactory_GetLeaveSessionViewModel;
            }
            ILeaveSessionViewModelSWIGJNI.LeaveSessionViewModelNative_leaveSession(leaveSessionViewModelNative.n, leaveSessionViewModelNative);
            leaveSessionViewModelNative.V0();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z || this.S) {
            return;
        }
        this.P.postDelayed(new pc0((Object) this, (byte) 23), 100L);
    }
}
