package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class eu4 {
    public final a07 a = new a07(0);
    public final a07 b = new a07(0);

    public static eu4 a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static eu4 b(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception e) {
            io.sentry.android.core.v0.l("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static eu4 c(ArrayList arrayList) {
        eu4 eu4Var = new eu4();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                an4.i(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            eu4Var.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = lo.b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = lo.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = lo.d;
            }
            fu4 fu4Var = new fu4();
            fu4Var.d = 0;
            fu4Var.e = 1;
            fu4Var.a = startDelay;
            fu4Var.b = duration;
            fu4Var.c = interpolator;
            fu4Var.d = objectAnimator.getRepeatCount();
            fu4Var.e = objectAnimator.getRepeatMode();
            eu4Var.a.put(propertyName, fu4Var);
        }
        return eu4Var;
    }

    public final fu4 d(String str) {
        a07 a07Var = this.a;
        if (a07Var.get(str) != null) {
            return (fu4) a07Var.get(str);
        }
        yq4.f();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eu4) {
            return this.a.equals(((eu4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + eu4.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
