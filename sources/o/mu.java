package o;

import android.content.Intent;
import com.teamviewer.activereviews.InAppReviewLauncher;
import com.teamviewer.outgoingsessionlib.swig.StreamType;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.swig.tvconfigadapter.CrashReportingConfigurationAdapter;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mu implements vd2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mu(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.vd2
    public final void a(EventType eventType, he2 he2Var) {
        Intent intent;
        qt0 qt0Var;
        byte b = this.a;
        k25 k25Var = k25.f1224o;
        Object obj = this.b;
        switch (b) {
            case 0:
                eventType.getClass();
                he2Var.getClass();
                ll2 ll2Var = (ll2) ((iu) obj).p;
                if (ll2Var != null) {
                    io.sentry.l6 l6Var = (io.sentry.l6) ll2Var.f1375o;
                    o93 o93Var = (o93) ll2Var.n;
                    boolean z = ll2Var.m;
                    l6Var.getClass();
                    ye4.a("AbstractNetworkControlMethod", "onAppStarted");
                    l6Var.b = o93Var;
                    l6Var.z(z);
                    return;
                }
                return;
            case 1:
                eventType.getClass();
                he2Var.getClass();
                float f = he2Var.f(EventParam.EP_SCALING_FACTOR_VALUE_OLD);
                float f2 = he2Var.f(EventParam.EP_SCALING_FACTOR_VALUE_NEW);
                l97 l97Var = (l97) ((iu) obj).p;
                vd5 vd5Var = new vd5(Float.valueOf(f), Float.valueOf(f2));
                l97Var.getClass();
                l97Var.l(null, vd5Var);
                return;
            case 2:
                eventType.getClass();
                he2Var.getClass();
                float f3 = he2Var.f(EventParam.EP_SCALING_FACTOR_VALUE_OLD);
                float f4 = he2Var.f(EventParam.EP_SCALING_FACTOR_VALUE_NEW);
                l97 l97Var2 = (l97) ((rc1) obj).p;
                vd5 vd5Var2 = new vd5(Float.valueOf(f3), Float.valueOf(f4));
                l97Var2.getClass();
                l97Var2.l(null, vd5Var2);
                return;
            case 3:
                ye1 ye1Var = (ye1) obj;
                eventType.getClass();
                he2Var.getClass();
                if (he2Var.e(EventParam.EP_ONLINE_STATE) == k25Var) {
                    ye1Var.f2601o.f(ye1Var.r);
                    kh7 kh7Var = ye1Var.s;
                    if (((CrashReportingConfigurationAdapter) kh7Var.getValue()) != null) {
                        ((CrashReportingConfigurationAdapter) kh7Var.getValue()).RegisterForConfig();
                        ((CrashReportingConfigurationAdapter) kh7Var.getValue()).AddSettingsChangeCallback(ye1Var.u);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                d11 d11Var = (d11) obj;
                eventType.getClass();
                he2Var.getClass();
                if (he2Var.e(EventParam.EP_ONLINE_STATE) == k25Var) {
                    d11Var.D();
                    return;
                }
                return;
            case 5:
                wf3 wf3Var = (wf3) obj;
                eventType.getClass();
                he2Var.getClass();
                if (wf3Var.e != null) {
                    wf3Var.e();
                }
                if (wf3Var.f != null) {
                    wf3Var.f();
                    return;
                }
                return;
            case 6:
                InAppReviewLauncher inAppReviewLauncher = (InAppReviewLauncher) obj;
                eventType.getClass();
                he2Var.getClass();
                inAppReviewLauncher.g = true;
                if (inAppReviewLauncher.f) {
                    inAppReviewLauncher.b();
                    return;
                }
                return;
            case 7:
                bd4 bd4Var = (bd4) obj;
                eventType.getClass();
                he2Var.getClass();
                String str = bd4Var.c;
                ct6 ct6Var = bd4Var.f;
                if (str != null && ct6Var != null) {
                    bd4Var.p(str, ct6Var);
                    return;
                } else {
                    bd4Var.c = null;
                    bd4Var.f = null;
                    return;
                }
            case 8:
                MainActivity mainActivity = (MainActivity) obj;
                int i = MainActivity.w0;
                eventType.getClass();
                he2Var.getClass();
                mainActivity.i(new Intent(mainActivity, (Class<?>) InAppPurchaseActivity.class));
                return;
            case ep1.b /* 9 */:
                bz4 bz4Var = (bz4) obj;
                eventType.getClass();
                he2Var.getClass();
                if (he2Var.h(EventParam.EP_SETTINGS_KEY).equals("INPUT_METHOD_INT")) {
                    int i2 = bz4Var.n.getInt("INPUT_METHOD_INT", 0);
                    IRemoteScreenViewModel iRemoteScreenViewModel = bz4Var.p;
                    IRemoteScreenViewModelSWIGJNI.IRemoteScreenViewModel_SetLocalCursorVisible(iRemoteScreenViewModel.a, iRemoteScreenViewModel, i2 == 0);
                    return;
                }
                return;
            case ep1.c /* 10 */:
                a65 a65Var = (a65) obj;
                eventType.getClass();
                he2Var.getClass();
                i41 i41Var = (i41) he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE);
                if ((i41Var == null ? -1 : ba6.a[i41Var.ordinal()]) == 1) {
                    mo7 mo7Var = ((zt6) ((xt6) a65Var.f302o)).f;
                    if (mo7Var == null) {
                        ye4.a("RemoteControlViewManager", "Received handshake response of already terminated session: ignoring.");
                        return;
                    }
                    ye4.a("RemoteControlViewManager", "Connect to partner successful. SessionID: " + mo7Var.w());
                    RemoteControlApplication remoteControlApplication = (RemoteControlApplication) a65Var.n;
                    if (ba6.b[mo7Var.p().ordinal()] == 1) {
                        if (it1.c == null) {
                            im3.e0("viewFactory");
                            throw null;
                        }
                        intent = new Intent(remoteControlApplication, (Class<?>) M2MClientActivity.class);
                    } else {
                        if (it1.c == null) {
                            im3.e0("viewFactory");
                            throw null;
                        }
                        intent = new Intent(remoteControlApplication, (Class<?>) RCClientActivity.class);
                    }
                    intent.addFlags(872415232);
                    remoteControlApplication.startActivity(intent);
                    mo7Var.n(i41.x);
                    return;
                }
                return;
            case 11:
                eu6 eu6Var = (eu6) obj;
                eventType.getClass();
                he2Var.getClass();
                if (StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE)) != StreamType.StreamType_Screen || (qt0Var = eu6Var.E) == null) {
                    return;
                }
                qt0Var.v = he2Var.g(EventParam.EPARAM_STREAM_ID);
                return;
            case ep1.d /* 12 */:
                eventType.getClass();
                he2Var.getClass();
                vu6 vu6Var = (vu6) ((ep3) obj).f733o;
                if (vu6Var != null) {
                    vu6Var.f();
                    return;
                }
                return;
            case 13:
                ni7 ni7Var = (ni7) obj;
                eventType.getClass();
                he2Var.getClass();
                if (eventType == EventType.EVENT_RESOLUTION_CHANGE) {
                    bu7.MAIN.a(new wu6(ni7Var, (byte) 4));
                    return;
                }
                ye4.a.g("TVChangeResolutionPreferenceViewModel", "Unexpected EventType " + eventType.name());
                return;
            default:
                eventType.getClass();
                he2Var.getClass();
                ho7 ho7Var = (ho7) ((ep3) obj).f733o;
                if (ho7Var != null) {
                    ho7Var.d();
                    return;
                }
                return;
        }
    }
}
