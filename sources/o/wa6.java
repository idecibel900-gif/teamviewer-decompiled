package o;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public abstract class wa6 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, l84 l84Var) {
        l84Var.getClass();
        if (activity instanceof LifecycleOwner) {
            x84 x84VarZ = ((LifecycleOwner) activity).z();
            if (x84VarZ instanceof x84) {
                x84VarZ.d(l84Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            ya6.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new ya6.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ya6(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
