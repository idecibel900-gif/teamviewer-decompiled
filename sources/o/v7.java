package o;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.remotecontrolviewlib.activity.LockScreenActivity;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class v7 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ v7(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    public final void a(Activity activity) {
        activity.getClass();
    }

    public final void b(Activity activity) {
        activity.getClass();
    }

    public final void c(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        switch (this.m) {
            case 1:
                yt2 yt2Var = (yt2) this.n;
                RemoteControlApplication remoteControlApplication = (RemoteControlApplication) yt2Var.f2642o;
                activity.getClass();
                if (it1.c == null) {
                    im3.e0("viewFactory");
                    throw null;
                }
                if (((LockManager) yt2Var.n).b() && (!LockScreenActivity.class.isAssignableFrom(activity.getClass()))) {
                    ye4.a("LockViewManager", "user needs authentication");
                    Intent intent = new Intent(remoteControlApplication, (Class<?>) LockScreenActivity.class);
                    intent.addFlags(268435456);
                    remoteControlApplication.startActivity(intent);
                    return;
                }
                return;
            default:
                a(activity);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        switch (this.m) {
            case 0:
                activity.getClass();
                ye4.a("ActivityManagerNew", "onActivityStarted " + activity);
                ae aeVar = (ae) this.n;
                if (!((LinkedHashSet) aeVar.d).remove(activity)) {
                    aeVar.m(aeVar.b + 1);
                }
                break;
            default:
                b(activity);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        switch (this.m) {
            case 0:
                activity.getClass();
                ye4.a("ActivityManagerNew", "onActivityStopped " + activity);
                ae aeVar = (ae) this.n;
                if (!activity.isChangingConfigurations() || !((LinkedHashSet) aeVar.d).add(activity)) {
                    aeVar.m(aeVar.b - 1);
                }
                break;
            default:
                c(activity);
                break;
        }
    }
}
