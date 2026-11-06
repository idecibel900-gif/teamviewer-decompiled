package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class d05 extends FrameLayout implements iq4 {
    public static final int[] C = {R.attr.state_checked};
    public Drawable A;
    public o20 B;
    public final int m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f575o;
    public float p;
    public int q;
    public boolean r;
    public final ImageView s;
    public final ViewGroup t;
    public final TextView u;
    public final TextView v;
    public int w;
    public pp4 x;
    public ColorStateList y;
    public Drawable z;

    public d05(Context context) {
        super(context);
        this.w = -1;
        byte b = 1;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(com.teamviewer.teamviewer.market.mobile.R.id.navigation_bar_item_icon_view);
        this.s = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.teamviewer.teamviewer.market.mobile.R.id.navigation_bar_item_labels_group);
        this.t = viewGroup;
        TextView textView = (TextView) findViewById(com.teamviewer.teamviewer.market.mobile.R.id.navigation_bar_item_small_label_view);
        this.u = textView;
        TextView textView2 = (TextView) findViewById(com.teamviewer.teamviewer.market.mobile.R.id.navigation_bar_item_large_label_view);
        this.v = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.m = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        viewGroup.setTag(com.teamviewer.teamviewer.market.mobile.R.id.mtrl_view_tag_bottom_padding, Integer.valueOf(viewGroup.getPaddingBottom()));
        WeakHashMap weakHashMap = be8.a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        b(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new e90((f90) this, b));
        }
    }

    public static void c(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void d(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    public static void e(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof d05) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        o20 o20Var = this.B;
        int minimumHeight = o20Var != null ? o20Var.getMinimumHeight() / 2 : 0;
        ImageView imageView = this.s;
        return imageView.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) imageView.getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        o20 o20Var = this.B;
        int minimumWidth = o20Var == null ? 0 : o20Var.getMinimumWidth() - this.B.t.w;
        ImageView imageView = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + imageView.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    @Override // o.iq4
    public final void a(pp4 pp4Var) {
        this.x = pp4Var;
        setCheckable(pp4Var.isCheckable());
        setChecked(pp4Var.isChecked());
        setEnabled(pp4Var.isEnabled());
        setIcon(pp4Var.getIcon());
        setTitle(pp4Var.e);
        setId(pp4Var.a);
        if (!TextUtils.isEmpty(pp4Var.q)) {
            setContentDescription(pp4Var.q);
        }
        setTooltipText(!TextUtils.isEmpty(pp4Var.r) ? pp4Var.r : pp4Var.e);
        setVisibility(pp4Var.isVisible() ? 0 : 8);
    }

    public final void b(float f, float f2) {
        this.n = f - f2;
        this.f575o = (f2 * 1.0f) / f;
        this.p = (f * 1.0f) / f2;
    }

    public o20 getBadge() {
        return this.B;
    }

    public int getItemBackgroundResId() {
        return com.teamviewer.teamviewer.market.mobile.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // o.iq4
    public pp4 getItemData() {
        return this.x;
    }

    public int getItemDefaultMarginResId() {
        return com.teamviewer.teamviewer.market.mobile.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.w;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.t;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.t;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        pp4 pp4Var = this.x;
        if (pp4Var != null && pp4Var.isCheckable() && this.x.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        o20 o20Var = this.B;
        if (o20Var != null && o20Var.isVisible()) {
            pp4 pp4Var = this.x;
            CharSequence charSequence = pp4Var.e;
            if (!TextUtils.isEmpty(pp4Var.q)) {
                charSequence = this.x.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.B.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f4.c(isSelected(), 0, 1, getItemVisiblePosition(), 1).m);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) a4.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.teamviewer.teamviewer.market.mobile.R.string.item_view_role_description));
    }

    public void setBadge(o20 o20Var) {
        this.B = o20Var;
        ImageView imageView = this.s;
        if (imageView == null || o20Var == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        o20 o20Var2 = this.B;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        o20Var2.setBounds(rect);
        o20Var2.h(imageView, null);
        WeakReference weakReference = o20Var2.B;
        if ((weakReference != null ? (FrameLayout) weakReference.get() : null) == null) {
            imageView.getOverlay().add(o20Var2);
        } else {
            WeakReference weakReference2 = o20Var2.B;
            (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(o20Var2);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.v;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.u;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        int i = this.q;
        ImageView imageView = this.s;
        ViewGroup viewGroup = this.t;
        int i2 = this.m;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    c(imageView, i2, 49);
                    e(viewGroup, ((Integer) viewGroup.getTag(com.teamviewer.teamviewer.market.mobile.R.id.mtrl_view_tag_bottom_padding)).intValue());
                    textView.setVisibility(0);
                } else {
                    c(imageView, i2, 17);
                    e(viewGroup, 0);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i == 1) {
                e(viewGroup, ((Integer) viewGroup.getTag(com.teamviewer.teamviewer.market.mobile.R.id.mtrl_view_tag_bottom_padding)).intValue());
                if (z) {
                    c(imageView, (int) (i2 + this.n), 49);
                    d(textView, 1.0f, 1.0f, 0);
                    float f = this.f575o;
                    d(textView2, f, f, 4);
                } else {
                    c(imageView, i2, 49);
                    float f2 = this.p;
                    d(textView, f2, f2, 4);
                    d(textView2, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                c(imageView, i2, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.r) {
            if (z) {
                c(imageView, i2, 49);
                e(viewGroup, ((Integer) viewGroup.getTag(com.teamviewer.teamviewer.market.mobile.R.id.mtrl_view_tag_bottom_padding)).intValue());
                textView.setVisibility(0);
            } else {
                c(imageView, i2, 17);
                e(viewGroup, 0);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            e(viewGroup, ((Integer) viewGroup.getTag(com.teamviewer.teamviewer.market.mobile.R.id.mtrl_view_tag_bottom_padding)).intValue());
            if (z) {
                c(imageView, (int) (i2 + this.n), 49);
                d(textView, 1.0f, 1.0f, 0);
                float f3 = this.f575o;
                d(textView2, f3, f3, 4);
            } else {
                c(imageView, i2, 49);
                float f4 = this.p;
                d(textView, f4, f4, 4);
                d(textView2, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.u.setEnabled(z);
        this.v.setEnabled(z);
        this.s.setEnabled(z);
        if (!z) {
            WeakHashMap weakHashMap = be8.a;
            ud8.a(this, null);
        } else {
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            WeakHashMap weakHashMap2 = be8.a;
            ud8.a(this, systemIcon);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.z) {
            return;
        }
        this.z = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.A = drawable;
            ColorStateList colorStateList = this.y;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.s.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.y = colorStateList;
        if (this.x == null || (drawable = this.A) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.A.invalidateSelf();
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        WeakHashMap weakHashMap = be8.a;
        setBackground(drawable);
    }

    public void setItemPosition(int i) {
        this.w = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.q != i) {
            this.q = i;
            pp4 pp4Var = this.x;
            if (pp4Var != null) {
                setChecked(pp4Var.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.r != z) {
            this.r = z;
            pp4 pp4Var = this.x;
            if (pp4Var != null) {
                setChecked(pp4Var.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        TextView textView = this.v;
        textView.setTextAppearance(i);
        b(this.u.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.u;
        textView.setTextAppearance(i);
        b(textView.getTextSize(), this.v.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.u.setTextColor(colorStateList);
            this.v.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.u.setText(charSequence);
        this.v.setText(charSequence);
        pp4 pp4Var = this.x;
        if (pp4Var == null || TextUtils.isEmpty(pp4Var.q)) {
            setContentDescription(charSequence);
        }
        pp4 pp4Var2 = this.x;
        if (pp4Var2 != null && !TextUtils.isEmpty(pp4Var2.r)) {
            charSequence = this.x.r;
        }
        setTooltipText(charSequence);
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }
}
