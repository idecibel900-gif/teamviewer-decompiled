package o;

import android.app.job.JobParameters;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.ImageDownload;
import com.teamviewer.commonresourcelib.swig.DefaultMessageViewModel;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.activity.SessionSettingsActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.ResponseCode;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be3 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f417o;

    public /* synthetic */ be3(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f417o = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [byte[], java.io.Serializable, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager;
        ArrayList arrayList;
        byte b = 3;
        switch (this.m) {
            case 0:
                ((ImageDownload) this.n).lambda$start$0((do7) this.f417o);
                return;
            case 1:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.n;
                JobParameters jobParameters = (JobParameters) this.f417o;
                int i = JobInfoSchedulerService.m;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 2:
                qf4 qf4Var = (qf4) this.n;
                zh7 zh7Var = (zh7) this.f417o;
                tg5 tg5Var = qf4Var.x;
                if (tg5Var != null) {
                    tg5Var.A0();
                }
                if (nv1.d == null) {
                    im3.e0("dialogFactory");
                    throw null;
                }
                ?? r7 = (byte[]) zh7Var.n;
                r7.getClass();
                x02 x02VarA = ik7.a();
                tg5 tg5Var2 = new tg5();
                tg5Var2.Z0 = x02VarA;
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("dialogId", x02VarA);
                bundle.putSerializable("challengeTupleData", r7);
                bundle.putInt("challengeTupleLength", r7.length);
                tg5Var2.u0(bundle);
                tg5Var2.a1 = true;
                tg5Var2.K0 = R.string.tv_ok;
                tg5Var2.O0 = R.string.tv_clientDialogAbort;
                xk1 xk1Var = ct1.a;
                if (xk1Var != null) {
                    xk1.M(qf4Var.z, new r02(tg5Var2, p02.Positive));
                }
                if (xk1Var != null) {
                    xk1.M(qf4Var.A, new r02(tg5Var2, p02.Negative));
                }
                if (xk1Var != null) {
                    xk1.M(qf4Var.A, new r02(tg5Var2, p02.Dismiss));
                }
                tg5Var2.N0();
                qf4Var.x = tg5Var2;
                return;
            case 3:
                nk4 nk4Var = (nk4) this.n;
                ax0 ax0Var = (ax0) this.f417o;
                if (((zt6) nk4Var.q).a.get() || ((zt6) nk4Var.q).b.get()) {
                    return;
                }
                Iterator it = nk4Var.E.iterator();
                while (it.hasNext()) {
                    ob3 ob3Var = (ob3) ((WeakReference) it.next()).get();
                    if (ob3Var != null) {
                        MainActivity mainActivity = (MainActivity) ob3Var;
                        if (nv1.d == null) {
                            im3.e0("dialogFactory");
                            throw null;
                        }
                        x02 x02VarA2 = ik7.a();
                        Bundle bundle2 = new Bundle(1);
                        bundle2.putParcelable("dialogId", x02VarA2);
                        bundle2.putParcelable("commentSessionSender", ax0Var);
                        ms6 ms6Var = new ms6();
                        ms6Var.u0(bundle2);
                        gk7.O0(ms6Var, mainActivity);
                    }
                }
                return;
            case 4:
                ((ao6) this.n).g((f85) this.f417o, f88.a);
                return;
            case 5:
                tg5 tg5Var3 = (tg5) this.n;
                EditText editText = (EditText) this.f417o;
                xt2 xt2VarC = tg5Var3.C();
                if (xt2VarC == null || (inputMethodManager = (InputMethodManager) xt2VarC.getSystemService(InputMethodManager.class)) == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    inputMethodManager.showSoftInput(editText, 0);
                    return;
                } else {
                    inputMethodManager.showSoftInput(editText, 2);
                    return;
                }
            case 6:
                dt5 dt5Var = (dt5) this.n;
                km8 km8Var = (km8) this.f417o;
                synchronized (dt5Var.k) {
                    arrayList = new ArrayList(dt5Var.j);
                    break;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((se2) it2.next()).e(km8Var, false);
                }
                return;
            case 7:
                ((EventHub) ((pn5) this.n).n).d(EventType.EVENT_SHOW_COMMERCIAL_USE, (he2) this.f417o);
                return;
            case 8:
                RemoteControlApplication remoteControlApplication = (RemoteControlApplication) this.n;
                we1 we1Var = (we1) this.f417o;
                int i2 = RemoteControlApplication.G;
                io.sentry.android.core.e2.b(remoteControlApplication, new io.sentry.android.core.x(b), new ar(we1Var, (byte) 23));
                return;
            case ep1.b /* 9 */:
                ((xs1) this.n).U((Typeface) this.f417o);
                return;
            case ep1.c /* 10 */:
                uu6 uu6Var = (uu6) this.n;
                String str = (String) this.f417o;
                if (uu6Var.s) {
                    return;
                }
                uu6Var.s = true;
                SessionSettingsActivity sessionSettingsActivity = uu6Var.v;
                if (sessionSettingsActivity != null) {
                    String string = uu6Var.n.getString(R.string.tv_connectionClosed, str);
                    string.getClass();
                    Context context = d82.M;
                    if (context != null) {
                        fx3.r(string, 1, context, bu7.MAIN);
                    } else {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    }
                    sessionSettingsActivity.finish();
                    return;
                }
                return;
            case 11:
                DefaultMessageViewModel defaultMessageViewModel = (DefaultMessageViewModel) this.n;
                xt2 xt2Var = (xt2) this.f417o;
                ye4.a("ShowDialogMessageDataCallback", "Message received. Showing dialog.");
                x02 x02VarA3 = ik7.a();
                gk7 gk7Var = new gk7();
                fx3.o(1, "dialogId", x02VarA3, gk7Var);
                gk7Var.Z0 = x02VarA3;
                String strGetTitle = defaultMessageViewModel.GetTitle();
                if (strGetTitle != null && strGetTitle.length() != 0) {
                    gk7Var.M0(strGetTitle);
                }
                gk7Var.L0(defaultMessageViewModel.GetText());
                gk7Var.O0 = R.string.tv_ok;
                gk7Var.a1 = true;
                gk7.O0(gk7Var, xt2Var);
                return;
            case ep1.d /* 12 */:
                String str2 = (String) this.n;
                qi7 qi7Var = (qi7) this.f417o;
                try {
                    ye4.a.e("Setting Android Clipboard2. new content length: %d", Integer.valueOf(str2 != null ? str2.length() : 0));
                    qi7Var.e = str2;
                    qi7Var.b.setPrimaryClip(ClipData.newPlainText("TVClipboard", str2));
                    return;
                } catch (NullPointerException unused) {
                    ye4.c("TVClipboard", "setText not possible because there's no clipboard service");
                    return;
                }
            case 13:
                xt2 xt2Var2 = (xt2) this.n;
                gk7 gk7Var2 = (gk7) this.f417o;
                try {
                    w10 w10Var = new w10(xt2Var2.D());
                    w10Var.h(0, gk7Var2, "tvdialog", 1);
                    w10Var.g(true, true);
                    return;
                } catch (IllegalStateException e) {
                    e41.s("show: ", e.getMessage(), "TVDialogFragment");
                    return;
                }
            case 14:
                xt2 xt2Var3 = (xt2) this.n;
                el7 el7Var = (el7) this.f417o;
                su2 su2VarD = xt2Var3.D();
                if (su2VarD.F("progressdialog") != null) {
                    ye4 ye4Var = ye4.a;
                    ye4Var.g("TVProgressDialogView", "Progress dialog not yet dismissed");
                    boolean zB = su2VarD.B(true);
                    su2VarD.G();
                    if (!zB) {
                        return;
                    }
                    ye4Var.g("TVProgressDialogView", "Executed pending transactions");
                    if (su2VarD.F("progressdialog") != null) {
                        return;
                    }
                }
                try {
                    el7Var.C0 = false;
                    el7Var.D0 = true;
                    w10 w10Var2 = new w10(su2VarD);
                    w10Var2.p = true;
                    w10Var2.h(0, el7Var, "progressdialog", 1);
                    if (w10Var2.g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    w10Var2.h = false;
                    w10Var2.r.C(w10Var2, false);
                    return;
                } catch (IllegalStateException unused2) {
                    ye4.c("TVProgressDialogView", "show: IllegalStateException caught");
                    return;
                }
            case 15:
                ((lh7) ((pn5) this.n).n).C((b97) this.f417o, 3);
                return;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                Runnable runnable = (Runnable) this.n;
                gs gsVar = (gs) this.f417o;
                try {
                    runnable.run();
                    return;
                } finally {
                    gsVar.a();
                }
            case 17:
                ResponseCode responseCode = (ResponseCode) this.n;
                r38 r38Var = (r38) this.f417o;
                int iOrdinal = responseCode.ordinal();
                if (iOrdinal == 0) {
                    Toast toastMakeText = Toast.makeText(r38Var.r0(), R.string.tv_trusted_device_authorize_device_success_text, 1);
                    toastMakeText.getClass();
                    toastMakeText.show();
                    return;
                }
                if (iOrdinal == 2) {
                    Toast toastMakeText2 = Toast.makeText(r38Var.r0(), R.string.tv_trusted_device_authorize_device_error_invalid_token_text, 1);
                    toastMakeText2.getClass();
                    toastMakeText2.show();
                    return;
                } else {
                    if (iOrdinal == 4) {
                        Toast toastMakeText3 = Toast.makeText(r38Var.r0(), R.string.tv_trusted_device_authorize_device_error_expired_token_text, 1);
                        toastMakeText3.getClass();
                        toastMakeText3.show();
                        return;
                    }
                    Toast toastMakeText4 = Toast.makeText(r38Var.r0(), R.string.tv_trusted_device_authorize_device_error_unexpected_text, 1);
                    toastMakeText4.getClass();
                    toastMakeText4.show();
                    ye4.c("TrustedDeviceRequestFragment", "Failed to add device. Error Code: " + ((int) responseCode.m));
                    return;
                }
            default:
                sn8 sn8Var = (sn8) this.n;
                x84 x84Var = (x84) this.f417o;
                if (sn8Var.f2036o) {
                    return;
                }
                sn8Var.p = x84Var;
                x84Var.a(sn8Var);
                return;
        }
    }
}
