package o;

import android.animation.ValueAnimator;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class w30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f40 b;

    public w30(f40 f40Var, int i) {
        this.a = (byte) 2;
        this.b = f40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        f40 f40Var = this.b;
        switch (b) {
            case 0:
                f40Var.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var = f40Var.c;
                e40Var.setScaleX(fFloatValue);
                e40Var.setScaleY(fFloatValue);
                break;
            case 2:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Handler handler = f40.n;
                f40Var.c.setTranslationY(iIntValue);
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Handler handler2 = f40.n;
                f40Var.c.setTranslationY(iIntValue2);
                break;
        }
    }

    public /* synthetic */ w30(f40 f40Var, byte b) {
        this.a = b;
        this.b = f40Var;
    }
}
