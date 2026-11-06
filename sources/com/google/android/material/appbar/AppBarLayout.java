package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o.a07;
import o.a4;
import o.be8;
import o.bt1;
import o.cd1;
import o.df6;
import o.f25;
import o.f53;
import o.fv0;
import o.g68;
import o.gv0;
import o.hk0;
import o.hv0;
import o.hz5;
import o.i53;
import o.lo;
import o.qn4;
import o.rr;
import o.sd8;
import o.sk8;
import o.sr;
import o.ua5;
import o.uf0;
import o.xk0;
import o.yc1;
import o.ye8;
import o.yo1;
import o.zc1;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements yc1 {
    public int[] A;
    public Drawable B;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36o;
    public int p;
    public boolean q;
    public int r;
    public sk8 s;
    public ArrayList t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public WeakReference y;
    public ValueAnimator z;

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(xk0.O(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.n = -1;
        this.f36o = -1;
        this.p = -1;
        this.r = 0;
        Context context2 = getContext();
        setOrientation(1);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        Context context3 = getContext();
        TypedArray typedArrayE = xk0.E(context3, attributeSet, g68.z, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayE.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayE.getResourceId(0, 0)));
            }
            typedArrayE.recycle();
            TypedArray typedArrayE2 = xk0.E(context2, attributeSet, hz5.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayE2.getDrawable(0);
            WeakHashMap weakHashMap = be8.a;
            setBackground(drawable);
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                qn4 qn4Var = new qn4();
                qn4Var.l(ColorStateList.valueOf(colorDrawable.getColor()));
                qn4Var.i(context2);
                setBackground(qn4Var);
            }
            if (typedArrayE2.hasValue(4)) {
                d(typedArrayE2.getBoolean(4, false), false, false);
            }
            if (typedArrayE2.hasValue(3)) {
                g68.B(this, typedArrayE2.getDimensionPixelSize(3, 0));
            }
            if (typedArrayE2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayE2.getBoolean(2, false));
            }
            if (typedArrayE2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayE2.getBoolean(1, false));
            }
            this.w = typedArrayE2.getBoolean(5, false);
            this.x = typedArrayE2.getResourceId(6, -1);
            setStatusBarForeground(typedArrayE2.getDrawable(7));
            typedArrayE2.recycle();
            sd8.c(this, new df6((Object) this, (byte) 16));
        } catch (Throwable th) {
            typedArrayE.recycle();
            throw th;
        }
    }

    public static sr b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            sr srVar = new sr((LinearLayout.LayoutParams) layoutParams);
            srVar.a = 1;
            return srVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            sr srVar2 = new sr((ViewGroup.MarginLayoutParams) layoutParams);
            srVar2.a = 1;
            return srVar2;
        }
        sr srVar3 = new sr(layoutParams);
        srVar3.a = 1;
        return srVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sr generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        sr srVar = new sr(context, attributeSet);
        srVar.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hz5.b);
        srVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            srVar.b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return srVar;
    }

    public final void c(int i) {
        this.m = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = be8.a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.t;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                hv0 hv0Var = (hv0) this.t.get(i2);
                if (hv0Var != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = hv0Var.a;
                    collapsingToolbarLayout.I = i;
                    fv0 fv0Var = collapsingToolbarLayout.w;
                    sk8 sk8Var = collapsingToolbarLayout.K;
                    int iD = sk8Var != null ? sk8Var.d() : 0;
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i3);
                        gv0 gv0Var = (gv0) childAt.getLayoutParams();
                        ye8 ye8VarB = CollapsingToolbarLayout.b(childAt);
                        int i4 = gv0Var.a;
                        if (i4 == 1) {
                            ye8VarB.b(bt1.q(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((gv0) childAt.getLayoutParams())).bottomMargin));
                        } else if (i4 == 2) {
                            ye8VarB.b(Math.round((-i) * gv0Var.b));
                        }
                    }
                    collapsingToolbarLayout.d();
                    if (collapsingToolbarLayout.B != null && iD > 0) {
                        WeakHashMap weakHashMap2 = be8.a;
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    WeakHashMap weakHashMap3 = be8.a;
                    int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iD;
                    float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                    float f = minimumHeight;
                    float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f);
                    fv0Var.e = fMin;
                    fv0Var.f = ua5.c(1.0f, fMin, 0.5f, fMin);
                    fv0Var.g = collapsingToolbarLayout.I + minimumHeight;
                    fv0Var.n(Math.abs(i) / f);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof sr;
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        this.r = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.B == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.m);
        this.B.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.B;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z) {
        byte b = 0;
        if (this.v == z) {
            return false;
        }
        this.v = z;
        refreshDrawableState();
        if (this.w && (getBackground() instanceof qn4)) {
            qn4 qn4Var = (qn4) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.z;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
            this.z = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.z.setInterpolator(lo.a);
            this.z.addUpdateListener(new rr(qn4Var, b));
            this.z.start();
        }
        return true;
    }

    public final boolean f(View view) {
        int i;
        if (this.y == null && (i = this.x) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.x);
            }
            if (viewFindViewById != null) {
                this.y = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.y;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        sr srVar = new sr(-1, -2);
        srVar.a = 1;
        return srVar;
    }

    @Override // o.yc1
    public zc1 getBehavior() {
        return new Behavior();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.f36o;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            sr srVar = (sr) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = srVar.a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) srVar).topMargin + ((LinearLayout.LayoutParams) srVar).bottomMargin;
                if ((i3 & 8) != 0) {
                    WeakHashMap weakHashMap = be8.a;
                    minimumHeight = childAt.getMinimumHeight();
                } else {
                    if ((i3 & 2) != 0) {
                        WeakHashMap weakHashMap2 = be8.a;
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                    }
                    if (childCount == 0) {
                        WeakHashMap weakHashMap3 = be8.a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
                iMin = minimumHeight + i4;
                if (childCount == 0) {
                    WeakHashMap weakHashMap4 = be8.a;
                    if (childAt.getFitsSystemWindows()) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                }
                i2 += iMin;
            }
        }
        int iMax = Math.max(0, i2);
        this.f36o = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.p;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sr srVar = (sr) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) srVar).topMargin + ((LinearLayout.LayoutParams) srVar).bottomMargin + childAt.getMeasuredHeight();
            int i3 = srVar.a;
            if ((i3 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight;
            if ((i3 & 2) != 0) {
                WeakHashMap weakHashMap = be8.a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.p = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.x;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = be8.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.r;
    }

    public Drawable getStatusBarForeground() {
        return this.B;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        sk8 sk8Var = this.s;
        if (sk8Var != null) {
            return sk8Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sr srVar = (sr) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = srVar.a;
            if ((i3 & 1) == 0) {
                break;
            }
            int topInset = measuredHeight + ((LinearLayout.LayoutParams) srVar).topMargin + ((LinearLayout.LayoutParams) srVar).bottomMargin + minimumHeight;
            if (i2 == 0) {
                WeakHashMap weakHashMap = be8.a;
                if (childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
            }
            minimumHeight = topInset;
            if ((i3 & 2) != 0) {
                WeakHashMap weakHashMap2 = be8.a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.n = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yo1.V(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArr = this.A;
        if (iArr == null) {
            iArr = new int[4];
            this.A = iArr;
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.u;
        int i2 = R.attr.state_liftable;
        if (!z) {
            i2 = -R.attr.state_liftable;
        }
        iArr[0] = i2;
        int i3 = R.attr.state_lifted;
        if (!z || !this.v) {
            i3 = -R.attr.state_lifted;
        }
        iArr[1] = i3;
        int i4 = R.attr.state_collapsible;
        if (!z) {
            i4 = -R.attr.state_collapsible;
        }
        iArr[2] = i4;
        int i5 = R.attr.state_collapsed;
        if (!z || !this.v) {
            i5 = -R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.y;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.y = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = be8.a;
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        this.n = -1;
        this.f36o = -1;
        this.p = -1;
        this.q = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((sr) getChildAt(i5).getLayoutParams()).b != null) {
                this.q = true;
                break;
            }
        }
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.w) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((sr) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.u != z2) {
            this.u = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = be8.a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = bt1.q(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        this.n = -1;
        this.f36o = -1;
        this.p = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        yo1.T(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = be8.a;
        d(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.w = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.x = i;
        WeakReference weakReference = this.y;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.y = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            hk0.g("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.B = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.B.setState(getDrawableState());
                }
                Drawable drawable3 = this.B;
                WeakHashMap weakHashMap = be8.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.B.setVisible(getVisibility() == 0, false);
                this.B.setCallback(this);
            }
            if (this.B != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            WeakHashMap weakHashMap2 = be8.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(uf0.p(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        g68.B(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B;
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends f53 {
        public int j;
        public boolean k;
        public ValueAnimator l;
        public int m;
        public boolean n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f37o;
        public WeakReference p;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f = -1;
            this.h = -1;
            this.m = -1;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        public static void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zF;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((sr) childAt.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    WeakHashMap weakHashMap = be8.a;
                    int minimumHeight = childAt.getMinimumHeight();
                    zF = true;
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zF = false;
                    }
                } else {
                    zF = false;
                }
                if (appBarLayout.w) {
                    zF = appBarLayout.f(x(coordinatorLayout));
                }
                boolean zE = appBarLayout.e(zF);
                if (!z) {
                    if (zE) {
                        List list = (List) ((a07) coordinatorLayout.n.f1141o).get(appBarLayout);
                        ArrayList arrayList = coordinatorLayout.p;
                        arrayList.clear();
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            zc1 zc1Var = ((cd1) ((View) arrayList.get(i5)).getLayoutParams()).a;
                            if (zc1Var instanceof ScrollingViewBehavior) {
                                if (((ScrollingViewBehavior) zc1Var).f == 0) {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        public static View x(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof f25) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            a4 a4Var = a4.h;
            be8.j(coordinatorLayout, a4Var.a());
            be8.h(coordinatorLayout, 0);
            a4 a4Var2 = a4.i;
            be8.j(coordinatorLayout, a4Var2.a());
            be8.h(coordinatorLayout, 0);
            View viewX = x(coordinatorLayout);
            if (viewX == null || appBarLayout.getTotalScrollRange() == 0 || !(((cd1) viewX.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (u() != (-appBarLayout.getTotalScrollRange()) && viewX.canScrollVertically(1)) {
                be8.k(coordinatorLayout, a4Var, new c(appBarLayout, false));
            }
            if (u() != 0) {
                if (!viewX.canScrollVertically(-1)) {
                    be8.k(coordinatorLayout, a4Var2, new c(appBarLayout, true));
                    return;
                }
                int i = -appBarLayout.getDownNestedPreScrollRange();
                if (i != 0) {
                    be8.k(coordinatorLayout, a4Var2, new b(this, coordinatorLayout, appBarLayout, viewX, i));
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0096  */
        /* JADX WARN: Code duplicated, block: B:33:0x009a  */
        @Override // o.xe8, o.zc1
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            int i2;
            int iQ;
            ye8 ye8Var;
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i3 = this.m;
            if (i3 < 0 || (pendingAction & 8) != 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i4 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            baseBehavior.w(coordinatorLayout2, appBarLayout, i4);
                        } else {
                            baseBehavior.v(coordinatorLayout2, appBarLayout, i4, Integer.MIN_VALUE, Integer.MAX_VALUE);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            baseBehavior.w(coordinatorLayout2, appBarLayout, 0);
                        } else {
                            i2 = 0;
                            baseBehavior.v(coordinatorLayout2, appBarLayout, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                        }
                    }
                }
                appBarLayout.r = i2;
                baseBehavior.m = -1;
                iQ = bt1.q(baseBehavior.s(), -appBarLayout.getTotalScrollRange(), i2);
                ye8Var = baseBehavior.a;
                if (ye8Var != null) {
                    ye8Var.b(iQ);
                } else {
                    baseBehavior.b = iQ;
                }
                B(coordinatorLayout2, appBarLayout, baseBehavior.s(), 0, true);
                appBarLayout.c(baseBehavior.s());
                baseBehavior.A(coordinatorLayout2, appBarLayout);
                return true;
            }
            View childAt = appBarLayout.getChildAt(i3);
            int i5 = -childAt.getBottom();
            if (this.n) {
                WeakHashMap weakHashMap = be8.a;
                iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i5;
            } else {
                iRound = Math.round(childAt.getHeight() * this.f37o) + i5;
            }
            int i6 = iRound;
            baseBehavior = this;
            coordinatorLayout2 = coordinatorLayout;
            baseBehavior.v(coordinatorLayout2, appBarLayout, i6, Integer.MIN_VALUE, Integer.MAX_VALUE);
            i2 = 0;
            appBarLayout.r = i2;
            baseBehavior.m = -1;
            iQ = bt1.q(baseBehavior.s(), -appBarLayout.getTotalScrollRange(), i2);
            ye8Var = baseBehavior.a;
            if (ye8Var != null) {
                ye8Var.b(iQ);
            } else {
                baseBehavior.b = iQ;
            }
            B(coordinatorLayout2, appBarLayout, baseBehavior.s(), 0, true);
            appBarLayout.c(baseBehavior.s());
            baseBehavior.A(coordinatorLayout2, appBarLayout);
            return true;
        }

        @Override // o.zc1
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((cd1) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.r(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // o.zc1
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            y(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // o.zc1
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.v(coordinatorLayout2, appBarLayout, u() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0) {
                baseBehavior.A(coordinatorLayout2, appBarLayout);
            }
        }

        @Override // o.zc1
        public final void n(View view, Parcelable parcelable) {
            if (!(parcelable instanceof e)) {
                this.m = -1;
                return;
            }
            e eVar = (e) parcelable;
            this.m = eVar.f40o;
            this.f37o = eVar.p;
            this.n = eVar.q;
        }

        @Override // o.zc1
        public final Parcelable o(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int iS = s();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iS;
                if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                    e eVar = new e(absSavedState);
                    eVar.f40o = i;
                    WeakHashMap weakHashMap = be8.a;
                    eVar.q = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    eVar.p = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return absSavedState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.zc1
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.w || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.p = null;
            this.k = i2;
            return z;
        }

        @Override // o.zc1
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!this.k || i == 1) {
                z(coordinatorLayout, appBarLayout);
                if (appBarLayout.w) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.p = new WeakReference(view2);
        }

        @Override // o.f53
        public final int u() {
            return s() + this.j;
        }

        @Override // o.f53
        public final int v(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            boolean zB;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iU = u();
            int i4 = 0;
            if (i2 == 0 || iU < i2 || iU > i3) {
                this.j = 0;
            } else {
                int iQ = bt1.q(i, i2, i3);
                if (iU != iQ) {
                    if (!appBarLayout.q) {
                        top = iQ;
                        break;
                    }
                    int iAbs = Math.abs(iQ);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            View childAt = appBarLayout.getChildAt(i5);
                            sr srVar = (sr) childAt.getLayoutParams();
                            Interpolator interpolator = srVar.b;
                            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i6 = srVar.a;
                                    if ((i6 & 1) != 0) {
                                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) srVar).topMargin + ((LinearLayout.LayoutParams) srVar).bottomMargin;
                                        if ((i6 & 2) != 0) {
                                            WeakHashMap weakHashMap = be8.a;
                                            topInset -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        topInset = 0;
                                    }
                                    WeakHashMap weakHashMap2 = be8.a;
                                    if (childAt.getFitsSystemWindows()) {
                                        topInset -= appBarLayout.getTopInset();
                                    }
                                    if (topInset > 0) {
                                        float f = topInset;
                                        top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iQ);
                                        break;
                                    }
                                }
                            } else {
                                i5++;
                            }
                        }
                        top = iQ;
                        break;
                    }
                    ye8 ye8Var = this.a;
                    if (ye8Var != null) {
                        zB = ye8Var.b(top);
                    } else {
                        this.b = top;
                        zB = false;
                    }
                    int i7 = iU - iQ;
                    this.j = iQ - top;
                    if (!zB && appBarLayout.q) {
                        coordinatorLayout.i(appBarLayout);
                    }
                    appBarLayout.c(s());
                    B(coordinatorLayout, appBarLayout, iQ, iQ < iU ? -1 : 1, false);
                    i4 = i7;
                }
            }
            A(coordinatorLayout, appBarLayout);
            return i4;
        }

        public final void w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(u() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iU = u();
            ValueAnimator valueAnimator = this.l;
            if (iU == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.l = valueAnimator2;
                valueAnimator2.setInterpolator(lo.e);
                this.l.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.l.setDuration(Math.min(iRound, 600));
            this.l.setIntValues(iU, i);
            this.l.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = v(coordinatorLayout, appBarLayout2, u() - i, i3, i4);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.w) {
                appBarLayout2.e(appBarLayout2.f(view));
            }
        }

        public final void z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iU = u();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                sr srVar = (sr) childAt.getLayoutParams();
                if ((srVar.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) srVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) srVar).bottomMargin;
                }
                int i2 = -iU;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                sr srVar2 = (sr) childAt2.getLayoutParams();
                int i3 = srVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == appBarLayout.getChildCount() - 1) {
                        minimumHeight += appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap weakHashMap = be8.a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap weakHashMap2 = be8.a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iU < minimumHeight2) {
                            i4 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) srVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) srVar2).bottomMargin;
                    }
                    if (iU < (minimumHeight + i4) / 2) {
                        i4 = minimumHeight;
                    }
                    w(coordinatorLayout, appBarLayout, bt1.q(i4, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        public BaseBehavior() {
            this.f = -1;
            this.h = -1;
            this.m = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        sr srVar = new sr(-1, -2);
        srVar.a = 1;
        return srVar;
    }

    public static class ScrollingViewBehavior extends i53 {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hz5.A);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // o.zc1
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // o.zc1
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            zc1 zc1Var = ((cd1) view2.getLayoutParams()).a;
            if (zc1Var instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) zc1Var).j) + this.e) - u(view2);
                WeakHashMap weakHashMap = be8.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.w) {
                return false;
            }
            appBarLayout.e(appBarLayout.f(view));
            return false;
        }

        @Override // o.zc1
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                be8.j(coordinatorLayout, a4.h.a());
                be8.h(coordinatorLayout, 0);
                be8.j(coordinatorLayout, a4.i.a());
                be8.h(coordinatorLayout, 0);
            }
        }

        @Override // o.zc1
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutV = v(coordinatorLayout.k(view));
            if (appBarLayoutV != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayoutV.d(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
