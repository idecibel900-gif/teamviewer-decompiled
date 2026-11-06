package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.v0;
import io.sentry.h2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.a07;
import o.a76;
import o.aa4;
import o.an4;
import o.ay2;
import o.b66;
import o.b76;
import o.be8;
import o.bt1;
import o.c66;
import o.c76;
import o.ce8;
import o.d66;
import o.e12;
import o.e76;
import o.f25;
import o.fx3;
import o.g25;
import o.g66;
import o.gk0;
import o.h66;
import o.hk0;
import o.i66;
import o.j66;
import o.je0;
import o.je8;
import o.jn3;
import o.lf1;
import o.lh7;
import o.ln3;
import o.m66;
import o.mg4;
import o.n66;
import o.nk1;
import o.o66;
import o.p66;
import o.q8;
import o.r66;
import o.r8;
import o.rq0;
import o.rr0;
import o.s66;
import o.t66;
import o.u66;
import o.ua5;
import o.v66;
import o.vd8;
import o.vh2;
import o.vs1;
import o.vt1;
import o.xz5;
import o.y66;
import o.yq4;
import o.z66;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, f25 {
    public static boolean N0 = false;
    public static boolean O0 = false;
    public static final int[] P0 = {R.attr.nestedScrollingEnabled};
    public static final float Q0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean R0 = true;
    public static final boolean S0 = true;
    public static final Class[] T0;
    public static final jn3 U0;
    public static final z66 V0;
    public final ArrayList A;
    public final int[] A0;
    public final ArrayList B;
    public g25 B0;
    public final ArrayList C;
    public final int[] C0;
    public o66 D;
    public final int[] D0;
    public boolean E;
    public final int[] E0;
    public boolean F;
    public final ArrayList F0;
    public boolean G;
    public final b66 G0;
    public int H;
    public boolean H0;
    public boolean I;
    public int I0;
    public boolean J;
    public int J0;
    public boolean K;
    public final boolean K0;
    public int L;
    public final c66 L0;
    public boolean M;
    public final e12 M0;
    public final AccessibilityManager N;
    public ArrayList O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public h66 T;
    public EdgeEffect U;
    public EdgeEffect V;
    public EdgeEffect W;
    public EdgeEffect a0;
    public i66 b0;
    public int c0;
    public int d0;
    public VelocityTracker e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public final int k0;
    public final int l0;
    public final float m;
    public final float m0;
    public final u66 n;
    public final float n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s66 f23o;
    public boolean o0;
    public v66 p;
    public final b76 p0;
    public final r8 q;
    public ay2 q0;
    public final rq0 r;
    public final rr0 r0;
    public final lh7 s;
    public final y66 s0;
    public boolean t;
    public p66 t0;
    public final b66 u;
    public ArrayList u0;
    public final Rect v;
    public boolean v0;
    public final Rect w;
    public boolean w0;
    public final RectF x;
    public final c66 x0;
    public d66 y;
    public boolean y0;
    public a z;
    public e76 z0;

    static {
        Class cls = Integer.TYPE;
        T0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        U0 = new jn3((byte) 2);
        V0 = new z66();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.n = new u66(this);
        this.f23o = new s66(this);
        this.s = new lh7((byte) 11);
        this.u = new b66(this, (byte) 0);
        this.v = new Rect();
        this.w = new Rect();
        this.x = new RectF();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.H = 0;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        this.T = V0;
        nk1 nk1Var = new nk1();
        nk1Var.a = null;
        nk1Var.b = new ArrayList();
        nk1Var.c = (byte) 120;
        nk1Var.d = (byte) 120;
        nk1Var.e = (short) 250;
        nk1Var.f = (short) 250;
        byte b = 1;
        nk1Var.g = true;
        nk1Var.h = new ArrayList();
        nk1Var.i = new ArrayList();
        nk1Var.j = new ArrayList();
        nk1Var.k = new ArrayList();
        nk1Var.l = new ArrayList();
        nk1Var.m = new ArrayList();
        nk1Var.n = new ArrayList();
        nk1Var.f1572o = new ArrayList();
        nk1Var.p = new ArrayList();
        nk1Var.q = new ArrayList();
        nk1Var.r = new ArrayList();
        this.b0 = nk1Var;
        this.c0 = 0;
        this.d0 = -1;
        this.m0 = Float.MIN_VALUE;
        this.n0 = Float.MIN_VALUE;
        this.o0 = true;
        this.p0 = new b76(this);
        this.r0 = S0 ? new rr0((byte) 2) : null;
        y66 y66Var = new y66();
        y66Var.a = -1;
        y66Var.b = 0;
        y66Var.c = 0;
        y66Var.d = (byte) 1;
        y66Var.e = 0;
        y66Var.f = false;
        y66Var.g = false;
        y66Var.h = false;
        y66Var.i = false;
        y66Var.j = false;
        y66Var.k = false;
        this.s0 = y66Var;
        this.v0 = false;
        this.w0 = false;
        c66 c66Var = new c66(this);
        this.x0 = c66Var;
        this.y0 = false;
        this.A0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new ArrayList();
        this.G0 = new b66(this, b);
        this.I0 = 0;
        this.J0 = 0;
        this.L0 = new c66(this);
        this.M0 = new e12(getContext(), new c66(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.j0 = viewConfiguration.getScaledTouchSlop();
        this.m0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.n0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.m = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.b0.a = c66Var;
        this.q = new r8(new c66(this));
        this.r = new rq0(new c66(this));
        WeakHashMap weakHashMap = be8.a;
        if (vd8.a(this) == 0) {
            vd8.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.N = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new e76(this));
        int[] iArr = xz5.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        be8.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.t = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                hk0.g("Trying to set fast scroller without both required drawables.".concat(B()));
                throw null;
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            new vh2(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.teamviewer.teamviewer.market.mobile.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.teamviewer.teamviewer.market.mobile.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.teamviewer.teamviewer.market.mobile.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.K0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(a.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(T0);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[b] = attributeSet;
                        objArr[2] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((a) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    yq4.i(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    yq4.i(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    yq4.i(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    yq4.i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    yq4.i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = P0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        be8.l(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(com.teamviewer.teamviewer.market.mobile.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewG = G(viewGroup.getChildAt(i));
            if (recyclerViewG != null) {
                return recyclerViewG;
            }
        }
        return null;
    }

    public static c76 M(View view) {
        if (view == null) {
            return null;
        }
        return ((m66) view.getLayoutParams()).m;
    }

    public static void N(View view, Rect rect) {
        m66 m66Var = (m66) view.getLayoutParams();
        Rect rect2 = m66Var.n;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) m66Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) m66Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) m66Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) m66Var).bottomMargin);
    }

    private g25 getScrollingChildHelper() {
        g25 g25Var = this.B0;
        if (g25Var != null) {
            return g25Var;
        }
        g25 g25Var2 = new g25(this);
        this.B0 = g25Var2;
        return g25Var2;
    }

    public static void k(c76 c76Var) {
        WeakReference weakReference = c76Var.n;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c76Var.m) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c76Var.n = null;
        }
    }

    public static int n(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && bt1.w(edgeEffect) != 0.0f) {
            int iRound = Math.round(bt1.K(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || bt1.w(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(bt1.K(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        N0 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        O0 = z;
    }

    public final void A() {
        if (this.V != null) {
            return;
        }
        ((z66) this.T).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.V = edgeEffect;
        if (this.t) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.y + ", layout:" + this.z + ", context:" + getContext();
    }

    public final void C(y66 y66Var) {
        if (getScrollState() != 2) {
            y66Var.getClass();
            return;
        }
        OverScroller overScroller = this.p0.f405o;
        overScroller.getFinalX();
        overScroller.getCurrX();
        y66Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o66 o66Var = (o66) arrayList.get(i);
            if (o66Var.b(motionEvent) && action != 3) {
                this.D = o66Var;
                return true;
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        rq0 rq0Var = this.r;
        int iH = rq0Var.h();
        if (iH == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iH; i3++) {
            c76 c76VarM = M(rq0Var.g(i3));
            if (!c76VarM.p()) {
                int iC = c76VarM.c();
                if (iC < i) {
                    i = iC;
                }
                if (iC > i2) {
                    i2 = iC;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final c76 H(int i) {
        c76 c76Var = null;
        if (this.P) {
            return null;
        }
        rq0 rq0Var = this.r;
        int iK = rq0Var.k();
        for (int i2 = 0; i2 < iK; i2++) {
            c76 c76VarM = M(rq0Var.j(i2));
            if (c76VarM != null && !c76VarM.i() && J(c76VarM) == i) {
                if (!((ArrayList) rq0Var.e).contains(c76VarM.m)) {
                    return c76VarM;
                }
                c76Var = c76VarM;
            }
        }
        return c76Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    public final boolean I(int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        a aVar = this.z;
        if (aVar == null) {
            v0.c("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.J) {
            boolean zO = aVar.o();
            boolean zP = this.z.p();
            if (!zO || Math.abs(i) < i3) {
                i = 0;
            }
            if (!zP || Math.abs(i2) < i3) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.U;
                    if (edgeEffect == null || bt1.w(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.W;
                        if (edgeEffect2 == null || bt1.w(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (j0(this.W, i, getWidth())) {
                            this.W.onAbsorb(i);
                            i = 0;
                        }
                    } else {
                        int i6 = -i;
                        if (j0(this.U, i6, getWidth())) {
                            this.U.onAbsorb(i6);
                            i = 0;
                        }
                    }
                    iMax = i;
                    i = 0;
                }
                if (i2 == 0) {
                    i5 = i2;
                    i2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.V;
                    if (edgeEffect3 == null || bt1.w(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.a0;
                        if (edgeEffect4 == null || bt1.w(edgeEffect4) == 0.0f) {
                            i5 = i2;
                            i2 = 0;
                        } else if (j0(this.a0, i2, getHeight())) {
                            this.a0.onAbsorb(i2);
                            i2 = 0;
                        }
                    } else {
                        int i7 = -i2;
                        if (j0(this.V, i7, getHeight())) {
                            this.V.onAbsorb(i7);
                            i2 = 0;
                        }
                    }
                    i5 = 0;
                }
                b76 b76Var = this.p0;
                if (iMax != 0 || i2 != 0) {
                    int i8 = -i4;
                    iMax = Math.max(i8, Math.min(iMax, i4));
                    i2 = Math.max(i8, Math.min(i2, i4));
                    n0(1);
                    b76Var.a(iMax, i2);
                }
                if (i != 0 || i5 != 0) {
                    float f = i;
                    float f2 = i5;
                    if (!dispatchNestedPreFling(f, f2)) {
                        boolean z = zO || zP;
                        dispatchNestedFling(f, f2, z);
                        if (z) {
                            n0(1);
                            int i9 = -i4;
                            b76Var.a(Math.max(i9, Math.min(i, i4)), Math.max(i9, Math.min(i5, i4)));
                            return true;
                        }
                    }
                } else if (iMax != 0 || i2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int J(c76 c76Var) {
        if ((c76Var.v & 524) == 0 && c76Var.f()) {
            int i = c76Var.f498o;
            ArrayList arrayList = (ArrayList) this.q.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                q8 q8Var = (q8) arrayList.get(i2);
                byte b = q8Var.a;
                if (b != 1) {
                    if (b == 2) {
                        int i3 = q8Var.b;
                        if (i3 <= i) {
                            int i4 = q8Var.d;
                            if (i3 + i4 <= i) {
                                i -= i4;
                            }
                        } else {
                            continue;
                        }
                    } else if (b == 8) {
                        int i5 = q8Var.b;
                        if (i5 == i) {
                            i = q8Var.d;
                        } else {
                            if (i5 < i) {
                                i--;
                            }
                            if (q8Var.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (q8Var.b <= i) {
                    i += q8Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long K(c76 c76Var) {
        return this.y.b ? c76Var.q : c76Var.f498o;
    }

    public final c76 L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return M(view);
        }
        yq4.s("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect O(View view) {
        m66 m66Var = (m66) view.getLayoutParams();
        boolean z = m66Var.f1441o;
        Rect rect = m66Var.n;
        if (!z || (this.s0.g && (m66Var.m.l() || m66Var.m.g()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.v;
            rect2.set(0, 0, 0, 0);
            ((j66) arrayList.get(i)).d(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        m66Var.f1441o = false;
        return rect;
    }

    public final boolean P() {
        return !this.G || this.P || this.q.w();
    }

    public final boolean Q() {
        return this.R > 0;
    }

    public final void R(int i) {
        if (this.z == null) {
            return;
        }
        setScrollState(2);
        this.z.z0(i);
        awakenScrollBars();
    }

    public final void S() {
        rq0 rq0Var = this.r;
        int iK = rq0Var.k();
        for (int i = 0; i < iK; i++) {
            ((m66) rq0Var.j(i).getLayoutParams()).f1441o = true;
        }
        ArrayList arrayList = this.f23o.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m66 m66Var = (m66) ((c76) arrayList.get(i2)).m.getLayoutParams();
            if (m66Var != null) {
                m66Var.f1441o = true;
            }
        }
    }

    public final void T(int i, int i2, boolean z) {
        int i3 = i + i2;
        rq0 rq0Var = this.r;
        int iK = rq0Var.k();
        for (int i4 = 0; i4 < iK; i4++) {
            c76 c76VarM = M(rq0Var.j(i4));
            if (c76VarM != null && !c76VarM.p()) {
                int i5 = c76VarM.f498o;
                y66 y66Var = this.s0;
                if (i5 >= i3) {
                    if (O0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + c76VarM + " now at position " + (c76VarM.f498o - i2));
                    }
                    c76VarM.m(-i2, z);
                    y66Var.f = true;
                } else if (i5 >= i) {
                    if (O0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + c76VarM + " now REMOVED");
                    }
                    c76VarM.a(8);
                    c76VarM.m(-i2, z);
                    c76VarM.f498o = i - 1;
                    y66Var.f = true;
                }
            }
        }
        s66 s66Var = this.f23o;
        ArrayList arrayList = s66Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c76 c76Var = (c76) arrayList.get(size);
            if (c76Var != null) {
                int i6 = c76Var.f498o;
                if (i6 >= i3) {
                    if (O0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + c76Var + " now at position " + (c76Var.f498o - i2));
                    }
                    c76Var.m(-i2, z);
                } else if (i6 >= i) {
                    c76Var.a(8);
                    s66Var.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void U() {
        this.R++;
    }

    public final void V(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.R - 1;
        this.R = i2;
        if (i2 < 1) {
            if (N0 && i2 < 0) {
                hk0.l("layout or scroll counter cannot go below zero.Some calls are not matching".concat(B()));
                return;
            }
            this.R = 0;
            if (z) {
                int i3 = this.L;
                this.L = 0;
                if (i3 != 0 && (accessibilityManager = this.N) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.F0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c76 c76Var = (c76) arrayList.get(size);
                    if (c76Var.m.getParent() == this && !c76Var.p() && (i = c76Var.C) != -1) {
                        c76Var.m.setImportantForAccessibility(i);
                        c76Var.C = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void W(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.d0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.d0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.h0 = x;
            this.f0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.i0 = y;
            this.g0 = y;
        }
    }

    public final void X() {
        if (this.y0 || !this.E) {
            return;
        }
        WeakHashMap weakHashMap = be8.a;
        postOnAnimation(this.G0);
        this.y0 = true;
    }

    public final void Y() {
        boolean z;
        boolean z2 = this.P;
        r8 r8Var = this.q;
        boolean z3 = false;
        if (z2) {
            r8Var.H((ArrayList) r8Var.d);
            r8Var.H((ArrayList) r8Var.e);
            r8Var.b = 0;
            if (this.Q) {
                this.z.h0();
            }
        }
        if (this.b0 != null && this.z.L0()) {
            r8Var.F();
        } else {
            r8Var.n();
        }
        boolean z4 = this.v0 || this.w0;
        boolean z5 = this.G && this.b0 != null && ((z = this.P) || z4 || this.z.r) && (!z || this.y.b);
        y66 y66Var = this.s0;
        y66Var.j = z5;
        if (z5 && z4 && !this.P && this.b0 != null && this.z.L0()) {
            z3 = true;
        }
        y66Var.k = z3;
    }

    public final void Z(boolean z) {
        this.Q = z | this.Q;
        this.P = true;
        rq0 rq0Var = this.r;
        int iK = rq0Var.k();
        for (int i = 0; i < iK; i++) {
            c76 c76VarM = M(rq0Var.j(i));
            if (c76VarM != null && !c76VarM.p()) {
                c76VarM.a(6);
            }
        }
        S();
        s66 s66Var = this.f23o;
        ArrayList arrayList = s66Var.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c76 c76Var = (c76) arrayList.get(i2);
            if (c76Var != null) {
                c76Var.a(6);
                c76Var.a(1024);
            }
        }
        d66 d66Var = s66Var.h.y;
        if (d66Var == null || !d66Var.b) {
            s66Var.f();
        }
    }

    public final void a0(c76 c76Var, lf1 lf1Var) {
        c76Var.v &= -8193;
        boolean z = this.s0.h;
        lh7 lh7Var = this.s;
        if (z && c76Var.l() && !c76Var.i() && !c76Var.p()) {
            ((mg4) lh7Var.f1364o).e(K(c76Var), c76Var);
        }
        a07 a07Var = (a07) lh7Var.n;
        je8 je8VarA = (je8) a07Var.get(c76Var);
        if (je8VarA == null) {
            je8VarA = je8.a();
            a07Var.put(c76Var, je8VarA);
        }
        je8VarA.b = lf1Var;
        je8VarA.a |= 4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        a aVar = this.z;
        if (aVar != null) {
            aVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.U.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.V;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.W;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.a0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.a0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final int c0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.U;
        float f2 = 0.0f;
        if (edgeEffect == null || bt1.w(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.W;
            if (edgeEffect2 != null && bt1.w(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.W;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fK = bt1.K(edgeEffect3, width, height);
                    if (bt1.w(this.W) == 0.0f) {
                        this.W.onRelease();
                    }
                    f2 = fK;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.U;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -bt1.K(edgeEffect4, -width, 1.0f - height);
                if (bt1.w(this.U) == 0.0f) {
                    this.U.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m66) && this.z.q((m66) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        a aVar = this.z;
        if (aVar != null && aVar.o()) {
            return this.z.u(this.s0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        a aVar = this.z;
        if (aVar != null && aVar.o()) {
            return this.z.v(this.s0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        a aVar = this.z;
        if (aVar != null && aVar.o()) {
            return this.z.w(this.s0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        a aVar = this.z;
        if (aVar != null && aVar.p()) {
            return this.z.x(this.s0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        a aVar = this.z;
        if (aVar != null && aVar.p()) {
            return this.z.y(this.s0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        a aVar = this.z;
        if (aVar != null && aVar.p()) {
            return this.z.z(this.s0);
        }
        return 0;
    }

    public final int d0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.V;
        float f2 = 0.0f;
        if (edgeEffect == null || bt1.w(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.a0;
            if (edgeEffect2 != null && bt1.w(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.a0;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fK = bt1.K(edgeEffect3, height, 1.0f - width);
                    if (bt1.w(this.a0) == 0.0f) {
                        this.a0.onRelease();
                    }
                    f2 = fK;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.V;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -bt1.K(edgeEffect4, -height, width);
                if (bt1.w(this.V) == 0.0f) {
                    this.V.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        a layoutManager = getLayoutManager();
        int iA = 0;
        if (layoutManager != null) {
            if (layoutManager.p()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        k0(0, measuredHeight, false);
                        return true;
                    }
                    k0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zT = layoutManager.T();
                    if (keyCode == 122) {
                        if (zT) {
                            iA = getAdapter().a();
                        }
                    } else if (!zT) {
                        iA = getAdapter().a();
                    }
                    l0(iA);
                    return true;
                }
            } else if (layoutManager.o()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        k0(measuredWidth, 0, false);
                        return true;
                    }
                    k0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zT2 = layoutManager.T();
                    if (keyCode2 == 122) {
                        if (zT2) {
                            iA = getAdapter().a();
                        }
                    } else if (!zT2) {
                        iA = getAdapter().a();
                    }
                    l0(iA);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((j66) arrayList.get(i)).f(canvas, this);
        }
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.t ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.U;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.t) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.V;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.W;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.t ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.W;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.a0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.t) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.a0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.b0 == null || arrayList.size() <= 0 || !this.b0.f()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(j66 j66Var) {
        a aVar = this.z;
        if (aVar != null) {
            aVar.m("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.B;
        arrayList.remove(j66Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        S();
        requestLayout();
    }

    public final void f0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.v;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m66) {
            m66 m66Var = (m66) layoutParams;
            if (!m66Var.f1441o) {
                Rect rect2 = m66Var.n;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.z.w0(this, view, this.v, !this.G, view2 == null);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0166  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:126:0x017b  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0181  */
    /* JADX WARN: Code duplicated, block: B:131:0x0183  */
    /* JADX WARN: Code duplicated, block: B:132:0x0185  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0113  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0163, code lost:
    
        if (r16 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0170, code lost:
    
        if (r5 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0173, code lost:
    
        if (r16 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0176, code lost:
    
        if (r5 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x017e, code lost:
    
        if ((r5 * r6) <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0186, code lost:
    
        if ((r5 * r6) >= 0) goto L135;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r19, int r20) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT, PHI: r7
      0x00fe: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e5, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    public final boolean g0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        o();
        d66 d66Var = this.y;
        int[] iArr = this.E0;
        if (d66Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            h0(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.B.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i4, i5, i6, i7, this.C0, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.h0;
        int[] iArr2 = this.C0;
        int i13 = iArr2[0];
        this.h0 = i12 - i13;
        int i14 = this.i0;
        int i15 = iArr2[1];
        this.i0 = i14 - i15;
        int[] iArr3 = this.D0;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || vs1.E(motionEvent, 8194)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    y();
                    z = true;
                    z2 = false;
                    bt1.K(this.U, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        z();
                        bt1.K(this.W, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                    }
                    if (f2 < 0.0f) {
                        A();
                        bt1.K(this.V, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        x();
                        bt1.K(this.a0, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        if (z3 || f != 0.0f || f2 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && vs1.E(motionEvent, 4194304)) {
                            b0();
                        }
                    }
                    z3 = z;
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        b0();
                    }
                }
                z3 = z;
                if (f2 < 0.0f) {
                    A();
                    bt1.K(this.V, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    x();
                    bt1.K(this.a0, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        b0();
                    }
                }
                z3 = z;
                if (z3) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    b0();
                }
            }
            m(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            w(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = this.z;
        if (aVar != null) {
            return aVar.C();
        }
        hk0.l("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        a aVar = this.z;
        if (aVar != null) {
            return aVar.D(getContext(), attributeSet);
        }
        hk0.l("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public d66 getAdapter() {
        return this.y;
    }

    @Override // android.view.View
    public int getBaseline() {
        a aVar = this.z;
        if (aVar == null) {
            return super.getBaseline();
        }
        aVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.t;
    }

    public e76 getCompatAccessibilityDelegate() {
        return this.z0;
    }

    public h66 getEdgeEffectFactory() {
        return this.T;
    }

    public i66 getItemAnimator() {
        return this.b0;
    }

    public int getItemDecorationCount() {
        return this.B.size();
    }

    public a getLayoutManager() {
        return this.z;
    }

    public int getMaxFlingVelocity() {
        return this.l0;
    }

    public int getMinFlingVelocity() {
        return this.k0;
    }

    public long getNanoTime() {
        if (S0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public n66 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.o0;
    }

    public r66 getRecycledViewPool() {
        return this.f23o.c();
    }

    public int getScrollState() {
        return this.c0;
    }

    public final void h(c76 c76Var) {
        View view = c76Var.m;
        boolean z = view.getParent() == this;
        this.f23o.l(L(view));
        boolean zK = c76Var.k();
        rq0 rq0Var = this.r;
        if (zK) {
            rq0Var.e(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            rq0Var.d(view, -1, true);
            return;
        }
        int iIndexOfChild = ((c66) rq0Var.c).m.indexOfChild(view);
        if (iIndexOfChild < 0) {
            an4.i(view, "view is not a child, cannot hide ");
        } else {
            ((je0) rq0Var.d).k(iIndexOfChild);
            rq0Var.l(view);
        }
    }

    public final void h0(int i, int i2, int[] iArr) {
        c76 c76Var;
        m0();
        U();
        Trace.beginSection("RV Scroll");
        y66 y66Var = this.s0;
        C(y66Var);
        s66 s66Var = this.f23o;
        int iY0 = i != 0 ? this.z.y0(i, s66Var, y66Var) : 0;
        int iA0 = i2 != 0 ? this.z.A0(i2, s66Var, y66Var) : 0;
        Trace.endSection();
        rq0 rq0Var = this.r;
        int iH = rq0Var.h();
        for (int i3 = 0; i3 < iH; i3++) {
            View viewG = rq0Var.g(i3);
            c76 c76VarL = L(viewG);
            if (c76VarL != null && (c76Var = c76VarL.u) != null) {
                View view = c76Var.m;
                int left = viewG.getLeft();
                int top = viewG.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        V(true);
        o0(false);
        if (iArr != null) {
            iArr[0] = iY0;
            iArr[1] = iA0;
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(j66 j66Var) {
        a aVar = this.z;
        if (aVar != null) {
            aVar.m("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(j66Var);
        S();
        requestLayout();
    }

    public final void i0(int i) {
        if (this.J) {
            return;
        }
        q0();
        a aVar = this.z;
        if (aVar == null) {
            v0.c("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            aVar.z0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.E;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.J;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(String str) {
        if (!Q()) {
            if (this.S > 0) {
                v0.l("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(B()));
            }
        } else if (str == null) {
            hk0.l("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(B()));
        } else {
            hk0.l(str);
        }
    }

    public final boolean j0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fW = bt1.w(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.m * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = Q0;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fW;
    }

    public final void k0(int i, int i2, boolean z) {
        a aVar = this.z;
        if (aVar == null) {
            v0.c("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.J) {
            return;
        }
        if (!aVar.o()) {
            i = 0;
        }
        if (!this.z.p()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.p0.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void l() {
        rq0 rq0Var = this.r;
        int iK = rq0Var.k();
        for (int i = 0; i < iK; i++) {
            c76 c76VarM = M(rq0Var.j(i));
            if (!c76VarM.p()) {
                c76VarM.p = -1;
                c76VarM.s = -1;
            }
        }
        s66 s66Var = this.f23o;
        ArrayList arrayList = s66Var.a;
        ArrayList arrayList2 = s66Var.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            c76 c76Var = (c76) arrayList2.get(i2);
            c76Var.p = -1;
            c76Var.s = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            c76 c76Var2 = (c76) arrayList.get(i3);
            c76Var2.p = -1;
            c76Var2.s = -1;
        }
        ArrayList arrayList3 = s66Var.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                c76 c76Var3 = (c76) s66Var.b.get(i4);
                c76Var3.p = -1;
                c76Var3.s = -1;
            }
        }
    }

    public final void l0(int i) {
        if (this.J) {
            return;
        }
        a aVar = this.z;
        if (aVar == null) {
            v0.c("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            aVar.J0(this, i);
        }
    }

    public final void m(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.U.onRelease();
            zIsFinished = this.U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.W;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.W.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.V.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.a0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.a0.onRelease();
            zIsFinished |= this.a0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void m0() {
        int i = this.H + 1;
        this.H = i;
        if (i != 1 || this.J) {
            return;
        }
        this.I = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(int i) {
        boolean zO = this.z.o();
        int i2 = zO;
        if (this.z.p()) {
            i2 = (zO ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i2, i);
    }

    public final void o() {
        if (!this.G || this.P) {
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        r8 r8Var = this.q;
        if (r8Var.w()) {
            int i = r8Var.b;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (r8Var.w()) {
                    Trace.beginSection("RV FullInvalidate");
                    r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            m0();
            U();
            r8Var.F();
            if (!this.I) {
                rq0 rq0Var = this.r;
                int iH = rq0Var.h();
                for (int i2 = 0; i2 < iH; i2++) {
                    c76 c76VarM = M(rq0Var.g(i2));
                    if (c76VarM != null && !c76VarM.p() && c76VarM.l()) {
                        r();
                    }
                }
                r8Var.k();
            }
            o0(true);
            V(true);
            Trace.endSection();
        }
    }

    public final void o0(boolean z) {
        int i = this.H;
        if (i < 1) {
            if (N0) {
                hk0.l("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(B()));
                return;
            } else {
                this.H = 1;
                i = 1;
            }
        }
        if (!z && !this.J) {
            this.I = false;
        }
        if (i == 1) {
            if (z && this.I && !this.J && this.z != null && this.y != null) {
                r();
            }
            if (!this.J) {
                this.I = false;
            }
        }
        this.H--;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.R = 0;
        this.E = true;
        this.G = this.G && !isLayoutRequested();
        this.f23o.d();
        a aVar = this.z;
        if (aVar != null) {
            aVar.s = true;
            aVar.Z(this);
        }
        this.y0 = false;
        if (S0) {
            ThreadLocal threadLocal = ay2.q;
            ay2 ay2Var = (ay2) threadLocal.get();
            this.q0 = ay2Var;
            if (ay2Var == null) {
                this.q0 = new ay2();
                WeakHashMap weakHashMap = be8.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                ay2 ay2Var2 = this.q0;
                ay2Var2.f373o = (long) (1.0E9f / refreshRate);
                threadLocal.set(ay2Var2);
            }
            ArrayList arrayList = this.q0.m;
            if (N0 && arrayList.contains(this)) {
                hk0.l("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ay2 ay2Var;
        super.onDetachedFromWindow();
        i66 i66Var = this.b0;
        if (i66Var != null) {
            i66Var.e();
        }
        q0();
        int i = 0;
        this.E = false;
        a aVar = this.z;
        if (aVar != null) {
            aVar.s = false;
            aVar.a0(this);
        }
        this.F0.clear();
        removeCallbacks(this.G0);
        this.s.getClass();
        while (je8.d.a() != null) {
        }
        s66 s66Var = this.f23o;
        ArrayList arrayList = s66Var.c;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            vt1.n(((c76) arrayList.get(i2)).m);
        }
        s66Var.e(s66Var.h.y, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = vt1.y(childAt).a;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((ce8) arrayList2.get(size)).a.e();
                }
            }
            i = i3;
        }
        if (!S0 || (ay2Var = this.q0) == null) {
            return;
        }
        boolean zRemove = ay2Var.m.remove(this);
        if (!N0 || zRemove) {
            this.q0 = null;
        } else {
            hk0.l("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((j66) arrayList.get(i)).e(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.z != null && !this.J && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.z.p() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.z.o() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f2;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.z.p()) {
                    float f3 = -axisValue;
                    axisValue = 0.0f;
                    f = f3;
                } else if (!this.z.o()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.K0;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.n0);
            int i3 = (int) (axisValue * this.m0);
            if (z) {
                OverScroller overScroller = this.p0.f405o;
                k0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                a aVar = this.z;
                if (aVar == null) {
                    v0.c("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.J) {
                    int[] iArr = this.E0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zO = aVar.o();
                    boolean zP = this.z.p();
                    int i4 = zP ? (zO ? 1 : 0) | 2 : zO ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iC0 = i3 - c0(i3, y);
                    int iD0 = i2 - d0(i2, x);
                    getScrollingChildHelper().g(i4, 1);
                    if (u(zO ? iC0 : 0, zP ? iD0 : 0, 1, this.E0, this.C0)) {
                        iC0 -= iArr[0];
                        iD0 -= iArr[1];
                    }
                    g0(zO ? iC0 : 0, zP ? iD0 : 0, motionEvent, 1);
                    ay2 ay2Var = this.q0;
                    if (ay2Var != null && (iC0 != 0 || iD0 != 0)) {
                        ay2Var.a(this, iC0, iD0);
                    }
                    p0(1);
                }
            }
            if (i != 0 && !z) {
                this.M0.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.J) {
            this.D = null;
            if (E(motionEvent)) {
                VelocityTracker velocityTracker = this.e0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                p0(0);
                b0();
                setScrollState(0);
                return true;
            }
            a aVar = this.z;
            if (aVar != null) {
                boolean zO = aVar.o();
                boolean zP = this.z.p();
                VelocityTracker velocityTrackerObtain = this.e0;
                if (velocityTrackerObtain == null) {
                    velocityTrackerObtain = VelocityTracker.obtain();
                    this.e0 = velocityTrackerObtain;
                }
                velocityTrackerObtain.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.K) {
                        this.K = false;
                    }
                    this.d0 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.h0 = x;
                    this.f0 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.i0 = y;
                    this.g0 = y;
                    EdgeEffect edgeEffect = this.U;
                    if (edgeEffect == null || bt1.w(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        bt1.K(this.U, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.W;
                    if (edgeEffect2 != null && bt1.w(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        bt1.K(this.W, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.V;
                    if (edgeEffect3 != null && bt1.w(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        bt1.K(this.V, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.a0;
                    if (edgeEffect4 != null && bt1.w(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        bt1.K(this.a0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.c0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        p0(1);
                    }
                    int[] iArr = this.D0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    n0(0);
                } else if (actionMasked == 1) {
                    this.e0.clear();
                    p0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.d0);
                    if (iFindPointerIndex < 0) {
                        v0.c("RecyclerView", "Error processing scroll; pointer index for id " + this.d0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.c0 != 1) {
                        int i = x2 - this.f0;
                        int i2 = y2 - this.g0;
                        if (!zO || Math.abs(i) <= this.j0) {
                            z2 = false;
                        } else {
                            this.h0 = x2;
                            z2 = true;
                        }
                        if (zP && Math.abs(i2) > this.j0) {
                            this.i0 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.e0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    p0(0);
                    b0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.d0 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.h0 = x3;
                    this.f0 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.i0 = y3;
                    this.g0 = y3;
                } else if (actionMasked == 6) {
                    W(motionEvent);
                }
                if (this.c0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.G = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar = this.z;
        if (aVar == null) {
            p(i, i2);
            return;
        }
        boolean zS = aVar.S();
        boolean z = false;
        y66 y66Var = this.s0;
        if (zS) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.z.n.p(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.H0 = z;
            if (z || this.y == null) {
                return;
            }
            if (y66Var.d == 1) {
                s();
            }
            this.z.C0(i, i2);
            y66Var.i = true;
            t();
            this.z.E0(i, i2);
            if (this.z.H0()) {
                this.z.C0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                y66Var.i = true;
                t();
                this.z.E0(i, i2);
            }
            this.I0 = getMeasuredWidth();
            this.J0 = getMeasuredHeight();
            return;
        }
        if (this.F) {
            this.z.n.p(i, i2);
            return;
        }
        if (this.M) {
            m0();
            U();
            Y();
            V(true);
            if (y66Var.k) {
                y66Var.g = true;
            } else {
                this.q.n();
                y66Var.g = false;
            }
            this.M = false;
            o0(false);
        } else if (y66Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        d66 d66Var = this.y;
        if (d66Var != null) {
            y66Var.e = d66Var.a();
        } else {
            y66Var.e = 0;
        }
        m0();
        this.z.n.p(i, i2);
        o0(false);
        y66Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (Q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v66)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v66 v66Var = (v66) parcelable;
        this.p = v66Var;
        super.onRestoreInstanceState(v66Var.m);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        v66 v66Var = new v66(super.onSaveInstanceState());
        v66 v66Var2 = this.p;
        if (v66Var2 != null) {
            v66Var.f2280o = v66Var2.f2280o;
            return v66Var;
        }
        a aVar = this.z;
        if (aVar != null) {
            v66Var.f2280o = aVar.p0();
            return v66Var;
        }
        v66Var.f2280o = null;
        return v66Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.a0 = null;
        this.V = null;
        this.W = null;
        this.U = null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x010f A[PHI: r1
      0x010f: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zE;
        boolean z;
        if (!this.J && !this.K) {
            o66 o66Var = this.D;
            if (o66Var == null) {
                zE = motionEvent.getAction() == 0 ? false : E(motionEvent);
            } else {
                o66Var.a(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.D = null;
                }
                zE = true;
            }
            if (zE) {
                VelocityTracker velocityTracker = this.e0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                p0(0);
                b0();
                setScrollState(0);
                return true;
            }
            a aVar = this.z;
            if (aVar != null) {
                boolean zO = aVar.o();
                boolean zP = this.z.p();
                if (this.e0 == null) {
                    this.e0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.D0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.e0.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.e0;
                        int i = this.l0;
                        velocityTracker2.computeCurrentVelocity(1000, i);
                        float f = zO ? -this.e0.getXVelocity(this.d0) : 0.0f;
                        float f2 = zP ? -this.e0.getYVelocity(this.d0) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !I((int) f, (int) f2, this.k0, i)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.e0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        p0(0);
                        b0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.d0);
                        if (iFindPointerIndex < 0) {
                            v0.c("RecyclerView", "Error processing scroll; pointer index for id " + this.d0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.h0 - x;
                        int iMax2 = this.i0 - y;
                        if (this.c0 != 1) {
                            if (zO) {
                                int i2 = this.j0;
                                iMax = iMax > 0 ? Math.max(0, iMax - i2) : Math.min(0, iMax + i2);
                                if (iMax != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (zP) {
                                int i3 = this.j0;
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i3) : Math.min(0, iMax2 + i3);
                                if (iMax2 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.c0 == 1) {
                            int[] iArr2 = this.E0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iC0 = iMax - c0(iMax, motionEvent.getY());
                            int iD0 = iMax2 - d0(iMax2, motionEvent.getX());
                            boolean zU = u(zO ? iC0 : 0, zP ? iD0 : 0, 0, this.E0, this.C0);
                            int[] iArr3 = this.C0;
                            if (zU) {
                                iC0 -= iArr2[0];
                                iD0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i4 = iC0;
                            int i5 = iD0;
                            this.h0 = x - iArr3[0];
                            this.i0 = y - iArr3[1];
                            if (g0(zO ? i4 : 0, zP ? i5 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            ay2 ay2Var = this.q0;
                            if (ay2Var != null && (i4 != 0 || i5 != 0)) {
                                ay2Var.a(this, i4, i5);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.e0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        p0(0);
                        b0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.d0 = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.h0 = x2;
                        this.f0 = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.i0 = y2;
                        this.g0 = y2;
                    } else if (actionMasked == 6) {
                        W(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.d0 = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.h0 = x3;
                this.f0 = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.i0 = y3;
                this.g0 = y3;
                n0(0);
                this.e0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = be8.a;
        setMeasuredDimension(a.r(i, paddingRight, getMinimumWidth()), a.r(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void p0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void q(View view) {
        M(view);
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ln3 ln3Var = (ln3) this.O.get(size);
                if (view == ln3Var.w) {
                    ln3Var.w = null;
                }
                c76 c76VarL = ln3Var.r.L(view);
                if (c76VarL != null) {
                    c76 c76Var = ln3Var.c;
                    if (c76Var == null || c76VarL != c76Var) {
                        ln3Var.k(c76VarL, false);
                        if (ln3Var.a.remove(c76VarL.m)) {
                            ln3Var.m.c(ln3Var.r, c76VarL);
                        }
                    } else {
                        ln3Var.p(null, 0);
                    }
                }
            }
        }
    }

    public final void q0() {
        aa4 aa4Var;
        setScrollState(0);
        b76 b76Var = this.p0;
        b76Var.s.removeCallbacks(b76Var);
        b76Var.f405o.abortAnimation();
        a aVar = this.z;
        if (aVar == null || (aa4Var = aVar.q) == null) {
            return;
        }
        aa4Var.e();
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0278  */
    /* JADX WARN: Code duplicated, block: B:163:0x0347  */
    /* JADX WARN: Code duplicated, block: B:182:0x0387  */
    /* JADX WARN: Code duplicated, block: B:184:0x038a  */
    /* JADX WARN: Code duplicated, block: B:190:0x039f  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:195:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:198:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:201:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c3 A[LOOP:4: B:197:0x03b0->B:204:0x03c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:210:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:213:0x03e1 A[LOOP:5: B:206:0x03ce->B:213:0x03e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:243:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x03e4 A[EDGE_INSN: B:246:0x03e4->B:214:0x03e4 BREAK  A[LOOP:5: B:206:0x03ce->B:213:0x03e1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x03df A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        boolean z;
        long j;
        c76 c76Var;
        int i;
        int iB;
        int i2;
        int iMin;
        c76 c76VarH;
        View view;
        c76 c76VarH2;
        View view2;
        int i3;
        View viewFindViewById;
        View view3;
        boolean z2;
        a07 a07Var;
        lf1 lf1Var;
        boolean zG;
        boolean z3;
        if (this.y == null) {
            v0.j("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.z == null) {
            v0.c("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        y66 y66Var = this.s0;
        boolean z4 = false;
        y66Var.i = false;
        boolean z5 = true;
        Object[] objArr = this.H0 && !(this.I0 == getWidth() && this.J0 == getHeight());
        this.I0 = 0;
        this.J0 = 0;
        this.H0 = false;
        if (y66Var.d == 1) {
            s();
            this.z.B0(this);
            t();
        } else {
            r8 r8Var = this.q;
            if ((((ArrayList) r8Var.e).isEmpty() || ((ArrayList) r8Var.d).isEmpty()) && !objArr == true && this.z.z == getWidth() && this.z.A == getHeight()) {
                this.z.B0(this);
            } else {
                this.z.B0(this);
                t();
            }
        }
        y66Var.a(4);
        m0();
        U();
        y66Var.d = (byte) 1;
        boolean z6 = y66Var.j;
        rq0 rq0Var = this.r;
        s66 s66Var = this.f23o;
        lh7 lh7Var = this.s;
        if (z6) {
            int iH = rq0Var.h() - 1;
            while (iH >= 0) {
                c76 c76VarM = M(rq0Var.g(iH));
                if (c76VarM.p()) {
                    z3 = z5;
                } else {
                    long jK = K(c76VarM);
                    this.b0.getClass();
                    lf1 lf1Var2 = new lf1((byte) 5);
                    lf1Var2.a(c76VarM);
                    mg4 mg4Var = (mg4) lh7Var.f1364o;
                    z3 = z5;
                    a07 a07Var2 = (a07) lh7Var.n;
                    c76 c76Var2 = (c76) mg4Var.b(jK);
                    if (c76Var2 == null || c76Var2.p()) {
                        lh7Var.e(c76VarM, lf1Var2);
                    } else {
                        je8 je8Var = (je8) a07Var2.get(c76Var2);
                        boolean z7 = (je8Var == null || (je8Var.a & 1) == 0) ? z4 : z3;
                        je8 je8Var2 = (je8) a07Var2.get(c76VarM);
                        boolean z8 = (je8Var2 == null || (je8Var2.a & 1) == 0) ? z4 : z3;
                        if (z7 && c76Var2 == c76VarM) {
                            lh7Var.e(c76VarM, lf1Var2);
                        } else {
                            lf1 lf1VarW = lh7Var.w(c76Var2, 4);
                            lh7Var.e(c76VarM, lf1Var2);
                            lf1 lf1VarW2 = lh7Var.w(c76VarM, 8);
                            if (lf1VarW == null) {
                                int iH2 = rq0Var.h();
                                for (int i4 = 0; i4 < iH2; i4++) {
                                    c76 c76VarM2 = M(rq0Var.g(i4));
                                    if (c76VarM2 != c76VarM && K(c76VarM2) == jK) {
                                        d66 d66Var = this.y;
                                        if (d66Var == null || !d66Var.b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(c76VarM2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(c76VarM);
                                            h2.l(sb, B());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(c76VarM2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(c76VarM);
                                        h2.l(sb2, B());
                                        return;
                                    }
                                }
                                v0.c("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c76Var2 + " cannot be found but it is necessary for " + c76VarM + B());
                            } else {
                                c76Var2.o(false);
                                if (z7) {
                                    h(c76Var2);
                                }
                                if (c76Var2 != c76VarM) {
                                    if (z8) {
                                        h(c76VarM);
                                    }
                                    c76Var2.t = c76VarM;
                                    h(c76Var2);
                                    s66Var.l(c76Var2);
                                    c76VarM.o(false);
                                    c76VarM.u = c76Var2;
                                }
                                if (this.b0.a(c76Var2, c76VarM, lf1VarW, lf1VarW2)) {
                                    X();
                                }
                            }
                        }
                    }
                }
                iH--;
                z5 = z3;
                z4 = false;
            }
            z = z5;
            a07 a07Var3 = (a07) lh7Var.n;
            int i5 = a07Var3.f278o - 1;
            while (i5 >= 0) {
                c76 c76Var3 = (c76) a07Var3.f(i5);
                je8 je8Var3 = (je8) a07Var3.g(i5);
                int i6 = je8Var3.a;
                int i7 = i6 & 3;
                c66 c66Var = this.L0;
                if (i7 == 3) {
                    RecyclerView recyclerView = c66Var.m;
                    recyclerView.z.v0(c76Var3.m, recyclerView.f23o);
                } else if ((i6 & 1) != 0) {
                    lf1 lf1Var3 = je8Var3.b;
                    if (lf1Var3 == null) {
                        RecyclerView recyclerView2 = c66Var.m;
                        recyclerView2.z.v0(c76Var3.m, recyclerView2.f23o);
                    } else {
                        c66Var.j(c76Var3, lf1Var3, je8Var3.c);
                    }
                } else if ((i6 & 14) == 14) {
                    c66Var.h(c76Var3, je8Var3.b, je8Var3.c);
                } else {
                    if ((i6 & 12) == 12) {
                        lf1 lf1Var4 = je8Var3.b;
                        lf1 lf1Var5 = je8Var3.c;
                        c66Var.getClass();
                        c76Var3.o(false);
                        RecyclerView recyclerView3 = c66Var.m;
                        boolean z9 = recyclerView3.P;
                        i66 i66Var = recyclerView3.b0;
                        if (!z9) {
                            nk1 nk1Var = (nk1) i66Var;
                            nk1Var.getClass();
                            int i8 = lf1Var4.b;
                            int i9 = lf1Var5.b;
                            if (i8 == i9) {
                                a07Var = a07Var3;
                                if (lf1Var4.c == lf1Var5.c) {
                                    nk1Var.c(c76Var3);
                                    zG = false;
                                }
                                if (zG) {
                                    recyclerView3.X();
                                }
                            } else {
                                a07Var = a07Var3;
                            }
                            zG = nk1Var.g(c76Var3, i8, lf1Var4.c, i9, lf1Var5.c);
                            if (zG) {
                                recyclerView3.X();
                            }
                        } else if (i66Var.a(c76Var3, c76Var3, lf1Var4, lf1Var5)) {
                            recyclerView3.X();
                        }
                        lf1Var = null;
                    } else {
                        a07Var = a07Var3;
                        if ((i6 & 4) != 0) {
                            lf1Var = null;
                            c66Var.j(c76Var3, je8Var3.b, null);
                        } else {
                            lf1Var = null;
                            if ((i6 & 8) != 0) {
                                c66Var.h(c76Var3, je8Var3.b, je8Var3.c);
                            }
                        }
                    }
                    je8Var3.a = 0;
                    je8Var3.b = lf1Var;
                    je8Var3.c = lf1Var;
                    je8.d.c(je8Var3);
                    i5--;
                    a07Var3 = a07Var;
                }
                a07Var = a07Var3;
                lf1Var = null;
                je8Var3.a = 0;
                je8Var3.b = lf1Var;
                je8Var3.c = lf1Var;
                je8.d.c(je8Var3);
                i5--;
                a07Var3 = a07Var;
            }
        } else {
            z = true;
        }
        View view4 = null;
        this.z.u0(s66Var);
        y66Var.b = y66Var.e;
        this.P = false;
        this.Q = false;
        y66Var.j = false;
        y66Var.k = false;
        this.z.r = false;
        ArrayList arrayList = s66Var.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        a aVar = this.z;
        if (aVar.w) {
            aVar.v = 0;
            aVar.w = false;
            s66Var.m();
        }
        this.z.n0(y66Var);
        boolean z10 = z;
        V(z10);
        o0(false);
        ((a07) lh7Var.n).clear();
        ((mg4) lh7Var.f1364o).a();
        int[] iArr = this.A0;
        int i10 = iArr[0];
        int i11 = iArr[z10 ? 1 : 0];
        F(iArr);
        if (iArr[0] != i10 || iArr[z10 ? 1 : 0] != i11) {
            w(0, 0);
        }
        if (this.o0 && this.y != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = y66Var.m;
                if (j == -1) {
                    c76Var = null;
                } else {
                    c76Var = null;
                }
                if (c76Var != null) {
                    view3 = c76Var.m;
                    if (!((ArrayList) rq0Var.e).contains(view3)) {
                        if (rq0Var.h() > 0) {
                            i = y66Var.l;
                            if (i == -1) {
                                i = 0;
                            }
                            iB = y66Var.b();
                            i2 = i;
                            while (true) {
                                if (i2 < iB) {
                                    c76VarH2 = H(i2);
                                    if (c76VarH2 != null) {
                                        view2 = c76VarH2.m;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i) - 1; iMin >= 0; iMin--) {
                                    c76VarH = H(iMin);
                                    if (c76VarH == null) {
                                        break;
                                        break;
                                    }
                                    view = c76VarH.m;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (rq0Var.h() > 0) {
                        i = y66Var.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = y66Var.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                c76VarH2 = H(i2);
                                if (c76VarH2 != null) {
                                    view2 = c76VarH2.m;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                c76VarH = H(iMin);
                                if (c76VarH == null) {
                                    break;
                                    break;
                                }
                                view = c76VarH.m;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (rq0Var.h() > 0) {
                    i = y66Var.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = y66Var.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            c76VarH2 = H(i2);
                            if (c76VarH2 != null) {
                                view2 = c76VarH2.m;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            c76VarH = H(iMin);
                            if (c76VarH == null) {
                                break;
                                break;
                            }
                            view = c76VarH.m;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = y66Var.n;
                    if (i3 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) rq0Var.e).contains(getFocusedChild())) {
                j = y66Var.m;
                if (j == -1 && (z2 = this.y.b) && z2) {
                    int iK = rq0Var.k();
                    c76Var = null;
                    for (int i12 = 0; i12 < iK; i12++) {
                        c76 c76VarM3 = M(rq0Var.j(i12));
                        if (c76VarM3 != null && !c76VarM3.i() && c76VarM3.q == j) {
                            if (!((ArrayList) rq0Var.e).contains(c76VarM3.m)) {
                                c76Var = c76VarM3;
                                break;
                            }
                            c76Var = c76VarM3;
                        }
                    }
                } else {
                    c76Var = null;
                }
                if (c76Var != null) {
                    view3 = c76Var.m;
                    if (!((ArrayList) rq0Var.e).contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (rq0Var.h() > 0) {
                        i = y66Var.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = y66Var.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                c76VarH2 = H(i2);
                                if (c76VarH2 != null) {
                                    view2 = c76VarH2.m;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                c76VarH = H(iMin);
                                if (c76VarH == null) {
                                    break;
                                }
                                view = c76VarH.m;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (rq0Var.h() > 0) {
                    i = y66Var.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = y66Var.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            c76VarH2 = H(i2);
                            if (c76VarH2 != null) {
                                view2 = c76VarH2.m;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            c76VarH = H(iMin);
                            if (c76VarH == null) {
                                break;
                                break;
                            }
                            view = c76VarH.m;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = y66Var.n;
                    if (i3 != -1 && (viewFindViewById = view4.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        y66Var.m = -1L;
        y66Var.l = -1;
        y66Var.n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        c76 c76VarM = M(view);
        if (c76VarM != null) {
            if (c76VarM.k()) {
                c76VarM.v &= -257;
            } else if (!c76VarM.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(c76VarM);
                gk0.p(sb, B());
                return;
            }
        } else if (N0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            gk0.p(sb2, B());
            return;
        }
        view.clearAnimation();
        q(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        aa4 aa4Var = this.z.q;
        if ((aa4Var == null || !aa4Var.e) && !Q() && view2 != null) {
            f0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.z.w0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o66) arrayList.get(i)).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H != 0 || this.J) {
            this.I = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        je8 je8Var;
        View viewD;
        y66 y66Var = this.s0;
        y66Var.a(1);
        C(y66Var);
        y66Var.i = false;
        m0();
        lh7 lh7Var = this.s;
        a07 a07Var = (a07) lh7Var.n;
        a07 a07Var2 = (a07) lh7Var.n;
        a07Var.clear();
        mg4 mg4Var = (mg4) lh7Var.f1364o;
        mg4Var.a();
        U();
        Y();
        c76 c76VarL = null;
        View focusedChild = (this.o0 && hasFocus() && this.y != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewD = D(focusedChild)) != null) {
            c76VarL = L(viewD);
        }
        if (c76VarL == null) {
            y66Var.m = -1L;
            y66Var.l = -1;
            y66Var.n = -1;
        } else {
            y66Var.m = this.y.b ? c76VarL.q : -1L;
            y66Var.l = this.P ? -1 : c76VarL.i() ? c76VarL.p : c76VarL.b();
            View focusedChild2 = c76VarL.m;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            y66Var.n = id;
        }
        y66Var.h = y66Var.j && this.w0;
        this.w0 = false;
        this.v0 = false;
        y66Var.g = y66Var.k;
        y66Var.e = this.y.a();
        F(this.A0);
        boolean z = y66Var.j;
        rq0 rq0Var = this.r;
        if (z) {
            int iH = rq0Var.h();
            for (int i = 0; i < iH; i++) {
                c76 c76VarM = M(rq0Var.g(i));
                if (!c76VarM.p() && (!c76VarM.g() || this.y.b)) {
                    i66 i66Var = this.b0;
                    i66.b(c76VarM);
                    c76VarM.d();
                    i66Var.getClass();
                    lf1 lf1Var = new lf1((byte) 5);
                    lf1Var.a(c76VarM);
                    je8 je8VarA = (je8) a07Var2.get(c76VarM);
                    if (je8VarA == null) {
                        je8VarA = je8.a();
                        a07Var2.put(c76VarM, je8VarA);
                    }
                    je8VarA.b = lf1Var;
                    je8VarA.a |= 4;
                    if (y66Var.h && c76VarM.l() && !c76VarM.i() && !c76VarM.p() && !c76VarM.g()) {
                        mg4Var.e(K(c76VarM), c76VarM);
                    }
                }
            }
        }
        if (y66Var.k) {
            int iK = rq0Var.k();
            for (int i2 = 0; i2 < iK; i2++) {
                c76 c76VarM2 = M(rq0Var.j(i2));
                if (N0 && c76VarM2.f498o == -1 && !c76VarM2.i()) {
                    hk0.l("view holder cannot have position -1 unless it is removed".concat(B()));
                    return;
                }
                if (!c76VarM2.p() && c76VarM2.p == -1) {
                    c76VarM2.p = c76VarM2.f498o;
                }
            }
            boolean z2 = y66Var.f;
            y66Var.f = false;
            this.z.m0(this.f23o, y66Var);
            y66Var.f = z2;
            for (int i3 = 0; i3 < rq0Var.h(); i3++) {
                c76 c76VarM3 = M(rq0Var.g(i3));
                if (!c76VarM3.p() && ((je8Var = (je8) a07Var2.get(c76VarM3)) == null || (je8Var.a & 4) == 0)) {
                    i66.b(c76VarM3);
                    boolean z3 = (c76VarM3.v & 8192) != 0;
                    i66 i66Var2 = this.b0;
                    c76VarM3.d();
                    i66Var2.getClass();
                    lf1 lf1Var2 = new lf1((byte) 5);
                    lf1Var2.a(c76VarM3);
                    if (z3) {
                        a0(c76VarM3, lf1Var2);
                    } else {
                        je8 je8VarA2 = (je8) a07Var2.get(c76VarM3);
                        if (je8VarA2 == null) {
                            je8VarA2 = je8.a();
                            a07Var2.put(c76VarM3, je8VarA2);
                        }
                        je8VarA2.a |= 2;
                        je8VarA2.b = lf1Var2;
                    }
                }
            }
            l();
        } else {
            l();
        }
        V(true);
        o0(false);
        y66Var.d = (byte) 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        a aVar = this.z;
        if (aVar == null) {
            v0.c("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.J) {
            return;
        }
        boolean zO = aVar.o();
        boolean zP = this.z.p();
        if (zO || zP) {
            if (!zO) {
                i = 0;
            }
            if (!zP) {
                i2 = 0;
            }
            g0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        v0.j("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!Q()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.L |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(e76 e76Var) {
        this.z0 = e76Var;
        be8.m(this, e76Var);
    }

    public void setAdapter(d66 d66Var) {
        setLayoutFrozen(false);
        d66 d66Var2 = this.y;
        u66 u66Var = this.n;
        if (d66Var2 != null) {
            d66Var2.a.unregisterObserver(u66Var);
            this.y.getClass();
        }
        i66 i66Var = this.b0;
        if (i66Var != null) {
            i66Var.e();
        }
        a aVar = this.z;
        s66 s66Var = this.f23o;
        if (aVar != null) {
            aVar.t0(s66Var);
            this.z.u0(s66Var);
        }
        s66Var.a.clear();
        s66Var.f();
        r8 r8Var = this.q;
        r8Var.H((ArrayList) r8Var.d);
        r8Var.H((ArrayList) r8Var.e);
        r8Var.b = 0;
        d66 d66Var3 = this.y;
        this.y = d66Var;
        if (d66Var != null) {
            d66Var.a.registerObserver(u66Var);
        }
        a aVar2 = this.z;
        if (aVar2 != null) {
            aVar2.Y();
        }
        d66 d66Var4 = this.y;
        s66Var.a.clear();
        s66Var.f();
        s66Var.e(d66Var3, true);
        r66 r66VarC = s66Var.c();
        if (d66Var3 != null) {
            r66VarC.b--;
        }
        if (r66VarC.b == 0) {
            r66VarC.a();
        }
        if (d66Var4 != null) {
            r66VarC.b++;
        }
        s66Var.d();
        this.s0.f = true;
        Z(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g66 g66Var) {
        if (g66Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.t) {
            this.a0 = null;
            this.V = null;
            this.W = null;
            this.U = null;
        }
        this.t = z;
        super.setClipToPadding(z);
        if (this.G) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h66 h66Var) {
        h66Var.getClass();
        this.T = h66Var;
        this.a0 = null;
        this.V = null;
        this.W = null;
        this.U = null;
    }

    public void setHasFixedSize(boolean z) {
        this.F = z;
    }

    public void setItemAnimator(i66 i66Var) {
        i66 i66Var2 = this.b0;
        if (i66Var2 != null) {
            i66Var2.e();
            this.b0.a = null;
        }
        this.b0 = i66Var;
        if (i66Var != null) {
            i66Var.a = this.x0;
        }
    }

    public void setItemViewCacheSize(int i) {
        s66 s66Var = this.f23o;
        s66Var.e = i;
        s66Var.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(a aVar) {
        RecyclerView recyclerView;
        if (aVar == this.z) {
            return;
        }
        q0();
        a aVar2 = this.z;
        s66 s66Var = this.f23o;
        if (aVar2 != null) {
            i66 i66Var = this.b0;
            if (i66Var != null) {
                i66Var.e();
            }
            this.z.t0(s66Var);
            this.z.u0(s66Var);
            s66Var.a.clear();
            s66Var.f();
            if (this.E) {
                a aVar3 = this.z;
                aVar3.s = false;
                aVar3.a0(this);
            }
            this.z.F0(null);
            this.z = null;
        } else {
            s66Var.a.clear();
            s66Var.f();
        }
        rq0 rq0Var = this.r;
        ((je0) rq0Var.d).j();
        ArrayList arrayList = (ArrayList) rq0Var.e;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((c66) rq0Var.c).m;
            if (size < 0) {
                break;
            }
            c76 c76VarM = M((View) arrayList.get(size));
            if (c76VarM != null) {
                int i = c76VarM.B;
                if (recyclerView.Q()) {
                    c76VarM.C = i;
                    recyclerView.F0.add(c76VarM);
                } else {
                    c76VarM.m.setImportantForAccessibility(i);
                }
                c76VarM.B = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.q(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.z = aVar;
        if (aVar != null) {
            if (aVar.n != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(aVar);
                an4.o(sb, " is already attached to a RecyclerView:", aVar.n.B());
                return;
            } else {
                aVar.F0(this);
                if (this.E) {
                    a aVar4 = this.z;
                    aVar4.s = true;
                    aVar4.Z(this);
                }
            }
        }
        s66Var.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            hk0.g("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        g25 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = be8.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(n66 n66Var) {
    }

    @Deprecated
    public void setOnScrollListener(p66 p66Var) {
        this.t0 = p66Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.o0 = z;
    }

    public void setRecycledViewPool(r66 r66Var) {
        s66 s66Var = this.f23o;
        RecyclerView recyclerView = s66Var.h;
        s66Var.e(recyclerView.y, false);
        r66 r66Var2 = s66Var.g;
        if (r66Var2 != null) {
            r66Var2.b--;
        }
        s66Var.g = r66Var;
        if (r66Var != null && recyclerView.getAdapter() != null) {
            s66Var.g.b++;
        }
        s66Var.d();
    }

    @Deprecated
    public void setRecyclerListener(t66 t66Var) {
    }

    public void setScrollState(int i) {
        aa4 aa4Var;
        if (i == this.c0) {
            return;
        }
        if (O0) {
            StringBuilder sbK = fx3.k(i, "setting scroll state to ", " from ");
            sbK.append(this.c0);
            Log.d("RecyclerView", sbK.toString(), new Exception());
        }
        this.c0 = i;
        if (i != 2) {
            b76 b76Var = this.p0;
            b76Var.s.removeCallbacks(b76Var);
            b76Var.f405o.abortAnimation();
            a aVar = this.z;
            if (aVar != null && (aa4Var = aVar.q) != null) {
                aa4Var.e();
            }
        }
        a aVar2 = this.z;
        if (aVar2 != null) {
            aVar2.q0(i);
        }
        p66 p66Var = this.t0;
        if (p66Var != null) {
            p66Var.a(this, i);
        }
        ArrayList arrayList = this.u0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p66) this.u0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.j0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            v0.j("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.j0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(a76 a76Var) {
        this.f23o.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.J) {
            j("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.J = true;
                this.K = true;
                q0();
                return;
            }
            this.J = false;
            if (this.I && this.z != null && this.y != null) {
                requestLayout();
            }
            this.I = false;
        }
    }

    public final void t() {
        m0();
        U();
        y66 y66Var = this.s0;
        y66Var.a(6);
        this.q.n();
        y66Var.e = this.y.a();
        y66Var.c = 0;
        if (this.p != null) {
            d66 d66Var = this.y;
            d66Var.getClass();
            int iB = ua5.B(1);
            if (iB == 1 ? d66Var.a() > 0 : iB != 2) {
                Parcelable parcelable = this.p.f2280o;
                if (parcelable != null) {
                    this.z.o0(parcelable);
                }
                this.p = null;
            }
        }
        y66Var.g = false;
        this.z.m0(this.f23o, y66Var);
        y66Var.f = false;
        y66Var.j = y66Var.j && this.b0 != null;
        y66Var.d = (byte) 4;
        V(true);
        o0(false);
    }

    public final boolean u(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void v(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void w(int i, int i2) {
        this.S++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        p66 p66Var = this.t0;
        if (p66Var != null) {
            p66Var.b(this);
        }
        ArrayList arrayList = this.u0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p66) this.u0.get(size)).b(this);
            }
        }
        this.S--;
    }

    public final void x() {
        if (this.a0 != null) {
            return;
        }
        ((z66) this.T).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.a0 = edgeEffect;
        if (this.t) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.U != null) {
            return;
        }
        ((z66) this.T).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.U = edgeEffect;
        if (this.t) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.W != null) {
            return;
        }
        ((z66) this.T).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.W = edgeEffect;
        if (this.t) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = this.z;
        if (aVar != null) {
            return aVar.E(layoutParams);
        }
        hk0.l("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
