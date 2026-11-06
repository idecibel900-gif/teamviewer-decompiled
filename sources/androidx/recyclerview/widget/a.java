package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import io.sentry.android.core.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.a07;
import o.aa4;
import o.b76;
import o.be8;
import o.c66;
import o.c76;
import o.d66;
import o.f4;
import o.g4;
import o.hk0;
import o.i66;
import o.je0;
import o.je8;
import o.k66;
import o.l66;
import o.lh7;
import o.m66;
import o.rq0;
import o.rr0;
import o.s66;
import o.xz5;
import o.y66;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public int A;
    public rq0 m;
    public RecyclerView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final lh7 f24o;
    public final lh7 p;
    public aa4 q;
    public boolean r;
    public boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public a() {
        k66 k66Var = new k66(this, (byte) 0);
        k66 k66Var2 = new k66(this, (byte) 1);
        this.f24o = new lh7(k66Var);
        this.p = new lh7(k66Var2);
        this.r = false;
        this.s = false;
        this.t = true;
        this.u = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int H(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int J(View view) {
        return view.getBottom() + ((m66) view.getLayoutParams()).n.bottom;
    }

    public static int K(View view) {
        return view.getLeft() - ((m66) view.getLayoutParams()).n.left;
    }

    public static int L(View view) {
        return view.getRight() + ((m66) view.getLayoutParams()).n.right;
    }

    public static int M(View view) {
        return view.getTop() - ((m66) view.getLayoutParams()).n.top;
    }

    public static int O(View view) {
        return ((m66) view.getLayoutParams()).m.c();
    }

    public static l66 P(Context context, AttributeSet attributeSet, int i, int i2) {
        l66 l66Var = new l66();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xz5.a, i, i2);
        l66Var.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        l66Var.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        l66Var.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        l66Var.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return l66Var;
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

    public static void V(View view, int i, int i2, int i3, int i4) {
        m66 m66Var = (m66) view.getLayoutParams();
        Rect rect = m66Var.n;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) m66Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) m66Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) m66Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) m66Var).bottomMargin);
    }

    public static int r(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public final void A(s66 s66Var) {
        for (int iG = G() - 1; iG >= 0; iG--) {
            View viewF = F(iG);
            c76 c76VarM = RecyclerView.M(viewF);
            if (c76VarM.p()) {
                if (RecyclerView.O0) {
                    Log.d("RecyclerView", "ignoring view " + c76VarM);
                }
            } else if (!c76VarM.g() || c76VarM.i() || this.n.y.b) {
                F(iG);
                this.m.f(iG);
                s66Var.j(viewF);
                this.n.s.y(c76VarM);
            } else {
                if (F(iG) != null) {
                    this.m.m(iG);
                }
                s66Var.i(c76VarM);
            }
        }
    }

    public abstract int A0(int i, s66 s66Var, y66 y66Var);

    public View B(int i) {
        int iG = G();
        for (int i2 = 0; i2 < iG; i2++) {
            View viewF = F(i2);
            c76 c76VarM = RecyclerView.M(viewF);
            if (c76VarM != null && c76VarM.c() == i && !c76VarM.p() && (this.n.s0.g || !c76VarM.i())) {
                return viewF;
            }
        }
        return null;
    }

    public final void B0(RecyclerView recyclerView) {
        C0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public m66 C() {
        return new m66(-2, -2);
    }

    public final void C0(int i, int i2) {
        this.z = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.x = mode;
        if (mode == 0 && !RecyclerView.R0) {
            this.z = 0;
        }
        this.A = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.y = mode2;
        if (mode2 != 0 || RecyclerView.R0) {
            return;
        }
        this.A = 0;
    }

    public m66 D(Context context, AttributeSet attributeSet) {
        return new m66(context, attributeSet);
    }

    public void D0(Rect rect, int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        RecyclerView recyclerView = this.n;
        WeakHashMap weakHashMap = be8.a;
        this.n.setMeasuredDimension(r(i, paddingRight, recyclerView.getMinimumWidth()), r(i2, paddingBottom, this.n.getMinimumHeight()));
    }

    public m66 E(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof m66) {
            return new m66((m66) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new m66((ViewGroup.MarginLayoutParams) layoutParams) : new m66(layoutParams);
    }

    public final void E0(int i, int i2) {
        int iG = G();
        if (iG == 0) {
            this.n.p(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iG; i7++) {
            View viewF = F(i7);
            Rect rect = this.n.v;
            RecyclerView.N(viewF, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.n.v.set(i6, i4, i3, i5);
        D0(this.n.v, i, i2);
    }

    public final View F(int i) {
        rq0 rq0Var = this.m;
        if (rq0Var != null) {
            return rq0Var.g(i);
        }
        return null;
    }

    public final void F0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.n = null;
            this.m = null;
            this.z = 0;
            this.A = 0;
        } else {
            this.n = recyclerView;
            this.m = recyclerView.r;
            this.z = recyclerView.getWidth();
            this.A = recyclerView.getHeight();
        }
        this.x = 1073741824;
        this.y = 1073741824;
    }

    public final int G() {
        rq0 rq0Var = this.m;
        if (rq0Var != null) {
            return rq0Var.h();
        }
        return 0;
    }

    final boolean G0(View view, int i, int i2, m66 m66Var) {
        return (!view.isLayoutRequested() && this.t && U(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) m66Var).width) && U(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) m66Var).height)) ? false : true;
    }

    public boolean H0() {
        return false;
    }

    public int I(s66 s66Var, y66 y66Var) {
        RecyclerView recyclerView = this.n;
        if (recyclerView == null || recyclerView.y == null || !o()) {
            return 1;
        }
        return this.n.y.a();
    }

    public final boolean I0(View view, int i, int i2, m66 m66Var) {
        return (this.t && U(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) m66Var).width) && U(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) m66Var).height)) ? false : true;
    }

    public void J0(RecyclerView recyclerView, int i) {
        aa4 aa4Var = new aa4(recyclerView.getContext());
        aa4Var.a = i;
        K0(aa4Var);
    }

    public final void K0(aa4 aa4Var) {
        aa4 aa4Var2 = this.q;
        if (aa4Var2 != null && aa4Var != aa4Var2 && aa4Var2.e) {
            aa4Var2.e();
        }
        this.q = aa4Var;
        RecyclerView recyclerView = this.n;
        b76 b76Var = recyclerView.p0;
        b76Var.s.removeCallbacks(b76Var);
        b76Var.f405o.abortAnimation();
        if (aa4Var.h) {
            v0.j("RecyclerView", "An instance of " + aa4.class.getSimpleName() + " was started more than once. Each instance of" + aa4.class.getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        aa4Var.b = recyclerView;
        aa4Var.c = this;
        int i = aa4Var.a;
        if (i == -1) {
            hk0.g("Invalid target position");
            return;
        }
        recyclerView.s0.a = i;
        aa4Var.e = true;
        aa4Var.d = true;
        aa4Var.f = recyclerView.z.B(i);
        aa4Var.b.p0.b();
        aa4Var.h = true;
    }

    public boolean L0() {
        return false;
    }

    public final int N() {
        RecyclerView recyclerView = this.n;
        d66 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public int Q(s66 s66Var, y66 y66Var) {
        RecyclerView recyclerView = this.n;
        if (recyclerView == null || recyclerView.y == null || !p()) {
            return 1;
        }
        return this.n.y.a();
    }

    public final void R(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((m66) view.getLayoutParams()).n;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.n != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.n.x;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean S() {
        return true;
    }

    public boolean T() {
        return false;
    }

    public void W(int i) {
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            int iH = recyclerView.r.h();
            for (int i2 = 0; i2 < iH; i2++) {
                recyclerView.r.g(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void X(int i) {
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            int iH = recyclerView.r.h();
            for (int i2 = 0; i2 < iH; i2++) {
                recyclerView.r.g(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Y() {
    }

    public void Z(RecyclerView recyclerView) {
    }

    public void a0(RecyclerView recyclerView) {
    }

    public View b0(View view, int i, s66 s66Var, y66 y66Var) {
        return null;
    }

    public void c0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.n;
        s66 s66Var = recyclerView.f23o;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.n.canScrollVertically(-1) && !this.n.canScrollHorizontally(-1) && !this.n.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        d66 d66Var = this.n.y;
        if (d66Var != null) {
            accessibilityEvent.setItemCount(d66Var.a());
        }
    }

    public void d0(s66 s66Var, y66 y66Var, g4 g4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        if (this.n.canScrollVertically(-1) || this.n.canScrollHorizontally(-1)) {
            g4Var.a(8192);
            accessibilityNodeInfo.setScrollable(true);
            g4Var.h(67108864, true);
        }
        if (this.n.canScrollVertically(1) || this.n.canScrollHorizontally(1)) {
            g4Var.a(4096);
            accessibilityNodeInfo.setScrollable(true);
            g4Var.h(67108864, true);
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f4.b(Q(s66Var, y66Var), I(s66Var, y66Var), 0).m);
    }

    public final void e0(View view, g4 g4Var) {
        c76 c76VarM = RecyclerView.M(view);
        if (c76VarM == null || c76VarM.i()) {
            return;
        }
        rq0 rq0Var = this.m;
        if (((ArrayList) rq0Var.e).contains(c76VarM.m)) {
            return;
        }
        RecyclerView recyclerView = this.n;
        f0(recyclerView.f23o, recyclerView.s0, view, g4Var);
    }

    public void f0(s66 s66Var, y66 y66Var, View view, g4 g4Var) {
        g4Var.j(f4.c(false, p() ? O(view) : 0, 1, o() ? O(view) : 0, 1));
    }

    public void g0(int i, int i2) {
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.n;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = be8.a;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.n;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = be8.a;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public void h0() {
    }

    public void i0(int i, int i2) {
    }

    public void j0(int i, int i2) {
    }

    public void k0(int i) {
    }

    public final void l(View view, int i, boolean z) {
        c76 c76VarM = RecyclerView.M(view);
        if (z || c76VarM.i()) {
            a07 a07Var = (a07) this.n.s.n;
            je8 je8VarA = (je8) a07Var.get(c76VarM);
            if (je8VarA == null) {
                je8VarA = je8.a();
                a07Var.put(c76VarM, je8VarA);
            }
            je8VarA.a |= 1;
        } else {
            this.n.s.y(c76VarM);
        }
        m66 m66Var = (m66) view.getLayoutParams();
        if (c76VarM.q() || c76VarM.j()) {
            if (c76VarM.j()) {
                c76VarM.z.l(c76VarM);
            } else {
                c76VarM.v &= -33;
            }
            this.m.e(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.n;
            rq0 rq0Var = this.m;
            if (parent == recyclerView) {
                je0 je0Var = (je0) rq0Var.d;
                int iIndexOfChild = ((c66) rq0Var.c).m.indexOfChild(view);
                int iB = (iIndexOfChild == -1 || je0Var.d(iIndexOfChild)) ? -1 : iIndexOfChild - je0Var.b(iIndexOfChild);
                if (i == -1) {
                    i = this.m.h();
                }
                if (iB == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.n.indexOfChild(view) + this.n.B());
                }
                if (iB != i) {
                    a aVar = this.n.z;
                    View viewF = aVar.F(iB);
                    if (viewF == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + aVar.n.toString());
                    }
                    aVar.F(iB);
                    aVar.m.f(iB);
                    m66 m66Var2 = (m66) viewF.getLayoutParams();
                    c76 c76VarM2 = RecyclerView.M(viewF);
                    boolean zI = c76VarM2.i();
                    RecyclerView recyclerView2 = aVar.n;
                    if (zI) {
                        a07 a07Var2 = (a07) recyclerView2.s.n;
                        je8 je8VarA2 = (je8) a07Var2.get(c76VarM2);
                        if (je8VarA2 == null) {
                            je8VarA2 = je8.a();
                            a07Var2.put(c76VarM2, je8VarA2);
                        }
                        je8VarA2.a = 1 | je8VarA2.a;
                    } else {
                        recyclerView2.s.y(c76VarM2);
                    }
                    aVar.m.e(viewF, i, m66Var2, c76VarM2.i());
                }
            } else {
                rq0Var.d(view, i, false);
                m66Var.f1441o = true;
                aa4 aa4Var = this.q;
                if (aa4Var != null && aa4Var.e) {
                    aa4Var.b.getClass();
                    c76 c76VarM3 = RecyclerView.M(view);
                    if ((c76VarM3 != null ? c76VarM3.c() : -1) == aa4Var.a) {
                        aa4Var.f = view;
                        if (RecyclerView.O0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (m66Var.p) {
            if (RecyclerView.O0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + m66Var.m);
            }
            c76VarM.m.invalidate();
            m66Var.p = false;
        }
    }

    public void l0(RecyclerView recyclerView, int i, int i2) {
        k0(i);
    }

    public void m(String str) {
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            recyclerView.j(str);
        }
    }

    public abstract void m0(s66 s66Var, y66 y66Var);

    public final void n(View view, Rect rect) {
        RecyclerView recyclerView = this.n;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.O(view));
        }
    }

    public abstract void n0(y66 y66Var);

    public abstract boolean o();

    public abstract void o0(Parcelable parcelable);

    public abstract boolean p();

    public abstract Parcelable p0();

    public boolean q(m66 m66Var) {
        return true;
    }

    public void q0(int i) {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[PHI: r0
      0x0060: PHI (r0v8 int) = (r0v5 int), (r0v14 int) binds: [B:24:0x007c, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean r0(int i, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        float f;
        s66 s66Var = this.n.f23o;
        int iHeight = this.A;
        int iWidth = this.z;
        Rect rect = new Rect();
        if (this.n.getMatrix().isIdentity() && this.n.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i == 4096) {
            paddingTop = this.n.canScrollVertically(1) ? (iHeight - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.n.canScrollHorizontally(1)) {
                paddingLeft = (iWidth - getPaddingLeft()) - getPaddingRight();
            } else {
                paddingLeft = 0;
            }
        } else if (i != 8192) {
            paddingTop = 0;
            paddingLeft = 0;
        } else {
            paddingTop = this.n.canScrollVertically(-1) ? -((iHeight - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.n.canScrollHorizontally(-1)) {
                paddingLeft = -((iWidth - getPaddingLeft()) - getPaddingRight());
            } else {
                paddingLeft = 0;
            }
        }
        if (paddingTop != 0 || paddingLeft != 0) {
            if (bundle != null) {
                f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f < 0.0f) {
                    if (RecyclerView.N0) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                    }
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                    paddingLeft = (int) (paddingLeft * f);
                    paddingTop = (int) (paddingTop * f);
                }
                this.n.k0(paddingLeft, paddingTop, true);
                return true;
            }
            RecyclerView recyclerView = this.n;
            d66 d66Var = recyclerView.y;
            if (d66Var != null) {
                if (i == 4096) {
                    recyclerView.l0(d66Var.a() - 1);
                    return true;
                }
                if (i != 8192) {
                    return true;
                }
                recyclerView.l0(0);
                return true;
            }
        }
        return false;
    }

    public void s(int i, int i2, y66 y66Var, rr0 rr0Var) {
    }

    public final void s0() {
        for (int iG = G() - 1; iG >= 0; iG--) {
            this.m.m(iG);
        }
    }

    public void t(int i, rr0 rr0Var) {
    }

    public final void t0(s66 s66Var) {
        for (int iG = G() - 1; iG >= 0; iG--) {
            if (!RecyclerView.M(F(iG)).p()) {
                View viewF = F(iG);
                if (F(iG) != null) {
                    this.m.m(iG);
                }
                s66Var.h(viewF);
            }
        }
    }

    public abstract int u(y66 y66Var);

    public final void u0(s66 s66Var) {
        ArrayList arrayList;
        int size = s66Var.a.size();
        int i = size - 1;
        while (true) {
            arrayList = s66Var.a;
            if (i < 0) {
                break;
            }
            View view = ((c76) arrayList.get(i)).m;
            c76 c76VarM = RecyclerView.M(view);
            if (!c76VarM.p()) {
                c76VarM.o(false);
                if (c76VarM.k()) {
                    this.n.removeDetachedView(view, false);
                }
                i66 i66Var = this.n.b0;
                if (i66Var != null) {
                    i66Var.d(c76VarM);
                }
                c76VarM.o(true);
                c76 c76VarM2 = RecyclerView.M(view);
                c76VarM2.z = null;
                c76VarM2.A = false;
                c76VarM2.v &= -33;
                s66Var.i(c76VarM2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = s66Var.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.n.invalidate();
        }
    }

    public abstract int v(y66 y66Var);

    public final void v0(View view, s66 s66Var) {
        rq0 rq0Var = this.m;
        c66 c66Var = (c66) rq0Var.c;
        byte b = rq0Var.b;
        if (b == 1) {
            hk0.l("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (b == 2) {
            hk0.l("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            rq0Var.b = (byte) 1;
            rq0Var.f = view;
            int iIndexOfChild = c66Var.m.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((je0) rq0Var.d).i(iIndexOfChild)) {
                    rq0Var.n(view);
                }
                c66Var.k(iIndexOfChild);
            }
            rq0Var.b = (byte) 0;
            rq0Var.f = null;
            s66Var.h(view);
        } catch (Throwable th) {
            rq0Var.b = (byte) 0;
            rq0Var.f = null;
            throw th;
        }
    }

    public abstract int w(y66 y66Var);

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    public final boolean w0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = this.z - getPaddingRight();
        int paddingBottom = this.A - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int iMin = Math.min(0, i);
        int i2 = top - paddingTop;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - paddingRight;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - paddingBottom);
        if (this.n.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int paddingRight2 = this.z - getPaddingRight();
                int paddingBottom2 = this.A - getPaddingBottom();
                Rect rect2 = this.n.v;
                RecyclerView.N(focusedChild, rect2);
                if (rect2.left - i4 < paddingRight2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < paddingBottom2 && rect2.bottom - i5 > paddingTop2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.k0(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.k0(i4, i5, false);
            return true;
        }
        return false;
    }

    public abstract int x(y66 y66Var);

    public final void x0() {
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int y(y66 y66Var);

    public abstract int y0(int i, s66 s66Var, y66 y66Var);

    public abstract int z(y66 y66Var);

    public abstract void z0(int i);
}
