package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import io.sentry.android.core.v0;
import java.util.WeakHashMap;
import o.ah7;
import o.be8;
import o.bh7;
import o.ch7;
import o.dh7;
import o.f25;
import o.g25;
import o.h25;
import o.i25;
import o.lf1;
import o.nr0;
import o.tr0;
import o.ur0;
import o.wu6;
import o.yg7;
import o.yz5;
import o.zg7;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements i25, h25, f25 {
    public static final int[] W = {R.attr.enabled};
    public float A;
    public float B;
    public boolean C;
    public int D;
    public final DecelerateInterpolator E;
    public final nr0 F;
    public int G;
    public int H;
    public final int I;
    public final int J;
    public int K;
    public final ur0 L;
    public zg7 M;
    public zg7 N;
    public ah7 O;
    public ah7 P;
    public boolean Q;
    public int R;
    public boolean S;
    public final yg7 T;
    public final zg7 U;
    public final zg7 V;
    public View m;
    public ch7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26o;
    public final int p;
    public float q;
    public float r;
    public final lf1 s;
    public final g25 t;
    public final int[] u;
    public final int[] v;
    public final int[] w;
    public boolean x;
    public final int y;
    public int z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26o = false;
        this.q = -1.0f;
        this.u = new int[2];
        this.v = new int[2];
        this.w = new int[2];
        this.D = -1;
        this.G = -1;
        this.T = new yg7(this, (byte) 0);
        this.U = new zg7(this, (byte) 2);
        this.V = new zg7(this, (byte) 3);
        this.p = ViewConfiguration.get(context).getScaledTouchSlop();
        this.y = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.E = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.R = (int) (displayMetrics.density * 40.0f);
        nr0 nr0Var = new nr0(getContext());
        float f = nr0Var.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = nr0Var.getContext().obtainStyledAttributes(yz5.a);
        nr0Var.n = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = be8.a;
        nr0Var.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(nr0Var.n);
        nr0Var.setBackground(shapeDrawable);
        this.F = nr0Var;
        ur0 ur0Var = new ur0(getContext());
        this.L = ur0Var;
        ur0Var.c(1);
        this.F.setImageDrawable(this.L);
        this.F.setVisibility(8);
        addView(this.F);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.J = i;
        this.q = i;
        this.s = new lf1((byte) 4);
        this.t = new g25(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.R;
        this.z = i2;
        this.I = i2;
        k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, W);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.F.getBackground().setAlpha(i);
        this.L.setAlpha(i);
    }

    public final boolean a() {
        View view = this.m;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.m == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.F)) {
                    this.m = childAt;
                    return;
                }
            }
        }
    }

    @Override // o.i25
    public final void c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.t.d(i, i2, i3, i4, this.v, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? this.v[1] + i4 : i7;
        if (i8 >= 0 || a()) {
            return;
        }
        float fAbs = this.r + Math.abs(i8);
        this.r = fAbs;
        j(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // o.h25
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        c(view, i, i2, i3, i4, i5, this.w);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        n(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.t.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.t.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.t.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.t.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // o.h25
    public final boolean e(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // o.h25
    public final void f(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // o.h25
    public final void g(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.G;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        lf1 lf1Var = this.s;
        return lf1Var.c | lf1Var.b;
    }

    public int getProgressCircleDiameter() {
        return this.R;
    }

    public int getProgressViewEndOffset() {
        return this.J;
    }

    public int getProgressViewStartOffset() {
        return this.I;
    }

    @Override // o.h25
    public final void h(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.t.f(0);
    }

    public final void i(float f) {
        if (f > this.q) {
            m(true, true);
            return;
        }
        this.f26o = false;
        ur0 ur0Var = this.L;
        tr0 tr0Var = ur0Var.m;
        tr0Var.e = 0.0f;
        tr0Var.f = 0.0f;
        ur0Var.invalidateSelf();
        yg7 yg7Var = new yg7(this, (byte) 1);
        this.H = this.z;
        zg7 zg7Var = this.V;
        zg7Var.reset();
        zg7Var.setDuration(200L);
        zg7Var.setInterpolator(this.E);
        nr0 nr0Var = this.F;
        nr0Var.m = yg7Var;
        nr0Var.clearAnimation();
        nr0Var.startAnimation(zg7Var);
        tr0 tr0Var2 = ur0Var.m;
        if (tr0Var2.n) {
            tr0Var2.n = false;
        }
        ur0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.t.d;
    }

    public final void j(float f) {
        ah7 ah7Var;
        ah7 ah7Var2;
        ur0 ur0Var = this.L;
        tr0 tr0Var = ur0Var.m;
        if (!tr0Var.n) {
            tr0Var.n = true;
        }
        ur0Var.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.q));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.q;
        int i = this.K;
        if (i <= 0) {
            i = this.J;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.I + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        nr0 nr0Var = this.F;
        if (nr0Var.getVisibility() != 0) {
            nr0Var.setVisibility(0);
        }
        nr0Var.setScaleX(1.0f);
        nr0Var.setScaleY(1.0f);
        if (f < this.q) {
            if (ur0Var.m.t > 76 && ((ah7Var2 = this.O) == null || !ah7Var2.hasStarted() || ah7Var2.hasEnded())) {
                ah7 ah7Var3 = new ah7(this, ur0Var.m.t, 76);
                ah7Var3.setDuration(300L);
                nr0Var.m = null;
                nr0Var.clearAnimation();
                nr0Var.startAnimation(ah7Var3);
                this.O = ah7Var3;
            }
        } else if (ur0Var.m.t < 255 && ((ah7Var = this.P) == null || !ah7Var.hasStarted() || ah7Var.hasEnded())) {
            ah7 ah7Var4 = new ah7(this, ur0Var.m.t, 255);
            ah7Var4.setDuration(300L);
            nr0Var.m = null;
            nr0Var.clearAnimation();
            nr0Var.startAnimation(ah7Var4);
            this.P = ah7Var4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        tr0 tr0Var2 = ur0Var.m;
        tr0Var2.e = 0.0f;
        tr0Var2.f = fMin2;
        ur0Var.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        tr0 tr0Var3 = ur0Var.m;
        if (fMin3 != tr0Var3.p) {
            tr0Var3.p = fMin3;
        }
        ur0Var.invalidateSelf();
        ur0Var.m.g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        ur0Var.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.z);
    }

    public final void k(float f) {
        int i = this.H;
        setTargetOffsetTopAndBottom((i + ((int) ((this.I - i) * f))) - this.F.getTop());
    }

    public final void l() {
        this.F.clearAnimation();
        this.L.stop();
        this.F.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.I - this.z);
        this.z = this.F.getTop();
    }

    public final void m(boolean z, boolean z2) {
        if (this.f26o != z) {
            this.Q = z2;
            b();
            this.f26o = z;
            nr0 nr0Var = this.F;
            yg7 yg7Var = this.T;
            if (!z) {
                zg7 zg7Var = new zg7(this, (byte) 1);
                this.N = zg7Var;
                zg7Var.setDuration(150L);
                nr0Var.m = yg7Var;
                nr0Var.clearAnimation();
                nr0Var.startAnimation(this.N);
                return;
            }
            this.H = this.z;
            zg7 zg7Var2 = this.U;
            zg7Var2.reset();
            zg7Var2.setDuration(200L);
            zg7Var2.setInterpolator(this.E);
            if (yg7Var != null) {
                nr0Var.m = yg7Var;
            }
            nr0Var.clearAnimation();
            nr0Var.startAnimation(zg7Var2);
        }
    }

    public final void n(boolean z, boolean z2) {
        if (!z || this.f26o == z) {
            m(z, false);
            return;
        }
        this.f26o = z;
        setTargetOffsetTopAndBottom((this.J + this.I) - this.z);
        this.Q = z2;
        nr0 nr0Var = this.F;
        nr0Var.setVisibility(0);
        this.L.setAlpha(255);
        zg7 zg7Var = new zg7(this, (byte) 0);
        this.M = zg7Var;
        zg7Var.setDuration(this.y);
        yg7 yg7Var = this.T;
        if (yg7Var != null) {
            nr0Var.m = yg7Var;
        }
        nr0Var.clearAnimation();
        nr0Var.startAnimation(this.M);
    }

    public final void o(float f) {
        float f2 = this.B;
        float f3 = f - f2;
        float f4 = this.p;
        if (f3 <= f4 || this.C) {
            return;
        }
        this.A = f2 + f4;
        this.C = true;
        this.L.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f26o && !this.x) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.C = false;
                    this.D = -1;
                } else if (actionMasked == 2) {
                    int i = this.D;
                    if (i == -1) {
                        v0.c("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex >= 0) {
                        o(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.C = false;
                    this.D = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.D) {
                        this.D = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.C;
            }
            setTargetOffsetTopAndBottom(this.I - this.F.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.D = pointerId;
            this.C = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.B = motionEvent.getY(iFindPointerIndex2);
                return this.C;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.m == null) {
            b();
        }
        View view = this.m;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.F.getMeasuredWidth();
        int measuredHeight2 = this.F.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.z;
        this.F.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m == null) {
            b();
        }
        View view = this.m;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.F.measure(View.MeasureSpec.makeMeasureSpec(this.R, 1073741824), View.MeasureSpec.makeMeasureSpec(this.R, 1073741824));
        this.G = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.F) {
                this.G = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.t.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.t.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.r;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.r = 0.0f;
                } else {
                    f2 = f - f3;
                    this.r = f2;
                    iArr[1] = i2;
                }
                j(f2);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.u;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        c(view, i, i2, i3, i4, 0, this.w);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.s.b = i;
        startNestedScroll(i & 2);
        this.r = 0.0f;
        this.x = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        dh7 dh7Var = (dh7) parcelable;
        super.onRestoreInstanceState(dh7Var.getSuperState());
        setRefreshing(dh7Var.m);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new dh7(super.onSaveInstanceState(), this.f26o);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f26o || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.s.b = 0;
        this.x = false;
        float f = this.r;
        if (f > 0.0f) {
            i(f);
            this.r = 0.0f;
        } else {
            post(new wu6(this, (byte) 2));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f26o && !this.x) {
            if (actionMasked == 0) {
                this.D = motionEvent.getPointerId(0);
                this.C = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.D);
                if (iFindPointerIndex < 0) {
                    v0.c("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.C) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.A) * 0.5f;
                    this.C = false;
                    i(y);
                }
                this.D = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.D);
                if (iFindPointerIndex2 < 0) {
                    v0.c("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                o(y2);
                if (this.C) {
                    float f = (y2 - this.A) * 0.5f;
                    if (f > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        j(f);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.D) {
                            this.D = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    v0.c("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.D = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.S && (view = this.m) != null) {
            WeakHashMap weakHashMap = be8.a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.F.setScaleX(f);
        this.F.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        ur0 ur0Var = this.L;
        tr0 tr0Var = ur0Var.m;
        tr0Var.i = iArr;
        tr0Var.a(0);
        tr0Var.a(0);
        ur0Var.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.q = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.S = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        g25 g25Var = this.t;
        if (g25Var.d) {
            ViewGroup viewGroup = g25Var.c;
            WeakHashMap weakHashMap = be8.a;
            viewGroup.stopNestedScroll();
        }
        g25Var.d = z;
    }

    public void setOnChildScrollUpCallback(bh7 bh7Var) {
    }

    public void setOnRefreshListener(ch7 ch7Var) {
        this.n = ch7Var;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.F.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        n(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.R = (int) (displayMetrics.density * 56.0f);
            } else {
                this.R = (int) (displayMetrics.density * 40.0f);
            }
            this.F.setImageDrawable(null);
            this.L.c(i);
            this.F.setImageDrawable(this.L);
        }
    }

    public void setSlingshotDistance(int i) {
        this.K = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        nr0 nr0Var = this.F;
        nr0Var.bringToFront();
        WeakHashMap weakHashMap = be8.a;
        nr0Var.offsetTopAndBottom(i);
        this.z = nr0Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.t.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.t.h(0);
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }
}
