package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.av2;
import o.be8;
import o.hk0;
import o.ku2;
import o.sk8;
import o.su2;
import o.ut2;
import o.uz5;
import o.w10;
import o.wt2;
import o.xt2;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList m;
    public final ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f19o;
    public boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, su2 su2Var) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.p = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uz5.b, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        ut2 ut2VarE = su2Var.E(id);
        if (classAttribute != null && ut2VarE == null) {
            if (id == -1) {
                hk0.m(classAttribute, string != null ? " with tag " + ((Object) string) : "", "FragmentContainerView must have an android:id to add Fragment ");
                throw null;
            }
            ku2 ku2VarJ = su2Var.J();
            context.getClassLoader();
            ut2 ut2VarA = ku2VarJ.a(classAttribute);
            ut2VarA.getClass();
            ut2VarA.J = id;
            ut2VarA.K = id;
            ut2VarA.L = string;
            ut2VarA.F = su2Var;
            wt2 wt2Var = su2Var.x;
            ut2VarA.G = wt2Var;
            ut2VarA.S = true;
            if ((wt2Var == null ? null : wt2Var.s) != null) {
                ut2VarA.S = true;
            }
            w10 w10Var = new w10(su2Var);
            w10Var.p = true;
            ut2VarA.T = this;
            ut2VarA.B = true;
            w10Var.h(getId(), ut2VarA, string, 1);
            if (w10Var.g) {
                hk0.l("This transaction is already being added to the back stack");
                throw null;
            }
            w10Var.h = false;
            w10Var.r.C(w10Var, true);
        }
        for (av2 av2Var : su2Var.c.N()) {
            ut2 ut2Var = av2Var.c;
            if (ut2Var.K == getId() && (view = ut2Var.U) != null && view.getParent() == null) {
                ut2Var.T = this;
                av2Var.b();
                av2Var.k();
            }
        }
    }

    public final void a(View view) {
        if (this.n.contains(view)) {
            this.m.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof ut2 ? (ut2) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            hk0.h(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        sk8 sk8VarG;
        windowInsets.getClass();
        sk8 sk8VarG2 = sk8.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f19o;
        if (onApplyWindowInsetsListener != null) {
            sk8VarG = sk8.g(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null);
        } else {
            WeakHashMap weakHashMap = be8.a;
            WindowInsets windowInsetsF = sk8VarG2.f();
            if (windowInsetsF != null && !windowInsetsF.equals(windowInsetsF)) {
                sk8VarG2 = sk8.g(windowInsetsF, this);
            }
            sk8VarG = sk8VarG2;
        }
        if (!sk8VarG.a.s()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                be8.b(getChildAt(i), sk8VarG);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.p) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.p) {
            ArrayList arrayList = this.m;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.n.remove(view);
        if (this.m.remove(view)) {
            this.p = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends ut2> F getFragment() {
        ut2 ut2Var;
        xt2 xt2Var;
        su2 su2VarD;
        View view = this;
        while (true) {
            if (view == null) {
                ut2Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            ut2Var = tag instanceof ut2 ? (ut2) tag : null;
            if (ut2Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (ut2Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    xt2Var = null;
                    break;
                }
                if (context instanceof xt2) {
                    xt2Var = (xt2) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (xt2Var == null) {
                hk0.m(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            su2VarD = xt2Var.D();
        } else {
            if (!ut2Var.O()) {
                throw new IllegalStateException("The Fragment " + ut2Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            su2VarD = ut2Var.D();
        }
        return (F) su2VarD.E(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.p = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f19o = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.n.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        context.getClass();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.p = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uz5.b, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + ((Object) str) + "=\"" + ((Object) classAttribute) + "\"");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        context.getClass();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.p = true;
    }
}
