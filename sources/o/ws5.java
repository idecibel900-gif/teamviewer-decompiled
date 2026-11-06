package o;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class ws5 extends v92 {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public static final class a extends v92 {
        final /* synthetic */ ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i = processLifecycleOwner.m + 1;
            processLifecycleOwner.m = i;
            if (i == 1 && processLifecycleOwner.p) {
                processLifecycleOwner.r.d(l84.ON_START);
                processLifecycleOwner.p = false;
            }
        }
    }

    public ws5(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // o.v92, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = ya6.n;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((ya6) fragmentFindFragmentByTag).m = this.this$0.t;
        }
    }

    @Override // o.v92, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.n - 1;
        processLifecycleOwner.n = i;
        if (i == 0) {
            Handler handler = processLifecycleOwner.q;
            handler.getClass();
            handler.postDelayed(processLifecycleOwner.s, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        eq.t(activity, new a(this.this$0));
    }

    @Override // o.v92, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.m - 1;
        processLifecycleOwner.m = i;
        if (i == 0 && processLifecycleOwner.f21o) {
            processLifecycleOwner.r.d(l84.ON_STOP);
            processLifecycleOwner.p = true;
        }
    }
}
