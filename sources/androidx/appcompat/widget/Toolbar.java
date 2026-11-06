package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o.a08;
import o.be8;
import o.c4;
import o.ep3;
import o.ez7;
import o.fj1;
import o.fz7;
import o.gz7;
import o.hg6;
import o.hq4;
import o.hz7;
import o.iq;
import o.iz7;
import o.jp4;
import o.jz7;
import o.kz7;
import o.l7;
import o.mt8;
import o.o6;
import o.pf8;
import o.pp4;
import o.uf0;
import o.xe7;
import o.yt;
import o.zz5;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public hg6 F;
    public int G;
    public int H;
    public final int I;
    public CharSequence J;
    public CharSequence K;
    public ColorStateList L;
    public ColorStateList M;
    public boolean N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public final int[] R;
    public final ep3 S;
    public ArrayList T;
    public iz7 U;
    public final fz7 V;
    public a08 W;
    public l7 a0;
    public gz7 b0;
    public u0 c0;
    public kz7 d0;
    public boolean e0;
    public iq f0;
    public OnBackInvokedDispatcher g0;
    public boolean h0;
    public final mt8 i0;
    public ActionMenuView m;
    public yt n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public yt f9o;
    public AppCompatImageButton p;
    public AppCompatImageView q;
    public final Drawable r;
    public final CharSequence s;
    public AppCompatImageButton t;
    public View u;
    public Context v;
    public int w;
    public int x;
    public int y;
    public final int z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.I = 8388627;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new int[2];
        this.S = new ep3(new ez7(this, (byte) 1));
        this.T = new ArrayList();
        this.V = new fz7(this);
        this.i0 = new mt8((Object) this, (byte) 18);
        Context context2 = getContext();
        int[] iArr = zz5.y;
        ep3 ep3VarX = ep3.x(context2, attributeSet, iArr, R.attr.toolbarStyle);
        be8.l(this, context, iArr, attributeSet, (TypedArray) ep3VarX.f733o, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) ep3VarX.f733o;
        this.x = typedArray.getResourceId(28, 0);
        this.y = typedArray.getResourceId(19, 0);
        this.I = typedArray.getInteger(0, 8388627);
        this.z = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.E = dimensionPixelOffset;
        this.D = dimensionPixelOffset;
        this.C = dimensionPixelOffset;
        this.B = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.B = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.C = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.D = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.E = dimensionPixelOffset5;
        }
        this.A = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        hg6 hg6Var = this.F;
        hg6Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            hg6Var.e = dimensionPixelSize;
            hg6Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            hg6Var.f = dimensionPixelSize2;
            hg6Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            hg6Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.G = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.H = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.r = ep3VarX.l(4);
        this.s = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.v = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableL = ep3VarX.l(16);
        if (drawableL != null) {
            setNavigationIcon(drawableL);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableL2 = ep3VarX.l(11);
        if (drawableL2 != null) {
            setLogo(drawableL2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(ep3VarX.i(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(ep3VarX.i(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        ep3VarX.B();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new xe7(getContext());
    }

    public static hz7 h() {
        hz7 hz7Var = new hz7(-2, -2);
        hz7Var.b = (byte) 0;
        hz7Var.a = 8388627;
        return hz7Var;
    }

    public static hz7 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof hz7;
        if (z) {
            hz7 hz7Var = (hz7) layoutParams;
            hz7 hz7Var2 = new hz7(hz7Var);
            hz7Var2.b = (byte) 0;
            hz7Var2.b = hz7Var.b;
            return hz7Var2;
        }
        if (z) {
            hz7 hz7Var3 = new hz7((hz7) layoutParams);
            hz7Var3.b = (byte) 0;
            return hz7Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            hz7 hz7Var4 = new hz7(layoutParams);
            hz7Var4.b = (byte) 0;
            return hz7Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        hz7 hz7Var5 = new hz7(marginLayoutParams);
        hz7Var5.b = (byte) 0;
        ((ViewGroup.MarginLayoutParams) hz7Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) hz7Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) hz7Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) hz7Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return hz7Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                hz7 hz7Var = (hz7) childAt.getLayoutParams();
                if (hz7Var.b == 0 && t(childAt)) {
                    int i3 = hz7Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            hz7 hz7Var2 = (hz7) childAt2.getLayoutParams();
            if (hz7Var2.b == 0 && t(childAt2)) {
                int i5 = hz7Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        hz7 hz7VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            hz7VarI = h();
        } else {
            hz7VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (hz7) layoutParams;
        }
        hz7VarI.b = (byte) 1;
        if (!z || this.u == null) {
            addView(view, hz7VarI);
        } else {
            view.setLayoutParams(hz7VarI);
            this.Q.add(view);
        }
    }

    public final void c() {
        if (this.t == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.t = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.r);
            this.t.setContentDescription(this.s);
            hz7 hz7VarH = h();
            hz7VarH.a = (this.z & 112) | 8388611;
            hz7VarH.b = (byte) 2;
            this.t.setLayoutParams(hz7VarH);
            this.t.setOnClickListener(new o6(this, (byte) 10));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof hz7);
    }

    public final void d() {
        if (this.F == null) {
            hg6 hg6Var = new hg6();
            hg6Var.a = 0;
            hg6Var.b = 0;
            hg6Var.c = Integer.MIN_VALUE;
            hg6Var.d = Integer.MIN_VALUE;
            hg6Var.e = 0;
            hg6Var.f = 0;
            hg6Var.g = false;
            hg6Var.h = false;
            this.F = hg6Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.m;
        if (actionMenuView.B == null) {
            jp4 jp4Var = (jp4) actionMenuView.getMenu();
            if (this.b0 == null) {
                this.b0 = new gz7(this);
            }
            this.m.setExpandedActionViewsExclusive(true);
            jp4Var.b(this.b0, this.v);
            v();
        }
    }

    public final void f() {
        if (this.m == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.m = actionMenuView;
            actionMenuView.setPopupTheme(this.w);
            this.m.setOnMenuItemClickListener(this.V);
            ActionMenuView actionMenuView2 = this.m;
            u0 u0Var = this.c0;
            fz7 fz7Var = new fz7(this);
            actionMenuView2.G = u0Var;
            actionMenuView2.H = fz7Var;
            hz7 hz7VarH = h();
            hz7VarH.a = (this.z & 112) | 8388613;
            this.m.setLayoutParams(hz7VarH);
            b(this.m, false);
        }
    }

    public final void g() {
        if (this.p == null) {
            this.p = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            hz7 hz7VarH = h();
            hz7VarH.a = (this.z & 112) | 8388611;
            this.p.setLayoutParams(hz7VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        hz7 hz7Var = new hz7(context, attributeSet);
        hz7Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zz5.b);
        hz7Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        hz7Var.b = (byte) 0;
        return hz7Var;
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.t;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.t;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        hg6 hg6Var = this.F;
        if (hg6Var != null) {
            return hg6Var.g ? hg6Var.a : hg6Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.H;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        hg6 hg6Var = this.F;
        if (hg6Var != null) {
            return hg6Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        hg6 hg6Var = this.F;
        if (hg6Var != null) {
            return hg6Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        hg6 hg6Var = this.F;
        if (hg6Var != null) {
            return hg6Var.g ? hg6Var.b : hg6Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.G;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        jp4 jp4Var;
        ActionMenuView actionMenuView = this.m;
        return (actionMenuView == null || (jp4Var = actionMenuView.B) == null || !jp4Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.H, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.G, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.q;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.q;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.m.getMenu();
    }

    public View getNavButtonView() {
        return this.p;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.p;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.p;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public l7 getOuterActionMenuPresenter() {
        return this.a0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.m.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.v;
    }

    public int getPopupTheme() {
        return this.w;
    }

    public CharSequence getSubtitle() {
        return this.K;
    }

    public final TextView getSubtitleTextView() {
        return this.f9o;
    }

    public CharSequence getTitle() {
        return this.J;
    }

    public int getTitleMarginBottom() {
        return this.E;
    }

    public int getTitleMarginEnd() {
        return this.C;
    }

    public int getTitleMarginStart() {
        return this.B;
    }

    public int getTitleMarginTop() {
        return this.D;
    }

    public final TextView getTitleTextView() {
        return this.n;
    }

    public fj1 getWrapper() {
        a08 a08Var = this.W;
        if (a08Var != null) {
            return a08Var;
        }
        a08 a08Var2 = new a08(this, true);
        this.W = a08Var2;
        return a08Var2;
    }

    public final int j(View view, int i) {
        hz7 hz7Var = (hz7) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = hz7Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.I & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) hz7Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) hz7Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) hz7Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.S.f733o).iterator();
        while (it2.hasNext()) {
            ((hq4) it2.next()).u(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.T = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.Q.contains(view);
    }

    public final boolean o() {
        l7 l7Var;
        ActionMenuView actionMenuView = this.m;
        return (actionMenuView == null || (l7Var = actionMenuView.F) == null || !l7Var.i()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.i0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.O = false;
        }
        if (!this.O) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.O = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.O = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iP;
        int iQ;
        int iMax;
        int iMin;
        boolean zT;
        boolean zT2;
        int measuredHeight;
        yt ytVar;
        yt ytVar2;
        hz7 hz7Var;
        hz7 hz7Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iP2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        AppCompatImageView appCompatImageView;
        View view;
        ActionMenuView actionMenuView;
        AppCompatImageButton appCompatImageButton;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.R;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = be8.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (t(this.p)) {
            AppCompatImageButton appCompatImageButton2 = this.p;
            if (z3) {
                iQ = q(appCompatImageButton2, i26, iMin2, iArr);
                iP = paddingLeft;
            } else {
                iP = p(appCompatImageButton2, paddingLeft, iMin2, iArr);
            }
            if (t(this.t)) {
                appCompatImageButton = this.t;
                if (z3) {
                    iQ = q(appCompatImageButton, iQ, iMin2, iArr);
                } else {
                    iP = p(appCompatImageButton, iP, iMin2, iArr);
                }
            }
            if (t(this.m)) {
                actionMenuView = this.m;
                if (z3) {
                    iP = p(actionMenuView, iP, iMin2, iArr);
                } else {
                    iQ = q(actionMenuView, iQ, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iP);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iQ));
            iMax = Math.max(iP, currentContentInsetLeft);
            iMin = Math.min(iQ, i26 - currentContentInsetRight);
            if (t(this.u)) {
                view = this.u;
                if (z3) {
                    iMin = q(view, iMin, iMin2, iArr);
                } else {
                    iMax = p(view, iMax, iMin2, iArr);
                }
            }
            if (t(this.q)) {
                appCompatImageView = this.q;
                if (z3) {
                    iMin = q(appCompatImageView, iMin, iMin2, iArr);
                } else {
                    iMax = p(appCompatImageView, iMax, iMin2, iArr);
                }
            }
            zT = t(this.n);
            zT2 = t(this.f9o);
            if (zT) {
                hz7 hz7Var3 = (hz7) this.n.getLayoutParams();
                measuredHeight = this.n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hz7Var3).topMargin + ((ViewGroup.MarginLayoutParams) hz7Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zT2) {
                hz7 hz7Var4 = (hz7) this.f9o.getLayoutParams();
                measuredHeight = this.f9o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hz7Var4).topMargin + ((ViewGroup.MarginLayoutParams) hz7Var4).bottomMargin + measuredHeight;
            }
            if (zT || zT2) {
                if (zT) {
                    ytVar = this.n;
                } else {
                    ytVar = this.f9o;
                }
                if (zT2) {
                    ytVar2 = this.f9o;
                } else {
                    ytVar2 = this.n;
                }
                hz7Var = (hz7) ytVar.getLayoutParams();
                hz7Var2 = (hz7) ytVar2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zT && this.n.getMeasuredWidth() > 0) || (zT2 && this.f9o.getMeasuredWidth() > 0);
                i6 = this.I & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) hz7Var).topMargin + this.D;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) hz7Var).topMargin + this.D;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) hz7Var).bottomMargin;
                        i17 = this.E;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) hz7Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) hz7Var2).bottomMargin) - this.E) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.B;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zT) {
                        hz7 hz7Var5 = (hz7) this.n.getLayoutParams();
                        int measuredWidth2 = iMin - this.n.getMeasuredWidth();
                        int measuredHeight2 = this.n.getMeasuredHeight() + paddingTop;
                        this.n.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.C;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) hz7Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zT2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((hz7) this.f9o.getLayoutParams())).topMargin;
                        this.f9o.layout(iMin - this.f9o.getMeasuredWidth(), i28, iMin, this.f9o.getMeasuredHeight() + i28);
                        i13 = iMin - this.C;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.B;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zT) {
                        hz7 hz7Var6 = (hz7) this.n.getLayoutParams();
                        int measuredWidth3 = this.n.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.n.getMeasuredHeight() + paddingTop;
                        this.n.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.C;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) hz7Var6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zT2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((hz7) this.f9o.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f9o.getMeasuredWidth() + iMax;
                        this.f9o.layout(iMax, i30, measuredWidth4, this.f9o.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.C;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.P;
            a(3, arrayList);
            size = arrayList.size();
            iP2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iP2 = p((View) arrayList.get(i18), iP2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = q((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                hz7 hz7Var7 = (hz7) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) hz7Var7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) hz7Var7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iP2) {
                if (i25 > iMin) {
                    iP2 = i24 - (i25 - iMin);
                } else {
                    iP2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iP2 = p((View) arrayList.get(i23), iP2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iP = paddingLeft;
        iQ = i26;
        if (t(this.t)) {
            appCompatImageButton = this.t;
            if (z3) {
                iQ = q(appCompatImageButton, iQ, iMin2, iArr);
            } else {
                iP = p(appCompatImageButton, iP, iMin2, iArr);
            }
        }
        if (t(this.m)) {
            actionMenuView = this.m;
            if (z3) {
                iP = p(actionMenuView, iP, iMin2, iArr);
            } else {
                iQ = q(actionMenuView, iQ, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iP);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iQ));
        iMax = Math.max(iP, currentContentInsetLeft2);
        iMin = Math.min(iQ, i26 - currentContentInsetRight2);
        if (t(this.u)) {
            view = this.u;
            if (z3) {
                iMin = q(view, iMin, iMin2, iArr);
            } else {
                iMax = p(view, iMax, iMin2, iArr);
            }
        }
        if (t(this.q)) {
            appCompatImageView = this.q;
            if (z3) {
                iMin = q(appCompatImageView, iMin, iMin2, iArr);
            } else {
                iMax = p(appCompatImageView, iMax, iMin2, iArr);
            }
        }
        zT = t(this.n);
        zT2 = t(this.f9o);
        if (zT) {
            hz7 hz7Var8 = (hz7) this.n.getLayoutParams();
            measuredHeight = this.n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hz7Var8).topMargin + ((ViewGroup.MarginLayoutParams) hz7Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zT2) {
            hz7 hz7Var9 = (hz7) this.f9o.getLayoutParams();
            measuredHeight = this.f9o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hz7Var9).topMargin + ((ViewGroup.MarginLayoutParams) hz7Var9).bottomMargin + measuredHeight;
        }
        if (zT) {
            if (zT) {
                ytVar = this.n;
            } else {
                ytVar = this.f9o;
            }
            if (zT2) {
                ytVar2 = this.f9o;
            } else {
                ytVar2 = this.n;
            }
            hz7Var = (hz7) ytVar.getLayoutParams();
            hz7Var2 = (hz7) ytVar2.getLayoutParams();
            i5 = measuredHeight;
            if (zT) {
            }
            i6 = this.I & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) hz7Var).topMargin + this.D;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) hz7Var).topMargin + this.D;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) hz7Var).bottomMargin;
                    i17 = this.E;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) hz7Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) hz7Var2).bottomMargin) - this.E) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.B;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zT) {
                    hz7 hz7Var10 = (hz7) this.n.getLayoutParams();
                    int measuredWidth5 = iMin - this.n.getMeasuredWidth();
                    int measuredHeight4 = this.n.getMeasuredHeight() + paddingTop;
                    this.n.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.C;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) hz7Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zT2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((hz7) this.f9o.getLayoutParams())).topMargin;
                    this.f9o.layout(iMin - this.f9o.getMeasuredWidth(), i211, iMin, this.f9o.getMeasuredHeight() + i211);
                    i13 = iMin - this.C;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.B;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zT) {
                    hz7 hz7Var11 = (hz7) this.n.getLayoutParams();
                    int measuredWidth6 = this.n.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.n.getMeasuredHeight() + paddingTop;
                    this.n.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.C;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) hz7Var11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zT2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((hz7) this.f9o.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f9o.getMeasuredWidth() + iMax;
                    this.f9o.layout(iMax, i35, measuredWidth7, this.f9o.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.C;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zT) {
                ytVar = this.n;
            } else {
                ytVar = this.f9o;
            }
            if (zT2) {
                ytVar2 = this.f9o;
            } else {
                ytVar2 = this.n;
            }
            hz7Var = (hz7) ytVar.getLayoutParams();
            hz7Var2 = (hz7) ytVar2.getLayoutParams();
            i5 = measuredHeight;
            if (zT) {
            }
            i6 = this.I & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) hz7Var).topMargin + this.D;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) hz7Var).topMargin + this.D;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) hz7Var).bottomMargin;
                    i17 = this.E;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) hz7Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) hz7Var2).bottomMargin) - this.E) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.B;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zT) {
                    hz7 hz7Var12 = (hz7) this.n.getLayoutParams();
                    int measuredWidth8 = iMin - this.n.getMeasuredWidth();
                    int measuredHeight6 = this.n.getMeasuredHeight() + paddingTop;
                    this.n.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.C;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) hz7Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zT2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((hz7) this.f9o.getLayoutParams())).topMargin;
                    this.f9o.layout(iMin - this.f9o.getMeasuredWidth(), i214, iMin, this.f9o.getMeasuredHeight() + i214);
                    i13 = iMin - this.C;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.B;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zT) {
                    hz7 hz7Var13 = (hz7) this.n.getLayoutParams();
                    int measuredWidth9 = this.n.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.n.getMeasuredHeight() + paddingTop;
                    this.n.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.C;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) hz7Var13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zT2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((hz7) this.f9o.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f9o.getMeasuredWidth() + iMax;
                    this.f9o.layout(iMax, i36, measuredWidth10, this.f9o.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.C;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.P;
        a(3, arrayList);
        size = arrayList.size();
        iP2 = iMax;
        while (i18 < size) {
            iP2 = p((View) arrayList.get(i18), iP2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = q((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            hz7 hz7Var14 = (hz7) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) hz7Var14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) hz7Var14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iP2) {
            if (i25 > iMin) {
                iP2 = i24 - (i25 - iMin);
            } else {
                iP2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iP2 = p((View) arrayList.get(i23), iP2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = pf8.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (t(this.p)) {
            s(this.p, i, 0, i2, this.A);
            iK = k(this.p) + this.p.getMeasuredWidth();
            iMax = Math.max(0, l(this.p) + this.p.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.p.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.t)) {
            s(this.t, i, 0, i2, this.A);
            iK = k(this.t) + this.t.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.t) + this.t.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.t.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.R;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (t(this.m)) {
            s(this.m, i, iMax3, i2, this.A);
            iK2 = k(this.m) + this.m.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.m) + this.m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.m.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.u)) {
            iMax5 += r(this.u, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.u) + this.u.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.u.getMeasuredState());
        }
        if (t(this.q)) {
            iMax5 += r(this.q, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.q) + this.q.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.q.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((hz7) childAt.getLayoutParams()).b == 0 && t(childAt)) {
                iMax5 += r(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.D + this.E;
        int i7 = this.B + this.C;
        if (t(this.n)) {
            r(this.n, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.n) + this.n.getMeasuredWidth();
            iL = l(this.n) + this.n.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f9o)) {
            iMax2 = Math.max(iMax2, r(this.f9o, i, i5 + i7, i2, iL + i6, iArr));
            iL += l(this.f9o) + this.f9o.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f9o.getMeasuredState());
        }
        if (t(this.n) || t(this.f9o)) {
            iL += i6;
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.e0) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof jz7)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        jz7 jz7Var = (jz7) parcelable;
        super.onRestoreInstanceState(jz7Var.m);
        ActionMenuView actionMenuView = this.m;
        jp4 jp4Var = actionMenuView != null ? actionMenuView.B : null;
        int i = jz7Var.f1216o;
        if (i != 0 && this.b0 != null && jp4Var != null && (menuItemFindItem = jp4Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (jz7Var.p) {
            mt8 mt8Var = this.i0;
            removeCallbacks(mt8Var);
            post(mt8Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        hg6 hg6Var = this.F;
        boolean z = i == 1;
        if (z == hg6Var.g) {
            return;
        }
        hg6Var.g = z;
        if (!hg6Var.h) {
            hg6Var.a = hg6Var.e;
            hg6Var.b = hg6Var.f;
            return;
        }
        if (z) {
            int i2 = hg6Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = hg6Var.e;
            }
            hg6Var.a = i2;
            int i3 = hg6Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = hg6Var.f;
            }
            hg6Var.b = i3;
            return;
        }
        int i4 = hg6Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = hg6Var.e;
        }
        hg6Var.a = i4;
        int i5 = hg6Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = hg6Var.f;
        }
        hg6Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        pp4 pp4Var;
        jz7 jz7Var = new jz7(super.onSaveInstanceState());
        gz7 gz7Var = this.b0;
        if (gz7Var != null && (pp4Var = gz7Var.n) != null) {
            jz7Var.f1216o = pp4Var.a;
        }
        jz7Var.p = o();
        return jz7Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.N = false;
        }
        if (!this.N) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.N = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.N = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        hz7 hz7Var = (hz7) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) hz7Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) hz7Var).rightMargin + iMax;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        hz7 hz7Var = (hz7) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) hz7Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) hz7Var).leftMargin);
    }

    public final int r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.h0 != z) {
            this.h0 = z;
            v();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.t;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.t.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.t;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.r);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.e0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.H) {
            this.H = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.G) {
            this.G = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.q;
        if (drawable != null) {
            if (appCompatImageView == null) {
                appCompatImageView = new AppCompatImageView(getContext());
                this.q = appCompatImageView;
            }
            if (!n(appCompatImageView)) {
                b(this.q, true);
            }
        } else if (appCompatImageView != null && n(appCompatImageView)) {
            removeView(this.q);
            this.Q.remove(this.q);
        }
        AppCompatImageView appCompatImageView2 = this.q;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.q == null) {
            this.q = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.q;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.p;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            this.p.setTooltipText(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.p)) {
                b(this.p, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.p;
            if (appCompatImageButton != null && n(appCompatImageButton)) {
                removeView(this.p);
                this.Q.remove(this.p);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.p;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.p.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(iz7 iz7Var) {
        this.U = iz7Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.m.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.w != i) {
            this.w = i;
            if (i == 0) {
                this.v = getContext();
            } else {
                this.v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        yt ytVar = this.f9o;
        if (!zIsEmpty) {
            if (ytVar == null) {
                Context context = getContext();
                yt ytVar2 = new yt(context, null);
                this.f9o = ytVar2;
                ytVar2.setSingleLine();
                this.f9o.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.y;
                if (i != 0) {
                    this.f9o.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.M;
                if (colorStateList != null) {
                    this.f9o.setTextColor(colorStateList);
                }
            }
            if (!n(this.f9o)) {
                b(this.f9o, true);
            }
        } else if (ytVar != null && n(ytVar)) {
            removeView(this.f9o);
            this.Q.remove(this.f9o);
        }
        yt ytVar3 = this.f9o;
        if (ytVar3 != null) {
            ytVar3.setText(charSequence);
        }
        this.K = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.M = colorStateList;
        yt ytVar = this.f9o;
        if (ytVar != null) {
            ytVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        yt ytVar = this.n;
        if (!zIsEmpty) {
            if (ytVar == null) {
                Context context = getContext();
                yt ytVar2 = new yt(context, null);
                this.n = ytVar2;
                ytVar2.setSingleLine();
                this.n.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.x;
                if (i != 0) {
                    this.n.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.L;
                if (colorStateList != null) {
                    this.n.setTextColor(colorStateList);
                }
            }
            if (!n(this.n)) {
                b(this.n, true);
            }
        } else if (ytVar != null && n(ytVar)) {
            removeView(this.n);
            this.Q.remove(this.n);
        }
        yt ytVar3 = this.n;
        if (ytVar3 != null) {
            ytVar3.setText(charSequence);
        }
        this.J = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.E = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.C = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.B = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.D = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        yt ytVar = this.n;
        if (ytVar != null) {
            ytVar.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        l7 l7Var;
        ActionMenuView actionMenuView = this.m;
        return (actionMenuView == null || (l7Var = actionMenuView.F) == null || !l7Var.n()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = c4.a(this);
            gz7 gz7Var = this.b0;
            boolean z = (gz7Var == null || gz7Var.n == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.h0) ? false : true;
            if (!z || this.g0 != null) {
                if (z || (onBackInvokedDispatcher = this.g0) == null) {
                    return;
                }
                c4.u(onBackInvokedDispatcher, this.f0);
                this.g0 = null;
                return;
            }
            iq iqVar = this.f0;
            if (iqVar == null) {
                iq iqVar2 = new iq(new ez7(this, (byte) 0), (byte) 3);
                this.f0 = iqVar2;
                iqVar = iqVar2;
            }
            c4.t(onBackInvokedDispatcherA, iqVar);
            this.g0 = onBackInvokedDispatcherA;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(uf0.p(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(uf0.p(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(uf0.p(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
