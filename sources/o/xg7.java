package o;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xg7 extends u47 {
    public int b;
    public int c = -1;
    public final /* synthetic */ SwipeDismissBehavior d;

    public xg7(SwipeDismissBehavior swipeDismissBehavior) {
        this.d = swipeDismissBehavior;
    }

    @Override // o.u47
    public final int f(View view, int i) {
        int width;
        int width2;
        WeakHashMap weakHashMap = be8.a;
        boolean z = view.getLayoutDirection() == 1;
        byte b = this.d.d;
        if (b == 0) {
            width = this.b;
            if (z) {
                width -= view.getWidth();
                width2 = this.b;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i2 = this.b;
            if (b != 1) {
                width = i2 - view.getWidth();
                width2 = this.b + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i2;
                width = i2;
            } else {
                width = i2 - view.getWidth();
                width2 = this.b;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // o.u47
    public final int m(View view) {
        return view.getWidth();
    }

    @Override // o.u47
    public final void p(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // o.u47
    public final void q(int i) {
        y30 y30Var = this.d.b;
        if (y30Var != null) {
            a40 a40Var = y30Var.m.m;
            if (i == 0) {
                pn5.i().r(a40Var);
            } else if (i == 1 || i == 2) {
                pn5.i().p(a40Var);
            }
        }
    }

    @Override // o.u47
    public final void r(View view, int i, int i2) {
        float f = this.b;
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.d;
        float f2 = (width * swipeDismissBehavior.e) + f;
        float width2 = (view.getWidth() * swipeDismissBehavior.f) + this.b;
        float f3 = i;
        if (f3 <= f2) {
            view.setAlpha(1.0f);
        } else if (f3 >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f3 - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    @Override // o.u47
    public final void s(View view, float f, float f2) {
        int left;
        int i;
        int i2;
        y30 y30Var;
        this.c = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.d;
        if (f != 0.0f) {
            WeakHashMap weakHashMap = be8.a;
            boolean z2 = view.getLayoutDirection() == 1;
            byte b = swipeDismissBehavior.d;
            if (b != 2 && (b != 0 ? b != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i2 = this.b;
            } else {
                left = view.getLeft();
                i = this.b;
                if (left < i) {
                    i2 = i - width;
                } else {
                    i2 = i + width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.b) >= Math.round(view.getWidth() * 0.5f)) {
                left = view.getLeft();
                i = this.b;
                if (left < i) {
                    i2 = i - width;
                } else {
                    i2 = i + width;
                }
                z = true;
            } else {
                i2 = this.b;
            }
        }
        if (swipeDismissBehavior.a.o(i2, view.getTop())) {
            uq6 uq6Var = new uq6(swipeDismissBehavior, view, z);
            WeakHashMap weakHashMap2 = be8.a;
            view.postOnAnimation(uq6Var);
        } else {
            if (!z || (y30Var = swipeDismissBehavior.b) == null) {
                return;
            }
            y30Var.a(view);
        }
    }

    @Override // o.u47
    public final boolean v(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.d.s(view);
    }
}
