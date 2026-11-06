package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class it7 extends s18 {
    @Override // o.s18
    public final void c(d28 d28Var) {
        View view = d28Var.b;
        if (view instanceof TextView) {
            d28Var.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // o.s18
    public final void g(d28 d28Var) {
        View view = d28Var.b;
        if (view instanceof TextView) {
            d28Var.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // o.s18
    public final Animator k(ViewGroup viewGroup, d28 d28Var, d28 d28Var2) {
        if (d28Var == null || d28Var2 == null || !(d28Var.b instanceof TextView)) {
            return null;
        }
        View view = d28Var2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = d28Var.a;
        HashMap map2 = d28Var2.a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new rr(textView, (byte) 9));
        return valueAnimatorOfFloat;
    }
}
