package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.be8;
import o.el0;
import o.fo1;
import o.fv0;
import o.gv0;
import o.hv0;
import o.hz5;
import o.lo;
import o.rr;
import o.sd8;
import o.sk8;
import o.t82;
import o.xc0;
import o.xk0;
import o.ye8;

/* JADX INFO: loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public Drawable A;
    public Drawable B;
    public int C;
    public boolean D;
    public ValueAnimator E;
    public long F;
    public int G;
    public hv0 H;
    public int I;
    public int J;
    public sk8 K;
    public int L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewGroup f38o;
    public View p;
    public View q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final Rect v;
    public final fv0 w;
    public final t82 x;
    public boolean y;
    public boolean z;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        int i;
        super(xk0.O(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        this.m = true;
        this.v = new Rect();
        this.G = -1;
        this.L = 0;
        this.N = 0;
        Context context2 = getContext();
        fv0 fv0Var = new fv0(this);
        this.w = fv0Var;
        fv0Var.N = lo.e;
        fv0Var.i(false);
        fv0Var.E = false;
        this.x = new t82(context2);
        xk0.l(context2, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = hz5.i;
        xk0.n(context2, attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int i2 = typedArrayObtainStyledAttributes.getInt(3, 8388691);
        if (fv0Var.k != i2) {
            fv0Var.k = i2;
            fv0Var.i(false);
        }
        fv0Var.l(typedArrayObtainStyledAttributes.getInt(0, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.u = dimensionPixelSize;
        this.t = dimensionPixelSize;
        this.s = dimensionPixelSize;
        this.r = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        }
        this.y = typedArrayObtainStyledAttributes.getBoolean(18, true);
        setTitle(typedArrayObtainStyledAttributes.getText(16));
        fv0Var.m(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        fv0Var.j(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            fv0Var.m(typedArrayObtainStyledAttributes.getResourceId(9, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            fv0Var.j(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, -1);
        if (typedArrayObtainStyledAttributes.hasValue(12) && (i = typedArrayObtainStyledAttributes.getInt(12, 1)) != fv0Var.d0) {
            fv0Var.d0 = i;
            Bitmap bitmap = fv0Var.F;
            if (bitmap != null) {
                bitmap.recycle();
                fv0Var.F = null;
            }
            fv0Var.i(false);
        }
        this.F = typedArrayObtainStyledAttributes.getInt(13, 600);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(2));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(15));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(17, 0));
        this.n = typedArrayObtainStyledAttributes.getResourceId(19, -1);
        this.M = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.O = typedArrayObtainStyledAttributes.getBoolean(10, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        xc0 xc0Var = new xc0((Object) this, (byte) 13);
        WeakHashMap weakHashMap = be8.a;
        sd8.c(this, xc0Var);
    }

    public static ye8 b(View view) {
        ye8 ye8Var = (ye8) view.getTag(R.id.view_offset_helper);
        if (ye8Var != null) {
            return ye8Var;
        }
        ye8 ye8Var2 = new ye8(view);
        view.setTag(R.id.view_offset_helper, ye8Var2);
        return ye8Var2;
    }

    public final void a() {
        View view;
        if (this.m) {
            ViewGroup viewGroup = null;
            this.f38o = null;
            this.p = null;
            int i = this.n;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f38o = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.p = view;
                }
            }
            if (this.f38o == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f38o = viewGroup;
            }
            c();
            this.m = false;
        }
    }

    public final void c() {
        View view;
        if (!this.y && (view = this.q) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.q);
            }
        }
        if (!this.y || this.f38o == null) {
            return;
        }
        View view2 = this.q;
        if (view2 == null) {
            view2 = new View(getContext());
            this.q = view2;
        }
        if (view2.getParent() == null) {
            this.f38o.addView(this.q, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof gv0;
    }

    public final void d() {
        if (this.A == null && this.B == null) {
            return;
        }
        setScrimsShown(getHeight() + this.I < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f38o == null && (drawable = this.A) != null && this.C > 0) {
            drawable.mutate().setAlpha(this.C);
            this.A.draw(canvas);
        }
        if (this.y && this.z) {
            ViewGroup viewGroup = this.f38o;
            fv0 fv0Var = this.w;
            if (viewGroup == null || this.A == null || this.C <= 0 || this.J != 1 || fv0Var.c >= fv0Var.f) {
                fv0Var.e(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.A.getBounds(), Region.Op.DIFFERENCE);
                fv0Var.e(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.B == null || this.C <= 0) {
            return;
        }
        sk8 sk8Var = this.K;
        int iD = sk8Var != null ? sk8Var.d() : 0;
        if (iD > 0) {
            this.B.setBounds(0, -this.I, getWidth(), iD - this.I);
            this.B.mutate().setAlpha(this.C);
            this.B.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.A;
        if (drawable == null || this.C <= 0 || ((view2 = this.p) == null || view2 == this ? view != this.f38o : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.J == 1 && view != null && this.y) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.A.mutate().setAlpha(this.C);
            this.A.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.B;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.A;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        fv0 fv0Var = this.w;
        if (fv0Var != null) {
            fv0Var.I = drawableState;
            ColorStateList colorStateList2 = fv0Var.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = fv0Var.f831o) != null && colorStateList.isStateful())) {
                fv0Var.i(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.y || (view = this.q) == null) {
            return;
        }
        WeakHashMap weakHashMap = be8.a;
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.q.getVisibility() == 0;
        this.z = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.p;
            if (view2 == null) {
                view2 = this.f38o;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((gv0) view2.getLayoutParams())).bottomMargin;
            View view3 = this.q;
            Rect rect = this.v;
            fo1.a(this, view3, rect);
            ViewGroup viewGroup = this.f38o;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.top + height + titleMarginTop;
            int i7 = rect.right;
            if (!z3) {
                titleMarginStart = titleMarginEnd;
            }
            int i8 = i7 - titleMarginStart;
            int i9 = (rect.bottom + height) - titleMarginBottom;
            fv0 fv0Var = this.w;
            Rect rect2 = fv0Var.i;
            if (rect2.left != i5 || rect2.top != i6 || rect2.right != i8 || rect2.bottom != i9) {
                rect2.set(i5, i6, i8, i9);
                fv0Var.J = true;
                fv0Var.h();
            }
            int i10 = z3 ? this.t : this.r;
            int i11 = rect.top + this.s;
            int i12 = (i3 - i) - (z3 ? this.r : this.t);
            int i13 = (i4 - i2) - this.u;
            Rect rect3 = fv0Var.h;
            if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                rect3.set(i10, i11, i12, i13);
                fv0Var.J = true;
                fv0Var.h();
            }
            fv0Var.i(z);
        }
    }

    public final void f() {
        CharSequence title;
        if (this.f38o != null && this.y && TextUtils.isEmpty(this.w.B)) {
            ViewGroup viewGroup = this.f38o;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).getTitle();
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            setTitle(title);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        gv0 gv0Var = new gv0(-1, -1);
        gv0Var.a = 0;
        gv0Var.b = 0.5f;
        return gv0Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        gv0 gv0Var = new gv0(context, attributeSet);
        gv0Var.a = 0;
        gv0Var.b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hz5.j);
        gv0Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        gv0Var.b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return gv0Var;
    }

    public int getCollapsedTitleGravity() {
        return this.w.l;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.w.w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.A;
    }

    public int getExpandedTitleGravity() {
        return this.w.k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.u;
    }

    public int getExpandedTitleMarginEnd() {
        return this.t;
    }

    public int getExpandedTitleMarginStart() {
        return this.r;
    }

    public int getExpandedTitleMarginTop() {
        return this.s;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.w.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.w.g0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.w.Y;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.w.Y.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.w.Y.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.w.d0;
    }

    public int getScrimAlpha() {
        return this.C;
    }

    public long getScrimAnimationDuration() {
        return this.F;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.G;
        if (i >= 0) {
            return i + this.L + this.N;
        }
        sk8 sk8Var = this.K;
        int iD = sk8Var != null ? sk8Var.d() : 0;
        WeakHashMap weakHashMap = be8.a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.B;
    }

    public CharSequence getTitle() {
        if (this.y) {
            return this.w.B;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.J == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = be8.a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            hv0 hv0Var = this.H;
            if (hv0Var == null) {
                hv0Var = new hv0(this);
                this.H = hv0Var;
            }
            ArrayList arrayList = appBarLayout.t;
            if (arrayList == null) {
                arrayList = new ArrayList();
                appBarLayout.t = arrayList;
            }
            if (!arrayList.contains(hv0Var)) {
                appBarLayout.t.add(hv0Var);
            }
            requestApplyInsets();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        hv0 hv0Var = this.H;
        if (hv0Var != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).t) != null) {
            arrayList.remove(hv0Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        sk8 sk8Var = this.K;
        if (sk8Var != null) {
            int iD = sk8Var.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap weakHashMap = be8.a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            ye8 ye8VarB = b(getChildAt(i6));
            View view = ye8VarB.a;
            ye8VarB.b = view.getTop();
            ye8VarB.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0086  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        sk8 sk8Var = this.K;
        int iD = sk8Var != null ? sk8Var.d() : 0;
        if ((mode == 0 || this.M) && iD > 0) {
            this.L = iD;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        if (this.O) {
            fv0 fv0Var = this.w;
            if (fv0Var.d0 > 1) {
                f();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.e(true, 0, 0, getMeasuredWidth(), getMeasuredHeight());
                StaticLayout staticLayout = fv0Var.Y;
                int lineCount = staticLayout != null ? staticLayout.getLineCount() : 0;
                if (lineCount > 1) {
                    TextPaint textPaint = fv0Var.L;
                    textPaint.setTextSize(fv0Var.m);
                    textPaint.setTypeface(fv0Var.x);
                    textPaint.setLetterSpacing(fv0Var.X);
                    collapsingToolbarLayout.N = (lineCount - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(collapsingToolbarLayout.getMeasuredHeight() + collapsingToolbarLayout.N, 1073741824));
                }
            } else {
                collapsingToolbarLayout = this;
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.f38o;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.p;
            if (view == null || view == collapsingToolbarLayout) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                collapsingToolbarLayout.setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            collapsingToolbarLayout.setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A;
        if (drawable != null) {
            ViewGroup viewGroup = this.f38o;
            if (this.J == 1 && viewGroup != null && this.y) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.w.l(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.w.j(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        fv0 fv0Var = this.w;
        el0 el0Var = fv0Var.A;
        if (el0Var != null) {
            el0Var.c = true;
        }
        if (fv0Var.w != typeface) {
            fv0Var.w = typeface;
            fv0Var.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.A = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f38o;
                if (this.J == 1 && viewGroup != null && this.y) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.A.setCallback(this);
                this.A.setAlpha(this.C);
            }
            WeakHashMap weakHashMap = be8.a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        fv0 fv0Var = this.w;
        if (fv0Var.k != i) {
            fv0Var.k = i;
            fv0Var.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.u = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.t = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.r = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.s = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.w.m(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        fv0 fv0Var = this.w;
        if (fv0Var.f831o != colorStateList) {
            fv0Var.f831o = colorStateList;
            fv0Var.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        fv0 fv0Var = this.w;
        el0 el0Var = fv0Var.z;
        if (el0Var != null) {
            el0Var.c = true;
        }
        if (fv0Var.x != typeface) {
            fv0Var.x = typeface;
            fv0Var.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.O = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.M = z;
    }

    public void setHyphenationFrequency(int i) {
        this.w.g0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.w.e0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.w.f0 = f;
    }

    public void setMaxLines(int i) {
        fv0 fv0Var = this.w;
        if (i != fv0Var.d0) {
            fv0Var.d0 = i;
            Bitmap bitmap = fv0Var.F;
            if (bitmap != null) {
                bitmap.recycle();
                fv0Var.F = null;
            }
            fv0Var.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.w.E = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.C) {
            if (this.A != null && (viewGroup = this.f38o) != null) {
                WeakHashMap weakHashMap = be8.a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.C = i;
            WeakHashMap weakHashMap2 = be8.a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.F = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.G != i) {
            this.G = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap weakHashMap = be8.a;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.D != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.E;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.E = valueAnimator2;
                    valueAnimator2.setDuration(this.F);
                    this.E.setInterpolator(i > this.C ? lo.c : lo.d);
                    this.E.addUpdateListener(new rr(this, (byte) 2));
                } else if (valueAnimator.isRunning()) {
                    this.E.cancel();
                }
                this.E.setIntValues(this.C, i);
                this.E.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.D = z;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.B = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.B.setState(getDrawableState());
                }
                Drawable drawable3 = this.B;
                WeakHashMap weakHashMap = be8.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.B.setVisible(getVisibility() == 0, false);
                this.B.setCallback(this);
                this.B.setAlpha(this.C);
            }
            WeakHashMap weakHashMap2 = be8.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setTitle(CharSequence charSequence) {
        fv0 fv0Var = this.w;
        if (charSequence == null || !TextUtils.equals(fv0Var.B, charSequence)) {
            fv0Var.B = charSequence;
            fv0Var.C = null;
            Bitmap bitmap = fv0Var.F;
            if (bitmap != null) {
                bitmap.recycle();
                fv0Var.F = null;
            }
            fv0Var.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.J = i;
        boolean z = i == 1;
        this.w.d = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.J == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.A == null) {
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            t82 t82Var = this.x;
            setContentScrimColor(t82Var.a(t82Var.c, dimension));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.y) {
            this.y = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.B;
        if (drawable != null && drawable.isVisible() != z) {
            this.B.setVisible(z, false);
        }
        Drawable drawable2 = this.A;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.A.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A || drawable == this.B;
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.w.k(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        gv0 gv0Var = new gv0(-1, -1);
        gv0Var.a = 0;
        gv0Var.b = 0.5f;
        return gv0Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        gv0 gv0Var = new gv0(layoutParams);
        gv0Var.a = 0;
        gv0Var.b = 0.5f;
        return gv0Var;
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }
}
