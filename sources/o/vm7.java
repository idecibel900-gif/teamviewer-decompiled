package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vm7 extends LinearLayout {
    public static final /* synthetic */ int x = 0;
    public tm7 m;
    public TextView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f2329o;
    public View p;
    public o20 q;
    public View r;
    public TextView s;
    public ImageView t;
    public Drawable u;
    public int v;
    public final /* synthetic */ TabLayout w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm7(TabLayout tabLayout, Context context) {
        super(context);
        this.w = tabLayout;
        this.v = 2;
        e(context);
        int i = tabLayout.p;
        int i2 = tabLayout.q;
        int i3 = tabLayout.r;
        int i4 = tabLayout.s;
        WeakHashMap weakHashMap = be8.a;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!tabLayout.L ? 1 : 0);
        setClickable(true);
        ud8.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private o20 getBadge() {
        return this.q;
    }

    private o20 getOrCreateBadge() {
        int iMax;
        if (this.q == null) {
            Context context = getContext();
            o20 o20Var = new o20(context);
            xk0.l(context, null, R.attr.badgeStyle, R.style.Widget_MaterialComponents_Badge);
            int[] iArr = hz5.c;
            xk0.n(context, null, iArr, R.attr.badgeStyle, R.style.Widget_MaterialComponents_Badge, new int[0]);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.badgeStyle, R.style.Widget_MaterialComponents_Badge);
            o20Var.g(typedArrayObtainStyledAttributes.getInt(4, 4));
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(5);
            bq7 bq7Var = o20Var.f1621o;
            n20 n20Var = o20Var.t;
            if (zHasValue && n20Var.p != (iMax = Math.max(0, typedArrayObtainStyledAttributes.getInt(5, 0)))) {
                n20Var.p = iMax;
                bq7Var.d = true;
                o20Var.i();
                o20Var.invalidateSelf();
            }
            int defaultColor = xo1.O(context, typedArrayObtainStyledAttributes, 0).getDefaultColor();
            n20Var.m = defaultColor;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(defaultColor);
            qn4 qn4Var = o20Var.n;
            if (qn4Var.m.c != colorStateListValueOf) {
                qn4Var.l(colorStateListValueOf);
                o20Var.invalidateSelf();
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                int defaultColor2 = xo1.O(context, typedArrayObtainStyledAttributes, 2).getDefaultColor();
                n20Var.n = defaultColor2;
                if (bq7Var.a.getColor() != defaultColor2) {
                    bq7Var.a.setColor(defaultColor2);
                    o20Var.invalidateSelf();
                }
            }
            o20Var.f(typedArrayObtainStyledAttributes.getInt(1, 8388661));
            n20Var.w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            o20Var.i();
            n20Var.x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            o20Var.i();
            typedArrayObtainStyledAttributes.recycle();
            this.q = o20Var;
        }
        b();
        o20 o20Var2 = this.q;
        if (o20Var2 != null) {
            return o20Var2;
        }
        hk0.l("Unable to create badge");
        return null;
    }

    public final void a() {
        if (this.q != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.p;
            if (view != null) {
                o20 o20Var = this.q;
                if (o20Var != null) {
                    WeakReference weakReference = o20Var.B;
                    if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                        WeakReference weakReference2 = o20Var.B;
                        (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(null);
                    } else {
                        view.getOverlay().remove(o20Var);
                    }
                }
                this.p = null;
            }
        }
    }

    public final void b() {
        if (this.q != null) {
            if (this.r != null) {
                a();
                return;
            }
            TextView textView = this.n;
            if (textView == null || this.m == null) {
                a();
                return;
            }
            if (this.p == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.n;
            if (this.q == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            o20 o20Var = this.q;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            o20Var.setBounds(rect);
            o20Var.h(textView2, null);
            WeakReference weakReference = o20Var.B;
            if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                WeakReference weakReference2 = o20Var.B;
                (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(o20Var);
            } else {
                textView2.getOverlay().add(o20Var);
            }
            this.p = textView2;
        }
    }

    public final void c(View view) {
        o20 o20Var = this.q;
        if (o20Var == null || view != this.p) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        o20Var.setBounds(rect);
        o20Var.h(view, null);
    }

    public final void d() {
        tm7 tm7Var = this.m;
        View view = tm7Var != null ? tm7Var.b : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.r = view;
            TextView textView = this.n;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f2329o;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f2329o.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
            this.s = textView2;
            if (textView2 != null) {
                this.v = textView2.getMaxLines();
            }
            this.t = (ImageView) view.findViewById(android.R.id.icon);
        } else {
            View view2 = this.r;
            if (view2 != null) {
                removeView(view2);
                this.r = null;
            }
            this.s = null;
            this.t = null;
        }
        boolean z = false;
        if (this.r == null) {
            if (this.f2329o == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f2329o = imageView2;
                addView(imageView2, 0);
            }
            if (this.n == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.n = textView3;
                addView(textView3);
                this.v = this.n.getMaxLines();
            }
            TextView textView4 = this.n;
            TabLayout tabLayout = this.w;
            textView4.setTextAppearance(tabLayout.t);
            ColorStateList colorStateList = tabLayout.u;
            if (colorStateList != null) {
                this.n.setTextColor(colorStateList);
            }
            f(this.n, this.f2329o);
            b();
            ImageView imageView3 = this.f2329o;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new um7(this, imageView3));
            }
            TextView textView5 = this.n;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new um7(this, textView5));
            }
        } else {
            TextView textView6 = this.s;
            if (textView6 != null || this.t != null) {
                f(textView6, this.t);
            }
        }
        if (tm7Var != null && !TextUtils.isEmpty(null)) {
            setContentDescription(null);
        }
        if (tm7Var != null) {
            TabLayout tabLayout2 = tm7Var.c;
            if (tabLayout2 == null) {
                hk0.g("Tab not attached to a TabLayout");
                return;
            } else if (tabLayout2.getSelectedTabPosition() == tm7Var.a) {
                z = true;
            }
        }
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if ((drawable == null || !drawable.isStateful()) ? false : this.u.setState(drawableState)) {
            invalidate();
            this.w.invalidate();
        }
    }

    public final void e(Context context) {
        GradientDrawable gradientDrawable;
        TabLayout tabLayout = this.w;
        int i = tabLayout.B;
        if (i != 0) {
            Drawable drawableP = uf0.p(context, i);
            this.u = drawableP;
            if (drawableP != null && drawableP.isStateful()) {
                this.u.setState(getDrawableState());
            }
        } else {
            this.u = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (tabLayout.w != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateListA = oe6.a(tabLayout.w);
            boolean z = tabLayout.O;
            if (z) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z ? null : gradientDrawable3);
        }
        WeakHashMap weakHashMap = be8.a;
        setBackground(rippleDrawable);
        tabLayout.invalidate();
    }

    public final void f(TextView textView, ImageView imageView) {
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (textView != null) {
            if (zIsEmpty) {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            } else {
                textView.setText((CharSequence) null);
                this.m.getClass();
                textView.setVisibility(0);
                setVisibility(0);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iK = (zIsEmpty || imageView.getVisibility() != 0) ? 0 : (int) x67.k(getContext(), 8);
            if (this.w.L) {
                if (iK != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iK);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iK != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iK;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        setTooltipText(null);
    }

    public int getContentHeight() {
        View[] viewArr = {this.n, this.f2329o, this.r};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.n, this.f2329o, this.r};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public tm7 getTab() {
        return this.m;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        o20 o20Var = this.q;
        if (o20Var != null && o20Var.isVisible()) {
            accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.q.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f4.c(isSelected(), 0, 1, this.m.a, 1).m);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) a4.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.w;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.C, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.n != null) {
            float f = tabLayout.z;
            int i3 = this.v;
            ImageView imageView = this.f2329o;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.n;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.A;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.n.getTextSize();
            int lineCount = this.n.getLineCount();
            int maxLines = this.n.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.K == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.n.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.n.setTextSize(0, f);
                this.n.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.m == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.m.a();
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.n;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f2329o;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.r;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(tm7 tm7Var) {
        if (tm7Var != this.m) {
            this.m = tm7Var;
            d();
        }
    }
}
