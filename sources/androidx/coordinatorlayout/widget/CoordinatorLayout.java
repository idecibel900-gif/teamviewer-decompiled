package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.v0;
import io.sentry.h2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import o.a07;
import o.ad1;
import o.bd1;
import o.be8;
import o.cd1;
import o.dd1;
import o.ed1;
import o.gj2;
import o.h25;
import o.hk0;
import o.i25;
import o.ie8;
import o.j93;
import o.lf1;
import o.sd8;
import o.sk8;
import o.sz5;
import o.wo5;
import o.xc0;
import o.yc1;
import o.zc1;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements h25, i25 {
    public static final String F;
    public static final Class[] G;
    public static final ThreadLocal H;
    public static final gj2 I;
    public static final wo5 J;
    public boolean A;
    public Drawable B;
    public ViewGroup.OnHierarchyChangeListener C;
    public xc0 D;
    public final lf1 E;
    public final ArrayList m;
    public final j93 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f16o;
    public final ArrayList p;
    public final int[] q;
    public final int[] r;
    public boolean s;
    public boolean t;
    public final int[] u;
    public View v;
    public View w;
    public dd1 x;
    public boolean y;
    public sk8 z;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        F = r0 != null ? r0.getName() : null;
        I = new gj2((byte) 13);
        G = new Class[]{Context.class, AttributeSet.class};
        H = new ThreadLocal();
        J = new wo5(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.m = new ArrayList();
        this.n = new j93((byte) 14);
        this.f16o = new ArrayList();
        this.p = new ArrayList();
        this.q = new int[2];
        this.r = new int[2];
        this.E = new lf1((byte) 4);
        int[] iArr = sz5.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.u = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.u;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.B = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new bd1(this));
        WeakHashMap weakHashMap = be8.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) J.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, cd1 cd1Var, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = cd1Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = cd1Var.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cd1 n(View view) {
        cd1 cd1Var = (cd1) view.getLayoutParams();
        if (!cd1Var.b) {
            if (view instanceof yc1) {
                zc1 behavior = ((yc1) view).getBehavior();
                if (behavior == null) {
                    v0.c("CoordinatorLayout", "Attached behavior class is null");
                }
                cd1Var.b(behavior);
                cd1Var.b = true;
                return cd1Var;
            }
            ad1 ad1Var = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                ad1Var = (ad1) superclass.getAnnotation(ad1.class);
                if (ad1Var != null) {
                    break;
                }
            }
            if (ad1Var != null) {
                try {
                    cd1Var.b((zc1) ad1Var.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    v0.d("CoordinatorLayout", "Default behavior class " + ad1Var.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            cd1Var.b = true;
        }
        return cd1Var;
    }

    public static void v(View view, int i) {
        cd1 cd1Var = (cd1) view.getLayoutParams();
        int i2 = cd1Var.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = be8.a;
            view.offsetLeftAndRight(i - i2);
            cd1Var.i = i;
        }
    }

    public static void w(View view, int i) {
        cd1 cd1Var = (cd1) view.getLayoutParams();
        int i2 = cd1Var.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = be8.a;
            view.offsetTopAndBottom(i - i2);
            cd1Var.j = i;
        }
    }

    public final void b(cd1 cd1Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cd1Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) cd1Var).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cd1Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) cd1Var).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // o.i25
    public final void c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        zc1 zc1Var;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                cd1 cd1Var = (cd1) childAt.getLayoutParams();
                if (cd1Var.a(i5) && (zc1Var = cd1Var.a) != null) {
                    int[] iArr2 = this.q;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    zc1Var.l(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof cd1) && super.checkLayoutParams(layoutParams);
    }

    @Override // o.h25
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        c(view, i, i2, i3, i4, 0, this.r);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        zc1 zc1Var = ((cd1) view.getLayoutParams()).a;
        if (zc1Var != null) {
            zc1Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.B;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // o.h25
    public final boolean e(View view, View view2, int i, int i2) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z = false;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view3 = view;
                i3 = i;
                i4 = i2;
            } else {
                cd1 cd1Var = (cd1) childAt.getLayoutParams();
                zc1 zc1Var = cd1Var.a;
                if (zc1Var != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    boolean zP = zc1Var.p(coordinatorLayout, childAt, view3, i3, i4);
                    z |= zP;
                    if (i4 == 0) {
                        cd1Var.m = zP;
                    } else if (i4 == 1) {
                        cd1Var.n = zP;
                    }
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    if (i4 == 0) {
                        cd1Var.m = false;
                    } else if (i4 == 1) {
                        cd1Var.n = false;
                    }
                }
            }
            i5++;
            this = coordinatorLayout;
            view = view3;
            i = i3;
            i2 = i4;
        }
        return z;
    }

    @Override // o.h25
    public final void f(View view, View view2, int i, int i2) {
        lf1 lf1Var = this.E;
        if (i2 == 1) {
            lf1Var.c = i;
        } else {
            lf1Var.b = i;
        }
        this.w = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((cd1) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // o.h25
    public final void g(View view, int i) {
        lf1 lf1Var = this.E;
        if (i == 1) {
            lf1Var.c = 0;
        } else {
            lf1Var.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            cd1 cd1Var = (cd1) childAt.getLayoutParams();
            if (cd1Var.a(i)) {
                zc1 zc1Var = cd1Var.a;
                if (zc1Var != null) {
                    zc1Var.q(this, childAt, view, i);
                }
                if (i == 0) {
                    cd1Var.m = false;
                } else if (i == 1) {
                    cd1Var.n = false;
                }
                cd1Var.f515o = false;
            }
        }
        this.w = null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new cd1();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof cd1) {
            return new cd1((cd1) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new cd1((ViewGroup.MarginLayoutParams) layoutParams) : new cd1(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.m);
    }

    public final sk8 getLastWindowInsets() {
        return this.z;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        lf1 lf1Var = this.E;
        return lf1Var.c | lf1Var.b;
    }

    public Drawable getStatusBarBackground() {
        return this.B;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // o.h25
    public final void h(View view, int i, int i2, int[] iArr, int i3) {
        zc1 zc1Var;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                cd1 cd1Var = (cd1) childAt.getLayoutParams();
                if (cd1Var.a(i3) && (zc1Var = cd1Var.a) != null) {
                    int[] iArr2 = this.q;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    zc1Var.k(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            p(1);
        }
    }

    public final void i(View view) {
        List list = (List) ((a07) this.n.f1141o).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            zc1 zc1Var = ((cd1) view2.getLayoutParams()).a;
            if (zc1Var != null) {
                zc1Var.d(this, view2, view);
            }
        }
    }

    public final void j(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            ie8.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList k(View view) {
        a07 a07Var = (a07) this.n.f1141o;
        int i = a07Var.f278o;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) a07Var.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a07Var.f(i2));
            }
        }
        ArrayList arrayList3 = this.p;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final int m(int i) {
        int[] iArr = this.u;
        if (iArr == null) {
            v0.c("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        v0.c("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i2) {
        wo5 wo5Var = J;
        Rect rectA = a();
        ie8.a(this, view, rectA);
        try {
            return rectA.contains(i, i2);
        } finally {
            rectA.setEmpty();
            wo5Var.c(rectA);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.y) {
            if (this.x == null) {
                this.x = new dd1(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.x);
        }
        if (this.z == null) {
            WeakHashMap weakHashMap = be8.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.t = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.y && this.x != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.x);
        }
        View view = this.w;
        if (view != null) {
            g(view, 0);
        }
        this.t = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.A || this.B == null) {
            return;
        }
        sk8 sk8Var = this.z;
        int iD = sk8Var != null ? sk8Var.d() : 0;
        if (iD > 0) {
            this.B.setBounds(0, 0, getWidth(), iD);
            this.B.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean zS = s(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zS;
        }
        u(true);
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        zc1 zc1Var;
        WeakHashMap weakHashMap = be8.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((zc1Var = ((cd1) view.getLayoutParams()).a) == null || !zc1Var.h(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        zc1 zc1Var;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zI;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.t();
        int childCount = coordinatorLayout.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i12);
            a07 a07Var = (a07) coordinatorLayout.n.f1141o;
            int i13 = a07Var.f278o;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) a07Var.i(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != coordinatorLayout.y) {
            boolean z3 = coordinatorLayout.t;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.x == null) {
                        coordinatorLayout.x = new dd1(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.x);
                }
                coordinatorLayout.y = true;
            } else {
                if (z3 && coordinatorLayout.x != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.x);
                }
                coordinatorLayout.y = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = be8.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.z != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.m;
        int size3 = arrayList3.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = (View) arrayList3.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size3;
                i11 = i17;
                i6 = paddingLeft;
                suggestedMinimumWidth = i18;
                z2 = false;
                i8 = paddingRight;
            } else {
                cd1 cd1Var = (cd1) view2.getLayoutParams();
                int i19 = cd1Var.e;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iM = coordinatorLayout.m(i19);
                    int i20 = cd1Var.c;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iM - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iC = coordinatorLayout.z.c() + coordinatorLayout.z.b();
                            int iA = coordinatorLayout.z.a() + coordinatorLayout.z.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        zc1Var = cd1Var.a;
                        if (zc1Var != null) {
                            z2 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i21 = iMakeMeasureSpec;
                            i11 = i17;
                            int i22 = iMakeMeasureSpec2;
                            zI = zc1Var.i(this, view2, i21, i5, i22);
                            view = view2;
                            iMakeMeasureSpec = i21;
                            i10 = i22;
                            if (zI) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cd1Var).leftMargin + ((ViewGroup.MarginLayoutParams) cd1Var).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cd1Var).topMargin + ((ViewGroup.MarginLayoutParams) cd1Var).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i6 = paddingLeft;
                            i7 = i18;
                            z2 = false;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            i10 = iMakeMeasureSpec2;
                            view = view2;
                            i11 = i17;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cd1Var).leftMargin + ((ViewGroup.MarginLayoutParams) cd1Var).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cd1Var).topMargin + ((ViewGroup.MarginLayoutParams) cd1Var).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM);
                    }
                    int i23 = size3;
                    i5 = iMax;
                    i4 = i23;
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    zc1Var = cd1Var.a;
                    if (zc1Var != null) {
                        z2 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i24 = iMakeMeasureSpec;
                        i11 = i17;
                        int i25 = iMakeMeasureSpec2;
                        zI = zc1Var.i(this, view2, i24, i5, i25);
                        view = view2;
                        iMakeMeasureSpec = i24;
                        i10 = i25;
                        if (zI) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cd1Var).leftMargin + ((ViewGroup.MarginLayoutParams) cd1Var).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cd1Var).topMargin + ((ViewGroup.MarginLayoutParams) cd1Var).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i6 = paddingLeft;
                        i7 = i18;
                        z2 = false;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        i10 = iMakeMeasureSpec2;
                        view = view2;
                        i11 = i17;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cd1Var).leftMargin + ((ViewGroup.MarginLayoutParams) cd1Var).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cd1Var).topMargin + ((ViewGroup.MarginLayoutParams) cd1Var).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i4 = size3;
                i5 = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                zc1Var = cd1Var.a;
                if (zc1Var != null) {
                    z2 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i26 = iMakeMeasureSpec;
                    i11 = i17;
                    int i27 = iMakeMeasureSpec2;
                    zI = zc1Var.i(this, view2, i26, i5, i27);
                    view = view2;
                    iMakeMeasureSpec = i26;
                    i10 = i27;
                    if (zI) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cd1Var).leftMargin + ((ViewGroup.MarginLayoutParams) cd1Var).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cd1Var).topMargin + ((ViewGroup.MarginLayoutParams) cd1Var).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i6 = paddingLeft;
                    i7 = i18;
                    z2 = false;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    i10 = iMakeMeasureSpec2;
                    view = view2;
                    i11 = i17;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cd1Var).leftMargin + ((ViewGroup.MarginLayoutParams) cd1Var).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cd1Var).topMargin + ((ViewGroup.MarginLayoutParams) cd1Var).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i17 = i11 + 1;
            paddingLeft = i6;
            paddingRight = i8;
            size3 = i4;
            arrayList3 = arrayList;
        }
        int i28 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i28), View.resolveSizeAndState(suggestedMinimumHeight, i2, i28 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                cd1 cd1Var = (cd1) childAt.getLayoutParams();
                if (cd1Var.a(0)) {
                    zc1 zc1Var = cd1Var.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        zc1 zc1Var;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                cd1 cd1Var = (cd1) childAt.getLayoutParams();
                if (cd1Var.a(0) && (zc1Var = cd1Var.a) != null) {
                    zJ |= zc1Var.j(view);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        h(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        d(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        f(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof ed1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ed1 ed1Var = (ed1) parcelable;
        super.onRestoreInstanceState(ed1Var.m);
        SparseArray sparseArray = ed1Var.f704o;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            zc1 zc1Var = n(childAt).a;
            if (id != -1 && zc1Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                zc1Var.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableO;
        ed1 ed1Var = new ed1(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            zc1 zc1Var = ((cd1) childAt.getLayoutParams()).a;
            if (id != -1 && zc1Var != null && (parcelableO = zc1Var.o(childAt)) != null) {
                sparseArray.append(id, parcelableO);
            }
        }
        ed1Var.f704o = sparseArray;
        return ed1Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return e(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        g(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zS;
        boolean zR;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.v == null) {
            zS = s(motionEvent, 1);
            if (!zS) {
                zR = false;
            }
            motionEventObtain = null;
            if (this.v == null) {
                zR |= super.onTouchEvent(motionEvent);
            } else if (zS) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zR;
            }
            u(false);
            return zR;
        }
        zS = false;
        zc1 zc1Var = ((cd1) this.v.getLayoutParams()).a;
        if (zc1Var != null) {
            zR = zc1Var.r(this, this.v, motionEvent);
        } else {
            zR = false;
        }
        motionEventObtain = null;
        if (this.v == null) {
            zR |= super.onTouchEvent(motionEvent);
        } else if (zS) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        u(false);
        return zR;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean zD;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        cd1 cd1Var;
        int i10;
        View view;
        zc1 zc1Var;
        WeakHashMap weakHashMap = be8.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.m;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i11 = 0;
        while (true) {
            wo5 wo5Var = J;
            if (i11 >= size) {
                Rect rect2 = rectA3;
                rectA.setEmpty();
                wo5Var.c(rectA);
                rectA2.setEmpty();
                wo5Var.c(rectA2);
                rect2.setEmpty();
                wo5Var.c(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            cd1 cd1Var2 = (cd1) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i12 = 0;
                while (i12 < i11) {
                    if (cd1Var2.l == ((View) arrayList2.get(i12))) {
                        cd1 cd1Var3 = (cd1) view2.getLayoutParams();
                        if (cd1Var3.k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            cd1 cd1Var4 = cd1Var2;
                            Rect rectA6 = a();
                            ie8.a(this, cd1Var3.k, rectA4);
                            j(view2, rectA5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            cd1Var = cd1Var4;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            l(layoutDirection, rectA4, rectA6, cd1Var3, measuredWidth, measuredHeight);
                            boolean z3 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            b(cd1Var3, rectA6, measuredWidth, measuredHeight);
                            int i13 = rectA6.left - rectA5.left;
                            int i14 = rectA6.top - rectA5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap2 = be8.a;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap3 = be8.a;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (zc1Var = cd1Var3.a) != null) {
                                zc1Var.d(this, view, cd1Var3.k);
                            }
                            rectA4.setEmpty();
                            wo5Var.c(rectA4);
                            rectA5.setEmpty();
                            wo5Var.c(rectA5);
                            rectA6.setEmpty();
                            wo5Var.c(rectA6);
                        } else {
                            cd1Var = cd1Var2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        cd1Var = cd1Var2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    cd1Var2 = cd1Var;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectA3 = rectA3;
                }
                ArrayList arrayList3 = arrayList2;
                cd1 cd1Var5 = cd1Var2;
                int i15 = size;
                Rect rect3 = rectA3;
                i2 = i11;
                View view4 = view2;
                j(view4, rectA2, true);
                if (cd1Var5.g != 0 && !rectA2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(cd1Var5.g, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i16 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i17 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (cd1Var5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = be8.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        cd1 cd1Var6 = (cd1) view4.getLayoutParams();
                        zc1 zc1Var2 = cd1Var6.a;
                        Rect rectA7 = a();
                        Rect rectA8 = a();
                        rectA8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (zc1Var2 == null || !zc1Var2.a(view4, rectA7)) {
                            rectA7.set(rectA8);
                        } else if (!rectA8.contains(rectA7)) {
                            h2.j("Rect should be within the child's bounds. Rect:", rectA7.toShortString(), " | Bounds:", rectA8.toShortString());
                            return;
                        }
                        rectA8.setEmpty();
                        wo5Var.c(rectA8);
                        if (rectA7.isEmpty()) {
                            rectA7.setEmpty();
                            wo5Var.c(rectA7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(cd1Var6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectA7.top - ((ViewGroup.MarginLayoutParams) cd1Var6).topMargin) - cd1Var6.j) >= (i9 = rectA.top)) {
                                z = false;
                            } else {
                                w(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) cd1Var6).bottomMargin) + cd1Var6.j) < (i7 = rectA.bottom)) {
                                w(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                w(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectA7.left - ((ViewGroup.MarginLayoutParams) cd1Var6).leftMargin) - cd1Var6.i) >= (i6 = rectA.left)) {
                                z2 = false;
                            } else {
                                v(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) cd1Var6).rightMargin) + cd1Var6.i) < (i4 = rectA.right)) {
                                v(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                v(view4, 0);
                            }
                            rectA7.setEmpty();
                            wo5Var.c(rectA7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((cd1) view4.getLayoutParams()).p);
                    if (rect.equals(rectA2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((cd1) view4.getLayoutParams()).p.set(rectA2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i18);
                    cd1 cd1Var7 = (cd1) view5.getLayoutParams();
                    zc1 zc1Var3 = cd1Var7.a;
                    if (zc1Var3 != null && zc1Var3.b(view5, view4)) {
                        if (i == 0 && cd1Var7.f515o) {
                            cd1Var7.f515o = false;
                        } else {
                            if (i != 2) {
                                zD = zc1Var3.d(this, view5, view4);
                            } else {
                                zc1Var3.e(this, view4);
                                zD = true;
                            }
                            if (i == 1) {
                                cd1Var7.f515o = zD;
                            }
                        }
                    }
                    i18++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                rect = rectA3;
                i2 = i11;
            }
            i11 = i2 + 1;
            rectA3 = rect;
            size = i3;
            arrayList2 = arrayList;
        }
    }

    public final void q(View view, int i) {
        int i2;
        cd1 cd1Var = (cd1) view.getLayoutParams();
        View view2 = cd1Var.k;
        if (view2 == null && cd1Var.f != -1) {
            hk0.l("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        wo5 wo5Var = J;
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                ie8.a(this, view2, rectA);
                cd1 cd1Var2 = (cd1) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, rectA, rectA2, cd1Var2, measuredWidth, measuredHeight);
                b(cd1Var2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                wo5Var.c(rectA);
                rectA2.setEmpty();
                wo5Var.c(rectA2);
            }
        }
        int i3 = cd1Var.e;
        if (i3 < 0) {
            cd1 cd1Var3 = (cd1) view.getLayoutParams();
            Rect rectA3 = a();
            rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cd1Var3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) cd1Var3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cd1Var3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) cd1Var3).bottomMargin);
            if (this.z != null) {
                WeakHashMap weakHashMap = be8.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA3.left = this.z.b() + rectA3.left;
                    rectA3.top = this.z.d() + rectA3.top;
                    rectA3.right -= this.z.c();
                    rectA3.bottom -= this.z.a();
                }
            }
            Rect rectA4 = a();
            int i4 = cd1Var3.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i);
            view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
            rectA3.setEmpty();
            wo5Var.c(rectA3);
            rectA4.setEmpty();
            wo5Var.c(rectA4);
            return;
        }
        cd1 cd1Var4 = (cd1) view.getLayoutParams();
        int i5 = cd1Var4.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM = m(i3) - measuredWidth2;
        if (i6 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cd1Var4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) cd1Var4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cd1Var4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) cd1Var4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final void r(int i, int i2, int i3, View view) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        zc1 zc1Var = ((cd1) view.getLayoutParams()).a;
        if (zc1Var == null || !zc1Var.m(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.s) {
            return;
        }
        u(false);
        this.s = true;
    }

    public final boolean s(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f16o;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        gj2 gj2Var = I;
        if (gj2Var != null) {
            Collections.sort(arrayList, gj2Var);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zG = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            zc1 zc1Var = ((cd1) view.getLayoutParams()).a;
            if (zG && actionMasked != 0) {
                if (zc1Var != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        zc1Var.g(this, view, motionEventObtain);
                    } else if (i == 1) {
                        zc1Var.r(this, view, motionEventObtain);
                    }
                }
            } else if (!zG && zc1Var != null) {
                if (i == 0) {
                    zG = zc1Var.g(this, view, motionEvent);
                } else if (i == 1) {
                    zG = zc1Var.r(this, view, motionEvent);
                }
                if (zG) {
                    this.v = view;
                }
            }
        }
        arrayList.clear();
        return zG;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.C = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.B = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.B.setState(getDrawableState());
                }
                Drawable drawable3 = this.B;
                WeakHashMap weakHashMap = be8.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.B.setVisible(getVisibility() == 0, false);
                this.B.setCallback(this);
            }
            WeakHashMap weakHashMap2 = be8.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.B;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.B.setVisible(z, false);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void t() {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    public final void u(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            zc1 zc1Var = ((cd1) childAt.getLayoutParams()).a;
            if (zc1Var != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    zc1Var.g(this, childAt, motionEventObtain);
                } else {
                    zc1Var.r(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((cd1) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.v = null;
        this.s = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B;
    }

    public final void x() {
        WeakHashMap weakHashMap = be8.a;
        if (!getFitsSystemWindows()) {
            sd8.c(this, null);
            return;
        }
        xc0 xc0Var = this.D;
        if (xc0Var == null) {
            xc0Var = new xc0((Object) this, (byte) 23);
            this.D = xc0Var;
        }
        sd8.c(this, xc0Var);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new cd1(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
