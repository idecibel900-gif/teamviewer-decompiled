package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tj8 extends wj8 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final rh2 f = new rh2((byte) 0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, xj8 xj8Var) {
        uu0 uu0VarJ = j(view);
        if (uu0VarJ != null) {
            uu0VarJ.f(xj8Var);
            if (uu0VarJ.m == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), xj8Var);
            }
        }
    }

    public static void g(View view, xj8 xj8Var, sk8 sk8Var, boolean z) {
        uu0 uu0VarJ = j(view);
        if (uu0VarJ != null) {
            uu0VarJ.n = sk8Var;
            if (!z) {
                uu0VarJ.g(xj8Var);
                z = uu0VarJ.m == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), xj8Var, sk8Var, z);
            }
        }
    }

    public static void h(View view, sk8 sk8Var, List list) {
        uu0 uu0VarJ = j(view);
        if (uu0VarJ != null) {
            sk8Var = uu0VarJ.h(sk8Var, list);
            if (uu0VarJ.m == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), sk8Var, list);
            }
        }
    }

    public static void i(View view, xj8 xj8Var, lh7 lh7Var) {
        uu0 uu0VarJ = j(view);
        if (uu0VarJ != null) {
            uu0VarJ.i(xj8Var, lh7Var);
            if (uu0VarJ.m == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), xj8Var, lh7Var);
            }
        }
    }

    public static uu0 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof sj8) {
            return ((sj8) tag).a;
        }
        return null;
    }
}
