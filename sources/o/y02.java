package o;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y02 extends u0 implements f75 {
    public boolean A;
    public final Window v;
    public final bg5 w;
    public boolean x;
    public boolean y;
    public boolean z;

    public y02(Context context, Window window) {
        super(context, null);
        this.v = window;
        this.w = h57.p(pm8.b);
        WeakHashMap weakHashMap = be8.a;
        sd8.c(this, this);
        xj8.a(this, new tl(this, (byte) 1));
    }

    @Override // o.u0
    public final void a(int i, ux2 ux2Var) {
        ux2Var.Y(1735448596);
        int i2 = (ux2Var.h(this) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            ((hw2) this.w.getValue()).invoke(ux2Var, 0);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new t0((byte) 23, i, this);
        }
    }

    @Override // o.u0
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // o.u0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // o.u0
    public final void h(int i, int i2) {
        int iA;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.v;
        if (mode != Integer.MIN_VALUE || this.x || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.y) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iA = cq.a.a(window);
            } else if (i3 < 32) {
                iA = fq.a.a(window);
            } else {
                iA = size2;
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iA - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.y || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.x) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // o.f75
    public final sk8 t(View view, sk8 sk8Var) {
        if (!this.y) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return sk8Var.a.r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return sk8Var;
    }
}
