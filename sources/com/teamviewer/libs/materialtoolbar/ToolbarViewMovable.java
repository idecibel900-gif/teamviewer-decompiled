package com.teamviewer.libs.materialtoolbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import o.ai4;
import o.gk0;
import o.nz5;
import o.tz7;
import o.vz7;
import o.xz7;
import o.yq4;
import o.yz7;

/* JADX INFO: loaded from: classes.dex */
public final class ToolbarViewMovable extends FrameLayout {
    public static final /* synthetic */ int r = 0;
    public vz7 m;
    public final tz7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f62o;
    public float p;
    public int q;

    /* JADX WARN: Illegal instructions before constructor call */
    public ToolbarViewMovable(Context context, AttributeSet attributeSet, int i) {
        xz7 xz7Var;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        int i2 = 0;
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nz5.a);
            typedArrayObtainStyledAttributes.getClass();
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            xz7.m.getClass();
            xz7[] xz7VarArrValues = xz7.values();
            int length = xz7VarArrValues.length;
            while (true) {
                if (i2 >= length) {
                    yq4.f();
                    throw null;
                }
                xz7Var = xz7VarArrValues[i2];
                xz7Var.getClass();
                if (i3 == 0) {
                    typedArrayObtainStyledAttributes.recycle();
                    break;
                }
                i2++;
            }
        } else {
            xz7Var = xz7.n;
        }
        if (yz7.a[xz7Var.ordinal()] != 1) {
            gk0.s();
            throw null;
        }
        tz7 tz7Var = new tz7(context, attributeSet);
        tz7Var.setOrientation(1);
        this.n = tz7Var;
    }

    public final void a(float f, float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ai4(this, (byte) 2));
        valueAnimatorOfFloat.start();
    }

    public final vz7 getMoveListener() {
        return this.m;
    }

    public final void setMoveListener(vz7 vz7Var) {
        this.m = vz7Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarViewMovable(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarViewMovable(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
