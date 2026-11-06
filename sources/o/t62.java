package o;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class t62 implements k30 {
    public final p30 a;
    public final p30 b;
    public final uv0 c;
    public final uv0 d;
    public final uv0 e;
    public final uv0 f;
    public final uv0 g;
    public Matrix h;

    public t62(p30 p30Var, p30 p30Var2, yc4 yc4Var) {
        this.b = p30Var;
        this.a = p30Var2;
        o30 o30VarD = ((lm) yc4Var.m).d();
        this.c = (uv0) o30VarD;
        o30VarD.a(this);
        p30Var2.d(o30VarD);
        uv0 uv0VarD = ((mm) yc4Var.n).d();
        this.d = uv0VarD;
        uv0VarD.a(this);
        p30Var2.d(uv0VarD);
        uv0 uv0VarD2 = ((mm) yc4Var.f2598o).d();
        this.e = uv0VarD2;
        uv0VarD2.a(this);
        p30Var2.d(uv0VarD2);
        uv0 uv0VarD3 = ((mm) yc4Var.p).d();
        this.f = uv0VarD3;
        uv0VarD3.a(this);
        p30Var2.d(uv0VarD3);
        uv0 uv0VarD4 = ((mm) yc4Var.q).d();
        this.g = uv0VarD4;
        uv0VarD4.a(this);
        p30Var2.d(uv0VarD4);
    }

    @Override // o.k30
    public final void a() {
        this.b.a();
    }

    public final r62 b(Matrix matrix, int i) {
        float fI = this.e.i() * 0.017453292f;
        float fFloatValue = ((Float) this.f.d()).floatValue();
        double d = fI;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.g.d()).floatValue();
        int iIntValue = ((Integer) this.c.d()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.d.d()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        r62 r62Var = new r62();
        r62Var.a = fFloatValue2 * 0.33f;
        r62Var.b = fSin;
        r62Var.c = fCos;
        r62Var.d = iArgb;
        r62Var.e = null;
        r62Var.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.d().invert(this.h);
        r62Var.c(this.h);
        return r62Var;
    }
}
