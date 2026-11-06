package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
public final class of6 extends Drawable {
    public final Bitmap a;
    public final BitmapShader d;
    public float f;
    public boolean j;
    public final int k;
    public final int l;
    public final byte b = 119;
    public final Paint c = new Paint(3);
    public final Matrix e = new Matrix();
    public final Rect g = new Rect();
    public final RectF h = new RectF();
    public boolean i = true;

    public of6(Resources resources, Bitmap bitmap) {
        int i = resources != null ? resources.getDisplayMetrics().densityDpi : 160;
        this.a = bitmap;
        if (bitmap == null) {
            this.l = -1;
            this.k = -1;
            this.d = null;
        } else {
            this.k = bitmap.getScaledWidth(i);
            this.l = bitmap.getScaledHeight(i);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.d = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void a(boolean z) {
        this.j = z;
        this.i = true;
        if (!z) {
            b(0.0f);
            return;
        }
        this.f = Math.min(this.l, this.k) / 2;
        this.c.setShader(this.d);
        invalidateSelf();
    }

    public final void b(float f) {
        if (this.f == f) {
            return;
        }
        this.j = false;
        boolean z = f > 0.05f;
        Paint paint = this.c;
        if (z) {
            paint.setShader(this.d);
        } else {
            paint.setShader(null);
        }
        this.f = f;
        invalidateSelf();
    }

    public final void c() {
        if (this.i) {
            boolean z = this.j;
            Rect rect = this.g;
            if (z) {
                int iMin = Math.min(this.k, this.l);
                Gravity.apply(this.b, iMin, iMin, getBounds(), rect, 0);
                int iMin2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - iMin2) / 2), Math.max(0, (rect.height() - iMin2) / 2));
                this.f = iMin2 * 0.5f;
            } else {
                Gravity.apply(this.b, this.k, this.l, getBounds(), rect, 0);
            }
            RectF rectF = this.h;
            rectF.set(rect);
            BitmapShader bitmapShader = this.d;
            if (bitmapShader != null) {
                float f = rectF.left;
                float f2 = rectF.top;
                Matrix matrix = this.e;
                matrix.setTranslate(f, f2);
                float fWidth = rectF.width();
                Bitmap bitmap = this.a;
                matrix.preScale(fWidth / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.c.setShader(bitmapShader);
            }
            this.i = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        c();
        Paint paint = this.c;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.g, paint);
            return;
        }
        RectF rectF = this.h;
        float f = this.f;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.c.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.b != 119 || this.j || (bitmap = this.a) == null || bitmap.hasAlpha() || this.c.getAlpha() < 255 || this.f > 0.05f) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        c();
        outline.setRoundRect(this.g, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.j) {
            this.f = Math.min(this.l, this.k) / 2;
        }
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.c;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.c.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.c.setFilterBitmap(z);
        invalidateSelf();
    }
}
