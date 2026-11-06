package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import io.sentry.android.core.v0;
import io.sentry.h2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o.as;
import o.be8;
import o.hk0;
import o.hm3;
import o.hn4;
import o.hz5;
import o.in4;
import o.jn4;
import o.n;
import o.oe6;
import o.qw6;
import o.sx6;
import o.uf0;
import o.x67;
import o.xk0;
import o.xo1;
import o.y85;
import o.yo1;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends as implements Checkable, sx6 {
    public static final int[] C = {R.attr.state_checkable};
    public static final int[] D = {R.attr.state_checked};
    public boolean A;
    public int B;
    public final jn4 q;
    public final LinkedHashSet r;
    public PorterDuff.Mode s;
    public ColorStateList t;
    public Drawable u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(xk0.O(context, attributeSet, i, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.r = new LinkedHashSet();
        this.z = false;
        this.A = false;
        Context context2 = getContext();
        TypedArray typedArrayE = xk0.E(context2, attributeSet, hz5.q, i, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.y = typedArrayE.getDimensionPixelSize(12, 0);
        int i2 = typedArrayE.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.s = x67.s(i2, mode);
        this.t = xo1.O(getContext(), typedArrayE, 14);
        this.u = xo1.Q(getContext(), typedArrayE, 10);
        this.B = typedArrayE.getInteger(11, 1);
        this.v = typedArrayE.getDimensionPixelSize(13, 0);
        jn4 jn4Var = new jn4(this, qw6.b(context2, attributeSet, i, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Button).a());
        this.q = jn4Var;
        jn4Var.c = typedArrayE.getDimensionPixelOffset(1, 0);
        jn4Var.d = typedArrayE.getDimensionPixelOffset(2, 0);
        jn4Var.e = typedArrayE.getDimensionPixelOffset(3, 0);
        jn4Var.f = typedArrayE.getDimensionPixelOffset(4, 0);
        if (typedArrayE.hasValue(8)) {
            int dimensionPixelSize = typedArrayE.getDimensionPixelSize(8, -1);
            jn4Var.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            y85 y85VarE = jn4Var.b.e();
            y85VarE.e = new n(f);
            y85VarE.f = new n(f);
            y85VarE.g = new n(f);
            y85VarE.h = new n(f);
            jn4Var.c(y85VarE.a());
            jn4Var.p = true;
        }
        jn4Var.h = typedArrayE.getDimensionPixelSize(20, 0);
        jn4Var.i = x67.s(typedArrayE.getInt(7, -1), mode);
        jn4Var.j = xo1.O(getContext(), typedArrayE, 6);
        jn4Var.k = xo1.O(getContext(), typedArrayE, 19);
        jn4Var.l = xo1.O(getContext(), typedArrayE, 16);
        jn4Var.q = typedArrayE.getBoolean(5, false);
        jn4Var.s = typedArrayE.getDimensionPixelSize(9, 0);
        WeakHashMap weakHashMap = be8.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayE.hasValue(0)) {
            jn4Var.f1185o = true;
            setSupportBackgroundTintList(jn4Var.j);
            setSupportBackgroundTintMode(jn4Var.i);
        } else {
            jn4Var.e();
        }
        setPaddingRelative(paddingStart + jn4Var.c, paddingTop + jn4Var.e, paddingEnd + jn4Var.d, paddingBottom + jn4Var.f);
        typedArrayE.recycle();
        setCompoundDrawablePadding(this.y);
        d(this.u != null);
    }

    private String getA11yClassName() {
        jn4 jn4Var = this.q;
        return ((jn4Var == null || !jn4Var.q) ? Button.class : CompoundButton.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    public final boolean b() {
        jn4 jn4Var = this.q;
        return (jn4Var == null || jn4Var.f1185o) ? false : true;
    }

    public final void c() {
        int i = this.B;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.u, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.u, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.u, null, null);
        }
    }

    public final void d(boolean z) {
        Drawable drawable = this.u;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.u = drawableMutate;
            drawableMutate.setTintList(this.t);
            PorterDuff.Mode mode = this.s;
            if (mode != null) {
                this.u.setTintMode(mode);
            }
            int intrinsicWidth = this.v;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.u.getIntrinsicWidth();
            }
            int intrinsicHeight = this.v;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.u.getIntrinsicHeight();
            }
            Drawable drawable2 = this.u;
            int i = this.w;
            int i2 = this.x;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        }
        if (z) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.B;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.u) || (((i3 == 3 || i3 == 4) && drawable5 != this.u) || ((i3 == 16 || i3 == 32) && drawable4 != this.u))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.u == null || getLayout() == null) {
            return;
        }
        int i3 = this.B;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.w = 0;
                if (i3 == 16) {
                    this.x = 0;
                    d(false);
                    return;
                }
                int intrinsicHeight = this.v;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.u.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.y) - getPaddingBottom()) / 2;
                if (this.x != textHeight) {
                    this.x = textHeight;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.x = 0;
        if (i3 == 1 || i3 == 3) {
            this.w = 0;
            d(false);
            return;
        }
        int intrinsicWidth = this.v;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.u.getIntrinsicWidth();
        }
        int textWidth = i - getTextWidth();
        WeakHashMap weakHashMap = be8.a;
        int paddingEnd = ((((textWidth - getPaddingEnd()) - intrinsicWidth) - this.y) - getPaddingStart()) / 2;
        if ((getLayoutDirection() == 1) != (this.B == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.w != paddingEnd) {
            this.w = paddingEnd;
            d(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.q.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.u;
    }

    public int getIconGravity() {
        return this.B;
    }

    public int getIconPadding() {
        return this.y;
    }

    public int getIconSize() {
        return this.v;
    }

    public ColorStateList getIconTint() {
        return this.t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.s;
    }

    public int getInsetBottom() {
        return this.q.f;
    }

    public int getInsetTop() {
        return this.q.e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.q.l;
        }
        return null;
    }

    public qw6 getShapeAppearanceModel() {
        if (b()) {
            return this.q.b;
        }
        hk0.l("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.q.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.q.h;
        }
        return 0;
    }

    @Override // o.as
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.q.j : super.getSupportBackgroundTintList();
    }

    @Override // o.as
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.q.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            yo1.U(this, this.q.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        jn4 jn4Var = this.q;
        if (jn4Var != null && jn4Var.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        if (this.z) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // o.as, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.z);
    }

    @Override // o.as, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        jn4 jn4Var = this.q;
        accessibilityNodeInfo.setCheckable(jn4Var != null && jn4Var.q);
        accessibilityNodeInfo.setChecked(this.z);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof in4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        in4 in4Var = (in4) parcelable;
        super.onRestoreInstanceState(in4Var.m);
        setChecked(in4Var.f1081o);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        in4 in4Var = new in4(super.onSaveInstanceState());
        in4Var.f1081o = this.z;
        return in4Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e(i, i2);
    }

    @Override // o.as, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!b()) {
            super.setBackgroundColor(i);
            return;
        }
        jn4 jn4Var = this.q;
        if (jn4Var.b(false) != null) {
            jn4Var.b(false).setTint(i);
        }
    }

    @Override // o.as, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        v0.j("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        jn4 jn4Var = this.q;
        jn4Var.f1185o = true;
        MaterialButton materialButton = jn4Var.a;
        materialButton.setSupportBackgroundTintList(jn4Var.j);
        materialButton.setSupportBackgroundTintMode(jn4Var.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // o.as, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? uf0.p(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (b()) {
            this.q.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        jn4 jn4Var = this.q;
        if (jn4Var == null || !jn4Var.q || !isEnabled() || this.z == z) {
            return;
        }
        this.z = z;
        refreshDrawableState();
        if (this.A) {
            return;
        }
        this.A = true;
        Iterator it = this.r.iterator();
        if (!it.hasNext()) {
            this.A = false;
        } else {
            it.next().getClass();
            h2.f();
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            jn4 jn4Var = this.q;
            if (jn4Var.p && jn4Var.g == i) {
                return;
            }
            jn4Var.g = i;
            jn4Var.p = true;
            float f = i;
            y85 y85VarE = jn4Var.b.e();
            y85VarE.e = new n(f);
            y85VarE.f = new n(f);
            y85VarE.g = new n(f);
            y85VarE.h = new n(f);
            jn4Var.c(y85VarE.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (b()) {
            this.q.b(false).k(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.u != drawable) {
            this.u = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.B != i) {
            this.B = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.y != i) {
            this.y = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? uf0.p(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            hk0.g("iconSize cannot be less than 0");
        } else if (this.v != i) {
            this.v = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.t != colorStateList) {
            this.t = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.s != mode) {
            this.s = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(hm3.m(getContext(), i));
    }

    public void setInsetBottom(int i) {
        jn4 jn4Var = this.q;
        jn4Var.d(jn4Var.e, i);
    }

    public void setInsetTop(int i) {
        jn4 jn4Var = this.q;
        jn4Var.d(i, jn4Var.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(hn4 hn4Var) {
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            jn4 jn4Var = this.q;
            MaterialButton materialButton = jn4Var.a;
            if (jn4Var.l != colorStateList) {
                jn4Var.l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(oe6.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(hm3.m(getContext(), i));
        }
    }

    @Override // o.sx6
    public void setShapeAppearanceModel(qw6 qw6Var) {
        if (b()) {
            this.q.c(qw6Var);
        } else {
            hk0.l("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (b()) {
            jn4 jn4Var = this.q;
            jn4Var.n = z;
            jn4Var.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            jn4 jn4Var = this.q;
            if (jn4Var.k != colorStateList) {
                jn4Var.k = colorStateList;
                jn4Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(hm3.m(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            jn4 jn4Var = this.q;
            if (jn4Var.h != i) {
                jn4Var.h = i;
                jn4Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // o.as
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        jn4 jn4Var = this.q;
        if (jn4Var.j != colorStateList) {
            jn4Var.j = colorStateList;
            if (jn4Var.b(false) != null) {
                jn4Var.b(false).setTintList(jn4Var.j);
            }
        }
    }

    @Override // o.as
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        jn4 jn4Var = this.q;
        if (jn4Var.i != mode) {
            jn4Var.i = mode;
            if (jn4Var.b(false) == null || jn4Var.i == null) {
                return;
            }
            jn4Var.b(false).setTintMode(jn4Var.i);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
