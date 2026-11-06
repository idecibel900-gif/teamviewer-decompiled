package o;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class xe8 extends zc1 {
    public ye8 a;
    public int b = 0;

    public xe8() {
    }

    @Override // o.zc1
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        t(coordinatorLayout, view, i);
        ye8 ye8Var = this.a;
        if (ye8Var == null) {
            ye8Var = new ye8(view);
            this.a = ye8Var;
        }
        View view2 = ye8Var.a;
        ye8Var.b = view2.getTop();
        ye8Var.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public final int s() {
        ye8 ye8Var = this.a;
        if (ye8Var != null) {
            return ye8Var.d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }

    public xe8(int i) {
    }
}
