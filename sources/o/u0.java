package o;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends ViewGroup {
    public WeakReference m;
    public IBinder n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public sn8 f2157o;
    public n01 p;
    public c01 q;
    public Function0 r;
    public boolean s;
    public boolean t;
    public boolean u;

    public u0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        a0 a0Var = new a0(this, (byte) 6);
        addOnAttachStateChangeListener(a0Var);
        ce8 ce8Var = new ce8(this);
        vt1.y(this).a.add(ce8Var);
        this.r = new b67(this, a0Var, ce8Var, (byte) 3);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(n01 n01Var) {
        if (this.p != n01Var) {
            this.p = n01Var;
            if (n01Var != null) {
                this.m = null;
            }
            sn8 sn8Var = this.f2157o;
            if (sn8Var != null) {
                sn8Var.a();
                this.f2157o = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.n != iBinder) {
            this.n = iBinder;
            this.m = null;
        }
    }

    public abstract void a(int i, ux2 ux2Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.q == null) {
                AndroidComposeView androidComposeView = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(k(qf0.x(this), androidComposeView.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.t) {
            return;
        }
        yq4.r(fx3.g("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        c01 c01Var;
        if (this.p != null || isAttachedToWindow() || ((c01Var = this.q) != null && c01Var.a.isAttachedToWindow())) {
            f();
        } else {
            hk0.l("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void e() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null && androidComposeView.composeViewContextIncrementedDuringInit) {
            androidComposeView.getComposeViewContext().b();
            androidComposeView.composeViewContextIncrementedDuringInit = false;
        }
        sn8 sn8Var = this.f2157o;
        if (sn8Var != null) {
            sn8Var.a();
        }
        this.f2157o = null;
        requestLayout();
    }

    public final void f() {
        if (this.f2157o == null) {
            byte b = 0;
            try {
                this.t = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    c01 c01VarI = this.q;
                    if (c01VarI == null) {
                        c01VarI = i();
                    }
                    this.f2157o = wn8.a(this, c01VarI, new yy0(1003123809, true, new t0(this, b)));
                    Trace.endSection();
                    this.t = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.t = false;
                throw th2;
            }
        }
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m35getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        oz ozVar = tag instanceof oz ? (oz) tag : null;
        if (ozVar != null) {
            return ozVar.a;
        }
        return 1;
    }

    public final c01 getComposeViewContext$ui() {
        return this.q;
    }

    public final boolean getHasComposition() {
        return this.f2157o != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.s;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final c01 i() {
        c01 composeViewContext;
        we8 we8Var;
        we8 we8Var2 = null;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                composeViewContext = androidComposeView.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewX = qf0.x(this);
        c01 c01VarB = qf0.B(viewX);
        if (c01VarB != null) {
            return k(viewX, c01VarB);
        }
        n01 n01VarJ = j();
        LifecycleOwner lifecycleOwnerL = n67.l(viewX);
        if (lifecycleOwnerL == null) {
            lifecycleOwnerL = composeViewContext != null ? composeViewContext.d() : null;
            if (lifecycleOwnerL == null) {
                hk0.l("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        LifecycleOwner lifecycleOwner = lifecycleOwnerL;
        ai6 ai6VarJ = o67.j(viewX);
        if (ai6VarJ == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                ai6VarJ = composeViewContext.e;
                ai6VarJ.getClass();
            } else {
                ai6VarJ = null;
            }
            if (ai6VarJ == null) {
                hk0.l("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        ai6 ai6Var = ai6VarJ;
        we8 we8VarI = v67.i(viewX);
        if (we8VarI == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                we8Var2 = composeViewContext.f;
            }
            we8Var = we8Var2;
        } else {
            we8Var = we8VarI;
        }
        c01 c01Var = new c01(qf0.B(qf0.x(viewX)), viewX, n01VarJ, lifecycleOwner, ai6Var, we8Var);
        viewX.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c01Var));
        return c01Var;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.u || super.isTransitionGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o.n01] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.n01] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.n01] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [o.p56] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    public final n01 j() {
        n01 n01Var;
        ?? A = this.p;
        if (A == 0) {
            A = kl8.a(this);
            if (A == 0) {
                Object parent = getParent();
                while (true) {
                    if (A != 0 || !(parent instanceof View)) {
                        A = A;
                        break;
                    }
                    A = A;
                    View view = (View) parent;
                    n01 n01VarA = kl8.a(view);
                    parent = i67.q(view);
                    A = n01VarA;
                }
            }
            m56 m56Var = m56.n;
            if (A != 0) {
                ?? r3 = (!(A instanceof p56) || ((m56) ((p56) A).u.getValue()).compareTo(m56Var) > 0) ? A : 0;
                if (r3 != 0) {
                    this.m = new WeakReference(r3);
                }
            } else {
                A = 0;
            }
            if (A == 0) {
                WeakReference weakReference = this.m;
                if (weakReference == null || (n01Var = (n01) weakReference.get()) == null || ((n01Var instanceof p56) && ((m56) ((p56) n01Var).u.getValue()).compareTo(m56Var) <= 0)) {
                    A = n01Var;
                    A = n01Var;
                    A = 0;
                }
                if (A == 0) {
                    A = kl8.b(this);
                    ?? r2 = ((m56) A.u.getValue()).compareTo(m56Var) > 0 ? A : 0;
                    if (r2 != 0) {
                        this.m = new WeakReference(r2);
                    }
                }
            }
        }
        return A;
    }

    public final c01 k(View view, c01 c01Var) {
        n01 n01VarJ = j();
        LifecycleOwner lifecycleOwnerL = n67.l(view);
        we8 we8VarI = v67.i(view);
        ai6 ai6VarJ = o67.j(view);
        if (n01VarJ == c01Var.c() && lifecycleOwnerL == c01Var.d()) {
            c01Var.g();
            if (we8VarI == c01Var.f) {
                c01Var.g();
                ai6 ai6Var = c01Var.e;
                ai6Var.getClass();
                if (ai6VarJ == ai6Var) {
                    return c01Var;
                }
            }
        }
        if (n01VarJ.j() != c01Var.c().j()) {
            e();
        }
        if (lifecycleOwnerL == null) {
            lifecycleOwnerL = c01Var.d();
        }
        LifecycleOwner lifecycleOwner = lifecycleOwnerL;
        if (ai6VarJ == null) {
            c01Var.g();
            ai6VarJ = c01Var.e;
            ai6VarJ.getClass();
        }
        c01 c01Var2 = new c01(c01Var, view, n01VarJ, lifecycleOwner, ai6VarJ, we8VarI);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c01Var2));
        return c01Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        jx4 jx4Var = kl8.a;
        Object objQ = i67.q(this);
        View view = this;
        while (objQ instanceof View) {
            View view2 = (View) objQ;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objQ = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new io.sentry.b5((Object) this, (byte) 20));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m36setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new oz(i));
    }

    public final void setComposeViewContext$ui(c01 c01Var) {
        if (this.q != c01Var) {
            if (c01Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != c01Var.c().j()) {
                        e();
                    }
                    androidComposeView.setComposeViewContext(c01Var);
                }
            }
            this.q = c01Var;
        }
    }

    public final void setParentCompositionContext(n01 n01Var) {
        setParentContext(n01Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.s = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.u = true;
    }

    public final void setViewCompositionStrategy(de8 de8Var) {
        Function0 function0 = this.r;
        if (function0 != null) {
            function0.a();
        }
        this.r = de8Var.d(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }
}
