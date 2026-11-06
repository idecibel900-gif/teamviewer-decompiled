package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import java.util.WeakHashMap;
import o.be8;
import o.cm0;
import o.hm3;
import o.hz5;
import o.io1;
import o.kn4;
import o.mn4;
import o.n;
import o.oe6;
import o.pn4;
import o.qn4;
import o.qw6;
import o.sx6;
import o.uf0;
import o.xk0;
import o.xo1;
import o.y85;
import o.yo1;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends cm0 implements Checkable, sx6 {
    public static final int[] w = {R.attr.state_checkable};
    public static final int[] x = {R.attr.state_checked};
    public static final int[] y = {com.teamviewer.teamviewer.market.mobile.R.attr.state_dragged};
    public final mn4 s;
    public final boolean t;
    public boolean u;
    public boolean v;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(xk0.O(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.materialCardViewStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_CardView), attributeSet);
        this.u = false;
        this.v = false;
        this.t = true;
        TypedArray typedArrayE = xk0.E(getContext(), attributeSet, hz5.r, com.teamviewer.teamviewer.market.mobile.R.attr.materialCardViewStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_CardView, new int[0]);
        mn4 mn4Var = new mn4(this, attributeSet);
        this.s = mn4Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        qn4 qn4Var = mn4Var.c;
        qn4Var.l(cardBackgroundColor);
        mn4Var.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        mn4Var.h();
        MaterialCardView materialCardView = mn4Var.a;
        ColorStateList colorStateListO = xo1.O(materialCardView.getContext(), typedArrayE, 10);
        mn4Var.m = colorStateListO;
        if (colorStateListO == null) {
            mn4Var.m = ColorStateList.valueOf(-1);
        }
        mn4Var.g = typedArrayE.getDimensionPixelSize(11, 0);
        boolean z = typedArrayE.getBoolean(0, false);
        mn4Var.r = z;
        materialCardView.setLongClickable(z);
        mn4Var.k = xo1.O(materialCardView.getContext(), typedArrayE, 5);
        mn4Var.e(xo1.Q(materialCardView.getContext(), typedArrayE, 2));
        mn4Var.f = typedArrayE.getDimensionPixelSize(4, 0);
        mn4Var.e = typedArrayE.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListO2 = xo1.O(materialCardView.getContext(), typedArrayE, 6);
        mn4Var.j = colorStateListO2;
        if (colorStateListO2 == null) {
            mn4Var.j = ColorStateList.valueOf(io1.d0(materialCardView, com.teamviewer.teamviewer.market.mobile.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListO3 = xo1.O(materialCardView.getContext(), typedArrayE, 1);
        colorStateListO3 = colorStateListO3 == null ? ColorStateList.valueOf(0) : colorStateListO3;
        qn4 qn4Var2 = mn4Var.d;
        qn4Var2.l(colorStateListO3);
        int[] iArr = oe6.a;
        RippleDrawable rippleDrawable = mn4Var.n;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(mn4Var.j);
        }
        qn4Var.k(materialCardView.getCardElevation());
        float f = mn4Var.g;
        ColorStateList colorStateList = mn4Var.m;
        qn4Var2.m.j = f;
        qn4Var2.invalidateSelf();
        pn4 pn4Var = qn4Var2.m;
        if (pn4Var.d != colorStateList) {
            pn4Var.d = colorStateList;
            qn4Var2.onStateChange(qn4Var2.getState());
        }
        materialCardView.setBackgroundInternal(mn4Var.d(qn4Var));
        Drawable drawableC = materialCardView.isClickable() ? mn4Var.c() : qn4Var2;
        mn4Var.h = drawableC;
        materialCardView.setForeground(mn4Var.d(drawableC));
        typedArrayE.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.s.c.getBounds());
        return rectF;
    }

    public final void b() {
        mn4 mn4Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (mn4Var = this.s).n) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        mn4Var.n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        mn4Var.n.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // o.cm0
    public ColorStateList getCardBackgroundColor() {
        return this.s.c.m.c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.s.d.m.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.s.i;
    }

    public int getCheckedIconMargin() {
        return this.s.e;
    }

    public int getCheckedIconSize() {
        return this.s.f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.s.k;
    }

    @Override // o.cm0
    public int getContentPaddingBottom() {
        return this.s.b.bottom;
    }

    @Override // o.cm0
    public int getContentPaddingLeft() {
        return this.s.b.left;
    }

    @Override // o.cm0
    public int getContentPaddingRight() {
        return this.s.b.right;
    }

    @Override // o.cm0
    public int getContentPaddingTop() {
        return this.s.b.top;
    }

    public float getProgress() {
        return this.s.c.m.i;
    }

    @Override // o.cm0
    public float getRadius() {
        return this.s.c.g();
    }

    public ColorStateList getRippleColor() {
        return this.s.j;
    }

    public qw6 getShapeAppearanceModel() {
        return this.s.l;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.s.m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.s.m;
    }

    public int getStrokeWidth() {
        return this.s.g;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yo1.U(this, this.s.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        mn4 mn4Var = this.s;
        if (mn4Var != null && mn4Var.r) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, w);
        }
        if (this.u) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, x);
        }
        if (this.v) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("o.cm0");
        accessibilityEvent.setChecked(this.u);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("o.cm0");
        mn4 mn4Var = this.s;
        accessibilityNodeInfo.setCheckable(mn4Var != null && mn4Var.r);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.u);
    }

    @Override // o.cm0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        mn4 mn4Var = this.s;
        MaterialCardView materialCardView = mn4Var.a;
        MaterialCardView materialCardView2 = mn4Var.a;
        if (mn4Var.f1488o != null) {
            int i5 = mn4Var.e;
            int i6 = mn4Var.f;
            int iCeil = (measuredWidth - i5) - i6;
            int iCeil2 = (measuredHeight - i5) - i6;
            if (materialCardView.getUseCompatPadding()) {
                iCeil2 -= (int) Math.ceil(((materialCardView2.getMaxCardElevation() * 1.5f) + (mn4Var.g() ? mn4Var.a() : 0.0f)) * 2.0f);
                iCeil -= (int) Math.ceil((materialCardView2.getMaxCardElevation() + (mn4Var.g() ? mn4Var.a() : 0.0f)) * 2.0f);
            }
            int i7 = iCeil2;
            int i8 = mn4Var.e;
            WeakHashMap weakHashMap = be8.a;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = iCeil;
                i3 = i8;
            } else {
                i3 = iCeil;
                i4 = i8;
            }
            mn4Var.f1488o.setLayerInset(2, i3, mn4Var.e, i4, i7);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.t) {
            mn4 mn4Var = this.s;
            if (!mn4Var.q) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                mn4Var.q = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // o.cm0
    public void setCardBackgroundColor(int i) {
        this.s.c.l(ColorStateList.valueOf(i));
    }

    @Override // o.cm0
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        mn4 mn4Var = this.s;
        mn4Var.c.k(mn4Var.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        qn4 qn4Var = this.s.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        qn4Var.l(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.s.r = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.u != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.s.e(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.s.e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.s.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.s.e(uf0.p(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.s.f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.s.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        mn4 mn4Var = this.s;
        mn4Var.k = colorStateList;
        Drawable drawable = mn4Var.i;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        mn4 mn4Var = this.s;
        if (mn4Var != null) {
            Drawable drawable = mn4Var.h;
            MaterialCardView materialCardView = mn4Var.a;
            Drawable drawableC = materialCardView.isClickable() ? mn4Var.c() : mn4Var.d;
            mn4Var.h = drawableC;
            if (drawable != drawableC) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
                } else {
                    materialCardView.setForeground(mn4Var.d(drawableC));
                }
            }
        }
    }

    public void setDragged(boolean z) {
        if (this.v != z) {
            this.v = z;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // o.cm0
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.s.i();
    }

    public void setOnCheckedChangeListener(kn4 kn4Var) {
    }

    @Override // o.cm0
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        mn4 mn4Var = this.s;
        mn4Var.i();
        mn4Var.h();
    }

    public void setProgress(float f) {
        mn4 mn4Var = this.s;
        mn4Var.c.m(f);
        qn4 qn4Var = mn4Var.d;
        if (qn4Var != null) {
            qn4Var.m(f);
        }
        qn4 qn4Var2 = mn4Var.p;
        if (qn4Var2 != null) {
            qn4Var2.m(f);
        }
    }

    @Override // o.cm0
    public void setRadius(float f) {
        super.setRadius(f);
        mn4 mn4Var = this.s;
        y85 y85VarE = mn4Var.l.e();
        y85VarE.e = new n(f);
        y85VarE.f = new n(f);
        y85VarE.g = new n(f);
        y85VarE.h = new n(f);
        mn4Var.f(y85VarE.a());
        mn4Var.h.invalidateSelf();
        if (mn4Var.g() || (mn4Var.a.getPreventCornerOverlap() && !mn4Var.c.j())) {
            mn4Var.h();
        }
        if (mn4Var.g()) {
            mn4Var.i();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        mn4 mn4Var = this.s;
        mn4Var.j = colorStateList;
        int[] iArr = oe6.a;
        RippleDrawable rippleDrawable = mn4Var.n;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListM = hm3.m(getContext(), i);
        mn4 mn4Var = this.s;
        mn4Var.j = colorStateListM;
        int[] iArr = oe6.a;
        RippleDrawable rippleDrawable = mn4Var.n;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM);
        }
    }

    @Override // o.sx6
    public void setShapeAppearanceModel(qw6 qw6Var) {
        setClipToOutline(qw6Var.d(getBoundsAsRectF()));
        this.s.f(qw6Var);
    }

    public void setStrokeColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        mn4 mn4Var = this.s;
        if (mn4Var.m == colorStateListValueOf) {
            return;
        }
        mn4Var.m = colorStateListValueOf;
        qn4 qn4Var = mn4Var.d;
        qn4Var.m.j = mn4Var.g;
        qn4Var.invalidateSelf();
        pn4 pn4Var = qn4Var.m;
        if (pn4Var.d != colorStateListValueOf) {
            pn4Var.d = colorStateListValueOf;
            qn4Var.onStateChange(qn4Var.getState());
        }
    }

    public void setStrokeWidth(int i) {
        mn4 mn4Var = this.s;
        if (i == mn4Var.g) {
            return;
        }
        mn4Var.g = i;
        qn4 qn4Var = mn4Var.d;
        ColorStateList colorStateList = mn4Var.m;
        qn4Var.m.j = i;
        qn4Var.invalidateSelf();
        pn4 pn4Var = qn4Var.m;
        if (pn4Var.d != colorStateList) {
            pn4Var.d = colorStateList;
            qn4Var.onStateChange(qn4Var.getState());
        }
    }

    @Override // o.cm0
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        mn4 mn4Var = this.s;
        mn4Var.i();
        mn4Var.h();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        mn4 mn4Var = this.s;
        if (mn4Var != null && mn4Var.r && isEnabled()) {
            this.u = !this.u;
            refreshDrawableState();
            b();
        }
    }

    @Override // o.cm0
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.s.c.l(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        mn4 mn4Var = this.s;
        if (mn4Var.m == colorStateList) {
            return;
        }
        mn4Var.m = colorStateList;
        qn4 qn4Var = mn4Var.d;
        qn4Var.m.j = mn4Var.g;
        qn4Var.invalidateSelf();
        pn4 pn4Var = qn4Var.m;
        if (pn4Var.d != colorStateList) {
            pn4Var.d = colorStateList;
            qn4Var.onStateChange(qn4Var.getState());
        }
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
