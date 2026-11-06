package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d76 extends p3 {
    public final e76 p;
    public final WeakHashMap q = new WeakHashMap();

    public d76(e76 e76Var) {
        this.p = e76Var;
    }

    @Override // o.p3
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        p3 p3Var = (p3) this.q.get(view);
        return p3Var != null ? p3Var.a(view, accessibilityEvent) : this.m.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // o.p3
    public final df6 b(View view) {
        p3 p3Var = (p3) this.q.get(view);
        return p3Var != null ? p3Var.b(view) : super.b(view);
    }

    @Override // o.p3
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        p3 p3Var = (p3) this.q.get(view);
        if (p3Var != null) {
            p3Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // o.p3
    public final void d(View view, g4 g4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        e76 e76Var = this.p;
        RecyclerView recyclerView = e76Var.p;
        RecyclerView recyclerView2 = e76Var.p;
        boolean zP = recyclerView.P();
        View.AccessibilityDelegate accessibilityDelegate = this.m;
        if (zP || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().e0(view, g4Var);
        p3 p3Var = (p3) this.q.get(view);
        if (p3Var != null) {
            p3Var.d(view, g4Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // o.p3
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        p3 p3Var = (p3) this.q.get(view);
        if (p3Var != null) {
            p3Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // o.p3
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        p3 p3Var = (p3) this.q.get(viewGroup);
        return p3Var != null ? p3Var.f(viewGroup, view, accessibilityEvent) : this.m.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // o.p3
    public final boolean g(View view, int i, Bundle bundle) {
        e76 e76Var = this.p;
        RecyclerView recyclerView = e76Var.p;
        RecyclerView recyclerView2 = e76Var.p;
        if (recyclerView.P() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        p3 p3Var = (p3) this.q.get(view);
        if (p3Var != null) {
            if (p3Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        s66 s66Var = recyclerView2.getLayoutManager().n.f23o;
        return false;
    }

    @Override // o.p3
    public final void h(View view, int i) {
        p3 p3Var = (p3) this.q.get(view);
        if (p3Var != null) {
            p3Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // o.p3
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        p3 p3Var = (p3) this.q.get(view);
        if (p3Var != null) {
            p3Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
