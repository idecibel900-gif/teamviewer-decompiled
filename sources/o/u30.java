package o;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class u30 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ f40 n;

    public /* synthetic */ u30(f40 f40Var, byte b) {
        this.m = b;
        this.n = f40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        f40 f40Var = this.n;
        byte b2 = 1;
        byte b3 = 2;
        switch (b) {
            case 0:
                e40 e40Var = f40Var.c;
                if (e40Var != null) {
                    byte b4 = 0;
                    if (e40Var.getParent() != null) {
                        e40Var.setVisibility(0);
                    }
                    if (e40Var.getAnimationMode() != 1) {
                        int height = e40Var.getHeight();
                        ViewGroup.LayoutParams layoutParams = e40Var.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        e40Var.setTranslationY(height);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height, 0);
                        valueAnimator.setInterpolator(lo.b);
                        valueAnimator.setDuration(250L);
                        valueAnimator.addListener(new v30(f40Var, b3));
                        valueAnimator.addUpdateListener(new w30(f40Var, height));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(lo.a);
                        valueAnimatorOfFloat.addUpdateListener(new w30(f40Var, b4));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(lo.d);
                        valueAnimatorOfFloat2.addUpdateListener(new w30(f40Var, b2));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(150L);
                        animatorSet.addListener(new v30(f40Var, b4));
                        animatorSet.start();
                    }
                    break;
                }
                break;
            default:
                e40 e40Var2 = f40Var.c;
                if (e40Var2 != null) {
                    WindowManager windowManager = (WindowManager) f40Var.b.getSystemService("window");
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    int i = displayMetrics.heightPixels;
                    int[] iArr = new int[2];
                    e40Var2.getLocationOnScreen(iArr);
                    int height2 = (i - (e40Var2.getHeight() + iArr[1])) + ((int) e40Var2.getTranslationY());
                    if (height2 < f40Var.k) {
                        ViewGroup.LayoutParams layoutParams2 = e40Var2.getLayoutParams();
                        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                            io.sentry.android.core.v0.j(f40.p, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams.bottomMargin = (f40Var.k - height2) + marginLayoutParams.bottomMargin;
                            e40Var2.requestLayout();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
