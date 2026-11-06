package androidx.percentlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import o.g95;
import o.wi5;

/* JADX INFO: loaded from: classes.dex */
public class PercentRelativeLayout extends RelativeLayout {
    public final g95 m;

    public PercentRelativeLayout(Context context) {
        super(context);
        this.m = new g95(this);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new wi5(-1, -1);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        wi5 wi5Var = new wi5(context, attributeSet);
        wi5Var.m = g95.D(context, attributeSet);
        return wi5Var;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.m.V();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        g95 g95Var = this.m;
        g95Var.r(i, i2);
        super.onMeasure(i, i2);
        if (g95Var.L()) {
            super.onMeasure(i, i2);
        }
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new g95(this);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        wi5 wi5Var = new wi5(context, attributeSet);
        wi5Var.m = g95.D(context, attributeSet);
        return wi5Var;
    }
}
