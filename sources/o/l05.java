package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class l05 extends FrameLayout {
    public final e05 m;
    public final g90 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h05 f1317o;
    public ColorStateList p;
    public xe7 q;
    public j05 r;

    public l05(Context context, AttributeSet attributeSet) {
        super(xk0.O(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        h05 h05Var = new h05();
        h05Var.n = false;
        this.f1317o = h05Var;
        Context context2 = getContext();
        ep3 ep3VarF = xk0.F(context2, attributeSet, hz5.x, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 7, 6);
        e05 e05Var = new e05(context2, getClass(), getMaxItemCount());
        this.m = e05Var;
        g90 g90Var = new g90(context2);
        this.n = g90Var;
        h05Var.m = g90Var;
        h05Var.f936o = true;
        g90Var.setPresenter(h05Var);
        e05Var.b(h05Var, e05Var.a);
        getContext();
        h05Var.m.E = e05Var;
        TypedArray typedArray = (TypedArray) ep3VarF.f733o;
        if (typedArray.hasValue(4)) {
            g90Var.setIconTintList(ep3VarF.i(4));
        } else {
            g90Var.setIconTintList(g90Var.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(7)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(7, 0));
        }
        if (typedArray.hasValue(6)) {
            setItemTextAppearanceActive(typedArray.getResourceId(6, 0));
        }
        if (typedArray.hasValue(8)) {
            setItemTextColor(ep3VarF.i(8));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            qn4 qn4Var = new qn4();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                qn4Var.l(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            qn4Var.i(context2);
            WeakHashMap weakHashMap = be8.a;
            setBackground(qn4Var);
        }
        if (typedArray.hasValue(1)) {
            setElevation(typedArray.getDimensionPixelSize(1, 0));
        }
        getBackground().mutate().setTintList(xo1.P(context2, ep3VarF, 0));
        setLabelVisibilityMode(typedArray.getInteger(9, -1));
        int resourceId = typedArray.getResourceId(2, 0);
        if (resourceId != 0) {
            g90Var.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(xo1.P(context2, ep3VarF, 5));
        }
        if (typedArray.hasValue(10)) {
            int resourceId2 = typedArray.getResourceId(10, 0);
            h05Var.n = true;
            getMenuInflater().inflate(resourceId2, e05Var);
            h05Var.n = false;
            h05Var.c(true);
        }
        ep3VarF.B();
        addView(g90Var);
        e05Var.e = new nx3((BottomNavigationView) this, (byte) 24);
        x67.j(this, new cr((byte) 28));
    }

    private MenuInflater getMenuInflater() {
        xe7 xe7Var = this.q;
        if (xe7Var != null) {
            return xe7Var;
        }
        xe7 xe7Var2 = new xe7(getContext());
        this.q = xe7Var2;
        return xe7Var2;
    }

    public Drawable getItemBackground() {
        return this.n.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.n.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.n.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.n.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.p;
    }

    public int getItemTextAppearanceActive() {
        return this.n.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.n.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.n.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.n.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.m;
    }

    public jq4 getMenuView() {
        return this.n;
    }

    public h05 getPresenter() {
        return this.f1317o;
    }

    public int getSelectedItemId() {
        return this.n.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yo1.V(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k05)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k05 k05Var = (k05) parcelable;
        super.onRestoreInstanceState(k05Var.m);
        this.m.f(k05Var.f1218o);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k05 k05Var = new k05(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        k05Var.f1218o = bundle;
        this.m.g(bundle);
        return k05Var;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        yo1.T(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.n.setItemBackground(drawable);
        this.p = null;
    }

    public void setItemBackgroundResource(int i) {
        this.n.setItemBackgroundRes(i);
        this.p = null;
    }

    public void setItemIconSize(int i) {
        this.n.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.n.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.p;
        g90 g90Var = this.n;
        if (colorStateList2 == colorStateList) {
            if (colorStateList != null || g90Var.getItemBackground() == null) {
                return;
            }
            g90Var.setItemBackground(null);
            return;
        }
        this.p = colorStateList;
        if (colorStateList == null) {
            g90Var.setItemBackground(null);
        } else {
            g90Var.setItemBackground(new RippleDrawable(oe6.a(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.n.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.n.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.n.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        g90 g90Var = this.n;
        if (g90Var.getLabelVisibilityMode() != i) {
            g90Var.setLabelVisibilityMode(i);
            this.f1317o.c(false);
        }
    }

    public void setOnItemReselectedListener(i05 i05Var) {
    }

    public void setOnItemSelectedListener(j05 j05Var) {
        this.r = j05Var;
    }

    public void setSelectedItemId(int i) {
        e05 e05Var = this.m;
        MenuItem menuItemFindItem = e05Var.findItem(i);
        if (menuItemFindItem == null || e05Var.s(menuItemFindItem, this.f1317o, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
