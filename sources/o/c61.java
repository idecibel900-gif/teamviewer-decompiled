package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class c61 {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public c61(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(n61 n61Var, k40 k40Var) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z;
        int baseline;
        int i;
        w51 w51Var = n61Var.J;
        w51 w51Var2 = n61Var.H;
        if (n61Var.f0 == 8) {
            k40Var.e = 0;
            k40Var.f = 0;
            k40Var.g = 0;
            return;
        }
        if (n61Var.S == null) {
            return;
        }
        my6 my6Var = ConstraintLayout.B;
        int i2 = k40Var.a;
        int i3 = k40Var.b;
        int i4 = k40Var.c;
        int i5 = k40Var.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = n61Var.e0;
        int iB = ua5.B(i2);
        if (iB == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iB == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (iB == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z2 = n61Var.r == 1;
            int i8 = k40Var.j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == n61Var.i();
                if (k40Var.j == 2 || !z2 || ((z2 && z3) || n61Var.y())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(n61Var.o(), 1073741824);
                }
            }
        } else if (iB != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.f;
            int i10 = w51Var2 != null ? w51Var2.g : 0;
            if (w51Var != null) {
                i10 += w51Var.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iB2 = ua5.B(i3);
        if (iB2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iB2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (iB2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = n61Var.s == 1;
            int i11 = k40Var.j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == n61Var.o();
                if (k40Var.j == 2 || !z4 || ((z4 && z5) || n61Var.z())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(n61Var.i(), 1073741824);
                }
            }
        } else if (iB2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.g;
            int i13 = w51Var2 != null ? n61Var.I.g : 0;
            if (w51Var != null) {
                i13 += n61Var.K.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        o61 o61Var = n61Var.S;
        ConstraintLayout constraintLayout = this.h;
        if (o61Var != null && mo8.l(constraintLayout.u, 256) && view.getMeasuredWidth() == n61Var.o() && view.getMeasuredWidth() < o61Var.o() && view.getMeasuredHeight() == n61Var.i() && view.getMeasuredHeight() < o61Var.i() && view.getBaseline() == n61Var.Z && !n61Var.x() && a(n61Var.F, iMakeMeasureSpec, n61Var.o()) && a(n61Var.G, iMakeMeasureSpec2, n61Var.i())) {
            k40Var.e = n61Var.o();
            k40Var.f = n61Var.i();
            k40Var.g = n61Var.Z;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && n61Var.V > 0.0f;
        boolean z11 = z7 && n61Var.V > 0.0f;
        if (view == null) {
            return;
        }
        b61 b61Var = (b61) view.getLayoutParams();
        int i14 = k40Var.j;
        if (i14 != 1 && i14 != 2 && z6 && n61Var.r == 0 && z7 && n61Var.s == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax2 = 0;
            iMax = 0;
        } else {
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            n61Var.F = iMakeMeasureSpec;
            n61Var.G = iMakeMeasureSpec2;
            n61Var.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = n61Var.u;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = n61Var.v;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = n61Var.x;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = n61Var.y;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!mo8.l(constraintLayout.u, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * n61Var.V) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / n61Var.V) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                n61Var.F = iMakeMeasureSpec;
                n61Var.G = iMakeMeasureSpec3;
                z = false;
                n61Var.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        k40Var.i = (iMax == k40Var.c && iMax2 == k40Var.d) ? z : true;
        boolean z13 = b61Var.c0 ? true : z12;
        if (z13 && baseline != -1 && n61Var.Z != baseline) {
            k40Var.i = true;
        }
        k40Var.e = iMax;
        k40Var.f = iMax2;
        k40Var.h = z13;
        k40Var.g = baseline;
    }
}
