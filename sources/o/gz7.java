package o;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gz7 implements gq4 {
    public jp4 m;
    public pp4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Toolbar f934o;

    public gz7(Toolbar toolbar) {
        this.f934o = toolbar;
    }

    @Override // o.gq4
    public final void b(jp4 jp4Var, boolean z) {
    }

    @Override // o.gq4
    public final void c(boolean z) {
        if (this.n != null) {
            jp4 jp4Var = this.m;
            if (jp4Var != null) {
                int size = jp4Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.m.getItem(i) == this.n) {
                        return;
                    }
                }
            }
            m(this.n);
        }
    }

    @Override // o.gq4
    public final void d(Context context, jp4 jp4Var) {
        pp4 pp4Var;
        jp4 jp4Var2 = this.m;
        if (jp4Var2 != null && (pp4Var = this.n) != null) {
            jp4Var2.d(pp4Var);
        }
        this.m = jp4Var;
    }

    @Override // o.gq4
    public final boolean e() {
        return false;
    }

    @Override // o.gq4
    public final boolean f(gd7 gd7Var) {
        return false;
    }

    @Override // o.gq4
    public final int getId() {
        return 0;
    }

    @Override // o.gq4
    public final void h(Parcelable parcelable) {
    }

    @Override // o.gq4
    public final boolean j(pp4 pp4Var) {
        Toolbar toolbar = this.f934o;
        toolbar.c();
        ViewParent parent = toolbar.t.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.t);
            }
            toolbar.addView(toolbar.t);
        }
        View actionView = pp4Var.getActionView();
        toolbar.u = actionView;
        this.n = pp4Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.u);
            }
            hz7 hz7VarH = Toolbar.h();
            hz7VarH.a = (toolbar.z & 112) | 8388611;
            hz7VarH.b = (byte) 2;
            toolbar.u.setLayoutParams(hz7VarH);
            toolbar.addView(toolbar.u);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((hz7) childAt.getLayoutParams()).b != 2 && childAt != toolbar.m) {
                toolbar.removeViewAt(childCount);
                toolbar.Q.add(childAt);
            }
        }
        toolbar.requestLayout();
        pp4Var.C = true;
        pp4Var.n.r(false);
        KeyEvent.Callback callback = toolbar.u;
        if (callback instanceof dv0) {
            ((dv0) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // o.gq4
    public final Parcelable l() {
        return null;
    }

    @Override // o.gq4
    public final boolean m(pp4 pp4Var) {
        Toolbar toolbar = this.f934o;
        KeyEvent.Callback callback = toolbar.u;
        if (callback instanceof dv0) {
            ((dv0) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.u);
        toolbar.removeView(toolbar.t);
        toolbar.u = null;
        ArrayList arrayList = toolbar.Q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.n = null;
        toolbar.requestLayout();
        pp4Var.C = false;
        pp4Var.n.r(false);
        toolbar.v();
        return true;
    }
}
