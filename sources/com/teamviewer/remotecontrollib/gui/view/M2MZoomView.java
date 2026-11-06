package com.teamviewer.remotecontrollib.gui.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.teamviewer.remotecontrollib.gui.view.M2MZoomView;
import java.util.ArrayList;
import o.cx;
import o.im3;
import o.jb3;
import o.lj4;
import o.mb3;
import o.nb3;
import o.nx3;
import o.vn4;

/* JADX INFO: loaded from: classes.dex */
public final class M2MZoomView extends AppCompatImageView implements View.OnLayoutChangeListener {
    public static final /* synthetic */ int D = 0;
    public final GestureDetector A;
    public final Runnable B;
    public final Runnable C;
    public boolean p;
    public int q;
    public int r;
    public final PointF s;
    public int t;
    public int u;
    public boolean v;
    public float w;
    public float x;
    public nb3 y;
    public mb3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2MZoomView(Context context) {
        super(context);
        context.getClass();
        this.s = new PointF();
        final byte b = 1;
        this.v = true;
        this.x = 0.5f;
        this.y = nb3.m;
        final byte b2 = 0;
        this.B = new Runnable(this) { // from class: o.kj4
            public final /* synthetic */ M2MZoomView n;

            {
                this.n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                M2MZoomView m2MZoomView = this.n;
                switch (b3) {
                    case 0:
                        int i = M2MZoomView.D;
                        int iA = m2MZoomView.a(m2MZoomView.w, false);
                        int iD = m2MZoomView.d(m2MZoomView.x, false);
                        ViewGroup.LayoutParams layoutParams = m2MZoomView.getLayoutParams();
                        layoutParams.getClass();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.rightMargin = iA;
                        marginLayoutParams.leftMargin = (m2MZoomView.q - iA) - m2MZoomView.getWidth();
                        marginLayoutParams.topMargin = iD;
                        marginLayoutParams.bottomMargin = (m2MZoomView.r - iD) - m2MZoomView.getHeight();
                        m2MZoomView.e(marginLayoutParams, true, true);
                        m2MZoomView.f();
                        break;
                    default:
                        int i2 = M2MZoomView.D;
                        m2MZoomView.setAlpha(0.5f);
                        break;
                }
            }
        };
        this.C = new Runnable(this) { // from class: o.kj4
            public final /* synthetic */ M2MZoomView n;

            {
                this.n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                M2MZoomView m2MZoomView = this.n;
                switch (b3) {
                    case 0:
                        int i = M2MZoomView.D;
                        int iA = m2MZoomView.a(m2MZoomView.w, false);
                        int iD = m2MZoomView.d(m2MZoomView.x, false);
                        ViewGroup.LayoutParams layoutParams = m2MZoomView.getLayoutParams();
                        layoutParams.getClass();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.rightMargin = iA;
                        marginLayoutParams.leftMargin = (m2MZoomView.q - iA) - m2MZoomView.getWidth();
                        marginLayoutParams.topMargin = iD;
                        marginLayoutParams.bottomMargin = (m2MZoomView.r - iD) - m2MZoomView.getHeight();
                        m2MZoomView.e(marginLayoutParams, true, true);
                        m2MZoomView.f();
                        break;
                    default:
                        int i2 = M2MZoomView.D;
                        m2MZoomView.setAlpha(0.5f);
                        break;
                }
            }
        };
        this.A = new GestureDetector(getContext(), new lj4());
    }

    private final int getCountHorizontalPixelsEntirelyVisible() {
        return getMaxRightMarginEntirelyVisible() - getMinRightMarginEntirelyVisible();
    }

    private final int getCountVerticalPixelsEntirelyVisible() {
        return getMaxTopMarginEntirelyVisible() - getMinTopMarginEntirelyVisible();
    }

    private final int getMaxRightMarginEntirelyVisible() {
        return (this.q - getWidth()) + this.u;
    }

    private final int getMaxTopMarginEntirelyVisible() {
        return (this.r - getHeight()) + this.t;
    }

    private final int getMinRightMarginEntirelyVisible() {
        return -this.u;
    }

    private final int getMinTopMarginEntirelyVisible() {
        return -this.t;
    }

    public final int a(float f, boolean z) {
        int countHorizontalPixelsEntirelyVisible = (int) ((f * getCountHorizontalPixelsEntirelyVisible()) - this.u);
        boolean z2 = countHorizontalPixelsEntirelyVisible >= getMinRightMarginEntirelyVisible() && countHorizontalPixelsEntirelyVisible <= getMaxRightMarginEntirelyVisible();
        if (!z || z2) {
            return countHorizontalPixelsEntirelyVisible;
        }
        return countHorizontalPixelsEntirelyVisible < getMinRightMarginEntirelyVisible() ? getMinRightMarginEntirelyVisible() : getMaxRightMarginEntirelyVisible();
    }

    public final int d(float f, boolean z) {
        int countVerticalPixelsEntirelyVisible = (int) ((f * getCountVerticalPixelsEntirelyVisible()) - this.t);
        boolean z2 = countVerticalPixelsEntirelyVisible >= getMinTopMarginEntirelyVisible() && countVerticalPixelsEntirelyVisible <= getMaxTopMarginEntirelyVisible();
        if (!z || z2) {
            return countVerticalPixelsEntirelyVisible;
        }
        return countVerticalPixelsEntirelyVisible < getMinTopMarginEntirelyVisible() ? getMinTopMarginEntirelyVisible() : getMaxTopMarginEntirelyVisible();
    }

    public final void e(ViewGroup.MarginLayoutParams marginLayoutParams, boolean z, boolean z2) {
        if (z) {
            this.w = getCountHorizontalPixelsEntirelyVisible() != 0 ? (marginLayoutParams.rightMargin + this.u) / getCountHorizontalPixelsEntirelyVisible() : 0.0f;
        }
        if (z2) {
            this.x = getCountVerticalPixelsEntirelyVisible() != 0 ? (marginLayoutParams.topMargin + this.t) / getCountVerticalPixelsEntirelyVisible() : 0.0f;
        }
        setLayoutParams(marginLayoutParams);
    }

    public final void f() {
        ValueAnimator valueAnimatorOfInt;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        ValueAnimator valueAnimatorOfInt2 = null;
        if (i == getMinRightMarginEntirelyVisible() || i == getMaxRightMarginEntirelyVisible()) {
            valueAnimatorOfInt = null;
        } else {
            valueAnimatorOfInt = ValueAnimator.ofInt(i, (((double) getWidth()) / 2.0d) + ((double) i) <= ((double) this.q) / 2.0d ? getMinRightMarginEntirelyVisible() : getMaxRightMarginEntirelyVisible());
            final byte b = 1;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o.jj4
                public final /* synthetic */ M2MZoomView b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b2 = b;
                    M2MZoomView m2MZoomView = this.b;
                    switch (b2) {
                        case 0:
                            int i2 = M2MZoomView.D;
                            valueAnimator.getClass();
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            animatedValue.getClass();
                            int iIntValue = ((Integer) animatedValue).intValue();
                            ViewGroup.LayoutParams layoutParams2 = m2MZoomView.getLayoutParams();
                            layoutParams2.getClass();
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams.topMargin = iIntValue;
                            marginLayoutParams.bottomMargin = (m2MZoomView.r - iIntValue) - m2MZoomView.getHeight();
                            m2MZoomView.e(marginLayoutParams, false, true);
                            break;
                        default:
                            int i3 = M2MZoomView.D;
                            valueAnimator.getClass();
                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                            animatedValue2.getClass();
                            int iIntValue2 = ((Integer) animatedValue2).intValue();
                            ViewGroup.LayoutParams layoutParams3 = m2MZoomView.getLayoutParams();
                            layoutParams3.getClass();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                            marginLayoutParams2.rightMargin = iIntValue2;
                            marginLayoutParams2.leftMargin = (m2MZoomView.q - iIntValue2) - m2MZoomView.getWidth();
                            m2MZoomView.e(marginLayoutParams2, true, false);
                            break;
                    }
                }
            });
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        layoutParams2.getClass();
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        if (i2 < getMinTopMarginEntirelyVisible() || i2 > getMaxTopMarginEntirelyVisible()) {
            valueAnimatorOfInt2 = ValueAnimator.ofInt(i2, i2 < getMinTopMarginEntirelyVisible() ? getMinTopMarginEntirelyVisible() : getMaxTopMarginEntirelyVisible());
            final byte b2 = 0;
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o.jj4
                public final /* synthetic */ M2MZoomView b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b3 = b2;
                    M2MZoomView m2MZoomView = this.b;
                    switch (b3) {
                        case 0:
                            int i3 = M2MZoomView.D;
                            valueAnimator.getClass();
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            animatedValue.getClass();
                            int iIntValue = ((Integer) animatedValue).intValue();
                            ViewGroup.LayoutParams layoutParams3 = m2MZoomView.getLayoutParams();
                            layoutParams3.getClass();
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                            marginLayoutParams.topMargin = iIntValue;
                            marginLayoutParams.bottomMargin = (m2MZoomView.r - iIntValue) - m2MZoomView.getHeight();
                            m2MZoomView.e(marginLayoutParams, false, true);
                            break;
                        default:
                            int i4 = M2MZoomView.D;
                            valueAnimator.getClass();
                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                            animatedValue2.getClass();
                            int iIntValue2 = ((Integer) animatedValue2).intValue();
                            ViewGroup.LayoutParams layoutParams4 = m2MZoomView.getLayoutParams();
                            layoutParams4.getClass();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                            marginLayoutParams2.rightMargin = iIntValue2;
                            marginLayoutParams2.leftMargin = (m2MZoomView.q - iIntValue2) - m2MZoomView.getWidth();
                            m2MZoomView.e(marginLayoutParams2, true, false);
                            break;
                    }
                }
            });
        }
        ArrayList arrayListQ0 = cx.Q0(new ValueAnimator[]{valueAnimatorOfInt, valueAnimatorOfInt2});
        if (arrayListQ0.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayListQ0);
        animatorSet.setDuration(350L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.addOnLayoutChangeListener(this);
        }
        setAlpha(1.0f);
        postDelayed(this.C, 10000L);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
        }
        removeCallbacks(this.C);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (getVisibility() == 8) {
            return;
        }
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8 && this.p) {
            return;
        }
        this.p = true;
        this.q = i3 - i;
        this.r = i4 - i2;
        if (this.v) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.t = -marginLayoutParams.topMargin;
            this.u = -marginLayoutParams.rightMargin;
            this.v = false;
        }
        post(this.B);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        Runnable runnable = this.C;
        removeCallbacks(runnable);
        setAlpha(1.0f);
        postDelayed(runnable, 10000L);
        int actionMasked = motionEvent.getActionMasked();
        GestureDetector gestureDetector = this.A;
        if (im3.n(gestureDetector != null ? Boolean.valueOf(gestureDetector.onTouchEvent(motionEvent)) : null, Boolean.TRUE)) {
            performClick();
            if (1 != actionMasked) {
                return true;
            }
        }
        PointF pointF = this.s;
        if (actionMasked == 0) {
            pointF.x = motionEvent.getRawX();
            pointF.y = motionEvent.getRawY();
            return true;
        }
        if (actionMasked == 1) {
            f();
            return true;
        }
        if (actionMasked != 2) {
            return false;
        }
        float rawX = motionEvent.getRawX() - pointF.x;
        float rawY = motionEvent.getRawY() - pointF.y;
        pointF.x = motionEvent.getRawX();
        pointF.y = motionEvent.getRawY();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int iS0 = vn4.s0(marginLayoutParams.rightMargin - rawX);
        int iS1 = vn4.s0(marginLayoutParams.topMargin + rawY);
        marginLayoutParams.rightMargin = iS0;
        marginLayoutParams.leftMargin = (this.q - iS0) - getWidth();
        marginLayoutParams.topMargin = iS1;
        marginLayoutParams.bottomMargin = (this.r - iS1) - getHeight();
        e(marginLayoutParams, true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        nb3 nb3Var = this.y;
        nb3 nb3Var2 = nb3.n;
        if (nb3Var == nb3Var2) {
            setZoomState(nb3.m);
        } else {
            setZoomState(nb3Var2);
        }
        mb3 mb3Var = this.z;
        if (mb3Var == null) {
            return true;
        }
        ((jb3) ((nx3) mb3Var).n).s();
        return true;
    }

    public final void setTouchInterceptor(mb3 mb3Var) {
        this.z = mb3Var;
    }

    public final void setZoomState(nb3 nb3Var) {
        this.y = nb3Var;
        setActivated(nb3Var == nb3.n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2MZoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.s = new PointF();
        final byte b = 1;
        this.v = true;
        this.x = 0.5f;
        this.y = nb3.m;
        final byte b2 = 0;
        this.B = new Runnable(this) { // from class: o.kj4
            public final /* synthetic */ M2MZoomView n;

            {
                this.n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                M2MZoomView m2MZoomView = this.n;
                switch (b3) {
                    case 0:
                        int i = M2MZoomView.D;
                        int iA = m2MZoomView.a(m2MZoomView.w, false);
                        int iD = m2MZoomView.d(m2MZoomView.x, false);
                        ViewGroup.LayoutParams layoutParams = m2MZoomView.getLayoutParams();
                        layoutParams.getClass();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.rightMargin = iA;
                        marginLayoutParams.leftMargin = (m2MZoomView.q - iA) - m2MZoomView.getWidth();
                        marginLayoutParams.topMargin = iD;
                        marginLayoutParams.bottomMargin = (m2MZoomView.r - iD) - m2MZoomView.getHeight();
                        m2MZoomView.e(marginLayoutParams, true, true);
                        m2MZoomView.f();
                        break;
                    default:
                        int i2 = M2MZoomView.D;
                        m2MZoomView.setAlpha(0.5f);
                        break;
                }
            }
        };
        this.C = new Runnable(this) { // from class: o.kj4
            public final /* synthetic */ M2MZoomView n;

            {
                this.n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                M2MZoomView m2MZoomView = this.n;
                switch (b3) {
                    case 0:
                        int i = M2MZoomView.D;
                        int iA = m2MZoomView.a(m2MZoomView.w, false);
                        int iD = m2MZoomView.d(m2MZoomView.x, false);
                        ViewGroup.LayoutParams layoutParams = m2MZoomView.getLayoutParams();
                        layoutParams.getClass();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.rightMargin = iA;
                        marginLayoutParams.leftMargin = (m2MZoomView.q - iA) - m2MZoomView.getWidth();
                        marginLayoutParams.topMargin = iD;
                        marginLayoutParams.bottomMargin = (m2MZoomView.r - iD) - m2MZoomView.getHeight();
                        m2MZoomView.e(marginLayoutParams, true, true);
                        m2MZoomView.f();
                        break;
                    default:
                        int i2 = M2MZoomView.D;
                        m2MZoomView.setAlpha(0.5f);
                        break;
                }
            }
        };
        this.A = new GestureDetector(getContext(), new lj4());
    }
}
