package o;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class lo {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final rh2 b = new rh2((byte) 1);
    public static final rh2 c = new rh2((byte) 0);
    public static final rh2 d = new rh2(rh2.e);
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return ua5.c(f2, f, f3, f);
    }
}
