package o;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class xj8 {
    public wj8 a;

    public xj8(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new vj8(zc8.i(i, interpolator, j));
        } else {
            this.a = new tj8(i, interpolator, j);
        }
    }

    public static void a(View view, uu0 uu0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(uu0Var != null ? new uj8(uu0Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = tj8.e;
        View.OnApplyWindowInsetsListener sj8Var = uu0Var != null ? new sj8(view, uu0Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, sj8Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(sj8Var);
        }
    }
}
