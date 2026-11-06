package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.List;
import o.aa4;
import o.hb5;
import o.l66;
import o.lm2;
import o.m66;
import o.nd;
import o.nm2;
import o.qm2;
import o.rm2;
import o.s66;
import o.sm2;
import o.tm2;
import o.vy1;
import o.x66;
import o.y66;
import o.yc4;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayoutManager extends a implements lm2, x66 {
    public static final Rect Z = new Rect();
    public byte B;
    public final boolean C;
    public final byte D;
    public boolean F;
    public boolean G;
    public s66 J;
    public y66 K;
    public sm2 L;
    public final qm2 M;
    public vy1 N;
    public vy1 O;
    public tm2 P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final SparseArray U;
    public final Context V;
    public View W;
    public int X;
    public final nd Y;
    public final int E = -1;
    public List H = new ArrayList();
    public final yc4 I = new yc4(this);

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        qm2 qm2Var = new qm2(this);
        this.M = qm2Var;
        this.Q = -1;
        this.R = Integer.MIN_VALUE;
        this.S = Integer.MIN_VALUE;
        this.T = Integer.MIN_VALUE;
        this.U = new SparseArray();
        this.X = -1;
        this.Y = new nd((byte) 5, false);
        l66 l66VarP = a.P(context, attributeSet, i, i2);
        int i3 = l66VarP.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (l66VarP.c) {
                    c1(3);
                } else {
                    c1(2);
                }
            }
        } else if (l66VarP.c) {
            c1(1);
        } else {
            c1(0);
        }
        boolean z = this.C;
        if (!z) {
            if (!z) {
                s0();
                this.H.clear();
                qm2Var.b();
                qm2Var.d = 0;
            }
            this.C = true;
            this.N = null;
            this.O = null;
            x0();
        }
        if (this.D != 4) {
            s0();
            this.H.clear();
            qm2Var.b();
            qm2Var.d = 0;
            this.D = (byte) 4;
            x0();
        }
        this.V = context;
    }

    public static boolean U(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final int A0(int i, s66 s66Var, y66 y66Var) {
        if (j() || !(this.C || j())) {
            int iZ0 = Z0(i, s66Var, y66Var);
            this.U.clear();
            return iZ0;
        }
        int iA1 = a1(i);
        this.M.d += iA1;
        this.O.r(-iA1);
        return iA1;
    }

    @Override // androidx.recyclerview.widget.a
    public final m66 C() {
        rm2 rm2Var = new rm2(-2, -2);
        rm2Var.q = 0.0f;
        rm2Var.r = 1.0f;
        rm2Var.s = -1;
        rm2Var.t = -1.0f;
        rm2Var.w = 16777215;
        rm2Var.x = 16777215;
        return rm2Var;
    }

    @Override // androidx.recyclerview.widget.a
    public final m66 D(Context context, AttributeSet attributeSet) {
        rm2 rm2Var = new rm2(context, attributeSet);
        rm2Var.q = 0.0f;
        rm2Var.r = 1.0f;
        rm2Var.s = -1;
        rm2Var.t = -1.0f;
        rm2Var.w = 16777215;
        rm2Var.x = 16777215;
        return rm2Var;
    }

    @Override // androidx.recyclerview.widget.a
    public final void J0(RecyclerView recyclerView, int i) {
        aa4 aa4Var = new aa4(recyclerView.getContext());
        aa4Var.a = i;
        K0(aa4Var);
    }

    public final int M0(y66 y66Var) {
        if (G() == 0) {
            return 0;
        }
        int iB = y66Var.b();
        P0();
        View viewR0 = R0(iB);
        View viewT0 = T0(iB);
        if (y66Var.b() == 0 || viewR0 == null || viewT0 == null) {
            return 0;
        }
        return Math.min(this.N.n(), this.N.d(viewT0) - this.N.g(viewR0));
    }

    public final int N0(y66 y66Var) {
        if (G() == 0) {
            return 0;
        }
        int iB = y66Var.b();
        View viewR0 = R0(iB);
        View viewT0 = T0(iB);
        if (y66Var.b() == 0 || viewR0 == null || viewT0 == null) {
            return 0;
        }
        int iO = a.O(viewR0);
        int iO2 = a.O(viewT0);
        int iAbs = Math.abs(this.N.d(viewT0) - this.N.g(viewR0));
        int[] iArr = (int[]) this.I.f2598o;
        int i = iArr[iO];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((iArr[iO2] - i) + 1))) + (this.N.m() - this.N.g(viewR0)));
    }

    public final int O0(y66 y66Var) {
        if (G() != 0) {
            int iB = y66Var.b();
            View viewR0 = R0(iB);
            View viewT0 = T0(iB);
            if (y66Var.b() != 0 && viewR0 != null && viewT0 != null) {
                View viewV0 = V0(0, G());
                int iO = viewV0 == null ? -1 : a.O(viewV0);
                View viewV1 = V0(G() - 1, -1);
                return (int) ((Math.abs(this.N.d(viewT0) - this.N.g(viewR0)) / (((viewV1 != null ? a.O(viewV1) : -1) - iO) + 1)) * y66Var.b());
            }
        }
        return 0;
    }

    public final void P0() {
        if (this.N != null) {
            return;
        }
        boolean zJ = j();
        boolean z = this.C;
        if (zJ) {
            if (z) {
                this.N = new hb5(this, (byte) 1);
                this.O = new hb5(this, (byte) 0);
                return;
            } else {
                this.N = new hb5(this, (byte) 0);
                this.O = new hb5(this, (byte) 1);
                return;
            }
        }
        if (z) {
            this.N = new hb5(this, (byte) 0);
            this.O = new hb5(this, (byte) 1);
        } else {
            this.N = new hb5(this, (byte) 1);
            this.O = new hb5(this, (byte) 0);
        }
    }

    public final int Q0(s66 s66Var, y66 y66Var, sm2 sm2Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        Rect rect;
        int i7;
        int i8;
        int i9;
        Rect rect2;
        int i10 = sm2Var.f;
        if (i10 != Integer.MIN_VALUE) {
            int i11 = sm2Var.a;
            if (i11 < 0) {
                sm2Var.f = i10 + i11;
            }
            b1(s66Var, sm2Var);
        }
        int i12 = sm2Var.a;
        boolean zJ = j();
        int i13 = i12;
        int i14 = 0;
        while (true) {
            if (i13 <= 0 && !this.L.b) {
                break;
            }
            List list = this.H;
            int i15 = sm2Var.d;
            if (i15 < 0 || i15 >= y66Var.b() || (i = sm2Var.c) < 0 || i >= list.size()) {
                break;
            }
            nm2 nm2Var = (nm2) this.H.get(sm2Var.c);
            sm2Var.d = nm2Var.f1578o;
            boolean zJ2 = j();
            qm2 qm2Var = this.M;
            Rect rect3 = Z;
            yc4 yc4Var = this.I;
            if (zJ2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i16 = this.z;
                int i17 = sm2Var.e;
                if (sm2Var.h == -1) {
                    i17 -= nm2Var.g;
                }
                int i18 = i17;
                int i19 = sm2Var.d;
                float f = qm2Var.d;
                float f2 = paddingLeft - f;
                float measuredWidth = (i16 - paddingRight) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i20 = nm2Var.h;
                int i21 = i19;
                int i22 = 0;
                while (i21 < i19 + i20) {
                    int i23 = i20;
                    View viewE = e(i21);
                    if (viewE == null) {
                        i19 = i19;
                        i9 = i21;
                        rect2 = rect3;
                    } else {
                        if (sm2Var.h == 1) {
                            n(viewE, rect3);
                            l(viewE, -1, false);
                        } else {
                            n(viewE, rect3);
                            int i24 = i22;
                            l(viewE, i24, false);
                            i22 = i24 + 1;
                        }
                        float f3 = measuredWidth;
                        long j = ((long[]) yc4Var.p)[i21];
                        int i25 = (int) j;
                        int i26 = (int) (j >> 32);
                        rm2 rm2Var = (rm2) viewE.getLayoutParams();
                        if (d1(viewE, i25, i26, rm2Var)) {
                            viewE.measure(i25, i26);
                        }
                        float f4 = f2 + ((ViewGroup.MarginLayoutParams) rm2Var).leftMargin + ((m66) viewE.getLayoutParams()).n.left;
                        float f5 = f3 - (((ViewGroup.MarginLayoutParams) rm2Var).rightMargin + ((m66) viewE.getLayoutParams()).n.right);
                        int i27 = i18 + ((m66) viewE.getLayoutParams()).n.top;
                        boolean z2 = this.F;
                        yc4 yc4Var2 = this.I;
                        if (z2) {
                            int iRound = Math.round(f5) - viewE.getMeasuredWidth();
                            Rect rect4 = rect3;
                            int iRound2 = Math.round(f5);
                            int measuredHeight = viewE.getMeasuredHeight() + i27;
                            i9 = i21;
                            rect2 = rect4;
                            yc4Var2.M(viewE, nm2Var, iRound, i27, iRound2, measuredHeight);
                        } else {
                            i9 = i21;
                            rect2 = rect3;
                            yc4Var2.M(viewE, nm2Var, Math.round(f4), i27, viewE.getMeasuredWidth() + Math.round(f4), viewE.getMeasuredHeight() + i27);
                        }
                        float measuredWidth2 = viewE.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) rm2Var).rightMargin + ((m66) viewE.getLayoutParams()).n.right + fMax + f4;
                        measuredWidth = f5 - (((viewE.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) rm2Var).leftMargin) + ((m66) viewE.getLayoutParams()).n.left) + fMax);
                        f2 = measuredWidth2;
                    }
                    i21 = i9 + 1;
                    i19 = i19;
                    i12 = i12;
                    zJ = zJ;
                    i20 = i23;
                    rect3 = rect2;
                }
                i2 = i12;
                z = zJ;
                sm2Var.c += this.L.h;
                i6 = nm2Var.g;
                i5 = i13;
            } else {
                i2 = i12;
                z = zJ;
                Rect rect5 = rect3;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i28 = this.A;
                int i29 = sm2Var.e;
                if (sm2Var.h == -1) {
                    int i30 = nm2Var.g;
                    i4 = i29 + i30;
                    i3 = i29 - i30;
                } else {
                    i3 = i29;
                    i4 = i3;
                }
                int i31 = sm2Var.d;
                float f6 = i28 - paddingBottom;
                float f7 = qm2Var.d;
                float f8 = paddingTop - f7;
                float f9 = f6 - f7;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i32 = nm2Var.h;
                float measuredHeight2 = f9;
                int i33 = i31;
                int i34 = 0;
                while (i33 < i31 + i32) {
                    int i35 = i32;
                    View viewE2 = e(i33);
                    if (viewE2 == null) {
                        i13 = i13;
                        i7 = i33;
                        rect = rect5;
                        i8 = i35;
                    } else {
                        float f10 = f8;
                        long j2 = ((long[]) yc4Var.p)[i33];
                        int i36 = (int) j2;
                        int i37 = (int) (j2 >> 32);
                        rm2 rm2Var2 = (rm2) viewE2.getLayoutParams();
                        if (d1(viewE2, i36, i37, rm2Var2)) {
                            viewE2.measure(i36, i37);
                        }
                        float f11 = f10 + ((ViewGroup.MarginLayoutParams) rm2Var2).topMargin + ((m66) viewE2.getLayoutParams()).n.top;
                        float f12 = measuredHeight2 - (((ViewGroup.MarginLayoutParams) rm2Var2).rightMargin + ((m66) viewE2.getLayoutParams()).n.bottom);
                        if (sm2Var.h == 1) {
                            rect = rect5;
                            n(viewE2, rect);
                            l(viewE2, -1, false);
                        } else {
                            rect = rect5;
                            n(viewE2, rect);
                            l(viewE2, i34, false);
                            i34++;
                        }
                        int i38 = i3 + ((m66) viewE2.getLayoutParams()).n.left;
                        int i39 = i4 - ((m66) viewE2.getLayoutParams()).n.right;
                        boolean z3 = this.F;
                        boolean z4 = this.G;
                        yc4 yc4Var3 = this.I;
                        if (!z3) {
                            i7 = i33;
                            i8 = i35;
                            if (z4) {
                                yc4Var3.N(viewE2, nm2Var, z3, i38, Math.round(f12) - viewE2.getMeasuredHeight(), viewE2.getMeasuredWidth() + i38, Math.round(f12));
                            } else {
                                yc4Var3.N(viewE2, nm2Var, z3, i38, Math.round(f11), viewE2.getMeasuredWidth() + i38, viewE2.getMeasuredHeight() + Math.round(f11));
                            }
                        } else if (z4) {
                            i7 = i33;
                            i8 = i35;
                            yc4Var3.N(viewE2, nm2Var, z3, i39 - viewE2.getMeasuredWidth(), Math.round(f12) - viewE2.getMeasuredHeight(), i39, Math.round(f12));
                        } else {
                            i7 = i33;
                            i8 = i35;
                            yc4Var3.N(viewE2, nm2Var, z3, i39 - viewE2.getMeasuredWidth(), Math.round(f11), i39, viewE2.getMeasuredHeight() + Math.round(f11));
                        }
                        float measuredHeight3 = viewE2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) rm2Var2).topMargin + ((m66) viewE2.getLayoutParams()).n.bottom + fMax2 + f11;
                        measuredHeight2 = f12 - (((viewE2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) rm2Var2).bottomMargin) + ((m66) viewE2.getLayoutParams()).n.top) + fMax2);
                        f8 = measuredHeight3;
                    }
                    i33 = i7 + 1;
                    i13 = i13;
                    i31 = i31;
                    i32 = i8;
                    rect5 = rect;
                    yc4Var = yc4Var;
                }
                i5 = i13;
                sm2Var.c += this.L.h;
                i6 = nm2Var.g;
            }
            int i40 = i6;
            i14 += i6;
            if (z || !this.F) {
                sm2Var.e += sm2Var.h * i40;
            } else {
                sm2Var.e -= sm2Var.h * i40;
            }
            i13 = i5 - i40;
            i12 = i2;
            zJ = z;
        }
        int i41 = i12;
        int i42 = sm2Var.a - i14;
        sm2Var.a = i42;
        int i43 = sm2Var.f;
        if (i43 != Integer.MIN_VALUE) {
            int i44 = i43 + i14;
            sm2Var.f = i44;
            if (i42 < 0) {
                sm2Var.f = i44 + i42;
            }
            b1(s66Var, sm2Var);
        }
        return i41 - sm2Var.a;
    }

    public final View R0(int i) {
        View viewW0 = W0(0, G(), i);
        if (viewW0 == null) {
            return null;
        }
        int i2 = ((int[]) this.I.f2598o)[a.O(viewW0)];
        if (i2 == -1) {
            return null;
        }
        return S0(viewW0, (nm2) this.H.get(i2));
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean S() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View S0(View view, nm2 nm2Var) {
        boolean zJ = j();
        int i = nm2Var.h;
        for (int i2 = 1; i2 < i; i2++) {
            View viewF = F(i2);
            if (viewF != null && viewF.getVisibility() != 8) {
                if (!this.F || zJ) {
                    if (this.N.g(view) > this.N.g(viewF)) {
                        view = viewF;
                    }
                } else if (this.N.d(view) < this.N.d(viewF)) {
                    view = viewF;
                }
            }
        }
        return view;
    }

    public final View T0(int i) {
        View viewW0 = W0(G() - 1, -1, i);
        if (viewW0 == null) {
            return null;
        }
        return U0(viewW0, (nm2) this.H.get(((int[]) this.I.f2598o)[a.O(viewW0)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View U0(View view, nm2 nm2Var) {
        boolean zJ = j();
        int iG = (G() - nm2Var.h) - 1;
        for (int iG2 = G() - 2; iG2 > iG; iG2--) {
            View viewF = F(iG2);
            if (viewF != null && viewF.getVisibility() != 8) {
                if (!this.F || zJ) {
                    if (this.N.d(view) < this.N.d(viewF)) {
                        view = viewF;
                    }
                } else if (this.N.g(view) > this.N.g(viewF)) {
                    view = viewF;
                }
            }
        }
        return view;
    }

    public final View V0(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewF = F(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.z - getPaddingRight();
            int paddingBottom = this.A - getPaddingBottom();
            int iK = a.K(viewF) - ((ViewGroup.MarginLayoutParams) ((m66) viewF.getLayoutParams())).leftMargin;
            int iM = a.M(viewF) - ((ViewGroup.MarginLayoutParams) ((m66) viewF.getLayoutParams())).topMargin;
            int iL = a.L(viewF) + ((ViewGroup.MarginLayoutParams) ((m66) viewF.getLayoutParams())).rightMargin;
            int iJ = a.J(viewF) + ((ViewGroup.MarginLayoutParams) ((m66) viewF.getLayoutParams())).bottomMargin;
            boolean z = iK >= paddingRight || iL >= paddingLeft;
            boolean z2 = iM >= paddingBottom || iJ >= paddingTop;
            if (z && z2) {
                return viewF;
            }
            i += i3;
        }
        return null;
    }

    public final View W0(int i, int i2, int i3) {
        int iO;
        P0();
        if (this.L == null) {
            sm2 sm2Var = new sm2();
            sm2Var.h = 1;
            this.L = sm2Var;
        }
        int iM = this.N.m();
        int i4 = this.N.i();
        int i5 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewF = F(i);
            if (viewF != null && (iO = a.O(viewF)) >= 0 && iO < i3) {
                if (((m66) viewF.getLayoutParams()).m.i()) {
                    if (view2 == null) {
                        view2 = viewF;
                    }
                } else {
                    if (this.N.g(viewF) >= iM && this.N.d(viewF) <= i4) {
                        return viewF;
                    }
                    if (view == null) {
                        view = viewF;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    public final int X0(int i, s66 s66Var, y66 y66Var, boolean z) {
        int iZ0;
        int i2;
        if (j() || !this.F) {
            int i3 = this.N.i() - i;
            if (i3 <= 0) {
                return 0;
            }
            iZ0 = -Z0(-i3, s66Var, y66Var);
        } else {
            int iM = i - this.N.m();
            if (iM <= 0) {
                return 0;
            }
            iZ0 = Z0(iM, s66Var, y66Var);
        }
        int i4 = i + iZ0;
        if (!z || (i2 = this.N.i() - i4) <= 0) {
            return iZ0;
        }
        this.N.r(i2);
        return i2 + iZ0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void Y() {
        s0();
    }

    public final int Y0(int i, s66 s66Var, y66 y66Var, boolean z) {
        int iZ0;
        int iM;
        if (j() || !this.F) {
            int iM2 = i - this.N.m();
            if (iM2 <= 0) {
                return 0;
            }
            iZ0 = -Z0(iM2, s66Var, y66Var);
        } else {
            int i2 = this.N.i() - i;
            if (i2 <= 0) {
                return 0;
            }
            iZ0 = Z0(-i2, s66Var, y66Var);
        }
        int i3 = i + iZ0;
        if (!z || (iM = i3 - this.N.m()) <= 0) {
            return iZ0;
        }
        this.N.r(-iM);
        return iZ0 - iM;
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(RecyclerView recyclerView) {
        this.W = (View) recyclerView.getParent();
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01ed  */
    public final int Z0(int i, s66 s66Var, y66 y66Var) {
        int i2;
        if (G() != 0 && i != 0) {
            P0();
            this.L.i = true;
            boolean z = !j() && this.F;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int iAbs = Math.abs(i);
            this.L.h = i3;
            boolean zJ = j();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.z, this.x);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.A, this.y);
            boolean z2 = !zJ && this.F;
            yc4 yc4Var = this.I;
            if (i3 == 1) {
                View viewF = F(G() - 1);
                if (viewF != null) {
                    this.L.e = this.N.d(viewF);
                    int iO = a.O(viewF);
                    View viewU0 = U0(viewF, (nm2) this.H.get(((int[]) yc4Var.f2598o)[iO]));
                    sm2 sm2Var = this.L;
                    sm2Var.getClass();
                    int i4 = iO + 1;
                    sm2Var.d = i4;
                    int[] iArr = (int[]) yc4Var.f2598o;
                    if (iArr.length <= i4) {
                        sm2Var.c = -1;
                    } else {
                        sm2Var.c = iArr[i4];
                    }
                    vy1 vy1Var = this.N;
                    if (z2) {
                        sm2Var.e = vy1Var.g(viewU0);
                        this.L.f = this.N.m() + (-this.N.g(viewU0));
                        sm2 sm2Var2 = this.L;
                        sm2Var2.f = Math.max(sm2Var2.f, 0);
                    } else {
                        sm2Var.e = vy1Var.d(viewU0);
                        this.L.f = this.N.d(viewU0) - this.N.i();
                    }
                    int i5 = this.L.c;
                    if ((i5 == -1 || i5 > this.H.size() - 1) && this.L.d <= this.K.b()) {
                        sm2 sm2Var3 = this.L;
                        int i6 = iAbs - sm2Var3.f;
                        nd ndVar = this.Y;
                        ndVar.f1562o = null;
                        ndVar.n = 0;
                        if (i6 > 0) {
                            yc4 yc4Var2 = this.I;
                            if (zJ) {
                                yc4Var2.p(ndVar, iMakeMeasureSpec, iMakeMeasureSpec2, i6, sm2Var3.d, -1, this.H);
                            } else {
                                yc4Var2.p(ndVar, iMakeMeasureSpec2, iMakeMeasureSpec, i6, sm2Var3.d, -1, this.H);
                                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                                iMakeMeasureSpec = iMakeMeasureSpec;
                            }
                            yc4Var.y(iMakeMeasureSpec, iMakeMeasureSpec2, this.L.d);
                            yc4Var.a0(this.L.d);
                        }
                    }
                    sm2 sm2Var4 = this.L;
                    sm2Var4.a = iAbs - sm2Var4.f;
                }
            } else {
                View viewF2 = F(0);
                if (viewF2 != null) {
                    this.L.e = this.N.g(viewF2);
                    int iO2 = a.O(viewF2);
                    View viewS0 = S0(viewF2, (nm2) this.H.get(((int[]) yc4Var.f2598o)[iO2]));
                    sm2 sm2Var5 = this.L;
                    sm2Var5.getClass();
                    int i7 = ((int[]) yc4Var.f2598o)[iO2];
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        nm2 nm2Var = (nm2) this.H.get(i7 - 1);
                        sm2Var5 = this.L;
                        sm2Var5.d = iO2 - nm2Var.h;
                    } else {
                        sm2Var5.d = -1;
                    }
                    sm2Var5.c = i7 > 0 ? i7 - 1 : 0;
                    vy1 vy1Var2 = this.N;
                    if (z2) {
                        sm2Var5.e = vy1Var2.d(viewS0);
                        this.L.f = this.N.d(viewS0) - this.N.i();
                        sm2 sm2Var6 = this.L;
                        sm2Var6.f = Math.max(sm2Var6.f, 0);
                    } else {
                        sm2Var5.e = vy1Var2.g(viewS0);
                        this.L.f = this.N.m() + (-this.N.g(viewS0));
                    }
                    sm2 sm2Var7 = this.L;
                    sm2Var7.a = iAbs - sm2Var7.f;
                }
            }
            sm2 sm2Var8 = this.L;
            int iQ0 = Q0(s66Var, y66Var, sm2Var8) + sm2Var8.f;
            if (iQ0 >= 0) {
                if (z) {
                    if (iAbs > iQ0) {
                        i2 = (-i3) * iQ0;
                    } else {
                        i2 = i;
                    }
                } else if (iAbs > iQ0) {
                    i2 = i3 * iQ0;
                } else {
                    i2 = i;
                }
                this.N.r(-i2);
                this.L.g = i2;
                return i2;
            }
        }
        return 0;
    }

    @Override // o.x66
    public final PointF a(int i) {
        View viewF;
        if (G() == 0 || (viewF = F(0)) == null) {
            return null;
        }
        int i2 = i < a.O(viewF) ? -1 : 1;
        return j() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.a
    public final void a0(RecyclerView recyclerView) {
    }

    public final int a1(int i) {
        if (G() == 0 || i == 0) {
            return 0;
        }
        P0();
        boolean zJ = j();
        View view = this.W;
        int width = zJ ? view.getWidth() : view.getHeight();
        int i2 = zJ ? this.z : this.A;
        int layoutDirection = this.n.getLayoutDirection();
        qm2 qm2Var = this.M;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + qm2Var.d) - width, iAbs);
            }
            int i3 = qm2Var.d;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - qm2Var.d) - width, i);
            }
            int i4 = qm2Var.d;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    @Override // o.lm2
    public final void b(nm2 nm2Var) {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:73:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0118 A[EDGE_INSN: B:95:0x0118->B:103:? BREAK  A[LOOP:2: B:55:0x00c7->B:74:0x0114], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0114 A[SYNTHETIC] */
    public final void b1(s66 s66Var, sm2 sm2Var) {
        int iG;
        int i;
        int iG2;
        int i2;
        View viewF;
        int i3;
        if (sm2Var.i) {
            int i4 = sm2Var.h;
            int i5 = sm2Var.f;
            yc4 yc4Var = this.I;
            int i6 = -1;
            if (i4 == -1) {
                if (i5 < 0 || (iG2 = G()) == 0 || (viewF = F((i2 = iG2 - 1))) == null || (i3 = ((int[]) yc4Var.f2598o)[a.O(viewF)]) == -1) {
                    return;
                }
                nm2 nm2Var = (nm2) this.H.get(i3);
                for (int i7 = i2; i7 >= 0; i7--) {
                    View viewF2 = F(i7);
                    if (viewF2 != null) {
                        int i8 = sm2Var.f;
                        if (!j() && this.F) {
                            if (this.N.d(viewF2) > i8) {
                                break;
                            }
                            if (nm2Var.f1578o != a.O(viewF2)) {
                                continue;
                            } else if (i3 <= 0) {
                                iG2 = i7;
                                break;
                            } else {
                                i3 += sm2Var.h;
                                nm2Var = (nm2) this.H.get(i3);
                                iG2 = i7;
                            }
                        } else {
                            if (this.N.g(viewF2) < this.N.h() - i8) {
                                break;
                            }
                            if (nm2Var.f1578o != a.O(viewF2)) {
                                continue;
                            } else if (i3 <= 0) {
                                iG2 = i7;
                                break;
                            } else {
                                i3 += sm2Var.h;
                                nm2Var = (nm2) this.H.get(i3);
                                iG2 = i7;
                            }
                        }
                    }
                }
                while (i2 >= iG2) {
                    View viewF3 = F(i2);
                    if (F(i2) != null) {
                        this.m.m(i2);
                    }
                    s66Var.h(viewF3);
                    i2--;
                }
                return;
            }
            if (i5 >= 0 && (iG = G()) != 0) {
                int i9 = 0;
                View viewF4 = F(0);
                if (viewF4 == null || (i = ((int[]) yc4Var.f2598o)[a.O(viewF4)]) == -1) {
                    return;
                }
                nm2 nm2Var2 = (nm2) this.H.get(i);
                while (true) {
                    if (i9 < iG) {
                        View viewF5 = F(i9);
                        if (viewF5 != null) {
                            int i10 = sm2Var.f;
                            if (j() || !this.F) {
                                if (this.N.d(viewF5) <= i10) {
                                    if (nm2Var2.p != a.O(viewF5)) {
                                        continue;
                                    } else {
                                        if (i >= this.H.size() - 1) {
                                            break;
                                        }
                                        i += sm2Var.h;
                                        nm2Var2 = (nm2) this.H.get(i);
                                        i6 = i9;
                                    }
                                }
                            } else if (this.N.h() - this.N.g(viewF5) <= i10) {
                                if (nm2Var2.p != a.O(viewF5)) {
                                    continue;
                                } else if (i >= this.H.size() - 1) {
                                    break;
                                    break;
                                } else {
                                    i += sm2Var.h;
                                    nm2Var2 = (nm2) this.H.get(i);
                                    i6 = i9;
                                }
                            }
                        }
                        i9++;
                    }
                    i9 = i6;
                    break;
                }
                while (i9 >= 0) {
                    View viewF6 = F(i9);
                    if (F(i9) != null) {
                        this.m.m(i9);
                    }
                    s66Var.h(viewF6);
                    i9--;
                }
            }
        }
    }

    @Override // o.lm2
    public final View c(int i) {
        return e(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c1(int i) {
        if (this.B != i) {
            s0();
            this.B = i;
            this.N = null;
            this.O = null;
            this.H.clear();
            qm2 qm2Var = this.M;
            qm2Var.b();
            qm2Var.d = 0;
            x0();
        }
    }

    @Override // o.lm2
    public final int d(int i, int i2, int i3) {
        return a.H(o(), this.z, this.x, i2, i3);
    }

    public final boolean d1(View view, int i, int i2, rm2 rm2Var) {
        return (!view.isLayoutRequested() && this.t && U(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) rm2Var).width) && U(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) rm2Var).height)) ? false : true;
    }

    @Override // o.lm2
    public final View e(int i) {
        View view = (View) this.U.get(i);
        return view != null ? view : this.J.k(i, Long.MAX_VALUE).m;
    }

    public final void e1(int i) {
        View viewV0 = V0(G() - 1, -1);
        if (i >= (viewV0 != null ? a.O(viewV0) : -1)) {
            return;
        }
        int iG = G();
        yc4 yc4Var = this.I;
        yc4Var.A(iG);
        yc4Var.B(iG);
        yc4Var.z(iG);
        if (i >= ((int[]) yc4Var.f2598o).length) {
            return;
        }
        this.X = i;
        View viewF = F(0);
        if (viewF == null) {
            return;
        }
        this.Q = a.O(viewF);
        if (j() || !this.F) {
            this.R = this.N.g(viewF) - this.N.m();
        } else {
            this.R = this.N.j() + this.N.d(viewF);
        }
    }

    @Override // o.lm2
    public final int f(View view, int i, int i2) {
        int i3;
        int i4;
        if (j()) {
            i3 = ((m66) view.getLayoutParams()).n.left;
            i4 = ((m66) view.getLayoutParams()).n.right;
        } else {
            i3 = ((m66) view.getLayoutParams()).n.top;
            i4 = ((m66) view.getLayoutParams()).n.bottom;
        }
        return i3 + i4;
    }

    public final void f1(qm2 qm2Var, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = j() ? this.y : this.x;
            this.L.b = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.L.b = false;
        }
        if (j() || !this.F) {
            this.L.a = this.N.i() - qm2Var.c;
        } else {
            this.L.a = qm2Var.c - getPaddingRight();
        }
        sm2 sm2Var = this.L;
        sm2Var.d = qm2Var.a;
        sm2Var.h = 1;
        sm2Var.e = qm2Var.c;
        sm2Var.f = Integer.MIN_VALUE;
        sm2Var.c = qm2Var.b;
        if (!z || this.H.size() <= 1 || (i = qm2Var.b) < 0 || i >= this.H.size() - 1) {
            return;
        }
        nm2 nm2Var = (nm2) this.H.get(qm2Var.b);
        sm2 sm2Var2 = this.L;
        sm2Var2.c++;
        sm2Var2.d += nm2Var.h;
    }

    @Override // o.lm2
    public final int g(int i, int i2, int i3) {
        return a.H(p(), this.A, this.y, i2, i3);
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i, int i2) {
        e1(i);
    }

    public final void g1(qm2 qm2Var, boolean z, boolean z2) {
        if (z2) {
            int i = j() ? this.y : this.x;
            this.L.b = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.L.b = false;
        }
        if (j() || !this.F) {
            this.L.a = qm2Var.c - this.N.m();
        } else {
            this.L.a = (this.W.getWidth() - qm2Var.c) - this.N.m();
        }
        sm2 sm2Var = this.L;
        sm2Var.d = qm2Var.a;
        sm2Var.h = -1;
        sm2Var.e = qm2Var.c;
        sm2Var.f = Integer.MIN_VALUE;
        int i2 = qm2Var.b;
        sm2Var.c = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.H.size();
        int i3 = qm2Var.b;
        if (size > i3) {
            nm2 nm2Var = (nm2) this.H.get(i3);
            sm2 sm2Var2 = this.L;
            sm2Var2.c--;
            sm2Var2.d -= nm2Var.h;
        }
    }

    @Override // o.lm2
    public final int getAlignContent() {
        return 5;
    }

    @Override // o.lm2
    public final int getAlignItems() {
        return this.D;
    }

    @Override // o.lm2
    public final int getFlexDirection() {
        return this.B;
    }

    @Override // o.lm2
    public final int getFlexItemCount() {
        return this.K.b();
    }

    @Override // o.lm2
    public final List getFlexLinesInternal() {
        return this.H;
    }

    @Override // o.lm2
    public final int getFlexWrap() {
        return this.C ? 1 : 0;
    }

    @Override // o.lm2
    public final int getLargestMainSize() {
        if (this.H.size() == 0) {
            return 0;
        }
        int size = this.H.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((nm2) this.H.get(i)).e);
        }
        return iMax;
    }

    @Override // o.lm2
    public final int getMaxLine() {
        return this.E;
    }

    @Override // o.lm2
    public final int getSumOfCrossSize() {
        int size = this.H.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((nm2) this.H.get(i2)).g;
        }
        return i;
    }

    @Override // o.lm2
    public final void h(View view, int i, int i2, nm2 nm2Var) {
        n(view, Z);
        if (j()) {
            int i3 = ((m66) view.getLayoutParams()).n.left + ((m66) view.getLayoutParams()).n.right;
            nm2Var.e += i3;
            nm2Var.f += i3;
        } else {
            int i4 = ((m66) view.getLayoutParams()).n.top + ((m66) view.getLayoutParams()).n.bottom;
            nm2Var.e += i4;
            nm2Var.f += i4;
        }
    }

    @Override // o.lm2
    public final void i(View view, int i) {
        this.U.put(i, view);
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(int i, int i2) {
        e1(Math.min(i, i2));
    }

    @Override // o.lm2
    public final boolean j() {
        byte b = this.B;
        return b == 0 || b == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(int i, int i2) {
        e1(i);
    }

    @Override // o.lm2
    public final int k(View view) {
        int i;
        int i2;
        if (j()) {
            i = ((m66) view.getLayoutParams()).n.top;
            i2 = ((m66) view.getLayoutParams()).n.bottom;
        } else {
            i = ((m66) view.getLayoutParams()).n.left;
            i2 = ((m66) view.getLayoutParams()).n.right;
        }
        return i + i2;
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(int i) {
        e1(i);
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(RecyclerView recyclerView, int i, int i2) {
        e1(i);
        e1(i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0175  */
    /* JADX WARN: Code duplicated, block: B:106:0x018c  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:135:0x020f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0215  */
    /* JADX WARN: Code duplicated, block: B:142:0x0222  */
    /* JADX WARN: Code duplicated, block: B:143:0x022f  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x011a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x0131  */
    /* JADX WARN: Code duplicated, block: B:86:0x013d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0143  */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0157  */
    /* JADX WARN: Code duplicated, block: B:97:0x016b  */
    /* JADX WARN: Code duplicated, block: B:98:0x016d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.a
    public final void m0(s66 s66Var, y66 y66Var) {
        View viewR0;
        FlexboxLayoutManager flexboxLayoutManager;
        vy1 vy1Var;
        int iO;
        int i;
        int size;
        int i2;
        int i3;
        View viewB;
        View viewF;
        boolean z;
        int iG;
        vy1 vy1Var2;
        boolean z2;
        vy1 vy1Var3;
        int iG2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        this.J = s66Var;
        this.K = y66Var;
        int iB = y66Var.b();
        if (iB == 0 && y66Var.g) {
            return;
        }
        int layoutDirection = this.n.getLayoutDirection();
        byte b = this.B;
        boolean z5 = this.C;
        if (b == 0) {
            this.F = layoutDirection == 1;
            this.G = z5 == 2;
        } else if (b == 1) {
            this.F = layoutDirection != 1;
            this.G = z5 == 2;
        } else if (b == 2) {
            boolean z6 = layoutDirection == 1;
            this.F = z6;
            if (z5 == 2) {
                this.F = !z6;
            }
            this.G = false;
        } else if (b != 3) {
            this.F = false;
            this.G = false;
        } else {
            boolean z7 = layoutDirection == 1;
            this.F = z7;
            if (z5 == 2) {
                this.F = !z7;
            }
            this.G = true;
        }
        P0();
        if (this.L == null) {
            sm2 sm2Var = new sm2();
            sm2Var.h = 1;
            this.L = sm2Var;
        }
        yc4 yc4Var = this.I;
        yc4Var.A(iB);
        yc4Var.B(iB);
        yc4Var.z(iB);
        this.L.i = false;
        tm2 tm2Var = this.P;
        if (tm2Var != null && (i7 = tm2Var.m) >= 0 && i7 < iB) {
            this.Q = i7;
        }
        qm2 qm2Var = this.M;
        if (!qm2Var.f || this.Q != -1 || tm2Var != null) {
            qm2Var.b();
            tm2 tm2Var2 = this.P;
            if (y66Var.g || (i3 = this.Q) == -1) {
                if (G() != 0) {
                    if (qm2Var.e) {
                        viewR0 = T0(y66Var.b());
                    } else {
                        viewR0 = R0(y66Var.b());
                    }
                    if (viewR0 != null) {
                        flexboxLayoutManager = qm2Var.h;
                        if (flexboxLayoutManager.C) {
                            vy1Var = flexboxLayoutManager.N;
                        } else {
                            vy1Var = flexboxLayoutManager.O;
                        }
                        if (flexboxLayoutManager.j() && flexboxLayoutManager.F) {
                            if (qm2Var.e) {
                                qm2Var.c = vy1Var.o() + vy1Var.g(viewR0);
                            } else {
                                qm2Var.c = vy1Var.d(viewR0);
                            }
                        } else if (qm2Var.e) {
                            qm2Var.c = vy1Var.o() + vy1Var.d(viewR0);
                        } else {
                            qm2Var.c = vy1Var.g(viewR0);
                        }
                        iO = a.O(viewR0);
                        qm2Var.a = iO;
                        qm2Var.g = false;
                        int[] iArr = (int[]) flexboxLayoutManager.I.f2598o;
                        if (iO == -1) {
                            iO = 0;
                        }
                        i = iArr[iO];
                        if (i == -1) {
                            i = 0;
                        }
                        qm2Var.b = i;
                        size = flexboxLayoutManager.H.size();
                        i2 = qm2Var.b;
                        if (size > i2) {
                            qm2Var.a = ((nm2) flexboxLayoutManager.H.get(i2)).f1578o;
                        }
                    } else {
                        qm2Var.a();
                        qm2Var.a = 0;
                        qm2Var.b = 0;
                    }
                } else {
                    qm2Var.a();
                    qm2Var.a = 0;
                    qm2Var.b = 0;
                }
            } else if (i3 < 0 || i3 >= y66Var.b()) {
                this.Q = -1;
                this.R = Integer.MIN_VALUE;
                if (G() != 0) {
                    if (qm2Var.e) {
                        viewR0 = T0(y66Var.b());
                    } else {
                        viewR0 = R0(y66Var.b());
                    }
                    if (viewR0 != null) {
                        flexboxLayoutManager = qm2Var.h;
                        if (flexboxLayoutManager.C) {
                            vy1Var = flexboxLayoutManager.O;
                        } else {
                            vy1Var = flexboxLayoutManager.N;
                        }
                        if (flexboxLayoutManager.j()) {
                            if (qm2Var.e) {
                                qm2Var.c = vy1Var.o() + vy1Var.d(viewR0);
                            } else {
                                qm2Var.c = vy1Var.g(viewR0);
                            }
                        } else if (qm2Var.e) {
                            qm2Var.c = vy1Var.o() + vy1Var.d(viewR0);
                        } else {
                            qm2Var.c = vy1Var.g(viewR0);
                        }
                        iO = a.O(viewR0);
                        qm2Var.a = iO;
                        qm2Var.g = false;
                        int[] iArr2 = (int[]) flexboxLayoutManager.I.f2598o;
                        if (iO == -1) {
                            iO = 0;
                        }
                        i = iArr2[iO];
                        if (i == -1) {
                            i = 0;
                        }
                        qm2Var.b = i;
                        size = flexboxLayoutManager.H.size();
                        i2 = qm2Var.b;
                        if (size > i2) {
                            qm2Var.a = ((nm2) flexboxLayoutManager.H.get(i2)).f1578o;
                        }
                    } else {
                        qm2Var.a();
                        qm2Var.a = 0;
                        qm2Var.b = 0;
                    }
                } else {
                    qm2Var.a();
                    qm2Var.a = 0;
                    qm2Var.b = 0;
                }
            } else {
                int i8 = this.Q;
                qm2Var.a = i8;
                qm2Var.b = ((int[]) yc4Var.f2598o)[i8];
                tm2 tm2Var3 = this.P;
                if (tm2Var3 != null) {
                    int iB2 = y66Var.b();
                    int i9 = tm2Var3.m;
                    if (i9 >= 0 && i9 < iB2) {
                        qm2Var.c = this.N.m() + tm2Var2.n;
                        qm2Var.g = true;
                        qm2Var.b = -1;
                    } else if (this.R == Integer.MIN_VALUE) {
                        viewB = B(this.Q);
                        if (viewB != null) {
                            if (G() > 0 && (viewF = F(0)) != null) {
                                if (this.Q < a.O(viewF)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                qm2Var.e = z;
                            }
                            qm2Var.a();
                        } else if (this.N.e(viewB) > this.N.n()) {
                            qm2Var.a();
                        } else {
                            iG = this.N.g(viewB) - this.N.m();
                            vy1Var2 = this.N;
                            if (iG < 0) {
                                qm2Var.c = vy1Var2.m();
                                qm2Var.e = false;
                            } else if (vy1Var2.i() - this.N.d(viewB) < 0) {
                                qm2Var.c = this.N.i();
                                qm2Var.e = true;
                            } else {
                                z2 = qm2Var.e;
                                vy1Var3 = this.N;
                                if (z2) {
                                    iG2 = this.N.o() + vy1Var3.d(viewB);
                                } else {
                                    iG2 = vy1Var3.g(viewB);
                                }
                                qm2Var.c = iG2;
                            }
                        }
                    } else if (j() && this.F) {
                        qm2Var.c = this.R - this.N.j();
                    } else {
                        qm2Var.c = this.N.m() + this.R;
                    }
                } else if (this.R == Integer.MIN_VALUE) {
                    viewB = B(this.Q);
                    if (viewB != null) {
                        if (G() > 0) {
                            if (this.Q < a.O(viewF)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            qm2Var.e = z;
                        }
                        qm2Var.a();
                    } else if (this.N.e(viewB) > this.N.n()) {
                        qm2Var.a();
                    } else {
                        iG = this.N.g(viewB) - this.N.m();
                        vy1Var2 = this.N;
                        if (iG < 0) {
                            qm2Var.c = vy1Var2.m();
                            qm2Var.e = false;
                        } else if (vy1Var2.i() - this.N.d(viewB) < 0) {
                            qm2Var.c = this.N.i();
                            qm2Var.e = true;
                        } else {
                            z2 = qm2Var.e;
                            vy1Var3 = this.N;
                            if (z2) {
                                iG2 = this.N.o() + vy1Var3.d(viewB);
                            } else {
                                iG2 = vy1Var3.g(viewB);
                            }
                            qm2Var.c = iG2;
                        }
                    }
                } else if (j()) {
                    qm2Var.c = this.N.m() + this.R;
                } else {
                    qm2Var.c = this.N.m() + this.R;
                }
            }
            qm2Var.f = true;
        }
        A(s66Var);
        if (qm2Var.e) {
            g1(qm2Var, false, true);
        } else {
            f1(qm2Var, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.z, this.x);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.A, this.y);
        int i10 = this.z;
        int i11 = this.A;
        boolean zJ = j();
        Context context = this.V;
        if (zJ) {
            int i12 = this.S;
            z3 = (i12 == Integer.MIN_VALUE || i12 == i10) ? false : true;
            sm2 sm2Var2 = this.L;
            i4 = sm2Var2.b ? context.getResources().getDisplayMetrics().heightPixels : sm2Var2.a;
        } else {
            int i13 = this.T;
            z3 = (i13 == Integer.MIN_VALUE || i13 == i11) ? false : true;
            sm2 sm2Var3 = this.L;
            i4 = sm2Var3.b ? context.getResources().getDisplayMetrics().widthPixels : sm2Var3.a;
        }
        int i14 = i4;
        this.S = i10;
        this.T = i11;
        int i15 = this.X;
        nd ndVar = this.Y;
        if (i15 != -1 || (this.Q == -1 && !z3)) {
            int iMin = qm2Var.a;
            if (i15 != -1) {
                iMin = Math.min(i15, iMin);
            }
            ndVar.f1562o = null;
            ndVar.n = 0;
            boolean zJ2 = j();
            List list = this.H;
            if (zJ2) {
                if (list.size() > 0) {
                    yc4Var.t(iMin, this.H);
                    this.I.p(this.Y, iMakeMeasureSpec, iMakeMeasureSpec2, i14, iMin, qm2Var.a, this.H);
                } else {
                    yc4Var.z(iB);
                    this.I.p(this.Y, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, -1, this.H);
                }
            } else if (list.size() > 0) {
                yc4Var.t(iMin, this.H);
                int i16 = iMin;
                this.I.p(this.Y, iMakeMeasureSpec2, iMakeMeasureSpec, i14, i16, qm2Var.a, this.H);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i16;
            } else {
                yc4Var.z(iB);
                this.I.p(this.Y, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, -1, this.H);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.H = (List) ndVar.f1562o;
            yc4Var.y(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            yc4Var.a0(iMin);
        } else if (!qm2Var.e) {
            this.H.clear();
            ndVar.f1562o = null;
            ndVar.n = 0;
            boolean zJ3 = j();
            int i17 = qm2Var.a;
            yc4 yc4Var2 = this.I;
            nd ndVar2 = this.Y;
            if (zJ3) {
                yc4Var2.p(ndVar2, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, i17, this.H);
            } else {
                yc4Var2.p(ndVar2, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, i17, this.H);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.H = (List) ndVar.f1562o;
            yc4Var.y(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            yc4Var.a0(0);
            int i18 = ((int[]) yc4Var.f2598o)[qm2Var.a];
            qm2Var.b = i18;
            this.L.c = i18;
        }
        Q0(s66Var, y66Var, this.L);
        boolean z8 = qm2Var.e;
        sm2 sm2Var4 = this.L;
        if (z8) {
            i6 = sm2Var4.e;
            z4 = true;
            f1(qm2Var, true, false);
            Q0(s66Var, y66Var, this.L);
            i5 = this.L.e;
        } else {
            z4 = true;
            i5 = sm2Var4.e;
            g1(qm2Var, true, false);
            Q0(s66Var, y66Var, this.L);
            i6 = this.L.e;
        }
        if (G() > 0) {
            if (qm2Var.e) {
                Y0(X0(i5, s66Var, y66Var, z4) + i6, s66Var, y66Var, false);
            } else {
                X0(Y0(i6, s66Var, y66Var, z4) + i5, s66Var, y66Var, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void n0(y66 y66Var) {
        this.P = null;
        this.Q = -1;
        this.R = Integer.MIN_VALUE;
        this.X = -1;
        this.M.b();
        this.U.clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean o() {
        if (!this.C) {
            return j();
        }
        if (!j()) {
            return true;
        }
        int i = this.z;
        View view = this.W;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.a
    public final void o0(Parcelable parcelable) {
        if (parcelable instanceof tm2) {
            this.P = (tm2) parcelable;
            x0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean p() {
        if (!this.C) {
            return !j();
        }
        if (!j()) {
            int i = this.A;
            View view = this.W;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final Parcelable p0() {
        tm2 tm2Var = this.P;
        if (tm2Var != null) {
            tm2 tm2Var2 = new tm2();
            tm2Var2.m = tm2Var.m;
            tm2Var2.n = tm2Var.n;
            return tm2Var2;
        }
        tm2 tm2Var3 = new tm2();
        if (G() <= 0) {
            tm2Var3.m = -1;
            return tm2Var3;
        }
        View viewF = F(0);
        tm2Var3.m = a.O(viewF);
        tm2Var3.n = this.N.g(viewF) - this.N.m();
        return tm2Var3;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean q(m66 m66Var) {
        return m66Var instanceof rm2;
    }

    @Override // o.lm2
    public final void setFlexLines(List list) {
        this.H = list;
    }

    @Override // androidx.recyclerview.widget.a
    public final int u(y66 y66Var) {
        return M0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int v(y66 y66Var) {
        return N0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int w(y66 y66Var) {
        return O0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int x(y66 y66Var) {
        return M0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int y(y66 y66Var) {
        return N0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int y0(int i, s66 s66Var, y66 y66Var) {
        if (!j() || !this.C) {
            int iZ0 = Z0(i, s66Var, y66Var);
            this.U.clear();
            return iZ0;
        }
        int iA1 = a1(i);
        this.M.d += iA1;
        this.O.r(-iA1);
        return iA1;
    }

    @Override // androidx.recyclerview.widget.a
    public final int z(y66 y66Var) {
        return O0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void z0(int i) {
        this.Q = i;
        this.R = Integer.MIN_VALUE;
        tm2 tm2Var = this.P;
        if (tm2Var != null) {
            tm2Var.m = -1;
        }
        x0();
    }
}
