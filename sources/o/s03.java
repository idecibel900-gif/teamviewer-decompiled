package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: loaded from: classes.dex */
public final class s03 implements n03 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public final ol0 b;
    public final nl0 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public byte j;
    public tv0 k;
    public long l;
    public float m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1969o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public s03() {
        ol0 ol0Var = new ol0();
        nl0 nl0Var = new nl0();
        this.b = ol0Var;
        this.c = nl0Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        P(renderNode, 0);
        this.i = 1.0f;
        this.j = (byte) 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = rv0.b;
        this.r = j;
        this.s = j;
        this.w = 8.0f;
        this.G = 0;
    }

    @Override // o.n03
    public final float A() {
        return this.f1969o;
    }

    @Override // o.n03
    public final void B(in1 in1Var, j04 j04Var, l03 l03Var, io.sentry.okhttp.b bVar) {
        nl0 nl0Var = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        float f = this.y;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.z)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            ol0 ol0Var = this.b;
            cg cgVar = ol0Var.a;
            Canvas canvas = cgVar.a;
            cgVar.a = recordingCanvasBeginRecording;
            iu iuVar = nl0Var.n;
            iuVar.Q(in1Var);
            iuVar.R(j04Var);
            iuVar.p = l03Var;
            iuVar.S(this.e);
            iuVar.P(cgVar);
            if (this.y > 0.0f || this.z > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                cgVar.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                bVar.invoke(nl0Var);
                cgVar.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                bVar.invoke(nl0Var);
            }
            ol0Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // o.n03
    public final void C(boolean z) {
        this.x = z;
        O();
    }

    @Override // o.n03
    public final float D() {
        return this.t;
    }

    @Override // o.n03
    public final void E(int i) {
        this.G = i;
        Q();
    }

    @Override // o.n03
    public final void F(float f) {
        this.f1969o = f;
        this.d.setTranslationX(f);
    }

    @Override // o.n03
    public final void G(long j) {
        this.s = j;
        this.d.setSpotShadowColor(j51.U(j));
    }

    @Override // o.n03
    public final void H(ll0 ll0Var) {
        Canvas canvas = dg.a;
        ((cg) ll0Var).a.drawRenderNode(this.d);
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
        this.w = f;
        this.d.setCameraDistance(f);
    }

    @Override // o.n03
    public final float K() {
        return this.q;
    }

    @Override // o.n03
    public final float L() {
        return this.n;
    }

    @Override // o.n03
    public final void M(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // o.n03
    public final int N() {
        return this.j;
    }

    public final void O() {
        boolean z = this.x;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void P(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.G;
        if (i != 1 && this.j == 3 && this.k == null) {
            P(this.d, i);
        } else {
            P(this.d, 1);
        }
    }

    public final void R() {
        long j = this.l;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.z);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.y);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + this.z);
        }
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i = this.E;
        renderNode.setPosition(i - this.y, this.F - this.z, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    @Override // o.n03
    public final float a() {
        return this.i;
    }

    @Override // o.n03
    public final void b(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override // o.n03
    public final float c() {
        return this.m;
    }

    @Override // o.n03
    public final void d(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // o.n03
    public final void e(float f) {
        this.v = f;
        this.d.setRotationZ(f);
    }

    @Override // o.n03
    public final void f(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // o.n03
    public final void g(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.n03
    public final void h(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(j51.T(i));
        Q();
    }

    @Override // o.n03
    public final void i() {
        this.d.discardDisplayList();
    }

    @Override // o.n03
    public final int j() {
        return this.G;
    }

    @Override // o.n03
    public final tv0 k() {
        return this.k;
    }

    @Override // o.n03
    public final void l(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override // o.n03
    public final void m(int i, int i2, long j) {
        this.E = i;
        this.F = i2;
        boolean zA = y07.a(this.e, xs1.a0(j));
        this.e = xs1.a0(j);
        S();
        if (zA || !t65.b(this.l, 9205357640488583168L)) {
            return;
        }
        this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.y);
        this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.z);
    }

    @Override // o.n03
    public final float n() {
        return this.u;
    }

    @Override // o.n03
    public final boolean o() {
        return this.d.hasDisplayList();
    }

    @Override // o.n03
    public final float p() {
        return this.v;
    }

    @Override // o.n03
    public final void q(long j) {
        this.l = j;
        R();
    }

    @Override // o.n03
    public final long r() {
        return this.r;
    }

    @Override // o.n03
    public final void s(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // o.n03
    public final void t(tv0 tv0Var) {
        this.k = tv0Var;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
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
        int i5 = this.y;
        if (i == i5 && i2 == this.z && i3 == this.A && i4 == this.B) {
            return;
        }
        boolean z = (i == i5 && i2 == this.z) ? false : true;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // o.n03
    public final float v() {
        return this.p;
    }

    @Override // o.n03
    public final long w() {
        return this.s;
    }

    @Override // o.n03
    public final void x(long j) {
        this.r = j;
        this.d.setAmbientShadowColor(j51.U(j));
    }

    @Override // o.n03
    public final void y(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // o.n03
    public final float z() {
        return this.w;
    }
}
