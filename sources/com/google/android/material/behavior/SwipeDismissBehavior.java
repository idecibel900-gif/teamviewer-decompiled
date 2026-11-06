package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import o.a4;
import o.be8;
import o.fe8;
import o.l07;
import o.xg7;
import o.y30;
import o.zc1;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends zc1 {
    public fe8 a;
    public y30 b;
    public boolean c;
    public byte d = 2;
    public float e = 0.0f;
    public float f = 0.5f;
    public final xg7 g = new xg7(this);

    @Override // o.zc1
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!zO) {
            return false;
        }
        fe8 fe8Var = this.a;
        if (fe8Var == null) {
            fe8Var = new fe8(coordinatorLayout.getContext(), coordinatorLayout, this.g);
            this.a = fe8Var;
        }
        return fe8Var.p(motionEvent);
    }

    @Override // o.zc1
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = be8.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            be8.j(view, 1048576);
            be8.h(view, 0);
            if (s(view)) {
                be8.k(view, a4.l, new l07((Object) this, (byte) 10));
            }
        }
        return false;
    }

    @Override // o.zc1
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        fe8 fe8Var = this.a;
        if (fe8Var == null) {
            return false;
        }
        fe8Var.j(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
