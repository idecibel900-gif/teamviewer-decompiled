package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.be8;
import o.jf2;
import o.mf2;
import o.zc1;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends zc1 {
    public int a = 0;

    public ExpandableBehavior() {
    }

    @Override // o.zc1
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.zc1
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (mf2) view2;
        boolean z = ((FloatingActionButton) obj).A.b;
        int i = this.a;
        if (z) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        boolean z2 = ((FloatingActionButton) obj).A.b;
        this.a = z2 ? 1 : 2;
        s((View) obj, view, z2, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.zc1
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        mf2 mf2Var;
        WeakHashMap weakHashMap = be8.a;
        if (!view.isLaidOut()) {
            ArrayList arrayListK = coordinatorLayout.k(view);
            int size = arrayListK.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    mf2Var = null;
                    break;
                }
                View view2 = (View) arrayListK.get(i2);
                if (b(view, view2)) {
                    mf2Var = (mf2) view2;
                    break;
                }
                i2++;
            }
            if (mf2Var != null) {
                boolean z = ((FloatingActionButton) mf2Var).A.b;
                int i3 = this.a;
                if (!z ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new jf2(this, view, i4, mf2Var));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
