package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class qn4 extends Drawable implements sx6 {
    public static final Paint I = new Paint(1);
    public final Paint A;
    public final nw6 B;
    public final nx3 C;
    public final au2 D;
    public PorterDuffColorFilter E;
    public PorterDuffColorFilter F;
    public final RectF G;
    public boolean H;
    public pn4 m;
    public final jx6[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jx6[] f1848o;
    public final BitSet p;
    public boolean q;
    public final Matrix r;
    public final Path s;
    public final Path t;
    public final RectF u;
    public final RectF v;
    public final Region w;
    public final Region x;
    public qw6 y;
    public final Paint z;

    public qn4(pn4 pn4Var) {
        this.n = new jx6[4];
        this.f1848o = new jx6[4];
        this.p = new BitSet(8);
        this.r = new Matrix();
        this.s = new Path();
        this.t = new Path();
        this.u = new RectF();
        this.v = new RectF();
        this.w = new Region();
        this.x = new Region();
        Paint paint = new Paint(1);
        this.z = paint;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new nw6();
        this.D = Looper.getMainLooper().getThread() == Thread.currentThread() ? rw6.a : new au2((byte) 4);
        this.G = new RectF();
        this.H = true;
        this.m = pn4Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = I;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        p();
        o(getState());
        this.C = new nx3((Object) this, (byte) 18);
    }

    public final void b(RectF rectF, Path path) {
        pn4 pn4Var = this.m;
        this.D.a(pn4Var.a, pn4Var.i, rectF, this.C, path);
        if (this.m.h != 1.0f) {
            Matrix matrix = this.r;
            matrix.reset();
            float f = this.m.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.G, true);
    }

    public final int c(int i) {
        pn4 pn4Var = this.m;
        float f = pn4Var.m + 0.0f + pn4Var.l;
        t82 t82Var = pn4Var.b;
        return t82Var != null ? t82Var.a(i, f) : i;
    }

    public final void d(Canvas canvas) {
        if (this.p.cardinality() > 0) {
            io.sentry.android.core.v0.j("qn4", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.m.f1751o;
        Path path = this.s;
        nw6 nw6Var = this.B;
        if (i != 0) {
            canvas.drawPath(path, nw6Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            jx6 jx6Var = this.n[i2];
            int i3 = this.m.n;
            Matrix matrix = jx6.a;
            jx6Var.a(matrix, nw6Var, i3, canvas);
            this.f1848o[i2].a(matrix, nw6Var, this.m.n, canvas);
        }
        if (this.H) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.m.f1751o));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.m.f1751o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, I);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF;
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.E;
        Paint paint2 = this.z;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.m.k;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.F;
        Paint paint3 = this.A;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.m.j);
        int alpha2 = paint3.getAlpha();
        int i2 = this.m.k;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.q;
        RectF rectF2 = this.v;
        Path path = this.t;
        Path path2 = this.s;
        if (z) {
            float f = -(h() ? paint3.getStrokeWidth() / 2.0f : 0.0f);
            qw6 qw6Var = this.m.a;
            y85 y85VarE = qw6Var.e();
            zd1 hcVar = qw6Var.e;
            if (!(hcVar instanceof m96)) {
                hcVar = new hc(f, hcVar);
            }
            y85VarE.e = hcVar;
            zd1 hcVar2 = qw6Var.f;
            if (!(hcVar2 instanceof m96)) {
                hcVar2 = new hc(f, hcVar2);
            }
            y85VarE.f = hcVar2;
            zd1 hcVar3 = qw6Var.h;
            if (!(hcVar3 instanceof m96)) {
                hcVar3 = new hc(f, hcVar3);
            }
            y85VarE.h = hcVar3;
            zd1 hcVar4 = qw6Var.g;
            if (!(hcVar4 instanceof m96)) {
                hcVar4 = new hc(f, hcVar4);
            }
            y85VarE.g = hcVar4;
            qw6 qw6VarA = y85VarE.a();
            this.y = qw6VarA;
            float f2 = this.m.i;
            rectF2.set(f());
            float strokeWidth = h() ? paint3.getStrokeWidth() / 2.0f : 0.0f;
            rectF2.inset(strokeWidth, strokeWidth);
            rectF = rectF2;
            this.D.a(qw6VarA, f2, rectF, null, path);
            b(f(), path2);
            this.q = false;
        } else {
            rectF = rectF2;
        }
        pn4 pn4Var = this.m;
        pn4Var.getClass();
        if (pn4Var.n > 0 && !j() && !path2.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas.translate((int) (((double) this.m.f1751o) * Math.sin(Math.toRadians(0.0d))), (int) (((double) this.m.f1751o) * Math.cos(Math.toRadians(0.0d))));
            if (this.H) {
                RectF rectF3 = this.G;
                int iWidth = (int) (rectF3.width() - getBounds().width());
                int iHeight = (int) (rectF3.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    hk0.l("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.m.n * 2) + ((int) rectF3.width()) + iWidth, (this.m.n * 2) + ((int) rectF3.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f3 = (getBounds().left - this.m.n) - iWidth;
                float f4 = (getBounds().top - this.m.n) - iHeight;
                canvas2.translate(-f3, -f4);
                d(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                d(canvas);
                canvas.restore();
            }
        }
        pn4 pn4Var2 = this.m;
        Paint.Style style = pn4Var2.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint2, path2, pn4Var2.a, f());
        }
        if (h()) {
            qw6 qw6Var2 = this.y;
            rectF.set(f());
            float strokeWidth2 = h() ? paint3.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth2, strokeWidth2);
            paint = paint3;
            e(canvas, paint, path, qw6Var2, rectF);
        } else {
            paint = paint3;
        }
        paint2.setAlpha(alpha);
        paint.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, qw6 qw6Var, RectF rectF) {
        if (!qw6Var.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = qw6Var.f.a(rectF) * this.m.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public final RectF f() {
        Rect bounds = getBounds();
        RectF rectF = this.u;
        rectF.set(bounds);
        return rectF;
    }

    public final float g() {
        return this.m.a.e.a(f());
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.m.getClass();
        if (j()) {
            outline.setRoundRect(getBounds(), g() * this.m.i);
            return;
        }
        RectF rectFF = f();
        Path path = this.s;
        b(rectFF, path);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.m.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.w;
        region.set(bounds);
        RectF rectFF = f();
        Path path = this.s;
        b(rectFF, path);
        Region region2 = this.x;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.m.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.A.getStrokeWidth() > 0.0f;
    }

    public final void i(Context context) {
        this.m.b = new t82(context);
        q();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.q = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.m.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.m.getClass();
        ColorStateList colorStateList2 = this.m.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.m.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final boolean j() {
        return this.m.a.d(f());
    }

    public final void k(float f) {
        pn4 pn4Var = this.m;
        if (pn4Var.m != f) {
            pn4Var.m = f;
            q();
        }
    }

    public final void l(ColorStateList colorStateList) {
        pn4 pn4Var = this.m;
        if (pn4Var.c != colorStateList) {
            pn4Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m(float f) {
        pn4 pn4Var = this.m;
        if (pn4Var.i != f) {
            pn4Var.i = f;
            this.q = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        pn4 pn4Var = this.m;
        pn4 pn4Var2 = new pn4();
        pn4Var2.c = null;
        pn4Var2.d = null;
        pn4Var2.e = null;
        pn4Var2.f = PorterDuff.Mode.SRC_IN;
        pn4Var2.g = null;
        pn4Var2.h = 1.0f;
        pn4Var2.i = 1.0f;
        pn4Var2.k = 255;
        pn4Var2.l = 0.0f;
        pn4Var2.m = 0.0f;
        pn4Var2.n = 0;
        pn4Var2.f1751o = 0;
        pn4Var2.p = Paint.Style.FILL_AND_STROKE;
        pn4Var2.a = pn4Var.a;
        pn4Var2.b = pn4Var.b;
        pn4Var2.j = pn4Var.j;
        pn4Var2.c = pn4Var.c;
        pn4Var2.d = pn4Var.d;
        pn4Var2.f = pn4Var.f;
        pn4Var2.e = pn4Var.e;
        pn4Var2.k = pn4Var.k;
        pn4Var2.h = pn4Var.h;
        pn4Var2.f1751o = pn4Var.f1751o;
        pn4Var2.i = pn4Var.i;
        pn4Var2.l = pn4Var.l;
        pn4Var2.m = pn4Var.m;
        pn4Var2.n = pn4Var.n;
        pn4Var2.p = pn4Var.p;
        if (pn4Var.g != null) {
            pn4Var2.g = new Rect(pn4Var.g);
        }
        this.m = pn4Var2;
        return this;
    }

    public final void n() {
        this.B.a(-12303292);
        this.m.getClass();
        super.invalidateSelf();
    }

    public final boolean o(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.m.c == null || color2 == (colorForState2 = this.m.c.getColorForState(iArr, (color2 = (paint2 = this.z).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.m.d == null || color == (colorForState = this.m.d.getColorForState(iArr, (color = (paint = this.A).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.q = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, o.aq7
    public boolean onStateChange(int[] iArr) {
        boolean z = o(iArr) || p();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.E;
        PorterDuffColorFilter porterDuffColorFilter3 = this.F;
        pn4 pn4Var = this.m;
        ColorStateList colorStateList = pn4Var.e;
        PorterDuff.Mode mode = pn4Var.f;
        if (colorStateList == null || mode == null) {
            int color = this.z.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.E = porterDuffColorFilter;
        this.m.getClass();
        this.F = null;
        this.m.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.E) && Objects.equals(porterDuffColorFilter3, this.F)) ? false : true;
    }

    public final void q() {
        pn4 pn4Var = this.m;
        float f = pn4Var.m + 0.0f;
        pn4Var.n = (int) Math.ceil(0.75f * f);
        this.m.f1751o = (int) Math.ceil(f * 0.25f);
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        pn4 pn4Var = this.m;
        if (pn4Var.k != i) {
            pn4Var.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.m.getClass();
        super.invalidateSelf();
    }

    @Override // o.sx6
    public final void setShapeAppearanceModel(qw6 qw6Var) {
        this.m.a = qw6Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.m.e = colorStateList;
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        pn4 pn4Var = this.m;
        if (pn4Var.f != mode) {
            pn4Var.f = mode;
            p();
            super.invalidateSelf();
        }
    }

    public qn4(Context context, AttributeSet attributeSet, int i, int i2) {
        this(qw6.b(context, attributeSet, i, i2).a());
    }

    public qn4(qw6 qw6Var) {
        pn4 pn4Var = new pn4();
        pn4Var.c = null;
        pn4Var.d = null;
        pn4Var.e = null;
        pn4Var.f = PorterDuff.Mode.SRC_IN;
        pn4Var.g = null;
        pn4Var.h = 1.0f;
        pn4Var.i = 1.0f;
        pn4Var.k = 255;
        pn4Var.l = 0.0f;
        pn4Var.m = 0.0f;
        pn4Var.n = 0;
        pn4Var.f1751o = 0;
        pn4Var.p = Paint.Style.FILL_AND_STROKE;
        pn4Var.a = qw6Var;
        pn4Var.b = null;
        this(pn4Var);
    }

    public qn4() {
        this(new qw6());
    }
}
