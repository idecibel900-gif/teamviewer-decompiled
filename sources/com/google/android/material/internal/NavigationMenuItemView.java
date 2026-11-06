package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import o.be8;
import o.ic6;
import o.iq4;
import o.pp4;
import o.u94;
import o.us2;
import o.z30;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends us2 implements iq4 {
    public static final int[] R = {R.attr.state_checked};
    public int H;
    public boolean I;
    public boolean J;
    public final CheckedTextView K;
    public FrameLayout L;
    public pp4 M;
    public ColorStateList N;
    public boolean O;
    public Drawable P;
    public final z30 Q;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z30 z30Var = new z30(this, (byte) 3);
        this.Q = z30Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.teamviewer.teamviewer.market.mobile.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.teamviewer.teamviewer.market.mobile.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.teamviewer.teamviewer.market.mobile.R.id.design_menu_item_text);
        this.K = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        be8.m(checkedTextView, z30Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.L;
            if (frameLayout == null) {
                frameLayout = (FrameLayout) ((ViewStub) findViewById(com.teamviewer.teamviewer.market.mobile.R.id.design_menu_item_action_area_stub)).inflate();
                this.L = frameLayout;
            }
            frameLayout.removeAllViews();
            this.L.addView(view);
        }
    }

    @Override // o.iq4
    public final void a(pp4 pp4Var) {
        StateListDrawable stateListDrawable;
        this.M = pp4Var;
        int i = pp4Var.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(pp4Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.teamviewer.teamviewer.market.mobile.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(R, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = be8.a;
            setBackground(stateListDrawable);
        }
        setCheckable(pp4Var.isCheckable());
        setChecked(pp4Var.isChecked());
        setEnabled(pp4Var.isEnabled());
        setTitle(pp4Var.e);
        setIcon(pp4Var.getIcon());
        setActionView(pp4Var.getActionView());
        setContentDescription(pp4Var.q);
        setTooltipText(pp4Var.r);
        pp4 pp4Var2 = this.M;
        CharSequence charSequence = pp4Var2.e;
        CheckedTextView checkedTextView = this.K;
        if (charSequence == null && pp4Var2.getIcon() == null && this.M.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.L;
            if (frameLayout != null) {
                u94 u94Var = (u94) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) u94Var).width = -1;
                this.L.setLayoutParams(u94Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.L;
        if (frameLayout2 != null) {
            u94 u94Var2 = (u94) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) u94Var2).width = -2;
            this.L.setLayoutParams(u94Var2);
        }
    }

    @Override // o.iq4
    public pp4 getItemData() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        pp4 pp4Var = this.M;
        if (pp4Var != null && pp4Var.isCheckable() && this.M.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, R);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.J != z) {
            this.J = z;
            this.Q.h(this.K, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.K.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.O) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.N);
            }
            int i = this.H;
            drawable.setBounds(0, 0, i, i);
        } else if (this.I) {
            if (this.P == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = ic6.a;
                Drawable drawable2 = resources.getDrawable(com.teamviewer.teamviewer.market.mobile.R.drawable.navigation_empty_icon, theme);
                this.P = drawable2;
                if (drawable2 != null) {
                    int i2 = this.H;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.P;
        }
        this.K.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.K.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.H = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.N = colorStateList;
        this.O = colorStateList != null;
        pp4 pp4Var = this.M;
        if (pp4Var != null) {
            setIcon(pp4Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.K.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.I = z;
    }

    public void setTextAppearance(int i) {
        this.K.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.K.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.K.setText(charSequence);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
