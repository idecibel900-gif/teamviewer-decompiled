package o;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class x72 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static y72 c;

    public static void a(my0 my0Var) {
        int i = 0;
        oh7 oh7Var = new oh7(0, 0, new vs6((byte) 16));
        oh7 oh7Var2 = new oh7(a, b, new vs6((byte) 16));
        View decorView = my0Var.getWindow().getDecorView();
        decorView.getClass();
        y72 z72Var = c;
        if (z72Var == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 35) {
                z72Var = new c82();
            } else if (i2 >= 30) {
                z72Var = new b82();
            } else if (i2 >= 29) {
                z72Var = new a82();
            } else {
                z72Var = i2 >= 28 ? new z72() : new y72();
            }
            c = z72Var;
        }
        y72 y72Var = z72Var;
        io.sentry.android.core.y2 y2Var = new io.sentry.android.core.y2(y72Var, oh7Var, oh7Var2, my0Var, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (i < viewGroup.getChildCount()) {
            int i3 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof y72) {
                y2Var.run();
                Window window = my0Var.getWindow();
                window.getClass();
                y72Var.a(window);
            }
            i = i3;
        }
        w72 w72Var = new w72(y2Var, viewGroup.getContext());
        w72Var.setTag(y72Var);
        w72Var.setVisibility(8);
        w72Var.setWillNotDraw(true);
        viewGroup.addView(w72Var);
        y2Var.run();
        Window window2 = my0Var.getWindow();
        window2.getClass();
        y72Var.a(window2);
    }
}
