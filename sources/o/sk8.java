package o;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sk8 {
    public static final sk8 b;
    public final pk8 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = nk8.x;
        } else if (i >= 30) {
            b = lk8.w;
        } else {
            b = pk8.b;
        }
    }

    public sk8(sk8 sk8Var) {
        if (sk8Var == null) {
            this.a = new pk8(this);
            return;
        }
        pk8 pk8Var = sk8Var.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (pk8Var instanceof ok8)) {
            this.a = new ok8(this, (ok8) pk8Var);
        } else if (i >= 34 && (pk8Var instanceof nk8)) {
            this.a = new nk8(this, (nk8) pk8Var);
        } else if (i >= 31 && (pk8Var instanceof mk8)) {
            this.a = new mk8(this, (mk8) pk8Var);
        } else if (i >= 30 && (pk8Var instanceof lk8)) {
            this.a = new lk8(this, (lk8) pk8Var);
        } else if (i >= 29 && (pk8Var instanceof kk8)) {
            this.a = new kk8(this, (kk8) pk8Var);
        } else if (i >= 28 && (pk8Var instanceof jk8)) {
            this.a = new jk8(this, (jk8) pk8Var);
        } else if (pk8Var instanceof ik8) {
            this.a = new ik8(this, (ik8) pk8Var);
        } else if (pk8Var instanceof hk8) {
            this.a = new hk8(this, (hk8) pk8Var);
        } else {
            this.a = new pk8(this);
        }
        pk8Var.e(this);
    }

    public static nj3 e(nj3 nj3Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, nj3Var.a - i);
        int iMax2 = Math.max(0, nj3Var.b - i2);
        int iMax3 = Math.max(0, nj3Var.c - i3);
        int iMax4 = Math.max(0, nj3Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? nj3Var : nj3.b(iMax, iMax2, iMax3, iMax4);
    }

    public static sk8 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        sk8 sk8Var = new sk8(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = be8.a;
            sk8 sk8VarA = td8.a(view);
            pk8 pk8Var = sk8Var.a;
            pk8Var.y(sk8VarA);
            View rootView = view.getRootView();
            pk8Var.d(rootView);
            pk8Var.p(rootView);
            pk8Var.q();
            pk8Var.A(view.getWindowSystemUiVisibility());
        }
        return sk8Var;
    }

    public final int a() {
        return this.a.n().d;
    }

    public final int b() {
        return this.a.n().a;
    }

    public final int c() {
        return this.a.n().c;
    }

    public final int d() {
        return this.a.n().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sk8) {
            return Objects.equals(this.a, ((sk8) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        pk8 pk8Var = this.a;
        if (pk8Var instanceof hk8) {
            return ((hk8) pk8Var).c;
        }
        return null;
    }

    public final int hashCode() {
        pk8 pk8Var = this.a;
        if (pk8Var == null) {
            return 0;
        }
        return pk8Var.hashCode();
    }

    public sk8(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new ok8(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new nk8(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new mk8(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new lk8(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new kk8(this, windowInsets);
        } else if (i >= 28) {
            this.a = new jk8(this, windowInsets);
        } else {
            this.a = new ik8(this, windowInsets);
        }
    }
}
