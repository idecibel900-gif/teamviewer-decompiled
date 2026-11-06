package o;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ei4 extends Drawable implements Drawable.Callback, Animatable {
    public static final List S = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor T = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new li4());
    public Canvas A;
    public Rect B;
    public RectF C;
    public wz3 D;
    public Rect E;
    public Rect F;
    public RectF G;
    public RectF H;
    public Matrix I;
    public final float[] J;
    public Matrix K;
    public boolean L;
    public final Semaphore M;
    public final pc0 N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public qh4 m;
    public final mi4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f716o;
    public final ArrayList p;
    public iu q;
    public j93 r;
    public final mg1 s;
    public boolean t;
    public t01 u;
    public int v;
    public boolean w;
    public boolean x;
    public final Matrix y;
    public Bitmap z;

    public ei4() {
        mi4 mi4Var = new mi4();
        this.n = mi4Var;
        this.f716o = true;
        this.P = 1;
        this.p = new ArrayList();
        this.s = new mg1((byte) 1);
        this.t = true;
        this.v = 255;
        this.Q = 1;
        this.x = false;
        this.y = new Matrix();
        this.J = new float[9];
        this.L = false;
        ai4 ai4Var = new ai4(this, (byte) 0);
        this.M = new Semaphore(1);
        this.N = new pc0((Object) this, (byte) 19);
        this.O = -3.4028235E38f;
        mi4Var.addUpdateListener(ai4Var);
    }

    public static void d(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean h(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final boolean a(Context context) {
        if (!this.f716o) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = ta8.a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void b() {
        qh4 qh4Var = this.m;
        if (qh4Var == null) {
            return;
        }
        jr3 jr3Var = e04.a;
        Rect rect = qh4Var.k;
        List list = Collections.EMPTY_LIST;
        t01 t01Var = new t01(this, new c04(list, qh4Var, "__container", -1L, 1, -1L, null, list, new rm(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), qh4Var.j, qh4Var);
        this.u = t01Var;
        t01Var.J = this.t;
    }

    public final void c() {
        qh4 qh4Var = this.m;
        if (qh4Var == null) {
            return;
        }
        int i = this.Q;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = qh4Var.f1831o;
        int i3 = qh4Var.p;
        int iB = ua5.B(i);
        boolean z2 = false;
        if (iB != 1 && (iB == 2 || ((z && i2 < 28) || i3 > 4))) {
            z2 = true;
        }
        this.x = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float fA;
        t01 t01Var = this.u;
        if (t01Var == null) {
            return;
        }
        int i = this.R;
        if (i == 0) {
            i = 1;
        }
        boolean z = i == 2;
        pc0 pc0Var = this.N;
        ThreadPoolExecutor threadPoolExecutor = T;
        mi4 mi4Var = this.n;
        Semaphore semaphore = this.M;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (z) {
                    if (f != fA) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            } finally {
                if (z) {
                    semaphore.release();
                    if (t01Var.I != mi4Var.a()) {
                        threadPoolExecutor.execute(pc0Var);
                    }
                }
            }
        }
        if (z && n()) {
            m(mi4Var.a());
        }
        if (this.x) {
            j(canvas, t01Var);
        } else {
            e(canvas);
        }
        this.L = false;
    }

    public final void e(Canvas canvas) {
        t01 t01Var = this.u;
        qh4 qh4Var = this.m;
        if (t01Var == null || qh4Var == null) {
            return;
        }
        Matrix matrix = this.y;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / qh4Var.k.width();
            float fHeight = bounds.height() / qh4Var.k.height();
            matrix.preTranslate(bounds.left, bounds.top);
            matrix.preScale(fWidth, fHeight);
        }
        t01Var.f(canvas, matrix, this.v, null);
    }

    public final Context f() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final ym4 g() {
        ym4 ym4Var = null;
        for (String str : S) {
            qh4 qh4Var = this.m;
            int size = qh4Var.g.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    ym4Var = null;
                    break;
                }
                ym4 ym4Var2 = (ym4) qh4Var.g.get(i);
                String str2 = ym4Var2.a;
                if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                    ym4Var = ym4Var2;
                    break;
                }
                i++;
            }
            if (ym4Var != null) {
                break;
            }
        }
        return ym4Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.v;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        qh4 qh4Var = this.m;
        if (qh4Var == null) {
            return -1;
        }
        return qh4Var.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        qh4 qh4Var = this.m;
        if (qh4Var == null) {
            return -1;
        }
        return qh4Var.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void i() {
        if (this.u == null) {
            this.p.add(new zh4(this, (byte) 1));
            return;
        }
        c();
        boolean zA = a(f());
        mi4 mi4Var = this.n;
        if (zA || mi4Var.getRepeatCount() == 0) {
            if (isVisible()) {
                mi4Var.y = true;
                boolean zD = mi4Var.d();
                Iterator it = mi4Var.n.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(mi4Var, zD);
                }
                mi4Var.i((int) (mi4Var.d() ? mi4Var.b() : mi4Var.c()));
                mi4Var.r = 0L;
                mi4Var.u = 0;
                if (mi4Var.y) {
                    mi4Var.h(false);
                    Choreographer.getInstance().postFrameCallback(mi4Var);
                }
                this.P = 1;
            } else {
                this.P = 2;
            }
        }
        if (a(f())) {
            return;
        }
        ym4 ym4VarG = g();
        if (ym4VarG != null) {
            l((int) ym4VarG.b);
        } else {
            l((int) (mi4Var.p < 0.0f ? mi4Var.c() : mi4Var.b()));
        }
        mi4Var.h(true);
        mi4Var.e(mi4Var.d());
        if (isVisible()) {
            return;
        }
        this.P = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.L) {
            return;
        }
        this.L = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        mi4 mi4Var = this.n;
        if (mi4Var == null) {
            return false;
        }
        return mi4Var.y;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d3  */
    public final void j(Canvas canvas, t01 t01Var) {
        boolean z;
        if (this.m == null || t01Var == null) {
            return;
        }
        if (this.A == null) {
            this.A = new Canvas();
            this.H = new RectF();
            this.I = new Matrix();
            this.K = new Matrix();
            this.B = new Rect();
            this.C = new RectF();
            this.D = new wz3();
            this.E = new Rect();
            this.F = new Rect();
            this.G = new RectF();
        }
        canvas.getMatrix(this.I);
        canvas.getClipBounds(this.B);
        Rect rect = this.B;
        this.C.set(rect.left, rect.top, rect.right, rect.bottom);
        this.I.mapRect(this.C);
        d(this.B, this.C);
        boolean z2 = this.t;
        RectF rectF = this.H;
        if (z2) {
            rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            t01Var.c(rectF, null, false);
        }
        this.I.mapRect(this.H);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.H;
        rectF2.set(rectF2.left * fWidth, rectF2.top * fHeight, rectF2.right * fWidth, rectF2.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF3 = this.H;
            Rect rect2 = this.B;
            rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        RectF rectF4 = this.H;
        if (!h(rectF4.left) || !h(rectF4.top) || !h(rectF4.right) || !h(rectF4.bottom)) {
            xe4.a("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int iCeil = (int) Math.ceil(this.H.width());
        int iCeil2 = (int) Math.ceil(this.H.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            xe4.a("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j = ((long) iCeil) * ((long) iCeil2);
        if (j > 50000000) {
            xe4.a("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + ")");
            return;
        }
        Bitmap bitmap = this.z;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.z.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.z = bitmapCreateBitmap;
            this.A.setBitmap(bitmapCreateBitmap);
            this.L = true;
        } else if (this.z.getWidth() > iCeil || this.z.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.z, 0, 0, iCeil, iCeil2);
            this.z = bitmapCreateBitmap2;
            this.A.setBitmap(bitmapCreateBitmap2);
            this.L = true;
        }
        if (this.L) {
            Matrix matrix = this.I;
            float[] fArr = this.J;
            matrix.getValues(fArr);
            float f = fArr[0];
            float f2 = fArr[4];
            Matrix matrix2 = this.I;
            Matrix matrix3 = this.y;
            matrix3.set(matrix2);
            matrix3.preScale(fWidth, fHeight);
            RectF rectF5 = this.H;
            matrix3.postTranslate(-rectF5.left, -rectF5.top);
            matrix3.postScale(1.0f / f, 1.0f / f2);
            this.z.eraseColor(0);
            this.A.setMatrix(ta8.a);
            this.A.scale(f, f2);
            t01Var.f(this.A, matrix3, this.v, null);
            this.I.invert(this.K);
            this.K.mapRect(this.G, this.H);
            d(this.F, this.G);
        }
        this.E.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.z, this.E, this.F, this.D);
    }

    public final void k() {
        if (this.u == null) {
            this.p.add(new zh4(this, (byte) 0));
            return;
        }
        c();
        boolean zA = a(f());
        mi4 mi4Var = this.n;
        if (zA || mi4Var.getRepeatCount() == 0) {
            if (isVisible()) {
                mi4Var.y = true;
                mi4Var.h(false);
                Choreographer.getInstance().postFrameCallback(mi4Var);
                mi4Var.r = 0L;
                if (mi4Var.d() && mi4Var.t == mi4Var.c()) {
                    mi4Var.i(mi4Var.b());
                } else if (!mi4Var.d() && mi4Var.t == mi4Var.b()) {
                    mi4Var.i(mi4Var.c());
                }
                Iterator it = mi4Var.f1472o.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(mi4Var);
                }
                this.P = 1;
            } else {
                this.P = 3;
            }
        }
        if (a(f())) {
            return;
        }
        l((int) (mi4Var.p < 0.0f ? mi4Var.c() : mi4Var.b()));
        mi4Var.h(true);
        mi4Var.e(mi4Var.d());
        if (isVisible()) {
            return;
        }
        this.P = 1;
    }

    public final void l(final int i) {
        if (this.m != null) {
            this.n.i(i);
        } else {
            this.p.add(new di4() { // from class: o.ci4
                @Override // o.di4
                public final void run() {
                    this.a.l(i);
                }
            });
        }
    }

    public final void m(final float f) {
        qh4 qh4Var = this.m;
        if (qh4Var == null) {
            this.p.add(new di4() { // from class: o.bi4
                @Override // o.di4
                public final void run() {
                    this.a.m(f);
                }
            });
        } else {
            this.n.i(lr4.e(qh4Var.l, qh4Var.m, f));
        }
    }

    public final boolean n() {
        qh4 qh4Var = this.m;
        if (qh4Var == null) {
            return false;
        }
        float f = this.O;
        float fA = this.n.a();
        this.O = fA;
        return Math.abs(fA - f) * qh4Var.b() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.v = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        xe4.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.P;
            if (i == 2) {
                i();
                return visible;
            }
            if (i == 3) {
                k();
                return visible;
            }
        } else {
            mi4 mi4Var = this.n;
            if (mi4Var.y) {
                this.p.clear();
                mi4Var.h(true);
                Iterator it = mi4Var.f1472o.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(mi4Var);
                }
                if (!isVisible()) {
                    this.P = 1;
                }
                this.P = 3;
                return visible;
            }
            if (zIsVisible) {
                this.P = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        i();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.p.clear();
        mi4 mi4Var = this.n;
        mi4Var.h(true);
        mi4Var.e(mi4Var.d());
        if (isVisible()) {
            return;
        }
        this.P = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
