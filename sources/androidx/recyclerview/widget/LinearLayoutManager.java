package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import o.a4;
import o.c76;
import o.d66;
import o.fx3;
import o.g4;
import o.hk0;
import o.l66;
import o.m66;
import o.rr0;
import o.s66;
import o.us1;
import o.vy1;
import o.w94;
import o.x66;
import o.x94;
import o.y66;
import o.y94;
import o.z94;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends a implements x66 {
    public int B;
    public y94 C;
    public vy1 D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public int J;
    public int K;
    public z94 L;
    public final w94 M;
    public final x94 N;
    public final byte O;
    public final int[] P;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.B = 1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = true;
        this.J = -1;
        this.K = Integer.MIN_VALUE;
        this.L = null;
        this.M = new w94();
        this.N = new x94();
        this.O = (byte) 2;
        this.P = new int[2];
        l66 l66VarP = a.P(context, attributeSet, i, i2);
        j1(l66VarP.a);
        boolean z = l66VarP.c;
        m(null);
        if (z != this.F) {
            this.F = z;
            x0();
        }
        k1(l66VarP.d);
    }

    @Override // androidx.recyclerview.widget.a
    public int A0(int i, s66 s66Var, y66 y66Var) {
        if (this.B == 0) {
            return 0;
        }
        return i1(i, s66Var, y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final View B(int i) {
        int iG = G();
        if (iG == 0) {
            return null;
        }
        int iO = i - a.O(F(0));
        if (iO >= 0 && iO < iG) {
            View viewF = F(iO);
            if (a.O(viewF) == i) {
                return viewF;
            }
        }
        return super.B(i);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean H0() {
        if (this.y != 1073741824 && this.x != 1073741824) {
            int iG = G();
            for (int i = 0; i < iG; i++) {
                ViewGroup.LayoutParams layoutParams = F(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public boolean L0() {
        return this.L == null && this.E == this.H;
    }

    public void M0(y66 y66Var, y94 y94Var, rr0 rr0Var) {
        int i = y94Var.d;
        if (i < 0 || i >= y66Var.b()) {
            return;
        }
        rr0Var.c(i, Math.max(0, y94Var.g));
    }

    public final int N0(y66 y66Var) {
        if (G() == 0) {
            return 0;
        }
        R0();
        vy1 vy1Var = this.D;
        boolean z = !this.I;
        return us1.s(y66Var, vy1Var, U0(z), T0(z), this, this.I);
    }

    public final int O0(y66 y66Var) {
        if (G() == 0) {
            return 0;
        }
        R0();
        vy1 vy1Var = this.D;
        boolean z = !this.I;
        return us1.t(y66Var, vy1Var, U0(z), T0(z), this, this.I, this.G);
    }

    public final int P0(y66 y66Var) {
        if (G() == 0) {
            return 0;
        }
        R0();
        vy1 vy1Var = this.D;
        boolean z = !this.I;
        return us1.u(y66Var, vy1Var, U0(z), T0(z), this, this.I);
    }

    public final int Q0(int i) {
        if (i == 1) {
            return (this.B != 1 && c1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.B != 1 && c1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.B == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.B == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.B == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.B == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void R0() {
        if (this.C == null) {
            y94 y94Var = new y94();
            y94Var.a = true;
            y94Var.h = 0;
            y94Var.i = 0;
            y94Var.k = null;
            this.C = y94Var;
        }
    }

    public final int S0(s66 s66Var, y94 y94Var, y66 y66Var, boolean z) {
        int i;
        int i2 = y94Var.c;
        int i3 = y94Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                y94Var.g = i3 + i2;
            }
            f1(s66Var, y94Var);
        }
        int i4 = y94Var.c + y94Var.h;
        while (true) {
            if ((!y94Var.l && i4 <= 0) || (i = y94Var.d) < 0 || i >= y66Var.b()) {
                break;
            }
            x94 x94Var = this.N;
            x94Var.a = 0;
            x94Var.b = false;
            x94Var.c = false;
            x94Var.d = false;
            d1(s66Var, y66Var, y94Var, x94Var);
            if (!x94Var.b) {
                int i5 = y94Var.b;
                int i6 = x94Var.a;
                y94Var.b = (y94Var.f * i6) + i5;
                if (!x94Var.c || y94Var.k != null || !y66Var.g) {
                    y94Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = y94Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    y94Var.g = i8;
                    int i9 = y94Var.c;
                    if (i9 < 0) {
                        y94Var.g = i8 + i9;
                    }
                    f1(s66Var, y94Var);
                }
                if (z && x94Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - y94Var.c;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean T() {
        return this.F;
    }

    public final View T0(boolean z) {
        return this.G ? W0(0, G(), z, true) : W0(G() - 1, -1, z, true);
    }

    public final View U0(boolean z) {
        return this.G ? W0(G() - 1, -1, z, true) : W0(0, G(), z, true);
    }

    public final View V0(int i, int i2) {
        int i3;
        int i4;
        R0();
        if (i2 <= i && i2 >= i) {
            return F(i);
        }
        if (this.D.g(F(i)) < this.D.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.B == 0 ? this.f24o.o(i, i2, i3, i4) : this.p.o(i, i2, i3, i4);
    }

    public final View W0(int i, int i2, boolean z, boolean z2) {
        R0();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.B == 0 ? this.f24o.o(i, i2, i3, i4) : this.p.o(i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View X0(s66 s66Var, y66 y66Var, boolean z, boolean z2) {
        int i;
        int iG;
        int i2;
        R0();
        int iG2 = G();
        if (z2) {
            iG = G() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iG2;
            iG = 0;
            i2 = 1;
        }
        int iB = y66Var.b();
        int iM = this.D.m();
        int i3 = this.D.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iG != i) {
            View viewF = F(iG);
            int iO = a.O(viewF);
            int iG3 = this.D.g(viewF);
            int iD = this.D.d(viewF);
            if (iO >= 0 && iO < iB) {
                if (!((m66) viewF.getLayoutParams()).m.i()) {
                    boolean z3 = iD <= iM && iG3 < iM;
                    boolean z4 = iG3 >= i3 && iD > i3;
                    if (!z3 && !z4) {
                        return viewF;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewF;
                        } else if (view == null) {
                            view = viewF;
                        }
                    } else if (z3) {
                        view2 = viewF;
                    } else if (view == null) {
                        view = viewF;
                    }
                } else if (view3 == null) {
                    view3 = viewF;
                }
            }
            iG += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final int Y0(int i, s66 s66Var, y66 y66Var, boolean z) {
        int i2;
        int i3 = this.D.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -i1(-i3, s66Var, y66Var);
        int i5 = i + i4;
        if (!z || (i2 = this.D.i() - i5) <= 0) {
            return i4;
        }
        this.D.r(i2);
        return i2 + i4;
    }

    public final int Z0(int i, s66 s66Var, y66 y66Var, boolean z) {
        int iM;
        int iM2 = i - this.D.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -i1(iM2, s66Var, y66Var);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.D.m()) <= 0) {
            return i2;
        }
        this.D.r(-iM);
        return i2 - iM;
    }

    @Override // o.x66
    public final PointF a(int i) {
        if (G() == 0) {
            return null;
        }
        int i2 = (i < a.O(F(0))) != this.G ? -1 : 1;
        return this.B == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final View a1() {
        return F(this.G ? 0 : G() - 1);
    }

    @Override // androidx.recyclerview.widget.a
    public View b0(View view, int i, s66 s66Var, y66 y66Var) {
        int iQ0;
        View viewV0;
        h1();
        if (G() != 0 && (iQ0 = Q0(i)) != Integer.MIN_VALUE) {
            R0();
            l1(iQ0, (int) (this.D.n() * 0.33333334f), false, y66Var);
            y94 y94Var = this.C;
            y94Var.g = Integer.MIN_VALUE;
            y94Var.a = false;
            S0(s66Var, y94Var, y66Var, true);
            boolean z = this.G;
            if (iQ0 == -1) {
                viewV0 = z ? V0(G() - 1, -1) : V0(0, G());
            } else {
                viewV0 = z ? V0(0, G()) : V0(G() - 1, -1);
            }
            View viewB1 = iQ0 == -1 ? b1() : a1();
            if (!viewB1.hasFocusable()) {
                return viewV0;
            }
            if (viewV0 != null) {
                return viewB1;
            }
        }
        return null;
    }

    public final View b1() {
        return F(this.G ? G() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.a
    public final void c0(AccessibilityEvent accessibilityEvent) {
        super.c0(accessibilityEvent);
        if (G() > 0) {
            View viewW0 = W0(0, G(), false, true);
            accessibilityEvent.setFromIndex(viewW0 == null ? -1 : a.O(viewW0));
            View viewW1 = W0(G() - 1, -1, false, true);
            accessibilityEvent.setToIndex(viewW1 != null ? a.O(viewW1) : -1);
        }
    }

    public final boolean c1() {
        return this.n.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public void d0(s66 s66Var, y66 y66Var, g4 g4Var) {
        super.d0(s66Var, y66Var, g4Var);
        d66 d66Var = this.n.y;
        if (d66Var == null || d66Var.a() <= 0) {
            return;
        }
        g4Var.b(a4.m);
    }

    public void d1(s66 s66Var, y66 y66Var, y94 y94Var, x94 x94Var) {
        int i;
        int iF;
        int i2;
        int iF2;
        View viewB = y94Var.b(s66Var);
        if (viewB == null) {
            x94Var.b = true;
            return;
        }
        m66 m66Var = (m66) viewB.getLayoutParams();
        List list = y94Var.k;
        boolean z = this.G;
        int i3 = y94Var.f;
        if (list == null) {
            if (z == (i3 == -1)) {
                l(viewB, -1, false);
            } else {
                l(viewB, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                l(viewB, -1, true);
            } else {
                l(viewB, 0, true);
            }
        }
        m66 m66Var2 = (m66) viewB.getLayoutParams();
        Rect rectO = this.n.O(viewB);
        int i4 = rectO.left + rectO.right;
        int i5 = rectO.top + rectO.bottom;
        int iH = a.H(o(), this.z, this.x, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) m66Var2).leftMargin + ((ViewGroup.MarginLayoutParams) m66Var2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) m66Var2).width);
        int iH2 = a.H(p(), this.A, this.y, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) m66Var2).topMargin + ((ViewGroup.MarginLayoutParams) m66Var2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) m66Var2).height);
        if (G0(viewB, iH, iH2, m66Var2)) {
            viewB.measure(iH, iH2);
        }
        x94Var.a = this.D.e(viewB);
        if (this.B == 1) {
            if (c1()) {
                iF2 = this.z - getPaddingRight();
                iF = iF2 - this.D.f(viewB);
            } else {
                int paddingLeft = getPaddingLeft();
                iF2 = this.D.f(viewB) + paddingLeft;
                iF = paddingLeft;
            }
            int i6 = y94Var.f;
            i2 = y94Var.b;
            int i7 = x94Var.a;
            if (i6 == -1) {
                int i8 = i2 - i7;
                i = i2;
                i2 = i8;
            } else {
                i = i7 + i2;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iF3 = this.D.f(viewB) + paddingTop;
            int i9 = y94Var.f;
            int i10 = y94Var.b;
            int i11 = x94Var.a;
            if (i9 == -1) {
                int i12 = i10 - i11;
                iF2 = i10;
                i2 = paddingTop;
                i = iF3;
                iF = i12;
            } else {
                int i13 = i10 + i11;
                i = iF3;
                iF = i10;
                i2 = paddingTop;
                iF2 = i13;
            }
        }
        a.V(viewB, iF, i2, iF2, i);
        if (m66Var.m.i() || m66Var.m.l()) {
            x94Var.c = true;
        }
        x94Var.d = viewB.hasFocusable();
    }

    public void e1(s66 s66Var, y66 y66Var, w94 w94Var, int i) {
    }

    public final void f1(s66 s66Var, y94 y94Var) {
        if (!y94Var.a || y94Var.l) {
            return;
        }
        int i = y94Var.g;
        int i2 = y94Var.i;
        if (y94Var.f == -1) {
            int iG = G();
            if (i < 0) {
                return;
            }
            int iH = (this.D.h() - i) + i2;
            if (this.G) {
                for (int i3 = 0; i3 < iG; i3++) {
                    View viewF = F(i3);
                    if (this.D.g(viewF) < iH || this.D.q(viewF) < iH) {
                        g1(s66Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iG - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewF2 = F(i5);
                if (this.D.g(viewF2) < iH || this.D.q(viewF2) < iH) {
                    g1(s66Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iG2 = G();
        if (!this.G) {
            for (int i7 = 0; i7 < iG2; i7++) {
                View viewF3 = F(i7);
                if (this.D.d(viewF3) > i6 || this.D.p(viewF3) > i6) {
                    g1(s66Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iG2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewF4 = F(i9);
            if (this.D.d(viewF4) > i6 || this.D.p(viewF4) > i6) {
                g1(s66Var, i8, i9);
                return;
            }
        }
    }

    public final void g1(s66 s66Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewF = F(i);
                if (F(i) != null) {
                    this.m.m(i);
                }
                s66Var.h(viewF);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewF2 = F(i3);
            if (F(i3) != null) {
                this.m.m(i3);
            }
            s66Var.h(viewF2);
        }
    }

    public final void h1() {
        if (this.B == 1 || !c1()) {
            this.G = this.F;
        } else {
            this.G = !this.F;
        }
    }

    public final int i1(int i, s66 s66Var, y66 y66Var) {
        if (G() != 0 && i != 0) {
            R0();
            this.C.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            l1(i2, iAbs, true, y66Var);
            y94 y94Var = this.C;
            int iS0 = S0(s66Var, y94Var, y66Var, false) + y94Var.g;
            if (iS0 >= 0) {
                if (iAbs > iS0) {
                    i = i2 * iS0;
                }
                this.D.r(-i);
                this.C.j = i;
                return i;
            }
        }
        return 0;
    }

    public final void j1(int i) {
        if (i != 0 && i != 1) {
            hk0.g(fx3.e(i, "invalid orientation:"));
            return;
        }
        m(null);
        if (i != this.B || this.D == null) {
            vy1 vy1VarB = vy1.b(this, i);
            this.D = vy1VarB;
            this.M.a = vy1VarB;
            this.B = i;
            x0();
        }
    }

    public void k1(boolean z) {
        m(null);
        if (this.H == z) {
            return;
        }
        this.H = z;
        x0();
    }

    public final void l1(int i, int i2, boolean z, y66 y66Var) {
        int i3;
        int iM;
        this.C.l = this.D.k() == 0 && this.D.h() == 0;
        this.C.f = i;
        int[] iArr = this.P;
        iArr[0] = 0;
        iArr[1] = 0;
        int iN = y66Var.a != -1 ? this.D.n() : 0;
        if (this.C.f == -1) {
            i3 = 0;
        } else {
            i3 = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i3;
        int iMax = Math.max(0, iN);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        y94 y94Var = this.C;
        int i4 = z2 ? iMax2 : iMax;
        y94Var.h = i4;
        if (!z2) {
            iMax = iMax2;
        }
        y94Var.i = iMax;
        if (z2) {
            y94Var.h = this.D.j() + i4;
            View viewA1 = a1();
            y94 y94Var2 = this.C;
            y94Var2.e = this.G ? -1 : 1;
            int iO = a.O(viewA1);
            y94 y94Var3 = this.C;
            y94Var2.d = iO + y94Var3.e;
            y94Var3.b = this.D.d(viewA1);
            iM = this.D.d(viewA1) - this.D.i();
        } else {
            View viewB1 = b1();
            y94 y94Var4 = this.C;
            y94Var4.h = this.D.m() + y94Var4.h;
            y94 y94Var5 = this.C;
            y94Var5.e = this.G ? 1 : -1;
            int iO2 = a.O(viewB1);
            y94 y94Var6 = this.C;
            y94Var5.d = iO2 + y94Var6.e;
            y94Var6.b = this.D.g(viewB1);
            iM = (-this.D.g(viewB1)) + this.D.m();
        }
        y94 y94Var7 = this.C;
        y94Var7.c = i2;
        if (z) {
            y94Var7.c = i2 - iM;
        }
        y94Var7.g = iM;
    }

    @Override // androidx.recyclerview.widget.a
    public final void m(String str) {
        if (this.L == null) {
            super.m(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019d  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:122:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0220  */
    /* JADX WARN: Code duplicated, block: B:126:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0227  */
    /* JADX WARN: Code duplicated, block: B:130:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x022c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0230  */
    /* JADX WARN: Code duplicated, block: B:135:0x0234  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0241  */
    /* JADX WARN: Code duplicated, block: B:91:0x0183  */
    /* JADX WARN: Code duplicated, block: B:98:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.a
    public void m0(s66 s66Var, y66 y66Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewX0;
        boolean z3;
        vy1 vy1Var;
        int iG;
        int iD;
        int iM;
        int i;
        boolean z4;
        boolean z5;
        m66 m66Var;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r4;
        List list;
        int i6;
        int i7;
        int iY0;
        int i8;
        View viewB;
        int iG2;
        int i9;
        int i10;
        int i11 = -1;
        if (!(this.L == null && this.J == -1) && y66Var.b() == 0) {
            t0(s66Var);
            return;
        }
        z94 z94Var = this.L;
        if (z94Var != null && (i10 = z94Var.m) >= 0) {
            this.J = i10;
        }
        R0();
        boolean z6 = false;
        this.C.a = false;
        h1();
        RecyclerView recyclerView2 = this.n;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.m.e).contains(focusedChild)) {
            focusedChild = null;
        }
        w94 w94Var = this.M;
        if (!w94Var.e || this.J != -1 || this.L != null) {
            w94Var.c();
            w94Var.d = this.G ^ this.H;
            if (y66Var.g || (i2 = this.J) == -1) {
                if (G() != 0) {
                    recyclerView = this.n;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.m.e).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        m66Var = (m66) focusedChild2.getLayoutParams();
                        if (!m66Var.m.i() || m66Var.m.c() < 0 || m66Var.m.c() >= y66Var.b()) {
                            z = this.E;
                            z2 = this.H;
                            if (z == z2 || (viewX0 = X0(s66Var, y66Var, w94Var.d, z2)) == null) {
                                w94Var.a();
                                if (this.H) {
                                    iB = y66Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                w94Var.b = iB;
                            } else {
                                int iO = a.O(viewX0);
                                z3 = w94Var.d;
                                vy1Var = w94Var.a;
                                if (z3) {
                                    w94Var.c = w94Var.a.o() + vy1Var.d(viewX0);
                                } else {
                                    w94Var.c = vy1Var.g(viewX0);
                                }
                                w94Var.b = iO;
                                if (!y66Var.g && L0()) {
                                    iG = this.D.g(viewX0);
                                    iD = this.D.d(viewX0);
                                    iM = this.D.m();
                                    i = this.D.i();
                                    if (iD <= iM || iG >= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iG >= i || iD <= i) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (w94Var.d) {
                                            iM = i;
                                        }
                                        w94Var.c = iM;
                                    }
                                }
                            }
                        } else {
                            w94Var.b(focusedChild2, a.O(focusedChild2));
                        }
                    } else {
                        z = this.E;
                        z2 = this.H;
                        if (z == z2) {
                            w94Var.a();
                            if (this.H) {
                                iB = y66Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            w94Var.b = iB;
                        } else {
                            int iO2 = a.O(viewX0);
                            z3 = w94Var.d;
                            vy1Var = w94Var.a;
                            if (z3) {
                                w94Var.c = w94Var.a.o() + vy1Var.d(viewX0);
                            } else {
                                w94Var.c = vy1Var.g(viewX0);
                            }
                            w94Var.b = iO2;
                            if (!y66Var.g) {
                                iG = this.D.g(viewX0);
                                iD = this.D.d(viewX0);
                                iM = this.D.m();
                                i = this.D.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (w94Var.d) {
                                        iM = i;
                                    }
                                    w94Var.c = iM;
                                } else {
                                    if (w94Var.d) {
                                        iM = i;
                                    }
                                    w94Var.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    w94Var.a();
                    if (this.H) {
                        iB = y66Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    w94Var.b = iB;
                }
            } else if (i2 < 0 || i2 >= y66Var.b()) {
                this.J = -1;
                this.K = Integer.MIN_VALUE;
                if (G() != 0) {
                    recyclerView = this.n;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        m66Var = (m66) focusedChild2.getLayoutParams();
                        if (m66Var.m.i()) {
                            z = this.E;
                            z2 = this.H;
                            if (z == z2) {
                                w94Var.a();
                                if (this.H) {
                                    iB = y66Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                w94Var.b = iB;
                            } else {
                                int iO3 = a.O(viewX0);
                                z3 = w94Var.d;
                                vy1Var = w94Var.a;
                                if (z3) {
                                    w94Var.c = w94Var.a.o() + vy1Var.d(viewX0);
                                } else {
                                    w94Var.c = vy1Var.g(viewX0);
                                }
                                w94Var.b = iO3;
                                if (!y66Var.g) {
                                    iG = this.D.g(viewX0);
                                    iD = this.D.d(viewX0);
                                    iM = this.D.m();
                                    i = this.D.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (w94Var.d) {
                                            iM = i;
                                        }
                                        w94Var.c = iM;
                                    } else {
                                        if (w94Var.d) {
                                            iM = i;
                                        }
                                        w94Var.c = iM;
                                    }
                                }
                            }
                        } else {
                            z = this.E;
                            z2 = this.H;
                            if (z == z2) {
                                w94Var.a();
                                if (this.H) {
                                    iB = y66Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                w94Var.b = iB;
                            } else {
                                int iO4 = a.O(viewX0);
                                z3 = w94Var.d;
                                vy1Var = w94Var.a;
                                if (z3) {
                                    w94Var.c = w94Var.a.o() + vy1Var.d(viewX0);
                                } else {
                                    w94Var.c = vy1Var.g(viewX0);
                                }
                                w94Var.b = iO4;
                                if (!y66Var.g) {
                                    iG = this.D.g(viewX0);
                                    iD = this.D.d(viewX0);
                                    iM = this.D.m();
                                    i = this.D.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (w94Var.d) {
                                            iM = i;
                                        }
                                        w94Var.c = iM;
                                    } else {
                                        if (w94Var.d) {
                                            iM = i;
                                        }
                                        w94Var.c = iM;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.E;
                        z2 = this.H;
                        if (z == z2) {
                            w94Var.a();
                            if (this.H) {
                                iB = y66Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            w94Var.b = iB;
                        } else {
                            int iO5 = a.O(viewX0);
                            z3 = w94Var.d;
                            vy1Var = w94Var.a;
                            if (z3) {
                                w94Var.c = w94Var.a.o() + vy1Var.d(viewX0);
                            } else {
                                w94Var.c = vy1Var.g(viewX0);
                            }
                            w94Var.b = iO5;
                            if (!y66Var.g) {
                                iG = this.D.g(viewX0);
                                iD = this.D.d(viewX0);
                                iM = this.D.m();
                                i = this.D.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (w94Var.d) {
                                        iM = i;
                                    }
                                    w94Var.c = iM;
                                } else {
                                    if (w94Var.d) {
                                        iM = i;
                                    }
                                    w94Var.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    w94Var.a();
                    if (this.H) {
                        iB = y66Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    w94Var.b = iB;
                }
            } else {
                int i12 = this.J;
                w94Var.b = i12;
                z94 z94Var2 = this.L;
                if (z94Var2 != null && z94Var2.m >= 0) {
                    boolean z7 = z94Var2.f2682o;
                    w94Var.d = z7;
                    vy1 vy1Var2 = this.D;
                    if (z7) {
                        w94Var.c = vy1Var2.i() - this.L.n;
                    } else {
                        w94Var.c = vy1Var2.m() + this.L.n;
                    }
                } else if (this.K == Integer.MIN_VALUE) {
                    View viewB2 = B(i12);
                    if (viewB2 == null) {
                        if (G() > 0) {
                            w94Var.d = (this.J < a.O(F(0))) == this.G;
                        }
                        w94Var.a();
                    } else if (this.D.e(viewB2) > this.D.n()) {
                        w94Var.a();
                    } else {
                        int iG3 = this.D.g(viewB2) - this.D.m();
                        vy1 vy1Var3 = this.D;
                        if (iG3 < 0) {
                            w94Var.c = vy1Var3.m();
                            w94Var.d = false;
                        } else if (vy1Var3.i() - this.D.d(viewB2) < 0) {
                            w94Var.c = this.D.i();
                            w94Var.d = true;
                        } else {
                            boolean z8 = w94Var.d;
                            vy1 vy1Var4 = this.D;
                            w94Var.c = z8 ? this.D.o() + vy1Var4.d(viewB2) : vy1Var4.g(viewB2);
                        }
                    }
                } else {
                    boolean z9 = this.G;
                    w94Var.d = z9;
                    vy1 vy1Var5 = this.D;
                    if (z9) {
                        w94Var.c = vy1Var5.i() - this.K;
                    } else {
                        w94Var.c = vy1Var5.m() + this.K;
                    }
                }
            }
            w94Var.e = true;
        } else if (focusedChild != null && (this.D.g(focusedChild) >= this.D.i() || this.D.d(focusedChild) <= this.D.m())) {
            w94Var.b(focusedChild, a.O(focusedChild));
        }
        y94 y94Var = this.C;
        y94Var.f = y94Var.j >= 0 ? 1 : -1;
        int[] iArr = this.P;
        iArr[0] = 0;
        iArr[1] = 0;
        int iN = y66Var.a != -1 ? this.D.n() : 0;
        if (this.C.f == -1) {
            i3 = 0;
        } else {
            i3 = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i3;
        int iM2 = this.D.m() + Math.max(0, iN);
        int iJ = this.D.j() + Math.max(0, iArr[1]);
        if (y66Var.g && (i8 = this.J) != -1 && this.K != Integer.MIN_VALUE && (viewB = B(i8)) != null) {
            boolean z10 = this.G;
            vy1 vy1Var6 = this.D;
            if (z10) {
                i9 = vy1Var6.i() - this.D.d(viewB);
                iG2 = this.K;
            } else {
                iG2 = vy1Var6.g(viewB) - this.D.m();
                i9 = this.K;
            }
            int i13 = i9 - iG2;
            if (i13 > 0) {
                iM2 += i13;
            } else {
                iJ -= i13;
            }
        }
        boolean z11 = w94Var.d;
        boolean z12 = this.G;
        if (!z11 ? !z12 : z12) {
            i11 = 1;
        }
        e1(s66Var, y66Var, w94Var, i11);
        A(s66Var);
        this.C.l = this.D.k() == 0 && this.D.h() == 0;
        this.C.getClass();
        this.C.i = 0;
        boolean z13 = w94Var.d;
        int i14 = w94Var.b;
        if (z13) {
            n1(i14, w94Var.c);
            y94 y94Var2 = this.C;
            y94Var2.h = iM2;
            S0(s66Var, y94Var2, y66Var, false);
            y94 y94Var3 = this.C;
            i5 = y94Var3.b;
            int i15 = y94Var3.d;
            int i16 = y94Var3.c;
            if (i16 > 0) {
                iJ += i16;
            }
            m1(w94Var.b, w94Var.c);
            y94 y94Var4 = this.C;
            y94Var4.h = iJ;
            y94Var4.d += y94Var4.e;
            S0(s66Var, y94Var4, y66Var, false);
            y94 y94Var5 = this.C;
            i4 = y94Var5.b;
            int i17 = y94Var5.c;
            if (i17 > 0) {
                n1(i15, i5);
                y94 y94Var6 = this.C;
                y94Var6.h = i17;
                S0(s66Var, y94Var6, y66Var, false);
                i5 = this.C.b;
            }
        } else {
            m1(i14, w94Var.c);
            y94 y94Var7 = this.C;
            y94Var7.h = iJ;
            S0(s66Var, y94Var7, y66Var, false);
            y94 y94Var8 = this.C;
            i4 = y94Var8.b;
            int i18 = y94Var8.d;
            int i19 = y94Var8.c;
            if (i19 > 0) {
                iM2 += i19;
            }
            n1(w94Var.b, w94Var.c);
            y94 y94Var9 = this.C;
            y94Var9.h = iM2;
            y94Var9.d += y94Var9.e;
            S0(s66Var, y94Var9, y66Var, false);
            y94 y94Var10 = this.C;
            int i20 = y94Var10.b;
            int i21 = y94Var10.c;
            if (i21 > 0) {
                m1(i18, i4);
                y94 y94Var11 = this.C;
                y94Var11.h = i21;
                S0(s66Var, y94Var11, y66Var, false);
                i4 = this.C.b;
            }
            i5 = i20;
        }
        if (G() > 0) {
            if (this.G ^ this.H) {
                int iY1 = Y0(i4, s66Var, y66Var, true);
                i6 = i5 + iY1;
                i7 = i4 + iY1;
                iY0 = Z0(i6, s66Var, y66Var, false);
            } else {
                int iZ0 = Z0(i5, s66Var, y66Var, true);
                i6 = i5 + iZ0;
                i7 = i4 + iZ0;
                iY0 = Y0(i7, s66Var, y66Var, false);
            }
            i5 = i6 + iY0;
            i4 = i7 + iY0;
        }
        if (y66Var.k && G() != 0 && !y66Var.g && L0()) {
            List list2 = s66Var.d;
            int size = list2.size();
            int iO6 = a.O(F(0));
            int i22 = 0;
            int iE = 0;
            int iE2 = 0;
            while (i22 < size) {
                c76 c76Var = (c76) list2.get(i22);
                boolean zI = c76Var.i();
                View view = c76Var.m;
                if (!zI) {
                    boolean z14 = c76Var.c() < iO6 ? true : z6;
                    boolean z15 = this.G;
                    vy1 vy1Var7 = this.D;
                    if (z14 != z15) {
                        iE += vy1Var7.e(view);
                    } else {
                        iE2 += vy1Var7.e(view);
                    }
                }
                i22++;
                z6 = false;
            }
            this.C.k = list2;
            if (iE > 0) {
                n1(a.O(b1()), i5);
                y94 y94Var12 = this.C;
                y94Var12.h = iE;
                r4 = 0;
                y94Var12.c = 0;
                y94Var12.a(null);
                S0(s66Var, this.C, y66Var, false);
            } else {
                r4 = 0;
            }
            if (iE2 > 0) {
                m1(a.O(a1()), i4);
                y94 y94Var13 = this.C;
                y94Var13.h = iE2;
                y94Var13.c = r4;
                list = null;
                y94Var13.a(null);
                S0(s66Var, this.C, y66Var, r4);
            } else {
                list = null;
            }
            this.C.k = list;
        }
        if (y66Var.g) {
            w94Var.c();
        } else {
            vy1 vy1Var8 = this.D;
            vy1Var8.a = vy1Var8.n();
        }
        this.E = this.H;
    }

    public final void m1(int i, int i2) {
        this.C.c = this.D.i() - i2;
        y94 y94Var = this.C;
        y94Var.e = this.G ? -1 : 1;
        y94Var.d = i;
        y94Var.f = 1;
        y94Var.b = i2;
        y94Var.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public void n0(y66 y66Var) {
        this.L = null;
        this.J = -1;
        this.K = Integer.MIN_VALUE;
        this.M.c();
    }

    public final void n1(int i, int i2) {
        this.C.c = i2 - this.D.m();
        y94 y94Var = this.C;
        y94Var.d = i;
        y94Var.e = this.G ? 1 : -1;
        y94Var.f = -1;
        y94Var.b = i2;
        y94Var.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean o() {
        return this.B == 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void o0(Parcelable parcelable) {
        if (parcelable instanceof z94) {
            z94 z94Var = (z94) parcelable;
            this.L = z94Var;
            if (this.J != -1) {
                z94Var.m = -1;
            }
            x0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean p() {
        return this.B == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final Parcelable p0() {
        z94 z94Var = this.L;
        if (z94Var != null) {
            z94 z94Var2 = new z94();
            z94Var2.m = z94Var.m;
            z94Var2.n = z94Var.n;
            z94Var2.f2682o = z94Var.f2682o;
            return z94Var2;
        }
        z94 z94Var3 = new z94();
        if (G() <= 0) {
            z94Var3.m = -1;
            return z94Var3;
        }
        R0();
        boolean z = this.E ^ this.G;
        z94Var3.f2682o = z;
        if (z) {
            View viewA1 = a1();
            z94Var3.n = this.D.i() - this.D.d(viewA1);
            z94Var3.m = a.O(viewA1);
            return z94Var3;
        }
        View viewB1 = b1();
        z94Var3.m = a.O(viewB1);
        z94Var3.n = this.D.g(viewB1) - this.D.m();
        return z94Var3;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    @Override // androidx.recyclerview.widget.a
    public boolean r0(int i, Bundle bundle) {
        int iMin;
        z94 z94Var;
        if (super.r0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.B == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 >= 0) {
                    RecyclerView recyclerView = this.n;
                    iMin = Math.min(i2, Q(recyclerView.f23o, recyclerView.s0) - 1);
                    if (iMin >= 0) {
                        this.J = iMin;
                        this.K = 0;
                        z94Var = this.L;
                        if (z94Var != null) {
                            z94Var.m = -1;
                        }
                        x0();
                        return true;
                    }
                }
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 >= 0) {
                    RecyclerView recyclerView2 = this.n;
                    iMin = Math.min(i3, I(recyclerView2.f23o, recyclerView2.s0) - 1);
                    if (iMin >= 0) {
                        this.J = iMin;
                        this.K = 0;
                        z94Var = this.L;
                        if (z94Var != null) {
                            z94Var.m = -1;
                        }
                        x0();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final void s(int i, int i2, y66 y66Var, rr0 rr0Var) {
        if (this.B != 0) {
            i = i2;
        }
        if (G() == 0 || i == 0) {
            return;
        }
        R0();
        l1(i > 0 ? 1 : -1, Math.abs(i), true, y66Var);
        M0(y66Var, this.C, rr0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void t(int i, rr0 rr0Var) {
        boolean z;
        int i2;
        z94 z94Var = this.L;
        if (z94Var == null || (i2 = z94Var.m) < 0) {
            h1();
            z = this.G;
            i2 = this.J;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = z94Var.f2682o;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.O && i2 >= 0 && i2 < i; i4++) {
            rr0Var.c(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int u(y66 y66Var) {
        return N0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public int v(y66 y66Var) {
        return O0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public int w(y66 y66Var) {
        return P0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int x(y66 y66Var) {
        return N0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public int y(y66 y66Var) {
        return O0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public int y0(int i, s66 s66Var, y66 y66Var) {
        if (this.B == 1) {
            return 0;
        }
        return i1(i, s66Var, y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public int z(y66 y66Var) {
        return P0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void z0(int i) {
        this.J = i;
        this.K = Integer.MIN_VALUE;
        z94 z94Var = this.L;
        if (z94Var != null) {
            z94Var.m = -1;
        }
        x0();
    }

    public LinearLayoutManager(int i) {
        this.B = 1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = true;
        this.J = -1;
        this.K = Integer.MIN_VALUE;
        this.L = null;
        this.M = new w94();
        this.N = new x94();
        this.O = (byte) 2;
        this.P = new int[2];
        j1(1);
        m(null);
        if (this.F) {
            this.F = false;
            x0();
        }
    }
}
