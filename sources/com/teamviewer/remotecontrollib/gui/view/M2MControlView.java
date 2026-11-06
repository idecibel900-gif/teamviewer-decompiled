package com.teamviewer.remotecontrollib.gui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import o.dj4;
import o.im3;
import o.kb3;
import o.ko0;
import o.ku5;
import o.lb3;
import o.vn4;
import o.yk3;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public final class M2MControlView extends View implements View.OnLayoutChangeListener {
    public static final /* synthetic */ int L = 0;
    public final Paint A;
    public final Paint B;
    public final RectF C;
    public final Path D;
    public final PointF E;
    public final int F;
    public boolean G;
    public final ku5 H;
    public lb3 I;
    public final GestureDetector J;
    public kb3 K;
    public float m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f65o;
    public final int p;
    public int q;
    public final Rect r;
    public final int s;
    public final int t;
    public int u;
    public int v;
    public float w;
    public boolean x;
    public boolean y;
    public final Paint z;

    public M2MControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Rect rect = new Rect();
        this.r = rect;
        this.C = new RectF();
        this.D = new Path();
        this.E = new PointF();
        ku5 ku5Var = new ku5();
        ku5Var.a = 1.0f;
        this.H = ku5Var;
        this.I = lb3.n;
        d();
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (75.0f * f);
        this.f65o = i;
        int i2 = (int) (35.0f * f);
        this.p = i2;
        lb3 lb3Var = this.I;
        lb3 lb3Var2 = lb3.m;
        boolean z = lb3Var == lb3Var2;
        this.G = z;
        int i3 = z ? i : i2;
        this.q = i3;
        dj4.Main.s = lb3Var == lb3Var2;
        int i4 = (int) (f * 20.0f);
        this.F = i4;
        this.s = i4;
        this.t = i4;
        int i5 = i - i3;
        this.u = i5 + i4;
        this.v = i5 + i4;
        int i6 = (i4 + i) - i2;
        int i7 = (i2 * 2) + i6;
        rect.set(i6, i6, i7, i7);
        this.m = getResources().getDisplayMetrics().density;
        Paint paint = new Paint();
        this.z = paint;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.m);
        Paint paint2 = new Paint();
        this.A = paint2;
        paint2.setColor(-16777216);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.B = paint3;
        paint3.setAntiAlias(true);
        this.J = new GestureDetector(getContext(), new ko0(this, (byte) 4));
    }

    public final int a(float f) {
        int i = this.n;
        int i2 = this.I == lb3.n ? this.p : this.f65o;
        int i3 = i - i2;
        ku5 ku5Var = this.H;
        float f2 = i3 - i2;
        int iS0 = vn4.s0(i2 + (ku5Var.a * f2) + f);
        yk3 yk3Var = new yk3(i2, i3, 1);
        if (yk3Var.isEmpty()) {
            yq4.g(46, yk3Var, "Cannot coerce value to an empty range: ");
            return 0;
        }
        if (iS0 < Integer.valueOf(i2).intValue()) {
            iS0 = Integer.valueOf(i2).intValue();
        } else {
            int i4 = yk3Var.n;
            if (iS0 > Integer.valueOf(i4).intValue()) {
                iS0 = Integer.valueOf(i4).intValue();
            }
        }
        ku5Var.a = (iS0 - i2) / f2;
        return iS0;
    }

    public final dj4 b(int i, int i2) {
        int i3 = this.F;
        int i4 = this.f65o;
        int i5 = i - (i3 + i4);
        int i6 = i2 - (i3 + i4);
        float fSqrt = (float) Math.sqrt((i6 * i6) + (i5 * i5));
        lb3 lb3Var = this.I;
        dj4 dj4Var = dj4.Main;
        dj4 dj4Var2 = dj4.Invalid;
        lb3 lb3Var2 = lb3.n;
        int i7 = this.p;
        if (lb3Var == lb3Var2) {
            return fSqrt > ((float) i7) ? dj4Var2 : dj4Var;
        }
        if (fSqrt < i7) {
            return dj4Var;
        }
        if (fSqrt >= i7 && fSqrt < i4) {
            float degrees = (float) Math.toDegrees(Math.atan(i6 / i5));
            if (degrees > 0.0f) {
                degrees -= 180.0f;
            }
            if (degrees <= 0.0f && degrees > -50.0f) {
                return dj4.Right;
            }
            if (degrees <= -50.0f && degrees > -130.0f) {
                return dj4.Middle;
            }
            if (degrees <= -130.0f && degrees > -180.0f) {
                return dj4.Left;
            }
        }
        return dj4Var2;
    }

    public final void c(Canvas canvas, dj4 dj4Var) {
        Canvas canvas2;
        dj4 dj4Var2 = dj4.Main;
        if (dj4Var == dj4Var2) {
            Rect rect = this.r;
            RectF rectF = this.C;
            rectF.set(rect);
            Paint paint = this.A;
            paint.setAlpha(255);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, -180.0f, true, paint);
            Path path = this.D;
            path.reset();
            path.addArc(rectF, 0.0f, -180.0f);
            canvas2.drawPath(path, this.z);
        } else {
            canvas2 = canvas;
        }
        int i = this.p;
        PointF pointF = this.E;
        if (dj4Var == dj4Var2) {
            int i2 = this.u;
            int i3 = this.q;
            pointF.set(i2 + i3, (this.v + i3) - ((i - this.m) / 2.0f));
        } else {
            double radians = Math.toRadians(dj4Var.p + dj4Var.f628o) / 2.0d;
            float f = this.q;
            float f2 = this.m;
            double d = (f - f2) - (((this.f65o - f2) - i) / 2.0f);
            double dCos = Math.cos(radians) * d;
            double dSin = Math.sin(radians) * d;
            float f3 = ((float) dCos) + this.u;
            float f4 = this.q;
            pointF.set(f3 + f4, ((float) dSin) + this.v + f4);
        }
        Bitmap bitmap = (dj4Var.s || dj4Var.n == 0) ? dj4Var.q : dj4Var.r;
        if (bitmap != null) {
            canvas2.drawBitmap(bitmap, pointF.x - (bitmap.getWidth() / 2.0f), pointF.y - (bitmap.getHeight() / 2.0f), this.B);
        }
    }

    public final void d() {
        dj4.Right.a(getResources());
        dj4.Left.a(getResources());
        dj4.Middle.a(getResources());
        dj4.Main.a(getResources());
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.addOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
        float f = getResources().getDisplayMetrics().density;
        this.m = f;
        this.z.setStrokeWidth(f);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        if (this.G) {
            int i = this.u;
            int i2 = this.v;
            int i3 = this.q;
            RectF rectF = this.C;
            rectF.set(i, i2, (i3 * 2) + i, (i3 * 2) + i2);
            Paint paint = this.A;
            paint.setAlpha(191);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, -180.0f, true, paint);
            Path path = this.D;
            path.reset();
            path.addArc(rectF, 0.0f, -180.0f);
            canvas2.drawPath(path, this.z);
            c(canvas2, dj4.Right);
            c(canvas2, dj4.Middle);
            c(canvas2, dj4.Left);
        } else {
            canvas2 = canvas;
        }
        c(canvas2, dj4.Main);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        this.n = i3 - i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = this.n - ((a(0.0f) + this.f65o) + this.F);
        setLayoutParams(marginLayoutParams);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f65o;
        int i4 = this.F;
        setMeasuredDimension((i3 + i4) * 2, i3 + i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        GestureDetector gestureDetector = this.J;
        if (im3.n(gestureDetector != null ? Boolean.valueOf(gestureDetector.onTouchEvent(motionEvent)) : null, Boolean.TRUE)) {
            performClick();
        }
        int actionMasked = motionEvent.getActionMasked();
        dj4 dj4VarB = b((int) motionEvent.getX(), (int) motionEvent.getY());
        dj4 dj4Var = dj4.Main;
        lb3 lb3Var = lb3.n;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 6) {
                            return true;
                        }
                        this.w = motionEvent.getRawX();
                        return true;
                    }
                } else if ((this.x && this.y) || this.I != lb3Var || dj4VarB == dj4Var) {
                    this.y = true;
                    int iA = a(motionEvent.getRawX() - this.w);
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    layoutParams.getClass();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.rightMargin = this.n - ((iA + this.f65o) + this.F);
                    setLayoutParams(marginLayoutParams);
                    invalidate();
                    this.w = motionEvent.getRawX();
                    return true;
                }
            }
            this.x = false;
            this.y = true;
            return true;
        }
        if (this.I != lb3Var || dj4VarB == dj4Var) {
            this.x = true;
            this.w = motionEvent.getRawX();
            return true;
        }
        return false;
    }

    public final void setMiddleButtonEnabled(boolean z) {
        dj4.Middle.s = z;
    }

    public final void setTouchInterceptor(kb3 kb3Var) {
        this.K = kb3Var;
    }
}
