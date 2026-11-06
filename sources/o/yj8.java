package o;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class yj8 extends gk8 {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public nj3 f;

    public yj8() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // o.gk8
    public sk8 b() {
        a();
        sk8 sk8VarG = sk8.g(this.e, null);
        nj3[] nj3VarArr = this.b;
        pk8 pk8Var = sk8VarG.a;
        pk8Var.w(nj3VarArr);
        pk8Var.z(this.f);
        pk8Var.v(null);
        pk8Var.B(this.c);
        pk8Var.C(this.d);
        return sk8VarG;
    }

    @Override // o.gk8
    public void f(nj3 nj3Var) {
        this.f = nj3Var;
    }

    @Override // o.gk8
    public void h(nj3 nj3Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(nj3Var.a, nj3Var.b, nj3Var.c, nj3Var.d);
        }
    }

    public yj8(sk8 sk8Var) {
        super(sk8Var);
        this.e = sk8Var.f();
    }
}
