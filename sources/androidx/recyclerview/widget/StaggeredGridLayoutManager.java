package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import o.a65;
import o.aa4;
import o.be8;
import o.f4;
import o.g4;
import o.h87;
import o.hk0;
import o.i87;
import o.j87;
import o.k87;
import o.l66;
import o.l87;
import o.m66;
import o.mt8;
import o.r14;
import o.rr0;
import o.s66;
import o.ua5;
import o.us1;
import o.vy1;
import o.x66;
import o.y66;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends a implements x66 {
    public final int B;
    public final l87[] C;
    public final vy1 D;
    public final vy1 E;
    public final int F;
    public int G;
    public final r14 H;
    public boolean I;
    public final BitSet K;
    public final a65 N;
    public final byte O;
    public boolean P;
    public boolean Q;
    public k87 R;
    public final Rect S;
    public final h87 T;
    public final boolean U;
    public int[] V;
    public final mt8 W;
    public boolean J = false;
    public int L = -1;
    public int M = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.B = -1;
        this.I = false;
        a65 a65Var = new a65((byte) 27, false);
        this.N = a65Var;
        this.O = (byte) 2;
        this.S = new Rect();
        this.T = new h87(this);
        this.U = true;
        this.W = new mt8((Object) this, (byte) 16);
        l66 l66VarP = a.P(context, attributeSet, i, i2);
        int i3 = l66VarP.a;
        if (i3 != 0 && i3 != 1) {
            hk0.g("invalid orientation.");
            throw null;
        }
        m(null);
        if (i3 != this.F) {
            this.F = i3;
            vy1 vy1Var = this.D;
            this.D = this.E;
            this.E = vy1Var;
            x0();
        }
        int i4 = l66VarP.b;
        m(null);
        if (i4 != this.B) {
            a65Var.t0();
            x0();
            this.B = i4;
            this.K = new BitSet(this.B);
            this.C = new l87[this.B];
            for (int i5 = 0; i5 < this.B; i5++) {
                this.C[i5] = new l87(this, i5);
            }
            x0();
        }
        boolean z = l66VarP.c;
        m(null);
        k87 k87Var = this.R;
        if (k87Var != null && k87Var.t != z) {
            k87Var.t = z;
        }
        this.I = z;
        x0();
        r14 r14Var = new r14();
        r14Var.a = true;
        r14Var.f = 0;
        r14Var.g = 0;
        this.H = r14Var;
        this.D = vy1.b(this, this.F);
        this.E = vy1.b(this, 1 - this.F);
    }

    public static int m1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.a
    public final int A0(int i, s66 s66Var, y66 y66Var) {
        return i1(i, s66Var, y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final m66 C() {
        return this.F == 0 ? new i87(-2, -1) : new i87(-1, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final m66 D(Context context, AttributeSet attributeSet) {
        return new i87(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.a
    public final void D0(Rect rect, int i, int i2) {
        int iR;
        int iR2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.F;
        int i4 = this.B;
        if (i3 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.n;
            WeakHashMap weakHashMap = be8.a;
            iR2 = a.r(i2, iHeight, recyclerView.getMinimumHeight());
            iR = a.r(i, (this.G * i4) + paddingRight, this.n.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.n;
            WeakHashMap weakHashMap2 = be8.a;
            iR = a.r(i, iWidth, recyclerView2.getMinimumWidth());
            iR2 = a.r(i2, (this.G * i4) + paddingBottom, this.n.getMinimumHeight());
        }
        this.n.setMeasuredDimension(iR, iR2);
    }

    @Override // androidx.recyclerview.widget.a
    public final m66 E(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new i87((ViewGroup.MarginLayoutParams) layoutParams) : new i87(layoutParams);
    }

    @Override // androidx.recyclerview.widget.a
    public final int I(s66 s66Var, y66 y66Var) {
        if (this.F == 1) {
            return Math.min(this.B, y66Var.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void J0(RecyclerView recyclerView, int i) {
        aa4 aa4Var = new aa4(recyclerView.getContext());
        aa4Var.a = i;
        K0(aa4Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean L0() {
        return this.R == null;
    }

    public final boolean M0() {
        int iT0;
        if (G() != 0 && this.O != 0 && this.s) {
            if (this.J) {
                iT0 = U0();
                T0();
            } else {
                iT0 = T0();
                U0();
            }
            if (iT0 == 0 && Y0() != null) {
                this.N.t0();
                this.r = true;
                x0();
                return true;
            }
        }
        return false;
    }

    public final int N0(y66 y66Var) {
        if (G() == 0) {
            return 0;
        }
        boolean z = !this.U;
        return us1.t(y66Var, this.D, Q0(z), P0(z), this, this.U, this.J);
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    public final int O0(s66 s66Var, r14 r14Var, y66 y66Var) {
        int i;
        int i2;
        l87[] l87VarArr;
        int iV0;
        BitSet bitSet;
        l87[] l87VarArr2;
        l87 l87Var;
        ?? r5;
        int iH;
        int iE;
        int iE2;
        int i3;
        BitSet bitSet2;
        int i4;
        int i5;
        s66 s66Var2 = s66Var;
        BitSet bitSet3 = this.K;
        int i6 = this.B;
        bitSet3.set(0, i6, true);
        r14 r14Var2 = this.H;
        if (r14Var2.i) {
            i = r14Var.e;
            i2 = i == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = r14Var.e;
            i2 = i == 1 ? r14Var.g + r14Var.b : r14Var.f - r14Var.b;
        }
        int i7 = 0;
        while (true) {
            l87VarArr = this.C;
            if (i7 >= i6) {
                break;
            }
            if (!l87VarArr[i7].a.isEmpty()) {
                l1(l87VarArr[i7], i, i2);
            }
            i7++;
        }
        boolean z = this.J;
        vy1 vy1Var = this.D;
        int i8 = z ? vy1Var.i() : vy1Var.m();
        boolean z2 = false;
        while (true) {
            int i9 = r14Var.c;
            if (i9 < 0 || i9 >= y66Var.b() || (!r14Var2.i && bitSet3.isEmpty())) {
                break;
            }
            View view = s66Var2.k(r14Var.c, Long.MAX_VALUE).m;
            r14Var.c += r14Var.d;
            i87 i87Var = (i87) view.getLayoutParams();
            int iC = i87Var.m.c();
            a65 a65Var = this.N;
            int[] iArr = (int[]) a65Var.n;
            int i10 = (iArr == null || iC >= iArr.length) ? -1 : iArr[iC];
            if (i10 == -1) {
                if (c1(r14Var.e)) {
                    i5 = i6 - 1;
                    i6 = -1;
                    i4 = -1;
                } else {
                    i4 = 1;
                    i5 = 0;
                }
                l87 l87Var2 = null;
                int i11 = i4;
                if (r14Var.e == 1) {
                    int iM = vy1Var.m();
                    l87VarArr2 = l87VarArr;
                    int i12 = i5;
                    int i13 = Integer.MAX_VALUE;
                    while (i12 != i6) {
                        int i14 = i12;
                        l87 l87Var3 = l87VarArr2[i14];
                        BitSet bitSet4 = bitSet3;
                        int iF = l87Var3.f(iM);
                        if (iF < i13) {
                            i13 = iF;
                            l87Var2 = l87Var3;
                        }
                        i12 = i14 + i11;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    l87VarArr2 = l87VarArr;
                    int i15 = vy1Var.i();
                    int i16 = i5;
                    int i17 = Integer.MIN_VALUE;
                    while (i16 != i6) {
                        l87 l87Var4 = l87VarArr2[i16];
                        int i18 = i6;
                        int iH2 = l87Var4.h(i15);
                        if (iH2 > i17) {
                            i17 = iH2;
                            l87Var2 = l87Var4;
                        }
                        i16 += i11;
                        i6 = i18;
                    }
                }
                l87Var = l87Var2;
                a65Var.A0(iC);
                ((int[]) a65Var.n)[iC] = l87Var.e;
            } else {
                bitSet = bitSet3;
                i6 = i6;
                l87VarArr2 = l87VarArr;
                l87Var = l87VarArr2[i10];
            }
            i87Var.q = l87Var;
            if (r14Var.e == 1) {
                r5 = 0;
                l(view, -1, false);
            } else {
                r5 = 0;
                l(view, 0, false);
            }
            int i19 = this.F;
            if (i19 == 1) {
                a1(view, a.H(r5, this.G, this.x, r5, ((ViewGroup.MarginLayoutParams) i87Var).width), a.H(true, this.A, this.y, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) i87Var).height));
            } else {
                a1(view, a.H(true, this.z, this.x, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) i87Var).width), a.H(false, this.G, this.y, 0, ((ViewGroup.MarginLayoutParams) i87Var).height));
            }
            if (r14Var.e == 1) {
                iE = l87Var.f(i8);
                iH = vy1Var.e(view) + iE;
            } else {
                iH = l87Var.h(i8);
                iE = iH - vy1Var.e(view);
            }
            int i20 = r14Var.e;
            l87 l87Var5 = i87Var.q;
            if (i20 == 1) {
                l87Var5.getClass();
                i87 i87Var2 = (i87) view.getLayoutParams();
                i87Var2.q = l87Var5;
                ArrayList arrayList = l87Var5.a;
                arrayList.add(view);
                l87Var5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    l87Var5.b = Integer.MIN_VALUE;
                }
                if (i87Var2.m.i() || i87Var2.m.l()) {
                    l87Var5.d = l87Var5.f.D.e(view) + l87Var5.d;
                }
            } else {
                l87Var5.getClass();
                i87 i87Var3 = (i87) view.getLayoutParams();
                i87Var3.q = l87Var5;
                ArrayList arrayList2 = l87Var5.a;
                arrayList2.add(0, view);
                l87Var5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    l87Var5.c = Integer.MIN_VALUE;
                }
                if (i87Var3.m.i() || i87Var3.m.l()) {
                    l87Var5.d = l87Var5.f.D.e(view) + l87Var5.d;
                }
            }
            boolean zZ0 = Z0();
            vy1 vy1Var2 = this.E;
            if (zZ0 && i19 == 1) {
                i3 = vy1Var2.i() - (((i6 - 1) - l87Var.e) * this.G);
                iE2 = i3 - vy1Var2.e(view);
            } else {
                int iM2 = (l87Var.e * this.G) + vy1Var2.m();
                int iE3 = vy1Var2.e(view) + iM2;
                iE2 = iM2;
                i3 = iE3;
            }
            z2 = true;
            if (i19 == 1) {
                a.V(view, iE2, iE, i3, iH);
            } else {
                a.V(view, iE, iE2, iH, i3);
            }
            l1(l87Var, r14Var2.e, i2);
            s66Var2 = s66Var;
            e1(s66Var2, r14Var2);
            if (r14Var2.h && view.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(l87Var.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i6 = i6;
            l87VarArr = l87VarArr2;
        }
        if (!z2) {
            e1(s66Var2, r14Var2);
        }
        if (r14Var2.e == -1) {
            iV0 = vy1Var.m() - W0(vy1Var.m());
        } else {
            iV0 = V0(vy1Var.i()) - vy1Var.i();
        }
        if (iV0 > 0) {
            return Math.min(r14Var.b, iV0);
        }
        return 0;
    }

    public final View P0(boolean z) {
        vy1 vy1Var = this.D;
        int iM = vy1Var.m();
        int i = vy1Var.i();
        View view = null;
        for (int iG = G() - 1; iG >= 0; iG--) {
            View viewF = F(iG);
            int iG2 = vy1Var.g(viewF);
            int iD = vy1Var.d(viewF);
            if (iD > iM && iG2 < i) {
                if (iD <= i || !z) {
                    return viewF;
                }
                if (view == null) {
                    view = viewF;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.a
    public final int Q(s66 s66Var, y66 y66Var) {
        if (this.F == 0) {
            return Math.min(this.B, y66Var.b());
        }
        return -1;
    }

    public final View Q0(boolean z) {
        vy1 vy1Var = this.D;
        int iM = vy1Var.m();
        int i = vy1Var.i();
        int iG = G();
        View view = null;
        for (int i2 = 0; i2 < iG; i2++) {
            View viewF = F(i2);
            int iG2 = vy1Var.g(viewF);
            if (vy1Var.d(viewF) > iM && iG2 < i) {
                if (iG2 >= iM || !z) {
                    return viewF;
                }
                if (view == null) {
                    view = viewF;
                }
            }
        }
        return view;
    }

    public final void R0(s66 s66Var, y66 y66Var, boolean z) {
        int i;
        int iV0 = V0(Integer.MIN_VALUE);
        if (iV0 != Integer.MIN_VALUE && (i = this.D.i() - iV0) > 0) {
            int i2 = i - (-i1(-i, s66Var, y66Var));
            if (!z || i2 <= 0) {
                return;
            }
            this.D.r(i2);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean S() {
        return this.O != 0;
    }

    public final void S0(s66 s66Var, y66 y66Var, boolean z) {
        int iM;
        int iW0 = W0(Integer.MAX_VALUE);
        if (iW0 != Integer.MAX_VALUE && (iM = iW0 - this.D.m()) > 0) {
            int iI1 = iM - i1(iM, s66Var, y66Var);
            if (!z || iI1 <= 0) {
                return;
            }
            this.D.r(-iI1);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean T() {
        return this.I;
    }

    public final int T0() {
        if (G() == 0) {
            return 0;
        }
        return a.O(F(0));
    }

    public final int U0() {
        int iG = G();
        if (iG == 0) {
            return 0;
        }
        return a.O(F(iG - 1));
    }

    public final int V0(int i) {
        int iF = this.C[0].f(i);
        for (int i2 = 1; i2 < this.B; i2++) {
            int iF2 = this.C[i2].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // androidx.recyclerview.widget.a
    public final void W(int i) {
        super.W(i);
        for (int i2 = 0; i2 < this.B; i2++) {
            l87 l87Var = this.C[i2];
            int i3 = l87Var.b;
            if (i3 != Integer.MIN_VALUE) {
                l87Var.b = i3 + i;
            }
            int i4 = l87Var.c;
            if (i4 != Integer.MIN_VALUE) {
                l87Var.c = i4 + i;
            }
        }
    }

    public final int W0(int i) {
        int iH = this.C[0].h(i);
        for (int i2 = 1; i2 < this.B; i2++) {
            int iH2 = this.C[i2].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // androidx.recyclerview.widget.a
    public final void X(int i) {
        super.X(i);
        for (int i2 = 0; i2 < this.B; i2++) {
            l87 l87Var = this.C[i2];
            int i3 = l87Var.b;
            if (i3 != Integer.MIN_VALUE) {
                l87Var.b = i3 + i;
            }
            int i4 = l87Var.c;
            if (i4 != Integer.MIN_VALUE) {
                l87Var.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[LOOP:0: B:23:0x003c->B:27:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[LOOP:1: B:32:0x0063->B:36:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0051 A[EDGE_INSN: B:62:0x0051->B:29:0x0051 BREAK  A[LOOP:0: B:23:0x003c->B:27:0x004d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0078 A[EDGE_INSN: B:64:0x0078->B:38:0x0078 BREAK  A[LOOP:1: B:32:0x0063->B:36:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final void X0(int i, int i2, int i3) {
        int i4;
        int i5;
        a65 a65Var;
        int[] iArr;
        int iU0;
        ArrayList arrayList;
        int size;
        j87 j87Var;
        int size2;
        int i6;
        int i7;
        int[] iArr2;
        int iU1 = this.J ? U0() : T0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            a65Var = this.N;
            iArr = (int[]) a65Var.n;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) a65Var.f302o;
                if (arrayList == null) {
                    i7 = -1;
                } else {
                    size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            j87Var = null;
                            break;
                        }
                        j87Var = (j87) ((ArrayList) a65Var.f302o).get(size);
                        if (j87Var.m == i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (j87Var != null) {
                        ((ArrayList) a65Var.f302o).remove(j87Var);
                    }
                    size2 = ((ArrayList) a65Var.f302o).size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            i6 = -1;
                            break;
                        } else if (((j87) ((ArrayList) a65Var.f302o).get(i6)).m >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        j87 j87Var2 = (j87) ((ArrayList) a65Var.f302o).get(i6);
                        ((ArrayList) a65Var.f302o).remove(i6);
                        i7 = j87Var2.m;
                    } else {
                        i7 = -1;
                    }
                }
                iArr2 = (int[]) a65Var.n;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = ((int[]) a65Var.n).length;
                } else {
                    Arrays.fill((int[]) a65Var.n, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                a65Var.K0(i, i2);
            } else if (i3 != 2) {
                a65Var.L0(i, i2);
            } else if (i3 == 8) {
                a65Var.L0(i, 1);
                a65Var.K0(i2, 1);
            }
            if (i4 <= iU1) {
                return;
            }
            if (this.J) {
                iU0 = T0();
            } else {
                iU0 = U0();
            }
            if (i5 <= iU0) {
                x0();
            }
        }
        i4 = i + i2;
        i5 = i;
        a65Var = this.N;
        iArr = (int[]) a65Var.n;
        if (iArr != null) {
            arrayList = (ArrayList) a65Var.f302o;
            if (arrayList == null) {
                i7 = -1;
            } else {
                size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        j87Var = null;
                        break;
                    }
                    j87Var = (j87) ((ArrayList) a65Var.f302o).get(size);
                    if (j87Var.m == i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (j87Var != null) {
                    ((ArrayList) a65Var.f302o).remove(j87Var);
                }
                size2 = ((ArrayList) a65Var.f302o).size();
                i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        i6 = -1;
                        break;
                    } else {
                        if (((j87) ((ArrayList) a65Var.f302o).get(i6)).m >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    j87 j87Var3 = (j87) ((ArrayList) a65Var.f302o).get(i6);
                    ((ArrayList) a65Var.f302o).remove(i6);
                    i7 = j87Var3.m;
                } else {
                    i7 = -1;
                }
            }
            iArr2 = (int[]) a65Var.n;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) a65Var.n).length;
            } else {
                Arrays.fill((int[]) a65Var.n, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            a65Var.K0(i, i2);
        } else if (i3 != 2) {
            a65Var.L0(i, i2);
        } else if (i3 == 8) {
            a65Var.L0(i, 1);
            a65Var.K0(i2, 1);
        }
        if (i4 <= iU1) {
            return;
        }
        if (this.J) {
            iU0 = T0();
        } else {
            iU0 = U0();
        }
        if (i5 <= iU0) {
            x0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void Y() {
        this.N.t0();
        for (int i = 0; i < this.B; i++) {
            this.C[i].b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    public final View Y0() {
        boolean z;
        boolean z2;
        int iG = G();
        int i = iG - 1;
        int i2 = this.B;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.F == 1 && Z0()) ? (byte) 1 : (byte) -1;
        if (this.J) {
            iG = -1;
        } else {
            i = 0;
        }
        int i3 = i < iG ? 1 : -1;
        while (i != iG) {
            View viewF = F(i);
            i87 i87Var = (i87) viewF.getLayoutParams();
            boolean z3 = bitSet.get(i87Var.q.e);
            vy1 vy1Var = this.D;
            if (z3) {
                l87 l87Var = i87Var.q;
                if (this.J) {
                    int i4 = l87Var.c;
                    if (i4 == Integer.MIN_VALUE) {
                        l87Var.a();
                        i4 = l87Var.c;
                    }
                    if (i4 < vy1Var.i()) {
                        ((i87) ((View) ua5.j(1, l87Var.a)).getLayoutParams()).getClass();
                        return viewF;
                    }
                } else {
                    int i5 = l87Var.b;
                    ArrayList arrayList = l87Var.a;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        i87 i87Var2 = (i87) view.getLayoutParams();
                        l87Var.b = l87Var.f.D.g(view);
                        i87Var2.getClass();
                        i5 = l87Var.b;
                    }
                    if (i5 > vy1Var.m()) {
                        ((i87) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewF;
                    }
                }
                bitSet.clear(i87Var.q.e);
            }
            i += i3;
            if (i != iG) {
                View viewF2 = F(i);
                if (this.J) {
                    int iD = vy1Var.d(viewF);
                    int iD2 = vy1Var.d(viewF2);
                    if (iD >= iD2) {
                        if (iD == iD2) {
                            if (i87Var.q.e - ((i87) viewF2.getLayoutParams()).q.e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewF;
                }
                int iG2 = vy1Var.g(viewF);
                int iG3 = vy1Var.g(viewF2);
                if (iG2 <= iG3) {
                    if (iG2 == iG3) {
                        if (i87Var.q.e - ((i87) viewF2.getLayoutParams()).q.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewF;
            }
        }
        return null;
    }

    public final boolean Z0() {
        return this.n.getLayoutDirection() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // o.x66
    public final PointF a(int i) {
        int i2 = -1;
        if (G() != 0) {
            if ((i < T0()) == this.J) {
                i2 = 1;
            }
        } else if (this.J) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.F == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.a
    public final void a0(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.n;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.W);
        }
        for (int i = 0; i < this.B; i++) {
            this.C[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void a1(View view, int i, int i2) {
        Rect rect = this.S;
        n(view, rect);
        i87 i87Var = (i87) view.getLayoutParams();
        int iM1 = m1(i, ((ViewGroup.MarginLayoutParams) i87Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) i87Var).rightMargin + rect.right);
        int iM2 = m1(i2, ((ViewGroup.MarginLayoutParams) i87Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) i87Var).bottomMargin + rect.bottom);
        if (G0(view, iM1, iM2, i87Var)) {
            view.measure(iM1, iM2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0048  */
    /* JADX WARN: Code duplicated, block: B:34:0x004f  */
    @Override // androidx.recyclerview.widget.a
    public final View b0(View view, int i, s66 s66Var, y66 y66Var) {
        View viewD;
        int i2;
        if (G() != 0) {
            RecyclerView recyclerView = this.n;
            if (recyclerView == null || (viewD = recyclerView.D(view)) == null || ((ArrayList) this.m.e).contains(viewD)) {
                viewD = null;
            }
            if (viewD != null) {
                h1();
                int i3 = this.F;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && Z0()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && Z0()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    i87 i87Var = (i87) viewD.getLayoutParams();
                    i87Var.getClass();
                    l87 l87Var = i87Var.q;
                    int iU0 = i2 == 1 ? U0() : T0();
                    k1(iU0, y66Var);
                    j1(i2);
                    r14 r14Var = this.H;
                    r14Var.c = r14Var.d + iU0;
                    r14Var.b = (int) (this.D.n() * 0.33333334f);
                    r14Var.h = true;
                    r14Var.a = false;
                    O0(s66Var, r14Var, y66Var);
                    this.P = this.J;
                    View viewG = l87Var.g(iU0, i2);
                    if (viewG != null && viewG != viewD) {
                        return viewG;
                    }
                    boolean zC1 = c1(i2);
                    l87[] l87VarArr = this.C;
                    int i4 = this.B;
                    if (zC1) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewG2 = l87VarArr[i5].g(iU0, i2);
                            if (viewG2 != null && viewG2 != viewD) {
                                return viewG2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewG3 = l87VarArr[i6].g(iU0, i2);
                            if (viewG3 != null && viewG3 != viewD) {
                                return viewG3;
                            }
                        }
                    }
                    boolean z = (this.I ^ true) == (i2 == -1);
                    View viewB = B(z ? l87Var.c() : l87Var.d());
                    if (viewB != null && viewB != viewD) {
                        return viewB;
                    }
                    if (c1(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != l87Var.e) {
                                View viewB2 = B(z ? l87VarArr[i7].c() : l87VarArr[i7].d());
                                if (viewB2 != null && viewB2 != viewD) {
                                    return viewB2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewB3 = B(z ? l87VarArr[i8].c() : l87VarArr[i8].d());
                            if (viewB3 != null && viewB3 != viewD) {
                                return viewB3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
    public final void b1(s66 s66Var, y66 y66Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        k87 k87Var;
        int iG;
        int i2;
        int iO;
        int iO2;
        int iG2;
        boolean z4;
        int i3;
        boolean z5;
        k87 k87Var2 = this.R;
        h87 h87Var = this.T;
        if (!(k87Var2 == null && this.L == -1) && y66Var.b() == 0) {
            t0(s66Var);
            h87Var.a();
            return;
        }
        boolean z6 = h87Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = h87Var.g;
        boolean z7 = (z6 && this.L == -1 && this.R == null) ? false : true;
        l87[] l87VarArr = this.C;
        int i4 = this.B;
        a65 a65Var = this.N;
        if (z7) {
            h87Var.a();
            k87 k87Var3 = this.R;
            vy1 vy1Var = this.D;
            if (k87Var3 != null) {
                int i5 = k87Var3.f1238o;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            l87VarArr[i6].b();
                            k87 k87Var4 = this.R;
                            int i7 = k87Var4.p[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += k87Var4.u ? vy1Var.i() : vy1Var.m();
                            }
                            l87 l87Var = l87VarArr[i6];
                            l87Var.b = i7;
                            l87Var.c = i7;
                        }
                    } else {
                        k87Var3.p = null;
                        k87Var3.f1238o = 0;
                        k87Var3.q = 0;
                        k87Var3.r = null;
                        k87Var3.s = null;
                        k87Var3.m = k87Var3.n;
                    }
                }
                k87 k87Var5 = this.R;
                this.Q = k87Var5.v;
                boolean z8 = k87Var5.t;
                m(null);
                k87 k87Var6 = this.R;
                if (k87Var6 != null && k87Var6.t != z8) {
                    k87Var6.t = z8;
                }
                this.I = z8;
                x0();
                h1();
                k87 k87Var7 = this.R;
                int i8 = k87Var7.m;
                if (i8 != -1) {
                    this.L = i8;
                    h87Var.c = k87Var7.u;
                } else {
                    h87Var.c = this.J;
                }
                if (k87Var7.q > 1) {
                    a65Var.n = k87Var7.r;
                    a65Var.f302o = k87Var7.s;
                }
            } else {
                h1();
                h87Var.c = this.J;
            }
            if (y66Var.g || (i3 = this.L) == -1) {
                if (this.P) {
                    int iB = y66Var.b();
                    iG2 = G() - 1;
                    while (true) {
                        if (iG2 < 0) {
                            iO2 = 0;
                            break;
                        }
                        iO2 = a.O(F(iG2));
                        if (iO2 < 0 && iO2 < iB) {
                            break;
                        } else {
                            iG2--;
                        }
                    }
                } else {
                    int iB2 = y66Var.b();
                    iG = G();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iG) {
                            iO2 = 0;
                            break;
                        }
                        iO = a.O(F(i2));
                        if (iO < 0 && iO < iB2) {
                            iO2 = iO;
                            break;
                        }
                        i2++;
                    }
                }
                h87Var.a = iO2;
                h87Var.b = Integer.MIN_VALUE;
                z4 = true;
            } else if (i3 < 0 || i3 >= y66Var.b()) {
                this.L = -1;
                this.M = Integer.MIN_VALUE;
                if (this.P) {
                    int iB3 = y66Var.b();
                    iG2 = G() - 1;
                    while (true) {
                        if (iG2 < 0) {
                            iO2 = 0;
                            break;
                        } else {
                            iO2 = a.O(F(iG2));
                            if (iO2 < 0) {
                            }
                            iG2--;
                        }
                    }
                } else {
                    int iB4 = y66Var.b();
                    iG = G();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iG) {
                            iO2 = 0;
                            break;
                        } else {
                            iO = a.O(F(i2));
                            if (iO < 0) {
                            }
                            i2++;
                        }
                    }
                }
                h87Var.a = iO2;
                h87Var.b = Integer.MIN_VALUE;
                z4 = true;
            } else {
                k87 k87Var8 = this.R;
                if (k87Var8 == null || k87Var8.m == -1 || k87Var8.f1238o < 1) {
                    View viewB = B(this.L);
                    if (viewB != null) {
                        h87Var.a = this.J ? U0() : T0();
                        if (this.M != Integer.MIN_VALUE) {
                            if (h87Var.c) {
                                h87Var.b = (vy1Var.i() - this.M) - vy1Var.d(viewB);
                            } else {
                                h87Var.b = (vy1Var.m() + this.M) - vy1Var.g(viewB);
                            }
                        } else if (vy1Var.e(viewB) > vy1Var.n()) {
                            h87Var.b = h87Var.c ? vy1Var.i() : vy1Var.m();
                        } else {
                            int iG3 = vy1Var.g(viewB) - vy1Var.m();
                            if (iG3 < 0) {
                                h87Var.b = -iG3;
                            } else {
                                int i9 = vy1Var.i() - vy1Var.d(viewB);
                                if (i9 < 0) {
                                    h87Var.b = i9;
                                } else {
                                    h87Var.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i10 = this.L;
                        h87Var.a = i10;
                        int i11 = this.M;
                        if (i11 == Integer.MIN_VALUE) {
                            if (G() != 0) {
                                if ((i10 < T0()) != this.J) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.J) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            h87Var.c = z5;
                            vy1 vy1Var2 = staggeredGridLayoutManager.D;
                            h87Var.b = z5 ? vy1Var2.i() : vy1Var2.m();
                        } else {
                            boolean z9 = h87Var.c;
                            vy1 vy1Var3 = staggeredGridLayoutManager.D;
                            if (z9) {
                                h87Var.b = vy1Var3.i() - i11;
                            } else {
                                h87Var.b = vy1Var3.m() + i11;
                            }
                        }
                        z4 = true;
                        h87Var.d = true;
                    }
                } else {
                    h87Var.b = Integer.MIN_VALUE;
                    h87Var.a = this.L;
                }
                z4 = true;
            }
            h87Var.e = z4;
        }
        if (this.R == null && this.L == -1 && !(h87Var.c == this.P && Z0() == this.Q)) {
            a65Var.t0();
            i = 1;
            h87Var.d = true;
        } else {
            i = 1;
        }
        if (G() > 0 && ((k87Var = this.R) == null || k87Var.f1238o < i)) {
            if (h87Var.d) {
                for (int i12 = 0; i12 < i4; i12++) {
                    l87VarArr[i12].b();
                    int i13 = h87Var.b;
                    if (i13 != Integer.MIN_VALUE) {
                        l87 l87Var2 = l87VarArr[i12];
                        l87Var2.b = i13;
                        l87Var2.c = i13;
                    }
                }
            } else if (z7 || h87Var.f == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    l87 l87Var3 = l87VarArr[i14];
                    boolean z10 = this.J;
                    int i15 = h87Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = l87Var3.f;
                    int iF = z10 ? l87Var3.f(Integer.MIN_VALUE) : l87Var3.h(Integer.MIN_VALUE);
                    l87Var3.b();
                    if (iF != Integer.MIN_VALUE && ((!z10 || iF >= staggeredGridLayoutManager2.D.i()) && (z10 || iF <= staggeredGridLayoutManager2.D.m()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            iF += i15;
                        }
                        l87Var3.c = iF;
                        l87Var3.b = iF;
                    }
                }
                int length = l87VarArr.length;
                int[] iArr = h87Var.f;
                if (iArr == null || iArr.length < length) {
                    h87Var.f = new int[staggeredGridLayoutManager.C.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    h87Var.f[i16] = l87VarArr[i16].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    l87 l87Var4 = l87VarArr[i17];
                    l87Var4.b();
                    int i18 = h87Var.f[i17];
                    l87Var4.b = i18;
                    l87Var4.c = i18;
                }
            }
        }
        A(s66Var);
        r14 r14Var = this.H;
        r14Var.a = false;
        vy1 vy1Var4 = this.E;
        int iN = vy1Var4.n();
        this.G = iN / i4;
        View.MeasureSpec.makeMeasureSpec(iN, vy1Var4.k());
        k1(h87Var.a, y66Var);
        if (h87Var.c) {
            j1(-1);
            O0(s66Var, r14Var, y66Var);
            j1(1);
            r14Var.c = h87Var.a + r14Var.d;
            O0(s66Var, r14Var, y66Var);
        } else {
            j1(1);
            O0(s66Var, r14Var, y66Var);
            j1(-1);
            r14Var.c = h87Var.a + r14Var.d;
            O0(s66Var, r14Var, y66Var);
        }
        if (vy1Var4.k() != 1073741824) {
            int iG4 = G();
            float fMax = 0.0f;
            for (int i19 = 0; i19 < iG4; i19++) {
                View viewF = F(i19);
                float fE = vy1Var4.e(viewF);
                if (fE >= fMax) {
                    ((i87) viewF.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fE);
                }
            }
            int i20 = this.G;
            int iRound = Math.round(fMax * i4);
            if (vy1Var4.k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, vy1Var4.n());
            }
            this.G = iRound / i4;
            View.MeasureSpec.makeMeasureSpec(iRound, vy1Var4.k());
            if (this.G != i20) {
                for (int i21 = 0; i21 < iG4; i21++) {
                    View viewF2 = F(i21);
                    i87 i87Var = (i87) viewF2.getLayoutParams();
                    i87Var.getClass();
                    boolean zZ0 = Z0();
                    int i22 = this.F;
                    if (zZ0 && i22 == 1) {
                        int i23 = -((i4 - 1) - i87Var.q.e);
                        viewF2.offsetLeftAndRight((this.G * i23) - (i23 * i20));
                    } else {
                        int i24 = i87Var.q.e;
                        int i25 = this.G * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            viewF2.offsetLeftAndRight(i25 - i26);
                        } else {
                            viewF2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (G() <= 0) {
            z2 = true;
        } else if (this.J) {
            z2 = true;
            R0(s66Var, y66Var, true);
            S0(s66Var, y66Var, false);
        } else {
            z2 = true;
            S0(s66Var, y66Var, true);
            R0(s66Var, y66Var, false);
        }
        if (!z || y66Var.g || this.O == 0 || G() <= 0 || Y0() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.n;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.W);
            }
            if (M0()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (y66Var.g) {
            h87Var.a();
        }
        this.P = h87Var.c;
        this.Q = Z0();
        if (z3) {
            h87Var.a();
            b1(s66Var, y66Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void c0(AccessibilityEvent accessibilityEvent) {
        super.c0(accessibilityEvent);
        if (G() > 0) {
            View viewQ0 = Q0(false);
            View viewP0 = P0(false);
            if (viewQ0 == null || viewP0 == null) {
                return;
            }
            int iO = a.O(viewQ0);
            int iO2 = a.O(viewP0);
            if (iO < iO2) {
                accessibilityEvent.setFromIndex(iO);
                accessibilityEvent.setToIndex(iO2);
            } else {
                accessibilityEvent.setFromIndex(iO2);
                accessibilityEvent.setToIndex(iO);
            }
        }
    }

    public final boolean c1(int i) {
        if (this.F == 0) {
            return (i == -1) != this.J;
        }
        return ((i == -1) == this.J) == Z0();
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(s66 s66Var, y66 y66Var, g4 g4Var) {
        super.d0(s66Var, y66Var, g4Var);
        g4Var.i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void d1(int i, y66 y66Var) {
        int iT0;
        int i2;
        if (i > 0) {
            iT0 = U0();
            i2 = 1;
        } else {
            iT0 = T0();
            i2 = -1;
        }
        r14 r14Var = this.H;
        r14Var.a = true;
        k1(iT0, y66Var);
        j1(i2);
        r14Var.c = iT0 + r14Var.d;
        r14Var.b = Math.abs(i);
    }

    public final void e1(s66 s66Var, r14 r14Var) {
        if (!r14Var.a || r14Var.i) {
            return;
        }
        int i = r14Var.b;
        int i2 = r14Var.e;
        if (i == 0) {
            if (i2 == -1) {
                f1(s66Var, r14Var.g);
                return;
            } else {
                g1(s66Var, r14Var.f);
                return;
            }
        }
        int i3 = this.B;
        l87[] l87VarArr = this.C;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = r14Var.f;
            int iH = l87VarArr[0].h(i5);
            while (i4 < i3) {
                int iH2 = l87VarArr[i4].h(i5);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i4++;
            }
            int i6 = i5 - iH;
            int iMin = r14Var.g;
            if (i6 >= 0) {
                iMin -= Math.min(i6, r14Var.b);
            }
            f1(s66Var, iMin);
            return;
        }
        int i7 = r14Var.g;
        int iF = l87VarArr[0].f(i7);
        while (i4 < i3) {
            int iF2 = l87VarArr[i4].f(i7);
            if (iF2 < iF) {
                iF = iF2;
            }
            i4++;
        }
        int i8 = iF - r14Var.g;
        int iMin2 = r14Var.f;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, r14Var.b);
        }
        g1(s66Var, iMin2);
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(s66 s66Var, y66 y66Var, View view, g4 g4Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof i87)) {
            e0(view, g4Var);
            return;
        }
        l87 l87Var = ((i87) layoutParams).q;
        if (this.F == 0) {
            g4Var.j(f4.c(false, l87Var == null ? -1 : l87Var.e, 1, -1, -1));
        } else {
            g4Var.j(f4.c(false, -1, -1, l87Var == null ? -1 : l87Var.e, 1));
        }
    }

    public final void f1(s66 s66Var, int i) {
        for (int iG = G() - 1; iG >= 0; iG--) {
            View viewF = F(iG);
            vy1 vy1Var = this.D;
            if (vy1Var.g(viewF) < i || vy1Var.q(viewF) < i) {
                return;
            }
            i87 i87Var = (i87) viewF.getLayoutParams();
            i87Var.getClass();
            if (i87Var.q.a.size() == 1) {
                return;
            }
            l87 l87Var = i87Var.q;
            ArrayList arrayList = l87Var.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            i87 i87Var2 = (i87) view.getLayoutParams();
            i87Var2.q = null;
            if (i87Var2.m.i() || i87Var2.m.l()) {
                l87Var.d -= l87Var.f.D.e(view);
            }
            if (size == 1) {
                l87Var.b = Integer.MIN_VALUE;
            }
            l87Var.c = Integer.MIN_VALUE;
            v0(viewF, s66Var);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i, int i2) {
        X0(i, i2, 1);
    }

    public final void g1(s66 s66Var, int i) {
        while (G() > 0) {
            View viewF = F(0);
            vy1 vy1Var = this.D;
            if (vy1Var.d(viewF) > i || vy1Var.p(viewF) > i) {
                return;
            }
            i87 i87Var = (i87) viewF.getLayoutParams();
            i87Var.getClass();
            if (i87Var.q.a.size() == 1) {
                return;
            }
            l87 l87Var = i87Var.q;
            ArrayList arrayList = l87Var.a;
            View view = (View) arrayList.remove(0);
            i87 i87Var2 = (i87) view.getLayoutParams();
            i87Var2.q = null;
            if (arrayList.size() == 0) {
                l87Var.c = Integer.MIN_VALUE;
            }
            if (i87Var2.m.i() || i87Var2.m.l()) {
                l87Var.d -= l87Var.f.D.e(view);
            }
            l87Var.b = Integer.MIN_VALUE;
            v0(viewF, s66Var);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void h0() {
        this.N.t0();
        x0();
    }

    public final void h1() {
        if (this.F == 1 || !Z0()) {
            this.J = this.I;
        } else {
            this.J = !this.I;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(int i, int i2) {
        X0(i, i2, 8);
    }

    public final int i1(int i, s66 s66Var, y66 y66Var) {
        if (G() == 0 || i == 0) {
            return 0;
        }
        d1(i, y66Var);
        r14 r14Var = this.H;
        int iO0 = O0(s66Var, r14Var, y66Var);
        if (r14Var.b >= iO0) {
            i = i < 0 ? -iO0 : iO0;
        }
        this.D.r(-i);
        this.P = this.J;
        r14Var.b = 0;
        e1(s66Var, r14Var);
        return i;
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(int i, int i2) {
        X0(i, i2, 2);
    }

    public final void j1(int i) {
        r14 r14Var = this.H;
        r14Var.e = i;
        r14Var.d = this.J != (i == -1) ? -1 : 1;
    }

    public final void k1(int i, y66 y66Var) {
        int iN;
        int iN2;
        int i2;
        r14 r14Var = this.H;
        boolean z = false;
        r14Var.b = 0;
        r14Var.c = i;
        aa4 aa4Var = this.q;
        vy1 vy1Var = this.D;
        if (aa4Var == null || !aa4Var.e || (i2 = y66Var.a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.J == (i2 < i)) {
                iN = vy1Var.n();
                iN2 = 0;
            } else {
                iN2 = vy1Var.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.n;
        if (recyclerView == null || !recyclerView.t) {
            r14Var.g = vy1Var.h() + iN;
            r14Var.f = -iN2;
        } else {
            r14Var.f = vy1Var.m() - iN2;
            r14Var.g = vy1Var.i() + iN;
        }
        r14Var.h = false;
        r14Var.a = true;
        if (vy1Var.k() == 0 && vy1Var.h() == 0) {
            z = true;
        }
        r14Var.i = z;
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(RecyclerView recyclerView, int i, int i2) {
        X0(i, i2, 4);
    }

    public final void l1(l87 l87Var, int i, int i2) {
        int i3 = l87Var.d;
        int i4 = l87Var.e;
        BitSet bitSet = this.K;
        if (i != -1) {
            int i5 = l87Var.c;
            if (i5 == Integer.MIN_VALUE) {
                l87Var.a();
                i5 = l87Var.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = l87Var.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) l87Var.a.get(0);
            i87 i87Var = (i87) view.getLayoutParams();
            l87Var.b = l87Var.f.D.g(view);
            i87Var.getClass();
            i6 = l87Var.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void m(String str) {
        if (this.R == null) {
            super.m(str);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void m0(s66 s66Var, y66 y66Var) {
        b1(s66Var, y66Var, true);
    }

    @Override // androidx.recyclerview.widget.a
    public final void n0(y66 y66Var) {
        this.L = -1;
        this.M = Integer.MIN_VALUE;
        this.R = null;
        this.T.a();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean o() {
        return this.F == 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void o0(Parcelable parcelable) {
        if (parcelable instanceof k87) {
            k87 k87Var = (k87) parcelable;
            this.R = k87Var;
            if (this.L != -1) {
                k87Var.m = -1;
                k87Var.n = -1;
                k87Var.p = null;
                k87Var.f1238o = 0;
                k87Var.q = 0;
                k87Var.r = null;
                k87Var.s = null;
            }
            x0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean p() {
        return this.F == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final Parcelable p0() {
        int iH;
        int iM;
        int[] iArr;
        k87 k87Var = this.R;
        if (k87Var != null) {
            k87 k87Var2 = new k87();
            k87Var2.f1238o = k87Var.f1238o;
            k87Var2.m = k87Var.m;
            k87Var2.n = k87Var.n;
            k87Var2.p = k87Var.p;
            k87Var2.q = k87Var.q;
            k87Var2.r = k87Var.r;
            k87Var2.t = k87Var.t;
            k87Var2.u = k87Var.u;
            k87Var2.v = k87Var.v;
            k87Var2.s = k87Var.s;
            return k87Var2;
        }
        k87 k87Var3 = new k87();
        k87Var3.t = this.I;
        k87Var3.u = this.P;
        k87Var3.v = this.Q;
        a65 a65Var = this.N;
        if (a65Var == null || (iArr = (int[]) a65Var.n) == null) {
            k87Var3.q = 0;
        } else {
            k87Var3.r = iArr;
            k87Var3.q = iArr.length;
            k87Var3.s = (ArrayList) a65Var.f302o;
        }
        if (G() <= 0) {
            k87Var3.m = -1;
            k87Var3.n = -1;
            k87Var3.f1238o = 0;
            return k87Var3;
        }
        k87Var3.m = this.P ? U0() : T0();
        View viewP0 = this.J ? P0(true) : Q0(true);
        k87Var3.n = viewP0 != null ? a.O(viewP0) : -1;
        int i = this.B;
        k87Var3.f1238o = i;
        k87Var3.p = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.P;
            vy1 vy1Var = this.D;
            l87[] l87VarArr = this.C;
            if (z) {
                iH = l87VarArr[i2].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = vy1Var.i();
                    iH -= iM;
                }
            } else {
                iH = l87VarArr[i2].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = vy1Var.m();
                    iH -= iM;
                }
            }
            k87Var3.p[i2] = iH;
        }
        return k87Var3;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean q(m66 m66Var) {
        return m66Var instanceof i87;
    }

    @Override // androidx.recyclerview.widget.a
    public final void q0(int i) {
        if (i == 0) {
            M0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void s(int i, int i2, y66 y66Var, rr0 rr0Var) {
        r14 r14Var;
        int iF;
        if (this.F != 0) {
            i = i2;
        }
        if (G() == 0 || i == 0) {
            return;
        }
        d1(i, y66Var);
        int[] iArr = this.V;
        int i3 = this.B;
        if (iArr == null || iArr.length < i3) {
            this.V = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            r14Var = this.H;
            if (i4 >= i3) {
                break;
            }
            int i6 = r14Var.d;
            l87[] l87VarArr = this.C;
            if (i6 == -1) {
                int i7 = r14Var.f;
                iF = i7 - l87VarArr[i4].h(i7);
            } else {
                iF = l87VarArr[i4].f(r14Var.g) - r14Var.g;
            }
            if (iF >= 0) {
                this.V[i5] = iF;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.V, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = r14Var.c;
            if (i9 < 0 || i9 >= y66Var.b()) {
                return;
            }
            rr0Var.c(r14Var.c, this.V[i8]);
            r14Var.c += r14Var.d;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int u(y66 y66Var) {
        if (G() == 0) {
            return 0;
        }
        boolean z = !this.U;
        return us1.s(y66Var, this.D, Q0(z), P0(z), this, this.U);
    }

    @Override // androidx.recyclerview.widget.a
    public final int v(y66 y66Var) {
        return N0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int w(y66 y66Var) {
        if (G() == 0) {
            return 0;
        }
        boolean z = !this.U;
        return us1.u(y66Var, this.D, Q0(z), P0(z), this, this.U);
    }

    @Override // androidx.recyclerview.widget.a
    public final int x(y66 y66Var) {
        if (G() == 0) {
            return 0;
        }
        boolean z = !this.U;
        return us1.s(y66Var, this.D, Q0(z), P0(z), this, this.U);
    }

    @Override // androidx.recyclerview.widget.a
    public final int y(y66 y66Var) {
        return N0(y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int y0(int i, s66 s66Var, y66 y66Var) {
        return i1(i, s66Var, y66Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int z(y66 y66Var) {
        if (G() == 0) {
            return 0;
        }
        boolean z = !this.U;
        return us1.u(y66Var, this.D, Q0(z), P0(z), this, this.U);
    }

    @Override // androidx.recyclerview.widget.a
    public final void z0(int i) {
        k87 k87Var = this.R;
        if (k87Var != null && k87Var.m != i) {
            k87Var.p = null;
            k87Var.f1238o = 0;
            k87Var.m = -1;
            k87Var.n = -1;
        }
        this.L = i;
        this.M = Integer.MIN_VALUE;
        x0();
    }
}
