package androidx.percentlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o.g95;
import o.si5;

/* JADX INFO: loaded from: classes.dex */
public class PercentFrameLayout extends FrameLayout {
    public final g95 m;

    public PercentFrameLayout(Context context) {
        super(context);
        this.m = new g95(this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new si5(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        si5 si5Var = new si5(context, attributeSet);
        si5Var.m = g95.D(context, attributeSet);
        return si5Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.m.V();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        g95 g95Var = this.m;
        g95Var.r(i, i2);
        super.onMeasure(i, i2);
        if (g95Var.L()) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new si5(-1, -1);
    }

    public PercentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new g95(this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        si5 si5Var = new si5(context, attributeSet);
        si5Var.m = g95.D(context, attributeSet);
        return si5Var;
    }
}
