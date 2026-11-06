package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class ur0 extends Drawable implements Animatable {
    public static final LinearInterpolator s = new LinearInterpolator();
    public static final rh2 t = new rh2((byte) 1);
    public static final int[] u = {-16777216};
    public final tr0 m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Resources f2240o;
    public final ValueAnimator p;
    public float q;
    public boolean r;

    public ur0(Context context) {
        context.getClass();
        this.f2240o = context.getResources();
        tr0 tr0Var = new tr0();
        this.m = tr0Var;
        tr0Var.i = u;
        tr0Var.a(0);
        tr0Var.h = 2.5f;
        tr0Var.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new sr0(this, tr0Var));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(s);
        valueAnimatorOfFloat.addListener(new nz7(this, tr0Var, (byte) 2));
        this.p = valueAnimatorOfFloat;
    }

    public static void d(float f, tr0 tr0Var) {
        if (f <= 0.75f) {
            tr0Var.u = tr0Var.i[tr0Var.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = tr0Var.i;
        int i = tr0Var.j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        tr0Var.u = ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & 255) - i7))));
    }

    public final void a(float f, tr0 tr0Var, boolean z) {
        float interpolation;
        if (this.r) {
            d(f, tr0Var);
            float fFloor = (float) (Math.floor(tr0Var.m / 0.8f) + 1.0d);
            float f2 = tr0Var.k;
            float f3 = tr0Var.l;
            tr0Var.e = (((f3 - 0.01f) - f2) * f) + f2;
            tr0Var.f = f3;
            float f4 = tr0Var.m;
            tr0Var.g = ua5.c(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = tr0Var.m;
            float interpolation2 = tr0Var.k;
            rh2 rh2Var = t;
            if (f < 0.5f) {
                interpolation = (rh2Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f6 = interpolation2 + 0.79f;
                interpolation2 = f6 - (((1.0f - rh2Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.q) * 216.0f;
            tr0Var.e = interpolation2;
            tr0Var.f = interpolation;
            tr0Var.g = f7;
            this.n = f8;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.f2240o.getDisplayMetrics().density;
        float f6 = f2 * f5;
        tr0 tr0Var = this.m;
        tr0Var.h = f6;
        tr0Var.b.setStrokeWidth(f6);
        tr0Var.q = f * f5;
        tr0Var.a(0);
        tr0Var.r = (int) (f3 * f5);
        tr0Var.s = (int) (f4 * f5);
    }

    public final void c(int i) {
        if (i == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.n, bounds.exactCenterX(), bounds.exactCenterY());
        tr0 tr0Var = this.m;
        Paint paint = tr0Var.b;
        RectF rectF = tr0Var.a;
        float f = tr0Var.q;
        float fMin = (tr0Var.h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((tr0Var.r * tr0Var.p) / 2.0f, tr0Var.h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = tr0Var.e;
        float f3 = tr0Var.g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((tr0Var.f + f3) * 360.0f) - f4;
        paint.setColor(tr0Var.u);
        paint.setAlpha(tr0Var.t);
        float f6 = tr0Var.h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, tr0Var.d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = tr0Var.c;
        if (tr0Var.n) {
            Path path = tr0Var.f2135o;
            if (path == null) {
                Path path2 = new Path();
                tr0Var.f2135o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (tr0Var.r * tr0Var.p) / 2.0f;
            tr0Var.f2135o.moveTo(0.0f, 0.0f);
            tr0Var.f2135o.lineTo(tr0Var.r * tr0Var.p, 0.0f);
            Path path3 = tr0Var.f2135o;
            float f9 = tr0Var.r;
            float f10 = tr0Var.p;
            path3.lineTo((f9 * f10) / 2.0f, tr0Var.s * f10);
            tr0Var.f2135o.offset((rectF.centerX() + fMin2) - f8, (tr0Var.h / 2.0f) + rectF.centerY());
            tr0Var.f2135o.close();
            paint2.setColor(tr0Var.u);
            paint2.setAlpha(tr0Var.t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(tr0Var.f2135o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.m.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.p.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.m.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.m.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.p;
        valueAnimator.cancel();
        tr0 tr0Var = this.m;
        float f = tr0Var.e;
        tr0Var.k = f;
        float f2 = tr0Var.f;
        tr0Var.l = f2;
        tr0Var.m = tr0Var.g;
        if (f2 != f) {
            this.r = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        tr0Var.a(0);
        tr0Var.k = 0.0f;
        tr0Var.l = 0.0f;
        tr0Var.m = 0.0f;
        tr0Var.e = 0.0f;
        tr0Var.f = 0.0f;
        tr0Var.g = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.p.cancel();
        this.n = 0.0f;
        tr0 tr0Var = this.m;
        if (tr0Var.n) {
            tr0Var.n = false;
        }
        tr0Var.a(0);
        tr0Var.k = 0.0f;
        tr0Var.l = 0.0f;
        tr0Var.m = 0.0f;
        tr0Var.e = 0.0f;
        tr0Var.f = 0.0f;
        tr0Var.g = 0.0f;
        invalidateSelf();
    }
}
