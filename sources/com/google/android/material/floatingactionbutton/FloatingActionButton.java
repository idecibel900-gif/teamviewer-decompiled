package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.ae;
import o.ao2;
import o.be8;
import o.bo2;
import o.cd1;
import o.eu4;
import o.fo1;
import o.hk0;
import o.hz5;
import o.mf2;
import o.nf2;
import o.oe6;
import o.qw6;
import o.rg8;
import o.sf2;
import o.sx6;
import o.tn2;
import o.u80;
import o.uh2;
import o.us;
import o.x67;
import o.xk0;
import o.xk1;
import o.xo1;
import o.yc1;
import o.yo1;
import o.yq4;
import o.zc1;
import o.zn2;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends rg8 implements mf2, sx6, yc1 {
    public final nf2 A;
    public bo2 B;
    public ColorStateList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f42o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public ColorStateList r;
    public int s;
    public int t;
    public int u;
    public final int v;
    public boolean w;
    public final Rect x;
    public final Rect y;
    public final ae z;

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable layerDrawable;
        super(xk0.O(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.m = getVisibility();
        this.x = new Rect();
        this.y = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayE = xk0.E(context2, attributeSet, hz5.l, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.n = xo1.O(context2, typedArrayE, 1);
        this.f42o = x67.s(typedArrayE.getInt(2, -1), null);
        this.r = xo1.O(context2, typedArrayE, 12);
        this.s = typedArrayE.getInt(7, -1);
        this.t = typedArrayE.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayE.getDimensionPixelSize(3, 0);
        float dimension = typedArrayE.getDimension(4, 0.0f);
        float dimension2 = typedArrayE.getDimension(9, 0.0f);
        float dimension3 = typedArrayE.getDimension(11, 0.0f);
        this.w = typedArrayE.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize3 = typedArrayE.getDimensionPixelSize(10, 0);
        this.v = dimensionPixelSize3;
        eu4 eu4VarA = eu4.a(context2, typedArrayE, 15);
        eu4 eu4VarA2 = eu4.a(context2, typedArrayE, 8);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, hz5.u, i, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        qw6 qw6VarA = qw6.a(context2, resourceId, resourceId2, qw6.m).a();
        boolean z = typedArrayE.getBoolean(5, false);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
        ae aeVar = new ae(this);
        this.z = aeVar;
        aeVar.k(attributeSet, i);
        this.A = new nf2(this);
        getImpl().f(qw6VarA);
        zn2 impl = getImpl();
        ColorStateList colorStateList = this.n;
        PorterDuff.Mode mode = this.f42o;
        ColorStateList colorStateList2 = this.r;
        bo2 bo2Var = (bo2) impl;
        FloatingActionButton floatingActionButton = bo2Var.t;
        qw6 qw6Var = bo2Var.a;
        qw6Var.getClass();
        ao2 ao2Var = new ao2(qw6Var);
        bo2Var.b = ao2Var;
        ao2Var.setTintList(colorStateList);
        if (mode != null) {
            bo2Var.b.setTintMode(mode);
        }
        bo2Var.b.i(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            qw6 qw6Var2 = bo2Var.a;
            qw6Var2.getClass();
            u80 u80Var = new u80(qw6Var2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            u80Var.i = color;
            u80Var.j = color2;
            u80Var.k = color3;
            u80Var.l = color4;
            float f = dimensionPixelSize;
            if (u80Var.h != f) {
                u80Var.h = f;
                u80Var.b.setStrokeWidth(f * 1.3333f);
                u80Var.n = true;
                u80Var.invalidateSelf();
            }
            if (colorStateList != null) {
                u80Var.m = colorStateList.getColorForState(u80Var.getState(), u80Var.m);
            }
            u80Var.p = colorStateList;
            u80Var.n = true;
            u80Var.invalidateSelf();
            bo2Var.d = u80Var;
            u80 u80Var2 = bo2Var.d;
            u80Var2.getClass();
            ao2 ao2Var2 = bo2Var.b;
            ao2Var2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{u80Var2, ao2Var2});
            drawable = null;
        } else {
            drawable = null;
            bo2Var.d = null;
            layerDrawable = bo2Var.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(oe6.b(colorStateList2), layerDrawable, drawable);
        bo2Var.c = rippleDrawable;
        bo2Var.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        zn2 impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.d(dimension, impl2.i, impl2.j);
        }
        zn2 impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.d(impl3.h, dimension2, impl3.j);
        }
        zn2 impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.d(impl4.h, impl4.i, dimension3);
        }
        zn2 impl5 = getImpl();
        if (impl5.r != dimensionPixelSize3) {
            impl5.r = dimensionPixelSize3;
            float f2 = impl5.q;
            impl5.q = f2;
            Matrix matrix = impl5.y;
            impl5.a(f2, matrix);
            impl5.t.setImageMatrix(matrix);
        }
        getImpl().f2721o = eu4VarA;
        getImpl().p = eu4VarA2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private zn2 getImpl() {
        bo2 bo2Var = this.B;
        if (bo2Var != null) {
            return bo2Var;
        }
        bo2 bo2Var2 = new bo2(this, new xk1((Object) this, (byte) 19));
        this.B = bo2Var2;
        return bo2Var2;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        zn2 impl = getImpl();
        getDrawableState();
        impl.getClass();
    }

    public final int e(int i) {
        int i2 = this.t;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? e(1) : e(0);
    }

    public final void f(boolean z) {
        zn2 impl = getImpl();
        FloatingActionButton floatingActionButton = impl.t;
        int visibility = floatingActionButton.getVisibility();
        byte b = impl.s;
        if (visibility == 0) {
            if (b == 1) {
                return;
            }
        } else if (b != 2) {
            return;
        }
        Animator animator = impl.n;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.t;
        WeakHashMap weakHashMap = be8.a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.c(z ? 8 : 4, z);
            return;
        }
        eu4 eu4Var = impl.p;
        if (eu4Var == null) {
            eu4Var = impl.m;
            if (eu4Var == null) {
                eu4 eu4VarB = eu4.b(floatingActionButton.getContext(), R.animator.design_fab_hide_motion_spec);
                impl.m = eu4VarB;
                eu4Var = eu4VarB;
            }
            eu4Var.getClass();
        }
        AnimatorSet animatorSetB = impl.b(eu4Var, 0.0f, 0.0f, 0.0f);
        animatorSetB.addListener(new tn2(impl, z));
        animatorSetB.start();
    }

    public final void g() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.p;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.q;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(us.c(colorForState, mode));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.n;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f42o;
    }

    @Override // o.yc1
    public zc1 getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return ((bo2) getImpl()).t.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.t;
    }

    public int getExpandedComponentIdHint() {
        return this.A.a;
    }

    public eu4 getHideMotionSpec() {
        return getImpl().p;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.r;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.r;
    }

    public qw6 getShapeAppearanceModel() {
        qw6 qw6Var = getImpl().a;
        qw6Var.getClass();
        return qw6Var;
    }

    public eu4 getShowMotionSpec() {
        return getImpl().f2721o;
    }

    public int getSize() {
        return this.s;
    }

    public int getSizeDimension() {
        return e(this.s);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.p;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.q;
    }

    public boolean getUseCompatPadding() {
        return this.w;
    }

    public final void h(boolean z) {
        zn2 impl = getImpl();
        FloatingActionButton floatingActionButton = impl.t;
        Matrix matrix = impl.y;
        FloatingActionButton floatingActionButton2 = impl.t;
        int visibility = floatingActionButton.getVisibility();
        byte b = impl.s;
        if (visibility != 0) {
            if (b == 2) {
                return;
            }
        } else if (b != 1) {
            return;
        }
        Animator animator = impl.n;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = be8.a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.c(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.q = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(0.0f);
            floatingActionButton.setScaleX(0.0f);
            impl.q = 0.0f;
            impl.a(0.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        eu4 eu4Var = impl.f2721o;
        if (eu4Var == null) {
            eu4Var = impl.l;
            if (eu4Var == null) {
                eu4 eu4VarB = eu4.b(floatingActionButton.getContext(), R.animator.design_fab_show_motion_spec);
                impl.l = eu4VarB;
                eu4Var = eu4VarB;
            }
            eu4Var.getClass();
        }
        AnimatorSet animatorSetB = impl.b(eu4Var, 1.0f, 1.0f, 1.0f);
        animatorSetB.addListener(new uh2(impl, z));
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().getClass();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zn2 impl = getImpl();
        ao2 ao2Var = impl.b;
        if (ao2Var != null) {
            yo1.U(impl.t, ao2Var);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().t.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.u = (sizeDimension - this.v) / 2;
        getImpl().g();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(sizeDimension, size);
        } else if (mode == 0) {
            size = sizeDimension;
        } else if (mode != 1073741824) {
            yq4.f();
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            sizeDimension = Math.min(sizeDimension, size2);
        } else if (mode2 != 0) {
            if (mode2 != 1073741824) {
                yq4.f();
                return;
            }
            sizeDimension = size2;
        }
        int iMin = Math.min(size, sizeDimension);
        Rect rect = this.x;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sf2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sf2 sf2Var = (sf2) parcelable;
        super.onRestoreInstanceState(sf2Var.m);
        Object obj = sf2Var.f2015o.get("expandableWidgetHelper");
        obj.getClass();
        Bundle bundle = (Bundle) obj;
        nf2 nf2Var = this.A;
        nf2Var.getClass();
        nf2Var.b = bundle.getBoolean("expanded", false);
        nf2Var.a = bundle.getInt("expandedComponentIdHint", 0);
        if (nf2Var.b) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) nf2Var.c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        sf2 sf2Var = new sf2(parcelableOnSaveInstanceState);
        nf2 nf2Var = this.A;
        nf2Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", nf2Var.b);
        bundle.putInt("expandedComponentIdHint", nf2Var.a);
        sf2Var.f2015o.put("expandableWidgetHelper", bundle);
        return sf2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap weakHashMap = be8.a;
            if (isLaidOut()) {
                int width = getWidth();
                int height = getHeight();
                Rect rect = this.y;
                rect.set(0, 0, width, height);
                int i = rect.left;
                Rect rect2 = this.x;
                rect.left = i + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            zn2 impl = getImpl();
            ao2 ao2Var = impl.b;
            if (ao2Var != null) {
                ao2Var.setTintList(colorStateList);
            }
            u80 u80Var = impl.d;
            if (u80Var != null) {
                if (colorStateList != null) {
                    u80Var.m = colorStateList.getColorForState(u80Var.getState(), u80Var.m);
                }
                u80Var.p = colorStateList;
                u80Var.n = true;
                u80Var.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f42o != mode) {
            this.f42o = mode;
            ao2 ao2Var = getImpl().b;
            if (ao2Var != null) {
                ao2Var.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        zn2 impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.d(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        zn2 impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.d(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        zn2 impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.d(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            hk0.g("Custom size must be non-negative");
        } else if (i != this.t) {
            this.t = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ao2 ao2Var = getImpl().b;
        if (ao2Var != null) {
            ao2Var.k(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.A.a = i;
    }

    public void setHideMotionSpec(eu4 eu4Var) {
        getImpl().p = eu4Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(eu4.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            zn2 impl = getImpl();
            float f = impl.q;
            impl.q = f;
            Matrix matrix = impl.y;
            impl.a(f, matrix);
            impl.t.setImageMatrix(matrix);
            if (this.p != null) {
                g();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.z.n(i);
        g();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            zn2 impl = getImpl();
            ColorStateList colorStateList2 = this.r;
            RippleDrawable rippleDrawable = ((bo2) impl).c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(oe6.b(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(oe6.b(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z) {
        zn2 impl = getImpl();
        impl.g = z;
        impl.g();
    }

    @Override // o.sx6
    public void setShapeAppearanceModel(qw6 qw6Var) {
        getImpl().f(qw6Var);
    }

    public void setShowMotionSpec(eu4 eu4Var) {
        getImpl().f2721o = eu4Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(eu4.b(getContext(), i));
    }

    public void setSize(int i) {
        this.t = 0;
        if (i != this.s) {
            this.s = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            g();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.q != mode) {
            this.q = mode;
            g();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().e();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().e();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().e();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.w != z) {
            this.w = z;
            ((bo2) getImpl()).g();
        }
    }

    @Override // o.rg8, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends zc1 {
        public Rect a;
        public final boolean b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hz5.m);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // o.zc1
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.x;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // o.zc1
        public final void c(cd1 cd1Var) {
            if (cd1Var.h == 0) {
                cd1Var.h = 80;
            }
        }

        @Override // o.zc1
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof cd1 ? ((cd1) layoutParams).a instanceof BottomSheetBehavior : false) {
                    t(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // o.zc1
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListK = coordinatorLayout.k(floatingActionButton);
            int size = arrayListK.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayListK.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof cd1 ? ((cd1) layoutParams).a instanceof BottomSheetBehavior : false) && t(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.q(floatingActionButton, i);
            Rect rect = floatingActionButton.x;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                cd1 cd1Var = (cd1) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) cd1Var).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) cd1Var).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) cd1Var).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) cd1Var).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = be8.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = be8.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            cd1 cd1Var = (cd1) floatingActionButton.getLayoutParams();
            if (!this.b || cd1Var.f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            Rect rect = this.a;
            if (rect == null) {
                rect = new Rect();
                this.a = rect;
            }
            fo1.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.f(false);
                return true;
            }
            floatingActionButton.h(false);
            return true;
        }

        public final boolean t(View view, FloatingActionButton floatingActionButton) {
            cd1 cd1Var = (cd1) floatingActionButton.getLayoutParams();
            if (!this.b || cd1Var.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((cd1) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.f(false);
                return true;
            }
            floatingActionButton.h(false);
            return true;
        }

        public BaseBehavior() {
            this.b = true;
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
