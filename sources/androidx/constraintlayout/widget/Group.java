package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewParent;
import o.b61;
import o.z51;

/* JADX INFO: loaded from: classes.dex */
public class Group extends z51 {
    public Group(Context context) {
        super(context);
    }

    @Override // o.z51
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // o.z51
    public final void i() {
        b61 b61Var = (b61) getLayoutParams();
        b61Var.p0.K(0);
        b61Var.p0.H(0);
    }

    @Override // o.z51, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
