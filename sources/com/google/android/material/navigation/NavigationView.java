package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.internal.NavigationMenuView;
import java.util.WeakHashMap;
import o.be8;
import o.e15;
import o.ep3;
import o.ft;
import o.h15;
import o.hk0;
import o.hm3;
import o.hz5;
import o.k15;
import o.l15;
import o.m15;
import o.n;
import o.pj6;
import o.pp4;
import o.qn4;
import o.qw6;
import o.sd8;
import o.x05;
import o.xe7;
import o.xk0;
import o.xo1;
import o.yo1;
import o.z05;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends pj6 {
    public static final int[] y = {R.attr.state_checked};
    public static final int[] z = {-16842910};
    public final x05 r;
    public final h15 s;
    public l15 t;
    public final int u;
    public final int[] v;
    public xe7 w;
    public final ft x;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public NavigationView(Context context, AttributeSet attributeSet) {
        int resourceId;
        boolean z2;
        ?? r8;
        Context contextO = xk0.O(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.navigationViewStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_Design_NavigationView);
        super(contextO, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.navigationViewStyle);
        this.f1739o = new Rect();
        this.p = true;
        this.q = true;
        xk0.l(contextO, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.navigationViewStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_Design_ScrimInsetsFrameLayout);
        int[] iArr = hz5.z;
        xk0.n(contextO, attributeSet, iArr, com.teamviewer.teamviewer.market.mobile.R.attr.navigationViewStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextO.obtainStyledAttributes(attributeSet, iArr, com.teamviewer.teamviewer.market.mobile.R.attr.navigationViewStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_Design_ScrimInsetsFrameLayout);
        this.m = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        k15 k15Var = new k15(this);
        WeakHashMap weakHashMap = be8.a;
        sd8.c(this, k15Var);
        h15 h15Var = new h15();
        this.s = h15Var;
        this.v = new int[2];
        Context context2 = getContext();
        x05 x05Var = new x05(context2);
        this.r = x05Var;
        ep3 ep3VarF = xk0.F(context2, attributeSet, hz5.y, com.teamviewer.teamviewer.market.mobile.R.attr.navigationViewStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_Design_NavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) ep3VarF.f733o;
        if (typedArray.hasValue(0)) {
            setBackground(ep3VarF.l(0));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            qw6 qw6VarA = qw6.b(context2, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.navigationViewStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_Design_NavigationView).a();
            Drawable background = getBackground();
            qn4 qn4Var = new qn4(qw6VarA);
            if (background instanceof ColorDrawable) {
                qn4Var.l(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            qn4Var.i(context2);
            setBackground(qn4Var);
        }
        if (typedArray.hasValue(3)) {
            setElevation(typedArray.getDimensionPixelSize(3, 0));
        }
        setFitsSystemWindows(typedArray.getBoolean(1, false));
        this.u = typedArray.getDimensionPixelSize(2, 0);
        ColorStateList colorStateListI = typedArray.hasValue(9) ? ep3VarF.i(9) : a(R.attr.textColorSecondary);
        if (typedArray.hasValue(18)) {
            resourceId = typedArray.getResourceId(18, 0);
            z2 = true;
        } else {
            resourceId = 0;
            z2 = false;
        }
        if (typedArray.hasValue(8)) {
            setItemIconSize(typedArray.getDimensionPixelSize(8, 0));
        }
        ColorStateList colorStateListI2 = typedArray.hasValue(19) ? ep3VarF.i(19) : null;
        if (!z2 && colorStateListI2 == null) {
            colorStateListI2 = a(R.attr.textColorPrimary);
        }
        Drawable drawableL = ep3VarF.l(5);
        if (drawableL == null && (typedArray.hasValue(11) || typedArray.hasValue(12))) {
            qn4 qn4Var2 = new qn4(qw6.a(getContext(), typedArray.getResourceId(11, 0), typedArray.getResourceId(12, 0), new n(0.0f)).a());
            qn4Var2.l(xo1.P(getContext(), ep3VarF, 13));
            r8 = 0;
            drawableL = new InsetDrawable((Drawable) qn4Var2, typedArray.getDimensionPixelSize(16, 0), typedArray.getDimensionPixelSize(17, 0), typedArray.getDimensionPixelSize(15, 0), typedArray.getDimensionPixelSize(14, 0));
        } else {
            r8 = 0;
        }
        if (typedArray.hasValue(6)) {
            h15Var.x = typedArray.getDimensionPixelSize(6, r8);
            h15Var.c(r8);
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, r8);
        setItemMaxLines(typedArray.getInt(10, 1));
        x05Var.e = new k15(this);
        h15Var.p = true;
        h15Var.d(context2, x05Var);
        h15Var.v = colorStateListI;
        h15Var.c(r8);
        int overScrollMode = getOverScrollMode();
        h15Var.F = overScrollMode;
        NavigationMenuView navigationMenuView = h15Var.m;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (z2) {
            h15Var.s = resourceId;
            h15Var.t = true;
            h15Var.c(r8);
        }
        h15Var.u = colorStateListI2;
        h15Var.c(r8);
        h15Var.w = drawableL;
        h15Var.c(r8);
        h15Var.y = dimensionPixelSize;
        h15Var.c(r8);
        x05Var.b(h15Var, x05Var.a);
        if (h15Var.m == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) h15Var.r.inflate(com.teamviewer.teamviewer.market.mobile.R.layout.design_navigation_menu, this, (boolean) r8);
            h15Var.m = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(new e15(h15Var, h15Var.m));
            if (h15Var.q == null) {
                h15Var.q = new z05(h15Var);
            }
            int i = h15Var.F;
            if (i != -1) {
                h15Var.m.setOverScrollMode(i);
            }
            h15Var.n = (LinearLayout) h15Var.r.inflate(com.teamviewer.teamviewer.market.mobile.R.layout.design_navigation_item_header, (ViewGroup) h15Var.m, false);
            h15Var.m.setAdapter(h15Var.q);
        }
        addView(h15Var.m);
        if (typedArray.hasValue(20)) {
            int resourceId2 = typedArray.getResourceId(20, 0);
            z05 z05Var = h15Var.q;
            if (z05Var != null) {
                z05Var.e = true;
            }
            getMenuInflater().inflate(resourceId2, x05Var);
            z05 z05Var2 = h15Var.q;
            if (z05Var2 != null) {
                z05Var2.e = false;
            }
            h15Var.c(false);
        }
        if (typedArray.hasValue(4)) {
            h15Var.n.addView(h15Var.r.inflate(typedArray.getResourceId(4, 0), (ViewGroup) h15Var.n, false));
            NavigationMenuView navigationMenuView3 = h15Var.m;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        ep3VarF.B();
        this.x = new ft(this, (byte) 3);
        getViewTreeObserver().addOnGlobalLayoutListener(this.x);
    }

    private MenuInflater getMenuInflater() {
        xe7 xe7Var = this.w;
        if (xe7Var != null) {
            return xe7Var;
        }
        xe7 xe7Var2 = new xe7(getContext());
        this.w = xe7Var2;
        return xe7Var2;
    }

    public final ColorStateList a(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM = hm3.m(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.teamviewer.teamviewer.market.mobile.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM.getDefaultColor();
        int[] iArr = y;
        int[] iArr2 = FrameLayout.EMPTY_STATE_SET;
        int[] iArr3 = z;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListM.getColorForState(iArr3, defaultColor), i2, defaultColor});
    }

    public MenuItem getCheckedItem() {
        return this.s.q.d;
    }

    public int getHeaderCount() {
        return this.s.n.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.s.w;
    }

    public int getItemHorizontalPadding() {
        return this.s.x;
    }

    public int getItemIconPadding() {
        return this.s.y;
    }

    public ColorStateList getItemIconTintList() {
        return this.s.v;
    }

    public int getItemMaxLines() {
        return this.s.C;
    }

    public ColorStateList getItemTextColor() {
        return this.s.u;
    }

    public Menu getMenu() {
        return this.r;
    }

    @Override // o.pj6, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yo1.V(this);
    }

    @Override // o.pj6, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.x);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.u;
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i3), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m15)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m15 m15Var = (m15) parcelable;
        super.onRestoreInstanceState(m15Var.m);
        this.r.f(m15Var.f1426o);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m15 m15Var = new m15(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        m15Var.f1426o = bundle;
        this.r.g(bundle);
        return m15Var;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.r.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            hk0.g("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        } else {
            this.s.q.i((pp4) menuItemFindItem);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        yo1.T(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        h15 h15Var = this.s;
        h15Var.w = drawable;
        h15Var.c(false);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(getContext().getDrawable(i));
    }

    public void setItemHorizontalPadding(int i) {
        h15 h15Var = this.s;
        h15Var.x = i;
        h15Var.c(false);
    }

    public void setItemHorizontalPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        h15 h15Var = this.s;
        h15Var.x = dimensionPixelSize;
        h15Var.c(false);
    }

    public void setItemIconPadding(int i) {
        h15 h15Var = this.s;
        h15Var.y = i;
        h15Var.c(false);
    }

    public void setItemIconPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        h15 h15Var = this.s;
        h15Var.y = dimensionPixelSize;
        h15Var.c(false);
    }

    public void setItemIconSize(int i) {
        h15 h15Var = this.s;
        if (h15Var.z != i) {
            h15Var.z = i;
            h15Var.A = true;
            h15Var.c(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        h15 h15Var = this.s;
        h15Var.v = colorStateList;
        h15Var.c(false);
    }

    public void setItemMaxLines(int i) {
        h15 h15Var = this.s;
        h15Var.C = i;
        h15Var.c(false);
    }

    public void setItemTextAppearance(int i) {
        h15 h15Var = this.s;
        h15Var.s = i;
        h15Var.t = true;
        h15Var.c(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        h15 h15Var = this.s;
        h15Var.u = colorStateList;
        h15Var.c(false);
    }

    public void setNavigationItemSelectedListener(l15 l15Var) {
        this.t = l15Var;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        h15 h15Var = this.s;
        if (h15Var != null) {
            h15Var.F = i;
            NavigationMenuView navigationMenuView = h15Var.m;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.r.findItem(i);
        if (menuItemFindItem != null) {
            this.s.q.i((pp4) menuItemFindItem);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }
}
