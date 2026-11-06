package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class s46 implements a17 {
    public final View b;

    public s46(View view) {
        this.b = view;
    }

    public static j12 a(int i, int i2, int i3) {
        if (i == -2) {
            return h12.a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            g12.a(i4);
            return new g12(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        g12.a(i5);
        return new g12(i5);
    }

    public final w07 b() {
        View view = this.b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        j12 j12VarA = a(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (j12VarA == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        j12 j12VarA2 = a(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (j12VarA2 == null) {
            return null;
        }
        return new w07(j12VarA, j12VarA2);
    }

    @Override // o.a17
    public final Object e(hc1 hc1Var) {
        w07 w07VarB = b();
        if (w07VarB != null) {
            return w07VarB;
        }
        gl0 gl0Var = new gl0(1, vt1.A(hc1Var));
        gl0Var.t();
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        ff8 ff8Var = new ff8(this, viewTreeObserver, gl0Var);
        viewTreeObserver.addOnPreDrawListener(ff8Var);
        gl0Var.v(new h50(this, viewTreeObserver, ff8Var, (byte) 3));
        return gl0Var.q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s46) && im3.n(this.b, ((s46) obj).b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.b + ", subtractPadding=true)";
    }
}
