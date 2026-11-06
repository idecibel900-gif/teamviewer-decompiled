package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import io.sentry.android.core.u0;
import o.df6;
import o.fq4;
import o.h7;
import o.hp4;
import o.ip4;
import o.j7;
import o.jp4;
import o.jq4;
import o.l7;
import o.m7;
import o.n7;
import o.o7;
import o.pf8;
import o.pp4;
import o.u94;
import o.v94;
import o.xz2;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends v94 implements ip4, jq4 {
    public jp4 B;
    public Context C;
    public int D;
    public boolean E;
    public l7 F;
    public u0 G;
    public hp4 H;
    public boolean I;
    public int J;
    public final int K;
    public final int L;
    public o7 M;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.K = (int) (56.0f * f);
        this.L = (int) (f * 4.0f);
        this.C = context;
        this.D = 0;
    }

    public static n7 j() {
        n7 n7Var = new n7(-2, -2);
        n7Var.a = false;
        ((LinearLayout.LayoutParams) n7Var).gravity = 16;
        return n7Var;
    }

    public static n7 k(ViewGroup.LayoutParams layoutParams) {
        n7 n7Var;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof n7) {
            n7 n7Var2 = (n7) layoutParams;
            n7Var = new n7(n7Var2);
            n7Var.a = n7Var2.a;
        } else {
            n7Var = new n7(layoutParams);
        }
        if (((LinearLayout.LayoutParams) n7Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) n7Var).gravity = 16;
        }
        return n7Var;
    }

    @Override // o.jq4
    public final void b(jp4 jp4Var) {
        this.B = jp4Var;
    }

    @Override // o.ip4
    public final boolean c(pp4 pp4Var) {
        return this.B.s(pp4Var, null, 0);
    }

    @Override // o.v94, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof n7;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // o.v94
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ u94 generateDefaultLayoutParams() {
        return j();
    }

    @Override // o.v94
    /* JADX INFO: renamed from: g */
    public final u94 generateLayoutParams(AttributeSet attributeSet) {
        return new n7(getContext(), attributeSet);
    }

    @Override // o.v94, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // o.v94, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new n7(getContext(), attributeSet);
    }

    public Menu getMenu() {
        jp4 jp4Var = this.B;
        if (jp4Var != null) {
            return jp4Var;
        }
        Context context = getContext();
        jp4 jp4Var2 = new jp4(context);
        this.B = jp4Var2;
        jp4Var2.e = new df6((Object) this, (byte) 8);
        l7 l7Var = new l7(context);
        this.F = l7Var;
        l7Var.y = true;
        l7Var.z = true;
        fq4 xz2Var = this.G;
        if (xz2Var == null) {
            xz2Var = new xz2((byte) 27);
        }
        l7Var.q = xz2Var;
        this.B.b(l7Var, this.C);
        l7 l7Var2 = this.F;
        l7Var2.t = this;
        jp4 jp4Var3 = l7Var2.f1334o;
        this.B = jp4Var3;
        return jp4Var3;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        l7 l7Var = this.F;
        j7 j7Var = l7Var.v;
        if (j7Var != null) {
            return j7Var.getDrawable();
        }
        if (l7Var.x) {
            return l7Var.w;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.D;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // o.v94
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ u94 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof m7)) {
            zB = ((m7) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof m7)) ? zB : ((m7) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l7 l7Var = this.F;
        if (l7Var != null) {
            l7Var.c(false);
            if (this.F.i()) {
                this.F.g();
                this.F.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l7 l7Var = this.F;
        if (l7Var != null) {
            l7Var.g();
            h7 h7Var = l7Var.G;
            if (h7Var == null || !h7Var.b()) {
                return;
            }
            h7Var.i.dismiss();
        }
    }

    @Override // o.v94, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.I) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = pf8.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                n7 n7Var = (n7) childAt.getLayoutParams();
                if (n7Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) n7Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) n7Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) n7Var).leftMargin) + ((LinearLayout.LayoutParams) n7Var).rightMargin;
                    l(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                n7 n7Var2 = (n7) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !n7Var2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) n7Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) n7Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            n7 n7Var3 = (n7) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !n7Var3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) n7Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) n7Var3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // o.v94, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        jp4 jp4Var;
        boolean z = this.I;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.I = z2;
        if (z != z2) {
            this.J = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.I && (jp4Var = this.B) != null && size != this.J) {
            this.J = size;
            jp4Var.r(true);
        }
        int childCount = getChildCount();
        if (!this.I || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                n7 n7Var = (n7) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) n7Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) n7Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.K;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.L;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                n7 n7Var2 = (n7) childAt.getLayoutParams();
                n7Var2.f = false;
                n7Var2.c = 0;
                n7Var2.b = 0;
                n7Var2.d = false;
                ((LinearLayout.LayoutParams) n7Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) n7Var2).rightMargin = 0;
                n7Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = n7Var2.a ? 1 : i10;
                n7 n7Var3 = (n7) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                n7Var3.d = !n7Var3.a && z6;
                n7Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (n7Var2.d) {
                    i15++;
                }
                if (n7Var2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                n7 n7Var4 = (n7) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (n7Var4.d) {
                    int i28 = n7Var4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                n7 n7Var5 = (n7) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && n7Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    n7Var5.b += r11;
                    n7Var5.f = r11;
                    i23--;
                } else if (n7Var5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((n7) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((n7) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    n7 n7Var6 = (n7) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        n7Var6.c = i32;
                        n7Var6.f = true;
                        if (i33 == 0 && !n7Var6.e) {
                            ((LinearLayout.LayoutParams) n7Var6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (n7Var6.a) {
                        n7Var6.c = i32;
                        n7Var6.f = true;
                        ((LinearLayout.LayoutParams) n7Var6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) n7Var6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) n7Var6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                n7 n7Var7 = (n7) childAt4.getLayoutParams();
                if (n7Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((n7Var7.b * i22) + n7Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.F.D = z;
    }

    public void setOnMenuItemClickListener(o7 o7Var) {
        this.M = o7Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        l7 l7Var = this.F;
        j7 j7Var = l7Var.v;
        if (j7Var != null) {
            j7Var.setImageDrawable(drawable);
        } else {
            l7Var.x = true;
            l7Var.w = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.E = z;
    }

    public void setPopupTheme(int i) {
        if (this.D != i) {
            this.D = i;
            if (i == 0) {
                this.C = getContext();
            } else {
                this.C = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(l7 l7Var) {
        this.F = l7Var;
        l7Var.t = this;
        this.B = l7Var.f1334o;
    }

    @Override // o.v94, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
