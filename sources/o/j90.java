package o;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class j90 extends u47 {
    public final /* synthetic */ BottomSheetBehavior b;

    public j90(BottomSheetBehavior bottomSheetBehavior) {
        this.b = bottomSheetBehavior;
    }

    @Override // o.u47
    public final int g(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.b;
        return bt1.q(i, bottomSheetBehavior.y(), bottomSheetBehavior.C ? bottomSheetBehavior.M : bottomSheetBehavior.A);
    }

    @Override // o.u47
    public final int n() {
        BottomSheetBehavior bottomSheetBehavior = this.b;
        return bottomSheetBehavior.C ? bottomSheetBehavior.M : bottomSheetBehavior.A;
    }

    @Override // o.u47
    public final void q(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.b;
            if (bottomSheetBehavior.E) {
                bottomSheetBehavior.C(1);
            }
        }
    }

    @Override // o.u47
    public final void r(View view, int i, int i2) {
        this.b.v(i2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // o.u47
    public final void s(View view, float f, float f2) {
        int iY;
        int i = 6;
        BottomSheetBehavior bottomSheetBehavior = this.b;
        if (f2 < 0.0f) {
            if (bottomSheetBehavior.b) {
                iY = bottomSheetBehavior.x;
            } else {
                int top = view.getTop();
                int i2 = bottomSheetBehavior.y;
                if (top > i2) {
                    iY = i2;
                } else {
                    iY = bottomSheetBehavior.y();
                }
            }
            i = 3;
        } else if (bottomSheetBehavior.C && bottomSheetBehavior.E(view, f2)) {
            if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                if (view.getTop() > (bottomSheetBehavior.y() + bottomSheetBehavior.M) / 2) {
                    iY = bottomSheetBehavior.M;
                    i = 5;
                } else {
                    if (bottomSheetBehavior.b) {
                        iY = bottomSheetBehavior.x;
                    } else if (Math.abs(view.getTop() - bottomSheetBehavior.y()) < Math.abs(view.getTop() - bottomSheetBehavior.y)) {
                        iY = bottomSheetBehavior.y();
                    } else {
                        iY = bottomSheetBehavior.y;
                    }
                    i = 3;
                }
            } else {
                iY = bottomSheetBehavior.M;
                i = 5;
            }
        } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.b) {
                int i3 = bottomSheetBehavior.y;
                if (top2 < i3) {
                    if (top2 < Math.abs(top2 - bottomSheetBehavior.A)) {
                        iY = bottomSheetBehavior.y();
                        i = 3;
                    } else {
                        iY = bottomSheetBehavior.y;
                    }
                } else if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.A)) {
                    iY = bottomSheetBehavior.y;
                } else {
                    iY = bottomSheetBehavior.A;
                    i = 4;
                }
            } else if (Math.abs(top2 - bottomSheetBehavior.x) < Math.abs(top2 - bottomSheetBehavior.A)) {
                iY = bottomSheetBehavior.x;
                i = 3;
            } else {
                iY = bottomSheetBehavior.A;
                i = 4;
            }
        } else {
            if (bottomSheetBehavior.b) {
                iY = bottomSheetBehavior.A;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.y) < Math.abs(top3 - bottomSheetBehavior.A)) {
                    iY = bottomSheetBehavior.y;
                } else {
                    iY = bottomSheetBehavior.A;
                }
            }
            i = 4;
        }
        bottomSheetBehavior.F(view, i, iY, true);
    }

    @Override // o.u47
    public final boolean v(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.b;
        int i2 = bottomSheetBehavior.F;
        if (i2 == 1 || bottomSheetBehavior.T) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.R == i) {
            WeakReference weakReference = bottomSheetBehavior.O;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = bottomSheetBehavior.N;
        return weakReference2 != null && weakReference2.get() == view;
    }
}
