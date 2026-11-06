package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class q03 implements n03 {
    public static final AtomicBoolean J = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final ol0 b;
    public final nl0 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public byte k;
    public tv0 l;
    public float m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1792o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public q03(AndroidComposeView androidComposeView, ol0 ol0Var, nl0 nl0Var) {
        this.b = ol0Var;
        this.c = nl0Var;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (J.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                na6.c(renderNodeCreate, na6.a(renderNodeCreate));
                na6.d(renderNodeCreate, na6.b(renderNodeCreate));
            }
            ma6.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        P(0);
        this.j = 0;
        this.k = (byte) 3;
        this.m = 1.0f;
        this.f1792o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = rv0.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    @Override // o.n03
    public final float A() {
        return this.r;
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
    public final void B(in1 in1Var, j04 j04Var, l03 l03Var, io.sentry.okhttp.b bVar) throws Throwable {
        DisplayListCanvas displayListCanvas;
        int i;
        int i2;
        in1 in1VarZ;
        j04 j04VarB;
        ll0 ll0VarX;
        long jD;
        l03 l03Var2;
        nl0 nl0Var = this.c;
        iu iuVar = nl0Var.n;
        DisplayListCanvas displayListCanvasStart = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        float f = this.B;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.C)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            cg cgVar = this.b.a;
            Canvas canvas = cgVar.a;
            cgVar.a = (Canvas) displayListCanvasStart;
            try {
                try {
                    if (this.B <= 0.0f) {
                        try {
                            if (this.C <= 0.0f) {
                                long jA0 = xs1.a0(this.e);
                                in1 in1VarZ2 = iuVar.z();
                                j04 j04VarB2 = iuVar.B();
                                ll0 ll0VarX2 = iuVar.x();
                                canvas = canvas;
                                long jD2 = iuVar.D();
                                displayListCanvasStart = displayListCanvasStart;
                                l03 l03Var3 = (l03) iuVar.p;
                                iuVar.Q(in1Var);
                                iuVar.R(j04Var);
                                iuVar.P(cgVar);
                                iuVar.S(jA0);
                                iuVar.p = l03Var;
                                cgVar.g();
                                try {
                                    bVar.invoke(nl0Var);
                                    cgVar.p();
                                    iuVar.Q(in1VarZ2);
                                    iuVar.R(j04VarB2);
                                    iuVar.P(ll0VarX2);
                                    iuVar.S(jD2);
                                    iuVar.p = l03Var3;
                                } catch (Throwable th) {
                                    cgVar.p();
                                    iuVar.Q(in1VarZ2);
                                    iuVar.R(j04VarB2);
                                    iuVar.P(ll0VarX2);
                                    iuVar.S(jD2);
                                    iuVar.p = l03Var3;
                                    throw th;
                                }
                            }
                            cgVar.a = canvas;
                            this.d.end(displayListCanvasStart);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            displayListCanvasStart = displayListCanvasStart;
                            displayListCanvas = displayListCanvasStart;
                            this.d.end(displayListCanvas);
                            throw th;
                        }
                    }
                    bVar.invoke(nl0Var);
                    cgVar.p();
                    iuVar.Q(in1VarZ);
                    iuVar.R(j04VarB);
                    iuVar.P(ll0VarX);
                    iuVar.S(jD);
                    iuVar.p = l03Var2;
                    cgVar.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                    cgVar.a = canvas;
                    this.d.end(displayListCanvasStart);
                    return;
                } catch (Throwable th3) {
                    displayListCanvas = displayListCanvasStart;
                    try {
                        cgVar.p();
                        iuVar.Q(in1VarZ);
                        iuVar.R(j04VarB);
                        iuVar.P(ll0VarX);
                        iuVar.S(jD);
                        iuVar.p = l03Var2;
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        this.d.end(displayListCanvas);
                        throw th;
                    }
                }
                i = (int) (jFloatToRawIntBits >> 32);
                i2 = (int) (jFloatToRawIntBits & 4294967295L);
                cgVar.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                long jA1 = xs1.a0(this.e);
                in1VarZ = iuVar.z();
                j04VarB = iuVar.B();
                ll0VarX = iuVar.x();
                jD = iuVar.D();
                l03Var2 = (l03) iuVar.p;
                iuVar.Q(in1Var);
                iuVar.R(j04Var);
                iuVar.P(cgVar);
                iuVar.S(jA1);
                iuVar.p = l03Var;
                cgVar.g();
            } catch (Throwable th5) {
                th = th5;
                displayListCanvas = displayListCanvasStart;
                this.d.end(displayListCanvas);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            displayListCanvas = displayListCanvasStart;
        }
    }

    @Override // o.n03
    public final void C(boolean z) {
        this.A = z;
        O();
    }

    @Override // o.n03
    public final float D() {
        return this.w;
    }

    @Override // o.n03
    public final void E(int i) {
        this.j = i;
        Q();
    }

    @Override // o.n03
    public final void F(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }

    @Override // o.n03
    public final void G(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            na6.d(this.d, j51.U(j));
        }
    }

    @Override // o.n03
    public final void H(ll0 ll0Var) {
        Canvas canvas = dg.a;
        DisplayListCanvas displayListCanvas = ((cg) ll0Var).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // o.n03
    public final Matrix I() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // o.n03
    public final void J(float f) {
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    @Override // o.n03
    public final float K() {
        return this.t;
    }

    @Override // o.n03
    public final float L() {
        return this.q;
    }

    @Override // o.n03
    public final void M(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // o.n03
    public final int N() {
        return this.k;
    }

    public final void O() {
        boolean z = this.A;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.F) {
            this.F = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.G) {
            this.G = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void P(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            P(i);
        } else {
            P(1);
        }
    }

    public final void R() {
        long j = this.f1792o;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.C);
        } else {
            this.n = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.f1792o & 4294967295L)) + this.C);
        }
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    @Override // o.n03
    public final float a() {
        return this.m;
    }

    @Override // o.n03
    public final void b(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    @Override // o.n03
    public final float c() {
        return this.p;
    }

    @Override // o.n03
    public final void d(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // o.n03
    public final void e(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // o.n03
    public final void f(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    @Override // o.n03
    public final void g(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.n03
    public final void h(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(j51.V(i)));
        Q();
    }

    @Override // o.n03
    public final void i() {
        ma6.a(this.d);
    }

    @Override // o.n03
    public final int j() {
        return this.j;
    }

    @Override // o.n03
    public final tv0 k() {
        return this.l;
    }

    @Override // o.n03
    public final void l(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    @Override // o.n03
    public final void m(int i, int i2, long j) {
        this.H = i;
        this.I = i2;
        boolean zB = dl3.b(this.e, j);
        this.e = j;
        S();
        if (zB) {
            return;
        }
        if (this.n || t65.b(this.f1792o, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    @Override // o.n03
    public final float n() {
        return this.x;
    }

    @Override // o.n03
    public final boolean o() {
        return this.d.isValid();
    }

    @Override // o.n03
    public final float p() {
        return this.y;
    }

    @Override // o.n03
    public final void q(long j) {
        this.f1792o = j;
        R();
    }

    @Override // o.n03
    public final long r() {
        return this.u;
    }

    @Override // o.n03
    public final void s(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    @Override // o.n03
    public final void t(tv0 tv0Var) {
        this.l = tv0Var;
        if (tv0Var == null) {
            Q();
            return;
        }
        P(1);
        RenderNode renderNode = this.d;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(tv0Var.a);
        renderNode.setLayerPaint(paint);
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
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = (i == i5 && i2 == this.C) ? false : true;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // o.n03
    public final float v() {
        return this.s;
    }

    @Override // o.n03
    public final long w() {
        return this.v;
    }

    @Override // o.n03
    public final void x(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            na6.c(this.d, j51.U(j));
        }
    }

    @Override // o.n03
    public final void y(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // o.n03
    public final float z() {
        return this.z;
    }
}
