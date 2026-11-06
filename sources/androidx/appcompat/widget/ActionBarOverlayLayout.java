package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.WeakHashMap;
import o.a08;
import o.ak8;
import o.be8;
import o.bk8;
import o.ck8;
import o.df8;
import o.dk8;
import o.ek8;
import o.fj1;
import o.fk8;
import o.fq4;
import o.gk8;
import o.gz7;
import o.h25;
import o.hk0;
import o.i25;
import o.jj8;
import o.jp4;
import o.l7;
import o.lf1;
import o.nj3;
import o.p6;
import o.pk8;
import o.q6;
import o.r6;
import o.s6;
import o.sd8;
import o.sk8;
import o.t6;
import o.uf0;
import o.yj8;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements h25, i25 {
    public static final int[] R = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final sk8 S;
    public static final Rect T;
    public final Rect A;
    public final Rect B;
    public final Rect C;
    public boolean D;
    public boolean E;
    public sk8 F;
    public sk8 G;
    public sk8 H;
    public sk8 I;
    public r6 J;
    public OverScroller K;
    public ViewPropertyAnimator L;
    public final p6 M;
    public final q6 N;
    public final q6 O;
    public final lf1 P;
    public final t6 Q;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ContentFrameLayout f3o;
    public ActionBarContainer p;
    public fj1 q;
    public Drawable r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public final Rect y;
    public final Rect z;

    static {
        gk8 ak8Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            ak8Var = new fk8();
        } else if (i >= 35) {
            ak8Var = new ek8();
        } else if (i >= 34) {
            ak8Var = new dk8();
        } else if (i >= 31) {
            ak8Var = new ck8();
        } else if (i >= 30) {
            ak8Var = new bk8();
        } else {
            ak8Var = i >= 29 ? new ak8() : new yj8();
        }
        ak8Var.h(nj3.b(0, 1, 0, 1));
        S = ak8Var.b();
        T = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = 0;
        this.y = new Rect();
        this.z = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        this.C = new Rect();
        this.D = true;
        this.E = false;
        sk8 sk8Var = sk8.b;
        this.F = sk8Var;
        this.G = sk8Var;
        this.H = sk8Var;
        this.I = sk8Var;
        this.M = new p6(this, (byte) 0);
        this.N = new q6(this, (byte) 0);
        this.O = new q6(this, (byte) 1);
        b(context);
        this.P = new lf1((byte) 4);
        t6 t6Var = new t6(context);
        t6Var.setWillNotDraw(true);
        this.Q = t6Var;
        addView(t6Var);
    }

    public static boolean k(View view, int i, int i2, int i3, int i4) {
        boolean z;
        s6 s6Var = (s6) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) s6Var).leftMargin != i) {
            ((ViewGroup.MarginLayoutParams) s6Var).leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (((ViewGroup.MarginLayoutParams) s6Var).topMargin != i2) {
            ((ViewGroup.MarginLayoutParams) s6Var).topMargin = i2;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) s6Var).rightMargin != i3) {
            ((ViewGroup.MarginLayoutParams) s6Var).rightMargin = i3;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) s6Var).bottomMargin == i4) {
            return z;
        }
        ((ViewGroup.MarginLayoutParams) s6Var).bottomMargin = i4;
        return true;
    }

    public final void a() {
        removeCallbacks(this.N);
        removeCallbacks(this.O);
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void b(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.r = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.K = new OverScroller(context);
    }

    @Override // o.i25
    public final void c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        d(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof s6;
    }

    @Override // o.h25
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.r != null) {
            if (this.p.getVisibility() == 0) {
                translationY = (int) (this.p.getTranslationY() + this.p.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.r.setBounds(0, translationY, getWidth(), this.r.getIntrinsicHeight() + translationY);
            this.r.draw(canvas);
        }
    }

    @Override // o.h25
    public final boolean e(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // o.h25
    public final void f(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // o.h25
    public final void g(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new s6(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new s6(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.p;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        lf1 lf1Var = this.P;
        return lf1Var.c | lf1Var.b;
    }

    public CharSequence getTitle() {
        j();
        return ((a08) this.q).a.getTitle();
    }

    @Override // o.h25
    public final void h(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final void i(int i) {
        j();
        if (i == 2) {
            ((a08) this.q).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((a08) this.q).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void j() {
        fj1 wrapper;
        if (this.f3o == null) {
            this.f3o = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.p = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof fj1) {
                wrapper = (fj1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    hk0.l("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.q = wrapper;
        }
    }

    public final void l(jp4 jp4Var, fq4 fq4Var) {
        j();
        a08 a08Var = (a08) this.q;
        Toolbar toolbar = a08Var.a;
        l7 l7Var = a08Var.m;
        if (l7Var == null) {
            l7Var = new l7(toolbar.getContext());
            a08Var.m = l7Var;
            l7Var.u = R.id.action_menu_presenter;
        }
        l7Var.q = fq4Var;
        if (jp4Var == null && toolbar.m == null) {
            return;
        }
        toolbar.f();
        jp4 jp4Var2 = toolbar.m.B;
        if (jp4Var2 == jp4Var) {
            return;
        }
        if (jp4Var2 != null) {
            jp4Var2.t(toolbar.a0);
            jp4Var2.t(toolbar.b0);
        }
        if (toolbar.b0 == null) {
            toolbar.b0 = new gz7(toolbar);
        }
        l7Var.D = true;
        Context context = toolbar.v;
        if (jp4Var != null) {
            jp4Var.b(l7Var, context);
            jp4Var.b(toolbar.b0, toolbar.v);
        } else {
            l7Var.d(context, null);
            toolbar.b0.d(toolbar.v, null);
            l7Var.c(true);
            toolbar.b0.c(true);
        }
        toolbar.m.setPopupTheme(toolbar.w);
        toolbar.m.setPresenter(l7Var);
        toolbar.a0 = l7Var;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zK;
        j();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = true;
        boolean z2 = (windowSystemUiVisibility & 256) != 0;
        boolean z3 = (windowSystemUiVisibility & 1536) != 0;
        WeakHashMap weakHashMap = be8.a;
        t6 t6Var = this.Q;
        sk8 sk8Var = S;
        Rect rect = this.C;
        sd8.b(t6Var, sk8Var, rect);
        boolean zEquals = rect.equals(T);
        this.D = !zEquals;
        boolean z4 = zEquals || (z2 && z3);
        this.E = z4;
        r6 r6Var = this.J;
        if (r6Var != null) {
            ((jj8) r6Var).c0 = (z2 || z4) ? false : true;
        }
        sk8 sk8VarG = sk8.g(windowInsets, this);
        pk8 pk8Var = sk8VarG.a;
        nj3 nj3VarN = pk8Var.n();
        int i = nj3VarN.a;
        int i2 = nj3VarN.a;
        int i3 = nj3VarN.b;
        int i4 = nj3VarN.c;
        this.B.set(i, i3, i4, nj3VarN.d);
        if (this.E) {
            nj3 nj3VarI = pk8Var.i(2);
            int i5 = nj3VarI.a;
            int i6 = nj3VarI.c;
            this.p.setPadding(i2 - i5, i3, i4 - i6, 0);
            zK = k(this.p, nj3VarI.a, 0, i6, 0);
        } else {
            this.p.setPadding(0, 0, 0, 0);
            zK = k(this.p, i2, i3, i4, 0);
        }
        Rect rect2 = this.y;
        sd8.b(this, sk8VarG, rect2);
        sk8 sk8VarR = pk8Var.r(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.F = sk8VarR;
        if (!this.G.equals(sk8VarR)) {
            this.G = this.F;
            zK = true;
        }
        Rect rect3 = this.z;
        if (rect3.equals(rect2)) {
            z = zK;
        } else {
            rect3.set(rect2);
        }
        if (z) {
            requestLayout();
        }
        return pk8Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b(getContext());
        WeakHashMap weakHashMap = be8.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                s6 s6Var = (s6) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) s6Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) s6Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        gk8 ak8Var;
        j();
        measureChildWithMargins(this.p, i, 0, i2, 0);
        s6 s6Var = (s6) this.p.getLayoutParams();
        int iMax = Math.max(0, this.p.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) s6Var).leftMargin + ((ViewGroup.MarginLayoutParams) s6Var).rightMargin);
        int iMax2 = Math.max(0, this.p.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s6Var).topMargin + ((ViewGroup.MarginLayoutParams) s6Var).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.p.getMeasuredState());
        WeakHashMap weakHashMap = be8.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.m;
            if (this.E) {
                measuredHeight += this.B.top;
            }
            if (this.t && this.p.getTabContainer() != null) {
                measuredHeight += this.m;
            }
        } else {
            measuredHeight = this.p.getVisibility() != 8 ? this.p.getMeasuredHeight() : 0;
        }
        Rect rect = this.y;
        Rect rect2 = this.A;
        rect2.set(rect);
        sk8 sk8Var = this.F;
        this.H = sk8Var;
        if (this.s || z || !this.D) {
            nj3 nj3VarB = this.E ? nj3.b(sk8Var.b(), Math.max(this.H.d(), measuredHeight), this.H.c(), Math.max(this.H.a(), 0)) : nj3.b(sk8Var.b(), this.H.d() + measuredHeight, this.H.c(), this.H.a());
            sk8 sk8Var2 = this.H;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                ak8Var = new fk8(sk8Var2);
            } else if (i3 >= 35) {
                ak8Var = new ek8(sk8Var2);
            } else if (i3 >= 34) {
                ak8Var = new dk8(sk8Var2);
            } else if (i3 >= 31) {
                ak8Var = new ck8(sk8Var2);
            } else if (i3 >= 30) {
                ak8Var = new bk8(sk8Var2);
            } else {
                ak8Var = i3 >= 29 ? new ak8(sk8Var2) : new yj8(sk8Var2);
            }
            ak8Var.h(nj3VarB);
            this.H = ak8Var.b();
        } else {
            boolean z2 = this.E;
            int i4 = rect2.top;
            if (z2) {
                rect2.top = Math.max(i4, measuredHeight);
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                rect2.top = i4 + measuredHeight;
                rect2.bottom = rect2.bottom;
            }
            this.H = this.H.a.r(0, measuredHeight, 0, 0);
        }
        k(this.f3o, rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!this.I.equals(this.H)) {
            sk8 sk8Var3 = this.H;
            this.I = sk8Var3;
            be8.b(this.f3o, sk8Var3);
        }
        measureChildWithMargins(this.f3o, i, 0, i2, 0);
        s6 s6Var2 = (s6) this.f3o.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f3o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) s6Var2).leftMargin + ((ViewGroup.MarginLayoutParams) s6Var2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f3o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s6Var2).topMargin + ((ViewGroup.MarginLayoutParams) s6Var2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.u || !z) {
            return false;
        }
        this.K.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.K.getFinalY() > this.p.getHeight()) {
            a();
            this.O.run();
        } else {
            a();
            this.N.run();
        }
        this.v = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.w + i2;
        this.w = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        jj8 jj8Var;
        df8 df8Var;
        this.P.b = i;
        this.w = getActionBarHideOffset();
        a();
        r6 r6Var = this.J;
        if (r6Var == null || (df8Var = (jj8Var = (jj8) r6Var).g0) == null) {
            return;
        }
        df8Var.a();
        jj8Var.g0 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.p.getVisibility() != 0) {
            return false;
        }
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.u || this.v) {
            return;
        }
        if (this.w <= this.p.getHeight()) {
            a();
            postDelayed(this.N, 600L);
        } else {
            a();
            postDelayed(this.O, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
        int i2 = this.x ^ i;
        this.x = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        r6 r6Var = this.J;
        if (r6Var != null) {
            jj8 jj8Var = (jj8) r6Var;
            jj8Var.c0 = (z2 || this.E) ? false : true;
            if (z || !z2) {
                if (jj8Var.d0) {
                    jj8Var.d0 = false;
                    jj8Var.C0(true);
                }
            } else if (!jj8Var.d0) {
                jj8Var.d0 = true;
                jj8Var.C0(true);
            }
        }
        if ((i2 & 256) == 0 || this.J == null) {
            return;
        }
        WeakHashMap weakHashMap = be8.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.n = i;
        r6 r6Var = this.J;
        if (r6Var != null) {
            ((jj8) r6Var).b0 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        a();
        this.p.setTranslationY(-Math.max(0, Math.min(i, this.p.getHeight())));
    }

    public void setActionBarVisibilityCallback(r6 r6Var) {
        this.J = r6Var;
        if (getWindowToken() != null) {
            ((jj8) this.J).b0 = this.n;
            int i = this.x;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = be8.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.t = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.u) {
            this.u = z;
            if (z) {
                return;
            }
            a();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        a08 a08Var = (a08) this.q;
        a08Var.d = i != 0 ? uf0.p(a08Var.a.getContext(), i) : null;
        a08Var.c();
    }

    public void setLogo(int i) {
        j();
        a08 a08Var = (a08) this.q;
        a08Var.e = i != 0 ? uf0.p(a08Var.a.getContext(), i) : null;
        a08Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.s = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((a08) this.q).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        a08 a08Var = (a08) this.q;
        if (a08Var.g) {
            return;
        }
        Toolbar toolbar = a08Var.a;
        a08Var.h = charSequence;
        if ((a08Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (a08Var.g) {
                be8.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new s6(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        a08 a08Var = (a08) this.q;
        a08Var.d = drawable;
        a08Var.c();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
