package o;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Trace;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import com.journeyapps.barcodescanner.BarcodeView;
import com.teamviewer.byoclib.ByocAliasAccessActivity;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.ILoggedInOnlineStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.ILoggedInOnlineStateAwareContainerViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.PilotSessionActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.SessionSettingsActivity;
import com.teamviewer.remotecontrolviewlib.layout.ExpandablePanel;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.network.InterProcessGUIConnector;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc0 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ pc0(ik2 ik2Var, z08 z08Var) {
        this.m = (byte) 12;
        this.n = z08Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        RCClientActivity rCClientActivity;
        byte b = this.m;
        byte b2 = 2;
        Object obj = this.n;
        switch (b) {
            case 0:
                rc0 rc0Var = (rc0) obj;
                rc0Var.F0 = null;
                te4 te4Var = rc0Var.C0;
                if (te4Var == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                ILoggedInOnlineStateAwareContainerViewModel iLoggedInOnlineStateAwareContainerViewModel = te4Var.n;
                if (ILoggedInOnlineStateAwareContainerViewModelSWIGJNI.ILoggedInOnlineStateAwareContainerViewModel_ShowOnlineView(iLoggedInOnlineStateAwareContainerViewModel.a, iLoggedInOnlineStateAwareContainerViewModel)) {
                    return;
                }
                oq0 oq0VarU0 = rc0Var.U0(false);
                rc0Var.A0();
                rc0Var.I0(oq0VarU0, true);
                rc0Var.D0 = Boolean.FALSE;
                return;
            case 1:
                int i = ByocAliasAccessActivity.p;
                ((ByocAliasAccessActivity) obj).finish();
                return;
            case 2:
                ((BarcodeView) ((xc0) obj).n).e();
                return;
            case 3:
                ((vo0) obj).c.LoadMoreConversations(15);
                return;
            case 4:
                ye4.c("ClientViewOpenGL", (String) obj);
                return;
            case 5:
                ImageView mouseView = ((ClientViewOpenGL) ((vt0) obj).b).getMouseView();
                if (mouseView == null) {
                    ye4.c("ClientViewOpenGL", "render: mouseview is null");
                    return;
                } else {
                    mouseView.setVisibility(8);
                    return;
                }
            case 6:
                iy0 iy0Var = (iy0) obj;
                Runnable runnable = iy0Var.n;
                if (runnable != null) {
                    runnable.run();
                    iy0Var.n = null;
                    return;
                }
                return;
            case 7:
                py0.g((py0) obj);
                return;
            case 8:
                ExpandablePanel expandablePanel = (ExpandablePanel) obj;
                TextView textView = expandablePanel.m;
                int i2 = expandablePanel.f68o;
                if (textView == null) {
                    im3.e0("expandableText");
                    throw null;
                }
                int lineCount = textView.getLineCount();
                if (lineCount > i2) {
                    textView.setOnClickListener(new da(b2, lineCount, expandablePanel));
                }
                textView.setMaxLines(i2);
                return;
            case ep1.b /* 9 */:
                zg2 zg2Var = (zg2) obj;
                if (zg2Var.G0) {
                    zg2Var.G0 = false;
                    w10 w10Var = new w10(zg2Var.G());
                    w10Var.j(zg2Var);
                    w10Var.g(true, true);
                    zg2.H0 = null;
                    return;
                }
                return;
            case ep1.c /* 10 */:
                int i3 = ik2.W0;
                ((gk7) obj).N0();
                return;
            case 11:
                pk2 pk2Var = (pk2) obj;
                Window window = pk2Var.a.getWindow();
                if (window != null) {
                    pk2Var.b.showAtLocation(window.getDecorView(), 53, pk2Var.e, pk2Var.f);
                    return;
                }
                return;
            case ep1.d /* 12 */:
                z08 z08Var = (z08) obj;
                if (z08Var == null) {
                    return;
                }
                zg2 zg2Var2 = zg2.H0;
                if (zg2Var2 == null) {
                    zg2Var2 = new zg2();
                    zg2.H0 = zg2Var2;
                }
                zg2Var2.F0(0L, z08Var.c);
                return;
            case 13:
                ((FirebaseInstallations) obj).lambda$getId$1();
                return;
            case 14:
                xr2 xr2Var = (xr2) obj;
                synchronized (xr2Var.c) {
                    try {
                        if (xr2Var.g == null) {
                            return;
                        }
                        try {
                            ps2 ps2VarC = xr2Var.c();
                            int i4 = ps2VarC.f;
                            if (i4 == 2) {
                                synchronized (xr2Var.c) {
                                }
                            }
                            if (i4 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i4 + ")");
                            }
                            try {
                                Method method = r08.b;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context = xr2Var.a;
                                ps2[] ps2VarArr = {ps2VarC};
                                r47 r47Var = t58.a;
                                Trace.beginSection("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceN = t58.a.n(context, ps2VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferO = u47.o(xr2Var.a, ps2VarC.a);
                                    if (mappedByteBufferO == null || typefaceN == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        j93 j93Var = new j93(typefaceN, nv1.E(mappedByteBufferO));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (xr2Var.c) {
                                            try {
                                                zu1 zu1Var = xr2Var.g;
                                                if (zu1Var != null) {
                                                    zu1Var.G(j93Var);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        xr2Var.b();
                                        return;
                                    } catch (Throwable th2) {
                                        Method method2 = r08.b;
                                        Trace.endSection();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                Method method3 = r08.b;
                                Trace.endSection();
                                throw th4;
                            }
                            break;
                        } catch (Throwable th5) {
                            synchronized (xr2Var.c) {
                                try {
                                    zu1 zu1Var2 = xr2Var.g;
                                    if (zu1Var2 != null) {
                                        zu1Var2.F(th5);
                                    }
                                    xr2Var.b();
                                    return;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case 15:
                Iterator it = ((su2) obj).f2054o.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    io.sentry.h2.f();
                    return;
                }
                return;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                tf3 tf3Var = (tf3) obj;
                IInAppPurchaseViewModel iInAppPurchaseViewModel = tf3Var.n;
                boolean zIInAppPurchaseViewModel_IsAccountLoggedIn = IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_IsAccountLoggedIn(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel);
                boolean zIInAppPurchaseViewModel_DoesAccountNeedALicense = IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_DoesAccountNeedALicense(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel);
                if (zIInAppPurchaseViewModel_DoesAccountNeedALicense == tf3Var.s && zIInAppPurchaseViewModel_IsAccountLoggedIn == tf3Var.r) {
                    return;
                }
                tf3Var.s = zIInAppPurchaseViewModel_DoesAccountNeedALicense;
                tf3Var.r = zIInAppPurchaseViewModel_IsAccountLoggedIn;
                tf3Var.V0();
                return;
            case 17:
                zf3 zf3Var = (zf3) obj;
                if (zf3Var.O() && zf3Var.w0) {
                    List listQ = zf3Var.D().c.Q();
                    listQ.getClass();
                    if (listQ.isEmpty()) {
                        return;
                    }
                    su2 su2VarD = zf3Var.D();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("iap_login_complete", true);
                    su2VarD.e0("iap_login_complete", bundle);
                    zf3Var.w0 = false;
                    return;
                }
                return;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                bp3 bp3Var = (bp3) obj;
                if (bp3Var != null) {
                    bp3Var.j(null);
                    return;
                }
                return;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ei4 ei4Var = (ei4) obj;
                Semaphore semaphore = ei4Var.M;
                t01 t01Var = ei4Var.u;
                if (t01Var == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    t01Var.m(ei4Var.n.a());
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
            case 20:
                ((ki4) obj).c();
                return;
            case 21:
                fz4 fz4Var = (fz4) obj;
                ss6 ss6Var = fz4Var.d;
                if (ss6Var != null) {
                    ss6Var.h(ys6.m);
                }
                fz4Var.d = null;
                InterProcessGUIConnector.a.jniStopIgnoringCommands();
                return;
            case 22:
                pz4 pz4Var = (pz4) obj;
                if (im3.n(pz4Var.M.getValue(), Boolean.TRUE) || pz4Var.P || (weakReference = pz4Var.B) == null || (rCClientActivity = (RCClientActivity) weakReference.get()) == null) {
                    return;
                }
                rCClientActivity.I(pz4Var.v.a());
                return;
            case 23:
                PilotSessionActivity pilotSessionActivity = (PilotSessionActivity) obj;
                if (pilotSessionActivity.S) {
                    return;
                }
                pilotSessionActivity.J();
                return;
            case 24:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) obj;
                x84 x84Var = processLifecycleOwner.r;
                if (processLifecycleOwner.n == 0) {
                    processLifecycleOwner.f21o = true;
                    x84Var.d(l84.ON_PAUSE);
                }
                if (processLifecycleOwner.m == 0 && processLifecycleOwner.f21o) {
                    x84Var.d(l84.ON_STOP);
                    processLifecycleOwner.p = true;
                    return;
                }
                return;
            case 25:
                ((ha6) obj).v.b(EventType.EVENT_INPUT_DISABLED, he2.b);
                return;
            case 26:
                xd6.setRippleState$lambda$1((xd6) obj);
                return;
            case 27:
                ((RolloutsStateSubscriber) null).onRolloutsStateChanged((RolloutsState) obj);
                return;
            case 28:
                gk7 gk7Var = ((et6) obj).R;
                if (gk7Var != null) {
                    gk7Var.N0();
                    return;
                }
                return;
            default:
                uu6 uu6Var = (uu6) obj;
                uu6Var.p.c(false);
                SessionSettingsActivity sessionSettingsActivity = uu6Var.v;
                if (sessionSettingsActivity != null) {
                    if (sessionSettingsActivity.isFinishing()) {
                        ye4.c("SessionSettingsActivity", "skip show low memory warning - GUI not visible");
                        return;
                    }
                    x02 x02VarA = ik7.a();
                    gk7 gk7Var2 = new gk7();
                    fx3.o(1, "dialogId", x02VarA, gk7Var2);
                    gk7Var2.Z0 = x02VarA;
                    gk7Var2.a1 = true;
                    gk7Var2.F0 = R.string.tv_warningMessage_LowOnCaption;
                    gk7Var2.H0 = R.string.tv_warningMessage_LowOnMemoryInRemoteControlSession;
                    gk7Var2.O0 = R.string.tv_ok;
                    xk1 xk1Var = ct1.a;
                    if (xk1Var != null) {
                        xk1Var.L(gk7Var2);
                    }
                    gk7.O0(gk7Var2, sessionSettingsActivity);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ pc0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
