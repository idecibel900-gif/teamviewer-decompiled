package com.teamviewer.remotecontrollib.gui;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import o.a1;
import o.au2;
import o.bf1;
import o.bz4;
import o.da3;
import o.du6;
import o.fc1;
import o.gx;
import o.h57;
import o.hk0;
import o.hm3;
import o.i12;
import o.im3;
import o.j22;
import o.j97;
import o.l26;
import o.l97;
import o.mo7;
import o.n26;
import o.n87;
import o.na3;
import o.pn5;
import o.sx4;
import o.tt0;
import o.ut0;
import o.v97;
import o.ve8;
import o.vt0;
import o.vt1;
import o.w86;
import o.wa3;
import o.wc3;
import o.wk7;
import o.wt3;
import o.xt0;
import o.xt2;
import o.xt6;
import o.y;
import o.ye4;
import o.yt0;
import o.zt6;

/* JADX INFO: loaded from: classes.dex */
public final class ClientViewOpenGL extends GLSurfaceView {
    public static int F;
    public n87 A;
    public boolean B;
    public final Rect C;
    public final boolean D;
    public final da3 E;
    public final ImageView m;
    public final RelativeLayout.LayoutParams n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f64o;
    public final RelativeLayout.LayoutParams p;
    public final fc1 q;
    public final l97 r;
    public final l97 s;
    public final l97 t;
    public l97 u;
    public n87 v;
    public na3 w;
    public final PointF x;
    public boolean y;
    public j97 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientViewOpenGL(Context context, AttributeSet attributeSet) {
        du6 du6VarT;
        da3 da3Var;
        super(context, attributeSet);
        context.getClass();
        this.q = hm3.e();
        this.r = im3.k(new gx(1.0f));
        byte b = 0;
        this.s = im3.k(new i12(0, 0));
        this.t = im3.k(new i12(0, 0));
        this.x = new PointF();
        this.C = new Rect();
        au2 au2Var = vt1.c;
        if (au2Var == null) {
            hk0.g("Required value was null.");
            throw null;
        }
        Context baseContext = new ContextWrapper(context).getBaseContext();
        baseContext.getClass();
        xt2 xt2Var = (xt2) baseContext;
        mo7 mo7Var = ((zt6) ((xt6) au2Var.f)).f;
        if (mo7Var instanceof wc3) {
            l26 l26Var = new l26(mo7Var, (byte) 2);
            ve8 ve8VarO = xt2Var.o();
            bf1 bf1VarK = h57.k(xt2Var);
            bf1VarK.getClass();
            pn5 pn5Var = new pn5(ve8VarO, l26Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(yt0.class);
            String strC = wt3VarB.c();
            if (strC == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                throw null;
            }
            da3Var = (da3) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        } else {
            if (mo7Var == null || (du6VarT = mo7Var.t()) == null || !du6VarT.p) {
                hk0.l("No proper session");
                throw null;
            }
            n26 n26Var = new n26(au2Var, mo7Var, b);
            ve8 ve8VarO2 = xt2Var.o();
            bf1 bf1VarK2 = h57.k(xt2Var);
            bf1VarK2.getClass();
            pn5 pn5Var2 = new pn5(ve8VarO2, n26Var, bf1VarK2);
            wt3 wt3VarB2 = w86.a.b(bz4.class);
            String strC2 = wt3VarB2.c();
            if (strC2 == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                throw null;
            }
            da3Var = (da3) pn5Var2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
        }
        this.E = da3Var;
        setEGLContextFactory(new ut0());
        setEGLConfigChooser(new tt0());
        setRenderer(new vt0(this, b));
        this.D = true;
        setRenderMode(0);
        float fP0 = da3Var.p0();
        ImageView imageView = new ImageView(context);
        Matrix imageMatrix = imageView.getImageMatrix();
        imageMatrix.setScale(fP0, fP0, 0.0f, 0.0f);
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        imageView.setScaleType(scaleType);
        imageView.setImageMatrix(imageMatrix);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.width = 0;
        layoutParams.height = 0;
        this.n = layoutParams;
        this.m = imageView;
        if (da3Var.K()) {
            ImageView imageView2 = new ImageView(context);
            Matrix imageMatrix2 = imageView2.getImageMatrix();
            imageMatrix2.setScale(fP0, fP0, 0.0f, 0.0f);
            imageView2.setScaleType(scaleType);
            imageView2.setImageMatrix(imageMatrix2);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(0, 0);
            layoutParams2.width = 0;
            layoutParams2.height = 0;
            this.p = layoutParams2;
            this.f64o = imageView2;
        } else {
            ye4.a("ClientViewOpenGL", "Partner's device has no mouse");
            this.y = true;
        }
        da3Var.L(new y(this, (byte) 25));
        requestRender();
    }

    public static void c(ImageView imageView, Bitmap bitmap, RelativeLayout.LayoutParams layoutParams, PointF pointF, Point point, float f, float f2, float f3) {
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
        layoutParams.leftMargin = (int) Math.ceil((pointF.x - (point.x * f)) - f2);
        layoutParams.topMargin = (int) Math.ceil((pointF.y - (point.y * f)) - f3);
        layoutParams.width = (int) Math.ceil(bitmap.getWidth() * f);
        layoutParams.height = (int) Math.ceil(bitmap.getHeight() * f);
        imageView.setLayoutParams(layoutParams);
        imageView.invalidate();
    }

    public final void a() {
        ye4.a("ClientViewOpenGL", "invalidateGui");
        wk7 wk7VarQ = this.E.q();
        if (wk7VarQ != null) {
            synchronized (wk7VarQ) {
                wk7VarQ.m = this;
            }
        }
        e();
        f();
        i12 i12Var = (i12) ((l97) m19getDimensionView()).getValue();
        b(i12Var.a, i12Var.b);
        if (this.D) {
            this.B = true;
            requestRender();
        }
    }

    public final void b(int i, int i2) {
        l97 l97Var;
        Object value;
        gx gxVar;
        i12 i12Var = (i12) ((l97) m18getDimensionBitmap()).getValue();
        int i3 = i12Var.a;
        int i4 = i12Var.b;
        sx4 sx4VarM17getAspectQuotient = m17getAspectQuotient();
        do {
            l97Var = (l97) sx4VarM17getAspectQuotient;
            value = l97Var.getValue();
            gxVar = (gx) value;
            float f = (i3 / i4) / (i / i2);
            if (f != gxVar.a && !Float.isNaN(f)) {
                gxVar = new gx(f);
            }
        } while (!l97Var.j(value, gxVar));
    }

    public final void d() {
        v97 v97Var;
        RelativeLayout.LayoutParams layoutParams;
        da3 da3Var = this.E;
        if (da3Var.V()) {
            wk7 wk7VarQ = da3Var.q();
            if (wk7VarQ == null) {
                ye4.c("ClientViewOpenGL", "updateRemoteCursor(): mouse is null");
                return;
            }
            j97 zoomState = getZoomState();
            if (zoomState == null || (v97Var = (v97) zoomState.getValue()) == null) {
                return;
            }
            Point point = wk7VarQ.f;
            float f = point.x * v97Var.b;
            PointF pointF = this.x;
            pointF.x = f;
            pointF.y = point.y * v97Var.c;
            Bitmap bitmap = wk7VarQ.h;
            if (bitmap == null) {
                ye4.c("ClientViewOpenGL", "updateRemoteCursor(): mouse bitmap is null");
                return;
            }
            ImageView imageView = this.f64o;
            if (imageView == null || (layoutParams = this.p) == null) {
                return;
            }
            c(imageView, bitmap, layoutParams, pointF, wk7VarQ.e, wk7VarQ.i, v97Var.d, v97Var.e);
            this.y = false;
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.E.dispatchTouchEvent(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        da3 da3Var = this.E;
        j22 j22VarZ = da3Var.Z();
        sx4 sx4VarM18getDimensionBitmap = m18getDimensionBitmap();
        int i = j22VarZ.m;
        int i2 = j22VarZ.n;
        i12 i12Var = new i12(i, i2);
        l97 l97Var = (l97) sx4VarM18getDimensionBitmap;
        l97Var.getClass();
        l97Var.l(null, i12Var);
        i12 i12Var2 = (i12) ((l97) m19getDimensionView()).getValue();
        b(i12Var2.a, i12Var2.b);
        int i3 = j22VarZ.m;
        int i4 = F;
        if ((1 > i4 || i4 >= i3) && i2 <= i4) {
            return;
        }
        da3Var.z0(i4);
    }

    public final void f() {
        Rect rect = new Rect();
        getDrawingRect(rect);
        sx4 sx4VarM19getDimensionView = m19getDimensionView();
        i12 i12Var = new i12(rect.width(), rect.height());
        l97 l97Var = (l97) sx4VarM19getDimensionView;
        l97Var.getClass();
        l97Var.l(null, i12Var);
    }

    public /* bridge */ j97 getAspectQuotient() {
        return m17getAspectQuotient();
    }

    public /* bridge */ j97 getDimensionBitmap() {
        return m18getDimensionBitmap();
    }

    public /* bridge */ j97 getDimensionView() {
        return m19getDimensionView();
    }

    public final RelativeLayout.LayoutParams getMouseLayout() {
        return this.n;
    }

    public final ImageView getMouseView() {
        return this.m;
    }

    public final RelativeLayout.LayoutParams getRemoteMouseLayout() {
        return this.p;
    }

    public final ImageView getRemoteMouseView() {
        return this.f64o;
    }

    public na3 getZoomControl() {
        return this.w;
    }

    public j97 getZoomState() {
        return this.u;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.x(this);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        this.E.x(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.E.d(motionEvent) || super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f();
        b(i3 - i, i4 - i2);
        requestRender();
        Rect rect = this.C;
        getWindowVisibleDisplayFrame(rect);
        this.E.N0(rect);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        na3 zoomControl;
        Object value;
        super.onSizeChanged(i, i2, i3, i4);
        if (i4 == 0 || (zoomControl = getZoomControl()) == null) {
            return;
        }
        if (i4 == 0) {
            ye4.c("ClientViewOpenGL", "Abort division, oldHeight is zero.");
            return;
        }
        l97 l97Var = ((a1) zoomControl).e;
        float f = ((v97) l97Var.getValue()).a;
        if (!(zoomControl instanceof a1)) {
            float f2 = i2 / i4;
            do {
                value = l97Var.getValue();
            } while (!l97Var.j(value, ((v97) value).c(f2 * f)));
        } else {
            a1 a1Var = (a1) zoomControl;
            a1Var.g();
            float f3 = a1Var.b;
            a1Var.n = (f - f3) / (a1Var.c - f3);
        }
    }

    public void setControlZoom(na3 na3Var) {
        n87 n87Var = this.v;
        n87 n87VarR = null;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.w = na3Var;
        this.u = na3Var != null ? ((a1) na3Var).e : null;
        j97 zoomState = getZoomState();
        if (zoomState != null) {
            n87VarR = im3.R(this.q, null, null, new xt0(zoomState, this, n87VarR, (byte) 0), 3);
        }
        this.v = n87VarR;
    }

    public void setExternalMouseHandler(wa3 wa3Var) {
        this.E.D(wa3Var);
    }

    public void setMouseState(j97 j97Var) {
        n87 n87Var = this.A;
        n87 n87VarR = null;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.z = j97Var;
        if (j97Var != null) {
            n87VarR = im3.R(this.q, null, null, new xt0(j97Var, this, n87VarR, (byte) 1), 3);
        }
        this.A = n87VarR;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        ye4.a.b("ClientViewOpenGL", "surfaceDestroyed");
        super.surfaceDestroyed(surfaceHolder);
        this.E.x0();
    }

    /* JADX INFO: renamed from: getAspectQuotient, reason: collision with other method in class */
    public sx4 m17getAspectQuotient() {
        return this.r;
    }

    /* JADX INFO: renamed from: getDimensionBitmap, reason: collision with other method in class */
    public sx4 m18getDimensionBitmap() {
        return this.t;
    }

    /* JADX INFO: renamed from: getDimensionView, reason: collision with other method in class */
    public sx4 m19getDimensionView() {
        return this.s;
    }
}
