package com.teamviewer.activereviews;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.teamviewer.inappreviews.swig.IInAppReviewStatisticsViewModel;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvconfigadapter.ISessionDurationConditionHelper;
import com.teamviewer.teamviewerlib.swig.tvconfigadapter.SessionDurationConditionHelperFactory;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import io.sentry.android.core.v0;
import io.sentry.q7;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import o.cq8;
import o.cy8;
import o.do7;
import o.e41;
import o.gg3;
import o.gu8;
import o.h57;
import o.hr2;
import o.hy8;
import o.it1;
import o.lh7;
import o.lx8;
import o.mu;
import o.nd6;
import o.o41;
import o.ot6;
import o.ov8;
import o.u7;
import o.xt6;
import o.ye4;
import o.yt6;
import o.zt6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/teamviewer/activereviews/InAppReviewLauncher;", "", "Lo/yt6;", "sessionManagerListener", "Lo/yt6;", "getSessionManagerListener", "()Lo/yt6;", "InAppReviewsLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InAppReviewLauncher {
    public final u7 a;
    public final RemoteControlApplication b;
    public final SharedPreferences c;
    public final IInAppReviewStatisticsViewModel d;
    public final ISessionDurationConditionHelper e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final gg3 j;
    private final yt6 sessionManagerListener;

    public InAppReviewLauncher(xt6 xt6Var, EventHub eventHub, u7 u7Var, RemoteControlApplication remoteControlApplication, SharedPreferences sharedPreferences, IInAppReviewStatisticsViewModel iInAppReviewStatisticsViewModel) {
        u7Var.getClass();
        sharedPreferences.getClass();
        this.a = u7Var;
        this.b = remoteControlApplication;
        this.c = sharedPreferences;
        this.d = iInAppReviewStatisticsViewModel;
        ISessionDurationConditionHelper iSessionDurationConditionHelperCreate = SessionDurationConditionHelperFactory.Create();
        this.e = iSessionDurationConditionHelperCreate;
        gg3 gg3Var = new gg3(this);
        this.j = gg3Var;
        mu muVar = new mu(this, (byte) 6);
        ot6 ot6Var = new ot6(new o41(this, (byte) 1));
        ((zt6) xt6Var).n.a.add(new WeakReference(ot6Var));
        this.sessionManagerListener = ot6Var;
        if (!eventHub.c(EventType.EVENT_COMMENT_SESSION_ENDED, muVar)) {
            ye4.a.g("InAppReviewLauncher", "registering comment session ended listener failed");
        }
        iSessionDurationConditionHelperCreate.RegisterForConfigurationChanged(gg3Var);
    }

    public final String a() {
        RemoteControlApplication remoteControlApplication = this.b;
        PackageManager packageManager = remoteControlApplication.getPackageManager();
        try {
            packageManager.getClass();
            String packageName = remoteControlApplication.getPackageName();
            packageName.getClass();
            return it1.G(packageManager, packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            e41.s("Unable to get version for package ", remoteControlApplication.getPackageName(), "InAppReviewLauncher");
            return null;
        }
    }

    public final void b() {
        hy8 hy8VarI;
        String str;
        this.f = false;
        this.g = false;
        Context context = this.b;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        lh7 lh7Var = new lh7(new ov8(context));
        ov8 ov8Var = (ov8) lh7Var.n;
        String str2 = ov8Var.b;
        hr2 hr2Var = ov8.c;
        hr2Var.a("requestInAppReview (%s)", str2);
        cy8 cy8Var = ov8Var.a;
        if (cy8Var == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                v0.c("PlayCore", hr2.c(hr2Var.n, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap map = cq8.a;
            if (map.containsKey(-1)) {
                str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) cq8.b.get(-1)) + ")";
            } else {
                str = "";
            }
            hy8VarI = h57.i(new nd6(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
        } else {
            do7 do7Var = new do7();
            cy8Var.a().post(new lx8(cy8Var, do7Var, do7Var, new gu8(ov8Var, do7Var, do7Var)));
            hy8VarI = do7Var.a;
        }
        hy8VarI.c(new q7(this, lh7Var, (byte) 19));
    }
}
