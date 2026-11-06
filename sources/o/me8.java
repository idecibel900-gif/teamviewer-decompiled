package o;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class me8 extends View {
    public static final c12 y = new c12((byte) 3);
    public final r52 m;
    public final ol0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nl0 f1463o;
    public boolean p;
    public Outline q;
    public boolean r;
    public in1 s;
    public j04 t;
    public Function1 u;
    public l03 v;
    public float w;
    public float x;

    public me8(r52 r52Var, ol0 ol0Var, nl0 nl0Var) {
        super(r52Var.getContext());
        this.m = r52Var;
        this.n = ol0Var;
        this.f1463o = nl0Var;
        setOutlineProvider(y);
        this.r = true;
        this.s = xk0.n;
        this.t = j04.m;
        n03.a.getClass();
        this.u = zm.C;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.w;
        nl0 nl0Var = this.f1463o;
        ol0 ol0Var = this.n;
        if (f > 0.0f || this.x > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.w, this.x);
            cg cgVar = ol0Var.a;
            Canvas canvas2 = cgVar.a;
            cgVar.a = canvas;
            in1 in1Var = this.s;
            j04 j04Var = this.t;
            float width = getWidth();
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width) << 32);
            l03 l03Var = this.v;
            Function1 function1 = this.u;
            iu iuVar = nl0Var.n;
            iu iuVar2 = nl0Var.n;
            in1 in1VarZ = iuVar.z();
            j04 j04VarB = iuVar2.B();
            ll0 ll0VarX = iuVar2.x();
            long jD = iuVar2.D();
            l03 l03Var2 = (l03) iuVar2.p;
            iuVar2.Q(in1Var);
            iuVar2.R(j04Var);
            iuVar2.P(cgVar);
            iuVar2.S(jFloatToRawIntBits);
            iuVar2.p = l03Var;
            cgVar.g();
            try {
                function1.invoke(nl0Var);
                cgVar.p();
                iuVar2.Q(in1VarZ);
                iuVar2.R(j04VarB);
                iuVar2.P(ll0VarX);
                iuVar2.S(jD);
                iuVar2.p = l03Var2;
                ol0Var.a.a = canvas2;
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                cgVar.p();
                iuVar2.Q(in1VarZ);
                iuVar2.R(j04VarB);
                iuVar2.P(ll0VarX);
                iuVar2.S(jD);
                iuVar2.p = l03Var2;
                throw th;
            }
        } else {
            cg cgVar2 = ol0Var.a;
            Canvas canvas3 = cgVar2.a;
            cgVar2.a = canvas;
            in1 in1Var2 = this.s;
            j04 j04Var2 = this.t;
            float width2 = getWidth();
            long jFloatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width2) << 32);
            l03 l03Var3 = this.v;
            Function1 function2 = this.u;
            iu iuVar3 = nl0Var.n;
            iu iuVar4 = nl0Var.n;
            in1 in1VarZ2 = iuVar3.z();
            j04 j04VarB2 = iuVar4.B();
            ll0 ll0VarX2 = iuVar4.x();
            long jD2 = iuVar4.D();
            l03 l03Var4 = (l03) iuVar4.p;
            iuVar4.Q(in1Var2);
            iuVar4.R(j04Var2);
            iuVar4.P(cgVar2);
            iuVar4.S(jFloatToRawIntBits2);
            iuVar4.p = l03Var3;
            cgVar2.g();
            try {
                function2.invoke(nl0Var);
                cgVar2.p();
                iuVar4.Q(in1VarZ2);
                iuVar4.R(j04VarB2);
                iuVar4.P(ll0VarX2);
                iuVar4.S(jD2);
                iuVar4.p = l03Var4;
                ol0Var.a.a = canvas3;
            } catch (Throwable th2) {
                cgVar2.p();
                iuVar4.Q(in1VarZ2);
                iuVar4.R(j04VarB2);
                iuVar4.P(ll0VarX2);
                iuVar4.S(jD2);
                iuVar4.p = l03Var4;
                throw th2;
            }
        }
        this.p = false;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.r;
    }

    public final ol0 getCanvasHolder() {
        return this.n;
    }

    public final View getOwnerView() {
        return this.m;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.r;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.p) {
            return;
        }
        this.p = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.r != z) {
            this.r = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.p = z;
    }
}
