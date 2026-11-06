package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import o.a4;
import o.be8;
import o.c76;
import o.d66;
import o.f4;
import o.fx3;
import o.g4;
import o.hk0;
import o.m66;
import o.rr0;
import o.s66;
import o.to7;
import o.w94;
import o.x94;
import o.y03;
import o.y66;
import o.y94;
import o.yq4;
import o.yt2;
import o.z94;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set b0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean Q;
    public final int R;
    public int[] S;
    public View[] T;
    public final SparseIntArray U;
    public final SparseIntArray V;
    public final yt2 W;
    public final Rect X;
    public int Y;
    public int Z;
    public int a0;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Q = false;
        this.R = -1;
        this.U = new SparseIntArray();
        this.V = new SparseIntArray();
        yt2 yt2Var = new yt2((byte) 7);
        this.W = yt2Var;
        this.X = new Rect();
        this.Y = -1;
        this.Z = -1;
        this.a0 = -1;
        int i3 = a.P(context, attributeSet, i, i2).b;
        if (i3 == this.R) {
            return;
        }
        this.Q = true;
        if (i3 < 1) {
            hk0.g(fx3.e(i3, "Span count should be at least 1. Provided "));
            throw null;
        }
        this.R = i3;
        yt2Var.I();
        x0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int A0(int i, s66 s66Var, y66 y66Var) {
        z1();
        p1();
        return super.A0(i, s66Var, y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final m66 C() {
        return this.B == 0 ? new y03(-2, -1) : new y03(-1, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final m66 D(Context context, AttributeSet attributeSet) {
        y03 y03Var = new y03(context, attributeSet);
        y03Var.q = -1;
        y03Var.r = 0;
        return y03Var;
    }

    @Override // androidx.recyclerview.widget.a
    public final void D0(Rect rect, int i, int i2) {
        int iR;
        int iR2;
        if (this.S == null) {
            super.D0(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.B == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.n;
            WeakHashMap weakHashMap = be8.a;
            iR2 = a.r(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.S;
            iR = a.r(i, iArr[iArr.length - 1] + paddingRight, this.n.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.n;
            WeakHashMap weakHashMap2 = be8.a;
            iR = a.r(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.S;
            iR2 = a.r(i2, iArr2[iArr2.length - 1] + paddingBottom, this.n.getMinimumHeight());
        }
        this.n.setMeasuredDimension(iR, iR2);
    }

    @Override // androidx.recyclerview.widget.a
    public final m66 E(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            y03 y03Var = new y03((ViewGroup.MarginLayoutParams) layoutParams);
            y03Var.q = -1;
            y03Var.r = 0;
            return y03Var;
        }
        y03 y03Var2 = new y03(layoutParams);
        y03Var2.q = -1;
        y03Var2.r = 0;
        return y03Var2;
    }

    @Override // androidx.recyclerview.widget.a
    public final int I(s66 s66Var, y66 y66Var) {
        if (this.B == 1) {
            return Math.min(this.R, N());
        }
        if (y66Var.b() < 1) {
            return 0;
        }
        return v1(y66Var.b() - 1, s66Var, y66Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean L0() {
        return this.L == null && !this.Q;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void M0(y66 y66Var, y94 y94Var, rr0 rr0Var) {
        int i = this.R;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = y94Var.d;
            if (i4 < 0 || i4 >= y66Var.b() || i2 <= 0) {
                return;
            }
            rr0Var.c(y94Var.d, Math.max(0, y94Var.g));
            this.W.getClass();
            i2--;
            y94Var.d += y94Var.e;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int Q(s66 s66Var, y66 y66Var) {
        if (this.B == 0) {
            return Math.min(this.R, N());
        }
        if (y66Var.b() < 1) {
            return 0;
        }
        return v1(y66Var.b() - 1, s66Var, y66Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View X0(s66 s66Var, y66 y66Var, boolean z, boolean z2) {
        int i;
        int iG;
        int iG2 = G();
        int i2 = 1;
        if (z2) {
            iG = G() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iG2;
            iG = 0;
        }
        int iB = y66Var.b();
        R0();
        int iM = this.D.m();
        int i3 = this.D.i();
        View view = null;
        View view2 = null;
        while (iG != i) {
            View viewF = F(iG);
            int iO = a.O(viewF);
            if (iO >= 0 && iO < iB && w1(iO, s66Var, y66Var) == 0) {
                if (((m66) viewF.getLayoutParams()).m.i()) {
                    if (view2 == null) {
                        view2 = viewF;
                    }
                } else {
                    if (this.D.g(viewF) < i3 && this.D.d(viewF) >= iM) {
                        return viewF;
                    }
                    if (view == null) {
                        view = viewF;
                    }
                }
            }
            iG += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View b0(android.view.View r23, int r24, o.s66 r25, o.y66 r26) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.b0(android.view.View, int, o.s66, o.y66):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void d0(s66 s66Var, y66 y66Var, g4 g4Var) {
        super.d0(s66Var, y66Var, g4Var);
        g4Var.i("android.widget.GridView");
        d66 d66Var = this.n.y;
        if (d66Var == null || d66Var.a() <= 1) {
            return;
        }
        g4Var.b(a4.r);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(s66 s66Var, y66 y66Var, y94 y94Var, x94 x94Var) {
        int i;
        int i2;
        int i3;
        int iF;
        int paddingLeft;
        int iH;
        int iH2;
        boolean z;
        View viewB;
        int iL = this.D.l();
        boolean z2 = iL != 1073741824;
        int iG = G();
        int i4 = this.R;
        int i5 = iG > 0 ? this.S[i4] : 0;
        if (z2) {
            z1();
        }
        boolean z3 = y94Var.e == 1;
        int iX1 = !z3 ? x1(y94Var.d, s66Var, y66Var) + w1(y94Var.d, s66Var, y66Var) : i4;
        int i6 = 0;
        while (i6 < i4) {
            int i7 = y94Var.d;
            if (i7 < 0 || i7 >= y66Var.b() || iX1 <= 0) {
                break;
            }
            int i8 = y94Var.d;
            int iX2 = x1(i8, s66Var, y66Var);
            if (iX2 > i4) {
                hk0.g(to7.l(fx3.j(i8, iX2, "Item at position ", " requires ", " spans but GridLayoutManager has only "), i4, " spans."));
                return;
            }
            iX1 -= iX2;
            if (iX1 < 0 || (viewB = y94Var.b(s66Var)) == null) {
                break;
            }
            this.T[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            x94Var.b = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i9 = 0;
        while (i != i2) {
            View view = this.T[i];
            y03 y03Var = (y03) view.getLayoutParams();
            int iX3 = x1(a.O(view), s66Var, y66Var);
            y03Var.r = iX3;
            y03Var.q = i9;
            i9 += iX3;
            i += i3;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            View view2 = this.T[i11];
            if (y94Var.k != null) {
                z = false;
                if (z3) {
                    l(view2, -1, true);
                } else {
                    l(view2, 0, true);
                }
            } else if (z3) {
                z = false;
                l(view2, -1, false);
            } else {
                z = false;
                l(view2, 0, false);
            }
            n(view2, this.X);
            y1(view2, iL, z);
            int iE = this.D.e(view2);
            if (iE > i10) {
                i10 = iE;
            }
            float f2 = (this.D.f(view2) * 1.0f) / ((y03) view2.getLayoutParams()).r;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            o1(Math.max(Math.round(f * i4), i5));
            i10 = 0;
            for (int i12 = 0; i12 < i6; i12++) {
                View view3 = this.T[i12];
                y1(view3, 1073741824, true);
                int iE2 = this.D.e(view3);
                if (iE2 > i10) {
                    i10 = iE2;
                }
            }
        }
        for (int i13 = 0; i13 < i6; i13++) {
            View view4 = this.T[i13];
            if (this.D.e(view4) != i10) {
                y03 y03Var2 = (y03) view4.getLayoutParams();
                Rect rect = y03Var2.n;
                int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) y03Var2).topMargin + ((ViewGroup.MarginLayoutParams) y03Var2).bottomMargin;
                int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) y03Var2).leftMargin + ((ViewGroup.MarginLayoutParams) y03Var2).rightMargin;
                int iU1 = u1(y03Var2.q, y03Var2.r);
                if (this.B == 1) {
                    iH2 = a.H(false, iU1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) y03Var2).width);
                    iH = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iH = a.H(false, iU1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) y03Var2).height);
                    iH2 = iMakeMeasureSpec;
                }
                if (I0(view4, iH2, iH, (m66) view4.getLayoutParams())) {
                    view4.measure(iH2, iH);
                }
            }
        }
        int paddingTop = 0;
        x94Var.a = i10;
        int i16 = this.B;
        int i17 = y94Var.f;
        int iF2 = y94Var.b;
        if (i16 != 1) {
            if (i17 == -1) {
                paddingLeft = iF2 - i10;
                iF = iF2;
            } else {
                iF = iF2 + i10;
                paddingLeft = iF2;
            }
            iF2 = paddingTop;
        } else if (i17 == -1) {
            paddingTop = iF2 - i10;
            paddingLeft = 0;
            iF = 0;
        } else {
            iF = 0;
            paddingTop = iF2;
            iF2 += i10;
            paddingLeft = 0;
        }
        int i18 = 0;
        while (true) {
            View[] viewArr = this.T;
            if (i18 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i18];
            y03 y03Var3 = (y03) view5.getLayoutParams();
            if (this.B != 1) {
                paddingTop = getPaddingTop() + this.S[y03Var3.q];
                iF2 = this.D.f(view5) + paddingTop;
            } else if (c1()) {
                int paddingLeft2 = getPaddingLeft() + this.S[i4 - y03Var3.q];
                iF = paddingLeft2;
                paddingLeft = paddingLeft2 - this.D.f(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.S[y03Var3.q];
                iF = this.D.f(view5) + paddingLeft;
            }
            a.V(view5, paddingLeft, paddingTop, iF, iF2);
            if (y03Var3.m.i() || y03Var3.m.l()) {
                x94Var.c = true;
            }
            x94Var.d = view5.hasFocusable() | x94Var.d;
            i18++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void e1(s66 s66Var, y66 y66Var, w94 w94Var, int i) {
        z1();
        if (y66Var.b() > 0 && !y66Var.g) {
            boolean z = i == 1;
            int iW1 = w1(w94Var.b, s66Var, y66Var);
            if (z) {
                while (iW1 > 0) {
                    int i2 = w94Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    w94Var.b = i3;
                    iW1 = w1(i3, s66Var, y66Var);
                }
            } else {
                int iB = y66Var.b() - 1;
                int i4 = w94Var.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iW2 = w1(i5, s66Var, y66Var);
                    if (iW2 <= iW1) {
                        break;
                    }
                    i4 = i5;
                    iW1 = iW2;
                }
                w94Var.b = i4;
            }
        }
        p1();
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(s66 s66Var, y66 y66Var, View view, g4 g4Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof y03)) {
            e0(view, g4Var);
            return;
        }
        y03 y03Var = (y03) layoutParams;
        int iV1 = v1(y03Var.m.c(), s66Var, y66Var);
        int i = this.B;
        int i2 = y03Var.q;
        int i3 = y03Var.r;
        if (i == 0) {
            g4Var.j(f4.c(false, i2, i3, iV1, 1));
        } else {
            g4Var.j(f4.c(false, iV1, 1, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i, int i2) {
        yt2 yt2Var = this.W;
        yt2Var.I();
        ((SparseIntArray) yt2Var.f2642o).clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final void h0() {
        yt2 yt2Var = this.W;
        yt2Var.I();
        ((SparseIntArray) yt2Var.f2642o).clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(int i, int i2) {
        yt2 yt2Var = this.W;
        yt2Var.I();
        ((SparseIntArray) yt2Var.f2642o).clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(int i, int i2) {
        yt2 yt2Var = this.W;
        yt2Var.I();
        ((SparseIntArray) yt2Var.f2642o).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void k1(boolean z) {
        if (z) {
            yq4.r("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.k1(false);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(RecyclerView recyclerView, int i, int i2) {
        yt2 yt2Var = this.W;
        yt2Var.I();
        ((SparseIntArray) yt2Var.f2642o).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void m0(s66 s66Var, y66 y66Var) {
        boolean z = y66Var.g;
        SparseIntArray sparseIntArray = this.V;
        SparseIntArray sparseIntArray2 = this.U;
        if (z) {
            int iG = G();
            for (int i = 0; i < iG; i++) {
                y03 y03Var = (y03) F(i).getLayoutParams();
                int iC = y03Var.m.c();
                sparseIntArray2.put(iC, y03Var.r);
                sparseIntArray.put(iC, y03Var.q);
            }
        }
        super.m0(s66Var, y66Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void n0(y66 y66Var) {
        View viewB;
        super.n0(y66Var);
        this.Q = false;
        int i = this.Y;
        if (i == -1 || (viewB = B(i)) == null) {
            return;
        }
        viewB.sendAccessibilityEvent(67108864);
        this.Y = -1;
    }

    public final void o1(int i) {
        int i2;
        int[] iArr = this.S;
        int i3 = this.R;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.S = iArr;
    }

    public final void p1() {
        View[] viewArr = this.T;
        if (viewArr == null || viewArr.length != this.R) {
            this.T = new View[this.R];
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean q(m66 m66Var) {
        return m66Var instanceof y03;
    }

    public final int q1(int i) {
        int i2 = this.B;
        RecyclerView recyclerView = this.n;
        return i2 == 0 ? v1(i, recyclerView.f23o, recyclerView.s0) : w1(i, recyclerView.f23o, recyclerView.s0);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9 A[EDGE_INSN: B:122:0x01a9->B:166:0x027c BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da A[LOOP:3: B:129:0x01c7->B:134:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:209:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[LOOP:4: B:137:0x01ed->B:214:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[LOOP:7: B:161:0x025c->B:224:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean r0(int i, Bundle bundle) {
        View viewF;
        c76 c76VarL;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == a4.r.a() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= G()) {
                    viewF = null;
                    break;
                }
                View viewF2 = F(i5);
                Objects.requireNonNull(viewF2);
                if (viewF2.isAccessibilityFocused()) {
                    viewF = F(i5);
                    break;
                }
                i5++;
            }
            if (viewF != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (b0.contains(Integer.valueOf(i6)) && (c76VarL = this.n.L(viewF)) != null) {
                    int iB = c76VarL.b();
                    int iR1 = r1(iB);
                    int iQ1 = q1(iB);
                    if (iR1 >= 0 && iQ1 >= 0) {
                        if (!s1(iB).contains(Integer.valueOf(this.Z)) || !t1(q1(iB), iB).contains(Integer.valueOf(this.a0))) {
                            this.Z = iR1;
                            this.a0 = iQ1;
                        }
                        int i7 = this.Z;
                        if (i7 == -1) {
                            i7 = iR1;
                        }
                        int i8 = this.a0;
                        if (i8 != -1) {
                            iQ1 = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = iB - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iR2 = r1(iIntValue);
                                    int iQ2 = q1(iIntValue);
                                    if (iR2 >= 0 && iQ2 >= 0) {
                                        if (this.B != 1) {
                                            if (s1(iIntValue).contains(Integer.valueOf(i7)) && iQ2 < iQ1) {
                                                this.a0 = iQ2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iR2 == i7 && iQ2 < iQ1) || iR2 < i7) {
                                                this.Z = iR2;
                                                this.a0 = iQ2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iR1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < N()) {
                                                    it2 = s1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iR1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.Z = iIntValue2;
                                                                this.a0 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iR1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < N()) {
                                                it4 = s1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iR1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.Z = iIntValue3;
                                                            this.a0 = q1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                z0(iIntValue);
                                this.Y = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = iB - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iR3 = r1(iIntValue);
                                    int iQ3 = q1(iIntValue);
                                    if (iR3 >= 0 && iQ3 >= 0) {
                                        if (this.B != 1) {
                                            if (iR3 < i7 && iQ3 == iQ1) {
                                                this.Z = ((Integer) Collections.max(s1(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iR3 < i7 && t1(q1(iIntValue), iIntValue).contains(Integer.valueOf(iQ1))) {
                                                this.Z = iR3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iR1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < N()) {
                                                    it2 = s1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iR1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.Z = iIntValue2;
                                                                this.a0 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iR1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < N()) {
                                                it4 = s1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iR1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.Z = iIntValue3;
                                                            this.a0 = q1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                z0(iIntValue);
                                this.Y = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iB + 1;
                            while (true) {
                                if (iIntValue < N()) {
                                    int iR4 = r1(iIntValue);
                                    int iQ4 = q1(iIntValue);
                                    if (iR4 >= 0 && iQ4 >= 0) {
                                        if (this.B != 1) {
                                            if (iQ4 > iQ1 && s1(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.a0 = iQ4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iR4 == i7 && iQ4 > iQ1) || iR4 > i7) {
                                                this.Z = iR4;
                                                this.a0 = iQ4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iR1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < N()) {
                                                    it2 = s1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iR1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.Z = iIntValue2;
                                                                this.a0 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iR1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < N()) {
                                                it4 = s1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iR1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.Z = iIntValue3;
                                                            this.a0 = q1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                z0(iIntValue);
                                this.Y = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iB + 1;
                            while (true) {
                                if (iIntValue < N()) {
                                    int iR5 = r1(iIntValue);
                                    int iQ5 = q1(iIntValue);
                                    if (iR5 >= 0 && iQ5 >= 0) {
                                        if (this.B != 1) {
                                            if (iR5 > i7 && iQ5 == iQ1) {
                                                this.Z = r1(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iR5 > i7 && (iQ5 == iQ1 || t1(q1(iIntValue), iIntValue).contains(Integer.valueOf(iQ1)))) {
                                                this.Z = iR5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.B) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iR1 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < N()) {
                                                it2 = s1(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iR1) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.Z = iIntValue2;
                                                            this.a0 = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iR1 < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < N()) {
                                            it4 = s1(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iR1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.Z = iIntValue3;
                                                        this.a0 = q1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                z0(iIntValue);
                                this.Y = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.r0(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iA = this.n.y.a();
                int i11 = 0;
                while (true) {
                    if (i11 >= iA) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.n;
                    int iW1 = w1(i11, recyclerView.f23o, recyclerView.s0);
                    RecyclerView recyclerView2 = this.n;
                    int iV1 = v1(i11, recyclerView2.f23o, recyclerView2.s0);
                    if (this.B != 1) {
                        if (iW1 == i9 && iV1 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iW1 == i10 && iV1 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    this.J = i11;
                    this.K = 0;
                    z94 z94Var = this.L;
                    if (z94Var != null) {
                        z94Var.m = -1;
                    }
                    x0();
                    return true;
                }
            }
        }
        return false;
    }

    public final int r1(int i) {
        int i2 = this.B;
        RecyclerView recyclerView = this.n;
        return i2 == 1 ? v1(i, recyclerView.f23o, recyclerView.s0) : w1(i, recyclerView.f23o, recyclerView.s0);
    }

    public final HashSet s1(int i) {
        return t1(r1(i), i);
    }

    public final HashSet t1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.n;
        int iX1 = x1(i2, recyclerView.f23o, recyclerView.s0);
        for (int i3 = i; i3 < i + iX1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public final int u1(int i, int i2) {
        if (this.B != 1 || !c1()) {
            int[] iArr = this.S;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.S;
        int i3 = this.R;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int v(y66 y66Var) {
        return O0(y66Var);
    }

    public final int v1(int i, s66 s66Var, y66 y66Var) {
        boolean z = y66Var.g;
        int i2 = this.R;
        yt2 yt2Var = this.W;
        if (!z) {
            yt2Var.getClass();
            return yt2.H(i, i2);
        }
        int iB = s66Var.b(i);
        if (iB != -1) {
            yt2Var.getClass();
            return yt2.H(iB, i2);
        }
        v0.j("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int w(y66 y66Var) {
        return P0(y66Var);
    }

    public final int w1(int i, s66 s66Var, y66 y66Var) {
        boolean z = y66Var.g;
        int i2 = this.R;
        yt2 yt2Var = this.W;
        if (!z) {
            yt2Var.getClass();
            return i % i2;
        }
        int i3 = this.V.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = s66Var.b(i);
        if (iB != -1) {
            yt2Var.getClass();
            return iB % i2;
        }
        v0.j("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int x1(int i, s66 s66Var, y66 y66Var) {
        boolean z = y66Var.g;
        yt2 yt2Var = this.W;
        if (!z) {
            yt2Var.getClass();
            return 1;
        }
        int i2 = this.U.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (s66Var.b(i) != -1) {
            yt2Var.getClass();
            return 1;
        }
        v0.j("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int y(y66 y66Var) {
        return O0(y66Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int y0(int i, s66 s66Var, y66 y66Var) {
        z1();
        p1();
        return super.y0(i, s66Var, y66Var);
    }

    public final void y1(View view, int i, boolean z) {
        int iH;
        int iH2;
        y03 y03Var = (y03) view.getLayoutParams();
        Rect rect = y03Var.n;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) y03Var).topMargin + ((ViewGroup.MarginLayoutParams) y03Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) y03Var).leftMargin + ((ViewGroup.MarginLayoutParams) y03Var).rightMargin;
        int iU1 = u1(y03Var.q, y03Var.r);
        if (this.B == 1) {
            iH2 = a.H(false, iU1, i, i3, ((ViewGroup.MarginLayoutParams) y03Var).width);
            iH = a.H(true, this.D.n(), this.y, i2, ((ViewGroup.MarginLayoutParams) y03Var).height);
        } else {
            int iH3 = a.H(false, iU1, i, i2, ((ViewGroup.MarginLayoutParams) y03Var).height);
            int iH4 = a.H(true, this.D.n(), this.x, i3, ((ViewGroup.MarginLayoutParams) y03Var).width);
            iH = iH3;
            iH2 = iH4;
        }
        m66 m66Var = (m66) view.getLayoutParams();
        if (z ? I0(view, iH2, iH, m66Var) : G0(view, iH2, iH, m66Var)) {
            view.measure(iH2, iH);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int z(y66 y66Var) {
        return P0(y66Var);
    }

    public final void z1() {
        int paddingBottom;
        int paddingTop;
        if (this.B == 1) {
            paddingBottom = this.z - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.A - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        o1(paddingBottom - paddingTop);
    }
}
