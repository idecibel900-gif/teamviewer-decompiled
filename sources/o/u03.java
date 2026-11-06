package o;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class u03 implements n03 {
    public static final t03 H = new t03();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final r52 b;
    public final ol0 c;
    public final me8 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public tv0 f2158o;
    public int p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public u03(r52 r52Var) {
        ol0 ol0Var = new ol0();
        nl0 nl0Var = new nl0();
        this.b = r52Var;
        this.c = ol0Var;
        me8 me8Var = new me8(r52Var, ol0Var, nl0Var);
        this.d = me8Var;
        this.e = r52Var.getResources();
        this.f = new Rect();
        r52Var.addView(me8Var);
        me8Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = (byte) 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = rv0.b;
        this.y = j;
        this.z = j;
    }

    @Override // o.n03
    public final float A() {
        return this.v;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.n03
    public final void B(in1 in1Var, j04 j04Var, l03 l03Var, io.sentry.okhttp.b bVar) {
        me8 me8Var = this.d;
        ViewParent parent = me8Var.getParent();
        r52 r52Var = this.b;
        if (parent == null) {
            r52Var.addView(me8Var);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.D)) << 32) | (((long) Float.floatToRawIntBits(this.E)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        me8Var.s = in1Var;
        me8Var.t = j04Var;
        me8Var.u = bVar;
        me8Var.v = l03Var;
        me8Var.w = fIntBitsToFloat;
        me8Var.x = fIntBitsToFloat2;
        if (me8Var.isAttachedToWindow()) {
            me8Var.setVisibility(4);
            me8Var.setVisibility(0);
            try {
                cg cgVar = this.c.a;
                t03 t03Var = H;
                Canvas canvas = cgVar.a;
                cgVar.a = t03Var;
                r52Var.a(cgVar, me8Var, me8Var.getDrawingTime());
                cgVar.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // o.n03
    public final void C(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // o.n03
    public final float D() {
        return this.A;
    }

    @Override // o.n03
    public final void E(int i) {
        this.p = i;
        Q();
    }

    @Override // o.n03
    public final void F(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }

    @Override // o.n03
    public final void G(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.z = j;
            this.d.setOutlineSpotShadowColor(j51.U(j));
        }
    }

    @Override // o.n03
    public final void H(ll0 ll0Var) {
        Rect rect;
        boolean z = this.k;
        me8 me8Var = this.d;
        if (z) {
            if ((this.m || me8Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = me8Var.getWidth();
                rect.bottom = me8Var.getHeight();
            } else {
                rect = null;
            }
            me8Var.setClipBounds(rect);
        }
        Canvas canvas = dg.a;
        if (((cg) ll0Var).a.isHardwareAccelerated()) {
            this.b.a(ll0Var, me8Var, me8Var.getDrawingTime());
        }
    }

    @Override // o.n03
    public final Matrix I() {
        return this.d.getMatrix();
    }

    @Override // o.n03
    public final void J(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // o.n03
    public final float K() {
        return this.x;
    }

    @Override // o.n03
    public final float L() {
        return this.u;
    }

    @Override // o.n03
    public final void M(float f) {
        this.A = f;
        this.d.setRotationX(f);
    }

    @Override // o.n03
    public final int N() {
        return this.n;
    }

    public final void O(int i) {
        Paint paint = this.g;
        me8 me8Var = this.d;
        boolean z = true;
        if (i == 1) {
            me8Var.setLayerType(2, paint);
        } else if (i == 2) {
            me8Var.setLayerType(0, paint);
            z = false;
        } else {
            me8Var.setLayerType(0, paint);
        }
        me8Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void P() {
        boolean z = this.m;
        me8 me8Var = this.d;
        if (z || me8Var.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = i - this.D;
        int i3 = this.i;
        int i4 = i3 - this.E;
        long j = this.j;
        me8Var.layout(i2, i4, i + ((int) (j >> 32)) + this.F, i3 + ((int) (j & 4294967295L)) + this.G);
    }

    public final void Q() {
        int i = this.p;
        if (i != 1 && this.n == 3 && this.f2158o == null) {
            O(i);
        } else {
            O(1);
        }
    }

    public final void R() {
        boolean z = this.r;
        me8 me8Var = this.d;
        if (z || t65.b(this.s, 9205357640488583168L)) {
            me8Var.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.D);
            me8Var.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.E);
        } else {
            me8Var.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + this.D);
            me8Var.setPivotY(Float.intBitsToFloat((int) (this.s & 4294967295L)) + this.E);
        }
    }

    @Override // o.n03
    public final float a() {
        return this.q;
    }

    @Override // o.n03
    public final void b(float f) {
        this.B = f;
        this.d.setRotationY(f);
    }

    @Override // o.n03
    public final float c() {
        return this.t;
    }

    @Override // o.n03
    public final void d(float f) {
        this.x = f;
        this.d.setElevation(f);
    }

    @Override // o.n03
    public final void e(float f) {
        this.C = f;
        this.d.setRotation(f);
    }

    @Override // o.n03
    public final void f(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    @Override // o.n03
    public final void g(Outline outline, long j) {
        me8 me8Var = this.d;
        me8Var.q = outline;
        me8Var.invalidateOutline();
        if ((this.m || me8Var.getClipToOutline()) && outline != null) {
            me8Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.n03
    public final void h(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(j51.V(i)));
        Q();
    }

    @Override // o.n03
    public final void i() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // o.n03
    public final int j() {
        return this.p;
    }

    @Override // o.n03
    public final tv0 k() {
        return this.f2158o;
    }

    @Override // o.n03
    public final void l(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    @Override // o.n03
    public final void m(int i, int i2, long j) {
        if (!dl3.b(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            P();
            return;
        }
        int i3 = this.h;
        me8 me8Var = this.d;
        if (i3 != i) {
            me8Var.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            me8Var.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    @Override // o.n03
    public final float n() {
        return this.B;
    }

    @Override // o.n03
    public final float p() {
        return this.C;
    }

    @Override // o.n03
    public final void q(long j) {
        this.s = j;
        this.r = (j & 9223372034707292159L) == 9205357640488583168L;
        R();
    }

    @Override // o.n03
    public final long r() {
        return this.y;
    }

    @Override // o.n03
    public final void s(float f) {
        this.q = f;
        this.d.setAlpha(f);
    }

    @Override // o.n03
    public final void t(tv0 tv0Var) {
        this.f2158o = tv0Var;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(tv0Var != null ? tv0Var.a : null);
        Q();
    }

    @Override // o.n03
    public final void u(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbJ = fx3.j(i, i2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            sbJ.append(i3);
            sbJ.append(", Bottom: ");
            sbJ.append(i4);
            ji3.a(sbJ.toString());
        }
        int i5 = this.D;
        if (i == i5 && i2 == this.E && i3 == this.F && i4 == this.G) {
            return;
        }
        boolean z = (i == i5 && i2 == this.E) ? false : true;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        P();
        if (z) {
            R();
        }
    }

    @Override // o.n03
    public final float v() {
        return this.w;
    }

    @Override // o.n03
    public final long w() {
        return this.z;
    }

    @Override // o.n03
    public final void x(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            this.d.setOutlineAmbientShadowColor(j51.U(j));
        }
    }

    @Override // o.n03
    public final void y(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }

    @Override // o.n03
    public final float z() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }
}
