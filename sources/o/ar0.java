package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ar0 extends qn4 implements Drawable.Callback, aq7 {
    public static final int[] R0 = {R.attr.state_enabled};
    public static final ShapeDrawable S0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public boolean D0;
    public int E0;
    public int F0;
    public ColorFilter G0;
    public PorterDuffColorFilter H0;
    public ColorStateList I0;
    public ColorStateList J;
    public PorterDuff.Mode J0;
    public ColorStateList K;
    public int[] K0;
    public float L;
    public ColorStateList L0;
    public float M;
    public WeakReference M0;
    public ColorStateList N;
    public TextUtils.TruncateAt N0;
    public float O;
    public boolean O0;
    public ColorStateList P;
    public int P0;
    public CharSequence Q;
    public boolean Q0;
    public boolean R;
    public Drawable S;
    public ColorStateList T;
    public float U;
    public boolean V;
    public boolean W;
    public Drawable X;
    public RippleDrawable Y;
    public ColorStateList Z;
    public float a0;
    public SpannableStringBuilder b0;
    public boolean c0;
    public boolean d0;
    public Drawable e0;
    public ColorStateList f0;
    public eu4 g0;
    public eu4 h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public final Context q0;
    public final Paint r0;
    public final Paint.FontMetrics s0;
    public final RectF t0;
    public final PointF u0;
    public final Path v0;
    public final bq7 w0;
    public int x0;
    public int y0;
    public int z0;

    public ar0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.chipStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Chip_Action);
        this.M = -1.0f;
        this.r0 = new Paint(1);
        this.s0 = new Paint.FontMetrics();
        this.t0 = new RectF();
        this.u0 = new PointF();
        this.v0 = new Path();
        this.F0 = 255;
        this.J0 = PorterDuff.Mode.SRC_IN;
        this.M0 = new WeakReference(null);
        i(context);
        this.q0 = context;
        bq7 bq7Var = new bq7(this);
        this.w0 = bq7Var;
        this.Q = "";
        bq7Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = R0;
        setState(iArr);
        if (!Arrays.equals(this.K0, iArr)) {
            this.K0 = iArr;
            if (W()) {
                z(getState(), iArr);
            }
        }
        this.O0 = true;
        int[] iArr2 = oe6.a;
        S0.setTint(-1);
    }

    public static void X(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean w(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean x(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            float fT = t();
            if (!z && this.D0) {
                this.D0 = false;
            }
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void B(Drawable drawable) {
        if (this.e0 != drawable) {
            float fT = t();
            this.e0 = drawable;
            float fT2 = t();
            X(this.e0);
            r(this.e0);
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f0 != colorStateList) {
            this.f0 = colorStateList;
            if (this.d0 && (drawable = this.e0) != null && this.c0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D(boolean z) {
        if (this.d0 != z) {
            boolean zU = U();
            this.d0 = z;
            boolean zU2 = U();
            if (zU != zU2) {
                Drawable drawable = this.e0;
                if (zU2) {
                    r(drawable);
                } else {
                    X(drawable);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void E(float f) {
        if (this.M != f) {
            this.M = f;
            y85 y85VarE = this.m.a.e();
            y85VarE.e = new n(f);
            y85VarE.f = new n(f);
            y85VarE.g = new n(f);
            y85VarE.h = new n(f);
            setShapeAppearanceModel(y85VarE.a());
        }
    }

    public final void F(Drawable drawable) {
        Drawable drawable2 = this.S;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fT = t();
            this.S = drawable != null ? drawable.mutate() : null;
            float fT2 = t();
            X(drawable2);
            if (V()) {
                r(this.S);
            }
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void G(float f) {
        if (this.U != f) {
            float fT = t();
            this.U = f;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        this.V = true;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (V()) {
                this.S.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z) {
        if (this.R != z) {
            boolean zV = V();
            this.R = z;
            boolean zV2 = V();
            if (zV != zV2) {
                Drawable drawable = this.S;
                if (zV2) {
                    r(drawable);
                } else {
                    X(drawable);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (this.Q0) {
                pn4 pn4Var = this.m;
                if (pn4Var.d != colorStateList) {
                    pn4Var.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void K(float f) {
        if (this.O != f) {
            this.O = f;
            this.r0.setStrokeWidth(f);
            if (this.Q0) {
                this.m.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void L(Drawable drawable) {
        Drawable drawable2 = this.X;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fU = u();
            this.X = drawable != null ? drawable.mutate() : null;
            int[] iArr = oe6.a;
            this.Y = new RippleDrawable(oe6.b(this.P), this.X, S0);
            float fU2 = u();
            X(drawable2);
            if (W()) {
                r(this.X);
            }
            invalidateSelf();
            if (fU != fU2) {
                y();
            }
        }
    }

    public final void M(float f) {
        if (this.o0 != f) {
            this.o0 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void N(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void O(float f) {
        if (this.n0 != f) {
            this.n0 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (W()) {
                this.X.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z) {
        if (this.W != z) {
            boolean zW = W();
            this.W = z;
            boolean zW2 = W();
            if (zW != zW2) {
                Drawable drawable = this.X;
                if (zW2) {
                    r(drawable);
                } else {
                    X(drawable);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void R(float f) {
        if (this.k0 != f) {
            float fT = t();
            this.k0 = f;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void S(float f) {
        if (this.j0 != f) {
            float fT = t();
            this.j0 = f;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            this.L0 = null;
            onStateChange(getState());
        }
    }

    public final boolean U() {
        return this.d0 && this.e0 != null && this.D0;
    }

    public final boolean V() {
        return this.R && this.S != null;
    }

    public final boolean W() {
        return this.W && this.X != null;
    }

    @Override // o.aq7
    public final void a() {
        y();
        invalidateSelf();
    }

    @Override // o.qn4, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.F0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.Q0;
        Paint paint = this.r0;
        RectF rectF = this.t0;
        if (!z) {
            paint.setColor(this.x0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, v(), v(), paint);
        }
        if (!this.Q0) {
            paint.setColor(this.y0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.G0;
            if (colorFilter == null) {
                colorFilter = this.H0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, v(), v(), paint);
        }
        if (this.Q0) {
            super.draw(canvas);
        }
        if (this.O > 0.0f && !this.Q0) {
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.Q0) {
                ColorFilter colorFilter2 = this.G0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.H0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.O / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.M - (this.O / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.B0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.Q0) {
            RectF rectF2 = new RectF(bounds);
            pn4 pn4Var = this.m;
            qw6 qw6Var = pn4Var.a;
            float f4 = pn4Var.i;
            nx3 nx3Var = this.C;
            au2 au2Var = this.D;
            Path path = this.v0;
            au2Var.a(qw6Var, f4, rectF2, nx3Var, path);
            e(canvas2, paint, path, this.m.a, f());
        } else {
            canvas2.drawRoundRect(rectF, v(), v(), paint);
        }
        if (V()) {
            s(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.S.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.S.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (U()) {
            s(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.e0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.e0.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.O0 && this.Q != null) {
            PointF pointF = this.u0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.Q;
            bq7 bq7Var = this.w0;
            if (charSequence != null) {
                float fT = t() + this.i0 + this.l0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fT;
                } else {
                    pointF.x = bounds.right - fT;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = bq7Var.a;
                Paint.FontMetrics fontMetrics = this.s0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.Q != null) {
                float fT2 = t() + this.i0 + this.l0;
                float fU = u() + this.p0 + this.m0;
                int layoutDirection = getLayoutDirection();
                int i3 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i3 + fT2;
                    rectF.right = bounds.right - fU;
                } else {
                    rectF.left = i3 + fU;
                    rectF.right = bounds.right - fT2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            ap7 ap7Var = bq7Var.f;
            TextPaint textPaint2 = bq7Var.a;
            if (ap7Var != null) {
                textPaint2.drawableState = getState();
                bq7Var.f.e(this.q0, textPaint2, bq7Var.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(bq7Var.a(this.Q.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.Q;
            if (z2 && this.N0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.N0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (W()) {
            rectF.setEmpty();
            if (W()) {
                float f9 = this.p0 + this.o0;
                if (getLayoutDirection() == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.a0;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.a0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.a0;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.X.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = oe6.a;
            this.Y.setBounds(this.X.getBounds());
            this.Y.jumpToCurrentState();
            this.Y.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.F0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.F0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.G0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(u() + this.w0.a(this.Q.toString()) + t() + this.i0 + this.l0 + this.m0 + this.p0), this.P0);
    }

    @Override // o.qn4, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // o.qn4, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.Q0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.L, this.M);
        } else {
            outline.setRoundRect(bounds, this.M);
            outline2 = outline;
        }
        outline2.setAlpha(this.F0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // o.qn4, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (w(this.J) || w(this.K) || w(this.N)) {
            return true;
        }
        ap7 ap7Var = this.w0.f;
        if (ap7Var == null || (colorStateList = ap7Var.a) == null || !colorStateList.isStateful()) {
            return (this.d0 && this.e0 != null && this.c0) || x(this.S) || x(this.e0) || w(this.I0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (V()) {
            zOnLayoutDirectionChanged |= this.S.setLayoutDirection(i);
        }
        if (U()) {
            zOnLayoutDirectionChanged |= this.e0.setLayoutDirection(i);
        }
        if (W()) {
            zOnLayoutDirectionChanged |= this.X.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (V()) {
            zOnLevelChange |= this.S.setLevel(i);
        }
        if (U()) {
            zOnLevelChange |= this.e0.setLevel(i);
        }
        if (W()) {
            zOnLevelChange |= this.X.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // o.qn4, android.graphics.drawable.Drawable, o.aq7
    public final boolean onStateChange(int[] iArr) {
        if (this.Q0) {
            super.onStateChange(iArr);
        }
        return z(iArr, this.K0);
    }

    public final void r(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.X) {
            if (drawable.isStateful()) {
                drawable.setState(this.K0);
            }
            drawable.setTintList(this.Z);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.S;
        if (drawable == drawable2 && this.V) {
            drawable2.setTintList(this.T);
        }
    }

    public final void s(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (V() || U()) {
            float f = this.i0 + this.j0;
            Drawable drawable = this.D0 ? this.e0 : this.S;
            float intrinsicWidth = this.U;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.D0 ? this.e0 : this.S;
            float fCeil = this.U;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(x67.k(this.q0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // o.qn4, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.F0 != i) {
            this.F0 = i;
            invalidateSelf();
        }
    }

    @Override // o.qn4, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.G0 != colorFilter) {
            this.G0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // o.qn4, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            this.I0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // o.qn4, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.J0 != mode) {
            this.J0 = mode;
            ColorStateList colorStateList = this.I0;
            this.H0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (V()) {
            visible |= this.S.setVisible(z, z2);
        }
        if (U()) {
            visible |= this.e0.setVisible(z, z2);
        }
        if (W()) {
            visible |= this.X.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        if (!V() && !U()) {
            return 0.0f;
        }
        float f = this.j0;
        Drawable drawable = this.D0 ? this.e0 : this.S;
        float intrinsicWidth = this.U;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.k0;
    }

    public final float u() {
        if (W()) {
            return this.n0 + this.a0 + this.o0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        return this.Q0 ? g() : this.M;
    }

    public final void y() {
        Chip chip = (Chip) this.M0.get();
        if (chip != null) {
            chip.c(chip.B);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean z(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.J;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.x0) : 0);
        boolean state = true;
        if (this.x0 != iC) {
            this.x0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.K;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.y0) : 0);
        if (this.y0 != iC2) {
            this.y0 = iC2;
            zOnStateChange = true;
        }
        int iB = hw0.b(iC2, iC);
        if ((this.z0 != iB) | (this.m.c == null)) {
            this.z0 = iB;
            l(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.N;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.A0) : 0;
        if (this.A0 != colorForState) {
            this.A0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.L0 == null || !oe6.c(iArr)) ? 0 : this.L0.getColorForState(iArr, this.B0);
        if (this.B0 != colorForState2) {
            this.B0 = colorForState2;
        }
        ap7 ap7Var = this.w0.f;
        int colorForState3 = (ap7Var == null || (colorStateList = ap7Var.a) == null) ? 0 : colorStateList.getColorForState(iArr, this.C0);
        if (this.C0 != colorForState3) {
            this.C0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (state2[i] != 16842912) {
                        i++;
                    } else if (this.c0) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        if (this.D0 == z || this.e0 == null) {
            z2 = false;
        } else {
            float fT = t();
            this.D0 = z;
            if (fT != t()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.I0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.E0) : 0;
        if (this.E0 != colorForState4) {
            this.E0 = colorForState4;
            ColorStateList colorStateList6 = this.I0;
            PorterDuff.Mode mode = this.J0;
            this.H0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (x(this.S)) {
            state |= this.S.setState(iArr);
        }
        if (x(this.e0)) {
            state |= this.e0.setState(iArr);
        }
        if (x(this.X)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.X.setState(iArr3);
        }
        int[] iArr4 = oe6.a;
        if (x(this.Y)) {
            state |= this.Y.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            y();
        }
        return state;
    }
}
