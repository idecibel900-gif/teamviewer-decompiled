package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import o.b61;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public boolean m;

    public Guideline(Context context) {
        super(context);
        this.m = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.m = z;
    }

    public void setGuidelineBegin(int i) {
        b61 b61Var = (b61) getLayoutParams();
        if (this.m && b61Var.a == i) {
            return;
        }
        b61Var.a = i;
        setLayoutParams(b61Var);
    }

    public void setGuidelineEnd(int i) {
        b61 b61Var = (b61) getLayoutParams();
        if (this.m && b61Var.b == i) {
            return;
        }
        b61Var.b = i;
        setLayoutParams(b61Var);
    }

    public void setGuidelinePercent(float f) {
        b61 b61Var = (b61) getLayoutParams();
        if (this.m && b61Var.c == f) {
            return;
        }
        b61Var.c = f;
        setLayoutParams(b61Var);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = true;
        super.setVisibility(8);
    }
}
