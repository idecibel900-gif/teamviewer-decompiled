package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.az6;
import o.bz6;
import o.cz6;
import o.fz5;

/* JADX INFO: loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint m;
    public final cz6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f31o;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.m = new Paint();
        this.n = new cz6();
        this.f31o = true;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        az6 az6Var;
        setWillNotDraw(false);
        this.n.setCallback(this);
        if (attributeSet == null) {
            b(new az6((byte) 0).i0());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fz5.a, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) {
                az6Var = new az6((byte) 1);
                ((bz6) az6Var.m).p = false;
            } else {
                az6Var = new az6((byte) 0);
            }
            b(az6Var.n0(typedArrayObtainStyledAttributes).i0());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void b(bz6 bz6Var) {
        boolean zIsStarted;
        cz6 cz6Var = this.n;
        cz6Var.f = bz6Var;
        if (bz6Var != null) {
            cz6Var.b.setXfermode(new PorterDuffXfermode(cz6Var.f.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        cz6Var.b();
        if (cz6Var.f != null) {
            ValueAnimator valueAnimator = cz6Var.e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                cz6Var.e.cancel();
                cz6Var.e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            bz6 bz6Var2 = cz6Var.f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (bz6Var2.t / bz6Var2.s) + 1.0f);
            cz6Var.e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(cz6Var.f.r);
            cz6Var.e.setRepeatCount(cz6Var.f.q);
            ValueAnimator valueAnimator2 = cz6Var.e;
            bz6 bz6Var3 = cz6Var.f;
            valueAnimator2.setDuration(bz6Var3.s + bz6Var3.t);
            cz6Var.e.addUpdateListener(cz6Var.a);
            if (zIsStarted) {
                cz6Var.e.start();
            }
        }
        cz6Var.invalidateSelf();
        if (bz6Var == null || !bz6Var.n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.m);
        }
    }

    public final void c() {
        cz6 cz6Var = this.n;
        ValueAnimator valueAnimator = cz6Var.e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        cz6Var.e.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f31o) {
            this.n.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.n.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new Paint();
        this.n = new cz6();
        this.f31o = true;
        a(context, attributeSet);
    }
}
