package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class xl extends ViewGroup implements i25, mz0, oc5, f75 {
    public static final t2 M = new t2((byte) 25);
    public long A;
    public sk8 B;
    public Function1 C;
    public final sl D;
    public final sl E;
    public Function1 F;
    public final int[] G;
    public int H;
    public int I;
    public final lf1 J;
    public boolean K;
    public final LayoutNode L;
    public final x15 m;
    public final View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Owner f2529o;
    public Function0 p;
    public boolean q;
    public Function0 r;
    public Function0 s;
    public fs4 t;
    public Function1 u;
    public in1 v;
    public Function1 w;
    public LifecycleOwner x;
    public ai6 y;
    public final int[] z;

    public xl(Context context, sx2 sx2Var, int i, x15 x15Var, View view, Owner owner) {
        super(context);
        this.m = x15Var;
        this.n = view;
        this.f2529o = owner;
        jx4 jx4Var = kl8.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, sx2Var);
        byte b = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        ge8 ge8Var = (ge8) this;
        tl tlVar = new tl(ge8Var, b);
        WeakHashMap weakHashMap = be8.a;
        xj8.a(this, tlVar);
        sd8.c(this, this);
        this.p = new e5((byte) 17);
        this.r = new e5((byte) 18);
        this.s = new e5((byte) 19);
        this.t = cs4.b;
        this.v = mo8.b();
        this.z = new int[2];
        this.A = 0L;
        this.D = new sl(ge8Var, b);
        byte b2 = 1;
        this.E = new sl(ge8Var, b2);
        this.G = new int[2];
        this.H = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        this.J = new lf1((byte) 4);
        LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.B = ge8Var;
        fs4 fs4VarA = cp6.a(im3.T(j51.a, x15Var), true, new t2((byte) 24));
        qn5 qn5Var = new qn5();
        qn5Var.b = new rl(ge8Var, (byte) 2);
        h16 h16Var = new h16();
        h16 h16Var2 = qn5Var.c;
        if (h16Var2 != null) {
            h16Var2.n = null;
        }
        qn5Var.c = h16Var;
        h16Var.n = qn5Var;
        setOnRequestDisallowInterceptTouchEvent$ui(h16Var);
        fs4 fs4VarF = db8.r0(j51.B(fs4VarA.f(qn5Var), new m5(ge8Var, layoutNode, ge8Var, b2)), new ql(ge8Var, layoutNode, b)).f(new bb0(new rl(ge8Var, b)));
        layoutNode.C0(this.t.f(fs4VarF));
        this.u = new g0(layoutNode, fs4VarF, (byte) 9);
        layoutNode.y0(this.v);
        this.w = new q0(layoutNode, (byte) 13);
        layoutNode.Y = new ql(ge8Var, layoutNode, b2);
        layoutNode.Z = new rl(ge8Var, b2);
        layoutNode.B0(new ul(ge8Var, layoutNode));
        this.L = layoutNode;
    }

    private final pc5 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            ki3.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f2529o.getSnapshotObserver();
    }

    public static nj3 i(nj3 nj3Var, int i, int i2, int i3, int i4) {
        int i5 = nj3Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = nj3Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = nj3Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = nj3Var.d - i4;
        return nj3.b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    public static int k(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(ct1.v(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static final void l(ge8 ge8Var) {
        if (ge8Var.q && ge8Var.isAttachedToWindow() && ge8Var.n.getParent() == ge8Var) {
            pc5 snapshotObserver = ge8Var.getSnapshotObserver();
            snapshotObserver.a.f(ge8Var, M, ge8Var.p);
        }
    }

    @Override // o.mz0
    public final void a() {
        this.s.a();
    }

    @Override // o.mz0
    public final void b() {
        this.r.a();
        removeAllViewsInLayout();
    }

    @Override // o.i25
    public final void c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.n.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            b25 b25Var = this.m.a;
            b25 b25VarV0 = b25Var != null ? b25Var.V0() : null;
            long jP0 = b25VarV0 != null ? b25VarV0.p0(i6, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = vn4.s0(Float.intBitsToFloat((int) (jP0 >> 32))) * (-1);
            iArr[1] = vn4.s0(Float.intBitsToFloat((int) (jP0 & 4294967295L))) * (-1);
        }
    }

    @Override // o.h25
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.n.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            b25 b25Var = this.m.a;
            b25 b25VarV0 = b25Var != null ? b25Var.V0() : null;
            if (b25VarV0 != null) {
                b25VarV0.p0(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // o.h25
    public final boolean e(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // o.h25
    public final void f(View view, View view2, int i, int i2) {
        lf1 lf1Var = this.J;
        if (i2 == 1) {
            lf1Var.c = i;
        } else {
            lf1Var.b = i;
        }
    }

    @Override // o.h25
    public final void g(View view, int i) {
        lf1 lf1Var = this.J;
        if (i == 1) {
            lf1Var.c = 0;
        } else {
            lf1Var.b = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.G;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final in1 getDensity() {
        return this.v;
    }

    public final View getInteropView() {
        return this.n;
    }

    public final LayoutNode getLayoutNode() {
        return this.L;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.x;
    }

    public final fs4 getModifier() {
        return this.t;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        lf1 lf1Var = this.J;
        return lf1Var.c | lf1Var.b;
    }

    public final Function1 getOnDensityChanged$ui() {
        return this.w;
    }

    public final Function1 getOnModifierChanged$ui() {
        return this.u;
    }

    public final Function1 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.F;
    }

    public final Function0 getRelease() {
        return this.s;
    }

    public final Function0 getReset() {
        return this.r;
    }

    public final ai6 getSavedStateRegistryOwner() {
        return this.y;
    }

    public final Function0 getUpdate() {
        return this.p;
    }

    public final View getView() {
        return this.n;
    }

    @Override // o.h25
    public final void h(View view, int i, int i2, int[] iArr, int i3) {
        if (this.n.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            int i4 = i3 == 0 ? 1 : 2;
            b25 b25Var = this.m.a;
            b25 b25VarV0 = b25Var != null ? b25Var.V0() : null;
            long J = b25VarV0 != null ? b25VarV0.J(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = vn4.s0(Float.intBitsToFloat((int) (J >> 32))) * (-1);
            iArr[1] = vn4.s0(Float.intBitsToFloat((int) (J & 4294967295L))) * (-1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.K) {
            this.L.P();
            return null;
        }
        this.n.postOnAnimation(new lg(this.E, (byte) 4));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.n.isNestedScrollingEnabled();
    }

    public final sk8 j(sk8 sk8Var) {
        pk8 pk8Var = sk8Var.a;
        nj3 nj3VarI = pk8Var.i(-1);
        nj3 nj3Var = nj3.e;
        if (!nj3VarI.equals(nj3Var) || !pk8Var.j(-9).equals(nj3Var) || pk8Var.h() != null) {
            ti3 ti3Var = (ti3) this.L.S.d;
            if (ti3Var.q0.z) {
                long jO = us1.O(ti3Var.P(0L));
                int i = (int) (jO >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jO & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long j = vt1.s(ti3Var).j();
                int i3 = (int) (j >> 32);
                int i4 = (int) (j & 4294967295L);
                long j2 = ti3Var.f1179o;
                long jO2 = us1.O(ti3Var.P((((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jO2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jO2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return sk8Var.a.r(i, i2, i5, i7);
                }
            }
        }
        return sk8Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.K) {
            this.L.P();
        } else {
            this.n.postOnAnimation(new lg(this.E, (byte) 4));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.n.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.n;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.H = i;
        this.I = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n.isNestedScrollingEnabled()) {
            return false;
        }
        im3.R(this.m.c(), null, null, new vl(z, this, g77.c(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.n.isNestedScrollingEnabled()) {
            return false;
        }
        im3.R(this.m.c(), null, null, new wl(this, g77.c(f * (-1.0f), f2 * (-1.0f)), null, (byte) 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Function1 function1 = this.C;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rect != null ? ds1.l0(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function1 = this.F;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // o.oc5
    public final boolean s() {
        return isAttachedToWindow();
    }

    public final void setDensity(in1 in1Var) {
        if (in1Var != this.v) {
            this.v = in1Var;
            Function1 function1 = this.w;
            if (function1 != null) {
                function1.invoke(in1Var);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.x) {
            this.x = lifecycleOwner;
            setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
        }
    }

    public final void setModifier(fs4 fs4Var) {
        if (fs4Var != this.t) {
            this.t = fs4Var;
            Function1 function1 = this.u;
            if (function1 != null) {
                function1.invoke(fs4Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(Function1 function1) {
        this.w = function1;
    }

    public final void setOnModifierChanged$ui(Function1 function1) {
        this.u = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(Function1 function1) {
        this.F = function1;
    }

    public final void setRelease(Function0 function0) {
        this.s = function0;
    }

    public final void setReset(Function0 function0) {
        this.r = function0;
    }

    public final void setSavedStateRegistryOwner(ai6 ai6Var) {
        if (ai6Var != this.y) {
            this.y = ai6Var;
            setTag(R.id.view_tree_saved_state_registry_owner, ai6Var);
        }
    }

    public final void setUpdate(Function0 function0) {
        this.p = function0;
        this.q = true;
        this.D.a();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // o.f75
    public final sk8 t(View view, sk8 sk8Var) {
        this.B = new sk8(sk8Var);
        return j(sk8Var);
    }
}
