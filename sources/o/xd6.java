package o;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class xd6 extends View {
    public static final int[] r = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] s = new int[0];
    public v88 m;
    public Boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Long f2507o;
    public pc0 p;
    public y q;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.p;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f2507o;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? r : s;
            v88 v88Var = this.m;
            if (v88Var != null) {
                v88Var.setState(iArr);
            }
        } else {
            pc0 pc0Var = new pc0((Object) this, (byte) 26);
            this.p = pc0Var;
            postDelayed(pc0Var, 50L);
        }
        this.f2507o = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(xd6 xd6Var) {
        v88 v88Var = xd6Var.m;
        if (v88Var != null) {
            v88Var.setState(s);
        }
        xd6Var.p = null;
    }

    public final void b(yr5 yr5Var, boolean z, long j, int i, long j2, float f, y yVar) {
        long j3 = yr5Var.a;
        if (this.m == null || !Boolean.valueOf(z).equals(this.n)) {
            v88 v88Var = new v88(z);
            setBackground(v88Var);
            this.m = v88Var;
            this.n = Boolean.valueOf(z);
        }
        v88 v88Var2 = this.m;
        v88Var2.getClass();
        this.q = yVar;
        e(j, i, j2, f);
        if (z) {
            v88Var2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            v88Var2.setHotspot(v88Var2.getBounds().centerX(), v88Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.q = null;
        pc0 pc0Var = this.p;
        if (pc0Var != null) {
            removeCallbacks(pc0Var);
            pc0 pc0Var2 = this.p;
            pc0Var2.getClass();
            pc0Var2.run();
        } else {
            v88 v88Var = this.m;
            if (v88Var != null) {
                v88Var.setState(s);
            }
        }
        v88 v88Var2 = this.m;
        if (v88Var2 == null) {
            return;
        }
        v88Var2.setVisible(false, false);
        unscheduleDrawable(v88Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, int i, long j2, float f) {
        v88 v88Var = this.m;
        if (v88Var == null) {
            return;
        }
        if (v88Var.getRadius() != i) {
            v88Var.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = rv0.b(f, j2);
        rv0 rv0Var = v88Var.n;
        if (!(rv0Var == null ? false : z68.a(rv0Var.a, jB))) {
            v88Var.n = new rv0(jB);
            v88Var.setColor(ColorStateList.valueOf(j51.U(jB)));
        }
        Rect rect = new Rect(0, 0, vn4.s0(Float.intBitsToFloat((int) (j >> 32))), vn4.s0(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        v88Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        y yVar = this.q;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
