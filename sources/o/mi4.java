package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class mi4 extends ValueAnimator implements Choreographer.FrameCallback {
    public qh4 x;
    public final CopyOnWriteArraySet m = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet n = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArraySet f1472o = new CopyOnWriteArraySet();
    public float p = 1.0f;
    public boolean q = false;
    public long r = 0;
    public float s = 0.0f;
    public float t = 0.0f;
    public int u = 0;
    public float v = -2.14748365E9f;
    public float w = 2.14748365E9f;
    public boolean y = false;

    public final float a() {
        qh4 qh4Var = this.x;
        if (qh4Var == null) {
            return 0.0f;
        }
        float f = this.t;
        float f2 = qh4Var.l;
        return (f - f2) / (qh4Var.m - f2);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.n.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f1472o.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.m.add(animatorUpdateListener);
    }

    public final float b() {
        qh4 qh4Var = this.x;
        if (qh4Var == null) {
            return 0.0f;
        }
        float f = this.w;
        return f == 2.14748365E9f ? qh4Var.m : f;
    }

    public final float c() {
        qh4 qh4Var = this.x;
        if (qh4Var == null) {
            return 0.0f;
        }
        float f = this.v;
        return f == -2.14748365E9f ? qh4Var.l : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(d());
        h(true);
    }

    public final boolean d() {
        return this.p < 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.y) {
            h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        qh4 qh4Var = this.x;
        if (qh4Var == null || !this.y) {
            return;
        }
        long j2 = this.r;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / qh4Var.n) / Math.abs(this.p));
        float f = this.s;
        if (d()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fC = c();
        float fB = b();
        PointF pointF = lr4.a;
        if (f2 >= fC && f2 <= fB) {
            z = true;
        }
        float fB2 = lr4.b(f2, c(), b());
        this.s = fB2;
        this.t = fB2;
        this.r = j;
        if (z) {
            g();
        } else if (getRepeatCount() == -1 || this.u < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.q = !this.q;
                this.p = -this.p;
            } else {
                float fB3 = d() ? b() : c();
                this.s = fB3;
                this.t = fB3;
            }
            this.r = j;
            g();
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.u++;
        } else {
            float fC2 = this.p < 0.0f ? c() : b();
            this.s = fC2;
            this.t = fC2;
            h(true);
            g();
            e(d());
        }
        if (this.x == null) {
            return;
        }
        float f3 = this.t;
        float f4 = this.v;
        if (f3 < f4 || f3 > this.w) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f4), Float.valueOf(this.w), Float.valueOf(this.t)));
        }
    }

    public final void e(boolean z) {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z);
        }
    }

    public final void g() {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fC;
        float fB;
        float fC2;
        if (this.x == null) {
            return 0.0f;
        }
        if (d()) {
            fC = b() - this.t;
            fB = b();
            fC2 = c();
        } else {
            fC = this.t - c();
            fB = b();
            fC2 = c();
        }
        return fC / (fB - fC2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        qh4 qh4Var = this.x;
        if (qh4Var == null) {
            return 0L;
        }
        return (long) qh4Var.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.y = false;
        }
    }

    public final void i(float f) {
        if (this.s == f) {
            return;
        }
        float fB = lr4.b(f, c(), b());
        this.s = fB;
        this.t = fB;
        this.r = 0L;
        g();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.y;
    }

    public final void j(float f, float f2) {
        if (f > f2) {
            an4.k("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        qh4 qh4Var = this.x;
        float f3 = qh4Var == null ? -3.4028235E38f : qh4Var.l;
        float f4 = qh4Var == null ? Float.MAX_VALUE : qh4Var.m;
        float fB = lr4.b(f, f3, f4);
        float fB2 = lr4.b(f2, f3, f4);
        if (fB == this.v && fB2 == this.w) {
            return;
        }
        this.v = fB;
        this.w = fB2;
        i((int) lr4.b(this.t, fB, fB2));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.n.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.m.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.n.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f1472o.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.m.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.q) {
            return;
        }
        this.q = false;
        this.p = -this.p;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }
}
