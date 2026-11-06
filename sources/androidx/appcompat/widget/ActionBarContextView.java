package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import o.be8;
import o.bf8;
import o.h7;
import o.hk0;
import o.jp4;
import o.jq4;
import o.k;
import o.l7;
import o.o6;
import o.p7;
import o.pf8;
import o.uf0;
import o.zz5;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public TextView A;
    public TextView B;
    public final int C;
    public final int D;
    public boolean E;
    public final int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final k m;
    public final Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActionMenuView f2o;
    public l7 p;
    public int q;
    public bf8 r;
    public boolean s;
    public boolean t;
    public CharSequence u;
    public CharSequence v;
    public View w;
    public View x;
    public View y;
    public LinearLayout z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.m = new k(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.n = context;
        } else {
            this.n = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zz5.d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : uf0.p(context, resourceId));
        this.C = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.D = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.q = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.F = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
        this.J = getPaddingLeft();
        this.K = getPaddingTop();
        this.L = getPaddingRight();
        this.M = getPaddingBottom();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int h(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(p7 p7Var) {
        View view = this.w;
        byte b = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.F, (ViewGroup) this, false);
            this.w = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.w);
        }
        View viewFindViewById = this.w.findViewById(R.id.action_mode_close_button);
        this.x = viewFindViewById;
        viewFindViewById.setOnClickListener(new o6(p7Var, b));
        jp4 jp4VarF = p7Var.f();
        l7 l7Var = this.p;
        if (l7Var != null) {
            l7Var.g();
            h7 h7Var = l7Var.G;
            if (h7Var != null && h7Var.b()) {
                h7Var.i.dismiss();
            }
        }
        l7 l7Var2 = new l7(getContext());
        this.p = l7Var2;
        l7Var2.y = true;
        l7Var2.z = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        jp4VarF.b(this.p, this.n);
        l7 l7Var3 = this.p;
        jq4 jq4Var = l7Var3.t;
        if (jq4Var == null) {
            jq4 jq4Var2 = (jq4) l7Var3.p.inflate(l7Var3.r, (ViewGroup) this, false);
            l7Var3.t = jq4Var2;
            jq4Var2.b(l7Var3.f1334o);
            l7Var3.c(true);
        }
        jq4 jq4Var3 = l7Var3.t;
        if (jq4Var != jq4Var3) {
            ((ActionMenuView) jq4Var3).setPresenter(l7Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) jq4Var3;
        this.f2o = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f2o, layoutParams);
    }

    public final void d() {
        if (this.z == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.z = linearLayout;
            this.A = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.B = (TextView) this.z.findViewById(R.id.action_bar_subtitle);
            int i = this.C;
            if (i != 0) {
                this.A.setTextAppearance(getContext(), i);
            }
            int i2 = this.D;
            if (i2 != 0) {
                this.B.setTextAppearance(getContext(), i2);
            }
        }
        this.A.setText(this.u);
        this.B.setText(this.v);
        boolean zIsEmpty = TextUtils.isEmpty(this.u);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.v);
        this.B.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.z.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.z.getParent() == null) {
            addView(this.z);
        }
    }

    public final void e() {
        removeAllViews();
        this.y = null;
        this.f2o = null;
        this.p = null;
        View view = this.x;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void g(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, zz5.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        l7 l7Var = this.p;
        if (l7Var != null) {
            Configuration configuration2 = l7Var.n.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            l7Var.C = i;
            jp4 jp4Var = l7Var.f1334o;
            if (jp4Var != null) {
                jp4Var.r(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.r != null ? this.m.b : getVisibility();
    }

    public int getContentHeight() {
        return this.q;
    }

    public CharSequence getSubtitle() {
        return this.v;
    }

    public CharSequence getTitle() {
        return this.u;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            bf8 bf8Var = this.r;
            if (bf8Var != null) {
                bf8Var.b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bf8 j(int i, long j) {
        bf8 bf8Var = this.r;
        if (bf8Var != null) {
            bf8Var.b();
        }
        k kVar = this.m;
        if (i != 0) {
            bf8 bf8VarA = be8.a(this);
            bf8VarA.a(0.0f);
            bf8VarA.c(j);
            kVar.c.r = bf8VarA;
            kVar.b = i;
            bf8VarA.d(kVar);
            return bf8VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        bf8 bf8VarA2 = be8.a(this);
        bf8VarA2.a(1.0f);
        bf8VarA2.c(j);
        kVar.c.r = bf8VarA2;
        kVar.b = i;
        bf8VarA2.d(kVar);
        return bf8VarA2;
    }

    public final void k() {
        super.setPadding(this.G + this.J, this.H + this.K, this.I + this.L, this.M);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        g(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, zz5.d, R.attr.actionModeStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l7 l7Var = this.p;
        if (l7Var != null) {
            l7Var.g();
            h7 h7Var = this.p.G;
            if (h7Var == null || !h7Var.b()) {
                return;
            }
            h7Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.t = false;
        }
        if (!this.t) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.t = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.t = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = pf8.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.w;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iH = h(this.w, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iH - i6 : iH + i6;
        }
        LinearLayout linearLayout = this.z;
        if (linearLayout != null && this.y == null && linearLayout.getVisibility() != 8) {
            paddingRight += h(this.z, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.y;
        if (view2 != null) {
            h(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2o;
        if (actionMenuView != null) {
            h(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            hk0.l(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            hk0.l(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.q;
        int size2 = i3 > 0 ? i3 + this.H : View.MeasureSpec.getSize(i2);
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.w;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f2o;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f2o, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.z;
        if (linearLayout != null && this.y == null) {
            if (this.E) {
                this.z.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.z.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.z.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.y;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.y.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.q > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.s = false;
        }
        if (!this.s) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.s = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.s = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.q = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        this.y = view;
        if (view != null && (linearLayout = this.z) != null) {
            removeView(linearLayout);
            this.z = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.J = i;
        this.K = i2;
        this.L = i3;
        this.M = i4;
        k();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getLayoutDirection() != 1) {
            this.J = i;
            this.L = i3;
        } else {
            this.J = i3;
            this.L = i;
        }
        this.K = i2;
        this.M = i4;
        k();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.v = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.u = charSequence;
        d();
        be8.n(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.E) {
            requestLayout();
        }
        this.E = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
