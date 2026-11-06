package o;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class of8 {
    public static final qf8 a;
    public static final om0 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new rf8();
        } else {
            a = new qf8();
        }
        b = new om0(Float.class, "translationAlpha", (byte) 6);
        new om0(Rect.class, "clipBounds", (byte) 7);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.r(view, i, i2, i3, i4);
    }
}
