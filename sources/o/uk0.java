package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class uk0 extends ViewGroup {
    public static final /* synthetic */ int M = 0;
    public Rect A;
    public x07 B;
    public Rect C;
    public Rect D;
    public x07 E;
    public double F;
    public ds5 G;
    public boolean H;
    public final sk0 I;
    public final z20 J;
    public final xc0 K;
    public final tk0 L;
    public mk0 m;
    public WindowManager n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f2219o;
    public boolean p;
    public SurfaceView q;
    public TextureView r;
    public boolean s;
    public gy8 t;
    public int u;
    public final ArrayList v;
    public ae w;
    public vk0 x;
    public x07 y;
    public x07 z;

    public uk0(Context context) {
        super(context);
        this.p = false;
        this.s = false;
        this.u = -1;
        this.v = new ArrayList();
        this.x = new vk0();
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = 0.1d;
        this.G = null;
        this.H = false;
        BarcodeView barcodeView = (BarcodeView) this;
        this.I = new sk0(barcodeView);
        this.J = new z20(barcodeView, (byte) 1);
        this.K = new xc0((Object) barcodeView, (byte) 6);
        this.L = new tk0(barcodeView, (byte) 0);
        a(context, null);
    }

    private int getDisplayRotation() {
        return this.n.getDefaultDisplay().getRotation();
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        b(attributeSet);
        this.n = (WindowManager) context.getSystemService("window");
        this.f2219o = new Handler(this.J);
        this.t = new gy8((byte) 9);
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iz5.a);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.E = new x07(dimension, dimension2);
        }
        this.p = typedArrayObtainStyledAttributes.getBoolean(3, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.G = new im0((byte) 0);
        } else if (integer == 2) {
            this.G = new im0((byte) 1);
        } else if (integer == 3) {
            this.G = new im0((byte) 2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public abstract void c();

    public final void d() {
        l47.t();
        Log.d("uk0", "resume()");
        if (this.m != null) {
            io.sentry.android.core.v0.j("uk0", "initCamera called twice");
        } else {
            Context context = getContext();
            mk0 mk0Var = new mk0();
            mk0Var.f = false;
            mk0Var.g = true;
            mk0Var.i = new vk0();
            lk0 lk0Var = new lk0(mk0Var, (byte) 0);
            mk0Var.j = new lk0(mk0Var, (byte) 1);
            mk0Var.k = new lk0(mk0Var, (byte) 2);
            mk0Var.l = new lk0(mk0Var, (byte) 3);
            l47.t();
            gy8 gy8Var = gy8.g;
            if (gy8Var == null) {
                gy8Var = new gy8();
                gy8.g = gy8Var;
            }
            mk0Var.a = gy8Var;
            pk0 pk0Var = new pk0(context);
            mk0Var.c = pk0Var;
            pk0Var.g = mk0Var.i;
            mk0Var.h = new Handler();
            vk0 vk0Var = this.x;
            if (!mk0Var.f) {
                mk0Var.i = vk0Var;
                pk0Var.g = vk0Var;
            }
            this.m = mk0Var;
            mk0Var.d = this.f2219o;
            l47.t();
            mk0Var.f = true;
            mk0Var.g = false;
            synchronized (gy8Var.e) {
                gy8Var.b++;
                gy8Var.d(lk0Var);
            }
            this.u = getDisplayRotation();
        }
        if (this.B != null) {
            g();
        } else {
            SurfaceView surfaceView = this.q;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.I);
            } else {
                TextureView textureView = this.r;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.r.getSurfaceTexture();
                        this.B = new x07(this.r.getWidth(), this.r.getHeight());
                        g();
                    } else {
                        this.r.setSurfaceTextureListener(new rk0(this));
                    }
                }
            }
        }
        requestLayout();
        gy8 gy8Var2 = this.t;
        Context context2 = getContext();
        xc0 xc0Var = this.K;
        if6 if6Var = (if6) gy8Var2.d;
        if (if6Var != null) {
            if6Var.disable();
        }
        gy8Var2.d = null;
        gy8Var2.c = null;
        gy8Var2.e = null;
        Context applicationContext = context2.getApplicationContext();
        gy8Var2.e = xc0Var;
        gy8Var2.c = (WindowManager) applicationContext.getSystemService("window");
        if6 if6Var2 = new if6(gy8Var2, applicationContext);
        gy8Var2.d = if6Var2;
        if6Var2.enable();
        gy8Var2.b = ((WindowManager) gy8Var2.c).getDefaultDisplay().getRotation();
    }

    public final void e() {
        if (this.m == null || getDisplayRotation() == this.u) {
            return;
        }
        c();
        d();
    }

    public final void f(wk0 wk0Var) {
        if (this.s || this.m == null) {
            return;
        }
        Log.i("uk0", "Starting preview");
        mk0 mk0Var = this.m;
        mk0Var.b = wk0Var;
        l47.t();
        if (!mk0Var.f) {
            hk0.l("CameraInstance is not open");
            return;
        }
        mk0Var.a.d(mk0Var.k);
        this.s = true;
        ((BarcodeView) this).i();
        this.L.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        Rect rect;
        float f;
        x07 x07Var = this.B;
        if (x07Var == null || this.z == null || (rect = this.A) == null) {
            return;
        }
        byte b = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (this.q != null && x07Var.equals(new x07(rect.width(), this.A.height()))) {
            SurfaceHolder holder = this.q.getHolder();
            wk0 wk0Var = new wk0(b, (boolean) (objArr3 == true ? 1 : 0));
            if (holder == null) {
                hk0.g("surfaceHolder may not be null");
                return;
            } else {
                wk0Var.n = holder;
                f(wk0Var);
                return;
            }
        }
        TextureView textureView = this.r;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.z != null) {
            int width = this.r.getWidth();
            int height = this.r.getHeight();
            x07 x07Var2 = this.z;
            float f2 = height;
            float f3 = width / f2;
            float f4 = x07Var2.m / x07Var2.n;
            float f5 = 1.0f;
            if (f3 < f4) {
                float f6 = f4 / f3;
                f = 1.0f;
                f5 = f6;
            } else {
                f = f3 / f4;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f5, f);
            float f7 = width;
            matrix.postTranslate((f7 - (f5 * f7)) / 2.0f, (f2 - (f * f2)) / 2.0f);
            this.r.setTransform(matrix);
        }
        SurfaceTexture surfaceTexture = this.r.getSurfaceTexture();
        wk0 wk0Var2 = new wk0((byte) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0));
        if (surfaceTexture == null) {
            hk0.g("surfaceTexture may not be null");
        } else {
            wk0Var2.f2420o = surfaceTexture;
            f(wk0Var2);
        }
    }

    public mk0 getCameraInstance() {
        return this.m;
    }

    public vk0 getCameraSettings() {
        return this.x;
    }

    public Rect getFramingRect() {
        return this.C;
    }

    public x07 getFramingRectSize() {
        return this.E;
    }

    public double getMarginFraction() {
        return this.F;
    }

    public Rect getPreviewFramingRect() {
        return this.D;
    }

    public ds5 getPreviewScalingStrategy() {
        ds5 ds5Var = this.G;
        if (ds5Var != null) {
            return ds5Var;
        }
        return this.r != null ? new im0((byte) 0) : new im0((byte) 1);
    }

    public x07 getPreviewSize() {
        return this.z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.p) {
            TextureView textureView = new TextureView(getContext());
            this.r = textureView;
            textureView.setSurfaceTextureListener(new rk0(this));
            addView(this.r);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.q = surfaceView;
        surfaceView.getHolder().addCallback(this.I);
        addView(this.q);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        x07 x07Var = new x07(i3 - i, i4 - i2);
        this.y = x07Var;
        mk0 mk0Var = this.m;
        if (mk0Var != null && mk0Var.e == null) {
            int displayRotation = getDisplayRotation();
            ae aeVar = new ae((byte) 6);
            aeVar.d = new im0((byte) 1);
            aeVar.b = displayRotation;
            aeVar.c = x07Var;
            this.w = aeVar;
            aeVar.d = getPreviewScalingStrategy();
            mk0 mk0Var2 = this.m;
            ae aeVar2 = this.w;
            mk0Var2.e = aeVar2;
            mk0Var2.c.h = aeVar2;
            l47.t();
            if (!mk0Var2.f) {
                hk0.l("CameraInstance is not open");
                return;
            }
            mk0Var2.a.d(mk0Var2.j);
            boolean z2 = this.H;
            if (z2) {
                mk0 mk0Var3 = this.m;
                mk0Var3.getClass();
                l47.t();
                if (mk0Var3.f) {
                    mk0Var3.a.d(new qe((byte) 1, mk0Var3, z2));
                }
            }
        }
        SurfaceView surfaceView = this.q;
        if (surfaceView == null) {
            TextureView textureView = this.r;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.A;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.H);
        return bundle;
    }

    public void setCameraSettings(vk0 vk0Var) {
        this.x = vk0Var;
    }

    public void setFramingRectSize(x07 x07Var) {
        this.E = x07Var;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.F = d;
        } else {
            hk0.g("The margin fraction must be less than 0.5");
        }
    }

    public void setPreviewScalingStrategy(ds5 ds5Var) {
        this.G = ds5Var;
    }

    public void setTorch(boolean z) {
        this.H = z;
        mk0 mk0Var = this.m;
        if (mk0Var != null) {
            l47.t();
            if (mk0Var.f) {
                mk0Var.a.d(new qe((byte) 1, mk0Var, z));
            }
        }
    }

    public void setUseTextureView(boolean z) {
        this.p = z;
    }

    public uk0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = false;
        this.s = false;
        this.u = -1;
        this.v = new ArrayList();
        this.x = new vk0();
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = 0.1d;
        this.G = null;
        this.H = false;
        BarcodeView barcodeView = (BarcodeView) this;
        this.I = new sk0(barcodeView);
        this.J = new z20(barcodeView, (byte) 1);
        this.K = new xc0((Object) barcodeView, (byte) 6);
        this.L = new tk0(barcodeView, (byte) 0);
        a(context, attributeSet);
    }
}
