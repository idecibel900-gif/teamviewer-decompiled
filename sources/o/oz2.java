package o;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class oz2 extends vm1 implements t52 {
    public final /* synthetic */ byte C = 1;
    public final li D;
    public final v72 E;
    public Object F;

    public oz2(vg7 vg7Var, li liVar, v72 v72Var, pd5 pd5Var) {
        this.D = liVar;
        this.E = v72Var;
        this.F = pd5Var;
        U0(vg7Var);
    }

    public static boolean X0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean Y0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public RenderNode Z0() {
        RenderNode renderNode = (RenderNode) this.F;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeE = gx5.e();
        this.F = renderNodeE;
        return renderNodeE;
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        boolean zY0;
        long j;
        char c;
        boolean z;
        boolean zX0;
        byte b = this.C;
        li liVar = this.D;
        v72 v72Var = this.E;
        switch (b) {
            case 0:
                pd5 pd5Var = (pd5) this.F;
                nl0 nl0Var = d14Var.m;
                liVar.j(nl0Var.d());
                if (y07.c(nl0Var.d())) {
                    d14Var.a();
                    return;
                }
                d14Var.a();
                liVar.d.getValue();
                Canvas canvasB = dg.b(nl0Var.n.x());
                if (v72.f(v72Var.f)) {
                    zY0 = Y0(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (nl0Var.d() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(d14Var.d0(pd5Var.a(d14Var.getLayoutDirection())))) & 4294967295L), v72Var.c(), canvasB);
                } else {
                    zY0 = false;
                }
                if (v72.f(v72Var.d)) {
                    EdgeEffect edgeEffectE = v72Var.e();
                    zY0 = Y0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(d14Var.d0(pd5Var.b))) & 4294967295L), edgeEffectE, canvasB) || zY0;
                }
                if (v72.f(v72Var.g)) {
                    EdgeEffect edgeEffectD = v72Var.d();
                    zY0 = Y0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(d14Var.d0(pd5Var.b(d14Var.getLayoutDirection())) + (-((float) vn4.s0(Float.intBitsToFloat((int) (nl0Var.d() >> 32))))))) & 4294967295L), edgeEffectD, canvasB) || zY0;
                }
                if (v72.f(v72Var.e)) {
                    EdgeEffect edgeEffectB = v72Var.b();
                    float fD0 = d14Var.d0(pd5Var.d);
                    zY0 = Y0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (nl0Var.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (nl0Var.d() & 4294967295L))) + fD0)) & 4294967295L), edgeEffectB, canvasB) || zY0;
                }
                if (zY0) {
                    liVar.d();
                    return;
                }
                return;
            default:
                nl0 nl0Var2 = d14Var.m;
                liVar.j(nl0Var2.d());
                Canvas canvasB2 = dg.b(nl0Var2.n.x());
                liVar.d.getValue();
                if (y07.c(nl0Var2.d())) {
                    d14Var.a();
                    return;
                }
                if (!canvasB2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = v72Var.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = v72Var.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = v72Var.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = v72Var.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = v72Var.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = v72Var.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = v72Var.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = v72Var.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    d14Var.a();
                    return;
                }
                float fD1 = d14Var.d0(30.0f);
                boolean z2 = v72.f(v72Var.d) || v72.g(v72Var.h) || v72.f(v72Var.e) || v72.g(v72Var.i);
                boolean z3 = v72.f(v72Var.f) || v72.g(v72Var.j) || v72.f(v72Var.g) || v72.g(v72Var.k);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    Z0().setPosition(0, 0, canvasB2.getWidth(), canvasB2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        Z0().setPosition(0, 0, (vn4.s0(fD1) * 2) + canvasB2.getWidth(), canvasB2.getHeight());
                    } else {
                        if (!z3) {
                            d14Var.a();
                            return;
                        }
                        Z0().setPosition(0, 0, canvasB2.getWidth(), (vn4.s0(fD1) * 2) + canvasB2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = Z0().beginRecording();
                boolean zG = v72.g(v72Var.j);
                gb5 gb5Var = gb5.n;
                if (zG) {
                    EdgeEffect edgeEffectA = v72Var.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = v72Var.a(gb5Var);
                        v72Var.j = edgeEffectA;
                    }
                    X0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (v72.f(v72Var.f)) {
                    EdgeEffect edgeEffectC = v72Var.c();
                    zX0 = X0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (v72.g(v72Var.f)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (liVar.c() & j));
                        EdgeEffect edgeEffectA2 = v72Var.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = v72Var.a(gb5Var);
                            v72Var.j = edgeEffectA2;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float fD = i >= 31 ? nh.d(edgeEffectC) : 0.0f;
                        float f = 1.0f - fIntBitsToFloat;
                        if (i >= 31) {
                            nh.g(edgeEffectA2, fD, f);
                        } else {
                            edgeEffectA2.onPull(fD, f);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zX0 = false;
                }
                boolean zG2 = v72.g(v72Var.h);
                gb5 gb5Var2 = gb5.m;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = v72Var.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = v72Var.a(gb5Var2);
                        v72Var.h = edgeEffectA3;
                    }
                    X0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (v72.f(v72Var.d)) {
                    EdgeEffect edgeEffectE2 = v72Var.e();
                    zX0 = X0(0.0f, edgeEffectE2, recordingCanvasBeginRecording) || zX0;
                    if (v72.g(v72Var.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (liVar.c() >> c));
                        EdgeEffect edgeEffectA4 = v72Var.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = v72Var.a(gb5Var2);
                            v72Var.h = edgeEffectA4;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fD2 = i2 >= 31 ? nh.d(edgeEffectE2) : 0.0f;
                        if (i2 >= 31) {
                            nh.g(edgeEffectA4, fD2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fD2, fIntBitsToFloat2);
                        }
                    }
                }
                if (v72.g(v72Var.k)) {
                    EdgeEffect edgeEffectA5 = v72Var.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = v72Var.a(gb5Var);
                        v72Var.k = edgeEffectA5;
                    }
                    X0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (v72.f(v72Var.g)) {
                    EdgeEffect edgeEffectD2 = v72Var.d();
                    zX0 = X0(90.0f, edgeEffectD2, recordingCanvasBeginRecording) || zX0;
                    if (v72.g(v72Var.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (liVar.c() & j));
                        EdgeEffect edgeEffectA6 = v72Var.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = v72Var.a(gb5Var);
                            v72Var.k = edgeEffectA6;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fD3 = i3 >= 31 ? nh.d(edgeEffectD2) : 0.0f;
                        if (i3 >= 31) {
                            nh.g(edgeEffectA6, fD3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fD3, fIntBitsToFloat3);
                        }
                    }
                }
                if (v72.g(v72Var.i)) {
                    EdgeEffect edgeEffectA7 = v72Var.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = v72Var.a(gb5Var2);
                        v72Var.i = edgeEffectA7;
                    }
                    X0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (v72.f(v72Var.e)) {
                    EdgeEffect edgeEffectB2 = v72Var.b();
                    boolean z4 = X0(180.0f, edgeEffectB2, recordingCanvasBeginRecording) || zX0;
                    if (v72.g(v72Var.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (liVar.c() >> c));
                        EdgeEffect edgeEffectA8 = v72Var.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = v72Var.a(gb5Var2);
                            v72Var.i = edgeEffectA8;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fD4 = i4 >= 31 ? nh.d(edgeEffectB2) : 0.0f;
                        float f2 = 1.0f - fIntBitsToFloat4;
                        if (i4 >= 31) {
                            nh.g(edgeEffectA8, fD4, f2);
                        } else {
                            edgeEffectA8.onPull(fD4, f2);
                        }
                    }
                    zX0 = z4;
                }
                if (zX0) {
                    liVar.d();
                }
                float f3 = z ? 0.0f : fD1;
                float f4 = z2 ? 0.0f : fD1;
                j04 layoutDirection = d14Var.getLayoutDirection();
                cg cgVar = new cg();
                cgVar.a = recordingCanvasBeginRecording;
                long jD = nl0Var2.d();
                in1 in1VarZ = nl0Var2.n.z();
                j04 j04VarB = nl0Var2.n.B();
                ll0 ll0VarX = nl0Var2.n.x();
                long jD2 = nl0Var2.n.D();
                iu iuVar = nl0Var2.n;
                l03 l03Var = (l03) iuVar.p;
                iuVar.Q(d14Var);
                iuVar.R(layoutDirection);
                iuVar.P(cgVar);
                iuVar.S(jD);
                iuVar.p = null;
                cgVar.g();
                try {
                    ((xc0) nl0Var2.n.f1103o).V(f3, f4);
                    try {
                        d14Var.a();
                        float f5 = -f3;
                        float f6 = -f4;
                        ((xc0) nl0Var2.n.f1103o).V(f5, f6);
                        cgVar.p();
                        iu iuVar2 = nl0Var2.n;
                        iuVar2.Q(in1VarZ);
                        iuVar2.R(j04VarB);
                        iuVar2.P(ll0VarX);
                        iuVar2.S(jD2);
                        iuVar2.p = l03Var;
                        Z0().endRecording();
                        int iSave = canvasB2.save();
                        canvasB2.translate(f5, f6);
                        canvasB2.drawRenderNode(Z0());
                        canvasB2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((xc0) nl0Var2.n.f1103o).V(-f3, -f4);
                        throw th;
                    }
                } catch (Throwable th2) {
                    cgVar.p();
                    iu iuVar3 = nl0Var2.n;
                    iuVar3.Q(in1VarZ);
                    iuVar3.R(j04VarB);
                    iuVar3.P(ll0VarX);
                    iuVar3.S(jD2);
                    iuVar3.p = l03Var;
                    throw th2;
                }
        }
    }

    public oz2(vg7 vg7Var, li liVar, v72 v72Var) {
        this.D = liVar;
        this.E = v72Var;
        U0(vg7Var);
    }
}
