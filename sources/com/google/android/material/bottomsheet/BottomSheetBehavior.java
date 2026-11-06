package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.u0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import o.a4;
import o.be8;
import o.cd1;
import o.fe8;
import o.fx3;
import o.hk0;
import o.hz5;
import o.it8;
import o.j90;
import o.k90;
import o.l90;
import o.m90;
import o.nd;
import o.o3;
import o.p3;
import o.qn4;
import o.qt;
import o.qw6;
import o.rr;
import o.x67;
import o.xo1;
import o.zc1;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends zc1 {
    public int A;
    public final float B;
    public boolean C;
    public boolean D;
    public final boolean E;
    public int F;
    public fe8 G;
    public boolean H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public WeakReference N;
    public WeakReference O;
    public final ArrayList P;
    public VelocityTracker Q;
    public int R;
    public int S;
    public boolean T;
    public HashMap U;
    public int V;
    public final j90 W;
    public final int a;
    public boolean b;
    public final float c;
    public int d;
    public boolean e;
    public int f;
    public final int g;
    public final boolean h;
    public qn4 i;
    public final int j;
    public int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f41o;
    public final boolean p;
    public int q;
    public int r;
    public qw6 s;
    public boolean t;
    public m90 u;
    public final ValueAnimator v;
    public final int w;
    public int x;
    public int y;
    public final float z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.a = 0;
        byte b = 1;
        this.b = true;
        this.j = -1;
        this.u = null;
        this.z = 0.5f;
        this.B = -1.0f;
        this.E = true;
        this.F = 4;
        this.P = new ArrayList();
        this.V = -1;
        this.W = new j90(this);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hz5.e);
        this.h = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(2);
        if (zHasValue) {
            u(context, attributeSet, zHasValue, xo1.O(context, typedArrayObtainStyledAttributes, 2));
        } else {
            u(context, attributeSet, zHasValue, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.v.addUpdateListener(new rr(this, b));
        this.B = typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(8);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            A(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1));
        } else {
            A(i);
        }
        z(typedArrayObtainStyledAttributes.getBoolean(7, false));
        this.l = typedArrayObtainStyledAttributes.getBoolean(11, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(5, true);
        if (this.b != z) {
            this.b = z;
            if (this.N != null) {
                s();
            }
            C((this.b && this.F == 6) ? 3 : this.F);
            G();
        }
        this.D = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.E = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.a = typedArrayObtainStyledAttributes.getInt(9, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(6, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            hk0.g("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.z = f;
        if (this.N != null) {
            this.y = (int) ((1.0f - f) * this.M);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(4);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
            if (dimensionPixelOffset < 0) {
                hk0.g("offset must be greater than or equal to 0");
                throw null;
            }
            this.w = dimensionPixelOffset;
        } else {
            int i2 = typedValuePeekValue2.data;
            if (i2 < 0) {
                hk0.g("offset must be greater than or equal to 0");
                throw null;
            }
            this.w = i2;
        }
        this.m = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f41o = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(15, true);
        typedArrayObtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View w(View view) {
        WeakHashMap weakHashMap = be8.a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewW = w(viewGroup.getChildAt(i));
            if (viewW != null) {
                return viewW;
            }
        }
        return null;
    }

    public static BottomSheetBehavior x(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof cd1)) {
            hk0.g("The view is not a child of CoordinatorLayout");
            return null;
        }
        zc1 zc1Var = ((cd1) layoutParams).a;
        if (zc1Var instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) zc1Var;
        }
        hk0.g("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public final void A(int i) {
        boolean z = this.e;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.e = true;
            }
        } else {
            if (!z && this.d == i) {
                return;
            }
            this.e = false;
            this.d = Math.max(0, i);
        }
        J();
    }

    public final void B(int i) {
        if (i == this.F) {
            return;
        }
        if (this.N == null) {
            if (i == 4 || i == 3 || i == 6 || (this.C && i == 5)) {
                this.F = i;
                return;
            }
            return;
        }
        View view = (View) this.N.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = be8.a;
            if (view.isAttachedToWindow()) {
                view.post(new qt((byte) 2, i, this, view));
                return;
            }
        }
        D(view, i);
    }

    public final void C(int i) {
        View view;
        if (this.F == i) {
            return;
        }
        this.F = i;
        WeakReference weakReference = this.N;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            I(true);
        } else if (i == 6 || i == 5 || i == 4) {
            I(false);
        }
        H(i);
        while (true) {
            ArrayList arrayList = this.P;
            if (i2 >= arrayList.size()) {
                G();
                return;
            } else {
                ((k90) arrayList.get(i2)).b(view, i);
                i2++;
            }
        }
    }

    public final void D(View view, int i) {
        int iY;
        int i2;
        if (i == 4) {
            iY = this.A;
        } else if (i == 6) {
            iY = this.y;
            if (this.b && iY <= (i2 = this.x)) {
                i = 3;
                iY = i2;
            }
        } else if (i == 3) {
            iY = y();
        } else {
            if (!this.C || i != 5) {
                hk0.g(fx3.e(i, "Illegal state argument: "));
                return;
            }
            iY = this.M;
        }
        F(view, i, iY, false);
    }

    public final boolean E(View view, float f) {
        if (this.D) {
            return true;
        }
        if (view.getTop() < this.A) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.A)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r5 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        C(2);
        H(r4);
        r5 = r2.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r5 = new o.m90(r2, r3, r4);
        r2.u = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r5.n != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r5.f1448o = r4;
        r4 = o.be8.a;
        r3.postOnAnimation(r5);
        r2.u.n = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r5.f1448o = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r0.o(r3.getLeft(), r5) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(android.view.View r3, int r4, int r5, boolean r6) {
        /*
            r2 = this;
            o.fe8 r0 = r2.G
            if (r0 == 0) goto L54
            if (r6 == 0) goto L11
            int r6 = r3.getLeft()
            boolean r5 = r0.o(r6, r5)
            if (r5 == 0) goto L54
            goto L2e
        L11:
            int r6 = r3.getLeft()
            r0.r = r3
            r1 = -1
            r0.c = r1
            r1 = 0
            boolean r5 = r0.h(r6, r5, r1, r1)
            if (r5 != 0) goto L2c
            byte r6 = r0.a
            if (r6 != 0) goto L2c
            android.view.View r6 = r0.r
            if (r6 == 0) goto L2c
            r6 = 0
            r0.r = r6
        L2c:
            if (r5 == 0) goto L54
        L2e:
            r5 = 2
            r2.C(r5)
            r2.H(r4)
            o.m90 r5 = r2.u
            if (r5 != 0) goto L40
            o.m90 r5 = new o.m90
            r5.<init>(r2, r3, r4)
            r2.u = r5
        L40:
            boolean r6 = r5.n
            if (r6 != 0) goto L51
            r5.f1448o = r4
            java.util.WeakHashMap r4 = o.be8.a
            r3.postOnAnimation(r5)
            o.m90 r2 = r2.u
            r3 = 1
            r2.n = r3
            return
        L51:
            r5.f1448o = r4
            return
        L54:
            r2.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.F(android.view.View, int, int, boolean):void");
    }

    public final void G() {
        View view;
        int iA;
        WeakReference weakReference = this.N;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        be8.j(view, 524288);
        be8.h(view, 0);
        be8.j(view, 262144);
        be8.h(view, 0);
        be8.j(view, 1048576);
        be8.h(view, 0);
        int i = this.V;
        if (i != -1) {
            be8.j(view, i);
            be8.h(view, 0);
        }
        byte b = 3;
        int i2 = 6;
        if (!this.b && this.F != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            nd ndVar = new nd(b, i2, this);
            ArrayList arrayListF = be8.f(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListF.size()) {
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        int[] iArr = be8.d;
                        if (i4 >= 32 || i5 != -1) {
                            break;
                        }
                        int i6 = iArr[i4];
                        boolean z = true;
                        for (int i7 = 0; i7 < arrayListF.size(); i7++) {
                            z &= ((a4) arrayListF.get(i7)).a() != i6;
                        }
                        if (z) {
                            i5 = i6;
                        }
                        i4++;
                    }
                    iA = i5;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((a4) arrayListF.get(i3)).a).getLabel())) {
                    iA = ((a4) arrayListF.get(i3)).a();
                    break;
                }
                i3++;
            }
            if (iA != -1) {
                a4 a4Var = new a4(null, iA, string, ndVar, null);
                View.AccessibilityDelegate accessibilityDelegateE = be8.e(view);
                p3 p3Var = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof o3 ? ((o3) accessibilityDelegateE).a : new p3(accessibilityDelegateE);
                if (p3Var == null) {
                    p3Var = new p3();
                }
                be8.m(view, p3Var);
                be8.j(view, a4Var.a());
                be8.f(view).add(a4Var);
                be8.h(view, 0);
            }
            this.V = iA;
        }
        if (this.C) {
            int i8 = 5;
            if (this.F != 5) {
                be8.k(view, a4.l, new nd(b, i8, this));
            }
        }
        int i9 = this.F;
        int i10 = 4;
        if (i9 == 3) {
            be8.k(view, a4.k, new nd(b, this.b ? 4 : 6, this));
            return;
        }
        if (i9 == 4) {
            be8.k(view, a4.j, new nd(b, this.b ? 3 : 6, this));
        } else {
            if (i9 != 6) {
                return;
            }
            be8.k(view, a4.k, new nd(b, i10, this));
            be8.k(view, a4.j, new nd(b, b, this));
        }
    }

    public final void H(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.t != z) {
            this.t = z;
            if (this.i == null || (valueAnimator = this.v) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            valueAnimator.setFloatValues(1.0f - f, f);
            valueAnimator.start();
        }
    }

    public final void I(boolean z) {
        WeakReference weakReference = this.N;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.U != null) {
                    return;
                } else {
                    this.U = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.N.get() && z) {
                    this.U.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.U = null;
        }
    }

    public final void J() {
        View view;
        if (this.N != null) {
            s();
            if (this.F != 4 || (view = (View) this.N.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // o.zc1
    public final void c(cd1 cd1Var) {
        this.N = null;
        this.G = null;
    }

    @Override // o.zc1
    public final void f() {
        this.N = null;
        this.G = null;
    }

    @Override // o.zc1
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        fe8 fe8Var;
        if (!view.isShown() || !this.E) {
            this.H = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.R = -1;
            VelocityTracker velocityTracker = this.Q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Q = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.Q;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.Q = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.S = (int) motionEvent.getY();
            if (this.F != 2) {
                WeakReference weakReference = this.O;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x, this.S)) {
                    this.R = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.T = true;
                }
            }
            this.H = this.R == -1 && !coordinatorLayout.o(view, x, this.S);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.T = false;
            this.R = -1;
            if (this.H) {
                this.H = false;
                return false;
            }
        }
        if (this.H || (fe8Var = this.G) == null || !fe8Var.p(motionEvent)) {
            WeakReference weakReference2 = this.O;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.H || this.F == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.G == null || Math.abs(this.S - motionEvent.getY()) <= this.G.b) {
                return false;
            }
        }
        return true;
    }

    @Override // o.zc1
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        qn4 qn4Var;
        WeakHashMap weakHashMap = be8.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        byte b = 2;
        if (this.N == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.l || this.e) ? false : true;
            if (this.m || this.n || this.f41o || z) {
                x67.j(view, new u0(b, this, z));
            }
            this.N = new WeakReference(view);
            if (this.h && (qn4Var = this.i) != null) {
                view.setBackground(qn4Var);
            }
            qn4 qn4Var2 = this.i;
            if (qn4Var2 != null) {
                float elevation = this.B;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                qn4Var2.k(elevation);
                boolean z2 = this.F == 3;
                this.t = z2;
                this.i.m(z2 ? 0.0f : 1.0f);
            }
            G();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            int measuredWidth = view.getMeasuredWidth();
            int i2 = this.j;
            if (measuredWidth > i2 && i2 != -1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = i2;
                view.post(new it8((Object) view, (Object) layoutParams, (byte) 7));
            }
        }
        if (this.G == null) {
            this.G = new fe8(coordinatorLayout.getContext(), coordinatorLayout, this.W);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.L = coordinatorLayout.getWidth();
        this.M = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.K = height;
        int i3 = this.M;
        int i4 = i3 - height;
        int i5 = this.r;
        if (i4 < i5) {
            if (this.p) {
                this.K = i3;
                height = i3;
            } else {
                height = i3 - i5;
                this.K = height;
            }
        }
        this.x = Math.max(0, i3 - height);
        this.y = (int) ((1.0f - this.z) * this.M);
        s();
        int i6 = this.F;
        if (i6 == 3) {
            view.offsetTopAndBottom(y());
        } else if (i6 == 6) {
            view.offsetTopAndBottom(this.y);
        } else if (this.C && i6 == 5) {
            view.offsetTopAndBottom(this.M);
        } else if (i6 == 4) {
            view.offsetTopAndBottom(this.A);
        } else if (i6 == 1 || i6 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        this.O = new WeakReference(w(view));
        return true;
    }

    @Override // o.zc1
    public final boolean j(View view) {
        WeakReference weakReference = this.O;
        return (weakReference == null || view != weakReference.get() || this.F == 3) ? false : true;
    }

    @Override // o.zc1
    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.O;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.E;
        if (i2 > 0) {
            if (i4 < y()) {
                int iY = top - y();
                iArr[1] = iY;
                int i5 = -iY;
                WeakHashMap weakHashMap = be8.a;
                view.offsetTopAndBottom(i5);
                C(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = be8.a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.A;
            if (i4 > i6 && !this.C) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = be8.a;
                view.offsetTopAndBottom(i8);
                C(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = be8.a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        }
        v(view.getTop());
        this.I = i2;
        this.J = true;
    }

    @Override // o.zc1
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // o.zc1
    public final void n(View view, Parcelable parcelable) {
        l90 l90Var = (l90) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.d = l90Var.p;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = l90Var.q;
            }
            if (i == -1 || (i & 4) == 4) {
                this.C = l90Var.r;
            }
            if (i == -1 || (i & 8) == 8) {
                this.D = l90Var.s;
            }
        }
        int i2 = l90Var.f1343o;
        if (i2 == 1 || i2 == 2) {
            this.F = 4;
        } else {
            this.F = i2;
        }
    }

    @Override // o.zc1
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new l90(this);
    }

    @Override // o.zc1
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.I = 0;
        this.J = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    @Override // o.zc1
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int iY;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == y()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.O;
        if (weakReference != null && view2 == weakReference.get() && this.J) {
            if (this.I > 0) {
                if (this.b) {
                    iY = this.x;
                } else {
                    int top3 = view.getTop();
                    int i4 = this.y;
                    if (top3 > i4) {
                        i3 = 6;
                        iY = i4;
                    } else {
                        iY = y();
                    }
                }
            } else if (this.C) {
                VelocityTracker velocityTracker = this.Q;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.Q.getYVelocity(this.R);
                }
                if (E(view, yVelocity)) {
                    iY = this.M;
                    i3 = 5;
                } else if (this.I == 0) {
                    top2 = view.getTop();
                    if (this.b) {
                        i2 = this.y;
                        if (top2 < i2) {
                            if (top2 < Math.abs(top2 - this.A)) {
                                iY = y();
                            } else {
                                iY = this.y;
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.A)) {
                            iY = this.y;
                        } else {
                            iY = this.A;
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.x) < Math.abs(top2 - this.A)) {
                        iY = this.x;
                    } else {
                        iY = this.A;
                        i3 = 4;
                    }
                } else {
                    if (this.b) {
                        iY = this.A;
                    } else {
                        top = view.getTop();
                        if (Math.abs(top - this.y) < Math.abs(top - this.A)) {
                            iY = this.y;
                            i3 = 6;
                        } else {
                            iY = this.A;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.I == 0) {
                top2 = view.getTop();
                if (this.b) {
                    i2 = this.y;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - this.A)) {
                            iY = y();
                        } else {
                            iY = this.y;
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.A)) {
                        iY = this.y;
                    } else {
                        iY = this.A;
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.x) < Math.abs(top2 - this.A)) {
                    iY = this.x;
                } else {
                    iY = this.A;
                    i3 = 4;
                }
            } else {
                if (this.b) {
                    iY = this.A;
                } else {
                    top = view.getTop();
                    if (Math.abs(top - this.y) < Math.abs(top - this.A)) {
                        iY = this.y;
                        i3 = 6;
                    } else {
                        iY = this.A;
                    }
                }
                i3 = 4;
            }
            F(view, i3, iY, false);
            this.J = false;
        }
    }

    @Override // o.zc1
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.F == 1 && actionMasked == 0) {
            return true;
        }
        fe8 fe8Var = this.G;
        if (fe8Var != null) {
            fe8Var.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.R = -1;
            VelocityTracker velocityTracker = this.Q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Q = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.Q;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.Q = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (this.G != null && actionMasked == 2 && !this.H) {
            float fAbs = Math.abs(this.S - motionEvent.getY());
            fe8 fe8Var2 = this.G;
            if (fAbs > fe8Var2.b) {
                fe8Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.H;
    }

    public final void s() {
        int iT = t();
        boolean z = this.b;
        int i = this.M;
        if (z) {
            this.A = Math.max(i - iT, this.x);
        } else {
            this.A = i - iT;
        }
    }

    public final int t() {
        int iMin;
        int i;
        int i2;
        if (this.e) {
            iMin = Math.min(Math.max(this.f, this.M - ((this.L * 9) / 16)), this.K);
            i = this.q;
        } else {
            if (!this.l && !this.m && (i2 = this.k) > 0) {
                return Math.max(this.d, i2 + this.g);
            }
            iMin = this.d;
            i = this.q;
        }
        return iMin + i;
    }

    public final void u(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.h) {
            this.s = qw6.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
            qn4 qn4Var = new qn4(this.s);
            this.i = qn4Var;
            qn4Var.i(context);
            if (z && colorStateList != null) {
                this.i.l(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.i.setTint(typedValue.data);
        }
    }

    public final void v(int i) {
        View view = (View) this.N.get();
        if (view != null) {
            ArrayList arrayList = this.P;
            if (arrayList.isEmpty()) {
                return;
            }
            if (i <= this.A) {
                y();
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((k90) arrayList.get(i2)).a(view);
            }
        }
    }

    public final int y() {
        if (this.b) {
            return this.x;
        }
        return Math.max(this.w, this.p ? 0 : this.r);
    }

    public final void z(boolean z) {
        if (this.C != z) {
            this.C = z;
            if (!z && this.F == 5) {
                B(4);
            }
            G();
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.u = null;
        this.z = 0.5f;
        this.B = -1.0f;
        this.E = true;
        this.F = 4;
        this.P = new ArrayList();
        this.V = -1;
        this.W = new j90(this);
    }
}
