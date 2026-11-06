package o;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class rj8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ xj8 a;
    public final /* synthetic */ sk8 b;
    public final /* synthetic */ sk8 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public rj8(xj8 xj8Var, sk8 sk8Var, sk8 sk8Var2, int i, View view) {
        this.a = xj8Var;
        this.b = sk8Var;
        this.c = sk8Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gk8 ak8Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        xj8 xj8Var = this.a;
        wj8 wj8Var = xj8Var.a;
        wj8Var.e(animatedFraction);
        float fC = wj8Var.c();
        PathInterpolator pathInterpolator = tj8.e;
        int i = Build.VERSION.SDK_INT;
        sk8 sk8Var = this.b;
        if (i >= 36) {
            ak8Var = new fk8(sk8Var);
        } else if (i >= 35) {
            ak8Var = new ek8(sk8Var);
        } else if (i >= 34) {
            ak8Var = new dk8(sk8Var);
        } else if (i >= 31) {
            ak8Var = new ck8(sk8Var);
        } else if (i >= 30) {
            ak8Var = new bk8(sk8Var);
        } else {
            ak8Var = i >= 29 ? new ak8(sk8Var) : new yj8(sk8Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            pk8 pk8Var = sk8Var.a;
            if (i3 == 0) {
                ak8Var.d(i2, pk8Var.i(i2));
            } else {
                nj3 nj3VarI = pk8Var.i(i2);
                nj3 nj3VarI2 = this.c.a.i(i2);
                float f = 1.0f - fC;
                ak8Var.d(i2, sk8.e(nj3VarI, (int) (((double) ((nj3VarI.a - nj3VarI2.a) * f)) + 0.5d), (int) (((double) ((nj3VarI.b - nj3VarI2.b) * f)) + 0.5d), (int) (((double) ((nj3VarI.c - nj3VarI2.c) * f)) + 0.5d), (int) (((double) ((nj3VarI.d - nj3VarI2.d) * f)) + 0.5d)));
            }
        }
        tj8.h(this.e, ak8Var.b(), Collections.singletonList(xj8Var));
    }
}
