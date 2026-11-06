package o;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class e76 extends p3 {
    public final RecyclerView p;
    public final d76 q;

    public e76(RecyclerView recyclerView) {
        this.p = recyclerView;
        p3 p3VarJ = j();
        if (p3VarJ == null || !(p3VarJ instanceof d76)) {
            this.q = new d76(this);
        } else {
            this.q = (d76) p3VarJ;
        }
    }

    @Override // o.p3
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.p.P()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().c0(accessibilityEvent);
        }
    }

    @Override // o.p3
    public void d(View view, g4 g4Var) {
        this.m.onInitializeAccessibilityNodeInfo(view, g4Var.a);
        RecyclerView recyclerView = this.p;
        if (recyclerView.P() || recyclerView.getLayoutManager() == null) {
            return;
        }
        androidx.recyclerview.widget.a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.n;
        layoutManager.d0(recyclerView2.f23o, recyclerView2.s0, g4Var);
    }

    @Override // o.p3
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.p;
        if (recyclerView.P() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().r0(i, bundle);
    }

    public p3 j() {
        return this.q;
    }
}
