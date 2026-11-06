package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class cz6 extends Drawable {
    public final rr a = new rr(this, (byte) 6);
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public bz6 f;

    public cz6() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        bz6 bz6Var;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted() || (bz6Var = this.f) == null || !bz6Var.f471o || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void b() {
        bz6 bz6Var;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (bz6Var = this.f) == null) {
            return;
        }
        int iRound = bz6Var.g;
        if (iRound <= 0) {
            iRound = Math.round(bz6Var.i * iWidth);
        }
        bz6 bz6Var2 = this.f;
        int iRound2 = bz6Var2.h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(bz6Var2.j * iHeight);
        }
        bz6 bz6Var3 = this.f;
        boolean z = true;
        if (!bz6Var3.f) {
            byte b = bz6Var3.c;
            if (b != 1 && b != 3) {
                z = false;
            }
            if (z) {
                iRound = 0;
            }
            if (!z) {
                iRound2 = 0;
            }
            bz6 bz6Var4 = this.f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, bz6Var4.b, bz6Var4.a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            bz6 bz6Var5 = this.f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, bz6Var5.b, bz6Var5.a, Shader.TileMode.CLAMP);
        }
        this.b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fC;
        float fC2;
        if (this.f != null) {
            Paint paint = this.b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f.m));
            Rect rect = this.c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.e;
            float f = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            byte b = this.f.c;
            if (b != 1) {
                if (b == 2) {
                    fC2 = ua5.c(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (b != 3) {
                    float f2 = -fHeight;
                    fC2 = ua5.c(fHeight, f2, animatedFraction, f2);
                } else {
                    fC = ua5.c(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f = fC2;
                fC = 0.0f;
            } else {
                float f3 = -fWidth;
                fC = ua5.c(fWidth, f3, animatedFraction, f3);
            }
            Matrix matrix = this.d;
            matrix.reset();
            matrix.setRotate(this.f.m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f, fC);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        bz6 bz6Var = this.f;
        if (bz6Var != null) {
            return (bz6Var.n || bz6Var.p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
