package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.be8;
import o.f4;
import o.hk0;
import o.hm3;
import o.hz5;
import o.j82;
import o.lo;
import o.om7;
import o.pm7;
import o.qn4;
import o.rr;
import o.sm7;
import o.td5;
import o.tm7;
import o.uf0;
import o.vm7;
import o.vo5;
import o.wj5;
import o.wo5;
import o.x67;
import o.xk0;
import o.xo1;
import o.yo1;
import o.ze8;
import o.zz5;

/* JADX INFO: loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final wo5 U = new wo5(16);
    public final float A;
    public final int B;
    public int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public int H;
    public final int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean O;
    public wj5 P;
    public om7 Q;
    public final ArrayList R;
    public ValueAnimator S;
    public final vo5 T;
    public final ArrayList m;
    public tm7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sm7 f44o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public ColorStateList u;
    public ColorStateList v;
    public ColorStateList w;
    public Drawable x;
    public int y;
    public final float z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(xk0.O(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.m = new ArrayList();
        this.x = new GradientDrawable();
        this.y = 0;
        this.C = Integer.MAX_VALUE;
        this.R = new ArrayList();
        this.T = new vo5(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        sm7 sm7Var = new sm7(this, context2);
        this.f44o = sm7Var;
        super.addView(sm7Var, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayE = xk0.E(context2, attributeSet, hz5.D, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 23);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            qn4 qn4Var = new qn4();
            qn4Var.l(ColorStateList.valueOf(colorDrawable.getColor()));
            qn4Var.i(context2);
            WeakHashMap weakHashMap = be8.a;
            qn4Var.k(getElevation());
            setBackground(qn4Var);
        }
        setSelectedTabIndicator(xo1.Q(context2, typedArrayE, 5));
        setSelectedTabIndicatorColor(typedArrayE.getColor(8, 0));
        int dimensionPixelSize = typedArrayE.getDimensionPixelSize(11, -1);
        Rect bounds = this.x.getBounds();
        this.x.setBounds(bounds.left, 0, bounds.right, dimensionPixelSize);
        sm7Var.requestLayout();
        setSelectedTabIndicatorGravity(typedArrayE.getInt(10, 0));
        setTabIndicatorFullWidth(typedArrayE.getBoolean(9, true));
        setTabIndicatorAnimationMode(typedArrayE.getInt(7, 0));
        int dimensionPixelSize2 = typedArrayE.getDimensionPixelSize(16, 0);
        this.s = dimensionPixelSize2;
        this.r = dimensionPixelSize2;
        this.q = dimensionPixelSize2;
        this.p = dimensionPixelSize2;
        this.p = typedArrayE.getDimensionPixelSize(19, dimensionPixelSize2);
        this.q = typedArrayE.getDimensionPixelSize(20, dimensionPixelSize2);
        this.r = typedArrayE.getDimensionPixelSize(18, dimensionPixelSize2);
        this.s = typedArrayE.getDimensionPixelSize(17, dimensionPixelSize2);
        int resourceId = typedArrayE.getResourceId(23, R.style.TextAppearance_Design_Tab);
        this.t = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, zz5.x);
        try {
            this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.u = xo1.O(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayE.hasValue(24)) {
                this.u = xo1.O(context2, typedArrayE, 24);
            }
            if (typedArrayE.hasValue(22)) {
                this.u = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayE.getColor(22, 0), this.u.getDefaultColor()});
            }
            this.v = xo1.O(context2, typedArrayE, 3);
            x67.s(typedArrayE.getInt(4, -1), null);
            this.w = xo1.O(context2, typedArrayE, 21);
            this.I = typedArrayE.getInt(6, 300);
            this.D = typedArrayE.getDimensionPixelSize(14, -1);
            this.E = typedArrayE.getDimensionPixelSize(13, -1);
            this.B = typedArrayE.getResourceId(0, 0);
            this.G = typedArrayE.getDimensionPixelSize(1, 0);
            this.K = typedArrayE.getInt(15, 1);
            this.H = typedArrayE.getInt(2, 0);
            this.L = typedArrayE.getBoolean(12, false);
            this.O = typedArrayE.getBoolean(25, false);
            typedArrayE.recycle();
            Resources resources = getResources();
            this.A = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.F = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            c();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.D;
        if (i != -1) {
            return i;
        }
        int i2 = this.K;
        if (i2 == 0 || i2 == 2) {
            return this.F;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f44o.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        sm7 sm7Var = this.f44o;
        int childCount = sm7Var.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = sm7Var.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public final void a(tm7 tm7Var, int i) {
        ArrayList arrayList = this.m;
        boolean zIsEmpty = arrayList.isEmpty();
        if (tm7Var.c != this) {
            hk0.g("Tab belongs to a different TabLayout.");
            return;
        }
        tm7Var.a = i;
        arrayList.add(i, tm7Var);
        int size = arrayList.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ((tm7) arrayList.get(i2)).a = i2;
        }
        vm7 vm7Var = tm7Var.d;
        vm7Var.setSelected(false);
        vm7Var.setActivated(false);
        int i3 = tm7Var.a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.K == 1 && this.H == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f44o.addView(vm7Var, i3, layoutParams);
        if (zIsEmpty) {
            tm7Var.a();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = be8.a;
            if (isLaidOut()) {
                sm7 sm7Var = this.f44o;
                int childCount = sm7Var.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (sm7Var.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iD = d(i);
                if (scrollX != iD) {
                    e();
                    this.S.setIntValues(scrollX, iD);
                    this.S.start();
                }
                ValueAnimator valueAnimator = sm7Var.m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    sm7Var.m.cancel();
                }
                sm7Var.c(i, this.I, true);
                return;
            }
        }
        j(i);
    }

    public final void c() {
        int i = this.K;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.G - this.p) : 0;
        WeakHashMap weakHashMap = be8.a;
        sm7 sm7Var = this.f44o;
        sm7Var.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.K;
        if (i2 == 0) {
            int i3 = this.H;
            if (i3 == 0) {
                v0.j("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                sm7Var.setGravity(1);
            } else if (i3 == 2) {
            }
            sm7Var.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.H == 2) {
                v0.j("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            sm7Var.setGravity(1);
        }
        k(true);
    }

    public final int d(int i) {
        int i2 = this.K;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        sm7 sm7Var = this.f44o;
        View childAt = sm7Var.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < sm7Var.getChildCount() ? sm7Var.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * 0.0f);
        WeakHashMap weakHashMap = be8.a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void e() {
        if (this.S == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.S = valueAnimator;
            valueAnimator.setInterpolator(lo.b);
            this.S.setDuration(this.I);
            this.S.addUpdateListener(new rr(this, (byte) 7));
        }
    }

    public final tm7 f(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (tm7) this.m.get(i);
    }

    public final tm7 g() {
        tm7 tm7Var = (tm7) U.a();
        if (tm7Var == null) {
            tm7Var = new tm7();
            tm7Var.a = -1;
        }
        tm7Var.c = this;
        vo5 vo5Var = this.T;
        vm7 vm7Var = vo5Var != null ? (vm7) vo5Var.a() : null;
        if (vm7Var == null) {
            vm7Var = new vm7(this, getContext());
        }
        vm7Var.setTab(tm7Var);
        vm7Var.setFocusable(true);
        vm7Var.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            vm7Var.setContentDescription(null);
        } else {
            vm7Var.setContentDescription(null);
        }
        tm7Var.d = vm7Var;
        return tm7Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        tm7 tm7Var = this.n;
        if (tm7Var != null) {
            return tm7Var.a;
        }
        return -1;
    }

    public int getTabCount() {
        return this.m.size();
    }

    public int getTabGravity() {
        return this.H;
    }

    public ColorStateList getTabIconTint() {
        return this.v;
    }

    public int getTabIndicatorAnimationMode() {
        return this.N;
    }

    public int getTabIndicatorGravity() {
        return this.J;
    }

    public int getTabMaxWidth() {
        return this.C;
    }

    public int getTabMode() {
        return this.K;
    }

    public ColorStateList getTabRippleColor() {
        return this.w;
    }

    public Drawable getTabSelectedIndicator() {
        return this.x;
    }

    public ColorStateList getTabTextColors() {
        return this.u;
    }

    public final void h() {
        sm7 sm7Var = this.f44o;
        int childCount = sm7Var.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            vm7 vm7Var = (vm7) sm7Var.getChildAt(childCount);
            sm7Var.removeViewAt(childCount);
            if (vm7Var != null) {
                vm7Var.setTab(null);
                vm7Var.setSelected(false);
                this.T.c(vm7Var);
            }
            requestLayout();
        }
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            tm7 tm7Var = (tm7) it.next();
            it.remove();
            tm7Var.c = null;
            tm7Var.d = null;
            tm7Var.a = -1;
            tm7Var.b = null;
            U.c(tm7Var);
        }
        this.n = null;
    }

    public final void i(tm7 tm7Var) {
        tm7 tm7Var2 = this.n;
        ArrayList arrayList = this.R;
        if (tm7Var2 == tm7Var) {
            if (tm7Var2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((om7) arrayList.get(size)).a(tm7Var);
                }
                b(tm7Var.a);
                return;
            }
            return;
        }
        int i = tm7Var.a;
        if ((tm7Var2 == null || tm7Var2.a == -1) && i != -1) {
            j(i);
        } else {
            b(i);
        }
        if (i != -1) {
            setSelectedTabView(i);
        }
        this.n = tm7Var;
        if (tm7Var2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((om7) arrayList.get(size2)).c(tm7Var2);
            }
        }
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            ((om7) arrayList.get(size3)).b(tm7Var);
        }
    }

    public final void j(int i) {
        int iRound = Math.round(i + 0.0f);
        if (iRound >= 0) {
            sm7 sm7Var = this.f44o;
            if (iRound >= sm7Var.getChildCount()) {
                return;
            }
            ValueAnimator valueAnimator = sm7Var.m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                sm7Var.m.cancel();
            }
            sm7Var.n = i;
            sm7Var.b(sm7Var.getChildAt(i), sm7Var.getChildAt(sm7Var.n + 1), 0.0f);
            ValueAnimator valueAnimator2 = this.S;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.S.cancel();
            }
            scrollTo(d(i), 0);
            setSelectedTabView(iRound);
        }
    }

    public final void k(boolean z) {
        int i = 0;
        while (true) {
            sm7 sm7Var = this.f44o;
            if (i >= sm7Var.getChildCount()) {
                return;
            }
            View childAt = sm7Var.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.K == 1 && this.H == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yo1.V(this);
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = 0;
        while (true) {
            sm7 sm7Var = this.f44o;
            if (i >= sm7Var.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = sm7Var.getChildAt(i);
            if (childAt instanceof vm7) {
                vm7 vm7Var = (vm7) childAt;
                int i2 = vm7.x;
                Drawable drawable = vm7Var.u;
                if (drawable != null) {
                    drawable.setBounds(vm7Var.getLeft(), vm7Var.getTop(), vm7Var.getRight(), vm7Var.getBottom());
                    vm7Var.u.draw(canvas);
                }
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f4.b(1, getTabCount(), 1).m);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(x67.k(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iK = this.E;
            if (iK <= 0) {
                iK = (int) (size - x67.k(getContext(), 56));
            }
            this.C = iK;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.K;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        yo1.T(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.L == z) {
            return;
        }
        this.L = z;
        int i = 0;
        while (true) {
            sm7 sm7Var = this.f44o;
            if (i >= sm7Var.getChildCount()) {
                c();
                return;
            }
            View childAt = sm7Var.getChildAt(i);
            if (childAt instanceof vm7) {
                vm7 vm7Var = (vm7) childAt;
                vm7Var.setOrientation(!vm7Var.w.L ? 1 : 0);
                TextView textView = vm7Var.s;
                if (textView == null && vm7Var.t == null) {
                    vm7Var.f(vm7Var.n, vm7Var.f2329o);
                } else {
                    vm7Var.f(textView, vm7Var.t);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(om7 om7Var) {
        om7 om7Var2 = this.Q;
        ArrayList arrayList = this.R;
        if (om7Var2 != null) {
            arrayList.remove(om7Var2);
        }
        this.Q = om7Var;
        if (om7Var == null || arrayList.contains(om7Var)) {
            return;
        }
        arrayList.add(om7Var);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.S.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(uf0.p(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.y = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.J != i) {
            this.J = i;
            WeakHashMap weakHashMap = be8.a;
            this.f44o.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        sm7 sm7Var = this.f44o;
        TabLayout tabLayout = sm7Var.f2033o;
        Rect bounds = tabLayout.x.getBounds();
        tabLayout.x.setBounds(bounds.left, 0, bounds.right, i);
        sm7Var.requestLayout();
    }

    public void setTabGravity(int i) {
        if (this.H != i) {
            this.H = i;
            c();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((tm7) arrayList.get(i)).b();
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(hm3.m(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.N = i;
        byte b = 13;
        if (i == 0) {
            this.P = new wj5(b);
        } else {
            if (i == 1) {
                this.P = new j82(b);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.M = z;
        WeakHashMap weakHashMap = be8.a;
        this.f44o.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.K) {
            this.K = i;
            c();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.w == colorStateList) {
            return;
        }
        this.w = colorStateList;
        int i = 0;
        while (true) {
            sm7 sm7Var = this.f44o;
            if (i >= sm7Var.getChildCount()) {
                return;
            }
            View childAt = sm7Var.getChildAt(i);
            if (childAt instanceof vm7) {
                Context context = getContext();
                int i2 = vm7.x;
                ((vm7) childAt).e(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(hm3.m(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((tm7) arrayList.get(i)).b();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(td5 td5Var) {
        h();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.O == z) {
            return;
        }
        this.O = z;
        int i = 0;
        while (true) {
            sm7 sm7Var = this.f44o;
            if (i >= sm7Var.getChildCount()) {
                return;
            }
            View childAt = sm7Var.getChildAt(i);
            if (childAt instanceof vm7) {
                Context context = getContext();
                int i2 = vm7.x;
                ((vm7) childAt).e(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ze8 ze8Var) {
        h();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.x != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.x = drawable;
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(pm7 pm7Var) {
        setOnTabSelectedListener((om7) pm7Var);
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
